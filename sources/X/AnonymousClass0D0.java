package X;

import android.content.Context;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.0D0  reason: invalid class name */
public class AnonymousClass0D0 extends C05500Rr {
    public final /* synthetic */ AnonymousClass0ZV A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0D0(Context context, View view, AnonymousClass0Cw r12, AnonymousClass0ZV r13) {
        super(context, view, r12, R.attr.attr0024, 0, false);
        this.A00 = r13;
        if ((((C07290av) r12.getItem()).A02 & 32) != 32) {
            View view2 = r13.A0E;
            this.A01 = view2 == null ? (View) r13.A0A : view2;
        }
        AnonymousClass0ZP r1 = r13.A0L;
        this.A04 = r1;
        AnonymousClass0ZU r0 = this.A03;
        if (r0 != null) {
            r0.Ade(r1);
        }
    }

    public void A02() {
        this.A00.A0B = null;
        super.A02();
    }
}
