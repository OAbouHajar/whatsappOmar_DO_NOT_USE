package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3Yj  reason: invalid class name */
public class AnonymousClass3Yj extends AnonymousClass3YO {
    public static final HashMap A06;
    public static final Parcelable.Creator CREATOR = new C92224hD();
    public C66193Yk A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;
    public final Set A05;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A06 = A0x;
        A0x.put("authenticatorInfo", new AnonymousClass3Y5(C66193Yk.class, "authenticatorInfo", 11, 11, 2, false, false));
        A0x.put("signature", new AnonymousClass3Y5((Class) null, "signature", 7, 7, 3, false, false));
        A0x.put("package", new AnonymousClass3Y5((Class) null, "package", 7, 7, 4, false, false));
    }

    public AnonymousClass3Yj() {
        this.A05 = new HashSet(3);
        this.A04 = 1;
    }

    public AnonymousClass3Yj(C66193Yk r1, String str, String str2, String str3, Set set, int i2) {
        this.A05 = set;
        this.A04 = i2;
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        Set set = this.A05;
        if (C13690nt.A1V(set, 1)) {
            C32251fv.A06(parcel, 1, this.A04);
        }
        if (C13690nt.A1V(set, 2)) {
            C32251fv.A09(parcel, this.A00, 2, i2, true);
        }
        if (C13690nt.A1V(set, 3)) {
            C32251fv.A0A(parcel, this.A02, 3, true);
        }
        if (C13690nt.A1V(set, 4)) {
            C32251fv.A0A(parcel, this.A01, 4, true);
        }
        if (C13690nt.A1V(set, 5)) {
            C32251fv.A0A(parcel, this.A03, 5, true);
        }
        C32251fv.A05(parcel, A002);
    }
}
