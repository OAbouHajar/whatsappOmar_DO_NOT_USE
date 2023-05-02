package X;

import android.view.ViewGroup;

/* renamed from: X.0fX  reason: invalid class name and case insensitive filesystem */
public class C09450fX implements Runnable {
    public final /* synthetic */ AnonymousClass01A A00;

    public C09450fX(AnonymousClass01A r1) {
        this.A00 = r1;
    }

    public void run() {
        ViewGroup viewGroup;
        AnonymousClass01A r2 = this.A00;
        AnonymousClass0PD r1 = r2.A0C;
        if (r1 != null) {
            r1.A0E = false;
        }
        if (r2.A0A != null && (viewGroup = r2.A0B) != null && r2.A0H != null) {
            AnonymousClass0V5 A01 = AnonymousClass0V5.A01(viewGroup);
            A01.A04();
            A01.A02();
        }
    }
}
