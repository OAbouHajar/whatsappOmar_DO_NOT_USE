package X;

import java.util.Set;

/* renamed from: X.1og  reason: invalid class name and case insensitive filesystem */
public class C37141og extends AnonymousClass1WJ {
    public static final Set A02 = new AnonymousClass5CO();
    public final String A00;
    public final boolean A01;

    public C37141og(AnonymousClass1WK r10, String str, String str2, long j2, boolean z2) {
        super(C28481Wg.A03, r10, str, "regular_low", 7, j2, false);
        this.A00 = str2;
        this.A01 = z2;
    }

    public C48232Mj A01() {
        C28581Wr A0U = C37131of.A02.A0U();
        boolean z2 = this.A01;
        A0U.A03();
        C37131of r1 = (C37131of) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = z2;
        C48232Mj A012 = super.A01();
        AnonymousClass00B.A06(A012);
        A012.A03();
        C28531Wl r2 = (C28531Wl) A012.A00;
        r2.A0H = (C37131of) A0U.A02();
        r2.A00 |= 33554432;
        return A012;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NuxSyncMutation{");
        sb.append("nuxKey=");
        sb.append(this.A00);
        sb.append("acknowledged=");
        sb.append(this.A01);
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
