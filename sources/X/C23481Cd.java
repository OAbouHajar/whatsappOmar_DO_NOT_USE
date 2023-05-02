package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Cd  reason: invalid class name and case insensitive filesystem */
public class C23481Cd {
    public String A00;
    public final C16040sK A01;
    public final AnonymousClass19E A02;
    public final C16440t3 A03;
    public final C14730pf A04;
    public final C208211s A05;
    public final C16490t9 A06;

    public C23481Cd(C16040sK r1, AnonymousClass19E r2, C16440t3 r3, C14730pf r4, C208211s r5, C16490t9 r6) {
        this.A03 = r3;
        this.A01 = r1;
        this.A06 = r6;
        this.A04 = r4;
        this.A02 = r2;
        this.A05 = r5;
    }

    public final String A00() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        C16040sK r0 = this.A01;
        r0.A0B();
        AnonymousClass1ZT r02 = r0.A05;
        AnonymousClass00B.A06(r02);
        DeviceJid primaryDevice = r02.getPrimaryDevice();
        AnonymousClass19E r2 = this.A02;
        String A042 = AnonymousClass19E.A04(r2.A03.A00.A04().A01, this.A05.A0B(C28851Ya.A02(primaryDevice)));
        this.A00 = A042;
        if (A042 == null) {
            Log.w("CompanionSyncStatsLogger/getBootstrapSessionId MD session ID is null");
        }
        return this.A00;
    }

    public void A01(AnonymousClass1XB r7, AnonymousClass1XC r8, String str, long j2, boolean z2) {
        AnonymousClass255 r4 = new AnonymousClass255();
        int i2 = 1;
        int i3 = 2;
        if (z2) {
            i3 = 1;
        }
        r4.A01 = Integer.valueOf(i3);
        r4.A07 = A00();
        long j3 = 0;
        if (r7 != null) {
            j3 = 0 + r7.A01;
        }
        if (r8 != null) {
            j3 += (long) r8.AFw();
            if ((r8.A00 & 2) == 2) {
                AnonymousClass1XB r0 = r8.A06;
                if (r0 == null) {
                    r0 = AnonymousClass1XB.A07;
                }
                j3 += r0.A01;
            }
        }
        r4.A02 = Long.valueOf(j3);
        if (!AnonymousClass1WJ.A09.contains(str)) {
            i2 = 2;
        }
        r4.A00 = Integer.valueOf(i2);
        long A002 = this.A03.A00();
        r4.A06 = Long.valueOf(A002);
        r4.A03 = Long.valueOf(A002 - j2);
        C14730pf r1 = this.A04;
        long A042 = r1.A04();
        r4.A04 = Long.valueOf(A042);
        r4.A05 = Long.valueOf(A042 - r1.A02());
        this.A06.A06(r4);
    }
}
