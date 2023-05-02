package com.obwhatsapp.userban.ui.fragment;

import X.C004601z;
import X.C13680ns;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public class BanInfoFragment extends Hilt_BanInfoFragment {
    public Button A00;
    public BanAppealViewModel A01;

    public void A0z(Menu menu, MenuInflater menuInflater) {
        menu.add(0, 1, 0, R.string.str1387).setShowAsAction(0);
    }

    public boolean A10(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return false;
        }
        this.A01.A08(A0D(), false);
        return true;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A0a(true);
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout008c);
    }

    public void A18(Bundle bundle, View view) {
        this.A01 = C13680ns.A0W(this);
        BanAppealViewModel.A01(A0D(), false);
        C13680ns.A0J(view, R.id.ban_icon).setImageDrawable(A03().getDrawable(R.drawable.icon_banned));
        TextView A0L = C13680ns.A0L(view, R.id.heading);
        int i2 = C13680ns.A0B(this.A01.A09.A04).getInt("support_ban_appeal_violation_type", 0);
        Log.i(C13680ns.A0c(i2, "BanAppealRepository/getBanViolationType "));
        int i3 = R.string.str015f;
        if (i2 == 15) {
            i3 = R.string.str0160;
        }
        A0L.setText(i3);
        C13680ns.A0L(view, R.id.sub_heading).setText(R.string.str0161);
        this.A00 = (Button) C004601z.A0E(view, R.id.action_button);
        boolean equals = this.A01.A09.A00().equals("IN_REVIEW");
        Button button = this.A00;
        int i4 = R.string.str0162;
        if (equals) {
            i4 = R.string.str0163;
        }
        button.setText(i4);
        C13680ns.A19(this.A00, this, 46);
    }
}
