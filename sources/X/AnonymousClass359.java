package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.359  reason: invalid class name */
public class AnonymousClass359 extends AnonymousClass3GL {
    public final AnonymousClass1MF A00;
    public final AnonymousClass5QT A01;
    public final C26161Mo A02;

    public AnonymousClass359(Context context, LayoutInflater layoutInflater, C14710pd r3, AnonymousClass1MF r4, AnonymousClass5QT r5, C26161Mo r6, int i2) {
        super(context, layoutInflater, r3, i2);
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
    }

    public void A03(View view) {
        AnonymousClass027 r1 = this.A02.A03;
        if (r1.A01() != null && !C13690nt.A0k(r1).isEmpty()) {
            C004601z.A0E(view, R.id.empty).setVisibility(8);
            C13690nt.A13(view, R.id.empty_text, 8);
        }
    }
}
