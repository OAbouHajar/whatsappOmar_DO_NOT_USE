package X;

import android.content.Context;
import com.facebook.redex.IDxFListenerShape313S0100000_2_I1;
import java.util.concurrent.Executor;

/* renamed from: X.47O  reason: invalid class name */
public class AnonymousClass47O {
    public static void A00(C16980tz r3, AnonymousClass5S5 r4) {
        Context context = r3.A00;
        if (C437421i.A01(context)) {
            C14210on A01 = new AnonymousClass3WT(context).A01(new C65673Wd(), 1);
            C98844t4 r0 = new C98844t4(r4);
            Executor executor = C14500pH.A00;
            A01.A06(r0, executor);
            A01.A05(new IDxFListenerShape313S0100000_2_I1(r4, 1), executor);
            return;
        }
        r4.Aao();
    }
}
