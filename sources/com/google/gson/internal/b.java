package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: XFMFile */
public final class b implements ParameterizedType, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Type f304a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f305b;

    /* renamed from: c  reason: collision with root package name */
    public final Type[] f306c;

    public b(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z2 = true;
            boolean z3 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z3) {
                z2 = false;
            }
            C$Gson$Preconditions.checkArgument(z2);
        }
        this.f304a = type == null ? null : C$Gson$Types.canonicalize(type);
        this.f305b = C$Gson$Types.canonicalize(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f306c = typeArr2;
        int length = typeArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            C$Gson$Preconditions.checkNotNull(this.f306c[i2]);
            C$Gson$Types.a(this.f306c[i2]);
            Type[] typeArr3 = this.f306c;
            typeArr3[i2] = C$Gson$Types.canonicalize(typeArr3[i2]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && C$Gson$Types.equals(this, (ParameterizedType) obj);
    }

    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f306c.clone();
    }

    public final Type getOwnerType() {
        return this.f304a;
    }

    public final Type getRawType() {
        return this.f305b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f306c) ^ this.f305b.hashCode();
        Type type = this.f304a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f306c;
        int length = typeArr.length;
        Type type = this.f305b;
        if (length == 0) {
            return C$Gson$Types.typeToString(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(C$Gson$Types.typeToString(type));
        sb.append("<");
        sb.append(C$Gson$Types.typeToString(typeArr[0]));
        for (int i2 = 1; i2 < length; i2++) {
            sb.append(", ");
            sb.append(C$Gson$Types.typeToString(typeArr[i2]));
        }
        sb.append(">");
        return sb.toString();
    }
}
