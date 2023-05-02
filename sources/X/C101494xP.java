package X;

import com.obwhatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.obwhatsapp.conversation.conversationrow.WaveformVisualizerView;

/* renamed from: X.4xP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101494xP implements AnonymousClass5PL {
    public final /* synthetic */ AnonymousClass2Q5 A00;

    public /* synthetic */ C101494xP(AnonymousClass2Q5 r1) {
        this.A00 = r1;
    }

    public final void AZm(byte[] bArr) {
        ConversationRowAudioPreview conversationRowAudioPreview = this.A00.A06;
        if (conversationRowAudioPreview != null) {
            WaveformVisualizerView waveformVisualizerView = conversationRowAudioPreview.A03;
            waveformVisualizerView.A02 = bArr;
            waveformVisualizerView.invalidate();
        }
    }
}
