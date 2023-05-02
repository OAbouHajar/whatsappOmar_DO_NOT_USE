package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;

/* compiled from: XFMFile */
public final class FormBody extends RequestBody {

    /* renamed from: c  reason: collision with root package name */
    public static final MediaType f1956c = MediaType.get("application/x-www-form-urlencoded");

    /* renamed from: a  reason: collision with root package name */
    public final List f1957a;

    /* renamed from: b  reason: collision with root package name */
    public final List f1958b;

    /* compiled from: XFMFile */
    public final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f1959a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f1960b;

        /* renamed from: c  reason: collision with root package name */
        public final Charset f1961c;

        public Builder() {
            this((Charset) null);
        }

        public Builder(Charset charset) {
            this.f1959a = new ArrayList();
            this.f1960b = new ArrayList();
            this.f1961c = charset;
        }

        public Builder add(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                ArrayList arrayList = this.f1959a;
                Charset charset = this.f1961c;
                arrayList.add(HttpUrl.c(str, false, charset));
                this.f1960b.add(HttpUrl.c(str2, false, charset));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public Builder addEncoded(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                ArrayList arrayList = this.f1959a;
                Charset charset = this.f1961c;
                arrayList.add(HttpUrl.c(str, true, charset));
                this.f1960b.add(HttpUrl.c(str2, true, charset));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public FormBody build() {
            return new FormBody(this.f1959a, this.f1960b);
        }
    }

    public FormBody(ArrayList arrayList, ArrayList arrayList2) {
        this.f1957a = Util.immutableList(arrayList);
        this.f1958b = Util.immutableList(arrayList2);
    }

    public final long a(BufferedSink bufferedSink, boolean z2) {
        Buffer buffer = z2 ? new Buffer() : bufferedSink.buffer();
        List list = this.f1957a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) list.get(i2));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.f1958b.get(i2));
        }
        if (!z2) {
            return 0;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    public long contentLength() {
        return a((BufferedSink) null, true);
    }

    public MediaType contentType() {
        return f1956c;
    }

    public String encodedName(int i2) {
        return (String) this.f1957a.get(i2);
    }

    public String encodedValue(int i2) {
        return (String) this.f1958b.get(i2);
    }

    public String name(int i2) {
        String encodedName = encodedName(i2);
        return HttpUrl.e(encodedName, 0, encodedName.length(), true);
    }

    public int size() {
        return this.f1957a.size();
    }

    public String value(int i2) {
        String encodedValue = encodedValue(i2);
        return HttpUrl.e(encodedValue, 0, encodedValue.length(), true);
    }

    public void writeTo(BufferedSink bufferedSink) {
        a(bufferedSink, false);
    }
}
