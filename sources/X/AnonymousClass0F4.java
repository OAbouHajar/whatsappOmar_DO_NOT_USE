package X;

import android.os.Bundle;

/* renamed from: X.0F4  reason: invalid class name */
public class AnonymousClass0F4 extends AnonymousClass027 implements C11920jY {
    public C001300o A00;
    public C07470bt A01;
    public AnonymousClass0SB A02;
    public final Bundle A03;
    public final AnonymousClass0SB A04;

    public AnonymousClass0F4(Bundle bundle, AnonymousClass0SB r3, AnonymousClass0SB r4) {
        this.A03 = bundle;
        this.A04 = r3;
        this.A02 = r4;
        if (r3.A01 == null) {
            r3.A01 = this;
            return;
        }
        throw AnonymousClass000.A0V("There is already a listener registered");
    }

    public void A02() {
        AnonymousClass0SB r1 = this.A04;
        r1.A06 = true;
        r1.A05 = false;
        r1.A02 = false;
        r1.A03();
    }

    public void A03() {
        AnonymousClass0SB r1 = this.A04;
        r1.A06 = false;
        r1.A02();
    }

    public void A08(AnonymousClass023 r2) {
        super.A08(r2);
        this.A00 = null;
        this.A01 = null;
    }

    public void A0B(Object obj) {
        super.A0B(obj);
        AnonymousClass0SB r1 = this.A02;
        if (r1 != null) {
            r1.A01();
            r1.A05 = true;
            r1.A06 = false;
            r1.A02 = false;
            r1.A03 = false;
            r1.A04 = false;
            this.A02 = null;
        }
    }

    public AnonymousClass0SB A0C(boolean z2) {
        AnonymousClass0SB r3 = this.A04;
        r3.A00();
        r3.A02 = true;
        C07470bt r2 = this.A01;
        if (r2 != null) {
            A08(r2);
            if (z2 && r2.A00) {
                r2.A01.ASy(r2.A02);
            }
        }
        C11920jY r0 = r3.A01;
        if (r0 == null) {
            throw AnonymousClass000.A0V("No listener register");
        } else if (r0 == this) {
            r3.A01 = null;
            if ((r2 == null || r2.A00) && !z2) {
                return r3;
            }
            r3.A01();
            r3.A05 = true;
            r3.A06 = false;
            r3.A02 = false;
            r3.A03 = false;
            r3.A04 = false;
            return this.A02;
        } else {
            throw AnonymousClass000.A0T("Attempting to unregister the wrong listener");
        }
    }

    public void A0D() {
        C001300o r1 = this.A00;
        C07470bt r0 = this.A01;
        if (r1 != null && r0 != null) {
            super.A08(r0);
            A0A(r1, r0);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        AnonymousClass000.A1G(this, sb);
        sb.append(" #");
        sb.append(0);
        sb.append(" : ");
        C04130Lh.A00(this.A04, sb);
        return AnonymousClass000.A0h("}}", sb);
    }
}
