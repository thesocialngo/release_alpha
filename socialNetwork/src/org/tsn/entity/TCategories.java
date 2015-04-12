package org.tsn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCategories generated by hbm2java
 */
@Entity
@Table(name = "t_categories")
public class TCategories implements IBaseEntity   {

	private static final long serialVersionUID = -1458342131302280680L;
	private Integer categoryId;
	private String categoryDescr;

	public TCategories() {
	}

	public TCategories(String categoryDescr) {
		this.categoryDescr = categoryDescr;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CATEGORY_ID", unique = true, nullable = false)
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "CATEGORY_DESCR", length = 100)
	public String getCategoryDescr() {
		return this.categoryDescr;
	}

	public void setCategoryDescr(String categoryDescr) {
		this.categoryDescr = categoryDescr;
	}

}
