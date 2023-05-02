package X;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0S3  reason: invalid class name */
public class AnonymousClass0S3 {
    public C03650Ji A00;
    public C03890Kg A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public final AnonymousClass01A A04;
    public final AnonymousClass0WQ A05;
    public final HashSet A06 = new HashSet();
    public final List A07 = AnonymousClass000.A0u();

    public AnonymousClass0S3(AnonymousClass024 r3, AnonymousClass0WQ r4, C03650Ji r5, C03890Kg r6) {
        AnonymousClass01A r1 = r4.A02;
        this.A01 = r6;
        this.A00 = r5;
        this.A04 = r1;
        r3.A03(new C07300aw(this));
        this.A05 = r4;
    }

    public void A00() {
        if (!this.A03) {
            if (AnonymousClass02C.A02(2)) {
                StringBuilder A0r = AnonymousClass000.A0r("SpecialEffectsController: ");
                A0r.append(this);
                Log.v("FragmentManager", AnonymousClass000.A0h(" has called complete.", A0r));
            }
            this.A03 = true;
            for (Runnable run : this.A07) {
                run.run();
            }
        }
        this.A05.A04();
    }

    public void A01() {
        if (this.A00 == C03650Ji.ADDING) {
            AnonymousClass0WQ r4 = this.A05;
            AnonymousClass01A r3 = r4.A02;
            View findFocus = r3.A0A.findFocus();
            if (findFocus != null) {
                r3.A08().A06 = findFocus;
                if (AnonymousClass02C.A02(2)) {
                    StringBuilder A0r = AnonymousClass000.A0r("requestFocus: Saved focused view ");
                    A0r.append(findFocus);
                    Log.v("FragmentManager", AnonymousClass000.A0e(r3, " for Fragment ", A0r));
                }
            }
            View A062 = this.A04.A06();
            if (A062.getParent() == null) {
                r4.A02();
                A062.setAlpha(0.0f);
            }
            if (A062.getAlpha() == 0.0f && A062.getVisibility() == 0) {
                A062.setVisibility(4);
            }
            AnonymousClass0PD r0 = r3.A0C;
            A062.setAlpha(r0 == null ? 1.0f : r0.A00);
        }
    }

    public final void A02() {
        if (!this.A02) {
            this.A02 = true;
            HashSet hashSet = this.A06;
            if (hashSet.isEmpty()) {
                A00();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((AnonymousClass024) it.next()).A01();
            }
        }
    }

    public final void A03(C03650Ji r7, C03890Kg r8) {
        C03650Ji r0;
        int[] iArr = AnonymousClass0ND.A00;
        int ordinal = r7.ordinal();
        int i2 = iArr[ordinal];
        if (ordinal != 1) {
            if (i2 == 2) {
                if (AnonymousClass02C.A02(2)) {
                    StringBuilder A0q = AnonymousClass000.A0q("SpecialEffectsController: For fragment ");
                    A0q.append(this.A04);
                    A0q.append(" mFinalState = ");
                    A0q.append(this.A01);
                    A0q.append(" -> REMOVED. mLifecycleImpact  = ");
                    A0q.append(this.A00);
                    Log.v("FragmentManager", AnonymousClass000.A0h(" to REMOVING.", A0q));
                }
                this.A01 = C03890Kg.REMOVED;
                r0 = C03650Ji.REMOVING;
            } else if (i2 == 3 && this.A01 != C03890Kg.REMOVED) {
                if (AnonymousClass02C.A02(2)) {
                    StringBuilder A0q2 = AnonymousClass000.A0q("SpecialEffectsController: For fragment ");
                    A0q2.append(this.A04);
                    A0q2.append(" mFinalState = ");
                    A0q2.append(this.A01);
                    A0q2.append(" -> ");
                    A0q2.append(r8);
                    Log.v("FragmentManager", AnonymousClass000.A0h(". ", A0q2));
                }
                this.A01 = r8;
                return;
            } else {
                return;
            }
        } else if (this.A01 == C03890Kg.REMOVED) {
            if (AnonymousClass02C.A02(2)) {
                StringBuilder A0q3 = AnonymousClass000.A0q("SpecialEffectsController: For fragment ");
                A0q3.append(this.A04);
                A0q3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                A0q3.append(this.A00);
                Log.v("FragmentManager", AnonymousClass000.A0h(" to ADDING.", A0q3));
            }
            this.A01 = C03890Kg.VISIBLE;
            r0 = C03650Ji.ADDING;
        } else {
            return;
        }
        this.A00 = r0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Operation ");
        A0r.append("{");
        AnonymousClass000.A1G(this, A0r);
        A0r.append("} ");
        A0r.append("{");
        A0r.append("mFinalState = ");
        A0r.append(this.A01);
        A0r.append("} ");
        A0r.append("{");
        A0r.append("mLifecycleImpact = ");
        A0r.append(this.A00);
        A0r.append("} ");
        A0r.append("{");
        A0r.append("mFragment = ");
        A0r.append(this.A04);
        return AnonymousClass000.A0h("}", A0r);
    }
}
