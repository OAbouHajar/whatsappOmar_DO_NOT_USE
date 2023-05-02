package X;

import java.util.Enumeration;

/* renamed from: X.57O  reason: invalid class name */
public class AnonymousClass57O implements Enumeration {
    public final Enumeration A00;
    public final /* synthetic */ AnonymousClass5Hl A01;

    public AnonymousClass57O(Enumeration enumeration, AnonymousClass5Hl r2) {
        this.A01 = r2;
        this.A00 = enumeration;
    }

    public boolean hasMoreElements() {
        return this.A00.hasMoreElements();
    }

    public Object nextElement() {
        Object nextElement = this.A00.nextElement();
        if (nextElement instanceof AnonymousClass5Hq) {
            return nextElement;
        }
        if (nextElement != null) {
            return new AnonymousClass5Hq(C32411gJ.A00(nextElement));
        }
        return null;
    }
}
