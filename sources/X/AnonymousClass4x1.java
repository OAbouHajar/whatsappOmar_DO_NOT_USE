package X;

import java.util.HashSet;

/* renamed from: X.4x1  reason: invalid class name */
public class AnonymousClass4x1 implements C30091bj {
    public int A00;
    public int A01;
    public Runnable A02;
    public boolean A03;
    public boolean A04;
    public final HashSet A05 = C13680ns.A0o();

    public Integer A7v() {
        return null;
    }

    public boolean isValid() {
        if (this.A03) {
            int i2 = this.A00;
            while (i2 <= this.A01) {
                if (this.A05.contains(Integer.valueOf(i2))) {
                    i2++;
                }
            }
            this.A04 = true;
            return true;
        }
        return false;
    }
}
