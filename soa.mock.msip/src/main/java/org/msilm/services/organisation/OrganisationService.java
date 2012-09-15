package org.msilm.services.organisation;

import org.msilm.services.organisation.to.Organisation;

public interface OrganisationService {

	public boolean createOrganisation (Organisation organisation);
	
	public Organisation retrieveOrganisation (String name);
}
