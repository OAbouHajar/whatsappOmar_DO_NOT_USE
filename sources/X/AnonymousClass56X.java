package X;

import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.obwhatsapp.R;
import java.util.Set;

/* renamed from: X.56X  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56X implements Runnable {
    public final /* synthetic */ AnonymousClass29B A00;
    public final /* synthetic */ C14870pt A01;
    public final /* synthetic */ C16760tb A02;
    public final /* synthetic */ AnonymousClass4E3 A03;
    public final /* synthetic */ AnonymousClass013 A04;
    public final /* synthetic */ C18030w2 A05;
    public final /* synthetic */ C16490t9 A06;
    public final /* synthetic */ C18040w3 A07;
    public final /* synthetic */ Set A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public /* synthetic */ AnonymousClass56X(AnonymousClass29B r1, C14870pt r2, C16760tb r3, AnonymousClass4E3 r4, AnonymousClass013 r5, C18030w2 r6, C16490t9 r7, C18040w3 r8, Set set, boolean z2, boolean z3) {
        this.A06 = r7;
        this.A05 = r6;
        this.A07 = r8;
        this.A08 = set;
        this.A09 = z2;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A0A = z3;
        this.A04 = r5;
        this.A00 = r1;
    }

    public final void run() {
        boolean z2;
        C16490t9 r7 = this.A06;
        C18030w2 r2 = this.A05;
        C18040w3 r1 = this.A07;
        Set set = this.A08;
        boolean z3 = this.A09;
        AnonymousClass4E3 r11 = this.A03;
        C14870pt r5 = this.A01;
        C16760tb r4 = this.A02;
        boolean z4 = this.A0A;
        AnonymousClass013 r10 = this.A04;
        AnonymousClass29B r6 = this.A00;
        AnonymousClass3BP.A02(r2, r7, r1, set, 0);
        if (!z3 || r11 == null) {
            z2 = false;
        } else {
            z2 = true;
            if (set.size() > 999) {
                r5.A0A(R.string.str1627, 1);
                return;
            }
        }
        r4.A0V(set, z4, z2);
        if (z2) {
            r5.A0K(new RunnableRunnableShape12S0200000_I1(r11, 28, set));
        } else {
            long size = (long) set.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, set.size(), 0);
            r5.A0I(r10.A0J(objArr, R.plurals.plurals00d2, size), 0);
        }
        C14870pt.A00(r5, r6, 5);
    }
}
