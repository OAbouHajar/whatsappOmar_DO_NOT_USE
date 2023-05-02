package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.0Fh  reason: invalid class name and case insensitive filesystem */
public class C02800Fh extends AnonymousClass07D implements AnonymousClass05I {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08 = 0;
    public int A09 = -1;
    public int A0A = -1;
    public int A0B;
    public int A0C;
    public long A0D;
    public Rect A0E;
    public VelocityTracker A0F;
    public View A0G = null;
    public AnonymousClass09P A0H;
    public AnonymousClass0V7 A0I;
    public AnonymousClass0Be A0J;
    public C11950jb A0K = null;
    public C005602k A0L = null;
    public RecyclerView A0M;
    public List A0N;
    public List A0O = AnonymousClass000.A0u();
    public List A0P;
    public final C13210le A0Q = new C07670cH(this);
    public final Runnable A0R = new C09510fd(this);
    public final List A0S = AnonymousClass000.A0u();
    public final float[] A0T = new float[2];

    public C02800Fh(AnonymousClass0V7 r4) {
        this.A0I = r4;
    }

    public void A01(Canvas canvas, AnonymousClass0Ri r22, RecyclerView recyclerView) {
        float f2;
        float f3;
        Canvas canvas2;
        RecyclerView recyclerView2;
        this.A0A = -1;
        if (this.A0L != null) {
            float[] fArr = this.A0T;
            A0E(fArr);
            f2 = fArr[0];
            f3 = fArr[1];
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        C005602k r3 = this.A0L;
        List list = this.A0O;
        int i2 = this.A08;
        int size = list.size();
        int i3 = 0;
        while (true) {
            canvas2 = canvas;
            recyclerView2 = recyclerView;
            if (i3 >= size) {
                break;
            }
            AnonymousClass0XS r7 = (AnonymousClass0XS) list.get(i3);
            float f4 = r7.A06;
            float f5 = r7.A08;
            r7.A01 = f4 == f5 ? r7.A0C.A0H.getTranslationX() : AnonymousClass000.A01(f5, f4, r7.A00);
            float f6 = r7.A07;
            float f7 = r7.A09;
            r7.A02 = f6 == f7 ? r7.A0C.A0H.getTranslationY() : AnonymousClass000.A01(f7, f6, r7.A00);
            int save = canvas2.save();
            C07580c8.A00.AQB(canvas2, r7.A0C.A0H, recyclerView2, r7.A01, r7.A02, r7.A0A, false);
            canvas2.restoreToCount(save);
            i3++;
        }
        if (r3 != null) {
            int save2 = canvas2.save();
            C07580c8.A00.AQB(canvas2, r3.A0H, recyclerView2, f2, f3, i2, true);
            canvas2.restoreToCount(save2);
        }
    }

    public void A02(Canvas canvas, AnonymousClass0Ri r8, RecyclerView recyclerView) {
        if (this.A0L != null) {
            A0E(this.A0T);
        }
        C005602k r5 = this.A0L;
        List list = this.A0O;
        int size = list.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2);
            canvas.restoreToCount(canvas.save());
        }
        if (r5 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            AnonymousClass0XS r1 = (AnonymousClass0XS) list.get(i3);
            if (!r1.A03) {
                z2 = true;
            } else if (!r1.A04) {
                list.remove(i3);
            }
        }
        if (z2) {
            recyclerView.invalidate();
        }
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r3, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    public final int A04(int i2) {
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i3 = 8;
        int i4 = 4;
        if (this.A00 > 0.0f) {
            i4 = 8;
        }
        VelocityTracker velocityTracker = this.A0F;
        if (velocityTracker != null && this.A09 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.A04);
            float xVelocity = this.A0F.getXVelocity(this.A09);
            float yVelocity = this.A0F.getYVelocity(this.A09);
            if (xVelocity <= 0.0f) {
                i3 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i3 & i2) != 0 && i4 == i3 && abs >= this.A07 && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = ((float) this.A0M.getWidth()) * 0.5f;
        if ((i2 & i4) == 0 || Math.abs(this.A00) <= width) {
            return 0;
        }
        return i4;
    }

