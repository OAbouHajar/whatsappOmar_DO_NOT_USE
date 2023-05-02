package X;

import android.content.SharedPreferences;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.18e  reason: invalid class name and case insensitive filesystem */
public class C225018e {
    public final AnonymousClass01D A00;
    public final AnonymousClass01D A01;
    public final AtomicLong A02 = new AtomicLong(-1);

    public C225018e(AnonymousClass01D r4, AnonymousClass01D r5) {
        this.A01 = r4;
        this.A00 = r5;
    }

    public long A00() {
        long mostSignificantBits;
        AtomicLong atomicLong = this.A02;
        long j2 = atomicLong.get();
        if (j2 == -1) {
            AnonymousClass01D r6 = this.A01;
            j2 = ((SharedPreferences) ((C15860rz) r6.get()).A01.get()).getLong("qpl_id", -1);
            if (j2 != -1) {
                atomicLong.set(j2);
            } else {
                synchronized (C225018e.class) {
                    if (atomicLong.get() != -1) {
                        mostSignificantBits = atomicLong.get();
                    } else {
                        mostSignificantBits = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
                        atomicLong.set(mostSignificantBits);
                        ((C15860rz) r6.get()).A0K().putLong("qpl_id", mostSignificantBits).apply();
                    }
                }
                return mostSignificantBits;
            }
        }
        return j2;
    }
}
