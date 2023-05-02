package X;

import com.obwhatsapp.R;

/* renamed from: X.664  reason: invalid class name */
public final /* synthetic */ class AnonymousClass664 implements Runnable {
    public final /* synthetic */ C30671cl A00;
    public final /* synthetic */ C110755em A01;

    public /* synthetic */ AnonymousClass664(C30671cl r1, C110755em r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C117725tS A002;
        C110755em r4 = this.A01;
        C30671cl r3 = this.A00;
        Class AF0 = r4.A05().AF0();
        if (AF0 == null || r3 == null) {
            A002 = C117725tS.A00(8);
            A002.A0C = r4.A0P.A00.getString(R.string.str17d1);
        } else {
            A002 = C117725tS.A00(7);
            A002.A0A = AF0;
            A002.A04 = r3;
        }
        C110755em.A01(r4, A002);
    }
}
