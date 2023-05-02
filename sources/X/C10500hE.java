package X;

import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.View;
import android.widget.OverScroller;

/* renamed from: X.0hE  reason: invalid class name and case insensitive filesystem */
public class C10500hE implements Runnable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public long A04;
    public long A05;
    public Matrix A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public float[] A0C = new float[2];
    public final View A0D;
    public final OverScroller A0E;
    public final AnonymousClass09X A0F;

    public C10500hE(View view, AnonymousClass09X r4) {
        this.A0D = view;
        this.A0F = r4;
        OverScroller overScroller = new OverScroller(view.getContext());
        this.A0E = overScroller;
        overScroller.setFriction(0.035f);
    }

    public void run() {
        boolean z2;
        int i2;
        int i3;
        if (!this.A08) {
            if (!this.A0B) {
                if (this.A09) {
                    this.A0E.forceFinished(true);
                    this.A00 = 0.0f;
                }
                this.A09 = false;
                this.A0B = true;
            }
            OverScroller overScroller = this.A0E;
            if (overScroller.computeScrollOffset()) {
                float[] fArr = this.A0C;
                fArr[0] = (float) overScroller.getCurrX();
                fArr[1] = (float) overScroller.getCurrY();
                Matrix matrix = this.A06;
                if (matrix != null) {
                    matrix.mapPoints(fArr);
                }
                float f2 = fArr[0];
                float f3 = fArr[1];
                if (this.A0A) {
                    this.A0A = false;
                    this.A02 = f2;
                    this.A03 = f3;
                }
                AnonymousClass09X r11 = this.A0F;
                float f4 = f2 - this.A02;
                float f5 = f3 - this.A03;
                AnonymousClass09W r112 = (AnonymousClass09W) r11;
                double d2 = r112.A02;
                long j2 = r112.A0J;
                float f6 = (float) j2;
                r112.A02 = AnonymousClass09W.A00(d2 - ((double) (f4 / f6)));
                r112.A03 = r112.A03(r112.A03 - ((double) (f5 / f6)), j2);
                this.A02 = f2;
                this.A03 = f3;
                z2 = true;
            } else {
                z2 = false;
            }
            double d3 = (double) this.A01;
            if (d3 < -0.01d || d3 > 0.01d) {
                long j3 = this.A05;
                int i4 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
                long uptimeMillis = SystemClock.uptimeMillis();
                if (i4 == 0) {
                    this.A05 = uptimeMillis;
                    i3 = 1;
                } else {
                    i3 = ((int) (uptimeMillis - j3)) / 10;
                    this.A05 = j3 + ((long) (i3 * 10));
                }
                float pow = (float) (d3 * Math.pow(0.9150000214576721d, (double) i3));
                this.A01 = pow;
                AnonymousClass09W r2 = (AnonymousClass09W) this.A0F;
                if (r2.A0I(pow + 1.0f, r2.A08, r2.A09)) {
                    z2 = true;
                } else {
                    this.A01 = 0.0f;
                }
            }
            double d4 = (double) this.A00;
            if (d4 < -0.01d || d4 > 0.01d) {
                long j4 = this.A04;
                int i5 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
                long uptimeMillis2 = SystemClock.uptimeMillis();
                if (i5 == 0) {
                    this.A04 = uptimeMillis2;
                    i2 = 1;
                } else {
                    i2 = ((int) (uptimeMillis2 - j4)) / 10;
                    this.A04 = j4 + ((long) (i2 * 10));
                }
                float pow2 = (float) (d4 * Math.pow(0.8500000238418579d, (double) i2));
                this.A00 = pow2;
                AnonymousClass09W r3 = (AnonymousClass09W) this.A0F;
                r3.A0B(r3.A0A + pow2, r3.A08, r3.A09);
            } else if (!z2) {
                this.A0B = false;
                this.A07 = false;
            }
            View view = this.A0D;
            view.invalidate();
            view.postOnAnimation(this);
            return;
        }
        AnonymousClass09W r1 = (AnonymousClass09W) this.A0F;
        r1.A0M.A04();
        r1.A06();
    }
}
