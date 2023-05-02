package X;

import java.util.List;

/* renamed from: X.260  reason: invalid class name */
public final class AnonymousClass260 {
    public boolean A00 = false;
    public final int A01;
    public final AnonymousClass26B A02;
    public final AnonymousClass261 A03;
    public final Double A04;
    public final List A05;

    public AnonymousClass260(AnonymousClass26B r3, AnonymousClass261 r4, Double d2, List list, int i2) {
        C18450wi.A0H(r3, 2);
        this.A05 = list;
        this.A02 = r3;
        this.A01 = i2;
        this.A04 = d2;
        this.A03 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass260) {
                AnonymousClass260 r5 = (AnonymousClass260) obj;
                if (!C18450wi.A0R(this.A05, r5.A05) || !C18450wi.A0R(this.A02, r5.A02) || this.A01 != r5.A01 || !C18450wi.A0R(this.A04, r5.A04) || this.A00 != r5.A00 || !C18450wi.A0R(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((((this.A05.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A01) * 31;
        Double d2 = this.A04;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        boolean z2 = this.A00;
        if (z2) {
            z2 = true;
        }
        return ((hashCode2 + (z2 ? 1 : 0)) * 31) + this.A03.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessRankingRequest(businessProfiles=");
        sb.append(this.A05);
        sb.append(", searchLocation=");
        sb.append(this.A02);
        sb.append(", endpoint=");
        sb.append(this.A01);
        sb.append(", proximityWeight=");
        sb.append(this.A04);
        sb.append(", isCancelled=");
        sb.append(this.A00);
        sb.append(", rankingCallback=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }
}
