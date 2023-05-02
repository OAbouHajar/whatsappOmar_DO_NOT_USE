package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3C5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3C5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ VoipActivityV2.ReplyWithMessageDialogFragment A00;
    public final /* synthetic */ String[] A01;

    public /* synthetic */ AnonymousClass3C5(VoipActivityV2.ReplyWithMessageDialogFragment replyWithMessageDialogFragment, String[] strArr) {
        this.A00 = replyWithMessageDialogFragment;
        this.A01 = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        VoipActivityV2.ReplyWithMessageDialogFragment replyWithMessageDialogFragment = this.A00;
        String[] strArr = this.A01;
        VoipActivityV2 voipActivityV2 = (VoipActivityV2) replyWithMessageDialogFragment.A0D();
        Intent A0x = C14750ph.A0q().A0x(voipActivityV2, replyWithMessageDialogFragment.A01);
        if (i2 != strArr.length - 1) {
            A0x.putExtra("wa_type", (byte) 0);
            A0x.putExtra("share_msg", strArr[i2]);
            A0x.putExtra("has_share", true);
            C51382ba.A00(replyWithMessageDialogFragment.A0u(), A0x);
        } else {
            A0x.putExtra("show_keyboard", true);
        }
        AnonymousClass22U.A00(A0x, "VoipActivityV2");
        voipActivityV2.startActivity(A0x);
        voipActivityV2.A3f(2);
    }
}
