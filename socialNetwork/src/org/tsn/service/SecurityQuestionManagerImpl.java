package org.tsn.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tsn.dao.interfaces.ISecurityQuestionDAO;
import org.tsn.entity.TSecurityQuestions;
import org.tsn.service.interfaces.ISecurityQuestionManager;
 
@Service
public class SecurityQuestionManagerImpl implements ISecurityQuestionManager {
 
    @Autowired
        private ISecurityQuestionDAO securityQuestionDAO;
 
    @Override
    @Transactional
    public void addRecord(TSecurityQuestions question) {
        securityQuestionDAO.addSecurityQuestion(question);
    }
 
    @Override
    @Transactional
    public List<TSecurityQuestions> getRecords() {
        return securityQuestionDAO.getAllSecurityQuestion();
    }
 
    @Override
    @Transactional
    public void deleteRecord(Integer questionId) {
        securityQuestionDAO.deleteSecurityQuestion(questionId);
    }
 
    public void setSecurityQuestionDAO (ISecurityQuestionDAO questionDAO) {
        this.securityQuestionDAO = questionDAO;
    }
}