package org.msilm.services.echo;


public class EchoServiceImpl implements EchoService {

	public String echo(String string) {
		System.out.println("in here, got:" + string);
		String rString = "Received [" + string + "]";
		System.out.println("Returning " + rString);
		return rString;
	}

}
