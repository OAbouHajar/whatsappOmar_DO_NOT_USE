package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: XFMFile */
public final class s extends UnsafeAllocator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Method f433a;

    public s(Method method) {
        this.f433a = method;
    }

    public final Object newInstance(Class cls) {
        UnsafeAllocator.a(cls);
        return this.f433a.invoke((Object) null, new Object[]{cls, Object.class});
    }
}
