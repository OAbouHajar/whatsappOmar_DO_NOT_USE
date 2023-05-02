package X;

import android.net.Uri;

/* renamed from: X.4by  reason: invalid class name and case insensitive filesystem */
public final class C89324by {
    public static final C86924Ur A0E;
    public static final Object A0F = C13690nt.A0Y();
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public AnonymousClass4SO A06;
    public C86924Ur A07 = A0E;
    @Deprecated
    public Object A08;
    public Object A09 = A0F;
    public boolean A0A;
    @Deprecated
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;

    static {
        C86284Rz r1 = new C86284Rz();
        r1.A02 = "com.google.android.exoplayer2.Timeline";
        r1.A00 = Uri.EMPTY;
        A0E = r1.A00();
    }

    public void A00(AnonymousClass4SO r5, C86924Ur r6, Object obj, long j2, boolean z2, boolean z3) {
        C86804Uf r2;
        this.A09 = obj;
        this.A07 = r6 != null ? r6 : A0E;
        this.A08 = (r6 == null || (r2 = r6.A02) == null) ? null : r2.A01;
        this.A04 = -9223372036854775807L;
        this.A05 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A0D = z2;
        this.A0A = z3;
        this.A0B = AnonymousClass000.A1V(r5);
        this.A06 = r5;
        this.A02 = j2;
        this.A00 = 0;
        this.A01 = 0;
        this.A0C = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C89324by.class.equals(obj.getClass())) {
                return false;
            }
            C89324by r7 = (C89324by) obj;
            if (!(AnonymousClass3C1.A0F(this.A09, r7.A09) && AnonymousClass3C1.A0F(this.A07, r7.A07) && AnonymousClass3C1.A0F((Object) null, (Object) null) && AnonymousClass3C1.A0F(this.A06, r7.A06) && this.A04 == r7.A04 && this.A05 == r7.A05 && this.A03 == r7.A03 && this.A0D == r7.A0D && this.A0A == r7.A0A && this.A0C == r7.A0C && this.A02 == r7.A02 && this.A00 == r7.A00 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0E2 = AnonymousClass000.A0E(this.A07, (217 + this.A09.hashCode()) * 31) * 31;
        AnonymousClass4SO r0 = this.A06;
        if (r0 != null) {
            i2 = r0.hashCode();
        }
        int i3 = (int) (0 ^ (0 >>> 32));
        return ((((AnonymousClass3K3.A0E((((((((AnonymousClass3K3.A0E(AnonymousClass3K3.A0E(AnonymousClass3K3.A0E((A0E2 + i2) * 31, this.A04), this.A05), this.A03) + (this.A0D ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + i3) * 31, this.A02) + this.A00) * 31) + this.A01) * 31) + i3;
    }
}
