package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;

/* compiled from: XFMFile */
public final class JsonTreeReader extends JsonReader {

    /* renamed from: t  reason: collision with root package name */
    public static final b f317t = new b();

    /* renamed from: u  reason: collision with root package name */
    public static final Object f318u = new Object();

    /* renamed from: p  reason: collision with root package name */
    public Object[] f319p = new Object[32];

    /* renamed from: q  reason: collision with root package name */
    public int f320q = 0;

    /* renamed from: r  reason: collision with root package name */
    public String[] f321r = new String[32];

    /* renamed from: s  reason: collision with root package name */
    public int[] f322s = new int[32];

    public JsonTreeReader(JsonElement jsonElement) {
        super(f317t);
        r(jsonElement);
    }

    private String d(boolean z2) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i3 = this.f320q;
            if (i2 >= i3) {
                return sb.toString();
            }
            Object[] objArr = this.f319p;
            Object obj = objArr[i2];
            if (obj instanceof JsonArray) {
                i2++;
                if (i2 < i3 && (objArr[i2] instanceof Iterator)) {
                    int i4 = this.f322s[i2];
                    if (z2 && i4 > 0 && (i2 == i3 - 1 || i2 == i3 - 2)) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i2 = i2 + 1) < i3 && (objArr[i2] instanceof Iterator)) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                String str = this.f321r[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    private String f() {
        return " at path " + getPath();
    }

    public void beginArray() {
        o(JsonToken.BEGIN_ARRAY);
        r(((JsonArray) p()).iterator());
        this.f322s[this.f320q - 1] = 0;
    }

    public void beginObject() {
        o(JsonToken.BEGIN_OBJECT);
        r(((JsonObject) p()).entrySet().iterator());
    }

    public void close() {
        this.f319p = new Object[]{f318u};
        this.f320q = 1;
    }

    public void endArray() {
        o(JsonToken.END_ARRAY);
        q();
        q();
        int i2 = this.f320q;
        if (i2 > 0) {
            int[] iArr = this.f322s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public void endObject() {
        o(JsonToken.END_OBJECT);
        q();
        q();
        int i2 = this.f320q;
        if (i2 > 0) {
            int[] iArr = this.f322s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String getPath() {
        return d(false);
    }

    public String getPreviousPath() {
        return d(true);
    }

    public boolean hasNext() {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY || peek == JsonToken.END_DOCUMENT) ? false : true;
    }

    public boolean nextBoolean() {
        o(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) q()).getAsBoolean();
        int i2 = this.f320q;
        if (i2 > 0) {
            int[] iArr = this.f322s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return asBoolean;
    }

    public double nextDouble() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            double asDouble = ((JsonPrimitive) p()).getAsDouble();
            if (isLenient() || (!Double.isNaN(asDouble) && !Double.isInfinite(asDouble))) {
                q();
                int i2 = this.f320q;
                if (i2 > 0) {
                    int[] iArr = this.f322s;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return asDouble;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + asDouble);
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + f());
    }

    public int nextInt() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            int asInt = ((JsonPrimitive) p()).getAsInt();
            q();
            int i2 = this.f320q;
            if (i2 > 0) {
                int[] iArr = this.f322s;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return asInt;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + f());
    }

    public long nextLong() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            long asLong = ((JsonPrimitive) p()).getAsLong();
            q();
            int i2 = this.f320q;
            if (i2 > 0) {
                int[] iArr = this.f322s;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return asLong;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + f());
    }

    public String nextName() {
        o(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) p()).next();
        String str = (String) entry.getKey();
        this.f321r[this.f320q - 1] = str;
        r(entry.getValue());
        return str;
    }

    public void nextNull() {
        o(JsonToken.NULL);
        q();
        int i2 = this.f320q;
        if (i2 > 0) {
            int[] iArr = this.f322s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String nextString() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek == jsonToken || peek == JsonToken.NUMBER) {
            String asString = ((JsonPrimitive) q()).getAsString();
            int i2 = this.f320q;
            if (i2 > 0) {
                int[] iArr = this.f322s;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return asString;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + f());
    }

    public final void o(JsonToken jsonToken) {
        if (peek() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + f());
        }
    }

    public final Object p() {
        return this.f319p[this.f320q - 1];
    }

    public JsonToken peek() {
        if (this.f320q == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object p2 = p();
        if (p2 instanceof Iterator) {
            boolean z2 = this.f319p[this.f320q - 2] instanceof JsonObject;
            Iterator it = (Iterator) p2;
            if (!it.hasNext()) {
                return z2 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z2) {
                return JsonToken.NAME;
            }
            r(it.next());
            return peek();
        } else if (p2 instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (p2 instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (p2 instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) p2;
                if (jsonPrimitive.isString()) {
                    return JsonToken.STRING;
                }
                if (jsonPrimitive.isBoolean()) {
                    return JsonToken.BOOLEAN;
                }
                if (jsonPrimitive.isNumber()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (p2 instanceof JsonNull) {
                return JsonToken.NULL;
            } else {
                if (p2 == f318u) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void promoteNameToValue() {
        o(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) p()).next();
        r(entry.getValue());
        r(new JsonPrimitive((String) entry.getKey()));
    }

    public final Object q() {
        Object[] objArr = this.f319p;
        int i2 = this.f320q - 1;
        this.f320q = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void r(Object obj) {
        int i2 = this.f320q;
        Object[] objArr = this.f319p;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.f319p = Arrays.copyOf(objArr, i3);
            this.f322s = Arrays.copyOf(this.f322s, i3);
            this.f321r = (String[]) Arrays.copyOf(this.f321r, i3);
        }
        Object[] objArr2 = this.f319p;
        int i4 = this.f320q;
        this.f320q = i4 + 1;
        objArr2[i4] = obj;
    }

    public void skipValue() {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f321r[this.f320q - 2] = "null";
        } else {
            q();
            int i2 = this.f320q;
            if (i2 > 0) {
                this.f321r[i2 - 1] = "null";
            }
        }
        int i3 = this.f320q;
        if (i3 > 0) {
            int[] iArr = this.f322s;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public String toString() {
        return "JsonTreeReader" + f();
    }
}
