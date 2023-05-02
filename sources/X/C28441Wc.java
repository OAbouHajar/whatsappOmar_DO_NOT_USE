package X;

import com.facebook.redex.RunnableRunnableShape0S1201000_I0;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.whatsapp.util.Log;

/* renamed from: X.1Wc  reason: invalid class name and case insensitive filesystem */
public class C28441Wc implements C19550yc {
    public AnonymousClass28L A00;
    public final C16040sK A01;
    public final C28451Wd A02;
    public final C23511Cg A03;
    public final AnonymousClass19E A04;
    public final C19360yJ A05;
    public final AnonymousClass11P A06;
    public final C17190ug A07;
    public final C16320sq A08;

    public C28441Wc(C16040sK r1, C28451Wd r2, C23511Cg r3, AnonymousClass19E r4, C19360yJ r5, AnonymousClass11P r6, C17190ug r7, C16320sq r8) {
        this.A01 = r1;
        this.A08 = r8;
        this.A07 = r7;
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = r3;
        this.A02 = r2;
    }

    public final synchronized AnonymousClass28L A00() {
        AnonymousClass28L r1;
        r1 = this.A00;
        AnonymousClass00B.A06(r1);
        this.A00 = null;
        return r1;
    }

    public void APb(String str) {
        StringBuilder sb = new StringBuilder("sync-request-handler/onDeliveryFailure iqId:");
        sb.append(str);
        Log.e(sb.toString());
        this.A08.Acl(new RunnableRunnableShape6S0100000_I0_5(this, 15));
    }

    public void AQe(C28371Vv r10, String str) {
        StringBuilder sb = new StringBuilder("sync-request-handler/onError iqId:");
        sb.append(str);
        Log.e(sb.toString());
        C28371Vv A0J = r10.A0J("error");
        if (A0J != null) {
            int A0A = A0J.A0A("code", -1);
            if (A0A != -1) {
                String A0N = A0J.A0N("text", (String) null);
                Long l2 = null;
                try {
                    long A0D = A0J.A0D("backoff", -1);
                    if (A0D != -1) {
                        l2 = Long.valueOf(A0D * 1000);
                    }
                } catch (AnonymousClass1W9 e2) {
                    Log.e("SyncRequestHandler/getServerProvidedBackoffInMs the provided backoff is not an integral value.", e2);
                }
                this.A08.Acl(new RunnableRunnableShape0S1201000_I0(this, l2, A0N, A0A, 2));
                return;
            }
            StringBuilder sb2 = new StringBuilder("Expected attribute code in ");
            sb2.append(r10);
            throw new AnonymousClass1W9(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("Expected child error in ");
        sb3.append(r10);
        throw new AnonymousClass1W9(sb3.toString());
    }

    public void AYG(C28371Vv r5, String str) {
        StringBuilder sb = new StringBuilder("sync-request-handler/onSuccess iqId:");
        sb.append(str);
        Log.i(sb.toString());
        try {
            this.A08.Acl(new RunnableRunnableShape4S0200000_I0_2(this, 18, new C61943Ba(r5)));
        } catch (AnonymousClass1X9 | AnonymousClass259 e2) {
            A00();
            this.A08.Acl(new RunnableRunnableShape4S0200000_I0_2(this, 19, e2));
        }
    }
}
