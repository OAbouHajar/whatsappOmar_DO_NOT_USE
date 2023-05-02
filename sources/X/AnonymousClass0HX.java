package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0HX  reason: invalid class name */
public class AnonymousClass0HX extends C08360dV {
    public final C08310dQ A00;

    public AnonymousClass0HX(AnonymousClass0Ak r5, C05320Qf r6) {
        super(r5, r6);
        C08310dQ r2 = new C08310dQ(r5, new C08500dk("__container", r6.A0K, false), this);
        this.A00 = r2;
        r2.Adk(Collections.emptyList(), Collections.emptyList());
    }

    public void A08(Canvas canvas, Matrix matrix, int i2) {
        this.A00.A8F(canvas, matrix, i2);
    }

    public void A0A(AnonymousClass0WM r2, AnonymousClass0WM r3, List list, int i2) {
        this.A00.AcW(r2, r3, list, i2);
    }

    public void AAB(Matrix matrix, RectF rectF, boolean z2) {
        super.AAB(matrix, rectF, z2);
        this.A00.AAB(this.A08, rectF, z2);
    }
}
