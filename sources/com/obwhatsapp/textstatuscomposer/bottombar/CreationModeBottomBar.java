package com.obwhatsapp.textstatuscomposer.bottombar;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass04h;
import X.AnonymousClass0GT;
import X.AnonymousClass1w8;
import X.AnonymousClass2ZP;
import X.AnonymousClass3Cz;
import X.AnonymousClass4X6;
import X.AnonymousClass4Y7;
import X.AnonymousClass4Zg;
import X.C004601z;
import X.C015807o;
import X.C16150sX;
import X.C19980zJ;
import X.C41581wC;
import X.C41621wG;
import X.C447725m;
import X.C49132Rg;
import X.C49332Sl;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C612838h;
import X.C78553yH;
import X.C812847o;
import X.C87594Xo;
import X.C88974bO;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.mediacomposer.bottombar.recipients.RecipientsView;

public class CreationModeBottomBar extends FrameLayout implements C41621wG, AnonymousClass006 {
    public float A00;
    public float A01;
    public LayerDrawable A02;
    public View A03;
    public ImageButton A04;
    public ImageButton A05;
    public TextView A06;
    public AnonymousClass4X6 A07;
    public C49332Sl A08;
    public AnonymousClass2ZP A09;
    public WaTextView A0A;
    public AnonymousClass01V A0B;
    public AnonymousClass013 A0C;
    public RecipientsView A0D;
    public C41581wC A0E;
    public C612838h A0F;
    public C52662eE A0G;
    public boolean A0H;
    public boolean A0I;

    public CreationModeBottomBar(Context context) {
        super(context);
        A00();
        this.A0E = null;
        this.A00 = -1.0f;
        A04(context);
    }

