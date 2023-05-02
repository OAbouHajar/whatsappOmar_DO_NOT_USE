package X;

import com.whatsapp.util.Log;

/* renamed from: X.51H  reason: invalid class name */
public class AnonymousClass51H implements C19550yc {
    public final /* synthetic */ C29951bV A00;
    public final /* synthetic */ C40841um A01;
    public final /* synthetic */ C83844Ig A02;
    public final /* synthetic */ Runnable A03;

    public AnonymousClass51H(C29951bV r1, C40841um r2, C83844Ig r3, Runnable runnable) {
        this.A02 = r3;
        this.A03 = runnable;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void APb(String str) {
        Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("GdprXmppMethods/sendDeleteGdprReport/onDeliveryFailure; iq=")));
        this.A00.A05(AnonymousClass000.A0a(AnonymousClass000.A0h(str, AnonymousClass000.A0r("XMPP IQ was not delivered: iq="))));
    }

    public void AQe(C28371Vv r4, String str) {
        int A002 = C34451kH.A00(r4);
        StringBuilder A0r = AnonymousClass000.A0r("GdprXmppMethods/sendDeleteGdprReport/onError; iq=");
        A0r.append(str);
        Log.i(C13680ns.A0i(", error=", A0r, A002));
        this.A01.Ach(A002);
        this.A00.A04((Object) null);
    }

    public void AYG(C28371Vv r3, String str) {
        Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("GdprXmppMethods/sendDeleteGdprReport/onSuccess; iq=")));
        this.A03.run();
        this.A00.A04((Object) null);
    }
}
