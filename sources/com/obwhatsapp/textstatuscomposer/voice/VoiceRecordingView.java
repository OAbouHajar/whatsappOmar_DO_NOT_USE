package com.obwhatsapp.textstatuscomposer.voice;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass2Ao;
import X.AnonymousClass2U2;
import X.AnonymousClass2U4;
import X.AnonymousClass3DJ;
import X.AnonymousClass52J;
import X.C004601z;
import X.C16040sK;
import X.C16150sX;
import X.C17200uh;
import X.C17270uo;
import X.C218115n;
import X.C28881Zb;
import X.C28961Zl;
import X.C41481w0;
import X.C41491w1;
import X.C41501w2;
import X.C41521w4;
import X.C41531w5;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C78713yZ;
import X.C99004tK;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.conversation.waveforms.VoiceVisualizer;
import com.obwhatsapp.status.playback.widget.VoiceStatusProfileAvatarView;
import com.obwhatsapp.voicerecorder.VoiceNoteSeekBar;

public class VoiceRecordingView extends ConstraintLayout implements AnonymousClass2U4, AnonymousClass2U2, AnonymousClass006 {
    public View A00;
    public View A01;
    public Animation A02;
    public TextView A03;
    public C16040sK A04;
    public WaImageButton A05;
    public AnonymousClass2Ao A06;
    public C17200uh A07;
    public VoiceVisualizer A08;
    public C218115n A09;
    public VoiceStatusProfileAvatarView A0A;
    public C41531w5 A0B;
    public VoiceStatusRecordingVisualizer A0C;
    public C41491w1 A0D;
    public VoiceNoteSeekBar A0E;
    public AnonymousClass01D A0F;
    public AnonymousClass01D A0G;
    public C52662eE A0H;
    public boolean A0I;
    public final ViewTreeObserver.OnGlobalLayoutListener A0J;

    public VoiceRecordingView(Context context) {
        super(context);
        A02();
        this.A0J = new IDxLListenerShape144S0100000_2_I0(this, 32);
        A03(context);
    }

