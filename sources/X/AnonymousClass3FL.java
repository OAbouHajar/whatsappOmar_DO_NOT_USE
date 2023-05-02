package X;

import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3FL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FL implements AnonymousClass5P9 {
    public final /* synthetic */ C447225g A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass3FL(C447225g r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void ASU(C38571r0 r7) {
        C447225g r4 = this.A00;
        String str = this.A01;
        if (r7 != null) {
            String str2 = r7.A03;
            if (!str2.equals(str)) {
                r4.A1a.AcB("linked-group-call/downgrade-ongoing-call", (String) null, false);
                AnonymousClass1D0 r2 = r4.A2L;
                C37831po A02 = r2.A02(r7.A00);
                if (A02 != null) {
                    r7.A02 = true;
                    r7.A01 = null;
                    synchronized (A02) {
                        if (A02.A04 != null) {
                            A02.A0J = true;
                        }
                        A02.A04 = null;
                    }
                    A02.A08(r7);
                    r2.A08(A02);
                    Log.i(C13680ns.A0h("VoiceService/maybeClearCallLogWithSameGroupJid Cleaning up zombie call: ", str2));
                    ArrayList A0u = AnonymousClass000.A0u();
                    A0u.add(C30341cC.A0A(str2));
                    r4.A14.execute(new RunnableRunnableShape3S0200000_I0_1(r4, 42, A0u));
                }
            }
        }
    }
}
