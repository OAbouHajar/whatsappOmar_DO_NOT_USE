package X;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: X.2g6  reason: invalid class name and case insensitive filesystem */
public class C53682g6 extends Property {
    public final Matrix A00 = new Matrix();

    public C53682g6() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        Matrix matrix = this.A00;
        matrix.set(((ImageView) obj).getImageMatrix());
        return matrix;
    }

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
