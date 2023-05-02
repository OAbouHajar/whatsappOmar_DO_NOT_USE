package X;

import com.obwhatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.obwhatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.4xN  reason: invalid class name and case insensitive filesystem */
public abstract class C101474xN implements C52032cr {
    public int A00 = -1;
    public final ConversationRowAudioPreview A01;
    public final AnonymousClass5PM A02;
    public final AnonymousClass5PN A03;
    public final AudioPlayerView A04;

    public C101474xN(ConversationRowAudioPreview conversationRowAudioPreview, AnonymousClass5PM r3, AnonymousClass5PN r4, AudioPlayerView audioPlayerView) {
        this.A04 = audioPlayerView;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = conversationRowAudioPreview;
    }

    public abstract void AQF(boolean z2);

    public void AUS(int i2) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(AC8().A00 * 1000);
        audioPlayerView.setSeekbarProgress(i2);
        audioPlayerView.setSeekbarContentDescription((long) i2);
        this.A02.AQE(AC8().A00);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
    }

    public void AVL(int i2) {
        int i3 = i2 / 1000;
        if (this.A00 != i3) {
            this.A00 = i3;
            this.A02.AQE(i3);
        }
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setSeekbarProgress(i2);
        audioPlayerView.setSeekbarContentDescription((long) i2);
    }

    public void AWY() {
        this.A04.setPlayButtonState(1);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A03.setVisibility(0);
            conversationRowAudioPreview.A00.setVisibility(8);
        }
    }

    public void AXQ(int i2) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(1);
        audioPlayerView.setSeekbarMax(i2);
        this.A00 = -1;
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A03.setVisibility(0);
            conversationRowAudioPreview.A00.setVisibility(8);
        }
    }

    public void AXw(int i2, boolean z2) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        if (z2) {
            audioPlayerView.setSeekbarProgress(0);
        }
        this.A02.AQE(i2 / 1000);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
        this.A03.AXB(false);
    }
}
