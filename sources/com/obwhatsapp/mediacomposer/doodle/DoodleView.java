package com.obwhatsapp.mediacomposer.doodle;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass1MF;
import X.AnonymousClass29j;
import X.AnonymousClass32z;
import X.AnonymousClass397;
import X.AnonymousClass39P;
import X.AnonymousClass3CW;
import X.AnonymousClass4ET;
import X.C109925Uh;
import X.C14710pd;
import X.C15450qv;
import X.C16150sX;
import X.C16440t3;
import X.C17250um;
import X.C455729k;
import X.C455829l;
import X.C455929m;
import X.C49102Rb;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C62033Bj;
import X.C64083Mr;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.whatsapp.util.Log;
import org.json.JSONException;

public class DoodleView extends View implements AnonymousClass29j, AnonymousClass006 {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public C16440t3 A04;
    public AnonymousClass013 A05;
    public C17250um A06;
    public C14710pd A07;
    public C109925Uh A08;
    public C49102Rb A09;
    public AnonymousClass3CW A0A;
    public AnonymousClass1MF A0B;
    public C52662eE A0C;
    public boolean A0D;
    public final RectF A0E;
    public final Handler A0F;
    public final C455929m A0G;
    public final AnonymousClass39P A0H;
    public final AnonymousClass397 A0I;
    public final C455729k A0J;
    public final Runnable A0K;

    public DoodleView(Context context) {
        super(context);
        A02();
        this.A03 = -65536;
        this.A01 = 8.0f;
        this.A02 = 8.0f;
        this.A0F = new Handler();
        this.A0K = new RunnableRunnableShape10S0100000_I0_9((Object) this, 48);
        C455729k r4 = new C455729k();
        this.A0J = r4;
        AnonymousClass39P r3 = new AnonymousClass39P();
        this.A0H = r3;
        this.A0I = new AnonymousClass397(r3);
        this.A0G = new C455929m(this.A04, new AnonymousClass4ET(this), r3, r4);
        this.A0E = new RectF();
        if (C15450qv.A04()) {
            setLayerType(2, (Paint) null);
        }
    }

