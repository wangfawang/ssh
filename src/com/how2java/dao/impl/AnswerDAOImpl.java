package com.how2java.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.how2java.dao.AnswerDAO;
import com.how2java.pojo.Answer;

public class AnswerDAOImpl extends HibernateTemplate implements AnswerDAO{

	@Override
	public List<Answer> list() {
		// TODO Auto-generated method stub
		return find("from Answer");
	}

	@Override
	public void add(Answer a) {
		// TODO Auto-generated method stub
		save(a);
	}
	
}
