package com.obwhatsapp.biz.catalog.view;

import X.AnonymousClass01V;
import X.AnonymousClass3MF;
import X.C004601z;
import X.C14870pt;
import X.C17090uW;
import X.C23061Ai;
import X.C447425j;
import X.C45922Bq;
import X.C57102q8;
import X.C59142uk;
import X.C93784jl;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.WaTextView;

public class PostcodeChangeBottomSheet extends Hilt_PostcodeChangeBottomSheet {
    public LinearLayout A00;
    public C14870pt A01;
    public C17090uW A02;
    public TextEmojiLabel A03;
    public WaEditText A04;
    public WaTextView A05;
    public AnonymousClass01V A06;
    public C23061Ai A07;
    public String A08 = "";
    public final C447425j A09;
    public final boolean A0A;

    public PostcodeChangeBottomSheet(C447425j r2, boolean z2) {
        this.A09 = r2;
        this.A0A = z2;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout020b, viewGroup, false);
    }

    public void A12() {
        this.A09.AV1();
        super.A12();
    }

    public void A18(Bundle bundle, View view) {
        Dialog dialog = this.A03;
        if (!(!this.A0A || dialog == null || dialog.getWindow() == null)) {
            dialog.getWindow().setSoftInputMode(21);
        }
        View view2 = view;
        this.A00 = (LinearLayout) C004601z.A0E(view2, R.id.dc_postcode_bottom_sheet);
        this.A04 = (WaEditText) C004601z.A0E(view2, R.id.change_postcode_edit_text);
        this.A03 = (TextEmojiLabel) C004601z.A0E(view2, R.id.change_postcode_privacy_message);
        this.A05 = (WaTextView) C004601z.A0E(view2, R.id.change_postcode_invalid_message);
        String A0J = A0J(R.string.str0434);
        Context A0u = A0u();
        String A0J2 = A0J(R.string.str1cf6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0J2);
        spannableStringBuilder.setSpan(new C59142uk(A0u, this.A02, this.A01, this.A06, "https://faq.whatsapp.com/general/security-and-privacy/about-sharing-your-information-with-businesses-on-whatsapp"), 0, A0J2.length(), 33);
        SpannableStringBuilder A022 = C45922Bq.A02(A0J, spannableStringBuilder);
        this.A03.A07 = new AnonymousClass3MF();
        TextEmojiLabel textEmojiLabel = this.A03;
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, this.A06));
        this.A03.setLinksClickable(true);
        this.A03.setFocusable(false);
        this.A03.setText(A022);
        this.A04.addTextChangedListener(new C93784jl(this));
        this.A04.setText(this.A08);
        this.A04.requestFocus();
        this.A04.selectAll();
        C004601z.A0E(view2, R.id.postcode_button_cancel).setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 40));
        C004601z.A0E(view2, R.id.postcode_button_enter).setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 41));
    }

    public void A1N() {
        WaEditText waEditText = this.A04;
        if (waEditText != null) {
            waEditText.clearFocus();
        }
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null && C23061Ai.A00(linearLayout)) {
            this.A07.A01(this.A00);
        }
        A1C();
    }

    public void A1O() {
        this.A03.setVisibility(8);
        this.A05.setVisibility(0);
        this.A04.getBackground().setColorFilter(A03().getColor(R.color.color0105), PorterDuff.Mode.SRC_ATOP);
    }
}
