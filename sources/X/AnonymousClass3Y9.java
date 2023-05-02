package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.3Y9  reason: invalid class name */
public final class AnonymousClass3Y9 extends C15710ri implements C108395Nu {
    public static final AnonymousClass3Y9 A01 = new AnonymousClass3Y9(Status.A09);
    public static final Parcelable.Creator CREATOR = new C92594hp();
    public final Status A00;

    public AnonymousClass3Y9(Status status) {
        this.A00 = status;
    }

    public final Status AGH() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A09(parcel, this.A00, 1, i2, false);
        C32251fv.A05(parcel, A002);
    }
}
