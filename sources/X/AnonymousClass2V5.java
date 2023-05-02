package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.AssemMods.translator.Language;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import java.util.HashMap;

/* renamed from: X.2V5  reason: invalid class name */
public class AnonymousClass2V5 {
    public static final Interpolator A0N = C04240Lt.A00(0.33f, 1.0f, 0.68f, 1.0f);
    public static final HashMap A0O;
    public static final HashMap A0P = new HashMap();
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03 = 0;
    public Animation A04;
    public Animation A05;
    public CircularProgressBar A06;
    public boolean A07 = false;
    public boolean A08;
    public final Context A09;
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final WaImageView A0F;
    public final WaImageView A0G;
    public final WaImageView A0H;
    public final WaImageView A0I;
    public final WaImageView A0J;
    public final AnonymousClass2Qt A0K;
    public final boolean A0L;
    public final boolean A0M;

    static {
        HashMap hashMap = new HashMap();
        A0O = hashMap;
        Integer valueOf = Integer.valueOf(R.string.str0902);
        hashMap.put("off", valueOf);
        hashMap.put("on", Integer.valueOf(R.string.str0904));
        hashMap.put(Language.AUTO_DETECT, Integer.valueOf(R.string.str08ff));
        hashMap.put("torch", valueOf);
    }

    public AnonymousClass2V5(View view, AnonymousClass2Qt r13, boolean z2) {
        int i2 = 0;
        this.A0A = view;
        this.A09 = view.getContext();
        this.A0B = C004601z.A0E(view, R.id.fake_flash);
        WaImageView waImageView = (WaImageView) C004601z.A0E(view, R.id.flash_btn);
        this.A0G = waImageView;
        WaImageView waImageView2 = (WaImageView) C004601z.A0E(view, R.id.switch_camera_btn);
        this.A0J = waImageView2;
        this.A0I = (WaImageView) C004601z.A0E(view, R.id.shutter);
        this.A0H = (WaImageView) C004601z.A0E(view, R.id.gallery_btn);
        this.A0F = (WaImageView) C004601z.A0E(view, R.id.close_camera_btn);
        this.A0E = (TextView) C004601z.A0E(view, R.id.recording_hint);
        this.A0C = C004601z.A0E(view, R.id.select_multiple);
        this.A0D = (TextView) C004601z.A0E(view, R.id.selected_count);
        this.A0L = z2;
        this.A0K = r13;
        boolean z3 = r13.getNumberOfCameras() > 1;
        this.A0M = z3;
        waImageView2.setVisibility(z3 ? 0 : 8);
        waImageView.setVisibility(r13.getStoredFlashModeCount() <= 1 ? 8 : i2);
        HashMap hashMap = A0P;
        boolean z4 = this.A0L;
        hashMap.put("off", Integer.valueOf(z4 ? R.drawable.ic_flash_off : R.drawable.flash_off));
        hashMap.put("on", Integer.valueOf(z4 ? R.drawable.ic_flash_on : R.drawable.flash_on));
        hashMap.put(Language.AUTO_DETECT, Integer.valueOf(z4 ? R.drawable.ic_flash_auto : R.drawable.flash_auto));
        hashMap.put("torch", Integer.valueOf(z4 ? R.drawable.ic_flash_off : R.drawable.flash_off));
        if (this.A0L) {
            this.A04 = new AlphaAnimation(0.0f, 1.0f);
            this.A05 = new AlphaAnimation(1.0f, 0.0f);
        } else {
            this.A04 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            this.A05 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        }
        this.A04.setDuration(200);
        this.A05.setDuration(200);
        AnonymousClass2Qt r5 = this.A0K;
        this.A0J.setContentDescription(this.A0A.getContext().getResources().getString(r5.AIs() ? R.string.str172f : R.string.str1730));
        WaImageView waImageView3 = this.A0I;
        waImageView3.setEnabled(false);
        this.A0J.setEnabled(false);
        this.A0G.setEnabled(false);
        A05(r5.getFlashMode());
        if (this.A0L) {
            waImageView3.setImageDrawable(AnonymousClass00T.A04(this.A09, R.drawable.shutter_button_background));
            this.A0E.setVisibility(8);
            C004601z.A0j(waImageView3, new IDxDCompatShape22S0100000_2_I0(this, 7));
            waImageView3.setContentDescription(this.A09.getString(this.A08 ? R.string.str1623 : R.string.str1622));
        }
        if (this.A0L) {
            int dimensionPixelSize = this.A09.getResources().getDimensionPixelSize(R.dimen.dimen0743);
            this.A0I.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            CircularProgressBar circularProgressBar = (CircularProgressBar) C004601z.A0E(this.A0A, R.id.recording_progress);
            this.A06 = circularProgressBar;
            circularProgressBar.setMax(100);
            this.A06.setProgress(0);
            CircularProgressBar circularProgressBar2 = this.A06;
            circularProgressBar2.A05 = 0.1f;
            circularProgressBar2.A06 = 8.0f;
        } else {
            CircularProgressBar circularProgressBar3 = (CircularProgressBar) C004601z.A0E(this.A0A, R.id.recording_progress);
            this.A06 = circularProgressBar3;
            circularProgressBar3.setVisibility(8);
        }
        if (this.A0L) {
            WaImageView waImageView4 = this.A0J;
            Context context = this.A09;
            waImageView4.setImageDrawable(AnonymousClass2SR.A02(context, R.drawable.ic_flip_camera, R.color.color090b));
            WaImageView waImageView5 = this.A0F;
            Drawable A042 = AnonymousClass00T.A04(context, R.drawable.ic_close_camera);
            AnonymousClass00B.A06(A042);
            waImageView5.setImageDrawable(A042);
        }
    }

