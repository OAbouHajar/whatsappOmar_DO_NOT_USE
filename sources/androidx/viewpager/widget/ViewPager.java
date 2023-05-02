package androidx.viewpager.widget;

import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass083;
import X.AnonymousClass084;
import X.AnonymousClass085;
import X.AnonymousClass086;
import X.AnonymousClass087;
import X.AnonymousClass089;
import X.AnonymousClass09Q;
import X.C004601z;
import X.C015507l;
import X.C02400Bm;
import X.C02710En;
import X.C12530kY;
import X.C12540kZ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.facebook.redex.IDxObjectShape30S0000000_I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    public static final Interpolator A0p = new IDxObjectShape30S0000000_I0(1);
    public static final AnonymousClass084 A0q = new AnonymousClass084();
    public static final Comparator A0r = new AnonymousClass083();
    public static final int[] A0s = {16842931};
    public float A00 = -3.4028235E38f;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05 = Float.MAX_VALUE;
    public int A06 = -1;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J = 1;
    public int A0K;
    public int A0L;
    public int A0M = -1;
    public int A0N = 0;
    public int A0O;
    public int A0P;
    public Drawable A0Q;
    public Parcelable A0R = null;
    public VelocityTracker A0S;
    public EdgeEffect A0T;
    public EdgeEffect A0U;
    public AnonymousClass012 A0V;
    public C015507l A0W;
    public C12540kZ A0X;
    public AnonymousClass09Q A0Y;
    public ClassLoader A0Z = null;
    public ArrayList A0a;
    public List A0b;
    public List A0c;
    public boolean A0d;
    public boolean A0e = true;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final Rect A0l = new Rect();
    public final AnonymousClass085 A0m = new AnonymousClass085();
    public final Runnable A0n = new AnonymousClass086(this);
    public final ArrayList A0o = new ArrayList();
    public Scroller mScroller;

    public @interface DecorView {
    }

    public ViewPager(Context context) {
        super(context);
        A07();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A07();
    }

    private void A00(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A06) {
            int i2 = 0;
            if (actionIndex == 0) {
                i2 = 1;
            }
            this.A03 = motionEvent.getX(i2);
            this.A06 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.A0S;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.A0k != z2) {
            this.A0k = z2;
        }
    }

    public final Rect A01(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            rect.bottom = view.getBottom();
            ViewParent parent = view.getParent();
            while ((parent instanceof ViewGroup) && parent != this) {
                ViewGroup viewGroup = (ViewGroup) parent;
                rect.left += viewGroup.getLeft();
                rect.right += viewGroup.getRight();
                rect.top += viewGroup.getTop();
                rect.bottom += viewGroup.getBottom();
                parent = viewGroup.getParent();
            }
        }
        return rect;
    }

    public final AnonymousClass085 A02() {
        float f2;
        float f3;
        int i2;
        int clientWidth = getClientWidth();
        float f4 = 0.0f;
        if (clientWidth > 0) {
            float f5 = (float) clientWidth;
            f2 = ((float) getScrollX()) / f5;
            f3 = ((float) this.A0K) / f5;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        AnonymousClass085 r11 = null;
        float f6 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i4 >= arrayList.size()) {
                break;
            }
            AnonymousClass085 r2 = (AnonymousClass085) arrayList.get(i4);
            if (!z2 && r2.A02 != (i2 = i3 + 1)) {
                r2 = this.A0m;
                r2.A00 = f4 + f6 + f3;
                r2.A02 = i2;
                r2.A01 = this.A0V.A00(i2);
                i4--;
            }
            f4 = r2.A00;
            f6 = r2.A01;
            float f7 = f6 + f4 + f3;
            if (!z2 && f2 < f4) {
                break;
            } else if (f2 < f7 || i4 == arrayList.size() - 1) {
                return r2;
            } else {
                i3 = r2.A02;
                i4++;
                r11 = r2;
                z2 = false;
            }
        }
        return r11;
    }

    public AnonymousClass085 A03(int i2) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i3 >= arrayList.size()) {
                return null;
            }
            AnonymousClass085 r1 = (AnonymousClass085) arrayList.get(i3);
            if (r1.A02 == i2) {
                return r1;
            }
            i3++;
        }
    }

    public AnonymousClass085 A04(int i2, int i3) {
        AnonymousClass085 r2 = new AnonymousClass085();
        r2.A02 = i2;
        r2.A03 = this.A0V.A05(this, i2);
        r2.A01 = this.A0V.A00(i2);
        if (i3 >= 0) {
            ArrayList arrayList = this.A0o;
            if (i3 < arrayList.size()) {
                arrayList.add(i3, r2);
                return r2;
            }
        }
        this.A0o.add(r2);
        return r2;
    }

    public AnonymousClass085 A05(View view) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i2 >= arrayList.size()) {
                return null;
            }
            AnonymousClass085 r2 = (AnonymousClass085) arrayList.get(i2);
            if (this.A0V.A0E(view, r2.A03)) {
                return r2;
            }
            i2++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r3.size() >= r7) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r11 = this;
            X.012 r0 = r11.A0V
            int r7 = r0.A01()
            r11.A0E = r7
            java.util.ArrayList r3 = r11.A0o
            int r1 = r3.size()
            int r0 = r11.A0J
            int r0 = r0 << 1
            int r0 = r0 + 1
            r4 = 0
            if (r1 >= r0) goto L_0x001e
            int r0 = r3.size()
            r10 = 1
            if (r0 < r7) goto L_0x001f
        L_0x001e:
            r10 = 0
        L_0x001f:
            int r5 = r11.A0A
            r6 = 0
            r9 = 0
        L_0x0023:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x0073
            java.lang.Object r8 = r3.get(r6)
            X.085 r8 = (X.AnonymousClass085) r8
            X.012 r1 = r11.A0V
            java.lang.Object r0 = r8.A03
            int r2 = r1.A02(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0064
            r0 = -2
            if (r2 != r0) goto L_0x0067
            r3.remove(r6)
            int r6 = r6 + -1
            if (r9 != 0) goto L_0x004a
            X.012 r0 = r11.A0V
            r0.A0B(r11)
            r9 = 1
        L_0x004a:
            X.012 r2 = r11.A0V
            int r1 = r8.A02
            java.lang.Object r0 = r8.A03
            r2.A0D(r11, r0, r1)
            int r1 = r11.A0A
            int r0 = r8.A02
            if (r1 != r0) goto L_0x0063
            int r0 = r7 + -1
            int r0 = java.lang.Math.min(r1, r0)
            int r5 = java.lang.Math.max(r4, r0)
        L_0x0063:
            r10 = 1
        L_0x0064:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0067:
            int r1 = r8.A02
            if (r1 == r2) goto L_0x0064
            int r0 = r11.A0A
            if (r1 != r0) goto L_0x0070
            r5 = r2
        L_0x0070:
            r8.A02 = r2
            goto L_0x0063
        L_0x0073:
            if (r9 == 0) goto L_0x007a
            X.012 r0 = r11.A0V
            r0.A0A(r11)
        L_0x007a:
            java.util.Comparator r0 = A0r
            java.util.Collections.sort(r3, r0)
            if (r10 == 0) goto L_0x00a3
            int r3 = r11.getChildCount()
            r2 = 0
        L_0x0086:
            if (r2 >= r3) goto L_0x009c
            android.view.View r0 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.0Bm r1 = (X.C02400Bm) r1
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0099
            r0 = 0
            r1.A00 = r0
        L_0x0099:
            int r2 = r2 + 1
            goto L_0x0086
        L_0x009c:
            r0 = 1
            r11.A0D(r5, r4, r4, r0)
            r11.requestLayout()
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A06():void");
    }

    public void A07() {
        setWillNotDraw(false);
        setDescendantFocusability(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, A0p);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.A0P = viewConfiguration.getScaledPagingTouchSlop();
        this.A0I = (int) (400.0f * f2);
        this.A0H = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0T = new EdgeEffect(context);
        this.A0U = new EdgeEffect(context);
        this.A0F = (int) (25.0f * f2);
        this.A09 = (int) (2.0f * f2);
        this.A0C = (int) (f2 * 16.0f);
        C004601z.A0j(this, new AnonymousClass087(this));
        if (getImportantForAccessibility() == 0) {
            C004601z.A0d(this, 1);
        }
        C004601z.A0k(this, new AnonymousClass089(this));
    }

    public final void A08() {
        if (this.A0D != 0) {
            ArrayList arrayList = this.A0a;
            if (arrayList == null) {
                this.A0a = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.A0a.add(getChildAt(i2));
            }
            Collections.sort(this.A0a, A0q);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r0 == r1) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(int r19) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A0A
            r1 = r19
            if (r0 == r1) goto L_0x00d0
            X.085 r7 = r3.A03(r0)
            r3.A0A = r1
        L_0x000e:
            X.012 r0 = r3.A0V
            if (r0 == 0) goto L_0x032c
            boolean r0 = r3.A0j
            if (r0 != 0) goto L_0x032c
            android.os.IBinder r0 = r3.getWindowToken()
            if (r0 == 0) goto L_0x032f
            X.012 r0 = r3.A0V
            r0.A0B(r3)
            int r5 = r3.A0J
            int r1 = r3.A0A
            int r1 = r1 - r5
            r0 = 0
            int r10 = java.lang.Math.max(r0, r1)
            X.012 r0 = r3.A0V
            int r4 = r0.A01()
            int r2 = r4 + -1
            int r1 = r3.A0A
            int r0 = r1 + r5
            int r12 = java.lang.Math.min(r2, r0)
            int r0 = r3.A0E
            if (r4 != r0) goto L_0x02d7
            r2 = 0
        L_0x0040:
            java.util.ArrayList r11 = r3.A0o
            int r0 = r11.size()
            if (r2 >= r0) goto L_0x00c8
            java.lang.Object r9 = r11.get(r2)
            X.085 r9 = (X.AnonymousClass085) r9
            int r0 = r9.A02
            if (r0 < r1) goto L_0x00c4
            if (r0 != r1) goto L_0x00c8
        L_0x0054:
            r17 = 0
            if (r9 == 0) goto L_0x0257
            int r8 = r2 + -1
            if (r8 < 0) goto L_0x00c2
            java.lang.Object r13 = r11.get(r8)
            X.085 r13 = (X.AnonymousClass085) r13
        L_0x0062:
            int r6 = r3.getClientWidth()
            r16 = 1073741824(0x40000000, float:2.0)
            if (r6 > 0) goto L_0x00b5
            r5 = 0
        L_0x006b:
            int r0 = r3.A0A
            int r1 = r0 + -1
            r15 = 0
        L_0x0070:
            if (r1 < 0) goto L_0x00d3
            int r0 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x009d
            if (r1 >= r10) goto L_0x009d
            if (r13 == 0) goto L_0x00d3
            int r0 = r13.A02
            if (r1 != r0) goto L_0x0098
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x0098
            r11.remove(r8)
            X.012 r14 = r3.A0V
            java.lang.Object r0 = r13.A03
            r14.A0D(r3, r0, r1)
            int r8 = r8 + -1
            int r2 = r2 + -1
        L_0x0090:
            if (r8 < 0) goto L_0x009b
            java.lang.Object r13 = r11.get(r8)
            X.085 r13 = (X.AnonymousClass085) r13
        L_0x0098:
            int r1 = r1 + -1
            goto L_0x0070
        L_0x009b:
            r13 = 0
            goto L_0x0098
        L_0x009d:
            if (r13 == 0) goto L_0x00a9
            int r0 = r13.A02
            if (r1 != r0) goto L_0x00a9
            float r0 = r13.A01
            float r15 = r15 + r0
            int r8 = r8 + -1
            goto L_0x0090
        L_0x00a9:
            int r0 = r8 + 1
            X.085 r0 = r3.A04(r1, r0)
            float r0 = r0.A01
            float r15 = r15 + r0
            int r2 = r2 + 1
            goto L_0x0090
        L_0x00b5:
            float r0 = r9.A01
            float r5 = r16 - r0
            int r0 = r3.getPaddingLeft()
            float r1 = (float) r0
            float r0 = (float) r6
            float r1 = r1 / r0
            float r5 = r5 + r1
            goto L_0x006b
        L_0x00c2:
            r13 = 0
            goto L_0x0062
        L_0x00c4:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x00c8:
            r9 = 0
            if (r4 <= 0) goto L_0x0054
            X.085 r9 = r3.A04(r1, r2)
            goto L_0x0054
        L_0x00d0:
            r7 = 0
            goto L_0x000e
        L_0x00d3:
            float r8 = r9.A01
            int r5 = r2 + 1
            r10 = r5
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x013c
            int r0 = r11.size()
            if (r5 >= r0) goto L_0x013a
            java.lang.Object r13 = r11.get(r5)
            X.085 r13 = (X.AnonymousClass085) r13
        L_0x00e8:
            if (r6 > 0) goto L_0x0130
            r1 = 0
        L_0x00eb:
            int r6 = r3.A0A
        L_0x00ed:
            int r6 = r6 + 1
            if (r6 >= r4) goto L_0x013c
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x011a
            if (r6 <= r12) goto L_0x011a
            if (r13 == 0) goto L_0x013c
            int r0 = r13.A02
            if (r6 != r0) goto L_0x00ed
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x00ed
            r11.remove(r5)
            X.012 r14 = r3.A0V
            java.lang.Object r0 = r13.A03
            r14.A0D(r3, r0, r6)
        L_0x010b:
            int r0 = r11.size()
            if (r5 >= r0) goto L_0x0118
            java.lang.Object r13 = r11.get(r5)
            X.085 r13 = (X.AnonymousClass085) r13
            goto L_0x00ed
        L_0x0118:
            r13 = 0
            goto L_0x00ed
        L_0x011a:
            if (r13 == 0) goto L_0x0126
            int r0 = r13.A02
            if (r6 != r0) goto L_0x0126
            float r0 = r13.A01
            float r8 = r8 + r0
            int r5 = r5 + 1
            goto L_0x010b
        L_0x0126:
            X.085 r0 = r3.A04(r6, r5)
            int r5 = r5 + 1
            float r0 = r0.A01
            float r8 = r8 + r0
            goto L_0x010b
        L_0x0130:
            int r0 = r3.getPaddingRight()
            float r1 = (float) r0
            float r0 = (float) r6
            float r1 = r1 / r0
            float r1 = r1 + r16
            goto L_0x00eb
        L_0x013a:
            r13 = 0
            goto L_0x00e8
        L_0x013c:
            X.012 r0 = r3.A0V
            int r13 = r0.A01()
            int r1 = r3.getClientWidth()
            if (r1 <= 0) goto L_0x0195
            int r0 = r3.A0K
            float r8 = (float) r0
            float r0 = (float) r1
            float r8 = r8 / r0
        L_0x014d:
            if (r7 == 0) goto L_0x01ce
            int r6 = r7.A02
            int r0 = r9.A02
            if (r6 >= r0) goto L_0x0197
            float r1 = r7.A00
            float r0 = r7.A01
            float r1 = r1 + r0
            float r1 = r1 + r8
            int r5 = r6 + 1
            r4 = 0
        L_0x015e:
            int r0 = r9.A02
            if (r5 > r0) goto L_0x01ce
            int r0 = r11.size()
            if (r4 >= r0) goto L_0x01ce
        L_0x0168:
            java.lang.Object r6 = r11.get(r4)
            X.085 r6 = (X.AnonymousClass085) r6
            int r0 = r6.A02
            if (r5 <= r0) goto L_0x017d
            int r0 = r11.size()
            int r0 = r0 + -1
            if (r4 >= r0) goto L_0x017d
            int r4 = r4 + 1
            goto L_0x0168
        L_0x017d:
            int r0 = r6.A02
            if (r5 >= r0) goto L_0x018c
            X.012 r0 = r3.A0V
            float r0 = r0.A00(r5)
            float r0 = r0 + r8
            float r1 = r1 + r0
            int r5 = r5 + 1
            goto L_0x017d
        L_0x018c:
            r6.A00 = r1
            float r0 = r6.A01
            float r0 = r0 + r8
            float r1 = r1 + r0
            int r5 = r5 + 1
            goto L_0x015e
        L_0x0195:
            r8 = 0
            goto L_0x014d
        L_0x0197:
            if (r6 <= r0) goto L_0x01ce
            int r0 = r11.size()
            int r5 = r0 + -1
            float r4 = r7.A00
        L_0x01a1:
            int r6 = r6 + -1
            int r0 = r9.A02
            if (r6 < r0) goto L_0x01ce
            if (r5 < 0) goto L_0x01ce
        L_0x01a9:
            java.lang.Object r1 = r11.get(r5)
            X.085 r1 = (X.AnonymousClass085) r1
            int r0 = r1.A02
            if (r6 >= r0) goto L_0x01b8
            if (r5 <= 0) goto L_0x01b8
            int r5 = r5 + -1
            goto L_0x01a9
        L_0x01b8:
            int r0 = r1.A02
            if (r6 <= r0) goto L_0x01c7
            X.012 r0 = r3.A0V
            float r0 = r0.A00(r6)
            float r0 = r0 + r8
            float r4 = r4 - r0
            int r6 = r6 + -1
            goto L_0x01b8
        L_0x01c7:
            float r0 = r1.A01
            float r0 = r0 + r8
            float r4 = r4 - r0
            r1.A00 = r4
            goto L_0x01a1
        L_0x01ce:
            int r7 = r11.size()
            float r5 = r9.A00
            int r1 = r9.A02
            int r12 = r1 + -1
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r1 != 0) goto L_0x01de
            r0 = r5
        L_0x01de:
            r3.A00 = r0
            int r6 = r13 + -1
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r6) goto L_0x0215
            float r0 = r9.A01
            float r0 = r0 + r5
            float r0 = r0 - r13
        L_0x01ea:
            r3.A05 = r0
            int r4 = r2 + -1
        L_0x01ee:
            if (r4 < 0) goto L_0x0219
            java.lang.Object r2 = r11.get(r4)
            X.085 r2 = (X.AnonymousClass085) r2
        L_0x01f6:
            int r1 = r2.A02
            if (r12 <= r1) goto L_0x0206
            X.012 r0 = r3.A0V
            int r1 = r12 + -1
            float r0 = r0.A00(r12)
            float r0 = r0 + r8
            float r5 = r5 - r0
            r12 = r1
            goto L_0x01f6
        L_0x0206:
            float r0 = r2.A01
            float r0 = r0 + r8
            float r5 = r5 - r0
            r2.A00 = r5
            if (r1 != 0) goto L_0x0210
            r3.A00 = r5
        L_0x0210:
            int r4 = r4 + -1
            int r12 = r12 + -1
            goto L_0x01ee
        L_0x0215:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x01ea
        L_0x0219:
            float r5 = r9.A00
            float r0 = r9.A01
            float r5 = r5 + r0
            float r5 = r5 + r8
            int r0 = r9.A02
            int r4 = r0 + 1
        L_0x0223:
            if (r10 >= r7) goto L_0x024e
            java.lang.Object r2 = r11.get(r10)
            X.085 r2 = (X.AnonymousClass085) r2
        L_0x022b:
            int r0 = r2.A02
            if (r4 >= r0) goto L_0x023b
            X.012 r0 = r3.A0V
            int r1 = r4 + 1
            float r0 = r0.A00(r4)
            float r0 = r0 + r8
            float r5 = r5 + r0
            r4 = r1
            goto L_0x022b
        L_0x023b:
            if (r0 != r6) goto L_0x0243
            float r0 = r2.A01
            float r0 = r0 + r5
            float r0 = r0 - r13
            r3.A05 = r0
        L_0x0243:
            r2.A00 = r5
            float r0 = r2.A01
            float r0 = r0 + r8
            float r5 = r5 + r0
            int r10 = r10 + 1
            int r4 = r4 + 1
            goto L_0x0223
        L_0x024e:
            X.012 r2 = r3.A0V
            int r1 = r3.A0A
            java.lang.Object r0 = r9.A03
            r2.A0C(r3, r0, r1)
        L_0x0257:
            X.012 r0 = r3.A0V
            r0.A0A(r3)
            int r5 = r3.getChildCount()
            r4 = 0
        L_0x0261:
            if (r4 >= r5) goto L_0x028a
            android.view.View r1 = r3.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            X.0Bm r2 = (X.C02400Bm) r2
            r2.A01 = r4
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0287
            float r0 = r2.A00
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x0287
            X.085 r1 = r3.A05(r1)
            if (r1 == 0) goto L_0x0287
            float r0 = r1.A01
            r2.A00 = r0
            int r0 = r1.A02
            r2.A03 = r0
        L_0x0287:
            int r4 = r4 + 1
            goto L_0x0261
        L_0x028a:
            r3.A08()
            boolean r0 = r3.hasFocus()
            if (r0 == 0) goto L_0x032f
            android.view.View r0 = r3.findFocus()
            if (r0 == 0) goto L_0x02b5
        L_0x0299:
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == r3) goto L_0x02a9
            if (r1 == 0) goto L_0x02b5
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x02b5
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            goto L_0x0299
        L_0x02a9:
            X.085 r0 = r3.A05(r0)
            if (r0 == 0) goto L_0x02b5
            int r1 = r0.A02
            int r0 = r3.A0A
            if (r1 == r0) goto L_0x032f
        L_0x02b5:
            r4 = 0
        L_0x02b6:
            int r0 = r3.getChildCount()
            if (r4 >= r0) goto L_0x032f
            android.view.View r2 = r3.getChildAt(r4)
            X.085 r0 = r3.A05(r2)
            if (r0 == 0) goto L_0x02d4
            int r1 = r0.A02
            int r0 = r3.A0A
            if (r1 != r0) goto L_0x02d4
            r0 = 2
            boolean r0 = r2.requestFocus(r0)
            if (r0 == 0) goto L_0x02d4
            return
        L_0x02d4:
            int r4 = r4 + 1
            goto L_0x02b6
        L_0x02d7:
            android.content.res.Resources r1 = r3.getResources()     // Catch:{ NotFoundException -> 0x02e4 }
            int r0 = r3.getId()     // Catch:{ NotFoundException -> 0x02e4 }
            java.lang.String r2 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x02e4 }
            goto L_0x02ec
        L_0x02e4:
            int r0 = r3.getId()
            java.lang.String r2 = java.lang.Integer.toHexString(r0)
        L_0x02ec:
            java.lang.String r0 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r3.A0E
            r1.append(r0)
            java.lang.String r0 = ", found: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " Pager id: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " Pager class: "
            r1.append(r0)
            java.lang.Class r0 = r3.getClass()
            r1.append(r0)
            java.lang.String r0 = " Problematic adapter: "
            r1.append(r0)
            X.012 r0 = r3.A0V
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x032c:
            r3.A08()
        L_0x032f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A09(int):void");
    }

    public final void A0A(int i2) {
        C015507l r0 = this.A0W;
        if (r0 != null) {
            r0.AUP(i2);
        }
        List list = this.A0c;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C015507l r02 = (C015507l) this.A0c.get(i3);
                if (r02 != null) {
                    r02.AUP(i2);
                }
            }
        }
    }

    public void A0B(int i2, float f2, int i3) {
        int i4;
        int i5;
        if (this.A0B > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                C02400Bm r1 = (C02400Bm) childAt.getLayoutParams();
                if (r1.A04) {
                    int i7 = r1.A02 & 7;
                    if (i7 == 1) {
                        i4 = Math.max((width - childAt.getMeasuredWidth()) >> 1, paddingLeft);
                        i5 = paddingLeft;
                        paddingLeft = i4;
                    } else if (i7 == 3) {
                        i5 = childAt.getWidth() + paddingLeft;
                    } else if (i7 != 5) {
                        i5 = paddingLeft;
                    } else {
                        i4 = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i5 = paddingLeft;
                        paddingLeft = i4;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = i5;
                }
            }
        }
        C015507l r0 = this.A0W;
        if (r0 != null) {
            r0.AUO(i2, f2, i3);
        }
        List list = this.A0c;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                C015507l r02 = (C015507l) this.A0c.get(i8);
                if (r02 != null) {
                    r02.AUO(i2, f2, i3);
                }
            }
        }
        if (this.A0X != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt2 = getChildAt(i9);
                if (!((C02400Bm) childAt2.getLayoutParams()).A04) {
                    this.A0X.Ah2(childAt2, ((float) (childAt2.getLeft() - scrollX2)) / ((float) getClientWidth()));
                }
            }
        }
        this.A0d = true;
    }

    public final void A0C(int i2, int i3, int i4, int i5) {
        int i6;
        if (i3 <= 0 || this.A0o.isEmpty()) {
            AnonymousClass085 A032 = A03(this.A0A);
            i6 = (int) ((A032 != null ? Math.min(A032.A00, this.A05) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (i6 != getScrollX()) {
                A0I(false);
            } else {
                return;
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            i6 = (int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)));
        }
        scrollTo(i6, getScrollY());
    }

    public void A0D(int i2, int i3, boolean z2, boolean z3) {
        AnonymousClass012 r0 = this.A0V;
        boolean z4 = false;
        if (r0 == null || r0.A01() <= 0 || (!z3 && this.A0A == i2 && this.A0o.size() != 0)) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.A0V.A01()) {
            i2 = this.A0V.A01() - 1;
        }
        int i4 = this.A0J;
        int i5 = this.A0A;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            int i6 = 0;
            while (true) {
                ArrayList arrayList = this.A0o;
                if (i6 >= arrayList.size()) {
                    break;
                }
                ((AnonymousClass085) arrayList.get(i6)).A04 = true;
                i6++;
            }
        }
        if (i5 != i2) {
            z4 = true;
        }
        if (this.A0e) {
            this.A0A = i2;
            if (z4) {
                A0A(i2);
            }
            requestLayout();
            return;
        }
        A09(i2);
        A0E(i2, i3, z2, z4);
    }

    public final void A0E(int i2, int i3, boolean z2, boolean z3) {
        int scrollX;
        AnonymousClass085 A032 = A03(i2);
        int clientWidth = A032 != null ? (int) (((float) getClientWidth()) * Math.max(this.A00, Math.min(A032.A00, this.A05))) : 0;
        if (z2) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.mScroller;
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    boolean z4 = this.A0h;
                    Scroller scroller2 = this.mScroller;
                    scrollX = z4 ? scroller2.getCurrX() : scroller2.getStartX();
                    this.mScroller.abortAnimation();
                    setScrollingCacheEnabled(false);
                }
                int scrollY = getScrollY();
                int i4 = clientWidth - scrollX;
                int i5 = -scrollY;
                if (i4 == 0 && i5 == 0) {
                    A0I(false);
                    A09(this.A0A);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth2 = getClientWidth();
                    float abs = (float) Math.abs(i4);
                    float f2 = (float) clientWidth2;
                    float f3 = (float) (clientWidth2 >> 1);
                    float sin = f3 + (((float) Math.sin((double) ((Math.min(1.0f, (abs * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3);
                    int abs2 = Math.abs(i3);
                    int min = Math.min(abs2 > 0 ? Math.round(Math.abs(sin / ((float) abs2)) * 1000.0f) << 2 : (int) (((abs / ((f2 * this.A0V.A00(this.A0A)) + ((float) this.A0K))) + 1.0f) * 100.0f), 600);
                    this.A0h = false;
                    this.mScroller.startScroll(scrollX, scrollY, i4, i5, min);
                    postInvalidateOnAnimation();
                }
            }
            if (z3) {
                A0A(i2);
                return;
            }
            return;
        }
        if (z3) {
            A0A(i2);
        }
        A0I(false);
        scrollTo(clientWidth, 0);
        A0M(clientWidth);
    }

    public void A0F(int i2, boolean z2) {
        this.A0j = false;
        A0D(i2, 0, z2, false);
    }

    public void A0G(C015507l r2) {
        List list = this.A0c;
        if (list == null) {
            list = new ArrayList();
            this.A0c = list;
        }
        list.add(r2);
    }

    public void A0H(C12540kZ r7, boolean z2) {
        int i2 = 1;
        boolean z3 = false;
        if (r7 != null) {
            z3 = true;
        }
        boolean z4 = false;
        if (this.A0X != null) {
            z4 = true;
        }
        boolean z5 = false;
        if (z3 != z4) {
            z5 = true;
        }
        this.A0X = r7;
        setChildrenDrawingOrderEnabled(z3);
        if (z3) {
            if (z2) {
                i2 = 2;
            }
            this.A0D = i2;
            this.A0L = 2;
        } else {
            this.A0D = 0;
        }
        if (z5) {
            A09(this.A0A);
        }
    }

    public final void A0I(boolean z2) {
        boolean z3 = false;
        if (this.A0N == 2) {
            z3 = true;
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0M(currX);
                    }
                }
            }
        }
        this.A0j = false;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i2 >= arrayList.size()) {
                break;
            }
            AnonymousClass085 r1 = (AnonymousClass085) arrayList.get(i2);
            if (r1.A04) {
                r1.A04 = false;
                z3 = true;
            }
            i2++;
        }
        if (z3) {
            Runnable runnable = this.A0n;
            if (z2) {
                postOnAnimation(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public final boolean A0J() {
        this.A06 = -1;
        this.A0g = false;
        this.A0i = false;
        VelocityTracker velocityTracker = this.A0S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0S = null;
        }
        this.A0T.onRelease();
        this.A0U.onRelease();
        return this.A0T.isFinished() || this.A0U.isFinished();
    }

    public final boolean A0K(float f2) {
        boolean z2;
        boolean z3;
        this.A03 = f2;
        float scrollX = ((float) getScrollX()) + (this.A03 - f2);
        float clientWidth = (float) getClientWidth();
        float f3 = this.A00 * clientWidth;
        float f4 = this.A05 * clientWidth;
        ArrayList arrayList = this.A0o;
        boolean z4 = false;
        AnonymousClass085 r1 = (AnonymousClass085) arrayList.get(0);
        AnonymousClass085 r8 = (AnonymousClass085) arrayList.get(arrayList.size() - 1);
        if (r1.A02 != 0) {
            f3 = r1.A00 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (r8.A02 != this.A0V.A01() - 1) {
            f4 = r8.A00 * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f3) {
            if (z2) {
                this.A0T.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z3) {
                this.A0U.onPull(Math.abs(scrollX - f4) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        }
        int i2 = (int) scrollX;
        this.A03 += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        A0M(i2);
        return z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        if (r1 >= r0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        if (r1 <= r0) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        if (r6 != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        if (r8 != 2) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(int r8) {
        /*
            r7 = this;
            android.view.View r4 = r7.findFocus()
            r3 = 1
            r6 = 0
            r5 = 0
            if (r4 == r7) goto L_0x005e
            if (r4 == 0) goto L_0x005f
            android.view.ViewParent r1 = r4.getParent()
        L_0x000f:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x001a
            if (r1 == r7) goto L_0x005f
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x000f
        L_0x001a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r4.getParent()
        L_0x002e:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = " => "
            r2.append(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x002e
        L_0x0047:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewPager"
            android.util.Log.e(r0, r1)
        L_0x005e:
            r4 = r5
        L_0x005f:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r5 = r0.findNextFocus(r7, r4, r8)
            r1 = 66
            r0 = 17
            if (r5 == 0) goto L_0x00b0
            if (r5 == r4) goto L_0x00b0
            if (r8 != r0) goto L_0x0094
            android.graphics.Rect r2 = r7.A0l
            android.graphics.Rect r0 = r7.A01(r2, r5)
            int r1 = r0.left
            android.graphics.Rect r0 = r7.A01(r2, r4)
            int r0 = r0.left
            if (r4 == 0) goto L_0x00a9
            if (r1 < r0) goto L_0x00a9
        L_0x0083:
            int r0 = r7.A0A
            if (r0 <= 0) goto L_0x0093
            int r0 = r0 - r3
        L_0x0088:
            r7.A0F(r0, r3)
            r6 = 1
        L_0x008c:
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r0)
        L_0x0093:
            return r6
        L_0x0094:
            if (r8 != r1) goto L_0x0093
            android.graphics.Rect r2 = r7.A0l
            android.graphics.Rect r0 = r7.A01(r2, r5)
            int r1 = r0.left
            android.graphics.Rect r0 = r7.A01(r2, r4)
            int r0 = r0.left
            if (r4 == 0) goto L_0x00a9
            if (r1 > r0) goto L_0x00a9
            goto L_0x00b9
        L_0x00a9:
            boolean r6 = r5.requestFocus()
            if (r6 == 0) goto L_0x0093
            goto L_0x008c
        L_0x00b0:
            if (r8 == r0) goto L_0x0083
            if (r8 == r3) goto L_0x0083
            if (r8 == r1) goto L_0x00b9
            r0 = 2
            if (r8 != r0) goto L_0x0093
        L_0x00b9:
            X.012 r0 = r7.A0V
            if (r0 == 0) goto L_0x0093
            int r1 = r7.A0A
            int r0 = r0.A01()
            int r0 = r0 - r3
            if (r1 >= r0) goto L_0x0093
            int r0 = r7.A0A
            int r0 = r0 + 1
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0L(int):boolean");
    }

    public final boolean A0M(int i2) {
        if (this.A0o.size() == 0) {
            if (!this.A0e) {
                this.A0d = false;
                A0B(0, 0.0f, 0);
                if (!this.A0d) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        AnonymousClass085 A022 = A02();
        int clientWidth = getClientWidth();
        int i3 = this.A0K;
        int i4 = clientWidth + i3;
        float f2 = (float) i3;
        float f3 = (float) clientWidth;
        int i5 = A022.A02;
        float f4 = ((((float) i2) / f3) - A022.A00) / (A022.A01 + (f2 / f3));
        this.A0d = false;
        A0B(i5, f4, (int) (((float) i4) * f4));
        if (this.A0d) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public boolean A0N(View view, int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6 = i2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i7 = i3 + scrollX;
                if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (A0N(childAt, i6, i7 - childAt.getLeft(), i5 - childAt.getTop(), true)) {
                        return true;
                    }
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        AnonymousClass085 A052;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (A052 = A05(childAt)) != null && A052.A02 == this.A0A) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if ((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList arrayList) {
        AnonymousClass085 A052;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (A052 = A05(childAt)) != null && A052.A02 == this.A0A) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new C02400Bm();
        }
        C02400Bm r3 = (C02400Bm) layoutParams;
        boolean z2 = r3.A04;
        boolean z3 = false;
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            z3 = true;
        }
        boolean z4 = z2 | z3;
        r3.A04 = z4;
        if (!this.A0f) {
            super.addView(view, i2, layoutParams);
        } else if (!z4) {
            r3.A05 = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.A0V == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.A00));
        }
        if (i2 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.A05))) {
            return false;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C02400Bm) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.A0h = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            A0I(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!A0M(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i2;
        boolean A0L2;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        int i3 = 2;
        if (keyCode != 21) {
            if (keyCode != 22) {
                if (keyCode != 61) {
                    return false;
                }
                if (!keyEvent.hasNoModifiers()) {
                    i3 = 1;
                    if (!keyEvent.hasModifiers(1)) {
                        return false;
                    }
                }
                A0L2 = A0L(i3);
            } else if (keyEvent.hasModifiers(2)) {
                AnonymousClass012 r0 = this.A0V;
                if (r0 == null || this.A0A >= r0.A01() - 1) {
                    return false;
                }
                A0F(this.A0A + 1, true);
                return true;
            } else {
                i2 = 66;
                A0L2 = A0L(i2);
            }
        } else if (keyEvent.hasModifiers(2)) {
            int i4 = this.A0A;
            if (i4 <= 0) {
                return false;
            }
            A0F(i4 - 1, true);
            return true;
        } else {
            i2 = 17;
            A0L2 = A0L(i2);
        }
        return A0L2;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AnonymousClass085 A052;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (A052 = A05(childAt)) != null && A052.A02 == this.A0A && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        AnonymousClass012 r0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (r0 = this.A0V) != null && r0.A01() > 1)) {
            if (!this.A0T.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.A00 * ((float) width));
                this.A0T.setSize(height, width);
                z2 = false | this.A0T.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.A0U.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.A05 + 1.0f)) * ((float) width2));
                this.A0U.setSize(height2, width2);
                z2 |= this.A0U.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z2) {
                postInvalidateOnAnimation();
                return;
            }
            return;
        }
        this.A0T.finish();
        this.A0U.finish();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0Q;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C02400Bm();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C02400Bm(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C02400Bm();
    }

    public AnonymousClass012 getAdapter() {
        return this.A0V;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        if (this.A0D == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((C02400Bm) ((View) this.A0a.get(i3)).getLayoutParams()).A01;
    }

    public int getCurrentItem() {
        return this.A0A;
    }

    public int getOffscreenPageLimit() {
        return this.A0J;
    }

    public int getPageMargin() {
        return this.A0K;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0e = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.A0n);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r11 = r19
            r18 = r20
            r0 = r18
            super.onDraw(r0)
            int r0 = r11.A0K
            if (r0 <= 0) goto L_0x009b
            android.graphics.drawable.Drawable r0 = r11.A0Q
            if (r0 == 0) goto L_0x009b
            java.util.ArrayList r12 = r11.A0o
            int r0 = r12.size()
            if (r0 <= 0) goto L_0x009b
            X.012 r0 = r11.A0V
            if (r0 == 0) goto L_0x009b
            int r10 = r11.getScrollX()
            int r9 = r11.getWidth()
            int r0 = r11.A0K
            float r8 = (float) r0
            float r7 = (float) r9
            float r8 = r8 / r7
            r6 = 0
            java.lang.Object r5 = r12.get(r6)
            X.085 r5 = (X.AnonymousClass085) r5
            float r2 = r5.A00
            int r4 = r12.size()
            int r3 = r5.A02
            int r0 = r4 + -1
            java.lang.Object r0 = r12.get(r0)
            X.085 r0 = (X.AnonymousClass085) r0
            int r0 = r0.A02
            r17 = r0
        L_0x0045:
            r0 = r17
            if (r3 >= r0) goto L_0x009b
        L_0x0049:
            int r0 = r5.A02
            if (r3 <= r0) goto L_0x0058
            if (r6 >= r4) goto L_0x0058
            int r6 = r6 + 1
            java.lang.Object r5 = r12.get(r6)
            X.085 r5 = (X.AnonymousClass085) r5
            goto L_0x0049
        L_0x0058:
            if (r3 != r0) goto L_0x008e
            float r2 = r5.A00
            float r0 = r5.A01
            float r2 = r2 + r0
            float r16 = r2 * r7
            float r2 = r2 + r8
        L_0x0062:
            int r0 = r11.A0K
            float r0 = (float) r0
            float r0 = r0 + r16
            float r1 = (float) r10
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0084
            android.graphics.drawable.Drawable r15 = r11.A0Q
            int r14 = java.lang.Math.round(r16)
            int r13 = r11.A0O
            int r1 = java.lang.Math.round(r0)
            int r0 = r11.A07
            r15.setBounds(r14, r13, r1, r0)
            android.graphics.drawable.Drawable r1 = r11.A0Q
            r0 = r18
            r1.draw(r0)
        L_0x0084:
            int r0 = r10 + r9
            float r0 = (float) r0
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x009b
            int r3 = r3 + 1
            goto L_0x0045
        L_0x008e:
            X.012 r0 = r11.A0V
            float r0 = r0.A00(r3)
            float r16 = r2 + r0
            float r16 = r16 * r7
            float r0 = r0 + r8
            float r2 = r2 + r0
            goto L_0x0062
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent2.getAction() & MotionEventCompat.ACTION_MASK;
        if (action == 3 || action == 1) {
            A0J();
            return false;
        }
        if (action != 0) {
            if (this.A0g) {
                return true;
            }
            if (this.A0i) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent2.getX();
            this.A01 = x2;
            this.A03 = x2;
            float y2 = motionEvent2.getY();
            this.A02 = y2;
            this.A04 = y2;
            this.A06 = motionEvent2.getPointerId(0);
            this.A0i = false;
            this.A0h = true;
            this.mScroller.computeScrollOffset();
            if (this.A0N != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.A09) {
                A0I(false);
                this.A0g = false;
            } else {
                this.mScroller.abortAnimation();
                this.A0j = false;
                A09(this.A0A);
                this.A0g = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.A06;
            if (i2 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i2);
                float x3 = motionEvent2.getX(findPointerIndex);
                float f2 = x3 - this.A03;
                float abs = Math.abs(f2);
                float y3 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.A02);
                if (f2 != 0.0f) {
                    float f3 = this.A03;
                    if ((f3 >= ((float) this.A0G) || f2 <= 0.0f) && (f3 <= ((float) (getWidth() - this.A0G)) || f2 >= 0.0f)) {
                        if (A0N(this, (int) f2, (int) x3, (int) y3, false)) {
                            this.A03 = x3;
                            this.A04 = y3;
                            this.A0i = true;
                            return false;
                        }
                    }
                }
                float f4 = (float) this.A0P;
                if (abs > f4 && abs * 0.5f > abs2) {
                    this.A0g = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                    float f5 = this.A01;
                    float f6 = (float) this.A0P;
                    this.A03 = i3 > 0 ? f5 + f6 : f5 - f6;
                    this.A04 = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f4) {
                    this.A0i = true;
                }
                if (this.A0g && A0K(x3)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            A00(motionEvent2);
        }
        VelocityTracker velocityTracker = this.A0S;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.A0S = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent2);
        return this.A0g;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        AnonymousClass085 A052;
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount = getChildCount();
        int i10 = i4 - i2;
        int i11 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C02400Bm r1 = (C02400Bm) childAt.getLayoutParams();
                if (r1.A04) {
                    int i14 = r1.A02;
                    int i15 = i14 & 7;
                    int i16 = i14 & 112;
                    if (i15 == 1) {
                        i6 = Math.max((i10 - childAt.getMeasuredWidth()) >> 1, paddingLeft);
                        i7 = paddingLeft;
                        paddingLeft = i6;
                    } else if (i15 == 3) {
                        i7 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i15 != 5) {
                        i7 = paddingLeft;
                    } else {
                        i6 = (i10 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i7 = paddingLeft;
                        paddingLeft = i6;
                    }
                    if (i16 == 16) {
                        i8 = Math.max((i11 - childAt.getMeasuredHeight()) >> 1, paddingTop);
                        i9 = paddingTop;
                        paddingTop = i8;
                    } else if (i16 == 48) {
                        i9 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i16 != 80) {
                        i9 = paddingTop;
                    } else {
                        i8 = (i11 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i9 = paddingTop;
                        paddingTop = i8;
                    }
                    int i17 = paddingLeft + scrollX;
                    childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + paddingTop);
                    i12++;
                    paddingTop = i9;
                    paddingLeft = i7;
                }
            }
        }
        int i18 = (i10 - paddingLeft) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                C02400Bm r12 = (C02400Bm) childAt2.getLayoutParams();
                if (!r12.A04 && (A052 = A05(childAt2)) != null) {
                    float f2 = (float) i18;
                    int i20 = ((int) (A052.A00 * f2)) + paddingLeft;
                    if (r12.A05) {
                        r12.A05 = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * r12.A00), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i20, paddingTop, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.A0O = paddingTop;
        this.A07 = i11 - paddingBottom;
        this.A0B = i12;
        if (this.A0e) {
            z3 = false;
            A0E(this.A0A, 0, false, false);
        } else {
            z3 = false;
        }
        this.A0e = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (r2 == 80) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (r12 == false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r9 = 0
            r0 = r18
            int r1 = android.view.ViewGroup.getDefaultSize(r9, r0)
            r0 = r19
            int r0 = android.view.ViewGroup.getDefaultSize(r9, r0)
            r8 = r17
            r8.setMeasuredDimension(r1, r0)
            int r7 = r8.getMeasuredWidth()
            int r1 = r7 / 10
            int r0 = r8.A0C
            int r0 = java.lang.Math.min(r1, r0)
            r8.A0G = r0
            int r0 = r8.getPaddingLeft()
            int r7 = r7 - r0
            int r0 = r8.getPaddingRight()
            int r7 = r7 - r0
            int r11 = r8.getMeasuredHeight()
            int r0 = r8.getPaddingTop()
            int r11 = r11 - r0
            int r0 = r8.getPaddingBottom()
            int r11 = r11 - r0
            int r10 = r8.getChildCount()
            r4 = 0
        L_0x003d:
            r6 = 8
            r12 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r4 >= r10) goto L_0x00b4
            android.view.View r13 = r8.getChildAt(r4)
            int r0 = r13.getVisibility()
            if (r0 == r6) goto L_0x009f
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            X.0Bm r15 = (X.C02400Bm) r15
            if (r15 == 0) goto L_0x009f
            boolean r0 = r15.A04
            if (r0 == 0) goto L_0x009f
            int r0 = r15.A02
            r1 = r0 & 7
            r2 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r2 == r0) goto L_0x006a
            r0 = 80
            r16 = 0
            if (r2 != r0) goto L_0x006c
        L_0x006a:
            r16 = 1
        L_0x006c:
            r0 = 3
            if (r1 == r0) goto L_0x0073
            r0 = 5
            if (r1 == r0) goto L_0x0073
            r12 = 0
        L_0x0073:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r16 == 0) goto L_0x00af
            r14 = 1073741824(0x40000000, float:2.0)
        L_0x0079:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007b:
            int r3 = r15.width
            r2 = -1
            r1 = -2
            if (r3 == r1) goto L_0x00ad
            if (r3 != r2) goto L_0x0084
            r3 = r7
        L_0x0084:
            r14 = 1073741824(0x40000000, float:2.0)
        L_0x0086:
            int r0 = r15.height
            if (r0 == r1) goto L_0x00aa
            if (r0 != r2) goto L_0x008d
            r0 = r11
        L_0x008d:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r14)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r13.measure(r1, r0)
            if (r16 == 0) goto L_0x00a2
            int r0 = r13.getMeasuredHeight()
            int r11 = r11 - r0
        L_0x009f:
            int r4 = r4 + 1
            goto L_0x003d
        L_0x00a2:
            if (r12 == 0) goto L_0x009f
            int r0 = r13.getMeasuredWidth()
            int r7 = r7 - r0
            goto L_0x009f
        L_0x00aa:
            r0 = r11
            r5 = r6
            goto L_0x008d
        L_0x00ad:
            r3 = r7
            goto L_0x0086
        L_0x00af:
            r6 = 1073741824(0x40000000, float:2.0)
            if (r12 != 0) goto L_0x007b
            goto L_0x0079
        L_0x00b4:
            android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r5)
            r8.A08 = r0
            r8.A0f = r12
            int r0 = r8.A0A
            r8.A09(r0)
            r8.A0f = r9
            int r4 = r8.getChildCount()
        L_0x00ca:
            if (r9 >= r4) goto L_0x00f3
            android.view.View r3 = r8.getChildAt(r9)
            int r0 = r3.getVisibility()
            if (r0 == r6) goto L_0x00f0
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.0Bm r2 = (X.C02400Bm) r2
            if (r2 == 0) goto L_0x00e2
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x00f0
        L_0x00e2:
            float r1 = (float) r7
            float r0 = r2.A00
            float r1 = r1 * r0
            int r0 = (int) r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            int r0 = r8.A08
            r3.measure(r1, r0)
        L_0x00f0:
            int r9 = r9 + 1
            goto L_0x00ca
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        AnonymousClass085 A052;
        int childCount = getChildCount();
        int i3 = -1;
        int i4 = childCount - 1;
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i3 = childCount;
            i4 = 0;
            i5 = 1;
        }
        while (i4 != i3) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (A052 = A05(childAt)) != null && A052.A02 == this.A0A && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i4 += i5;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C02710En)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C02710En r4 = (C02710En) parcelable;
        super.onRestoreInstanceState(r4.A00);
        AnonymousClass012 r2 = this.A0V;
        if (r2 != null) {
            r2.A09(r4.A01, r4.A02);
            A0D(r4.A00, 0, false, true);
            return;
        }
        this.A0M = r4.A00;
        this.A0R = r4.A01;
        this.A0Z = r4.A02;
    }

    public Parcelable onSaveInstanceState() {
        C02710En r1 = new C02710En(super.onSaveInstanceState());
        r1.A00 = this.A0A;
        AnonymousClass012 r0 = this.A0V;
        if (r0 != null) {
            r1.A01 = r0.A03();
        }
        return r1;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.A0K;
            A0C(i2, i4, i6, i6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r1 = 1
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x000f
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            return r2
        L_0x000f:
            X.012 r0 = r7.A0V
            if (r0 == 0) goto L_0x000e
            int r0 = r0.A01()
            if (r0 == 0) goto L_0x000e
            android.view.VelocityTracker r0 = r7.A0S
            if (r0 != 0) goto L_0x0023
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.A0S = r0
        L_0x0023:
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r3 = r0 & 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x015e
            if (r3 == r1) goto L_0x00bd
            r0 = 2
            if (r3 == r0) goto L_0x004c
            r0 = 3
            if (r3 == r0) goto L_0x014b
            r0 = 5
            if (r3 == r0) goto L_0x017b
            r0 = 6
            if (r3 != r0) goto L_0x004b
            r7.A00(r8)
            int r0 = r7.A06
            int r0 = r8.findPointerIndex(r0)
            float r0 = r8.getX(r0)
            r7.A03 = r0
        L_0x004b:
            return r1
        L_0x004c:
            boolean r0 = r7.A0g
            if (r0 != 0) goto L_0x00a6
            int r0 = r7.A06
            int r3 = r8.findPointerIndex(r0)
            r0 = -1
            if (r3 == r0) goto L_0x0154
            float r6 = r8.getX(r3)
            float r0 = r7.A03
            float r0 = r6 - r0
            float r4 = java.lang.Math.abs(r0)
            float r5 = r8.getY(r3)
            float r0 = r7.A04
            float r0 = r5 - r0
            float r3 = java.lang.Math.abs(r0)
            int r0 = r7.A0P
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            r7.A0g = r1
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x0087
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0087:
            float r4 = r7.A01
            float r6 = r6 - r4
            r0 = 0
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            int r0 = r7.A0P
            float r0 = (float) r0
            if (r3 <= 0) goto L_0x00bb
            float r4 = r4 + r0
        L_0x0093:
            r7.A03 = r4
            r7.A04 = r5
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00a6
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x00a6:
            boolean r0 = r7.A0g
            if (r0 == 0) goto L_0x004b
            int r0 = r7.A06
            int r0 = r8.findPointerIndex(r0)
            float r0 = r8.getX(r0)
            boolean r0 = r7.A0K(r0)
            r2 = r2 | r0
            goto L_0x0158
        L_0x00bb:
            float r4 = r4 - r0
            goto L_0x0093
        L_0x00bd:
            boolean r0 = r7.A0g
            if (r0 == 0) goto L_0x004b
            android.view.VelocityTracker r3 = r7.A0S
            r2 = 1000(0x3e8, float:1.401E-42)
            int r0 = r7.A0H
            float r0 = (float) r0
            r3.computeCurrentVelocity(r2, r0)
            int r0 = r7.A06
            float r0 = r3.getXVelocity(r0)
            int r3 = (int) r0
            r7.A0j = r1
            int r4 = r7.getClientWidth()
            int r5 = r7.getScrollX()
            X.085 r6 = r7.A02()
            int r0 = r7.A0K
            float r2 = (float) r0
            float r0 = (float) r4
            float r2 = r2 / r0
            int r4 = r6.A02
            float r5 = (float) r5
            float r5 = r5 / r0
            float r0 = r6.A00
            float r5 = r5 - r0
            float r0 = r6.A01
            float r0 = r0 + r2
            float r5 = r5 / r0
            int r0 = r7.A06
            int r0 = r8.findPointerIndex(r0)
            float r2 = r8.getX(r0)
            float r0 = r7.A01
            float r2 = r2 - r0
            int r0 = (int) r2
            int r2 = java.lang.Math.abs(r0)
            int r0 = r7.A0F
            if (r2 <= r0) goto L_0x013d
            int r2 = java.lang.Math.abs(r3)
            int r0 = r7.A0I
            if (r2 <= r0) goto L_0x013d
            if (r3 > 0) goto L_0x0112
            int r4 = r4 + 1
        L_0x0112:
            java.util.ArrayList r5 = r7.A0o
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0139
            r0 = 0
            java.lang.Object r2 = r5.get(r0)
            X.085 r2 = (X.AnonymousClass085) r2
            int r0 = r5.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r5.get(r0)
            X.085 r0 = (X.AnonymousClass085) r0
            int r2 = r2.A02
            int r0 = r0.A02
            int r0 = java.lang.Math.min(r4, r0)
            int r4 = java.lang.Math.max(r2, r0)
        L_0x0139:
            r7.A0D(r4, r3, r1, r1)
            goto L_0x0154
        L_0x013d:
            int r2 = r7.A0A
            r0 = 1058642330(0x3f19999a, float:0.6)
            if (r4 < r2) goto L_0x0147
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0147:
            float r5 = r5 + r0
            int r0 = (int) r5
            int r4 = r4 + r0
            goto L_0x0112
        L_0x014b:
            boolean r0 = r7.A0g
            if (r0 == 0) goto L_0x004b
            int r0 = r7.A0A
            r7.A0E(r0, r2, r1, r2)
        L_0x0154:
            boolean r2 = r7.A0J()
        L_0x0158:
            if (r2 == 0) goto L_0x004b
            r7.postInvalidateOnAnimation()
            return r1
        L_0x015e:
            android.widget.Scroller r0 = r7.mScroller
            r0.abortAnimation()
            r7.A0j = r2
            int r0 = r7.A0A
            r7.A09(r0)
            float r0 = r8.getX()
            r7.A01 = r0
            r7.A03 = r0
            float r0 = r8.getY()
            r7.A02 = r0
            r7.A04 = r0
            goto L_0x0185
        L_0x017b:
            int r2 = r8.getActionIndex()
            float r0 = r8.getX(r2)
            r7.A03 = r0
        L_0x0185:
            int r0 = r8.getPointerId(r2)
            r7.A06 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.A0f) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AnonymousClass012 r8) {
        ArrayList arrayList;
        AnonymousClass012 r0 = this.A0V;
        if (r0 != null) {
            synchronized (r0) {
                r0.A00 = null;
            }
            this.A0V.A0B(this);
            int i2 = 0;
            while (true) {
                arrayList = this.A0o;
                if (i2 >= arrayList.size()) {
                    break;
                }
                AnonymousClass085 r02 = (AnonymousClass085) arrayList.get(i2);
                this.A0V.A0D(this, r02.A03, r02.A02);
                i2++;
            }
            this.A0V.A0A(this);
            arrayList.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((C02400Bm) getChildAt(i3).getLayoutParams()).A04) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.A0A = 0;
            scrollTo(0, 0);
        }
        AnonymousClass012 r3 = this.A0V;
        this.A0V = r8;
        this.A0E = 0;
        if (r8 != null) {
            AnonymousClass09Q r1 = this.A0Y;
            if (r1 == null) {
                r1 = new AnonymousClass09Q(this);
                this.A0Y = r1;
            }
            AnonymousClass012 r03 = this.A0V;
            synchronized (r03) {
                r03.A00 = r1;
            }
            this.A0j = false;
            boolean z2 = this.A0e;
            this.A0e = true;
            this.A0E = this.A0V.A01();
            if (this.A0M >= 0) {
                this.A0V.A09(this.A0R, this.A0Z);
                A0D(this.A0M, 0, false, true);
                this.A0M = -1;
                this.A0R = null;
                this.A0Z = null;
            } else if (!z2) {
                A09(this.A0A);
            } else {
                requestLayout();
            }
        }
        List list = this.A0b;
        if (list != null && !list.isEmpty()) {
            int size = this.A0b.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((C12530kY) this.A0b.get(i4)).AM6(r3, r8, this);
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.A0j = false;
        A0D(i2, 0, !this.A0e, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            StringBuilder sb = new StringBuilder("Requested offscreen page limit ");
            sb.append(i2);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            i2 = 1;
        }
        if (i2 != this.A0J) {
            this.A0J = i2;
            A09(this.A0A);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C015507l r1) {
        this.A0W = r1;
    }

    public void setPageMargin(int i2) {
        int i3 = this.A0K;
        this.A0K = i2;
        int width = getWidth();
        A0C(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(AnonymousClass00T.A04(getContext(), i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z2;
        this.A0Q = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z2 = false;
        } else {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.A0N != i2) {
            this.A0N = i2;
            if (this.A0X != null) {
                boolean z2 = false;
                if (i2 != 0) {
                    z2 = true;
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    getChildAt(i3).setLayerType(z2 ? this.A0L : 0, (Paint) null);
                }
            }
            C015507l r0 = this.A0W;
            if (r0 != null) {
                r0.AUN(i2);
            }
            List list = this.A0c;
            if (list != null) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C015507l r02 = (C015507l) this.A0c.get(i4);
                    if (r02 != null) {
                        r02.AUN(i2);
                    }
                }
            }
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0Q;
    }
}
