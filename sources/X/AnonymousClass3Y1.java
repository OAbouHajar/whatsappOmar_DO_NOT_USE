package X;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.3Y1  reason: invalid class name */
public class AnonymousClass3Y1 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93354j3();
    public int A00;
    public int A01;
    public Account A02;
    public Bundle A03;
    public IBinder A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public AnonymousClass3Y2[] A09;
    public AnonymousClass3Y2[] A0A;
    public Scope[] A0B;
    public final int A0C;
    public final int A0D;

    public AnonymousClass3Y1(int i2, String str) {
        this.A0C = 6;
        this.A00 = 12451000;
        this.A0D = i2;
        this.A07 = true;
        this.A06 = str;
    }

    public AnonymousClass3Y1(Account account, Bundle bundle, IBinder iBinder, String str, String str2, AnonymousClass3Y2[] r13, AnonymousClass3Y2[] r14, Scope[] scopeArr, int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        Account account2;
        int i6 = i2;
        this.A0C = i6;
        this.A0D = i3;
        this.A00 = i4;
        if ("com.google.android.gms".equals(str)) {
            this.A05 = "com.google.android.gms";
        } else {
            this.A05 = str;
        }
        if (i6 < 2) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                Object r2 = queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new C66423Zh(iBinder);
                account2 = null;
                if (r2 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        C66423Zh r22 = (C66423Zh) r2;
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(r22.A01);
                        Parcel A002 = r22.A00(2, obtain);
                        Account account3 = (Account) (A002.readInt() == 0 ? null : (Parcelable) Account.CREATOR.createFromParcel(A002));
                        A002.recycle();
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } else {
                account2 = null;
            }
            this.A02 = account2;
        } else {
            this.A04 = iBinder;
            this.A02 = account;
        }
        this.A0B = scopeArr;
        this.A03 = bundle;
        this.A09 = r13;
        this.A0A = r14;
        this.A07 = z2;
        this.A01 = i5;
        this.A08 = z3;
        this.A06 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        C93354j3.A00(parcel, this, i2);
    }
}
