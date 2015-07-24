package org.tsn.entity;

// Generated Jul 23, 2015 8:29:33 PM by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TProjectFeeds generated by hbm2java
 */
@Entity
@Table(name = "t_project_feeds", catalog = "tsn_test")
public class TProjectFeeds implements IBaseEntity
{

	private int			feedId;
	private TProjects	TProjects;
	private String		descr;
	private byte[]		isPrivate;
	private Date		commentDate;

	public TProjectFeeds()
	{
	}

	public TProjectFeeds(int feedId)
	{
		this.feedId = feedId;
	}

	public TProjectFeeds(
			int feedId,
			TProjects TProjects,
			String descr,
			byte[] isPrivate,
			Date commentDate)
	{
		this.feedId = feedId;
		this.TProjects = TProjects;
		this.descr = descr;
		this.isPrivate = isPrivate;
		this.commentDate = commentDate;
	}

	@Id
	@Column(name = "FEED_ID", unique = true, nullable = false)
	public int getFeedId()
	{
		return this.feedId;
	}

	public void setFeedId(int feedId)
	{
		this.feedId = feedId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROJECT_ID")
	public TProjects getTProjects()
	{
		return this.TProjects;
	}

	public void setTProjects(TProjects TProjects)
	{
		this.TProjects = TProjects;
	}

	@Column(name = "DESCR", length = 150)
	public String getDescr()
	{
		return this.descr;
	}

	public void setDescr(String descr)
	{
		this.descr = descr;
	}

	@Column(name = "IS_PRIVATE")
	public byte[] getIsPrivate()
	{
		return this.isPrivate;
	}

	public void setIsPrivate(byte[] isPrivate)
	{
		this.isPrivate = isPrivate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "COMMENT_DATE", length = 10)
	public Date getCommentDate()
	{
		return this.commentDate;
	}

	public void setCommentDate(Date commentDate)
	{
		this.commentDate = commentDate;
	}

}
