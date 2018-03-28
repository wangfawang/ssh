package com.how2java.service.impl;

import java.util.List;

import com.how2java.dao.AnswerDAO;
import com.how2java.pojo.Answer;
import com.how2java.service.AnswerService;

public class AnswerServiceImpl implements AnswerService{
	AnswerDAO answerDAO;

	@Override
	public List<Answer> list() {
		// TODO Auto-generated method stub
		 List<Answer> answers= answerDAO.list();
	     return answers;
	}

	public AnswerDAO getAnswerDAO() {
		return answerDAO;
	}

	public void setAnswerDAO(AnswerDAO answerDAO) {
		this.answerDAO = answerDAO;
	}
	
	
}
