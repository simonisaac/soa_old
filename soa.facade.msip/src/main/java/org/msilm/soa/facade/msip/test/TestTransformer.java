package org.msilm.soa.facade.msip.test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.mule.transport.http.ReleasingInputStream;

public class TestTransformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		System.out.println("++++++++ doTransform IN ++++++++++");
		Object obj = message.getPayload();

		try {
			System.out.println("payload as string" + message.getPayloadAsString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*if (obj instanceof ReleasingInputStream) {
			try {
				final char[] buffer = new char[0x10000];
				StringBuilder out = new StringBuilder();
				Reader in = new InputStreamReader((InputStream) obj, "UTF-8");
				try {
					int read;
					do {
						read = in.read(buffer, 0, buffer.length);
						if (read > 0) {
							out.append(buffer, 0, read);
						}
					} while (read >= 0);
				} finally {
					//in.close();
				}
				String result = out.toString();
				System.out.println("Transformed!!=" + result);
			} catch (Throwable t) {

			}
		}*/

		System.out.println("PAYLOAD=" + obj);
		System.out.println("++++++++ doTransform OUT ++++++++++");
		return obj;
	}

}
