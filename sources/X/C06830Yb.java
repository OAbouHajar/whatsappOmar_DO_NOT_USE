package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0Yb  reason: invalid class name and case insensitive filesystem */
public class C06830Yb implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AnonymousClass066 A00;
    public final /* synthetic */ AnonymousClass0WQ A01;

    public C06830Yb(AnonymousClass066 r1, AnonymousClass0WQ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onViewAttachedToWindow(View view) {
        AnonymousClass0WQ r1 = this.A01;
        AnonymousClass01A r0 = r1.A02;
        r1.A04();
        AnonymousClass0V5.A01((ViewGroup) r0.A0A.getParent()).A03();
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
