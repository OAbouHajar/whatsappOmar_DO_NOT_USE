package com.obwhatsapp.wds.components.profilephoto;

import X.AnonymousClass013;
import X.AnonymousClass2IH;
import X.AnonymousClass2Xe;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.AnonymousClass3LA;
import X.AnonymousClass41N;
import X.AnonymousClass42X;
import X.AnonymousClass4B2;
import X.AnonymousClass4QW;
import X.AnonymousClass4X6;
import X.C003101j;
import X.C106685Eu;
import X.C109105Qs;
import X.C13680ns;
import X.C13690nt;
import X.C15220qW;
import X.C18450wi;
import X.C32521gW;
import X.C54392hN;
import X.C64353Ok;
import X.C79463zx;
import X.C800242g;
import X.C801342r;
import X.C813447u;
import X.C813547v;
import X.C87184Vt;
import X.C88804b7;
import X.C89264br;
import X.C89594cV;
import X.C95794nI;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class WDSProfilePhoto extends C64353Ok implements C109105Qs {
    public AnonymousClass013 A00;
    public AnonymousClass41N A01;
    public C801342r A02;
    public C800242g A03;
    public AnonymousClass2IH A04;
    public C813447u A05;
    public boolean A06;
    public final C15220qW A07;
    public final C15220qW A08;
    public final C15220qW A09;
    public final C15220qW A0A;
    public final C15220qW A0B;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSProfilePhoto(Context context) {
        this(context, (AttributeSet) null);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSProfilePhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18450wi.A0H(context, 1);
        this.A07 = AnonymousClass3K3.A0t(11);
        this.A09 = AnonymousClass3K3.A0t(13);
        this.A08 = AnonymousClass3K3.A0t(12);
        C15220qW A002 = C32521gW.A00(new C106685Eu(context, this));
        this.A0B = A002;
        this.A0A = A002;
        this.A01 = AnonymousClass41N.NONE;
        C800242g r3 = C800242g.A03;
        this.A03 = r3;
        C801342r r7 = C801342r.CIRCLE;
        this.A02 = r7;
        this.A05 = new C79463zx(AnonymousClass42X.A03);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4B2.A02, 0, 0);
            C18450wi.A0B(obtainStyledAttributes);
            int i2 = obtainStyledAttributes.getInt(2, 2);
            C800242g[] values = C800242g.values();
            if (i2 >= 0) {
                C18450wi.A0H(values, 0);
                if (i2 <= values.length - 1) {
                    r3 = values[i2];
                }
            }
            setProfilePhotoSize(r3);
            int i3 = obtainStyledAttributes.getInt(1, -1);
            C801342r[] values2 = C801342r.values();
            if (i3 >= 0) {
                C18450wi.A0H(values2, 0);
                if (i3 <= values2.length - 1) {
                    r7 = values2[i3];
                }
            }
            setProfilePhotoShape(r7);
            setStatusIndicatorEnabled(obtainStyledAttributes.getBoolean(3, false));
            setProfileBadge((AnonymousClass2IH) C003101j.A06((List) AnonymousClass2IH.A02.getValue(), obtainStyledAttributes.getInt(0, -1)));
            obtainStyledAttributes.recycle();
        }
        setCropToPadding(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSProfilePhoto(Context context, AttributeSet attributeSet, int i2, C54392hN r5) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }

    private final RectF getDrawRectF() {
        return (RectF) this.A07.getValue();
    }

    private final C89264br getMarginOffsets() {
        return (C89264br) this.A08.getValue();
    }

    private final C89264br getOriginalMargins() {
        return (C89264br) this.A09.getValue();
    }

    private final C88804b7 getProfilePhotoRenderer() {
        return (C88804b7) this.A0A.getValue();
    }

    public final void A00(AnonymousClass41N r8, boolean z2) {
        double d2;
        C18450wi.A0H(r8, 0);
        this.A01 = r8;
        C88804b7 profilePhotoRenderer = getProfilePhotoRenderer();
        AnonymousClass41N r5 = this.A01;
        C18450wi.A0H(r5, 0);
        C95794nI r4 = profilePhotoRenderer.A0K;
        switch (r5.ordinal()) {
            case 0:
                d2 = 0.0d;
                break;
            case 1:
                if (r4.A04 == null) {
                    AnonymousClass2IH r3 = (AnonymousClass2IH) r4.A0B.getValue();
                    Context context = r4.A07;
                    AnonymousClass4QW r1 = r4.A05;
                    C18450wi.A0H(r3, 0);
                    C18450wi.A0H(r1, 2);
                    r4.A04 = new AnonymousClass3LA(context, r1, r3);
                }
                d2 = 1.0d;
                break;
            default:
                throw new AnonymousClass2Xe();
        }
        AnonymousClass4X6 r0 = (AnonymousClass4X6) r4.A0C.getValue();
        if (z2) {
            r0.A02(d2);
            return;
        }
        r0.A01(d2);
        r4.A00 = r5;
    }

    public final AnonymousClass2IH getProfileBadge() {
        return this.A04;
    }

    public final AnonymousClass41N getProfilePhotoSelectionState() {
        return this.A01;
    }

    public final C801342r getProfilePhotoShape() {
        return this.A02;
    }

    public final C800242g getProfilePhotoSize() {
        return this.A03;
    }

    public final C813447u getProfileStatus() {
        return this.A05;
    }

    public final boolean getStatusIndicatorEnabled() {
        return this.A06;
    }

    public final AnonymousClass013 getWhatsAppLocale() {
        AnonymousClass013 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18450wi.A03("whatsAppLocale");
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013e, code lost:
        if (r2 == false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025e, code lost:
        if (1 <= r6) goto L_0x023b;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r17) {
        /*
            r16 = this;
            r8 = 0
            r9 = r17
            X.C18450wi.A0H(r9, r8)
            r2 = r16
            X.4b7 r1 = r2.getProfilePhotoRenderer()
            android.widget.ImageView$ScaleType r0 = r2.getScaleType()
            X.C18450wi.A0B(r0)
            r1.A01 = r0
            X.4b7 r1 = r2.getProfilePhotoRenderer()
            r0 = 0
            r1.A00 = r0
            android.graphics.drawable.Drawable r1 = r2.getDrawable()
            if (r1 == 0) goto L_0x002e
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x026b
            X.4b7 r0 = r2.getProfilePhotoRenderer()
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            r0.A00 = r1
        L_0x002e:
            X.4b7 r11 = r2.getProfilePhotoRenderer()
            android.graphics.RectF r10 = r11.A0E
            r10.setEmpty()
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x0264
            android.graphics.RectF r0 = r11.A0I
            r10.set(r0)
            X.4W8 r0 = r11.A04
            float r1 = r0.A01
            r0 = 2
            float r12 = (float) r0
            float r1 = r1 / r12
            r10.inset(r1, r1)
            android.graphics.Path r2 = r11.A0B
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x005f
            X.42r r0 = r11.A02
            X.4SW r0 = r0.A00()
            android.graphics.Path r0 = r0.A00(r10)
            r2.addPath(r0)
        L_0x005f:
            X.47u r1 = r11.A05
            boolean r0 = r1 instanceof X.C79463zx
            if (r0 == 0) goto L_0x01c8
            X.0qW r0 = r11.A0P
            X.AnonymousClass3K4.A0k(r9, r2, r0)
        L_0x006a:
            android.graphics.RectF r0 = r11.A0G
            r10.set(r0)
            X.4W8 r0 = r11.A04
            float r0 = r0.A00
            r10.inset(r0, r0)
        L_0x0076:
            android.graphics.Path r5 = r11.A0A
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x008b
            X.42r r0 = r11.A02
            X.4SW r0 = r0.A00()
            android.graphics.Path r0 = r0.A00(r10)
            r5.addPath(r0)
        L_0x008b:
            android.graphics.drawable.BitmapDrawable r0 = r11.A00
            if (r0 == 0) goto L_0x0116
            android.graphics.Bitmap r4 = r0.getBitmap()
            if (r4 == 0) goto L_0x0116
            android.graphics.RectF r3 = r11.A0F
            r3.set(r10)
            int r10 = r4.getWidth()
            int r12 = r4.getHeight()
            android.graphics.Rect r6 = r11.A0C
            r6.set(r8, r8, r10, r12)
            android.widget.ImageView$ScaleType r0 = r11.A01
            int[] r1 = X.AnonymousClass4A2.A00
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            r7 = 2
            if (r1 == r0) goto L_0x018e
            if (r1 == r7) goto L_0x0170
            float r2 = (float) r10
            float r0 = r3.height()
            float r2 = r2 * r0
            float r1 = (float) r12
            float r0 = r3.width()
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x014e
            int r0 = r6.height()
            float r2 = (float) r0
            float r0 = r3.width()
            float r2 = r2 * r0
            float r0 = r3.height()
            float r2 = r2 / r0
            int r0 = r6.centerX()
            float r1 = (float) r0
            float r0 = (float) r7
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r0 = (int) r1
            r6.left = r0
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.right = r0
        L_0x00e7:
            r0 = 31
            r10 = 0
            int r7 = r9.saveLayer(r3, r10, r0)
            r9.drawARGB(r8, r8, r8, r8)
            X.0qW r2 = r11.A0M
            X.AnonymousClass3K4.A0k(r9, r5, r2)
            java.lang.Object r1 = r2.getValue()
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            android.graphics.PorterDuffXfermode r0 = X.C88804b7.A0R
            r1.setXfermode(r0)
            java.lang.Object r0 = r2.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r9.drawBitmap(r4, r6, r3, r0)
            java.lang.Object r0 = r2.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setXfermode(r10)
            r9.restoreToCount(r7)
        L_0x0116:
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x011f
            X.0qW r0 = r11.A0N
            X.AnonymousClass3K4.A0k(r9, r5, r0)
        L_0x011f:
            X.4nI r3 = r11.A0K
            X.0qW r0 = r3.A0C
            java.lang.Object r0 = r0.getValue()
            X.4X6 r0 = (X.AnonymousClass4X6) r0
            boolean r0 = r0.A04()
            r2 = r0 ^ 1
            if (r2 != 0) goto L_0x0137
            X.41N r1 = r3.A00
            X.41N r0 = X.AnonymousClass41N.CHECKED
            if (r1 != r0) goto L_0x0140
        L_0x0137:
            X.3LA r0 = r3.A04
            if (r0 == 0) goto L_0x013e
            r0.draw(r9)
        L_0x013e:
            if (r2 != 0) goto L_0x0146
        L_0x0140:
            X.41N r1 = r3.A00
            X.41N r0 = X.AnonymousClass41N.NONE
            if (r1 != r0) goto L_0x014d
        L_0x0146:
            X.3LA r0 = r3.A03
            if (r0 == 0) goto L_0x014d
            r0.draw(r9)
        L_0x014d:
            return
        L_0x014e:
            int r0 = r6.width()
            float r2 = (float) r0
            float r0 = r3.height()
            float r2 = r2 * r0
            float r0 = r3.width()
            float r2 = r2 / r0
            int r0 = r6.centerY()
            float r1 = (float) r0
            float r0 = (float) r7
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r0 = (int) r1
            r6.top = r0
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.bottom = r0
            goto L_0x00e7
        L_0x0170:
            float r2 = r3.centerX()
            float r1 = (float) r10
            r7 = 1073741824(0x40000000, float:2.0)
            float r0 = r1 / r7
            float r2 = r2 - r0
            r3.left = r2
            float r2 = r2 + r1
            r3.right = r2
            float r2 = r3.centerY()
            float r1 = (float) r12
            float r0 = r1 / r7
            float r2 = r2 - r0
            r3.top = r2
            float r2 = r2 + r1
            r3.bottom = r2
            goto L_0x00e7
        L_0x018e:
            float r10 = (float) r10
            float r2 = r3.height()
            float r2 = r2 * r10
            float r1 = (float) r12
            float r0 = r3.width()
            float r0 = r0 * r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b3
            float r2 = r3.width()
            float r2 = r2 * r1
            float r2 = r2 / r10
            float r1 = r3.centerY()
            float r0 = (float) r7
            float r0 = r2 / r0
            float r1 = r1 - r0
            r3.top = r1
            float r1 = r1 + r2
            r3.bottom = r1
            goto L_0x00e7
        L_0x01b3:
            float r2 = r3.height()
            float r2 = r2 * r10
            float r2 = r2 / r1
            float r1 = r3.centerX()
            float r0 = (float) r7
            float r0 = r2 / r0
            float r1 = r1 - r0
            r3.left = r1
            float r1 = r1 + r2
            r3.right = r1
            goto L_0x00e7
        L_0x01c8:
            boolean r0 = r1 instanceof X.C79473zy
            if (r0 == 0) goto L_0x006a
            X.42r r0 = r11.A02
            X.4SW r0 = r0.A00()
            X.3zy r1 = (X.C79473zy) r1
            java.util.List r7 = r1.A00
            int r6 = r7.size()
            boolean r0 = r0 instanceof X.C79373zn
            if (r0 == 0) goto L_0x022f
            android.graphics.Path r0 = X.C37741pe.A03(r10)
            java.util.List r5 = X.AnonymousClass1JB.A0V(r0)
        L_0x01e6:
            r2 = 0
            java.util.Iterator r5 = r5.iterator()
        L_0x01eb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r4 = r5.next()
            int r3 = r2 + 1
            if (r2 >= 0) goto L_0x0201
            X.AnonymousClass1JA.A0T()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()
            throw r0
        L_0x0201:
            android.graphics.Path r4 = (android.graphics.Path) r4
            X.0qW r0 = r11.A0O
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r7.get(r2)
            X.42X r0 = (X.AnonymousClass42X) r0
            int r0 = r0.statusColor
            java.lang.Object r0 = X.AnonymousClass000.A0Y(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x022d
            int r2 = r0.intValue()
            X.0qW r1 = r11.A0P
            java.lang.Object r0 = r1.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setColor(r2)
            X.AnonymousClass3K4.A0k(r9, r4, r1)
        L_0x022d:
            r2 = r3
            goto L_0x01eb
        L_0x022f:
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            float r0 = (float) r6
            r15 = 1135869952(0x43b40000, float:360.0)
            float r15 = r15 / r0
            r4 = 1
            if (r6 != r4) goto L_0x0254
            r14 = 0
        L_0x023b:
            r13 = -1028390912(0xffffffffc2b40000, float:-90.0)
        L_0x023d:
            int r3 = r4 + 1
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            float r1 = r14 / r12
            float r1 = r1 + r13
            float r0 = r15 - r14
            r2.addArc(r10, r1, r0)
            r5.add(r2)
            float r13 = r13 + r15
            if (r4 == r6) goto L_0x01e6
            r4 = r3
            goto L_0x023d
        L_0x0254:
            r0 = 1103101952(0x41c00000, float:24.0)
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0261
            r0 = 1073741824(0x40000000, float:2.0)
            float r14 = r15 / r0
        L_0x025e:
            if (r4 > r6) goto L_0x01e6
            goto L_0x023b
        L_0x0261:
            r14 = 1094713344(0x41400000, float:12.0)
            goto L_0x025e
        L_0x0264:
            android.graphics.RectF r0 = r11.A0G
            r10.set(r0)
            goto L_0x0076
        L_0x026b:
            super.onDraw(r9)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto.onDraw(android.graphics.Canvas):void");
    }

    public void onMeasure(int i2, int i3) {
        C88804b7 profilePhotoRenderer = getProfilePhotoRenderer();
        C800242g r2 = profilePhotoRenderer.A03;
        Context context = profilePhotoRenderer.A08;
        PointF A002 = C89594cV.A00(context, profilePhotoRenderer.A02, r2);
        float A003 = C89594cV.A01(context, profilePhotoRenderer.A03).A00();
        A002.offset(A003, A003);
        float dimension = context.getResources().getDimension(profilePhotoRenderer.A03.dimension);
        C87184Vt r0 = new C87184Vt(dimension, dimension);
        float f2 = r0.A01;
        A002.offset(f2, r0.A00);
        float f3 = (profilePhotoRenderer.A04.A02.A01 - f2) / ((float) 2);
        A002.offset(f3, f3);
        C87184Vt r3 = profilePhotoRenderer.A04.A02;
        C87184Vt r02 = new C87184Vt(Math.max(r3.A01, A002.x), Math.max(r3.A00, A002.y));
        float f4 = r02.A00;
        int i4 = (int) f4;
        float f5 = r02.A01;
        int i5 = (int) f5;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        setMeasuredDimension(i5, i4);
        getDrawRectF().set(0.0f, 0.0f, f5, f4);
        C88804b7 profilePhotoRenderer2 = getProfilePhotoRenderer();
        RectF drawRectF = getDrawRectF();
        C18450wi.A0H(drawRectF, 0);
        RectF rectF = profilePhotoRenderer2.A0D;
        rectF.set(drawRectF);
        RectF rectF2 = profilePhotoRenderer2.A0I;
        float f6 = rectF.top;
        rectF2.top = f6;
        rectF2.bottom = f6 + profilePhotoRenderer2.A04.A02.A00;
        float f7 = profilePhotoRenderer2.A0J.A0T() ? rectF.right - profilePhotoRenderer2.A04.A02.A01 : rectF.left;
        rectF2.left = f7;
        rectF2.right = f7 + profilePhotoRenderer2.A04.A02.A01;
        RectF rectF3 = profilePhotoRenderer2.A0G;
        rectF3.set(rectF2);
        float f8 = profilePhotoRenderer2.A04.A01;
        rectF3.inset(f8, f8);
        RectF rectF4 = profilePhotoRenderer2.A0H;
        rectF4.set(rectF3);
        if (profilePhotoRenderer2.A07) {
            float f9 = profilePhotoRenderer2.A04.A00;
            rectF4.inset(f9, f9);
        }
        profilePhotoRenderer2.A0K.A02(rectF3);
        profilePhotoRenderer2.A0A.reset();
        profilePhotoRenderer2.A09.reset();
        profilePhotoRenderer2.A0B.reset();
        profilePhotoRenderer2.A00();
        setBackgroundDrawable((Drawable) getProfilePhotoRenderer().A0L.getValue());
        RectF rectF5 = getProfilePhotoRenderer().A0G;
        C89264br marginOffsets = getMarginOffsets();
        marginOffsets.A01 = (int) (getDrawRectF().left - rectF5.left);
        marginOffsets.A03 = (int) (getDrawRectF().top - rectF5.top);
        marginOffsets.A02 = (int) (rectF5.right - getDrawRectF().right);
        marginOffsets.A00 = (int) (rectF5.bottom - getDrawRectF().bottom);
        RectF rectF6 = getProfilePhotoRenderer().A0H;
        setPadding((int) (rectF6.left - getDrawRectF().left), (int) (rectF6.top - getDrawRectF().top), (int) (getDrawRectF().right - rectF6.right), (int) (getDrawRectF().bottom - rectF6.bottom));
        C813547v.A00(this, getOriginalMargins());
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C89264br originalMargins = getOriginalMargins();
            int i2 = marginLayoutParams.leftMargin;
            originalMargins.A01 = i2;
            originalMargins.A03 = marginLayoutParams.topMargin;
            originalMargins.A02 = marginLayoutParams.rightMargin;
            originalMargins.A00 = marginLayoutParams.bottomMargin;
            marginLayoutParams.leftMargin = i2 + getMarginOffsets().A01;
            marginLayoutParams.topMargin += getMarginOffsets().A03;
            marginLayoutParams.rightMargin += getMarginOffsets().A02;
            marginLayoutParams.bottomMargin += getMarginOffsets().A00;
        }
        super.setLayoutParams(layoutParams);
    }

    public void setPressed(boolean z2) {
        super.setPressed(z2);
        C88804b7 profilePhotoRenderer = getProfilePhotoRenderer();
        profilePhotoRenderer.A06 = z2;
        if (z2) {
            C13690nt.A0r(profilePhotoRenderer.A08, (Paint) profilePhotoRenderer.A0N.getValue(), C88804b7.A0Q);
        }
    }

    public final void setProfileBadge(AnonymousClass2IH r6) {
        AnonymousClass3LA r0;
        boolean z2 = !C18450wi.A0R(r6, this.A04);
        this.A04 = r6;
        if (z2 && this.A0B.AIw()) {
            C88804b7 profilePhotoRenderer = getProfilePhotoRenderer();
            C95794nI r3 = profilePhotoRenderer.A0K;
            boolean z3 = !C18450wi.A0R(r3.A06, r6);
            r3.A06 = r6;
            if (z3) {
                if (r6 == null) {
                    r0 = null;
                } else {
                    Context context = r3.A07;
                    AnonymousClass4QW r1 = r3.A05;
                    C18450wi.A0H(r1, 2);
                    r0 = new AnonymousClass3LA(context, r1, r6);
                }
                r3.A03 = r0;
            }
            r3.A02(profilePhotoRenderer.A0G);
            invalidate();
        }
    }

    public final void setProfilePhotoShape(C801342r r4) {
        C18450wi.A0H(r4, 0);
        boolean A1a = C13680ns.A1a(r4, this.A02);
        this.A02 = r4;
        if (A1a && this.A0B.AIw()) {
            C88804b7 profilePhotoRenderer = getProfilePhotoRenderer();
            C801342r r1 = this.A02;
            C18450wi.A0H(r1, 0);
            profilePhotoRenderer.A02 = r1;
            profilePhotoRenderer.A0K.A01 = r1;
            requestLayout();
        }
    }

    public final void setProfilePhotoSize(C800242g r7) {
        AnonymousClass3LA r0;
        AnonymousClass3LA r02;
        C18450wi.A0H(r7, 0);
        boolean A1a = C13680ns.A1a(r7, this.A03);
        this.A03 = r7;
        if (A1a && this.A0B.AIw()) {
            C88804b7 profilePhotoRenderer = getProfilePhotoRenderer();
            C800242g r2 = this.A03;
            C18450wi.A0H(r2, 0);
            profilePhotoRenderer.A03 = r2;
            profilePhotoRenderer.A04 = C89594cV.A02(r2).A00(profilePhotoRenderer.A08);
            profilePhotoRenderer.A00();
            C95794nI r4 = profilePhotoRenderer.A0K;
            boolean A1a2 = C13680ns.A1a(r4.A02, r2);
            r4.A02 = r2;
            if (A1a2) {
                Context context = r4.A07;
                r4.A05 = C89594cV.A01(context, r2);
                if (r4.A04 == null) {
                    r0 = null;
                } else {
                    AnonymousClass2IH r22 = (AnonymousClass2IH) r4.A0B.getValue();
                    AnonymousClass4QW r1 = r4.A05;
                    C18450wi.A0H(r22, 0);
                    C18450wi.A0H(r1, 2);
                    r0 = new AnonymousClass3LA(context, r1, r22);
                }
                r4.A04 = r0;
                AnonymousClass2IH r23 = r4.A06;
                if (r23 == null) {
                    r02 = null;
                } else {
                    AnonymousClass4QW r12 = r4.A05;
                    C18450wi.A0H(r12, 2);
                    r02 = new AnonymousClass3LA(context, r12, r23);
                }
                r4.A03 = r02;
            }
            requestLayout();
        }
    }

    public final void setProfileStatus(C813447u r2) {
        C18450wi.A0H(r2, 0);
        this.A05 = r2;
        C88804b7 profilePhotoRenderer = getProfilePhotoRenderer();
        profilePhotoRenderer.A05 = r2;
        profilePhotoRenderer.A00();
        invalidate();
    }

    public final void setStatusIndicatorEnabled(boolean z2) {
        boolean A1X = AnonymousClass3K2.A1X(z2 ? 1 : 0, this.A06 ? 1 : 0);
        this.A06 = z2;
        if (A1X && this.A0B.AIw()) {
            getProfilePhotoRenderer().A07 = z2;
            requestLayout();
        }
    }

    public final void setWhatsAppLocale(AnonymousClass013 r2) {
        C18450wi.A0H(r2, 0);
        this.A00 = r2;
    }
}
