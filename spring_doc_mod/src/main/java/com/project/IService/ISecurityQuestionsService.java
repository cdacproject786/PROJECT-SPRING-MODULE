package com.project.IService;

import org.springframework.stereotype.Service;

import com.project.entity.SecurityQuestions;
@Service
public interface ISecurityQuestionsService {

	public void insertQuestion(String securityQuestion);
	
	public SecurityQuestions getAllQuestions(int id);
	
	public Integer getQuestionId(String question);
}
