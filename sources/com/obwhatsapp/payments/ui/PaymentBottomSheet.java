package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass1Vo;
import X.AnonymousClass5yC;
import X.C001000l;
import X.C110105dW;
import X.C13680ns;
import X.C13690nt;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import com.facebook.redex.IDxTListenerShape33S0000000_3_I1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape47S0100000_3_I1;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class PaymentBottomSheet extends Hilt_PaymentBottomSheet {
    public DialogInterface.OnDismissListener A00;
    public AnonymousClass01A A01;
    public AnonymousClass5yC A02 = new AnonymousClass5yC();
    public AnonymousClass1Vo A03 = C110105dW.A0Q("PaymentBottomSheet", "payment");

    public static PaymentBottomSheet A01() {
        return new PaymentBottomSheet();
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Log.i("onCreateView()");
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0430);
    }

    public void A18(Bundle bundle, View view) {
        Log.i("onViewCreated()");
        if (this.A01 == null) {
            A1C();
            return;
        }
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(view.findViewById(R.id.bottom_sheet));
        A002.A0L(0);
        A002.A0M(3);
        A002.A0E = new IDxSCallbackShape47S0100000_3_I1(this, 0);
        C110105dW.A0r(view.findViewById(R.id.dismiss_space), this, 86);
        view.findViewById(R.id.fragment_container).setOnTouchListener(new IDxTListenerShape33S0000000_3_I1(0));
        AnonymousClass050 r1 = new AnonymousClass050(A0F());
        r1.A09(this.A01, R.id.fragment_container);
        r1.A0I((String) null);
        r1.A01();
    }

    public Dialog A1B(Bundle bundle) {
        Log.i("onCreateDialog()");
        RelativeLayout relativeLayout = new RelativeLayout(A0C());
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Dialog dialog = new Dialog(A02());
        dialog.requestWindowFeature(1);
        dialog.setContentView(relativeLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            C001000l A0C = A0C();
            if (A0C != null && Build.VERSION.SDK_INT >= 21) {
                window.addFlags(Integer.MIN_VALUE);
                window.clearFlags(67108864);
                int A002 = AnonymousClass00T.A00(A0C, R.color.color064b);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.getAttributes().windowAnimations = R.style.style00e0;
            window.addFlags(8192);
        }
        return dialog;
    }

    public void A1N() {
        AnonymousClass02C A0F = A0F();
        int A04 = A0F.A04();
        A0F.A0I();
        if (A04 <= 1) {
            A1C();
            this.A02.onDismiss((DialogInterface) null);
        }
    }

    public void A1O(AnonymousClass01A r4) {
        this.A03.A04(AnonymousClass000.A0h(r4.getClass().getName(), AnonymousClass000.A0r("navigate-to fragment=")));
        AnonymousClass050 r2 = new AnonymousClass050(A0F());
        r2.A02 = 17432576;
        r2.A03 = 17432577;
        r2.A05 = 17432576;
        r2.A06 = 17432577;
        r2.A07((AnonymousClass01A) C13690nt.A0Z(A0F().A0U.A02()));
        r2.A0A(r4, R.id.fragment_container);
        r2.A0I((String) null);
        r2.A01();
    }

    public void A1P(AnonymousClass01A r1) {
        this.A01 = r1;
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        AnonymousClass5yC r0 = this.A02;
        if (r0 != null) {
            r0.onDismiss(dialogInterface);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Log.i("onDismiss(dialog)");
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
