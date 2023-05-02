package X;

import org.xml.sax.SAXException;

/* renamed from: X.0ix  reason: invalid class name and case insensitive filesystem */
public class C11550ix extends SAXException {
    public C11550ix(String str) {
        super(str);
    }

    public C11550ix(String str, Exception exc) {
        super(str, exc);
    }

    public static C11550ix A00(String str) {
        return new C11550ix(str);
    }
}
