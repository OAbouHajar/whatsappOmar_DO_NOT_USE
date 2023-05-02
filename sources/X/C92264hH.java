package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* renamed from: X.4hH  reason: invalid class name and case insensitive filesystem */
public final class C92264hH implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                str = C32281fy.A08(parcel, readInt);
            } else if (c2 != 5) {
                C32281fy.A0C(parcel, readInt);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C32281fy.A06(parcel, GoogleSignInOptions.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new SignInConfiguration(googleSignInOptions, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new SignInConfiguration[i2];
    }
}
