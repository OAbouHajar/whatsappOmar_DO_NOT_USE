package com.obwhatsapp.crop;

import X.AnonymousClass2QM;
import X.AnonymousClass2QO;
import X.AnonymousClass56N;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape6S0200000_I0_4;
import java.util.ArrayList;
import java.util.Iterator;

public class CropImageView extends AnonymousClass2QM {
    public float A00;
    public float A01;
    public int A02;
    public AnonymousClass2QO A03;
    public boolean A04;
    public boolean A05;
    public final ArrayList A06;

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.A06 = new ArrayList();
        this.A03 = null;
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
    }

    public void A01(float f2, float f3) {
        super.A01(f2, f3);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A06;
            if (i2 < arrayList.size()) {
                AnonymousClass2QO r1 = (AnonymousClass2QO) arrayList.get(i2);
                r1.A03.postTranslate(f2, f3);
                r1.A04 = r1.A02();
                i2++;
            } else {
                return;
            }
        }
    }

    public void A02(float f2, float f3, float f4) {
        super.A02(f2, f3, f4);
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            AnonymousClass2QO r2 = (AnonymousClass2QO) it.next();
            r2.A03.set(getImageMatrix());
            r2.A04 = r2.A02();
        }
    }

    public void A05(AnonymousClass2QO r8) {
        Rect rect = r8.A04;
        int max = Math.max(0, -rect.left);
        int min = Math.min(0, getWidth() - rect.right);
        int max2 = Math.max(0, -rect.top);
        int min2 = Math.min(0, getHeight() - rect.bottom);
        if (max == 0 && rect.width() <= getWidth()) {
            max = min;
        }
        if (max2 == 0 && rect.height() <= getHeight()) {
            max2 = min2;
        }
        if (max != 0 || max2 != 0) {
            float f2 = (float) max;
            float f3 = (float) max2;
            if (f2 != 0.0f || f3 != 0.0f) {
                A01(f2, f3);
                setImageMatrix(getImageViewMatrix());
            }
        }
    }

    public final void A06(AnonymousClass2QO r14) {
        Rect rect = r14.A04;
        float width = (float) rect.width();
        float height = (float) rect.height();
        float max = Math.max(1.0f, Math.min((((float) getWidth()) / width) * 0.6f, (((float) getHeight()) / height) * 0.6f) * getScale());
        if (((double) (Math.abs(max - getScale()) / max)) > 0.1d) {
            float[] fArr = {r14.A05.centerX(), r14.A05.centerY()};
            getImageMatrix().mapPoints(fArr);
            float f2 = fArr[0];
            float f3 = fArr[1];
            this.A09.post(new AnonymousClass56N(this, new RunnableRunnableShape6S0200000_I0_4(this, 0, r14), getScale(), (max - getScale()) / 300.0f, f2, f3, System.currentTimeMillis()));
        }
    }

    public void clearFocus() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A06;
            if (i2 < arrayList.size()) {
                AnonymousClass2QO r1 = (AnonymousClass2QO) arrayList.get(i2);
                r1.A09 = false;
                r1.A04 = r1.A02();
                i2++;
            } else {
                return;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (!this.A05) {
            super.onDraw(canvas2);
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A06;
            if (i2 < arrayList.size()) {
                AnonymousClass2QO r8 = (AnonymousClass2QO) arrayList.get(i2);
                Path path = new Path();
                View view = r8.A07;
                float f2 = view.getResources().getDisplayMetrics().density;
                Paint paint = r8.A0D;
                paint.setStrokeWidth(0.5f + f2);
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                boolean z2 = r8.A08;
                Rect rect2 = r8.A04;
                if (z2) {
                    float width = (float) rect2.width();
                    float height = (float) r8.A04.height();
                    Rect rect3 = r8.A04;
                    float f3 = width / 2.0f;
                    path.addCircle(((float) rect3.left) + f3, ((float) rect3.top) + (height / 2.0f), f3, Path.Direction.CW);
                    paint.setColor(-1112874);
                } else {
                    path.addRect(new RectF(rect2), Path.Direction.CW);
                    paint.setColor(1728053247);
                    Rect rect4 = new Rect();
                    rect4.set(rect);
                    rect4.right = r8.A04.left;
                    canvas2.drawRect(rect4, r8.A09 ? r8.A0B : r8.A0C);
                    rect4.set(rect);
                    Rect rect5 = r8.A04;
                    rect4.right = rect5.right;
                    rect4.left = rect5.left;
                    rect4.bottom = rect5.top;
                    canvas2.drawRect(rect4, r8.A09 ? r8.A0B : r8.A0C);
                    rect4.set(rect);
                    Rect rect6 = r8.A04;
                    rect4.right = rect6.right;
                    rect4.left = rect6.left;
                    rect4.top = rect6.bottom;
                    canvas2.drawRect(rect4, r8.A09 ? r8.A0B : r8.A0C);
                    rect4.set(rect);
                    rect4.left = r8.A04.right;
                    canvas2.drawRect(rect4, r8.A09 ? r8.A0B : r8.A0C);
                    int round = Math.round(f2);
                    Rect rect7 = r8.A04;
                    int i3 = rect7.left + round;
                    int i4 = rect7.right - round;
                    int i5 = rect7.top;
                    int i6 = i5 + round;
                    int i7 = rect7.bottom;
                    int i8 = i7 - round;
                    float f4 = (float) i3;
                    float f5 = (float) (((i7 - i5) / 3) + i5);
                    Paint paint2 = paint;
                    float f6 = (float) i4;
                    canvas2.drawLine(f4, f5, f6, f5, paint2);
                    Rect rect8 = r8.A04;
                    int i9 = rect8.bottom;
                    float f7 = (float) (i9 - ((i9 - rect8.top) / 3));
                    canvas2.drawLine(f4, f7, f6, f7, paint2);
                    Rect rect9 = r8.A04;
                    int i10 = rect9.left;
                    float f8 = (float) (((rect9.right - i10) / 3) + i10);
                    float f9 = (float) i8;
                    float f10 = (float) i6;
                    canvas2.drawLine(f8, f10, f8, f9, paint2);
                    Rect rect10 = r8.A04;
                    int i11 = rect10.right;
                    float f11 = (float) (i11 - ((i11 - rect10.left) / 3));
                    canvas2.drawLine(f11, f10, f11, f9, paint2);
                }
                canvas2.drawPath(path, paint);
                float f12 = 2.0f * f2;
                int round2 = Math.round(f12);
                Rect rect11 = r8.A04;
                int i12 = rect11.left + round2;
                int i13 = rect11.right - round2;
                int i14 = rect11.top + round2;
                int i15 = rect11.bottom - round2;
                int i16 = (int) (f2 * 24.0f);
                int min = Math.min(i16, rect11.width() >> 2);
                int min2 = Math.min(i16, r8.A04.height() >> 2);
                Rect rect12 = r8.A04;
                int i17 = rect12.left;
                int i18 = i17 + ((rect12.right - i17) >> 1);
                int i19 = rect12.top;
                int i20 = i19 + ((rect12.bottom - i19) >> 1);
                paint.setStrokeWidth(f12);
                paint.setColor(-1);
                paint.setStrokeCap(Paint.Cap.SQUARE);
                int i21 = min >> 1;
                float f13 = (float) i14;
                Paint paint3 = paint;
                float f14 = (float) (i18 - i21);
                float f15 = (float) (i18 + i21);
                Canvas canvas3 = canvas2;
                canvas3.drawLine(f14, f13, f15, f13, paint3);
                float f16 = (float) i15;
                canvas3.drawLine(f14, f16, f15, f16, paint3);
                float f17 = (float) i12;
                int i22 = min2 >> 1;
                float f18 = (float) (i20 - i22);
                float f19 = (float) (i20 + i22);
                canvas3.drawLine(f17, f18, f17, f19, paint3);
                float f20 = (float) i13;
                canvas3.drawLine(f20, f18, f20, f19, paint3);
                float f21 = (float) (i12 + min);
                float f22 = f13;
                float f23 = f17;
                canvas3.drawLine(f23, f22, f21, f13, paint3);
                float f24 = (float) (i14 + min2);
                canvas3.drawLine(f23, f22, f17, f24, paint3);
                float f25 = (float) (i13 - min);
                Canvas canvas4 = canvas2;
                float f26 = f20;
                float f27 = f13;
                Paint paint4 = paint;
                canvas4.drawLine(f26, f27, f25, f13, paint4);
                canvas4.drawLine(f26, f27, f20, f24, paint4);
                canvas4.drawLine(f26, f16, f25, f16, paint4);
                float f28 = (float) (i15 - min2);
                Paint paint5 = paint;
                float f29 = f16;
                canvas2.drawLine(f20, f29, f20, f28, paint5);
                float f30 = f17;
                canvas2.drawLine(f30, f29, f21, f16, paint5);
                canvas2.drawLine(f30, f29, f17, f28, paint5);
                i2++;
            } else {
                return;
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.A0A.A00 != null) {
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                AnonymousClass2QO r2 = (AnonymousClass2QO) it.next();
                r2.A03.set(getImageMatrix());
                r2.A04 = r2.A02();
                if (r2.A09) {
                    A06(r2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03d0, code lost:
        if (r10[1] != 0.0f) goto L_0x03d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            boolean r0 = r6.isEnabled()
            r8 = 0
            if (r0 != 0) goto L_0x000a
            return r8
        L_0x000a:
            int r0 = r18.getAction()
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0403
            if (r0 == r4) goto L_0x03d9
            if (r0 != r5) goto L_0x00bb
            X.2QO r9 = r6.A03
            if (r9 == 0) goto L_0x00bb
            int r8 = r6.A02
            float r3 = r18.getX()
            float r0 = r6.A00
            float r3 = r3 - r0
            float r2 = r18.getY()
            float r0 = r6.A01
            float r2 = r2 - r0
            android.graphics.Rect r1 = r9.A02()
            if (r8 == r4) goto L_0x00aa
            r0 = 32
            if (r8 != r0) goto L_0x00d5
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r1)
            r7.offset(r3, r2)
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            android.graphics.Matrix r0 = r9.A03
            boolean r0 = r0.invert(r1)
            if (r0 == 0) goto L_0x004c
            r1.mapRect(r7)
        L_0x004c:
            float r3 = r7.left
            android.graphics.RectF r2 = r9.A05
            float r0 = r2.left
            float r3 = r3 - r0
            float r1 = r7.top
            float r0 = r2.top
            float r1 = r1 - r0
            android.graphics.Rect r0 = r9.A04
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r0)
            android.graphics.RectF r0 = r9.A05
            r0.offset(r3, r1)
            android.graphics.RectF r7 = r9.A05
            android.graphics.RectF r3 = r9.A06
            float r1 = r3.left
            float r0 = r7.left
            float r1 = r1 - r0
            r10 = 0
            float r2 = java.lang.Math.max(r10, r1)
            float r1 = r3.top
            float r0 = r7.top
            float r1 = r1 - r0
            float r0 = java.lang.Math.max(r10, r1)
            r7.offset(r2, r0)
            android.graphics.RectF r7 = r9.A05
            android.graphics.RectF r3 = r9.A06
            float r1 = r3.right
            float r0 = r7.right
            float r1 = r1 - r0
            float r2 = java.lang.Math.min(r10, r1)
            float r1 = r3.bottom
            float r0 = r7.bottom
            float r1 = r1 - r0
            float r0 = java.lang.Math.min(r10, r1)
            r7.offset(r2, r0)
            android.graphics.Rect r0 = r9.A02()
            r9.A04 = r0
            r8.union(r0)
            r0 = -10
            r8.inset(r0, r0)
            android.view.View r0 = r9.A07
            r0.invalidate(r8)
        L_0x00aa:
            float r0 = r18.getX()
            r6.A00 = r0
            float r0 = r18.getY()
            r6.A01 = r0
            X.2QO r0 = r6.A03
            r6.A05(r0)
        L_0x00bb:
            int r1 = r18.getAction()
            if (r1 == r4) goto L_0x00d1
            if (r1 == r5) goto L_0x00c7
            r0 = 3
            if (r1 == r0) goto L_0x00d1
        L_0x00c6:
            return r4
        L_0x00c7:
            float r1 = r6.getScale()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00c6
        L_0x00d1:
            r6.A00()
            return r4
        L_0x00d5:
            float[] r1 = new float[r5]
            r13 = 0
            r1[r13] = r3
            r1[r4] = r2
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            android.graphics.Matrix r0 = r9.A03
            boolean r0 = r0.invert(r7)
            if (r0 == 0) goto L_0x00ec
            r7.mapVectors(r1)
        L_0x00ec:
            r3 = r1[r13]
            r2 = r1[r4]
            r0 = r8 & 8
            r1 = 0
            if (r0 == 0) goto L_0x03d6
            float[] r10 = new float[r5]
            r10 = {0, 1065353216} // fill-array
            r7.mapVectors(r10)
            r11 = r10[r13]
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03b9
            r0 = r10[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03b9
            r12 = 3
        L_0x010a:
            r0 = r8 & 16
            if (r0 == 0) goto L_0x0124
            float[] r10 = new float[r5]
            r10 = {0, -1082130432} // fill-array
            r7.mapVectors(r10)
            r11 = r10[r13]
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0399
            r0 = r10[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0399
            r12 = r12 | 2
        L_0x0124:
            r0 = r8 & 4
            if (r0 == 0) goto L_0x013e
            float[] r10 = new float[r5]
            r10 = {1065353216, 0} // fill-array
            r7.mapVectors(r10)
            r11 = r10[r13]
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0379
            r0 = r10[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0379
            r12 = r12 | 8
        L_0x013e:
            r0 = r8 & 2
            if (r0 == 0) goto L_0x0158
            float[] r8 = new float[r5]
            r8 = {-1082130432, 0} // fill-array
            r7.mapVectors(r8)
            r7 = r8[r13]
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0359
            r0 = r8[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0359
            r12 = r12 | 8
        L_0x0158:
            r0 = r12 & 6
            if (r0 != 0) goto L_0x015d
            r3 = 0
        L_0x015d:
            r0 = r12 & 24
            if (r0 != 0) goto L_0x0162
            r2 = 0
        L_0x0162:
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x016e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0350
            float r0 = r9.A00
            float r2 = r3 / r0
        L_0x016e:
            android.graphics.RectF r0 = r9.A05
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r0)
            boolean r10 = r9.A0A
            if (r10 == 0) goto L_0x0186
            r8 = r12 & 18
            r0 = 18
            if (r8 == r0) goto L_0x0185
            r8 = r12 & 12
            r0 = 12
            if (r8 != r0) goto L_0x0186
        L_0x0185:
            float r2 = -r2
        L_0x0186:
            r16 = r12 & 2
            r15 = 1073741824(0x40000000, float:2.0)
            if (r16 == 0) goto L_0x01a9
            float r0 = r7.left
            float r0 = r0 + r3
            r7.left = r0
            if (r10 == 0) goto L_0x01a9
            r0 = r12 & 16
            if (r0 != 0) goto L_0x01a9
            r0 = r12 & 8
            if (r0 != 0) goto L_0x01a9
            float r8 = r7.top
            float r0 = r2 / r15
            float r8 = r8 + r0
            r7.top = r8
            float r8 = r7.bottom
            float r0 = r2 - r0
            float r8 = r8 - r0
            r7.bottom = r8
        L_0x01a9:
            r14 = r12 & 4
            if (r14 == 0) goto L_0x01ca
            float r0 = r7.right
            float r0 = r0 + r3
            r7.right = r0
            if (r10 == 0) goto L_0x01ca
            r0 = r12 & 16
            if (r0 != 0) goto L_0x01ca
            r0 = r12 & 8
            if (r0 != 0) goto L_0x01ca
            float r11 = r7.top
            float r8 = r2 / r15
            float r0 = r2 - r8
            float r11 = r11 - r0
            r7.top = r11
            float r0 = r7.bottom
            float r0 = r0 + r8
            r7.bottom = r0
        L_0x01ca:
            r13 = r12 & 8
            if (r13 == 0) goto L_0x01e7
            float r0 = r7.top
            float r0 = r0 + r2
            r7.top = r0
            if (r10 == 0) goto L_0x01e7
            if (r16 != 0) goto L_0x01e7
            if (r14 != 0) goto L_0x01e7
            float r8 = r7.left
            float r0 = r3 / r15
            float r8 = r8 + r0
            r7.left = r8
            float r8 = r7.right
            float r0 = r3 - r0
            float r8 = r8 - r0
            r7.right = r8
        L_0x01e7:
            r8 = r12 & 16
            if (r8 == 0) goto L_0x0203
            float r0 = r7.bottom
            float r0 = r0 + r2
            r7.bottom = r0
            if (r10 == 0) goto L_0x0203
            if (r16 != 0) goto L_0x0203
            if (r14 != 0) goto L_0x0203
            float r0 = r7.left
            float r2 = r3 / r15
            float r3 = r3 - r2
            float r0 = r0 - r3
            r7.left = r0
            float r0 = r7.right
            float r0 = r0 + r2
            r7.right = r0
        L_0x0203:
            r2 = 1103626240(0x41c80000, float:25.0)
            int r0 = r9.A01
            float r0 = (float) r0
            float r12 = java.lang.Math.max(r2, r0)
            float r0 = r7.width()
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x021b
            if (r16 == 0) goto L_0x033a
            float r0 = r7.right
            float r0 = r0 - r12
            r7.left = r0
        L_0x021b:
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x0337
            float r0 = r9.A00
            float r11 = r12 / r0
        L_0x0223:
            float r0 = r7.height()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0232
            if (r13 == 0) goto L_0x0321
            float r0 = r7.bottom
            float r0 = r0 - r11
            r7.top = r0
        L_0x0232:
            float r2 = r7.width()
            android.graphics.RectF r0 = r9.A06
            float r0 = r0.width()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x025a
            android.graphics.RectF r2 = r9.A06
            float r0 = r2.left
            r7.left = r0
            float r0 = r2.right
            r7.right = r0
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x025a
            float r3 = r7.top
            float r2 = r2.width()
            float r0 = r9.A00
            float r2 = r2 / r0
            float r3 = r3 + r2
            r7.bottom = r3
        L_0x025a:
            float r2 = r7.height()
            android.graphics.RectF r0 = r9.A06
            float r0 = r0.height()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0282
            android.graphics.RectF r2 = r9.A06
            float r0 = r2.top
            r7.top = r0
            float r0 = r2.bottom
            r7.bottom = r0
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x0282
            float r3 = r7.left
            float r2 = r2.height()
            float r0 = r9.A00
            float r2 = r2 * r0
            float r3 = r3 + r2
            r7.right = r3
        L_0x0282:
            float r10 = r7.left
            android.graphics.RectF r2 = r9.A06
            float r8 = r2.left
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x02ff
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x02ec
            float r8 = r8 - r10
            r7.offset(r8, r1)
        L_0x0294:
            float r10 = r7.top
            android.graphics.RectF r2 = r9.A06
            float r8 = r2.top
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x02cb
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x02b8
            float r8 = r8 - r10
            r7.offset(r1, r8)
        L_0x02a6:
            android.graphics.RectF r0 = r9.A05
            r0.set(r7)
            android.graphics.Rect r0 = r9.A02()
            r9.A04 = r0
            android.view.View r0 = r9.A07
            r0.invalidate()
            goto L_0x00aa
        L_0x02b8:
            r7.top = r8
            float r0 = r7.bottom
            float r0 = r0 - r11
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a6
            float r8 = r8 + r11
            float r0 = r2.bottom
            float r0 = java.lang.Math.min(r8, r0)
            r7.bottom = r0
            goto L_0x02a6
        L_0x02cb:
            float r3 = r7.bottom
            float r2 = r2.bottom
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a6
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x02dd
            float r3 = r3 - r2
            float r0 = -r3
            r7.offset(r1, r0)
            goto L_0x02a6
        L_0x02dd:
            r7.bottom = r2
            float r10 = r10 + r11
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a6
            float r2 = r2 - r11
            float r0 = java.lang.Math.max(r2, r8)
            r7.top = r0
            goto L_0x02a6
        L_0x02ec:
            r7.left = r8
            float r0 = r7.right
            float r0 = r0 - r12
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0294
            float r8 = r8 + r12
            float r0 = r2.right
            float r0 = java.lang.Math.min(r8, r0)
            r7.right = r0
            goto L_0x0294
        L_0x02ff:
            float r3 = r7.right
            float r2 = r2.right
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0294
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x0311
            float r3 = r3 - r2
            float r0 = -r3
            r7.offset(r0, r1)
            goto L_0x0294
        L_0x0311:
            r7.right = r2
            float r10 = r10 + r12
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0294
            float r2 = r2 - r12
            float r0 = java.lang.Math.max(r2, r8)
            r7.left = r0
            goto L_0x0294
        L_0x0321:
            if (r8 == 0) goto L_0x032a
            float r0 = r7.top
            float r0 = r0 + r11
            r7.bottom = r0
            goto L_0x0232
        L_0x032a:
            float r0 = r7.height()
            float r0 = r11 - r0
            float r0 = -r0
            float r0 = r0 / r15
            r7.inset(r1, r0)
            goto L_0x0232
        L_0x0337:
            r11 = r12
            goto L_0x0223
        L_0x033a:
            if (r14 == 0) goto L_0x0343
            float r0 = r7.left
            float r0 = r0 + r12
            r7.right = r0
            goto L_0x021b
        L_0x0343:
            float r0 = r7.width()
            float r0 = r12 - r0
            float r0 = -r0
            float r0 = r0 / r15
            r7.inset(r0, r1)
            goto L_0x021b
        L_0x0350:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x016e
            float r3 = r9.A00
            float r3 = r3 * r2
            goto L_0x016e
        L_0x0359:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0367
            r0 = r8[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0367
            r12 = r12 | 4
            goto L_0x0158
        L_0x0367:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0375
            r0 = r8[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0375
            r12 = r12 | 16
            goto L_0x0158
        L_0x0375:
            r12 = r12 | 2
            goto L_0x0158
        L_0x0379:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0387
            r0 = r10[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0387
            r12 = r12 | 2
            goto L_0x013e
        L_0x0387:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0395
            r0 = r10[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0395
            r12 = r12 | 16
            goto L_0x013e
        L_0x0395:
            r12 = r12 | 4
            goto L_0x013e
        L_0x0399:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03a7
            r0 = r10[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03a7
            r12 = r12 | 8
            goto L_0x0124
        L_0x03a7:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03b5
            r0 = r10[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03b5
            r12 = r12 | 4
            goto L_0x0124
        L_0x03b5:
            r12 = r12 | 16
            goto L_0x0124
        L_0x03b9:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03c7
            r0 = r10[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03c7
            r12 = 17
            goto L_0x010a
        L_0x03c7:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03d2
            r0 = r10[r4]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r12 = 5
            if (r0 == 0) goto L_0x010a
        L_0x03d2:
            r12 = 9
            goto L_0x010a
        L_0x03d6:
            r12 = 1
            goto L_0x010a
        L_0x03d9:
            X.2QO r1 = r6.A03
            if (r1 == 0) goto L_0x03fe
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x03ec
            r1.A09 = r8
            android.graphics.Rect r0 = r1.A02()
            r1.A04 = r0
            r6.invalidate()
        L_0x03ec:
            X.2QO r0 = r6.A03
            r6.A06(r0)
            X.2QO r1 = r6.A03
            int r0 = r1.A02
            if (r8 == r0) goto L_0x03fe
            r1.A02 = r8
            android.view.View r0 = r1.A07
            r0.invalidate()
        L_0x03fe:
            r0 = 0
            r6.A03 = r0
            goto L_0x00bb
        L_0x0403:
            java.util.ArrayList r7 = r6.A06
            int r0 = r7.size()
            if (r8 >= r0) goto L_0x00bb
            java.lang.Object r2 = r7.get(r8)
            X.2QO r2 = (X.AnonymousClass2QO) r2
            float r1 = r18.getX()
            float r0 = r18.getY()
            int r3 = r2.A00(r1, r0)
            if (r3 == r4) goto L_0x0474
            r6.A02 = r3
            r6.A03 = r2
            float r0 = r18.getX()
            r6.A00 = r0
            float r0 = r18.getY()
            r6.A01 = r0
            X.2QO r2 = r6.A03
            r0 = 32
            r1 = 2
            if (r3 != r0) goto L_0x0437
            r1 = 1
        L_0x0437:
            int r0 = r2.A02
            if (r1 == r0) goto L_0x0442
            r2.A02 = r1
            android.view.View r0 = r2.A07
            r0.invalidate()
        L_0x0442:
            r6.clearFocus()
            r3 = 0
        L_0x0446:
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x046c
            java.lang.Object r2 = r7.get(r3)
            X.2QO r2 = (X.AnonymousClass2QO) r2
            float r1 = r18.getX()
            float r0 = r18.getY()
            int r0 = r2.A00(r1, r0)
            if (r0 == r4) goto L_0x0471
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x046c
            r2.A09 = r4
            android.graphics.Rect r0 = r2.A02()
            r2.A04 = r0
        L_0x046c:
            r6.invalidate()
            goto L_0x00bb
        L_0x0471:
            int r3 = r3 + 1
            goto L_0x0446
        L_0x0474:
            int r8 = r8 + 1
            goto L_0x0403
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.crop.CropImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
