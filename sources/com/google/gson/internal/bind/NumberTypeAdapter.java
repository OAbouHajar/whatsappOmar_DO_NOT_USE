package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* compiled from: XFMFile */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* renamed from: b  reason: collision with root package name */
    public static final TypeAdapterFactory f334b = new TypeAdapterFactory() {
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Number.class) {
                return NumberTypeAdapter.this;
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final ToNumberStrategy f335a;

    public NumberTypeAdapter(ToNumberStrategy toNumberStrategy) {
        this.f335a = toNumberStrategy;
    }

    public static TypeAdapterFactory getFactory(ToNumberStrategy toNumberStrategy) {
        return toNumberStrategy == ToNumberPolicy.LAZILY_PARSED_NUMBER ? f334b : new TypeAdapterFactory() {
            public final TypeAdapter create(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    public Number read(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        int i2 = d.f378a[peek.ordinal()];
        if (i2 == 1) {
            jsonReader.nextNull();
            return null;
        } else if (i2 == 2 || i2 == 3) {
            return this.f335a.readNumber(jsonReader);
        } else {
            throw new JsonSyntaxException("Expecting number, got: " + peek + "; at path " + jsonReader.getPath());
        }
    }

    public void write(JsonWriter jsonWriter, Number number) {
        jsonWriter.value(number);
    }
}
