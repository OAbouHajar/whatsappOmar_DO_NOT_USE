package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.4kF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94034kF implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Dialog A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C16760tb A03;
    public final /* synthetic */ C16740tZ A04;
    public final /* synthetic */ C16320sq A05;

    public /* synthetic */ C94034kF(Activity activity, Dialog dialog, View view, C16760tb r4, C16740tZ r5, C16320sq r6) {
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = activity;
        this.A02 = view;
        this.A01 = dialog;
    }

    public final void onClick(View view) {
        C16320sq r6 = this.A05;
        C16760tb r5 = this.A03;
        C16740tZ r4 = this.A04;
        Activity activity = this.A00;
        View view2 = this.A02;
        Dialog dialog = this.A01;
        AnonymousClass3K4.A0u(r6, r5, r4, 19);
        C34321k4.A01(activity, view2, R.string.str0bfd);
        dialog.dismiss();
    }
}
