package com.google.android.gms.common.api;

import X.AnonymousClass000;
import X.AnonymousClass45A;
import X.AnonymousClass45O;
import X.C108395Nu;
import X.C13930oJ;
import X.C15700rh;
import X.C15710ri;
import X.C32251fv;
import X.C92354hQ;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Status extends C15710ri implements C108395Nu, ReflectedParcelable {
    public static final Status A05 = new Status(16, (String) null);
    public static final Status A06 = new Status(18, (String) null);
    public static final Status A07 = new Status(8, (String) null);
    public static final Status A08 = new Status(14, (String) null);
    public static final Status A09 = new Status(0, (String) null);
    public static final Status A0A = new Status(15, (String) null);
    public static final Status A0B = new Status(17, (String) null);
    public static final Parcelable.Creator CREATOR = new C92354hQ();
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final C15700rh A03;
    public final String A04;

    public Status(int i2, String str) {
        this((PendingIntent) null, (C15700rh) null, str, 1, i2);
    }

    public Status(PendingIntent pendingIntent, C15700rh r2, String str, int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = str;
        this.A02 = pendingIntent;
        this.A03 = r2;
    }

    public Status AGH() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.A00 == status.A00 && this.A01 == status.A01 && AnonymousClass45A.A00(this.A04, status.A04) && AnonymousClass45A.A00(this.A02, status.A02) && AnonymousClass45A.A00(this.A03, status.A03);
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1K(objArr, this.A00);
        AnonymousClass000.A1L(objArr, this.A01);
        objArr[2] = this.A04;
        objArr[3] = this.A02;
        return AnonymousClass000.A0F(this.A03, objArr, 4);
    }

    public String toString() {
        C13930oJ r2 = new C13930oJ(this);
        String str = this.A04;
        if (str == null) {
            str = AnonymousClass45O.A00(this.A01);
        }
        r2.A00(str, "statusCode");
        r2.A00(this.A02, "resolution");
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        C32251fv.A06(parcel, 1, this.A01);
        C32251fv.A0A(parcel, this.A04, 2, false);
        C32251fv.A09(parcel, this.A02, 3, i2, false);
        C32251fv.A09(parcel, this.A03, 4, i2, false);
        C32251fv.A06(parcel, 1000, this.A00);
        C32251fv.A05(parcel, A012);
    }
}
