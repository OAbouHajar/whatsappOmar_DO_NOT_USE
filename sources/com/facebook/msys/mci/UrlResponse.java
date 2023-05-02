package com.facebook.msys.mci;

import X.AnonymousClass00B;
import android.util.Pair;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public class UrlResponse {
    public final NativeHolder mNativeHolder;

    public UrlResponse(UrlRequest urlRequest, int i2, Map map) {
        AnonymousClass00B.A06(urlRequest);
        AnonymousClass00B.A06(map);
        Pair httpHeaderMapToKeysAndValues = NetworkUtils.httpHeaderMapToKeysAndValues(map);
        this.mNativeHolder = initNativeHolder(urlRequest, i2, (String[]) httpHeaderMapToKeysAndValues.first, (String[]) httpHeaderMapToKeysAndValues.second);
    }

    public static native NativeHolder initNativeHolder(UrlRequest urlRequest, int i2, String[] strArr, String[] strArr2);
}
