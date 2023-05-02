package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.5yo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119645yo implements View.OnFocusChangeListener {
    public final /* synthetic */ MentionableEntry A00;
    public final /* synthetic */ PaymentView A01;

    public /* synthetic */ C119645yo(MentionableEntry mentionableEntry, PaymentView paymentView) {
        this.A01 = paymentView;
        this.A00 = mentionableEntry;
    }

    public final void onFocusChange(View view, boolean z2) {
        this.A00.setHint(z2 ? "" : this.A01.getContext().getString(R.string.str14f8));
    }
}
