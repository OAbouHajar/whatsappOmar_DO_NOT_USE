package com.obwhatsapp.ephemeral;

import X.AnonymousClass000;
import X.AnonymousClass02C;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C15830rv;
import X.C15860rz;
import X.C16030sJ;
import X.C16490t9;
import X.C16620tM;
import X.C16740tZ;
import X.C17220uj;
import X.C17800vf;
import X.C18040w3;
import X.C19980zJ;
import X.C75163ri;
import X.C83734Hv;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;

public class ViewOnceNuxBottomSheet extends Hilt_ViewOnceNuxBottomSheet {
    public int A00 = -1;
    public C19980zJ A01;
    public C15860rz A02;
    public C14710pd A03;
    public C16490t9 A04;
    public C18040w3 A05;
    public C17800vf A06;
    public C17220uj A07;
    public String A08 = "-1";
    public boolean A09;
    public boolean A0A;
    public boolean A0B = true;

    public static void A01(AnonymousClass02C r6, C83734Hv r7, C16740tZ r8, boolean z2) {
        C15830rv r1;
        Bundle A0D = C13690nt.A0D();
        if (r8 != null && (r1 = r8.A11.A00) != null) {
            A0D.putString("CHAT_JID", r1.getRawString());
            A0D.putInt("MESSAGE_TYPE", r8.A10);
            A0D.putBoolean("IN_GROUP", C16030sJ.A0L(r1));
            A0D.putBoolean("IS_SENDER", false);
        } else if (r7 != null) {
            C15830rv r12 = r7.A01;
            A0D.putString("CHAT_JID", r12.getRawString());
            A0D.putInt("MESSAGE_TYPE", r7.A00);
            A0D.putBoolean("IN_GROUP", C16030sJ.A0L(r12));
        }
        A0D.putBoolean("FORCE_SHOW", z2);
        ViewOnceNuxBottomSheet viewOnceNuxBottomSheet = new ViewOnceNuxBottomSheet();
        viewOnceNuxBottomSheet.A0T(A0D);
        viewOnceNuxBottomSheet.A1G(r6, "view_once_nux_v2");
    }

    public static boolean A02(AnonymousClass02C r4, C83734Hv r5, C17800vf r6, C16740tZ r7) {
        if (!r4.A0o()) {
            if (!r6.A00((Object) null, AnonymousClass000.A1W(r7) ? "ephemeral_view_once" : "ephemeral_view_once_receiver") && r4.A0B("view_once_nux_v2") == null) {
                A01(r4, r5, r7, false);
                return true;
            }
        }
        return false;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean A0E = this.A03.A0E(C16620tM.A02, 1711);
        int i2 = R.layout.layout05d5;
        if (A0E) {
            i2 = R.layout.layout05d6;
        }
        Bundle A042 = A04();
        this.A09 = A042.getBoolean("IN_GROUP", false);
        this.A08 = A042.getString("CHAT_JID", "-1");
        this.A00 = A042.getInt("MESSAGE_TYPE", -1);
        this.A0A = A042.getBoolean("FORCE_SHOW", false);
        this.A0B = A042.getBoolean("IS_SENDER", true);
        return layoutInflater.inflate(i2, viewGroup, false);
    }

    public void A14() {
        super.A14();
        if (!this.A0A) {
            if (this.A06.A00((Object) null, this.A0B ? "ephemeral_view_once" : "ephemeral_view_once_receiver")) {
                A1D();
            }
        }
    }

    public void A18(Bundle bundle, View view) {
        TextView A0L;
        int i2;
        View A0E = C004601z.A0E(view, R.id.vo_sp_bottom_sheet_ok_button);
        View A0E2 = C004601z.A0E(view, R.id.vo_sp_close_button);
        View A0E3 = C004601z.A0E(view, R.id.vo_sp_bottom_sheet_learn_more_button);
        C14710pd r1 = this.A03;
        C16620tM r8 = C16620tM.A02;
        if (r1.A0E(r8, 1711)) {
            TextView A0L2 = C13680ns.A0L(view, R.id.vo_sp_title);
            TextView A0L3 = C13680ns.A0L(view, R.id.vo_sp_first_bullet_summary);
            A0L = C13680ns.A0L(view, R.id.vo_sp_second_bullet_summary);
            if (this.A0B) {
                C13680ns.A1F(A0L2, this, R.string.str19eb);
                C13680ns.A1F(A0L3, this, R.string.str19ec);
                i2 = R.string.str19ea;
            } else if (this.A03.A0E(r8, 2802)) {
                C13680ns.A1F(A0L2, this, R.string.str19f1);
                C13680ns.A1F(A0L3, this, R.string.str19ef);
                i2 = R.string.str19f0;
            } else if (this.A00 == 42) {
                C13680ns.A1F(A0L2, this, R.string.str1a01);
                C13680ns.A1F(A0L3, this, R.string.str19e6);
                i2 = R.string.str1a03;
            } else {
                C13680ns.A1F(A0L2, this, R.string.str1a15);
                C13680ns.A1F(A0L3, this, R.string.str19e7);
                i2 = R.string.str1a04;
            }
        } else {
            TextView A0L4 = C13680ns.A0L(view, R.id.vo_sp_title);
            A0L = C13680ns.A0L(view, R.id.vo_sp_summary);
            if (this.A0B) {
                C13680ns.A1F(A0L4, this, R.string.str19f7);
                i2 = R.string.str19f6;
            } else if (this.A03.A0E(r8, 2802)) {
                C13680ns.A1F(A0L4, this, R.string.str19f1);
                i2 = R.string.str19ef;
            } else if (this.A00 == 42) {
                C13680ns.A1F(A0L4, this, R.string.str19f3);
                i2 = R.string.str19f2;
            } else {
                C13680ns.A1F(A0L4, this, R.string.str19f5);
                i2 = R.string.str19f4;
            }
        }
        C13680ns.A1F(A0L, this, i2);
        C13680ns.A16(A0E, this, 12);
        C13680ns.A16(A0E2, this, 11);
        C13680ns.A16(A0E3, this, 10);
        A1N(false);
    }

    public final void A1N(boolean z2) {
        int i2;
        C75163ri r3 = new C75163ri();
        String str = this.A08;
        if (!str.equals("-1")) {
            r3.A00 = Boolean.valueOf(this.A09);
            r3.A03 = this.A05.A03(str);
            int i3 = 2;
            if (this.A00 == 42) {
                i3 = 1;
            }
            r3.A01 = Integer.valueOf(i3);
            boolean A0E = this.A03.A0E(C16620tM.A02, 1711);
            boolean z3 = this.A0B;
            if (A0E) {
                if (z3) {
                    i2 = 2;
                    if (z2) {
                        i2 = 7;
                    }
                } else {
                    i2 = 5;
                    if (z2) {
                        i2 = 10;
                    }
                }
            } else if (z3) {
                i2 = 1;
                if (z2) {
                    i2 = 6;
                }
            } else {
                i2 = 4;
                if (z2) {
                    i2 = 9;
                }
            }
            r3.A02 = Integer.valueOf(i2);
            this.A04.A06(r3);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.A06.A00.A00(this.A0B ? "ephemeral_view_once" : "ephemeral_view_once_receiver", (Object) null);
        super.onDismiss(dialogInterface);
    }
}
