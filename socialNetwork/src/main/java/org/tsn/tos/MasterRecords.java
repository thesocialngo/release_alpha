package org.tsn.tos;

public class MasterRecords {

	private SecurityQuestion[] securityQuestions;
	private Cause[] causes;
	private Category[] categories;
	private Occupation[] occupations;
	private Education[] educations;

	public SecurityQuestion[] getSecurityQuestions() {
		return securityQuestions;
	}

	public void setSecurityQuestions(SecurityQuestion[] securityQuestions) {
		this.securityQuestions = securityQuestions;
	}

	/**
	 * @return the causes
	 */
	public Cause[] getCauses() {
		return causes;
	}

	/**
	 * @param causes
	 *            the causes to set
	 */
	public void setCauses(Cause[] causes) {
		this.causes = causes;
	}

	/**
	 * @return the categories
	 */
	public Category[] getCategories() {
		return categories;
	}

	/**
	 * @param categories
	 *            the categories to set
	 */
	public void setCategories(Category[] categories) {
		this.categories = categories;
	}

	/**
	 * @return the occupations
	 */
	public Occupation[] getOccupations() {
		return occupations;
	}

	/**
	 * @param occupations
	 *            the occupations to set
	 */
	public void setOccupations(Occupation[] occupations) {
		this.occupations = occupations;
	}

	/**
	 * @return the educations
	 */
	public Education[] getEducations() {
		return educations;
	}

	/**
	 * @param educations
	 *            the educations to set
	 */
	public void setEducations(Education[] educations) {
		this.educations = educations;
	}

}
