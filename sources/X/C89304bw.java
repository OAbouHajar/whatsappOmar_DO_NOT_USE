package X;

import java.util.List;

/* renamed from: X.4bw  reason: invalid class name and case insensitive filesystem */
public final class C89304bw {
    public final C70833ho A00;
    public final C70803hl A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89304bw() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            X.22l r3 = X.C440222l.A00
            r0 = r8
            r2 = r1
            r4 = r3
            r6 = r5
            r7 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89304bw.<init>():void");
    }

    public C89304bw(C70833ho r1, C70803hl r2, List list, List list2, boolean z2, boolean z3, boolean z4) {
        this.A06 = z2;
        this.A03 = list;
        this.A02 = list2;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = z3;
        this.A04 = z4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89304bw) {
                C89304bw r5 = (C89304bw) obj;
                if (this.A06 != r5.A06 || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01) || this.A05 != r5.A05 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z2 = this.A06;
        int i2 = 1;
        if (z2) {
            z2 = true;
        }
        int i3 = 0;
        int A0E = (AnonymousClass000.A0E(this.A02, AnonymousClass000.A0E(this.A03, (z2 ? 1 : 0) * true)) + AnonymousClass000.A0C(this.A00)) * 31;
        C70803hl r0 = this.A01;
        if (r0 != null) {
            i3 = r0.hashCode();
        }
        int i4 = (A0E + i3) * 31;
        boolean z3 = this.A05;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31;
        if (!this.A04) {
            i2 = 0;
        }
        return i5 + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ViewState(isSaving=");
        A0r.append(this.A06);
        A0r.append(", avatarPoses=");
        A0r.append(this.A03);
        A0r.append(", avatarBackgrounds=");
        A0r.append(this.A02);
        A0r.append(", selectedBackground=");
        A0r.append(this.A00);
        A0r.append(", selectedPose=");
        A0r.append(this.A01);
        A0r.append(", isLoading=");
        A0r.append(this.A05);
        A0r.append(", isError=");
        A0r.append(this.A04);
        return AnonymousClass000.A0j(A0r);
    }
}
