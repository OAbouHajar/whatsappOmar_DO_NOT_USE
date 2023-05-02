package X;

import com.whatsapp.util.Log;

/* renamed from: X.62S  reason: invalid class name */
public class AnonymousClass62S implements C19550yc {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ C119195wh A01;
    public final /* synthetic */ C116615rf A02;

    public AnonymousClass62S(AnonymousClass1Z7 r1, C119195wh r2, C116615rf r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void APb(String str) {
        Log.e("Bloks: IQRequestHelper/sendIQRequest onDeliveryFailure");
        this.A01.A00.Acq(new AnonymousClass63W(this.A00));
    }

    public void AQe(C28371Vv r5, String str) {
        Log.e(AnonymousClass000.A0h(r5.toString(), AnonymousClass000.A0r("Bloks: IQRequestHelper/sendIQRequest onError: ")));
        this.A01.A00.Acq(new C1216566i(this.A00, this, this.A02, r5));
    }

    public void AYG(C28371Vv r4, String str) {
        this.A01.A00.Acq(new AnonymousClass66I(this.A00, this, r4));
    }
}
