package com.project.Controller;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.context.ApplicationEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.project.Service.DoctorPrimaryServive;
import com.project.Service.EmailSenderService;
import com.project.Service.FetchEntireDoctorDataService;
import com.project.Service.LoginService;
import com.project.Service.ObjectCreationService;
import com.project.Service.PasswordEncoderService;

import com.project.Service.UniqueKeyCheckService;
import com.project.entity.Address;
import com.project.entity.DoctorAvailMaster;
import com.project.entity.DoctorEstablishment;
import com.project.entity.DoctorMedRegistration;
import com.project.entity.DoctorPrimary;
import com.project.entity.SecurityQuestions;
import com.project.entity.proxy.DoctorPrimaryRegistrationProxy;
import com.project.entity.proxy.FetchDoctorDataProxy;
import com.project.entity.proxy.LoginProxy;
import com.project.exception.DataDoesntExistException;
import com.project.exception.UniqueKeyExistException;
import com.project.payload.FileResponse;
@RestController
public class DoctorPrimaryController {
	
	@Autowired 
	private DoctorPrimaryServive doctorPrimaryServive;
	
	@Autowired
	private SecurityQuestionsController securityQuestionsController;
	
	@Autowired
	private DoctorMedRegistrationController doctorMedRegistrationController;
	
	@Autowired 
	private DoctorEstablishmentController doctorEstablishmentController;
	
	@Autowired
	private DoctorAvailMasterController doctorAvailMasterController;
	
	@Autowired
	private AddressController addressController;
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private UniqueKeyCheckService uniqueKeyCheckService;
	
	@Autowired
	private PasswordEncoderService passwordEncoderServie;
	
	@Autowired
	private EmailSenderService emailSenderService;
	
	@Autowired
	private ObjectCreationService objectCreationService;
	
	@Autowired
	private FetchEntireDoctorDataService fetchEntireDoctorDataService;
	
	
	@PostMapping("/doctor/register")
	@Transactional
	public ResponseEntity<DoctorPrimary> registerDoctor(@RequestBody DoctorPrimaryRegistrationProxy proxy)
	{
		
		Address address = this.objectCreationService.createAddress(proxy);
		
		DoctorAvailMaster master = this.objectCreationService.createDoctorAvail(proxy);
		
	    DoctorEstablishment establishment = this.objectCreationService.createEstablishment(proxy);
		
		DoctorMedRegistration registration = this.objectCreationService.createMedRegistration(proxy);
		
		SecurityQuestions questions = this.objectCreationService.createSecurityQuestion(proxy);
		
		try
		{
		//getting the dependant properties
	 
		int questionId = securityQuestionsController.getQuestionId(proxy.getSecurityQuestion());
		proxy.setSecurityQuestionsId(questionId);
		
		//checking for duplicate in doctor-med-registration
		boolean ismedIdPresent = this.uniqueKeyCheckService.checkDuplicateMedRegistration(registration.getMedicalRegId());
		//if the med registration id is already present then exeption will be thrown
		System.out.println("1");
		if(ismedIdPresent)
		throw new UniqueKeyExistException("Registration id already Exist");
		System.out.println("2");
		//checking for email 
		boolean isEmailPresent = this.uniqueKeyCheckService.checkDuplicateEmail(proxy.getEmail());
		if(isEmailPresent)
		throw new UniqueKeyExistException("Email Id already exists in database");
		System.out.println("3");
		//checking for adhaarCard
		boolean isAdhaarPresent = this.uniqueKeyCheckService.checkDuplicateAdhaar(proxy.getAdhaarCard());
		if(isAdhaarPresent)
		throw new UniqueKeyExistException("Adhaar No already exists in database");
		System.out.println("4");
		//checking for panCard
		boolean isPanPresent = this.uniqueKeyCheckService.checkDuplicatePanCard(proxy.getPanCard());
		if(isPanPresent)
		throw new UniqueKeyExistException("PanCard already exists in database");	
		
		//checking for phone no
		boolean isPhonePresent = this.uniqueKeyCheckService.checkDuplicatePhone(proxy.getPhoneNumber());
		if(isPhonePresent)
		throw new UniqueKeyExistException("Phone No already exists in database");	
		System.out.println("5");
		DoctorMedRegistration insertDoctorMed = doctorMedRegistrationController.insertDoctorMed(registration);
		
		
		DoctorEstablishment insertEstablishment = doctorEstablishmentController.insertEstablishment(establishment);
		
		DoctorAvailMaster insertAvailability = doctorAvailMasterController.insertAvailability(master);
		
		int insertAddressId = addressController.insertAddress(address);
		
		DoctorPrimary docPrimary = this.objectCreationService.createDoctorPrimary(insertAvailability, insertAddressId, insertEstablishment, insertDoctorMed, questionId, proxy);
	
		DoctorPrimary doctor = this.doctorPrimaryServive.insertDoctor(docPrimary);
		
	    
		
		//on successful registration an email has to be sent to the doctor
		//implementing the email sender code
		
		
		
		  this.emailSenderService.sendSimpleEmail(doctor.getEmail(),
		  "<h1>You have been successfully logged into patient management system app.</h1>"
		  + "<h4>All future communications will be done through this email </h4>"
		  +"<h4>Your user-id is:"+doctor.getDoctorId()+"</h4>",
		  "Welcome to patient history management app");
		  System.out.println("mail sent");
		 
		 
		 
	    return new ResponseEntity<>(doctor,HttpStatus.OK);
	    
		}
		
		catch(ConstraintViolationException e)
		{
			e.printStackTrace();
			return new ResponseEntity<>(null,HttpStatus.CONFLICT);
		}
		catch (Exception e)
		{
			//transacation.rollback();
			e.printStackTrace();
			return new ResponseEntity<>(null,HttpStatus.CONFLICT);
		}
		
		
		
		
	}

	@PostMapping("/doctor/login")
	public ResponseEntity<DoctorPrimary> validateLogin(@RequestBody LoginProxy proxy)
	{
		DoctorPrimary primary =  this.loginService.ValidateDoctorLogin(proxy);
		if(primary != null)
		return new ResponseEntity<>(primary,HttpStatus.OK);
		else
		return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
	}
	
	@GetMapping("/doctor/data/{email}")
	public ResponseEntity<FetchDoctorDataProxy> getDoctorData(@PathVariable String email)
	{
		try {
			FetchDoctorDataProxy doctorData = this.fetchEntireDoctorDataService.getDoctorData(email);
			return new ResponseEntity<>(doctorData, HttpStatus.OK);
		} catch (DataDoesntExistException e) {
			return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
		}
	}
}
