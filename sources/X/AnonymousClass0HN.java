package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.0HN  reason: invalid class name */
public class AnonymousClass0HN extends AnonymousClass0HC {
    public final PointF A00 = new PointF();

    public AnonymousClass0HN(List list) {
        super(list);
    }

    public /* bridge */ /* synthetic */ Object A09(C06520Wl r2, float f2) {
        return A0E(r2, f2, f2);
    }

    public /* bridge */ /* synthetic */ Object A0A(C06520Wl r2, float f2, float f3, float f4) {
        return A0E(r2, f3, f4);
    }

    public PointF A0E(C06520Wl r7, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = r7.A0F;
        if (obj2 == null || (obj = r7.A09) == null) {
            throw AnonymousClass000.A0V("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        AnonymousClass0UV r0 = this.A03;
        if (r0 != null && (pointF = (PointF) AnonymousClass0HC.A01(this, r7, r0, pointF2, pointF3)) != null) {
            return pointF;
        }
        PointF pointF4 = this.A00;
        pointF4.set(AnonymousClass000.A01(pointF3.x, pointF2.x, f2), AnonymousClass000.A01(pointF3.y, pointF2.y, f3));
        return pointF4;
    }
}
