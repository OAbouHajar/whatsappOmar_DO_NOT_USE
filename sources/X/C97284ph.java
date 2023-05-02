package X;

import java.io.IOException;

/* renamed from: X.4ph  reason: invalid class name and case insensitive filesystem */
public final class C97284ph implements C15070qH, C15120qM {
    public long A00 = -9223372036854775807L;
    public C15120qM A01;
    public C15070qH A02;
    public AnonymousClass2PW A03;
    public final long A04;
    public final C30271c3 A05;
    public final AnonymousClass5RB A06;

    public C97284ph(C30271c3 r3, AnonymousClass5RB r4, long j2) {
        this.A05 = r3;
        this.A06 = r4;
        this.A04 = j2;
    }

    public void A00(C30271c3 r9) {
        long j2 = this.A04;
        long j3 = this.A00;
        if (j3 != -9223372036854775807L) {
            j2 = j3;
        }
        C15070qH A7W = this.A03.A7W(r9, this.A06, j2);
        this.A02 = A7W;
        if (this.A01 != null) {
            A7W.Aal(this, j2);
        }
    }

    public boolean A6f(long j2) {
        C15070qH r0 = this.A02;
        return r0 != null && r0.A6f(j2);
    }

    public void A7z(long j2, boolean z2) {
        this.A02.A7z(j2, false);
    }

    public long A9p(C88884bF r3, long j2) {
        return this.A02.A9p(r3, j2);
    }

    public long AAG() {
        return this.A02.AAG();
    }

    public long ADw() {
        return this.A02.ADw();
    }

    public C93604jT AGe() {
        return this.A02.AGe();
    }

    public boolean AJ6() {
        C15070qH r0 = this.A02;
        return r0 != null && r0.AJ6();
    }

    public void ALV() {
        try {
            C15070qH r0 = this.A02;
            if (r0 != null) {
                r0.ALV();
                return;
            }
            AnonymousClass2PW r02 = this.A03;
            if (r02 != null) {
                r02.ALW();
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    public /* bridge */ /* synthetic */ void AP8(C15080qI r2) {
        this.A01.AP8(this);
    }

    public void AVC(C15070qH r2) {
        this.A01.AVC(this);
    }

    public void Aal(C15120qM r9, long j2) {
        this.A01 = r9;
        C15070qH r7 = this.A02;
        if (r7 != null) {
            long j3 = this.A04;
            long j4 = this.A00;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
            r7.Aal(this, j3);
        }
    }

    public long AbU() {
        return this.A02.AbU();
    }

    public long AdG(long j2) {
        return this.A02.AdG(j2);
    }

    public long AdK(C109525Sm[] r8, AnonymousClass5UR[] r9, boolean[] zArr, boolean[] zArr2, long j2) {
        long j3 = this.A00;
        if (j3 == -9223372036854775807L || j2 != this.A04) {
            j3 = j2;
        } else {
            this.A00 = -9223372036854775807L;
        }
        return this.A02.AdK(r8, r9, zArr, zArr2, j3);
    }
}
