package X;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.309  reason: invalid class name */
public class AnonymousClass309 extends C49692Vb {
    public int A00 = 0;
    public View A01;
    public C16050sL A02;
    public boolean A03 = false;
    public final ViewGroup A04;
    public final C19980zJ A05;
    public final C16000sG A06;
    public final C16320sq A07;

    public AnonymousClass309(ViewGroup viewGroup, C19980zJ r3, C16000sG r4, AnonymousClass1yP r5, C16010sH r6, C16320sq r7) {
        super(r5, 5);
        this.A04 = viewGroup;
        this.A07 = r7;
        this.A05 = r3;
        this.A06 = r4;
        if (r6.A0J()) {
            this.A02 = (C16050sL) r6.A08(C16050sL.class);
            this.A03 = r6.A0e;
        }
    }

    public final void A05() {
        View view = this.A01;
        if (view != null) {
            TextView A0L = C13680ns.A0L(view, R.id.pending_requests_text);
            Context context = (Context) this.A01;
            int i2 = this.A00;
            Object[] A1Z = C13690nt.A1Z();
            A1Z[0] = AnonymousClass1ZW.A06(context, R.color.normal);
            AnonymousClass000.A1M(A1Z, this.A00, 1);
            A0L.setText(Html.fromHtml(context.getResources().getQuantityString(R.plurals.plurals00b6, i2, AnonymousClass1ZW.A0H(A1Z))));
            C13680ns.A17(C004601z.A0E(this.A01, R.id.pending_participants_dismiss), this, 16);
            C13680ns.A17(this.A01, this, 17);
        }
    }
}
