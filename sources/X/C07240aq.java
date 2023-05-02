package X;

import java.util.List;

/* renamed from: X.0aq  reason: invalid class name and case insensitive filesystem */
public class C07240aq implements C12360kG {
    public int A00;
    public int A01 = 1;
    public int A02;
    public C12360kG A03 = null;
    public AnonymousClass0KE A04 = AnonymousClass0KE.UNKNOWN;
    public AnonymousClass0Dr A05 = null;
    public C07250ar A06;
    public List A07 = AnonymousClass000.A0u();
    public List A08 = AnonymousClass000.A0u();
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;

    public C07240aq(C07250ar r4) {
        this.A06 = r4;
    }

    public static void A00(C07240aq r0, Object obj) {
        r0.A07.add(obj);
    }

    public void A01() {
        this.A08.clear();
        this.A07.clear();
        this.A0B = false;
        this.A02 = 0;
        this.A0A = false;
        this.A09 = false;
    }

    public void A02(int i2) {
        if (!this.A0B) {
            this.A0B = true;
            this.A02 = i2;
            for (C12360kG r0 : this.A07) {
                r0.AhI(r0);
            }
        }
    }

    public void AhI(C12360kG r7) {
        List<C07240aq> list = this.A08;
        for (C07240aq r0 : list) {
            if (!r0.A0B) {
                return;
            }
        }
        this.A0A = true;
        C12360kG r02 = this.A03;
        if (r02 != null) {
            r02.AhI(this);
        }
        if (this.A09) {
            this.A06.AhI(this);
            return;
        }
        C07240aq r4 = null;
        int i2 = 0;
        for (C07240aq r1 : list) {
            if (!(r1 instanceof AnonymousClass0Dr)) {
                i2++;
                r4 = r1;
            }
        }
        if (r4 != null && i2 == 1 && r4.A0B) {
            AnonymousClass0Dr r2 = this.A05;
            if (r2 != null) {
                if (r2.A0B) {
                    this.A00 = this.A01 * r2.A02;
                } else {
                    return;
                }
            }
            A02(r4.A02 + this.A00);
        }
        C12360kG r03 = this.A03;
        if (r03 != null) {
            r03.AhI(this);
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A06.A03.A0f);
        A0o.append(":");
        A0o.append(this.A04);
        A0o.append("(");
        A0o.append(this.A0B ? Integer.valueOf(this.A02) : "unresolved");
        A0o.append(") <t=");
        A0o.append(this.A08.size());
        A0o.append(":d=");
        A0o.append(this.A07.size());
        return AnonymousClass000.A0h(">", A0o);
    }
}
