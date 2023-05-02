package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.14i  reason: invalid class name and case insensitive filesystem */
public class C215014i {
    public final C18260wP A00;
    public final C16440t3 A01;
    public final C15860rz A02;

    public C215014i(C18260wP r1, C16440t3 r2, C15860rz r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A00() {
        C15860rz r4 = this.A02;
        r4.A0K().putInt("sticker_store_backoff_attempt", 0).apply();
        r4.A0K().putLong("sticker_store_backoff_time", 0).apply();
        r4.A0K().putLong("sticker_store_last_fetch_time", System.currentTimeMillis()).apply();
        Log.i("StickerRequestBackoffManager/clearAttempts");
    }

    public void A01() {
        C15860rz r8 = this.A02;
        int i2 = ((SharedPreferences) r8.A01.get()).getInt("sticker_store_backoff_attempt", 0) + 1;
        C34531kQ r4 = new C34531kQ(1, 720);
        r4.A03((long) i2);
        long A012 = r4.A01();
        long currentTimeMillis = (60 * A012 * 1000) + System.currentTimeMillis();
        r8.A0K().putInt("sticker_store_backoff_attempt", i2).apply();
        r8.A0K().putLong("sticker_store_backoff_time", currentTimeMillis).apply();
        StringBuilder sb = new StringBuilder("StickerRequestBackoffManager/incrementAttempt/Backing off for ");
        sb.append(A012);
        sb.append(" minutes.");
        Log.e(sb.toString());
    }

    public boolean A02() {
        return ((SharedPreferences) this.A02.A01.get()).getLong("sticker_store_backoff_time", 0) < System.currentTimeMillis() && this.A00.A0A();
    }
}
