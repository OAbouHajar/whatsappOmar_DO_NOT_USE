package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: X.0Ba  reason: invalid class name */
public class AnonymousClass0Ba extends Property {
    public float A00;
    public final float A01;
    public final PathMeasure A02;
    public final PointF A03 = new PointF();
    public final Property A04;
    public final float[] A05 = new float[2];

    public AnonymousClass0Ba(Path path, Property property) {
        super(Float.class, property.getName());
        this.A04 = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.A02 = pathMeasure;
        this.A01 = pathMeasure.getLength();
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(this.A00);
    }

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float A042 = AnonymousClass000.A04(obj2);
        this.A00 = A042;
        float[] fArr = this.A05;
        this.A02.getPosTan(this.A01 * A042, fArr, (float[]) null);
        PointF pointF = this.A03;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.A04.set(obj, pointF);
    }
}
