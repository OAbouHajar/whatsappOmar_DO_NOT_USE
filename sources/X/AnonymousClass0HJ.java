package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.0HJ  reason: invalid class name */
public class AnonymousClass0HJ extends AnonymousClass0HC {
    public C03080Hd A00;
    public final PathMeasure A01 = new PathMeasure();
    public final PointF A02 = new PointF();
    public final float[] A03 = new float[2];

    public AnonymousClass0HJ(List list) {
        super(list);
    }

    public /* bridge */ /* synthetic */ Object A09(C06520Wl r8, float f2) {
        C03080Hd r6 = (C03080Hd) r8;
        Path path = r6.A00;
        if (path == null) {
            return r8.A0F;
        }
        AnonymousClass0UV r3 = this.A03;
        if (r3 != null) {
            r6.A08.floatValue();
            Object obj = r6.A0F;
            Object obj2 = r6.A09;
            A07();
            AnonymousClass0OB r0 = r3.A02;
            r0.A01 = obj;
            r0.A00 = obj2;
            Object obj3 = r3.A01;
            if (obj3 != null) {
                return obj3;
            }
        }
        if (this.A00 != r6) {
            this.A01.setPath(path, false);
            this.A00 = r6;
        }
        PathMeasure pathMeasure = this.A01;
        float[] fArr = this.A03;
        pathMeasure.getPosTan(f2 * pathMeasure.getLength(), fArr, (float[]) null);
        PointF pointF = this.A02;
        pointF.set(fArr[0], fArr[1]);
        return pointF;
    }
}
