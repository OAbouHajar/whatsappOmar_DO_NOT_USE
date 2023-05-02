package X;

import android.net.Uri;
import android.view.View;

/* renamed from: X.52O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass52O implements C54312hC {
    public final /* synthetic */ C35701mM A00;
    public final /* synthetic */ AnonymousClass3F1 A01;

    public /* synthetic */ AnonymousClass52O(C35701mM r1, AnonymousClass3F1 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void AOh(View view, C54302hB r6) {
        AnonymousClass3F1 r3 = this.A01;
        String str = this.A00.A0C;
        if (str != null) {
            r3.A02.Act(r3.A06.getContext(), Uri.parse(str));
        }
    }
}