    public DoodleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A03 = -65536;
        this.A01 = 8.0f;
        this.A02 = 8.0f;
        this.A0F = new Handler();
        this.A0K = new RunnableRunnableShape10S0100000_I0_9((Object) this, 48);
        C455729k r4 = new C455729k();
        this.A0J = r4;
        AnonymousClass39P r3 = new AnonymousClass39P();
        this.A0H = r3;
        this.A0I = new AnonymousClass397(r3);
        this.A0G = new C455929m(this.A04, new AnonymousClass4ET(this), r3, r4);
        this.A0E = new RectF();
        if (C15450qv.A04()) {
            setLayerType(2, (Paint) null);
        }
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A03 = -65536;
        this.A01 = 8.0f;
        this.A02 = 8.0f;
        this.A0F = new Handler();
        this.A0K = new RunnableRunnableShape10S0100000_I0_9((Object) this, 48);
        C455729k r4 = new C455729k();
        this.A0J = r4;
        AnonymousClass39P r3 = new AnonymousClass39P();
        this.A0H = r3;
        this.A0I = new AnonymousClass397(r3);
        this.A0G = new C455929m(this.A04, new AnonymousClass4ET(this), r3, r4);
        this.A0E = new RectF();
        if (C15450qv.A04()) {
            setLayerType(2, (Paint) null);
        }
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A02();
        this.A03 = -65536;
        this.A01 = 8.0f;
        this.A02 = 8.0f;
        this.A0F = new Handler();
        this.A0K = new RunnableRunnableShape10S0100000_I0_9((Object) this, 48);
        C455729k r4 = new C455729k();
        this.A0J = r4;
        AnonymousClass39P r3 = new AnonymousClass39P();
        this.A0H = r3;
        this.A0I = new AnonymousClass397(r3);
        this.A0G = new C455929m(this.A04, new AnonymousClass4ET(this), r3, r4);
        this.A0E = new RectF();
        if (C15450qv.A04()) {
            setLayerType(2, (Paint) null);
        }
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A02();
    }

    private PointF getCenterPoint() {
        AnonymousClass39P r2 = this.A0H;
        return r2.A05 != null ? this.A0I.A00(getX() + ((float) (getMeasuredWidth() >> 1)), getY() + ((float) (getMeasuredHeight() >> 1))) : new PointF(r2.A07.centerX(), r2.A07.centerY());
    }

    public C455829l A00(MotionEvent motionEvent) {
        if (!A04() || motionEvent.getPointerCount() != 1) {
            return null;
        }
        return this.A0J.A00(this.A0I.A00(motionEvent.getX(), motionEvent.getY()));
    }

    public C455829l A01(MotionEvent motionEvent) {
        if (!A04() || motionEvent.getPointerCount() != 2) {
            return null;
        }
        AnonymousClass397 r2 = this.A0I;
        PointF A002 = r2.A00(motionEvent.getX(0), motionEvent.getY(0));
        PointF A003 = r2.A00(motionEvent.getX(1), motionEvent.getY(1));
        C455729k r4 = this.A0J;
        C455829l A004 = r4.A00(A002);
        if (A004 != null) {
            return A004;
        }
        C455829l A005 = r4.A00(A003);
        return A005 == null ? r4.A00(new PointF((A002.x + A003.x) / 2.0f, (A002.y + A003.y) / 2.0f)) : A005;
    }

    public void A02() {
        if (!this.A0D) {
            this.A0D = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A04 = (C16440t3) r1.AP2.get();
            this.A06 = (C17250um) r1.A7e.get();
            this.A05 = (AnonymousClass013) r1.AR8.get();
            this.A07 = (C14710pd) r1.A05.get();
            this.A0B = (AnonymousClass1MF) r1.ANa.get();
        }
    }

    public void A03(C455829l r13) {
        float f2;
        float f3;
        AnonymousClass39P r2 = this.A0H;
        RectF rectF = r2.A07;
        float width = rectF.width();
        float height = rectF.height();
        C455829l r6 = r13;
        boolean z2 = r13 instanceof AnonymousClass32z;
        if (z2) {
            f2 = (width * 7.0f) / 8.0f;
            f3 = height / 10.0f;
        } else {
            f2 = width / 2.0f;
            f3 = height / 2.0f;
        }
        PointF centerPoint = getCenterPoint();
        float f4 = centerPoint.x;
        float f5 = f2 / 2.0f;
        float f6 = centerPoint.y;
        float f7 = f3 / 2.0f;
        r6.A0Q(rectF, f4 - f5, f6 - f7, f4 + f5, f6 + f7);
        if (r13.A0J() && !z2) {
            r13.A09(this.A03);
        }
        if (r13.A0K()) {
            r13.A0O(C455829l.A04 / this.A00);
        }
        r13.A08(1.0f / r2.A01, 2);
        r13.A00 += (float) (-r2.A02);
        C455729k r1 = this.A0J;
        r1.A03(r13);
        if (r13.A0B() && !r1.A06()) {
            this.A0F.postDelayed(this.A0K, 1000);
        }
        this.A09.A02 = false;
        C109925Uh r0 = this.A08;
        if (r0 != null) {
            r0.AXA(r13);
        }
        invalidate();
    }

    public boolean A04() {
        AnonymousClass39P r1 = this.A0H;
        return (r1.A06 == null || r1.A07 == null) ? false : true;
    }

    public void Aej(float f2, int i2) {
        C455729k r2 = this.A0J;
        C455829l r3 = r2.A01;
        if (!(r3 == null || r3 == r2.A02 || (!r3.A0K() && !r3.A0J()))) {
            r2.A00 = r3.A03();
            r3 = r2.A01;
            r2.A02 = r3;
        }
        this.A02 = f2;
        float f3 = this.A00;
        if (f3 == 0.0f) {
            this.A01 = f2;
        } else {
            this.A01 = f2 / f3;
        }
        this.A03 = i2;
        C49102Rb r0 = this.A09;
        if (r0 != null && !r0.A02 && r3 != null) {
            if (r3.A0K() || r3.A0J()) {
                if (r3.A0J()) {
                    r3.A09(i2);
                }
                C455829l r1 = r2.A01;
                if (r1.A0K()) {
                    r1.A0O(this.A01);
                }
                C455829l r4 = r2.A01;
                if (r4 instanceof AnonymousClass32z) {
                    AnonymousClass32z r42 = (AnonymousClass32z) r4;
                    float f4 = C455829l.A07;
                    float f5 = C455829l.A04;
                    float f6 = (f4 - f5) / 4.0f;
                    int i3 = 0;
                    if (f2 >= f5 + f6) {
                        i3 = 1;
                        if (f2 >= (2.0f * f6) + f5) {
                            i3 = 3;
                            if (f2 < f5 + (f6 * 3.0f)) {
                                i3 = 2;
                            }
                        }
                    }
                    r42.A0S(i3);
                }
                invalidate();
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013f, code lost:
        if (r2.A03 == ((int) r8.height())) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            super.draw(r13)
            X.29m r2 = r12.A0G
            X.39P r1 = r2.A0G
            android.graphics.Matrix r0 = r1.A0A
            r13.setMatrix(r0)
            android.graphics.RectF r0 = r1.A07
            if (r0 == 0) goto L_0x0286
            X.29k r4 = r2.A0H
            java.util.List r3 = r4.A04
            int r6 = r3.size()
            java.util.List r0 = r4.A01()
            int r0 = r0.size()
            int r6 = r6 - r0
            r5 = 0
            r0 = 3
            if (r6 < r0) goto L_0x003f
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0121
            java.util.Iterator r6 = r3.iterator()
        L_0x002d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r6.next()
            X.29l r0 = (X.C455829l) r0
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x002d
        L_0x003f:
            r2.A01 = r5
            r2.A02 = r5
            android.graphics.Bitmap r0 = r2.A07
            r5 = 0
            if (r0 == 0) goto L_0x004d
            r0.recycle()
            r2.A07 = r5
        L_0x004d:
            android.graphics.Bitmap r0 = r2.A08
            if (r0 == 0) goto L_0x0056
            r0.recycle()
            r2.A08 = r5
        L_0x0056:
            java.util.List r7 = r4.A05
            r13.save()
            android.graphics.RectF r5 = r1.A0B
            float r6 = r5.left
            float r0 = r5.top
            r13.translate(r6, r0)
            android.graphics.Bitmap r0 = r2.A06
            if (r0 != 0) goto L_0x00bf
            android.graphics.Bitmap r0 = r2.A05
            if (r0 != 0) goto L_0x00bf
        L_0x006c:
            int r0 = r2.A01
            r6 = 0
            if (r0 <= 0) goto L_0x0078
            android.graphics.Bitmap r8 = r2.A07
            android.graphics.Paint r0 = r2.A0C
            r13.drawBitmap(r8, r6, r6, r0)
        L_0x0078:
            r13.save()
            float r0 = r1.A00
            r13.scale(r0, r0)
            android.graphics.Matrix r0 = r1.A09
            r13.concat(r0)
            android.graphics.RectF r8 = r1.A07
            float r0 = r8.left
            float r1 = -r0
            float r0 = r8.top
            float r0 = -r0
            r13.translate(r1, r0)
            int r8 = r2.A01
        L_0x0092:
            int r1 = r7.size()
            int r0 = r2.A02
            int r1 = r1 - r0
            if (r8 >= r1) goto L_0x0216
            java.lang.Object r1 = r7.get(r8)
            X.29l r1 = (X.C455829l) r1
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x00a8
            android.os.SystemClock.elapsedRealtime()
        L_0x00a8:
            boolean r0 = r1 instanceof X.C605232r
            if (r0 == 0) goto L_0x00bb
            X.32r r1 = (X.C605232r) r1
            android.graphics.drawable.Drawable r0 = r1.A01
            if (r0 == 0) goto L_0x00b8
            X.C605232r.A02(r13, r1)
            r13.restore()
        L_0x00b8:
            int r8 = r8 + 1
            goto L_0x0092
        L_0x00bb:
            r1.A0P(r13)
            goto L_0x00b8
        L_0x00bf:
            java.util.Iterator r6 = r7.iterator()
        L_0x00c3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r6.next()
            boolean r0 = r0 instanceof X.AnonymousClass32x
            if (r0 == 0) goto L_0x00c3
            r13.save()
            android.graphics.Bitmap r6 = r2.A06
            r9 = 0
            r8 = 0
            if (r6 == 0) goto L_0x0112
            int r0 = r1.A02
            float r10 = (float) r0
            int r0 = r6.getWidth()
            float r11 = (float) r0
            android.graphics.Bitmap r0 = r2.A06
        L_0x00e4:
            int r0 = r0.getHeight()
            float r6 = (float) r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r8, r8, r11, r6)
            android.graphics.Matrix r8 = X.AnonymousClass470.A00(r9, r0, r10)
            float r6 = r1.A00
            int r0 = r2.A00
            float r0 = (float) r0
            float r6 = r6 / r0
            r8.postScale(r6, r6)
            android.graphics.Bitmap r6 = r2.A05
            if (r6 == 0) goto L_0x0104
            android.graphics.Paint r0 = r2.A0C
            r13.drawBitmap(r6, r8, r0)
        L_0x0104:
            android.graphics.Bitmap r6 = r2.A06
            if (r6 == 0) goto L_0x010d
            android.graphics.Paint r0 = r2.A0C
            r13.drawBitmap(r6, r8, r0)
        L_0x010d:
            r13.restore()
            goto L_0x006c
        L_0x0112:
            android.graphics.Bitmap r6 = r2.A05
            if (r6 == 0) goto L_0x006c
            int r0 = r1.A02
            float r10 = (float) r0
            int r0 = r6.getWidth()
            float r11 = (float) r0
            android.graphics.Bitmap r0 = r2.A05
            goto L_0x00e4
        L_0x0121:
            java.util.List r7 = r4.A05
            X.29l r6 = r4.A01
            X.29l r0 = r2.A09
            if (r6 != r0) goto L_0x0141
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0141
            int r6 = r2.A04
            android.graphics.RectF r8 = r1.A0B
            float r0 = r8.width()
            int r0 = (int) r0
            if (r6 != r0) goto L_0x0141
            int r6 = r2.A03
            float r0 = r8.height()
            int r0 = (int) r0
            if (r6 == r0) goto L_0x0056
        L_0x0141:
            r2.A01 = r5
            r2.A02 = r5
            X.29l r0 = r4.A01
            r2.A09 = r0
            android.graphics.RectF r6 = r1.A0B
            float r0 = r6.width()
            int r0 = (int) r0
            r2.A04 = r0
            float r0 = r6.height()
            int r8 = (int) r0
            r2.A03 = r8
            r0 = 1
            r2.A0B = r0
            android.graphics.Bitmap r6 = r2.A07
            int r0 = r2.A04
            android.graphics.Bitmap r0 = X.C455929m.A00(r6, r0, r8)
            r2.A07 = r0
            if (r0 == 0) goto L_0x01b6
            r0.eraseColor(r5)
            android.graphics.Bitmap r0 = r2.A07
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r0)
            float r0 = r1.A00
            r8.scale(r0, r0)
            android.graphics.Matrix r0 = r1.A09
            r8.concat(r0)
            android.graphics.RectF r9 = r1.A07
            float r0 = r9.left
            float r6 = -r0
            float r0 = r9.top
            float r0 = -r0
            r8.translate(r6, r0)
            java.util.Iterator r9 = r7.iterator()
        L_0x018b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r6 = r9.next()
            X.29l r6 = (X.C455829l) r6
            X.29l r0 = r2.A09
            if (r6 == r0) goto L_0x01b6
            int r0 = r2.A01
            int r0 = r0 + 1
            r2.A01 = r0
            boolean r0 = r6 instanceof X.C605232r
            if (r0 == 0) goto L_0x01b2
            X.32r r6 = (X.C605232r) r6
            android.graphics.drawable.Drawable r0 = r6.A01
            if (r0 == 0) goto L_0x018b
            X.C605232r.A02(r8, r6)
            r8.restore()
            goto L_0x018b
        L_0x01b2:
            r6.A0P(r8)
            goto L_0x018b
        L_0x01b6:
            android.graphics.Bitmap r8 = r2.A08
            int r6 = r2.A04
            int r0 = r2.A03
            android.graphics.Bitmap r0 = X.C455929m.A00(r8, r6, r0)
            r2.A08 = r0
            if (r0 == 0) goto L_0x0056
            r0.eraseColor(r5)
            android.graphics.Bitmap r0 = r2.A08
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r0)
            float r0 = r1.A00
            r8.scale(r0, r0)
            android.graphics.Matrix r0 = r1.A09
            r8.concat(r0)
            android.graphics.RectF r9 = r1.A07
            float r0 = r9.left
            float r6 = -r0
            float r0 = r9.top
            float r0 = -r0
            r8.translate(r6, r0)
            java.util.Iterator r7 = r7.iterator()
        L_0x01e7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r6 = r7.next()
            X.29l r6 = (X.C455829l) r6
            X.29l r0 = r2.A09
            if (r6 != r0) goto L_0x01f9
            r5 = 1
            goto L_0x01e7
        L_0x01f9:
            if (r5 == 0) goto L_0x01e7
            int r0 = r2.A02
            int r0 = r0 + 1
            r2.A02 = r0
            boolean r0 = r6 instanceof X.C605232r
            if (r0 == 0) goto L_0x0212
            X.32r r6 = (X.C605232r) r6
            android.graphics.drawable.Drawable r0 = r6.A01
            if (r0 == 0) goto L_0x01e7
            X.C605232r.A02(r8, r6)
            r8.restore()
            goto L_0x01e7
        L_0x0212:
            r6.A0P(r8)
            goto L_0x01e7
        L_0x0216:
            r13.restore()
            int r0 = r2.A02
            if (r0 <= 0) goto L_0x0224
            android.graphics.Bitmap r1 = r2.A08
            android.graphics.Paint r0 = r2.A0C
            r13.drawBitmap(r1, r6, r6, r0)
        L_0x0224:
            r13.restore()
            X.29l r0 = r4.A02
            r1 = 0
            if (r0 == 0) goto L_0x022d
            r1 = 1
        L_0x022d:
            float r0 = r5.left
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0239
            float r0 = r5.top
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x024d
        L_0x0239:
            r13.save()
            android.graphics.Region$Op r0 = android.graphics.Region.Op.DIFFERENCE
            r13.clipRect(r5, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == 0) goto L_0x0247
            r0 = -1157627904(0xffffffffbb000000, float:-0.001953125)
        L_0x0247:
            r13.drawColor(r0)
            r13.restore()
        L_0x024d:
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x026f
            java.util.Iterator r1 = r3.iterator()
        L_0x0255:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x026f
            java.lang.Object r0 = r1.next()
            X.29l r0 = (X.C455829l) r0
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0255
        L_0x0267:
            X.4ET r0 = r2.A0F
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r0.A00
            r0.invalidate()
            return
        L_0x026f:
            java.util.Iterator r1 = r3.iterator()
        L_0x0273:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0286
            java.lang.Object r0 = r1.next()
            X.29l r0 = (X.C455829l) r0
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0273
            goto L_0x0267
        L_0x0286:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.doodle.DoodleView.draw(android.graphics.Canvas):void");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0C;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public C455929m getDoodleRender() {
        return this.A0G;
    }

    public AnonymousClass397 getPointsUtil() {
        return this.A0I;
    }

    public C455729k getShapeRepository() {
        return this.A0J;
    }

    public AnonymousClass39P getState() {
        return this.A0H;
    }

    public float getStrokeScale() {
        return this.A00;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0J.A06()) {
            this.A0F.postDelayed(this.A0K, 1000);
        }
    }

    public void onDetachedFromWindow() {
        this.A0F.removeCallbacks(this.A0K);
        super.onDetachedFromWindow();
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        AnonymousClass39P r6 = this.A0H;
        RectF rectF = r6.A07;
        if (rectF != null) {
            RectF rectF2 = this.A0E;
            rectF2.set(rectF);
            r6.A09.mapRect(rectF2);
            float measuredWidth = (float) getMeasuredWidth();
            float measuredHeight = (float) getMeasuredHeight();
            float width = rectF2.width() / rectF2.height();
            if (measuredWidth / measuredHeight < width) {
                measuredHeight = measuredWidth / width;
            } else {
                measuredWidth = measuredHeight * width;
            }
            r6.A00 = measuredWidth / rectF2.width();
            if (this.A00 == 0.0f || !(!this.A0J.A04.isEmpty())) {
                float f2 = r6.A00;
                this.A00 = f2;
                this.A01 = this.A02 / f2;
            }
            r6.A0B.set((((float) getMeasuredWidth()) - measuredWidth) / 2.0f, (((float) getMeasuredHeight()) - measuredHeight) / 2.0f, (((float) getMeasuredWidth()) + measuredWidth) / 2.0f, (((float) getMeasuredHeight()) + measuredHeight) / 2.0f);
            r6.A08 = getResources().getDisplayMetrics();
            r6.A03 = getMeasuredHeight();
            r6.A04 = getMeasuredWidth();
            C455929m r2 = this.A0G;
            if (r2.A04(false) || r2.A03(false)) {
                r2.A02();
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C64083Mr r6 = (C64083Mr) parcelable;
        String str = r6.A01;
        if (!TextUtils.isEmpty(str)) {
            C62033Bj A032 = C62033Bj.A03(getContext(), this.A05, this.A06, this.A0B, str);
            if (A032 != null) {
                AnonymousClass39P r2 = this.A0H;
                r2.A00(A032);
                C455729k r0 = this.A0J;
                r0.A02();
                r0.A04.addAll(A032.A06);
                r2.A08 = getResources().getDisplayMetrics();
                this.A0G.A02();
            }
            this.A0J.A05(r6.A02);
        }
        this.A09.A02 = r6.A03;
        this.A02 = r6.A00;
        requestLayout();
        this.A0G.A01();
        super.onRestoreInstanceState(r6.getSuperState());
    }

    public Parcelable onSaveInstanceState() {
        String str;
        String str2;
        RectF rectF;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        AnonymousClass39P r0 = this.A0H;
        RectF rectF2 = r0.A06;
        if (rectF2 == null || (rectF = r0.A07) == null) {
            str = null;
        } else {
            str = new C62033Bj(rectF2, rectF, this.A0J.A05, r0.A02).A04();
        }
        C455729k r02 = this.A0J;
        try {
            str2 = r02.A03.A01(r02.A04);
        } catch (JSONException e2) {
            Log.e("ShapeRepository/getUndoJson", e2);
            str2 = null;
        }
        return new C64083Mr(onSaveInstanceState, str, str2, this.A02, this.A09.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r2 != 6) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        if (r1 != 6) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b0, code lost:
        if (r2.getStrokeWidth() == r7.A01) goto L_0x01c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x029e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            boolean r0 = r14.isEnabled()
            r6 = 0
            if (r0 == 0) goto L_0x029e
            r14.invalidate()
            X.2Rb r2 = r14.A09
            int r1 = r14.A03
            float r0 = r14.A01
            boolean r0 = r2.A00(r15, r0, r1, r6)
            r5 = 1
            if (r0 == 0) goto L_0x0018
            return r5
        L_0x0018:
            X.3CW r4 = r14.A0A
            if (r4 == 0) goto L_0x029e
            int r2 = r15.getActionMasked()
            r1 = 2
            if (r2 == 0) goto L_0x0236
            if (r2 == r5) goto L_0x017a
            if (r2 == r1) goto L_0x0160
            r0 = 3
            if (r2 == r0) goto L_0x017a
            r0 = 5
            if (r2 == r0) goto L_0x0236
            r0 = 6
            if (r2 == r0) goto L_0x017a
        L_0x0030:
            X.09P r0 = r4.A01
            boolean r13 = r0.A00(r15)
            X.3Me r0 = r4.A07
            boolean r0 = r0.onTouchEvent(r15)
            r13 = r13 | r0
            X.4MT r7 = r4.A06
            int r0 = r15.getPointerCount()
            r1 = 2
            r10 = 0
            if (r0 != r1) goto L_0x0157
            int r0 = r15.getActionMasked()
            if (r0 != r1) goto L_0x0157
            r11 = 1
            float r9 = r15.getX(r5)
            float r0 = r15.getX(r6)
            float r9 = r9 - r0
            float r8 = r15.getY(r5)
            float r0 = r15.getY(r6)
            float r8 = r8 - r0
            double r2 = (double) r8
            double r0 = (double) r9
            double r0 = java.lang.Math.atan2(r2, r0)
            float r2 = (float) r0
            float r0 = r7.A01
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008a
            float r0 = r7.A02
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008a
            float r1 = r7.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x008a
            X.3CW r3 = r7.A03
            float r0 = r2 - r1
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r10 = (float) r0
            X.38u r11 = r3.A04
            X.29l r0 = r11.A01
            if (r0 != 0) goto L_0x012b
            r11 = 0
        L_0x008a:
            r7.A01 = r9
            r7.A02 = r8
            r7.A00 = r2
        L_0x0090:
            r13 = r13 | r11
            X.4aK r4 = r4.A05
            int r1 = r15.getActionMasked()
            if (r1 == 0) goto L_0x011b
            if (r1 == r5) goto L_0x0118
            r0 = 2
            if (r1 == r0) goto L_0x00b8
            r0 = 3
            if (r1 == r0) goto L_0x0118
            r0 = 5
            if (r1 == r0) goto L_0x00ae
            r0 = 6
            if (r1 == r0) goto L_0x0118
        L_0x00a7:
            boolean r0 = r4.A02
            r0 = r0 | r13
            if (r0 == 0) goto L_0x029e
            r6 = 1
            return r6
        L_0x00ae:
            android.graphics.PointF r0 = r4.A04
            X.C88334aK.A00(r0, r15)
            r4.A02 = r5
            r4.A01 = r5
            goto L_0x00a7
        L_0x00b8:
            android.graphics.PointF r7 = r4.A06
            X.C88334aK.A00(r7, r15)
            boolean r1 = r4.A02
            if (r1 == 0) goto L_0x00fb
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00fb
            float r9 = r7.x
            android.graphics.PointF r2 = r4.A05
            float r0 = r2.x
            float r1 = r9 - r0
            float r8 = r7.y
            float r0 = r2.y
            float r0 = r8 - r0
            float r1 = r1 * r1
            float r0 = r0 * r0
            float r1 = r1 + r0
            double r2 = (double) r1
            int r0 = r4.A03
            int r0 = r0 * r0
            double r0 = (double) r0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f3
            r4.A01 = r5
            X.3CW r2 = r4.A00
            android.graphics.PointF r1 = r4.A04
            float r0 = r1.x
            float r9 = r9 - r0
            float r0 = r1.y
            float r8 = r8 - r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r9, r8)
            r2.A00(r0, r1)
        L_0x00f3:
            android.graphics.PointF r0 = r4.A04
            r0.set(r7)
            r4.A02 = r5
            goto L_0x00a7
        L_0x00fb:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00f3
            if (r1 == 0) goto L_0x00f3
            X.3CW r8 = r4.A00
            float r3 = r7.x
            android.graphics.PointF r2 = r4.A04
            float r0 = r2.x
            float r3 = r3 - r0
            float r1 = r7.y
            float r0 = r2.y
            float r1 = r1 - r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r1)
            r8.A00(r0, r2)
            goto L_0x00f3
        L_0x0118:
            r4.A02 = r6
            goto L_0x00a7
        L_0x011b:
            android.graphics.PointF r1 = r4.A04
            X.C88334aK.A00(r1, r15)
            r4.A02 = r5
            r4.A01 = r6
            android.graphics.PointF r0 = r4.A05
            r0.set(r1)
            goto L_0x00a7
        L_0x012b:
            r11.A00()
            X.397 r12 = r11.A04
            X.29l r0 = r11.A01
            android.graphics.RectF r0 = r0.A02
            float r3 = r0.centerX()
            float r1 = r0.centerY()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r1)
            android.graphics.PointF r3 = r12.A01(r0)
            X.39N r1 = r11.A05
            X.29l r0 = r11.A01
            float r3 = r1.A00(r3, r0, r10)
            X.29l r1 = r11.A01
            float r0 = r1.A00
            float r0 = r0 + r3
            r1.A00 = r0
            r11 = 1
            goto L_0x008a
        L_0x0157:
            r7.A00 = r10
            r7.A02 = r10
            r7.A01 = r10
            r11 = 0
            goto L_0x0090
        L_0x0160:
            X.29k r2 = r4.A09
            X.29l r1 = r2.A01
            if (r1 == 0) goto L_0x0030
            X.29l r0 = r2.A02
            if (r1 == r0) goto L_0x0030
            boolean r0 = r1 instanceof X.AnonymousClass32x
            if (r0 != 0) goto L_0x0030
            X.4MV r0 = r1.A03()
            r2.A00 = r0
            X.29l r0 = r2.A01
            r2.A02 = r0
            goto L_0x0030
        L_0x017a:
            X.29k r3 = r4.A09
            X.29l r2 = r3.A01
            if (r2 == 0) goto L_0x01cc
            X.29l r0 = r3.A02
            if (r0 == 0) goto L_0x01c2
            if (r0 != r2) goto L_0x01c2
            boolean r0 = r2 instanceof X.AnonymousClass32x
            if (r0 != 0) goto L_0x01c2
            X.4MV r7 = r3.A00
            android.graphics.RectF r1 = r7.A03
            android.graphics.RectF r0 = r2.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01b2
            float r1 = r2.A00
            float r0 = r7.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01b2
            android.graphics.Paint r2 = r2.A01
            int r1 = r2.getColor()
            int r0 = r7.A02
            if (r1 != r0) goto L_0x01b2
            float r1 = r2.getStrokeWidth()
            float r0 = r7.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01c2
        L_0x01b2:
            X.29l r2 = r3.A01
            X.4MV r0 = r3.A00
            X.332 r1 = new X.332
            r1.<init>(r0, r2)
            X.393 r0 = r3.A03
            java.util.LinkedList r0 = r0.A00
            r0.add(r1)
        L_0x01c2:
            X.29l r0 = r3.A01
            r0.A05()
            r0 = 0
            r3.A02 = r0
            r3.A00 = r0
        L_0x01cc:
            X.5Uh r0 = r4.A02
            r0.AQ0()
            X.38u r3 = r4.A04
            X.29l r0 = r3.A01
            if (r0 == 0) goto L_0x0030
            float r8 = r15.getX()
            float r7 = r15.getY()
            X.39G r2 = r3.A06
            android.os.Handler r1 = r2.A01
            java.lang.Runnable r0 = r2.A06
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r2.A05
            r1.post(r0)
            r2.A00()
            r2.A00 = r6
            boolean r0 = r2.A01(r8, r7)
            if (r0 == 0) goto L_0x0212
            X.29l r2 = r3.A01
            if (r2 == 0) goto L_0x0212
            X.4EU r0 = r3.A02
            X.2Ra r1 = r0.A00
            X.29k r0 = r1.A0O
            r0.A04(r2)
            X.29m r0 = r1.A0G
            r0.A01()
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r1.A0H
            r0.invalidate()
            r1.A04()
        L_0x0212:
            X.39N r2 = r3.A05
            java.util.Map r0 = r2.A05
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x021e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x022e
            java.lang.Object r0 = r1.next()
            X.39j r0 = (X.C615539j) r0
            r0.A03()
            goto L_0x021e
        L_0x022e:
            r2.A01()
            r0 = 0
            r3.A01 = r0
            goto L_0x0030
        L_0x0236:
            int r0 = r15.getPointerCount()
            if (r0 != r5) goto L_0x028f
            X.29k r1 = r4.A09
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r4.A03
            X.29l r0 = r0.A00(r15)
        L_0x0244:
            r1.A01 = r0
        L_0x0246:
            X.29k r0 = r4.A09
            X.29l r7 = r0.A01
            if (r7 == 0) goto L_0x0030
            X.38u r0 = r4.A04
            r0.A01 = r7
            X.39G r2 = r0.A06
            r1 = 700(0x2bc, float:9.81E-43)
            android.os.Handler r3 = r2.A01
            java.lang.Runnable r0 = r2.A05
            r3.removeCallbacks(r0)
            java.lang.Runnable r2 = r2.A06
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
            X.5Uh r0 = r4.A02
            r0.AXA(r7)
            r0.APz()
            boolean r0 = r7.A0K()
            if (r0 == 0) goto L_0x0277
            com.obwhatsapp.mediacomposer.doodle.DoodleView r1 = r4.A03
            float r0 = r7.A02()
            r1.A01 = r0
        L_0x0277:
            boolean r0 = r7.A0J()
            if (r0 == 0) goto L_0x0030
            android.graphics.Paint r2 = r7.A01
            int r0 = r2.getColor()
            if (r0 == 0) goto L_0x0030
            com.obwhatsapp.mediacomposer.doodle.DoodleView r1 = r4.A03
            int r0 = r2.getColor()
            r1.A03 = r0
            goto L_0x0030
        L_0x028f:
            int r0 = r15.getPointerCount()
            if (r0 != r1) goto L_0x0246
            X.29k r1 = r4.A09
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r4.A03
            X.29l r0 = r0.A01(r15)
            goto L_0x0244
        L_0x029e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.doodle.DoodleView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setControllers(AnonymousClass3CW r1, C49102Rb r2) {
        this.A0A = r1;
        this.A09 = r2;
    }

    public void setDoodle(C62033Bj r4) {
        AnonymousClass39P r2 = this.A0H;
        r2.A00(r4);
        C455729k r0 = this.A0J;
        r0.A02();
        r0.A04.addAll(r4.A06);
        r2.A08 = getResources().getDisplayMetrics();
        C455929m r02 = this.A0G;
        r02.A02();
        requestLayout();
        r02.A01();
        invalidate();
    }

    public void setDoodleViewListener(C109925Uh r2) {
        this.A08 = r2;
        this.A09.A00 = r2;
    }

    public void setStrokeColor(int i2) {
        this.A03 = i2;
    }

    public void setStrokeScale(float f2) {
        this.A00 = f2;
    }

    public void setStrokeWidth(float f2) {
        this.A01 = f2;
    }
}
