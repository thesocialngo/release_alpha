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
 * TUserCiircle generated by hbm2java
 */
@Entity
@Table(name = "t_user_ciircle", catalog = "tsn_test")
public class TUserCiircle implements IBaseEntity
{

	private int		circleId;
	private TLogin	TLoginByLoginId;
	private TLogin	TLoginByParentLoginId;

	public TUserCiircle()
	{
	}

	public TUserCiircle(int circleId)
	{
		this.circleId = circleId;
	}

	public TUserCiircle(
			int circleId,
			TLogin TLoginByLoginId,
			TLogin TLoginByParentLoginId)
	{
		this.circleId = circleId;
		this.TLoginByLoginId = TLoginByLoginId;
		this.TLoginByParentLoginId = TLoginByParentLoginId;
	}

	@Id
	@Column(name = "CIRCLE_ID", unique = true, nullable = false)
	public int getCircleId()
	{
		return this.circleId;
	}

	public void setCircleId(int circleId)
	{
		this.circleId = circleId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOGIN_ID")
	public TLogin getTLoginByLoginId()
	{
		return this.TLoginByLoginId;
	}

	public void setTLoginByLoginId(TLogin TLoginByLoginId)
	{
		this.TLoginByLoginId = TLoginByLoginId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_LOGIN_ID")
	public TLogin getTLoginByParentLoginId()
	{
		return this.TLoginByParentLoginId;
	}

	public void setTLoginByParentLoginId(TLogin TLoginByParentLoginId)
	{
		this.TLoginByParentLoginId = TLoginByParentLoginId;
	}

}
