package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4kh  reason: invalid class name and case insensitive filesystem */
public class C94304kh implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C49662Uu A00;

    public C94304kh(C49662Uu r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        C49662Uu r3 = this.A00;
        AnonymousClass3K3.A16(r3.A0H, this);
        if (!r3.A0Y) {
            int A03 = r3.A03(r3.getMeasuredWidth()) - r3.A02(r3.getMeasuredWidth());
            r3.A0H.setSelectionFromTop(0, A03);
            r3.setScrollPos(A03);
        }
    }
}
