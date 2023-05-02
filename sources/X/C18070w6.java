package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.0w6  reason: invalid class name and case insensitive filesystem */
public class C18070w6 {
    public Handler A00;
    public Runnable A01;
    public final C16000sG A02;
    public final C16440t3 A03;
    public final C15810rt A04;
    public final C16070sO A05;
    public final C16490t9 A06;
    public final C18040w3 A07;
    public final C17240ul A08;
    public final C18060w5 A09;

    public C18070w6(C16000sG r1, C16440t3 r2, C15810rt r3, C16070sO r4, C16490t9 r5, C18040w3 r6, C17240ul r7, C18060w5 r8) {
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = r5;
        this.A02 = r1;
        this.A08 = r7;
        this.A07 = r6;
        this.A05 = r4;
        this.A09 = r8;
    }

    public void A00() {
        if (this.A01 != null) {
            Handler handler = this.A00;
            if (handler == null) {
                handler = new Handler(this.A09.A00());
                this.A00 = handler;
            }
            handler.removeCallbacks(this.A01);
        }
        this.A01 = new RunnableRunnableShape9S0100000_I0_8(this, 5);
        Handler handler2 = this.A00;
        if (handler2 == null) {
            handler2 = new Handler(this.A09.A00());
            this.A00 = handler2;
        }
        handler2.postDelayed(this.A01, 450);
    }

    public void A01(C15800rs r8, C15830rv r9, Integer num, int i2) {
        if (r9 != null) {
            AnonymousClass2JW r2 = new AnonymousClass2JW();
            r2.A00 = num;
            int i3 = 7;
            if (i2 == 1) {
                i3 = 4;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    i3 = 2;
                } else if (i2 == 4) {
                    i3 = 5;
                } else if (i2 != 6) {
                    i3 = 6;
                    if (i2 != 7) {
                        i3 = 1;
                    }
                } else {
                    i3 = 3;
                }
            }
            r2.A01 = Integer.valueOf(i3);
            r2.A03 = this.A07.A03(r9.getRawString());
            C15810rt r0 = r8.A00;
            r0.A0C();
            r2.A02 = Long.valueOf((long) r0.A01(r9));
            this.A06.A06(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r1 == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C16740tZ r5) {
        /*
            r4 = this;
            r0 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1Vw r0 = r5.A11
            X.0rv r3 = r0.A00
            X.2JJ r2 = new X.2JJ
            r2.<init>()
            r2.A04 = r1
            if (r3 == 0) goto L_0x0034
            boolean r0 = X.C16030sJ.A0L(r3)
            if (r0 == 0) goto L_0x0034
            X.0sO r1 = r4.A05
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            boolean r0 = r1.A09(r3)
            boolean r1 = r1.A0A(r3)
            if (r0 == 0) goto L_0x0029
            r0 = 1
            if (r1 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A01 = r0
        L_0x0034:
            X.0t9 r0 = r4.A06
            r0.A06(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18070w6.A02(X.0tZ):void");
    }

    public void A03(C16740tZ r8, int i2, boolean z2) {
        Boolean bool;
        AnonymousClass2JX r2 = new AnonymousClass2JX();
        boolean z3 = true;
        r2.A03 = z2 ? 1 : 2;
        C15830rv r4 = r8.A11.A00;
        if (r4 != null) {
            C15810rt r0 = this.A04;
            C16000sG r5 = this.A02;
            r2.A05 = Long.valueOf((long) C40491uD.A00(r5, r0, r4));
            if (C16030sJ.A0L(r4)) {
                C16070sO r3 = this.A05;
                GroupJid groupJid = (GroupJid) r4;
                boolean A092 = r3.A09(groupJid);
                boolean A0A = r3.A0A(groupJid);
                if (!A092 || !A0A) {
                    z3 = false;
                }
                r2.A02 = Boolean.valueOf(z3);
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            r2.A01 = bool;
            C16010sH A082 = r5.A08(r4);
            if (C16030sJ.A0N(r4) && A082 != null) {
                r2.A00 = Boolean.valueOf(this.A08.A0h(A082, (C16050sL) r4));
            }
        }
        r2.A04 = Integer.valueOf(C34321k4.A00(i2, z2));
        this.A06.A06(r2);
    }
}
