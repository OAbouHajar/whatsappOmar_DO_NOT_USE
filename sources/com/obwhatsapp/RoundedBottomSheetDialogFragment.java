package com.obwhatsapp;

import X.C17070uU;
import X.C17080uV;
import X.C54472hZ;
import android.app.Dialog;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxSListenerShape78S0200000_2_I0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;
import com.obwhatsapp.calling.callgrid.view.MenuBottomSheet;
import com.obwhatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment;
import com.obwhatsapp.languageselector.LanguageSelectorBottomSheet;
import com.obwhatsapp.permissions.RequestPermissionsBottomSheet;

public abstract class RoundedBottomSheetDialogFragment extends Hilt_RoundedBottomSheetDialogFragment {
    public C17070uU A00;
    public C17080uV A01;

    public void A0o(boolean z2) {
        C54472hZ.A02(this, this.A00, this.A01, this.A0j, z2);
        super.A0o(z2);
    }

    public int A19() {
        return this instanceof RequestPermissionsBottomSheet ? R.style.style022f : this instanceof LanguageSelectorBottomSheet ? R.style.style01ae : this instanceof GroupJoinRequestReasonBottomSheetFragment ? R.style.style0230 : this instanceof MenuBottomSheet ? R.style.style01cf : this instanceof CartFragment ? R.style.style00fc : R.style.style0232;
    }

    public Dialog A1B(Bundle bundle) {
        Dialog A1B = super.A1B(bundle);
        A1B.setOnShowListener(new IDxSListenerShape78S0200000_2_I0(A1B, 0, this));
        return A1B;
    }

    public int A1L() {
        Point point = new Point();
        A0D().getWindowManager().getDefaultDisplay().getSize(point);
        Rect rect = new Rect();
        A0D().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return point.y - rect.top;
    }

    public void A1M(View view) {
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(view);
        A002.A0M(3);
        A002.A0N = true;
        A002.A0L(view.getHeight());
    }
}
