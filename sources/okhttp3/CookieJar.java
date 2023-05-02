package okhttp3;

import e.j;
import java.util.List;

/* compiled from: XFMFile */
public interface CookieJar {
    public static final CookieJar NO_COOKIES = new j();

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
