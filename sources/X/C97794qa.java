package X;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.auth.TokenData;

/* renamed from: X.4qa  reason: invalid class name and case insensitive filesystem */
public final class C97794qa implements C108385Nt {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ Bundle A01;

    public C97794qa(Account account, Bundle bundle) {
        this.A00 = account;
        this.A01 = bundle;
    }

    public final /* synthetic */ Object Aj7(IBinder iBinder) {
        Object r6;
        if (iBinder == null) {
            r6 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            r6 = queryLocalInterface instanceof C109825Tu ? (C109825Tu) queryLocalInterface : new AnonymousClass3Yf(iBinder);
        }
        Account account = this.A00;
        Bundle bundle = this.A01;
        C92124h3 r62 = (C92124h3) r6;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r62.A01);
        obtain.writeInt(1);
        account.writeToParcel(obtain, 0);
        obtain.writeString("oauth2:https://www.googleapis.com/auth/drive.appdata");
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        Parcel A002 = r62.A00(5, obtain);
        Bundle bundle2 = (Bundle) AnonymousClass3K2.A0N(A002, Bundle.CREATOR);
        A002.recycle();
        C62103Bq.A05(bundle2);
        Class<TokenData> cls = TokenData.class;
        bundle2.setClassLoader(cls.getClassLoader());
        Bundle bundle3 = bundle2.getBundle("tokenDetails");
        if (bundle3 != null) {
            bundle3.setClassLoader(cls.getClassLoader());
            Parcelable parcelable = bundle3.getParcelable("TokenData");
            if (parcelable != null) {
                return parcelable;
            }
        }
        String string = bundle2.getString("Error");
        Intent intent = (Intent) bundle2.getParcelable("userRecoveryIntent");
        C797140z r1 = null;
        for (C797140z r2 : C797140z.values()) {
            if (r2.zzek.equals(string)) {
                r1 = r2;
            }
        }
        if (C797140z.A05.equals(r1) || C797140z.A07.equals(r1) || C797140z.A08.equals(r1) || C797140z.A09.equals(r1) || C797140z.A06.equals(r1) || C797140z.A0A.equals(r1) || C797140z.A01.equals(r1) || C797140z.A0C.equals(r1) || C797140z.A0D.equals(r1) || C797140z.A0E.equals(r1) || C797140z.A0F.equals(r1) || C797140z.A0G.equals(r1) || C797140z.A0H.equals(r1) || C797140z.A0J.equals(r1) || C797140z.A0B.equals(r1) || C797140z.A0I.equals(r1)) {
            AnonymousClass4RN r63 = C62103Bq.A01;
            String valueOf = String.valueOf(r1);
            StringBuilder A0g = C13690nt.A0g(valueOf.length() + 31);
            A0g.append("isUserRecoverableError status: ");
            Log.w("Auth", r63.A03.concat(AnonymousClass3K4.A0b("GoogleAuthUtil", new Object[]{AnonymousClass000.A0h(valueOf, A0g)})));
            throw new AnonymousClass2RG(intent, string);
        } else if (C797140z.A02.equals(r1) || C797140z.A03.equals(r1) || C797140z.A04.equals(r1)) {
            throw AnonymousClass3K3.A0e(string);
        } else {
            throw new AnonymousClass2RH(string);
        }
    }
}
