package X;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.5y2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5y2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C15830rv A01;
    public final /* synthetic */ AnonymousClass629 A02;

    public /* synthetic */ AnonymousClass5y2(C15830rv r1, AnonymousClass629 r2, long j2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = j2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass629 r5 = this.A02;
        C15830rv r4 = this.A01;
        long j2 = this.A00;
        Intent A0x = new C14750ph().A0x(r5.A01, r4);
        A0x.putExtra("extra_quoted_message_row_id", j2);
        r5.A01.startActivity(A0x);
    }
}
