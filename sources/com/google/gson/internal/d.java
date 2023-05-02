package com.google.gson.internal;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* compiled from: XFMFile */
public final class d implements ObjectConstructor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f395a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Type f396b;

    public /* synthetic */ d(Type type, int i2) {
        this.f395a = i2;
        this.f396b = type;
    }

    public final Object construct() {
        int i2 = this.f395a;
        Type type = this.f396b;
        switch (i2) {
            case 0:
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return new EnumMap((Class) type2);
                    }
                    throw new JsonIOException("Invalid EnumMap type: " + type.toString());
                }
                throw new JsonIOException("Invalid EnumMap type: " + type.toString());
            default:
                if (type instanceof ParameterizedType) {
                    Type type3 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return EnumSet.noneOf((Class) type3);
                    }
                    throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                }
                throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
    }
}
