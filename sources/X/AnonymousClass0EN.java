package X;

import android.view.View;

/* renamed from: X.0EN  reason: invalid class name */
public class AnonymousClass0EN extends C07360bC {
    public final /* synthetic */ AnonymousClass06G A00;

    public AnonymousClass0EN(AnonymousClass06G r1) {
        this.A00 = r1;
    }

    public void AMS(View view) {
        AnonymousClass06G r2 = this.A00;
        r2.A0L.setAlpha(1.0f);
        r2.A0N.A0A((C13190lc) null);
        r2.A0N = null;
    }

    public void AMT(View view) {
        AnonymousClass06G r2 = this.A00;
        r2.A0L.setVisibility(0);
        r2.A0L.sendAccessibilityEvent(32);
        if (r2.A0L.getParent() instanceof View) {
            C004601z.A0T((View) r2.A0L.getParent());
        }
    }
}
