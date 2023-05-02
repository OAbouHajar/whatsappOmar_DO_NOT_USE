package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Pair;

/* renamed from: X.4fk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91334fk implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C19980zJ A01;
    public final /* synthetic */ AnonymousClass5OZ A02;
    public final /* synthetic */ C17220uj A03;

    public /* synthetic */ C91334fk(Context context, C19980zJ r2, AnonymousClass5OZ r3, C17220uj r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass5OZ r0 = this.A02;
        C17220uj r5 = this.A03;
        C19980zJ r4 = this.A01;
        Context context = this.A00;
        r0.AVz();
        Intent A0B = C13690nt.A0B(r5.A02((Pair) null, "android", "26000068", (String) null));
        A0B.addFlags(268435456);
        r4.A06(context, A0B);
    }
}
