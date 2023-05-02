package com.google.gson.internal;

import com.google.gson.JsonIOException;

/* compiled from: XFMFile */
public final class g implements ObjectConstructor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f402a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f403b;

    public /* synthetic */ g(String str, int i2) {
        this.f402a = i2;
        this.f403b = str;
    }

    public final Object construct() {
        int i2 = this.f402a;
        String str = this.f403b;
        switch (i2) {
            case 0:
                throw new JsonIOException(str);
            default:
                throw new JsonIOException(str);
        }
    }
}
