package com.instagram.common.bloks.mutations;

import X.AnonymousClass000;
import X.AnonymousClass38S;
import X.AnonymousClass4SR;
import X.AnonymousClass5OP;
import X.C31201dg;
import X.C89524cN;
import android.util.Log;
import android.util.Pair;
import java.util.List;

public class IDxUOperationShape10S0200000_2_I1 extends AnonymousClass4SR {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxUOperationShape10S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        int i2 = this.A02;
        C31201dg r4 = (C31201dg) obj;
        Object obj2 = this.A01;
        if (i2 != 0) {
            r4.A02.put(31, ((AnonymousClass38S) obj2).A0E.toString());
            return;
        }
        Pair A012 = C89524cN.A01(r4, (AnonymousClass5OP) obj2);
        int A0D = AnonymousClass000.A0D(A012.second);
        if (A0D < 0) {
            Log.w("ComponentTree", "replaceChild: No existing child found with specified ID in parent. New children have not been added to parent.");
            return;
        }
        List list = (List) A012.first;
        list.remove(A0D);
        list.addAll(A0D, C89524cN.A02((List) this.A00));
    }
}
