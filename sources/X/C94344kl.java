package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4kl  reason: invalid class name and case insensitive filesystem */
public class C94344kl implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00 = false;
    public final /* synthetic */ AnonymousClass29S A01;

    public C94344kl(AnonymousClass29S r2) {
        this.A01 = r2;
    }

    public void onGlobalLayout() {
        AnonymousClass29S r2 = this.A01;
        boolean A002 = C23061Ai.A00(r2.A0R);
        if (A002 != this.A00) {
            this.A00 = A002;
            r2.A0R((Float) null, false);
        }
    }
}
