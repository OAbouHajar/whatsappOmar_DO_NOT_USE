package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxLAdapterShape1S0400000_2_I1;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.obwhatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2rm  reason: invalid class name and case insensitive filesystem */
public class C57772rm extends AnonymousClass0Fd {
    public static AccelerateDecelerateInterpolator A0E;
    public AnonymousClass4DW A00;
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
    public ArrayList A0B = AnonymousClass000.A0u();
    public boolean A0C = false;
    public boolean A0D = false;

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

    public long A04() {
        return 300;
    }

    public long A05() {
        return 200;
    }

    public long A06() {
        return 200;
    }

    public long A07() {
        return 300;
    }

    public void A08() {
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C005602k r1 = ((AnonymousClass4N9) arrayList.get(size)).A04;
            C13690nt.A17(r1.A0H, this, r1);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.A0A;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A03((C005602k) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.A07;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            A0I((C005602k) arrayList3.get(size3));
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.A08;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C86214Rs r12 = (C86214Rs) arrayList4.get(size4);
            C005602k r0 = r12.A05;
            if (r0 != null) {
                A0L(r0, r12);
            }
            C005602k r02 = r12.A04;
            if (r02 != null) {
                A0L(r02, r12);
            }
        }
        arrayList4.clear();
        if (A0B()) {
            ArrayList arrayList5 = this.A06;
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
                        C005602k r13 = ((AnonymousClass4N9) abstractList.get(size6)).A04;
                        C13690nt.A17(r13.A0H, this, r13);
                        abstractList.remove(size6);
                        if (abstractList.isEmpty()) {
                            arrayList5.remove(abstractList);
                        }
                    }
                }
            }
            ArrayList arrayList6 = this.A02;
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
                        A0I((C005602k) abstractList2.get(size8));
                        abstractList2.remove(size8);
                        if (abstractList2.isEmpty()) {
                            arrayList6.remove(abstractList2);
                        }
                    }
                }
            }
            ArrayList arrayList7 = this.A04;
            int size9 = arrayList7.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    AbstractList abstractList3 = (AbstractList) arrayList7.get(size9);
                    int size10 = abstractList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C86214Rs r14 = (C86214Rs) abstractList3.get(size10);
                            C005602k r03 = r14.A05;
                            if (r03 != null) {
                                A0L(r03, r14);
                            }
                            C005602k r04 = r14.A04;
                            if (r04 != null) {
                                A0L(r04, r14);
                            }
                            if (abstractList3.isEmpty()) {
                                arrayList7.remove(abstractList3);
                            }
                        }
                    }
                } else {
                    A01(this.A0B);
                    A01(this.A05);
                    A01(this.A01);
                    A01(this.A03);
                    A02();
                    return;
                }
            }
        }
    }

    public void A09() {
        ArrayList arrayList = this.A0A;
        boolean z2 = !arrayList.isEmpty();
        ArrayList arrayList2 = this.A09;
        boolean z3 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.A08;
        boolean z4 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.A07;
        boolean z5 = !arrayList4.isEmpty();
        if (z2 || z3 || z5 || z4) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C005602k r7 = (C005602k) it.next();
                if (this.A0D) {
                    A03(r7);
                    A0H();
                } else {
                    View view = r7.A0H;
                    ViewPropertyAnimator animate = view.animate();
                    this.A0B.add(r7);
                    animate.setDuration(300).scaleX(0.0f).scaleY(0.0f).setListener(new IDxLAdapterShape1S0400000_2_I1(view, animate, r7, this, 0)).start();
                }
            }
            arrayList.clear();
            if (z3) {
                ArrayList A0u = AnonymousClass000.A0u();
                A0u.addAll(arrayList2);
                this.A06.add(A0u);
                arrayList2.clear();
                RunnableRunnableShape13S0200000_I1_1 runnableRunnableShape13S0200000_I1_1 = new RunnableRunnableShape13S0200000_I1_1(this, 8, A0u);
                if (z2) {
                    ((AnonymousClass4N9) A0u.get(0)).A04.A0H.postOnAnimationDelayed(runnableRunnableShape13S0200000_I1_1, 300);
                } else {
                    runnableRunnableShape13S0200000_I1_1.run();
                }
            }
            if (z4) {
                ArrayList A0u2 = AnonymousClass000.A0u();
                A0u2.addAll(arrayList3);
                this.A04.add(A0u2);
                arrayList3.clear();
                RunnableRunnableShape13S0200000_I1_1 runnableRunnableShape13S0200000_I1_12 = new RunnableRunnableShape13S0200000_I1_1(this, 9, A0u2);
                if (z2) {
                    ((C86214Rs) A0u2.get(0)).A05.A0H.postOnAnimationDelayed(runnableRunnableShape13S0200000_I1_12, 300);
                } else {
                    runnableRunnableShape13S0200000_I1_12.run();
                }
            }
            if (z5) {
                ArrayList A0u3 = AnonymousClass000.A0u();
                A0u3.addAll(arrayList4);
                this.A02.add(A0u3);
                arrayList4.clear();
                RunnableRunnableShape13S0200000_I1_1 runnableRunnableShape13S0200000_I1_13 = new RunnableRunnableShape13S0200000_I1_1(this, 7, A0u3);
                if (z2 || z3 || z4) {
                    long j2 = 0;
                    long j3 = z2 ? 300 : 0;
                    long j4 = z3 ? 200 : 0;
                    if (z4) {
                        j2 = 200;
                    }
                    ((C005602k) A0u3.get(0)).A0H.postOnAnimationDelayed(runnableRunnableShape13S0200000_I1_13, j3 + Math.max(j4, j2));
                    return;
                }
                runnableRunnableShape13S0200000_I1_13.run();
            }
        }
    }

    public void A0A(C005602k r7) {
        View view = r7.A0H;
        view.animate().cancel();
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((AnonymousClass4N9) arrayList.get(size)).A04 == r7) {
                C13690nt.A17(view, this, r7);
                arrayList.remove(size);
            }
        }
        A0K(r7, this.A08);
        if (this.A0A.remove(r7)) {
            C13690nt.A18(view, this, r7);
        }
        if (this.A07.remove(r7)) {
            A0I(r7);
        }
        ArrayList arrayList2 = this.A04;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            A0K(r7, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.A06;
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
                } else if (((AnonymousClass4N9) abstractList.get(size4)).A04 == r7) {
                    C13690nt.A17(view, this, r7);
                    abstractList.remove(size4);
                    if (abstractList.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList5 = this.A02;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                AbstractCollection abstractCollection = (AbstractCollection) arrayList5.get(size5);
                if (abstractCollection.remove(r7)) {
                    A0I(r7);
                    if (abstractCollection.isEmpty()) {
                        arrayList5.remove(size5);
                    }
                }
            } else {
                this.A0B.remove(r7);
                this.A01.remove(r7);
                this.A03.remove(r7);
                this.A05.remove(r7);
                A0H();
                return;
            }
        }
    }

    public boolean A0B() {
        return !this.A07.isEmpty() || !this.A08.isEmpty() || !this.A09.isEmpty() || !this.A0A.isEmpty() || !this.A05.isEmpty() || !this.A0B.isEmpty() || !this.A01.isEmpty() || !this.A03.isEmpty() || !this.A06.isEmpty() || !this.A02.isEmpty() || !this.A04.isEmpty();
    }

    public boolean A0C(C005602k r3, List list) {
        return !list.isEmpty() || super.A0C(r3, list);
    }

    public boolean A0D(C005602k r3) {
        A0J(r3);
        if (!this.A0D) {
            View view = r3.A0H;
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        } else if (r3 instanceof AnonymousClass26E) {
            ((AnonymousClass26E) r3).A0A(4);
        }
        this.A07.add(r3);
        return true;
    }

    public boolean A0E(C005602k r2) {
        A0J(r2);
        this.A0A.add(r2);
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
            r8.A0J(r9)
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
            java.util.ArrayList r0 = r8.A09
            X.4N9 r2 = new X.4N9
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57772rm.A0F(X.02k, int, int, int, int):boolean");
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
        A0J(r14);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        A0J(r15);
        View view2 = r15.A0H;
        view2.setTranslationX((float) (-((int) (((float) (i4 - i2)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i5 - i3)) - translationY))));
        view2.setAlpha(0.0f);
        this.A08.add(new C86214Rs(r7, r8, i6, i7, i8, i9));
        return true;
    }

    public void A0H() {
        AnonymousClass4DW r0;
        if (!A0B()) {
            A02();
            if (this.A0C && (r0 = this.A00) != null) {
                CallGrid callGrid = r0.A00;
                if (callGrid.A0Y.A03) {
                    Log.i("CallGrid/resizeGridView, callGridAdapter.notifyDataSetChanged()");
                    RecyclerView recyclerView = callGrid.A0U;
                    if (recyclerView.A09 > 0 || recyclerView.A0B != 0) {
                        recyclerView.post(new RunnableRunnableShape4S0100000_I0_3(callGrid, 43));
                    } else {
                        callGrid.A03.A01();
                    }
                }
            }
            this.A0C = false;
        }
    }

    public final void A0I(C005602k r3) {
        if (r3 instanceof AnonymousClass26E) {
            ((AnonymousClass26E) r3).A0A(0);
        }
        C13690nt.A18(r3.A0H, this, r3);
    }

    public final void A0J(C005602k r3) {
        if (A0E == null) {
            A0E = new AccelerateDecelerateInterpolator();
        }
        r3.A0H.animate().setInterpolator(A0E);
        A0A(r3);
    }

    public final void A0K(C005602k r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C86214Rs r1 = (C86214Rs) list.get(size);
                if (A0L(r4, r1) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }

    public final boolean A0L(C005602k r5, C86214Rs r6) {
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
