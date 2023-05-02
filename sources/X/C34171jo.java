package X;

/* renamed from: X.1jo  reason: invalid class name and case insensitive filesystem */
public final class C34171jo {
    public final int A00;
    public final int A01;
    public final AnonymousClass2Dp A02;
    public final C46322Dr A03;
    public final C46322Dr A04;
    public final AnonymousClass2Do A05;
    public final String A06;

    public C34171jo(AnonymousClass2Dp r1, C46322Dr r2, C46322Dr r3, AnonymousClass2Do r4, String str, int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = r1;
        this.A04 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A06 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C34171jo.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            C34171jo r4 = (C34171jo) obj;
            if (this.A00 != r4.A00 || this.A01 != r4.A01) {
                return false;
            }
            AnonymousClass2Dp r1 = this.A02;
            if (r1 != null && !r1.equals(r4.A02)) {
                return false;
            }
            C46322Dr r12 = this.A04;
            if (r12 != null && !r12.equals(r4.A04)) {
                return false;
            }
            C46322Dr r13 = this.A03;
            if (r13 != null && !r13.equals(r4.A03)) {
                return false;
            }
            AnonymousClass2Do r14 = this.A05;
            return (r14 == null || r14.equals(r4.A05)) && C18450wi.A0R(this.A06, r4.A06);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.obwhatsapp.privacy.usernotice.UserNoticeContent");
    }

    public int hashCode() {
        int i2 = ((this.A00 * 31) + this.A01) * 31;
        AnonymousClass2Dp r0 = this.A02;
        int i3 = 0;
        int hashCode = (i2 + (r0 == null ? 0 : r0.hashCode())) * 31;
        C46322Dr r02 = this.A04;
        int hashCode2 = (hashCode + (r02 == null ? 0 : r02.hashCode())) * 31;
        C46322Dr r03 = this.A03;
        int hashCode3 = (hashCode2 + (r03 == null ? 0 : r03.hashCode())) * 31;
        AnonymousClass2Do r04 = this.A05;
        if (r04 != null) {
            i3 = r04.hashCode();
        }
        return ((hashCode3 + i3) * 31) + this.A06.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserNoticeContent{policyVersion=");
        sb.append(this.A01);
        sb.append(", banner=");
        sb.append(this.A02);
        sb.append(", modal=");
        sb.append(this.A04);
        sb.append(", blockingModal=");
        sb.append(this.A03);
        sb.append(", badged=");
        sb.append(this.A05);
        sb.append('}');
        return sb.toString();
    }
}
