package org.msilm.soa.canonical.policy.model;

public class Policy {
	private String policyId;

	private Enquiry enquiry;

	public Policy() {
	}

	public Policy(String policyId, Enquiry enquiry) {
		super();
		this.policyId = policyId;
		this.enquiry = enquiry;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public Enquiry getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(Enquiry enquiry) {
		this.enquiry = enquiry;
	}
}
