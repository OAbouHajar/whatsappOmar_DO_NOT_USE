package X;

import com.whatsapp.util.Log;

/* renamed from: X.2dn  reason: invalid class name and case insensitive filesystem */
public class C52432dn implements AnonymousClass281 {
    public final /* synthetic */ C23181Au A00;

    public C52432dn(C23181Au r1) {
        this.A00 = r1;
    }

    public void AHP(C34861kz r7, String str, int i2, int i3, long j2) {
        if (j2 > 0) {
            C23181Au r3 = this.A00;
            long A002 = r3.A07.A00() + j2;
            AnonymousClass12D r5 = r3.A06;
            r5.A03(A002);
            if (i3 == 503 && r3.A0A.A0E(C16620tM.A02, 1297)) {
                Log.e("ContactQuerySync/handleSyncContactError need global backoff");
                r5.A01().edit().putLong("global_backoff_time", A002).apply();
            }
        }
    }

    public void AHQ(C451127c r4, String str, int i2) {
        StringBuilder sb = new StringBuilder("ContactQuerySync/result sid=");
        sb.append(str);
        sb.append(" index=");
        sb.append(0);
        Log.i(sb.toString());
        this.A00.A0E.put(str, r4);
    }

    public void AHR(String str, int i2, int i3, long j2) {
        throw new UnsupportedOperationException();
    }
}
