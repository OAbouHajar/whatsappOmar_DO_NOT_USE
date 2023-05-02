package X;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.facebook.redex.IDxObjectShape31S0000000_I1;
import java.util.Arrays;

/* renamed from: X.0VE  reason: invalid class name */
public class AnonymousClass0VE {
    public static final Interpolator A0L = new IDxObjectShape31S0000000_I1(0);
    public float A00;
    public float A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public VelocityTracker A07;
    public View A08;
    public OverScroller A09;
    public boolean A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public int[] A0F;
    public int[] A0G;
    public int[] A0H;
    public final ViewGroup A0I;
    public final AnonymousClass055 A0J;
    public final Runnable A0K = new C09430fU(this);

    public AnonymousClass0VE(Context context, ViewGroup viewGroup, AnonymousClass055 r6) {
        if (r6 != null) {
            this.A0I = viewGroup;
            this.A0J = r6;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.A04 = (int) ((AnonymousClass000.A0M(context).density * 20.0f) + 0.5f);
            this.A06 = viewConfiguration.getScaledTouchSlop();
            this.A00 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.A01 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.A09 = new OverScroller(context, A0L);
            return;
        }
        throw AnonymousClass000.A0T("Callback may not be null");
    }

    public final int A00(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.A0I.getWidth();
        float abs = (float) Math.abs(i2);
        float f2 = (float) (width >> 1);
        return Math.min(AnonymousClass000.A05(f2 + (((float) Math.sin((double) ((Math.min(1.0f, abs / ((float) width)) - 0.5f) * 0.47123894f))) * f2), abs, i3, i4), 600);
    }

    public View A01(int i2, int i3) {
        ViewGroup viewGroup = this.A0I;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(this.A0J.A00(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public void A02() {
        this.A02 = -1;
        float[] fArr = this.A0B;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0C, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0E, 0.0f);
            Arrays.fill(this.A0H, 0);
            Arrays.fill(this.A0F, 0);
            Arrays.fill(this.A0G, 0);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A07;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
    }

    public final void A03() {
        VelocityTracker velocityTracker = this.A07;
        float f2 = this.A00;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.A07.getXVelocity(this.A02);
        float f3 = this.A01;
        float f4 = f2;
        float abs = Math.abs(xVelocity);
        if (abs < f3) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            if (xVelocity <= 0.0f) {
                f4 = -f2;
            }
            xVelocity = f4;
        }
        float yVelocity = this.A07.getYVelocity(this.A02);
        float f5 = this.A01;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f5) {
            yVelocity = 0.0f;
        } else if (abs2 > f2) {
            if (yVelocity <= 0.0f) {
                f2 = -f2;
            }
            yVelocity = f2;
        }
        this.A0A = true;
        this.A0J.A06(this.A08, xVelocity, yVelocity);
        this.A0A = false;
        if (this.A03 == 1) {
            A04(0);
        }
    }

    public void A04(int i2) {
        this.A0I.removeCallbacks(this.A0K);
        if (this.A03 != i2) {
            this.A03 = i2;
            this.A0J.A01(i2);
            if (this.A03 == 0) {
                this.A08 = null;
            }
        }
    }

    public final void A05(int i2) {
        float[] fArr = this.A0B;
        if (fArr != null) {
            int i3 = this.A05;
            int i4 = 1 << i2;
            if ((i4 & i3) != 0) {
                fArr[i2] = 0.0f;
                this.A0C[i2] = 0.0f;
                this.A0D[i2] = 0.0f;
                this.A0E[i2] = 0.0f;
                this.A0H[i2] = 0;
                this.A0F[i2] = 0;
                this.A0G[i2] = 0;
                this.A05 = (i4 ^ -1) & i3;
            }
        }
    }

