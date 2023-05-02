package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.C13680ns;
import X.C45902Bo;
import X.C56892oy;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout;

public class IDxUListenerShape0S0104000_2_I1 implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public final int A05 = 0;

    public IDxUListenerShape0S0104000_2_I1(C56892oy r2, int i2, int i3, int i4, int i5) {
        this.A04 = r2;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A01 = i5;
    }

    public IDxUListenerShape0S0104000_2_I1(VideoCallParticipantViewLayout videoCallParticipantViewLayout, int i2, int i3) {
        this.A04 = videoCallParticipantViewLayout;
        this.A00 = i2;
        this.A01 = i3;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A05 != 0) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            VideoCallParticipantViewLayout videoCallParticipantViewLayout = (VideoCallParticipantViewLayout) this.A04;
            VideoCallParticipantView videoCallParticipantView = videoCallParticipantViewLayout.A0Q;
            ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(videoCallParticipantView);
            AnonymousClass013 r5 = videoCallParticipantViewLayout.A0H;
            AnonymousClass00B.A06(r5);
            if (animatedFraction == 0.0f) {
                this.A03 = A0O.topMargin;
                this.A02 = C13680ns.A1Z(r5) ? A0O.leftMargin : A0O.rightMargin;
                videoCallParticipantView.getWidth();
                videoCallParticipantView.getHeight();
            }
            C45902Bo.A09(videoCallParticipantView, r5, ((int) (((float) this.A00) * animatedFraction)) + this.A02, A0O.topMargin, C13680ns.A1Z(r5) ? A0O.rightMargin : A0O.leftMargin, A0O.bottomMargin);
            ViewGroup.MarginLayoutParams A0O2 = AnonymousClass000.A0O(videoCallParticipantView);
            A0O2.topMargin = this.A03 + ((int) (((float) this.A01) * animatedFraction));
            videoCallParticipantView.setLayoutParams(A0O2);
            return;
        }
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        C56892oy r3 = (C56892oy) this.A04;
        int i2 = this.A02;
        int round = i2 + Math.round(((float) (this.A00 - i2)) * animatedFraction2);
        int i3 = this.A03;
        int round2 = i3 + Math.round(animatedFraction2 * ((float) (this.A01 - i3)));
        if (round != r3.A01 || round2 != r3.A02) {
            r3.A01 = round;
            r3.A02 = round2;
            r3.postInvalidateOnAnimation();
        }
    }
}
