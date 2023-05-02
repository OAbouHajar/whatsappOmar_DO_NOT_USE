package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass5xF;
import X.AnonymousClass698;
import X.C110105dW;
import X.C111445gC;
import X.C1205061x;
import X.C1222969a;
import X.C13680ns;
import X.C14870pt;
import X.C19980zJ;
import X.C45922Bq;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.redex.IDxECallbackShape272S0100000_3_I1;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.numberkeyboard.NumberEntryKeyboard;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BrazilAccountRecoveryPinActivity extends C111445gC {
    public TextView A00;
    public CodeInputField A01;
    public C1222969a A02;
    public AnonymousClass698 A03;
    public AnonymousClass5xF A04;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0022);
        C14870pt r7 = this.A05;
        C19980zJ r6 = this.A00;
        AnonymousClass01V r9 = this.A08;
        String A0d = C13680ns.A0d(this, "learn-more", new Object[1], 0, R.string.str007d);
        C45922Bq.A08(this, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r6, r7, (TextEmojiLabel) findViewById(R.id.subtitle), r9, A0d);
        this.A00 = C13680ns.A0N(this, R.id.pin_error_text);
        CodeInputField codeInputField = (CodeInputField) findViewById(R.id.code);
        this.A01 = codeInputField;
        codeInputField.A07(new IDxECallbackShape272S0100000_3_I1(this, 1), 6, getResources().getColor(R.color.color0227));
        ((NumberEntryKeyboard) findViewById(R.id.number_entry_keyboard)).A06 = this.A01;
        C110105dW.A0r(findViewById(R.id.account_recovery_skip), this, 12);
        this.A03 = new C1205061x(this, (PinBottomSheetDialogFragment) null, this.A04, true, false);
        C13680ns.A0z(this.A09.A0K(), "payments_account_recovery_screen_shown", true);
        C1222969a r3 = this.A02;
        AnonymousClass00B.A06(r3);
        r3.AKS(0, (Integer) null, "recover_payments_registration", "wa_registration");
    }
}
