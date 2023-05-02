package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Xt  reason: invalid class name and case insensitive filesystem */
public final class C66093Xt extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92514hg();
    public final int A00;
    public final String A01;
    public final ArrayList A02;

    public C66093Xt(String str, ArrayList arrayList, int i2) {
        this.A00 = i2;
        this.A01 = str;
        this.A02 = arrayList;
    }

    public C66093Xt(String str, Map map) {
        ArrayList A0u;
        this.A00 = 1;
        this.A01 = str;
        if (map == null) {
            A0u = null;
        } else {
            A0u = AnonymousClass000.A0u();
            Iterator A0I = C13700nu.A0I(map);
            while (A0I.hasNext()) {
                String A0m = AnonymousClass000.A0m(A0I);
                A0u.add(new C66103Xu((AnonymousClass3Y5) map.get(A0m), A0m));
            }
        }
        this.A02 = A0u;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A0C(parcel, this.A02, 3, AnonymousClass3K3.A1R(parcel, this.A01));
        C32251fv.A05(parcel, A002);
    }
}
