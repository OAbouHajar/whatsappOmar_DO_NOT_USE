package com.facebook.msys.mci;

public class Proxies {
    public static boolean sConfigured;

    public static synchronized void configure(ProxyProvider proxyProvider) {
        synchronized (Proxies.class) {
            if (!sConfigured) {
                sConfigured = true;
                configureInternal(proxyProvider);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public static native void configureInternal(ProxyProvider proxyProvider);

    public static boolean isMCPEnabledForProxies(int i2) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 12:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }
}
