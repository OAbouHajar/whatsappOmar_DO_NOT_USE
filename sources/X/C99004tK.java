package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.4tK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C99004tK implements C49762Vq {
    public static final /* synthetic */ C99004tK A00 = new C99004tK();

    public final Object apply(Object obj) {
        Path path = new Path();
        path.addOval((RectF) obj, Path.Direction.CW);
        path.close();
        return path;
    }
}
