package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: XFMFile */
public final class FieldAttributes {

    /* renamed from: a  reason: collision with root package name */
    public final Field f220a;

    public FieldAttributes(Field field) {
        C$Gson$Preconditions.checkNotNull(field);
        this.f220a = field;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return this.f220a.getAnnotation(cls);
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.f220a.getAnnotations());
    }

    public Class<?> getDeclaredClass() {
        return this.f220a.getType();
    }

    public Type getDeclaredType() {
        return this.f220a.getGenericType();
    }

    public Class<?> getDeclaringClass() {
        return this.f220a.getDeclaringClass();
    }

    public String getName() {
        return this.f220a.getName();
    }

    public boolean hasModifier(int i2) {
        return (i2 & this.f220a.getModifiers()) != 0;
    }
}
