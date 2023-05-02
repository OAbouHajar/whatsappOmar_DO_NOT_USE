package X;

import android.content.DialogInterface;

/* renamed from: X.4g5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91544g5 implements DialogInterface.OnShowListener {
    public final /* synthetic */ C005702l A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C91544g5(C005702l r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C005702l r0 = this.A00;
        r0.A00.A0G.setContentDescription(this.A01);
    }
}
