package com.obwhatsapp.calling.controls.viewmodel;

import X.AnonymousClass027;
import X.AnonymousClass1OL;
import X.AnonymousClass2PE;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C15860rz;
import X.C16000sG;
import X.C16080sP;
import X.C16300so;
import X.C30341cC;
import X.C448926b;
import X.C49562Tu;
import java.util.Set;

public class ParticipantsListViewModel extends C49562Tu {
    public int A00;
    public AnonymousClass2PE A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public final AnonymousClass027 A04 = C13690nt.A0O();
    public final C16300so A05;
    public final AnonymousClass1OL A06;
    public final C448926b A07;
    public final C16000sG A08;
    public final C16080sP A09;
    public final Set A0A = C13680ns.A0o();
    public final boolean A0B;

    public ParticipantsListViewModel(C16300so r4, AnonymousClass1OL r5, C448926b r6, C16000sG r7, C16080sP r8, C15860rz r9, C14710pd r10) {
        this.A05 = r4;
        this.A07 = r6;
        this.A08 = r7;
        this.A09 = r8;
        this.A06 = r5;
        this.A0B = C30341cC.A0M(r9, r10);
        this.A00 = r5.A01().getInt("inline_education", 0);
        r6.A02(this);
        A06(r6.A04());
    }

    public void A04() {
        this.A07.A03(this);
    }
}