    public CreationModeBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0E = null;
        this.A00 = -1.0f;
        A04(context);
    }

    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A0E = null;
        this.A00 = -1.0f;
        A04(context);
    }

    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
        this.A0E = null;
        this.A00 = -1.0f;
        A04(context);
    }

    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A0H) {
            this.A0H = true;
            C52652eD r2 = (C52652eD) ((C52642eC) generatedComponent());
            C16150sX r1 = r2.A07;
            this.A0B = (AnonymousClass01V) r1.AOi.get();
            this.A0C = (AnonymousClass013) r1.AR8.get();
            C49132Rg r12 = r2.A05;
            this.A08 = (C49332Sl) r12.A0c.get();
            this.A09 = (AnonymousClass2ZP) r12.A0r.get();
        }
    }

    public final void A01() {
        this.A07.A04.clear();
        this.A07.A02(0.0d);
        this.A04.setScaleX(1.0f);
        this.A04.setScaleY(1.0f);
    }

    public final void A02(float f2) {
        this.A04.setTranslationX(f2);
        this.A0A.setTranslationX(f2);
        boolean z2 = !this.A0C.A0T();
        boolean z3 = true;
        float f3 = this.A00;
        if (!z2 ? f2 <= f3 : f2 >= f3) {
            z3 = false;
        }
        int i2 = 153;
        if (!z3) {
            i2 = (!(this.A0C.A0T() ^ true) ? f2 >= 0.0f : f2 <= 0.0f) ? 153 + Math.round((Math.abs(f2) / Math.abs(this.A00)) * 102.0f) : MotionEventCompat.ACTION_MASK;
        }
        int argb = Color.argb(i2, MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK);
        this.A0A.setTextColor(argb);
        AnonymousClass04h.A03(ColorStateList.valueOf(argb), this.A0A);
    }

    public final void A03(int i2) {
        this.A02.getDrawable(1).setAlpha(i2);
        this.A04.setBackground(this.A02);
    }

    public final void A04(Context context) {
        FrameLayout.inflate(context, R.layout.layout0201, this);
        this.A0D = (RecipientsView) C004601z.A0E(this, R.id.media_recipients);
        this.A03 = C004601z.A0E(this, R.id.old_recipients_container);
        this.A06 = (TextView) C004601z.A0E(this, R.id.privacy_text);
        this.A05 = (ImageButton) C004601z.A0E(this, R.id.send);
        this.A04 = (ImageButton) C004601z.A0E(this, R.id.mic_button);
        this.A0A = (WaTextView) C004601z.A0E(this, R.id.mic_slide_to_cancel);
        this.A05.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 28));
        setClipChildren(false);
        AnonymousClass4X6 A012 = C88974bO.A00().A01();
        this.A07 = A012;
        A012.A03 = new AnonymousClass4Zg(440.0d, 21.0d);
        this.A04.setOnTouchListener(new AnonymousClass3Cz(this));
        C004601z.A0j(this.A04, new IDxDCompatShape22S0100000_2_I0(this, 14));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen083b);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        shapeDrawable.getPaint().setColor(getResources().getColor(R.color.color08f2));
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        float f2 = (float) dimensionPixelSize;
        shapeDrawable.getPaint().setStrokeWidth(f2);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new OvalShape());
        shapeDrawable2.getPaint().setStrokeWidth(f2);
        shapeDrawable2.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        shapeDrawable2.getPaint().setColor(getResources().getColor(R.color.color04d1));
        this.A02 = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable});
        A03(0);
        this.A01 = ((float) ViewConfiguration.get(context).getScaledTouchSlop()) * 1.5f;
    }

    public void A4p(int i2, String str) {
        C812847o.A00(C19980zJ.A00(getContext()), this.A0B);
        this.A05.setVisibility(0);
        this.A05.setEnabled(true);
        this.A07.A04.clear();
        this.A07.A02(0.0d);
        this.A07.A03(new C78553yH(this));
    }

    public void A4q(int i2) {
        A01();
        A03(0);
        this.A05.setEnabled(true);
        this.A04.setAlpha(1.0f);
        this.A04.setTranslationX(0.0f);
        AnonymousClass4Y7.A00(this.A04, i2, true, true);
        AnonymousClass4Y7.A00(this.A05, i2, false, true);
    }

    public void AHo() {
        AnonymousClass0GT r2 = new AnonymousClass0GT(3);
        r2.A04(300);
        r2.A06(this.A03);
        r2.A06(this.A0D);
        r2.A06(this.A0A);
        r2.A05(new DecelerateInterpolator());
        C015807o.A02(this, r2);
        this.A0A.setVisibility(8);
        View view = this.A03;
        int i2 = 8;
        int i3 = 0;
        if (this.A0I) {
            i3 = 8;
        }
        view.setVisibility(i3);
        RecipientsView recipientsView = this.A0D;
        if (this.A0I) {
            i2 = 0;
        }
        recipientsView.setVisibility(i2);
    }

    public void Aed(int i2, String str) {
        this.A05.setScaleX(1.0f);
        this.A05.setScaleY(1.0f);
        this.A05.setEnabled(true);
        this.A05.setImageDrawable(new C447725m(AnonymousClass00T.A04(getContext(), i2), this.A0C));
        this.A05.setContentDescription(str);
        AnonymousClass4Y7.A01(this.A05, true, false);
        AnonymousClass4Y7.A01(this.A04, false, false);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0G;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0G = r0;
        }
        return r0.generatedComponent();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0E = null;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.A00 == -1.0f) {
            this.A00 = (float) (C87594Xo.A00(getContext(), 16.0f) - this.A0A.getLeft());
            if (this.A0C.A0T()) {
                this.A00 = -this.A00;
            }
        }
    }

    public void setNewRecipientsVisibility(boolean z2) {
        this.A0I = z2;
        View view = this.A03;
        int i2 = 8;
        int i3 = 0;
        if (z2) {
            i3 = 8;
        }
        view.setVisibility(i3);
        RecipientsView recipientsView = this.A0D;
        if (this.A0I) {
            i2 = 0;
        }
        recipientsView.setVisibility(i2);
        Resources resources = getResources();
        int i4 = R.color.color0544;
        if (z2) {
            i4 = R.color.color00b0;
        }
        setBackgroundColor(resources.getColor(i4));
    }

    public void setRecipientsListener(AnonymousClass1w8 r2) {
        this.A0D.setRecipientsListener(r2);
    }

    public void setRecordingState(float f2) {
        float width = ((float) this.A04.getWidth()) / 5.5f;
        boolean A0T = this.A0C.A0T();
        float f3 = this.A01;
        float f4 = f2 + (A0T ? f3 - width : (-f3) + width);
        if (!(!this.A0C.A0T()) ? f4 < 0.0f : f4 > 0.0f) {
            f4 = 0.0f;
        }
        boolean z2 = !this.A0C.A0T();
        float f5 = this.A00;
        if (!z2 ? f4 > f5 : f4 < f5) {
            f4 = f5;
        }
        A02(f4);
    }

    public void setStatusPrivacyText(CharSequence charSequence) {
        this.A06.setText(charSequence);
    }

    public void setUiCallbacks(C41581wC r1) {
        this.A0E = r1;
    }
}
