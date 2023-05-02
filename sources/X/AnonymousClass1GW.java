package X;

import android.content.Context;
import android.database.ContentObserver;
import android.provider.ContactsContract;
import com.whatsapp.util.Log;

/* renamed from: X.1GW  reason: invalid class name */
public class AnonymousClass1GW {
    public final ContentObserver A00;
    public final C16040sK A01;
    public final AnonymousClass19Y A02;
    public volatile boolean A03;

    public AnonymousClass1GW(C16040sK r2, AnonymousClass19Y r3, C19230xz r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = new C63623Kr(r2, this, r4);
    }

    public void A00(Context context) {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03 && this.A02.A00() && !this.A01.A0G()) {
                    Log.i("androidcontactscontentobserver/registered");
                    this.A03 = true;
                    context.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, this.A00);
                }
            }
        }
    }
}
