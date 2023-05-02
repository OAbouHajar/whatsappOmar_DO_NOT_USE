package X;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0i8  reason: invalid class name and case insensitive filesystem */
public class C11060i8 implements Attributes {
    public XmlPullParser A00;
    public final /* synthetic */ AnonymousClass0XP A01;

    public C11060i8(AnonymousClass0XP r1, XmlPullParser xmlPullParser) {
        this.A01 = r1;
        this.A00 = xmlPullParser;
    }

    public int getIndex(String str) {
        return -1;
    }

    public int getIndex(String str, String str2) {
        return -1;
    }

    public int getLength() {
        return this.A00.getAttributeCount();
    }

    public String getLocalName(int i2) {
        return this.A00.getAttributeName(i2);
    }

    public String getQName(int i2) {
        XmlPullParser xmlPullParser = this.A00;
        String attributeName = xmlPullParser.getAttributeName(i2);
        if (xmlPullParser.getAttributePrefix(i2) == null) {
            return attributeName;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(xmlPullParser.getAttributePrefix(i2));
        A0o.append(':');
        return AnonymousClass000.A0h(attributeName, A0o);
    }

    public String getType(int i2) {
        return null;
    }

    public String getType(String str) {
        return null;
    }

    public String getType(String str, String str2) {
        return null;
    }

    public String getURI(int i2) {
        return this.A00.getAttributeNamespace(i2);
    }

    public String getValue(int i2) {
        return this.A00.getAttributeValue(i2);
    }

    public String getValue(String str) {
        return null;
    }

    public String getValue(String str, String str2) {
        return null;
    }
}
