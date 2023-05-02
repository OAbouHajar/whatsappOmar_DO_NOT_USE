package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import java.util.HashMap;
import java.util.Map;

public class UrlRequest {
    public final NativeHolder mNativeHolder;

    public UrlRequest(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native String[] getHeaderKeys();

    private native String[] getHeaderValues();

    public native byte[] getHttpBody();

    public Map getHttpHeaders() {
        HashMap hashMap = new HashMap();
        String[] headerKeys = getHeaderKeys();
        String[] headerValues = getHeaderValues();
        if (!(headerKeys == null || headerValues == null)) {
            for (int i2 = 0; i2 < headerKeys.length; i2++) {
                hashMap.put(headerKeys[i2], headerValues[i2]);
            }
        }
        return hashMap;
    }

    public native String getHttpMethod();

    public native String getUrl();
}
