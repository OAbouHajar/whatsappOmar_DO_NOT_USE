package X;

import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: X.1SB  reason: invalid class name */
public class AnonymousClass1SB {
    public final C16440t3 A00;
    public final C15860rz A01;

    public AnonymousClass1SB(C16440t3 r1, C15860rz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public synchronized C46982Ha A00() {
        C46982Ha r3;
        C15860rz r32 = this.A01;
        String string = ((SharedPreferences) r32.A01.get()).getString("phoneid_id", (String) null);
        long A0J = r32.A0J("phoneid_timestamp");
        if (string == null || A0J == -1) {
            r3 = new C46982Ha(UUID.randomUUID().toString(), this.A00.A00());
            A01(r3);
        } else {
            r3 = new C46982Ha(string, A0J);
        }
        return r3;
    }

    public synchronized void A01(C46982Ha r7) {
        C15860rz r5 = this.A01;
        String str = r7.A01;
        long j2 = r7.A00;
        r5.A0K().putString("phoneid_id", str).apply();
        r5.A14("phoneid_timestamp", j2);
    }
}
