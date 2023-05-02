package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.hardware.Camera;

/* renamed from: X.5up  reason: invalid class name and case insensitive filesystem */
public class C118525up {
    public int A00;
    public Camera A01;
    public AnonymousClass687 A02;
    public C115755qG A03;
    public boolean A04;
    public final AnonymousClass5vU A05;
    public final C119355wx A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public C118525up(AnonymousClass5vU r1, C119355wx r2) {
        this.A06 = r2;
        this.A05 = r1;
    }

    public final void A00(Point point, C114875ok r7, AnonymousClass687 r8) {
        if (r8 != null) {
            C115755qG r1 = this.A03;
            if (!(point == null || r1 == null)) {
                float[] fArr = {(float) point.x, (float) point.y};
                Matrix matrix = r1.A00;
                Matrix matrix2 = new Matrix();
                matrix.invert(matrix2);
                matrix2.mapPoints(fArr);
                point.set((int) fArr[0], (int) fArr[1]);
            }
            AnonymousClass5xT.A00(new C1216366g(point, r7, r8, this));
        }
    }
}
