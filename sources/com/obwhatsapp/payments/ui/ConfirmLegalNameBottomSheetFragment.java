package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass3K4;
import X.AnonymousClass55K;
import X.C118795vG;
import X.C13680ns;
import X.C14710pd;
import X.C16320sq;
import X.C17110uY;
import X.C18450wi;
import X.C228719p;
import X.C23071Aj;
import X.C30531cW;
import X.C49382Ss;
import X.C57102q8;
import X.C89954dD;
import X.C90014dM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.redex.IDxCListenerShape32S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.text.IDxWAdapterShape103S0100000_2_I1;

public final class ConfirmLegalNameBottomSheetFragment extends Hilt_ConfirmLegalNameBottomSheetFragment {
    public static String A0C;
    public static String A0D;
    public static final C89954dD A0E = new C89954dD();
    public ProgressBar A00;
    public TextEmojiLabel A01;
    public WaButton A02;
    public WaEditText A03;
    public C23071Aj A04;
    public AnonymousClass01V A05;
    public C14710pd A06;
    public C118795vG A07;
    public C228719p A08;
    public C90014dM A09;
    public C17110uY A0A;
    public C16320sq A0B;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C18450wi.A0H(layoutInflater, 0);
        boolean z2 = false;
        View A0K = AnonymousClass3K4.A0K(layoutInflater, viewGroup, R.layout.layout011d);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18450wi.A00(A0K, R.id.confirm_legal_name_desc_view);
        C18450wi.A0H(textEmojiLabel, 0);
        this.A01 = textEmojiLabel;
        WaEditText waEditText = (WaEditText) C18450wi.A00(A0K, R.id.full_name_edit_view);
        C18450wi.A0H(waEditText, 0);
        this.A03 = waEditText;
        ProgressBar progressBar = (ProgressBar) C18450wi.A00(A0K, R.id.loading_progress);
        C18450wi.A0H(progressBar, 0);
        this.A00 = progressBar;
        TextEmojiLabel textEmojiLabel2 = this.A01;
        if (textEmojiLabel2 != null) {
            AnonymousClass01V r1 = this.A05;
            if (r1 != null) {
                textEmojiLabel2.setAccessibilityHelper(new C57102q8(textEmojiLabel2, r1));
                TextEmojiLabel textEmojiLabel3 = this.A01;
                if (textEmojiLabel3 != null) {
                    C30531cW.A02(textEmojiLabel3);
                    TextEmojiLabel textEmojiLabel4 = this.A01;
                    if (textEmojiLabel4 != null) {
                        C17110uY r9 = this.A0A;
                        if (r9 != null) {
                            String A0J = A0J(R.string.str1d47);
                            String[] strArr = {"p2m-lite-desc-link"};
                            String[] strArr2 = new String[1];
                            C23071Aj r10 = this.A04;
                            if (r10 != null) {
                                C14710pd r12 = this.A06;
                                if (r12 != null) {
                                    String A052 = r12.A05(2672);
                                    AnonymousClass00B.A06(A052);
                                    strArr2[0] = r10.A00(A052).toString();
                                    textEmojiLabel4.setText(r9.A05(A0J, new Runnable[]{new AnonymousClass55K(this)}, strArr, strArr2));
                                    WaButton waButton = (WaButton) C18450wi.A00(A0K, R.id.continue_btn);
                                    C18450wi.A0H(waButton, 0);
                                    this.A02 = waButton;
                                    AnonymousClass01A r3 = this.A0D;
                                    if (r3 != null) {
                                        WaEditText waEditText2 = this.A03;
                                        if (waEditText2 != null) {
                                            waEditText2.addTextChangedListener(new IDxWAdapterShape103S0100000_2_I1(this, 4));
                                            WaEditText waEditText3 = this.A03;
                                            if (waEditText3 != null) {
                                                if (C13680ns.A06(waEditText3.getText()) > 0) {
                                                    z2 = true;
                                                }
                                                A1C(z2);
                                                WaButton waButton2 = this.A02;
                                                if (waButton2 != null) {
                                                    waButton2.setOnClickListener(new IDxCListenerShape32S0200000_2_I1(r3, 2, this));
                                                    C18450wi.A00(A0K, R.id.close_btn).setOnClickListener(new IDxCListenerShape32S0200000_2_I1(r3, 3, this));
                                                    return A0K;
                                                }
                                                str = "continueButton";
                                            }
                                        }
                                        str = "nameEditText";
                                    } else {
                                        throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.payments.ui.PaymentBottomSheet");
                                    }
                                } else {
                                    str = "abProps";
                                }
                            } else {
                                str = "waLinkFactory";
                            }
                        } else {
                            str = "linkifier";
                        }
                    }
                }
            } else {
                str = "systemServices";
            }
            throw C18450wi.A03(str);
        }
        str = "descText";
        throw C18450wi.A03(str);
    }

    public final void A1A(C90014dM r1) {
        this.A09 = r1;
    }

    public final void A1B(Integer num, String str, String str2, int i2) {
        C228719p r0 = this.A08;
        if (r0 != null) {
            r0.A01(C49382Ss.A00(), num, str, str2, A0D, A0C, i2, true);
            return;
        }
        throw C18450wi.A03("p2mLiteEventLogger");
    }

    public final void A1C(boolean z2) {
        WaButton waButton = this.A02;
        if (waButton != null) {
            waButton.setEnabled(z2);
            return;
        }
        throw C18450wi.A03("continueButton");
    }
}
