package com.obwhatsapp.payments.pin.ui;

import X.AnonymousClass013;
import X.AnonymousClass5yC;
import X.AnonymousClass698;
import X.C001000l;
import X.C004601z;
import X.C110105dW;
import X.C110115dX;
import X.C110225di;
import X.C111235fY;
import X.C112695iv;
import X.C118605ux;
import X.C118915vc;
import X.C13680ns;
import X.C13690nt;
import X.C16440t3;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.IDxECallbackShape272S0100000_3_I1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import com.obwhatsapp.numberkeyboard.NumberEntryKeyboard;

public class PinBottomSheetDialogFragment extends Hilt_PinBottomSheetDialogFragment {
    public long A00;
    public CountDownTimer A01;
    public View A02;
    public View A03;
    public ProgressBar A04;
    public TextView A05;
    public CodeInputField A06;
    public Button A07;
    public C16440t3 A08;
    public AnonymousClass013 A09;
    public C118915vc A0A;
    public C118605ux A0B;
    public AnonymousClass698 A0C;
    public boolean A0D;
    public final AnonymousClass5yC A0E = new AnonymousClass5yC();

    public void A0w() {
        super.A0w();
        C001000l A0C2 = A0C();
        if (A0C2 != null) {
            A0C2.setRequestedOrientation(10);
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Window window;
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0496);
        Dialog dialog = this.A03;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setSoftInputMode(3);
        }
        View findViewById = A0H.findViewById(R.id.subtitle);
        this.A03 = findViewById;
        C118605ux r0 = this.A0B;
        boolean z2 = r0 != null && (r0 instanceof C112695iv);
        if (findViewById != null) {
            if (z2) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
        }
        this.A02 = A0H.findViewById(R.id.pin_text_container);
        this.A04 = (ProgressBar) A0H.findViewById(R.id.progress_bar);
        this.A05 = C13680ns.A0M(A0H, R.id.error_text);
        Button button = (Button) C004601z.A0E(A0H, R.id.forgot_pin_button);
        this.A07 = button;
        String A0J = A0J(R.string.str0f8e);
        if (this.A0B != null) {
            String string = A02().getString(R.string.str0f8e);
            if (!TextUtils.isEmpty(string)) {
                A0J = string;
            }
        }
        C110115dX.A0t(button, this, A0J, C13680ns.A1b(), R.string.str0f59);
        C110105dW.A0r(this.A07, this, 5);
        boolean z3 = this.A0D;
        this.A0D = z3;
        Button button2 = this.A07;
        if (button2 != null) {
            int i2 = 0;
            if (z3) {
                i2 = 8;
            }
            button2.setVisibility(i2);
        }
        CodeInputField codeInputField = (CodeInputField) A0H.findViewById(R.id.code);
        this.A06 = codeInputField;
        codeInputField.A07(new IDxECallbackShape272S0100000_3_I1(this, 0), 6, A03().getColor(R.color.color0227));
        ((NumberEntryKeyboard) A0H.findViewById(R.id.number_entry_keyboard)).A06 = this.A06;
        if (this.A0B != null) {
            layoutInflater.inflate(R.layout.layout042e, C13690nt.A0K(A0H, R.id.title_view), true);
            C13680ns.A0M(A0H, R.id.header_text).setText(A02().getString(this.A0B instanceof C112695iv ? R.string.str007b : R.string.str0f8b));
        }
        return A0H;
    }

    public void A14() {
        super.A14();
        long A002 = this.A0A.A00() * 1000;
        if (A002 > this.A08.A00() || this.A01 != null) {
            A1Q(A002, false);
        }
        C001000l A0C2 = A0C();
        if (A0C2 != null) {
            A0C2.setRequestedOrientation(1);
        }
    }

    public void A1M(View view) {
        super.A1M(view);
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(view);
        A002.A0E = new C111235fY(A002, this);
    }

    public void A1N() {
        A1H(true);
        this.A02.setVisibility(0);
        this.A04.setVisibility(8);
        this.A06.setEnabled(true);
    }

    public void A1O() {
        A1H(false);
        this.A02.setVisibility(4);
        this.A05.setVisibility(4);
        this.A04.setVisibility(0);
        this.A06.setEnabled(false);
    }

    public void A1P(int i2, int i3) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        this.A06.setErrorState(true);
        this.A06.A05();
        TextView textView = this.A05;
        Object[] objArr = new Object[1];
        boolean A1W = C13690nt.A1W(objArr, i2);
        textView.setText(this.A09.A0J(objArr, i3, (long) i2));
        TextView textView2 = this.A05;
        C13680ns.A0v(textView2.getContext(), textView2, R.color.color014f);
        this.A05.setVisibility(A1W ? 1 : 0);
    }

    public final void A1Q(long j2, boolean z2) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        this.A00 = j2;
        TextView textView = this.A05;
        C13680ns.A0v(textView.getContext(), textView, R.color.color06c5);
        this.A05.setVisibility(0);
        this.A06.setErrorState(true);
        this.A06.setEnabled(false);
        if (z2) {
            this.A06.A05();
        }
        this.A01 = new C110225di(this, j2 - this.A08.A00()).start();
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.A0E.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.A0E.onDismiss(dialogInterface);
    }
}
