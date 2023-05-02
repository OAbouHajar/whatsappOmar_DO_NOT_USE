package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.util.List;

/* renamed from: X.1or  reason: invalid class name and case insensitive filesystem */
public class C37251or extends AnonymousClass1WJ {
    public final List A00;

    public C37251or(AnonymousClass1WK r10, String str, List list, long j2) {
        super(C28481Wg.A03, r10, str, "regular", 7, j2, false);
        this.A00 = list;
    }

    public C48232Mj A01() {
        C48232Mj A01 = super.A01();
        AnonymousClass00B.A06(A01);
        C28581Wr A0U = C37241oq.A01.A0U();
        List list = this.A00;
        A0U.A03();
        C37241oq r2 = (C37241oq) A0U.A00;
        AnonymousClass1XE r1 = r2.A00;
        if (!((AnonymousClass1XF) r1).A00) {
            r1 = C28541Wm.A0G(r1);
            r2.A00 = r1;
        }
        C28591Ws.A01(list, r1);
        A01.A03();
        C28531Wl r22 = (C28531Wl) A01.A00;
        r22.A0K = (C37241oq) A0U.A02();
        r22.A00 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
        return A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PrimaryFeatureMutation{");
        sb.append("featureFlags=");
        sb.append(this.A00);
        sb.append(", rowId='");
        sb.append(this.A07);
        sb.append(", timestamp=");
        sb.append(this.A04);
        sb.append(", operation=");
        sb.append(this.A05);
        sb.append(", collectionName='");
        sb.append(this.A06);
        sb.append(", version=");
        sb.append(this.A03);
        sb.append(", keyId=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
