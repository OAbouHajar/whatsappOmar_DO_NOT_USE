package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape83S0200000_1_I0;
import com.facebook.redex.IDxCallbackShape187S0100000_2_I0;
import com.facebook.redex.IDxObjectShape260S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape167S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.AutoScrollView;
import com.obwhatsapp.text.ReadMoreTextView;
import com.obwhatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2Cw  reason: invalid class name and case insensitive filesystem */
public class C46202Cw extends AnonymousClass2Cx implements AnonymousClass006 {
    public AccelerateInterpolator A00;
    public Animation A01;
    public Animation A02;
    public Animation A03;
    public Animation A04;
    public Animation A05;
    public Animation A06;
    public Animation A07;
    public Animation A08;
    public Animation A09;
    public Animation A0A;
    public DecelerateInterpolator A0B;
    public C14710pd A0C;
    public AnonymousClass2PL A0D;
    public C54292hA A0E;
    public C54292hA A0F;
    public C54292hA A0G;
    public AnonymousClass5N6 A0H;
    public AnonymousClass29D A0I;
    public C52662eE A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public final int A0W;
    public final int A0X;
    public final Handler A0Y;
    public final View A0Z;
    public final View A0a;
    public final ViewGroup A0b;
    public final ViewGroup A0c;
    public final ViewGroup A0d;
    public final ViewGroup A0e;
    public final ViewGroup A0f;
    public final ViewGroup A0g;
    public final Animation.AnimationListener A0h;
    public final HorizontalScrollView A0i;
    public final ImageButton A0j;
    public final ImageButton A0k;
    public final ImageButton A0l;
    public final ImageButton A0m;
    public final ImageButton A0n;
    public final ImageButton A0o;
    public final ImageButton A0p;
    public final ImageButton A0q;
    public final ImageButton A0r;
    public final ImageView A0s;
    public final LinearLayout A0t;
    public final LinearLayout A0u;
    public final ProgressBar A0v;
    public final SeekBar A0w;
    public final TextView A0x;
    public final TextView A0y;
    public final TextView A0z;
    public final AutoScrollView A10;
    public final ReadMoreTextView A11;
    public final C85464Oo A12;
    public final WDSButton A13;
    public final WDSButton A14;
    public final WDSButton A15;
    public final Runnable A16;
    public final StringBuilder A17;
    public final Formatter A18;

