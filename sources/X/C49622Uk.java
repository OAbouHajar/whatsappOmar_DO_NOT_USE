package X;

import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import java.util.Iterator;

/* renamed from: X.2Uk  reason: invalid class name and case insensitive filesystem */
public class C49622Uk {
    public C16050sL A00;
    public final AnonymousClass027 A01;
    public final C17230uk A02;
    public final AnonymousClass2VO A03;
    public final C15810rt A04;
    public final AnonymousClass11A A05;
    public final C17240ul A06;
    public final C17780vd A07;
    public final AnonymousClass2OJ A08 = new AnonymousClass2OJ(0);
    public final AnonymousClass2OJ A09;
    public final AnonymousClass2OJ A0A;
    public final C16320sq A0B;

    public C49622Uk(C17230uk r4, C15810rt r5, AnonymousClass11A r6, C17240ul r7, C17780vd r8, C16320sq r9) {
        Boolean bool = Boolean.FALSE;
        this.A09 = new AnonymousClass2OJ(bool);
        this.A0A = new AnonymousClass2OJ(bool);
        this.A01 = new AnonymousClass027();
        this.A0B = r9;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A02 = r4;
        this.A03 = new AnonymousClass2VO(new RunnableRunnableShape6S0100000_I0_5(this, 3), new RunnableRunnableShape6S0100000_I0_5(this, 2));
    }

    public void A00(C16050sL r8) {
        C17230uk r4 = this.A02;
        C16000sG r6 = r4.A04;
        C16010sH A082 = r6.A08(r8);
        Iterator it = r4.A03.A04.A01(r8).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C39461sW r3 = (C39461sW) it.next();
            if (r3.A00 == 3) {
                C16010sH A083 = r6.A08(r3.A02);
                if (A082 == null || !r4.A08.A0A(r8) || r4.A06.A02(r8) != 1 || !r4.A0A() || A083 == null || TextUtils.equals(A083.A09(), A082.A09())) {
                    this.A0A.A09(Boolean.FALSE);
                    return;
                }
            }
        }
        this.A0A.A09(Boolean.TRUE);
        this.A00 = r8;
        this.A08.A09(5);
    }
}
