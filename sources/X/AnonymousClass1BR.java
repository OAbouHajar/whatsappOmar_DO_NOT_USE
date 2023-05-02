package X;

import com.facebook.redex.IDxRCallbackShape440S0100000_2_I0;
import com.whatsapp.util.IDxATaskShape25S0200000_1_I0;

/* renamed from: X.1BR  reason: invalid class name */
public class AnonymousClass1BR {
    public C108755Pf A00;
    public boolean A01;
    public boolean A02 = false;
    public final AnonymousClass1BP A03;

    public AnonymousClass1BR(AnonymousClass1BP r2) {
        this.A03 = r2;
    }

    public AnonymousClass2X4 A00(String str, boolean z2) {
        AnonymousClass2X4 r6 = new AnonymousClass2X4();
        if (this.A02) {
            AnonymousClass1BP r5 = this.A03;
            IDxRCallbackShape440S0100000_2_I0 iDxRCallbackShape440S0100000_2_I0 = new IDxRCallbackShape440S0100000_2_I0(r6, 0);
            AnonymousClass00B.A01();
            C78963yy r0 = r5.A00;
            if (r0 != null) {
                r0.A06(true);
            }
            C78963yy r2 = new C78963yy(r5, iDxRCallbackShape440S0100000_2_I0, r5.A08, z2);
            r5.A00 = r2;
            r5.A0A.Ack(r2, str);
        }
        return r6;
    }

    public synchronized void A01() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1BP r3 = this.A03;
            AnonymousClass4QG r1 = new AnonymousClass4QG(this);
            AnonymousClass00B.A01();
            r3.A0A.Ack(new IDxATaskShape25S0200000_1_I0(r3, 0, r1), new String[0]);
        }
    }
}
