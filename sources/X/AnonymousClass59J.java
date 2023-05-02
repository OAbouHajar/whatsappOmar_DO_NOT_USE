package X;

import com.facebook.redex.IDxHEntityShape100S0200000_2_I1;
import com.whatsapp.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* renamed from: X.59J  reason: invalid class name */
public class AnonymousClass59J implements HttpResponseInterceptor {
    public final C17130ua A00;

    public AnonymousClass59J(C17130ua r1) {
        this.A00 = r1;
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        RequestWrapper requestWrapper;
        String A0h;
        if (httpResponse.getEntity() == null) {
            requestWrapper = (RequestWrapper) httpContext.getAttribute("http.request");
            if (requestWrapper == null) {
                A0h = "gdrive-response-interceptor/process/response-without-entity-and-request-is-null";
            }
            requestWrapper.getURI();
            return;
        }
        long contentLength = httpResponse.getEntity().getContentLength();
        if (contentLength <= 0) {
            requestWrapper = (RequestWrapper) httpContext.getAttribute("http.request");
            if (requestWrapper == null) {
                StringBuilder A0q = AnonymousClass000.A0q("gdrive-response-interceptor/process/length/");
                A0q.append(contentLength);
                A0h = AnonymousClass000.A0h("/request-is-null", A0q);
            }
            requestWrapper.getURI();
            return;
        }
        httpResponse.setEntity(new IDxHEntityShape100S0200000_2_I1(this, 1, httpResponse.getEntity()));
        return;
        Log.e(A0h);
    }
}
