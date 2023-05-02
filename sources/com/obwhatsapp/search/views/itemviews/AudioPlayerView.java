package com.obwhatsapp.search.views.itemviews;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass3DK;
import X.AnonymousClass4BW;
import X.C004601z;
import X.C14710pd;
import X.C16150sX;
import X.C16620tM;
import X.C28961Zl;
import X.C33741j5;
import X.C447725m;
import X.C45902Bo;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.facebook.redex.IDxIListenerShape256S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.waveforms.VoiceVisualizer;
import com.obwhatsapp.voicerecorder.VoiceNoteSeekBar;
import com.obwhatsapp.yo.Conversation;
import java.util.List;

public class AudioPlayerView extends LinearLayout implements AnonymousClass006 {
    public int A00;
    public int A01;
    public ImageButton A02;
    public VoiceVisualizer A03;
    public AnonymousClass013 A04;
    public C14710pd A05;
    public C33741j5 A06;
    public VoiceNoteSeekBar A07;
    public C52662eE A08;
    public boolean A09;

    public AudioPlayerView(Context context) {
        super(context);
        A01();
        A02(context, (AttributeSet) null);
    }

    public AudioPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A02(context, attributeSet);
    }

    public AudioPlayerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        A01();
    }

    public void A00() {
        this.A03.setVisibility(8);
        this.A03.setEnabled(false);
        this.A07.setVisibility(0);
        this.A07.setProgress(this.A01);
        VoiceNoteSeekBar voiceNoteSeekBar = this.A07;
        voiceNoteSeekBar.A09 = false;
        voiceNoteSeekBar.invalidate();
    }

    public void A01() {
        if (!this.A09) {
            this.A09 = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A05 = (C14710pd) r1.A05.get();
            this.A04 = (AnonymousClass013) r1.AR8.get();
        }
    }

    public final void A02(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        LinearLayout.inflate(context2, R.layout.layout03e3, this);
        setOrientation(0);
        setGravity(17);
        setClipChildren(false);
        setClipToPadding(false);
        ImageButton imageButton = (ImageButton) C004601z.A0E(this, R.id.control_btn);
        Conversation.playBtnVNColor(imageButton);
        this.A02 = imageButton;
        this.A07 = (VoiceNoteSeekBar) C004601z.A0E(this, R.id.audio_seekbar);
        this.A03 = (VoiceVisualizer) C004601z.A0E(this, R.id.audio_visualizer);
        C33741j5 r1 = new C33741j5(C004601z.A0E(this, R.id.progress_bar));
        this.A06 = r1;
        r1.A05(new IDxIListenerShape256S0100000_2_I0((Object) context2, 2));
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, AnonymousClass4BW.A02);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            View A0E = C004601z.A0E(this, R.id.controls);
            C45902Bo.A0A(A0E, this.A04, A0E.getPaddingLeft(), A0E.getPaddingTop(), dimensionPixelSize3, A0E.getPaddingBottom());
            View A0E2 = C004601z.A0E(this, R.id.audio_seekbar);
            A0E2.setPadding(A0E2.getPaddingLeft(), dimensionPixelSize2, A0E2.getPaddingRight(), dimensionPixelSize);
            if (dimensionPixelSize4 > 0) {
                C45902Bo.A07(A0E2, this.A04, dimensionPixelSize4, ((ViewGroup.MarginLayoutParams) A0E2.getLayoutParams()).rightMargin);
            }
            View A0E3 = C004601z.A0E(this, R.id.control_button_container);
            if (dimensionPixelSize5 > 0) {
                ViewGroup.LayoutParams layoutParams = A0E3.getLayoutParams();
                layoutParams.height = dimensionPixelSize5;
                layoutParams.width = dimensionPixelSize5;
                A0E3.setLayoutParams(layoutParams);
            }
            if (dimensionPixelSize6 > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A0E3.getLayoutParams();
                C45902Bo.A07(A0E3, this.A04, dimensionPixelSize6, marginLayoutParams.rightMargin);
                A0E3.setLayoutParams(marginLayoutParams);
            }
            if (dimensionPixelSize7 > 0) {
                C33741j5 r12 = this.A06;
                View view = r12.A02;
                if (view == null && (view = r12.A01) == null) {
                    throw new IllegalStateException("Either viewStub or view should exist");
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.height = dimensionPixelSize7;
                layoutParams2.width = dimensionPixelSize7;
                C33741j5 r13 = this.A06;
                View view2 = r13.A02;
                if (view2 == null && (view2 = r13.A01) == null) {
                    throw new IllegalStateException("Either viewStub or view should exist");
                }
                view2.setLayoutParams(layoutParams2);
            }
        }
    }

    public void A03(List list) {
        this.A03.setEnabled(true);
        this.A03.setVisibility(0);
        this.A03.A02(list, (((float) this.A01) * 1.0f) / ((float) this.A00));
        VoiceNoteSeekBar voiceNoteSeekBar = this.A07;
        voiceNoteSeekBar.A09 = true;
        voiceNoteSeekBar.invalidate();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A08;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public C33741j5 getProgressBar() {
        return this.A06;
    }

    public int getSeekbarProgress() {
        return this.A07.getProgress();
    }

    public void setOnControlButtonClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setOnControlButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A02.setOnLongClickListener(onLongClickListener);
    }

    public void setPlayButtonState(int i2) {
        ImageButton imageButton;
        Context context;
        int i3;
        if (i2 == 0) {
            Drawable A042 = AnonymousClass00T.A04(getContext(), R.drawable.inline_audio_play);
            ImageButton imageButton2 = this.A02;
            if (!this.A05.A0E(C16620tM.A02, 1117)) {
                A042 = new C447725m(A042, this.A04);
            }
            imageButton2.setImageDrawable(A042);
            imageButton = this.A02;
            context = getContext();
            i3 = R.string.str1d62;
        } else if (i2 == 1) {
            this.A02.setImageResource(R.drawable.inline_audio_pause);
            imageButton = this.A02;
            context = getContext();
            i3 = R.string.str0f30;
        } else if (i2 == 2) {
            this.A02.setImageResource(R.drawable.inline_audio_upload);
            imageButton = this.A02;
            context = getContext();
            i3 = R.string.str0329;
        } else if (i2 == 3) {
            this.A02.setImageResource(R.drawable.inline_audio_download);
            imageButton = this.A02;
            context = getContext();
            i3 = R.string.str0326;
        } else if (i2 == 4) {
            this.A02.setImageResource(R.drawable.inline_audio_cancel);
            imageButton = this.A02;
            context = getContext();
            i3 = R.string.str0394;
        } else {
            StringBuilder sb = new StringBuilder("setPlayButtonState: Did not handle playstate: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        imageButton.setContentDescription(context.getString(i3));
    }

    public void setPlaybackListener(AnonymousClass3DK r2) {
        this.A07.setOnSeekBarChangeListener(r2);
    }

    public void setSeekbarColor(int i2) {
        this.A07.setProgressColor(i2);
    }

    public void setSeekbarContentDescription(long j2) {
        VoiceNoteSeekBar voiceNoteSeekBar = this.A07;
        AnonymousClass013 r0 = this.A04;
        voiceNoteSeekBar.setContentDescription(getContext().getString(R.string.str1a50, new Object[]{C28961Zl.A06(r0, j2)}));
    }

    public void setSeekbarLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A07.setOnLongClickListener(onLongClickListener);
    }

    public void setSeekbarMax(int i2) {
        this.A07.setMax(i2);
        this.A00 = i2;
    }

    public void setSeekbarProgress(int i2) {
        this.A01 = i2;
        this.A07.setProgress(i2);
    }
}
