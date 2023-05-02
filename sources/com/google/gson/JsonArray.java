package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: XFMFile */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f270a;

    public JsonArray() {
        this.f270a = new ArrayList();
    }

    public JsonArray(int i2) {
        this.f270a = new ArrayList(i2);
    }

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.f270a.add(jsonElement);
    }

    public void add(Boolean bool) {
        this.f270a.add(bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    public void add(Character ch) {
        this.f270a.add(ch == null ? JsonNull.INSTANCE : new JsonPrimitive(ch));
    }

    public void add(Number number) {
        this.f270a.add(number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    public void add(String str) {
        this.f270a.add(str == null ? JsonNull.INSTANCE : new JsonPrimitive(str));
    }

    public void addAll(JsonArray jsonArray) {
        this.f270a.addAll(jsonArray.f270a);
    }

    public boolean contains(JsonElement jsonElement) {
        return this.f270a.contains(jsonElement);
    }

    public JsonArray deepCopy() {
        ArrayList arrayList = this.f270a;
        if (arrayList.isEmpty()) {
            return new JsonArray();
        }
        JsonArray jsonArray = new JsonArray(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jsonArray.add(((JsonElement) it.next()).deepCopy());
        }
        return jsonArray;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonArray) && ((JsonArray) obj).f270a.equals(this.f270a));
    }

    public JsonElement get(int i2) {
        return (JsonElement) this.f270a.get(i2);
    }

    public BigDecimal getAsBigDecimal() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsBigDecimal();
        }
        throw new IllegalStateException();
    }

    public BigInteger getAsBigInteger() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsBigInteger();
        }
        throw new IllegalStateException();
    }

    public boolean getAsBoolean() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsBoolean();
        }
        throw new IllegalStateException();
    }

    public byte getAsByte() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsByte();
        }
        throw new IllegalStateException();
    }

    public char getAsCharacter() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsCharacter();
        }
        throw new IllegalStateException();
    }

    public double getAsDouble() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsDouble();
        }
        throw new IllegalStateException();
    }

    public float getAsFloat() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsFloat();
        }
        throw new IllegalStateException();
    }

    public int getAsInt() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsInt();
        }
        throw new IllegalStateException();
    }

    public long getAsLong() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsLong();
        }
        throw new IllegalStateException();
    }

    public Number getAsNumber() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsNumber();
        }
        throw new IllegalStateException();
    }

    public short getAsShort() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsShort();
        }
        throw new IllegalStateException();
    }

    public String getAsString() {
        ArrayList arrayList = this.f270a;
        if (arrayList.size() == 1) {
            return ((JsonElement) arrayList.get(0)).getAsString();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f270a.hashCode();
    }

    public boolean isEmpty() {
        return this.f270a.isEmpty();
    }

    public Iterator<JsonElement> iterator() {
        return this.f270a.iterator();
    }

    public JsonElement remove(int i2) {
        return (JsonElement) this.f270a.remove(i2);
    }

    public boolean remove(JsonElement jsonElement) {
        return this.f270a.remove(jsonElement);
    }

    public JsonElement set(int i2, JsonElement jsonElement) {
        return (JsonElement) this.f270a.set(i2, jsonElement);
    }

    public int size() {
        return this.f270a.size();
    }
}
