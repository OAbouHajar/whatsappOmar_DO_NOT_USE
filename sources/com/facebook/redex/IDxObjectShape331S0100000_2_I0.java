package com.facebook.redex;

import X.AnonymousClass1DT;
import X.AnonymousClass1ZX;
import X.AnonymousClass22J;
import X.AnonymousClass22M;
import X.C13680ns;
import X.C15830rv;
import X.C17210ui;
import X.C18450wi;
import X.C29151a7;
import X.C34621kZ;
import X.C40281tr;
import X.C451927k;
import X.C55272jC;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.List;
import java.util.Set;

public class IDxObjectShape331S0100000_2_I0 implements AnonymousClass1DT, AnonymousClass22J {
    public Object A00;
    public final int A01;

    public IDxObjectShape331S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object AIU(Object obj) {
        C40281tr A03;
        if (this.A01 != 0) {
            C34621kZ r6 = (C34621kZ) this.A00;
            C15830rv r8 = (C15830rv) obj;
            if (!r6.A0h.equals(r8) || !(r8 instanceof AnonymousClass1ZX)) {
                return null;
            }
            C451927k r5 = C451927k.A01;
            C18450wi.A0H(r8, 0);
            Set set = C451927k.A03;
            if (set.contains(r8) || (A03 = r6.A0f.A03(r8)) == null) {
                return null;
            }
            r6.A0s.A09(Boolean.TRUE);
            r6.A0Z.A0W(A03);
            set.add(r8);
            C451927k.A04.remove(r8);
            AnonymousClass22J r1 = r6.A0z;
            C18450wi.A0H(r1, 0);
            synchronized (r5) {
                C451927k.A02.remove(r1);
            }
            return null;
        }
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = (BusinessDirectoryContextualSearchViewModel) this.A00;
        businessDirectoryContextualSearchViewModel.A0b.A09(obj);
        C13680ns.A1P(businessDirectoryContextualSearchViewModel.A0d, 3);
        List A09 = businessDirectoryContextualSearchViewModel.A09();
        A09.add(new C55272jC(1));
        businessDirectoryContextualSearchViewModel.A0G.A09(A09);
        C17210ui r3 = businessDirectoryContextualSearchViewModel.A0N;
        Integer A02 = businessDirectoryContextualSearchViewModel.A0P.A02();
        C29151a7 r12 = new C29151a7();
        r12.A0B = 70;
        r12.A06 = A02;
        r3.A06(r12);
        return AnonymousClass22M.A00;
    }
}
