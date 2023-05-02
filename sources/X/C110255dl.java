package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment;

/* renamed from: X.5dl  reason: invalid class name and case insensitive filesystem */
public class C110255dl extends ClickableSpan {
    public final /* synthetic */ IndiaUpiEditTransactionDescriptionFragment A00;

    public C110255dl(IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment) {
        this.A00 = indiaUpiEditTransactionDescriptionFragment;
    }

    public void onClick(View view) {
        IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment = this.A00;
        indiaUpiEditTransactionDescriptionFragment.A07.AKU((AnonymousClass2St) null, C13680ns.A0Y(), 9, "payment_description", (String) null);
        indiaUpiEditTransactionDescriptionFragment.A0r(C13680ns.A0A("https://faq.whatsapp.com/general/payments/about-the-security-of-your-payment-descriptions"));
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.A00.A03().getColor(R.color.color04c9));
        textPaint.setUnderlineText(false);
    }
}
