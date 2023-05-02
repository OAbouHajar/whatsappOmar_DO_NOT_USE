package X;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0TT  reason: invalid class name */
public class AnonymousClass0TT {
    public static final ThreadLocal A00 = new ThreadLocal();
    public static final ThreadLocal A01 = new ThreadLocal();

    public static void A00(Matrix matrix, View view, ViewParent viewParent) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            A00(matrix, view2, viewParent);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
