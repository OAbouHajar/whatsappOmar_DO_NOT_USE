package com.facebook.msys.mci;

import X.C42981z7;
import com.facebook.msys.util.Provider;

public final class ProxyProvider {
    public final Provider mCryptoProvider;
    public final Provider mRandomProvider;
    public final Provider mUUIDProvider;

    public ProxyProvider(C42981z7 r2) {
        this.mCryptoProvider = r2.A00;
        this.mUUIDProvider = r2.A01;
        this.mRandomProvider = null;
    }

    private Crypto getCrypto() {
        return (Crypto) retrieveProxyOrThrow(this.mCryptoProvider);
    }

    private Random getRandom() {
        Provider provider = this.mRandomProvider;
        if (provider != null) {
            return (Random) retrieveProxyOrThrow(provider);
        }
        return null;
    }

    private UUID getUUID() {
        return (UUID) retrieveProxyOrThrow(this.mUUIDProvider);
    }

    public static C42981z7 newBuilder(Provider provider, Provider provider2) {
        return new C42981z7(provider, provider2);
    }

    public static Object retrieveProxyOrThrow(Provider provider) {
        Object obj = provider.get();
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }
}
