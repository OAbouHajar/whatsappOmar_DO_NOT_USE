package X;

import android.os.Build;
import android.util.Log;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.03f  reason: invalid class name and case insensitive filesystem */
public abstract class C007003f {
    public C007303i A00;
    public UUID A01;
    public boolean A02;
    public final Set A03;

    public C007003f(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        C18450wi.A0B(randomUUID);
        this.A01 = randomUUID;
        String obj = randomUUID.toString();
        C18450wi.A0B(obj);
        String name = cls.getName();
        C18450wi.A0B(name);
        AnonymousClass0KV r8 = AnonymousClass0KV.ENQUEUED;
        C007203h r5 = C007203h.A01;
        this.A00 = new C007303i(AnonymousClass04P.EXPONENTIAL, AnonymousClass042.A08, r5, r5, C007403j.RUN_AS_NON_EXPEDITED_WORK_REQUEST, r8, obj, name, (String) null, 0, 0, 0, 0, 0, 0, AnonymousClass1NO.A0L, 0, 0, -1, false);
        this.A03 = AnonymousClass1F9.A02(name);
    }

    public final AnonymousClass03k A00() {
        AnonymousClass03k A012 = A01();
        AnonymousClass042 r2 = this.A00.A0A;
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = (i2 >= 24 && (r2.A03.isEmpty() ^ true)) || r2.A04 || r2.A05 || (i2 >= 23 && r2.A00());
        C007303i r1 = this.A00;
        if (r1.A0H) {
            if (!(!z2)) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            } else if (r1.A04 > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID = UUID.randomUUID();
        C18450wi.A0B(randomUUID);
        A04(randomUUID);
        return A012;
    }

    public abstract AnonymousClass03k A01();

    public void A02(long j2, TimeUnit timeUnit) {
        C18450wi.A0H(timeUnit, 1);
        this.A00.A04 = timeUnit.toMillis(j2);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.A00.A04) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void A03(AnonymousClass04P r9, TimeUnit timeUnit, long j2) {
        C18450wi.A0H(r9, 0);
        C18450wi.A0H(timeUnit, 2);
        this.A02 = true;
        C007303i r7 = this.A00;
        r7.A09 = r9;
        long millis = timeUnit.toMillis(j2);
        if (millis > 18000000) {
            C06530Wm.A00();
            Log.w(C007303i.A0L, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            C06530Wm.A00();
            Log.w(C007303i.A0L, "Backoff delay duration less than minimum value");
        }
        if (millis < 10000) {
            millis = 10000;
        } else if (millis > 18000000) {
            millis = 18000000;
        }
        r7.A02 = millis;
    }

    public final void A04(UUID uuid) {
        UUID uuid2 = uuid;
        this.A01 = uuid2;
        String obj = uuid2.toString();
        C18450wi.A0B(obj);
        C007303i r13 = this.A00;
        String str = r13.A0G;
        AnonymousClass0KV r19 = r13.A0E;
        String str2 = r13.A0F;
        C007203h r11 = new C007203h(r13.A0B);
        C007203h r10 = new C007203h(r13.A0C);
        long j2 = r13.A04;
        long j3 = r13.A05;
        long j4 = r13.A03;
        AnonymousClass042 r9 = new AnonymousClass042(r13.A0A);
        int i2 = r13.A01;
        AnonymousClass04P r17 = r13.A09;
        long j5 = r13.A02;
        long j6 = r13.A06;
        long j7 = r13.A07;
        long j8 = r13.A08;
        boolean z2 = r13.A0H;
        this.A00 = new C007303i(r17, r9, r11, r10, r13.A0D, r19, obj, str, str2, i2, r13.A00, 0, j2, j3, j4, j5, j6, j7, j8, z2);
    }
}