    public final int A05(int i2) {
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i3 = 2;
        int i4 = 1;
        if (this.A01 > 0.0f) {
            i4 = 2;
        }
        VelocityTracker velocityTracker = this.A0F;
        if (velocityTracker != null && this.A09 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.A04);
            float xVelocity = this.A0F.getXVelocity(this.A09);
            float yVelocity = this.A0F.getYVelocity(this.A09);
            if (yVelocity <= 0.0f) {
                i3 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i3 & i2) != 0 && i3 == i4 && abs >= this.A07 && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = ((float) this.A0M.getHeight()) * 0.5f;
        if ((i2 & i4) == 0 || Math.abs(this.A01) <= height) {
            return 0;
        }
        return i4;
    }

    public View A06(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        C005602k r0 = this.A0L;
        if (r0 != null) {
            View view = r0.A0H;
            float f2 = this.A05 + this.A00;
            float f3 = this.A06 + this.A01;
            if (x2 >= f2 && x2 <= f2 + ((float) view.getWidth()) && y2 >= f3 && y2 <= f3 + ((float) view.getHeight())) {
                return view;
            }
        }
        List list = this.A0O;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.A0M.A0B(x2, y2);
            }
            AnonymousClass0XS r1 = (AnonymousClass0XS) list.get(size);
            View view2 = r1.A0C.A0H;
            float f4 = r1.A01;
            float f5 = r1.A02;
            if (x2 >= f4 && x2 <= f4 + ((float) view2.getWidth()) && y2 >= f5 && y2 <= f5 + ((float) view2.getHeight())) {
                return view2;
            }
        }
    }

    public void A07(MotionEvent motionEvent, int i2, int i3) {
        View A062;
        C005602k A0F2;
        int A002;
        int i4;
        if (this.A0L == null && i2 == 2 && this.A08 != 2) {
            AnonymousClass0V7 r4 = this.A0I;
            if (r4.A04()) {
                RecyclerView recyclerView = this.A0M;
                if (recyclerView.A0B != 1) {
                    AnonymousClass02W layoutManager = recyclerView.getLayoutManager();
                    int i5 = this.A09;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.A02);
                        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.A03);
                        float f2 = (float) this.A0C;
                        if (abs < f2 && abs2 < f2) {
                            return;
                        }
                        if (abs > abs2 && layoutManager.A13()) {
                            return;
                        }
                        if ((abs2 <= abs || !layoutManager.A14()) && (A062 = A06(motionEvent)) != null && (A0F2 = this.A0M.A0F(A062)) != null && (A002 = (r4.A00(A0F2, this.A0M) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8) != 0) {
                            float x2 = motionEvent.getX(i3);
                            float y2 = motionEvent.getY(i3);
                            float f3 = x2 - this.A02;
                            float f4 = y2 - this.A03;
                            float abs3 = Math.abs(f3);
                            float abs4 = Math.abs(f4);
                            float f5 = (float) this.A0C;
                            if (abs3 >= f5 || abs4 >= f5) {
                                if (abs3 > abs4) {
                                    if (f3 >= 0.0f || (A002 & 4) != 0) {
                                        if (f3 > 0.0f) {
                                            i4 = A002 & 8;
                                        }
                                        this.A01 = 0.0f;
                                        this.A00 = 0.0f;
                                        this.A09 = motionEvent.getPointerId(0);
                                        A0B(A0F2, 1);
                                    }
                                    return;
                                } else if (f4 >= 0.0f || (A002 & 1) != 0) {
                                    if (f4 > 0.0f) {
                                        i4 = A002 & 2;
                                    }
                                    this.A01 = 0.0f;
                                    this.A00 = 0.0f;
                                    this.A09 = motionEvent.getPointerId(0);
                                    A0B(A0F2, 1);
                                } else {
                                    return;
                                }
                                if (i4 == 0) {
                                    return;
                                }
                                this.A01 = 0.0f;
                                this.A00 = 0.0f;
                                this.A09 = motionEvent.getPointerId(0);
                                A0B(A0F2, 1);
                            }
                        }
                    }
                }
            }
        }
    }

    public void A08(MotionEvent motionEvent, int i2, int i3) {
        float x2 = motionEvent.getX(i3);
        float y2 = motionEvent.getY(i3);
        float f2 = x2 - this.A02;
        this.A00 = f2;
        float f3 = y2 - this.A03;
        this.A01 = f3;
        if ((i2 & 4) == 0) {
            f2 = Math.max(0.0f, f2);
            this.A00 = f2;
        }
        if ((i2 & 8) == 0) {
            this.A00 = Math.min(0.0f, f2);
        }
        if ((i2 & 1) == 0) {
            f3 = Math.max(0.0f, f3);
            this.A01 = f3;
        }
        if ((i2 & 2) == 0) {
            this.A01 = Math.min(0.0f, f3);
        }
    }

    public void A09(View view) {
        if (view == this.A0G) {
            this.A0G = null;
            if (this.A0K != null) {
                this.A0M.setChildDrawingOrderCallback((C11950jb) null);
            }
        }
    }

    public void A0A(C005602k r21) {
        int i2;
        int i3;
        int i4;
        int left;
        int bottom;
        if (!this.A0M.isLayoutRequested() && this.A08 == 2) {
            int i5 = (int) (this.A05 + this.A00);
            int i6 = (int) (this.A06 + this.A01);
            C005602k r19 = r21;
            View view = r19.A0H;
            if (((float) AnonymousClass000.A09(i6, view.getTop())) >= ((float) view.getHeight()) * 0.5f || ((float) AnonymousClass000.A09(i5, view.getLeft())) >= ((float) view.getWidth()) * 0.5f) {
                List list = this.A0P;
                if (list == null) {
                    this.A0P = AnonymousClass000.A0u();
                    this.A0N = AnonymousClass000.A0u();
                } else {
                    list.clear();
                    this.A0N.clear();
                }
                int round = Math.round(this.A05 + this.A00);
                int round2 = Math.round(this.A06 + this.A01);
                int width = view.getWidth() + round;
                int height = view.getHeight() + round2;
                int i7 = (round + width) >> 1;
                int i8 = (round2 + height) >> 1;
                AnonymousClass02W layoutManager = this.A0M.getLayoutManager();
                int A052 = layoutManager.A05();
                for (int i9 = 0; i9 < A052; i9++) {
                    View A0C2 = layoutManager.A0C(i9);
                    if (A0C2 != view && A0C2.getBottom() >= round2 && A0C2.getTop() <= height && A0C2.getRight() >= round && A0C2.getLeft() <= width) {
                        C005602k A0F2 = this.A0M.A0F(A0C2);
                        if (this.A0I.A06(this.A0L, A0F2, this.A0M)) {
                            int A092 = AnonymousClass000.A09(i7, (A0C2.getLeft() + A0C2.getRight()) >> 1);
                            int A093 = AnonymousClass000.A09(i8, (A0C2.getTop() + A0C2.getBottom()) >> 1);
                            int i10 = (A092 * A092) + (A093 * A093);
                            int size = this.A0P.size();
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < size && i10 > AnonymousClass000.A0D(this.A0N.get(i11))) {
                                i12++;
                                i11++;
                            }
                            this.A0P.add(i12, A0F2);
                            this.A0N.add(i12, Integer.valueOf(i10));
                        }
                    }
                }
                List list2 = this.A0P;
                if (list2.size() != 0) {
                    int width2 = i5 + view.getWidth();
                    int height2 = i6 + view.getHeight();
                    int left2 = i5 - view.getLeft();
                    int top2 = i6 - view.getTop();
                    int size2 = list2.size();
                    C005602k r6 = null;
                    int i13 = -1;
                    for (int i14 = 0; i14 < size2; i14++) {
                        C005602k r2 = (C005602k) list2.get(i14);
                        if (left2 <= 0 ? !(left2 >= 0 || (left = r2.A0H.getLeft() - i5) <= 0 || r2.A0H.getLeft() >= view.getLeft()) : !((left = r2.A0H.getRight() - width2) >= 0 || r2.A0H.getRight() <= view.getRight())) {
                            int abs = Math.abs(left);
                            if (abs > i13) {
                                r6 = r2;
                                i13 = abs;
                            }
                        }
                        if (top2 >= 0 ? !(top2 <= 0 || (bottom = r2.A0H.getBottom() - height2) >= 0 || r2.A0H.getBottom() <= view.getBottom()) : !((bottom = r2.A0H.getTop() - i6) <= 0 || r2.A0H.getTop() >= view.getTop())) {
                            int abs2 = Math.abs(bottom);
                            if (abs2 > i13) {
                                r6 = r2;
                                i13 = abs2;
                            }
                        }
                    }
                    if (r6 == null) {
                        this.A0P.clear();
                        this.A0N.clear();
                        return;
                    }
                    int A002 = r6.A00();
                    r19.A00();
                    if (this.A0I.A07(r19, r6, this.A0M)) {
                        RecyclerView recyclerView = this.A0M;
                        AnonymousClass02W layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof AnonymousClass02Y) {
                            View view2 = r6.A0H;
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((AnonymousClass02Y) layoutManager2);
                            linearLayoutManager.A12("Cannot drop a view during a scroll or layout calculation");
                            linearLayoutManager.A1N();
                            linearLayoutManager.A1O();
                            int A022 = AnonymousClass02W.A02(view);
                            int A023 = AnonymousClass02W.A02(view2);
                            char c2 = 65535;
                            if (A022 < A023) {
                                c2 = 1;
                            }
                            boolean z2 = linearLayoutManager.A09;
                            AnonymousClass0VA r0 = linearLayoutManager.A06;
                            if (z2) {
                                if (c2 == 1) {
                                    linearLayoutManager.A1Q(A023, r0.A02() - (linearLayoutManager.A06.A0B(view2) + linearLayoutManager.A06.A09(view)));
                                    return;
                                } else {
                                    i3 = r0.A02();
                                    i4 = linearLayoutManager.A06.A08(view2);
                                }
                            } else if (c2 == 65535) {
                                i2 = r0.A0B(view2);
                                linearLayoutManager.A1Q(A023, i2);
                                return;
                            } else {
                                i3 = r0.A08(view2);
                                i4 = linearLayoutManager.A06.A09(view);
                            }
                            i2 = i3 - i4;
                            linearLayoutManager.A1Q(A023, i2);
                            return;
                        }
                        if (layoutManager2.A13()) {
                            View view3 = r6.A0H;
                            if (view3.getLeft() - AnonymousClass0Bp.A00(view3).left <= recyclerView.getPaddingLeft()) {
                                recyclerView.A0Z(A002);
                            }
                            if (view3.getRight() + AnonymousClass0Bp.A00(view3).right >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.A0Z(A002);
                            }
                        }
                        if (layoutManager2.A14()) {
                            View view4 = r6.A0H;
                            if (view4.getTop() - AnonymousClass0Bp.A00(view4).top <= recyclerView.getPaddingTop()) {
                                recyclerView.A0Z(A002);
                            }
                            if (view4.getBottom() + AnonymousClass0Bp.A00(view4).bottom >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.A0Z(A002);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r6 > 0) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019a, code lost:
        if (r6 > 0) goto L_0x019c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C005602k r27, int r28) {
        /*
            r26 = this;
            r3 = r26
            X.02k r0 = r3.A0L
            r5 = r27
            r4 = r28
            if (r5 != r0) goto L_0x000f
            int r0 = r3.A08
            if (r4 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r3.A0D = r0
            int r9 = r3.A08
            r10 = 1
            r3.A0C(r5, r10)
            r3.A08 = r4
            r2 = 2
            if (r4 != r2) goto L_0x003a
            if (r27 == 0) goto L_0x01cd
            android.view.View r0 = r5.A0H
            r3.A0G = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 >= r0) goto L_0x003a
            X.0jb r1 = r3.A0K
            if (r1 != 0) goto L_0x0035
            X.0cD r1 = new X.0cD
            r1.<init>(r3)
            r3.A0K = r1
        L_0x0035:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0M
            r0.setChildDrawingOrderCallback(r1)
        L_0x003a:
            int r0 = r28 << 3
            r11 = 8
            int r0 = r0 + 8
            int r0 = r10 << r0
            int r15 = r0 + -1
            X.02k r8 = r3.A0L
            r7 = 0
            if (r8 == 0) goto L_0x0102
            android.view.View r0 = r8.A0H
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01c1
            if (r9 == r2) goto L_0x01be
            int r0 = r3.A08
            if (r0 == r2) goto L_0x01be
            X.0V7 r1 = r3.A0I
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0M
            int r14 = r1.A01(r8, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0M
            int r13 = X.C004601z.A06(r0)
            r12 = r14
            r6 = 3158064(0x303030, float:4.42539E-39)
            r1 = r14 & r6
            if (r1 == 0) goto L_0x007e
            r0 = r1 ^ -1
            r12 = r14 & r0
            if (r13 == 0) goto L_0x007b
            int r1 = r1 >> 1
            r0 = -3158065(0xffffffffffcfcfcf, float:NaN)
            r0 = r0 & r1
            r12 = r12 | r0
            r1 = r1 & r6
        L_0x007b:
            int r0 = r1 >> 2
            r12 = r12 | r0
        L_0x007e:
            r0 = 65280(0xff00, float:9.1477E-41)
            r12 = r12 & r0
            int r12 = r12 >> 8
            if (r12 == 0) goto L_0x01be
            r14 = r14 & r0
            int r13 = r14 >> 8
            float r0 = r3.A00
            float r1 = java.lang.Math.abs(r0)
            float r0 = r3.A01
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0190
            int r6 = r3.A04(r12)
            if (r6 > 0) goto L_0x019c
            int r6 = r3.A05(r12)
            if (r6 <= 0) goto L_0x01be
        L_0x00a5:
            android.view.VelocityTracker r0 = r3.A0F
            if (r0 == 0) goto L_0x00af
            r0.recycle()
            r0 = 0
            r3.A0F = r0
        L_0x00af:
            r0 = 4
            if (r6 == r10) goto L_0x017d
            if (r6 == r2) goto L_0x017d
            if (r6 == r0) goto L_0x016c
            if (r6 == r11) goto L_0x016c
            r0 = 16
            if (r6 == r0) goto L_0x016c
            r0 = 32
            if (r6 == r0) goto L_0x016c
            r22 = 0
        L_0x00c2:
            r23 = 0
        L_0x00c4:
            if (r9 != r2) goto L_0x0166
            r0 = 8
        L_0x00c8:
            float[] r1 = r3.A0T
            r3.A0E(r1)
            r20 = r1[r7]
            r21 = r1[r10]
            X.0Fa r10 = new X.0Fa
            r18 = r8
            r24 = r9
            r25 = r6
            r19 = r8
            r17 = r3
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            androidx.recyclerview.widget.RecyclerView r1 = r3.A0M
            X.02j r1 = r1.A0R
            if (r1 != 0) goto L_0x015a
            if (r0 != r11) goto L_0x0157
            r0 = 200(0xc8, double:9.9E-322)
        L_0x00ec:
            android.animation.ValueAnimator r6 = r10.A0B
            r6.setDuration(r0)
            java.util.List r0 = r3.A0O
            r0.add(r10)
            X.02k r0 = r10.A0C
            r0.A04(r7)
            r6.start()
            r7 = 1
        L_0x00ff:
            r0 = 0
            r3.A0L = r0
        L_0x0102:
            if (r27 == 0) goto L_0x012c
            X.0V7 r1 = r3.A0I
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0M
            int r1 = r1.A00(r5, r0)
            r1 = r1 & r15
            int r0 = r3.A08
            int r0 = r0 << 3
            int r1 = r1 >> r0
            r3.A0B = r1
            android.view.View r1 = r5.A0H
            int r0 = r1.getLeft()
            float r0 = (float) r0
            r3.A05 = r0
            int r0 = r1.getTop()
            float r0 = (float) r0
            r3.A06 = r0
            r3.A0L = r5
            if (r4 != r2) goto L_0x012c
            r0 = 0
            r1.performHapticFeedback(r0)
        L_0x012c:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0M
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x013d
            X.02k r0 = r3.A0L
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x013d:
            if (r7 != 0) goto L_0x0148
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0M
            X.02W r1 = r0.getLayoutManager()
            r0 = 1
            r1.A0D = r0
        L_0x0148:
            X.0V7 r2 = r3.A0I
            X.02k r1 = r3.A0L
            int r0 = r3.A08
            r2.A03(r1, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0M
            r0.invalidate()
            return
        L_0x0157:
            r0 = 250(0xfa, double:1.235E-321)
            goto L_0x00ec
        L_0x015a:
            if (r0 != r11) goto L_0x0161
            long r0 = r1.A06()
            goto L_0x00ec
        L_0x0161:
            long r0 = r1.A07()
            goto L_0x00ec
        L_0x0166:
            r0 = 4
            if (r6 <= 0) goto L_0x00c8
            r0 = 2
            goto L_0x00c8
        L_0x016c:
            float r0 = r3.A00
            float r22 = java.lang.Math.signum(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0M
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r22 = r22 * r0
            goto L_0x00c2
        L_0x017d:
            float r0 = r3.A01
            float r23 = java.lang.Math.signum(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0M
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r23 = r23 * r0
            r22 = 0
            goto L_0x00c4
        L_0x0190:
            int r6 = r3.A05(r12)
            if (r6 > 0) goto L_0x00a5
            int r6 = r3.A04(r12)
            if (r6 <= 0) goto L_0x01be
        L_0x019c:
            r13 = r13 & r6
            if (r13 != 0) goto L_0x00a5
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0M
            int r13 = X.C004601z.A06(r0)
            r12 = 789516(0xc0c0c, float:1.106348E-39)
            r1 = r6 & r12
            if (r1 == 0) goto L_0x00a5
            r0 = r1 ^ -1
            r6 = r6 & r0
            if (r13 == 0) goto L_0x01b9
            int r1 = r1 << 1
            r0 = -789517(0xfffffffffff3f3f3, float:NaN)
            r0 = r0 & r1
            r6 = r6 | r0
            r1 = r1 & r12
        L_0x01b9:
            int r0 = r1 << 2
            r6 = r6 | r0
            goto L_0x00a5
        L_0x01be:
            r6 = 0
            goto L_0x00a5
        L_0x01c1:
            android.view.View r1 = r8.A0H
            r3.A09(r1)
            X.0lM r0 = X.C07580c8.A00
            r0.A6F(r1)
            goto L_0x00ff
        L_0x01cd:
            java.lang.String r0 = "Must pass a ViewHolder when dragging"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02800Fh.A0B(X.02k, int):void");
    }

    public void A0C(C005602k r5, boolean z2) {
        AnonymousClass0XS r1;
        List list = this.A0O;
        int size = list.size();
        do {
            size--;
            if (size >= 0) {
                r1 = (AnonymousClass0XS) list.get(size);
            } else {
                return;
            }
        } while (r1.A0C != r5);
        r1.A05 |= z2;
        if (!r1.A03) {
            r1.A0B.cancel();
        }
        list.remove(size);
    }

    public void A0D(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A0M;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0n(this);
                RecyclerView recyclerView3 = this.A0M;
                C13210le r1 = this.A0Q;
                recyclerView3.A14.remove(r1);
                if (recyclerView3.A0U == r1) {
                    recyclerView3.A0U = null;
                }
                List list = this.A0M.A0a;
                if (list != null) {
                    list.remove(this);
                }
                List list2 = this.A0O;
                int size = list2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    C07580c8.A00.A6F(((AnonymousClass0XS) list2.get(0)).A0C.A0H);
                }
                list2.clear();
                this.A0G = null;
                this.A0A = -1;
                VelocityTracker velocityTracker = this.A0F;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.A0F = null;
                }
                AnonymousClass0Be r2 = this.A0J;
                if (r2 != null) {
                    r2.A00 = false;
                    this.A0J = null;
                }
                if (this.A0H != null) {
                    this.A0H = null;
                }
            }
            this.A0M = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.A07 = resources.getDimension(R.dimen.dimen04a0);
                this.A04 = resources.getDimension(R.dimen.dimen049f);
                this.A0C = ViewConfiguration.get(this.A0M.getContext()).getScaledTouchSlop();
                this.A0M.A0m(this);
                RecyclerView recyclerView4 = this.A0M;
                recyclerView4.A14.add(this.A0Q);
                List list3 = recyclerView4.A0a;
                if (list3 == null) {
                    list3 = AnonymousClass000.A0u();
                    recyclerView4.A0a = list3;
                }
                list3.add(this);
                this.A0J = new AnonymousClass0Be(this);
                this.A0H = new AnonymousClass09P(this.A0M.getContext(), this.A0J);
            }
        }
    }

    public final void A0E(float[] fArr) {
        fArr[0] = (this.A0B & 12) != 0 ? (this.A05 + this.A00) - ((float) this.A0L.A0H.getLeft()) : this.A0L.A0H.getTranslationX();
        fArr[1] = (this.A0B & 3) != 0 ? (this.A06 + this.A01) - ((float) this.A0L.A0H.getTop()) : this.A0L.A0H.getTranslationY();
    }

    public void AOQ(View view) {
    }

    public void AOR(View view) {
        A09(view);
        C005602k A0F2 = this.A0M.A0F(view);
        if (A0F2 != null) {
            C005602k r0 = this.A0L;
            if (r0 == null || A0F2 != r0) {
                A0C(A0F2, false);
                List list = this.A0S;
                View view2 = A0F2.A0H;
                if (list.remove(view2)) {
                    C07580c8.A00.A6F(view2);
                    return;
                }
                return;
            }
            A0B((C005602k) null, 0);
        }
    }
}
