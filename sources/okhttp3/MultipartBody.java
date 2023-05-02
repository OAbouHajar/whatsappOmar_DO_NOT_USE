package okhttp3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: XFMFile */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType FORM = MediaType.get("multipart/form-data");
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f1992f = {58, 32};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f1993g = {13, 10};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f1994h = {45, 45};

    /* renamed from: a  reason: collision with root package name */
    public final ByteString f1995a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaType f1996b;

    /* renamed from: c  reason: collision with root package name */
    public final MediaType f1997c;

    /* renamed from: d  reason: collision with root package name */
    public final List f1998d;

    /* renamed from: e  reason: collision with root package name */
    public long f1999e = -1;

    /* compiled from: XFMFile */
    public final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final ByteString f2000a;

        /* renamed from: b  reason: collision with root package name */
        public MediaType f2001b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f2002c;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder(String str) {
            this.f2001b = MultipartBody.MIXED;
            this.f2002c = new ArrayList();
            this.f2000a = ByteString.encodeUtf8(str);
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addFormDataPart(String str, @Nullable String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public Builder addPart(@Nullable Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public Builder addPart(Part part) {
            if (part != null) {
                this.f2002c.add(part);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public MultipartBody build() {
            ArrayList arrayList = this.f2002c;
            if (!arrayList.isEmpty()) {
                return new MultipartBody(this.f2000a, this.f2001b, arrayList);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public Builder setType(MediaType mediaType) {
            if (mediaType == null) {
                throw new NullPointerException("type == null");
            } else if (mediaType.type().equals("multipart")) {
                this.f2001b = mediaType;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != " + mediaType);
            }
        }
    }

    /* compiled from: XFMFile */
    public final class Part {

        /* renamed from: a  reason: collision with root package name */
        public final Headers f2003a;

        /* renamed from: b  reason: collision with root package name */
        public final RequestBody f2004b;

        public Part(Headers headers, RequestBody requestBody) {
            this.f2003a = headers;
            this.f2004b = requestBody;
        }

        public static Part create(@Nullable Headers headers, RequestBody requestBody) {
            if (requestBody == null) {
                throw new NullPointerException("body == null");
            } else if (headers != null && headers.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (headers == null || headers.get("Content-Length") == null) {
                return new Part(headers, requestBody);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static Part create(RequestBody requestBody) {
            return create((Headers) null, requestBody);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, (String) null, RequestBody.create((MediaType) null, str2));
        }

        public static Part createFormData(String str, @Nullable String str2, RequestBody requestBody) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                MultipartBody.a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    MultipartBody.a(sb, str2);
                }
                return create(Headers.of("Content-Disposition", sb.toString()), requestBody);
            }
            throw new NullPointerException("name == null");
        }

        public RequestBody body() {
            return this.f2004b;
        }

        @Nullable
        public Headers headers() {
            return this.f2003a;
        }
    }

    public MultipartBody(ByteString byteString, MediaType mediaType, ArrayList arrayList) {
        this.f1995a = byteString;
        this.f1996b = mediaType;
        this.f1997c = MediaType.get(mediaType + "; boundary=" + byteString.utf8());
        this.f1998d = Util.immutableList(arrayList);
    }

    public static void a(StringBuilder sb, String str) {
        String str2;
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 10) {
                str2 = "%0A";
            } else if (charAt == 13) {
                str2 = "%0D";
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                str2 = "%22";
            }
            sb.append(str2);
        }
        sb.append('\"');
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: okio.Buffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: okio.BufferedSink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: okio.Buffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: okio.BufferedSink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: okio.BufferedSink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: okio.Buffer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(okio.BufferedSink r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            if (r18 == 0) goto L_0x000b
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r2 = r1
            goto L_0x000f
        L_0x000b:
            r1 = 0
            r2 = r1
            r1 = r17
        L_0x000f:
            java.util.List r3 = r0.f1998d
            int r4 = r3.size()
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x0019:
            okio.ByteString r9 = r0.f1995a
            byte[] r10 = f1994h
            byte[] r11 = f1993g
            if (r8 >= r4) goto L_0x009f
            java.lang.Object r12 = r3.get(r8)
            okhttp3.MultipartBody$Part r12 = (okhttp3.MultipartBody.Part) r12
            okhttp3.Headers r13 = r12.f2003a
            r1.write((byte[]) r10)
            r1.write((okio.ByteString) r9)
            r1.write((byte[]) r11)
            if (r13 == 0) goto L_0x0057
            int r9 = r13.size()
            r10 = 0
        L_0x0039:
            if (r10 >= r9) goto L_0x0057
            java.lang.String r14 = r13.name(r10)
            okio.BufferedSink r14 = r1.writeUtf8(r14)
            byte[] r15 = f1992f
            okio.BufferedSink r14 = r14.write((byte[]) r15)
            java.lang.String r15 = r13.value(r10)
            okio.BufferedSink r14 = r14.writeUtf8(r15)
            r14.write((byte[]) r11)
            int r10 = r10 + 1
            goto L_0x0039
        L_0x0057:
            okhttp3.RequestBody r9 = r12.f2004b
            okhttp3.MediaType r10 = r9.contentType()
            if (r10 == 0) goto L_0x0070
            java.lang.String r12 = "Content-Type: "
            okio.BufferedSink r12 = r1.writeUtf8(r12)
            java.lang.String r10 = r10.toString()
            okio.BufferedSink r10 = r12.writeUtf8(r10)
            r10.write((byte[]) r11)
        L_0x0070:
            long r12 = r9.contentLength()
            r14 = -1
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0088
            java.lang.String r10 = "Content-Length: "
            okio.BufferedSink r10 = r1.writeUtf8(r10)
            okio.BufferedSink r10 = r10.writeDecimalLong(r12)
            r10.write((byte[]) r11)
            goto L_0x008e
        L_0x0088:
            if (r18 == 0) goto L_0x008e
            r2.clear()
            return r14
        L_0x008e:
            r1.write((byte[]) r11)
            if (r18 == 0) goto L_0x0095
            long r6 = r6 + r12
            goto L_0x0098
        L_0x0095:
            r9.writeTo(r1)
        L_0x0098:
            r1.write((byte[]) r11)
            int r8 = r8 + 1
            goto L_0x0019
        L_0x009f:
            r1.write((byte[]) r10)
            r1.write((okio.ByteString) r9)
            r1.write((byte[]) r10)
            r1.write((byte[]) r11)
            if (r18 == 0) goto L_0x00b5
            long r3 = r2.size()
            long r6 = r6 + r3
            r2.clear()
        L_0x00b5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.b(okio.BufferedSink, boolean):long");
    }

    public String boundary() {
        return this.f1995a.utf8();
    }

    public long contentLength() {
        long j2 = this.f1999e;
        if (j2 != -1) {
            return j2;
        }
        long b2 = b((BufferedSink) null, true);
        this.f1999e = b2;
        return b2;
    }

    public MediaType contentType() {
        return this.f1997c;
    }

    public Part part(int i2) {
        return (Part) this.f1998d.get(i2);
    }

    public List<Part> parts() {
        return this.f1998d;
    }

    public int size() {
        return this.f1998d.size();
    }

    public MediaType type() {
        return this.f1996b;
    }

    public void writeTo(BufferedSink bufferedSink) {
        b(bufferedSink, false);
    }
}
