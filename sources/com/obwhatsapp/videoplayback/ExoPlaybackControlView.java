package com.obwhatsapp.videoplayback;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass2PU;
import X.AnonymousClass5N5;
import X.C004601z;
import X.C108925Qa;
import X.C108935Qb;
import X.C46212Cy;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C62253Cs;
import X.C89324by;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.google.android.exoplayer2.Timeline;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.R;
import java.util.Formatter;
import java.util.Locale;

public class ExoPlaybackControlView extends FrameLayout implements AnonymousClass006 {
    public AlphaAnimation A00;
    public AnonymousClass2PU A01;
    public AnonymousClass013 A02;
    public AnonymousClass5N5 A03;
    public C108925Qa A04;
    public C108935Qb A05;
    public C52662eE A06;
    public Long A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final View A0D;
    public final FrameLayout A0E;
    public final FrameLayout A0F;
    public final ImageButton A0G;
    public final ImageView A0H;
    public final LinearLayout A0I;
    public final SeekBar A0J;
    public final TextView A0K;
    public final TextView A0L;
    public final C89324by A0M;
    public final C62253Cs A0N;
    public final Runnable A0O;
    public final Runnable A0P;
    public final StringBuilder A0Q;
    public final Formatter A0R;

    public ExoPlaybackControlView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ExoPlaybackControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExoPlaybackControlView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0B) {
            this.A0B = true;
            this.A02 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
        this.A0C = true;
        this.A09 = true;
        this.A08 = true;
        this.A0P = new RunnableRunnableShape16S0100000_I0_15(this, 14);
        this.A0O = new RunnableRunnableShape16S0100000_I0_15(this, 13);
        this.A0M = new C89324by();
        StringBuilder sb = new StringBuilder();
        this.A0Q = sb;
        this.A0R = new Formatter(sb, Locale.getDefault());
        C62253Cs r2 = new C62253Cs(this);
        this.A0N = r2;
        LayoutInflater.from(context).inflate(R.layout.layout0607, this);
        this.A0D = C004601z.A0E(this, R.id.exo_player_navbar_padding_view);
        this.A0F = (FrameLayout) findViewById(R.id.main_controls);
        this.A0K = (TextView) findViewById(R.id.time);
        this.A0L = (TextView) findViewById(R.id.time_current);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mediacontroller_progress);
        this.A0J = seekBar;
        ImageView imageView = (ImageView) findViewById(R.id.back);
        this.A0H = imageView;
        this.A0I = (LinearLayout) findViewById(R.id.footerView);
        seekBar.setOnSeekBarChangeListener(r2);
        seekBar.setMax(1000);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.control_frame);
        this.A0E = frameLayout;
        this.A0G = (ImageButton) findViewById(R.id.play);
        frameLayout.setOnClickListener(r2);
        A04();
        A03();
        A05();
        if (this.A02.A0T()) {
            if (!isInEditMode()) {
                imageView.setRotationY(180.0f);
            }
            if (Build.VERSION.SDK_INT < 17) {
                seekBar.setRotationY(180.0f);
            }
        }
        onConfigurationChanged(getResources().getConfiguration());
    }

    public void A00() {
        AnonymousClass2PU r0;
        if (this.A08 && this.A00 == null) {
            AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(getAlpha(), 0.0f);
            this.A00 = alphaAnimation;
            alphaAnimation.setDuration(250);
            this.A00.setInterpolator(accelerateInterpolator);
            this.A00.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 18));
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.anim002c);
            loadAnimation.setDuration(250);
            loadAnimation.setInterpolator(accelerateInterpolator);
            if (A07()) {
                FrameLayout frameLayout = this.A0F;
                frameLayout.setVisibility(4);
                C108935Qb r1 = this.A05;
                if (r1 != null) {
                    r1.AZi(frameLayout.getVisibility());
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.anim002b);
                loadAnimation2.setDuration(250);
                loadAnimation2.setInterpolator(accelerateInterpolator);
                this.A0H.startAnimation(loadAnimation2);
                frameLayout.startAnimation(this.A00);
                this.A0I.startAnimation(loadAnimation);
            }
            if (this.A09) {
                FrameLayout frameLayout2 = this.A0E;
                if (frameLayout2.getVisibility() == 0 && (r0 = this.A01) != null && r0.AF3()) {
                    if (this.A01.AF5() == 3 || this.A01.AF5() == 2) {
                        frameLayout2.setVisibility(4);
                        frameLayout2.startAnimation(this.A00);
                        View view = this.A0D;
                        view.setVisibility(4);
                        view.startAnimation(loadAnimation);
                    }
                }
            }
        }
    }

    public void A01() {
        if (this.A08) {
            FrameLayout frameLayout = this.A0F;
            frameLayout.setVisibility(0);
            C108935Qb r1 = this.A05;
            if (r1 != null) {
                r1.AZi(frameLayout.getVisibility());
            }
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, getAlpha());
            alphaAnimation.setDuration(250);
            alphaAnimation.setInterpolator(decelerateInterpolator);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.anim002d);
            loadAnimation.setDuration(250);
            loadAnimation.setInterpolator(decelerateInterpolator);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.anim002a);
            loadAnimation2.setDuration(250);
            loadAnimation2.setInterpolator(decelerateInterpolator);
            FrameLayout frameLayout2 = this.A0E;
            if (frameLayout2.getVisibility() == 4 && this.A09) {
                frameLayout2.setVisibility(0);
                frameLayout2.startAnimation(alphaAnimation);
                this.A0G.sendAccessibilityEvent(8);
            }
            frameLayout.startAnimation(alphaAnimation);
            this.A0I.startAnimation(loadAnimation);
            this.A0H.startAnimation(loadAnimation2);
            View view = this.A0D;
            view.setVisibility(0);
            view.startAnimation(loadAnimation);
            A04();
            A03();
            A05();
        }
    }

    public void A02() {
        if (this.A09) {
            this.A0E.setVisibility(0);
            this.A0D.setVisibility(0);
        }
        this.A0F.setVisibility(4);
        A04();
        A03();
        A05();
    }

    public final void A03() {
        if (A07()) {
            boolean z2 = true;
            if (this.A07 == null) {
                AnonymousClass2PU r0 = this.A01;
                Timeline ABV = r0 != null ? r0.ABV() : null;
                z2 = false;
                if (ABV != null && !ABV.A0C()) {
                    int ABW = this.A01.ABW();
                    C89324by r2 = this.A0M;
                    ABV.A0A(r2, ABW, 0);
                    z2 = r2.A0D;
                }
            }
            this.A0J.setEnabled(z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0.AF3() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r4 = this;
            android.widget.FrameLayout r0 = r4.A0E
            int r1 = r0.getVisibility()
            r0 = 4
            if (r1 == r0) goto L_0x0039
            X.2PU r0 = r4.A01
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.AF3()
            r3 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r3 = 0
        L_0x0015:
            android.widget.ImageButton r2 = r4.A0G
            r0 = 2131231964(0x7f0804dc, float:1.8080024E38)
            if (r3 == 0) goto L_0x001f
            r0 = 2131231962(0x7f0804da, float:1.808002E38)
        L_0x001f:
            r2.setImageResource(r0)
            X.013 r0 = r4.A02
            r1 = 2131893392(0x7f121c90, float:1.942156E38)
            if (r3 == 0) goto L_0x002c
            r1 = 2131893391(0x7f121c8f, float:1.9421557E38)
        L_0x002c:
            android.content.Context r0 = r0.A00
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r1)
            r2.setContentDescription(r0)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.videoplayback.ExoPlaybackControlView.A04():void");
    }

    public final void A05() {
        SeekBar seekBar;
        int i2;
        int AF5;
        if (A07()) {
            long j2 = 0;
            if (this.A07 == null) {
                AnonymousClass2PU r0 = this.A01;
                String A002 = C46212Cy.A00(this.A0Q, this.A0R, r0 == null ? 0 : r0.ABq());
                TextView textView = this.A0K;
                if (textView.getText() == null || !A002.equals(textView.getText().toString())) {
                    textView.setText(A002);
                }
            }
            if (this.A0C) {
                AnonymousClass2PU r02 = this.A01;
                long AAF = r02 == null ? 0 : r02.AAF();
                seekBar = this.A0J;
                long duration = getDuration();
                i2 = (duration == -9223372036854775807L || duration == 0) ? 0 : (int) ((AAF * 1000) / duration);
            } else {
                seekBar = this.A0J;
                i2 = 1000;
            }
            seekBar.setSecondaryProgress(i2);
            AnonymousClass2PU r03 = this.A01;
            if (r03 != null) {
                j2 = r03.ABQ();
            }
            if (!this.A0A) {
                String A003 = C46212Cy.A00(this.A0Q, this.A0R, j2);
                TextView textView2 = this.A0L;
                if (textView2.getText() == null || !A003.equals(textView2.getText().toString())) {
                    textView2.setText(A003);
                }
            }
            if (!this.A0A) {
                long duration2 = getDuration();
                seekBar.setProgress((duration2 == -9223372036854775807L || duration2 == 0) ? 0 : (int) ((j2 * 1000) / duration2));
            }
            Runnable runnable = this.A0P;
            removeCallbacks(runnable);
            AnonymousClass2PU r3 = this.A01;
            if (r3 != null && (AF5 = r3.AF5()) != 1 && AF5 != 4) {
                long j3 = 1000;
                if (this.A01.AF3() && AF5 == 3) {
                    long j4 = 1000 - (j2 % 1000);
                    j3 = j4 < 200 ? 1000 + j4 : j4;
                }
                postDelayed(runnable, j3);
            }
        }
    }

    public void A06(int i2) {
        Runnable runnable = this.A0O;
        removeCallbacks(runnable);
        AnonymousClass2PU r0 = this.A01;
        if (r0 != null && r0.AF3()) {
            postDelayed(runnable, (long) i2);
        }
        if (this.A00 != null) {
            clearAnimation();
            this.A00 = null;
        }
    }

    public boolean A07() {
        return this.A0F.getVisibility() == 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        r3.AdE(r2, -9223372036854775807L);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r11) {
        /*
            r10 = this;
            X.2PU r0 = r10.A01
            if (r0 == 0) goto L_0x00e2
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x00e2
            int r2 = r11.getKeyCode()
            r0 = 21
            r8 = 1
            if (r2 == r0) goto L_0x0090
            r0 = 22
            if (r2 == r0) goto L_0x0079
            r0 = 85
            if (r2 == r0) goto L_0x006d
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L_0x0067
            r0 = 127(0x7f, float:1.78E-43)
            r1 = 0
            if (r2 == r0) goto L_0x0061
            switch(r2) {
                case 87: goto L_0x00a6;
                case 88: goto L_0x0028;
                case 89: goto L_0x0090;
                case 90: goto L_0x0079;
                default: goto L_0x0027;
            }
        L_0x0027:
            return r1
        L_0x0028:
            X.2PU r0 = r10.A01
            X.AnonymousClass00B.A06(r0)
            com.google.android.exoplayer2.Timeline r3 = r0.ABV()
            if (r3 == 0) goto L_0x00cb
            X.2PU r0 = r10.A01
            int r9 = r0.ABW()
            X.4by r7 = r10.A0M
            r1 = 0
            r3.A0A(r7, r9, r1)
            if (r9 <= 0) goto L_0x005b
            X.2PU r0 = r10.A01
            long r5 = r0.ABQ()
            r3 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0056
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x005b
            boolean r0 = r7.A0D
            if (r0 != 0) goto L_0x005b
        L_0x0056:
            X.2PU r3 = r10.A01
            int r2 = r9 + -1
            goto L_0x00c3
        L_0x005b:
            X.2PU r0 = r10.A01
            r0.AdF(r1)
            goto L_0x00cb
        L_0x0061:
            X.2PU r0 = r10.A01
            r0.AeK(r1)
            goto L_0x00cb
        L_0x0067:
            X.2PU r0 = r10.A01
            r0.AeK(r8)
            goto L_0x00cb
        L_0x006d:
            X.2PU r1 = r10.A01
            boolean r0 = r1.AF3()
            r0 = r0 ^ 1
            r1.AeK(r0)
            goto L_0x00cb
        L_0x0079:
            X.2PU r4 = r10.A01
            X.AnonymousClass00B.A06(r4)
            long r2 = r4.ABQ()
            r0 = 15000(0x3a98, double:7.411E-320)
            long r2 = r2 + r0
            X.2PU r0 = r10.A01
            long r0 = r0.ABq()
            long r0 = java.lang.Math.min(r2, r0)
            goto L_0x00a2
        L_0x0090:
            X.2PU r4 = r10.A01
            X.AnonymousClass00B.A06(r4)
            long r2 = r4.ABQ()
            r0 = 5000(0x1388, double:2.4703E-320)
            long r2 = r2 - r0
            r0 = 0
            long r0 = java.lang.Math.max(r2, r0)
        L_0x00a2:
            r4.AdF(r0)
            goto L_0x00cb
        L_0x00a6:
            X.2PU r0 = r10.A01
            X.AnonymousClass00B.A06(r0)
            com.google.android.exoplayer2.Timeline r3 = r0.ABV()
            if (r3 == 0) goto L_0x00cb
            X.2PU r0 = r10.A01
            int r4 = r0.ABW()
            int r0 = r3.A01()
            int r0 = r0 + -1
            if (r4 >= r0) goto L_0x00cf
            X.2PU r3 = r10.A01
            int r2 = r4 + 1
        L_0x00c3:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.AdE(r2, r0)
        L_0x00cb:
            r10.A01()
            return r8
        L_0x00cf:
            X.4by r2 = r10.A0M
            r0 = 0
            X.4by r0 = r3.A0A(r2, r4, r0)
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x00cb
            X.2PU r3 = r10.A01
            int r2 = r3.ABW()
            goto L_0x00c3
        L_0x00e2:
            boolean r0 = super.dispatchKeyEvent(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.videoplayback.ExoPlaybackControlView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A06;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public long getDuration() {
        Long l2 = this.A07;
        if (l2 != null) {
            return l2.longValue();
        }
        AnonymousClass2PU r0 = this.A01;
        if (r0 == null) {
            return -9223372036854775807L;
        }
        return r0.ABq();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i2 = configuration.orientation;
        Context context = getContext();
        float f2 = 30.0f;
        if (i2 == 2) {
            f2 = 20.0f;
        }
        int i3 = (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
        TextView textView = this.A0L;
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i3);
        SeekBar seekBar = this.A0J;
        seekBar.setPadding(seekBar.getPaddingLeft(), i3, seekBar.getPaddingRight(), i3);
        TextView textView2 = this.A0K;
        textView2.setPadding(textView2.getPaddingLeft(), i3, textView2.getPaddingRight(), i3);
    }

    public void setAllowControlFrameVisibilityChanges(boolean z2) {
        this.A08 = z2;
    }

    public void setDuration(long j2) {
        Long valueOf = Long.valueOf(j2);
        this.A07 = valueOf;
        this.A0K.setText(C46212Cy.A00(this.A0Q, this.A0R, valueOf.longValue()));
        A05();
        A03();
    }

    public void setPlayButtonClickListener(AnonymousClass5N5 r1) {
        this.A03 = r1;
    }

    public void setPlayControlVisibility(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            z2 = true;
        }
        this.A09 = z2;
        this.A0E.setVisibility(i2);
        this.A0D.setVisibility(i2);
    }

    public void setPlayer(AnonymousClass2PU r3) {
        AnonymousClass2PU r1 = this.A01;
        if (r1 != null) {
            r1.Aby(this.A0N);
        }
        this.A01 = r3;
        if (r3 != null) {
            r3.A4a(this.A0N);
        }
        A04();
        A03();
        A05();
    }

    public void setSeekbarStartTrackingTouchListener(C108925Qa r1) {
        this.A04 = r1;
    }

    public void setStreaming(boolean z2) {
        this.A0C = z2;
    }

    public void setVisibilityListener(C108935Qb r1) {
        this.A05 = r1;
    }
}
