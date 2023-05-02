package X;

import android.content.SharedPreferences;

/* renamed from: X.1Pn  reason: invalid class name and case insensitive filesystem */
public class C26861Pn {
    public long A00;
    public C16440t3 A01;
    public C15860rz A02;
    public boolean A03 = false;

    public void A00() {
        int i2 = ((SharedPreferences) this.A02.A01.get()).getInt("language_selector_clicked_count", 0);
        this.A02.A0K().putInt("language_selector_clicked_count", i2 + 1).commit();
    }

    public void A01() {
        if (this.A03) {
            long currentTimeMillis = System.currentTimeMillis() - this.A00;
            long j2 = ((SharedPreferences) this.A02.A01.get()).getLong("language_selector_time_spent", 0);
            this.A02.A0K().putLong("language_selector_time_spent", j2 + currentTimeMillis).commit();
        }
        this.A03 = false;
    }
}
