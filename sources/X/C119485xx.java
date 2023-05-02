package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.5xx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119485xx implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C119965zu A01;

    public /* synthetic */ C119485xx(Activity activity, C119965zu r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00.onBackPressed();
    }
}
