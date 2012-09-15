package org.msilm.soa.facade.msip.test;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class EnquiryToSectionTransformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		System.out.println("++++++++ doTransform ++++++++++");
		return "this is s string";
	}

}
