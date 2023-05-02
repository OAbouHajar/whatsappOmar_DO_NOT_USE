package com.obwhatsapp.wabloks.base;

import X.AnonymousClass01A;
import X.AnonymousClass01D;
import X.AnonymousClass026;
import X.AnonymousClass027;
import X.AnonymousClass1MR;
import X.AnonymousClass22A;
import X.AnonymousClass2KR;
import X.AnonymousClass2WZ;
import X.AnonymousClass2Wa;
import X.AnonymousClass53P;
import X.C001000l;
import X.C004601z;
import X.C006602z;
import X.C14910pz;
import X.C14950q3;
import X.C14960q4;
import X.C14980q6;
import X.C20150za;
import X.C25261Jc;
import X.C29671b0;
import X.C35001lD;
import X.C49852We;
import X.C56072ku;
import X.C62183Bz;
import X.C90154da;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxObserverShape36S0200000_2_I0;
import com.facebook.rendercore.RootHostView;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import java.util.List;

public abstract class BkFragment extends AnonymousClass01A {
    public RootHostView A00;
    public C49852We A01;
    public AnonymousClass2Wa A02;
    public AnonymousClass22A A03;
    public AnonymousClass2KR A04;
    public C56072ku A05;
    public AnonymousClass01D A06;

    public void A0T(Bundle bundle) {
        if (this.A05 == null) {
            super.A0T(bundle);
            return;
        }
        throw new IllegalStateException("arguments already set");
    }

    public void A13() {
        C49852We r1 = this.A01;
        if (r1 != null) {
            r1.A04();
            this.A01 = null;
        }
        this.A00 = null;
        super.A13();
    }

    public void A14() {
        super.A14();
        this.A04.AA9().A00(A0C(), (C25261Jc) this.A06.get(), this.A03);
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        AnonymousClass01A r2 = this.A0D;
        C001000l A0C = A0C();
        if (r2 instanceof AnonymousClass2KR) {
            this.A04 = (AnonymousClass2KR) r2;
        } else if (A0C instanceof AnonymousClass2KR) {
            this.A04 = (AnonymousClass2KR) A0C;
        } else {
            A0C.finish();
        }
        AnonymousClass22A AH1 = this.A04.AH1();
        this.A03 = AH1;
        this.A04.AA9().A00(A0C(), (C25261Jc) this.A06.get(), AH1);
        String string = A04().getString("data_module_job_id");
        String string2 = A04().getString("data_module_namespace");
        if (!(string == null || string2 == null)) {
            AnonymousClass1MR r0 = (AnonymousClass1MR) this.A03.A00().get(R.id.bloks_data_module_namespace_manager);
            r0.A00 = string;
            r0.A01 = string2;
        }
        C56072ku r22 = (C56072ku) new C006602z(this).A01(A1A());
        this.A05 = r22;
        AnonymousClass2Wa r3 = this.A02;
        if (r3 != null) {
            if (!r22.A01) {
                r22.A01 = true;
                AnonymousClass027 r1 = new AnonymousClass027();
                r22.A00 = r1;
                AnonymousClass53P r23 = new AnonymousClass53P(r1, (AnonymousClass22A) null);
                AnonymousClass2WZ r12 = new AnonymousClass2WZ();
                r12.A01 = r3;
                r12.A00 = 5;
                r23.AWO(r12);
                return;
            }
            throw new IllegalStateException("BkLayoutViewModel was already initialized");
        } else if (A04().containsKey("screen_name")) {
            String string3 = A04().getString("screen_params");
            String string4 = A04().getString("qpl_params");
            C56072ku r5 = this.A05;
            AnonymousClass22A r4 = this.A03;
            String string5 = A04().getString("screen_name");
            if (string5 != null) {
                C35001lD r6 = (C35001lD) A04().getParcelable("screen_cache_config");
                if (!r5.A01) {
                    r5.A01 = true;
                    AnonymousClass026 r32 = new AnonymousClass026();
                    AnonymousClass027 r24 = new AnonymousClass027();
                    r32.A0D(r24, new IDxObserverShape36S0200000_2_I0(r32, 11, r5));
                    r5.A00 = r32;
                    ((C20150za) r5.A02.get()).A01(r6, new AnonymousClass53P(r24, r4), (Boolean) null, string5, string3, string4);
                    return;
                }
                throw new IllegalStateException("BkLayoutViewModel was already initialized");
            }
            throw new IllegalStateException("BkFragment is missing screen name");
        } else if (bundle != null) {
            A0D().onBackPressed();
        } else {
            throw new IllegalStateException("data missing for init");
        }
    }

    public void A18(Bundle bundle, View view) {
        this.A00 = (RootHostView) C004601z.A0E(view, A19());
        C56072ku r1 = this.A05;
        if (r1.A01) {
            r1.A00.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 314));
            return;
        }
        throw new IllegalStateException("BkLayoutViewModel must be initialized");
    }

    public int A19() {
        return R.id.bloks_container;
    }

    public Class A1A() {
        return WaBkExtensionsLayoutViewModel.class;
    }

    public void A1B() {
    }

    public final void A1C() {
        if (this.A05 == null) {
            A0T(new Bundle());
        }
    }

    public final void A1D(C29671b0 r7, List list) {
        if (r7 != null && r7.A9V() != null) {
            AnonymousClass22A r5 = this.A03;
            C14980q6.A00(C14960q4.A00(C62183Bz.A01(C90154da.A00().A00, new SparseArray(), (C14910pz) null, r5, (String) null), (List) null), list == null ? C14950q3.A01 : new C14950q3(list), r7.A9V());
        }
    }

    public void A1E(String str) {
        A1C();
        A04().putSerializable("screen_params", str);
    }

    public void A1F(String str) {
        A1C();
        A04().putString("screen_name", str);
    }

    public void A1G(String str, String str2) {
        A1C();
        A04().putString("data_module_job_id", str);
        A04().putString("data_module_namespace", str2);
    }
}
