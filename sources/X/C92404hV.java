package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.4hV  reason: invalid class name and case insensitive filesystem */
public final class C92404hV implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 == 2) {
                account = (Account) C32281fy.A06(parcel, Account.CREATOR, readInt);
            } else if (c2 == 3) {
                i3 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 4) {
                C32281fy.A0C(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C32281fy.A06(parcel, GoogleSignInAccount.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C65903Xa(account, googleSignInAccount, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C65903Xa[i2];
    }
}
