package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.4hJ  reason: invalid class name and case insensitive filesystem */
public final class C92284hJ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C32281fy.A01(parcel, readInt);
                    break;
                case 2:
                    arrayList = C32281fy.A0A(parcel, Scope.CREATOR, readInt);
                    break;
                case 3:
                    account = (Account) C32281fy.A06(parcel, Account.CREATOR, readInt);
                    break;
                case 4:
                    z2 = C32281fy.A0F(parcel, readInt);
                    break;
                case 5:
                    z3 = C32281fy.A0F(parcel, readInt);
                    break;
                case 6:
                    z4 = C32281fy.A0F(parcel, readInt);
                    break;
                case 7:
                    str = C32281fy.A08(parcel, readInt);
                    break;
                case 8:
                    str2 = C32281fy.A08(parcel, readInt);
                    break;
                case 9:
                    arrayList2 = C32281fy.A0A(parcel, AnonymousClass3XS.CREATOR, readInt);
                    break;
                case 10:
                    str3 = C32281fy.A08(parcel, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        HashMap A0x = AnonymousClass000.A0x();
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AnonymousClass3XS r1 = (AnonymousClass3XS) it.next();
                AnonymousClass3K2.A1Q(r1, A0x, r1.A00);
            }
        }
        return new GoogleSignInOptions(account, str, str2, str3, arrayList, A0x, i2, z2, z3, z4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new GoogleSignInOptions[i2];
    }
}
