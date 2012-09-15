package org.msilm.soa.canonical.policy.services.admin;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.msilm.soa.canonical.policy.model.Policy;

@WebService (serviceName="PolicyAdminFacade" )
public interface IPolicyAdminService {

	@WebResult(name="Policy")
	public Policy retrivePolicy (@WebParam(name="policyId") String policyId);
}