    public VoiceRecordingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0J = new IDxLListenerShape144S0100000_2_I0(this, 32);
        A03(context);
    }

    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A0J = new IDxLListenerShape144S0100000_2_I0(this, 32);
        A03(context);
    }

    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A02();
        this.A0J = new IDxLListenerShape144S0100000_2_I0(this, 32);
        A03(context);
    }

    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A02();
    }

    /* access modifiers changed from: private */
    public int getPreviewWavesSegmentsCount() {
        return (int) Math.floor((double) (((float) this.A08.getWidth()) / this.A08.A0D));
    }

    /* access modifiers changed from: private */
    public void setupPreviewProgressIndicatorSizes(boolean z2) {
        int dimensionPixelSize;
        int i2;
        Resources resources = getContext().getResources();
        if (z2) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dimen07a3);
            i2 = R.dimen.dimen07a5;
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dimen07a2);
            i2 = R.dimen.dimen07a4;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
        this.A08.setProgressBubbleRadius((float) dimensionPixelSize);
        this.A08.setProgressBubbleStokeWidth((float) dimensionPixelSize2);
    }

    public void A02() {
        if (!this.A0I) {
            this.A0I = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A04 = (C16040sK) r1.ADr.get();
            this.A07 = (C17200uh) r1.A52.get();
            this.A09 = (C218115n) r1.AH2.get();
            this.A0F = C17270uo.A00(r1.AOi);
            this.A0G = C17270uo.A00(r1.AR8);
        }
    }

    public final void A03(Context context) {
        ViewGroup.inflate(context, R.layout.layout05ea, this);
        this.A0A = (VoiceStatusProfileAvatarView) C004601z.A0E(this, R.id.voice_status_profile_avatar);
        this.A03 = (TextView) C004601z.A0E(this, R.id.voice_status_remaining_seconds_view);
        this.A0C = (VoiceStatusRecordingVisualizer) C004601z.A0E(this, R.id.voice_status_recording_visualizer);
        this.A00 = C004601z.A0E(this, R.id.voice_status_flashing_recording_view);
        this.A08 = (VoiceVisualizer) C004601z.A0E(this, R.id.voice_status_preview_visualizer);
        this.A05 = (WaImageButton) C004601z.A0E(this, R.id.voice_status_preview_playback);
        this.A01 = C004601z.A0E(this, R.id.voice_status_preview_delete);
        VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) C004601z.A0E(this, R.id.voice_status_preview_seek_bar);
        this.A0E = voiceNoteSeekBar;
        voiceNoteSeekBar.A09 = true;
        voiceNoteSeekBar.setMax(1000);
        setBackgroundResource(R.drawable.voice_status_content_view_background);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen079d);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A06 = this.A07.A04(context, "voice-recording-view");
        WaImageView waImageView = this.A0A.A01;
        waImageView.setImageDrawable(this.A09.A00(getContext().getTheme(), getResources(), C99004tK.A00, R.drawable.avatar_contact));
        C16040sK r0 = this.A04;
        r0.A0B();
        C28881Zb r2 = r0.A01;
        if (r2 != null) {
            this.A06.A08(waImageView, r2, true);
        }
        this.A0C.setListener(new AnonymousClass52J(this));
        this.A05.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 30));
        this.A01.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 29));
        setupPreviewProgressIndicatorSizes(false);
        this.A0E.setOnSeekBarChangeListener(new AnonymousClass3DJ(this));
    }

    public void AHF() {
        this.A00.setVisibility(8);
        Animation animation = this.A02;
        if (animation != null) {
            animation.cancel();
            this.A02 = null;
        }
        this.A03.setVisibility(0);
        this.A0C.setVisibility(0);
        this.A08.setVisibility(4);
        this.A05.setVisibility(4);
        this.A01.setVisibility(4);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0H;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0H = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = this.A08.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0J);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A06.A00();
        C41531w5 r3 = this.A0B;
        if (r3 != null) {
            C41521w4 r32 = (C41521w4) r3;
            C41501w2 r0 = r32.A07;
            if (r0 != null) {
                r0.A0C.clear();
            }
            r32.A04(false);
            C78713yZ r02 = r32.A05;
            if (r02 != null) {
                r02.A00.clear();
                r32.A05.A06(true);
                r32.A05 = null;
            }
            C78713yZ r03 = r32.A04;
            if (r03 != null) {
                r03.A00.clear();
                r32.A04.A06(true);
                r32.A04 = null;
            }
            C41481w0 r04 = r32.A08;
            if (r04 != null) {
                r04.A00 = null;
            }
            r32.A03(r32.A0A);
            r32.A0A = null;
        }
        C41491w1 r2 = this.A0D;
        if (r2 != null) {
            C41481w0 r22 = (C41481w0) r2;
            r22.A08.A08(r22.A09);
            r22.A05.A08(r22.A0A);
            r22.A04.removeCallbacks(r22.A03);
            r22.A02();
        }
        ViewTreeObserver viewTreeObserver = this.A08.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0J);
        }
    }

    public void setBackgroundTint(int i2) {
        C004601z.A0O(ColorStateList.valueOf(i2), this);
        this.A0A.setMicrophoneStrokeColor(i2);
    }

    public void setRemainingSeconds(int i2) {
        this.A03.setText(C28961Zl.A04((AnonymousClass013) this.A0G.get(), (long) i2));
    }

    public void setSeekbarContentDescription(long j2) {
        this.A0E.setContentDescription(getContext().getString(R.string.str1a50, new Object[]{C28961Zl.A06((AnonymousClass013) this.A0G.get(), j2)}));
    }

    public void setUICallback(C41531w5 r1) {
        this.A0B = r1;
    }

    public void setUICallbacks(C41491w1 r1) {
        this.A0D = r1;
    }
}
