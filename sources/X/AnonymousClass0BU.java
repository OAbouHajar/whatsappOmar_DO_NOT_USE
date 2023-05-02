package X;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.0BU  reason: invalid class name */
public final class AnonymousClass0BU extends ClickableSpan {
    public final int A00;
    public final int A01;
    public final AnonymousClass031 A02;

    public AnonymousClass0BU(AnonymousClass031 r1, int i2, int i3) {
        this.A01 = i2;
        this.A02 = r1;
        this.A00 = i3;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A01);
        AnonymousClass031 r0 = this.A02;
        r0.A01.performAction(this.A00, bundle);
    }
}
