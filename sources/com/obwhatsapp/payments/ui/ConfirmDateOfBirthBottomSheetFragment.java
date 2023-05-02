package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass3K4;
import X.AnonymousClass55J;
import X.C110505eJ;
import X.C13690nt;
import X.C14710pd;
import X.C17110uY;
import X.C18450wi;
import X.C228719p;
import X.C23071Aj;
import X.C30531cW;
import X.C49382Ss;
import X.C57102q8;
import X.C85594Pb;
import X.C90004dL;
import X.C91194fW;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.redex.IDxCListenerShape133S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape32S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.text.IDxWAdapterShape103S0100000_2_I1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class ConfirmDateOfBirthBottomSheetFragment extends Hilt_ConfirmDateOfBirthBottomSheetFragment {
    public static final C85594Pb A0D = new C85594Pb();
    public ProgressBar A00;
    public TextEmojiLabel A01;
    public WaButton A02;
    public WaEditText A03;
    public C23071Aj A04;
    public AnonymousClass01V A05;
    public AnonymousClass013 A06;
    public C14710pd A07;
    public C228719p A08;
    public C90004dL A09;
    public C17110uY A0A;
    public Calendar A0B;
    public final DatePickerDialog.OnDateSetListener A0C = new C91194fW(this);

    public ConfirmDateOfBirthBottomSheetFragment() {
        Calendar instance = Calendar.getInstance();
        C18450wi.A0B(instance);
        this.A0B = instance;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C18450wi.A0H(layoutInflater, 0);
        View A0K = AnonymousClass3K4.A0K(layoutInflater, viewGroup, R.layout.layout011c);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18450wi.A00(A0K, R.id.confirm_dob_desc_view);
        C18450wi.A0H(textEmojiLabel, 0);
        this.A01 = textEmojiLabel;
        ProgressBar progressBar = (ProgressBar) C18450wi.A00(A0K, R.id.loading_progress);
        C18450wi.A0H(progressBar, 0);
        this.A00 = progressBar;
        WaEditText waEditText = (WaEditText) C18450wi.A00(A0K, R.id.dob_edit_view);
        C18450wi.A0H(waEditText, 0);
        this.A03 = waEditText;
        WaButton waButton = (WaButton) C18450wi.A00(A0K, R.id.continue_btn);
        C18450wi.A0H(waButton, 0);
        this.A02 = waButton;
        A1A().setInputType(0);
        A1A().setFocusable(false);
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
                            String A0J = A0J(R.string.str1d45);
                            String[] strArr = {"p2m-lite-desc-link"};
                            String[] strArr2 = new String[1];
                            C23071Aj r10 = this.A04;
                            if (r10 != null) {
                                C14710pd r12 = this.A07;
                                if (r12 != null) {
                                    String A052 = r12.A05(2701);
                                    AnonymousClass00B.A06(A052);
                                    strArr2[0] = r10.A00(A052).toString();
                                    textEmojiLabel4.setText(r9.A05(A0J, new Runnable[]{new AnonymousClass55J(this)}, strArr, strArr2));
                                    AnonymousClass01A r2 = this.A0D;
                                    Calendar calendar = this.A0B;
                                    calendar.set(1, calendar.get(1) - 18);
                                    C110505eJ r6 = new C110505eJ(this.A0C, A02(), calendar.get(1), calendar.get(2), calendar.get(5));
                                    r6.A04().setMaxDate(calendar.getTimeInMillis());
                                    A1A().setOnClickListener(new IDxCListenerShape133S0100000_2_I1(r6, 4));
                                    A1A().addTextChangedListener(new IDxWAdapterShape103S0100000_2_I1(this, 3));
                                    A1D(A1E(String.valueOf(A1A().getText())));
                                    WaButton waButton2 = this.A02;
                                    if (waButton2 != null) {
                                        waButton2.setOnClickListener(new IDxCListenerShape133S0100000_2_I1(this, 5));
                                        C18450wi.A00(A0K, R.id.close_btn).setOnClickListener(new IDxCListenerShape32S0200000_2_I1(r2, 1, this));
                                        return A0K;
                                    }
                                    str = "continueButton";
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

    public final WaEditText A1A() {
        WaEditText waEditText = this.A03;
        if (waEditText != null) {
            return waEditText;
        }
        throw C18450wi.A03("dobEditText");
    }

    public final void A1B(C90004dL r1) {
        this.A09 = r1;
    }

    public final void A1C(Integer num, String str, String str2, int i2) {
        C228719p r0 = this.A08;
        if (r0 != null) {
            r0.A01(C49382Ss.A00(), num, str, str2, ConfirmLegalNameBottomSheetFragment.A0D, ConfirmLegalNameBottomSheetFragment.A0C, i2, true);
            return;
        }
        throw C18450wi.A03("p2mLiteEventLogger");
    }

    public final void A1D(boolean z2) {
        WaButton waButton = this.A02;
        if (waButton != null) {
            waButton.setEnabled(z2);
            return;
        }
        throw C18450wi.A03("continueButton");
    }

    public final boolean A1E(String str) {
        int length = str.length();
        if (length != 0) {
            if (length <= 0) {
                return true;
            }
            AnonymousClass013 r0 = this.A06;
            if (r0 != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", C13690nt.A0m(r0));
                simpleDateFormat.setLenient(false);
                try {
                    simpleDateFormat.parse(str);
                    return true;
                } catch (ParseException unused) {
                }
            } else {
                throw C18450wi.A03("whatsAppLocale");
            }
        }
        return false;
    }
}
