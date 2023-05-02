package X;

import android.content.DialogInterface;
import com.facebook.redex.RunnableRunnableShape0S2100000_I0;
import com.obwhatsapp.location.StopLiveLocationDialogFragment;

/* renamed from: X.4fg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91294fg implements DialogInterface.OnClickListener {
    public final /* synthetic */ StopLiveLocationDialogFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C91294fg(StopLiveLocationDialogFragment stopLiveLocationDialogFragment, String str, String str2) {
        this.A00 = stopLiveLocationDialogFragment;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        StopLiveLocationDialogFragment stopLiveLocationDialogFragment = this.A00;
        stopLiveLocationDialogFragment.A01.Acl(new RunnableRunnableShape0S2100000_I0(stopLiveLocationDialogFragment, this.A01, this.A02, 5));
    }
}
