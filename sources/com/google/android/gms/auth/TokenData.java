package com.google.android.gms.auth;

import X.AnonymousClass000;
import X.AnonymousClass45A;
import X.C13710nw;
import X.C15710ri;
import X.C32251fv;
import X.C92314hM;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

public class TokenData extends C15710ri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C92314hM();
    public final int A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public TokenData(Long l2, String str, String str2, List list, int i2, boolean z2, boolean z3) {
        this.A00 = i2;
        C13710nw.A05(str);
        this.A03 = str;
        this.A01 = l2;
        this.A05 = z2;
        this.A06 = z3;
        this.A04 = list;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TokenData) {
            TokenData tokenData = (TokenData) obj;
            return TextUtils.equals(this.A03, tokenData.A03) && AnonymousClass45A.A00(this.A01, tokenData.A01) && this.A05 == tokenData.A05 && this.A06 == tokenData.A06 && AnonymousClass45A.A00(this.A04, tokenData.A04) && AnonymousClass45A.A00(this.A02, tokenData.A02);
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A03;
        objArr[1] = this.A01;
        objArr[2] = Boolean.valueOf(this.A05);
        objArr[3] = Boolean.valueOf(this.A06);
        objArr[4] = this.A04;
        return AnonymousClass000.A0F(this.A02, objArr, 5);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A0A(parcel, this.A03, 2, false);
        Long l2 = this.A01;
        if (l2 != null) {
            parcel.writeInt(524291);
            parcel.writeLong(l2.longValue());
        }
        C32251fv.A08(parcel, 4, this.A05);
        C32251fv.A08(parcel, 5, this.A06);
        C32251fv.A0B(parcel, this.A04, 6);
        C32251fv.A0A(parcel, this.A02, 7, false);
        C32251fv.A05(parcel, A012);
    }
}
