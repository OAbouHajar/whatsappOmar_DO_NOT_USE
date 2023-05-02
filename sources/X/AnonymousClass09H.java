package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.09H  reason: invalid class name */
public class AnonymousClass09H implements View.OnClickListener {
    public final AnonymousClass09I A00;
    public final /* synthetic */ AnonymousClass09F A01;

    public AnonymousClass09H(AnonymousClass09F r4) {
        this.A01 = r4;
        this.A00 = new AnonymousClass09I(r4.A09.getContext(), r4.A0C);
    }

    public void onClick(View view) {
        AnonymousClass09F r0 = this.A01;
        Window.Callback callback = r0.A07;
        if (callback != null && r0.A0D) {
            callback.onMenuItemSelected(0, this.A00);
        }
    }
}
