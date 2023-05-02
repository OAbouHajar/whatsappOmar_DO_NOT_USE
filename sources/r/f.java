package r;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Cache;
import okhttp3.CipherSuite;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* compiled from: XFMFile */
public final class f {

    /* renamed from: k  reason: collision with root package name */
    public static final String f2414k = (Platform.get().getPrefix() + "-Sent-Millis");

    /* renamed from: l  reason: collision with root package name */
    public static final String f2415l = (Platform.get().getPrefix() + "-Received-Millis");

    /* renamed from: a  reason: collision with root package name */
    public final String f2416a;

    /* renamed from: b  reason: collision with root package name */
    public final Headers f2417b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2418c;

    /* renamed from: d  reason: collision with root package name */
    public final Protocol f2419d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2420e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2421f;

    /* renamed from: g  reason: collision with root package name */
    public final Headers f2422g;

    /* renamed from: h  reason: collision with root package name */
    public final Handshake f2423h;

    /* renamed from: i  reason: collision with root package name */
    public final long f2424i;

    /* renamed from: j  reason: collision with root package name */
    public final long f2425j;

    public f(Response response) {
        this.f2416a = response.request().url().toString();
        this.f2417b = HttpHeaders.varyHeaders(response);
        this.f2418c = response.request().method();
        this.f2419d = response.protocol();
        this.f2420e = response.code();
        this.f2421f = response.message();
        this.f2422g = response.headers();
        this.f2423h = response.handshake();
        this.f2424i = response.sentRequestAtMillis();
        this.f2425j = response.receivedResponseAtMillis();
    }

    public f(Source source) {
        try {
            BufferedSource buffer = Okio.buffer(source);
            this.f2416a = buffer.readUtf8LineStrict();
            this.f2418c = buffer.readUtf8LineStrict();
            Headers.Builder builder = new Headers.Builder();
            int a2 = Cache.a(buffer);
            for (int i2 = 0; i2 < a2; i2++) {
                builder.a(buffer.readUtf8LineStrict());
            }
            this.f2417b = builder.build();
            StatusLine parse = StatusLine.parse(buffer.readUtf8LineStrict());
            this.f2419d = parse.protocol;
            this.f2420e = parse.code;
            this.f2421f = parse.message;
            Headers.Builder builder2 = new Headers.Builder();
            int a3 = Cache.a(buffer);
            for (int i3 = 0; i3 < a3; i3++) {
                builder2.a(buffer.readUtf8LineStrict());
            }
            String str = f2414k;
            String str2 = builder2.get(str);
            String str3 = f2415l;
            String str4 = builder2.get(str3);
            builder2.removeAll(str);
            builder2.removeAll(str3);
            long j2 = 0;
            this.f2424i = str2 != null ? Long.parseLong(str2) : 0;
            this.f2425j = str4 != null ? Long.parseLong(str4) : j2;
            this.f2422g = builder2.build();
            if (this.f2416a.startsWith("https://")) {
                String readUtf8LineStrict = buffer.readUtf8LineStrict();
                if (readUtf8LineStrict.length() <= 0) {
                    this.f2423h = Handshake.get(!buffer.exhausted() ? TlsVersion.forJavaName(buffer.readUtf8LineStrict()) : TlsVersion.SSL_3_0, CipherSuite.forJavaName(buffer.readUtf8LineStrict()), a(buffer), a(buffer));
                } else {
                    throw new IOException("expected \"\" but was \"" + readUtf8LineStrict + "\"");
                }
            } else {
                this.f2423h = null;
            }
        } finally {
            source.close();
        }
    }

    public static List a(BufferedSource bufferedSource) {
        int a2 = Cache.a(bufferedSource);
        if (a2 == -1) {
            return Collections.emptyList();
        }
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(a2);
            for (int i2 = 0; i2 < a2; i2++) {
                String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                Buffer buffer = new Buffer();
                buffer.write(ByteString.decodeBase64(readUtf8LineStrict));
                arrayList.add(instance.generateCertificate(buffer.inputStream()));
            }
            return arrayList;
        } catch (CertificateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static void b(BufferedSink bufferedSink, List list) {
        try {
            bufferedSink.writeDecimalLong((long) list.size()).writeByte(10);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                bufferedSink.writeUtf8(ByteString.of(((Certificate) list.get(i2)).getEncoded()).base64()).writeByte(10);
            }
        } catch (CertificateEncodingException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public final void c(DiskLruCache.Editor editor) {
        BufferedSink buffer = Okio.buffer(editor.newSink(0));
        String str = this.f2416a;
        buffer.writeUtf8(str).writeByte(10);
        buffer.writeUtf8(this.f2418c).writeByte(10);
        Headers headers = this.f2417b;
        buffer.writeDecimalLong((long) headers.size()).writeByte(10);
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            buffer.writeUtf8(headers.name(i2)).writeUtf8(": ").writeUtf8(headers.value(i2)).writeByte(10);
        }
        buffer.writeUtf8(new StatusLine(this.f2419d, this.f2420e, this.f2421f).toString()).writeByte(10);
        Headers headers2 = this.f2422g;
        buffer.writeDecimalLong((long) (headers2.size() + 2)).writeByte(10);
        int size2 = headers2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            buffer.writeUtf8(headers2.name(i3)).writeUtf8(": ").writeUtf8(headers2.value(i3)).writeByte(10);
        }
        buffer.writeUtf8(f2414k).writeUtf8(": ").writeDecimalLong(this.f2424i).writeByte(10);
        buffer.writeUtf8(f2415l).writeUtf8(": ").writeDecimalLong(this.f2425j).writeByte(10);
        if (str.startsWith("https://")) {
            buffer.writeByte(10);
            Handshake handshake = this.f2423h;
            buffer.writeUtf8(handshake.cipherSuite().javaName()).writeByte(10);
            b(buffer, handshake.peerCertificates());
            b(buffer, handshake.localCertificates());
            buffer.writeUtf8(handshake.tlsVersion().javaName()).writeByte(10);
        }
        buffer.close();
    }
}
