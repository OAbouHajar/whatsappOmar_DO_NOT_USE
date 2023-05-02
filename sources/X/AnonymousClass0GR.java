package X;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.0GR  reason: invalid class name */
public class AnonymousClass0GR extends AnonymousClass0GS {
    public static boolean A00 = true;
    public static boolean A01 = true;
    public static boolean A02 = true;

    public void A01(Matrix matrix, View view) {
        if (A00) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }

    public void A02(Matrix matrix, View view) {
        if (A01) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                A01 = false;
            }
        }
    }

    public void A03(Matrix matrix, View view) {
        if (A02) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                A02 = false;
            }
        }
    }
}
