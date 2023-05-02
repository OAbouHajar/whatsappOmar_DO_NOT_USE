package X;

import com.whatsapp.util.Log;

/* renamed from: X.4t5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98854t5 implements C14280ou {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C56252nA A01;

    public /* synthetic */ C98854t5(C56252nA r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public final void AYB(Object obj) {
        C56252nA r2 = this.A01;
        int i2 = this.A00;
        Log.i("verifysms/smsretriever/re-registered sms retriever client");
        C15860rz r0 = r2.A01;
        C13680ns.A0w(r0.A0K(), "sms_retriever_retry_count", i2 + 1);
    }
}
