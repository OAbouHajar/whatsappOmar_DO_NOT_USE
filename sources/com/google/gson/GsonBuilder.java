package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: XFMFile */
public final class GsonBuilder {

    /* renamed from: a  reason: collision with root package name */
    public Excluder f251a;

    /* renamed from: b  reason: collision with root package name */
    public LongSerializationPolicy f252b;

    /* renamed from: c  reason: collision with root package name */
    public FieldNamingStrategy f253c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f254d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f255e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f256f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f257g;

    /* renamed from: h  reason: collision with root package name */
    public String f258h;

    /* renamed from: i  reason: collision with root package name */
    public int f259i;

    /* renamed from: j  reason: collision with root package name */
    public int f260j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f261k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f262l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f263m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f264n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f265o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f266p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f267q;

    /* renamed from: r  reason: collision with root package name */
    public ToNumberStrategy f268r;

    /* renamed from: s  reason: collision with root package name */
    public ToNumberStrategy f269s;

    public GsonBuilder() {
        this.f251a = Excluder.DEFAULT;
        this.f252b = LongSerializationPolicy.DEFAULT;
        this.f253c = FieldNamingPolicy.IDENTITY;
        this.f254d = new HashMap();
        this.f255e = new ArrayList();
        this.f256f = new ArrayList();
        this.f257g = false;
        FieldNamingPolicy fieldNamingPolicy = Gson.f222y;
        this.f258h = null;
        this.f259i = 2;
        this.f260j = 2;
        this.f261k = false;
        this.f262l = false;
        this.f263m = true;
        this.f264n = false;
        this.f265o = false;
        this.f266p = false;
        this.f267q = true;
        this.f268r = Gson.f223z;
        this.f269s = Gson.A;
    }

    public GsonBuilder(Gson gson) {
        this.f251a = Excluder.DEFAULT;
        this.f252b = LongSerializationPolicy.DEFAULT;
        this.f253c = FieldNamingPolicy.IDENTITY;
        HashMap hashMap = new HashMap();
        this.f254d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f255e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f256f = arrayList2;
        this.f257g = false;
        FieldNamingPolicy fieldNamingPolicy = Gson.f222y;
        this.f258h = null;
        this.f259i = 2;
        this.f260j = 2;
        this.f261k = false;
        this.f262l = false;
        this.f263m = true;
        this.f264n = false;
        this.f265o = false;
        this.f266p = false;
        this.f267q = true;
        this.f268r = Gson.f223z;
        this.f269s = Gson.A;
        this.f251a = gson.f229f;
        this.f253c = gson.f230g;
        hashMap.putAll(gson.f231h);
        this.f257g = gson.f232i;
        this.f261k = gson.f233j;
        this.f265o = gson.f234k;
        this.f263m = gson.f235l;
        this.f264n = gson.f236m;
        this.f266p = gson.f237n;
        this.f262l = gson.f238o;
        this.f252b = gson.f243t;
        this.f258h = gson.f240q;
        this.f259i = gson.f241r;
        this.f260j = gson.f242s;
        arrayList.addAll(gson.f244u);
        arrayList2.addAll(gson.f245v);
        this.f267q = gson.f239p;
        this.f268r = gson.f246w;
        this.f269s = gson.f247x;
    }

