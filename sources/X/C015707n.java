package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.facebook.redex.IDxLAdapterShape0S0100000_I0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.07n  reason: invalid class name and case insensitive filesystem */
public abstract class C015707n implements Cloneable {
    public static ThreadLocal A0L = new ThreadLocal();
    public static final AnonymousClass0MA A0M = new AnonymousClass0MA();
    public static final int[] A0N = {2, 1, 3, 4};
    public int A00 = 0;
    public long A01 = -1;
    public long A02 = -1;
    public TimeInterpolator A03 = null;
    public AnonymousClass0MA A04 = A0M;
    public AnonymousClass0PK A05;
    public AnonymousClass0MB A06;
    public AnonymousClass0GD A07 = null;
    public C04860Of A08 = new C04860Of();
    public C04860Of A09 = new C04860Of();
    public String A0A = getClass().getName();
    public ArrayList A0B = new ArrayList();
    public ArrayList A0C = new ArrayList();
    public ArrayList A0D;
    public ArrayList A0E = null;
    public ArrayList A0F;
    public ArrayList A0G = new ArrayList();
    public ArrayList A0H = new ArrayList();
    public boolean A0I = false;
    public boolean A0J = false;
    public int[] A0K = A0N;

    public static AnonymousClass00N A01() {
        ThreadLocal threadLocal = A0L;
        AnonymousClass00N r0 = (AnonymousClass00N) threadLocal.get();
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00N r02 = new AnonymousClass00N();
        threadLocal.set(r02);
        return r02;
    }

