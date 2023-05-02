package com.facebook.redex;

import X.AnonymousClass000;
import X.C13720nx;
import X.C13760o2;
import X.C13830o9;
import X.C13840oA;
import X.C13920oI;
import X.C14020oT;
import X.C14070oZ;
import android.content.Context;
import android.util.Base64;
import java.nio.charset.Charset;

public class IDxProviderShape98S0200000_2_I0 implements C13840oA {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxProviderShape98S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public Object get() {
        if (this.A02 != 0) {
            C13760o2 r2 = (C13760o2) this.A01;
            return r2.A02.A72(new C14020oT((C13830o9) this.A00, r2));
        }
        C13720nx r4 = (C13720nx) this.A00;
        Context context = (Context) this.A01;
        StringBuilder A0o = AnonymousClass000.A0o();
        r4.A02();
        byte[] bytes = r4.A04.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes != null) {
            str = Base64.encodeToString(bytes, 11);
        }
        A0o.append(str);
        A0o.append("+");
        r4.A02();
        byte[] bytes2 = r4.A01.A01.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        return new C14070oZ(context, (C13920oI) r4.A02.A02(C13920oI.class), AnonymousClass000.A0h(str2, A0o));
    }
}