    public final void A06(int i2, float f2, float f3) {
        float[] fArr = this.A0B;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A0C;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0D;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0E;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.A0H;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.A0F;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.A0G;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.A0B = fArr2;
            fArr = fArr2;
            this.A0C = fArr3;
            this.A0D = fArr4;
            this.A0E = fArr5;
            this.A0H = iArr;
            this.A0F = iArr2;
            this.A0G = iArr3;
        }
        this.A0D[i2] = f2;
        fArr[i2] = f2;
        float[] fArr9 = this.A0C;
        this.A0E[i2] = f3;
        fArr9[i2] = f3;
        int[] iArr7 = this.A0H;
        int i4 = (int) f2;
        int i5 = (int) f3;
        ViewGroup viewGroup = this.A0I;
        int left = viewGroup.getLeft();
        int i6 = this.A04;
        int i7 = 0;
        if (i4 < left + i6) {
            i7 = 1;
        }
        if (i5 < viewGroup.getTop() + i6) {
            i7 |= 4;
        }
        if (i4 > viewGroup.getRight() - i6) {
            i7 |= 2;
        }
        if (i5 > viewGroup.getBottom() - i6) {
            i7 |= 8;
        }
        iArr7[i2] = i7;
        this.A05 |= 1 << i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        if (r10.A02 == -1) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        A03();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r2 = r11.getActionMasked()
            int r1 = r11.getActionIndex()
            if (r2 != 0) goto L_0x000d
            r10.A02()
        L_0x000d:
            android.view.VelocityTracker r0 = r10.A07
            if (r0 != 0) goto L_0x0017
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r10.A07 = r0
        L_0x0017:
            r0.addMovement(r11)
            r5 = 0
            if (r2 == 0) goto L_0x0181
            r4 = 1
            if (r2 == r4) goto L_0x015e
            r0 = 2
            if (r2 == r0) goto L_0x00a9
            r0 = 3
            if (r2 == r0) goto L_0x0166
            r0 = 5
            if (r2 == r0) goto L_0x006d
            r0 = 6
            if (r2 != r0) goto L_0x0069
            int r6 = r11.getPointerId(r1)
            int r0 = r10.A03
            if (r0 != r4) goto L_0x0066
            int r0 = r10.A02
            if (r6 != r0) goto L_0x0066
            int r4 = r11.getPointerCount()
        L_0x003c:
            r3 = -1
            if (r5 >= r4) goto L_0x0063
            int r2 = r11.getPointerId(r5)
            int r0 = r10.A02
            if (r2 == r0) goto L_0x006a
            float r1 = r11.getX(r5)
            float r0 = r11.getY(r5)
            int r1 = (int) r1
            int r0 = (int) r0
            android.view.View r1 = r10.A01(r1, r0)
            android.view.View r0 = r10.A08
            if (r1 != r0) goto L_0x006a
            boolean r0 = r10.A0G(r0, r2)
            if (r0 == 0) goto L_0x006a
            int r0 = r10.A02
            if (r0 != r3) goto L_0x0066
        L_0x0063:
            r10.A03()
        L_0x0066:
            r10.A05(r6)
        L_0x0069:
            return
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x003c
        L_0x006d:
            int r4 = r11.getPointerId(r1)
            float r2 = r11.getX(r1)
            float r1 = r11.getY(r1)
            r10.A06(r4, r2, r1)
            int r0 = r10.A03
            int r3 = (int) r2
            int r2 = (int) r1
            if (r0 != 0) goto L_0x008a
            android.view.View r0 = r10.A01(r3, r2)
        L_0x0086:
            r10.A0G(r0, r4)
            return
        L_0x008a:
            android.view.View r1 = r10.A08
            if (r1 == 0) goto L_0x0069
            int r0 = r1.getLeft()
            if (r3 < r0) goto L_0x0069
            int r0 = r1.getRight()
            if (r3 >= r0) goto L_0x0069
            int r0 = r1.getTop()
            if (r2 < r0) goto L_0x0069
            int r0 = r1.getBottom()
            if (r2 >= r0) goto L_0x0069
            android.view.View r0 = r10.A08
            goto L_0x0086
        L_0x00a9:
            int r0 = r10.A03
            if (r0 != r4) goto L_0x0120
            int r0 = r10.A02
            boolean r0 = r10.A0B(r0)
            if (r0 == 0) goto L_0x0069
            int r0 = r10.A02
            int r0 = r11.findPointerIndex(r0)
            float r3 = r11.getX(r0)
            float r2 = r11.getY(r0)
            float[] r0 = r10.A0D
            int r1 = r10.A02
            r0 = r0[r1]
            float r3 = r3 - r0
            int r4 = (int) r3
            float[] r0 = r10.A0E
            r0 = r0[r1]
            float r2 = r2 - r0
            int r3 = (int) r2
            android.view.View r0 = r10.A08
            int r6 = r0.getLeft()
            int r6 = r6 + r4
            android.view.View r0 = r10.A08
            int r7 = r0.getTop()
            int r7 = r7 + r3
            android.view.View r0 = r10.A08
            int r5 = r0.getLeft()
            android.view.View r0 = r10.A08
            int r2 = r0.getTop()
            if (r4 == 0) goto L_0x00fc
            X.055 r1 = r10.A0J
            android.view.View r0 = r10.A08
            int r6 = r1.A04(r0, r6, r4)
            android.view.View r1 = r10.A08
            int r0 = r6 - r5
            X.C004601z.A0a(r1, r0)
        L_0x00fc:
            if (r3 == 0) goto L_0x010d
            X.055 r1 = r10.A0J
            android.view.View r0 = r10.A08
            int r7 = r1.A05(r0, r7, r3)
            android.view.View r1 = r10.A08
            int r0 = r7 - r2
            X.C004601z.A0b(r1, r0)
        L_0x010d:
            if (r4 != 0) goto L_0x0111
            if (r3 == 0) goto L_0x011c
        L_0x0111:
            int r8 = r6 - r5
            int r9 = r7 - r2
            X.055 r4 = r10.A0J
            android.view.View r5 = r10.A08
            r4.A08(r5, r6, r7, r8, r9)
        L_0x011c:
            r10.A08(r11)
            return
        L_0x0120:
            int r6 = r11.getPointerCount()
        L_0x0124:
            if (r5 >= r6) goto L_0x011c
            int r7 = r11.getPointerId(r5)
            boolean r0 = r10.A0B(r7)
            if (r0 == 0) goto L_0x015b
            float r1 = r11.getX(r5)
            float r8 = r11.getY(r5)
            float[] r0 = r10.A0B
            r0 = r0[r7]
            float r3 = r1 - r0
            float[] r0 = r10.A0C
            r0 = r0[r7]
            float r2 = r8 - r0
            int r0 = r10.A03
            if (r0 == r4) goto L_0x011c
            int r1 = (int) r1
            int r0 = (int) r8
            android.view.View r1 = r10.A01(r1, r0)
            boolean r0 = r10.A0F(r1, r3, r2)
            if (r0 == 0) goto L_0x015b
            boolean r0 = r10.A0G(r1, r7)
            if (r0 == 0) goto L_0x015b
            goto L_0x011c
        L_0x015b:
            int r5 = r5 + 1
            goto L_0x0124
        L_0x015e:
            int r0 = r10.A03
            if (r0 != r4) goto L_0x017d
            r10.A03()
            goto L_0x017d
        L_0x0166:
            int r0 = r10.A03
            if (r0 != r4) goto L_0x017d
            r2 = 0
            r10.A0A = r4
            X.055 r1 = r10.A0J
            android.view.View r0 = r10.A08
            r1.A06(r0, r2, r2)
            r10.A0A = r5
            int r0 = r10.A03
            if (r0 != r4) goto L_0x017d
            r10.A04(r5)
        L_0x017d:
            r10.A02()
            return
        L_0x0181:
            float r4 = r11.getX()
            float r3 = r11.getY()
            int r2 = r11.getPointerId(r5)
            int r1 = (int) r4
            int r0 = (int) r3
            android.view.View r0 = r10.A01(r1, r0)
            r10.A06(r2, r4, r3)
            r10.A0G(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VE.A07(android.view.MotionEvent):void");
    }

