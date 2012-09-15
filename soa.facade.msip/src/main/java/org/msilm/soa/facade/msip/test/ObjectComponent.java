package org.msilm.soa.facade.msip.test;

public class ObjectComponent {


	
	public String getTestString (Object input) {
		String rString = "Got [" + input + "]";
		System.out.println(rString);
		return rString;
	}
}
