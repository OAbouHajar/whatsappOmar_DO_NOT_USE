package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;

/* compiled from: XFMFile */
public final class h implements ObjectConstructor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f404a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InstanceCreator f405b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Type f406c;

    public /* synthetic */ h(InstanceCreator instanceCreator, Type type, int i2) {
        this.f404a = i2;
        this.f405b = instanceCreator;
        this.f406c = type;
    }

    public final Object construct() {
        int i2 = this.f404a;
        Type type = this.f406c;
        InstanceCreator instanceCreator = this.f405b;
        switch (i2) {
            case 0:
                return instanceCreator.createInstance(type);
            default:
                return instanceCreator.createInstance(type);
        }
    }
}
