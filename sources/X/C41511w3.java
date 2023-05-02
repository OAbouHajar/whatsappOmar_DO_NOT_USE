package X;

import com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.1w3  reason: invalid class name and case insensitive filesystem */
public class C41511w3 implements AnonymousClass1ZM {
    public final /* synthetic */ C41501w2 A00;

    public C41511w3(C41501w2 r1) {
        this.A00 = r1;
    }

    public void A84() {
        C41521w4 r0 = (C41521w4) this.A00.A0C.get();
        if (r0 != null) {
            r0.A0H.AHF();
        }
    }

    public void Afd() {
        C41521w4 r0 = (C41521w4) this.A00.A0C.get();
        if (r0 != null) {
            VoiceRecordingView voiceRecordingView = (VoiceRecordingView) r0.A0H;
            voiceRecordingView.A03.setVisibility(0);
            voiceRecordingView.A0C.setVisibility(4);
            voiceRecordingView.A08.setVisibility(4);
            voiceRecordingView.A05.setVisibility(4);
            voiceRecordingView.A01.setVisibility(4);
            if (voiceRecordingView.A02 == null) {
                voiceRecordingView.A02 = new AnonymousClass3NG();
            }
            voiceRecordingView.A00.setVisibility(0);
            voiceRecordingView.A00.startAnimation(voiceRecordingView.A02);
        }
    }
}
