package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.4SW  reason: invalid class name */
public abstract class AnonymousClass4SW {
    public Path A00(RectF rectF) {
        if (this instanceof C79373zn) {
            return C37741pe.A03(rectF);
        }
        Path path = new Path();
        float width = rectF.width() / ((float) 2);
        path.addCircle(rectF.left + width, rectF.top + width, width, Path.Direction.CW);
        return path;
    }
}
