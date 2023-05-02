package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: XFMFile */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a  reason: collision with root package name */
    public final ConstructorConstructor f341a;

    /* renamed from: b  reason: collision with root package name */
    public final FieldNamingStrategy f342b;

    /* renamed from: c  reason: collision with root package name */
    public final Excluder f343c;

    /* renamed from: d  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f344d;

    /* compiled from: XFMFile */
    public final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectConstructor f345a;

        /* renamed from: b  reason: collision with root package name */
        public final Map f346b;

        public Adapter(ObjectConstructor objectConstructor, LinkedHashMap linkedHashMap) {
            this.f345a = objectConstructor;
            this.f346b = linkedHashMap;
        }

        public T read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T construct = this.f345a.construct();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    f fVar = (f) this.f346b.get(jsonReader.nextName());
                    if (fVar != null) {
                        if (fVar.f382c) {
                            Object read = fVar.f385f.read(jsonReader);
                            if (read != null || !fVar.f388i) {
                                fVar.f383d.set(construct, read);
                            }
                        }
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return construct;
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        public void write(JsonWriter jsonWriter, T t2) {
            if (t2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (f fVar : this.f346b.values()) {
                    boolean z2 = false;
                    if (fVar.f381b) {
                        if (fVar.f383d.get(t2) != t2) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        jsonWriter.name(fVar.f380a);
                        Object obj = fVar.f383d.get(t2);
                        boolean z3 = fVar.f384e;
                        TypeAdapter typeAdapter = fVar.f385f;
                        if (!z3) {
                            typeAdapter = new TypeAdapterRuntimeTypeWrapper(fVar.f386g, typeAdapter, fVar.f387h.getType());
                        }
                        typeAdapter.write(jsonWriter, obj);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f341a = constructorConstructor;
        this.f342b = fieldNamingStrategy;
        this.f343c = excluder;
        this.f344d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0188 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0170 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r35, com.google.gson.reflect.TypeToken<T> r36) {
        /*
            r34 = this;
            r0 = r34
            r11 = r35
            java.lang.Class r1 = r36.getRawType()
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            boolean r2 = r12.isAssignableFrom(r1)
            r13 = 0
            if (r2 != 0) goto L_0x0012
            return r13
        L_0x0012:
            com.google.gson.internal.ConstructorConstructor r14 = r0.f341a
            r2 = r36
            com.google.gson.internal.ObjectConstructor r15 = r14.get(r2)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter r10 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            boolean r3 = r1.isInterface()
            if (r3 == 0) goto L_0x002c
        L_0x0027:
            r14 = r9
            r33 = r10
            goto L_0x01cd
        L_0x002c:
            java.lang.reflect.Type r8 = r36.getType()
            r7 = r1
            r16 = r2
        L_0x0033:
            if (r7 == r12) goto L_0x0027
            java.lang.reflect.Field[] r6 = r7.getDeclaredFields()
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L_0x003c:
            if (r3 >= r5) goto L_0x01a4
            r2 = r6[r3]
            r1 = 1
            boolean r17 = r0.excludeField(r2, r1)
            boolean r18 = r0.excludeField(r2, r4)
            if (r17 != 0) goto L_0x0061
            if (r18 != 0) goto L_0x0061
            r20 = r3
            r21 = r5
            r32 = r6
            r36 = r7
            r13 = r8
            r33 = r10
            r23 = r12
            r28 = r14
            r30 = 0
            r14 = r9
            goto L_0x0170
        L_0x0061:
            com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(r2)
            java.lang.reflect.Type r4 = r16.getType()
            java.lang.reflect.Type r13 = r2.getGenericType()
            java.lang.reflect.Type r13 = com.google.gson.internal.C$Gson$Types.resolve(r4, r7, r13)
            java.lang.Class<com.google.gson.annotations.SerializedName> r4 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            com.google.gson.annotations.SerializedName r4 = (com.google.gson.annotations.SerializedName) r4
            if (r4 != 0) goto L_0x0087
            com.google.gson.FieldNamingStrategy r4 = r0.f342b
            java.lang.String r4 = r4.translateName(r2)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r20 = r3
            goto L_0x0098
        L_0x0087:
            java.lang.String r1 = r4.value()
            java.lang.String[] r4 = r4.alternate()
            r20 = r3
            int r3 = r4.length
            if (r3 != 0) goto L_0x009e
            java.util.List r4 = java.util.Collections.singletonList(r1)
        L_0x0098:
            r21 = r5
            r19 = 1
            r5 = r4
            goto L_0x00be
        L_0x009e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r21 = r5
            int r5 = r4.length
            r19 = 1
            int r5 = r5 + 1
            r3.<init>(r5)
            r3.add(r1)
            int r1 = r4.length
            r5 = 0
        L_0x00af:
            if (r5 >= r1) goto L_0x00bd
            r22 = r1
            r1 = r4[r5]
            r3.add(r1)
            int r5 = r5 + 1
            r1 = r22
            goto L_0x00af
        L_0x00bd:
            r5 = r3
        L_0x00be:
            int r4 = r5.size()
            r1 = 0
            r3 = 0
        L_0x00c4:
            if (r3 >= r4) goto L_0x015f
            java.lang.Object r22 = r5.get(r3)
            r23 = r12
            r12 = r22
            java.lang.String r12 = (java.lang.String) r12
            r22 = r9
            if (r3 == 0) goto L_0x00d6
            r17 = 0
        L_0x00d6:
            com.google.gson.reflect.TypeToken r9 = com.google.gson.reflect.TypeToken.get((java.lang.reflect.Type) r13)
            java.lang.Class r24 = r9.getRawType()
            boolean r24 = com.google.gson.internal.Primitives.isPrimitive(r24)
            r25 = r1
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r1 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r1 = r2.getAnnotation(r1)
            com.google.gson.annotations.JsonAdapter r1 = (com.google.gson.annotations.JsonAdapter) r1
            r26 = r2
            if (r1 == 0) goto L_0x00fa
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r2 = r0.f344d
            r2.getClass()
            com.google.gson.TypeAdapter r1 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.a(r14, r11, r9, r1)
            goto L_0x00fb
        L_0x00fa:
            r1 = 0
        L_0x00fb:
            if (r1 == 0) goto L_0x0100
            r27 = 1
            goto L_0x0102
        L_0x0100:
            r27 = 0
        L_0x0102:
            if (r1 != 0) goto L_0x0108
            com.google.gson.TypeAdapter r1 = r11.getAdapter(r9)
        L_0x0108:
            r28 = r1
            com.google.gson.internal.bind.f r2 = new com.google.gson.internal.bind.f
            r0 = r25
            r1 = r2
            r11 = r2
            r25 = r26
            r2 = r12
            r26 = r3
            r3 = r17
            r29 = r4
            r30 = 0
            r4 = r18
            r31 = r5
            r5 = r25
            r32 = r6
            r6 = r27
            r36 = r7
            r7 = r28
            r27 = r13
            r13 = r8
            r8 = r35
            r28 = r14
            r14 = r22
            r33 = r10
            r10 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r14.put(r12, r11)
            com.google.gson.internal.bind.f r1 = (com.google.gson.internal.bind.f) r1
            if (r0 != 0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r1 = r0
        L_0x0143:
            int r3 = r26 + 1
            r0 = r34
            r11 = r35
            r7 = r36
            r8 = r13
            r9 = r14
            r12 = r23
            r2 = r25
            r13 = r27
            r14 = r28
            r4 = r29
            r5 = r31
            r6 = r32
            r10 = r33
            goto L_0x00c4
        L_0x015f:
            r0 = r1
            r32 = r6
            r36 = r7
            r13 = r8
            r33 = r10
            r23 = r12
            r28 = r14
            r30 = 0
            r14 = r9
            if (r0 != 0) goto L_0x0188
        L_0x0170:
            int r3 = r20 + 1
            r0 = r34
            r11 = r35
            r7 = r36
            r8 = r13
            r9 = r14
            r5 = r21
            r12 = r23
            r14 = r28
            r6 = r32
            r10 = r33
            r4 = 0
            r13 = 0
            goto L_0x003c
        L_0x0188:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r3 = " declares multiple JSON fields named "
            r2.append(r3)
            java.lang.String r0 = r0.f380a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x01a4:
            r36 = r7
            r13 = r8
            r33 = r10
            r23 = r12
            r28 = r14
            r14 = r9
            java.lang.reflect.Type r0 = r16.getType()
            java.lang.reflect.Type r1 = r36.getGenericSuperclass()
            r2 = r36
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.resolve(r0, r2, r1)
            com.google.gson.reflect.TypeToken r16 = com.google.gson.reflect.TypeToken.get((java.lang.reflect.Type) r0)
            java.lang.Class r7 = r16.getRawType()
            r0 = r34
            r11 = r35
            r14 = r28
            r13 = 0
            goto L_0x0033
        L_0x01cd:
            r0 = r33
            r0.<init>(r15, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
    }

    public boolean excludeField(Field field, boolean z2) {
        Class<?> type = field.getType();
        Excluder excluder = this.f343c;
        return !excluder.excludeClass(type, z2) && !excluder.excludeField(field, z2);
    }
}
