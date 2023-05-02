package androidx.activity;

import X.AnonymousClass05Q;
import X.AnonymousClass05T;
import X.AnonymousClass068;
import X.AnonymousClass07J;
import X.AnonymousClass0ZE;
import X.C001300o;
import X.C009704q;
import X.C011405n;

public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements AnonymousClass07J, AnonymousClass05T {
    public AnonymousClass07J A00;
    public final AnonymousClass068 A01;
    public final C009704q A02;
    public final /* synthetic */ AnonymousClass05Q A03;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(AnonymousClass068 r1, AnonymousClass05Q r2, C009704q r3) {
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r1;
        r3.A00(this);
    }

    public void AXa(C011405n r5, C001300o r6) {
        if (r5 == C011405n.ON_START) {
            AnonymousClass05Q r3 = this.A03;
            AnonymousClass068 r2 = this.A01;
            r3.A01.add(r2);
            AnonymousClass0ZE r1 = new AnonymousClass0ZE(r2, r3);
            r2.A00.add(r1);
            this.A00 = r1;
        } else if (r5 == C011405n.ON_STOP) {
            AnonymousClass07J r0 = this.A00;
            if (r0 != null) {
                r0.cancel();
            }
        } else if (r5 == C011405n.ON_DESTROY) {
            cancel();
        }
    }

    public void cancel() {
        this.A02.A01(this);
        this.A01.A00.remove(this);
        AnonymousClass07J r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
            this.A00 = null;
        }
    }
}
