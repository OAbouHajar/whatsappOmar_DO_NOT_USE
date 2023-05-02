package com.obwhatsapp;

import X.C001000l;
import X.C005302h;
import X.C13680ns;
import X.C13690nt;
import X.C32241fu;
import X.C49282Sg;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;

public class SingleSelectionDialogFragment extends Hilt_SingleSelectionDialogFragment {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public boolean A04;
    public String[] A05;

    public static Bundle A01(String[] strArr, int i2, int i3, int i4) {
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("dialogId", i2);
        A0D.putInt("currentIndex", i3);
        A0D.putInt("dialogTitleResId", i4);
        A0D.putStringArray("items", strArr);
        A0D.putBoolean("showConfirmation", true);
        return A0D;
    }

    public static SingleSelectionDialogFragment A02(int i2, int i3, int i4, int i5) {
        SingleSelectionDialogFragment singleSelectionDialogFragment = new SingleSelectionDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("dialogId", i2);
        A0D.putInt("currentIndex", i4);
        A0D.putInt("dialogTitleResId", i3);
        A0D.putInt("itemsArrayResId", i5);
        singleSelectionDialogFragment.A0T(A0D);
        return singleSelectionDialogFragment;
    }

    public static SingleSelectionDialogFragment A03(String[] strArr, int i2, int i3) {
        SingleSelectionDialogFragment singleSelectionDialogFragment = new SingleSelectionDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("dialogId", i2);
        A0D.putInt("currentIndex", i3);
        A0D.putInt("dialogTitleResId", R.string.str1d9a);
        A0D.putStringArray("items", strArr);
        singleSelectionDialogFragment.A0T(A0D);
        return singleSelectionDialogFragment;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        Bundle bundle2 = this.A05;
        this.A01 = bundle2.getInt("dialogId");
        this.A00 = bundle2.getInt("currentIndex");
        this.A03 = bundle2.containsKey("dialogTitleResId") ? A0J(bundle2.getInt("dialogTitleResId")) : bundle2.getString("dialogTitle");
        this.A05 = bundle2.containsKey("itemsArrayResId") ? A03().getStringArray(bundle2.getInt("itemsArrayResId")) : bundle2.getStringArray("items");
        this.A04 = bundle2.getBoolean("showConfirmation", false);
    }

    public Dialog A1B(Bundle bundle) {
        return A1N().create();
    }

    public C005302h A1N() {
        C32241fu A002 = C32241fu.A00(A0C());
        A002.setTitle(this.A03);
        int i2 = this.A00;
        this.A02 = i2;
        A002.A05(new IDxCListenerShape128S0100000_2_I1(this, 8), this.A05, i2);
        if (this.A04) {
            C13680ns.A1H(A002, this, 7, R.string.str0e87);
            C13690nt.A1E(A002);
        }
        return A002;
    }

    public final void A1O() {
        C001000l A0C = A0C();
        if (A0C instanceof C49282Sg) {
            ((C49282Sg) A0C).AXH(this.A01, this.A02);
        } else {
            Bundle A0D = C13690nt.A0D();
            A0D.putInt("selectedIndex", this.A02);
            A0G().A0i("single_selection_dialog_result", A0D);
        }
        A1C();
    }
}
