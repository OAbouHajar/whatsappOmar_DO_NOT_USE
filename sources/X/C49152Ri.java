package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5;
import com.obwhatsapp.R;
import com.obwhatsapp.search.views.itemviews.AudioPlayerView;
import com.obwhatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;

/* renamed from: X.2Ri  reason: invalid class name and case insensitive filesystem */
public abstract class C49152Ri extends C49162Rj {
    public C14870pt A00;
    public AnonymousClass10X A01;
    public C16760tb A02;
    public C19610yi A03;
    public C16260sj A04;
    public C14710pd A05;
    public AnonymousClass1HE A06;
    public C209212c A07;
    public C26691Ot A08;
    public C38701rH A09;
    public AnonymousClass1PD A0A;
    public C25791Ld A0B;
    public AnonymousClass01D A0C;
    public final View.OnClickListener A0D = new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 18);
    public final C34331k5 A0E = new ViewOnClickCListenerShape2S0100000_I0_2(this, 38);
    public final C34331k5 A0F = new ViewOnClickCListenerShape2S0100000_I0_2(this, 36);
    public final C34331k5 A0G = new ViewOnClickCListenerShape2S0100000_I0_2(this, 37);

    public C49152Ri(Context context) {
        super(context);
    }

    public void A01() {
        AnonymousClass2Ao r1;
        C16010sH A0A2;
        if (this instanceof C49142Rh) {
            C49142Rh r3 = (C49142Rh) this;
            C38701rH r8 = r3.A09;
            AudioPlayerView audioPlayerView = r3.A09;
            C62053Bl.A01(r3.A0E, r3.A0G, r3.A0F, r3.A0D, r8, new C1034451k(r3), audioPlayerView);
            VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = r3.A0A;
            voiceNoteProfileAvatarView.setupMicBackgroundColor(R.color.color06b5);
            AnonymousClass3Ar.A02(r3.A09, audioPlayerView, voiceNoteProfileAvatarView);
            boolean z2 = r3.A0D;
            if (z2) {
                C28381Vw r0 = r3.A09.A11;
                voiceNoteProfileAvatarView.A01(0, false, r0.A02, C16030sJ.A0L(r0.A00));
            }
            if (r3.A09.A1A()) {
                voiceNoteProfileAvatarView.A0A = true;
                voiceNoteProfileAvatarView.A05.setImageResource(R.drawable.audio_ptt_forwarded_icon);
                voiceNoteProfileAvatarView.A04.setVisibility(4);
            } else {
                voiceNoteProfileAvatarView.setIsForwardedByNonAuthorPttUi(false);
                ImageView imageView = voiceNoteProfileAvatarView.A05;
                C38701rH r7 = r3.A09;
                C28381Vw r12 = r7.A11;
                if (r12.A02) {
                    r1 = r3.A0E;
                    C16040sK r02 = r3.A01;
                    r02.A0B();
                    A0A2 = r02.A01;
                    AnonymousClass00B.A06(A0A2);
                } else {
                    ImageView imageView2 = voiceNoteProfileAvatarView.A03;
                    C15830rv r2 = r12.A00;
                    AnonymousClass00B.A06(r2);
                    if (C16030sJ.A0L(r2)) {
                        C15830rv A0B2 = r7.A0B();
                        AnonymousClass00B.A06(A0B2);
                        imageView2.setVisibility(0);
                        imageView.setVisibility(8);
                        r3.A0E.A06(imageView2, r3.A02.A0A(A0B2));
                    } else {
                        imageView2.setVisibility(8);
                        imageView.setVisibility(0);
                        r1 = r3.A0E;
                        A0A2 = r3.A02.A0A(r2);
                    }
                }
                r1.A06(imageView, A0A2);
            }
            int AFH = ((AnonymousClass1B7) r3.A0B.get()).AFH(r3.A09.A13);
            if (AFH >= 0) {
                audioPlayerView.setSeekbarProgress(AFH);
            }
            if (z2) {
                C38701rH r13 = r3.A09;
                if (!r13.A10(32768)) {
                    audioPlayerView.setTag((Object) null);
                    audioPlayerView.A00();
                    return;
                }
                audioPlayerView.setTag(r13.A11);
                r3.A06.A01(r3.A09, new RunnableRunnableShape14S0100000_I0_13((Object) r3, 20));
                return;
            }
            return;
        }
        AnonymousClass348 r14 = (AnonymousClass348) this;
        C38701rH r6 = r14.A09;
        AudioPlayerView audioPlayerView2 = r14.A03;
        C62053Bl.A01(r14.A0E, r14.A0G, r14.A0F, r14.A0D, r6, new C63263Gt(r14), audioPlayerView2);
        int AFH2 = ((AnonymousClass1B7) r14.A04.get()).AFH(r14.A09.A13);
        if (AFH2 >= 0) {
            audioPlayerView2.setSeekbarProgress(AFH2);
        }
    }

    public C38701rH getFMessageAudio() {
        return this.A09;
    }

    public final void setAudioMessage(C38701rH r1) {
        this.A09 = r1;
        A01();
    }
}