    public static void A02(View view, C06230Uw r7, C04860Of r8) {
        r8.A02.put(view, r7);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = r8.A00;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String A0L2 = C004601z.A0L(view);
        if (A0L2 != null) {
            AnonymousClass00N r1 = r8.A01;
            if (r1.containsKey(A0L2)) {
                r1.put(A0L2, (Object) null);
            } else {
                r1.put(A0L2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                AnonymousClass03G r4 = r8.A03;
                if (r4.A01) {
                    r4.A06();
                }
                if (AnonymousClass00R.A01(r4.A02, r4.A00, itemIdAtPosition) >= 0) {
                    View view2 = (View) r4.A04(itemIdAtPosition, (Object) null);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        r4.A09(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                r4.A09(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: A03 */
    public C015707n clone() {
        try {
            C015707n r1 = (C015707n) super.clone();
            r1.A0B = new ArrayList();
            r1.A09 = new C04860Of();
            r1.A08 = new C04860Of();
            r1.A0F = null;
            r1.A0D = null;
            return r1;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public C015707n A04(long j2) {
        this.A01 = j2;
        return this;
    }

    public C015707n A05(TimeInterpolator timeInterpolator) {
        this.A03 = timeInterpolator;
        return this;
    }

    public C015707n A06(View view) {
        this.A0H.add(view);
        return this;
    }

    public C015707n A07(View view) {
        this.A0H.remove(view);
        return this;
    }

    public C015707n A08(C019509b r2) {
        ArrayList arrayList = this.A0E;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0E = arrayList;
        }
        arrayList.add(r2);
        return this;
    }

    public C015707n A09(C019509b r2) {
        ArrayList arrayList = this.A0E;
        if (arrayList != null) {
            arrayList.remove(r2);
            if (this.A0E.size() == 0) {
                this.A0E = null;
            }
        }
        return this;
    }

    public C06230Uw A0A(View view, boolean z2) {
        AnonymousClass0GD r0 = this.A07;
        if (r0 != null) {
            return r0.A0A(view, z2);
        }
        ArrayList arrayList = z2 ? this.A0F : this.A0D;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C06230Uw r1 = (C06230Uw) arrayList.get(i2);
            if (r1 == null) {
                return null;
            }
            if (r1.A00 != view) {
                i2++;
            } else if (i2 < 0) {
                return null;
            } else {
                return (C06230Uw) (z2 ? this.A0D : this.A0F).get(i2);
            }
        }
        return null;
    }

    public C06230Uw A0B(View view, boolean z2) {
        AnonymousClass0GD r0 = this.A07;
        if (r0 != null) {
            return r0.A0B(view, z2);
        }
        return (C06230Uw) (z2 ? this.A09 : this.A08).A02.get(view);
    }

    public String A0C(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String obj = sb.toString();
        long j2 = this.A01;
        if (j2 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("dur(");
            sb2.append(j2);
            sb2.append(") ");
            obj = sb2.toString();
        }
        long j3 = this.A02;
        if (j3 != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("dly(");
            sb3.append(j3);
            sb3.append(") ");
            obj = sb3.toString();
        }
        TimeInterpolator timeInterpolator = this.A03;
        if (timeInterpolator != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj);
            sb4.append("interp(");
            sb4.append(timeInterpolator);
            sb4.append(") ");
            obj = sb4.toString();
        }
        ArrayList arrayList = this.A0G;
        if (arrayList.size() <= 0 && this.A0H.size() <= 0) {
            return obj;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj);
        sb5.append("tgts(");
        String obj2 = sb5.toString();
        if (arrayList.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj2);
                    sb6.append(", ");
                    obj2 = sb6.toString();
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(obj2);
                sb7.append(arrayList.get(i2));
                obj2 = sb7.toString();
            }
        }
        ArrayList arrayList2 = this.A0H;
        if (arrayList2.size() > 0) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (i3 > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(obj2);
                    sb8.append(", ");
                    obj2 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(obj2);
                sb9.append(arrayList2.get(i3));
                obj2 = sb9.toString();
            }
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(obj2);
        sb10.append(")");
        return sb10.toString();
    }

    public void A0D() {
        ArrayList arrayList = this.A0C;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.A0E;
        if (arrayList2 != null && arrayList2.size() > 0) {
            AbstractList abstractList = (AbstractList) arrayList2.clone();
            int size2 = abstractList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C019509b) abstractList.get(i2)).AZB(this);
            }
        }
    }

    public void A0E() {
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.A0E;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size = abstractList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((C019509b) abstractList.get(i3)).AZC(this);
                }
            }
            int i4 = 0;
            while (true) {
                AnonymousClass03G r1 = this.A09.A03;
                if (i4 >= r1.A00()) {
                    break;
                }
                View view = (View) r1.A03(i4);
                if (view != null) {
                    view.setHasTransientState(false);
                }
                i4++;
            }
            int i5 = 0;
            while (true) {
                AnonymousClass03G r12 = this.A08.A03;
                if (i5 < r12.A00()) {
                    View view2 = (View) r12.A03(i5);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                    }
                    i5++;
                } else {
                    this.A0I = true;
                    return;
                }
            }
        }
    }

    public void A0F() {
        A0G();
        AnonymousClass00N A012 = A01();
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (A012.containsKey(animator)) {
                A0G();
                if (animator != null) {
                    animator.addListener(new C020709p(A012, this));
                    long j2 = this.A01;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.A02;
                    if (j3 >= 0) {
                        animator.setStartDelay(j3 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.A03;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new IDxLAdapterShape0S0100000_I0(this, 0));
                    animator.start();
                }
            }
        }
        this.A0B.clear();
        A0E();
    }

    public void A0G() {
        if (this.A00 == 0) {
            ArrayList arrayList = this.A0E;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size = abstractList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C019509b) abstractList.get(i2)).AZF(this);
                }
            }
            this.A0I = false;
        }
        this.A00++;
    }

    public void A0H(View view) {
        if (!this.A0I) {
            ArrayList arrayList = this.A0C;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Animator animator = (Animator) arrayList.get(size);
                if (Build.VERSION.SDK_INT >= 19) {
                    animator.pause();
                } else {
                    ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                    if (listeners != null) {
                        int size2 = listeners.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            Animator.AnimatorListener animatorListener = listeners.get(i2);
                            if (animatorListener instanceof C13050lO) {
                                ((C13050lO) animatorListener).onAnimationPause(animator);
                            }
                        }
                    }
                }
            }
            ArrayList arrayList2 = this.A0E;
            if (arrayList2 != null && arrayList2.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList2.clone();
                int size3 = abstractList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((C019509b) abstractList.get(i3)).AZD(this);
                }
            }
            this.A0J = true;
        }
    }

    public void A0I(View view) {
        if (this.A0J) {
            if (!this.A0I) {
                ArrayList arrayList = this.A0C;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = (Animator) arrayList.get(size);
                    if (Build.VERSION.SDK_INT >= 19) {
                        animator.resume();
                    } else {
                        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                        if (listeners != null) {
                            int size2 = listeners.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                Animator.AnimatorListener animatorListener = listeners.get(i2);
                                if (animatorListener instanceof C13050lO) {
                                    ((C13050lO) animatorListener).onAnimationResume(animator);
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList2 = this.A0E;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    AbstractList abstractList = (AbstractList) arrayList2.clone();
                    int size3 = abstractList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((C019509b) abstractList.get(i3)).AZE(this);
                    }
                }
            }
            this.A0J = false;
        }
    }

    public final void A0J(View view, boolean z2) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C06230Uw r1 = new C06230Uw(view);
                if (z2) {
                    A0W(r1);
                } else {
                    A0V(r1);
                }
                r1.A01.add(this);
                A0Q(r1);
                A02(view, r1, z2 ? this.A09 : this.A08);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    A0J(viewGroup.getChildAt(i2), z2);
                }
            }
        }
    }

    public void A0K(ViewGroup viewGroup) {
        AnonymousClass00N A012 = A01();
        int size = A012.size();
        if (viewGroup != null && size != 0) {
            C12000jg A002 = C06430Vt.A00(viewGroup);
            AnonymousClass00N r3 = new AnonymousClass00N((AnonymousClass00O) A012);
            A012.clear();
            while (true) {
                size--;
                if (size >= 0) {
                    int i2 = size << 1;
                    C04990Ou r1 = (C04990Ou) r3.A02[i2 + 1];
                    if (r1.A00 != null && A002.equals(r1.A03)) {
                        ((Animator) r3.A02[i2]).end();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01da, code lost:
        if (r13 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0045 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(android.view.ViewGroup r29, X.C04860Of r30, X.C04860Of r31, java.util.ArrayList r32, java.util.ArrayList r33) {
        /*
            r28 = this;
            X.00N r26 = A01()
            android.util.SparseIntArray r25 = new android.util.SparseIntArray
            r25.<init>()
            r27 = r32
            int r24 = r27.size()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
        L_0x0015:
            r8 = r28
            r0 = r24
            if (r10 >= r0) goto L_0x01ea
            r0 = r27
            java.lang.Object r13 = r0.get(r10)
            X.0Uw r13 = (X.C06230Uw) r13
            r0 = r33
            java.lang.Object r12 = r0.get(r10)
            X.0Uw r12 = (X.C06230Uw) r12
            if (r13 == 0) goto L_0x0036
            java.util.ArrayList r0 = r13.A01
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0036
            r13 = 0
        L_0x0036:
            if (r12 == 0) goto L_0x0041
            java.util.ArrayList r0 = r12.A01
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0041
            r12 = 0
        L_0x0041:
            if (r13 != 0) goto L_0x0048
            if (r12 != 0) goto L_0x0050
        L_0x0045:
            int r10 = r10 + 1
            goto L_0x0015
        L_0x0048:
            if (r12 == 0) goto L_0x0050
            boolean r0 = r8.A0T(r13, r12)
            if (r0 == 0) goto L_0x0045
        L_0x0050:
            r0 = r29
            android.animation.Animator r9 = r8.A0S(r0, r13, r12)
            if (r9 == 0) goto L_0x0045
            if (r12 == 0) goto L_0x00bd
            android.view.View r11 = r12.A00
            java.lang.String[] r15 = r8.A0U()
            if (r15 == 0) goto L_0x00bf
            int r14 = r15.length
            if (r14 <= 0) goto L_0x00bf
            X.0Uw r7 = new X.0Uw
            r7.<init>(r11)
            r0 = r31
            X.00N r0 = r0.A02
            java.lang.Object r6 = r0.get(r11)
            X.0Uw r6 = (X.C06230Uw) r6
            if (r6 == 0) goto L_0x008a
            r5 = 0
        L_0x0077:
            java.util.Map r0 = r7.A02
            r3 = r0
            r4 = r15[r5]
            java.util.Map r0 = r6.A02
            java.lang.Object r0 = r0.get(r4)
            r3.put(r4, r0)
            int r5 = r5 + 1
            if (r5 >= r14) goto L_0x008a
            goto L_0x0077
        L_0x008a:
            int r4 = r26.size()
            r3 = 0
        L_0x008f:
            if (r3 >= r4) goto L_0x00c0
            r0 = r26
            java.lang.Object[] r5 = r0.A02
            int r0 = r3 << 1
            r5 = r5[r0]
            r0 = r26
            java.lang.Object r5 = r0.get(r5)
            X.0Ou r5 = (X.C04990Ou) r5
            X.0Uw r6 = r5.A02
            if (r6 == 0) goto L_0x00ba
            android.view.View r0 = r5.A00
            if (r0 != r11) goto L_0x00ba
            java.lang.String r5 = r5.A04
            java.lang.String r0 = r8.A0A
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r6.equals(r7)
            if (r0 == 0) goto L_0x00ba
            goto L_0x0045
        L_0x00ba:
            int r3 = r3 + 1
            goto L_0x008f
        L_0x00bd:
            android.view.View r11 = r13.A00
        L_0x00bf:
            r7 = 0
        L_0x00c0:
            X.0MB r14 = r8.A06
            if (r14 == 0) goto L_0x00de
            X.0GM r14 = (X.AnonymousClass0GM) r14
            r22 = 0
            if (r13 != 0) goto L_0x00fb
            if (r12 != 0) goto L_0x00fb
            r3 = 0
        L_0x00ce:
            java.util.ArrayList r0 = r8.A0B
            int r6 = r0.size()
            int r5 = (int) r3
            r0 = r25
            r0.put(r6, r5)
            long r1 = java.lang.Math.min(r3, r1)
        L_0x00de:
            java.lang.String r0 = r8.A0A
            X.0jg r16 = X.C06430Vt.A00(r29)
            X.0Ou r3 = new X.0Ou
            r12 = r3
            r13 = r11
            r14 = r8
            r15 = r7
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            r0 = r26
            r0.put(r9, r3)
            java.util.ArrayList r0 = r8.A0B
            r0.add(r9)
            goto L_0x0045
        L_0x00fb:
            X.0PK r0 = r8.A05
            if (r0 != 0) goto L_0x01e4
            r21 = 0
        L_0x0101:
            r6 = 1
            if (r12 == 0) goto L_0x0118
            if (r13 == 0) goto L_0x01e0
            java.util.Map r3 = r13.A02
            java.lang.String r0 = "android:visibilityPropagation:visibility"
            java.lang.Object r0 = r3.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01e0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x01e0
        L_0x0118:
            r4 = -1
        L_0x0119:
            r5 = 0
            if (r13 == 0) goto L_0x01d8
            java.util.Map r3 = r13.A02
            java.lang.String r0 = "android:visibilityPropagation:center"
            java.lang.Object r0 = r3.get(r0)
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L_0x01d8
            r20 = r0[r5]
        L_0x012a:
            java.util.Map r3 = r13.A02
            java.lang.String r0 = "android:visibilityPropagation:center"
            java.lang.Object r0 = r3.get(r0)
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L_0x01dc
            r19 = r0[r6]
        L_0x0138:
            r3 = 2
            int[] r5 = new int[r3]
            r0 = r29
            r0.getLocationOnScreen(r5)
            r0 = 0
            r18 = r5[r0]
            float r0 = r29.getTranslationX()
            int r0 = java.lang.Math.round(r0)
            int r18 = r18 + r0
            r17 = r5[r6]
            float r0 = r29.getTranslationY()
            int r0 = java.lang.Math.round(r0)
            int r17 = r17 + r0
            int r0 = r29.getWidth()
            int r16 = r18 + r0
            int r0 = r29.getHeight()
            int r15 = r17 + r0
            if (r21 == 0) goto L_0x01d1
            int r13 = r21.centerX()
            int r0 = r21.centerY()
        L_0x016f:
            int r6 = r14.A01
            r5 = 5
            r3 = 3
            r12 = 0
            if (r6 == r3) goto L_0x01c6
            if (r6 == r5) goto L_0x01bb
            r0 = 48
            if (r6 == r0) goto L_0x01b0
            r0 = 80
            if (r6 != r0) goto L_0x018a
            int r19 = r19 - r17
            int r13 = r13 - r20
            int r0 = java.lang.Math.abs(r13)
            int r12 = r19 + r0
        L_0x018a:
            float r0 = (float) r12
            if (r6 == r3) goto L_0x01ab
            if (r6 == r5) goto L_0x01ab
            int r3 = r29.getHeight()
        L_0x0193:
            float r3 = (float) r3
            float r0 = r0 / r3
            long r5 = r8.A01
            int r3 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r3 >= 0) goto L_0x019d
            r5 = 300(0x12c, double:1.48E-321)
        L_0x019d:
            long r3 = (long) r4
            long r5 = r5 * r3
            float r4 = (float) r5
            float r3 = r14.A00
            float r4 = r4 / r3
            float r4 = r4 * r0
            int r0 = java.lang.Math.round(r4)
            long r3 = (long) r0
            goto L_0x00ce
        L_0x01ab:
            int r3 = r29.getWidth()
            goto L_0x0193
        L_0x01b0:
            int r15 = r15 - r19
            int r13 = r13 - r20
            int r0 = java.lang.Math.abs(r13)
            int r12 = r15 + r0
            goto L_0x018a
        L_0x01bb:
            int r20 = r20 - r18
            int r0 = r0 - r19
            int r0 = java.lang.Math.abs(r0)
            int r12 = r20 + r0
            goto L_0x018a
        L_0x01c6:
            int r16 = r16 - r20
            int r0 = r0 - r19
            int r0 = java.lang.Math.abs(r0)
            int r12 = r16 + r0
            goto L_0x018a
        L_0x01d1:
            int r13 = r18 + r16
            int r13 = r13 / r3
            int r0 = r17 + r15
            int r0 = r0 / r3
            goto L_0x016f
        L_0x01d8:
            r20 = -1
            if (r13 != 0) goto L_0x012a
        L_0x01dc:
            r19 = -1
            goto L_0x0138
        L_0x01e0:
            r13 = r12
            r4 = 1
            goto L_0x0119
        L_0x01e4:
            android.graphics.Rect r21 = r0.A00(r8)
            goto L_0x0101
        L_0x01ea:
            int r0 = r25.size()
            if (r0 == 0) goto L_0x0218
            r9 = 0
        L_0x01f1:
            int r0 = r25.size()
            if (r9 >= r0) goto L_0x0218
            r0 = r25
            int r3 = r0.keyAt(r9)
            java.util.ArrayList r0 = r8.A0B
            java.lang.Object r7 = r0.get(r3)
            android.animation.Animator r7 = (android.animation.Animator) r7
            r0 = r25
            int r0 = r0.valueAt(r9)
            long r5 = (long) r0
            long r5 = r5 - r1
            long r3 = r7.getStartDelay()
            long r5 = r5 + r3
            r7.setStartDelay(r5)
            int r9 = r9 + 1
            goto L_0x01f1
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015707n.A0L(android.view.ViewGroup, X.0Of, X.0Of, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void A0M(ViewGroup viewGroup, boolean z2) {
        C04860Of r0;
        if (z2) {
            this.A09.A02.clear();
            this.A09.A00.clear();
            r0 = this.A09;
        } else {
            this.A08.A02.clear();
            this.A08.A00.clear();
            r0 = this.A08;
        }
        r0.A03.A05();
        ArrayList arrayList = this.A0G;
        if (arrayList.size() > 0 || this.A0H.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                View findViewById = viewGroup.findViewById(((Number) arrayList.get(i2)).intValue());
                if (findViewById != null) {
                    C06230Uw r1 = new C06230Uw(findViewById);
                    if (z2) {
                        A0W(r1);
                    } else {
                        A0V(r1);
                    }
                    r1.A01.add(this);
                    A0Q(r1);
                    A02(findViewById, r1, z2 ? this.A09 : this.A08);
                }
            }
            int i3 = 0;
            while (true) {
                ArrayList arrayList2 = this.A0H;
                if (i3 < arrayList2.size()) {
                    View view = (View) arrayList2.get(i3);
                    C06230Uw r12 = new C06230Uw(view);
                    if (z2) {
                        A0W(r12);
                    } else {
                        A0V(r12);
                    }
                    r12.A01.add(this);
                    A0Q(r12);
                    A02(view, r12, z2 ? this.A09 : this.A08);
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            A0J(viewGroup, z2);
        }
    }

    public void A0N(AnonymousClass0MA r1) {
        if (r1 == null) {
            r1 = A0M;
        }
        this.A04 = r1;
    }

    public void A0O(AnonymousClass0PK r1) {
        this.A05 = r1;
    }

    public void A0P(AnonymousClass0MB r1) {
        this.A06 = r1;
    }

    public void A0Q(C06230Uw r8) {
        if (this.A06 != null) {
            Map map = r8.A02;
            if (!map.isEmpty()) {
                String[] strArr = AnonymousClass0GM.A02;
                for (String containsKey : strArr) {
                    if (!map.containsKey(containsKey)) {
                        View view = r8.A00;
                        Object obj = map.get("android:visibility:visibility");
                        if (obj == null) {
                            obj = Integer.valueOf(view.getVisibility());
                        }
                        map.put("android:visibilityPropagation:visibility", obj);
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int round = iArr[0] + Math.round(view.getTranslationX());
                        iArr[0] = round;
                        iArr[0] = round + (view.getWidth() / 2);
                        int round2 = iArr[1] + Math.round(view.getTranslationY());
                        iArr[1] = round2;
                        iArr[1] = round2 + (view.getHeight() / 2);
                        map.put("android:visibilityPropagation:center", iArr);
                        return;
                    }
                }
            }
        }
    }

    public boolean A0R(View view) {
        int id = view.getId();
        ArrayList arrayList = this.A0G;
        return (arrayList.size() == 0 && this.A0H.size() == 0) || arrayList.contains(Integer.valueOf(id)) || this.A0H.contains(view);
    }

    public Animator A0S(ViewGroup viewGroup, C06230Uw r3, C06230Uw r4) {
        return null;
    }

    public boolean A0T(C06230Uw r8, C06230Uw r9) {
        if (r8 == null || r9 == null) {
            return false;
        }
        String[] A0U = A0U();
        if (A0U != null) {
            for (String str : A0U) {
                Object obj = r8.A02.get(str);
                Object obj2 = r9.A02.get(str);
                if (obj == null) {
                    if (obj2 == null) {
                    }
                } else if (obj2 != null && !(true ^ obj.equals(obj2))) {
                }
            }
            return false;
        }
        Map map = r8.A02;
        for (Object next : map.keySet()) {
            Object obj3 = map.get(next);
            Object obj4 = r9.A02.get(next);
            if (obj3 == null) {
                if (obj4 == null) {
                }
            } else if (obj4 != null && !(true ^ obj3.equals(obj4))) {
            }
        }
        return false;
        return true;
    }

    public String[] A0U() {
        return null;
    }

    public abstract void A0V(C06230Uw r1);

    public abstract void A0W(C06230Uw r1);

    public String toString() {
        return A0C("");
    }
}
