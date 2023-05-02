package X;

/* renamed from: X.07G  reason: invalid class name */
public abstract class AnonymousClass07G {
    public int A00 = -1;
    public boolean A01;
    public final AnonymousClass023 A02;
    public final /* synthetic */ AnonymousClass028 A03;

    public AnonymousClass07G(AnonymousClass028 r2, AnonymousClass023 r3) {
        this.A03 = r2;
        this.A02 = r3;
    }

    public void A00() {
    }

    public void A01(boolean z2) {
        if (z2 != this.A01) {
            this.A01 = z2;
            AnonymousClass028 r3 = this.A03;
            int i2 = -1;
            if (z2) {
                i2 = 1;
            }
            int i3 = r3.A00;
            r3.A00 = i2 + i3;
            if (!r3.A03) {
                r3.A03 = true;
                while (true) {
                    try {
                        int i4 = r3.A00;
                        if (i3 == i4) {
                            break;
                        }
                        if (i3 == 0) {
                            if (i4 > 0) {
                                r3.A02();
                            }
                        } else if (i3 > 0 && i4 == 0) {
                            r3.A03();
                        }
                        i3 = i4;
                    } finally {
                        r3.A03 = false;
                    }
                }
            }
            if (this.A01) {
                r3.A05(this);
            }
        }
    }

    public abstract boolean A02();

    public boolean A03(C001300o r2) {
        return false;
    }
}
