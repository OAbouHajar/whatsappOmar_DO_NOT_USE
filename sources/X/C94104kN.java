package X;

import android.content.res.Resources;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

/* renamed from: X.4kN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94104kN implements View.OnFocusChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass33q A01;

    public /* synthetic */ C94104kN(View view, AnonymousClass33q r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void onFocusChange(View view, boolean z2) {
        AnonymousClass33q r1 = this.A01;
        View view2 = this.A00;
        WaTextView waTextView = r1.A01;
        Resources A0D = C13680ns.A0D(view2);
        int i2 = R.color.color06c5;
        if (z2) {
            i2 = R.color.start;
        }
        int color = A0D.getColor(i2);
    }
}
