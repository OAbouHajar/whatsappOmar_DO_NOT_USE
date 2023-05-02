package com.obwhatsapp.calling.callgrid.view;

import X.AnonymousClass00B;
import X.C004601z;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

public class MenuBottomSheet extends Hilt_MenuBottomSheet {
    public int A00 = 0;
    public LinearLayout A01;
    public MenuBottomSheetViewModel A02;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout00d1, viewGroup, false);
    }

    public void A18(Bundle bundle, View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        this.A01 = linearLayout;
        C004601z.A0E(linearLayout, R.id.close).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 12));
        MenuBottomSheetViewModel menuBottomSheetViewModel = this.A02;
        if (menuBottomSheetViewModel != null) {
            menuBottomSheetViewModel.A04.A0A(A0H(), new IDxObserverShape113S0100000_1_I0(this, 26));
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        MenuBottomSheetViewModel menuBottomSheetViewModel = this.A02;
        if (menuBottomSheetViewModel != null) {
            int i2 = this.A00;
            if (i2 == 6 || i2 == 7 || i2 == 8) {
                boolean z2 = false;
                if (menuBottomSheetViewModel.A01 != null) {
                    z2 = true;
                }
                AnonymousClass00B.A0B("MenuBottomSheetViewModel/onCallLinkShareOptionSelected/ callLinkData is null", z2);
                menuBottomSheetViewModel.A0B.A0B(new Pair(menuBottomSheetViewModel.A01, Integer.valueOf(i2)));
                return;
            }
            UserJid userJid = menuBottomSheetViewModel.A02;
            if (userJid != null || i2 == 0) {
                menuBottomSheetViewModel.A0C.A0B(new Pair(userJid, Integer.valueOf(i2)));
            }
        }
    }
}
