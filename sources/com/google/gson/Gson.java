package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: XFMFile */
public final class Gson {
    public static final ToNumberPolicy A = ToNumberPolicy.LAZILY_PARSED_NUMBER;
    public static final TypeToken B = TypeToken.get(Object.class);

    /* renamed from: y  reason: collision with root package name */
    public static final FieldNamingPolicy f222y = FieldNamingPolicy.IDENTITY;

    /* renamed from: z  reason: collision with root package name */
    public static final ToNumberPolicy f223z = ToNumberPolicy.DOUBLE;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal f224a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f225b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstructorConstructor f226c;

    /* renamed from: d  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f227d;

    /* renamed from: e  reason: collision with root package name */
    public final List f228e;

    /* renamed from: f  reason: collision with root package name */
    public final Excluder f229f;

    /* renamed from: g  reason: collision with root package name */
    public final FieldNamingStrategy f230g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f231h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f232i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f233j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f234k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f235l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f236m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f237n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f238o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f239p;

    /* renamed from: q  reason: collision with root package name */
    public final String f240q;

    /* renamed from: r  reason: collision with root package name */
    public final int f241r;

    /* renamed from: s  reason: collision with root package name */
    public final int f242s;

    /* renamed from: t  reason: collision with root package name */
    public final LongSerializationPolicy f243t;

    /* renamed from: u  reason: collision with root package name */
    public final List f244u;

    /* renamed from: v  reason: collision with root package name */
    public final List f245v;

    /* renamed from: w  reason: collision with root package name */
    public final ToNumberStrategy f246w;

    /* renamed from: x  reason: collision with root package name */
    public final ToNumberStrategy f247x;

    /* compiled from: XFMFile */
    class FutureTypeAdapter<T> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public TypeAdapter f250a;

