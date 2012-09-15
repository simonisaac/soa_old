package org.msilm.services.organisation;

import java.util.HashMap;
import java.util.Map;

import org.msilm.services.organisation.to.Organisation;

public class OrganisationServiceImpl implements OrganisationService {

	private Map<String, Organisation> organisations = new HashMap<String, Organisation>();

	public boolean createOrganisation(Organisation organisation) {
		Organisation existing = this.organisations.get(organisation.getName());
		if (existing == null) {
			organisations.put(organisation.getName(), organisation);
			return true;
		}
		return false;
	}

	public Organisation retrieveOrganisation(String name) {
		return this.organisations.get(name);
	}
}
