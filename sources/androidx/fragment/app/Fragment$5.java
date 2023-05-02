package androidx.fragment.app;

import X.AnonymousClass01A;
import X.AnonymousClass05T;
import X.C001300o;
import X.C011405n;
import android.view.View;

public class Fragment$5 implements AnonymousClass05T {
    public final /* synthetic */ AnonymousClass01A A00;

    public Fragment$5(AnonymousClass01A r1) {
        this.A00 = r1;
    }

    public void AXa(C011405n r2, C001300o r3) {
        View view;
        if (r2 == C011405n.ON_STOP && (view = this.A00.A0A) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
