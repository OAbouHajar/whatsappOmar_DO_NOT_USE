package X;

import android.app.Application;
import android.app.Service;

/* renamed from: X.54I  reason: invalid class name */
public final class AnonymousClass54I implements AnonymousClass007 {
    public Object A00;
    public final Service A01;

    public AnonymousClass54I(Service service) {
        this.A01 = service;
    }

    public Object generatedComponent() {
        Object obj = this.A00;
        if (obj != null) {
            return obj;
        }
        Service service = this.A01;
        Application application = service.getApplication();
        Object[] A1b = C13680ns.A1b();
        A1b[0] = application.getClass();
        C52772eQ.A00("Hilt service must be attached to an @AndroidEntryPoint Application. Found: %s", A1b, application instanceof AnonymousClass007);
        C83464Gt r1 = new C83464Gt(((C16150sX) ((AnonymousClass01F) C004501y.A00(AnonymousClass01F.class, application))).ARe);
        r1.A00 = service;
        C16340ss.A00(Service.class, service);
        C59132uj r12 = new C59132uj(r1.A01);
        this.A00 = r12;
        return r12;
    }
}
