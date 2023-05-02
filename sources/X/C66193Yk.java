package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.3Yk  reason: invalid class name and case insensitive filesystem */
public class C66193Yk extends AnonymousClass3YO {
    public static final HashMap A07;
    public static final Parcelable.Creator CREATOR = new C92234hE();
    public int A00;
    public PendingIntent A01;
    public AnonymousClass3XZ A02;
    public String A03;
    public byte[] A04;
    public final int A05;
    public final Set A06;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A07 = A0x;
        A0x.put("accountType", new AnonymousClass3Y5((Class) null, "accountType", 7, 7, 2, false, false));
        A0x.put("status", new AnonymousClass3Y5((Class) null, "status", 0, 0, 3, false, false));
        A0x.put("transferBytes", new AnonymousClass3Y5((Class) null, "transferBytes", 8, 8, 4, false, false));
    }

    public C66193Yk() {
        this.A06 = new C003001i(3);
        this.A05 = 1;
    }

    public C66193Yk(PendingIntent pendingIntent, AnonymousClass3XZ r2, String str, Set set, byte[] bArr, int i2, int i3) {
        this.A06 = set;
        this.A05 = i2;
        this.A03 = str;
        this.A00 = i3;
        this.A04 = bArr;
        this.A01 = pendingIntent;
        this.A02 = r2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        Set set = this.A06;
        if (C13690nt.A1V(set, 1)) {
            C32251fv.A06(parcel, 1, this.A05);
        }
        if (C13690nt.A1V(set, 2)) {
            C32251fv.A0A(parcel, this.A03, 2, true);
        }
        if (C13690nt.A1V(set, 3)) {
            C32251fv.A06(parcel, 3, this.A00);
        }
        if (C13690nt.A1V(set, 4)) {
            C32251fv.A0D(parcel, this.A04, 4, true);
        }
        if (C13690nt.A1V(set, 5)) {
            C32251fv.A09(parcel, this.A01, 5, i2, true);
        }
        if (C13690nt.A1V(set, 6)) {
            C32251fv.A09(parcel, this.A02, 6, i2, true);
        }
        C32251fv.A05(parcel, A002);
    }
}
