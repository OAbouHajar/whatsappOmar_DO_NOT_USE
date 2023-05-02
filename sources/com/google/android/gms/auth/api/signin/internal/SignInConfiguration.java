package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass3K3;
import X.C13710nw;
import X.C15710ri;
import X.C32251fv;
import X.C85754Pv;
import X.C92264hH;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration extends C15710ri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C92264hH();
    public GoogleSignInOptions A00;
    public final String A01;

    public SignInConfiguration(GoogleSignInOptions googleSignInOptions, String str) {
        C13710nw.A05(str);
        this.A01 = str;
        this.A00 = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignInConfiguration) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (this.A01.equals(signInConfiguration.A01)) {
                GoogleSignInOptions googleSignInOptions = this.A00;
                GoogleSignInOptions googleSignInOptions2 = signInConfiguration.A00;
                if (googleSignInOptions != null) {
                    return googleSignInOptions.equals(googleSignInOptions2);
                }
                if (googleSignInOptions2 == null) {
                    return true;
                }
            }
        }
    }

    public final int hashCode() {
        C85754Pv r1 = new C85754Pv();
        r1.A00(this.A01);
        r1.A00(this.A00);
        return r1.A00;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A09(parcel, this.A00, 5, i2, AnonymousClass3K3.A1R(parcel, this.A01));
        C32251fv.A05(parcel, A002);
    }
}
