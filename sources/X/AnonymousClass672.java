package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.concurrent.Callable;

/* renamed from: X.672  reason: invalid class name */
public class AnonymousClass672 implements Callable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ AnonymousClass5zD A01;

    public AnonymousClass672(Rect rect, AnonymousClass5zD r2) {
        this.A01 = r2;
        this.A00 = rect;
    }

    public /* bridge */ /* synthetic */ Object call() {
        Rect rect = this.A00;
        float[] fArr = {(float) rect.centerX(), (float) rect.centerY()};
        AnonymousClass5zD r2 = this.A01;
        if (r2.A04 != null) {
            Matrix matrix = new Matrix();
            r2.A04.invert(matrix);
            matrix.mapPoints(fArr);
        }
        C119005vl r3 = r2.A0V;
        boolean z2 = r2.A0K;
        r3.A03(rect, r2.A06, r2.A0j, r2.A0A, fArr, z2);
        return null;
    }
}
