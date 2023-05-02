package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.5y5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5y5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C14530pL A00;
    public final /* synthetic */ AnonymousClass5xF A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass5y5(C14530pL r1, AnonymousClass5xF r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass5xF r1 = this.A01;
        C14530pL r4 = this.A00;
        String str = this.A02;
        r1.A01(r4);
        C110105dW.A1K(r1.A0F, 160, "prompt_warn_setup_without_recover", str);
        Intent A04 = C110105dW.A04(r4, BrazilPayBloksActivity.class);
        A04.putExtra("screen_name", "brpay_p_tos");
        r4.startActivity(A04);
    }
}