    public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        this.f251a = this.f251a.withExclusionStrategy(exclusionStrategy, false, true);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        this.f251a = this.f251a.withExclusionStrategy(exclusionStrategy, true, false);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.Gson create() {
        /*
            r25 = this;
            r0 = r25
            java.util.ArrayList r15 = new java.util.ArrayList
            java.util.ArrayList r14 = r0.f255e
            int r1 = r14.size()
            java.util.ArrayList r13 = r0.f256f
            int r2 = r13.size()
            int r2 = r2 + r1
            int r2 = r2 + 3
            r15.<init>(r2)
            r15.addAll(r14)
            java.util.Collections.reverse(r15)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r13)
            java.util.Collections.reverse(r1)
            r15.addAll(r1)
            java.lang.String r1 = r0.f258h
            int r2 = r0.f259i
            int r3 = r0.f260j
            boolean r4 = com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES
            if (r1 == 0) goto L_0x0050
            java.lang.String r5 = r1.trim()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0050
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r2 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            com.google.gson.TypeAdapterFactory r2 = r2.createAdapterFactory((java.lang.String) r1)
            if (r4 == 0) goto L_0x0071
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r3 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            com.google.gson.TypeAdapterFactory r3 = r3.createAdapterFactory((java.lang.String) r1)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r5 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            com.google.gson.TypeAdapterFactory r1 = r5.createAdapterFactory((java.lang.String) r1)
            goto L_0x0073
        L_0x0050:
            r1 = 2
            if (r2 == r1) goto L_0x007e
            if (r3 == r1) goto L_0x007e
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r1 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            com.google.gson.TypeAdapterFactory r1 = r1.createAdapterFactory(r2, r3)
            if (r4 == 0) goto L_0x0070
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r5 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            com.google.gson.TypeAdapterFactory r5 = r5.createAdapterFactory(r2, r3)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r6 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            com.google.gson.TypeAdapterFactory r2 = r6.createAdapterFactory(r2, r3)
            r3 = r5
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x0073
        L_0x0070:
            r2 = r1
        L_0x0071:
            r3 = 0
            r1 = r3
        L_0x0073:
            r15.add(r2)
            if (r4 == 0) goto L_0x007e
            r15.add(r3)
            r15.add(r1)
        L_0x007e:
            com.google.gson.Gson r22 = new com.google.gson.Gson
            r1 = r22
            com.google.gson.internal.Excluder r2 = r0.f251a
            com.google.gson.FieldNamingStrategy r3 = r0.f253c
            java.util.HashMap r4 = r0.f254d
            boolean r5 = r0.f257g
            boolean r6 = r0.f261k
            boolean r7 = r0.f265o
            boolean r8 = r0.f263m
            boolean r9 = r0.f264n
            boolean r10 = r0.f266p
            boolean r11 = r0.f262l
            boolean r12 = r0.f267q
            r16 = r13
            com.google.gson.LongSerializationPolicy r13 = r0.f252b
            r18 = r16
            r16 = r14
            java.lang.String r14 = r0.f258h
            r17 = r16
            r16 = r15
            int r15 = r0.f259i
            r19 = r16
            r23 = r1
            int r1 = r0.f260j
            r16 = r1
            com.google.gson.ToNumberStrategy r1 = r0.f268r
            r20 = r1
            com.google.gson.ToNumberStrategy r1 = r0.f269s
            r21 = r1
            r1 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.GsonBuilder.create():com.google.gson.Gson");
    }

    public GsonBuilder disableHtmlEscaping() {
        this.f263m = false;
        return this;
    }

    public GsonBuilder disableInnerClassSerialization() {
        this.f251a = this.f251a.disableInnerClassSerialization();
        return this;
    }

    public GsonBuilder disableJdkUnsafe() {
        this.f267q = false;
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.f261k = true;
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        this.f251a = this.f251a.withModifiers(iArr);
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.f251a = this.f251a.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.f265o = true;
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
        boolean z2 = obj instanceof JsonSerializer;
        C$Gson$Preconditions.checkArgument(z2 || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof TypeAdapter));
        if (obj instanceof InstanceCreator) {
            this.f254d.put(type, (InstanceCreator) obj);
        }
        ArrayList arrayList = this.f255e;
        if (z2 || (obj instanceof JsonDeserializer)) {
            arrayList.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            arrayList.add(TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter) obj));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeAdapterFactory) {
        this.f255e.add(typeAdapterFactory);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        boolean z2 = obj instanceof JsonSerializer;
        C$Gson$Preconditions.checkArgument(z2 || (obj instanceof JsonDeserializer) || (obj instanceof TypeAdapter));
        if ((obj instanceof JsonDeserializer) || z2) {
            this.f256f.add(TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
        }
        if (obj instanceof TypeAdapter) {
            this.f255e.add(TypeAdapters.newTypeHierarchyFactory(cls, (TypeAdapter) obj));
        }
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.f257g = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.f262l = true;
        return this;
    }

    public GsonBuilder setDateFormat(int i2) {
        this.f259i = i2;
        this.f258h = null;
        return this;
    }

    public GsonBuilder setDateFormat(int i2, int i3) {
        this.f259i = i2;
        this.f260j = i3;
        this.f258h = null;
        return this;
    }

    public GsonBuilder setDateFormat(String str) {
        this.f258h = str;
        return this;
    }

    public GsonBuilder setExclusionStrategies(ExclusionStrategy... exclusionStrategyArr) {
        for (ExclusionStrategy withExclusionStrategy : exclusionStrategyArr) {
            this.f251a = this.f251a.withExclusionStrategy(withExclusionStrategy, true, true);
        }
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldNamingPolicy) {
        this.f253c = fieldNamingPolicy;
        return this;
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        this.f253c = fieldNamingStrategy;
        return this;
    }

    public GsonBuilder setLenient() {
        this.f266p = true;
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longSerializationPolicy) {
        this.f252b = longSerializationPolicy;
        return this;
    }

    public GsonBuilder setNumberToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        this.f269s = toNumberStrategy;
        return this;
    }

    public GsonBuilder setObjectToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        this.f268r = toNumberStrategy;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        this.f264n = true;
        return this;
    }

    public GsonBuilder setVersion(double d2) {
        this.f251a = this.f251a.withVersion(d2);
        return this;
    }
}
