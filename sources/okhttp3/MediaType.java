package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* compiled from: XFMFile */
public final class MediaType {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f1986e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f1987f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f1988a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1989b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1990c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1991d;

    public MediaType(String str, String str2, String str3, String str4) {
        this.f1988a = str;
        this.f1989b = str2;
        this.f1990c = str3;
        this.f1991d = str4;
    }

    public static MediaType get(String str) {
        Matcher matcher = f1986e.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            Matcher matcher2 = f1987f.matcher(str);
            int end = matcher.end();
            String str2 = null;
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new MediaType(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    @Nullable
    public static MediaType parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public Charset charset() {
        return charset((Charset) null);
    }

    @Nullable
    public Charset charset(@Nullable Charset charset) {
        try {
            String str = this.f1991d;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof MediaType) && ((MediaType) obj).f1988a.equals(this.f1988a);
    }

    public int hashCode() {
        return this.f1988a.hashCode();
    }

    public String subtype() {
        return this.f1990c;
    }

    public String toString() {
        return this.f1988a;
    }

    public String type() {
        return this.f1989b;
    }
}
