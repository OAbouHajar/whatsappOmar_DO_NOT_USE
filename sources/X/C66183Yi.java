package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.3Yi  reason: invalid class name and case insensitive filesystem */
public class C66183Yi extends AnonymousClass3YO {
    public static final AnonymousClass00N A06;
    public static final Parcelable.Creator CREATOR = new C92214hC();
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final int A05;

    static {
        AnonymousClass00N r2 = new AnonymousClass00N();
        A06 = r2;
        r2.put("registered", AnonymousClass3Y5.A03("registered", 2));
        r2.put("in_progress", AnonymousClass3Y5.A03("in_progress", 3));
        r2.put("success", AnonymousClass3Y5.A03("success", 4));
        r2.put("failed", AnonymousClass3Y5.A03("failed", 5));
        r2.put("escrowed", AnonymousClass3Y5.A03("escrowed", 6));
    }

    public C66183Yi() {
        this.A05 = 1;
    }

    public C66183Yi(List list, List list2, List list3, List list4, List list5, int i2) {
        this.A05 = i2;
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A05);
        C32251fv.A0B(parcel, this.A00, 2);
        C32251fv.A0B(parcel, this.A01, 3);
        C32251fv.A0B(parcel, this.A02, 4);
        C32251fv.A0B(parcel, this.A03, 5);
        C32251fv.A0B(parcel, this.A04, 6);
        C32251fv.A05(parcel, A002);
    }
}
