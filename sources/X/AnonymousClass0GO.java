package X;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.0GO  reason: invalid class name */
public class AnonymousClass0GO extends AnonymousClass0GP {
    public float A00(View view) {
        return view.getTransitionAlpha();
    }

    public void A01(Matrix matrix, View view) {
        view.setAnimationMatrix(matrix);
    }

    public void A02(Matrix matrix, View view) {
        view.transformMatrixToGlobal(matrix);
    }

    public void A03(Matrix matrix, View view) {
        view.transformMatrixToLocal(matrix);
    }

    public void A06(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    public void A07(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    public void A08(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }
}
