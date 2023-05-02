package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0ax  reason: invalid class name and case insensitive filesystem */
public class C07310ax implements C12370kH {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C02740Eq A02;
    public final /* synthetic */ C02790Ey A03;

    public C07310ax(View view, ViewGroup viewGroup, C02740Eq r3, C02790Ey r4) {
        this.A03 = r4;
        this.A00 = view;
        this.A01 = viewGroup;
        this.A02 = r3;
    }

    public void AO4() {
        View view = this.A00;
        view.clearAnimation();
        this.A01.endViewTransition(view);
        this.A02.A00();
    }
}
