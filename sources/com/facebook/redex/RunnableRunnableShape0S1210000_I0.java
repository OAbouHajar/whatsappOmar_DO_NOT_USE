package com.facebook.redex;

import X.AnonymousClass01Y;
import X.AnonymousClass1KR;
import X.AnonymousClass273;
import X.C17170ue;
import X.C448725z;
import X.C75863sq;
import com.whatsapp.jid.Jid;
import java.util.HashMap;
import java.util.Set;

public class RunnableRunnableShape0S1210000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public RunnableRunnableShape0S1210000_I0(Object obj, Object obj2, String str, int i2, boolean z2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
        this.A03 = z2;
    }

    public final void run() {
        if (this.A04 != 0) {
            C448725z r4 = (C448725z) this.A00;
            boolean z2 = this.A03;
            Set set = (Set) this.A01;
            String str = this.A02;
            AnonymousClass01Y r1 = r4.A05;
            if (z2) {
                r1.A0N((AnonymousClass273) null);
            } else {
                synchronized (r1) {
                    r1.A0O(str, new HashMap(), set);
                }
            }
            r4.A0F.run();
            return;
        }
        AnonymousClass1KR r5 = (AnonymousClass1KR) this.A00;
        String str2 = this.A02;
        boolean z3 = this.A03;
        Jid nullable = Jid.getNullable(str2);
        C75863sq r3 = new C75863sq();
        C17170ue r2 = r5.A00;
        r3.A09 = Long.valueOf((long) r2.A09.getAndIncrement());
        r3.A06 = 18;
        r3.A08 = (Long) this.A01;
        r3.A0B = r2.A00;
        r3.A01 = Boolean.valueOf(z3);
        r3.A0A = r5.A04.A00(nullable);
        r5.A03.A06(r3);
    }
}
