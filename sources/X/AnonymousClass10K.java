package X;

import android.content.SharedPreferences;

/* renamed from: X.10K  reason: invalid class name */
public class AnonymousClass10K {
    public final C15860rz A00;
    public final C16900tq A01;
    public final AnonymousClass10J A02;
    public final C14710pd A03;
    public final C15960sC A04;

    public AnonymousClass10K(C15860rz r1, C16900tq r2, AnonymousClass10J r3, C14710pd r4, C15960sC r5) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(java.lang.String r4) {
        /*
            r3 = this;
            r2 = 0
            X.0tq r0 = r3.A01     // Catch:{ SQLException -> 0x0016 }
            X.0tf r1 = r0.get()     // Catch:{ SQLException -> 0x0016 }
            X.0tg r0 = r1.A02     // Catch:{ all -> 0x0011 }
            java.lang.String r0 = X.C33971jU.A00(r0, r4, r2)     // Catch:{ all -> 0x0011 }
            r1.close()     // Catch:{ SQLException -> 0x0016 }
            return r0
        L_0x0011:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0015 }
        L_0x0015:
            throw r0     // Catch:{ SQLException -> 0x0016 }
        L_0x0016:
            r1 = move-exception
            java.lang.String r0 = "UserSettingsStore/getPushName/Error reading push name"
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10K.A00(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            X.0tq r0 = r3.A01     // Catch:{ SQLException -> 0x001a }
            X.0tf r2 = r0.A02()     // Catch:{ SQLException -> 0x001a }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0015 }
            java.lang.Class<X.10K> r0 = X.AnonymousClass10K.class
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0015 }
            X.C33971jU.A03(r1, r4, r5, r0)     // Catch:{ all -> 0x0015 }
            r2.close()     // Catch:{ SQLException -> 0x001a }
            return
        L_0x0015:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0019 }
        L_0x0019:
            throw r0     // Catch:{ SQLException -> 0x001a }
        L_0x001a:
            r1 = move-exception
            java.lang.String r0 = "UserSettingsStore/updatePushName/Error updating push name"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10K.A01(java.lang.String, java.lang.String):void");
    }

    public boolean A02() {
        return this.A04.A01() ? this.A03.A0E(C16620tM.A02, 2619) : ((SharedPreferences) this.A00.A01.get()).getBoolean("reg_prefill_name", false);
    }
}
