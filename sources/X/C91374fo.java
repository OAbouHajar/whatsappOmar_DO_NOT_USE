package X;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Pair;

/* renamed from: X.4fo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91374fo implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C19980zJ A01;
    public final /* synthetic */ C17220uj A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C91374fo(Context context, C19980zJ r2, C17220uj r3, String str, String str2) {
        this.A02 = r3;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.A01.A06(this.A00, C13690nt.A0B(this.A02.A02((Pair) null, "general", this.A03, this.A04)));
    }
}
