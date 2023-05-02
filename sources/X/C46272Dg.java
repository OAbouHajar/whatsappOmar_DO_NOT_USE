package X;

import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.2Dg  reason: invalid class name and case insensitive filesystem */
public class C46272Dg implements AnonymousClass2Dh {
    public final /* synthetic */ AnonymousClass01Y A00;

    public C46272Dg(AnonymousClass01Y r1) {
        this.A00 = r1;
    }

    public void APY() {
    }

    public void AQR(int i2) {
        StringBuilder sb = new StringBuilder("error getting chat block status ");
        sb.append(i2);
        Log.e(sb.toString());
    }

    public void AY9(C28371Vv r6) {
        C14870pt r2;
        int i2;
        String str;
        Log.i("success getting chat block status");
        AnonymousClass01Y r4 = this.A00;
        C28371Vv A0J = r6.A0J("blocking");
        if (A0J == null) {
            str = "null blocking child returned for get chat psa block status";
        } else {
            String A0N = A0J.A0N("status", (String) null);
            if (A0N == null) {
                str = "null status child returned for get chat psa block status";
            } else {
                boolean equals = A0N.equals("blocked");
                UserJid A04 = r4.A04();
                HashSet hashSet = new HashSet();
                if (equals) {
                    if (A04 == null) {
                        C34801kt r22 = C34801kt.A00;
                        synchronized (r4) {
                            r4.A0Z.add(r22);
                        }
                        r4.A0B.A01(r22, true);
                        hashSet.add(r22);
                        r2 = r4.A07;
                        i2 = 24;
                    } else {
                        return;
                    }
                } else if (A04 != null) {
                    synchronized (r4) {
                        r4.A0Z.remove(A04);
                    }
                    r4.A0B.A01(A04, false);
                    hashSet.add(A04);
                    r2 = r4.A07;
                    i2 = 22;
                } else {
                    return;
                }
                r2.A0K(new RunnableRunnableShape3S0200000_I0_1(r4, i2, hashSet));
                return;
            }
        }
        Log.e(str);
    }
}
