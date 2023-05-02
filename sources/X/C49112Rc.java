package X;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.util.DisplayMetrics;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.redex.IDxCListenerShape177S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape0S0110000_2_I0;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape0S0101001_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Rc  reason: invalid class name and case insensitive filesystem */
public class C49112Rc {
    public float A00 = 1.0f;
    public int A01 = -13381889;
    public int A02;
    public AnimatorSet A03;
    public AnonymousClass4XG A04;
    public AnonymousClass2Ra A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public boolean A0B = true;
    public final ValueAnimator A0C = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
    public final Animation A0D;
    public final Animation A0E;
    public final AnonymousClass29P A0F;
    public final AnonymousClass4ES A0G;
    public final TitleBarView A0H;

    public C49112Rc(AnonymousClass29P r5, AnonymousClass4ES r6, TitleBarView titleBarView) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A0D = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        this.A0E = alphaAnimation2;
        this.A0F = r5;
        this.A0H = titleBarView;
        this.A0G = r6;
        alphaAnimation.setDuration(300);
        alphaAnimation2.setDuration(300);
        titleBarView.A02 = (ImageView) C004601z.A0E(titleBarView, R.id.back);
        titleBarView.A08 = (WaButton) C004601z.A0E(titleBarView, R.id.done);
        titleBarView.A07 = (RelativeLayout) C004601z.A0E(titleBarView, R.id.tool_bar_extra);
        titleBarView.A01 = C004601z.A0E(titleBarView, R.id.undo);
        titleBarView.A00 = C004601z.A0E(titleBarView, R.id.title_bar);
        titleBarView.A05 = (ImageView) C004601z.A0E(titleBarView, R.id.pen);
        titleBarView.A06 = (ImageView) C004601z.A0E(titleBarView, R.id.shape);
        titleBarView.A09 = (WaTextView) C004601z.A0E(titleBarView, R.id.text);
        titleBarView.A03 = (ImageView) C004601z.A0E(titleBarView, R.id.crop);
        titleBarView.A04 = (ImageView) C004601z.A0E(titleBarView, R.id.delete);
        titleBarView.A0B = new AnonymousClass2VI(titleBarView.getContext(), R.drawable.ic_cam_draw);
        titleBarView.A0C = new AnonymousClass2VI(titleBarView.getContext(), R.drawable.ic_cam_sticker);
        titleBarView.A0D = new AnonymousClass2VI(titleBarView.getContext(), 0);
        DisplayMetrics displayMetrics = titleBarView.getContext().getResources().getDisplayMetrics();
        if (((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) < 360) {
            titleBarView.A02.setPadding(0, 0, 0, 0);
            titleBarView.A04.setPadding(0, 0, 0, 0);
            titleBarView.A03.setPadding(0, 0, 0, 0);
            titleBarView.A01.setPadding(0, 0, 0, 0);
        }
        titleBarView.A05.setImageDrawable(titleBarView.A0B);
        titleBarView.A06.setImageDrawable(titleBarView.A0C);
        titleBarView.A09.setBackground(titleBarView.A0D);
        ImageView imageView = titleBarView.A02;
        imageView.setImageDrawable(new C447725m(imageView.getDrawable(), titleBarView.A0A));
        titleBarView.A02.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 1));
        titleBarView.A08.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 0));
        titleBarView.A01.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 4));
        titleBarView.A01.setOnLongClickListener(new IDxCListenerShape177S0100000_2_I0(this, 4));
        titleBarView.A05.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 3));
        titleBarView.A06.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 5));
        titleBarView.A03.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 6));
        titleBarView.A09.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 2));
        titleBarView.A04.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 7));
    }

    public int A00() {
        return ((Number) this.A0F.A05.A01()).intValue();
    }

    public AnimatorSet A01(boolean z2) {
        AnimatorSet animatorSet = this.A03;
        if (animatorSet != null) {
            animatorSet.end();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A06 = new ArrayList();
        TitleBarView titleBarView = this.A0H;
        float shapeToolOffsetX = titleBarView.getShapeToolOffsetX();
        float textToolOffsetX = titleBarView.getTextToolOffsetX();
        float cropToolOffsetX = titleBarView.getCropToolOffsetX();
        float x2 = (((titleBarView.A01.getVisibility() == 8 || A00() != 1) ? titleBarView.A05.getX() : titleBarView.A09.getX() - titleBarView.A09.getTranslationX()) - titleBarView.A01.getX()) - titleBarView.A01.getTranslationX();
        float deleteToolOffsetX = titleBarView.getDeleteToolOffsetX();
        A02(shapeToolOffsetX, 40, z2).addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 14));
        A02(textToolOffsetX, 60, z2).addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 17));
        A02(cropToolOffsetX, 20, z2).addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 16));
        A02(x2, 20, z2).addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 18));
        A02(deleteToolOffsetX, 20, z2).addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 19));
        float[] fArr = new float[2];
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (z2) {
            f3 = 1.0f;
        }
        fArr[0] = f3;
        float f4 = 1.0f;
        if (z2) {
            f4 = 0.0f;
        }
        fArr[1] = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 20));
        ValueAnimator valueAnimator = this.A0C;
        valueAnimator.setDuration(400);
        if (z2) {
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new C016007q());
            this.A06.add(valueAnimator);
        } else {
            ofFloat.setDuration(500);
        }
        this.A06.add(ofFloat);
        if (!(A00() == 5 || A00() == 2)) {
            float[] fArr2 = new float[2];
            float f5 = 0.0f;
            if (z2) {
                f5 = 1.0f;
            }
            fArr2[0] = f5;
            if (z2) {
                f2 = 0.0f;
            }
            fArr2[1] = f2;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            ofFloat2.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 15));
            long j2 = 100;
            ofFloat2.setDuration(z2 ? 100 : 300);
            if (z2) {
                j2 = 0;
            }
            ofFloat2.setStartDelay(j2);
            ofFloat2.setInterpolator(z2 ? new C018608r() : new C016007q());
            this.A06.add(ofFloat2);
        }
        animatorSet2.playTogether(this.A06);
        animatorSet2.addListener(new IDxLAdapterShape0S0110000_2_I0(this, 3, z2));
        return animatorSet2;
    }

    public ValueAnimator A02(float f2, long j2, boolean z2) {
        TimeInterpolator A002;
        float[] fArr = new float[2];
        float f3 = -f2;
        if (z2) {
            f3 = 0.0f;
        }
        fArr[0] = f3;
        if (!z2) {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z2) {
            ofFloat.setDuration(300);
            A002 = new C016007q();
        } else {
            ofFloat.setDuration(500);
            ofFloat.setStartDelay(j2);
            A002 = C04240Lt.A00(0.5f, 1.35f, 0.4f, 1.0f);
        }
        ofFloat.setInterpolator(A002);
        this.A06.add(ofFloat);
        return ofFloat;
    }

    public void A03() {
        TitleBarView titleBarView = this.A0H;
        Animation animation = this.A0D;
        titleBarView.A00.setVisibility(4);
        titleBarView.A00.startAnimation(animation);
    }

    public void A04() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.A03;
        if (animatorSet2 != null && animatorSet2.isRunning() && this.A07) {
            this.A03.end();
        }
        if (!this.A09 || (animatorSet = this.A03) == null || animatorSet.isRunning()) {
            TitleBarView titleBarView = this.A0H;
            Animation animation = this.A0E;
            if (titleBarView.A00.getVisibility() != 0) {
                titleBarView.A00.setVisibility(0);
                titleBarView.A00.startAnimation(animation);
            }
        } else {
            this.A03.start();
            this.A07 = false;
        }
        this.A09 = false;
    }

    public void A05(float f2) {
        A04();
        this.A0F.A05(0);
        TitleBarView titleBarView = this.A0H;
        titleBarView.setShapeToolDrawableStrokePreview(false);
        titleBarView.setPenToolDrawableStrokePreview(false);
        titleBarView.A05.setSelected(false);
        titleBarView.A09.setSelected(false);
        titleBarView.A06.setSelected(false);
        titleBarView.A0C.A00(f2, 0);
        titleBarView.A0D.A00(f2, 0);
        titleBarView.A0B.A00(f2, 0);
        titleBarView.setBackButtonDrawable(R.drawable.ic_cam_close);
        this.A0A = true;
        this.A0B = true;
        titleBarView.A05.setVisibility(0);
        titleBarView.A09.setVisibility(0);
        titleBarView.A06.setVisibility(0);
        titleBarView.A05.setAlpha(1.0f);
        titleBarView.A09.setAlpha(1.0f);
        titleBarView.A03.setAlpha(1.0f);
        titleBarView.A06.setAlpha(1.0f);
        if (titleBarView.A03.getVisibility() != 8) {
            titleBarView.A03.setVisibility(0);
        }
    }

    public void A06(float f2, int i2) {
        if (!this.A0B || i2 == 0) {
            this.A0H.A0C.A00(f2, i2);
            return;
        }
        ValueAnimator valueAnimator = this.A0C;
        valueAnimator.addUpdateListener(new IDxUListenerShape0S0101001_2_I0(this, f2, i2, 2));
        valueAnimator.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 22));
        AnimatorSet A012 = A01(true);
        this.A03 = A012;
        A012.start();
        this.A07 = true;
    }

    public void A07(float f2, int i2, boolean z2, boolean z3) {
        this.A01 = i2;
        this.A00 = f2;
        boolean z4 = false;
        this.A0A = false;
        this.A0B = false;
        int A002 = A00();
        if (A002 == 0) {
            A05(f2);
        } else if (A002 == 1) {
            if (i2 == 0 || !this.A0A) {
                this.A0H.A0B.A00(f2, i2);
            } else {
                ValueAnimator valueAnimator = this.A0C;
                valueAnimator.addUpdateListener(new IDxUListenerShape0S0101001_2_I0(this, f2, i2, 0));
                valueAnimator.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 22));
                valueAnimator.start();
                this.A0A = false;
                this.A0B = true;
            }
            this.A0H.setPenToolDrawableStrokePreview(z2);
        } else if (A002 == 2) {
            A06(f2, i2);
            if (z2 && z3) {
                z4 = true;
            }
            this.A0H.setShapeToolDrawableStrokePreview(z4);
        }
    }

    public void A08(int i2) {
        if (i2 == 2 && A00() == 2) {
            A06(this.A00, this.A01);
            return;
        }
        AnonymousClass29P r1 = this.A0F;
        if (A00() == i2) {
            i2 = 0;
        }
        r1.A05(i2);
    }

    public void A09(int i2, float f2) {
        ValueAnimator valueAnimator;
        IDxUListenerShape0S0101001_2_I0 iDxUListenerShape0S0101001_2_I0;
        int A002 = A00();
        if (A002 != 1) {
            if (A002 == 3) {
                valueAnimator = this.A0C;
                iDxUListenerShape0S0101001_2_I0 = new IDxUListenerShape0S0101001_2_I0(this, f2, i2, 1);
            }
            this.A0C.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 22));
            AnimatorSet A012 = A01(true);
            this.A03 = A012;
            A012.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 23));
            this.A03.start();
            this.A07 = true;
        }
        valueAnimator = this.A0C;
        iDxUListenerShape0S0101001_2_I0 = new IDxUListenerShape0S0101001_2_I0(this, f2, i2, 0);
        valueAnimator.addUpdateListener(iDxUListenerShape0S0101001_2_I0);
        this.A0C.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 22));
        AnimatorSet A0122 = A01(true);
        this.A03 = A0122;
        A0122.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 23));
        this.A03.start();
        this.A07 = true;
    }
}
