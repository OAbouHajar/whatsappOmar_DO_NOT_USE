package com.facebook.redex;

import X.AnonymousClass0Vv;
import X.C05160Pn;
import X.C05970Ts;
import android.content.Context;
import java.util.concurrent.Callable;

public class IDxCallableShape1S1201000_I0 implements Callable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxCallableShape1S1201000_I0(Context context, C05160Pn r2, String str, int i2, int i3) {
        this.A04 = i3;
        this.A03 = str;
        this.A01 = context;
        this.A02 = r2;
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        if (this.A04 != 0) {
            try {
                return AnonymousClass0Vv.A00((Context) this.A01, (C05160Pn) this.A02, this.A03, this.A00);
            } catch (Throwable unused) {
                return new C05970Ts(-3);
            }
        } else {
            return AnonymousClass0Vv.A00((Context) this.A01, (C05160Pn) this.A02, this.A03, this.A00);
        }
    }
}
