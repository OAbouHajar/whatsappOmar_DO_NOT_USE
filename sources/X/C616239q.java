package X;

import android.text.TextUtils;
import com.facebook.redex.IDxComparatorShape184S0100000_2_I1;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.39q  reason: invalid class name and case insensitive filesystem */
public class C616239q {
    public List A00;
    public Set A01 = C13680ns.A0o();
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public final C17180uf A05;
    public final AnonymousClass5P1 A06;
    public final AnonymousClass4HI A07;
    public final AnonymousClass013 A08;

    public C616239q(C17180uf r2, AnonymousClass5P0 r3, AnonymousClass5P1 r4, AnonymousClass013 r5) {
        this.A08 = r5;
        this.A05 = r2;
        this.A07 = r3.A6v(r4);
        this.A06 = r4;
    }

    public AnonymousClass4R9 A00() {
        ArrayList A0u = AnonymousClass000.A0u();
        for (C31241dn r0 : this.A01) {
            A0u.add(r0.A00);
        }
        if (A0u.isEmpty()) {
            A0u = null;
        }
        return new AnonymousClass4R9(this.A04 ? C13680ns.A0Y() : null, A0u, this.A03);
    }

    public final C31301dt A01(C29101a2 r11) {
        Integer A0Y = this.A04 ? C13680ns.A0Y() : null;
        AnonymousClass4HI r2 = this.A07;
        Set set = this.A01;
        List list = this.A00;
        boolean z2 = this.A03;
        boolean z3 = this.A02;
        ArrayList A0u = AnonymousClass000.A0u();
        if (r2.A01.AIq()) {
            A0u.add(new C72273lr(z3));
        }
        boolean z4 = true;
        if (list != null && !list.isEmpty()) {
            A0u.add(new C72263lq(set, !set.isEmpty()));
        }
        C14710pd r22 = r2.A00.A02;
        C16620tM r1 = C16620tM.A02;
        if (r22.A0E(r1, 450) && r22.A0E(r1, 1510)) {
            if (A0Y == null) {
                z4 = false;
            }
            A0u.add(new C72293lt(z4));
        }
        A0u.add(new C72283ls(z2));
        if (!set.isEmpty() || A0Y != null || z2 || z3) {
            A0u.add(new C72253lp());
        }
        if (!A0u.isEmpty()) {
            return new C72033lS(r11, A0u);
        }
        return null;
    }

    public C31301dt A02(C29101a2 r7, List list) {
        if (!this.A05.A01()) {
            return null;
        }
        HashSet A0o = C13680ns.A0o();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C31241dn r0 = (C31241dn) it.next();
            A0o.add(new C31241dn(r0.A00, r0.A01));
        }
        A0o.addAll(this.A01);
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it2 = A0o.iterator();
        while (it2.hasNext()) {
            C31241dn r02 = (C31241dn) it2.next();
            A0u.add(new C73563oM(r02.A00, r02.A01));
        }
        this.A00 = A0u;
        return A01(r7);
    }

    public AnonymousClass4HN A03() {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        ArrayList A0n = C13680ns.A0n(list);
        Collections.sort(A0n, new IDxComparatorShape184S0100000_2_I1(Collator.getInstance(C13690nt.A0m(this.A08)), 2));
        return new AnonymousClass4HN(A0n, C13680ns.A0n(this.A01));
    }

    public String A04() {
        if (this.A01.isEmpty()) {
            return null;
        }
        ArrayList A0u = AnonymousClass000.A0u();
        for (C31241dn r0 : this.A01) {
            A0u.add(r0.A00);
        }
        return TextUtils.join(",", A0u);
    }

    public void A05() {
        this.A03 = false;
        this.A04 = false;
        this.A01 = C13680ns.A0o();
        this.A02 = false;
    }

    public void A06(C016407u r4) {
        Map map = r4.A03;
        Boolean bool = (Boolean) map.get("saved_open_now");
        boolean z2 = false;
        this.A04 = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) map.get("saved_has_catalog");
        this.A03 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = (Boolean) map.get("saved_distance");
        if (bool3 != null) {
            z2 = bool3.booleanValue();
        }
        this.A02 = z2;
        Collection collection = (Collection) map.get("saved_selected_multiple_choice_category");
        this.A01 = collection != null ? new HashSet(collection) : C13680ns.A0o();
        this.A00 = (List) map.get("saved_current_filter_categories");
    }

    public void A07(C016407u r3) {
        r3.A06("saved_open_now", Boolean.valueOf(this.A04));
        r3.A06("saved_has_catalog", Boolean.valueOf(this.A03));
        r3.A06("saved_distance", Boolean.valueOf(this.A02));
        r3.A06("saved_selected_multiple_choice_category", C13680ns.A0n(this.A01));
        r3.A06("saved_current_filter_categories", this.A00);
    }

    public boolean A08() {
        return this.A01.isEmpty() && !this.A04 && !this.A03;
    }
}
