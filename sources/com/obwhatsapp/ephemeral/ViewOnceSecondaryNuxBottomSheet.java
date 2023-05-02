package com.obwhatsapp.ephemeral;

import X.AnonymousClass02C;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C15830rv;
import X.C15860rz;
import X.C16030sJ;
import X.C16490t9;
import X.C17220uj;
import X.C18040w3;
import X.C19980zJ;
import X.C75163ri;
import X.C83734Hv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

public class ViewOnceSecondaryNuxBottomSheet extends Hilt_ViewOnceSecondaryNuxBottomSheet {
    public int A00 = -1;
    public C19980zJ A01;
    public C15860rz A02;
    public C16490t9 A03;
    public C18040w3 A04;
    public C17220uj A05;
    public String A06 = "-1";
    public boolean A07;

    public static void A01(AnonymousClass02C r4, C83734Hv r5) {
        Bundle A0D = C13690nt.A0D();
        C15830rv r2 = r5.A01;
        A0D.putString("CHAT_JID", r2.getRawString());
        A0D.putInt("MESSAGE_TYPE", r5.A00);
        A0D.putBoolean("IN_GROUP", C16030sJ.A0L(r2));
        ViewOnceSecondaryNuxBottomSheet viewOnceSecondaryNuxBottomSheet = new ViewOnceSecondaryNuxBottomSheet();
        viewOnceSecondaryNuxBottomSheet.A0T(A0D);
        viewOnceSecondaryNuxBottomSheet.A1G(r4, "view_once_nux_secondary");
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle A042 = A04();
        this.A07 = A042.getBoolean("IN_GROUP", false);
        this.A06 = A042.getString("CHAT_JID", "-1");
        this.A00 = A042.getInt("MESSAGE_TYPE", -1);
        return layoutInflater.inflate(R.layout.layout05d5, viewGroup, false);
    }

    public void A18(Bundle bundle, View view) {
        View A0E = C004601z.A0E(view, R.id.vo_sp_bottom_sheet_ok_button);
        View A0E2 = C004601z.A0E(view, R.id.vo_sp_close_button);
        View A0E3 = C004601z.A0E(view, R.id.vo_sp_bottom_sheet_learn_more_button);
        ImageView A0J = C13680ns.A0J(view, R.id.vo_sp_image);
        TextView A0L = C13680ns.A0L(view, R.id.vo_sp_title);
        TextView A0L2 = C13680ns.A0L(view, R.id.vo_sp_summary);
        C13700nu.A0L(A02(), A0J, R.drawable.vo_camera_nux);
        A0L2.setText(A03().getText(R.string.str19ee));
        A0L.setText(A03().getText(R.string.str19ed));
        C13680ns.A16(A0E, this, 13);
        C13680ns.A16(A0E2, this, 15);
        C13680ns.A16(A0E3, this, 14);
        A1N(false);
    }

    public final void A1N(boolean z2) {
        C75163ri r3 = new C75163ri();
        String str = this.A06;
        if (!str.equals("-1")) {
            r3.A00 = Boolean.valueOf(this.A07);
            r3.A03 = this.A04.A03(str);
            int i2 = 2;
            if (this.A00 == 42) {
                i2 = 1;
            }
            r3.A01 = Integer.valueOf(i2);
            int i3 = 3;
            if (z2) {
                i3 = 8;
            }
            r3.A02 = Integer.valueOf(i3);
            this.A03.A06(r3);
        }
    }
}
