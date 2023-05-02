package X;

import com.whatsapp.util.Log;

/* renamed from: X.4sz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98794sz implements AnonymousClass5OG {
    public final /* synthetic */ C25561Kg A00;
    public final /* synthetic */ AnonymousClass4SB A01;

    public /* synthetic */ C98794sz(C25561Kg r1, AnonymousClass4SB r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void AOw(C14210on r4) {
        C25561Kg r2 = this.A00;
        AnonymousClass4SB r1 = this.A01;
        if (r4.A0A()) {
            r2.A00();
        }
        if (r4.A00() != null) {
            Log.e("AbstractCronetEngineProvider/installAndCreateCronetEngine/Async cronet engine install failed");
        }
        r1.A00();
    }
}
