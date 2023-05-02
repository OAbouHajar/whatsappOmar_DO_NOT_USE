package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: XFMFile */
public final class MapTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a  reason: collision with root package name */
    public final ConstructorConstructor f328a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f329b;

    /* compiled from: XFMFile */
    final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final TypeAdapter f330a;

        /* renamed from: b  reason: collision with root package name */
        public final TypeAdapter f331b;

        /* renamed from: c  reason: collision with root package name */
        public final ObjectConstructor f332c;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, ObjectConstructor objectConstructor) {
            this.f330a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f331b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f332c = objectConstructor;
        }

        public final Object read(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map map = (Map) this.f332c.construct();
            JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
            TypeAdapter typeAdapter = this.f331b;
            TypeAdapter typeAdapter2 = this.f330a;
            if (peek == jsonToken) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    Object read = typeAdapter2.read(jsonReader);
                    if (map.put(read, typeAdapter.read(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + read);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                    Object read2 = typeAdapter2.read(jsonReader);
                    if (map.put(read2, typeAdapter.read(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + read2);
                    }
                }
                jsonReader.endObject();
            }
            return map;
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            boolean z2 = MapTypeAdapterFactory.this.f329b;
            TypeAdapter typeAdapter = this.f331b;
            if (!z2) {
                jsonWriter.beginObject();
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    typeAdapter.write(jsonWriter, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z3 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    JsonElement jsonTree = this.f330a.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    z3 |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
                }
                if (z3) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i2 < size) {
                        jsonWriter.beginArray();
                        Streams.write((JsonElement) arrayList.get(i2), jsonWriter);
                        typeAdapter.write(jsonWriter, arrayList2.get(i2));
                        jsonWriter.endArray();
                        i2++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    JsonElement jsonElement = (JsonElement) arrayList.get(i2);
                    if (jsonElement.isJsonPrimitive()) {
                        JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                        if (asJsonPrimitive.isNumber()) {
                            str = String.valueOf(asJsonPrimitive.getAsNumber());
                        } else if (asJsonPrimitive.isBoolean()) {
                            str = Boolean.toString(asJsonPrimitive.getAsBoolean());
                        } else if (asJsonPrimitive.isString()) {
                            str = asJsonPrimitive.getAsString();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (jsonElement.isJsonNull()) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    jsonWriter.name(str);
                    typeAdapter.write(jsonWriter, arrayList2.get(i2));
                    i2++;
                }
            }
            jsonWriter.endObject();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z2) {
        this.f328a = constructorConstructor;
        this.f329b = z2;
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Type[] mapKeyAndValueTypes = C$Gson$Types.getMapKeyAndValueTypes(type, C$Gson$Types.getRawType(type));
        Type type2 = mapKeyAndValueTypes[0];
        return new Adapter(gson, mapKeyAndValueTypes[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : gson.getAdapter(TypeToken.get(type2)), mapKeyAndValueTypes[1], gson.getAdapter(TypeToken.get(mapKeyAndValueTypes[1])), this.f328a.get(typeToken));
    }
}
