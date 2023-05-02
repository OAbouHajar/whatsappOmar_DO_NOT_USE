package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.obwhatsapp.payments.ui.BrazilOrderDetailsActivity;

/* renamed from: X.5y1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5y1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C15830rv A01;
    public final /* synthetic */ BrazilOrderDetailsActivity A02;

    public /* synthetic */ AnonymousClass5y1(C15830rv r1, BrazilOrderDetailsActivity brazilOrderDetailsActivity, long j2) {
        this.A02 = brazilOrderDetailsActivity;
        this.A01 = r1;
        this.A00 = j2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A02;
        C15830rv r1 = this.A01;
        long j2 = this.A00;
        Intent A0x = new C14750ph().A0x(brazilOrderDetailsActivity, r1);
        A0x.putExtra("extra_quoted_message_row_id", j2);
        brazilOrderDetailsActivity.startActivity(A0x);
    }
}
