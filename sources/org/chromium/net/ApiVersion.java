package org.chromium.net;

import X.AnonymousClass000;

public class ApiVersion {
    public static final int API_LEVEL = 12;
    public static final String CRONET_VERSION = "72.0.3626.96";
    public static final String LAST_CHANGE = "84098ee7ef8622a9defc2ef043cd8930b617b10e-refs/branch-heads/3626@{#836}";
    public static final int MIN_COMPATIBLE_API_LEVEL = 3;

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return AnonymousClass000.A0h("84098ee7", AnonymousClass000.A0r("72.0.3626.96@"));
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 12;
    }
}
