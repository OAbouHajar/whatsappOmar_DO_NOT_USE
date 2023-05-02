package X;

import android.text.TextUtils;

/* renamed from: X.65W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65W implements Runnable {
    public final /* synthetic */ C112815jT A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass65W(C112815jT r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        C112815jT r3 = this.A00;
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            r3.A05 = C111345g2.A1b(r3);
            r3.A01.A01((C111805hR) r3.A00.A08, (AnonymousClass68R) null);
            C35521m4 r0 = r3.A00;
            r3.A3g((C111805hR) r0.A08, str, r0.A0B, r3.A05, (String) C110105dW.A0d(r0.A09), 1);
            return;
        }
        r3.A3e();
    }
}
