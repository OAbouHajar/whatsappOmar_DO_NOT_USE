package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: X.0AM  reason: invalid class name */
public class AnonymousClass0AM extends ContentObserver {
    public final /* synthetic */ AnonymousClass04B A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0AM(AnonymousClass04B r2) {
        super(new Handler());
        this.A00 = r2;
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z2) {
        Cursor cursor;
        AnonymousClass04B r1 = this.A00;
        if (r1.A06 && (cursor = r1.A02) != null && !cursor.isClosed()) {
            r1.A07 = r1.A02.requery();
        }
    }
}
