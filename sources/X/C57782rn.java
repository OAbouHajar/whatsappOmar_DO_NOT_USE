package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.obwhatsapp.contact.picker.IDxLAdapterShape4S0300000_2_I1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2rn  reason: invalid class name and case insensitive filesystem */
public final class C57782rn extends AnonymousClass0Fd {
    public static final TimeInterpolator A0B = new ValueAnimator().getInterpolator();
    public List A00 = AnonymousClass000.A0u();
    public List A01 = AnonymousClass000.A0u();
    public List A02 = AnonymousClass000.A0u();
    public List A03 = AnonymousClass000.A0u();
    public List A04 = AnonymousClass000.A0u();
    public List A05 = AnonymousClass000.A0u();
    public List A06 = AnonymousClass000.A0u();
    public List A07 = AnonymousClass000.A0u();
    public List A08 = AnonymousClass000.A0u();
    public List A09 = AnonymousClass000.A0u();
    public List A0A = AnonymousClass000.A0u();

    public C57782rn() {
        this.A00 = 240;
        this.A01 = 240;
        this.A02 = 240;
        this.A03 = 240;
        this.A00 = false;
    }

    public static /* synthetic */ void A01(C57782rn r1) {
        if (!r1.A0B()) {
            r1.A02();
        }
    }

