package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: XFMFile */
public final class TypeAdapters {
    public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER;
    public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapter<BigDecimal> BIG_DECIMAL = new TypeAdapter<BigDecimal>() {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            try {
                return new BigDecimal(nextString);
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException("Failed parsing '" + nextString + "' as BigDecimal; at path " + jsonReader.getPreviousPath(), e2);
            }
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) (BigDecimal) obj);
        }
    };
    public static final TypeAdapter<BigInteger> BIG_INTEGER = new TypeAdapter<BigInteger>() {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            try {
                return new BigInteger(nextString);
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException("Failed parsing '" + nextString + "' as BigInteger; at path " + jsonReader.getPreviousPath(), e2);
            }
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) (BigInteger) obj);
        }
    };
    public static final TypeAdapter<BitSet> BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter<Boolean> BOOLEAN;
    public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING = new TypeAdapter<Boolean>() {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            Boolean bool = (Boolean) obj;
            jsonWriter.value(bool == null ? "null" : bool.toString());
        }
    };
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapter<Number> BYTE;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter<Calendar> CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter<Character> CHARACTER;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter<Class> CLASS;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter<Currency> CURRENCY;
    public static final TypeAdapterFactory CURRENCY_FACTORY;
    public static final TypeAdapter<Number> DOUBLE = new TypeAdapter<Number>() {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) obj);
        }
    };
    public static final TypeAdapterFactory ENUM_FACTORY = new TypeAdapterFactory() {
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            Class<? super Enum> rawType = typeToken.getRawType();
            Class<Enum> cls = Enum.class;
            if (!cls.isAssignableFrom(rawType) || rawType == cls) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };
    public static final TypeAdapter<Number> FLOAT = new TypeAdapter<Number>() {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) obj);
        }
    };
    public static final TypeAdapter<InetAddress> INET_ADDRESS;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapter<Number> INTEGER;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter<JsonElement> JSON_ELEMENT;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final TypeAdapter<LazilyParsedNumber> LAZILY_PARSED_NUMBER = new TypeAdapter<LazilyParsedNumber>() {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new LazilyParsedNumber(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) (LazilyParsedNumber) obj);
        }
    };
    public static final TypeAdapter<Locale> LOCALE;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapter<Number> LONG = new TypeAdapter<Number>() {
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            jsonWriter.value((Number) obj);
        }
    };
    public static final TypeAdapter<Number> SHORT;
    public static final TypeAdapterFactory SHORT_FACTORY;
    public static final TypeAdapter<String> STRING;
    public static final TypeAdapter<StringBuffer> STRING_BUFFER;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final TypeAdapter<StringBuilder> STRING_BUILDER;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final TypeAdapterFactory STRING_FACTORY;
    public static final TypeAdapter<URI> URI;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter<URL> URL;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter<UUID> UUID;
    public static final TypeAdapterFactory UUID_FACTORY;

    /* compiled from: XFMFile */
    final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f376a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f377b = new HashMap();

        public EnumTypeAdapter(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new i(cls))) {
                    Enum enumR = (Enum) field.get((Object) null);
                    String name = enumR.name();
                    SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        name = serializedName.value();
                        for (String put : serializedName.alternate()) {
                            this.f376a.put(put, enumR);
                        }
                    }
                    this.f376a.put(name, enumR);
                    this.f377b.put(enumR, name);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (Enum) this.f376a.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            Enum enumR = (Enum) obj;
            jsonWriter.value(enumR == null ? null : (String) this.f377b.get(enumR));
        }
    }

    static {
        TypeAdapter<Class> nullSafe = new TypeAdapter<Class>() {
            public final Object read(JsonReader jsonReader) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        CLASS = nullSafe;
        CLASS_FACTORY = newFactory(Class.class, nullSafe);
        TypeAdapter<BitSet> nullSafe2 = new TypeAdapter<BitSet>() {
            public final Object read(JsonReader jsonReader) {
                BitSet bitSet = new BitSet();
                jsonReader.beginArray();
                JsonToken peek = jsonReader.peek();
                int i2 = 0;
                while (peek != JsonToken.END_ARRAY) {
                    int i3 = h.f390a[peek.ordinal()];
                    boolean z2 = true;
                    if (i3 == 1 || i3 == 2) {
                        int nextInt = jsonReader.nextInt();
                        if (nextInt == 0) {
                            z2 = false;
                        } else if (nextInt != 1) {
                            throw new JsonSyntaxException("Invalid bitset value " + nextInt + ", expected 0 or 1; at path " + jsonReader.getPreviousPath());
                        }
                    } else if (i3 == 3) {
                        z2 = jsonReader.nextBoolean();
                    } else {
                        throw new JsonSyntaxException("Invalid bitset value type: " + peek + "; at path " + jsonReader.getPath());
                    }
                    if (z2) {
                        bitSet.set(i2);
                    }
                    i2++;
                    peek = jsonReader.peek();
                }
                jsonReader.endArray();
                return bitSet;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                BitSet bitSet = (BitSet) obj;
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.value(bitSet.get(i2) ? 1 : 0);
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        BIT_SET = nullSafe2;
        BIT_SET_FACTORY = newFactory(BitSet.class, nullSafe2);
        AnonymousClass3 r0 = new TypeAdapter<Boolean>() {
            public final Object read(JsonReader jsonReader) {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Boolean.valueOf(peek == JsonToken.STRING ? Boolean.parseBoolean(jsonReader.nextString()) : jsonReader.nextBoolean());
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.value((Boolean) obj);
            }
        };
        BOOLEAN = r0;
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, r0);
        AnonymousClass5 r02 = new TypeAdapter<Number>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt <= 255 && nextInt >= -128) {
                        return Byte.valueOf((byte) nextInt);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + nextInt + " to byte; at path " + jsonReader.getPreviousPath());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.value((Number) obj);
            }
        };
        BYTE = r02;
        BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, r02);
        AnonymousClass6 r03 = new TypeAdapter<Number>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt <= 65535 && nextInt >= -32768) {
                        return Short.valueOf((short) nextInt);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + nextInt + " to short; at path " + jsonReader.getPreviousPath());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.value((Number) obj);
            }
        };
        SHORT = r03;
        SHORT_FACTORY = newFactory(Short.TYPE, Short.class, r03);
        AnonymousClass7 r04 = new TypeAdapter<Number>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.value((Number) obj);
            }
        };
        INTEGER = r04;
        INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, r04);
        TypeAdapter<AtomicInteger> nullSafe3 = new TypeAdapter<AtomicInteger>() {
            public final Object read(JsonReader jsonReader) {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.value((long) ((AtomicInteger) obj).get());
            }
        }.nullSafe();
        ATOMIC_INTEGER = nullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, nullSafe3);
        TypeAdapter<AtomicBoolean> nullSafe4 = new TypeAdapter<AtomicBoolean>() {
            public final Object read(JsonReader jsonReader) {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.value(((AtomicBoolean) obj).get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN = nullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, nullSafe4);
        TypeAdapter<AtomicIntegerArray> nullSafe5 = new TypeAdapter<AtomicIntegerArray>() {
            public final Object read(JsonReader jsonReader) {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException((Throwable) e2);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.value((long) atomicIntegerArray.get(i2));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY = nullSafe5;
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, nullSafe5);
        AnonymousClass14 r05 = new TypeAdapter<Character>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (nextString.length() == 1) {
                    return Character.valueOf(nextString.charAt(0));
                }
                throw new JsonSyntaxException("Expecting character, got: " + nextString + "; at " + jsonReader.getPreviousPath());
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                Character ch = (Character) obj;
                jsonWriter.value(ch == null ? null : String.valueOf(ch));
            }
        };
        CHARACTER = r05;
        CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, r05);
        AnonymousClass15 r06 = new TypeAdapter<String>() {
            public final Object read(JsonReader jsonReader) {
                JsonToken peek = jsonReader.peek();
                if (peek != JsonToken.NULL) {
                    return peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
                jsonReader.nextNull();
                return null;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.value((String) obj);
            }
        };
        STRING = r06;
        STRING_FACTORY = newFactory(String.class, r06);
        AnonymousClass19 r07 = new TypeAdapter<StringBuilder>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                StringBuilder sb = (StringBuilder) obj;
                jsonWriter.value(sb == null ? null : sb.toString());
            }
        };
        STRING_BUILDER = r07;
        STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, r07);
        AnonymousClass20 r08 = new TypeAdapter<StringBuffer>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                StringBuffer stringBuffer = (StringBuffer) obj;
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        STRING_BUFFER = r08;
        STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, r08);
        AnonymousClass21 r09 = new TypeAdapter<URL>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URL(nextString);
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                URL url = (URL) obj;
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        URL = r09;
        URL_FACTORY = newFactory(URL.class, r09);
        AnonymousClass22 r010 = new TypeAdapter<URI>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String nextString = jsonReader.nextString();
                    if ("null".equals(nextString)) {
                        return null;
                    }
                    return new URI(nextString);
                } catch (URISyntaxException e2) {
                    throw new JsonIOException((Throwable) e2);
                }
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                URI uri = (URI) obj;
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        URI = r010;
        URI_FACTORY = newFactory(URI.class, r010);
        AnonymousClass23 r011 = new TypeAdapter<InetAddress>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                InetAddress inetAddress = (InetAddress) obj;
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        INET_ADDRESS = r011;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, r011);
        AnonymousClass24 r012 = new TypeAdapter<UUID>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    return UUID.fromString(nextString);
                } catch (IllegalArgumentException e2) {
                    throw new JsonSyntaxException("Failed parsing '" + nextString + "' as UUID; at path " + jsonReader.getPreviousPath(), e2);
                }
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                UUID uuid = (UUID) obj;
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        UUID = r012;
        UUID_FACTORY = newFactory(UUID.class, r012);
        TypeAdapter<Currency> nullSafe6 = new TypeAdapter<Currency>() {
            public final Object read(JsonReader jsonReader) {
                String nextString = jsonReader.nextString();
                try {
                    return Currency.getInstance(nextString);
                } catch (IllegalArgumentException e2) {
                    throw new JsonSyntaxException("Failed parsing '" + nextString + "' as Currency; at path " + jsonReader.getPreviousPath(), e2);
                }
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.value(((Currency) obj).getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY = nullSafe6;
        CURRENCY_FACTORY = newFactory(Currency.class, nullSafe6);
        AnonymousClass26 r013 = new TypeAdapter<Calendar>() {
            public final Object read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    if ("year".equals(nextName)) {
                        i2 = nextInt;
                    } else if ("month".equals(nextName)) {
                        i3 = nextInt;
                    } else if ("dayOfMonth".equals(nextName)) {
                        i4 = nextInt;
                    } else if ("hourOfDay".equals(nextName)) {
                        i5 = nextInt;
                    } else if ("minute".equals(nextName)) {
                        i6 = nextInt;
                    } else if ("second".equals(nextName)) {
                        i7 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value((long) calendar.get(1));
                jsonWriter.name("month");
                jsonWriter.value((long) calendar.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value((long) calendar.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value((long) calendar.get(11));
                jsonWriter.name("minute");
                jsonWriter.value((long) calendar.get(12));
                jsonWriter.name("second");
                jsonWriter.value((long) calendar.get(13));
                jsonWriter.endObject();
            }
        };
        CALENDAR = r013;
        CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, r013);
        AnonymousClass27 r014 = new TypeAdapter<Locale>() {
            public final Object read(JsonReader jsonReader) {
                Locale locale;
                String str = null;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                if (nextToken2 == null && str == null) {
                    return new Locale(nextToken);
                }
                if (str != null) {
                    locale = new Locale(nextToken, nextToken2, str);
                }
                return locale;
            }

            public final void write(JsonWriter jsonWriter, Object obj) {
                Locale locale = (Locale) obj;
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        };
        LOCALE = r014;
        LOCALE_FACTORY = newFactory(Locale.class, r014);
        AnonymousClass28 r015 = new TypeAdapter<JsonElement>() {
            public static JsonElement a(JsonReader jsonReader) {
                if (jsonReader instanceof JsonTreeReader) {
                    JsonTreeReader jsonTreeReader = (JsonTreeReader) jsonReader;
                    JsonToken peek = jsonTreeReader.peek();
                    if (peek == JsonToken.NAME || peek == JsonToken.END_ARRAY || peek == JsonToken.END_OBJECT || peek == JsonToken.END_DOCUMENT) {
                        throw new IllegalStateException("Unexpected " + peek + " when reading a JsonElement.");
                    }
                    JsonElement jsonElement = (JsonElement) jsonTreeReader.p();
                    jsonTreeReader.skipValue();
                    return jsonElement;
                }
                switch (h.f390a[jsonReader.peek().ordinal()]) {
                    case 1:
                        return new JsonPrimitive((Number) new LazilyParsedNumber(jsonReader.nextString()));
                    case 2:
                        return new JsonPrimitive(jsonReader.nextString());
                    case 3:
                        return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
                    case 4:
                        jsonReader.nextNull();
                        return JsonNull.INSTANCE;
                    case 5:
                        JsonArray jsonArray = new JsonArray();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonArray.add(a(jsonReader));
                        }
                        jsonReader.endArray();
                        return jsonArray;
                    case 6:
                        JsonObject jsonObject = new JsonObject();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            jsonObject.add(jsonReader.nextName(), a(jsonReader));
                        }
                        jsonReader.endObject();
                        return jsonObject;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            public static void b(JsonElement jsonElement, JsonWriter jsonWriter) {
                if (jsonElement == null || jsonElement.isJsonNull()) {
                    jsonWriter.nullValue();
                } else if (jsonElement.isJsonPrimitive()) {
                    JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                    if (asJsonPrimitive.isNumber()) {
                        jsonWriter.value(asJsonPrimitive.getAsNumber());
                    } else if (asJsonPrimitive.isBoolean()) {
                        jsonWriter.value(asJsonPrimitive.getAsBoolean());
                    } else {
                        jsonWriter.value(asJsonPrimitive.getAsString());
                    }
                } else if (jsonElement.isJsonArray()) {
                    jsonWriter.beginArray();
                    Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
                    while (it.hasNext()) {
                        b(it.next(), jsonWriter);
                    }
                    jsonWriter.endArray();
                } else if (jsonElement.isJsonObject()) {
                    jsonWriter.beginObject();
                    for (Map.Entry next : jsonElement.getAsJsonObject().entrySet()) {
                        jsonWriter.name((String) next.getKey());
                        b((JsonElement) next.getValue(), jsonWriter);
                    }
                    jsonWriter.endObject();
                } else {
                    throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
                }
            }

            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                return a(jsonReader);
            }

            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                b((JsonElement) obj, jsonWriter);
            }
        };
        JSON_ELEMENT = r015;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, r015);
    }

    public static <TT> TypeAdapterFactory newFactory(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            public final TypeAdapter create(Gson gson, TypeToken typeToken) {
                if (typeToken.equals(TypeToken.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            public final TypeAdapter create(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            public final TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            public final TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <T1> TypeAdapterFactory newTypeHierarchyFactory(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new TypeAdapterFactory() {
            public final TypeAdapter create(Gson gson, TypeToken typeToken) {
                final Class rawType = typeToken.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new TypeAdapter<Object>() {
                    public final Object read(JsonReader jsonReader) {
                        Object read = typeAdapter.read(jsonReader);
                        if (read != null) {
                            Class cls = rawType;
                            if (!cls.isInstance(read)) {
                                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                            }
                        }
                        return read;
                    }

                    public final void write(JsonWriter jsonWriter, Object obj) {
                        typeAdapter.write(jsonWriter, obj);
                    }
                };
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
