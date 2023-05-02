package X;

import com.whatsapp.util.Log;

/* renamed from: X.63d  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1208263d implements Runnable {
    public final /* synthetic */ C114475np A00;

    public /* synthetic */ C1208263d(C114475np r1) {
        this.A00 = r1;
    }

    public final void run() {
        C114475np r3 = this.A00;
        StringBuilder A0r = AnonymousClass000.A0r("PAY: rejectCollect; request is expired; transaction id: ");
        AnonymousClass1Vt r1 = r3.A01;
        Log.i(AnonymousClass000.A0h(r1.A0K, A0r));
        r3.A03.A02.A0e(r1);
    }
}
