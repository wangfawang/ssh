package com.how2java.service.impl;

import java.util.List;

import com.how2java.dao.QuestionDAO;
import com.how2java.pojo.Question;
import com.how2java.service.QuestionService;

public class QuestionServiceImpl implements QuestionService {

	QuestionDAO questionDAO;

	@Override
	public List<Question> list() {
		// TODO Auto-generated method stub
		List<Question> questions = questionDAO.list();
		return questions;
	}

	public QuestionDAO getQuestionDAO() {
		return questionDAO;
	}

	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}

}
