package X;

import com.whatsapp.voipcalling.VideoPort;

/* renamed from: X.53J  reason: invalid class name */
public class AnonymousClass53J implements C449426i {
    public final /* synthetic */ C616839w A00;

    public AnonymousClass53J(C616839w r1) {
        this.A00 = r1;
    }

    public static void A00(C616839w r1, Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.hashCode());
        sb.append(" for ");
        sb.append(r1.A04);
    }

    public void AP2(VideoPort videoPort) {
        StringBuilder A0o = AnonymousClass000.A0o();
        C616839w r1 = this.A00;
        A0o.append(r1.A07);
        A00(r1, videoPort, "onConnected ", A0o);
        C13680ns.A1V(A0o);
        r1.A02 = true;
        r1.A06();
    }

    public void APq(VideoPort videoPort) {
        StringBuilder A0o = AnonymousClass000.A0o();
        C616839w r1 = this.A00;
        A0o.append(r1.A07);
        A00(r1, videoPort, "onDisconnecting ", A0o);
        C13680ns.A1V(A0o);
        r1.A03();
        r1.A02 = false;
    }

    public void AUv(VideoPort videoPort) {
        StringBuilder A0o = AnonymousClass000.A0o();
        C616839w r1 = this.A00;
        A0o.append(r1.A07);
        A00(r1, videoPort, "onPortWindowSizeChanged ", A0o);
        C13680ns.A1V(A0o);
        r1.A04();
    }

    public void AW2(VideoPort videoPort) {
    }
}
