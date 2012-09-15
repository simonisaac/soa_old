package org.msilm.soa.canonical.policy.model;

public class Enquiry {
	private String enquiryId;

	private Section section;

	public Enquiry() {
	}

	public Enquiry(String name) {
		this.enquiryId = name;
	}

	public Enquiry(String enquiryId, Section section) {
		this.enquiryId = enquiryId;
		this.section = section;
	}

	public String getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(String name) {
		this.enquiryId = name;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
}
