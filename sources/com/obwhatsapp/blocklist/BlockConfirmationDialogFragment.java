package com.obwhatsapp.blocklist;

import X.AnonymousClass00B;
import X.AnonymousClass01Y;
import X.AnonymousClass3C9;
import X.C004601z;
import X.C005702l;
import X.C14550pN;
import X.C14870pt;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16080sP;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16760tb;
import X.C25931Lr;
import X.C32241fu;
import X.C42771ye;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

public class BlockConfirmationDialogFragment extends Hilt_BlockConfirmationDialogFragment {
    public C14870pt A00;
    public C15900s5 A01;
    public C16760tb A02;
    public C42771ye A03;
    public AnonymousClass01Y A04;
    public C16000sG A05;
    public C16080sP A06;
    public C25931Lr A07;
    public C16440t3 A08;
    public C16490t9 A09;
    public C16320sq A0A;

    public static BlockConfirmationDialogFragment A01(UserJid userJid, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = new BlockConfirmationDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", userJid.getRawString());
        bundle.putString("entryPoint", str);
        bundle.putBoolean("fromSpamPanel", z2);
        bundle.putBoolean("showSuccessToast", z3);
        bundle.putBoolean("showReportAndBlock", z4);
        bundle.putBoolean("keepCurrentActivity", z5);
        blockConfirmationDialogFragment.A0T(bundle);
        return blockConfirmationDialogFragment;
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof C42771ye) {
            this.A03 = (C42771ye) context;
        }
    }

    public Dialog A1B(Bundle bundle) {
        CheckBox checkBox;
        Bundle A042 = A04();
        C14550pN r9 = (C14550pN) A0C();
        AnonymousClass00B.A06(r9);
        AnonymousClass00B.A06(A042);
        String string = A042.getString("jid", (String) null);
        String string2 = A042.getString("entryPoint", (String) null);
        boolean z2 = A042.getBoolean("fromSpamPanel", false);
        boolean z3 = A042.getBoolean("showSuccessToast", false);
        boolean z4 = A042.getBoolean("showReportAndBlock", false);
        boolean z5 = A042.getBoolean("keepCurrentActivity", false);
        UserJid nullable = UserJid.getNullable(string);
        AnonymousClass00B.A06(nullable);
        C16010sH A0A2 = this.A05.A0A(nullable);
        C32241fu r2 = new C32241fu(r9);
        if (z4) {
            View inflate = LayoutInflater.from(A0u()).inflate(R.layout.layout0230, (ViewGroup) null, false);
            checkBox = (CheckBox) C004601z.A0E(inflate, R.id.checkbox);
            ((TextView) C004601z.A0E(inflate, R.id.dialog_message)).setText(R.string.str0239);
            ((TextView) C004601z.A0E(inflate, R.id.checkbox_header)).setText(R.string.str1416);
            ((TextView) C004601z.A0E(inflate, R.id.checkbox_message)).setText(R.string.str1435);
            C004601z.A0E(inflate, R.id.checkbox_container).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(checkBox, 3));
            r2.setView(inflate);
        } else {
            checkBox = null;
        }
        AnonymousClass3C9 r7 = new AnonymousClass3C9(checkBox, r9, this, A0A2, string2, z5, z2, z3);
        r2.setTitle(A0K(R.string.str0238, this.A06.A08(A0A2)));
        r2.setPositiveButton(R.string.str0226, r7);
        r2.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        C005702l create = r2.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
