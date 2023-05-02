package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.5xv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119465xv implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C119885zm A01;

    public /* synthetic */ C119465xv(Activity activity, C119885zm r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00.onBackPressed();
    }
}
