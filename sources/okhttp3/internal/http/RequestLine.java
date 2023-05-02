package okhttp3.internal.http;

import java.net.Proxy;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* compiled from: XFMFile */
public final class RequestLine {
    public static String get(Request request, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        boolean z2 = !request.isHttps() && type == Proxy.Type.HTTP;
        HttpUrl url = request.url();
        if (z2) {
            sb.append(url);
        } else {
            sb.append(requestPath(url));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    public static String requestPath(HttpUrl httpUrl) {
        String encodedPath = httpUrl.encodedPath();
        String encodedQuery = httpUrl.encodedQuery();
        if (encodedQuery == null) {
            return encodedPath;
        }
        return encodedPath + '?' + encodedQuery;
    }
}
