package X;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: X.3Kq  reason: invalid class name and case insensitive filesystem */
public final class C63613Kq extends ContentObserver {
    public final /* synthetic */ C88774b4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63613Kq(C88774b4 r2) {
        super((Handler) null);
        this.A00 = r2;
    }

    public final void onChange(boolean z2) {
        C88774b4 r3 = this.A00;
        synchronized (r3.A03) {
            r3.A06 = null;
        }
        synchronized (r3.A04) {
            Iterator it = r3.A05.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0W("zzk");
            }
        }
    }
}
