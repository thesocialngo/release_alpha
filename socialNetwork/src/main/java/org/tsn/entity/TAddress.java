package org.tsn.entity;

// Generated Jul 23, 2015 8:29:33 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TAddress generated by hbm2java
 */
@Entity
@Table(name = "t_address", catalog = "tsn_test")
public class TAddress implements IBaseEntity
{

	private int				addressId;
	private String			addressLine1;
	private String			addressLine2;
	private String			city;
	private String			state;
	private String			country;
	private String			zipCode;
	private Set<TProject>	TProjectses	= new HashSet<TProject>(0);

	public TAddress()
	{
	}

	public TAddress(int addressId)
	{
		this.addressId = addressId;
	}

	public TAddress(
			int addressId,
			String addressLine1,
			String addressLine2,
			String city,
			String state,
			String country,
			String zipCode,
			Set<TProject> TProjectses)
	{
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.TProjectses = TProjectses;
	}

	@Id
	@Column(name = "ADDRESS_ID", unique = true, nullable = false)
	public int getAddressId()
	{
		return this.addressId;
	}

	public void setAddressId(int addressId)
	{
		this.addressId = addressId;
	}

	@Column(name = "ADDRESS_LINE_1", length = 100)
	public String getAddressLine1()
	{
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1)
	{
		this.addressLine1 = addressLine1;
	}

	@Column(name = "ADDRESS_LINE_2", length = 100)
	public String getAddressLine2()
	{
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2)
	{
		this.addressLine2 = addressLine2;
	}

	@Column(name = "CITY", length = 100)
	public String getCity()
	{
		return this.city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	@Column(name = "STATE", length = 100)
	public String getState()
	{
		return this.state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	@Column(name = "COUNTRY", length = 100)
	public String getCountry()
	{
		return this.country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	@Column(name = "ZIP_CODE", length = 15)
	public String getZipCode()
	{
		return this.zipCode;
	}

	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TAddress")
	public Set<TProject> getTProjectses()
	{
		return this.TProjectses;
	}

	public void setTProjectses(Set<TProject> TProjectses)
	{
		this.TProjectses = TProjectses;
	}

}
