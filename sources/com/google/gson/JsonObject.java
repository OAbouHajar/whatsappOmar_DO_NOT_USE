package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* compiled from: XFMFile */
public final class JsonObject extends JsonElement {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedTreeMap f271a = new LinkedTreeMap();

    public void add(String str, JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.f271a.put(str, jsonElement);
    }

    public void addProperty(String str, Boolean bool) {
        add(str, bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    public void addProperty(String str, Character ch) {
        add(str, ch == null ? JsonNull.INSTANCE : new JsonPrimitive(ch));
    }

    public void addProperty(String str, Number number) {
        add(str, number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    public void addProperty(String str, String str2) {
        add(str, str2 == null ? JsonNull.INSTANCE : new JsonPrimitive(str2));
    }

    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : this.f271a.entrySet()) {
            jsonObject.add((String) entry.getKey(), ((JsonElement) entry.getValue()).deepCopy());
        }
        return jsonObject;
    }

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.f271a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonObject) && ((JsonObject) obj).f271a.equals(this.f271a));
    }

    public JsonElement get(String str) {
        return (JsonElement) this.f271a.get(str);
    }

    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) this.f271a.get(str);
    }

    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) this.f271a.get(str);
    }

    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) this.f271a.get(str);
    }

    public boolean has(String str) {
        return this.f271a.containsKey(str);
    }

    public int hashCode() {
        return this.f271a.hashCode();
    }

    public Set<String> keySet() {
        return this.f271a.keySet();
    }

    public JsonElement remove(String str) {
        return (JsonElement) this.f271a.remove(str);
    }

    public int size() {
        return this.f271a.size();
    }
}
