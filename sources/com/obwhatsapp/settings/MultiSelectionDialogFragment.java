package com.obwhatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass0PG;
import X.C13690nt;
import X.C32241fu;
import X.C49292Sh;
import X.C91514g2;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape126S0100000_1_I1;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;
import com.obwhatsapp.R;

public class MultiSelectionDialogFragment extends Hilt_MultiSelectionDialogFragment {
    public int A00;
    public C49292Sh A01;
    public String A02;
    public String[] A03;
    public boolean[] A04;

    public static MultiSelectionDialogFragment A01(boolean[] zArr, int i2, int i3) {
        MultiSelectionDialogFragment multiSelectionDialogFragment = new MultiSelectionDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("dialogId", i2);
        A0D.putInt("dialogTitleResId", i3);
        A0D.putInt("itemsResId", R.array.notification_action_tombstone);
        A0D.putBooleanArray("selectedItems", zArr);
        multiSelectionDialogFragment.A0T(A0D);
        return multiSelectionDialogFragment;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        if (A0C() instanceof C49292Sh) {
            Bundle bundle2 = this.A05;
            this.A00 = bundle2.getInt("dialogId");
            this.A02 = A0J(bundle2.getInt("dialogTitleResId"));
            this.A03 = A03().getStringArray(bundle2.getInt("itemsResId"));
            this.A04 = bundle2.getBooleanArray("selectedItems");
            this.A01 = (C49292Sh) A0C();
            return;
        }
        throw AnonymousClass000.A0V(AnonymousClass000.A0h("MultiSelectionDialogListener", AnonymousClass000.A0r("Activity must implement ")));
    }

    public Dialog A1B(Bundle bundle) {
        C32241fu A002 = C32241fu.A00(A0C());
        A002.setTitle(this.A02);
        String[] strArr = this.A03;
        boolean[] zArr = this.A04;
        C91514g2 r0 = new C91514g2(this);
        AnonymousClass0PG r1 = A002.A01;
        r1.A0M = strArr;
        r1.A09 = r0;
        r1.A0N = zArr;
        r1.A0K = true;
        A002.setPositiveButton(R.string.str0e87, new IDxCListenerShape126S0100000_1_I1(this, 4));
        A002.setNegativeButton(R.string.str0394, new IDxCListenerShape23S0000000_2_I1(20));
        return A002.create();
    }
}
