package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.SecurityQuestionsService;
import com.project.entity.SecurityQuestions;

@RestController
public class SecurityQuestionsController {

	@Autowired
	private SecurityQuestionsService securityQuestionService;
	
	@PostMapping("/addquestion")
	public void addQuestion(@RequestBody SecurityQuestions question)
	{
		securityQuestionService.insertQuestion(question.getSecurityQuestion());
	}
	@GetMapping("/getQuestion/{id}")
	public SecurityQuestions getQuestions(@PathVariable Integer id)
	{
		return this.securityQuestionService.getAllQuestions(id);
	}
	
	public Integer getQuestionId(String question)
	{
		return this.securityQuestionService.getQuestionId(question);
	}
}
