package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: X.3Ks  reason: invalid class name */
public class AnonymousClass3Ks extends ContentObserver {
    public final /* synthetic */ AnonymousClass326 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Ks(Handler handler, AnonymousClass326 r2) {
        super(handler);
        this.A00 = r2;
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z2) {
        StringBuilder A0r = AnonymousClass000.A0r("documentsgalleryfragment/onchange ");
        A0r.append(z2);
        C13680ns.A1V(A0r);
        AnonymousClass326 r1 = this.A00;
        Cursor cursor = r1.A01;
        r1.A00 = cursor == null ? 0 : cursor.getCount();
        r1.A01();
    }
}
