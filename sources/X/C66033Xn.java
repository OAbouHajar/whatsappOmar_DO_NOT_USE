package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.3Xn  reason: invalid class name and case insensitive filesystem */
public final class C66033Xn extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92884iI();
    public final String A00;
    public final List A01;

    public C66033Xn(String str, List list) {
        this.A00 = str;
        this.A01 = list;
        C13710nw.A01(str);
        C13710nw.A01(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r1.equals(r0) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x002f
            r2 = 0
            if (r5 == 0) goto L_0x0028
            java.lang.Class<X.3Xn> r1 = X.C66033Xn.class
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0028
            X.3Xn r5 = (X.C66033Xn) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == 0) goto L_0x0029
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0028
        L_0x001c:
            java.util.List r1 = r4.A01
            java.util.List r0 = r5.A01
            if (r1 == 0) goto L_0x002c
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0028:
            return r2
        L_0x0029:
            if (r0 == 0) goto L_0x001c
            return r2
        L_0x002c:
            if (r0 == 0) goto L_0x002f
            return r2
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66033Xn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2 = 0;
        int A0I = (AnonymousClass3K3.A0I(this.A00) + 31) * 31;
        List list = this.A01;
        if (list != null) {
            i2 = list.hashCode();
        }
        return A0I + i2;
    }

    public final String toString() {
        String str = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0g = C13690nt.A0g(C13680ns.A06(str) + 18 + valueOf.length());
        A0g.append("CapabilityInfo{");
        AnonymousClass3K3.A1N(A0g, str);
        A0g.append(valueOf);
        return AnonymousClass000.A0h("}", A0g);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A0C(parcel, this.A01, 3, AnonymousClass3K3.A1R(parcel, this.A00));
        C32251fv.A05(parcel, A002);
    }
}
