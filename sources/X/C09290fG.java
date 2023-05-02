package X;

import android.view.View;

/* renamed from: X.0fG  reason: invalid class name and case insensitive filesystem */
public class C09290fG implements Runnable {
    public final /* synthetic */ AnonymousClass0ZW A00;

    public C09290fG(AnonymousClass0ZW r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0ZW r1 = this.A00;
        View view = r1.A07;
        if (view != null && view.getWindowToken() != null) {
            r1.AfT();
        }
    }
}
