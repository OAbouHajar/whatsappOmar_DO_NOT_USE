package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;

/* renamed from: X.1oN  reason: invalid class name and case insensitive filesystem */
public class C36951oN extends AnonymousClass1WJ {
    public final boolean A00;

    public C36951oN(AnonymousClass1WK r10, String str, long j2, boolean z2) {
        super(C28481Wg.A03, r10, str, "regular_low", 4, j2, false);
        this.A00 = z2;
    }

    public C48232Mj A01() {
        C28581Wr A0U = C36941oM.A02.A0U();
        boolean z2 = this.A00;
        A0U.A03();
        C36941oM r1 = (C36941oM) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = z2;
        C48232Mj A01 = super.A01();
        AnonymousClass00B.A06(A01);
        A01.A03();
        C28531Wl r2 = (C28531Wl) A01.A00;
        r2.A0V = (C36941oM) A0U.A02();
        r2.A00 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
        return A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UnarchiveChatsSettingMutation{rowId=");
        sb.append(this.A07);
        sb.append(", isUnarchiveChatsSettingEnabled=");
        sb.append(this.A00);
        sb.append(", timestamp=");
        sb.append(this.A04);
        sb.append(", areDependenciesMissing=");
        sb.append(A06());
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
