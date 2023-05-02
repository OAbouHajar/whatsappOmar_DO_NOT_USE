package X;

import android.content.DialogInterface;

/* renamed from: X.5yD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5yD implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C14530pL A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass5yD(C14530pL r1, boolean z2) {
        this.A01 = z2;
        this.A00 = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z2 = this.A01;
        C14530pL r0 = this.A00;
        if (z2) {
            r0.finish();
        }
    }
}
