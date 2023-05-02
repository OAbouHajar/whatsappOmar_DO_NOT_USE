package X;

import android.content.DialogInterface;

/* renamed from: X.5y0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5y0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass5xF A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass5y0(AnonymousClass5xF r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass5xF r0 = this.A00;
        String str = this.A01;
        C110105dW.A1K(r0.A0F, C13680ns.A0a(), "prompt_warn_setup_without_recover", str);
    }
}
