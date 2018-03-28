package com.how2java.dao;

import java.util.List;

import com.how2java.pojo.Product;
import com.how2java.pojo.Question;

public interface QuestionDAO {
	public List<Question> list();
	public void add(Question q);
}
