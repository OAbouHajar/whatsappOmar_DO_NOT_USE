package com.obwhatsapp.mediacomposer;

import X.AnonymousClass013;
import X.AnonymousClass01T;
import X.AnonymousClass01V;
import X.AnonymousClass14W;
import X.AnonymousClass1A9;
import X.AnonymousClass1CX;
import X.AnonymousClass1MF;
import X.AnonymousClass1P7;
import X.AnonymousClass1PJ;
import X.AnonymousClass29K;
import X.AnonymousClass2Ra;
import X.AnonymousClass2Ur;
import X.AnonymousClass2Ut;
import X.AnonymousClass2Yn;
import X.AnonymousClass331;
import X.AnonymousClass4XG;
import X.C001000l;
import X.C14710pd;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C16300so;
import X.C16320sq;
import X.C17250um;
import X.C17800vf;
import X.C23061Ai;
import X.C26211Mt;
import X.C26221Mu;
import X.C455829l;
import X.C455929m;
import X.C456229t;
import X.C49112Rc;
import X.C78403xz;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.obwhatsapp.ClearableEditText;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.doodle.DoodleView;

public abstract class MediaComposerFragment extends Hilt_MediaComposerFragment implements C456229t {
    public Uri A00;
    public Toast A01;
    public C16300so A02;
    public C14870pt A03;
    public C15900s5 A04;
    public AnonymousClass01V A05;
    public C15860rz A06;
    public AnonymousClass013 A07;
    public C17250um A08;
    public C14710pd A09;
    public AnonymousClass1P7 A0A;
    public AnonymousClass4XG A0B;
    public AnonymousClass2Yn A0C;
    public AnonymousClass2Ra A0D;
    public C26211Mt A0E;
    public C26221Mu A0F;
    public AnonymousClass1PJ A0G;
    public C17800vf A0H;
    public AnonymousClass1MF A0I;
    public AnonymousClass14W A0J;
    public AnonymousClass1CX A0K;
    public C23061Ai A0L;
    public AnonymousClass1A9 A0M;
    public C16320sq A0N;
    public final int[] A0O = new int[2];

    public void A0k() {
        AnonymousClass2Ra r2 = this.A0D;
        r2.A0E.A05(false);
        r2.A03.A00();
        super.A0k();
    }

    public void A0l(Bundle bundle) {
        this.A0V = true;
        AnonymousClass2Ra r3 = this.A0D;
        r3.A0H.Aej(r3.A0E.A05.A00, r3.A0F.A00);
        r3.A08 = true;
    }

    public void A0o(boolean z2) {
        try {
            super.A0o(z2);
        } catch (NullPointerException unused) {
            this.A02.AcB("mediacomperserfragment-visibility-npe", (String) null, true);
        }
    }

    public void A0x(int i2, int i3, Intent intent) {
        Bundle extras;
        if (i2 != 2) {
            super.A0x(i2, i3, intent);
            return;
        }
        ((MediaComposerActivity) ((AnonymousClass29K) A0C())).A0s.A08(0);
        if (i3 == -1 && (extras = intent.getExtras()) != null) {
            String string = extras.getString("locations_string");
            if (TextUtils.isEmpty(string)) {
                string = A0J(R.string.str1195);
            }
            double d2 = extras.getDouble("longitude");
            double d3 = extras.getDouble("latitude");
            AnonymousClass331 r1 = new AnonymousClass331(A02(), this.A07, string, false);
            r1.A01 = d2;
            r1.A00 = d3;
            this.A0D.A06(r1);
        }
    }

