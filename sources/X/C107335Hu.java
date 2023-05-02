package X;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: X.5Hu  reason: invalid class name and case insensitive filesystem */
public class C107335Hu extends C32061fa {
    public Hashtable A00 = new Hashtable();
    public Vector A01 = new Vector();

    public C107335Hu(C32411gJ r5) {
        Enumeration A0B = r5.A0B();
        while (A0B.hasMoreElements()) {
            Object nextElement = A0B.nextElement();
            AnonymousClass5IH r2 = nextElement instanceof AnonymousClass5IH ? (AnonymousClass5IH) nextElement : nextElement != null ? new AnonymousClass5IH(C32411gJ.A00(nextElement)) : null;
            Hashtable hashtable = this.A00;
            C32041fY r1 = r2.A00;
            if (!hashtable.containsKey(r1)) {
                this.A00.put(r1, r2);
                this.A01.addElement(r1);
            } else {
                throw AnonymousClass000.A0T(AnonymousClass000.A0g("repeated extension found: ", r1));
            }
        }
    }

    public static AnonymousClass5IH A00(Object obj, C107335Hu r2) {
        return (AnonymousClass5IH) r2.A00.get(obj);
    }

    public static C107335Hu A01(Object obj) {
        if (obj instanceof C107335Hu) {
            return (C107335Hu) obj;
        }
        if (obj != null) {
            return new C107335Hu(C32411gJ.A00(obj));
        }
        return null;
    }

    public C32051fZ Agm() {
        Vector vector = this.A01;
        C32391gH r3 = new C32391gH(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            r3.A02((C32061fa) this.A00.get(elements.nextElement()));
        }
        return new C32401gI(r3);
    }
}
