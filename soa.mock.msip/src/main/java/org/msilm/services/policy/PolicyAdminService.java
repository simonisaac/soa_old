package org.msilm.services.policy;

import org.msilm.services.policy.to.Enquiry;
import org.msilm.services.policy.to.Section;

public interface PolicyAdminService {
	
	public boolean createEnquiry(Enquiry enquiry);

	public Enquiry retrieveEnquiry(String name);
	
	public boolean createSection(Section enquiry);

	public Section retrieveSection(String name);
}
