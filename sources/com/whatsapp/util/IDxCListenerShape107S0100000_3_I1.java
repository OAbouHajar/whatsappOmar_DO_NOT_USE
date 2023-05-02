package com.whatsapp.util;

import X.AnonymousClass000;
import X.AnonymousClass29T;
import X.AnonymousClass64X;
import X.AnonymousClass64Y;
import X.C110105dW;
import X.C110115dX;
import X.C112755jA;
import X.C112775jP;
import X.C112785jQ;
import X.C114195nH;
import X.C119165we;
import X.C1205762e;
import X.C1211664l;
import X.C1214665p;
import X.C13680ns;
import X.C13690nt;
import X.C32241fu;
import X.C34331k5;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;
import com.obwhatsapp.payments.ui.widget.PaymentView;

public class IDxCListenerShape107S0100000_3_I1 extends C34331k5 {
    public Object A00;
    public final int A01;

    public IDxCListenerShape107S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A06(View view) {
        C32241fu r2;
        int i2;
        int i3;
        int i4;
        switch (this.A01) {
            case 0:
                ContextWrapper contextWrapper = (ContextWrapper) this.A00;
                r2 = new C32241fu(contextWrapper, R.style.style0174);
                r2.A02(R.string.str0745);
                C110115dX.A0m(contextWrapper.getBaseContext(), r2, R.string.str0746);
                C13690nt.A1E(r2);
                i2 = R.string.str1c4c;
                i3 = 8;
                break;
            case 1:
                C112775jP r4 = (C112775jP) this.A00;
                C114195nH r22 = r4.A0U;
                Log.i("DyiViewModel/download-report");
                r22.A08(3);
                r22.A02.A09(3);
                r22.A08.Acl(new C1211664l(r22));
                if ("personal".equals(r4.A0Y) && r4.A0b) {
                    ClipboardManager A0B = r4.A08.A0B();
                    if (A0B != null) {
                        try {
                            A0B.setPrimaryClip(ClipData.newPlainText("password", r4.A0a));
                        } catch (NullPointerException | SecurityException e2) {
                            Log.e("paymentsDyi/clipboard/", e2);
                        }
                    }
                    C32241fu r3 = new C32241fu(r4, R.style.style0174);
                    r3.A02(R.string.str0751);
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append(r4.getBaseContext().getString(R.string.str074f));
                    A0o.append(" ");
                    A0o.append(r4.A0a);
                    A0o.append("\n\n");
                    r3.A06(AnonymousClass000.A0h(r4.getString(R.string.str0750), A0o));
                    r3.setNegativeButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
                    C13690nt.A1G(r3);
                    return;
                }
                return;
            case 2:
                C112775jP r1 = (C112775jP) this.A00;
                r2 = new C32241fu(r1, R.style.style0174);
                Context baseContext = r1.getBaseContext();
                String str = r1.A0Y;
                if (str.equals("business")) {
                    i4 = R.string.str0742;
                } else if (!str.equals("personal")) {
                    Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PAY: DyiReportBaseActivity/getDyiExportDialogLabelTextRes - this payment account type is not supported. Payment account type = ")));
                    i4 = -1;
                } else {
                    i4 = R.string.str074b;
                }
                C110115dX.A0m(baseContext, r2, i4);
                C13690nt.A1E(r2);
                i2 = R.string.str074a;
                i3 = 9;
                break;
            case 3:
                C112775jP r23 = (C112775jP) this.A00;
                r23.A3C(C110105dW.A0f(r23.A01, r23.A05));
                return;
            case 4:
                C112785jQ r32 = (C112785jQ) this.A00;
                C119165we r24 = r32.A0N;
                if (r24.A0E.A05()) {
                    r24.A0A.Acl(new C1214665p(r32, r24));
                    return;
                } else {
                    AnonymousClass29T.A01(r32, 101);
                    return;
                }
            case 5:
                C112785jQ r33 = (C112785jQ) this.A00;
                Intent ABs = r33.A0N.A07.A05("FBPAY").ABs(r33, "personal", "FB");
                if (ABs == null) {
                    Log.e("PAY: BrazilPaymentAccountActionsContainerPresenter/onRequestPaymentInfoSelected - Invalid dyi report intent");
                    return;
                } else {
                    r33.startActivity(ABs);
                    return;
                }
            case 6:
                ((C112755jA) this.A00).A0E.Acl(new AnonymousClass64X(this));
                return;
            case 7:
                ((C112755jA) this.A00).A0E.Acl(new AnonymousClass64Y(this));
                return;
            case 8:
                PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = (PaymentCustomInstructionsBottomSheet) this.A00;
                paymentCustomInstructionsBottomSheet.A1N(C13680ns.A0a(), 1);
                paymentCustomInstructionsBottomSheet.A1C();
                return;
            case 9:
                C1205762e r25 = (C1205762e) this.A00;
                r25.A06.setVisibility(8);
                r25.A0B = null;
                r25.A0D = null;
                r25.A09.setVisibility(0);
                r25.A05.setVisibility(0);
                return;
            default:
                ((PaymentView) this.A00).A0z.A01(2);
                return;
        }
        C110105dW.A0w(r2, this, i3, i2);
        C13690nt.A1G(r2);
    }
}
