package X;

import com.obwhatsapp.R;

/* renamed from: X.503  reason: invalid class name */
public final /* synthetic */ class AnonymousClass503 implements AnonymousClass5Q3 {
    public final /* synthetic */ AnonymousClass1Vt A00;
    public final /* synthetic */ C228019i A01;
    public final /* synthetic */ Runnable A02;

    public /* synthetic */ AnonymousClass503(AnonymousClass1Vt r1, C228019i r2, Runnable runnable) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = runnable;
    }

    public final void AVy(AnonymousClass2HJ r14) {
        C228019i r4 = this.A01;
        AnonymousClass1Vt r0 = this.A00;
        Runnable runnable = this.A02;
        if (r14 == null) {
            C16320sq r1 = r4.A0D;
            String str = r0.A0K;
            int i2 = r0.A03;
            C16440t3 r02 = r4.A01;
            r1.Ack(new C79003z2(r4.A0B, runnable, str, i2, r02.A00(), r02.A00()), new Void[0]);
            return;
        }
        int i3 = 0;
        if (r14.A00 == 443) {
            i3 = R.string.str1168;
        }
        C14870pt r03 = r4.A00;
        if (i3 == 0) {
            i3 = R.string.str1438;
        }
        r03.A09(i3, 0);
        r03.A05();
    }
}