    public C46202Cw(Context context, C85464Oo r7, int i2, boolean z2) {
        super(context);
        if (!this.A0P) {
            this.A0P = true;
            this.A0C = (C14710pd) ((C52652eD) ((C52642eC) generatedComponent())).A07.A05.get();
        }
        int i3 = 0;
        this.A0O = false;
        this.A0V = false;
        this.A0N = false;
        this.A0U = false;
        this.A0L = false;
        this.A0K = false;
        this.A0M = false;
        this.A0R = false;
        this.A0Q = false;
        this.A0S = false;
        this.A0T = false;
        this.A16 = new RunnableRunnableShape16S0100000_I0_15(this, 17);
        this.A0h = new IDxLAdapterShape51S0100000_2_I0(this, 19);
        this.A0Y = new Handler(Looper.myLooper(), new IDxCallbackShape187S0100000_2_I0(this, 7));
        LayoutInflater.from(context).inflate(R.layout.layout0352, this);
        this.A0W = this.A0C.A03(C16620tM.A02, 820);
        this.A0X = i2;
        StringBuilder sb = new StringBuilder();
        this.A17 = sb;
        this.A18 = new Formatter(sb, Locale.getDefault());
        this.A0j = (ImageButton) C004601z.A0E(this, R.id.close);
        this.A0l = (ImageButton) C004601z.A0E(this, R.id.fullscreen_close);
        this.A0m = (ImageButton) C004601z.A0E(this, R.id.fullscreen_minimize);
        this.A0n = (ImageButton) C004601z.A0E(this, R.id.landscape_close);
        this.A0o = (ImageButton) C004601z.A0E(this, R.id.landscape_minimize);
        this.A0k = (ImageButton) C004601z.A0E(this, z2 ? R.id.chat_fullscreen : R.id.status_fullscreen);
        this.A0q = (ImageButton) C004601z.A0E(this, R.id.play_pause);
        this.A0r = (ImageButton) C004601z.A0E(this, R.id.play_pause_fullscreen);
        this.A0v = (ProgressBar) C004601z.A0E(this, R.id.minimized_progress_bar);
        this.A0w = (SeekBar) C004601z.A0E(this, R.id.mediacontroller_progress);
        this.A0z = (TextView) C004601z.A0E(this, R.id.time);
        this.A0y = (TextView) C004601z.A0E(this, R.id.time_current);
        AutoScrollView autoScrollView = (AutoScrollView) C004601z.A0E(this, R.id.music_attribution_view);
        this.A10 = autoScrollView;
        this.A0i = autoScrollView.A00;
        ImageButton imageButton = (ImageButton) C004601z.A0E(this, R.id.logo_button);
        this.A0p = imageButton;
        WDSButton wDSButton = (WDSButton) C004601z.A0E(this, R.id.logo_box_button);
        this.A13 = wDSButton;
        this.A0a = C004601z.A0E(this, R.id.loading);
        this.A0Z = C004601z.A0E(this, R.id.background);
        this.A0u = (LinearLayout) C004601z.A0E(this, R.id.media_controller_container);
        this.A0e = (ViewGroup) C004601z.A0E(this, R.id.video_attribution_container);
        this.A0f = (ViewGroup) C004601z.A0E(this, R.id.video_information_container);
        this.A0c = (ViewGroup) C004601z.A0E(this, R.id.pip_container);
        this.A0d = (ViewGroup) C004601z.A0E(this, R.id.portrait_fullscreen_container);
        this.A0b = (ViewGroup) C004601z.A0E(this, R.id.bottom_control_container);
        this.A0g = (ViewGroup) C004601z.A0E(this, R.id.watch_play_container);
        this.A15 = (WDSButton) C004601z.A0E(this, R.id.watch_more_videos_button);
        this.A14 = (WDSButton) C004601z.A0E(this, R.id.play_again_button);
        imageButton.setVisibility(8);
        wDSButton.setVisibility(!A0X() ? 8 : i3);
        this.A0t = (LinearLayout) C004601z.A0E(this, R.id.authorship_container);
        this.A0x = (TextView) C004601z.A0E(this, R.id.author_name);
        this.A11 = (ReadMoreTextView) C004601z.A0E(this, R.id.video_caption);
        this.A0s = (ImageView) C004601z.A0E(this, R.id.author_image);
        ImageButton imageButton2 = this.A0p;
        imageButton2.setPaddingRelative(imageButton2.getPaddingStart(), imageButton2.getPaddingTop(), 0, imageButton2.getPaddingBottom());
        ImageButton imageButton3 = this.A0j;
        imageButton3.setPaddingRelative(imageButton3.getPaddingStart(), imageButton3.getPaddingTop(), 0, imageButton3.getPaddingBottom());
        ImageButton imageButton4 = this.A0q;
        imageButton4.setPaddingRelative(0, imageButton4.getPaddingTop(), imageButton4.getPaddingEnd(), imageButton4.getPaddingBottom());
        this.A00 = new AccelerateInterpolator();
        this.A0B = new DecelerateInterpolator();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.anim0032);
        loadAnimation.setDuration(200);
        loadAnimation.setInterpolator(this.A00);
        this.A08 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.anim0033);
        loadAnimation2.setDuration(200);
        loadAnimation2.setInterpolator(this.A0B);
        this.A07 = loadAnimation2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(getContext(), R.anim.anim003b);
        loadAnimation3.setDuration(200);
        loadAnimation3.setInterpolator(this.A00);
        this.A0A = loadAnimation3;
        Animation loadAnimation4 = AnimationUtils.loadAnimation(getContext(), R.anim.anim003b);
        loadAnimation4.setDuration(200);
        loadAnimation4.setInterpolator(this.A0B);
        this.A09 = loadAnimation4;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200);
        alphaAnimation.setInterpolator(this.A00);
        this.A02 = alphaAnimation;
        alphaAnimation.setAnimationListener(this.A0h);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(200);
        alphaAnimation2.setInterpolator(this.A0B);
        this.A01 = alphaAnimation2;
        this.A12 = r7;
        onConfigurationChanged(getResources().getConfiguration());
    }

    public static /* synthetic */ AnonymousClass22M A00(C46202Cw r1) {
        r1.A0T();
        if (!r1.A0N) {
            r1.A0e.setVisibility(8);
        }
        return AnonymousClass22M.A00;
    }

    public static /* synthetic */ void A02(C46202Cw r2) {
        r2.A0O();
        r2.A0I.A0A(0);
        r2.A0N();
    }

    public static /* synthetic */ void A03(C46202Cw r0) {
        C54292hA r02 = r0.A0F;
        if (r02 != null) {
            r02.AOW();
        }
    }

    public static /* synthetic */ void A04(C46202Cw r0) {
        C54292hA r02 = r0.A0F;
        if (r02 != null) {
            r02.AOW();
        }
    }

    public static /* synthetic */ void A05(C46202Cw r0) {
        C54292hA r02 = r0.A0F;
        if (r02 != null) {
            r02.AOW();
        }
    }

    public static /* synthetic */ void A06(C46202Cw r0) {
        C54292hA r02 = r0.A0E;
        if (r02 != null) {
            r02.AOW();
        }
    }

    public static /* synthetic */ void A07(C46202Cw r0) {
        C54292hA r02 = r0.A0E;
        if (r02 != null) {
            r02.AOW();
        }
    }

    public static /* synthetic */ void A08(C46202Cw r0) {
        C54292hA r02 = r0.A0G;
        if (r02 != null) {
            r02.AOW();
        }
    }

    public static /* synthetic */ void A09(C46202Cw r0) {
        C54292hA r02 = r0.A0E;
        if (r02 != null) {
            r02.AOW();
        }
    }

    public static /* synthetic */ void A0A(C46202Cw r0) {
        C54292hA r02 = r0.A0G;
        if (r02 != null) {
            r02.AOW();
        }
    }

    public static /* synthetic */ void A0B(C46202Cw r2, AnonymousClass29D r3) {
        if (r2.A0R) {
            r2.A0R = false;
            r2.A0S = true;
            r2.A0U();
            r3.A0A(0);
        } else if (r2.A0K) {
        } else {
            if (r3.A0C()) {
                r2.A03();
            } else {
                r2.A0N();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r5 == false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A0C(X.C46202Cw r2, X.AnonymousClass29D r3, int r4, boolean r5) {
        /*
            boolean r0 = r3.A0C()
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r0 = 1
            if (r5 != 0) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            r2.setKeepScreenOn(r0)
            boolean r0 = r3.A0C()
            if (r0 == 0) goto L_0x001f
            android.view.ViewGroup r0 = r2.A0g
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x001f
            r2.A0O()
        L_0x001f:
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x002b
            r0 = 2
            if (r4 != r0) goto L_0x002b
            r2.A0S = r1
            r2.A0N()
        L_0x002b:
            android.widget.SeekBar r0 = r2.A0w
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46202Cw.A0C(X.2Cw, X.29D, int, boolean):void");
    }

    public static /* synthetic */ void A0D(C46202Cw r2, AnonymousClass29D r3, boolean z2) {
        r2.A0L = z2;
        if (r3 instanceof AnonymousClass29C) {
            View view = r2.A0a;
            int i2 = 8;
            if (z2) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
        C85464Oo r0 = r2.A12;
        if (r0 != null) {
            C87394Wp r02 = r0.A06;
            if (z2) {
                r02.A02();
            } else {
                r02.A00();
            }
        }
    }

    public static /* synthetic */ void A0E(C46202Cw r4, String str, boolean z2) {
        String str2 = z2 ? "_transient" : "_not_transient";
        C85464Oo r2 = r4.A12;
        StringBuilder sb = new StringBuilder();
        sb.append(str.toLowerCase(Locale.ROOT));
        sb.append(str2);
        r2.A01 = sb.toString();
    }

    public static /* synthetic */ boolean A0J(MotionEvent motionEvent, C46202Cw r4) {
        ReadMoreTextView readMoreTextView = r4.A11;
        if (!readMoreTextView.A05 || motionEvent.getAction() != 0 || !readMoreTextView.A0K()) {
            return false;
        }
        readMoreTextView.setExpanded(false);
        return true;
    }

    private int getBottomContainerHorizontalPadding() {
        return !this.A0N ? R.dimen.dimen0763 : A0W() ? R.dimen.dimen0471 : R.dimen.dimen0765;
    }

    private Animation getFullscreenBottomControlsSlideInAnimation() {
        return A0W() ? this.A04 : this.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r5.A06 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r2 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, (float) r5.A0u.getHeight());
        r2.setDuration(200);
        r2.setInterpolator(r5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r4 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r5.A06 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r5.A04 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r2 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, (float) r5.A0u.getHeight(), 0.0f);
        r2.setDuration(200);
        r2.setInterpolator(r5.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r4 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r5.A04 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r5.A03 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r5.A05 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        return r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r5.A05 != null) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r5.A03 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (A0W() == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r5.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.animation.Animation getFullscreenBottomControlsSlideOutAnimation() {
        /*
            r5 = this;
            boolean r4 = r5.A0W()
            r3 = 0
            if (r4 != 0) goto L_0x0018
            android.view.animation.Animation r0 = r5.A05
            if (r0 == 0) goto L_0x001c
        L_0x000b:
            android.view.animation.Animation r0 = r5.A03
            if (r0 == 0) goto L_0x003a
        L_0x000f:
            boolean r0 = r5.A0W()
            if (r0 == 0) goto L_0x005b
            android.view.animation.Animation r0 = r5.A06
            return r0
        L_0x0018:
            android.view.animation.Animation r0 = r5.A06
            if (r0 != 0) goto L_0x0036
        L_0x001c:
            android.widget.LinearLayout r0 = r5.A0u
            int r0 = r0.getHeight()
            float r0 = (float) r0
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r3, r3, r3, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.view.animation.AccelerateInterpolator r0 = r5.A00
            r2.setInterpolator(r0)
            if (r4 == 0) goto L_0x0058
            r5.A06 = r2
        L_0x0036:
            android.view.animation.Animation r0 = r5.A04
            if (r0 != 0) goto L_0x000f
        L_0x003a:
            android.widget.LinearLayout r0 = r5.A0u
            int r0 = r0.getHeight()
            float r0 = (float) r0
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r3, r3, r0, r3)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = r5.A0B
            r2.setInterpolator(r0)
            if (r4 == 0) goto L_0x0055
            r5.A04 = r2
            goto L_0x000f
        L_0x0055:
            r5.A03 = r2
            goto L_0x000f
        L_0x0058:
            r5.A05 = r2
            goto L_0x000b
        L_0x005b:
            android.view.animation.Animation r0 = r5.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46202Cw.getFullscreenBottomControlsSlideOutAnimation():android.view.animation.Animation");
    }

    public void A0K() {
        if (!this.A0M && A0A() && this.A0I != null) {
            this.A0M = true;
            if (this.A0N) {
                LinearLayout linearLayout = this.A0u;
                Animation animation = this.A02;
                linearLayout.startAnimation(animation);
                if (this.A0g.getVisibility() != 0) {
                    this.A0r.startAnimation(animation);
                }
                Animation fullscreenBottomControlsSlideOutAnimation = getFullscreenBottomControlsSlideOutAnimation();
                if (fullscreenBottomControlsSlideOutAnimation != null) {
                    this.A0b.startAnimation(fullscreenBottomControlsSlideOutAnimation);
                }
                if (!A0W()) {
                    this.A0d.startAnimation(this.A08);
                }
            } else {
                this.A0b.startAnimation(this.A0A);
                this.A0v.startAnimation(this.A02);
            }
            if (this.A0N) {
                int i2 = 262;
                if (Build.VERSION.SDK_INT >= 19) {
                    i2 = 4358;
                }
                setSystemUiVisibility(i2);
            }
        }
    }

    public void A0L() {
        A0U();
        setSystemUiVisibility(0);
        A0M();
        if (A0A()) {
            return;
        }
        if (this.A0N) {
            A0Q();
            Animation fullscreenBottomControlsSlideInAnimation = getFullscreenBottomControlsSlideInAnimation();
            if (fullscreenBottomControlsSlideInAnimation != null) {
                this.A0b.startAnimation(fullscreenBottomControlsSlideInAnimation);
            }
            LinearLayout linearLayout = this.A0u;
            Animation animation = this.A01;
            linearLayout.startAnimation(animation);
            linearLayout.setVisibility(0);
            if (this.A0g.getVisibility() != 0) {
                ImageButton imageButton = this.A0r;
                imageButton.startAnimation(animation);
                imageButton.setVisibility(0);
            }
            if (!A0W()) {
                ViewGroup viewGroup = this.A0d;
                viewGroup.startAnimation(this.A07);
                viewGroup.setVisibility(0);
                return;
            }
            return;
        }
        this.A0b.startAnimation(this.A09);
        ProgressBar progressBar = this.A0v;
        progressBar.startAnimation(this.A01);
        progressBar.setVisibility(0);
    }

    public void A0M() {
        Runnable runnable = this.A16;
        removeCallbacks(runnable);
        AnonymousClass29D r0 = this.A0I;
        if (r0 != null && r0.A0C()) {
            if (!this.A0O || this.A0N) {
                postDelayed(runnable, 3000);
            }
        }
    }

    public void A0N() {
        AnonymousClass29D r0 = this.A0I;
        if (r0 != null) {
            if (!r0.A0C()) {
                this.A0I.A08();
                C85464Oo r02 = this.A12;
                if (r02 != null) {
                    r02.A09.A02();
                }
                this.A0Q = false;
            }
            A0M();
            A0U();
            A07(100);
        }
    }

    public final void A0O() {
        this.A0g.setVisibility(8);
        this.A0f.setVisibility(0);
        if (this.A0N) {
            this.A0r.setVisibility(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r1 != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P() {
        /*
            r5 = this;
            android.content.res.Resources r1 = r5.getResources()
            int r0 = r5.getBottomContainerHorizontalPadding()
            int r3 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r2 = r5.getResources()
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x001d
            boolean r1 = r5.A0W()
            r0 = 2131166344(0x7f070488, float:1.794693E38)
            if (r1 == 0) goto L_0x0020
        L_0x001d:
            r0 = 2131167074(0x7f070762, float:1.7948411E38)
        L_0x0020:
            int r2 = r2.getDimensionPixelSize(r0)
            android.view.ViewGroup r1 = r5.A0b
            int r0 = r1.getPaddingTop()
            r1.setPadding(r3, r0, r3, r2)
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x004e
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131167077(0x7f070765, float:1.7948417E38)
            int r4 = r1.getDimensionPixelSize(r0)
        L_0x003c:
            android.view.ViewGroup r3 = r5.A0f
            int r2 = r5.getPaddingLeft()
            int r1 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            r3.setPadding(r2, r1, r0, r4)
            return
        L_0x004e:
            r4 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46202Cw.A0P():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r6.A0O != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r6.A0O != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Q() {
        /*
            r6 = this;
            boolean r5 = r6.A0W()
            android.widget.ImageButton r2 = r6.A0m
            r4 = 0
            r3 = 8
            if (r5 != 0) goto L_0x0010
            boolean r1 = r6.A0O
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0010:
            r0 = 8
        L_0x0012:
            r2.setVisibility(r0)
            android.widget.ImageButton r1 = r6.A0l
            r0 = 0
            if (r5 == 0) goto L_0x001c
            r0 = 8
        L_0x001c:
            r1.setVisibility(r0)
            android.widget.ImageButton r2 = r6.A0o
            if (r5 == 0) goto L_0x0028
            boolean r1 = r6.A0O
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0028:
            r0 = 8
        L_0x002a:
            r2.setVisibility(r0)
            android.widget.ImageButton r1 = r6.A0n
            r0 = 8
            if (r5 == 0) goto L_0x0034
            r0 = 0
        L_0x0034:
            r1.setVisibility(r0)
            boolean r1 = r6.A0N
            android.view.ViewGroup r0 = r6.A0d
            if (r1 == 0) goto L_0x0045
            if (r5 == 0) goto L_0x0041
            r4 = 8
        L_0x0041:
            r0.setVisibility(r4)
            return
        L_0x0045:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46202Cw.A0Q():void");
    }

    public final void A0R() {
        if (this.A0t.getVisibility() != 8) {
            ImageView imageView = this.A0s;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Resources resources = getResources();
            boolean z2 = this.A0N;
            int i2 = R.dimen.dimen0466;
            if (z2) {
                i2 = R.dimen.dimen0465;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i2);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            imageView.requestLayout();
        }
    }

    public final void A0S() {
        boolean z2 = this.A0N && (this.A0t.getVisibility() == 0 || this.A11.getVisibility() == 0);
        Resources resources = getResources();
        int i2 = R.dimen.dimen0762;
        if (z2) {
            i2 = R.dimen.dimen0464;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        LinearLayout linearLayout = this.A0t;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), dimensionPixelSize, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
    }

    public final void A0T() {
        if (this.A0e.getVisibility() != 8) {
            AutoScrollView autoScrollView = this.A10;
            if (autoScrollView.A02) {
                HorizontalScrollView horizontalScrollView = this.A0i;
                ((FrameLayout.LayoutParams) horizontalScrollView.getLayoutParams()).width = this.A0N ? autoScrollView.A05 : -1;
                horizontalScrollView.requestLayout();
            }
            autoScrollView.A00.post(new RunnableRunnableShape6S0100000_I0_5(autoScrollView, 45));
        }
    }

    public final void A0U() {
        AnonymousClass29D r0 = this.A0I;
        if (r0 != null) {
            boolean A0C2 = r0.A0C();
            ImageButton imageButton = this.A0q;
            int i2 = R.drawable.ic_pip_play;
            if (A0C2) {
                i2 = R.drawable.ic_pip_pause;
            }
            imageButton.setImageResource(i2);
            Context context = getContext();
            int i3 = R.string.str1d62;
            if (A0C2) {
                i3 = R.string.str0f30;
            }
            String string = context.getString(i3);
            imageButton.setContentDescription(string);
            ImageButton imageButton2 = this.A0r;
            int i4 = R.drawable.ic_video_play_conv;
            if (A0C2) {
                i4 = R.drawable.ic_video_pause_conv;
            }
            imageButton2.setImageResource(i4);
            imageButton2.setContentDescription(string);
        }
    }

    public void A0V(AnonymousClass29D r6) {
        A06();
        r6.A07();
        if (r6 instanceof C610837g) {
            this.A0R = true;
            this.A0q.setImageResource(R.drawable.ic_pip_replay);
            this.A0r.setImageResource(R.drawable.ic_video_restart);
        } else {
            this.A0Q = true;
            r6.A0A(0);
            A0U();
            if (this.A0T && this.A0N) {
                this.A0g.setVisibility(0);
                this.A0f.setVisibility(8);
                this.A0r.setVisibility(8);
            }
        }
        this.A0v.setProgress(0);
        this.A0w.setProgress(0);
        this.A0y.setText(C46212Cy.A00(this.A17, this.A18, 0));
        A07(500);
        if (!A0A()) {
            A0L();
        }
        C85464Oo r2 = this.A12;
        if (r2 != null) {
            C87394Wp r1 = r2.A09;
            if (r1.A02) {
                r1.A00();
            }
            r2.A03 = true;
        }
    }

    public final boolean A0W() {
        return getResources().getConfiguration().orientation == 2;
    }

    public final boolean A0X() {
        int i2 = this.A0X;
        return (i2 == 1 || i2 == 7 || i2 == 4) ? false : true;
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0J;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0J = r0;
        }
        return r0.generatedComponent();
    }

    public List getFullscreenControls() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A13);
        arrayList.add(this.A0j);
        arrayList.add(this.A0q);
        arrayList.add(this.A0u);
        return arrayList;
    }

    public List getInlineControls() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A0p);
        arrayList.add(this.A0k);
        arrayList.add(this.A0v);
        return arrayList;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0Q();
        A0P();
        A0T();
    }

    public void setAuthorImage(Bitmap bitmap) {
        if (bitmap != null) {
            ImageView imageView = this.A0s;
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }

    public void setAuthorInformation(String str, C54292hA r5) {
        if (!TextUtils.isEmpty(str)) {
            this.A0x.setText(str);
            LinearLayout linearLayout = this.A0t;
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(r5, 1));
        }
    }

    public void setBlockPlayButtonInput(boolean z2) {
        this.A0K = z2;
    }

    public void setCloseButtonListener(C54292hA r4) {
        this.A0E = r4;
        this.A0j.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(this, 10));
        this.A0l.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(this, 7));
        this.A0n.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(this, 8));
    }

    public void setFullscreenButtonClickListener(C54292hA r4) {
        this.A0F = r4;
        this.A0k.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(this, 4));
        this.A0m.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(this, 6));
        this.A0o.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(this, 5));
    }

    public void setInStatus(boolean z2) {
        this.A0O = z2;
    }

    public void setMusicAttributionClickListener(C54292hA r4) {
        this.A0e.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(r4, 2));
        this.A10.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(r4, 49));
    }

    public void setPlayPauseListener(AnonymousClass5N6 r1) {
        this.A0H = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        if (r5.A0N == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPlayer(X.AnonymousClass29D r6) {
        /*
            r5 = this;
            r5.A0I = r6
            X.4Oo r0 = r5.A12
            if (r0 == 0) goto L_0x000e
            r1 = 0
            com.facebook.redex.IDxEListenerShape393S0100000_2_I0 r0 = new com.facebook.redex.IDxEListenerShape393S0100000_2_I0
            r0.<init>(r5, r1)
            r6.A02 = r0
        L_0x000e:
            android.widget.ImageButton r3 = r5.A0q
            android.content.Context r0 = r5.getContext()
            r4 = 2131889968(0x7f120f30, float:1.9414615E38)
            java.lang.String r0 = r0.getString(r4)
            r3.setContentDescription(r0)
            r0 = 3
            com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1 r2 = new com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1
            r2.<init>(r5, r0, r6)
            r3.setOnClickListener(r2)
            android.widget.ImageButton r1 = r5.A0r
            android.content.Context r0 = r5.getContext()
            java.lang.String r0 = r0.getString(r4)
            r1.setContentDescription(r0)
            r1.setOnClickListener(r2)
            r2 = 1
            r1.setClickable(r2)
            com.obwhatsapp.wds.components.button.WDSButton r4 = r5.A13
            boolean r0 = r5.A0X()
            if (r0 == 0) goto L_0x0048
            boolean r1 = r5.A0N
            r0 = 0
            if (r1 != 0) goto L_0x004a
        L_0x0048:
            r0 = 8
        L_0x004a:
            r4.setVisibility(r0)
            android.widget.ProgressBar r1 = r5.A0v
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.setMax(r0)
            r1.setSecondaryProgress(r0)
            android.widget.SeekBar r1 = r5.A0w
            r1.setMax(r0)
            X.4lY r0 = new X.4lY
            r0.<init>(r5, r6)
            r1.setOnSeekBarChangeListener(r0)
            X.53C r0 = new X.53C
            r0.<init>(r5, r6)
            r6.A04 = r0
            com.facebook.redex.IDxCListenerShape386S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape386S0100000_2_I0
            r0.<init>(r5, r2)
            r6.A01 = r0
            X.534 r0 = new X.534
            r0.<init>(r5, r6)
            r6.A00 = r0
            r5.A0U = r2
            android.os.Handler r1 = r5.A0Y
            r0 = 0
            r1.sendEmptyMessage(r0)
            r3.setClickable(r2)
            android.widget.ImageButton r0 = r5.A0k
            r0.setClickable(r2)
            android.widget.ImageButton r0 = r5.A0m
            r0.setClickable(r2)
            android.widget.ImageButton r0 = r5.A0o
            r0.setClickable(r2)
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x009a
            r5.A0Q()
        L_0x009a:
            r5.A0U()
            r5.A0R()
            r5.A0M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46202Cw.setPlayer(X.29D):void");
    }

    public void setPlayerElevation(int i2) {
        View A062;
        AnonymousClass29D r0 = this.A0I;
        if (r0 != null && (A062 = r0.A06()) != null && A062.getParent() != null) {
            C004601z.A0X((View) this.A0I.A06().getParent().getParent(), (float) i2);
        }
    }

    public void setVideoAttribution(String str) {
        String str2 = str;
        if (str != null) {
            this.A0e.setVisibility(0);
            AutoScrollView autoScrollView = this.A10;
            autoScrollView.setText(str2);
            IDxObjectShape260S0100000_2_I0 iDxObjectShape260S0100000_2_I0 = new IDxObjectShape260S0100000_2_I0(this, 1);
            if (!autoScrollView.A01) {
                autoScrollView.A01 = true;
                WaTextView waTextView = autoScrollView.A0B;
                boolean z2 = false;
                waTextView.setVisibility(0);
                WaTextView waTextView2 = autoScrollView.A0A;
                if (!C004601z.A0u(waTextView2) || waTextView2.isLayoutRequested()) {
                    waTextView2.addOnLayoutChangeListener(new IDxCListenerShape83S0200000_1_I0(autoScrollView, 1, iDxObjectShape260S0100000_2_I0));
                    return;
                }
                if (C004601z.A06(autoScrollView.getRootView()) == 0) {
                    z2 = true;
                }
                autoScrollView.A03 = z2;
                HorizontalScrollView horizontalScrollView = autoScrollView.A00;
                C004601z.A0f(horizontalScrollView, z2 ^ true ? 1 : 0);
                int width = waTextView2.getWidth() + autoScrollView.A06;
                int i2 = 1;
                if (autoScrollView.A03) {
                    i2 = -1;
                }
                int i3 = -i2;
                int i4 = autoScrollView.A04;
                int i5 = autoScrollView.A07;
                int i6 = i4 + width + i5;
                int i7 = autoScrollView.A05;
                if (i6 < i7) {
                    ViewGroup.LayoutParams layoutParams = waTextView2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = i6;
                        waTextView2.setLayoutParams(layoutParams);
                        ViewGroup.LayoutParams layoutParams2 = horizontalScrollView.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = -2;
                            horizontalScrollView.setLayoutParams(layoutParams2);
                            waTextView2.setTranslationX((float) (i5 * i3));
                            waTextView.setVisibility(8);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else {
                    autoScrollView.A02 = true;
                    ViewGroup.LayoutParams layoutParams3 = horizontalScrollView.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.width = i7;
                        horizontalScrollView.setLayoutParams(layoutParams3);
                        float f2 = (float) ((i4 + i5) * i3);
                        long j2 = autoScrollView.A08 * ((long) (width / i7));
                        waTextView2.setTranslationX(f2);
                        waTextView.setTranslationX(waTextView2.getTranslationX() + ((float) (width * i3)));
                        AutoScrollView.A00(autoScrollView, f2, width, i2, i3, j2);
                        if (i4 > 0) {
                            horizontalScrollView.setHorizontalFadingEdgeEnabled(true);
                            horizontalScrollView.setFadingEdgeLength(i4);
                            horizontalScrollView.requestLayout();
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                horizontalScrollView.post(new RunnableRunnableShape6S0100000_I0_5(autoScrollView, 45));
                iDxObjectShape260S0100000_2_I0.AIT();
                return;
            }
            return;
        }
        this.A0e.setVisibility(8);
    }

    public void setVideoCaption(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ReadMoreTextView readMoreTextView = this.A11;
            readMoreTextView.setText(charSequence);
            readMoreTextView.setVisibility(0);
            readMoreTextView.setOnTouchListener(new IDxTListenerShape167S0100000_2_I0(this, 15));
        }
    }

    public void setWatchMoreVideosText(String str) {
        if (str != null) {
            this.A15.setText(str);
        }
    }
}
