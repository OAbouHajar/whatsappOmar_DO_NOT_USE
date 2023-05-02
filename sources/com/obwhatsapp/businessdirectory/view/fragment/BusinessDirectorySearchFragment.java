package com.obwhatsapp.businessdirectory.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass04o;
import X.AnonymousClass068;
import X.AnonymousClass07J;
import X.AnonymousClass1PX;
import X.AnonymousClass38U;
import X.AnonymousClass38W;
import X.AnonymousClass3F7;
import X.AnonymousClass3FJ;
import X.AnonymousClass3RR;
import X.AnonymousClass4CQ;
import X.AnonymousClass4KG;
import X.AnonymousClass5T5;
import X.C001000l;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C016407u;
import X.C109235Rf;
import X.C13680ns;
import X.C13690nt;
import X.C16260sj;
import X.C17180uf;
import X.C17570vI;
import X.C18890xQ;
import X.C31241dn;
import X.C57222qT;
import X.C57272qc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxPCallbackShape18S0100000_2_I1;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.util.LocationUpdateListener;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.obwhatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import com.obwhatsapp.nativediscovery.view.pagination.IDxSListenerShape90S0100000_2_I1;
import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.Set;

public class BusinessDirectorySearchFragment extends Hilt_BusinessDirectorySearchFragment implements AnonymousClass5T5, C109235Rf {
    public RecyclerView A00;
    public Chip A01;
    public AnonymousClass38U A02;
    public AnonymousClass4CQ A03;
    public C18890xQ A04;
    public C17180uf A05;
    public AnonymousClass1PX A06;
    public LocationUpdateListener A07;
    public C17570vI A08;
    public AnonymousClass38W A09;
    public AnonymousClass3FJ A0A;
    public C57272qc A0B;
    public C16260sj A0C;
    public AnonymousClass013 A0D;
    public AnonymousClass3RR A0E;
    public final AnonymousClass068 A0F = new IDxPCallbackShape18S0100000_2_I1(this, 0);

    public static BusinessDirectorySearchFragment A01() {
        BusinessDirectorySearchFragment businessDirectorySearchFragment = new BusinessDirectorySearchFragment();
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putString("argument_business_list_search_state", "nearby_business");
        businessDirectorySearchFragment.A0T(A0D2);
        return businessDirectorySearchFragment;
    }

    public static BusinessDirectorySearchFragment A02() {
        BusinessDirectorySearchFragment businessDirectorySearchFragment = new BusinessDirectorySearchFragment();
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putBoolean("FORCE_ROOT_CATEGORIES", true);
        businessDirectorySearchFragment.A0T(A0D2);
        return businessDirectorySearchFragment;
    }

    public static BusinessDirectorySearchFragment A03(Jid jid, String str) {
        BusinessDirectorySearchFragment businessDirectorySearchFragment = new BusinessDirectorySearchFragment();
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putParcelable("directory_biz_chaining_jid", jid);
        A0D2.putString("directory_biz_chaining_name", str);
        businessDirectorySearchFragment.A0T(A0D2);
        return businessDirectorySearchFragment;
    }

    public void A0l(Bundle bundle) {
        this.A0V = true;
        AnonymousClass01A A0B2 = A0F().A0B("filter-bottom-sheet");
        if (A0B2 != null) {
            ((FilterBottomSheetDialogFragment) A0B2).A02 = this;
        }
        this.A0A.A01();
    }

