package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: XFMFile */
public final class a implements GenericArrayType, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Type f303a;

    public a(Type type) {
        this.f303a = C$Gson$Types.canonicalize(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C$Gson$Types.equals(this, (GenericArrayType) obj);
    }

    public final Type getGenericComponentType() {
        return this.f303a;
    }

    public final int hashCode() {
        return this.f303a.hashCode();
    }

    public final String toString() {
        return C$Gson$Types.typeToString(this.f303a) + "[]";
    }
}
