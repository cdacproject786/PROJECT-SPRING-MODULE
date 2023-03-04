package com.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.SecurityQuestionsRepository;
import com.project.entity.SecurityQuestions;

@Service
public class SecurityQuestionsService {

	@Autowired
	private SecurityQuestionsRepository securityQuestionsRepository;
	
	public void insertQuestion(String securityQuestion)
	{
		SecurityQuestions question = new SecurityQuestions();
		question.setSecurityQuestion(securityQuestion);
		this.securityQuestionsRepository.save(question);
	}
	
	public SecurityQuestions getAllQuestions(int id)
	{
		SecurityQuestions question =  this.securityQuestionsRepository.getById(id);
		return question;
	}
	
	public Integer getQuestionId(String question)
	{
		   SecurityQuestions findBysecurityQuestion = this.securityQuestionsRepository.findBysecurityQuestion(question);
		   return findBysecurityQuestion.getSecurityQuestionsId();
	}
}
