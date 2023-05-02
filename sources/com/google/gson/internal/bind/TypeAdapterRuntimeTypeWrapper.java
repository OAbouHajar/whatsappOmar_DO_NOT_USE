package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: XFMFile */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f359a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter f360b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f361c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f359a = gson;
        this.f360b = typeAdapter;
        this.f361c = type;
    }

    public final Object read(JsonReader jsonReader) {
        return this.f360b.read(jsonReader);
    }

    public final void write(JsonWriter jsonWriter, Object obj) {
        Type type = this.f361c;
        Type type2 = (obj == null || (type != Object.class && !(type instanceof TypeVariable) && !(type instanceof Class))) ? type : obj.getClass();
        TypeAdapter<?> typeAdapter = this.f360b;
        if (type2 != type) {
            TypeAdapter<?> adapter = this.f359a.getAdapter(TypeToken.get(type2));
            if (!(adapter instanceof ReflectiveTypeAdapterFactory.Adapter) || (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                typeAdapter = adapter;
            }
        }
        typeAdapter.write(jsonWriter, obj);
    }
}
