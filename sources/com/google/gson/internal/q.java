package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: XFMFile */
public final class q extends UnsafeAllocator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Method f429a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f430b;

    public q(Object obj, Method method) {
        this.f429a = method;
        this.f430b = obj;
    }

    public final Object newInstance(Class cls) {
        UnsafeAllocator.a(cls);
        return this.f429a.invoke(this.f430b, new Object[]{cls});
    }
}