    public final void A08(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (A0B(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.A0D[pointerId] = x2;
                this.A0E[pointerId] = y2;
            }
        }
    }

    public void A09(View view, int i2) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0I;
        if (parent == viewGroup) {
            this.A08 = view;
            this.A02 = i2;
            this.A0J.A07(view, i2);
            A04(1);
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        A0r.append(viewGroup);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(")", A0r));
    }

    public boolean A0A() {
        if (this.A03 == 2) {
            OverScroller overScroller = this.A09;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.A08.getLeft();
            int top2 = currY - this.A08.getTop();
            if (left != 0) {
                C004601z.A0a(this.A08, left);
            }
            if (top2 != 0) {
                C004601z.A0b(this.A08, top2);
            }
            if (!(left == 0 && top2 == 0)) {
                this.A0J.A08(this.A08, currX, currY, left, top2);
            }
            if (computeScrollOffset) {
                if (currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                    overScroller.abortAnimation();
                }
            }
            this.A0I.post(this.A0K);
        }
        return this.A03 == 2;
    }

    public final boolean A0B(int i2) {
        if (((1 << i2) & this.A05) != 0) {
            return true;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Ignoring pointerId=");
        A0r.append(i2);
        A0r.append(" because ACTION_DOWN was not received ");
        A0r.append("for this pointer before ACTION_MOVE. It likely happened because ");
        Log.e("ViewDragHelper", AnonymousClass000.A0h(" ViewDragHelper did not receive all the events in the event stream.", A0r));
        return false;
    }

    public boolean A0C(int i2, int i3) {
        if (this.A0A) {
            return A0D(i2, i3, (int) this.A07.getXVelocity(this.A02), (int) this.A07.getYVelocity(this.A02));
        }
        throw AnonymousClass000.A0V("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean A0D(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        int i6 = i4;
        int i7 = i5;
        int left = this.A08.getLeft();
        int top2 = this.A08.getTop();
        int i8 = i2 - left;
        int i9 = i3 - top2;
        if (i8 == 0 && i9 == 0) {
            this.A09.abortAnimation();
            A04(0);
            return false;
        }
        View view = this.A08;
        int i10 = (int) this.A01;
        int i11 = (int) this.A00;
        int i12 = i11;
        int abs = Math.abs(i6);
        if (abs < i10) {
            i6 = 0;
        } else if (abs > i11) {
            if (i4 <= 0) {
                i12 = -i11;
            }
            i6 = i12;
        }
        int abs2 = Math.abs(i7);
        if (abs2 < i10) {
            i7 = 0;
        } else if (abs2 > i11) {
            if (i5 <= 0) {
                i11 = -i11;
            }
            i7 = i11;
        }
        int abs3 = Math.abs(i8);
        int abs4 = Math.abs(i9);
        int abs5 = Math.abs(i6);
        int abs6 = Math.abs(i7);
        int i13 = abs5 + abs6;
        int i14 = abs3 + abs4;
        if (i6 != 0) {
            f2 = (float) abs5;
            f3 = (float) i13;
        } else {
            f2 = (float) abs3;
            f3 = (float) i14;
        }
        float f4 = f2 / f3;
        float f5 = (float) abs6;
        float f6 = (float) i13;
        if (i7 == 0) {
            f5 = (float) abs4;
            f6 = (float) i14;
        }
        AnonymousClass055 r2 = this.A0J;
        int A002 = A00(i8, i6, r2.A02(view));
        OverScroller overScroller = this.A09;
        overScroller.startScroll(left, top2, i8, i9, (int) ((((float) A002) * f4) + (((float) A00(i9, i7, r2.A03(view))) * (f5 / f6))));
        A04(2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bc, code lost:
        if (r5 != r11) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(android.view.MotionEvent r14) {
        /*
            r13 = this;
            int r1 = r14.getActionMasked()
            int r2 = r14.getActionIndex()
            if (r1 != 0) goto L_0x000d
            r13.A02()
        L_0x000d:
            android.view.VelocityTracker r0 = r13.A07
            if (r0 != 0) goto L_0x0017
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.A07 = r0
        L_0x0017:
            r0.addMovement(r14)
            r5 = 2
            r3 = 1
            if (r1 == 0) goto L_0x00df
            if (r1 == r3) goto L_0x00da
            if (r1 == r5) goto L_0x005c
            r0 = 3
            if (r1 == r0) goto L_0x00da
            r0 = 5
            if (r1 == r0) goto L_0x0039
            r0 = 6
            if (r1 != r0) goto L_0x0032
            int r0 = r14.getPointerId(r2)
            r13.A05(r0)
        L_0x0032:
            r4 = 0
        L_0x0033:
            int r0 = r13.A03
            if (r0 != r3) goto L_0x0038
            r4 = 1
        L_0x0038:
            return r4
        L_0x0039:
            int r4 = r14.getPointerId(r2)
            float r1 = r14.getX(r2)
            float r2 = r14.getY(r2)
            r13.A06(r4, r1, r2)
            int r0 = r13.A03
            if (r0 == 0) goto L_0x0032
            if (r0 != r5) goto L_0x0032
            int r1 = (int) r1
            int r0 = (int) r2
            android.view.View r1 = r13.A01(r1, r0)
            android.view.View r0 = r13.A08
            if (r1 != r0) goto L_0x0032
            r13.A0G(r1, r4)
            goto L_0x0032
        L_0x005c:
            float[] r0 = r13.A0B
            if (r0 == 0) goto L_0x0032
            float[] r0 = r13.A0C
            if (r0 == 0) goto L_0x0032
            int r9 = r14.getPointerCount()
            r8 = 0
        L_0x0069:
            if (r8 >= r9) goto L_0x00c4
            int r10 = r14.getPointerId(r8)
            boolean r0 = r13.A0B(r10)
            if (r0 == 0) goto L_0x00d7
            float r1 = r14.getX(r8)
            float r5 = r14.getY(r8)
            float[] r0 = r13.A0B
            r0 = r0[r10]
            float r4 = r1 - r0
            float[] r0 = r13.A0C
            r0 = r0[r10]
            float r2 = r5 - r0
            int r1 = (int) r1
            int r0 = (int) r5
            android.view.View r7 = r13.A01(r1, r0)
            if (r7 == 0) goto L_0x00c9
            boolean r0 = r13.A0F(r7, r4, r2)
            if (r0 == 0) goto L_0x00c9
            r12 = 1
            int r11 = r7.getLeft()
            int r1 = (int) r4
            int r0 = r11 + r1
            X.055 r6 = r13.A0J
            int r5 = r6.A04(r7, r0, r1)
            int r4 = r7.getTop()
            int r1 = (int) r2
            int r0 = r4 + r1
            int r2 = r6.A05(r7, r0, r1)
            int r1 = r6.A02(r7)
            int r0 = r6.A03(r7)
            if (r1 == 0) goto L_0x00be
            if (r1 <= 0) goto L_0x00ca
            if (r5 != r11) goto L_0x00ca
        L_0x00be:
            if (r0 == 0) goto L_0x00c4
            if (r0 <= 0) goto L_0x00ca
            if (r2 != r4) goto L_0x00ca
        L_0x00c4:
            r13.A08(r14)
            goto L_0x0032
        L_0x00c9:
            r12 = 0
        L_0x00ca:
            int r0 = r13.A03
            if (r0 == r3) goto L_0x00c4
            if (r12 == 0) goto L_0x00d7
            boolean r0 = r13.A0G(r7, r10)
            if (r0 == 0) goto L_0x00d7
            goto L_0x00c4
        L_0x00d7:
            int r8 = r8 + 1
            goto L_0x0069
        L_0x00da:
            r13.A02()
            goto L_0x0032
        L_0x00df:
            float r1 = r14.getX()
            float r0 = r14.getY()
            r4 = 0
            int r2 = r14.getPointerId(r4)
            r13.A06(r2, r1, r0)
            int r1 = (int) r1
            int r0 = (int) r0
            android.view.View r1 = r13.A01(r1, r0)
            android.view.View r0 = r13.A08
            if (r1 != r0) goto L_0x0033
            int r0 = r13.A03
            if (r0 != r5) goto L_0x0033
            r13.A0G(r1, r2)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VE.A0E(android.view.MotionEvent):boolean");
    }

    public final boolean A0F(View view, float f2, float f3) {
        float f4;
        int i2;
        if (view == null) {
            return false;
        }
        AnonymousClass055 r2 = this.A0J;
        boolean A1Q = AnonymousClass000.A1Q(r2.A02(view));
        boolean A1Q2 = AnonymousClass000.A1Q(r2.A03(view));
        if (A1Q) {
            if (A1Q2) {
                int i3 = this.A06;
                i2 = (((f2 * f2) + (f3 * f3)) > ((float) (i3 * i3)) ? 1 : (((f2 * f2) + (f3 * f3)) == ((float) (i3 * i3)) ? 0 : -1));
            } else {
                f4 = Math.abs(f2);
                i2 = (f4 > ((float) this.A06) ? 1 : (f4 == ((float) this.A06) ? 0 : -1));
            }
        } else if (!A1Q2) {
            return false;
        } else {
            f4 = Math.abs(f3);
            i2 = (f4 > ((float) this.A06) ? 1 : (f4 == ((float) this.A06) ? 0 : -1));
        }
        return i2 > 0;
    }

    public boolean A0G(View view, int i2) {
        if (view == this.A08 && this.A02 == i2) {
            return true;
        }
        if (view == null || !this.A0J.A09(view, i2)) {
            return false;
        }
        this.A02 = i2;
        A09(view, i2);
        return true;
    }

    public boolean A0H(View view, int i2, int i3) {
        this.A08 = view;
        this.A02 = -1;
        boolean A0D2 = A0D(i2, i3, 0, 0);
        if (!A0D2 && this.A03 == 0 && this.A08 != null) {
            this.A08 = null;
        }
        return A0D2;
    }
}
