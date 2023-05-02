package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* compiled from: XFMFile */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final JsonSerializer f347a;

    /* renamed from: b  reason: collision with root package name */
    public final JsonDeserializer f348b;

    /* renamed from: c  reason: collision with root package name */
    public final Gson f349c;

    /* renamed from: d  reason: collision with root package name */
    public final TypeToken f350d;

    /* renamed from: e  reason: collision with root package name */
    public final TypeAdapterFactory f351e;

    /* renamed from: f  reason: collision with root package name */
    public final g f352f = new g(this);

    /* renamed from: g  reason: collision with root package name */
    public volatile TypeAdapter f353g;

    /* compiled from: XFMFile */
    final class SingleTypeFactory implements TypeAdapterFactory {

        /* renamed from: a  reason: collision with root package name */
        public final TypeToken f354a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f355b;

        /* renamed from: c  reason: collision with root package name */
        public final Class f356c;

        /* renamed from: d  reason: collision with root package name */
        public final JsonSerializer f357d;

        /* renamed from: e  reason: collision with root package name */
        public final JsonDeserializer f358e;

        public SingleTypeFactory(Object obj, TypeToken typeToken, boolean z2, Class cls) {
            JsonDeserializer jsonDeserializer = null;
            JsonSerializer jsonSerializer = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            this.f357d = jsonSerializer;
            jsonDeserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : jsonDeserializer;
            this.f358e = jsonDeserializer;
            C$Gson$Preconditions.checkArgument((jsonSerializer == null && jsonDeserializer == null) ? false : true);
            this.f354a = typeToken;
            this.f355b = z2;
            this.f356c = cls;
        }

        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            TypeToken typeToken2 = this.f354a;
            if (typeToken2 != null ? typeToken2.equals(typeToken) || (this.f355b && typeToken2.getType() == typeToken.getRawType()) : this.f356c.isAssignableFrom(typeToken.getRawType())) {
                return new TreeTypeAdapter(this.f357d, this.f358e, gson, typeToken, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this.f347a = jsonSerializer;
        this.f348b = jsonDeserializer;
        this.f349c = gson;
        this.f350d = typeToken;
        this.f351e = typeAdapterFactory;
    }

    public static TypeAdapterFactory newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, (Class) null);
    }

    public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), (Class) null);
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, (TypeToken) null, false, cls);
    }

    public T read(JsonReader jsonReader) {
        JsonDeserializer jsonDeserializer = this.f348b;
        if (jsonDeserializer == null) {
            TypeAdapter typeAdapter = this.f353g;
            if (typeAdapter == null) {
                typeAdapter = this.f349c.getDelegateAdapter(this.f351e, this.f350d);
                this.f353g = typeAdapter;
            }
            return typeAdapter.read(jsonReader);
        }
        JsonElement parse = Streams.parse(jsonReader);
        if (parse.isJsonNull()) {
            return null;
        }
        return jsonDeserializer.deserialize(parse, this.f350d.getType(), this.f352f);
    }

    public void write(JsonWriter jsonWriter, T t2) {
        JsonSerializer jsonSerializer = this.f347a;
        if (jsonSerializer == null) {
            TypeAdapter typeAdapter = this.f353g;
            if (typeAdapter == null) {
                typeAdapter = this.f349c.getDelegateAdapter(this.f351e, this.f350d);
                this.f353g = typeAdapter;
            }
            typeAdapter.write(jsonWriter, t2);
        } else if (t2 == null) {
            jsonWriter.nullValue();
        } else {
            Streams.write(jsonSerializer.serialize(t2, this.f350d.getType(), this.f352f), jsonWriter);
        }
    }
}
