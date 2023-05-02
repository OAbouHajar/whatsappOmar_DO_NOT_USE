package androidx.activity;

import X.AnonymousClass05T;
import X.C001100m;
import X.C001300o;
import X.C011405n;
import X.C04050Ky;
import android.view.View;
import android.view.Window;

public class ComponentActivity$3 implements AnonymousClass05T {
    public final /* synthetic */ C001100m A00;

    public ComponentActivity$3(C001100m r1) {
        this.A00 = r1;
    }

    public void AXa(C011405n r2, C001300o r3) {
        Window window;
        View peekDecorView;
        if (r2 == C011405n.ON_STOP && (window = this.A00.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            C04050Ky.A00(peekDecorView);
        }
    }
}
