package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.whatsapp.util.Log;

/* renamed from: X.64B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass64B implements Runnable {
    public final /* synthetic */ IndiaUpiDeviceBindStepActivity A00;

    public /* synthetic */ AnonymousClass64B(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        this.A00 = indiaUpiDeviceBindStepActivity;
    }

    public final void run() {
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = this.A00;
        C119175wf r9 = indiaUpiDeviceBindStepActivity.A0F;
        String str = indiaUpiDeviceBindStepActivity.A0U;
        String str2 = indiaUpiDeviceBindStepActivity.A0W;
        String str3 = indiaUpiDeviceBindStepActivity.A0V;
        C119365wy r4 = indiaUpiDeviceBindStepActivity.A0B;
        C111775hO A02 = r4.A02(str);
        String A07 = (A02 == null || TextUtils.isEmpty(A02.A0D())) ? r4.A09.A07() : A02.A0D();
        StringBuilder A0r = AnonymousClass000.A0r("PAY: sendDeviceBindingIq called with psp: ");
        A0r.append(str);
        A0r.append(" verificationData: ");
        Log.i(AnonymousClass000.A0h(AnonymousClass5x3.A00(str2), A0r));
        AnonymousClass61W r10 = r9.A0G;
        C112715ix r11 = null;
        r10.A06((AnonymousClass2HJ) null, 20, 0);
        AnonymousClass4XO r8 = r9.A0E;
        r8.A04("upi-bind-device");
        C17190ug r2 = r9.A0A;
        String A022 = r2.A02();
        AnonymousClass5wC r15 = new AnonymousClass5wC(new C51812cK(A022), 3L, AnonymousClass3K2.A0Z(), r9.A0J.A01(), str2, str, str3, r9.A0C.A0Q() ? "1" : "0");
        boolean A0C = r9.A09.A0C(2227);
        String str4 = "in_upi_device_binding_tag";
        if (A0C) {
            r9.A0H.A04(185476608, str4);
        }
        C28371Vv r1 = r15.A00;
        Context context = r9.A07.A00;
        C14870pt r6 = r9.A06;
        C18340wX r7 = r9.A0D;
        if (A0C) {
            r11 = r9.A0H;
        } else {
            str4 = null;
        }
        r2.A0A(new C112455iW(context, r6, r7, r8, r9, r10, r11, str4, str, A07), r1, A022, 204, 0);
    }
}
