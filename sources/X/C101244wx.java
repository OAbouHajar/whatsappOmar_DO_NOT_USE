package X;

import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.whatsapp.util.Log;

/* renamed from: X.4wx  reason: invalid class name and case insensitive filesystem */
public class C101244wx implements AnonymousClass253 {
    public final /* synthetic */ AnonymousClass1CB A00;
    public final /* synthetic */ boolean A01;

    public C101244wx(AnonymousClass1CB r1, boolean z2) {
        this.A00 = r1;
        this.A01 = z2;
    }

    public void AQU(C17380uz r6, int i2) {
        Log.i(C13680ns.A0c(i2, "companion/deregister/createDeviceRemoveRequestProtocolHelper/onError: "));
        AnonymousClass1CB r4 = this.A00;
        r4.A03.post(new RunnableRunnableShape0S0110000_I0(r4, 11, this.A01));
    }

    public void AY4(C17380uz r6) {
        Log.i("companion/deregister/createDeviceRemoveRequestProtocolHelper/onSuccess");
        AnonymousClass1CB r4 = this.A00;
        r4.A03.post(new RunnableRunnableShape0S0110000_I0(r4, 11, this.A01));
    }
}
