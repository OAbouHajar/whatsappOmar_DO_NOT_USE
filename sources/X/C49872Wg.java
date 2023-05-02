package X;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.Arrays;

/* renamed from: X.2Wg  reason: invalid class name and case insensitive filesystem */
public class C49872Wg {
    public static final C49872Wg A03 = new C49872Wg((Point) null, (Rect) null, 0);
    public final int A00;
    public final Point A01;
    public final Rect A02;

    public C49872Wg(Point point, Rect rect, int i2) {
        this.A00 = i2;
        this.A02 = rect;
        this.A01 = point;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C49872Wg r5 = (C49872Wg) obj;
            if (this.A00 != r5.A00 || !C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A02, this.A01});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FlexState{separationType=");
        sb.append(this.A00);
        sb.append(", bounds=");
        sb.append(this.A02);
        sb.append(", parentDimensions=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}
