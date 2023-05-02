package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.3I7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3I7 implements Runnable {
    public final /* synthetic */ C30671cl A00;
    public final /* synthetic */ AnonymousClass4WX A01;
    public final /* synthetic */ AnonymousClass1JL A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ AnonymousClass3I7(C30671cl r1, AnonymousClass4WX r2, AnonymousClass1JL r3, Integer num, String str, String str2, String str3, String str4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = str;
        this.A01 = r2;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = num;
    }

    public final void run() {
        AnonymousClass1JL r9 = this.A02;
        C30671cl r11 = this.A00;
        String str = this.A04;
        AnonymousClass4WX r8 = this.A01;
        String str2 = this.A05;
        String str3 = this.A06;
        String str4 = this.A07;
        Integer num = this.A03;
        Context context = r9.A03.A00;
        Intent A09 = C13680ns.A09();
        A09.setClassName(context.getPackageName(), "com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity");
        A09.putExtra("extra_bank_account", r11);
        A09.putExtra("extra_india_upi_pin_op", str);
        A09.putExtra("extra_fds_manager_id", r8.A01);
        String str5 = r9.A01;
        if (str5 == null) {
            throw C18450wi.A03("observerId");
        }
        A09.putExtra("extra_fcs_observer_id", str5);
        A09.putExtra("extra_seq_number", str2);
        A09.putExtra("extra_payee_name", str3);
        A09.putExtra("extra_receiver_vpa", str4);
        A09.putExtra("extra_payment_preset_amount", num);
        A09.setFlags(268435456);
        context.startActivity(A09);
    }
}
