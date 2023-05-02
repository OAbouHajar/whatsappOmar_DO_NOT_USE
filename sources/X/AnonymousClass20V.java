package X;

import java.util.HashMap;

/* renamed from: X.20V  reason: invalid class name */
public class AnonymousClass20V {
    public final AnonymousClass20T A00;
    public final HashMap A01;

    public AnonymousClass20V(AnonymousClass20T r1, HashMap hashMap) {
        this.A00 = r1;
        this.A01 = hashMap;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass20V)) {
            return false;
        }
        AnonymousClass20V r4 = (AnonymousClass20V) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return ((159 + this.A00.hashCode()) * 53) + this.A01.hashCode();
    }
}
