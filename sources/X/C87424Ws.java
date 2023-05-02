package X;

/* renamed from: X.4Ws  reason: invalid class name and case insensitive filesystem */
public class C87424Ws {
    public int A00 = -1;
    public String A01;
    public boolean A02;
    public final C14550pN A03;
    public final C15860rz A04;

    public C87424Ws(C14550pN r2, C15860rz r3) {
        this.A03 = r2;
        this.A04 = r3;
    }

    public void A00() {
        this.A02 = false;
        AnonymousClass2JN.A00 = C13680ns.A0B(this.A04).getString("registration_failure_reason", "");
        String str = this.A01;
        if (str != null) {
            this.A03.Afh(str);
        }
        int i2 = this.A00;
        if (i2 != -1) {
            AnonymousClass29T.A01(this.A03, i2);
        }
        this.A01 = null;
        this.A00 = -1;
    }

    public void A01(int i2) {
        if (!this.A02) {
            AnonymousClass29T.A01(this.A03, i2);
        } else {
            this.A00 = i2;
        }
    }

    public void A02(int i2) {
        if (!this.A02) {
            C14550pN r1 = this.A03;
            if (!r1.isFinishing()) {
                r1.Afg(i2);
                return;
            }
        }
        C14550pN r0 = this.A03;
        r0.getString(i2);
        this.A01 = r0.getString(i2);
    }

    public void A03(String str) {
        if (!this.A02) {
            C14550pN r1 = this.A03;
            if (!r1.isFinishing()) {
                r1.Afh(str);
                return;
            }
        }
        this.A01 = str;
    }
}
