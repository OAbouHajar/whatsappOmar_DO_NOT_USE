package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: X.4j3  reason: invalid class name and case insensitive filesystem */
public final class C93354j3 implements Parcelable.Creator {
    public static void A00(Parcel parcel, AnonymousClass3Y1 r5, int i2) {
        int A00 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, r5.A0C);
        C32251fv.A06(parcel, 2, r5.A0D);
        C32251fv.A06(parcel, 3, r5.A00);
        C32251fv.A0A(parcel, r5.A05, 4, false);
        C32251fv.A03(r5.A04, parcel, 5);
        C32251fv.A0E(parcel, r5.A0B, 6, i2);
        C32251fv.A02(r5.A03, parcel, 7);
        C32251fv.A09(parcel, r5.A02, 8, i2, false);
        C32251fv.A0E(parcel, r5.A09, 10, i2);
        C32251fv.A0E(parcel, r5.A0A, 11, i2);
        C32251fv.A08(parcel, 12, r5.A07);
        C32251fv.A06(parcel, 13, r5.A01);
        C32251fv.A08(parcel, 14, r5.A08);
        C32251fv.A0A(parcel, r5.A06, 15, false);
        C32251fv.A05(parcel, A00);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = C32281fy.A00(parcel2);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        AnonymousClass3Y2[] r9 = null;
        AnonymousClass3Y2[] r10 = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        boolean z3 = false;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C32281fy.A01(parcel2, readInt);
                    break;
                case 2:
                    i3 = C32281fy.A01(parcel2, readInt);
                    break;
                case 3:
                    i4 = C32281fy.A01(parcel2, readInt);
                    break;
                case 4:
                    str = C32281fy.A08(parcel2, readInt);
                    break;
                case 5:
                    iBinder = C32281fy.A05(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) C32281fy.A0I(parcel2, Scope.CREATOR, readInt);
                    break;
                case 7:
                    bundle = C32281fy.A04(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) C32281fy.A06(parcel2, Account.CREATOR, readInt);
                    break;
                case 10:
                    r9 = (AnonymousClass3Y2[]) C32281fy.A0I(parcel2, AnonymousClass3Y2.CREATOR, readInt);
                    break;
                case 11:
                    r10 = (AnonymousClass3Y2[]) C32281fy.A0I(parcel2, AnonymousClass3Y2.CREATOR, readInt);
                    break;
                case 12:
                    z2 = C32281fy.A0F(parcel2, readInt);
                    break;
                case 13:
                    i5 = C32281fy.A01(parcel2, readInt);
                    break;
                case 14:
                    z3 = C32281fy.A0F(parcel2, readInt);
                    break;
                case 15:
                    str2 = C32281fy.A08(parcel2, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel2, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel2, A00);
        return new AnonymousClass3Y1(account, bundle, iBinder, str, str2, r9, r10, scopeArr, i2, i3, i4, i5, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3Y1[i2];
    }
}
