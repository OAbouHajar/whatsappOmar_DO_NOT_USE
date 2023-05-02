package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: XFMFile */
public class JsonWriter implements Closeable, Flushable {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f457j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f458k = new String[128];

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f459l;

    /* renamed from: a  reason: collision with root package name */
    public final Writer f460a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f461b;

    /* renamed from: c  reason: collision with root package name */
    public int f462c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f463d;

    /* renamed from: e  reason: collision with root package name */
    public String f464e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f465f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f466g;

    /* renamed from: h  reason: collision with root package name */
    public String f467h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f468i;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f458k[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = f458k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f459l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        int[] iArr = new int[32];
        this.f461b = iArr;
        if (iArr.length == 0) {
            this.f461b = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f461b;
        int i2 = this.f462c;
        this.f462c = i2 + 1;
        iArr2[i2] = 6;
        this.f464e = ":";
        this.f468i = true;
        if (writer != null) {
            this.f460a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public final void a() {
        int d2 = d();
        if (d2 != 1) {
            Writer writer = this.f460a;
            if (d2 == 2) {
                writer.append(',');
            } else if (d2 != 4) {
                if (d2 != 6) {
                    if (d2 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    } else if (!this.f465f) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                this.f461b[this.f462c - 1] = 7;
                return;
            } else {
                writer.append(this.f464e);
                this.f461b[this.f462c - 1] = 5;
                return;
            }
        } else {
            this.f461b[this.f462c - 1] = 2;
        }
        c();
    }

    public final void b(int i2, int i3, char c2) {
        int d2 = d();
        if (d2 != i3 && d2 != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f467h == null) {
            this.f462c--;
            if (d2 == i3) {
                c();
            }
            this.f460a.write(c2);
        } else {
            throw new IllegalStateException("Dangling name: " + this.f467h);
        }
    }

    public JsonWriter beginArray() {
        f();
        a();
        int i2 = this.f462c;
        int[] iArr = this.f461b;
        if (i2 == iArr.length) {
            this.f461b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f461b;
        int i3 = this.f462c;
        this.f462c = i3 + 1;
        iArr2[i3] = 1;
        this.f460a.write(91);
        return this;
    }

    public JsonWriter beginObject() {
        f();
        a();
        int i2 = this.f462c;
        int[] iArr = this.f461b;
        if (i2 == iArr.length) {
            this.f461b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f461b;
        int i3 = this.f462c;
        this.f462c = i3 + 1;
        iArr2[i3] = 3;
        this.f460a.write(123);
        return this;
    }

    public final void c() {
        if (this.f463d != null) {
            Writer writer = this.f460a;
            writer.write(10);
            int i2 = this.f462c;
            for (int i3 = 1; i3 < i2; i3++) {
                writer.write(this.f463d);
            }
        }
    }

    public void close() {
        this.f460a.close();
        int i2 = this.f462c;
        if (i2 > 1 || (i2 == 1 && this.f461b[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f462c = 0;
    }

    public final int d() {
        int i2 = this.f462c;
        if (i2 != 0) {
            return this.f461b[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void e(String str) {
        String str2;
        String[] strArr = this.f466g ? f459l : f458k;
        Writer writer = this.f460a;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                writer.write(str, i2, i3 - i2);
            }
            writer.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    public JsonWriter endArray() {
        b(1, 2, ']');
        return this;
    }

    public JsonWriter endObject() {
        b(3, 5, '}');
        return this;
    }

    public final void f() {
        if (this.f467h != null) {
            int d2 = d();
            if (d2 == 5) {
                this.f460a.write(44);
            } else if (d2 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            c();
            this.f461b[this.f462c - 1] = 4;
            e(this.f467h);
            this.f467h = null;
        }
    }

    public void flush() {
        if (this.f462c != 0) {
            this.f460a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final boolean getSerializeNulls() {
        return this.f468i;
    }

    public final boolean isHtmlSafe() {
        return this.f466g;
    }

    public boolean isLenient() {
        return this.f465f;
    }

    public JsonWriter jsonValue(String str) {
        if (str == null) {
            return nullValue();
        }
        f();
        a();
        this.f460a.append(str);
        return this;
    }

    public JsonWriter name(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f467h != null) {
            throw new IllegalStateException();
        } else if (this.f462c != 0) {
            this.f467h = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public JsonWriter nullValue() {
        if (this.f467h != null) {
            if (this.f468i) {
                f();
            } else {
                this.f467h = null;
                return this;
            }
        }
        a();
        this.f460a.write("null");
        return this;
    }

    public final void setHtmlSafe(boolean z2) {
        this.f466g = z2;
    }

    public final void setIndent(String str) {
        String str2;
        if (str.length() == 0) {
            this.f463d = null;
            str2 = ":";
        } else {
            this.f463d = str;
            str2 = ": ";
        }
        this.f464e = str2;
    }

    public final void setLenient(boolean z2) {
        this.f465f = z2;
    }

    public final void setSerializeNulls(boolean z2) {
        this.f468i = z2;
    }

    public JsonWriter value(double d2) {
        f();
        if (this.f465f || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
            a();
            this.f460a.append(Double.toString(d2));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
    }

    public JsonWriter value(long j2) {
        f();
        a();
        this.f460a.write(Long.toString(j2));
        return this;
    }

    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        f();
        a();
        this.f460a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        f();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!(cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) && !f457j.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f465f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        a();
        this.f460a.append(obj);
        return this;
    }

    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        f();
        a();
        e(str);
        return this;
    }

    public JsonWriter value(boolean z2) {
        f();
        a();
        this.f460a.write(z2 ? "true" : "false");
        return this;
    }
}
