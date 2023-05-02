package X;

import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.1Nk  reason: invalid class name and case insensitive filesystem */
public class C26361Nk implements C18540wr {
    public final C16200sd A00;
    public final C19670yo A01;
    public final C15860rz A02;

    public C26361Nk(C16200sd r1, C19670yo r2, C15860rz r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void AUu(C75983t2 r12) {
        int i2;
        C15860rz r5 = this.A02;
        int A06 = r5.A06();
        if (A06 == 0) {
            r12.A0Y = 0;
        } else if (A06 == 1) {
            r12.A0Y = 1;
        } else if (A06 == 2) {
            r12.A0Y = 2;
        } else if (A06 == 3) {
            r12.A0Y = 3;
        } else if (A06 != 4) {
            StringBuilder sb = new StringBuilder("alarm-service/update-expensive-fieldstats/gdrive-backup/unexpected-frequency/");
            sb.append(A06);
            Log.e(sb.toString());
            r12.A0Y = Integer.valueOf(A06);
        } else {
            r12.A0Y = 4;
        }
        r12.A01 = Boolean.valueOf(this.A01.A0A());
        String A0M = r5.A0M();
        long j2 = 0;
        if (A0M != null) {
            long A0H = r5.A0H(A0M);
            if (!(A0H == 0 || A0H == -1)) {
                Locale locale = Locale.ENGLISH;
                Long valueOf = Long.valueOf(A0H);
                Log.i(String.format(locale, "alarm-service/update-expensive-fieldstats/last-backup-timestamp/%d", new Object[]{valueOf}));
                r12.A0r = valueOf;
            }
            int A07 = r5.A07();
            if (A07 == 0) {
                i2 = 0;
            } else if (A07 != 1) {
                StringBuilder sb2 = new StringBuilder("alarm-service/update-expensive-fieldstats/gdrive-backup/unexpected-network-setting/");
                sb2.append(A07);
                Log.e(sb2.toString());
                i2 = Integer.valueOf(A07);
            } else {
                i2 = 1;
            }
            r12.A0X = i2;
        }
        if (this.A00.A03.A1f()) {
            j2 = 1;
        }
        r12.A0f = Long.valueOf(j2);
    }
}
