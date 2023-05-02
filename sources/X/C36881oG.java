package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;

/* renamed from: X.1oG  reason: invalid class name and case insensitive filesystem */
public class C36881oG extends AnonymousClass1WJ {
    public C36881oG(AnonymousClass1WK r10, String str, long j2, boolean z2) {
        super(C28481Wg.A03, r10, str, "regular_low", 4, j2, z2);
    }

    public C48232Mj A01() {
        C48232Mj A01 = super.A01();
        AnonymousClass00B.A06(A01);
        C28581Wr A0U = C36871oF.A02.A0U();
        A0U.A03();
        C36871oF r2 = (C36871oF) A0U.A00;
        r2.A00 |= 1;
        r2.A01 = true;
        A01.A03();
        C28531Wl r22 = (C28531Wl) A01.A00;
        r22.A03 = (C36871oF) A0U.A02();
        r22.A00 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START;
        return A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidUnsupportedMutation{rowId=");
        sb.append(this.A07);
        sb.append(", timestamp=");
        sb.append(this.A04);
        sb.append(", operation=");
        sb.append(this.A05);
        sb.append(", collectionName=");
        sb.append(this.A06);
        sb.append(", keyId=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
