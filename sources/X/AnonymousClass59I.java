package X;

import com.facebook.redex.IDxHEntityShape100S0200000_2_I1;
import com.whatsapp.util.Log;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* renamed from: X.59I  reason: invalid class name */
public class AnonymousClass59I implements HttpRequestInterceptor {
    public int A00;
    public final C17130ua A01;

    public AnonymousClass59I(C17130ua r1) {
        this.A01 = r1;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        StringBuilder sb;
        this.A00++;
        if (httpRequest instanceof EntityEnclosingRequestWrapper) {
            EntityEnclosingRequestWrapper entityEnclosingRequestWrapper = (EntityEnclosingRequestWrapper) httpRequest;
            HttpEntity entity = entityEnclosingRequestWrapper.getEntity();
            if (entity == null) {
                httpRequest.getRequestLine();
                return;
            }
            long contentLength = entity.getContentLength();
            if (contentLength <= 0) {
                sb = AnonymousClass000.A0r("gdrive-api/request-interceptor/process/length/");
                sb.append(contentLength);
            } else {
                entityEnclosingRequestWrapper.setEntity(new IDxHEntityShape100S0200000_2_I1(this, 0, entity));
                return;
            }
        } else if (!(httpRequest instanceof RequestWrapper)) {
            sb = AnonymousClass000.A0r("gdrive-request-interceptor/process/request-is-not-a-wrapper ");
            sb.append(httpRequest);
        } else {
            return;
        }
        Log.e(sb.toString());
    }
}
