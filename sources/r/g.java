package r;

import okhttp3.HttpUrl;
import okio.ByteString;

/* compiled from: XFMFile */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f2426a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2427b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2428c;

    /* renamed from: d  reason: collision with root package name */
    public final ByteString f2429d;

    public g(String str, String str2) {
        String str3;
        int i2;
        this.f2426a = str;
        if (str.startsWith("*.")) {
            str3 = "http://" + str.substring(2);
        } else {
            str3 = "http://".concat(str);
        }
        this.f2427b = HttpUrl.get(str3).host();
        if (str2.startsWith("sha1/")) {
            this.f2428c = "sha1/";
            i2 = 5;
        } else if (str2.startsWith("sha256/")) {
            this.f2428c = "sha256/";
            i2 = 7;
        } else {
            throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
        }
        this.f2429d = ByteString.decodeBase64(str2.substring(i2));
        if (this.f2429d == null) {
            throw new IllegalArgumentException("pins must be base64: ".concat(str2));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f2426a.equals(gVar.f2426a) && this.f2428c.equals(gVar.f2428c) && this.f2429d.equals(gVar.f2429d);
        }
    }

    public final int hashCode() {
        int hashCode = this.f2428c.hashCode();
        return this.f2429d.hashCode() + ((hashCode + ((this.f2426a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return this.f2428c + this.f2429d.base64();
    }
}
