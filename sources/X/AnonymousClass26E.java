package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VideoPort;
import java.util.Map;
import java.util.Set;

/* renamed from: X.26E  reason: invalid class name */
public abstract class AnonymousClass26E extends C005602k {
    public int A00 = 0;
    public int A01;
    public int A02;
    public AnimatorSet A03;
    public AnonymousClass023 A04;
    public CallGridViewModel A05;
    public C37921px A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass4DV A09;
    public final C101344x8 A0A;
    public final C16080sP A0B;

    public AnonymousClass26E(View view, C23651Cv r6, AnonymousClass4DV r7, CallGridViewModel callGridViewModel, C17160ud r9, C16080sP r10) {
        super(view);
        this.A0B = r10;
        this.A09 = r7;
        this.A05 = callGridViewModel;
        if (r6.A07 == null) {
            synchronized (r6.A01) {
                if (r6.A07 == null) {
                    r6.A07 = r6.A00.A00("blurredContactsThumbCache", C23651Cv.A0D);
                }
            }
        }
        this.A0A = new C101344x8(r6.A07, r9);
    }

    public boolean A06() {
        return this.A06 != null;
    }

    public void A07() {
        if (this instanceof C59882zE) {
            C59882zE r2 = (C59882zE) this;
            C37921px r1 = r2.A06;
            if (r1 != null && r2.A0G != null) {
                r2.A0L(r1, true);
                return;
            }
            return;
        }
        AnonymousClass26F r3 = (AnonymousClass26F) this;
        C37921px r0 = r3.A06;
        if (r0 != null) {
            r3.A0E(r3.A0I, r0.A0T, true, true);
            r3.A0E(r3.A0O, r3.A06.A0T, false, false);
        }
    }

