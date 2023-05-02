package X;

import android.view.View;

/* renamed from: X.56b  reason: invalid class name and case insensitive filesystem */
public class C1045956b implements Runnable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final View A09;
    public final C47792Kn A0A;

    public C1045956b(View view, C47792Kn r2) {
        this.A09 = view;
        this.A0A = r2;
    }

    public void A00(float f2, float f3, float f4, float f5, long j2) {
        if (!this.A06) {
            this.A00 = f4;
            this.A01 = f5;
            this.A03 = f3;
            this.A05 = System.currentTimeMillis();
            this.A02 = f2;
            this.A08 = AnonymousClass000.A1Q((f3 > f2 ? 1 : (f3 == f2 ? 0 : -1)));
            this.A04 = (f3 - f2) / ((float) j2);
            this.A06 = true;
            this.A07 = false;
            this.A09.post(this);
        }
    }

    public void run() {
        if (!this.A07) {
            float currentTimeMillis = this.A02 + (this.A04 * ((float) (System.currentTimeMillis() - this.A05)));
            C47792Kn r4 = this.A0A;
            r4.A01(currentTimeMillis, this.A00, this.A01);
            float f2 = this.A03;
            if (currentTimeMillis == f2 || this.A08 == AnonymousClass000.A1Q((currentTimeMillis > f2 ? 1 : (currentTimeMillis == f2 ? 0 : -1)))) {
                r4.A01(f2, this.A00, this.A01);
                this.A06 = false;
                this.A07 = true;
            }
            if (!this.A07) {
                this.A09.post(this);
            }
        }
    }
}
