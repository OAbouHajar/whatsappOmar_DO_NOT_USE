package X;

import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.whatsapp.util.Log;

/* renamed from: X.62X  reason: invalid class name */
public class AnonymousClass62X implements C23691Cz {
    public final AnonymousClass107 A00;
    public final AnonymousClass109 A01;
    public final AnonymousClass108 A02;

    public AnonymousClass62X(AnonymousClass107 r1, AnonymousClass109 r2, AnonymousClass108 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void AMa() {
        Log.i("PaymentAppUpdatedObserver/update-payment-notif");
        AnonymousClass107 r3 = this.A00;
        r3.A0B.Acl(new RunnableRunnableShape11S0100000_I0_10((Object) r3, 48));
        AnonymousClass108 r32 = this.A02;
        r32.A0A.Acl(new RunnableRunnableShape12S0100000_I0_11((Object) r32, 2));
        AnonymousClass109 r33 = this.A01;
        r33.A08.Acl(new RunnableRunnableShape12S0100000_I0_11((Object) r33, 1));
    }

    public /* synthetic */ void AMb() {
    }
}
