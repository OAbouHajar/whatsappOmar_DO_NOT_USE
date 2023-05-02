package X;

import android.view.View;

/* renamed from: X.4RQ  reason: invalid class name */
public class AnonymousClass4RQ {
    public int A00;
    public int A01;
    public int A02;
    public final View A03;

    public AnonymousClass4RQ(View view) {
        this.A03 = view;
    }

    public final void A00() {
        View view = this.A03;
        C004601z.A0b(view, this.A02 - (view.getTop() - this.A01));
        C004601z.A0a(view, 0 - (view.getLeft() - this.A00));
    }
}
