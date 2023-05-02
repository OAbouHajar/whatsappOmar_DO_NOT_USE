package X;

import com.whatsapp.util.Log;

/* renamed from: X.60E  reason: invalid class name */
public class AnonymousClass60E implements C440622p {
    public final /* synthetic */ C111865hX A00;

    public AnonymousClass60E(C111865hX r1) {
        this.A00 = r1;
    }

    public void ALw() {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onAbort");
    }

    public void AQQ() {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onError");
    }

    public void AYu() {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onTimeOut");
    }

    public void onSuccess() {
        C111865hX r5 = this.A00;
        C18300wT r4 = r5.A04;
        C13680ns.A0x(C110105dW.A06(r4), "payments_error_map_last_sync_time_millis", r4.A01.A00());
        StringBuilder A0q = AnonymousClass000.A0q(r5.A03.AB5());
        A0q.append("_");
        A0q.append(r5.A01.A06());
        A0q.append("_");
        C13680ns.A0y(C110105dW.A06(r4), "error_map_key", AnonymousClass000.A0h("1", A0q));
    }
}
