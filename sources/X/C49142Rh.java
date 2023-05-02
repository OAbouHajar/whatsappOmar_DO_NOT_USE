package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.facebook.redex.IDxAProviderShape377S0100000_2_I0;
import com.facebook.redex.IDxDCallbackShape375S0100000_2_I0;
import com.facebook.redex.IDxOCallbackShape376S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.message.IDxDCallbackShape15S0200000_2_I0;
import com.obwhatsapp.search.views.itemviews.AudioPlayerMetadataView;
import com.obwhatsapp.search.views.itemviews.AudioPlayerView;
import com.obwhatsapp.search.views.itemviews.IDxObserverShape98S0100000_2_I0;
import com.obwhatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.2Rh  reason: invalid class name and case insensitive filesystem */
public class C49142Rh extends C49152Ri {
    public C52922ef A00;
    public C16040sK A01;
    public C16000sG A02;
    public C17200uh A03;
    public AnonymousClass1B5 A04;
    public AnonymousClass013 A05;
    public AnonymousClass1RV A06;
    public C612638f A07;
    public AudioPlayerMetadataView A08 = ((AudioPlayerMetadataView) C004601z.A0E(this, R.id.search_row_voice_note_metadata));
    public AudioPlayerView A09 = ((AudioPlayerView) C004601z.A0E(this, R.id.search_row_voice_note_controls));
    public VoiceNoteProfileAvatarView A0A = ((VoiceNoteProfileAvatarView) C004601z.A0E(this, R.id.search_row_voice_note_preview));
    public AnonymousClass01D A0B;
    public boolean A0C;
    public boolean A0D;
    public final AnonymousClass2Ao A0E;

    public C49142Rh(Context context) {
        super(context);
        A00();
        this.A0E = this.A03.A03(context, "attachment-voice-note-audio-view");
        setOrientation(0);
        setGravity(16);
        LinearLayout.inflate(context, R.layout.layout0514, this);
        Drawable A042 = AnonymousClass00T.A04(context, R.drawable.search_attachment_background);
        AnonymousClass00B.A06(A042);
        setBackground(AnonymousClass2SR.A06(A042, AnonymousClass00T.A00(getContext(), R.color.color06b5)));
        IDxObserverShape98S0100000_2_I0 iDxObserverShape98S0100000_2_I0 = new IDxObserverShape98S0100000_2_I0(this, 1);
        IDxAProviderShape377S0100000_2_I0 iDxAProviderShape377S0100000_2_I0 = new IDxAProviderShape377S0100000_2_I0(this, 1);
        AudioPlayerView audioPlayerView = this.A09;
        audioPlayerView.setPlaybackListener(new AnonymousClass3DK(this.A03, audioPlayerView, iDxAProviderShape377S0100000_2_I0, iDxObserverShape98S0100000_2_I0, this.A0B));
        boolean A0E2 = this.A05.A0E(C16620tM.A02, 1316);
        this.A0D = A0E2;
        if (A0E2) {
            C52922ef r0 = this.A00;
            VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = this.A0A;
            C16150sX r1 = r0.A00.A03;
            this.A07 = new C612638f((AnonymousClass1B5) r1.AEp.get(), (C15860rz) r1.AQh.get(), voiceNoteProfileAvatarView);
            this.A0A.setOnFastPlaybackButtonClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 17));
        }
    }

    public final void A02() {
        IDxDCallbackShape375S0100000_2_I0 iDxDCallbackShape375S0100000_2_I0 = new IDxDCallbackShape375S0100000_2_I0(this, 1);
        IDxOCallbackShape376S0100000_2_I0 iDxOCallbackShape376S0100000_2_I0 = new IDxOCallbackShape376S0100000_2_I0(this, 1);
        AudioPlayerView audioPlayerView = this.A09;
        IDxDCallbackShape15S0200000_2_I0 iDxDCallbackShape15S0200000_2_I0 = new IDxDCallbackShape15S0200000_2_I0(iDxDCallbackShape375S0100000_2_I0, iDxOCallbackShape376S0100000_2_I0, iDxOCallbackShape376S0100000_2_I0, this, audioPlayerView);
        C14710pd r3 = this.A05;
        C38701rH r4 = this.A09;
        C1034151h r5 = new C1034151h(this);
        C62053Bl.A02(iDxDCallbackShape15S0200000_2_I0, this.A03, this.A05, r3, r4, r5, audioPlayerView);
    }
}
