package org.msilm.soa.facade.msip.service.policyadmin;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.msilm.soa.canonical.policy.model.Policy;

@WebService (name="PolicyAdminFacade")
public interface IPolicyAdminFacade {

	@WebResult(name="Policy")
	public Policy retrivePolicy (@WebParam(name="policyId") String policyId);
}
