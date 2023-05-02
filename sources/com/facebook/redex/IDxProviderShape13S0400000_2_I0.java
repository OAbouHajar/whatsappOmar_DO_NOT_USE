package com.facebook.redex;

import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass1VE;
import X.AnonymousClass1XH;
import X.AnonymousClass3K2;
import X.C14730pf;
import X.C16190sc;
import X.C16260sj;
import android.view.View;
import java.io.File;

public class IDxProviderShape13S0400000_2_I0 implements AnonymousClass01J {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxProviderShape13S0400000_2_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj4;
        this.A03 = obj2;
    }

    public final Object get() {
        if (this.A04 != 0) {
            return new AnonymousClass1XH((C16260sj) this.A03, (C14730pf) this.A02, new File((File) ((C16190sc) this.A01).A03.get(), ".trash"));
        }
        AnonymousClass1VE r4 = (AnonymousClass1VE) this.A00;
        View view = (View) this.A03;
        return Float.valueOf((((AnonymousClass013) this.A02).A0T() ? ((float) view.getRight()) - AnonymousClass3K2.A02(r4.A0D) : (float) view.getLeft()) - ((float) ((View) this.A01).getLeft()));
    }
}
