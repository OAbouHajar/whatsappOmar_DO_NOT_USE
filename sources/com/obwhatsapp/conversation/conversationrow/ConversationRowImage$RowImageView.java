package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass3BL;
import X.AnonymousClass3L0;
import X.C006002o;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C16150sX;
import X.C16750ta;
import X.C26671Or;
import X.C447725m;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import com.obwhatsapp.R;

public class ConversationRowImage$RowImageView extends C006002o implements AnonymousClass006 {
    public Drawable A00;
    public C16750ta A01;
    public AnonymousClass3BL A02;
    public AnonymousClass013 A03;
    public C14710pd A04;
    public C26671Or A05;
    public C52662eE A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Matrix A0F;
    public final RectF A0G;
    public final RectF A0H;

    public ConversationRowImage$RowImageView(Context context) {
        super(context, (AttributeSet) null);
        A00();
        this.A0A = false;
        this.A0H = AnonymousClass000.A0K();
        this.A0G = AnonymousClass000.A0K();
        this.A0F = AnonymousClass000.A0H();
        A02();
        A03();
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0A = false;
        this.A0H = AnonymousClass000.A0K();
        this.A0G = AnonymousClass000.A0K();
        this.A0F = AnonymousClass000.A0H();
        A02();
        A03();
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A0A = false;
        this.A0H = AnonymousClass000.A0K();
        this.A0G = AnonymousClass000.A0K();
        this.A0F = AnonymousClass000.A0H();
        A02();
        A03();
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A09) {
            this.A09 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A04 = C16150sX.A0k(A002);
            this.A03 = C16150sX.A0Z(A002);
            this.A05 = (C26671Or) A002.A7T.get();
        }
    }

    public final void A01() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF A052 = this.A02.A05(measuredWidth, measuredHeight);
        RectF rectF = new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight);
        if (A052 != null) {
            RectF rectF2 = this.A0G;
            rectF2.set(A052);
            RectF rectF3 = this.A0H;
            rectF3.set(rectF);
            Matrix matrix = this.A0F;
            matrix.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
            setImageMatrix(matrix);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r4 = this;
            X.1Or r0 = r4.A05
            if (r0 == 0) goto L_0x0040
            boolean r1 = r4.A0B
            boolean r0 = r4.A0C
            android.content.Context r2 = r4.getContext()
            if (r1 == 0) goto L_0x0046
            if (r0 == 0) goto L_0x0041
            r0 = 2131230938(0x7f0800da, float:1.8077943E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r2, r0)
            r0 = 2131099848(0x7f0600c8, float:1.781206E38)
        L_0x001a:
            int r0 = X.AnonymousClass00T.A00(r2, r0)
            X.AnonymousClass00B.A06(r1)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass2SR.A06(r1, r0)
        L_0x0025:
            r4.A00 = r3
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0040
            android.content.Context r2 = r4.getContext()
            boolean r1 = r4.A0B
            r0 = 2131099847(0x7f0600c7, float:1.7812059E38)
            if (r1 == 0) goto L_0x0039
            r0 = 2131099849(0x7f0600c9, float:1.7812063E38)
        L_0x0039:
            int r0 = X.AnonymousClass00T.A00(r2, r0)
            X.AnonymousClass2SR.A06(r3, r0)
        L_0x0040:
            return
        L_0x0041:
            android.graphics.drawable.Drawable r3 = X.AnonymousClass4Y4.A01(r2)
            goto L_0x0025
        L_0x0046:
            if (r0 == 0) goto L_0x0053
            r0 = 2131230937(0x7f0800d9, float:1.807794E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r2, r0)
            r0 = 2131099846(0x7f0600c6, float:1.7812057E38)
            goto L_0x001a
        L_0x0053:
            android.graphics.drawable.Drawable r3 = X.AnonymousClass4Y4.A00(r2)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.ConversationRowImage$RowImageView.A02():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r5 = this;
            android.content.Context r0 = r5.getContext()
            int r4 = X.C31171dd.A00(r0)
            X.3BL r0 = r5.A02
            if (r0 == 0) goto L_0x005c
            X.0ta r0 = r0.A00
            if (r0 == 0) goto L_0x005c
            X.0ta r3 = new X.0ta
            r3.<init>(r0)
        L_0x0015:
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0031
            android.app.Activity r0 = X.C19980zJ.A02(r5)
            android.view.View r0 = X.C13690nt.A0J(r0)
            int r0 = r0.getHeight()
            X.3p5 r2 = new X.3p5
            r2.<init>(r4, r0)
            r5.A02 = r2
        L_0x002c:
            if (r3 == 0) goto L_0x0030
            r2.A00 = r3
        L_0x0030:
            return
        L_0x0031:
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0049
            X.0pd r2 = r5.A04
            r1 = 2537(0x9e9, float:3.555E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0049
            X.3p7 r2 = new X.3p7
            r2.<init>(r4)
            r5.A02 = r2
            goto L_0x002c
        L_0x0049:
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x0059
            X.4RB r1 = X.C603531c.A04
        L_0x004f:
            X.4RB r0 = X.C603531c.A02
            X.31c r2 = new X.31c
            r2.<init>(r1, r0, r4)
            r5.A02 = r2
            goto L_0x002c
        L_0x0059:
            X.4RB r1 = X.C603531c.A03
            goto L_0x004f
        L_0x005c:
            r3 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.ConversationRowImage$RowImageView.A03():void");
    }

    public void A04(int i2, int i3) {
        C16750ta r0 = this.A01;
        r0.A08 = i2;
        r0.A06 = i3;
        setImageData(r0);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A06;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public int getRowWidth() {
        return this.A02.A03();
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!isInEditMode()) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int A042 = C13690nt.A04(this);
            int height = getHeight() - getPaddingBottom();
            Context context = getContext();
            AnonymousClass00B.A06(context);
            C26671Or r8 = this.A05;
            if (r8 != null) {
                if (this.A07) {
                    Drawable drawable2 = r8.A01;
                    if (drawable2 == null) {
                        drawable2 = new C447725m(context.getResources().getDrawable(R.drawable.balloon_media_botshade), r8.A02);
                        r8.A01 = drawable2;
                    }
                    if (C13680ns.A1Z(this.A03)) {
                        drawable2.setBounds(A042 - drawable2.getIntrinsicWidth(), height - drawable2.getIntrinsicHeight(), A042, height);
                    } else {
                        drawable2.setBounds(paddingLeft, height - drawable2.getIntrinsicHeight(), drawable2.getIntrinsicWidth() + paddingLeft, height);
                    }
                    drawable2.draw(canvas);
                }
                if (!this.A08 && (drawable = this.A00) != null) {
                    drawable.setBounds(paddingLeft, paddingTop, A042, height);
                    this.A00.draw(canvas);
                }
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        A01();
    }

    public void onMeasure(int i2, int i3) {
        int A0D2;
        int A0D3;
        if (isInEditMode()) {
            A0D2 = 800;
            A0D3 = 600;
        } else {
            Pair A072 = this.A02.A07(i2, i3);
            A0D2 = AnonymousClass000.A0D(A072.first);
            A0D3 = AnonymousClass000.A0D(A072.second);
        }
        setMeasuredDimension(A0D2, A0D3);
    }

    public void setFullWidth(boolean z2) {
        this.A08 = z2;
        A03();
    }

    public void setHasLabels(boolean z2) {
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageDrawable(bitmap == null ? null : new AnonymousClass3L0(C13680ns.A0D(this), bitmap, this));
        A01();
    }

    public void setImageData(C16750ta r3) {
        this.A01 = r3;
        this.A02.A00 = new C16750ta(r3);
    }

    public void setOutgoing(boolean z2) {
        if (this.A0B != z2) {
            this.A0B = z2;
            A02();
        }
    }

    public void setPaddingOnTopOnly(boolean z2) {
        if (z2 != this.A0C) {
            this.A0C = z2;
            A02();
        }
    }

    public void setPortraitPreviewEnabled(boolean z2) {
        this.A0D = z2;
        A03();
    }

    public void setTemplateImageRatio(boolean z2) {
        this.A0E = z2;
        A03();
    }
}
