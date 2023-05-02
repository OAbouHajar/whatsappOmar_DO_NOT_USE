package androidx.activity;

import X.AnonymousClass05T;
import X.C001100m;
import X.C001300o;
import X.C011405n;

public class ComponentActivity$4 implements AnonymousClass05T {
    public final /* synthetic */ C001100m A00;

    public ComponentActivity$4(C001100m r1) {
        this.A00 = r1;
    }

    public void AXa(C011405n r4, C001300o r5) {
        if (r4 == C011405n.ON_DESTROY) {
            C001100m r2 = this.A00;
            r2.A05.A01 = null;
            if (!r2.isChangingConfigurations()) {
                r2.AGy().A00();
            }
        }
    }
}
