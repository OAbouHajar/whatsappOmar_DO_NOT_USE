package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Xi  reason: invalid class name and case insensitive filesystem */
public final class C65983Xi extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92504hf();
    public final int A00;
    public final String A01;
    public final HashMap A02;

    public C65983Xi(String str, ArrayList arrayList, int i2) {
        this.A00 = i2;
        HashMap A0x = AnonymousClass000.A0x();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C66093Xt r7 = (C66093Xt) arrayList.get(i3);
            String str2 = r7.A01;
            HashMap A0x2 = AnonymousClass000.A0x();
            ArrayList arrayList2 = r7.A02;
            C13710nw.A01(arrayList2);
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C66103Xu r0 = (C66103Xu) r7.A02.get(i4);
                A0x2.put(r0.A02, r0.A01);
            }
            A0x.put(str2, A0x2);
        }
        this.A02 = A0x;
        C13710nw.A01(str);
        this.A01 = str;
        Iterator A0e = AnonymousClass3K4.A0e(A0x);
        while (A0e.hasNext()) {
            Map map = (Map) A0x.get(A0e.next());
            Iterator A0I = C13700nu.A0I(map);
            while (A0I.hasNext()) {
                ((AnonymousClass3Y5) map.get(A0I.next())).A01 = this;
            }
        }
    }

    public final String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        HashMap hashMap = this.A02;
        Iterator A0e = AnonymousClass3K4.A0e(hashMap);
        while (A0e.hasNext()) {
            String A0m = AnonymousClass000.A0m(A0e);
            A0o.append(A0m);
            A0o.append(":\n");
            Map map = (Map) hashMap.get(A0m);
            Iterator A0I = C13700nu.A0I(map);
            while (A0I.hasNext()) {
                String A0m2 = AnonymousClass000.A0m(A0I);
                A0o.append("  ");
                AnonymousClass3K4.A13(A0o, A0m2);
                A0o.append(map.get(A0m2));
            }
        }
        return A0o.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        ArrayList A0u = AnonymousClass000.A0u();
        HashMap hashMap = this.A02;
        Iterator A0e = AnonymousClass3K4.A0e(hashMap);
        while (A0e.hasNext()) {
            String A0m = AnonymousClass000.A0m(A0e);
            A0u.add(new C66093Xt(A0m, (Map) hashMap.get(A0m)));
        }
        C32251fv.A0C(parcel, A0u, 2, false);
        C32251fv.A0A(parcel, this.A01, 3, false);
        C32251fv.A05(parcel, A002);
    }
}
