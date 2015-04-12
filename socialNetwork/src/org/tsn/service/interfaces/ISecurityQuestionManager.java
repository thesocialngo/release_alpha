package org.tsn.service.interfaces;

import java.util.List;

import org.tsn.entity.TCategories;
import org.tsn.entity.TSecurityQuestions;

public interface ISecurityQuestionManager extends IBaseManager {

	public void addRecord(TSecurityQuestions question);

	public List<TSecurityQuestions> getRecords();

	public void deleteRecord(Integer questionId);
}