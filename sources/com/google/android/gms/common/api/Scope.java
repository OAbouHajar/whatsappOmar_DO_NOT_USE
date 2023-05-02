package com.google.android.gms.common.api;

import X.AnonymousClass3K3;
import X.C13710nw;
import X.C15710ri;
import X.C32251fv;
import X.C92344hP;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends C15710ri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C92344hP();
    public final int A00;
    public final String A01;

    public Scope(int i2, String str) {
        C13710nw.A07(str, "scopeUri must not be null or empty");
        this.A00 = i2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.A01.equals(((Scope) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        return this.A01;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        AnonymousClass3K3.A12(parcel, this.A01, 2, A002);
    }
}
