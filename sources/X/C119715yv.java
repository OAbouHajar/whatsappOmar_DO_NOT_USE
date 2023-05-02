package X;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5yv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119715yv implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A01;

    public /* synthetic */ C119715yv(Intent intent, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A01 = paymentGroupParticipantPickerActivity;
        this.A00 = intent;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A01;
        Intent intent = this.A00;
        C116765ru r0 = ((C117395sv) view.getTag()).A04;
        if (r0 != null) {
            C16010sH r4 = r0.A00;
            UserJid A0I = C110115dX.A0I(r4);
            int A002 = paymentGroupParticipantPickerActivity.A0C.A00(A0I);
            if (!paymentGroupParticipantPickerActivity.A02.A0V(A0I) && A002 == 2) {
                AnonymousClass00B.A06(A0I);
                C87324Wh r42 = new C87324Wh(paymentGroupParticipantPickerActivity, paymentGroupParticipantPickerActivity, paymentGroupParticipantPickerActivity.A05, paymentGroupParticipantPickerActivity.A0D, paymentGroupParticipantPickerActivity.A0H, new AnonymousClass66Q(intent, A0I, paymentGroupParticipantPickerActivity), new AnonymousClass66R(r4, A0I, paymentGroupParticipantPickerActivity), false);
                if (r42.A02()) {
                    r42.A01(A0I, (AnonymousClass5S3) null, paymentGroupParticipantPickerActivity.A0J);
                } else {
                    paymentGroupParticipantPickerActivity.A35(intent, A0I);
                }
            }
        }
    }
}
