package org.tsn.dao.interfaces;

import java.util.List;

import org.tsn.entity.TSecurityQuestions;

public interface ISecurityQuestionDAO {

	public void addSecurityQuestion(TSecurityQuestions question);

	public List<TSecurityQuestions> getAllSecurityQuestion();

	public void deleteSecurityQuestion(Integer questionId);
	/*
	 * public void persist(TSecurityQuestions transientInstance);
	 * 
	 * public void remove(TSecurityQuestions persistentInstance);
	 * 
	 * public TSecurityQuestions merge(TSecurityQuestions detachedInstance);
	 * 
	 * public TSecurityQuestions findById(Integer id);
	 */
}
