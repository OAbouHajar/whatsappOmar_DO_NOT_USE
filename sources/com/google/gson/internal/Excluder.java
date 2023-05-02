package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: XFMFile */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();

    /* renamed from: a  reason: collision with root package name */
    public double f281a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    public int f282b = 136;

    /* renamed from: c  reason: collision with root package name */
    public boolean f283c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f284d;

    /* renamed from: e  reason: collision with root package name */
    public List f285e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    public List f286f = Collections.emptyList();

    public static boolean c(Class cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        if (!((cls.getModifiers() & 8) != 0)) {
            return cls.isAnonymousClass() || cls.isLocalClass();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Class r7) {
        /*
            r6 = this;
            double r0 = r6.f281a
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0020
            java.lang.Class<com.google.gson.annotations.Since> r0 = com.google.gson.annotations.Since.class
            java.lang.annotation.Annotation r0 = r7.getAnnotation(r0)
            com.google.gson.annotations.Since r0 = (com.google.gson.annotations.Since) r0
            java.lang.Class<com.google.gson.annotations.Until> r1 = com.google.gson.annotations.Until.class
            java.lang.annotation.Annotation r1 = r7.getAnnotation(r1)
            com.google.gson.annotations.Until r1 = (com.google.gson.annotations.Until) r1
            boolean r0 = r6.d(r0, r1)
            if (r0 != 0) goto L_0x0020
            return r4
        L_0x0020:
            boolean r0 = r6.f283c
            r1 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = r7.isMemberClass()
            if (r0 == 0) goto L_0x003a
            int r0 = r7.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 != 0) goto L_0x003a
            r0 = 1
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            return r4
        L_0x003e:
            boolean r7 = c(r7)
            if (r7 == 0) goto L_0x0045
            return r4
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.a(java.lang.Class):boolean");
    }

    public final boolean b(Class cls, boolean z2) {
        for (ExclusionStrategy shouldSkipClass : z2 ? this.f285e : this.f286f) {
            if (shouldSkipClass.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        boolean a2 = a(rawType);
        final boolean z2 = a2 || b(rawType, true);
        final boolean z3 = a2 || b(rawType, false);
        if (!z2 && !z3) {
            return null;
        }
        final Gson gson2 = gson;
        final TypeToken<T> typeToken2 = typeToken;
        return new TypeAdapter<Object>() {

            /* renamed from: a  reason: collision with root package name */
            public TypeAdapter f287a;

            public final Object read(JsonReader jsonReader) {
                if (z3) {
                    jsonReader.skipValue();
                    return null;
                }
                TypeAdapter typeAdapter = this.f287a;
                if (typeAdapter == null) {
                    typeAdapter = gson2.getDelegateAdapter(Excluder.this, typeToken2);
                    this.f287a = typeAdapter;
                }
                return typeAdapter.read(jsonReader);
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                if (z2) {
                    jsonWriter.nullValue();
                    return;
                }
                TypeAdapter typeAdapter = this.f287a;
                if (typeAdapter == null) {
                    typeAdapter = gson2.getDelegateAdapter(Excluder.this, typeToken2);
                    this.f287a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, obj);
            }
        };
    }

    public final boolean d(Since since, Until until) {
        if (!(since == null || since.value() <= this.f281a)) {
            return false;
        }
        return until == null || (until.value() > this.f281a ? 1 : (until.value() == this.f281a ? 0 : -1)) > 0;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder clone = clone();
        clone.f283c = false;
        return clone;
    }

    public boolean excludeClass(Class<?> cls, boolean z2) {
        return a(cls) || b(cls, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean excludeField(java.lang.reflect.Field r7, boolean r8) {
        /*
            r6 = this;
            int r0 = r6.f282b
            int r1 = r7.getModifiers()
            r0 = r0 & r1
            r1 = 1
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            double r2 = r6.f281a
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            java.lang.Class<com.google.gson.annotations.Since> r0 = com.google.gson.annotations.Since.class
            java.lang.annotation.Annotation r0 = r7.getAnnotation(r0)
            com.google.gson.annotations.Since r0 = (com.google.gson.annotations.Since) r0
            java.lang.Class<com.google.gson.annotations.Until> r2 = com.google.gson.annotations.Until.class
            java.lang.annotation.Annotation r2 = r7.getAnnotation(r2)
            com.google.gson.annotations.Until r2 = (com.google.gson.annotations.Until) r2
            boolean r0 = r6.d(r0, r2)
            if (r0 != 0) goto L_0x002a
            return r1
        L_0x002a:
            boolean r0 = r7.isSynthetic()
            if (r0 == 0) goto L_0x0031
            return r1
        L_0x0031:
            boolean r0 = r6.f284d
            if (r0 == 0) goto L_0x004f
            java.lang.Class<com.google.gson.annotations.Expose> r0 = com.google.gson.annotations.Expose.class
            java.lang.annotation.Annotation r0 = r7.getAnnotation(r0)
            com.google.gson.annotations.Expose r0 = (com.google.gson.annotations.Expose) r0
            if (r0 == 0) goto L_0x004e
            if (r8 == 0) goto L_0x0048
            boolean r0 = r0.serialize()
            if (r0 != 0) goto L_0x004f
            goto L_0x004e
        L_0x0048:
            boolean r0 = r0.deserialize()
            if (r0 != 0) goto L_0x004f
        L_0x004e:
            return r1
        L_0x004f:
            boolean r0 = r6.f283c
            r2 = 0
            if (r0 != 0) goto L_0x0071
            java.lang.Class r0 = r7.getType()
            boolean r3 = r0.isMemberClass()
            if (r3 == 0) goto L_0x006d
            int r0 = r0.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0068
            r0 = 1
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            if (r0 != 0) goto L_0x006d
            r0 = 1
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r0 == 0) goto L_0x0071
            return r1
        L_0x0071:
            java.lang.Class r0 = r7.getType()
            boolean r0 = c(r0)
            if (r0 == 0) goto L_0x007c
            return r1
        L_0x007c:
            if (r8 == 0) goto L_0x0081
            java.util.List r8 = r6.f285e
            goto L_0x0083
        L_0x0081:
            java.util.List r8 = r6.f286f
        L_0x0083:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00a5
            com.google.gson.FieldAttributes r0 = new com.google.gson.FieldAttributes
            r0.<init>(r7)
            java.util.Iterator r7 = r8.iterator()
        L_0x0092:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00a5
            java.lang.Object r8 = r7.next()
            com.google.gson.ExclusionStrategy r8 = (com.google.gson.ExclusionStrategy) r8
            boolean r8 = r8.shouldSkipField(r0)
            if (r8 == 0) goto L_0x0092
            return r1
        L_0x00a5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.excludeField(java.lang.reflect.Field, boolean):boolean");
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder clone = clone();
        clone.f284d = true;
        return clone;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z2, boolean z3) {
        Excluder clone = clone();
        if (z2) {
            ArrayList arrayList = new ArrayList(this.f285e);
            clone.f285e = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z3) {
            ArrayList arrayList2 = new ArrayList(this.f286f);
            clone.f286f = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder clone = clone();
        clone.f282b = 0;
        for (int i2 : iArr) {
            clone.f282b = i2 | clone.f282b;
        }
        return clone;
    }

    public Excluder withVersion(double d2) {
        Excluder clone = clone();
        clone.f281a = d2;
        return clone;
    }
}
