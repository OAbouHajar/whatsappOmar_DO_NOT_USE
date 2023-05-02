package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.5xy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119495xy implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C1200860g A01;

    public /* synthetic */ C119495xy(Context context, C1200860g r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C1200860g r0 = this.A01;
        Context context = this.A00;
        String str = r0.A06.A05() ? "https://faq.whatsapp.com/payments/26000350" : "https://faq.whatsapp.com/payments/26000351";
        AnonymousClass00B.A06(str);
        context.startActivity(C14750ph.A0k(context, str, (String) null, false, true));
    }
}
