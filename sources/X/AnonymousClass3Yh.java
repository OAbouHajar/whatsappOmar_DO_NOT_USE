package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3Yh  reason: invalid class name */
public final class AnonymousClass3Yh extends AnonymousClass3YO {
    public static final HashMap A05;
    public static final Parcelable.Creator CREATOR = new C92204hB();
    public int A00;
    public C66183Yi A01;
    public ArrayList A02;
    public final int A03;
    public final Set A04;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A05 = A0x;
        A0x.put("authenticatorData", new AnonymousClass3Y5(AnonymousClass3Yj.class, "authenticatorData", 11, 11, 2, true, true));
        A0x.put("progress", new AnonymousClass3Y5(C66183Yi.class, "progress", 11, 11, 4, false, false));
    }

    public AnonymousClass3Yh() {
        this.A04 = new HashSet(1);
        this.A03 = 1;
    }

    public AnonymousClass3Yh(C66183Yi r1, ArrayList arrayList, Set set, int i2, int i3) {
        this.A04 = set;
        this.A03 = i2;
        this.A02 = arrayList;
        this.A00 = i3;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        Set set = this.A04;
        if (C13690nt.A1V(set, 1)) {
            C32251fv.A06(parcel, 1, this.A03);
        }
        if (C13690nt.A1V(set, 2)) {
            C32251fv.A0C(parcel, this.A02, 2, true);
        }
        if (C13690nt.A1V(set, 3)) {
            C32251fv.A06(parcel, 3, this.A00);
        }
        if (C13690nt.A1V(set, 4)) {
            C32251fv.A09(parcel, this.A01, 4, i2, true);
        }
        C32251fv.A05(parcel, A002);
    }
}
