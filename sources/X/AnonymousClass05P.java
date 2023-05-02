package X;

import android.text.TextUtils;

/* renamed from: X.05P  reason: invalid class name */
public class AnonymousClass05P implements Runnable {
    public final /* synthetic */ C001100m A00;

    public AnonymousClass05P(C001100m r1) {
        this.A00 = r1;
    }

    public void run() {
        try {
            AnonymousClass05P.super.onBackPressed();
        } catch (IllegalStateException e2) {
            if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e2;
            }
        }
    }
}
