

package org.msilm.soa.facade.msip.service.policyadmin;

import org.msilm.soa.canonical.policy.model.Enquiry;
import org.msilm.soa.canonical.policy.model.Policy;
import org.msilm.soa.canonical.policy.model.Section;

public class PolicyAdminFacadeImpl implements IPolicyAdminFacade {

	public Policy retrivePolicy(String enquiryId) {
		
		Section section = new Section("2");
		Enquiry enq = new Enquiry("1", section);
		Policy pol = new Policy("1", enq);
		return pol;
	}
}
