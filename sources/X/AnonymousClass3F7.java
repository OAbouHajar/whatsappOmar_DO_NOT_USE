package X;

import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;

/* renamed from: X.3F7  reason: invalid class name */
public class AnonymousClass3F7 implements C30321cA {
    public AnonymousClass26A A00;
    public C29121a4 A01;
    public boolean A02;
    public final AnonymousClass027 A03;
    public final C17210ui A04;
    public final AnonymousClass399 A05;
    public final C25511Kb A06;
    public final C25641Ko A07;
    public final C16260sj A08;
    public final C16320sq A09;

    public AnonymousClass3F7(C17210ui r11, AnonymousClass399 r12, C25511Kb r13, C25641Ko r14, C18170wG r15, C29131a5 r16, C29121a4 r17, C16260sj r18, C16320sq r19) {
        int i2;
        int i3;
        AnonymousClass027 A0O = C13690nt.A0O();
        this.A03 = A0O;
        C16320sq r9 = r19;
        this.A09 = r9;
        this.A04 = r11;
        C16260sj r8 = r18;
        this.A08 = r8;
        this.A05 = r12;
        this.A06 = r13;
        this.A07 = r14;
        this.A00 = new AnonymousClass26A(r13, r14, r15, r16, r8, r9);
        C25511Kb r4 = this.A06;
        if (!r4.A02.A00().getBoolean("show_request_permission_dialog", true) || r4.A02.A00().getBoolean("location_access_granted", false)) {
            r4.A01();
            i2 = 2;
        } else {
            this.A04.A01(0);
            if (this.A08.A05()) {
                i2 = 1;
            } else {
                i3 = 0;
                A0O.A0B(i3);
                this.A01 = r17;
            }
        }
        i3 = Integer.valueOf(i2);
        A0O.A0B(i3);
        this.A01 = r17;
    }

    public static Integer A00(AnonymousClass3F7 r0) {
        return Integer.valueOf(r0.A02());
    }

    public int A01() {
        switch (this.A00.A00) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public int A02() {
        AnonymousClass26B r0 = this.A00.A01;
        if (r0 == null) {
            return 2;
        }
        return r0.A00();
    }

    public void A03() {
        C17210ui r3;
        int i2;
        int i3 = this.A00.A00;
        if (!(i3 == 0 || i3 == 2)) {
            if (i3 == 4) {
                r3 = this.A04;
                i2 = 27;
                r3.A0B(A00(this), i2, A01());
            } else if (i3 != 7) {
                return;
            }
        }
        r3 = this.A04;
        i2 = 26;
        r3.A0B(A00(this), i2, A01());
    }

    public void A04() {
        C25511Kb r1 = this.A06;
        r1.A03(true);
        r1.A01();
        C13680ns.A1O(this.A03, 2);
        AnonymousClass26A r3 = this.A00;
        r3.A08.Acl(new RunnableRunnableShape4S0100000_I0_3(r3, 32));
    }

    public void A05() {
        AnonymousClass26A r2 = this.A00;
        r2.A00 = 3;
        r2.A02.removeCallbacks(r2.A09);
        r2.A09(r2.A0C());
    }

    public void A06() {
        AnonymousClass26A r3 = this.A00;
        r3.A08.Acl(new RunnableRunnableShape4S0100000_I0_3(r3, 32));
    }

    public void A07(AnonymousClass4KG r9) {
        if (this.A02) {
            this.A02 = false;
            AnonymousClass26A r2 = this.A00;
            if (r2.A00 == 1) {
                r2.A02.removeCallbacks(r2.A09);
            }
            this.A05.A01(r9.A01, this, r9.A02, "device", r9.A00);
            return;
        }
        C25641Ko r3 = this.A07;
        AnonymousClass26B A002 = r3.A00();
        if (A002 != null && "device".equals(A002.A08) && C61853Aq.A00(C15710ri.A01(A002), r9.A01) > 800.0f) {
            r3.A00 = null;
            this.A01.AT5();
        }
    }

    public void ASB(int i2) {
        AnonymousClass26A r2 = this.A00;
        if (r2.A00 == 1) {
            int i3 = 6;
            if (i2 == -1) {
                i3 = 5;
            }
            r2.A00 = i3;
            r2.A02.removeCallbacks(r2.A09);
            r2.A0B(r2.A0C());
        }
        if (i2 == 4) {
            this.A01.ASA(i2);
        }
    }

    public void ASC(AnonymousClass26B r5) {
        AnonymousClass26A r3 = this.A00;
        if (r3.A00 == 1) {
            r3.A02.removeCallbacks(r3.A09);
            r3.A08.Acl(new RunnableRunnableShape3S0200000_I0_1(r3, 35, r5));
        }
    }
}
