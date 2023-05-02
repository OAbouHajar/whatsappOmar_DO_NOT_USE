package X;

import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.util.Log;

/* renamed from: X.364  reason: invalid class name */
public final class AnonymousClass364 extends C16690tT {
    public final AnonymousClass262 A00;
    public final String A01;
    public final /* synthetic */ C25541Ke A02;

    public AnonymousClass364(AnonymousClass262 r1, C25541Ke r2, String str) {
        this.A02 = r2;
        this.A01 = str;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.C41191vO.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r12) {
        /*
            r11 = this;
            r0 = 14
            android.net.TrafficStats.setThreadStatsTag(r0)
            r8 = 0
            r0 = 3
            X.4bg r3 = new X.4bg
            r3.<init>(r8, r8, r8, r0)
            X.1Ke r4 = r11.A02     // Catch:{ IOException -> 0x0049 }
            X.0zG r5 = r4.A04     // Catch:{ IOException -> 0x0049 }
            X.0vS r6 = r4.A05     // Catch:{ IOException -> 0x0049 }
            java.lang.String r7 = r11.A01     // Catch:{ IOException -> 0x0049 }
            r10 = r8
            r9 = r8
            X.1pl r2 = r5.A7K(r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x0049 }
            int r0 = r2.A6O()     // Catch:{ IOException -> 0x0049 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0049 }
            r3.A00 = r0     // Catch:{ IOException -> 0x0049 }
            int r1 = r2.A6O()     // Catch:{ IOException -> 0x0049 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0050
            X.0ua r1 = r4.A02     // Catch:{ IOException -> 0x0049 }
            r0 = 19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0049 }
            java.io.InputStream r2 = r2.A9k(r1, r8, r0)     // Catch:{ IOException -> 0x0049 }
            X.C18450wi.A0B(r2)     // Catch:{ all -> 0x0042 }
            r4.A0D(r2)     // Catch:{ all -> 0x0042 }
            r2.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x0050
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.C41191vO.A00(r2, r1)     // Catch:{ IOException -> 0x0049 }
            throw r0     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            java.lang.String r0 = X.AnonymousClass000.A0d(r0)     // Catch:{ all -> 0x0054 }
            r3.A01 = r0     // Catch:{ all -> 0x0054 }
        L_0x0050:
            android.net.TrafficStats.clearThreadStatsTag()
            return r3
        L_0x0054:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass364.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C89154bg r9 = (C89154bg) obj;
        C18450wi.A0H(r9, 0);
        C25541Ke r4 = this.A02;
        r4.A07 = false;
        Integer num = r9.A00;
        if (num == null || num.intValue() != 200) {
            AnonymousClass262 r0 = this.A00;
            if (r0 != null) {
                r0.A00();
            }
            Log.e(C18450wi.A06("DirectoryValueModelConfigDownloader/ValueModelConfigFetchTask Failed response code : ", r9.A00));
            r4.A03.A0D(r9.A00, (Integer) null, (Integer) null, "wa_static_client_value_model_config", String.valueOf(r9.A01), (String) null);
            return;
        }
        r4.A06.Acl(new RunnableRunnableShape3S0200000_I0_1(r4, 33, this.A00));
    }
}
