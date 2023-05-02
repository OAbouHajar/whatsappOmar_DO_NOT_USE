package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.3ND  reason: invalid class name */
public class AnonymousClass3ND extends ViewOutlineProvider {
    public final /* synthetic */ AnonymousClass4VD A00;
    public final /* synthetic */ AnonymousClass3MX A01;

    public AnonymousClass3ND(AnonymousClass4VD r1, AnonymousClass3MX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        AnonymousClass4VD r0 = this.A00;
        outline.setOval(0, 0, r0.A07, r0.A04);
    }
}
