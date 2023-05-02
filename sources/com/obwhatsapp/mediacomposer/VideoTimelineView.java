package com.obwhatsapp.mediacomposer;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.C004601z;
import X.C102724zQ;
import X.C108065Mn;
import X.C108845Ps;
import X.C16150sX;
import X.C16320sq;
import X.C16690tT;
import X.C456329v;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C57112q9;
import X.C609736v;
import X.C816849i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class VideoTimelineView extends View implements C456329v, AnonymousClass006 {
    public static final long A0U = TimeUnit.SECONDS.toMillis(1);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AnonymousClass013 A0H;
    public C108845Ps A0I;
    public C108065Mn A0J;
    public C57112q9 A0K;
    public C16690tT A0L;
    public C16320sq A0M;
    public C52662eE A0N;
    public File A0O;
    public ArrayList A0P;
    public boolean A0Q;
    public final Paint A0R;
    public final Rect A0S;
    public final RectF A0T;

    public VideoTimelineView(Context context) {
        super(context);
        A02();
        this.A0R = new Paint(1);
        this.A0T = new RectF();
        this.A0S = new Rect();
        this.A00 = 1.0f;
        this.A07 = -1;
        this.A05 = 12.0f;
        this.A0B = -1;
        this.A06 = 12.0f;
        this.A0C = -1;
        this.A08 = 855638016;
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0R = new Paint(1);
        this.A0T = new RectF();
        this.A0S = new Rect();
        this.A00 = 1.0f;
        this.A07 = -1;
        this.A05 = 12.0f;
        this.A0B = -1;
        this.A06 = 12.0f;
        this.A0C = -1;
        this.A08 = 855638016;
        A04(context, attributeSet);
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A0R = new Paint(1);
        this.A0T = new RectF();
        this.A0S = new Rect();
        this.A00 = 1.0f;
        this.A07 = -1;
        this.A05 = 12.0f;
        this.A0B = -1;
        this.A06 = 12.0f;
        this.A0C = -1;
        this.A08 = 855638016;
        A04(context, attributeSet);
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A02();
        this.A0R = new Paint(1);
        this.A0T = new RectF();
        this.A0S = new Rect();
        this.A00 = 1.0f;
        this.A07 = -1;
        this.A05 = 12.0f;
        this.A0B = -1;
        this.A06 = 12.0f;
        this.A0C = -1;
        this.A08 = 855638016;
        A04(context, attributeSet);
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A02();
    }

    private int getTimelineHeight() {
        return Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom());
    }

    private int getTimelineWidth() {
        return Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight());
    }

    public final int A00(long j2) {
        return Math.min(getPaddingLeft() + getTimelineWidth(), Math.max(getPaddingLeft(), (int) (((long) getPaddingLeft()) + ((((long) getTimelineWidth()) * j2) / this.A0D))));
    }

    public final long A01(float f2) {
        return Math.min(this.A0D, Math.max((long) ((((float) this.A0D) * (f2 - ((float) getPaddingLeft()))) / ((float) getTimelineWidth())), 0));
    }

    public void A02() {
        if (!this.A0Q) {
            this.A0Q = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A0M = (C16320sq) r1.ARB.get();
            this.A0H = (AnonymousClass013) r1.AR8.get();
        }
    }

    public final void A03(float f2) {
        int i2;
        if (this.A01 != f2 && (i2 = this.A0A) != 0) {
            float f3 = f2 - this.A02;
            if (i2 == 1) {
                long A012 = A01(this.A03 + f3);
                long j2 = this.A0G;
                long max = Math.max(0, Math.min(A012, j2));
                this.A0F = max;
                long j3 = this.A0E;
                if (j2 - max > j3) {
                    this.A0G = max + j3;
                }
            } else if (i2 != 2) {
                long j4 = this.A0G - this.A0F;
                long A013 = A01(this.A03 + f3);
                this.A0F = A013;
                if (A013 == 0) {
                    this.A0G = A013 + j4;
                } else {
                    long A014 = A01(this.A04 + f3);
                    this.A0G = A014;
                    if (A014 == this.A0D) {
                        this.A0F = A014 - j4;
                    }
                }
            } else {
                long A015 = A01(this.A04 + f3);
                long j5 = this.A0D;
                long j6 = this.A0F;
                long min = Math.min(j5, Math.max(A015, j6));
                this.A0G = min;
                long j7 = this.A0E;
                if (min - j6 > j7) {
                    this.A0F = min - j7;
                }
            }
            this.A01 = f2;
            invalidate();
            C108845Ps r7 = this.A0I;
            if (r7 != null) {
                r7.AYt(this, this.A0A, this.A0F, this.A0G);
            }
        }
    }

    public final void A04(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            C57112q9 r0 = new C57112q9(this, this, context.getResources().getDimensionPixelSize(R.dimen.dimen0762));
            this.A0K = r0;
            C004601z.A0j(this, r0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C816849i.A00);
            this.A00 = obtainStyledAttributes.getDimension(1, this.A00);
            this.A07 = obtainStyledAttributes.getInteger(0, this.A07);
            this.A05 = obtainStyledAttributes.getDimension(5, this.A05);
            this.A0B = obtainStyledAttributes.getInteger(3, this.A0B);
            this.A06 = obtainStyledAttributes.getDimension(6, this.A06);
            this.A0C = obtainStyledAttributes.getInteger(4, this.A0C);
            this.A08 = obtainStyledAttributes.getInteger(2, this.A08);
            obtainStyledAttributes.recycle();
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.A0K.A0K(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0N;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0N = r0;
        }
        return r0.generatedComponent();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C16690tT r2 = this.A0L;
        if (r2 != null) {
            r2.A06(true);
            this.A0L = null;
        }
        this.A0P = null;
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (this.A0O != null) {
            int timelineWidth = getTimelineWidth();
            int timelineHeight = getTimelineHeight();
            if (timelineHeight > 0 && timelineWidth > 0) {
                if (this.A09 != timelineWidth) {
                    this.A09 = timelineWidth;
                    this.A0P = null;
                    C16690tT r0 = this.A0L;
                    if (r0 != null) {
                        r0.A06(true);
                        this.A0L = null;
                    }
                }
                if (this.A0P != null) {
                    float f2 = ((float) timelineWidth) / ((float) (timelineWidth / timelineHeight));
                    RectF rectF = this.A0T;
                    rectF.top = (float) getPaddingTop();
                    rectF.bottom = (float) (getPaddingTop() + timelineHeight);
                    for (int i2 = 0; i2 < this.A0P.size(); i2++) {
                        float paddingLeft = ((float) getPaddingLeft()) + (((float) i2) * f2);
                        rectF.left = paddingLeft;
                        rectF.right = paddingLeft + f2;
                        Bitmap bitmap = (Bitmap) this.A0P.get(i2);
                        if (bitmap != null) {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            Rect rect = this.A0S;
                            if (width > height) {
                                rect.top = 0;
                                rect.bottom = height;
                                int i3 = (width - height) / 2;
                                rect.left = i3;
                                rect.right = i3 + height;
                            } else {
                                rect.left = 0;
                                rect.right = width;
                                int i4 = (height - width) / 2;
                                rect.top = i4;
                                rect.bottom = i4 + width;
                            }
                            canvas2.drawBitmap(bitmap, rect, rectF, this.A0R);
                        }
                    }
                } else if (this.A0L == null) {
                    int i5 = timelineWidth / timelineHeight;
                    this.A0P = new ArrayList(i5);
                    C609736v r13 = new C609736v(this, this.A0O, ((float) timelineWidth) / ((float) i5), (float) timelineHeight, i5);
                    this.A0L = r13;
                    this.A0M.Ack(r13, new Void[0]);
                }
                if (this.A0I != null) {
                    float A002 = (float) A00(this.A0F);
                    float A003 = (float) A00(this.A0G);
                    Paint paint = this.A0R;
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(this.A08);
                    RectF rectF2 = this.A0T;
                    rectF2.set((float) getPaddingLeft(), (float) getPaddingTop(), A002, (float) (getHeight() - getPaddingBottom()));
                    canvas2.drawRect(rectF2, paint);
                    rectF2.set(A003, (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
                    canvas2.drawRect(rectF2, paint);
                    C108065Mn r02 = this.A0J;
                    if (r02 != null) {
                        VideoComposerFragment videoComposerFragment = ((C102724zQ) r02).A00;
                        if (videoComposerFragment.A0M.A0C()) {
                            videoComposerFragment.A01 = (long) videoComposerFragment.A0M.A03();
                        }
                        long j2 = videoComposerFragment.A01;
                        if (j2 >= 0 && j2 >= this.A0F && j2 <= this.A0G) {
                            paint.setColor(this.A07);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(this.A00 / 2.0f);
                            float A004 = (float) A00(j2);
                            canvas2.drawLine(A004, (float) getPaddingTop(), A004, (float) (getHeight() - getPaddingBottom()), paint);
                        }
                        if (((C102724zQ) this.A0J).A00.A0M.A0C()) {
                            invalidate();
                        }
                    }
                    paint.setColor(this.A07);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(this.A00);
                    rectF2.set(A002 - 1.0f, (float) getPaddingTop(), 1.0f + A003, (float) (getHeight() - getPaddingBottom()));
                    canvas2.drawRect(rectF2, paint);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(this.A0A == 1 ? this.A0C : this.A0B);
                    int i6 = timelineHeight / 2;
                    canvas2.drawCircle(A002, (float) (getPaddingTop() + i6), this.A0A == 1 ? this.A06 : this.A05, paint);
                    paint.setColor(this.A0A == 2 ? this.A0C : this.A0B);
                    canvas2.drawCircle(A003, (float) (getPaddingTop() + i6), this.A0A == 2 ? this.A06 : this.A05, paint);
                    int i7 = (int) A002;
                    int i8 = (int) A003;
                    int paddingTop = getPaddingTop();
                    int height2 = getHeight() - getPaddingBottom();
                    C57112q9 r3 = this.A0K;
                    Rect rect2 = r3.A02;
                    int i9 = r3.A05;
                    rect2.left = i7 - i9;
                    rect2.right = i7;
                    rect2.top = paddingTop;
                    rect2.bottom = height2;
                    Rect rect3 = r3.A03;
                    rect3.left = i7;
                    rect3.right = i7 + i9;
                    rect3.top = paddingTop;
                    rect3.bottom = height2;
                    Rect rect4 = r3.A00;
                    rect4.left = i8 - i9;
                    rect4.right = i8;
                    rect4.top = paddingTop;
                    rect4.bottom = height2;
                    Rect rect5 = r3.A01;
                    rect5.left = i8;
                    rect5.right = i8 + i9;
                    rect5.top = paddingTop;
                    rect5.bottom = height2;
                    r3.A04 = true;
                    r3.A0A();
                }
            }
        } else if (isInEditMode()) {
            Paint paint2 = this.A0R;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(this.A08);
            RectF rectF3 = this.A0T;
            rectF3.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
            canvas2.drawRect(rectF3, paint2);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, i2, i3)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r1 != 3) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00da, code lost:
        if ((r5 / ((float) getWidth())) <= 0.5f) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011d, code lost:
        if (r5 >= (r8 - r10)) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            X.5Ps r0 = r11.A0I
            if (r0 != 0) goto L_0x0009
            boolean r0 = super.onTouchEvent(r12)
            return r0
        L_0x0009:
            boolean r0 = r11.isEnabled()
            r3 = 0
            if (r0 != 0) goto L_0x0011
            return r3
        L_0x0011:
            int r0 = r12.getAction()
            r1 = r0 & 255(0xff, float:3.57E-43)
            float r5 = r12.getX()
            r4 = 1
            if (r1 == 0) goto L_0x006b
            if (r1 == r4) goto L_0x0027
            r0 = 2
            if (r1 == r0) goto L_0x0123
            r0 = 3
            if (r1 == r0) goto L_0x0027
        L_0x0026:
            return r4
        L_0x0027:
            r11.A03(r5)
            X.5Ps r0 = r11.A0I
            if (r0 == 0) goto L_0x0067
            X.3G7 r0 = (X.AnonymousClass3G7) r0
            com.obwhatsapp.mediacomposer.VideoComposerFragment r5 = r0.A00
            boolean r0 = r5.A0Q
            if (r0 == 0) goto L_0x0041
            X.29D r6 = r5.A0M
            long r1 = r5.A02
            int r0 = (int) r1
            r6.A0A(r0)
            r5.A1D()
        L_0x0041:
            android.widget.TextView r1 = r5.A0E
            r0 = 4
            r1.setVisibility(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 100
            r2.setDuration(r0)
            android.widget.TextView r0 = r5.A0E
            r0.startAnimation(r2)
            X.00l r0 = r5.A0C()
            X.29K r0 = (X.AnonymousClass29K) r0
            r0.AQ0()
            X.2Rc r0 = r5.A0J
            r0.A04()
        L_0x0067:
            r11.A0A = r3
            goto L_0x010e
        L_0x006b:
            r11.A02 = r5
            long r0 = r11.A0F
            int r0 = r11.A00(r0)
            float r0 = (float) r0
            r11.A03 = r0
            long r0 = r11.A0G
            int r0 = r11.A00(r0)
            float r0 = (float) r0
            r11.A04 = r0
            long r0 = r11.A0F
            int r0 = r11.A00(r0)
            float r9 = (float) r0
            long r0 = r11.A0G
            int r0 = r11.A00(r0)
            float r8 = (float) r0
            float r2 = r11.A05
            int r1 = r11.getTimelineWidth()
            r0 = 3
            int r1 = r1 / r0
            int r0 = r11.getTimelineHeight()
            int r0 = java.lang.Math.min(r1, r0)
            float r0 = (float) r0
            float r10 = java.lang.Math.max(r2, r0)
            float r0 = r5 - r9
            float r7 = java.lang.Math.abs(r0)
            r2 = 1
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ae
            r3 = 1
        L_0x00ae:
            float r0 = r5 - r8
            float r6 = java.lang.Math.abs(r0)
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x00ba
            r0 = 1
        L_0x00ba:
            if (r3 == 0) goto L_0x0112
            if (r0 == 0) goto L_0x00dc
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00dc
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0121
            float r7 = r7 - r6
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00dc
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0121
            int r0 = r11.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0121
        L_0x00dc:
            r11.A0A = r2
            X.5Ps r0 = r11.A0I
            if (r0 == 0) goto L_0x0026
            X.3G7 r0 = (X.AnonymousClass3G7) r0
            com.obwhatsapp.mediacomposer.VideoComposerFragment r3 = r0.A00
            X.29D r0 = r3.A0M
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x00f1
            r3.A1I()
        L_0x00f1:
            android.widget.TextView r1 = r3.A0E
            r0 = 0
            r1.setVisibility(r0)
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 100
            r2.setDuration(r0)
            android.widget.TextView r0 = r3.A0E
            r0.startAnimation(r2)
            X.2Rc r0 = r3.A0J
            r0.A03()
        L_0x010e:
            r11.invalidate()
            return r4
        L_0x0112:
            if (r0 != 0) goto L_0x0121
            float r9 = r9 + r10
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x011f
            float r8 = r8 - r10
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r2 = 3
            if (r0 < 0) goto L_0x00dc
        L_0x011f:
            r2 = 0
            goto L_0x00dc
        L_0x0121:
            r2 = 2
            goto L_0x00dc
        L_0x0123:
            r11.A03(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.VideoTimelineView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMaxTrim(long j2) {
        this.A0E = j2;
    }

    public void setTrimListener(C108845Ps r1) {
        this.A0I = r1;
    }

    public void setVideoPlayback(C108065Mn r1) {
        this.A0J = r1;
    }
}
