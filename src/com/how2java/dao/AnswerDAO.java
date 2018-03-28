package com.how2java.dao;

import java.util.List;

import com.how2java.pojo.Answer;

public interface AnswerDAO {
	public List<Answer> list();
	public void add(Answer a);
}
