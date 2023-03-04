package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.SecurityQuestions;

public interface SecurityQuestionsRepository extends JpaRepository<SecurityQuestions, Integer> {
	
	
	public SecurityQuestions findBysecurityQuestion(String question);

}