    public void A13() {
        C49112Rc r2 = ((MediaComposerActivity) ((AnonymousClass29K) A0C())).A0s;
        if (r2.A04 == this.A0B) {
            r2.A04 = null;
        }
        AnonymousClass2Ra r4 = this.A0D;
        DoodleView doodleView = r4.A0H;
        C455929m r22 = doodleView.A0G;
        Bitmap bitmap = r22.A07;
        if (bitmap != null) {
            bitmap.recycle();
            r22.A07 = null;
        }
        Bitmap bitmap2 = r22.A08;
        if (bitmap2 != null) {
            bitmap2.recycle();
            r22.A08 = null;
        }
        Bitmap bitmap3 = r22.A06;
        if (bitmap3 != null) {
            bitmap3.recycle();
            r22.A06 = null;
        }
        Bitmap bitmap4 = r22.A05;
        if (bitmap4 != null) {
            bitmap4.recycle();
            r22.A05 = null;
        }
        doodleView.setEnabled(false);
        r4.A0A.removeCallbacksAndMessages((Object) null);
        AnonymousClass01T r1 = r4.A0T;
        if (r1.A00()) {
            AnonymousClass2Ur r3 = (AnonymousClass2Ur) r1.get();
            C78403xz r12 = r3.A02;
            if (r12 != null) {
                r12.A06(true);
            }
            r3.A06.quit();
            r3.A0K.removeMessages(0);
            r3.A0e.clear();
            r3.A0S.A00 = null;
            r3.A0X.A03(r3.A0W);
            r3.A0R.A02();
        }
        C49112Rc r0 = r4.A0Q;
        if (r0 != null) {
            r0.A0H.setToolbarExtraVisibility(8);
        }
        Toast toast = this.A01;
        if (toast != null) {
            toast.cancel();
            this.A01 = null;
        }
        super.A13();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0069, code lost:
        if (r12.A09.A0E(X.C16620tM.A02, 1493) == false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A18(android.os.Bundle r41, android.view.View r42) {
        /*
            r40 = this;
            r12 = r40
            android.os.Bundle r1 = r12.A05
            java.lang.String r0 = "uri"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r12.A00 = r0
            boolean r1 = r12 instanceof com.obwhatsapp.mediacomposer.VideoComposerFragment
            if (r1 == 0) goto L_0x00b6
            r0 = r12
            com.obwhatsapp.mediacomposer.VideoComposerFragment r0 = (com.obwhatsapp.mediacomposer.VideoComposerFragment) r0
            X.3um r2 = new X.3um
            r2.<init>(r0)
        L_0x001b:
            r12.A0B = r2
            X.0pd r0 = r12.A09
            r24 = r0
            X.1Ai r0 = r12.A0L
            r21 = r0
            X.0sq r0 = r12.A0N
            r20 = r0
            X.0um r0 = r12.A08
            r17 = r0
            X.1Mt r15 = r12.A0E
            X.01V r14 = r12.A05
            X.013 r11 = r12.A07
            X.14W r10 = r12.A0J
            X.1CX r9 = r12.A0K
            X.1PJ r8 = r12.A0G
            X.1Mu r7 = r12.A0F
            X.1MF r6 = r12.A0I
            X.00l r16 = r12.A0D()
            X.4XG r5 = r12.A0B
            X.00l r0 = r12.A0C()
            X.29K r0 = (X.AnonymousClass29K) r0
            com.obwhatsapp.mediacomposer.MediaComposerActivity r0 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r0
            X.2Rc r4 = r0.A0s
            if (r1 == 0) goto L_0x00a8
            r0 = r12
            com.obwhatsapp.mediacomposer.VideoComposerFragment r0 = (com.obwhatsapp.mediacomposer.VideoComposerFragment) r0
            X.4js r3 = new X.4js
            r3.<init>(r0)
        L_0x0057:
            X.2Yn r2 = r12.A0C
            boolean r0 = r12 instanceof com.obwhatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x006b
            X.0pd r13 = r12.A09
            r1 = 1493(0x5d5, float:2.092E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r13.A0E(r0, r1)
            r38 = 1
            if (r0 != 0) goto L_0x006d
        L_0x006b:
            r38 = 0
        L_0x006d:
            X.0pd r13 = r12.A09
            r1 = 2182(0x886, float:3.058E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r39 = r13.A0E(r0, r1)
            X.2Ra r0 = new X.2Ra
            r26 = r12
            r30 = r12
            r19 = r12
            r18 = r42
            r29 = r7
            r31 = r8
            r32 = r4
            r33 = r6
            r34 = r10
            r35 = r9
            r36 = r21
            r37 = r20
            r20 = r12
            r21 = r14
            r22 = r11
            r23 = r17
            r25 = r5
            r27 = r2
            r28 = r15
            r15 = r0
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r12.A0D = r0
            return
        L_0x00a8:
            boolean r0 = r12 instanceof com.obwhatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x00b4
            r0 = r12
            com.obwhatsapp.mediacomposer.ImageComposerFragment r0 = (com.obwhatsapp.mediacomposer.ImageComposerFragment) r0
            com.obwhatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r0.A06
            X.2Kn r3 = r0.A05
            goto L_0x0057
        L_0x00b4:
            r3 = 0
            goto L_0x0057
        L_0x00b6:
            boolean r0 = r12 instanceof com.obwhatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x00c4
            r0 = r12
            com.obwhatsapp.mediacomposer.ImageComposerFragment r0 = (com.obwhatsapp.mediacomposer.ImageComposerFragment) r0
            X.32l r2 = new X.32l
            r2.<init>(r0)
            goto L_0x001b
        L_0x00c4:
            X.4XG r2 = new X.4XG
            r2.<init>(r12)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.MediaComposerFragment.A18(android.os.Bundle, android.view.View):void");
    }

    public void A1B() {
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            View findViewById = videoComposerFragment.A06().findViewById(R.id.content);
            findViewById.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            findViewById.startAnimation(alphaAnimation);
            videoComposerFragment.A0M.A06().setAlpha(1.0f);
        } else if (this instanceof ImageComposerFragment) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            imageComposerFragment.A08.setVisibility(0);
            C001000l A0C2 = imageComposerFragment.A0C();
            if (A0C2 != null && A0C2.getIntent().getIntExtra("origin", 1) == 29) {
                imageComposerFragment.A03.A0K(new RunnableRunnableShape19S0100000_I1_2(imageComposerFragment.A0D, 1));
            }
        } else if (this instanceof GifComposerFragment) {
            GifComposerFragment gifComposerFragment = (GifComposerFragment) this;
            gifComposerFragment.A00.A06().setAlpha(1.0f);
            gifComposerFragment.A00.A06().setVisibility(0);
        }
    }

    public void A1C() {
        if (this instanceof ImageComposerFragment) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            imageComposerFragment.A08.setVisibility(4);
            C001000l A0C2 = imageComposerFragment.A0C();
            if (A0C2 != null && A0C2.getIntent().getIntExtra("origin", 1) == 29) {
                imageComposerFragment.A1M(false, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r4.A0O != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1D() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof com.obwhatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x0067
            r4 = r5
            com.obwhatsapp.mediacomposer.VideoComposerFragment r4 = (com.obwhatsapp.mediacomposer.VideoComposerFragment) r4
            X.0yi r0 = r4.A0F
            r0.A06()
            X.29D r3 = r4.A0M
            boolean r0 = r4.A0Q
            r2 = 1
            if (r0 != 0) goto L_0x0018
            boolean r1 = r4.A0O
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            r3.A0B(r0)
            X.29D r0 = r4.A0M
            r0.A08()
            X.2Ra r0 = r4.A0D
            com.obwhatsapp.mediacomposer.doodle.DoodleView r1 = r0.A0H
            X.29m r0 = r1.A0G
            r0.A0A = r2
            android.os.SystemClock.elapsedRealtime()
            r1.invalidate()
            X.29D r0 = r4.A0M
            android.view.View r0 = r0.A06()
            r0.setKeepScreenOn(r2)
            X.29D r0 = r4.A0M
            android.view.View r0 = r0.A06()
            java.lang.Runnable r3 = r4.A0U
            r0.removeCallbacks(r3)
            X.29D r0 = r4.A0M
            android.view.View r2 = r0.A06()
            r0 = 50
            r2.postDelayed(r3, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.view.View r0 = r4.A07
            r0.startAnimation(r2)
            android.view.View r1 = r4.A07
            r0 = 4
            r1.setVisibility(r0)
        L_0x0066:
            return
        L_0x0067:
            boolean r0 = r5 instanceof com.obwhatsapp.mediacomposer.ImageComposerFragment
            if (r0 != 0) goto L_0x0066
            r3 = r5
            com.obwhatsapp.mediacomposer.GifComposerFragment r3 = (com.obwhatsapp.mediacomposer.GifComposerFragment) r3
            X.29D r0 = r3.A00
            r0.A08()
            X.2Ra r0 = r3.A0D
            com.obwhatsapp.mediacomposer.doodle.DoodleView r2 = r0.A0H
            X.29m r0 = r2.A0G
            r1 = 1
            r0.A0A = r1
            android.os.SystemClock.elapsedRealtime()
            r2.invalidate()
            X.29D r0 = r3.A00
            android.view.View r0 = r0.A06()
            r0.setKeepScreenOn(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.MediaComposerFragment.A1D():void");
    }

    public void A1E() {
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            ImageView imageView = videoComposerFragment.A0B;
            boolean z2 = videoComposerFragment.A0Q;
            int i2 = R.drawable.ic_gif_off;
            if (z2) {
                i2 = R.drawable.ic_gif_on;
            }
            imageView.setImageResource(i2);
            if (videoComposerFragment.A03 - videoComposerFragment.A02 > 7000 || videoComposerFragment.A0P) {
                if (videoComposerFragment.A0B.getVisibility() == 0) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) videoComposerFragment.A0B.getMeasuredWidth(), 0.0f, 0.0f);
                    translateAnimation.setDuration(100);
                    videoComposerFragment.A0B.startAnimation(translateAnimation);
                }
                videoComposerFragment.A0B.setOnClickListener((View.OnClickListener) null);
                videoComposerFragment.A0B.setVisibility(8);
                return;
            }
            if (videoComposerFragment.A0B.getVisibility() == 8) {
                videoComposerFragment.A0B.measure(0, 0);
                TranslateAnimation translateAnimation2 = new TranslateAnimation((float) videoComposerFragment.A0B.getMeasuredWidth(), 0.0f, 0.0f, 0.0f);
                translateAnimation2.setDuration(100);
                videoComposerFragment.A0B.startAnimation(translateAnimation2);
            }
            videoComposerFragment.A0B.setOnClickListener(videoComposerFragment.A05);
            videoComposerFragment.A0B.setVisibility(0);
        }
    }

    public void A1F(Rect rect) {
        if (this.A0A != null) {
            AnonymousClass2Ra r5 = this.A0D;
            View view = r5.A0R.A03;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.rightMargin = rect.right;
            marginLayoutParams.bottomMargin = rect.bottom;
            view.setLayoutParams(marginLayoutParams);
            r5.A0E.setInsets(rect);
            AnonymousClass01T r1 = r5.A0T;
            if (r1.A00()) {
                ((AnonymousClass2Ur) r1.get()).A0R.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            }
            r5.A09.set(rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d3, code lost:
        if (r2 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1G(boolean r9) {
        /*
            r8 = this;
            android.widget.Toast r0 = r8.A01
            if (r0 == 0) goto L_0x0007
            r0.cancel()
        L_0x0007:
            if (r9 == 0) goto L_0x00b0
            android.content.Context r0 = r8.A0u()
            if (r0 == 0) goto L_0x00b0
            android.content.Context r4 = r8.A02()
            X.00l r2 = r8.A0C()
            X.29K r2 = (X.AnonymousClass29K) r2
            com.obwhatsapp.mediacomposer.MediaComposerActivity r2 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r2
            X.29F r0 = r2.A0p
            if (r0 == 0) goto L_0x00fc
            X.2X6 r0 = r0.A03
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r0 = r0.A04
            int r0 = r0.getCaptionTop()
            if (r0 == 0) goto L_0x00fc
            X.29w r0 = r2.A0o
            X.2X6 r0 = r0.A04
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r0 = r0.A04
            int r1 = r0.getCaptionTop()
            X.29F r0 = r2.A0p
            X.2X6 r0 = r0.A03
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r0 = r0.A04
            int r0 = r0.getCaptionTop()
            int r7 = java.lang.Math.min(r1, r0)
        L_0x0041:
            X.0pd r1 = r8.A09
            r0 = 1710(0x6ae, float:2.396E-42)
            X.0tM r6 = X.C16620tM.A02
            boolean r0 = r1.A0E(r6, r0)
            r5 = 0
            if (r0 == 0) goto L_0x00b1
            X.00l r0 = r8.A0C()
            X.29K r0 = (X.AnonymousClass29K) r0
            com.obwhatsapp.mediacomposer.MediaComposerActivity r0 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r0
            X.29P r0 = r0.A0l
            X.027 r0 = r0.A01
            java.lang.Object r2 = r0.A01()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x00d5
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x00d5
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            X.0rv r2 = (X.C15830rv) r2
            boolean r1 = r8 instanceof com.obwhatsapp.mediacomposer.VideoComposerFragment
            r0 = 42
            if (r1 == 0) goto L_0x0078
            r0 = 43
        L_0x0078:
            X.4Hv r3 = new X.4Hv
            r3.<init>(r2, r0)
            X.0vf r1 = r8.A0H
            X.02C r0 = r8.A0F()
            boolean r2 = com.obwhatsapp.ephemeral.ViewOnceNuxBottomSheet.A02(r0, r3, r1, r5)
            X.0pd r1 = r8.A09
            r0 = 1711(0x6af, float:2.398E-42)
            boolean r0 = r1.A0E(r6, r0)
            if (r0 == 0) goto L_0x00d3
            if (r2 != 0) goto L_0x00ae
            X.0rz r0 = r8.A06
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "view_once_nux_secondary"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x00d5
            X.02C r0 = r8.A0F()
            com.obwhatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet.A01(r0, r3)
        L_0x00ae:
            r8.A01 = r5
        L_0x00b0:
            return
        L_0x00b1:
            X.0vf r3 = r8.A0H
            X.02C r2 = r8.A0F()
            boolean r0 = r2.A0o()
            r1 = 0
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = "ephemeral_view_once"
            boolean r0 = r3.A00(r5, r0)
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = "view_once_nux"
            X.01A r0 = r2.A0B(r0)
            if (r0 != 0) goto L_0x00d5
            com.obwhatsapp.ephemeral.ViewOnceNUXDialog.A01(r2, r5, r1)
            goto L_0x00ae
        L_0x00d3:
            if (r2 != 0) goto L_0x00ae
        L_0x00d5:
            X.0pt r5 = r8.A03
            boolean r0 = r8 instanceof com.obwhatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x00f2
            r0 = 2131892756(0x7f121a14, float:1.942027E38)
        L_0x00de:
            java.lang.String r3 = r4.getString(r0)
            int r2 = r7 >> 1
            r1 = 0
            r0 = 49
            android.widget.Toast r5 = r5.A04(r3)
            r5.setGravity(r0, r1, r2)
            r5.show()
            goto L_0x00ae
        L_0x00f2:
            boolean r0 = r8 instanceof com.obwhatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x00fa
            r0 = 2131892736(0x7f121a00, float:1.9420229E38)
            goto L_0x00de
        L_0x00fa:
            r0 = 0
            goto L_0x00de
        L_0x00fc:
            X.29w r0 = r2.A0o
            X.2X6 r0 = r0.A04
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r0 = r0.A04
            int r7 = r0.getCaptionTop()
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.MediaComposerFragment.A1G(boolean):void");
    }

    public boolean A1H() {
        AnonymousClass2Ra r5 = this.A0D;
        if (!r5.A08()) {
            C49112Rc r2 = r5.A0Q;
            if (r2.A00() != 2) {
                return false;
            }
            r2.A08(0);
            r5.A01();
        }
        AnonymousClass2Ut r3 = ((AnonymousClass2Ur) r5.A0T.get()).A0N;
        ClearableEditText clearableEditText = r3.A0A;
        if (clearableEditText.getVisibility() == 0) {
            clearableEditText.setText("");
        } else {
            ValueAnimator valueAnimator = r3.A01;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                C49112Rc r22 = r5.A0Q;
                r22.A0H.setBackButtonDrawable(R.drawable.ic_cam_close);
                r22.A05(r22.A00);
                r5.A02();
                return true;
            }
            long currentPlayTime = r3.A01.getCurrentPlayTime();
            r3.A01.cancel();
            r3.A00(currentPlayTime, false);
        }
        r3.A0C.A00.A0B(false);
        return true;
    }

    public boolean A1I() {
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            boolean A0C2 = videoComposerFragment.A0M.A0C();
            videoComposerFragment.A0M.A07();
            videoComposerFragment.A01 = (long) videoComposerFragment.A0M.A03();
            DoodleView doodleView = videoComposerFragment.A0D.A0H;
            doodleView.A0G.A0A = false;
            doodleView.invalidate();
            videoComposerFragment.A0M.A06().setKeepScreenOn(false);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200);
            videoComposerFragment.A07.startAnimation(alphaAnimation);
            videoComposerFragment.A07.setVisibility(0);
            return A0C2;
        } else if (this instanceof ImageComposerFragment) {
            return false;
        } else {
            GifComposerFragment gifComposerFragment = (GifComposerFragment) this;
            boolean A0C3 = gifComposerFragment.A00.A0C();
            gifComposerFragment.A00.A07();
            DoodleView doodleView2 = gifComposerFragment.A0D.A0H;
            doodleView2.A0G.A0A = false;
            doodleView2.invalidate();
            gifComposerFragment.A00.A06().setKeepScreenOn(false);
            return A0C3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1J(float r5, float r6) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof com.obwhatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x0018
            r1 = r4
            com.obwhatsapp.mediacomposer.VideoComposerFragment r1 = (com.obwhatsapp.mediacomposer.VideoComposerFragment) r1
            X.2Ra r0 = r1.A0D
            boolean r0 = r0.A09(r5, r6)
            if (r0 != 0) goto L_0x0016
            com.obwhatsapp.mediacomposer.VideoTimelineView r0 = r1.A0I
            int r1 = r0.A0A
            r0 = 0
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            return r0
        L_0x0018:
            boolean r0 = r4 instanceof com.obwhatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x0057
            r1 = r4
            com.obwhatsapp.mediacomposer.ImageComposerFragment r1 = (com.obwhatsapp.mediacomposer.ImageComposerFragment) r1
            X.1bo r0 = r1.A07
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0016
            X.2Ra r0 = r1.A0D
            boolean r0 = r0.A09(r5, r6)
            if (r0 != 0) goto L_0x0016
            com.obwhatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r1.A06
            X.2Kn r3 = r0.A05
            boolean r0 = r3.A0M
            if (r0 == 0) goto L_0x0055
            com.facebook.redex.RunnableRunnableShape0S0220102_I0 r0 = r3.A0F
            if (r0 == 0) goto L_0x0040
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0040
            goto L_0x0016
        L_0x0040:
            float r2 = r3.A03
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            float r1 = r3.A00
            if (r0 != 0) goto L_0x0050
            float r0 = r3.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            goto L_0x0016
        L_0x0050:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0055
            goto L_0x0016
        L_0x0055:
            r0 = 0
            return r0
        L_0x0057:
            X.2Ra r0 = r4.A0D
            boolean r0 = r0.A09(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.MediaComposerFragment.A1J(float, float):boolean");
    }

    public void AX9(C455829l r6) {
        boolean A052 = this.A0A.A05(A0u());
        Context A0u = A0u();
        Intent intent = new Intent();
        intent.putExtra("sticker_mode", true);
        intent.setClassName(A0u.getPackageName(), A052 ? "com.obwhatsapp.location.LocationPicker2" : "com.obwhatsapp.location.LocationPicker");
        startActivityForResult(intent, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0030, code lost:
        if (r3 == 180) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r5) {
        /*
            r4 = this;
            super.onConfigurationChanged(r5)
            android.content.Context r3 = r4.A02()
            java.lang.String r2 = "window"
            boolean r0 = r3 instanceof android.app.Application
            r1 = r0 ^ 1
            java.lang.String r0 = "Application context should not be used here"
            X.AnonymousClass00B.A0B(r0, r1)
            java.lang.Object r0 = r3.getSystemService(r2)
            X.AnonymousClass00B.A06(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r3 = r0.getRotation()
            X.2Ra r2 = r4.A0D
            int r1 = r5.orientation
            r0 = 2
            if (r1 != r0) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 1
            if (r3 != r0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            boolean r0 = r2.A07
            if (r0 == r1) goto L_0x003c
            r2.A07 = r1
            r2.A03()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.MediaComposerFragment.onConfigurationChanged(android.content.res.Configuration):void");
    }
}
