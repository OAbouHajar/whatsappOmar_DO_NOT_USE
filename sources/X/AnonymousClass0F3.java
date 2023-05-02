package X;

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;

/* renamed from: X.0F3  reason: invalid class name */
public final class AnonymousClass0F3 extends AnonymousClass028 {
    public static final Uri A03 = new Uri.Builder().scheme("content").authority("androidx.car.app.connection").build();
    public final AsyncQueryHandler A00;
    public final Context A01;
    public final AnonymousClass0AD A02 = new AnonymousClass0AD(this);

    public AnonymousClass0F3(Context context) {
        this.A01 = context;
        this.A00 = new AnonymousClass0AA(context.getContentResolver(), this);
    }

    public void A02() {
        this.A01.registerReceiver(this.A02, new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED"));
        A0C();
    }

    public void A03() {
        this.A01.unregisterReceiver(this.A02);
        this.A00.cancelOperation(42);
    }

    public void A0C() {
        this.A00.startQuery(42, (Object) null, A03, new String[]{"CarConnectionState"}, (String) null, (String[]) null, (String) null);
    }
}
