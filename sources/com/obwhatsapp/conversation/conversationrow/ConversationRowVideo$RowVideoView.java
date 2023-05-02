package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass2SR;
import X.AnonymousClass3BL;
import X.AnonymousClass4Y4;
import X.C006002o;
import X.C13680ns;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import com.obwhatsapp.R;

public class ConversationRowVideo$RowVideoView extends C006002o implements AnonymousClass006 {
    public int A00;
    public int A01;
    public Paint A02;
    public RectF A03;
    public Shader A04;
    public Drawable A05;
    public AnonymousClass3BL A06;
    public C52662eE A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;

    public ConversationRowVideo$RowVideoView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A09) {
            this.A09 = true;
            generatedComponent();
        }
        this.A02 = C13680ns.A0E();
        this.A03 = AnonymousClass000.A0K();
        A01();
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        this.A02 = C13680ns.A0E();
        this.A03 = AnonymousClass000.A0K();
        A01();
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A09) {
            this.A09 = true;
            generatedComponent();
        }
        this.A02 = C13680ns.A0E();
        this.A03 = AnonymousClass000.A0K();
        A01();
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A09) {
            this.A09 = true;
            generatedComponent();
        }
    }

    public final void A00() {
        boolean z2 = this.A0A;
        Context context = getContext();
        Drawable A012 = z2 ? AnonymousClass4Y4.A01(context) : AnonymousClass4Y4.A00(context);
        this.A05 = A012;
        if (this.A0B) {
            Context context2 = getContext();
            boolean z3 = this.A0A;
            int i2 = R.color.color00c7;
            if (z3) {
                i2 = R.color.color00c9;
            }
            AnonymousClass2SR.A06(A012, AnonymousClass00T.A00(context2, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            int r3 = X.C31171dd.A00(r0)
            X.3BL r0 = r4.A06
            if (r0 == 0) goto L_0x003f
            X.0ta r0 = r0.A00
            if (r0 == 0) goto L_0x003f
            X.0ta r2 = new X.0ta
            r2.<init>(r0)
        L_0x0015:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0029
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0029
            X.3p3 r1 = new X.3p3
            r1.<init>(r3)
            r4.A06 = r1
        L_0x0024:
            if (r2 == 0) goto L_0x0028
            r1.A00 = r2
        L_0x0028:
            return
        L_0x0029:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0035
            X.3p4 r1 = new X.3p4
            r1.<init>(r3)
            r4.A06 = r1
            goto L_0x0024
        L_0x0035:
            boolean r0 = r4.A0D
            X.3p8 r1 = new X.3p8
            r1.<init>(r3, r0)
            r4.A06 = r1
            goto L_0x0024
        L_0x003f:
            r2 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView.A01():void");
    }

    public void A02(int i2, int i3, boolean z2) {
        int i4;
        int i5 = this.A01;
        if (i5 <= 0 || (i4 = this.A00) <= 0 || z2) {
            hashCode();
            this.A01 = i2;
            i5 = i2;
            this.A00 = i3;
            i4 = i3;
        }
        this.A06.A09(i5, i4);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A07;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public int getRowWidth() {
        return this.A06.A03();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode()) {
            float dimension = getResources().getDimension(R.dimen.dimen028c);
            int width = getWidth();
            Paint paint = this.A02;
            paint.setColor(1711276032);
            paint.setShader(this.A04);
            paint.setStyle(Paint.Style.FILL);
            RectF rectF = this.A03;
            rectF.set(0.0f, ((float) getHeight()) - ((dimension * 4.0f) / 3.0f), (float) width, (float) getHeight());
            canvas.drawRect(rectF, paint);
            if (this.A05 != null && !this.A08) {
                RectF rectF2 = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
                this.A05.setBounds(new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom)));
                this.A05.draw(canvas);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (!isInEditMode()) {
            if (getDrawable() == null || (getDrawable() instanceof ColorDrawable)) {
                i4 = this.A01;
                i5 = this.A00;
            } else {
                i4 = getDrawable().getIntrinsicWidth();
                i5 = getDrawable().getIntrinsicHeight();
            }
            AnonymousClass3BL r0 = this.A06;
            r0.A09(i4, i5);
            Pair A072 = r0.A07(i2, i3);
            setMeasuredDimension(AnonymousClass000.A0D(A072.first), AnonymousClass000.A0D(A072.second));
        } else if (this.A0C) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(600, 600);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (!isInEditMode()) {
            float f2 = (float) i3;
            this.A04 = new LinearGradient(0.0f, f2 - ((getResources().getDimension(R.dimen.dimen028c) * 4.0f) / 3.0f), 0.0f, f2, 0, -16777216, Shader.TileMode.CLAMP);
        }
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A05 = drawable;
    }

    public void setFullWidth(boolean z2) {
        this.A08 = z2;
        A01();
    }

    public void setIsOutgoing(boolean z2) {
        this.A0A = z2;
    }

    public void setKeepRatio(boolean z2) {
        this.A0C = z2;
        A01();
    }

    public void setPortraitPreviewEnabled(boolean z2) {
        this.A0D = z2;
        A01();
    }
}
