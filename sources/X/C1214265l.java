package X;

import android.content.Intent;
import com.obwhatsapp.payments.ui.PaymentInvitePickerActivity;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.65l  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1214265l implements Runnable {
    public final /* synthetic */ PaymentInvitePickerActivity A00;
    public final /* synthetic */ ArrayList A01;

    public /* synthetic */ C1214265l(PaymentInvitePickerActivity paymentInvitePickerActivity, ArrayList arrayList) {
        this.A00 = paymentInvitePickerActivity;
        this.A01 = arrayList;
    }

    public final void run() {
        int i2;
        Intent putExtra;
        PaymentInvitePickerActivity paymentInvitePickerActivity = this.A00;
        ArrayList arrayList = this.A01;
        if (arrayList.size() == 1) {
            i2 = -1;
            putExtra = C13680ns.A09().putExtra("extra_invitee_jid", ((Jid) arrayList.get(0)).getRawString());
        } else {
            i2 = 501;
            putExtra = C13680ns.A09().putExtra("extra_inviter_count", arrayList.size());
        }
        paymentInvitePickerActivity.setResult(i2, putExtra);
        paymentInvitePickerActivity.finish();
    }
}
