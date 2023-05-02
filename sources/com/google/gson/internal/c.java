package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: XFMFile */
public final class c implements WildcardType, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Type f393a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f394b;

    public c(Type[] typeArr, Type[] typeArr2) {
        boolean z2 = true;
        C$Gson$Preconditions.checkArgument(typeArr2.length <= 1);
        C$Gson$Preconditions.checkArgument(typeArr.length == 1);
        if (typeArr2.length == 1) {
            C$Gson$Preconditions.checkNotNull(typeArr2[0]);
            C$Gson$Types.a(typeArr2[0]);
            Class<Object> cls = Object.class;
            C$Gson$Preconditions.checkArgument(typeArr[0] != cls ? false : z2);
            this.f394b = C$Gson$Types.canonicalize(typeArr2[0]);
            this.f393a = cls;
            return;
        }
        C$Gson$Preconditions.checkNotNull(typeArr[0]);
        C$Gson$Types.a(typeArr[0]);
        this.f394b = null;
        this.f393a = C$Gson$Types.canonicalize(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && C$Gson$Types.equals(this, (WildcardType) obj);
    }

    public final Type[] getLowerBounds() {
        Type type = this.f394b;
        if (type == null) {
            return C$Gson$Types.f278a;
        }
        return new Type[]{type};
    }

    public final Type[] getUpperBounds() {
        return new Type[]{this.f393a};
    }

    public final int hashCode() {
        Type type = this.f394b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f393a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f394b;
        if (type != null) {
            return "? super " + C$Gson$Types.typeToString(type);
        }
        Class<Object> cls = Object.class;
        Type type2 = this.f393a;
        if (type2 == cls) {
            return "?";
        }
        return "? extends " + C$Gson$Types.typeToString(type2);
    }
}