    public void A08() {
        AnonymousClass023 r6;
        C37921px r0;
        AnonymousClass023 r4;
        if (this instanceof C59882zE) {
            C59882zE r62 = (C59882zE) this;
            if (r62.A06()) {
                CallGridViewModel callGridViewModel = r62.A05;
                if (!(callGridViewModel == null || (r0 = r62.A06) == null || (r4 = r62.A04) == null)) {
                    C85904Ql r1 = callGridViewModel.A0G;
                    UserJid userJid = r0.A0U;
                    Map map = r1.A01;
                    if (map.containsKey(userJid)) {
                        Map map2 = r1.A00;
                        if (r4.equals(map2.get(userJid))) {
                            map2.remove(userJid);
                            map.remove(userJid);
                        }
                    }
                    r62.A04 = null;
                }
                r62.A06 = null;
                r62.A0H();
                return;
            }
            return;
        }
        AnonymousClass26F r42 = (AnonymousClass26F) this;
        if (r42.A06()) {
            CallGridViewModel callGridViewModel2 = r42.A05;
            if (!(callGridViewModel2 == null || (r6 = r42.A04) == null)) {
                C85904Ql r12 = callGridViewModel2.A0G;
                UserJid userJid2 = r42.A06.A0U;
                Map map3 = r12.A01;
                if (map3.containsKey(userJid2)) {
                    Map map4 = r12.A00;
                    if (r6.equals(map4.get(userJid2))) {
                        map4.remove(userJid2);
                        map3.remove(userJid2);
                    }
                }
                r42.A04 = null;
            }
            if (r42.A0P.A0E(C16620tM.A02, 2222)) {
                C87374Wn r2 = r42.A0N;
                if (r2.A01 != null) {
                    Object A002 = r2.A00();
                    if (A002 != null) {
                        r2.A01.A07(A002);
                    }
                    r2.A01 = null;
                    r2.A03();
                }
            }
            GradientDrawable gradientDrawable = (GradientDrawable) r42.A0H.getBackground();
            int i2 = r42.A01;
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(i2, 0);
            }
            VideoPort videoPort = r42.A05;
            if (videoPort != null) {
                videoPort.setListener((C449426i) null);
            }
            r42.A06 = null;
            View view = r42.A0H;
            view.setOnClickListener((View.OnClickListener) null);
            view.setOnLongClickListener((View.OnLongClickListener) null);
            VideoPort videoPort2 = r42.A05;
            if (videoPort2 instanceof AnonymousClass2Qx) {
                Set set = ((AnonymousClass2Qx) videoPort2).A0D;
                synchronized (set) {
                    set.remove(r42);
                }
            } else if (videoPort2 != null) {
                C26801Pf r02 = r42.A0L;
                videoPort2.release();
                r02.A03.remove(videoPort2);
            }
            r42.A05 = null;
            r42.A07 = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(int r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C59882zE
            if (r0 == 0) goto L_0x007e
            r3 = r6
            X.2zE r3 = (X.C59882zE) r3
            int r0 = r3.A02
            if (r7 == r0) goto L_0x0033
            r3.A02 = r7
            r0 = 2
            r4 = 1050253722(0x3e99999a, float:0.3)
            if (r7 == r0) goto L_0x007b
            r4 = 1051260355(0x3ea8f5c3, float:0.33)
            if (r7 == r0) goto L_0x007b
            int r2 = r3.A05
        L_0x001a:
            com.obwhatsapp.components.button.ThumbnailButton r1 = r3.A0K
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.06X r0 = (X.AnonymousClass06X) r0
            r0.A04 = r4
            r0.A0X = r2
            r1.setLayoutParams(r0)
            r0 = 0
            com.obwhatsapp.calling.callgrid.view.VoiceParticipantAudioWave r2 = r3.A0J
            if (r2 == 0) goto L_0x0033
            float r1 = (float) r0
            r0 = 1
            r2.A02(r1, r0)
        L_0x0033:
            android.widget.TextView r4 = r3.A0D
            if (r4 == 0) goto L_0x0061
            int r1 = r3.A02
            if (r1 == 0) goto L_0x0061
            int r5 = r3.A08
            r0 = 1
            if (r1 == r0) goto L_0x0043
            r0 = 3
            if (r1 != r0) goto L_0x005c
        L_0x0043:
            android.view.View r0 = r3.A0H
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r2 = r0.height
            int r0 = r3.A04
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x0069
            float r1 = (float) r2
            r0 = 1042536202(0x3e23d70a, float:0.16)
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = r3.A06
            int r5 = java.lang.Math.min(r1, r0)
        L_0x005c:
            r1 = 0
            float r0 = (float) r5
            r4.setTextSize(r1, r0)
        L_0x0061:
            android.view.ViewGroup r1 = r3.A0C
            android.widget.TextView r0 = r3.A0E
            r3.A0D(r1, r0)
            return
        L_0x0069:
            java.lang.String r1 = "VoiceParticipantViewHolder/updateParticipantNameTextSize, gridHeight <= 0: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x005c
        L_0x007b:
            int r2 = r3.A07
            goto L_0x001a
        L_0x007e:
            r2 = r6
            X.26F r2 = (X.AnonymousClass26F) r2
            r2.A02 = r7
            android.view.ViewGroup r1 = r2.A0D
            com.obwhatsapp.WaTextView r0 = r2.A0K
            r2.A0D(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26E.A09(int):void");
    }

    public void A0A(int i2) {
        if (this instanceof C59882zE) {
            this.A0H.setVisibility(i2);
            return;
        }
        AnonymousClass26F r2 = (AnonymousClass26F) this;
        r2.A0H.setVisibility(i2);
        View view = r2.A0C;
        if (view instanceof SurfaceView) {
            if (!r2.A06()) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public void A0B(MotionEvent motionEvent, View view) {
        if (view == null) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            A0C(view, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            A0C(view, false);
        }
    }

    public final void A0C(View view, boolean z2) {
        AnimatorSet animatorSet = this.A03;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.A03.cancel();
        }
        View view2 = this.A0H;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        float[] fArr = new float[1];
        float f2 = 0.95f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        if (z2) {
            f4 = 0.95f;
        }
        fArr[0] = f4;
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat("scaleX", fArr);
        float[] fArr2 = new float[1];
        if (!z2) {
            f2 = 1.0f;
        }
        fArr2[0] = f2;
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat("scaleY", fArr2);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[1];
        float[] fArr3 = new float[1];
        if (!z2) {
            f3 = 0.0f;
        }
        fArr3[0] = f3;
        propertyValuesHolderArr2[0] = PropertyValuesHolder.ofFloat("alpha", fArr3);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{ofPropertyValuesHolder, ofPropertyValuesHolder2});
        animatorSet2.setDuration((long) 200);
        animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.A03 = animatorSet2;
        animatorSet2.start();
    }

    public void A0D(ViewGroup viewGroup, TextView textView) {
        if (this.A02 == 3 && textView != null && viewGroup != null) {
            AnonymousClass04h.A09(textView, textView.getResources().getDimensionPixelSize(R.dimen.dimen042f), textView.getResources().getDimensionPixelSize(R.dimen.dimen042e), 1, 0);
            viewGroup.setBackground(AnonymousClass00X.A04((Resources.Theme) null, viewGroup.getResources(), R.drawable.h_scroll_call_status_background));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r5.A08 != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(android.widget.ImageView r6, X.C16010sH r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            X.4DV r2 = r5.A09
            if (r2 == 0) goto L_0x0031
            r4 = 0
            if (r8 != 0) goto L_0x000c
            boolean r1 = r5.A08
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            java.util.Map r1 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r1.get(r0)
            X.2Ao r3 = (X.AnonymousClass2Ao) r3
            if (r3 == 0) goto L_0x0031
            X.4x8 r2 = r5.A0A
            r2.A00 = r9
            java.util.HashSet r1 = r2.A03
            int r0 = r6.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r8 == 0) goto L_0x0032
            r1.add(r0)
        L_0x002e:
            r3.A03(r6, r2, r7, r4)
        L_0x0031:
            return
        L_0x0032:
            r1.remove(r0)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26E.A0E(android.widget.ImageView, X.0sH, boolean, boolean):void");
    }

    public void A0F(AnonymousClass4Q9 r2) {
        if (this instanceof C59882zE) {
            ((C59882zE) this).A03 = r2;
        } else {
            ((AnonymousClass26F) this).A02 = r2;
        }
    }

    public abstract void A0G(C37921px r1);
}
