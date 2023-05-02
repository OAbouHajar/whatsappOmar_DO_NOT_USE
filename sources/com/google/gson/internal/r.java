package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: XFMFile */
public final class r extends UnsafeAllocator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Method f431a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f432b;

    public r(Method method, int i2) {
        this.f431a = method;
        this.f432b = i2;
    }

    public final Object newInstance(Class cls) {
        UnsafeAllocator.a(cls);
        return this.f431a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f432b)});
    }
}
