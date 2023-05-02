package X;

import com.obwhatsapp.R;

/* renamed from: X.663  reason: invalid class name */
public final /* synthetic */ class AnonymousClass663 implements Runnable {
    public final /* synthetic */ C30671cl A00;
    public final /* synthetic */ C110755em A01;

    public /* synthetic */ AnonymousClass663(C30671cl r1, C110755em r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C110755em r5 = this.A01;
        C30671cl r4 = this.A00;
        C228919r A05 = r5.A05();
        Class AAW = A05.AAW();
        if (AAW == null || r4 == null) {
            C117725tS A002 = C117725tS.A00(8);
            A002.A0C = r5.A0P.A00.getString(R.string.str17d1);
            C110755em.A01(r5, A002);
            return;
        }
        C117725tS A003 = C117725tS.A00(16);
        A003.A09 = AAW;
        A003.A04 = r4;
        A003.A0H = A05.AIf();
        A003.A0B = A05.AAX();
        C110755em.A01(r5, A003);
    }
}
