package X;

import android.content.DialogInterface;
import com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.4g0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91494g0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ VoipActivityV2 A01;

    public /* synthetic */ C91494g0(UserJid userJid, VoipActivityV2 voipActivityV2) {
        this.A01 = voipActivityV2;
        this.A00 = userJid;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        VoipActivityV2 voipActivityV2 = this.A01;
        UserJid userJid = this.A00;
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = voipActivityV2.A15;
        if (maximizedParticipantVideoDialogFragment != null && maximizedParticipantVideoDialogFragment.A03 == dialogInterface) {
            voipActivityV2.A15 = null;
        }
        if (voipActivityV2.A1h.containsKey(userJid)) {
            ((C616839w) voipActivityV2.A1h.get(userJid)).A06();
        }
    }
}
