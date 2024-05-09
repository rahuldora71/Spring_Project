package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	private String nameString;
	private List<String> phoneList;
	private Set<String> addressSet;
	private Map<String, String> coursesMap;
	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "Emp [nameString=" + nameString + ", phoneList=" + phoneList + ", addressSet=" + addressSet
				+ ", coursesMap=" + coursesMap + "]";
	}

	public List<String> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<String> phoneList) {
		this.phoneList = phoneList;
	}

	public Set<String> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}

	public Map<String, String> getCoursesMap() {
		return coursesMap;
	}

	public void setCoursesMap(Map<String, String> coursesMap) {
		this.coursesMap = coursesMap;
	}

	public Emp(String nameString, List<String> phoneList, Set<String> addressSet, Map<String, String> coursesMap) {
		super();
		this.nameString = nameString;
		this.phoneList = phoneList;
		this.addressSet = addressSet;
		this.coursesMap = coursesMap;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
}
