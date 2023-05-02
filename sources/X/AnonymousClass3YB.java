package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.3YB  reason: invalid class name */
public final class AnonymousClass3YB extends C15710ri implements C108395Nu {
    public static final Parcelable.Creator CREATOR = new C92804iA();
    public int A00;
    public Intent A01;
    public final int A02;

    public AnonymousClass3YB() {
        this(2, 0, (Intent) null);
    }

    public AnonymousClass3YB(int i2, int i3, Intent intent) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = intent;
    }

    public final Status AGH() {
        return this.A00 == 0 ? Status.A09 : Status.A05;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A02);
        C32251fv.A06(parcel, 2, this.A00);
        AnonymousClass3K2.A0x(parcel, this.A01, i2, A002);
    }
}
