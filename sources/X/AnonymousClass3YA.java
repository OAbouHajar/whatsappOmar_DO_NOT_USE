package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: X.3YA  reason: invalid class name */
public final class AnonymousClass3YA extends C15710ri implements C108395Nu {
    public static final Parcelable.Creator CREATOR = new C92814iB();
    public final String A00;
    public final List A01;

    public AnonymousClass3YA(String str, List list) {
        this.A01 = list;
        this.A00 = str;
    }

    public final Status AGH() {
        return this.A00 != null ? Status.A09 : Status.A05;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A0B(parcel, this.A01, 1);
        C32251fv.A0A(parcel, this.A00, 2, false);
        C32251fv.A05(parcel, A002);
    }
}
