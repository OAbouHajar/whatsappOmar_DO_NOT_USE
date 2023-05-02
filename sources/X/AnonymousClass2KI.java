package X;

/* renamed from: X.2KI  reason: invalid class name */
public final class AnonymousClass2KI implements Comparable {
    public boolean A00 = true;
    public final int A01;
    public final C53892gT A02;
    public final C35281lf A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public AnonymousClass2KI(C53892gT r3, C35281lf r4, String str, String str2, String str3, String str4, String str5, int i2, boolean z2) {
        C18450wi.A0H(str, 1);
        C18450wi.A0H(str2, 2);
        C18450wi.A0H(str3, 3);
        C18450wi.A0H(str4, 4);
        C18450wi.A0H(str5, 5);
        this.A06 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A07 = str5;
        this.A01 = i2;
        this.A09 = z2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass2KI r3 = (AnonymousClass2KI) obj;
        C18450wi.A0H(r3, 0);
        return this.A01 - r3.A01;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2KI) {
                AnonymousClass2KI r5 = (AnonymousClass2KI) obj;
                if (!C18450wi.A0R(this.A06, r5.A06) || !C18450wi.A0R(this.A08, r5.A08) || !C18450wi.A0R(this.A05, r5.A05) || !C18450wi.A0R(this.A04, r5.A04) || !C18450wi.A0R(this.A07, r5.A07) || this.A01 != r5.A01 || this.A09 != r5.A09 || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.A06.hashCode() * 31) + this.A08.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A01) * 31;
        boolean z2 = this.A09;
        int i2 = 1;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode + (z2 ? 1 : 0)) * 31;
        C53892gT r0 = this.A02;
        int i4 = 0;
        int hashCode2 = (i3 + (r0 == null ? 0 : r0.hashCode())) * 31;
        C35281lf r02 = this.A03;
        if (r02 != null) {
            i4 = r02.hashCode();
        }
        int i5 = (hashCode2 + i4) * 31;
        if (!this.A00) {
            i2 = 0;
        }
        return i5 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlertInfo(id=");
        sb.append(this.A06);
        sb.append(", title=");
        sb.append(this.A08);
        sb.append(", description=");
        sb.append(this.A05);
        sb.append(", ctaText=");
        sb.append(this.A04);
        sb.append(", scope=");
        sb.append(this.A07);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", isCancelable=");
        sb.append(this.A09);
        sb.append(", phoenix=");
        sb.append(this.A02);
        sb.append(", legacyPaymentStepUpInfo=");
        sb.append(this.A03);
        sb.append(", shouldShowNotification=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
