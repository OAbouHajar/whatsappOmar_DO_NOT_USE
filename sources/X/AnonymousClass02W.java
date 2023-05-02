package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCallbackShape397S0100000_I0;
import java.util.ArrayList;

/* renamed from: X.02W  reason: invalid class name */
public abstract class AnonymousClass02W {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass0SK A05;
    public C05490Rq A06;
    public RecyclerView A07;
    public AnonymousClass0QK A08;
    public AnonymousClass0QK A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C;
    public boolean A0D = false;
    public final C13300ln A0E;
    public final C13300ln A0F;

    public AnonymousClass02W() {
        IDxCallbackShape397S0100000_I0 iDxCallbackShape397S0100000_I0 = new IDxCallbackShape397S0100000_I0(this, 0);
        this.A0E = iDxCallbackShape397S0100000_I0;
        IDxCallbackShape397S0100000_I0 iDxCallbackShape397S0100000_I02 = new IDxCallbackShape397S0100000_I0(this, 1);
        this.A0F = iDxCallbackShape397S0100000_I02;
        this.A08 = new AnonymousClass0QK(iDxCallbackShape397S0100000_I0);
        this.A09 = new AnonymousClass0QK(iDxCallbackShape397S0100000_I02);
    }

    public static int A00(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r0 == 1073741824) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r5 == 1073741824) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            r3 = -2
            r2 = -1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x001f
            if (r7 >= 0) goto L_0x002f
            if (r7 != r2) goto L_0x0018
            if (r5 == r0) goto L_0x002d
            if (r5 == 0) goto L_0x0018
            if (r5 == r1) goto L_0x002d
        L_0x0018:
            r5 = 0
            r7 = 0
        L_0x001a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r0
        L_0x001f:
            if (r7 >= 0) goto L_0x002f
            if (r7 == r2) goto L_0x002d
            if (r7 != r3) goto L_0x0018
            if (r5 == r0) goto L_0x002b
            r0 = r5
            r5 = 0
            if (r0 != r1) goto L_0x002d
        L_0x002b:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x002d:
            r7 = r4
            goto L_0x001a
        L_0x002f:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02W.A01(int, int, int, int, boolean):int");
    }

    public static int A02(View view) {
        return ((AnonymousClass0Bp) view.getLayoutParams()).A01();
    }

    public static void A03(View view, int i2, int i3, int i4, int i5) {
        AnonymousClass0Bp r2 = (AnonymousClass0Bp) view.getLayoutParams();
        Rect rect = r2.A03;
        view.layout(i2 + rect.left + r2.leftMargin, i3 + rect.top + r2.topMargin, (i4 - rect.right) - r2.rightMargin, (i5 - rect.bottom) - r2.bottomMargin);
    }

    public static boolean A04(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 <= 0 || i2 == i4) {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    return mode == 1073741824 && size == i2;
                }
                return true;
            } else if (size >= i2) {
                return true;
            }
        }
    }

    public int A05() {
        AnonymousClass0SK r0 = this.A05;
        if (r0 != null) {
            return r0.A00();
        }
        return 0;
    }

    public int A06() {
        AnonymousClass01X r0;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r0 = recyclerView.A0N) == null) {
            return 0;
        }
        return r0.A0C();
    }

    public int A07() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int A08() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int A09() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int A0A() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public View A0B(int i2) {
        int A052 = A05();
        for (int i3 = 0; i3 < A052; i3++) {
            View A0C2 = A0C(i3);
            C005602k A012 = RecyclerView.A01(A0C2);
            if (A012 != null) {
                int i4 = A012.A06;
                if (i4 == -1) {
                    i4 = A012.A05;
                }
                if (i4 == i2 && !A012.A05() && (this.A07.A0y.A08 || (A012.A00 & 8) == 0)) {
                    return A0C2;
                }
            }
        }
        return null;
    }

    public View A0C(int i2) {
        AnonymousClass0SK r0 = this.A05;
        if (r0 != null) {
            return r0.A03(i2);
        }
        return null;
    }

    public void A0D() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void A0E(int i2, int i3) {
        this.A03 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.A04 = mode;
        if (mode == 0 && !RecyclerView.A1C) {
            this.A03 = 0;
        }
        this.A00 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.A01 = mode2;
        if (mode2 == 0 && !RecyclerView.A1C) {
            this.A00 = 0;
        }
    }

    public void A0F(int i2, int i3) {
        int A052 = A05();
        if (A052 == 0) {
            this.A07.A0c(i2, i3);
            return;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < A052; i8++) {
            View A0C2 = A0C(i8);
            Rect rect = this.A07.A0s;
            RecyclerView.A03(A0C2, rect);
            int i9 = rect.left;
            if (i9 < i6) {
                i6 = i9;
            }
            int i10 = rect.right;
            if (i10 > i4) {
                i4 = i10;
            }
            int i11 = rect.top;
            if (i11 < i7) {
                i7 = i11;
            }
            int i12 = rect.bottom;
            if (i12 > i5) {
                i5 = i12;
            }
        }
        this.A07.A0s.set(i6, i7, i4, i5);
        A0o(this.A07.A0s, i2, i3);
    }

    public void A0G(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((AnonymousClass0Bp) view.getLayoutParams()).A03;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.A07 == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.A07.A0u;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(android.view.View r10, int r11, boolean r12) {
        /*
            r9 = this;
            X.02k r4 = androidx.recyclerview.widget.RecyclerView.A01(r10)
            if (r12 != 0) goto L_0x00dc
            int r0 = r4.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x00dc
            androidx.recyclerview.widget.RecyclerView r0 = r9.A07
            X.0Rx r0 = r0.A11
            r0.A03(r4)
        L_0x0013:
            android.view.ViewGroup$LayoutParams r6 = r10.getLayoutParams()
            X.0Bp r6 = (X.AnonymousClass0Bp) r6
            int r2 = r4.A00
            r1 = r2 & 32
            r0 = 0
            if (r1 == 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            r5 = 0
            if (r0 != 0) goto L_0x00c6
            X.0SJ r0 = r4.A09
            if (r0 != 0) goto L_0x00c6
            android.view.ViewParent r2 = r10.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r9.A07
            X.0SK r1 = r9.A05
            if (r2 != r0) goto L_0x00a2
            X.0kS r0 = r1.A01
            X.0c7 r0 = (X.C07570c7) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            int r3 = r0.indexOfChild(r10)
            r2 = -1
            if (r3 == r2) goto L_0x00a0
            X.0SE r1 = r1.A00
            boolean r0 = r1.A06(r3)
            if (r0 != 0) goto L_0x00a0
            int r0 = r1.A00(r3)
            int r3 = r3 - r0
        L_0x004c:
            if (r11 != r2) goto L_0x0054
            X.0SK r0 = r9.A05
            int r11 = r0.A00()
        L_0x0054:
            if (r3 == r2) goto L_0x0102
            if (r3 == r11) goto L_0x0090
            androidx.recyclerview.widget.RecyclerView r0 = r9.A07
            X.02W r2 = r0.A0S
            android.view.View r7 = r2.A0C(r3)
            if (r7 == 0) goto L_0x00e5
            r2.A0C(r3)
            X.0SK r0 = r2.A05
            r0.A05(r3)
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            X.02k r8 = androidx.recyclerview.widget.RecyclerView.A01(r7)
            int r0 = r8.A00
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L_0x007a
            r1 = 1
        L_0x007a:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A07
            X.0Rx r0 = r0.A11
            if (r1 == 0) goto L_0x009c
            r0.A02(r8)
        L_0x0083:
            X.0SK r2 = r2.A05
            int r0 = r8.A00
            r1 = r0 & 8
            r0 = 0
            if (r1 == 0) goto L_0x008d
            r0 = 1
        L_0x008d:
            r2.A0A(r7, r3, r11, r0)
        L_0x0090:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x009b
            android.view.View r0 = r4.A0H
            r0.invalidate()
            r6.A02 = r5
        L_0x009b:
            return
        L_0x009c:
            r0.A03(r8)
            goto L_0x0083
        L_0x00a0:
            r3 = -1
            goto L_0x004c
        L_0x00a2:
            r1.A09(r10, r11, r5)
            r0 = 1
            r6.A01 = r0
            X.0Rq r3 = r9.A06
            if (r3 == 0) goto L_0x0090
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0090
            X.02k r2 = androidx.recyclerview.widget.RecyclerView.A01(r10)
            if (r2 == 0) goto L_0x00c4
            int r1 = r2.A06
            r0 = -1
            if (r1 != r0) goto L_0x00bd
            int r1 = r2.A05
        L_0x00bd:
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0090
            r3.A01 = r10
            goto L_0x0090
        L_0x00c4:
            r1 = -1
            goto L_0x00bd
        L_0x00c6:
            X.0SJ r0 = r4.A09
            if (r0 == 0) goto L_0x00d7
            r0.A09(r4)
        L_0x00cd:
            X.0SK r1 = r9.A05
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            r1.A0A(r10, r0, r11, r5)
            goto L_0x0090
        L_0x00d7:
            r0 = r2 & -33
            r4.A00 = r0
            goto L_0x00cd
        L_0x00dc:
            androidx.recyclerview.widget.RecyclerView r0 = r9.A07
            X.0Rx r0 = r0.A11
            r0.A02(r4)
            goto L_0x0013
        L_0x00e5:
            java.lang.String r0 = "Cannot move a child from non-existing index:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A07
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0102:
            java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r9.A07
            int r0 = r0.indexOfChild(r10)
            r1.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r9.A07
            java.lang.String r0 = r0.A0G()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02W.A0H(android.view.View, int, boolean):void");
    }

    public void A0I(View view, Rect rect) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.A0A(view));
        }
    }

    public void A0J(View view, AnonymousClass031 r4) {
        C005602k A012 = RecyclerView.A01(view);
        if (A012 != null && (A012.A00 & 8) == 0) {
            AnonymousClass0SK r0 = this.A05;
            if (!r0.A02.contains(A012.A0H)) {
                RecyclerView recyclerView = this.A07;
                A0q(view, r4, recyclerView.A0w, recyclerView.A0y);
            }
        }
    }

    public void A0K(View view, AnonymousClass0SJ r6) {
        AnonymousClass0SK r3 = this.A05;
        RecyclerView recyclerView = ((C07570c7) r3.A01).A00;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (r3.A00.A07(indexOfChild)) {
                r3.A08(view);
            }
            View childAt = recyclerView.getChildAt(indexOfChild);
            if (childAt != null) {
                recyclerView.A0i(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(indexOfChild);
        }
        r6.A05(view);
    }

    public void A0L(C12490kU r1, int i2) {
    }

    public void A0M(AnonymousClass0SJ r5) {
        int A052 = A05();
        while (true) {
            A052--;
            if (A052 >= 0) {
                View A0C2 = A0C(A052);
                C005602k A012 = RecyclerView.A01(A0C2);
                if (!A012.A05()) {
                    if ((A012.A00 & 4) == 0 || (A012.A00 & 8) != 0 || this.A07.A0N.A00) {
                        A0C(A052);
                        this.A05.A05(A052);
                        r5.A06(A0C2);
                        this.A07.A11.A03(A012);
                    } else {
                        if (A0C(A052) != null) {
                            this.A05.A06(A052);
                        }
                        r5.A08(A012);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A0N(AnonymousClass0SJ r3) {
        int A052 = A05();
        while (true) {
            A052--;
            if (A052 < 0) {
                return;
            }
            if (!RecyclerView.A01(A0C(A052)).A05()) {
                A0P(r3, A052);
            }
        }
    }

    public void A0O(AnonymousClass0SJ r8) {
        ArrayList arrayList = r8.A05;
        int size = arrayList.size();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            View view = ((C005602k) arrayList.get(i2)).A0H;
            C005602k A012 = RecyclerView.A01(view);
            if (!A012.A05()) {
                A012.A04(false);
                if ((A012.A00 & 256) != 0) {
                    this.A07.removeDetachedView(view, false);
                }
                C005502j r0 = this.A07.A0R;
                if (r0 != null) {
                    r0.A0A(A012);
                }
                A012.A04(true);
                C005602k A013 = RecyclerView.A01(view);
                A013.A09 = null;
                A013.A0G = false;
                A013.A00 &= -33;
                r8.A08(A013);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = r8.A04;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.A07.invalidate();
        }
    }

    public void A0P(AnonymousClass0SJ r3, int i2) {
        View A0C2 = A0C(i2);
        if (A0C(i2) != null) {
            this.A05.A06(i2);
        }
        r3.A05(A0C2);
    }

    public void A0Q(C05490Rq r5) {
        C05490Rq r1 = this.A06;
        if (!(r1 == null || r5 == r1 || !r1.A05)) {
            r1.A01();
        }
        this.A06 = r5;
        RecyclerView recyclerView = this.A07;
        if (r5.A06) {
            StringBuilder sb = new StringBuilder("An instance of ");
            String simpleName = r5.getClass().getSimpleName();
            sb.append(simpleName);
            sb.append(" was started ");
            sb.append("more than once. Each instance of");
            sb.append(simpleName);
            sb.append(" ");
            sb.append("is intended to only be used once. You should create a new instance for ");
            sb.append("each use.");
            Log.w("RecyclerView", sb.toString());
        }
        r5.A03 = recyclerView;
        r5.A02 = this;
        int i2 = r5.A00;
        if (i2 != -1) {
            recyclerView.A0y.A06 = i2;
            r5.A05 = true;
            r5.A04 = true;
            r5.A01 = recyclerView.A0S.A0B(i2);
            r5.A03.A0z.A00();
            r5.A06 = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public boolean A0R() {
        RecyclerView recyclerView = this.A07;
        return recyclerView != null && recyclerView.A0d;
    }

    public boolean A0S() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a4, code lost:
        if ((r1.bottom - r5) > r6) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0T(android.graphics.Rect r12, android.view.View r13, androidx.recyclerview.widget.RecyclerView r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r0 = 2
            int[] r8 = new int[r0]
            int r4 = r11.A08()
            int r3 = r11.A0A()
            int r2 = r11.A03
            int r0 = r11.A09()
            int r2 = r2 - r0
            int r1 = r11.A00
            int r0 = r11.A07()
            int r1 = r1 - r0
            int r9 = r13.getLeft()
            int r0 = r12.left
            int r9 = r9 + r0
            int r0 = r13.getScrollX()
            int r9 = r9 - r0
            int r7 = r13.getTop()
            int r0 = r12.top
            int r7 = r7 + r0
            int r0 = r13.getScrollY()
            int r7 = r7 - r0
            int r6 = r12.width()
            int r6 = r6 + r9
            int r0 = r12.height()
            int r0 = r0 + r7
            int r9 = r9 - r4
            r4 = 0
            int r10 = java.lang.Math.min(r4, r9)
            int r7 = r7 - r3
            int r5 = java.lang.Math.min(r4, r7)
            int r6 = r6 - r2
            int r3 = java.lang.Math.max(r4, r6)
            int r0 = r0 - r1
            int r2 = java.lang.Math.max(r4, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r1 = X.C004601z.A06(r0)
            r0 = 1
            if (r1 != r0) goto L_0x00b1
            if (r3 != 0) goto L_0x005f
            int r3 = java.lang.Math.max(r10, r6)
        L_0x005f:
            if (r5 != 0) goto L_0x0065
            int r5 = java.lang.Math.min(r7, r2)
        L_0x0065:
            r8[r4] = r3
            r8[r0] = r5
            r10 = 0
            r4 = r8[r4]
            r9 = 1
            if (r16 == 0) goto L_0x00a7
            android.view.View r8 = r14.getFocusedChild()
            if (r8 == 0) goto L_0x00a6
            int r7 = r11.A08()
            int r6 = r11.A0A()
            int r3 = r11.A03
            int r0 = r11.A09()
            int r3 = r3 - r0
            int r2 = r11.A00
            int r0 = r11.A07()
            int r2 = r2 - r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            android.graphics.Rect r1 = r0.A0s
            androidx.recyclerview.widget.RecyclerView.A03(r8, r1)
            int r0 = r1.left
            int r0 = r0 - r4
            if (r0 >= r3) goto L_0x00a6
            int r0 = r1.right
            int r0 = r0 - r4
            if (r0 <= r7) goto L_0x00a6
            int r0 = r1.top
            int r0 = r0 - r5
            if (r0 >= r2) goto L_0x00a6
            int r0 = r1.bottom
            int r0 = r0 - r5
            if (r0 > r6) goto L_0x00a7
        L_0x00a6:
            return r10
        L_0x00a7:
            if (r4 != 0) goto L_0x00ab
            if (r5 == 0) goto L_0x00a6
        L_0x00ab:
            if (r15 == 0) goto L_0x00b9
            r14.scrollBy(r4, r5)
            return r9
        L_0x00b1:
            if (r10 != 0) goto L_0x00b7
            int r10 = java.lang.Math.min(r9, r3)
        L_0x00b7:
            r3 = r10
            goto L_0x005f
        L_0x00b9:
            r14.A0e(r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02W.A0T(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, boolean, boolean):boolean");
    }

    public boolean A0U(View view, AnonymousClass0Bp r4, int i2, int i3) {
        return view.isLayoutRequested() || !A04(view.getWidth(), i2, r4.width) || !A04(view.getHeight(), i3, r4.height);
    }

    public int A0V(AnonymousClass0SJ r4, AnonymousClass0Ri r5) {
        AnonymousClass01X r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r1 = recyclerView.A0N) == null || !A13()) {
            return 1;
        }
        return r1.A0C();
    }

    public int A0W(AnonymousClass0SJ r4, AnonymousClass0Ri r5) {
        AnonymousClass01X r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r1 = recyclerView.A0N) == null || !A14()) {
            return 1;
        }
        return r1.A0C();
    }

    public int A0X(AnonymousClass0SJ r2, AnonymousClass0Ri r3, int i2) {
        return 0;
    }

    public int A0Y(AnonymousClass0SJ r2, AnonymousClass0Ri r3, int i2) {
        return 0;
    }

    public int A0Z(AnonymousClass0Ri r2) {
        return 0;
    }

    public int A0a(AnonymousClass0Ri r2) {
        return 0;
    }

    public int A0b(AnonymousClass0Ri r2) {
        return 0;
    }

    public int A0c(AnonymousClass0Ri r2) {
        return 0;
    }

    public int A0d(AnonymousClass0Ri r2) {
        return 0;
    }

    public int A0e(AnonymousClass0Ri r2) {
        return 0;
    }

    public Parcelable A0f() {
        return null;
    }

    public View A0g(View view, AnonymousClass0SJ r3, AnonymousClass0Ri r4, int i2) {
        return null;
    }

    public abstract AnonymousClass0Bp A0h();

    public AnonymousClass0Bp A0i(Context context, AttributeSet attributeSet) {
        return new AnonymousClass0Bp(context, attributeSet);
    }

    public AnonymousClass0Bp A0j(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass0Bp ? new AnonymousClass0Bp((AnonymousClass0Bp) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new AnonymousClass0Bp((ViewGroup.MarginLayoutParams) layoutParams) : new AnonymousClass0Bp(layoutParams);
    }

    public void A0k(int i2) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A002 = recyclerView.A0K.A00();
            for (int i3 = 0; i3 < A002; i3++) {
                recyclerView.A0K.A03(i3).offsetLeftAndRight(i2);
            }
        }
    }

    public void A0l(int i2) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A002 = recyclerView.A0K.A00();
            for (int i3 = 0; i3 < A002; i3++) {
                recyclerView.A0K.A03(i3).offsetTopAndBottom(i2);
            }
        }
    }

    public void A0m(int i2) {
    }

    public void A0n(int i2) {
    }

    public void A0o(Rect rect, int i2, int i3) {
        int width = rect.width() + A08() + A09();
        int height = rect.height() + A0A() + A07();
        this.A07.setMeasuredDimension(A00(i2, width, this.A07.getMinimumWidth()), A00(i3, height, this.A07.getMinimumHeight()));
    }

    public void A0p(Parcelable parcelable) {
    }

    public void A0q(View view, AnonymousClass031 r9, AnonymousClass0SJ r10, AnonymousClass0Ri r11) {
        r9.A0J(AnonymousClass0WL.A01(A14() ? A02(view) : 0, 1, A13() ? A02(view) : 0, 1, false, false));
    }

    public void A0r(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.A07.canScrollVertically(-1) && !this.A07.canScrollHorizontally(-1) && !this.A07.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            AnonymousClass01X r0 = this.A07.A0N;
            if (r0 != null) {
                accessibilityEvent.setItemCount(r0.A0C());
            }
        }
    }

    public void A0s(C12490kU r1, AnonymousClass0Ri r2, int i2, int i3) {
    }

    public void A0t(AnonymousClass0SJ r3, AnonymousClass0Ri r4) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void A0u(AnonymousClass0SJ r1, RecyclerView recyclerView) {
    }

    public void A0v(AnonymousClass0Ri r1) {
    }

    public void A0w(AnonymousClass0Ri r3, RecyclerView recyclerView, int i2) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void A0x(RecyclerView recyclerView) {
    }

    public void A0y(RecyclerView recyclerView, int i2, int i3) {
    }

    public void A0z(RecyclerView recyclerView, int i2, int i3) {
    }

    public void A10(RecyclerView recyclerView, int i2, int i3, int i4) {
    }

    public void A11(RecyclerView recyclerView, Object obj, int i2, int i3) {
    }

    public void A12(String str) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.A0r(str);
        }
    }

    public boolean A13() {
        return false;
    }

    public boolean A14() {
        return false;
    }

    public boolean A15() {
        return this.A0A;
    }

    public boolean A16() {
        return false;
    }

    public boolean A17(AnonymousClass0Bp r2) {
        return r2 != null;
    }
}
