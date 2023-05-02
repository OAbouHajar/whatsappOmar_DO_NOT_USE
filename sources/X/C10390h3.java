package X;

import androidx.car.app.IOnDoneCallback;

/* renamed from: X.0h3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10390h3 implements Runnable {
    public final /* synthetic */ IOnDoneCallback A00;
    public final /* synthetic */ C12290k9 A01;
    public final /* synthetic */ C009704q A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C10390h3(IOnDoneCallback iOnDoneCallback, C12290k9 r2, C009704q r3, String str) {
        this.A02 = r3;
        this.A00 = iOnDoneCallback;
        this.A03 = str;
        this.A01 = r2;
    }

    public final void run() {
        C009704q r0 = this.A02;
        IOnDoneCallback iOnDoneCallback = this.A00;
        String str = this.A03;
        C12290k9 r2 = this.A01;
        if (r0 == null || !((C009604p) r0).A02.A00(C011005f.CREATED)) {
            AnonymousClass0VJ.A01(iOnDoneCallback, str, AnonymousClass000.A0V(AnonymousClass000.A0g("Lifecycle is not at least created when dispatching ", r2)));
        } else {
            AnonymousClass0VJ.A00(iOnDoneCallback, r2, str);
        }
    }
}
