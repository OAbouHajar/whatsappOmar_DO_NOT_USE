package com.obwhatsapp.status.playback.widget;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass090;
import X.AnonymousClass2Ao;
import X.AnonymousClass47Y;
import X.AnonymousClass5N0;
import X.C004601z;
import X.C101334x7;
import X.C1035551v;
import X.C108185Mz;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16150sX;
import X.C17160ud;
import X.C17240ul;
import X.C17270uo;
import X.C218115n;
import X.C28961Zl;
import X.C38701rH;
import X.C47772Kk;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C55912ke;
import X.C99004tK;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.conversation.waveforms.VoiceVisualizer;
import com.obwhatsapp.status.playback.content.BlurFrameLayout;
import java.util.ArrayList;
import java.util.List;

public class VoiceStatusContentView extends ConstraintLayout implements C47772Kk, AnonymousClass006 {
    public ValueAnimator.AnimatorUpdateListener A00;
    public ValueAnimator A01;
    public View A02;
    public TextView A03;
    public VoiceVisualizer A04;
    public C101334x7 A05;
    public C108185Mz A06;
    public VoiceStatusProfileAvatarView A07;
    public AnonymousClass5N0 A08;
    public AnonymousClass01D A09;
    public AnonymousClass01D A0A;
    public AnonymousClass01D A0B;
    public AnonymousClass01D A0C;
    public AnonymousClass01D A0D;
    public AnonymousClass01D A0E;
    public C52662eE A0F;
    public List A0G;
    public boolean A0H;
    public final ViewTreeObserver.OnGlobalLayoutListener A0I;
    public final List A0J;
    public final List A0K;

    public VoiceStatusContentView(Context context) {
        super(context);
        A02();
        this.A0K = new ArrayList();
        this.A0J = new ArrayList();
        this.A0G = new ArrayList();
        this.A00 = new IDxUListenerShape140S0100000_2_I0(this, 24);
        this.A0I = new IDxLListenerShape144S0100000_2_I0(this, 28);
        A04(context);
    }

    public VoiceStatusContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0K = new ArrayList();
        this.A0J = new ArrayList();
        this.A0G = new ArrayList();
        this.A00 = new IDxUListenerShape140S0100000_2_I0(this, 24);
        this.A0I = new IDxLListenerShape144S0100000_2_I0(this, 28);
        A04(context);
    }

    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A0K = new ArrayList();
        this.A0J = new ArrayList();
        this.A0G = new ArrayList();
        this.A00 = new IDxUListenerShape140S0100000_2_I0(this, 24);
        this.A0I = new IDxLListenerShape144S0100000_2_I0(this, 28);
        A04(context);
    }

    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A02();
        this.A0K = new ArrayList();
        this.A0J = new ArrayList();
        this.A0G = new ArrayList();
        this.A00 = new IDxUListenerShape140S0100000_2_I0(this, 24);
        this.A0I = new IDxLListenerShape144S0100000_2_I0(this, 28);
        A04(context);
    }

    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A02();
    }

    /* access modifiers changed from: private */
    public int getPreviewWavesSegmentsCount() {
        return (int) Math.floor((double) (((float) this.A04.getWidth()) / this.A04.A0D));
    }

    private void setBackgroundColorFromMessage(C38701rH r4) {
        int A032 = AnonymousClass090.A03(0.2f, AnonymousClass47Y.A00(getContext(), r4), -16777216);
        C004601z.A0O(ColorStateList.valueOf(A032), this);
        this.A07.setMicrophoneStrokeColor(A032);
    }

    public void A02() {
        if (!this.A0H) {
            this.A0H = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A0C = C17270uo.A00(r1.ADr);
            this.A0A = C17270uo.A00(r1.A4x);
            this.A0E = C17270uo.A00(r1.AR8);
            this.A0B = C17270uo.A00(r1.ABK);
            this.A09 = C17270uo.A00(r1.A4t);
            this.A0D = C17270uo.A00(r1.AH2);
        }
    }

    public final void A03() {
        C108185Mz r0 = this.A06;
        if (r0 != null) {
            BlurFrameLayout blurFrameLayout = ((C1035551v) r0).A00.A00;
            blurFrameLayout.A09 = true;
            blurFrameLayout.invalidate();
        }
    }

    public final void A04(Context context) {
        ViewGroup.inflate(context, R.layout.layout05e8, this);
        this.A07 = (VoiceStatusProfileAvatarView) C004601z.A0E(this, R.id.voice_status_profile_avatar);
        this.A03 = (TextView) C004601z.A0E(this, R.id.voice_duration);
        this.A04 = (VoiceVisualizer) C004601z.A0E(this, R.id.voice_status_visualizer);
        this.A02 = C004601z.A0E(this, R.id.waves_place_holder);
        setBackgroundResource(R.drawable.voice_status_content_view_background);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen079d);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0F;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0F = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = this.A04.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0I);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C101334x7 r0 = this.A05;
        if (r0 != null) {
            r0.A01.clear();
        }
        ViewTreeObserver viewTreeObserver = this.A04.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0I);
        }
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.A01.removeUpdateListener(this.A00);
            this.A01 = null;
        }
    }

    public void setContentUpdatedListener(C108185Mz r1) {
        this.A06 = r1;
    }

    public void setDuration(int i2) {
        this.A03.setText(C28961Zl.A04((AnonymousClass013) this.A0E.get(), (long) i2));
    }

    public void setUiCallback(AnonymousClass5N0 r1) {
        this.A08 = r1;
    }

    public void setVoiceMessage(C38701rH r7, AnonymousClass2Ao r8) {
        C16010sH A0A2;
        setBackgroundColorFromMessage(r7);
        WaImageView waImageView = this.A07.A01;
        C218115n r5 = (C218115n) this.A0D.get();
        waImageView.setImageDrawable(r5.A00(getContext().getTheme(), getResources(), C99004tK.A00, R.drawable.avatar_contact));
        C55912ke r3 = new C55912ke((C17160ud) this.A09.get(), (C16010sH) null, r5, (C17240ul) this.A0B.get());
        this.A05 = new C101334x7(r3, this);
        if (r7.A11.A02) {
            C16040sK r0 = (C16040sK) this.A0C.get();
            r0.A0B();
            A0A2 = r0.A01;
            if (A0A2 != null) {
                C101334x7 r02 = this.A05;
                if (r02 != null) {
                    r02.A01.clear();
                }
            }
            setDuration(r7.A00);
            A03();
        }
        C15830rv A0B2 = r7.A0B();
        if (A0B2 != null) {
            A0A2 = ((C16000sG) this.A0A.get()).A0A(A0B2);
        }
        setDuration(r7.A00);
        A03();
        r8.A03(waImageView, r3, A0A2, true);
        setDuration(r7.A00);
        A03();
    }

    public void setVoiceVisualizerSegments(List list) {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.A01.removeUpdateListener(this.A00);
            this.A01 = null;
        }
        List list2 = this.A0K;
        list2.clear();
        List list3 = this.A0J;
        list2.addAll(list3);
        if (list != null) {
            list3.clear();
            for (int i2 = 0; i2 < list.size(); i2++) {
                list3.add(Float.valueOf(((Number) list.get(i2)).floatValue() * ((float) ((Math.random() * 0.19999998807907104d) + 0.800000011920929d))));
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A01 = ofFloat;
        ofFloat.setStartDelay(0);
        this.A01.setDuration(150);
        this.A01.setInterpolator(new AccelerateDecelerateInterpolator());
        this.A01.addUpdateListener(this.A00);
        this.A01.start();
        A03();
    }
}
