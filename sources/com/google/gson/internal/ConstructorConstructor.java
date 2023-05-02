package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;
import java.util.Map;

/* compiled from: XFMFile */
public final class ConstructorConstructor {

    /* renamed from: a  reason: collision with root package name */
    public final Map f279a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f280b;

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map, boolean z2) {
        this.f279a = map;
        this.f280b = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.google.gson.internal.ObjectConstructor<T> get(com.google.gson.reflect.TypeToken<T> r7) {
        /*
            r6 = this;
            java.lang.reflect.Type r0 = r7.getType()
            java.lang.Class r7 = r7.getRawType()
            java.util.Map r1 = r6.f279a
            java.lang.Object r2 = r1.get(r0)
            com.google.gson.InstanceCreator r2 = (com.google.gson.InstanceCreator) r2
            r3 = 0
            if (r2 == 0) goto L_0x0019
            com.google.gson.internal.h r7 = new com.google.gson.internal.h
            r7.<init>(r2, r0, r3)
            return r7
        L_0x0019:
            java.lang.Object r1 = r1.get(r7)
            com.google.gson.InstanceCreator r1 = (com.google.gson.InstanceCreator) r1
            r2 = 1
            if (r1 == 0) goto L_0x0028
            com.google.gson.internal.h r7 = new com.google.gson.internal.h
            r7.<init>(r1, r0, r2)
            return r7
        L_0x0028:
            int r1 = r7.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            r4 = 0
            if (r1 == 0) goto L_0x0034
            goto L_0x004e
        L_0x0034:
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x004d }
            java.lang.reflect.Constructor r1 = r7.getDeclaredConstructor(r1)     // Catch:{ NoSuchMethodException -> 0x004d }
            java.lang.String r5 = com.google.gson.internal.reflect.ReflectionHelper.tryMakeAccessible(r1)
            if (r5 == 0) goto L_0x0046
            com.google.gson.internal.g r1 = new com.google.gson.internal.g
            r1.<init>(r5, r2)
            goto L_0x004f
        L_0x0046:
            com.google.gson.internal.i r5 = new com.google.gson.internal.i
            r5.<init>(r6, r1, r3)
            r1 = r5
            goto L_0x004f
        L_0x004d:
        L_0x004e:
            r1 = r4
        L_0x004f:
            if (r1 == 0) goto L_0x0052
            return r1
        L_0x0052:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r1 = r1.isAssignableFrom(r7)
            if (r1 == 0) goto L_0x009b
            java.lang.Class<java.util.SortedSet> r1 = java.util.SortedSet.class
            boolean r1 = r1.isAssignableFrom(r7)
            if (r1 == 0) goto L_0x006a
            com.google.gson.internal.e r4 = new com.google.gson.internal.e
            r0 = 5
            r4.<init>(r0)
            goto L_0x0101
        L_0x006a:
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r7)
            if (r1 == 0) goto L_0x0079
            com.google.gson.internal.d r4 = new com.google.gson.internal.d
            r4.<init>(r0, r2)
            goto L_0x0101
        L_0x0079:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 == 0) goto L_0x0089
            com.google.gson.internal.e r4 = new com.google.gson.internal.e
            r0 = 6
            r4.<init>(r0)
            goto L_0x0101
        L_0x0089:
            java.lang.Class<java.util.Queue> r0 = java.util.Queue.class
            boolean r0 = r0.isAssignableFrom(r7)
            com.google.gson.internal.e r4 = new com.google.gson.internal.e
            if (r0 == 0) goto L_0x0095
            r0 = 7
            goto L_0x0097
        L_0x0095:
            r0 = 8
        L_0x0097:
            r4.<init>(r0)
            goto L_0x0101
        L_0x009b:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r7)
            if (r1 == 0) goto L_0x0101
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            if (r7 != r1) goto L_0x00ad
            com.google.gson.internal.d r4 = new com.google.gson.internal.d
            r4.<init>(r0, r3)
            goto L_0x0101
        L_0x00ad:
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r1 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r1 = r1.isAssignableFrom(r7)
            if (r1 == 0) goto L_0x00bb
            com.google.gson.internal.e r4 = new com.google.gson.internal.e
            r4.<init>(r3)
            goto L_0x0101
        L_0x00bb:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r1 = java.util.concurrent.ConcurrentMap.class
            boolean r1 = r1.isAssignableFrom(r7)
            if (r1 == 0) goto L_0x00c9
            com.google.gson.internal.e r4 = new com.google.gson.internal.e
            r4.<init>(r2)
            goto L_0x0101
        L_0x00c9:
            java.lang.Class<java.util.SortedMap> r1 = java.util.SortedMap.class
            boolean r1 = r1.isAssignableFrom(r7)
            if (r1 == 0) goto L_0x00d8
            com.google.gson.internal.e r4 = new com.google.gson.internal.e
            r0 = 2
            r4.<init>(r0)
            goto L_0x0101
        L_0x00d8:
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x00fb
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r0 = r0[r3]
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get((java.lang.reflect.Type) r0)
            java.lang.Class r0 = r0.getRawType()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 != 0) goto L_0x00fb
            com.google.gson.internal.e r4 = new com.google.gson.internal.e
            r0 = 3
            r4.<init>(r0)
            goto L_0x0101
        L_0x00fb:
            com.google.gson.internal.e r4 = new com.google.gson.internal.e
            r0 = 4
            r4.<init>(r0)
        L_0x0101:
            if (r4 == 0) goto L_0x0104
            return r4
        L_0x0104:
            boolean r0 = r6.f280b
            if (r0 == 0) goto L_0x010e
            com.google.gson.internal.f r0 = new com.google.gson.internal.f
            r0.<init>(r6, r7)
            goto L_0x0126
        L_0x010e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create instance of "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.google.gson.internal.g r0 = new com.google.gson.internal.g
            r0.<init>(r7, r3)
        L_0x0126:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.ConstructorConstructor.get(com.google.gson.reflect.TypeToken):com.google.gson.internal.ObjectConstructor");
    }

    public String toString() {
        return this.f279a.toString();
    }
}
