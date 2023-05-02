package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: XFMFile */
public final class JsonTreeWriter extends JsonWriter {

    /* renamed from: p  reason: collision with root package name */
    public static final c f323p = new c();

    /* renamed from: q  reason: collision with root package name */
    public static final JsonPrimitive f324q = new JsonPrimitive("closed");

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f325m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public String f326n;

    /* renamed from: o  reason: collision with root package name */
    public JsonElement f327o = JsonNull.INSTANCE;

    public JsonTreeWriter() {
        super(f323p);
    }

    public JsonWriter beginArray() {
        JsonArray jsonArray = new JsonArray();
        h(jsonArray);
        this.f325m.add(jsonArray);
        return this;
    }

    public JsonWriter beginObject() {
        JsonObject jsonObject = new JsonObject();
        h(jsonObject);
        this.f325m.add(jsonObject);
        return this;
    }

    public void close() {
        ArrayList arrayList = this.f325m;
        if (arrayList.isEmpty()) {
            arrayList.add(f324q);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public JsonWriter endArray() {
        ArrayList arrayList = this.f325m;
        if (arrayList.isEmpty() || this.f326n != null) {
            throw new IllegalStateException();
        } else if (g() instanceof JsonArray) {
            arrayList.remove(arrayList.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter endObject() {
        ArrayList arrayList = this.f325m;
        if (arrayList.isEmpty() || this.f326n != null) {
            throw new IllegalStateException();
        } else if (g() instanceof JsonObject) {
            arrayList.remove(arrayList.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void flush() {
    }

    public final JsonElement g() {
        ArrayList arrayList = this.f325m;
        return (JsonElement) arrayList.get(arrayList.size() - 1);
    }

    public JsonElement get() {
        ArrayList arrayList = this.f325m;
        if (arrayList.isEmpty()) {
            return this.f327o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final void h(JsonElement jsonElement) {
        if (this.f326n != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((JsonObject) g()).add(this.f326n, jsonElement);
            }
            this.f326n = null;
        } else if (this.f325m.isEmpty()) {
            this.f327o = jsonElement;
        } else {
            JsonElement g2 = g();
            if (g2 instanceof JsonArray) {
                ((JsonArray) g2).add(jsonElement);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public JsonWriter name(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f325m.isEmpty() || this.f326n != null) {
            throw new IllegalStateException();
        } else if (g() instanceof JsonObject) {
            this.f326n = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter nullValue() {
        h(JsonNull.INSTANCE);
        return this;
    }

    public JsonWriter value(double d2) {
        if (isLenient() || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
            h(new JsonPrimitive((Number) Double.valueOf(d2)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
    }

    public JsonWriter value(long j2) {
        h(new JsonPrimitive((Number) Long.valueOf(j2)));
        return this;
    }

    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        h(new JsonPrimitive(bool));
        return this;
    }

    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        h(new JsonPrimitive(number));
        return this;
    }

    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        h(new JsonPrimitive(str));
        return this;
    }

    public JsonWriter value(boolean z2) {
        h(new JsonPrimitive(Boolean.valueOf(z2)));
        return this;
    }
}
