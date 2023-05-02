package X;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.0Ry  reason: invalid class name and case insensitive filesystem */
public abstract class C05540Ry {
    public int A00;
    public boolean A01;
    public final ComponentName A02;

    public C05540Ry(ComponentName componentName) {
        this.A02 = componentName;
    }

    public void A00() {
    }

    public void A01() {
    }

    public void A02() {
    }

    public void A03(int i2) {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = i2;
            return;
        }
        int i3 = this.A00;
        if (i3 != i2) {
            StringBuilder A0r = AnonymousClass000.A0r("Given job ID ");
            A0r.append(i2);
            A0r.append(" is different than previous ");
            throw AnonymousClass000.A0U(A0r, i3);
        }
    }

    public abstract void A04(Intent intent);
}
