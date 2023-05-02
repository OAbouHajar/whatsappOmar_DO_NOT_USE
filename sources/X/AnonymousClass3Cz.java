package X;

import android.view.View;
import com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.3Cz  reason: invalid class name */
public class AnonymousClass3Cz implements View.OnTouchListener {
    public final /* synthetic */ CreationModeBottomBar A00;

    public AnonymousClass3Cz(CreationModeBottomBar creationModeBottomBar) {
        this.A00 = creationModeBottomBar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r1 != 3) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            r15 = this;
            com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r2 = r15.A00
            X.1wC r0 = r2.A0E
            r3 = 0
            if (r0 == 0) goto L_0x0016
            int r1 = r17.getAction()
            if (r1 == 0) goto L_0x027d
            r0 = 1
            if (r1 == r0) goto L_0x01a4
            r0 = 2
            if (r1 == r0) goto L_0x0017
            r0 = 3
            if (r1 == r0) goto L_0x01a4
        L_0x0016:
            return r3
        L_0x0017:
            X.1wC r4 = r2.A0E
            float r7 = r17.getRawX()
            r17.getRawY()
            int r0 = r2.getWidth()
            float r6 = (float) r0
            X.1wB r4 = (X.C41571wB) r4
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0016
            float r0 = r4.A02
            float r5 = r7 - r0
            X.1wD r2 = r4.A06
            X.1wE r1 = r2.A00
            X.1wE r0 = X.C41601wE.RECORDING
            if (r1 != r0) goto L_0x003c
            r4.A00 = r5
            r2.A00()
        L_0x003c:
            r4.A01 = r7
            float r0 = r4.A00
            float r5 = java.lang.Math.abs(r0)
            float r5 = r5 / r6
            X.013 r0 = r4.A0H
            boolean r1 = X.C13680ns.A1Z(r0)
            r8 = 0
            r2 = 1
            float r0 = r4.A00
            if (r1 == 0) goto L_0x019e
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0016
        L_0x0055:
            r0 = 1041194025(0x3e0f5c29, float:0.14)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0016
            X.1wG r6 = r4.A0L
            com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r6 = (com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r6
            android.widget.ImageButton r5 = r6.A04
            X.01V r1 = r6.A0B
            boolean r0 = X.C15450qv.A09()
            if (r0 == 0) goto L_0x0199
            r0 = 17
            r5.performHapticFeedback(r0)
        L_0x0073:
            r6.A01()
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            float r9 = r6.A00
            X.013 r0 = r6.A0C
            boolean r10 = r0.A0T()
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            int r0 = r6.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r1
            if (r10 == 0) goto L_0x0196
            float r9 = r9 + r0
        L_0x0094:
            r0 = 2
            float[] r1 = new float[r0]
            android.widget.ImageButton r0 = r6.A04
            float r0 = r0.getTranslationX()
            r1[r3] = r0
            r1[r2] = r9
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofFloat(r1)
            r0 = 11
            X.C13690nt.A0p(r10, r6, r0)
            android.widget.ImageButton r1 = r6.A04
            float[] r0 = new float[r2]
            r0[r3] = r8
            java.lang.String r11 = "alpha"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r1, r11, r0)
            com.obwhatsapp.WaTextView r1 = r6.A0A
            float[] r0 = new float[r2]
            r0[r3] = r8
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r11, r0)
            android.animation.AnimatorSet$Builder r0 = r7.play(r10)
            android.animation.AnimatorSet$Builder r0 = r0.with(r9)
            r0.with(r1)
            r0 = 200(0xc8, double:9.9E-322)
            r7.setDuration(r0)
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            r12 = 3
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r12]
            r10 = 2
            float[] r13 = new float[r10]
            r13 = {0, 1065353216} // fill-array
            java.lang.String r0 = "scaleX"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r0, r13)
            r1[r3] = r0
            float[] r13 = new float[r10]
            r13 = {0, 1065353216} // fill-array
            java.lang.String r0 = "scaleY"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r0, r13)
            r1[r2] = r0
            float[] r0 = new float[r10]
            r0 = {0, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r11, r0)
            r1[r10] = r0
            android.widget.ImageButton r0 = r6.A04
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r0, r1)
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x0192
            com.obwhatsapp.mediacomposer.bottombar.recipients.RecipientsView r0 = r6.A0D
        L_0x010c:
            r0.setVisibility(r3)
            r0.setAlpha(r8)
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r0, r1)
            android.widget.ImageButton r8 = r6.A04
            float[] r1 = new float[r10]
            r1 = {0, 0} // fill-array
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r8, r0, r1)
            r0 = 0
            r11.setDuration(r0)
            int[] r8 = new int[r10]
            r8 = {0, 0} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofInt(r8)
            r8.setDuration(r0)
            r0 = 12
            X.C13690nt.A0p(r8, r6, r0)
            r0 = 4
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r3] = r11
            r0[r2] = r8
            r0[r10] = r14
            r0[r12] = r13
            r9.playTogether(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r9.setDuration(r0)
            android.animation.Animator[] r0 = new android.animation.Animator[r10]
            r0[r3] = r7
            r0[r2] = r9
            r5.playSequentially(r0)
            r0 = 15
            X.C13690nt.A0o(r5, r6, r0)
            r5.start()
            r4.A0B = r2
            X.1wA r1 = r4.A07
            if (r1 == 0) goto L_0x0174
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r1 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r1
            com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r1.A0d
            if (r0 == 0) goto L_0x0174
            X.1w4 r0 = r1.A0e
            if (r0 == 0) goto L_0x0174
            r0.A04(r2)
            r1.A37()
        L_0x0174:
            X.1L1 r0 = r4.A0K
            X.1Su r2 = r0.A0D
            X.0vx r0 = r2.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0016
            X.2Jb r1 = r2.A01()
            r0 = 28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            X.0t9 r0 = r2.A02
            r0.A05(r1)
            return r3
        L_0x0192:
            android.view.View r0 = r6.A03
            goto L_0x010c
        L_0x0196:
            float r9 = r9 - r0
            goto L_0x0094
        L_0x0199:
            X.C41631wI.A02(r1)
            goto L_0x0073
        L_0x019e:
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
            goto L_0x0055
        L_0x01a4:
            X.1wC r5 = r2.A0E
            X.1wB r5 = (X.C41571wB) r5
            X.1wD r0 = r5.A06
            X.1wE r1 = r0.A00
            X.1wE r0 = X.C41601wE.WAIT_FOR_VOICE
            if (r1 != r0) goto L_0x01e0
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0016
            X.1wG r6 = r5.A0L
            com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r6 = (com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r6
            X.4X6 r0 = r6.A07
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            r0.clear()
            X.4X6 r2 = r6.A07
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A02(r0)
            X.4X6 r4 = r6.A07
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            X.3Tu r0 = new X.3Tu
            r0.<init>(r6, r2, r1)
            r4.A03(r0)
            r5.A0A = r3
            X.1wA r0 = r5.A07
            if (r0 == 0) goto L_0x0016
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            r0.A3D()
            return r3
        L_0x01e0:
            X.1wE r4 = X.C41601wE.RECORDING
            if (r1 != r4) goto L_0x0016
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0016
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.A04
            long r6 = r6 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x022d
            X.1wA r7 = r5.A07
            if (r7 == 0) goto L_0x0219
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r7 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r7
            com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r7.A0d
            if (r0 == 0) goto L_0x0219
            X.1w4 r6 = r7.A0e
            if (r6 == 0) goto L_0x0219
            X.1w2 r4 = r6.A07
            if (r4 == 0) goto L_0x0216
            android.os.Handler r2 = r4.A03
            r1 = 38
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r0.<init>(r4, r1)
            r2.post(r0)
            r6.A04(r3)
        L_0x0216:
            r7.A35()
        L_0x0219:
            X.1wG r2 = r5.A0L
            int r1 = r5.A03
            java.lang.String r0 = r5.A08
            r2.A4p(r1, r0)
            r2.AHo()
            X.3yK r0 = new X.3yK
            r0.<init>(r5)
            r5.A06 = r0
            return r3
        L_0x022d:
            X.1wA r2 = r5.A07
            if (r2 == 0) goto L_0x0242
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r2.A0d
            if (r0 == 0) goto L_0x0242
            X.1w4 r1 = r2.A0e
            if (r1 == 0) goto L_0x0242
            r0 = 1
            r1.A04(r0)
            r2.A37()
        L_0x0242:
            X.1wD r0 = r5.A06
            X.1wE r0 = r0.A00
            if (r0 != r4) goto L_0x0016
            X.1wF r0 = new X.1wF
            r0.<init>(r5)
            r5.A06 = r0
            r5.A0A = r3
            X.1wG r5 = r5.A0L
            r4 = r5
            com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r4 = (com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r4
            android.widget.ImageButton r2 = r4.A04
            X.01V r1 = r4.A0B
            boolean r0 = X.C15450qv.A09()
            if (r0 == 0) goto L_0x0279
            r0 = 17
            r2.performHapticFeedback(r0)
        L_0x0265:
            r4.A01()
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r0 = 15
            X.C13690nt.A0o(r1, r4, r0)
            r1.start()
            r5.AHo()
            return r3
        L_0x0279:
            X.C41631wI.A02(r1)
            goto L_0x0265
        L_0x027d:
            X.1wC r4 = r2.A0E
            float r0 = r17.getRawX()
            r17.getRawY()
            X.1wB r4 = (X.C41571wB) r4
            r4.A02 = r0
            r4.A01 = r0
            X.1MV r1 = r4.A0J
            X.0pN r0 = r4.A0E
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0016
            X.1wD r0 = r4.A06
            X.1wE r1 = r0.A00
            X.1wE r0 = X.C41601wE.WAIT_FOR_VOICE
            if (r1 != r0) goto L_0x02ea
            X.1wG r5 = r4.A0L
            com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r5 = (com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r5
            X.38h r1 = r5.A0F
            if (r1 != 0) goto L_0x02b6
            android.app.Activity r2 = X.C19980zJ.A02(r5)
            X.2ZP r1 = r5.A09
            X.0ph r0 = X.C14750ph.A0q()
            X.38h r1 = r1.A00(r2, r0)
            r5.A0F = r1
        L_0x02b6:
            java.lang.String r0 = "status"
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x02ea
            android.app.Activity r1 = X.C19980zJ.A02(r5)
            X.01V r0 = r5.A0B
            X.C812847o.A00(r1, r0)
            X.4X6 r0 = r5.A07
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            r0.clear()
            X.4X6 r2 = r5.A07
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A01(r0)
            X.4X6 r2 = r5.A07
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2.A02(r0)
            X.4X6 r1 = r5.A07
            X.35Q r0 = new X.35Q
            r0.<init>(r5)
            r1.A03(r0)
            r0 = 1
            r4.A0A = r0
        L_0x02ea:
            X.1wA r2 = r4.A07
            if (r2 == 0) goto L_0x0016
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            android.view.View r0 = r2.A07
            if (r0 == 0) goto L_0x02fe
            r1 = 8
            r0.clearAnimation()
            android.view.View r0 = r2.A07
            r0.setVisibility(r1)
        L_0x02fe:
            X.0pt r1 = r2.A05
            java.lang.Runnable r0 = r2.A0u
            r1.A0J(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Cz.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
