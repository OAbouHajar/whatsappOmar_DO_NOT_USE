package okhttp3;

import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.Util;

/* compiled from: XFMFile */
public final class Challenge {

    /* renamed from: a  reason: collision with root package name */
    public final String f1906a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1907b;

    /* renamed from: c  reason: collision with root package name */
    public final Charset f1908c;

    public Challenge(String str, String str2) {
        this(str, str2, Util.ISO_8859_1);
    }

    public Challenge(String str, String str2, Charset charset) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        } else if (str2 == null) {
            throw new NullPointerException("realm == null");
        } else if (charset != null) {
            this.f1906a = str;
            this.f1907b = str2;
            this.f1908c = charset;
        } else {
            throw new NullPointerException("charset == null");
        }
    }

    public Charset charset() {
        return this.f1908c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            return challenge.f1906a.equals(this.f1906a) && challenge.f1907b.equals(this.f1907b) && challenge.f1908c.equals(this.f1908c);
        }
    }

    public int hashCode() {
        int hashCode = this.f1906a.hashCode();
        return this.f1908c.hashCode() + ((hashCode + ((this.f1907b.hashCode() + 899) * 31)) * 31);
    }

    public String realm() {
        return this.f1907b;
    }

    public String scheme() {
        return this.f1906a;
    }

    public String toString() {
        return this.f1906a + " realm=\"" + this.f1907b + "\" charset=\"" + this.f1908c + "\"";
    }

    public Challenge withCharset(Charset charset) {
        return new Challenge(this.f1906a, this.f1907b, charset);
    }
}
