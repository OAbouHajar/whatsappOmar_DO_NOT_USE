package com.google.android.material.tabs;

import X.AnonymousClass012;
import X.AnonymousClass08E;
import X.AnonymousClass0EH;
import X.AnonymousClass2Fa;
import X.AnonymousClass3Kw;
import X.C004601z;
import X.C13010lK;
import X.C47812Kr;
import X.C47822Ks;
import X.C53572fv;
import X.C56892oy;
import X.C95434md;
import X.C95454mf;
import X.C98964tG;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTabLayout;
import com.obwhatsapp.WaViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    public static final C13010lK A0d = new AnonymousClass0EH(16);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public ValueAnimator A0D;
    public ColorStateList A0E;
    public ColorStateList A0F;
    public ColorStateList A0G;
    public DataSetObserver A0H;
    public Drawable A0I;
    public AnonymousClass012 A0J;
    public ViewPager A0K;
    public C95434md A0L;
    public AnonymousClass2Fa A0M;
    public AnonymousClass2Fa A0N;
    public C47812Kr A0O;
    public C95454mf A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final RectF A0Y;
    public final C13010lK A0Z;
    public final C56892oy A0a;
    public final ArrayList A0b;
    public final ArrayList A0c;

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr04f4);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r16, android.util.AttributeSet r17, int r18) {
        /*
            r15 = this;
            r9 = r16
            r10 = r17
            r13 = r18
            r15.<init>(r9, r10, r13)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A0c = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r15.A0Y = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r15.A07 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A0b = r0
            r1 = 12
            X.0b2 r0 = new X.0b2
            r0.<init>(r1)
            r15.A0Z = r0
            r1 = 0
            r15.setHorizontalScrollBarEnabled(r1)
            X.2oy r5 = new X.2oy
            r5.<init>(r9, r15)
            r15.A0a = r5
            r2 = -2
            r4 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r4)
            super.addView(r5, r1, r0)
            int[] r11 = X.C53362fa.A0E
            r14 = 2131952664(0x7f130418, float:1.9541777E38)
            r3 = 1
            int[] r12 = new int[r3]
            r6 = 22
            r12[r1] = r6
            android.content.res.TypedArray r2 = X.C53382fc.A00(r9, r10, r11, r12, r13, r14)
            r0 = 10
            int r0 = r2.getDimensionPixelSize(r0, r4)
            r5.setSelectedIndicatorHeight(r0)
            r0 = 7
            int r0 = r2.getColor(r0, r1)
            r5.setSelectedIndicatorColor(r0)
            r0 = 5
            android.graphics.drawable.Drawable r0 = X.C53402fe.A01(r9, r2, r0)
            r15.setSelectedTabIndicator((android.graphics.drawable.Drawable) r0)
            r0 = 9
            int r0 = r2.getInt(r0, r1)
            r15.setSelectedTabIndicatorGravity(r0)
            r0 = 8
            boolean r0 = r2.getBoolean(r0, r3)
            r15.setTabIndicatorFullWidth(r0)
            r0 = 15
            int r5 = r2.getDimensionPixelSize(r0, r1)
            r15.A08 = r5
            r15.A09 = r5
            r15.A0B = r5
            r15.A0A = r5
            r0 = 18
            int r0 = r2.getDimensionPixelSize(r0, r5)
            r15.A0A = r0
            r5 = 19
            int r0 = r15.A0B
            int r0 = r2.getDimensionPixelSize(r5, r0)
            r15.A0B = r0
            r5 = 17
            int r0 = r15.A09
            int r0 = r2.getDimensionPixelSize(r5, r0)
            r15.A09 = r0
            r5 = 16
            int r0 = r15.A08
            int r0 = r2.getDimensionPixelSize(r5, r0)
            r15.A08 = r0
            r0 = 2131952325(0x7f1302c5, float:1.954109E38)
            int r5 = r2.getResourceId(r6, r0)
            r15.A0C = r5
            int[] r0 = X.AnonymousClass05L.A0M
            android.content.res.TypedArray r5 = r9.obtainStyledAttributes(r5, r0)
            int r0 = r5.getDimensionPixelSize(r1, r1)     // Catch:{ all -> 0x017d }
            float r0 = (float) r0     // Catch:{ all -> 0x017d }
            r15.A01 = r0     // Catch:{ all -> 0x017d }
            r0 = 3
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r9, r5, r0)     // Catch:{ all -> 0x017d }
            r15.A0G = r0     // Catch:{ all -> 0x017d }
            r5.recycle()
            r5 = 23
            boolean r0 = r2.hasValue(r5)
            if (r0 == 0) goto L_0x00de
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r9, r2, r5)
            r15.A0G = r0
        L_0x00de:
            r5 = 21
            boolean r0 = r2.hasValue(r5)
            if (r0 == 0) goto L_0x0108
            int r8 = r2.getColor(r5, r1)
            android.content.res.ColorStateList r0 = r15.A0G
            int r7 = r0.getDefaultColor()
            r0 = 2
            int[][] r6 = new int[r0][]
            int[] r5 = new int[r0]
            int[] r0 = android.widget.HorizontalScrollView.SELECTED_STATE_SET
            r6[r1] = r0
            r5[r1] = r8
            int[] r0 = android.widget.HorizontalScrollView.EMPTY_STATE_SET
            r6[r3] = r0
            r5[r3] = r7
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r6, r5)
            r15.A0G = r0
        L_0x0108:
            r0 = 3
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r9, r2, r0)
            r15.A0E = r0
            r0 = 4
            r2.getInt(r0, r4)
            r0 = 20
            android.content.res.ColorStateList r0 = X.C53402fe.A00(r9, r2, r0)
            r15.A0F = r0
            r5 = 6
            r0 = 300(0x12c, float:4.2E-43)
            int r0 = r2.getInt(r5, r0)
            r15.A05 = r0
            r0 = 13
            int r0 = r2.getDimensionPixelSize(r0, r4)
            r15.A0V = r0
            r0 = 12
            int r0 = r2.getDimensionPixelSize(r0, r4)
            r15.A0U = r0
            int r0 = r2.getResourceId(r1, r1)
            r15.A0X = r0
            int r0 = r2.getDimensionPixelSize(r3, r1)
            r15.A02 = r0
            r0 = 14
            int r0 = r2.getInt(r0, r3)
            r15.A03 = r0
            r0 = 2
            int r0 = r2.getInt(r0, r1)
            r15.A04 = r0
            r0 = 11
            boolean r0 = r2.getBoolean(r0, r1)
            r15.A0Q = r0
            r0 = 24
            boolean r0 = r2.getBoolean(r0, r1)
            r15.A0T = r0
            r2.recycle()
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165925(0x7f0702e5, float:1.794608E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r15.A00 = r0
            r0 = 2131165923(0x7f0702e3, float:1.7946077E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A0W = r0
            r15.A07()
            return
        L_0x017d:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A00(int i2) {
        if (i2 != -1) {
            if (getWindowToken() != null && C004601z.A0u(this)) {
                C56892oy r5 = this.A0a;
                int childCount = r5.getChildCount();
                int i3 = 0;
                while (i3 < childCount) {
                    if (r5.getChildAt(i3).getWidth() > 0) {
                        i3++;
                    }
                }
                int scrollX = getScrollX();
                int A022 = A02(i2, 0.0f);
                if (scrollX != A022) {
                    A08();
                    this.A0D.setIntValues(new int[]{scrollX, A022});
                    this.A0D.start();
                }
                r5.A01(i2, this.A05);
                return;
            }
            A09(0.0f, i2, true, true);
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.A0c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2);
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i2 = this.A0V;
        if (i2 != -1) {
            return i2;
        }
        if (this.A03 == 0) {
            return this.A0W;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.A0a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i2) {
        C56892oy r5 = this.A0a;
        int childCount = r5.getChildCount();
        if (i2 < childCount) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = r5.getChildAt(i3);
                boolean z2 = true;
                boolean z3 = false;
                if (i3 == i2) {
                    z3 = true;
                }
                childAt.setSelected(z3);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    public int A01(int i2) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
    }

    public final int A02(int i2, float f2) {
        int i3 = 0;
        if (this.A03 != 0) {
            return 0;
        }
        C56892oy r3 = this.A0a;
        View childAt = r3.getChildAt(i2);
        int i4 = i2 + 1;
        View childAt2 = i4 < r3.getChildCount() ? r3.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width >> 1)) - (getWidth() >> 1);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f2);
        return C004601z.A06(this) == 0 ? left + i5 : left - i5;
    }

    public C47812Kr A03() {
        C47822Ks r1;
        C47812Kr r2 = (C47812Kr) A0d.A4T();
        if (r2 == null) {
            r2 = new C47812Kr();
        }
        r2.A03 = this;
        C13010lK r0 = this.A0Z;
        if (r0 == null || (r1 = (C47822Ks) r0.A4T()) == null) {
            r1 = new C47822Ks(getContext(), this);
        }
        r1.setTab(r2);
        r1.setFocusable(true);
        r1.setMinimumWidth(getTabMinWidth());
        r1.setContentDescription(TextUtils.isEmpty(r2.A04) ? r2.A05 : r2.A04);
        r2.A02 = r1;
        return r2;
    }

    public C47812Kr A04(int i2) {
        if (i2 < 0) {
            return null;
        }
        ArrayList arrayList = this.A0c;
        if (i2 < arrayList.size()) {
            return (C47812Kr) arrayList.get(i2);
        }
        return null;
    }

    public void A05() {
        int currentItem;
        A06();
        AnonymousClass012 r0 = this.A0J;
        if (r0 != null) {
            int A012 = r0.A01();
            for (int i2 = 0; i2 < A012; i2++) {
                C47812Kr A032 = A03();
                A032.A03(this.A0J.A04(i2));
                A0F(A032, this.A0c.size(), false);
            }
            ViewPager viewPager = this.A0K;
            if (viewPager != null && A012 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < this.A0c.size()) {
                A0G(A04(currentItem), true);
            }
        }
    }

    public void A06() {
        C56892oy r3 = this.A0a;
        int childCount = r3.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C47822Ks r1 = (C47822Ks) r3.getChildAt(childCount);
            r3.removeViewAt(childCount);
            if (r1 != null) {
                r1.setTab((C47812Kr) null);
                r1.setSelected(false);
                this.A0Z.Abi(r1);
            }
            requestLayout();
        }
        Iterator it = this.A0c.iterator();
        while (it.hasNext()) {
            C47812Kr r2 = (C47812Kr) it.next();
            it.remove();
            r2.A03 = null;
            r2.A02 = null;
            r2.A06 = null;
            r2.A05 = null;
            r2.A04 = null;
            r2.A00 = -1;
            r2.A01 = null;
            A0d.Abi(r2);
        }
        this.A0O = null;
    }

    public final void A07() {
        int max = this.A03 == 0 ? Math.max(0, this.A02 - this.A0A) : 0;
        C56892oy r2 = this.A0a;
        C004601z.A0h(r2, max, 0, 0, 0);
        int i2 = this.A03;
        if (i2 == 0) {
            r2.setGravity(GravityCompat.START);
        } else if (i2 == 1) {
            r2.setGravity(1);
        }
        A0H(true);
    }

    public final void A08() {
        if (this.A0D == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0D = valueAnimator;
            valueAnimator.setInterpolator(C53572fv.A02);
            this.A0D.setDuration((long) this.A05);
            this.A0D.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 0));
        }
    }

    public void A09(float f2, int i2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0) {
            C56892oy r1 = this.A0a;
            if (round < r1.getChildCount()) {
                if (z3) {
                    ValueAnimator valueAnimator = r1.A06;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        r1.A06.cancel();
                    }
                    r1.A05 = i2;
                    r1.A00 = f2;
                    r1.A00();
                }
                ValueAnimator valueAnimator2 = this.A0D;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.A0D.cancel();
                }
                scrollTo(A02(i2, f2), 0);
                if (z2) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public void A0A(int i2, int i3) {
        setTabTextColors(new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2}));
    }

    public void A0B(AnonymousClass012 r3, boolean z2) {
        DataSetObserver dataSetObserver;
        AnonymousClass012 r1 = this.A0J;
        if (!(r1 == null || (dataSetObserver = this.A0H) == null)) {
            r1.A08(dataSetObserver);
        }
        this.A0J = r3;
        if (z2 && r3 != null) {
            DataSetObserver dataSetObserver2 = this.A0H;
            if (dataSetObserver2 == null) {
                dataSetObserver2 = new AnonymousClass3Kw(this);
                this.A0H = dataSetObserver2;
            }
            r3.A07(dataSetObserver2);
        }
        A05();
    }

    public final void A0C(ViewPager viewPager, boolean z2) {
        List list;
        List list2;
        ViewPager viewPager2 = this.A0K;
        if (viewPager2 != null) {
            C95454mf r1 = this.A0P;
            if (!(r1 == null || (list2 = viewPager2.A0c) == null)) {
                list2.remove(r1);
            }
            C95434md r12 = this.A0L;
            if (!(r12 == null || (list = this.A0K.A0b) == null)) {
                list.remove(r12);
            }
        }
        AnonymousClass2Fa r2 = this.A0M;
        if (r2 != null) {
            this.A0b.remove(r2);
            this.A0M = null;
        }
        if (viewPager != null) {
            this.A0K = viewPager;
            C95454mf r13 = this.A0P;
            if (r13 == null) {
                r13 = new C95454mf(this);
                this.A0P = r13;
            }
            r13.A01 = 0;
            r13.A00 = 0;
            viewPager.A0G(r13);
            C98964tG r0 = new C98964tG(viewPager);
            this.A0M = r0;
            A0D(r0);
            AnonymousClass012 adapter = viewPager.getAdapter();
            if (adapter != null) {
                A0B(adapter, true);
            }
            C95434md r14 = this.A0L;
            if (r14 == null) {
                r14 = new C95434md(this);
                this.A0L = r14;
            }
            r14.A00 = true;
            List list3 = viewPager.A0b;
            if (list3 == null) {
                list3 = new ArrayList();
                viewPager.A0b = list3;
            }
            list3.add(r14);
            A09(0.0f, viewPager.getCurrentItem(), true, true);
        } else {
            this.A0K = null;
            A0B((AnonymousClass012) null, false);
        }
        this.A0R = z2;
    }

    public void A0D(AnonymousClass2Fa r3) {
        ArrayList arrayList = this.A0b;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
        }
    }

    public void A0E(C47812Kr r3) {
        ArrayList arrayList = this.A0c;
        A0F(r3, arrayList.size(), arrayList.isEmpty());
    }

    public void A0F(C47812Kr r8, int i2, boolean z2) {
        float f2;
        if (r8.A03 == this) {
            r8.A00 = i2;
            ArrayList arrayList = this.A0c;
            arrayList.add(i2, r8);
            int size = arrayList.size();
            while (true) {
                i2++;
                if (i2 >= size) {
                    break;
                }
                ((C47812Kr) arrayList.get(i2)).A00 = i2;
            }
            C47822Ks r6 = r8.A02;
            C56892oy r5 = this.A0a;
            int i3 = r8.A00;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.A03 == 1 && this.A04 == 0) {
                layoutParams.width = 0;
                f2 = 1.0f;
            } else {
                layoutParams.width = -2;
                f2 = 0.0f;
            }
            layoutParams.weight = f2;
            r5.addView(r6, i3, layoutParams);
            if (z2) {
                r8.A01();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void A0G(C47812Kr r6, boolean z2) {
        C47812Kr r4 = this.A0O;
        if (r4 != r6) {
            int i2 = r6 != null ? r6.A00 : -1;
            if (z2) {
                if ((r4 == null || r4.A00 == -1) && i2 != -1) {
                    A09(0.0f, i2, true, true);
                } else {
                    A00(i2);
                }
                if (i2 != -1) {
                    setSelectedTabView(i2);
                }
            }
            this.A0O = r6;
            if (r4 != null) {
                ArrayList arrayList = this.A0b;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    arrayList.get(size);
                }
            }
            if (r6 != null) {
                ArrayList arrayList2 = this.A0b;
                int size2 = arrayList2.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        ((AnonymousClass2Fa) arrayList2.get(size2)).AYj(r6);
                    } else {
                        return;
                    }
                }
            }
        } else if (r4 != null) {
            ArrayList arrayList3 = this.A0b;
            int size3 = arrayList3.size();
            while (true) {
                size3--;
                if (size3 >= 0) {
                    ((AnonymousClass2Fa) arrayList3.get(size3)).AYi(r6);
                } else {
                    A00(r6.A00);
                    return;
                }
            }
        }
    }

    public void A0H(boolean z2) {
        float f2;
        int i2 = 0;
        while (true) {
            C56892oy r1 = this.A0a;
            if (i2 < r1.getChildCount()) {
                View childAt = r1.getChildAt(i2);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.A03 == 1 && this.A04 == 0) {
                    layoutParams.width = 0;
                    f2 = 1.0f;
                } else {
                    layoutParams.width = -2;
                    f2 = 0.0f;
                }
                layoutParams.weight = f2;
                if (z2) {
                    childAt.requestLayout();
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void addView(View view, int i2) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C47812Kr r0 = this.A0O;
        if (r0 != null) {
            return r0.A00;
        }
        return -1;
    }

    public int getTabCount() {
        return this.A0c.size();
    }

    public int getTabGravity() {
        return this.A04;
    }

    public ColorStateList getTabIconTint() {
        return this.A0E;
    }

    public int getTabIndicatorGravity() {
        return this.A06;
    }

    public int getTabMaxWidth() {
        return this.A07;
    }

    public int getTabMode() {
        return this.A03;
    }

    public ColorStateList getTabRippleColor() {
        return this.A0F;
    }

    public Drawable getTabSelectedIndicator() {
        return this.A0I;
    }

    public ColorStateList getTabTextColors() {
        return this.A0G;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0K == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                A0C((ViewPager) parent, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A0R) {
            setupWithViewPager((ViewPager) null);
            this.A0R = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r5 = (X.C47822Ks) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r6 = 0
        L_0x0001:
            X.2oy r1 = r7.A0a
            int r0 = r1.getChildCount()
            if (r6 >= r0) goto L_0x0032
            android.view.View r5 = r1.getChildAt(r6)
            boolean r0 = r5 instanceof X.C47822Ks
            if (r0 == 0) goto L_0x002f
            X.2Ks r5 = (X.C47822Ks) r5
            android.graphics.drawable.Drawable r4 = r5.A01
            if (r4 == 0) goto L_0x002f
            int r3 = r5.getLeft()
            int r2 = r5.getTop()
            int r1 = r5.getRight()
            int r0 = r5.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            android.graphics.drawable.Drawable r0 = r5.A01
            r0.draw(r8)
        L_0x002f:
            int r6 = r6 + 1
            goto L_0x0001
        L_0x0032:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public void onMeasure(int i2, int i3) {
        int A012 = A01(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(A012, View.MeasureSpec.getSize(i3)), 1073741824);
        } else if (mode == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(A012, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.A0U;
            if (i4 <= 0) {
                i4 = size - A01(56);
            }
            this.A07 = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.A03;
            if (i5 != 0) {
                if (i5 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    public void setInlineLabel(boolean z2) {
        ImageView imageView;
        if (this.A0Q != z2) {
            this.A0Q = z2;
            int i2 = 0;
            while (true) {
                C56892oy r1 = this.A0a;
                if (i2 < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i2);
                    if (childAt instanceof C47822Ks) {
                        C47822Ks r2 = (C47822Ks) childAt;
                        r2.setOrientation(r2.A08.A0Q ^ true ? 1 : 0);
                        TextView textView = r2.A05;
                        if (textView == null && r2.A03 == null) {
                            textView = r2.A06;
                            imageView = r2.A04;
                        } else {
                            imageView = r2.A03;
                        }
                        r2.A02(imageView, textView);
                    }
                    i2++;
                } else {
                    A07();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(AnonymousClass2Fa r3) {
        AnonymousClass2Fa r1 = this.A0N;
        if (r1 != null) {
            this.A0b.remove(r1);
        }
        this.A0N = r3;
        if (r3 != null) {
            A0D(r3);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A08();
        this.A0D.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i2) {
        setSelectedTabIndicator(i2 != 0 ? AnonymousClass08E.A01(getContext(), i2) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.A0I != drawable) {
            this.A0I = drawable;
            this.A0a.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.A0a.setSelectedIndicatorColor(i2);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.A06 != i2) {
            this.A06 = i2;
            this.A0a.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.A0a.setSelectedIndicatorHeight(i2);
    }

    public void setTabGravity(int i2) {
        if (this.A04 != i2) {
            this.A04 = i2;
            A07();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.A0E != colorStateList) {
            this.A0E = colorStateList;
            ArrayList arrayList = this.A0c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C47822Ks r0 = ((C47812Kr) arrayList.get(i2)).A02;
                if (r0 != null) {
                    r0.A00();
                }
            }
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(AnonymousClass08E.A00(getContext(), i2));
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.A0S = z2;
        this.A0a.postInvalidateOnAnimation();
    }

    public void setTabMode(int i2) {
        if (i2 != this.A03) {
            this.A03 = i2;
            A07();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A0F != colorStateList) {
            this.A0F = colorStateList;
            int i2 = 0;
            while (true) {
                C56892oy r1 = this.A0a;
                if (i2 < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i2);
                    if (childAt instanceof C47822Ks) {
                        ((C47822Ks) childAt).A01(getContext());
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(AnonymousClass08E.A00(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.A0G != colorStateList) {
            this.A0G = colorStateList;
            ArrayList arrayList = this.A0c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C47822Ks r0 = ((C47812Kr) arrayList.get(i2)).A02;
                if (r0 != null) {
                    r0.A00();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AnonymousClass012 r2) {
        A0B(r2, false);
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.A0T != z2) {
            this.A0T = z2;
            int i2 = 0;
            while (true) {
                C56892oy r1 = this.A0a;
                if (i2 < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i2);
                    if (childAt instanceof C47822Ks) {
                        ((C47822Ks) childAt).A01(getContext());
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        if (!(this instanceof WaTabLayout) || viewPager == null || (viewPager instanceof WaViewPager)) {
            A0C(viewPager, false);
            return;
        }
        throw new IllegalArgumentException("WaTabLayout should only be setup with WaViewPager");
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
