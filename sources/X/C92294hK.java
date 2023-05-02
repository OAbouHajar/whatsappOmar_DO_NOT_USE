package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* renamed from: X.4hK  reason: invalid class name and case insensitive filesystem */
public final class C92294hK implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 4) {
                str = C32281fy.A08(parcel, readInt);
            } else if (c2 != 7) {
                str2 = AnonymousClass3K3.A0l(parcel, str2, c2, 8, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C32281fy.A06(parcel, GoogleSignInAccount.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new SignInAccount(googleSignInAccount, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new SignInAccount[i2];
    }
}
