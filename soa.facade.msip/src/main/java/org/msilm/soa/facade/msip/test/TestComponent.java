package org.msilm.soa.facade.msip.test;

public class TestComponent {

	public String getTestString (String input) {
		String rString = "Got [" + input + "]";
		System.out.println(rString);
		return rString;
	}
}
