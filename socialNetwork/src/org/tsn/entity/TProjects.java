package org.tsn.entity;

// Generated Feb 19, 2015 10:13:35 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TProjects generated by hbm2java
 */
@Entity
@Table(name = "t_projects")
public class TProjects implements IBaseEntity {

	private static final long serialVersionUID = 4460047167461925396L;

	private int projectId;
	private TProfile TProfile;
	private TAddress TAddress;
	private TCategories TCategories;
	private TCauses TCauses;
	private String title;
	private byte[] projectPic;
	private String projectDescr;
	private Double totalCost;
	private Integer totalVolunteerCount;
	private String facebookId;
	private String tweeterId;
	private String googleId;
	private Double fundsReceived;
	private Integer voluntersNeeded;
	private Date startDate;
	private Date targetCompletionDate;
	private Date actualCompletionDate;
	private Set<TTeam> TTeams = new HashSet<TTeam>(0);
	private Set<TProjectFeeds> TProjectFeedses = new HashSet<TProjectFeeds>(0);
	private Set<TProjectMilestones> TProjectMilestoneses = new HashSet<TProjectMilestones>(
			0);

	public TProjects() {
	}

	public TProjects(int projectId) {
		this.projectId = projectId;
	}

	public TProjects(int projectId, TProfile TProfile, TAddress TAddress,
			TCategories TCategories, TCauses TCauses, String title,
			byte[] projectPic, String projectDescr, Double totalCost,
			Integer totalVolunteerCount, String facebookId, String tweeterId,
			String googleId, Double fundsReceived, Integer voluntersNeeded,
			Date startDate, Date targetCompletionDate,
			Date actualCompletionDate, Set<TTeam> TTeams,
			Set<TProjectFeeds> TProjectFeedses,
			Set<TProjectMilestones> TProjectMilestoneses) {
		this.projectId = projectId;
		this.TProfile = TProfile;
		this.TAddress = TAddress;
		this.TCategories = TCategories;
		this.TCauses = TCauses;
		this.title = title;
		this.projectPic = projectPic;
		this.projectDescr = projectDescr;
		this.totalCost = totalCost;
		this.totalVolunteerCount = totalVolunteerCount;
		this.facebookId = facebookId;
		this.tweeterId = tweeterId;
		this.googleId = googleId;
		this.fundsReceived = fundsReceived;
		this.voluntersNeeded = voluntersNeeded;
		this.startDate = startDate;
		this.targetCompletionDate = targetCompletionDate;
		this.actualCompletionDate = actualCompletionDate;
		this.TTeams = TTeams;
		this.TProjectFeedses = TProjectFeedses;
		this.TProjectMilestoneses = TProjectMilestoneses;
	}

	@Id
	@Column(name = "PROJECT_ID", unique = true, nullable = false)
	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LEADER_PROFILE_ID")
	public TProfile getTProfile() {
		return this.TProfile;
	}

	public void setTProfile(TProfile TProfile) {
		this.TProfile = TProfile;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS_ID")
	public TAddress getTAddress() {
		return this.TAddress;
	}

	public void setTAddress(TAddress TAddress) {
		this.TAddress = TAddress;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_ID")
	public TCategories getTCategories() {
		return this.TCategories;
	}

	public void setTCategories(TCategories TCategories) {
		this.TCategories = TCategories;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CAUSE_ID")
	public TCauses getTCauses() {
		return this.TCauses;
	}

	public void setTCauses(TCauses TCauses) {
		this.TCauses = TCauses;
	}

	@Column(name = "TITLE", length = 40)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "PROJECT_PIC")
	public byte[] getProjectPic() {
		return this.projectPic;
	}

	public void setProjectPic(byte[] projectPic) {
		this.projectPic = projectPic;
	}

	@Column(name = "PROJECT_DESCR", length = 100)
	public String getProjectDescr() {
		return this.projectDescr;
	}

	public void setProjectDescr(String projectDescr) {
		this.projectDescr = projectDescr;
	}

	@Column(name = "TOTAL_COST", precision = 22, scale = 0)
	public Double getTotalCost() {
		return this.totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	@Column(name = "TOTAL_VOLUNTEER_COUNT")
	public Integer getTotalVolunteerCount() {
		return this.totalVolunteerCount;
	}

	public void setTotalVolunteerCount(Integer totalVolunteerCount) {
		this.totalVolunteerCount = totalVolunteerCount;
	}

	@Column(name = "FACEBOOK_ID", length = 20)
	public String getFacebookId() {
		return this.facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	@Column(name = "TWEETER_ID", length = 20)
	public String getTweeterId() {
		return this.tweeterId;
	}

	public void setTweeterId(String tweeterId) {
		this.tweeterId = tweeterId;
	}

	@Column(name = "GOOGLE_ID", length = 20)
	public String getGoogleId() {
		return this.googleId;
	}

	public void setGoogleId(String googleId) {
		this.googleId = googleId;
	}

	@Column(name = "FUNDS_RECEIVED", precision = 22, scale = 0)
	public Double getFundsReceived() {
		return this.fundsReceived;
	}

	public void setFundsReceived(Double fundsReceived) {
		this.fundsReceived = fundsReceived;
	}

	@Column(name = "VOLUNTERS_NEEDED")
	public Integer getVoluntersNeeded() {
		return this.voluntersNeeded;
	}

	public void setVoluntersNeeded(Integer voluntersNeeded) {
		this.voluntersNeeded = voluntersNeeded;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE", length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TARGET_COMPLETION_DATE", length = 10)
	public Date getTargetCompletionDate() {
		return this.targetCompletionDate;
	}

	public void setTargetCompletionDate(Date targetCompletionDate) {
		this.targetCompletionDate = targetCompletionDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ACTUAL_COMPLETION_DATE", length = 10)
	public Date getActualCompletionDate() {
		return this.actualCompletionDate;
	}

	public void setActualCompletionDate(Date actualCompletionDate) {
		this.actualCompletionDate = actualCompletionDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TProjects")
	public Set<TTeam> getTTeams() {
		return this.TTeams;
	}

	public void setTTeams(Set<TTeam> TTeams) {
		this.TTeams = TTeams;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TProjects")
	public Set<TProjectFeeds> getTProjectFeedses() {
		return this.TProjectFeedses;
	}

	public void setTProjectFeedses(Set<TProjectFeeds> TProjectFeedses) {
		this.TProjectFeedses = TProjectFeedses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TProjects")
	public Set<TProjectMilestones> getTProjectMilestoneses() {
		return this.TProjectMilestoneses;
	}

	public void setTProjectMilestoneses(
			Set<TProjectMilestones> TProjectMilestoneses) {
		this.TProjectMilestoneses = TProjectMilestoneses;
	}

}
