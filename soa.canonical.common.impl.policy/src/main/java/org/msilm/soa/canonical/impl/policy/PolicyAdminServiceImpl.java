package org.msilm.soa.canonical.impl.policy;


import org.msilm.soa.canonical.policy.model.Enquiry;
import org.msilm.soa.canonical.policy.model.Policy;
import org.msilm.soa.canonical.policy.model.Section;
import org.msilm.soa.canonical.policy.services.admin.IPolicyAdminService;

public class PolicyAdminServiceImpl implements IPolicyAdminService{

	@Override
	public org.msilm.soa.canonical.policy.services.admin.Policy retrivePolicy(String policyId) {
		Section section = new Section("sec1");
		Enquiry enquiry = new Enquiry("enq1", section);
		Policy policy = new Policy("pol1", enquiry);
		return policy;
	}

}
