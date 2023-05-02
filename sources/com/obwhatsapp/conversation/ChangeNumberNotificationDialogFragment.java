package com.obwhatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1W4;
import X.C005702l;
import X.C13690nt;
import X.C16000sG;
import X.C16010sH;
import X.C16440t3;
import X.C24561Gk;
import X.C32241fu;
import X.C42781yf;
import X.C91264fd;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

public class ChangeNumberNotificationDialogFragment extends Hilt_ChangeNumberNotificationDialogFragment {
    public C16000sG A00;
    public C42781yf A01;
    public C16440t3 A02;

    public static ChangeNumberNotificationDialogFragment A01(UserJid userJid, UserJid userJid2, String str) {
        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = new ChangeNumberNotificationDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("convo_jid", userJid.getRawString());
        A0D.putString("new_jid", userJid2.getRawString());
        A0D.putString("old_display_name", str);
        changeNumberNotificationDialogFragment.A0T(A0D);
        return changeNumberNotificationDialogFragment;
    }

    public void A16(Context context) {
        super.A16(context);
        try {
            this.A01 = (C42781yf) context;
        } catch (ClassCastException unused) {
            StringBuilder A0o = AnonymousClass000.A0o();
            AnonymousClass000.A1I(context, A0o);
            throw new ClassCastException(AnonymousClass000.A0h(" must implement ChangeNumberNotificationDialogListener", A0o));
        }
    }

    public Dialog A1B(Bundle bundle) {
        Bundle A04 = A04();
        try {
            UserJid userJid = UserJid.get(A04.getString("convo_jid"));
            UserJid userJid2 = UserJid.get(A04.getString("new_jid"));
            String string = A04.getString("old_display_name");
            AnonymousClass00B.A06(string);
            C16010sH A0A = this.A00.A0A(userJid2);
            boolean A1V = AnonymousClass000.A1V(A0A.A0D);
            C32241fu A002 = C32241fu.A00(A0u());
            IDxCListenerShape23S0000000_2_I1 iDxCListenerShape23S0000000_2_I1 = new IDxCListenerShape23S0000000_2_I1(8);
            IDxCListenerShape29S0200000_2_I1 iDxCListenerShape29S0200000_2_I1 = new IDxCListenerShape29S0200000_2_I1(A0A, 9, this);
            C91264fd r3 = new C91264fd(this, A0A, A1V);
            if (userJid.equals(userJid2)) {
                if (A1V) {
                    A002.A06(C13690nt.A0c(this, this.A02.A0H(C24561Gk.A01(A0A)), new Object[1], 0, R.string.str0407));
                    A002.setPositiveButton(R.string.str0e88, iDxCListenerShape23S0000000_2_I1);
                } else {
                    Object[] A1Z = C13690nt.A1Z();
                    A1Z[0] = string;
                    A002.A06(C13690nt.A0c(this, C24561Gk.A01(A0A), A1Z, 1, R.string.str0412));
                    A002.setNegativeButton(R.string.str0394, iDxCListenerShape23S0000000_2_I1);
                    A002.setPositiveButton(R.string.str00a6, r3);
                }
            } else if (A1V) {
                A002.A06(C13690nt.A0c(this, this.A02.A0H(C24561Gk.A01(A0A)), new Object[1], 0, R.string.str0407));
                A002.setPositiveButton(R.string.str0a03, iDxCListenerShape23S0000000_2_I1);
                A002.A0B(iDxCListenerShape29S0200000_2_I1, R.string.str040a);
            } else {
                A002.A06(C13690nt.A0c(this, string, new Object[1], 0, R.string.str0413));
                A002.A0B(iDxCListenerShape29S0200000_2_I1, R.string.str14f4);
                A002.setPositiveButton(R.string.str00a6, r3);
                A002.setNegativeButton(R.string.str0394, iDxCListenerShape23S0000000_2_I1);
            }
            C005702l create = A002.create();
            create.setCanceledOnTouchOutside(true);
            return create;
        } catch (AnonymousClass1W4 e2) {
            throw new RuntimeException(e2);
        }
    }
}
