package com.obwhatsapp.conversation.conversationrow.message;

import X.AnonymousClass2DT;
import X.AnonymousClass2Q5;
import X.AnonymousClass5PM;
import X.AnonymousClass5PN;
import X.C101474xN;
import X.C16030sJ;
import X.C19980zJ;
import X.C28381Vw;
import X.C38701rH;
import X.C49142Rh;
import X.C49152Ri;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.obwhatsapp.search.views.itemviews.AudioPlayerView;
import com.obwhatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

public class IDxDCallbackShape15S0200000_2_I0 extends C101474xN {
    public Object A00;
    public Object A01;
    public final int A02 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxDCallbackShape15S0200000_2_I0(AnonymousClass2Q5 r2, ConversationRowAudioPreview conversationRowAudioPreview, AnonymousClass2DT r4, AnonymousClass5PM r5, AnonymousClass5PN r6, AudioPlayerView audioPlayerView) {
        super(conversationRowAudioPreview, r5, r6, audioPlayerView);
        this.A00 = r2;
        this.A01 = r4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxDCallbackShape15S0200000_2_I0(AnonymousClass5PM r2, AnonymousClass5PN r3, AnonymousClass5PN r4, C49142Rh r5, AudioPlayerView audioPlayerView) {
        super((ConversationRowAudioPreview) null, r2, r3, audioPlayerView);
        this.A00 = r5;
        this.A01 = r4;
    }

    public C38701rH AC8() {
        int i2 = this.A02;
        Object obj = this.A00;
        return i2 != 0 ? ((C49152Ri) obj).A09 : ((AnonymousClass2Q5) obj).getFMessage();
    }

    public void AQF(boolean z2) {
        View findViewById;
        if (this.A02 != 0) {
            AnonymousClass2DT A002 = ((C49152Ri) this.A00).A03.A00();
            if (A002 != null && A002.A0b == null) {
                ((AnonymousClass5PN) this.A01).AXB(z2);
            }
        } else if (((AnonymousClass2DT) this.A01).A0b == null && (findViewById = C19980zJ.A02((View) this.A00).findViewById(R.id.proximity_overlay)) != null) {
            int i2 = 4;
            if (z2) {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
        }
    }

    public void AXw(int i2, boolean z2) {
        if (1 - this.A02 != 0) {
            super.AXw(i2, z2);
            return;
        }
        super.AXw(i2, z2);
        C49142Rh r1 = (C49142Rh) this.A00;
        if (r1.A0D) {
            VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = r1.A0A;
            C28381Vw r0 = r1.A09.A11;
            voiceNoteProfileAvatarView.A01(0, false, r0.A02, C16030sJ.A0L(r0.A00));
        }
    }
}
