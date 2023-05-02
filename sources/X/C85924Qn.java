package X;

import com.whatsapp.util.Log;

/* renamed from: X.4Qn  reason: invalid class name and case insensitive filesystem */
public class C85924Qn {
    public final /* synthetic */ C24531Gh A00;
    public final /* synthetic */ C34421kE A01;

    public C85924Qn(C24531Gh r1, C34421kE r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(int i2, String str) {
        StringBuilder A0r = AnonymousClass000.A0r("FetchPrekeyForMissingDeviceManager/requestPrekeyForMissingDevice error=");
        A0r.append(i2);
        A0r.append("; text=");
        Log.w(AnonymousClass000.A0h(str, A0r));
        this.A01.A02(Boolean.FALSE);
    }
}
