package com.how2java.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.how2java.dao.QuestionDAO;
import com.how2java.pojo.Question;

public class QuestionDAOImpl extends HibernateTemplate implements QuestionDAO {

	@Override
	public List<Question> list() {
		// TODO Auto-generated method stub
		return find("from Question");
	}

	@Override
	public void add(Question q) {
		// TODO Auto-generated method stub
		save(q);
	}
}
