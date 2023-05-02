package X;

import android.content.Context;
import android.support.v4.view.GravityCompat;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.0D1  reason: invalid class name */
public class AnonymousClass0D1 extends C05500Rr {
    public final /* synthetic */ AnonymousClass0ZV A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0D1(Context context, View view, C016607w r12, AnonymousClass0ZV r13) {
        super(context, view, r12, R.attr.attr0024, 0, true);
        this.A00 = r13;
        this.A00 = GravityCompat.END;
        AnonymousClass0ZP r1 = r13.A0L;
        this.A04 = r1;
        AnonymousClass0ZU r0 = this.A03;
        if (r0 != null) {
            r0.Ade(r1);
        }
    }

    public void A02() {
        AnonymousClass0ZV r1 = this.A00;
        C016607w r0 = r1.A08;
        if (r0 != null) {
            r0.close();
        }
        r1.A0F = null;
        super.A02();
    }
}
