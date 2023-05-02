package X;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: X.67o  reason: invalid class name and case insensitive filesystem */
public class C1219267o extends DefaultHandler {
    public static String A00;
    public static C117155sX A01;
    public static final List A02 = AnonymousClass000.A0u();

    public C1219267o(String str) {
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(new InputSource(new StringReader(str)), this);
        } catch (IOException | ParserConfigurationException | SAXException unused) {
            throw new C115065p3(C114785ob.PARSER_MISCONFIG);
        }
    }

    public void characters(char[] cArr, int i2, int i3) {
        A00 = String.copyValueOf(cArr, i2, i3).trim();
    }

    public void endElement(String str, String str2, String str3) {
        if (str3.equals("key")) {
            A02.add(A01);
        } else if (str3.equals("keyValue")) {
            A01.A02 = A00;
        }
    }

    public void finalize() {
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str3.equals("key")) {
            C117155sX r1 = new C117155sX();
            A01 = r1;
            r1.A01 = attributes.getValue("ki");
            A01.A00 = attributes.getValue("owner");
        }
    }
}