    public void A0s(Bundle bundle) {
        C57272qc r3 = this.A0B;
        C016407u r2 = r3.A0D;
        r2.A06("saved_search_state_stack", C13680ns.A0n(r3.A05));
        r2.A06("saved_second_level_category", r3.A0T.A01());
        r2.A06("saved_parent_category", r3.A0S.A01());
        r2.A06("saved_search_state", Integer.valueOf(r3.A02));
        r2.A06("saved_force_root_category", Boolean.valueOf(r3.A06));
        r2.A06("saved_consumer_home_type", Integer.valueOf(r3.A01));
        r3.A0L.A07(r2);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0296);
        this.A00 = (RecyclerView) C004601z.A0E(A0H, R.id.search_list);
        this.A01 = (Chip) C004601z.A0E(A0H, R.id.update_results_chip);
        A0u();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.A0E = new IDxSListenerShape90S0100000_2_I1(this, 1);
        this.A00.setLayoutManager(linearLayoutManager);
        this.A00.A0o(this.A0E);
        this.A00.setAdapter(this.A08);
        this.A0K.A00(this.A07);
        C13680ns.A1N(A0H(), this.A07.A00, this.A0A, 23);
        C13680ns.A1N(A0H(), this.A0B.A0V, this, 34);
        C13690nt.A1J(A0H(), this.A0B.A0Q, this.A0A, 9);
        C57272qc r2 = this.A0B;
        AnonymousClass3F7 r1 = r2.A0O;
        if (r1.A00.A01() == null) {
            r1.A06();
        }
        C13680ns.A1N(A0H(), r2.A0C, this, 36);
        C13680ns.A1N(A0H(), this.A0B.A0R, this, 33);
        C13680ns.A1N(A0H(), this.A0B.A08, this, 32);
        C13680ns.A1N(A0H(), this.A0B.A0U, this, 31);
        C13680ns.A1N(A0H(), this.A0B.A0O.A03, this.A0A, 24);
        C13680ns.A1N(A0H(), this.A0B.A0B, this, 35);
        A0D().A04.A01(this.A0F, A0H());
        C13680ns.A18(this.A01, this, 7);
        C57272qc r22 = this.A0B;
        if (r22.A0F.A0A() && r22.A0O.A00.A00 != 4) {
            C13680ns.A1P(r22.A0V, 0);
        }
        return A0H;
    }

    public void A12() {
        super.A12();
        this.A06.A01(this.A0A);
        Iterator it = this.A0F.A00.iterator();
        while (it.hasNext()) {
            ((AnonymousClass07J) it.next()).cancel();
        }
        C001000l A0C2 = A0C();
        if (A0C2 == null || A0C2.isFinishing()) {
            this.A0B.A0I.A00();
        }
    }

    public void A13() {
        super.A13();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A0p(this.A0E);
            this.A00.setAdapter((AnonymousClass01X) null);
            this.A00 = null;
        }
    }

    public void A14() {
        super.A14();
        C57272qc r2 = this.A0B;
        Iterator it = r2.A0W.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0W("isVisibilityChanged");
        } else {
            r2.A0O.A06();
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        boolean z2 = A1B().A0F;
        boolean z3 = A04().getBoolean("FORCE_ROOT_CATEGORIES");
        String string = A04().getString("argument_business_list_search_state");
        this.A0B = (C57272qc) new C006602z((AnonymousClass04o) new C57222qT(bundle, this, this.A03, (C31241dn) A04().getParcelable("INITIAL_CATEGORY"), (Jid) A04().getParcelable("directory_biz_chaining_jid"), string, z3, z2), (C001500q) this).A01(C57272qc.class);
        AnonymousClass3FJ A002 = this.A02.A00(this, this.A07, this);
        this.A0A = A002;
        this.A06.A00(A002);
    }

    public final BusinessDirectoryActivity A1B() {
        if (A0D() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) A0D();
        }
        throw AnonymousClass000.A0V("BusinessDirectorySearchFragment should be attached to BusinessDirectoryActivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        r1.setTitle(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        A0D().setTitle(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r0 = A0J(r0);
        r1 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1C(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r4 = 1
            r3 = 0
            switch(r0) {
                case -1126816384: goto L_0x0011;
                case 23561082: goto L_0x0021;
                case 1014375387: goto L_0x0035;
                case 2044323616: goto L_0x0050;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.00l r0 = r5.A0D()
            r0.setTitle(r6)
        L_0x0010:
            return
        L_0x0011:
            java.lang.String r0 = "nearby_business"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.00l r1 = r5.A0D()
            r0 = 2131886530(0x7f1201c2, float:1.9407641E38)
            goto L_0x0030
        L_0x0021:
            java.lang.String r0 = "all_categories"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.00l r1 = r5.A0D()
            r0 = 2131886496(0x7f1201a0, float:1.9407572E38)
        L_0x0030:
            java.lang.String r0 = r5.A0J(r0)
            goto L_0x0078
        L_0x0035:
            java.lang.String r0 = "product_name"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r1 = r5.A1B()
            X.0uf r0 = r1.A02
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0071
            r0 = 2131886575(0x7f1201ef, float:1.9407733E38)
            r1.setTitle(r0)
            return
        L_0x0050:
            java.lang.String r0 = "business_chaining"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.os.Bundle r1 = r5.A04()
            java.lang.String r0 = "directory_biz_chaining_name"
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L_0x0010
            r1 = 2131886558(0x7f1201de, float:1.9407698E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C13690nt.A0c(r5, r2, r0, r3, r1)
            r5.A1C(r0)
            return
        L_0x0071:
            r0 = 2131886610(0x7f120212, float:1.9407804E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0078:
            r1.setTitle(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment.A1C(java.lang.String):void");
    }

    public void ANl() {
        this.A0B.A0D(62);
    }

    public void AT3() {
        AnonymousClass3F7 r1 = this.A0B.A0O;
        r1.A06.A01();
        C13680ns.A1O(r1.A03, 2);
    }

    public void AT4() {
        this.A0B.A0O.A04();
    }

    public void AT9() {
        this.A0B.A0O.A05();
    }

    public void ATB(AnonymousClass4KG r2) {
        this.A0B.A0O.A07(r2);
    }

    public void ATp(Set set) {
        C57272qc r1 = this.A0B;
        r1.A0L.A01 = set;
        r1.A0B();
        this.A0B.A0D(64);
    }

    public void AcR() {
        C13680ns.A1O(this.A0B.A0O.A03, 2);
    }

    public void Aha() {
        this.A0B.A0O.A06();
    }
}
