package X;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.redex.IDxLAdapterShape7S0200000_I1;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Ye  reason: invalid class name and case insensitive filesystem */
public class C06860Ye implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewGroup A00;
    public C015707n A01;

    public C06860Ye(ViewGroup viewGroup, C015707n r2) {
        this.A01 = r2;
        this.A00 = viewGroup;
    }

    public static void A00(AnonymousClass00O r3, AnonymousClass00O r4, C015707n r5, Object obj, Object obj2) {
        View view = (View) obj;
        if (view != null && r5.A0R(view)) {
            Object obj3 = r3.get(obj2);
            Object obj4 = r4.get(view);
            if (obj3 != null && obj4 != null) {
                r5.A0F.add(obj3);
                r5.A0D.add(obj4);
                r3.remove(obj2);
                r4.remove(view);
            }
        }
    }

    public boolean onPreDraw() {
        C04990Ou r8;
        C06230Uw r2;
        ViewGroup viewGroup = this.A00;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        if (C015807o.A02.remove(viewGroup)) {
            AnonymousClass00N A002 = C015807o.A00();
            AbstractCollection abstractCollection = (AbstractCollection) A002.get(viewGroup);
            ArrayList arrayList = null;
            if (abstractCollection == null) {
                abstractCollection = AnonymousClass000.A0u();
                A002.put(viewGroup, abstractCollection);
            } else if (abstractCollection.size() > 0) {
                arrayList = new ArrayList(abstractCollection);
            }
            C015707n r14 = this.A01;
            abstractCollection.add(r14);
            r14.A08(new IDxLAdapterShape7S0200000_I1(A002, 1, this));
            r14.A0M(viewGroup, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C015707n) it.next()).A0I(viewGroup);
                }
            }
            r14.A0F = AnonymousClass000.A0u();
            r14.A0D = AnonymousClass000.A0u();
            C04860Of r82 = r14.A09;
            C04860Of r7 = r14.A08;
            AnonymousClass00N r6 = new AnonymousClass00N((AnonymousClass00O) r82.A02);
            AnonymousClass00N r5 = new AnonymousClass00N((AnonymousClass00O) r7.A02);
            int i2 = 0;
            while (true) {
                int[] iArr = r14.A0K;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = iArr[i2];
                if (i3 == 1) {
                    int size = r6.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view = (View) r6.A02[size << 1];
                        if (view != null && r14.A0R(view) && (r2 = (C06230Uw) r5.remove(view)) != null && r14.A0R(r2.A00)) {
                            r14.A0F.add(r6.A06(size));
                            r14.A0D.add(r2);
                        }
                    }
                } else if (i3 == 2) {
                    AnonymousClass00N r11 = r82.A01;
                    AnonymousClass00N r10 = r7.A01;
                    int size2 = r11.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        View view2 = (View) r11.A02[(i4 << 1) + 1];
                        if (view2 != null && r14.A0R(view2)) {
                            A00(r6, r5, r14, r10.get(r11.A02[i4 << 1]), view2);
                        }
                    }
                } else if (i3 == 3) {
                    SparseArray sparseArray = r82.A00;
                    SparseArray sparseArray2 = r7.A00;
                    int size3 = sparseArray.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        View view3 = (View) sparseArray.valueAt(i5);
                        if (view3 != null && r14.A0R(view3)) {
                            A00(r6, r5, r14, sparseArray2.get(sparseArray.keyAt(i5)), view3);
                        }
                    }
                } else if (i3 == 4) {
                    AnonymousClass03G r12 = r82.A03;
                    AnonymousClass03G r112 = r7.A03;
                    int A003 = r12.A00();
                    for (int i6 = 0; i6 < A003; i6++) {
                        View view4 = (View) r12.A03(i6);
                        if (view4 != null && r14.A0R(view4)) {
                            A00(r6, r5, r14, r112.A04(r12.A01(i6), (Object) null), view4);
                        }
                    }
                }
                i2++;
            }
            for (int i7 = 0; i7 < r6.size(); i7++) {
                C06230Uw r1 = (C06230Uw) r6.A02[(i7 << 1) + 1];
                if (r14.A0R(r1.A00)) {
                    r14.A0F.add(r1);
                    r14.A0D.add((Object) null);
                }
            }
            for (int i8 = 0; i8 < r5.size(); i8++) {
                C06230Uw r13 = (C06230Uw) r5.A02[(i8 << 1) + 1];
                if (r14.A0R(r13.A00)) {
                    r14.A0D.add(r13);
                    r14.A0F.add((Object) null);
                }
            }
            AnonymousClass00N A012 = C015707n.A01();
            int size4 = A012.size();
            C12000jg A004 = C06430Vt.A00(viewGroup);
            for (int i9 = size4 - 1; i9 >= 0; i9--) {
                Animator animator = (Animator) A012.A02[i9 << 1];
                if (!(animator == null || (r8 = (C04990Ou) A012.get(animator)) == null || r8.A00 == null || !A004.equals(r8.A03))) {
                    C06230Uw r3 = r8.A02;
                    View view5 = r8.A00;
                    C06230Uw A0B = r14.A0B(view5, true);
                    C06230Uw A0A = r14.A0A(view5, true);
                    if (!(A0B == null && A0A == null && (A0A = (C06230Uw) r14.A08.A02.get(view5)) == null) && r8.A01.A0T(r3, A0A)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            A012.remove(animator);
                        }
                    }
                }
            }
            r14.A0L(viewGroup, r14.A09, r14.A08, r14.A0F, r14.A0D);
            r14.A0F();
        }
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.A00;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        C015807o.A02.remove(viewGroup);
        AbstractCollection abstractCollection = (AbstractCollection) C015807o.A00().get(viewGroup);
        if (abstractCollection != null && abstractCollection.size() > 0) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((C015707n) it.next()).A0I(viewGroup);
            }
        }
        C015707n r1 = this.A01;
        r1.A09.A02.clear();
        r1.A09.A00.clear();
        r1.A09.A03.A05();
    }
}