        public final Object read(JsonReader jsonReader) {
            TypeAdapter typeAdapter = this.f250a;
            if (typeAdapter != null) {
                return typeAdapter.read(jsonReader);
            }
            throw new IllegalStateException();
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            TypeAdapter typeAdapter = this.f250a;
            if (typeAdapter != null) {
                typeAdapter.write(jsonWriter, obj);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public Gson() {
        this(Excluder.DEFAULT, f222y, Collections.emptyMap(), false, false, false, true, false, false, false, true, LongSerializationPolicy.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f223z, A);
    }

    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, LongSerializationPolicy longSerializationPolicy, String str, int i2, int i3, List list, List list2, List list3, ToNumberStrategy toNumberStrategy, ToNumberStrategy toNumberStrategy2) {
        boolean z10 = z3;
        boolean z11 = z8;
        boolean z12 = z9;
        LongSerializationPolicy longSerializationPolicy2 = longSerializationPolicy;
        this.f224a = new ThreadLocal();
        this.f225b = new ConcurrentHashMap();
        this.f229f = excluder;
        this.f230g = fieldNamingStrategy;
        this.f231h = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map, z12);
        this.f226c = constructorConstructor;
        this.f232i = z2;
        this.f233j = z10;
        this.f234k = z4;
        this.f235l = z5;
        this.f236m = z6;
        this.f237n = z7;
        this.f238o = z11;
        this.f239p = z12;
        this.f243t = longSerializationPolicy2;
        this.f240q = str;
        this.f241r = i2;
        this.f242s = i3;
        this.f244u = list;
        this.f245v = list2;
        this.f246w = toNumberStrategy;
        this.f247x = toNumberStrategy2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList.add(ObjectTypeAdapter.getFactory(toNumberStrategy));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.STRING_FACTORY);
        arrayList.add(TypeAdapters.INTEGER_FACTORY);
        arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.BYTE_FACTORY);
        arrayList.add(TypeAdapters.SHORT_FACTORY);
        final TypeAdapter r3 = longSerializationPolicy2 == LongSerializationPolicy.DEFAULT ? TypeAdapters.LONG : new TypeAdapter<Number>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Long.valueOf(jsonReader.nextLong());
                }
                jsonReader.nextNull();
                return null;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.toString());
                }
            }
        };
        arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, r3));
        arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, z11 ? TypeAdapters.DOUBLE : new TypeAdapter<Number>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.b(number.doubleValue());
                jsonWriter.value(number);
            }
        }));
        arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, z11 ? TypeAdapters.FLOAT : new TypeAdapter<Number>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.b((double) number.floatValue());
                jsonWriter.value(number);
            }
        }));
        arrayList.add(NumberTypeAdapter.getFactory(toNumberStrategy2));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.newFactory(AtomicLong.class, new TypeAdapter<AtomicLong>() {
            public final Object read(JsonReader jsonReader) {
                return new AtomicLong(((Number) TypeAdapter.this.read(jsonReader)).longValue());
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                TypeAdapter.this.write(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, new TypeAdapter<AtomicLongArray>() {
            public final Object read(JsonReader jsonReader) {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.read(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    TypeAdapter.this.write(jsonWriter, Long.valueOf(atomicLongArray.get(i2)));
                }
                jsonWriter.endArray();
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList.add(TypeAdapters.CHARACTER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
        arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
        arrayList.add(TypeAdapters.newFactory(LazilyParsedNumber.class, TypeAdapters.LAZILY_PARSED_NUMBER));
        arrayList.add(TypeAdapters.URL_FACTORY);
        arrayList.add(TypeAdapters.URI_FACTORY);
        arrayList.add(TypeAdapters.UUID_FACTORY);
        arrayList.add(TypeAdapters.CURRENCY_FACTORY);
        arrayList.add(TypeAdapters.LOCALE_FACTORY);
        arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList.add(TypeAdapters.BIT_SET_FACTORY);
        arrayList.add(DateTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CALENDAR_FACTORY);
        if (SqlTypesSupport.SUPPORTS_SQL_TYPES) {
            arrayList.add(SqlTypesSupport.TIME_FACTORY);
            arrayList.add(SqlTypesSupport.DATE_FACTORY);
            arrayList.add(SqlTypesSupport.TIMESTAMP_FACTORY);
        }
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CLASS_FACTORY);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor, z10));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.f227d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.ENUM_FACTORY);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f228e = Collections.unmodifiableList(arrayList);
    }

    public static void a(JsonReader jsonReader, Object obj) {
        if (obj != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IOException e3) {
                throw new JsonIOException((Throwable) e3);
            }
        }
    }

    public static void b(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    @Deprecated
    public Excluder excluder() {
        return this.f229f;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.f230g;
    }

    public <T> T fromJson(JsonElement jsonElement, Class<T> cls) {
        return Primitives.wrap(cls).cast(fromJson(jsonElement, (Type) cls));
    }

    public <T> T fromJson(JsonElement jsonElement, Type type) {
        if (jsonElement == null) {
            return null;
        }
        return fromJson((JsonReader) new JsonTreeReader(jsonElement), type);
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            jsonReader.peek();
            T read = getAdapter(TypeToken.get(type)).read(jsonReader);
            jsonReader.setLenient(isLenient);
            return read;
        } catch (EOFException e2) {
            if (1 != 0) {
                jsonReader.setLenient(isLenient);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IllegalStateException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (IOException e4) {
            throw new JsonSyntaxException((Throwable) e4);
        } catch (AssertionError e5) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e5.getMessage());
            assertionError.initCause(e5);
            throw assertionError;
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    public <T> T fromJson(Reader reader, Class<T> cls) {
        JsonReader newJsonReader = newJsonReader(reader);
        T fromJson = fromJson(newJsonReader, (Type) cls);
        a(newJsonReader, fromJson);
        return Primitives.wrap(cls).cast(fromJson);
    }

    public <T> T fromJson(Reader reader, Type type) {
        JsonReader newJsonReader = newJsonReader(reader);
        T fromJson = fromJson(newJsonReader, type);
        a(newJsonReader, fromJson);
        return fromJson;
    }

    public <T> T fromJson(String str, Class<T> cls) {
        return Primitives.wrap(cls).cast(fromJson(str, (Type) cls));
    }

    public <T> T fromJson(String str, Type type) {
        if (str == null) {
            return null;
        }
        return fromJson((Reader) new StringReader(str), type);
    }

    public <T> TypeAdapter<T> getAdapter(TypeToken<T> typeToken) {
        boolean z2;
        ConcurrentHashMap concurrentHashMap = this.f225b;
        TypeAdapter<T> typeAdapter = (TypeAdapter) concurrentHashMap.get(typeToken == null ? B : typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        ThreadLocal threadLocal = this.f224a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z2 = true;
        } else {
            z2 = false;
        }
        FutureTypeAdapter futureTypeAdapter = (FutureTypeAdapter) map.get(typeToken);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter futureTypeAdapter2 = new FutureTypeAdapter();
            map.put(typeToken, futureTypeAdapter2);
            for (TypeAdapterFactory create : this.f228e) {
                TypeAdapter<T> create2 = create.create(this, typeToken);
                if (create2 != null) {
                    if (futureTypeAdapter2.f250a == null) {
                        futureTypeAdapter2.f250a = create2;
                        concurrentHashMap.put(typeToken, create2);
                        return create2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.9.0) cannot handle " + typeToken);
        } finally {
            map.remove(typeToken);
            if (z2) {
                threadLocal.remove();
            }
        }
    }

    public <T> TypeAdapter<T> getAdapter(Class<T> cls) {
        return getAdapter(TypeToken.get(cls));
    }

    public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
        List<TypeAdapterFactory> list = this.f228e;
        if (!list.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.f227d;
        }
        boolean z2 = false;
        for (TypeAdapterFactory typeAdapterFactory2 : list) {
            if (z2) {
                TypeAdapter<T> create = typeAdapterFactory2.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z2 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public boolean htmlSafe() {
        return this.f235l;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.f237n);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) {
        if (this.f234k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f236m) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setHtmlSafe(this.f235l);
        jsonWriter.setLenient(this.f237n);
        jsonWriter.setSerializeNulls(this.f232i);
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return this.f232i;
    }

    public String toJson(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        toJson(jsonElement, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public String toJson(Object obj) {
        return obj == null ? toJson((JsonElement) JsonNull.INSTANCE) : toJson(obj, (Type) obj.getClass());
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public void toJson(JsonElement jsonElement, JsonWriter jsonWriter) {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f235l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f232i);
        try {
            Streams.write(jsonElement, jsonWriter);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public void toJson(JsonElement jsonElement, Appendable appendable) {
        try {
            toJson(jsonElement, newJsonWriter(Streams.writerForAppendable(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        }
    }

    public void toJson(Object obj, Appendable appendable) {
        if (obj != null) {
            toJson(obj, (Type) obj.getClass(), appendable);
        } else {
            toJson((JsonElement) JsonNull.INSTANCE, appendable);
        }
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) {
        TypeAdapter<?> adapter = getAdapter(TypeToken.get(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f235l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f232i);
        try {
            adapter.write(jsonWriter, obj);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public void toJson(Object obj, Type type, Appendable appendable) {
        try {
            toJson(obj, type, newJsonWriter(Streams.writerForAppendable(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        }
    }

    public JsonElement toJsonTree(Object obj) {
        return obj == null ? JsonNull.INSTANCE : toJsonTree(obj, obj.getClass());
    }

    public JsonElement toJsonTree(Object obj, Type type) {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        toJson(obj, type, (JsonWriter) jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    public String toString() {
        return "{serializeNulls:" + this.f232i + ",factories:" + this.f228e + ",instanceCreators:" + this.f226c + "}";
    }
}
