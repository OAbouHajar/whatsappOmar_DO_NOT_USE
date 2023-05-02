package X;

import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import java.util.ArrayList;

/* renamed from: X.2Tc  reason: invalid class name and case insensitive filesystem */
public class C49422Tc implements C19550yc {
    public final C16300so A00;
    public final C17240ul A01;
    public final C16050sL A02;
    public final AnonymousClass1WA A03;

    public C49422Tc(C16300so r3, C17240ul r4, C16050sL r5, C16320sq r6) {
        this.A02 = r5;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = new AnonymousClass1WA(r6, false);
    }

    public void APb(String str) {
    }

    public void AQe(C28371Vv r1, String str) {
    }

    public void AYG(C28371Vv r14, String str) {
        ArrayList arrayList = new ArrayList();
        C28371Vv A0J = r14.A0J("sub_groups");
        if (A0J != null) {
            for (C28371Vv r5 : A0J.A0O("group")) {
                try {
                    String A0N = r5.A0N("id", (String) null);
                    AnonymousClass00B.A06(A0N);
                    C16050sL A012 = C16030sJ.A01(A0N);
                    String A0N2 = r5.A0N("subject", (String) null);
                    long A013 = C29501aj.A01(r5.A0N("s_t", (String) null), 0) * 1000;
                    boolean z2 = false;
                    if (r5.A0J("default_sub_group") != null) {
                        z2 = true;
                    }
                    if (A0N2 == null) {
                        A0N2 = "";
                    }
                    int i2 = 2;
                    if (z2) {
                        i2 = 3;
                    }
                    arrayList.add(new C39461sW(A012, A0N2, i2, A013));
                } catch (AnonymousClass1W4 e2) {
                    AnonymousClass00B.A0E(e2);
                    this.A00.AcB("Connection/handleInvalidJidReceived", "invalid-jid-received", true);
                }
            }
            this.A03.execute(new RunnableRunnableShape9S0200000_I0_7(this, 47, arrayList));
        }
    }
}
