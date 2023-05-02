package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.obwhatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0ZV  reason: invalid class name */
public class AnonymousClass0ZV implements C13350lt, C11850jR {
    public int A00;
    public int A01;
    public int A02;
    public Context A03;
    public Context A04;
    public Drawable A05;
    public LayoutInflater A06;
    public LayoutInflater A07;
    public C016607w A08;
    public C12940lD A09;
    public C12250k5 A0A;
    public AnonymousClass0D0 A0B;
    public AnonymousClass0Ct A0C;
    public C09720fy A0D;
    public AnonymousClass0D3 A0E;
    public AnonymousClass0D1 A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final SparseBooleanArray A0K = new SparseBooleanArray();
    public final AnonymousClass0ZP A0L = new AnonymousClass0ZP(this);

    public AnonymousClass0ZV(Context context) {
        this.A04 = context;
        this.A07 = LayoutInflater.from(context);
    }

    public View A00(View view, ViewGroup viewGroup, C07290av r6) {
        View actionView = r6.getActionView();
        if (actionView == null || r6.A01()) {
            if (!(view instanceof C12950lE)) {
                view = this.A07.inflate(R.layout.layout0002, viewGroup, false);
            }
            C12950lE r4 = (C12950lE) view;
            r4.AII(r6, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) r4;
            actionMenuItemView.A05 = (ActionMenuView) this.A0A;
            AnonymousClass0Ct r0 = this.A0C;
            if (r0 == null) {
                r0 = new AnonymousClass0Ct(this);
                this.A0C = r0;
            }
            actionMenuItemView.A04 = r0;
            actionView = (View) r4;
        }
        int i2 = 0;
        if (r6.isActionViewExpanded()) {
            i2 = 8;
        }
        actionView.setVisibility(i2);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof AnonymousClass0DA)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public boolean A01() {
        C12250k5 r0;
        C09720fy r2 = this.A0D;
        if (r2 == null || (r0 = this.A0A) == null) {
            AnonymousClass0D1 r02 = this.A0F;
            if (r02 == null) {
                return false;
            }
            r02.A01();
            return true;
        }
        ((View) r0).removeCallbacks(r2);
        this.A0D = null;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r2 = this;
            X.0D1 r0 = r2.A0F
            if (r0 == 0) goto L_0x000f
            X.0ZU r0 = r0.A03
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0.AJh()
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZV.A02():boolean");
    }

    public boolean A03() {
        C016607w r1;
        if (!this.A0I || A02() || (r1 = this.A08) == null || this.A0A == null || this.A0D != null) {
            return false;
        }
        r1.A06();
        if (r1.A08.isEmpty()) {
            return false;
        }
        C09720fy r12 = new C09720fy(new AnonymousClass0D1(this.A03, this.A0E, this.A08, this), this);
        this.A0D = r12;
        ((View) this.A0A).post(r12);
        return true;
    }

    public boolean A6P(C016607w r2, C07290av r3) {
        return false;
    }

