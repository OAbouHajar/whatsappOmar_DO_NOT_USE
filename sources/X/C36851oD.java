package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.1oD  reason: invalid class name and case insensitive filesystem */
public class C36851oD extends AnonymousClass1WJ implements C36861oE {
    public final long A00;
    public final C15830rv A01;
    public final C28381Vw A02;
    public final boolean A03;

    public C36851oD(AnonymousClass1WK r12, C15830rv r13, C28381Vw r14, String str, long j2, long j3, boolean z2, boolean z3) {
        super(C28481Wg.A03, r12, str, "regular_high", 3, j2, z3);
        this.A02 = r14;
        this.A01 = r13;
        this.A03 = z2;
        this.A00 = j3;
    }

    public C48232Mj A01() {
        C48232Mj A012 = super.A01();
        AnonymousClass00B.A06(A012);
        C28581Wr A0U = C36841oC.A03.A0U();
        boolean z2 = this.A03;
        A0U.A03();
        C36841oC r1 = (C36841oC) A0U.A00;
        r1.A00 |= 1;
        r1.A02 = z2;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.A00);
        A0U.A03();
        C36841oC r12 = (C36841oC) A0U.A00;
        r12.A00 |= 2;
        r12.A01 = seconds;
        A012.A03();
        C28531Wl r13 = (C28531Wl) A012.A00;
        r13.A0A = (C36841oC) A0U.A02();
        r13.A00 |= 8192;
        return A012;
    }

    public /* synthetic */ C15830rv AAV() {
        C15830rv r0 = this.A02.A00;
        AnonymousClass00B.A06(r0);
        return r0;
    }

    public C28381Vw ADY() {
        return this.A02;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteMessageForMeMutation{rowId=");
        sb.append(this.A07);
        sb.append(", key=");
        sb.append(this.A02);
        sb.append(", participant=");
        sb.append(this.A01);
        sb.append(", deleteMedia=");
        sb.append(this.A03);
        sb.append(", timestamp=");
        sb.append(this.A04);
        sb.append(", messageTimestamp=");
        sb.append(this.A00);
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
