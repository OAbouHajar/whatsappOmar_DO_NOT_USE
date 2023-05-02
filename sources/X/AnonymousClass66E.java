package X;

import android.graphics.Point;

/* renamed from: X.66E  reason: invalid class name */
public class AnonymousClass66E implements Runnable {
    public final /* synthetic */ C114875ok A00;
    public final /* synthetic */ C119005vl A01;
    public final /* synthetic */ float[] A02;

    public AnonymousClass66E(C114875ok r1, C119005vl r2, float[] fArr) {
        this.A01 = r2;
        this.A02 = fArr;
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass687 r5 = this.A01.A02;
        if (r5 != null) {
            float[] fArr = this.A02;
            C114875ok r3 = this.A00;
            Point point = null;
            if (fArr != null) {
                point = new Point((int) fArr[0], (int) fArr[1]);
            }
            r5.ARS(point, r3);
        }
    }
}