    public boolean A8s(C016607w r2, C07290av r3) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fb, code lost:
        if (r13 != false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A97() {
        /*
            r17 = this;
            r14 = r17
            X.07w r0 = r14.A08
            r2 = 0
            r13 = 0
            if (r0 == 0) goto L_0x004b
            java.util.ArrayList r12 = r0.A05()
            int r11 = r12.size()
        L_0x0010:
            int r10 = r14.A01
            int r9 = r14.A00
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)
            X.0k5 r7 = r14.A0A
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r4 = 0
            r15 = 0
            r6 = 0
            r3 = 0
        L_0x0020:
            if (r4 >= r11) goto L_0x004e
            java.lang.Object r5 = r12.get(r4)
            X.0av r5 = (X.C07290av) r5
            int r0 = r5.A06
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x003f
            int r6 = r6 + 1
        L_0x0031:
            boolean r0 = r14.A0G
            if (r0 == 0) goto L_0x003c
            boolean r0 = r5.isActionViewExpanded()
            if (r0 == 0) goto L_0x003c
            r10 = 0
        L_0x003c:
            int r4 = r4 + 1
            goto L_0x0020
        L_0x003f:
            int r0 = r5.A06
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0049
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0049:
            r15 = 1
            goto L_0x0031
        L_0x004b:
            r12 = r2
            r11 = 0
            goto L_0x0010
        L_0x004e:
            boolean r0 = r14.A0I
            if (r0 == 0) goto L_0x0059
            if (r15 != 0) goto L_0x0057
            int r3 = r3 + r6
            if (r3 <= r10) goto L_0x0059
        L_0x0057:
            int r10 = r10 + -1
        L_0x0059:
            int r10 = r10 - r6
            android.util.SparseBooleanArray r6 = r14.A0K
            r6.clear()
            r5 = 0
            r16 = 0
        L_0x0062:
            if (r5 >= r11) goto L_0x00fe
            java.lang.Object r4 = r12.get(r5)
            X.0av r4 = (X.C07290av) r4
            int r0 = r4.A06
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0096
            android.view.View r0 = r14.A00(r2, r7, r4)
            r0.measure(r8, r8)
            int r0 = r0.getMeasuredWidth()
            int r9 = r9 - r0
            if (r16 != 0) goto L_0x0081
            r16 = r0
        L_0x0081:
            int r1 = r4.getGroupId()
            r0 = 1
            if (r1 == 0) goto L_0x008b
            r6.put(r1, r0)
        L_0x008b:
            int r0 = r4.A02
        L_0x008d:
            r0 = r0 | 32
        L_0x008f:
            r4.A02 = r0
            int r5 = r5 + 1
            r2 = 0
            r13 = 0
            goto L_0x0062
        L_0x0096:
            int r0 = r4.A06
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x00cd
            int r3 = r4.getGroupId()
            boolean r2 = r6.get(r3)
            if (r10 > 0) goto L_0x00a9
            if (r2 == 0) goto L_0x00cd
        L_0x00a9:
            if (r9 <= 0) goto L_0x00d4
            r0 = 0
            android.view.View r0 = r14.A00(r0, r7, r4)
            r0.measure(r8, r8)
            int r0 = r0.getMeasuredWidth()
            int r9 = r9 - r0
            if (r16 != 0) goto L_0x00bc
            r16 = r0
        L_0x00bc:
            int r0 = r9 + r16
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r13 = r0 & 1
            if (r13 == 0) goto L_0x00d4
            if (r3 == 0) goto L_0x00d4
            r6.put(r3, r1)
        L_0x00cb:
            int r10 = r10 + -1
        L_0x00cd:
            int r0 = r4.A02
            if (r13 != 0) goto L_0x008d
            r0 = r0 & -33
            goto L_0x008f
        L_0x00d4:
            if (r2 == 0) goto L_0x00fb
            r2 = 0
            r6.put(r3, r2)
        L_0x00da:
            if (r2 >= r5) goto L_0x00fb
            java.lang.Object r1 = r12.get(r2)
            X.0av r1 = (X.C07290av) r1
            int r0 = r1.getGroupId()
            if (r0 != r3) goto L_0x00f8
            int r0 = r1.A02
            r15 = 32
            r0 = r0 & 32
            if (r0 != r15) goto L_0x00f2
            int r10 = r10 + 1
        L_0x00f2:
            int r0 = r1.A02
            r0 = r0 & -33
            r1.A02 = r0
        L_0x00f8:
            int r2 = r2 + 1
            goto L_0x00da
        L_0x00fb:
            if (r13 == 0) goto L_0x00cd
            goto L_0x00cb
        L_0x00fe:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZV.A97():boolean");
    }

    public void AIA(Context context, C016607w r8) {
        this.A03 = context;
        this.A06 = LayoutInflater.from(context);
        this.A08 = r8;
        Resources resources = context.getResources();
        AnonymousClass0Q7 r1 = new AnonymousClass0Q7(context);
        if (!this.A0J) {
            this.A0I = r1.A01();
        }
        this.A02 = AnonymousClass000.A0M(r1.A00).widthPixels >> 1;
        this.A01 = r1.A00();
        int i2 = this.A02;
        if (this.A0I) {
            if (this.A0E == null) {
                AnonymousClass0D3 r2 = new AnonymousClass0D3(this.A04, this);
                this.A0E = r2;
                if (this.A0H) {
                    r2.setImageDrawable(this.A05);
                    this.A05 = null;
                    this.A0H = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A0E.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.A0E.getMeasuredWidth();
        } else {
            this.A0E = null;
        }
        this.A00 = i2;
        resources.getDisplayMetrics();
    }

    public void AOk(C016607w r2, boolean z2) {
        A01();
        AnonymousClass0D0 r0 = this.A0B;
        if (r0 != null) {
            r0.A01();
        }
        C12940lD r02 = this.A09;
        if (r02 != null) {
            r02.AOk(r2, z2);
        }
    }

    public boolean AY0(AnonymousClass0Cw r8) {
        boolean z2 = false;
        if (r8.hasVisibleItems()) {
            AnonymousClass0Cw r0 = r8;
            while (r0.A00 != this.A08) {
                r0 = (AnonymousClass0Cw) r0.A00;
            }
            MenuItem item = r0.getItem();
            ViewGroup viewGroup = (ViewGroup) this.A0A;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if (!(childAt instanceof C12950lE) || ((C12950lE) childAt).getItemData() != item) {
                        i2++;
                    } else if (childAt != null) {
                        r8.getItem().getItemId();
                        int size = r8.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                break;
                            }
                            MenuItem item2 = r8.getItem(i3);
                            if (item2.isVisible() && item2.getIcon() != null) {
                                z2 = true;
                                break;
                            }
                            i3++;
                        }
                        AnonymousClass0D0 r1 = new AnonymousClass0D0(this.A03, childAt, r8, this);
                        this.A0B = r1;
                        r1.A05 = z2;
                        AnonymousClass0ZU r02 = r1.A03;
                        if (r02 != null) {
                            r02.A07(z2);
                        }
                        if (r1.A03()) {
                            C12940lD r03 = this.A09;
                            if (r03 != null) {
                                r03.AUB(r8);
                            }
                            return true;
                        }
                        throw AnonymousClass000.A0V("MenuPopupHelper cannot be used without an anchor");
                    }
                }
            }
        }
        return false;
    }

    public void Ade(C12940lD r1) {
        this.A09 = r1;
    }

    public void AhS(boolean z2) {
        ArrayList arrayList;
        C12250k5 r1;
        int size;
        ViewGroup viewGroup = (ViewGroup) this.A0A;
        if (viewGroup != null) {
            C016607w r0 = this.A08;
            int i2 = 0;
            if (r0 != null) {
                r0.A06();
                ArrayList A052 = this.A08.A05();
                int size2 = A052.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    C07290av r9 = (C07290av) A052.get(i4);
                    if ((r9.A02 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i3);
                        C07290av itemData = childAt instanceof C12950lE ? ((C12950lE) childAt).getItemData() : null;
                        View A002 = A00(childAt, viewGroup, r9);
                        if (r9 != itemData) {
                            A002.setPressed(false);
                            A002.jumpDrawablesToCurrentState();
                        }
                        if (A002 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) A002.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(A002);
                            }
                            ((ViewGroup) this.A0A).addView(A002, i3);
                        }
                        i3++;
                    }
                }
                i2 = i3;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.A0E) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.A0A).requestLayout();
        C016607w r02 = this.A08;
        if (r02 != null) {
            r02.A06();
            ArrayList arrayList2 = r02.A06;
            int size3 = arrayList2.size();
            for (int i5 = 0; i5 < size3; i5++) {
                C04760Nv r03 = ((C07290av) arrayList2.get(i5)).A0G;
                if (r03 != null) {
                    r03.A00 = this;
                }
            }
        }
        C016607w r04 = this.A08;
        if (r04 != null) {
            r04.A06();
            arrayList = r04.A08;
        } else {
            arrayList = null;
        }
        if (!this.A0I || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((C07290av) arrayList.get(0)).isActionViewExpanded()))) {
            AnonymousClass0D3 r05 = this.A0E;
            if (r05 != null && r05.getParent() == (r1 = this.A0A)) {
                ((ViewGroup) r1).removeView(this.A0E);
            }
        } else {
            AnonymousClass0D3 r12 = this.A0E;
            if (r12 == null) {
                r12 = new AnonymousClass0D3(this.A04, this);
                this.A0E = r12;
            }
            ViewGroup viewGroup3 = (ViewGroup) r12.getParent();
            if (viewGroup3 != this.A0A) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.A0E);
                }
                AnonymousClass0D3 r2 = this.A0E;
                AnonymousClass0DA r13 = new AnonymousClass0DA();
                r13.gravity = 16;
                r13.A04 = true;
                ((ViewGroup) this.A0A).addView(r2, r13);
            }
        }
        ((ActionMenuView) this.A0A).A0B = this.A0I;
    }
}
