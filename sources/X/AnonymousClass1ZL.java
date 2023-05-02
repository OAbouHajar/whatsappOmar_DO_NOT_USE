package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.redex.IDxIListenerShape256S0100000_2_I0;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.waveforms.VoiceVisualizer;
import com.obwhatsapp.voicerecorder.VoiceNoteSeekBar;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ZL  reason: invalid class name */
public class AnonymousClass1ZL implements AnonymousClass1ZM {
    public Animation A00;
    public ImageButton A01;
    public TextView A02;
    public VoiceVisualizer A03;
    public VoiceNoteSeekBar A04;
    public final Context A05;
    public final View A06;
    public final View A07;
    public final ViewGroup A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;
    public final ViewGroup A0B;
    public final ImageButton A0C;
    public final ImageButton A0D;
    public final C14870pt A0E;
    public final VoiceVisualizer A0F;
    public final AnonymousClass013 A0G;
    public final C33741j5 A0H;
    public final C16320sq A0I;
    public final List A0J = new ArrayList();
    public final boolean A0K;

    public AnonymousClass1ZL(Context context, View view, C14870pt r15, AnonymousClass013 r16, C14710pd r17, C16320sq r18) {
        boolean A0E2 = r17.A0E(C16620tM.A02, 1139);
        C33741j5 r7 = new C33741j5(C004601z.A0E(view, R.id.voice_note_draft_preview_v2_view_stub));
        View A0E3 = C004601z.A0E(view, R.id.draft_send_v2);
        View A0E4 = C004601z.A0E(view, R.id.voice_note_flashing_recording_view);
        this.A05 = context;
        this.A0E = r15;
        this.A0I = r18;
        this.A0G = r16;
        this.A0K = A0E2;
        this.A0D = (ImageButton) C004601z.A0E(view, R.id.voice_note_draft_stop_btn_v2);
        this.A0C = (ImageButton) C004601z.A0E(view, R.id.voice_note_cancel_btn_v2);
        this.A0B = (ViewGroup) C004601z.A0E(view, R.id.voice_note_draft_layout_v2);
        this.A0A = (ViewGroup) C004601z.A0E(view, R.id.voice_note_draft_v2);
        this.A0H = r7;
        r7.A05(new IDxIListenerShape256S0100000_2_I0((Object) this, 3));
        this.A09 = (ViewGroup) C004601z.A0E(view, R.id.quoted_message_preview_container_v2);
        this.A08 = (ViewGroup) C004601z.A0E(view, R.id.draft_send_container_v2);
        this.A07 = A0E3;
        this.A0F = (VoiceVisualizer) C004601z.A0E(view, R.id.voice_note_draft_audio_visualizer);
        this.A06 = A0E4;
    }

    public void A00() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250);
        alphaAnimation.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 21));
        this.A0D.startAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation3.setDuration(250);
        alphaAnimation3.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 20));
        this.A0C.startAnimation(alphaAnimation3);
        alphaAnimation2.setDuration(250);
        alphaAnimation2.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 22));
        this.A08.startAnimation(alphaAnimation2);
    }

    public void A01(int i2) {
        ImageButton imageButton = this.A0D;
        AnonymousClass013 r3 = this.A0G;
        Context context = this.A05;
        imageButton.setImageDrawable(new C447725m(AnonymousClass00T.A04(context, i2), r3));
        int i3 = R.string.str1a5c;
        if (R.drawable.ic_resume_draft_preview == i2) {
            i3 = R.string.str1a5e;
        }
        imageButton.setContentDescription(context.getString(i3));
    }

    public void A02(long j2) {
        this.A02.setText(C28961Zl.A04(this.A0G, j2 / 1000));
    }

    public void A03(Animation animation, boolean z2) {
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(125);
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(75);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(75);
        animation.setAnimationListener(new C70383gZ(animationSet, this, z2));
        animationSet.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 23));
        this.A0D.startAnimation(animation);
    }

    public void A04(C30211bx r3, File file, boolean z2, boolean z3) {
        List list = this.A0J;
        if (!list.isEmpty()) {
            A05(r3, list);
            A06(z2, z3);
            return;
        }
        A06(z2, z3);
        this.A0H.A02().getViewTreeObserver().addOnGlobalLayoutListener(new C94434ku(r3, this, file));
    }

    public final void A05(C30211bx r3, List list) {
        if (list.isEmpty()) {
            this.A04.setMax(r3 != null ? r3.A03() : 0);
            this.A04.setProgress(0);
            if (this.A0K) {
                this.A04.setVisibility(0);
            }
            this.A03.setVisibility(8);
            return;
        }
        this.A03.setPlaybackPercentage(0.0f);
        this.A03.A02(list, 0.0f);
        this.A03.setVisibility(0);
        this.A04.setVisibility(8);
    }

    public final void A06(boolean z2, boolean z3) {
        if (!z2) {
            this.A0A.setVisibility(4);
            if (!z3) {
                this.A0D.setVisibility(8);
            }
            this.A0H.A03(0);
            return;
        }
        Animation A002 = C812747n.A00();
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150);
        alphaAnimation.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 24));
        this.A0A.startAnimation(alphaAnimation);
        A03(A002, true);
        alphaAnimation2.setDuration(250);
        alphaAnimation2.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 25));
        this.A0H.A02().startAnimation(alphaAnimation2);
    }

    public void A84() {
        this.A0H.A02();
        VoiceVisualizer voiceVisualizer = this.A03;
        AnonymousClass00B.A04(voiceVisualizer);
        voiceVisualizer.setVisibility(0);
        this.A0F.setVisibility(0);
        this.A06.setVisibility(8);
        Animation animation = this.A00;
        if (animation != null) {
            animation.cancel();
            this.A00 = null;
        }
    }

    public void Afd() {
        if (this.A00 == null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            this.A00 = alphaAnimation;
            alphaAnimation.setDuration(1000);
            this.A00.setRepeatMode(2);
            this.A00.setRepeatCount(-1);
        }
        VoiceVisualizer voiceVisualizer = this.A03;
        if (voiceVisualizer != null) {
            voiceVisualizer.setVisibility(8);
        }
        this.A0F.setVisibility(8);
        View view = this.A06;
        view.setVisibility(0);
        view.startAnimation(this.A00);
    }
}
