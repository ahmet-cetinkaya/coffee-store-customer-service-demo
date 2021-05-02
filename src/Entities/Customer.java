package Entities;

import java.util.Date;

public class Customer implements Entity {
	int id;
	String firstName;
	String lastName;
	Date dateOfBirth;
	String nationalityId;

	public Customer(final int id, final String firstName, final String lastName, final Date dateOfBirth,
			final String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setDateOfBirth(final Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public void setNationalityId(final String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
