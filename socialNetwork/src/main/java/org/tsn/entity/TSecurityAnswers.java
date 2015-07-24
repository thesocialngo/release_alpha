package org.tsn.entity;

// Generated Jul 23, 2015 8:29:33 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TSecurityAnswers generated by hbm2java
 */
@Entity
@Table(name = "t_security_answers", catalog = "tsn_test")
public class TSecurityAnswers implements IBaseEntity
{

	private int					securityAnswerId;
	private TLogin				TLogin;
	private TSecurityQuestions	TSecurityQuestions;
	private String				answerDescr;

	public TSecurityAnswers()
	{
	}

	public TSecurityAnswers(int securityAnswerId)
	{
		this.securityAnswerId = securityAnswerId;
	}

	public TSecurityAnswers(
			int securityAnswerId,
			TLogin TLogin,
			TSecurityQuestions TSecurityQuestions,
			String answerDescr)
	{
		this.securityAnswerId = securityAnswerId;
		this.TLogin = TLogin;
		this.TSecurityQuestions = TSecurityQuestions;
		this.answerDescr = answerDescr;
	}

	@Id
	@Column(name = "SECURITY_ANSWER_ID", unique = true, nullable = false)
	public int getSecurityAnswerId()
	{
		return this.securityAnswerId;
	}

	public void setSecurityAnswerId(int securityAnswerId)
	{
		this.securityAnswerId = securityAnswerId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOGIN_ID")
	public TLogin getTLogin()
	{
		return this.TLogin;
	}

	public void setTLogin(TLogin TLogin)
	{
		this.TLogin = TLogin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QUESTION_ID")
	public TSecurityQuestions getTSecurityQuestions()
	{
		return this.TSecurityQuestions;
	}

	public void setTSecurityQuestions(TSecurityQuestions TSecurityQuestions)
	{
		this.TSecurityQuestions = TSecurityQuestions;
	}

	@Column(name = "ANSWER_DESCR", length = 50)
	public String getAnswerDescr()
	{
		return this.answerDescr;
	}

	public void setAnswerDescr(String answerDescr)
	{
		this.answerDescr = answerDescr;
	}

}
