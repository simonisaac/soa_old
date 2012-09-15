package org.msilm.soa.canonical.policy.model;

public class Section {
	private String sectionId;

	public Section() {
	}
	
	public Section(String name) {
		super();
		this.sectionId = name;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String name) {
		this.sectionId = name;
	}
}
