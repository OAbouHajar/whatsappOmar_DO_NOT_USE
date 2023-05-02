package X;

import android.util.LruCache;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.0vl  reason: invalid class name and case insensitive filesystem */
public final class C17860vl implements C17870vm, C17880vn {
    public final LruCache A00 = new AnonymousClass3MY();
    public final AnonymousClass1JM A01;
    public final C214414c A02;
    public final C16320sq A03;
    public final Queue A04 = new LinkedList();
    public volatile boolean A05;
    public volatile boolean A06;

    public C17860vl(AnonymousClass1JM r2, C214414c r3, C16320sq r4) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r3, 3);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public synchronized String AGG() {
        return C18450wi.A06("FcsConfigInMemoryCache: ", Integer.valueOf(this.A00.size()));
    }

    public synchronized void AZG(boolean z2) {
        this.A00.evictAll();
    }
}
