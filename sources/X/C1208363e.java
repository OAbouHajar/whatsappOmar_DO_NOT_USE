package X;

import com.facebook.redex.IDxNConsumerShape155S0100000_3_I1;
import com.obwhatsapp.payments.IndiaUpiPaymentInvitePickerActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.63e  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1208363e implements Runnable {
    public final /* synthetic */ IndiaUpiPaymentInvitePickerActivity A00;

    public /* synthetic */ C1208363e(IndiaUpiPaymentInvitePickerActivity indiaUpiPaymentInvitePickerActivity) {
        this.A00 = indiaUpiPaymentInvitePickerActivity;
    }

    public final void run() {
        IndiaUpiPaymentInvitePickerActivity indiaUpiPaymentInvitePickerActivity = this.A00;
        ArrayList A0u = AnonymousClass000.A0u();
        indiaUpiPaymentInvitePickerActivity.A0J.A0U(A0u);
        C118805vH r7 = indiaUpiPaymentInvitePickerActivity.A06;
        C117215sd r11 = new C117215sd(new IDxNConsumerShape155S0100000_3_I1(indiaUpiPaymentInvitePickerActivity, 2), new IDxNConsumerShape155S0100000_3_I1(indiaUpiPaymentInvitePickerActivity, 1), new IDxNConsumerShape155S0100000_3_I1(indiaUpiPaymentInvitePickerActivity, 1), A0u);
        C17190ug r5 = r7.A03;
        String A02 = r5.A02();
        C118015tv r6 = new C118015tv(A02);
        ArrayList A0u2 = AnonymousClass000.A0u();
        Iterator it = A0u.iterator();
        while (it.hasNext()) {
            A0u2.add(new C116485rS(C110115dX.A0I((C16010sH) it.next())));
        }
        C116475rR r13 = new C116475rR(r6, A0u2);
        C110105dW.A1G(r5, new C112405iR(indiaUpiPaymentInvitePickerActivity, r7.A00, r11, r7.A06, r13), r13.A00, A02);
    }
}