    public void A00() {
        WaImageView waImageView = this.A0I;
        waImageView.setActivated(false);
        waImageView.clearAnimation();
        if (this.A0L) {
            Context context = this.A09;
            float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.dimen0743);
            float f2 = 1.0f;
            if (this.A08) {
                f2 = 0.6f;
            }
            int i2 = (int) (dimensionPixelSize / f2);
            waImageView.setPadding(i2, i2, i2, i2);
            CircularProgressBar circularProgressBar = this.A06;
            if (circularProgressBar != null) {
                circularProgressBar.clearAnimation();
                circularProgressBar.setProgress(0);
                circularProgressBar.A09 = AnonymousClass00T.A00(context, R.color.color0726);
                circularProgressBar.requestLayout();
            }
        }
    }

    public final void A01() {
        AnonymousClass2Qt r2 = this.A0K;
        if (r2.getFlashModes().size() <= 1) {
            this.A0G.setVisibility(8);
            return;
        }
        this.A0G.setVisibility(0);
        A05(r2.getFlashMode());
    }

    public final void A02(float f2, float f3) {
        CircularProgressBar circularProgressBar;
        this.A0I.setActivated(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(220);
        scaleAnimation.setInterpolator(A0N);
        scaleAnimation.setFillAfter(true);
        if (this.A0L && (circularProgressBar = this.A06) != null) {
            circularProgressBar.A06 = f3 * 8.0f;
            circularProgressBar.A09 = AnonymousClass00T.A00(this.A09, R.color.color0725);
            circularProgressBar.startAnimation(scaleAnimation);
        }
    }

    public final void A03(float f2, float f3, boolean z2) {
        this.A0I.setActivated(z2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f3});
        ofFloat.setDuration(220);
        ofFloat.setInterpolator(A0N);
        ofFloat.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 8));
        ofFloat.start();
    }

    public final void A04(float f2, float f3, boolean z2) {
        WaImageView waImageView = this.A0I;
        waImageView.setActivated(z2);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(220);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        waImageView.startAnimation(scaleAnimation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0081, code lost:
        if (r0 == false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.String r7) {
        /*
            r6 = this;
            java.util.HashMap r0 = A0P
            java.lang.Object r0 = r0.get(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.util.HashMap r0 = A0O
            java.lang.Object r0 = r0.get(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            X.2Qt r0 = r6.A0K
            java.util.List r2 = r0.getFlashModes()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0087
            r1 = 0
        L_0x0025:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0078
            r1 = 2131888389(0x7f120905, float:1.9411412E38)
        L_0x0038:
            com.obwhatsapp.WaImageView r4 = r6.A0G
            X.AnonymousClass2JP.A03(r4, r1)
            android.content.Context r2 = r6.A09
            java.lang.String r0 = r2.getString(r5)
            r4.setContentDescription(r0)
            int r0 = r6.A01
            if (r0 == r3) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r2, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r2, r3)
            X.3LH r2 = new X.3LH
            r2.<init>(r1, r0)
            int r1 = r2.getIntrinsicHeight()
            int r0 = r4.getPaddingTop()
            int r1 = r1 + r0
            r0 = 120(0x78, float:1.68E-43)
            r2.A00 = r0
            r2.A01 = r1
            r0 = 0
            r2.A02 = r0
            r2.invalidateSelf()
            r4.setImageDrawable(r2)
        L_0x0071:
            r6.A01 = r3
            return
        L_0x0074:
            r4.setImageResource(r3)
            goto L_0x0071
        L_0x0078:
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r1)
            r1 = 2131888384(0x7f120900, float:1.9411402E38)
            if (r0 != 0) goto L_0x0038
        L_0x0083:
            r1 = 2131888387(0x7f120903, float:1.9411408E38)
            goto L_0x0038
        L_0x0087:
            int r0 = r2.indexOf(r7)
            int r1 = r0 + 1
            int r0 = r2.size()
            int r1 = r1 % r0
            java.lang.Object r1 = r2.get(r1)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2V5.A05(java.lang.String):void");
    }

    public void A06(boolean z2) {
        int i2 = 8;
        if (!z2) {
            WaImageView waImageView = this.A0J;
            waImageView.startAnimation(this.A05);
            waImageView.setVisibility(8);
        }
        WaImageView waImageView2 = this.A0G;
        Animation animation = this.A05;
        waImageView2.startAnimation(animation);
        waImageView2.setVisibility(8);
        WaImageView waImageView3 = this.A0H;
        waImageView3.startAnimation(animation);
        waImageView3.setVisibility(8);
        WaImageView waImageView4 = this.A0F;
        waImageView4.startAnimation(animation);
        waImageView4.setVisibility(8);
        TextView textView = this.A0E;
        if (!this.A0L) {
            i2 = 4;
        }
        textView.setVisibility(i2);
    }

    public void A07(boolean z2) {
        CircularProgressBar circularProgressBar;
        WaImageView waImageView = this.A0I;
        int i2 = 0;
        int i3 = 4;
        if (z2) {
            i3 = 0;
        }
        waImageView.setVisibility(i3);
        if (this.A0L && (circularProgressBar = this.A06) != null) {
            if (!z2) {
                i2 = 4;
            }
            circularProgressBar.setVisibility(i2);
        }
    }

    public final void A08(boolean z2) {
        if (this.A0L) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0C.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.A0J.getLayoutParams();
            int i2 = this.A02;
            if (i2 == 0) {
                i2 = layoutParams.bottomMargin;
                this.A02 = i2;
            }
            int i3 = layoutParams.bottomMargin;
            if (!z2) {
                i2 = layoutParams2.bottomMargin + layoutParams.height + C87594Xo.A00(this.A09, 8.0f);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i3, i2});
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.addUpdateListener(new C91044fH(layoutParams, this));
            ofInt.setDuration(150);
            ofInt.start();
        }
    }

    public void A09(boolean z2, int i2) {
        View view = this.A0C;
        if (z2) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.startAnimation(this.A04);
            }
            TextView textView = this.A0D;
            textView.setText(String.valueOf(i2));
            textView.setContentDescription(textView.getResources().getQuantityString(R.plurals.plurals00dc, i2, new Object[]{Integer.valueOf(i2)}));
        } else if (view.getVisibility() != 8) {
            view.setVisibility(8);
            view.startAnimation(this.A05);
        }
    }
}
