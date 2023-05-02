package X;

import android.content.DialogInterface;

/* renamed from: X.5y6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5y6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C14530pL A00;
    public final /* synthetic */ AnonymousClass62L A01;
    public final /* synthetic */ C16840tj A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass5y6(C14530pL r1, AnonymousClass62L r2, C16840tj r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass62L r0 = this.A01;
        C16840tj r5 = this.A02;
        String str = this.A03;
        C14530pL r3 = this.A00;
        AnonymousClass629 r02 = r0.A02;
        r02.A0U.A01(r5, r02.A09, 17);
        r3.startActivity(C13680ns.A0A(str));
    }
}
