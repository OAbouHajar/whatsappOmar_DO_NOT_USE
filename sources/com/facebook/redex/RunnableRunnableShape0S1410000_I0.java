package com.facebook.redex;

import X.AnonymousClass01A;
import X.AnonymousClass168;
import X.AnonymousClass1JU;
import X.AnonymousClass1Z6;
import X.AnonymousClass32N;
import X.C001000l;
import X.C006602z;
import X.C102384yr;
import X.C14710pd;
import X.C15860rz;
import X.C16150sX;
import X.C17130ua;
import X.C17270uo;
import X.C18450wi;
import X.C25351Jl;
import X.C55222j6;
import android.app.Activity;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import java.util.Map;

public class RunnableRunnableShape0S1410000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final int A06;

    public RunnableRunnableShape0S1410000_I0(Object obj, Object obj2, Object obj3, Object obj4, String str, int i2, boolean z2) {
        this.A06 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A02 = obj3;
        this.A05 = z2;
        this.A03 = obj4;
    }

    public final void run() {
        AnonymousClass01A A0B;
        AnonymousClass01A A0B2;
        if (this.A06 != 0) {
            String str = this.A04;
            Activity activity = (Activity) this.A00;
            C25351Jl r5 = (C25351Jl) this.A01;
            AnonymousClass1Z6 r4 = (AnonymousClass1Z6) this.A02;
            Map map = (Map) this.A03;
            boolean z2 = this.A05;
            C18450wi.A0H(str, 0);
            if (!(!str.equals("error") || (A0B = ((C001000l) activity).AGM().A0B("extensions_bottom_sheet_container")) == null || (A0B2 = A0B.A0F().A0B("BK_FRAGMENT")) == null)) {
                WaBkExtensionsLayoutViewModel.A01(activity, (AnonymousClass1JU) null, (WaBkExtensionsLayoutViewModel) new C006602z(A0B2).A01(WaBkExtensionsLayoutViewModel.class), (String) null, (String) null, "extensions-fetch-catalog-error", 28, z2);
            }
            r5.A03.A00(r4, "fetch_catalog").A02(str, map);
            return;
        }
        C25351Jl r42 = (C25351Jl) this.A00;
        String str2 = this.A04;
        boolean z3 = this.A05;
        C18450wi.A0H(str2, 2);
        C16150sX r52 = r42.A00.A00.A01;
        new AnonymousClass32N((C17130ua) r52.AN9.get(), (C55222j6) this.A01, (C15860rz) r52.AQh.get(), (C14710pd) r52.A05.get(), (AnonymousClass168) r52.AAi.get(), C17270uo.A00(r52.AQV), str2, r52.A8F, r52.A8G).Aah(new C102384yr((Activity) this.A02, (AnonymousClass1Z6) this.A03, r42, z3));
    }
}
