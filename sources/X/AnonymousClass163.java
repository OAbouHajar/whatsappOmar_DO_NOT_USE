package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.163  reason: invalid class name */
public class AnonymousClass163 {
    public final C16040sK A00;
    public final C15860rz A01;
    public final C19410yO A02;
    public final AnonymousClass137 A03;
    public final AnonymousClass162 A04;
    public final C19810z2 A05;

    public AnonymousClass163(C16040sK r1, C15860rz r2, C19410yO r3, AnonymousClass137 r4, AnonymousClass162 r5, C19810z2 r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final boolean A00(UserJid userJid, long j2, long j3) {
        C37401p6 A09 = this.A05.A09(userJid);
        if (j2 > 0 && A09 != null) {
            long j4 = A09.A01;
            if (j2 < j4 && j3 == j4 && A09.A03 < ((SharedPreferences) this.A01.A01.get()).getLong("adv_last_device_job_ts", 0)) {
                StringBuilder sb = new StringBuilder("contactsyncDevicesupdater/update/usync fetch error, expectedTs=");
                sb.append(j3);
                sb.append("; responseTs=");
                sb.append(j2);
                Log.e(sb.toString());
                AnonymousClass162 r0 = this.A04;
                r0.A00.A06(new AnonymousClass27Z());
                return true;
            }
        }
        return false;
    }
}
