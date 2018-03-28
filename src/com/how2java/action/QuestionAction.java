package com.how2java.action;

import java.util.List;

import com.how2java.pojo.Question;
import com.how2java.service.QuestionService;

public class QuestionAction {
	QuestionService questionService;
	List<Question> questions;

	public String list() {
		questions = questionService.list();
		return "listJsp";
	}

	public QuestionService getQuestionService() {
		return questionService;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	
}
