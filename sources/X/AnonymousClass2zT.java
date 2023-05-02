package X;

import com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.2zT  reason: invalid class name */
public class AnonymousClass2zT extends C616839w {
    public final /* synthetic */ VoipActivityV2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2zT(AnonymousClass2UY r3, UserJid userJid, VoipActivityV2 voipActivityV2) {
        super(r3, userJid, voipActivityV2.A29, "display");
        this.A00 = voipActivityV2;
    }

    public final boolean A0B() {
        VideoCallParticipantView videoCallParticipantView;
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A00.A15;
        if (maximizedParticipantVideoDialogFragment != null) {
            UserJid userJid = this.A04;
            C616839w r0 = maximizedParticipantVideoDialogFragment.A08;
            return (!userJid.equals(r0 != null ? r0.A04 : null) || (videoCallParticipantView = this.A00) == null || videoCallParticipantView.A03 == 7) ? false : true;
        }
    }
}
