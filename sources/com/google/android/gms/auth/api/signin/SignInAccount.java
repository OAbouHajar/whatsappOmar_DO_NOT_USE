package com.google.android.gms.auth.api.signin;

import X.C13710nw;
import X.C15710ri;
import X.C32251fv;
import X.C92294hK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount extends C15710ri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C92294hK();
    public GoogleSignInAccount A00;
    @Deprecated
    public String A01;
    @Deprecated
    public String A02;

    public SignInAccount(GoogleSignInAccount googleSignInAccount, String str, String str2) {
        this.A00 = googleSignInAccount;
        C13710nw.A07(str, "8.3 and 8.4 SDKs require non-null email");
        this.A01 = str;
        C13710nw.A07(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.A02 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A0A(parcel, this.A01, 4, false);
        C32251fv.A09(parcel, this.A00, 7, i2, false);
        C32251fv.A0A(parcel, this.A02, 8, false);
        C32251fv.A05(parcel, A002);
    }
}
