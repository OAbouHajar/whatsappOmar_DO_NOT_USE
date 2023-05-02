package com.obwhatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass15W;
import X.AnonymousClass1L9;
import X.AnonymousClass1yL;
import X.AnonymousClass29B;
import X.AnonymousClass3BP;
import X.AnonymousClass4E3;
import X.AnonymousClass5RM;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C16000sG;
import X.C16070sO;
import X.C16080sP;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16740tZ;
import X.C16760tb;
import X.C16820th;
import X.C17240ul;
import X.C17250um;
import X.C18030w2;
import X.C18040w3;
import X.C28381Vw;
import X.C99834uf;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.redex.IDxDListenerShape341S0100000_2_I1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class DeleteMessagesDialogFragment extends Hilt_DeleteMessagesDialogFragment {
    public AnonymousClass5RM A00 = new C99834uf(this);
    public AnonymousClass29B A01 = new IDxDListenerShape341S0100000_2_I1(this, 1);
    public C14870pt A02;
    public C16760tb A03;
    public C16000sG A04;
    public C16080sP A05;
    public C16440t3 A06;
    public C15860rz A07;
    public C16820th A08;
    public C16070sO A09;
    public C18030w2 A0A;
    public C17250um A0B;
    public C16490t9 A0C;
    public C18040w3 A0D;
    public C17240ul A0E;
    public AnonymousClass15W A0F;
    public AnonymousClass1L9 A0G;
    public C16320sq A0H;

    public static DeleteMessagesDialogFragment A01(C15830rv r6, List list) {
        DeleteMessagesDialogFragment deleteMessagesDialogFragment = new DeleteMessagesDialogFragment();
        Bundle A0D2 = C13690nt.A0D();
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0u.add(C13680ns.A0V(it).A11);
        }
        AnonymousClass1yL.A0A(A0D2, A0u);
        if (r6 != null) {
            A0D2.putString("jid", r6.getRawString());
        }
        A0D2.putBoolean("is_revokable", true);
        deleteMessagesDialogFragment.A0T(A0D2);
        return deleteMessagesDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        List<C28381Vw> A042;
        Bundle bundle2 = this.A05;
        if (!(bundle2 == null || A0u() == null || (A042 = AnonymousClass1yL.A04(bundle2)) == null)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C28381Vw A032 : A042) {
                C16740tZ A033 = this.A08.A03(A032);
                if (A033 != null) {
                    linkedHashSet.add(A033);
                }
            }
            C15830rv A022 = C15830rv.A02(bundle2.getString("jid"));
            boolean z2 = bundle2.getBoolean("is_revokable");
            String A012 = AnonymousClass3BP.A01(A0u(), this.A04, this.A05, A022, linkedHashSet);
            Context A0u = A0u();
            C16440t3 r21 = this.A06;
            C14710pd r20 = this.A04;
            C14870pt r19 = this.A02;
            C16320sq r18 = this.A0H;
            C16490t9 r17 = this.A0C;
            C17250um r15 = this.A0B;
            C16760tb r14 = this.A03;
            C16000sG r13 = this.A04;
            C18030w2 r12 = this.A0A;
            C16080sP r9 = this.A05;
            AnonymousClass013 r8 = this.A02;
            C17240ul r7 = this.A0E;
            AnonymousClass15W r6 = this.A0F;
            C18040w3 r5 = this.A0D;
            C15860rz r4 = this.A07;
            C16070sO r3 = this.A09;
            AnonymousClass1L9 r2 = this.A0G;
            C14710pd r30 = r20;
            AnonymousClass5RM r172 = this.A00;
            AnonymousClass29B r182 = this.A01;
            C16760tb r202 = r14;
            C16000sG r212 = r13;
            C16080sP r22 = r9;
            Dialog A002 = AnonymousClass3BP.A00(A0u, r172, r182, r19, r202, r212, r22, (AnonymousClass4E3) null, r21, r4, r8, r3, r12, r15, r30, r17, r5, r7, r6, r2, r18, A012, linkedHashSet, z2);
            if (A002 != null) {
                return A002;
            }
        }
        A1D();
        return super.A1B(bundle);
    }
}
