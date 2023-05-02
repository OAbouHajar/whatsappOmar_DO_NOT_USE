package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass329;
import X.AnonymousClass4SA;
import X.AnonymousClass4TY;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.obwhatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.obwhatsapp.components.RoundCornerProgressBar;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import com.obwhatsapp.qrcode.QrEducationView;
import com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import com.whatsapp.voipcalling.VoipActivityV2;

public class IDxUListenerShape141S0100000_2_I1 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public IDxUListenerShape141S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A01) {
            case 0:
                ((Drawable) this.A00).invalidateSelf();
                return;
            case 1:
                ((CollapsingToolbarLayout) this.A00).setScrimAlpha(AnonymousClass000.A0D(valueAnimator.getAnimatedValue()));
                return;
            case 2:
                ((TextInputLayout) this.A00).A0r.A05(AnonymousClass000.A03(valueAnimator));
                return;
            case 3:
                ((View) this.A00).setX(AnonymousClass000.A03(valueAnimator));
                return;
            case 4:
                VoiceParticipantAudioWave voiceParticipantAudioWave = (VoiceParticipantAudioWave) this.A00;
                voiceParticipantAudioWave.A08.setAlpha((int) (AnonymousClass000.A03(valueAnimator) * 255.0f));
                voiceParticipantAudioWave.invalidate();
                return;
            case 5:
                RoundCornerProgressBar roundCornerProgressBar = (RoundCornerProgressBar) this.A00;
                roundCornerProgressBar.A00 = AnonymousClass000.A03(valueAnimator);
                roundCornerProgressBar.postInvalidate();
                return;
            case 6:
                AnonymousClass329 r2 = (AnonymousClass329) this.A00;
                int A0D = AnonymousClass000.A0D(valueAnimator.getAnimatedValue());
                Drawable drawable = r2.A04;
                if (drawable != null) {
                    drawable.setAlpha(A0D);
                }
                r2.invalidate();
                return;
            case 7:
                ShapePickerView shapePickerView = (ShapePickerView) this.A00;
                shapePickerView.A0A.setAlpha(AnonymousClass000.A0D(valueAnimator.getAnimatedValue()));
                shapePickerView.invalidate();
                return;
            case 8:
                AnonymousClass4TY r22 = (AnonymousClass4TY) this.A00;
                float A03 = AnonymousClass000.A03(valueAnimator);
                valueAnimator.getCurrentPlayTime();
                r22.A01 = true;
                r22.A00 = A03;
                return;
            case 9:
                QrEducationView qrEducationView = (QrEducationView) this.A00;
                float A032 = AnonymousClass000.A03(valueAnimator);
                if (A032 < qrEducationView.A00) {
                    qrEducationView.A0D = true;
                }
                if (qrEducationView.A0D) {
                    A032 += 1.0f;
                }
                qrEducationView.A00 = A032;
                qrEducationView.invalidate();
                return;
            case 10:
                ((View) this.A00).setBackgroundColor(AnonymousClass000.A0D(valueAnimator.getAnimatedValue()));
                return;
            case 11:
                ((CreationModeBottomBar) this.A00).A02(AnonymousClass000.A03(valueAnimator));
                return;
            case 12:
                ((CreationModeBottomBar) this.A00).A03(AnonymousClass000.A0D(valueAnimator.getAnimatedValue()));
                return;
            case 13:
                ((View) this.A00).setBackgroundColor(AnonymousClass000.A0D(valueAnimator.getAnimatedValue()) << 24);
                return;
            default:
                AnonymousClass4SA r1 = ((VoipActivityV2) this.A00).A0r;
                r1.A00 = AnonymousClass000.A03(valueAnimator);
                r1.A00();
                return;
        }
    }
}
