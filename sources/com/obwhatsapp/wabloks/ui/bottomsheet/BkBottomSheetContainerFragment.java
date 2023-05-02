package com.obwhatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass01A;
import X.AnonymousClass01D;
import X.AnonymousClass01Q;
import X.AnonymousClass050;
import X.AnonymousClass1K6;
import X.AnonymousClass22N;
import X.AnonymousClass5w6;
import X.AnonymousClass5wN;
import X.C110115dX;
import X.C13680ns;
import X.C29671b0;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;

public class BkBottomSheetContainerFragment extends Hilt_BkBottomSheetContainerFragment {
    public LinearLayout A00;
    public AnonymousClass01Q A01;
    public C29671b0 A02;
    public AnonymousClass01D A03;

    public void A0s(Bundle bundle) {
        AnonymousClass050 r0 = new AnonymousClass050(A0D().AGM());
        r0.A07(this);
        r0.A02();
        super.A0s(bundle);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object obj;
        Object obj2;
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout05fb);
        this.A00 = C110115dX.A05(A0H, R.id.wa_bloks_bottom_sheet_fragment_container);
        AnonymousClass01Q r0 = this.A01;
        if (!(r0 == null || (obj = r0.A00) == null || (obj2 = r0.A01) == null)) {
            AnonymousClass050 r1 = new AnonymousClass050(A0F());
            r1.A0E((AnonymousClass01A) obj, (String) obj2, this.A00.getId());
            r1.A01();
        }
        return A0H;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.A02 != null) {
            WaBloksActivity waBloksActivity = (WaBloksActivity) A0D();
            C29671b0 r1 = this.A02;
            if (!(r1 == null || r1.A9V() == null)) {
                AnonymousClass1K6.A0A(waBloksActivity.A01, r1);
            }
        }
        ((AnonymousClass5wN) this.A03.get()).A00(AnonymousClass22N.A00(A0u()));
        AnonymousClass5w6.A01.pop();
        super.onDismiss(dialogInterface);
    }
}
