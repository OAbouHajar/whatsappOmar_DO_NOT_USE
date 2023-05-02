package com.obwhatsapp.languageselector;

import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass3BW;
import X.C001000l;
import X.C004601z;
import X.C04200Lo;
import X.C04210Lp;
import X.C108825Pq;
import X.C109345Rt;
import X.C13680ns;
import X.C15450qv;
import X.C16040sK;
import X.C19060xh;
import X.C26861Pn;
import X.C34331k5;
import X.C56662oI;
import X.C58082sh;
import X.C94644lF;
import X.C94674lI;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.redex.IDxIListenerShape218S0100000_2_I1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.BottomSheetListView;
import com.obwhatsapp.R;

public class LanguageSelectorBottomSheet extends Hilt_LanguageSelectorBottomSheet {
    public C16040sK A00;
    public AnonymousClass01V A01;
    public AnonymousClass013 A02;
    public C19060xh A03;
    public C108825Pq A04;
    public C109345Rt A05;
    public C26861Pn A06;

    public void A0k() {
        super.A0k();
        C109345Rt r0 = this.A05;
        if (r0 != null) {
            r0.ASY();
        }
        this.A04 = null;
        this.A05 = null;
    }

    public void A0q() {
        Window window;
        super.A0q();
        C109345Rt r0 = this.A05;
        if (r0 != null) {
            r0.ASa();
        }
        Dialog dialog = this.A03;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                C04210Lp.A00(window, false);
            } else {
                C04200Lo.A00(window, false);
            }
            dialog.findViewById(R.id.container).setFitsSystemWindows(false);
            dialog.findViewById(R.id.coordinator).setFitsSystemWindows(false);
            C004601z.A0k(dialog.findViewById(R.id.container), new IDxIListenerShape218S0100000_2_I1(this, 3));
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout0379, viewGroup);
        C34331k5.A03(C004601z.A0E(inflate, R.id.closeButton), this, 32);
        BottomSheetListView bottomSheetListView = (BottomSheetListView) C004601z.A0E(inflate, R.id.languageSelectorListView);
        C001000l A0C = A0C();
        AnonymousClass013 r3 = this.A02;
        bottomSheetListView.setAdapter(new C56662oI(A0C, r3, AnonymousClass3BW.A01(this.A00, this.A01, r3), AnonymousClass3BW.A02()));
        bottomSheetListView.setOnItemClickListener(new C94674lI(bottomSheetListView, this));
        if (C15450qv.A03()) {
            A1N(C004601z.A0E(inflate, R.id.divider), bottomSheetListView);
        }
        return inflate;
    }

    public void A15() {
        super.A15();
        C109345Rt r0 = this.A05;
        if (r0 != null) {
            r0.ASY();
        }
    }

    public void A1M(View view) {
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(view);
        A002.A0E = new C58082sh(A002, this);
        Point point = new Point();
        C13680ns.A0s(A0D(), point);
        A002.A0L((int) (((double) point.y) * 0.5d));
    }

    public final void A1N(View view, BottomSheetListView bottomSheetListView) {
        bottomSheetListView.setOnScrollListener(new C94644lF(view, bottomSheetListView, this, A03().getDimensionPixelSize(R.dimen.dimen04c1)));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C108825Pq r0 = this.A04;
        if (r0 != null) {
            r0.ASZ();
        }
        C109345Rt r02 = this.A05;
        if (r02 != null) {
            r02.ASY();
        }
    }
}