    public static final void A02(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C004601z.A0H(((C005602k) list.get(size)).A0H).A01();
            } else {
                return;
            }
        }
    }

    public void A08() {
        List list = this.A08;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C005602k r1 = ((AnonymousClass4NC) list.get(size)).A04;
            C13690nt.A17(r1.A0H, this, r1);
            list.remove(size);
        }
        List list2 = this.A09;
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A03((C005602k) list2.get(size2));
            list2.remove(size2);
        }
        List list3 = this.A06;
        int size3 = list3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C005602k r12 = (C005602k) list3.get(size3);
            C13690nt.A18(r12.A0H, this, r12);
            list3.remove(size3);
        }
        List list4 = this.A07;
        int size4 = list4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C86234Ru r13 = (C86234Ru) list4.get(size4);
            C005602k r0 = r13.A05;
            if (r0 != null) {
                A0J(r0, r13);
            }
            C005602k r02 = r13.A04;
            if (r02 != null) {
                A0J(r02, r13);
            }
        }
        list4.clear();
        if (A0B()) {
            List list5 = this.A05;
            int size5 = list5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                List A0l = C13690nt.A0l(list5, size5);
                int size6 = A0l.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C005602k r14 = ((AnonymousClass4NC) A0l.get(size6)).A04;
                        C13690nt.A17(r14.A0H, this, r14);
                        A0l.remove(size6);
                        if (A0l.isEmpty()) {
                            list5.remove(A0l);
                        }
                    }
                }
            }
            List list6 = this.A01;
            int size7 = list6.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                List A0l2 = C13690nt.A0l(list6, size7);
                int size8 = A0l2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        C005602k r15 = (C005602k) A0l2.get(size8);
                        C13690nt.A18(r15.A0H, this, r15);
                        A0l2.remove(size8);
                        if (A0l2.isEmpty()) {
                            list6.remove(A0l2);
                        }
                    }
                }
            }
            List list7 = this.A03;
            int size9 = list7.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    List A0l3 = C13690nt.A0l(list7, size9);
                    int size10 = A0l3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C86234Ru r16 = (C86234Ru) A0l3.get(size10);
                            C005602k r03 = r16.A05;
                            if (r03 != null) {
                                A0J(r03, r16);
                            }
                            C005602k r04 = r16.A04;
                            if (r04 != null) {
                                A0J(r04, r16);
                            }
                            if (A0l3.isEmpty()) {
                                list7.remove(A0l3);
                            }
                        }
                    }
                } else {
                    A02(this.A0A);
                    A02(this.A04);
                    A02(this.A00);
                    A02(this.A02);
                    A02();
                    return;
                }
            }
        }
    }

    public void A09() {
        List<C005602k> list = this.A09;
        boolean A0i = C13700nu.A0i(list);
        List list2 = this.A08;
        boolean A0i2 = C13700nu.A0i(list2);
        List list3 = this.A07;
        boolean A0i3 = C13700nu.A0i(list3);
        List list4 = this.A06;
        boolean A0i4 = C13700nu.A0i(list4);
        if (A0i || A0i2 || A0i4 || A0i3) {
            for (C005602k r3 : list) {
                AnonymousClass0SH A0H = C004601z.A0H(r3.A0H);
                this.A0A.add(r3);
                A0H.A08(A07());
                A0H.A04(0.0f);
                A0H.A05(0.0f);
                A0H.A0A(new IDxLAdapterShape4S0300000_2_I1(A0H, r3, this, 0));
                A0H.A02();
            }
            list.clear();
            if (A0i2) {
                ArrayList A0u = AnonymousClass000.A0u();
                A0u.addAll(list2);
                this.A05.add(A0u);
                list2.clear();
                RunnableRunnableShape14S0200000_I1_2 runnableRunnableShape14S0200000_I1_2 = new RunnableRunnableShape14S0200000_I1_2(this, 2, A0u);
                if (A0i) {
                    ((AnonymousClass4NC) A0u.get(0)).A04.A0H.postOnAnimationDelayed(runnableRunnableShape14S0200000_I1_2, A07());
                } else {
                    runnableRunnableShape14S0200000_I1_2.run();
                }
            }
            if (A0i3) {
                ArrayList A0u2 = AnonymousClass000.A0u();
                A0u2.addAll(list3);
                this.A03.add(A0u2);
                list3.clear();
                RunnableRunnableShape14S0200000_I1_2 runnableRunnableShape14S0200000_I1_22 = new RunnableRunnableShape14S0200000_I1_2(this, 0, A0u2);
                if (A0i) {
                    ((C86234Ru) A0u2.get(0)).A05.A0H.postOnAnimationDelayed(runnableRunnableShape14S0200000_I1_22, A07());
                } else {
                    runnableRunnableShape14S0200000_I1_22.run();
                }
            }
            if (A0i4) {
                ArrayList A0u3 = AnonymousClass000.A0u();
                A0u3.addAll(list4);
                this.A01.add(A0u3);
                list4.clear();
                RunnableRunnableShape14S0200000_I1_2 runnableRunnableShape14S0200000_I1_23 = new RunnableRunnableShape14S0200000_I1_2(this, 1, A0u3);
                if (A0i || A0i2 || A0i3) {
                    long j2 = 0;
                    long A072 = A0i ? A07() : 0;
                    long A062 = A0i2 ? A06() : 0;
                    if (A0i3) {
                        j2 = A05();
                    }
                    ((C005602k) A0u3.get(0)).A0H.postOnAnimationDelayed(runnableRunnableShape14S0200000_I1_23, A072 + Math.max(A062, j2));
                    return;
                }
                runnableRunnableShape14S0200000_I1_23.run();
            }
        }
    }

    public void A0A(C005602k r7) {
        View view = r7.A0H;
        C004601z.A0H(view).A01();
        List list = this.A08;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((AnonymousClass4NC) list.get(size)).A04 == r7) {
                C13690nt.A17(view, this, r7);
                list.remove(size);
            }
        }
        A0I(r7, this.A07);
        if (this.A09.remove(r7)) {
            C13690nt.A18(view, this, r7);
        }
        if (this.A06.remove(r7)) {
            C13690nt.A18(view, this, r7);
        }
        List list2 = this.A03;
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            List A0l = C13690nt.A0l(list2, size2);
            A0I(r7, A0l);
            if (A0l.isEmpty()) {
                list2.remove(size2);
            }
        }
        List list3 = this.A05;
        int size3 = list3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            List A0l2 = C13690nt.A0l(list3, size3);
            int size4 = A0l2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((AnonymousClass4NC) A0l2.get(size4)).A04 == r7) {
                    C13690nt.A17(view, this, r7);
                    A0l2.remove(size4);
                    if (A0l2.isEmpty()) {
                        list3.remove(size3);
                    }
                }
            }
        }
        List list4 = this.A01;
        int size5 = list4.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            List A0l3 = C13690nt.A0l(list4, size5);
            if (A0l3.remove(r7)) {
                C13690nt.A18(view, this, r7);
                if (A0l3.isEmpty()) {
                    list4.remove(size5);
                }
            }
        }
        this.A0A.remove(r7);
        this.A00.remove(r7);
        this.A02.remove(r7);
        this.A04.remove(r7);
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
        View view = r3.A0H;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
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
            float r1 = (float) r10
            float r0 = r2.getTranslationX()
            float r1 = r1 + r0
            int r4 = (int) r1
            float r1 = (float) r11
            float r0 = r2.getTranslationY()
            float r1 = r1 + r0
            int r5 = (int) r1
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
            java.util.List r0 = r8.A08
            X.4NC r2 = new X.4NC
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57782rn.A0F(X.02k, int, int, int, int):boolean");
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
        this.A07.add(new C86234Ru(r7, r8, i6, i7, i8, i9));
        return true;
    }

    public final void A0H(C005602k r3) {
        r3.A0H.animate().setInterpolator(A0B);
        A0A(r3);
    }

    public final void A0I(C005602k r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C86234Ru r1 = (C86234Ru) list.get(size);
                if (A0J(r4, r1) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }

    public final boolean A0J(C005602k r5, C86234Ru r6) {
        if (r6.A04 == r5) {
            r6.A04 = null;
        } else if (r6.A05 != r5) {
            return false;
        } else {
            r6.A05 = null;
        }
        View view = r5.A0H;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        A03(r5);
        return true;
    }
}
