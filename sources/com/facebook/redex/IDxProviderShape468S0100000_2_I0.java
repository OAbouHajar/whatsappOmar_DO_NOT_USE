package com.facebook.redex;

import X.C18980xZ;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.msys.mci.DefaultUUID;
import com.facebook.msys.util.Provider;

public class IDxProviderShape468S0100000_2_I0 implements Provider {
    public Object A00;
    public final int A01;

    public IDxProviderShape468S0100000_2_I0(C18980xZ r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object get() {
        return this.A01 != 0 ? DefaultUUID.mUUID : DefaultCrypto.mCrypto;
    }
}
