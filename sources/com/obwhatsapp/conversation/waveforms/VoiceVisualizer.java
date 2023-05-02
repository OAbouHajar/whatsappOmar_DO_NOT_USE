package com.obwhatsapp.conversation.waveforms;

import X.AnonymousClass00B;
import X.AnonymousClass1ZK;
import X.AnonymousClass4BW;
import X.AnonymousClass4OA;
import X.C101614xb;
import X.C107955Mc;
import X.C87594Xo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.yo.Conversation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class VoiceVisualizer extends View {
    public static final int[] A0L = new int[2];
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public C107955Mc A08;
    public boolean A09;
    public boolean A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final LinkedList A0I;
    public final List A0J;
    public final List A0K;

    public VoiceVisualizer(Context context) {
        this(context, (AttributeSet) null);
    }

    public VoiceVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public VoiceVisualizer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A0I = new LinkedList();
        this.A0K = new ArrayList();
        this.A0J = new ArrayList();
        Paint paint = new Paint(5);
        this.A0G = paint;
        Paint paint2 = new Paint(5);
        this.A0H = paint2;
        Paint paint3 = new Paint(5);
        this.A0F = paint3;
        this.A07 = 166;
        this.A09 = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass4BW.A0K, 0, 0);
        try {
            AnonymousClass4OA r1 = new AnonymousClass4OA();
            r1.A06 = obtainStyledAttributes.getColor(5, -7829368);
            r1.A05 = obtainStyledAttributes.getColor(4, -16711936);
            r1.A03 = obtainStyledAttributes.getColor(0, -16711936);
            r1.A04 = obtainStyledAttributes.getColor(2, 0);
            r1.A01 = (float) obtainStyledAttributes.getDimensionPixelOffset(6, C87594Xo.A00(context, 5.0f));
            r1.A02 = (float) obtainStyledAttributes.getDimensionPixelOffset(7, C87594Xo.A00(context, 3.0f));
            r1.A00 = (float) obtainStyledAttributes.getDimensionPixelOffset(1, C87594Xo.A00(context, 0.0f));
            float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(3, C87594Xo.A00(context, 0.0f));
            Paint.Cap cap = Paint.Cap.ROUND;
            int i3 = r1.A06;
            int i4 = r1.A05;
            int i5 = r1.A03;
            float f2 = r1.A01;
            float f3 = r1.A02;
            float f4 = r1.A00;
            int i6 = r1.A04;
            obtainStyledAttributes.recycle();
            paint.setStrokeCap(cap);
            paint2.setStrokeCap(cap);
            this.A0D = f2;
            this.A0C = 1.8f * f2;
            this.A0B = f2 * 2.0f;
            this.A0E = f3;
            this.A01 = f4;
            this.A02 = dimensionPixelSize;
            paint3.setStrokeWidth(dimensionPixelSize);
            setSegmentColor(Conversation.seekBarVNColor(i3));
            setProgressColor(i4);
            this.A04 = i5;
            this.A05 = i6;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDesiredWidth() {
        return (int) (((float) this.A0J.size()) * this.A0D);
    }

    private void setProgressBubbleColor(int i2) {
        this.A04 = i2;
    }

    private void setProgressBubbleStrokeColor(int i2) {
        this.A05 = i2;
    }

    private void setProgressColor(int i2) {
        this.A0G.setColor(i2);
    }

    private void setSegmentColor(int i2) {
        this.A0H.setColor(i2);
    }

    public final float A00(MotionEvent motionEvent) {
        int[] iArr = A0L;
        getLocationInWindow(iArr);
        return Math.max(Math.min((motionEvent.getRawX() - ((float) (iArr[0] + getPaddingLeft()))) / (((float) (getWidth() - (getPaddingRight() + getPaddingLeft()))) * getScaleX()), 1.0f), 0.0f);
    }

    public final void A01(Canvas canvas, Paint paint, float f2, int i2) {
        Canvas canvas2 = canvas;
        int height = (canvas2.getHeight() - getPaddingTop()) - getPaddingBottom();
        float f3 = this.A0D;
        float f4 = f2 * f3;
        float width = ((float) (canvas2.getWidth() - getPaddingRight())) - f4;
        List list = this.A0J;
        Paint paint2 = paint;
        if (!list.isEmpty()) {
            int i3 = 0;
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                A03(canvas2, paint2, 1.0f, ((Number) list.get(i4)).floatValue(), width, height, i3);
                i3++;
            }
            return;
        }
        Iterator descendingIterator = this.A0I.descendingIterator();
        boolean z2 = false;
        int i5 = 0;
        while (descendingIterator.hasNext()) {
            float floatValue = ((Number) descendingIterator.next()).floatValue();
            if (z2) {
                descendingIterator.remove();
            } else {
                float f5 = (((float) i5) * f3) + f4;
                float width2 = ((float) (canvas2.getWidth() - getPaddingLeft())) - f5;
                float min = width2 < f5 ? Math.min(1.0f, width2 / this.A0C) : Math.min(1.0f, f5 / this.A0B);
                if (A03(canvas2, paint2, (float) (min < 0.5f ? (double) (4.0f * min * min * min) : 1.0d - (Math.pow((double) ((min * -2.0f) + 2.0f), 3.0d) / 2.0d)), floatValue, width, height, i5)) {
                    i5++;
                } else {
                    descendingIterator.remove();
                    z2 = true;
                }
            }
        }
    }

    public void A02(List list, float f2) {
        AnonymousClass00B.A0F(this.A0I.isEmpty());
        List list2 = this.A0K;
        list2.clear();
        List list3 = this.A0J;
        list3.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            list2.add(Float.valueOf(number.floatValue()));
            list3.add(Float.valueOf(number.floatValue()));
        }
        setPlaybackPercentage(f2);
        requestLayout();
    }

    public final boolean A03(Canvas canvas, Paint paint, float f2, float f3, float f4, int i2, int i3) {
        float f5 = f4 - (this.A0D * ((float) i3));
        float f6 = this.A0E;
        if (f5 < ((float) getPaddingLeft()) - f6) {
            return false;
        }
        float f7 = (float) i2;
        float max = Math.max(0.006f, f3) * f7 * f2;
        float paddingTop = ((float) getPaddingTop()) + ((f7 - max) / 2.0f);
        paint.setStrokeWidth(f6);
        Canvas canvas2 = canvas;
        float f8 = f5;
        canvas2.drawLine(f5, paddingTop, f8, paddingTop + max, paint);
        return true;
    }

    public float getPlaybackPercentage() {
        return this.A00;
    }

    public float getSegmentSpacingPx() {
        return this.A0D;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        int size;
        super.onDraw(canvas);
        LinkedList linkedList = this.A0I;
        if (!linkedList.isEmpty() || !this.A0J.isEmpty()) {
            List list = this.A0J;
            float f2 = 1.0f;
            if (list.isEmpty()) {
                size = linkedList.size();
                long j2 = this.A06;
                f2 = j2 != 0 ? (((float) (SystemClock.elapsedRealtime() - j2)) * 1.0f) / ((float) this.A07) : 0.0f;
            } else {
                size = list.size();
            }
            A01(canvas, this.A0H, f2, size);
            if (this.A00 > 0.0f) {
                canvas.save();
                canvas.clipRect(((float) getPaddingLeft()) - this.A0D, 0.0f, (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * this.A00) + ((float) getPaddingLeft()), (float) getHeight());
                A01(canvas, this.A0G, f2, size);
                canvas.restore();
            }
            if (this.A01 != 0.0f) {
                float f3 = this.A0E / 2.0f;
                float width = ((((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) - f3) * this.A00) + (((float) getPaddingLeft()) - f3);
                float height = ((float) getHeight()) / 2.0f;
                Paint paint = this.A0F;
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(this.A04);
                canvas.drawCircle(width, height, this.A01, paint);
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(this.A05);
                canvas.drawCircle(width, height, this.A01 + this.A02, paint);
            }
            if (this.A0A) {
                invalidate();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r6 >= 100000) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            int r6 = android.view.View.MeasureSpec.getSize(r9)
            java.util.List r3 = r8.A0K
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x003c
            r5 = r6
        L_0x0011:
            r4 = 1
            if (r6 <= 0) goto L_0x001a
            r0 = 100000(0x186a0, float:1.4013E-40)
            r1 = 1
            if (r6 < r0) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            int r0 = r5 - r6
            int r0 = java.lang.Math.abs(r0)
            float r0 = (float) r0
            float r7 = r8.A0D
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            r4 = 0
        L_0x0029:
            if (r1 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0071
            float r0 = (float) r6
            float r0 = r0 / r7
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r5 = (int) r0
            goto L_0x0041
        L_0x003c:
            int r5 = r8.getDesiredWidth()
            goto L_0x0011
        L_0x0041:
            java.util.List r0 = r8.A0J     // Catch:{ Exception | OutOfMemoryError -> 0x0047 }
            X.C809246c.A00(r3, r0, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0047 }
            goto L_0x006d
        L_0x0047:
            r4 = move-exception
            java.util.Locale r3 = java.util.Locale.US
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2[r1] = r0
            r1 = 1
            java.lang.Float r0 = java.lang.Float.valueOf(r7)
            r2[r1] = r0
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2[r1] = r0
            java.lang.String r0 = "widthUpperBound %d / segmentSpacing %.2f = maxNumSegments %d"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            com.whatsapp.util.Log.e(r0, r4)
            throw r4
        L_0x006d:
            int r5 = r8.getDesiredWidth()
        L_0x0071:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r2 == r0) goto L_0x007d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r0) goto L_0x0085
            int r6 = java.lang.Math.min(r5, r6)
        L_0x007d:
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            r8.setMeasuredDimension(r6, r0)
            return
        L_0x0085:
            r6 = r5
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.waveforms.VoiceVisualizer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A08 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            if (this.A09) {
                this.A09 = false;
                AnonymousClass1ZK.A00(((C101614xb) this.A08).A00);
            }
        } else if (actionMasked == 2) {
            float A002 = A00(motionEvent);
            if (!this.A09) {
                if (Math.abs(A002 - this.A03) >= 0.015f) {
                    this.A09 = true;
                    setPlaybackPercentage(A002);
                    AnonymousClass1ZK r6 = ((C101614xb) this.A08).A00;
                    r6.A1K.A02++;
                    if (r6.A0N != null) {
                        r6.A0a.removeCallbacks(r6.A1S);
                        r6.A08 = -1;
                    }
                }
                return true;
            }
            setPlaybackPercentage(A002);
            AnonymousClass1ZK r3 = ((C101614xb) this.A08).A00;
            AnonymousClass1ZK.A01(r3, (int) (((float) r3.A0A) * A002), true);
            return true;
        } else if (actionMasked == 0) {
            this.A03 = A00(motionEvent);
            return true;
        }
        return false;
    }

    public void setOnVoiceVisualizerChangeListener(C107955Mc r1) {
        this.A08 = r1;
    }

    public void setPlaybackPercentage(float f2) {
        if (f2 >= 0.0f && f2 <= 1.0f) {
            this.A00 = f2;
            postInvalidateOnAnimation();
        }
    }

    public void setProgressBubbleRadius(float f2) {
        this.A01 = f2;
        invalidate();
    }

    public void setProgressBubbleStokeWidth(float f2) {
        this.A02 = f2;
        invalidate();
    }
}
