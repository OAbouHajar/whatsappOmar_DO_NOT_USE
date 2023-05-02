package X;

import android.os.Handler;

/* renamed from: X.2bQ  reason: invalid class name and case insensitive filesystem */
public class C51312bQ {
    public C51302bP A00;
    public String A01;
    public final C16080sP A02;
    public final C51322bR A03;
    public final C16060sN A04;
    public final C16320sq A05;

    public C51312bQ(C16080sP r1, C51322bR r2, C16060sN r3, C16320sq r4) {
        this.A05 = r4;
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
    }

    public void A00() {
        C51302bP r2 = this.A00;
        boolean z2 = true;
        if (r2 != null) {
            z2 = false;
            r2.A06(false);
            Handler handler = r2.A00;
            if (handler != null) {
                handler.removeCallbacks(r2.A01);
            }
            r2.A00 = null;
            r2.A01 = null;
            this.A00 = null;
        }
        C51302bP r22 = new C51302bP(this.A02, this, this.A04, z2);
        this.A00 = r22;
        this.A05.Ack(r22, new Void[0]);
    }
}
