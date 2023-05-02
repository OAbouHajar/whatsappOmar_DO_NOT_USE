package X;

import android.content.Context;
import android.view.ActionProvider;

/* renamed from: X.0Cx  reason: invalid class name and case insensitive filesystem */
public class C02560Cx extends AnonymousClass0EM implements ActionProvider.VisibilityListener {
    public C11860jS A00;
    public final /* synthetic */ C02550Cv A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C02560Cx(Context context, ActionProvider actionProvider, C02550Cv r3) {
        super(context, actionProvider, r3);
        this.A01 = r3;
    }

    public void onActionProviderVisibilityChanged(boolean z2) {
        C11860jS r0 = this.A00;
        if (r0 != null) {
            C016607w r1 = ((AnonymousClass0b3) r0).A00.A0E;
            r1.A0F = true;
            r1.A0F(true);
        }
    }
}
