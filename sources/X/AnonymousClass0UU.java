package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0UU  reason: invalid class name */
public class AnonymousClass0UU {
    public PointF A00;
    public boolean A01;
    public final List A02;

    public AnonymousClass0UU() {
        this.A02 = AnonymousClass000.A0u();
    }

    public AnonymousClass0UU(PointF pointF, List list, boolean z2) {
        this.A00 = pointF;
        this.A01 = z2;
        this.A02 = new ArrayList(list);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ShapeData{numCurves=");
        A0r.append(this.A02.size());
        A0r.append("closed=");
        A0r.append(this.A01);
        return AnonymousClass000.A0k(A0r);
    }
}
