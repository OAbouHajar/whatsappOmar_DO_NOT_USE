package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.redex.IDxLAdapterShape0S0400000_I1;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Fr  reason: invalid class name */
public class AnonymousClass0Fr extends AnonymousClass0Fd {
    public static TimeInterpolator A0B;
    public ArrayList A00 = AnonymousClass000.A0u();
    public ArrayList A01 = AnonymousClass000.A0u();
    public ArrayList A02 = AnonymousClass000.A0u();
    public ArrayList A03 = AnonymousClass000.A0u();
    public ArrayList A04 = AnonymousClass000.A0u();
    public ArrayList A05 = AnonymousClass000.A0u();
    public ArrayList A06 = AnonymousClass000.A0u();
    public ArrayList A07 = AnonymousClass000.A0u();
    public ArrayList A08 = AnonymousClass000.A0u();
    public ArrayList A09 = AnonymousClass000.A0u();
    public ArrayList A0A = AnonymousClass000.A0u();

    public static void A01(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C005602k) list.get(size)).A0H.animate().cancel();
            } else {
                return;
            }
        }
    }

    public void A08() {
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C005602k r1 = ((C04950Oq) arrayList.get(size)).A04;
            View view = r1.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A03(r1);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.A09;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A03((C005602k) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.A06;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C005602k r12 = (C005602k) arrayList3.get(size3);
            r12.A0H.setAlpha(1.0f);
            A03(r12);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.A07;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C05250Pw r13 = (C05250Pw) arrayList4.get(size4);
            C005602k r0 = r13.A05;
            if (r0 != null) {
                A0J(r13, r0);
            }
            C005602k r02 = r13.A04;
            if (r02 != null) {
                A0J(r13, r02);
            }
        }
        arrayList4.clear();
        if (A0B()) {
            ArrayList arrayList5 = this.A05;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                AbstractList abstractList = (AbstractList) arrayList5.get(size5);
                int size6 = abstractList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C005602k r14 = ((C04950Oq) abstractList.get(size6)).A04;
                        View view2 = r14.A0H;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        A03(r14);
                        abstractList.remove(size6);
                        if (abstractList.isEmpty()) {
                            arrayList5.remove(abstractList);
                        }
                    }
                }
            }
            ArrayList arrayList6 = this.A01;
            int size7 = arrayList6.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                AbstractList abstractList2 = (AbstractList) arrayList6.get(size7);
                int size8 = abstractList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        C005602k r15 = (C005602k) abstractList2.get(size8);
                        r15.A0H.setAlpha(1.0f);
                        A03(r15);
                        abstractList2.remove(size8);
                        if (abstractList2.isEmpty()) {
                            arrayList6.remove(abstractList2);
                        }
                    }
                }
            }
            ArrayList arrayList7 = this.A03;
            int size9 = arrayList7.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    AbstractList abstractList3 = (AbstractList) arrayList7.get(size9);
                    int size10 = abstractList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C05250Pw r16 = (C05250Pw) abstractList3.get(size10);
                            C005602k r03 = r16.A05;
                            if (r03 != null) {
                                A0J(r16, r03);
                            }
                            C005602k r04 = r16.A04;
                            if (r04 != null) {
                                A0J(r16, r04);
                            }
                            if (abstractList3.isEmpty()) {
                                arrayList7.remove(abstractList3);
                            }
                        }
                    }
                } else {
                    A01(this.A0A);
                    A01(this.A04);
                    A01(this.A00);
                    A01(this.A02);
                    A02();
                    return;
                }
            }
        }
    }

    public void A09() {
        ArrayList arrayList = this.A09;
        boolean z2 = !arrayList.isEmpty();
        ArrayList arrayList2 = this.A08;
        boolean z3 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.A07;
        boolean z4 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.A06;
        boolean z5 = !arrayList4.isEmpty();
        if (z2 || z3 || z5 || z4) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C005602k r7 = (C005602k) it.next();
                View view = r7.A0H;
                ViewPropertyAnimator animate = view.animate();
                this.A0A.add(r7);
                animate.setDuration(A07()).alpha(0.0f).setListener(new IDxLAdapterShape0S0400000_I1(view, animate, this, r7, 0)).start();
            }
            arrayList.clear();
            if (z3) {
                ArrayList A0u = AnonymousClass000.A0u();
                A0u.addAll(arrayList2);
                this.A05.add(A0u);
                arrayList2.clear();
                C09860gC r3 = new C09860gC(this, A0u);
                if (z2) {
                    ((C04950Oq) A0u.get(0)).A04.A0H.postOnAnimationDelayed(r3, A07());
                } else {
                    r3.run();
                }
            }
            if (z4) {
                ArrayList A0u2 = AnonymousClass000.A0u();
                A0u2.addAll(arrayList3);
                this.A03.add(A0u2);
                arrayList3.clear();
                C09870gD r32 = new C09870gD(this, A0u2);
                if (z2) {
                    ((C05250Pw) A0u2.get(0)).A05.A0H.postOnAnimationDelayed(r32, A07());
                } else {
                    r32.run();
                }
            }
            if (z5) {
                ArrayList A0u3 = AnonymousClass000.A0u();
                A0u3.addAll(arrayList4);
                this.A01.add(A0u3);
                arrayList4.clear();
                C09880gE r6 = new C09880gE(this, A0u3);
                if (z2 || z3 || z4) {
                    long j2 = 0;
                    long A072 = z2 ? A07() : 0;
                    long A062 = z3 ? A06() : 0;
                    if (z4) {
                        j2 = A05();
                    }
                    ((C005602k) A0u3.get(0)).A0H.postOnAnimationDelayed(r6, A072 + Math.max(A062, j2));
                    return;
                }
                r6.run();
            }
        }
    }

    public void A0A(C005602k r9) {
        View view = r9.A0H;
        view.animate().cancel();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C04950Oq) arrayList.get(size)).A04 == r9) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A03(r9);
                arrayList.remove(size);
            }
        }
        A0I(r9, this.A07);
        if (this.A09.remove(r9)) {
            view.setAlpha(1.0f);
            A03(r9);
        }
        if (this.A06.remove(r9)) {
            view.setAlpha(1.0f);
            A03(r9);
        }
        ArrayList arrayList2 = this.A03;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            A0I(r9, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.A05;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractList abstractList = (AbstractList) arrayList4.get(size3);
            int size4 = abstractList.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C04950Oq) abstractList.get(size4)).A04 == r9) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A03(r9);
                    abstractList.remove(size4);
                    if (abstractList.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList5 = this.A01;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            AbstractCollection abstractCollection = (AbstractCollection) arrayList5.get(size5);
            if (abstractCollection.remove(r9)) {
                view.setAlpha(1.0f);
                A03(r9);
                if (abstractCollection.isEmpty()) {
                    arrayList5.remove(size5);
                }
            }
        }
        this.A0A.remove(r9);
        this.A00.remove(r9);
        this.A02.remove(r9);
        this.A04.remove(r9);
        if (!A0B()) {
            A02();
        }
    }

    public boolean A0B() {
        return !this.A06.isEmpty() || !this.A07.isEmpty() || !this.A08.isEmpty() || !this.A09.isEmpty() || !this.A04.isEmpty() || !this.A0A.isEmpty() || !this.A00.isEmpty() || !this.A02.isEmpty() || !this.A05.isEmpty() || !this.A01.isEmpty() || !this.A03.isEmpty();
    }

    public boolean A0C(C005602k r3, List list) {
        return !list.isEmpty() || super.A0C(r3, list);
    }

    public boolean A0D(C005602k r3) {
        A0H(r3);
        r3.A0H.setAlpha(0.0f);
        this.A06.add(r3);
        return true;
    }

    public boolean A0E(C005602k r2) {
        A0H(r2);
        this.A09.add(r2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r1 != 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(X.C005602k r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r3 = r9
            android.view.View r2 = r9.A0H
            float r0 = r2.getTranslationX()
            int r0 = (int) r0
            int r4 = r10 + r0
            float r0 = r2.getTranslationY()
            int r0 = (int) r0
            int r5 = r11 + r0
            r8.A0H(r9)
            r6 = r12
            int r0 = r12 - r4
            r7 = r13
            int r1 = r13 - r5
            if (r0 != 0) goto L_0x0023
            if (r1 != 0) goto L_0x002a
            r8.A03(r9)
            r0 = 0
            return r0
        L_0x0023:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L_0x002f
        L_0x002a:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L_0x002f:
            java.util.ArrayList r0 = r8.A08
            X.0Oq r2 = new X.0Oq
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Fr.A0F(X.02k, int, int, int, int):boolean");
    }

    public boolean A0G(C005602k r14, C005602k r15, int i2, int i3, int i4, int i5) {
        C005602k r7 = r14;
        C005602k r8 = r15;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        if (r14 == r15) {
            return A0F(r14, i6, i7, i8, i9);
        }
        View view = r14.A0H;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        A0H(r14);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        A0H(r15);
        View view2 = r15.A0H;
        view2.setTranslationX((float) (-((int) (((float) (i4 - i2)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i5 - i3)) - translationY))));
        view2.setAlpha(0.0f);
        this.A07.add(new C05250Pw(r7, r8, i6, i7, i8, i9));
        return true;
    }

    public final void A0H(C005602k r3) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        r3.A0H.animate().setInterpolator(A0B);
        A0A(r3);
    }

    public final void A0I(C005602k r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C05250Pw r1 = (C05250Pw) list.get(size);
                if (A0J(r1, r4) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }

    public final boolean A0J(C05250Pw r5, C005602k r6) {
        if (r5.A04 == r6) {
            r5.A04 = null;
        } else if (r5.A05 != r6) {
            return false;
        } else {
            r5.A05 = null;
        }
        View view = r6.A0H;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        A03(r6);
        return true;
    }
}
