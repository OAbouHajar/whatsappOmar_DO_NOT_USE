package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.obwhatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.348  reason: invalid class name */
public class AnonymousClass348 extends C49152Ri {
    public ConversationRowAudioPreview A00 = ((ConversationRowAudioPreview) C004601z.A0E(this, R.id.search_row_audio_preview));
    public AnonymousClass1B5 A01;
    public AnonymousClass013 A02;
    public AudioPlayerView A03 = ((AudioPlayerView) C004601z.A0E(this, R.id.search_row_audio_controls));
    public AnonymousClass01D A04;
    public boolean A05;

    public AnonymousClass348(Context context) {
        super(context);
        A00();
        setOrientation(0);
        setGravity(16);
        LinearLayout.inflate(context, R.layout.layout0512, this);
        setBackground(AnonymousClass2SR.A04(getContext(), C13690nt.A0C(context, R.drawable.search_attachment_background), R.color.color06b5));
        C78153xK r4 = new C78153xK(this);
        C1034551l r3 = new C1034551l(this);
        AudioPlayerView audioPlayerView = this.A03;
        audioPlayerView.setPlaybackListener(new AnonymousClass3DK(this.A03, audioPlayerView, r3, r4, this.A04));
    }

    public final void A02() {
        C38701rH r11 = this.A09;
        C101514xR r2 = new C101514xR(this);
        C101524xS r3 = new C101524xS(this);
        AudioPlayerView audioPlayerView = this.A03;
        C73723ow r0 = new C73723ow(this.A00, r2, r3, r3, this, audioPlayerView);
        C14710pd r10 = this.A05;
        C1034051g r12 = new C1034051g(this);
        C73723ow r7 = r0;
        C62053Bl.A02(r7, this.A03, this.A02, r10, r11, r12, audioPlayerView);
    }
}
