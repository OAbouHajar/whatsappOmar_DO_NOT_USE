package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior;

/* renamed from: X.4l4  reason: invalid class name and case insensitive filesystem */
public class C94534l4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass2WM A02;
    public final /* synthetic */ ExpandableBehavior A03;

    public C94534l4(View view, AnonymousClass2WM r2, ExpandableBehavior expandableBehavior, int i2) {
        this.A03 = expandableBehavior;
        this.A01 = view;
        this.A00 = i2;
        this.A02 = r2;
    }

    public boolean onPreDraw() {
        View view = this.A01;
        AnonymousClass3K2.A10(view, this);
        ExpandableBehavior expandableBehavior = this.A03;
        if (expandableBehavior.A00 == this.A00) {
            AnonymousClass2WM r0 = this.A02;
            expandableBehavior.A0I((View) r0, view, ((AnonymousClass2WK) r0).A0F.A01, false);
        }
        return false;
    }
}
