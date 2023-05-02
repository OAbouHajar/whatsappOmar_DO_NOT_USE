package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.2J1  reason: invalid class name */
public class AnonymousClass2J1 implements AnonymousClass2J0 {
    public final C009304k A00;

    public AnonymousClass2J1(Context context) {
        this.A00 = new C009304k(context);
    }

    public void A5H(AnonymousClass024 r5, AnonymousClass2J2 r6) {
        WeakReference weakReference = new WeakReference(r6);
        try {
            this.A00.A04(new AnonymousClass2J3(this, weakReference), (AnonymousClass04m) null, r5);
        } catch (NullPointerException e2) {
            e2.getMessage();
            AnonymousClass2J2 r0 = (AnonymousClass2J2) weakReference.get();
            if (r0 != null) {
                r0.AMv();
            }
        }
    }

    public boolean A5t() {
        C009304k r1 = this.A00;
        return r1.A06() && r1.A05();
    }

    public boolean AHW() {
        return this.A00.A05();
    }

    public boolean AIt() {
        return this.A00.A06();
    }
}
