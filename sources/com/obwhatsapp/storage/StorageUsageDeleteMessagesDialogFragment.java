package com.obwhatsapp.storage;

import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.C16320sq;
import X.C16740tZ;
import X.C16760tb;
import X.C28691Xe;
import X.C32241fu;
import X.C56922p8;
import X.C83704Hs;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxListenerShape463S0100000_2_I0;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StorageUsageDeleteMessagesDialogFragment extends Hilt_StorageUsageDeleteMessagesDialogFragment {
    public C16760tb A00;
    public C28691Xe A01;
    public C16320sq A02;
    public Collection A03;
    public Collection A04;
    public boolean A05;
    public boolean A06;

    public Dialog A1B(Bundle bundle) {
        boolean z2;
        boolean z3;
        Resources A032;
        int i2;
        String quantityString;
        String str;
        IDxListenerShape463S0100000_2_I0 iDxListenerShape463S0100000_2_I0;
        Iterator it = this.A04.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C16740tZ) it.next()).A0x) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        Iterator it2 = this.A03.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((C16740tZ) it2.next()).A0x) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        if (z2) {
            int size = this.A04.size();
            int i3 = R.string.str16f7;
            if (size == 1) {
                i3 = R.string.str16f8;
            }
            quantityString = A0J(i3);
        } else {
            if (z3 || this.A03.size() <= this.A04.size()) {
                A032 = A03();
                i2 = R.plurals.plurals014c;
            } else {
                A032 = A03();
                i2 = R.plurals.plurals014b;
            }
            quantityString = A032.getQuantityString(i2, this.A04.size());
        }
        Context A0u = A0u();
        ArrayList arrayList = new ArrayList();
        String quantityString2 = A03().getQuantityString(R.plurals.plurals014d, this.A04.size());
        if (z2) {
            if (this.A04.size() == 1) {
                this.A06 = true;
            } else {
                str = A0J(R.string.str16f6);
                iDxListenerShape463S0100000_2_I0 = new IDxListenerShape463S0100000_2_I0(this, 0);
                arrayList.add(new C83704Hs(iDxListenerShape463S0100000_2_I0, str));
            }
        } else if (!z3 && this.A03.size() > this.A04.size()) {
            str = A0J(R.string.str16f5);
            iDxListenerShape463S0100000_2_I0 = new IDxListenerShape463S0100000_2_I0(this, 1);
            arrayList.add(new C83704Hs(iDxListenerShape463S0100000_2_I0, str));
        }
        IDxCListenerShape127S0100000_2_I0 iDxCListenerShape127S0100000_2_I0 = new IDxCListenerShape127S0100000_2_I0(this, 135);
        C32241fu r4 = new C32241fu(A0u());
        r4.setView(new C56922p8(A0u, (Integer) null, quantityString2, quantityString, arrayList));
        r4.setPositiveButton(R.string.str1c4c, iDxCListenerShape127S0100000_2_I0);
        r4.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 134));
        r4.A07(true);
        return r4.create();
    }

    public void A1G(AnonymousClass02C r2, String str) {
        AnonymousClass050 r0 = new AnonymousClass050(r2);
        r0.A0C(this, str);
        r0.A02();
    }
}
