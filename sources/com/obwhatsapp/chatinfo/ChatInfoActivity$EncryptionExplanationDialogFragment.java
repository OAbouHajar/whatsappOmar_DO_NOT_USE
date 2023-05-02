package com.obwhatsapp.chatinfo;

import X.AnonymousClass00B;
import X.AnonymousClass15W;
import X.AnonymousClass2Sy;
import X.AnonymousClass3K3;
import X.AnonymousClass3K4;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16070sO;
import X.C16490t9;
import X.C17220uj;
import X.C17250um;
import X.C19980zJ;
import X.C20260zl;
import X.C32241fu;
import X.C32431gL;
import X.C40571uL;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape7S0101000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class ChatInfoActivity$EncryptionExplanationDialogFragment extends Hilt_ChatInfoActivity_EncryptionExplanationDialogFragment {
    public C19980zJ A00;
    public C16000sG A01;
    public C16070sO A02;
    public C17250um A03;
    public C20260zl A04;
    public C16490t9 A05;
    public AnonymousClass15W A06;
    public C17220uj A07;

    public static ChatInfoActivity$EncryptionExplanationDialogFragment A01(C15830rv r6) {
        ChatInfoActivity$EncryptionExplanationDialogFragment chatInfoActivity$EncryptionExplanationDialogFragment = new ChatInfoActivity$EncryptionExplanationDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("jid", r6.getRawString());
        A0D.putInt("provider_category", 1);
        A0D.putString("display_name", (String) null);
        chatInfoActivity$EncryptionExplanationDialogFragment.A0T(A0D);
        return chatInfoActivity$EncryptionExplanationDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        int i2;
        String str;
        int i3;
        Object[] objArr;
        Bundle A042 = A04();
        String string = A042.getString("jid");
        String string2 = A042.getString("display_name");
        int i4 = A042.getInt("provider_category", 0);
        C16000sG r1 = this.A01;
        C15830rv A022 = C15830rv.A02(string);
        AnonymousClass00B.A07(A022, string);
        C16010sH A0A = r1.A0A(A022);
        C14710pd r2 = this.A04;
        AnonymousClass15W r0 = this.A06;
        C001000l A0D = A0D();
        C15830rv A072 = A0A.A07();
        C20260zl r12 = this.A04;
        if (r0.A01(A072) || C40571uL.A00(r2, A072)) {
            i2 = R.string.str055d;
        } else {
            if (i4 != 1) {
                if (i4 == 2) {
                    AnonymousClass00B.A06(string2);
                    i3 = R.string.str055a;
                } else if (i4 == 3 || i4 == 4) {
                    AnonymousClass00B.A06(string2);
                    boolean A002 = C32431gL.A00(r12, A072);
                    i3 = R.string.str055c;
                    if (A002) {
                        i3 = R.string.str055b;
                        objArr = new Object[]{string2};
                        str = A0D.getString(i3, objArr);
                        C32241fu A0c = AnonymousClass3K3.A0c(this);
                        A0c.A06(AnonymousClass2Sy.A05(A0D(), this.A03, str));
                        A0c.A07(true);
                        C13690nt.A1H(A0c, this, 32, R.string.str0e87);
                        A0c.A0B(new IDxCListenerShape7S0101000_2_I1(this, i4, 0), R.string.str1cf6);
                        if (!A0A.A0J() && !C16030sJ.A0G(A0A.A0E) && i4 == 1) {
                            AnonymousClass3K4.A0n(A0c, A0A, this, 4, R.string.str0b2d);
                        }
                        return A0c.create();
                    }
                } else {
                    Log.e(C13680ns.A0c(i4, "providerCategoryToModal unexpected argument value for providerCategory: "));
                }
                objArr = new Object[]{string2, string2};
                str = A0D.getString(i3, objArr);
                C32241fu A0c2 = AnonymousClass3K3.A0c(this);
                A0c2.A06(AnonymousClass2Sy.A05(A0D(), this.A03, str));
                A0c2.A07(true);
                C13690nt.A1H(A0c2, this, 32, R.string.str0e87);
                A0c2.A0B(new IDxCListenerShape7S0101000_2_I1(this, i4, 0), R.string.str1cf6);
                AnonymousClass3K4.A0n(A0c2, A0A, this, 4, R.string.str0b2d);
                return A0c2.create();
            }
            i2 = R.string.str07eb;
        }
        str = A0D.getString(i2);
        C32241fu A0c22 = AnonymousClass3K3.A0c(this);
        A0c22.A06(AnonymousClass2Sy.A05(A0D(), this.A03, str));
        A0c22.A07(true);
        C13690nt.A1H(A0c22, this, 32, R.string.str0e87);
        A0c22.A0B(new IDxCListenerShape7S0101000_2_I1(this, i4, 0), R.string.str1cf6);
        AnonymousClass3K4.A0n(A0c22, A0A, this, 4, R.string.str0b2d);
        return A0c22.create();
    }
}
