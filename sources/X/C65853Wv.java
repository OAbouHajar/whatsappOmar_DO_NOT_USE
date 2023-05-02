package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.3Wv  reason: invalid class name and case insensitive filesystem */
public class C65853Wv extends C57972sH implements AnonymousClass5UT {
    public final Bundle A00;
    public final AnonymousClass4O1 A01;
    public final Integer A02;

    public C65853Wv(Context context, Bundle bundle, Looper looper, C15650rc r12, C15670re r13, AnonymousClass4O1 r14) {
        super(context, looper, r12, r13, r14, 44);
        this.A01 = r14;
        this.A00 = bundle;
        this.A02 = r14.A00;
    }

    public static Bundle A01(AnonymousClass4O1 r4) {
        Integer num = r4.A00;
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable) null);
        if (num != null) {
            A0D.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        A0D.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        A0D.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        A0D.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        A0D.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        A0D.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        A0D.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        A0D.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        A0D.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return A0D;
    }

    public final Bundle A08() {
        String str = this.A01.A02;
        String str2 = str;
        if (!this.A0F.getPackageName().equals(str)) {
            this.A00.putString("com.google.android.gms.signin.internal.realClientPackageName", str2);
        }
        return this.A00;
    }

    public final /* synthetic */ IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return !(queryLocalInterface instanceof C66293Yu) ? new C66293Yu(iBinder) : queryLocalInterface;
    }

    public final String A0A() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String A0B() {
        return "com.google.android.gms.signin.service.START";
    }

    public final int ADl() {
        return 12451000;
    }

    public final boolean AcM() {
        return true;
    }

    public final void AiV(C15640rb r8) {
        try {
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount A022 = "<<default account>>".equals(account.name) ? C90484eD.A00(this.A0F).A02() : null;
            Integer num = this.A02;
            C13710nw.A01(num);
            C65903Xa r0 = new C65903Xa(account, A022, 2, num.intValue());
            C92094h0 r3 = (C92094h0) A01();
            AnonymousClass3X7 r2 = new AnonymousClass3X7(r0, 1);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(r3.A01);
            obtain.writeInt(1);
            r2.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(r8.asBinder());
            r3.A00(12, obtain);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                r8.AiS(new AnonymousClass3XU(new C15700rh(8, (PendingIntent) null), (C66003Xk) null, 1));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }
}
