package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.3Xa  reason: invalid class name and case insensitive filesystem */
public final class C65903Xa extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92404hV();
    public final int A00;
    public final int A01;
    public final Account A02;
    public final GoogleSignInAccount A03;

    public C65903Xa(Account account, GoogleSignInAccount googleSignInAccount, int i2, int i3) {
        this.A00 = i2;
        this.A02 = account;
        this.A01 = i3;
        this.A03 = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A09(parcel, this.A02, 2, i2, false);
        C32251fv.A06(parcel, 3, this.A01);
        C32251fv.A09(parcel, this.A03, 4, i2, false);
        C32251fv.A05(parcel, A002);
    }
}
