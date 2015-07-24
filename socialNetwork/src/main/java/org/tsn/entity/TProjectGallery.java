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
 * TProjectGallery generated by hbm2java
 */
@Entity
@Table(name = "t_project_gallery", catalog = "tsn_test")
public class TProjectGallery implements IBaseEntity
{

	private int					galleryId;
	private TProjectMilestones	TProjectMilestones;
	private byte[]				picture;
	private byte[]				video;
	private Date				expiryDate;

	public TProjectGallery()
	{
	}

	public TProjectGallery(int galleryId)
	{
		this.galleryId = galleryId;
	}

	public TProjectGallery(
			int galleryId,
			TProjectMilestones TProjectMilestones,
			byte[] picture,
			byte[] video,
			Date expiryDate)
	{
		this.galleryId = galleryId;
		this.TProjectMilestones = TProjectMilestones;
		this.picture = picture;
		this.video = video;
		this.expiryDate = expiryDate;
	}

	@Id
	@Column(name = "GALLERY_ID", unique = true, nullable = false)
	public int getGalleryId()
	{
		return this.galleryId;
	}

	public void setGalleryId(int galleryId)
	{
		this.galleryId = galleryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROJECT_MILESTONE_ID")
	public TProjectMilestones getTProjectMilestones()
	{
		return this.TProjectMilestones;
	}

	public void setTProjectMilestones(TProjectMilestones TProjectMilestones)
	{
		this.TProjectMilestones = TProjectMilestones;
	}

	@Column(name = "PICTURE")
	public byte[] getPicture()
	{
		return this.picture;
	}

	public void setPicture(byte[] picture)
	{
		this.picture = picture;
	}

	@Column(name = "VIDEO")
	public byte[] getVideo()
	{
		return this.video;
	}

	public void setVideo(byte[] video)
	{
		this.video = video;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPIRY_DATE", length = 10)
	public Date getExpiryDate()
	{
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate)
	{
		this.expiryDate = expiryDate;
	}

}
