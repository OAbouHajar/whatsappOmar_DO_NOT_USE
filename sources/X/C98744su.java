package X;

import android.util.Pair;

/* renamed from: X.4su  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98744su implements C14230op {
    public final Pair A00;
    public final C14150oh A01;

    public C98744su(Pair pair, C14150oh r2) {
        this.A01 = r2;
        this.A00 = pair;
    }

    public final Object Agh(C14210on r4) {
        C14150oh r2 = this.A01;
        Pair pair = this.A00;
        synchronized (r2) {
            r2.A00.remove(pair);
        }
        return r4;
    }
}
