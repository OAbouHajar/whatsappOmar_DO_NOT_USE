package com.facebook.redex;

import X.AnonymousClass1WE;
import X.C13700nu;
import X.C14870pt;
import X.C16730tY;
import X.C16760tb;
import X.C19980zJ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class IDxNConsumerShape9S0400000_2_I0 implements AnonymousClass1WE {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxNConsumerShape9S0400000_2_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj4;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final void accept(Object obj) {
        if (this.A04 != 0) {
            Reference reference = (Reference) this.A00;
            C14870pt r1 = (C14870pt) this.A01;
            C19980zJ r4 = (C19980zJ) this.A02;
            C16730tY r3 = (C16730tY) this.A03;
            Uri uri = (Uri) obj;
            if (reference.get() != null) {
                r1.A05();
                Intent A022 = C13700nu.A02("android.intent.action.VIEW");
                A022.setDataAndType(uri, r3.A06);
                A022.setFlags(1);
                r4.A06((Context) reference.get(), A022);
                return;
            }
            return;
        }
        Uri uri2 = (Uri) obj;
        C16760tb.A01(uri2, (C19980zJ) this.A02, (C16760tb) this.A00, (C16730tY) this.A03, (WeakReference) this.A01);
    }
}
