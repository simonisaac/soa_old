package org.msilm.services.policy;

import java.util.HashMap;
import java.util.Map;

import org.msilm.services.policy.to.Enquiry;
import org.msilm.services.policy.to.Section;

public class PolicyAdminServiceImpl implements PolicyAdminService {
	
	private Map<String, Enquiry> enquiries = new HashMap<String, Enquiry>();

	public boolean createEnquiry(Enquiry enquiry) {
		Enquiry existing = this.enquiries.get(enquiry.getName());
		if (existing == null) {
			enquiries.put(enquiry.getName(), enquiry);
			return true;
		}
		return false;
	}

	public Enquiry retrieveEnquiry(String name) {
		System.out.println("????? retrieveEnquiry ????????..." + name);
		Enquiry enq = this.enquiries.get(name);
		if (enq == null) {
			enq = new Enquiry();
			enq.setName(name);
		}
		return enq;
	}
	
	private Map<String, Section> sections = new HashMap<String, Section>();

	public boolean createSection(Section section) {
		Section existing = this.sections.get(section.getName());
		if (existing == null) {
			sections.put(section.getName(), section);
			return true;
		}
		return false;
	}

	public Section retrieveSection(String name) {
		return this.sections.get(name);
	}
}
