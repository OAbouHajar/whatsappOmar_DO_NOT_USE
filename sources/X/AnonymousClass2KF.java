package X;

import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape0S2100000_I0;
import com.facebook.redex.RunnableRunnableShape0S2101000_I0;
import com.facebook.redex.RunnableRunnableShape0S2200000_I0;
import com.whatsapp.util.Log;

/* renamed from: X.2KF  reason: invalid class name */
public class AnonymousClass2KF implements C19550yc {
    public final /* synthetic */ AnonymousClass1H4 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public AnonymousClass2KF(AnonymousClass1H4 r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public void APb(String str) {
        StringBuilder sb = new StringBuilder("TwoFactorXmppMethods/sendSetTwoFactorAuth/onDeliveryFailure; iq=");
        sb.append(str);
        Log.i(sb.toString());
        this.A00.A00.Acq(new RunnableRunnableShape0S2100000_I0(this, this.A01, this.A02, 11));
    }

    public void AQe(C28371Vv r8, String str) {
        Pair A012 = C34451kH.A01(r8);
        StringBuilder sb = new StringBuilder("TwoFactorXmppMethods/sendSetTwoFactorAuth/onError; iq=");
        sb.append(str);
        sb.append(", error=");
        sb.append(A012);
        Log.i(sb.toString());
        this.A00.A00.Acq(new RunnableRunnableShape0S2200000_I0(this, A012, this.A01, this.A02, 3));
    }

    public void AYG(C28371Vv r8, String str) {
        StringBuilder sb = new StringBuilder("TwoFactorXmppMethods/sendSetTwoFactorAuth/onSuccess; iq=");
        sb.append(str);
        Log.i(sb.toString());
        C14860ps r2 = (C14860ps) this.A00.A02.get();
        r2.A0A.Aco(new RunnableRunnableShape0S2101000_I0(r2, this.A01, this.A02, 0, 1));
    }
}
