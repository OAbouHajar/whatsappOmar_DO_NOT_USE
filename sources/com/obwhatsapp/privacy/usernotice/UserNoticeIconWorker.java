package com.obwhatsapp.privacy.usernotice;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass13G;
import X.AnonymousClass13I;
import X.C16150sX;
import X.C17130ua;
import X.C17670vS;
import X.C19950zG;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class UserNoticeIconWorker extends Worker {
    public final C17130ua A00;
    public final C19950zG A01;
    public final AnonymousClass13I A02;
    public final AnonymousClass13G A03;
    public final C17670vS A04;

    public UserNoticeIconWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        this.A00 = (C17130ua) r1.AN9.get();
        this.A03 = (AnonymousClass13G) r1.APh.get();
        this.A04 = (C17670vS) r1.ALM.get();
        this.A01 = (C19950zG) r1.AQV.get();
        this.A02 = (AnonymousClass13I) r1.APg.get();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0092 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x0092=Splitter:B:33:0x0092, B:28:0x008a=Splitter:B:28:0x008a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02Q A04() {
        /*
            r14 = this;
            androidx.work.WorkerParameters r3 = r14.A01
            X.03h r1 = r3.A01
            java.lang.String r0 = "notice_id"
            r2 = -1
            int r7 = r1.A02(r0, r2)
            java.lang.String r0 = "file_name_list"
            java.util.Map r1 = r1.A00
            java.lang.Object r6 = r1.get(r0)
            boolean r0 = r6 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x0088
            java.lang.String[] r6 = (java.lang.String[]) r6
        L_0x0019:
            java.lang.String r0 = "url_list"
            java.lang.Object r5 = r1.get(r0)
            boolean r0 = r5 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x0086
            java.lang.String[] r5 = (java.lang.String[]) r5
        L_0x0026:
            if (r7 == r2) goto L_0x00b6
            if (r6 == 0) goto L_0x00b6
            if (r5 == 0) goto L_0x00b6
            int r1 = r3.A00
            r0 = 4
            if (r1 > r0) goto L_0x00b6
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            r4 = 0
        L_0x0037:
            int r0 = r5.length
            if (r4 >= r0) goto L_0x00b1
            X.0zG r8 = r14.A01     // Catch:{ IOException -> 0x0093 }
            r10 = r5[r4]     // Catch:{ IOException -> 0x0093 }
            X.0vS r9 = r14.A04     // Catch:{ IOException -> 0x0093 }
            r11 = 0
            X.16H r8 = (X.AnonymousClass16H) r8     // Catch:{ IOException -> 0x0093 }
            r13 = r11
            r12 = r11
            X.1pl r8 = r8.A7K(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0093 }
            int r1 = r8.A6O()     // Catch:{ all -> 0x008e }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0061
            X.13G r1 = r14.A03     // Catch:{ all -> 0x008e }
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008e }
            r1.A02(r0)     // Catch:{ all -> 0x008e }
            X.0Gc r0 = new X.0Gc     // Catch:{ all -> 0x008e }
            r0.<init>()     // Catch:{ all -> 0x008e }
            goto L_0x008a
        L_0x0061:
            X.13I r3 = r14.A02     // Catch:{ all -> 0x008e }
            r2 = r6[r4]     // Catch:{ all -> 0x008e }
            X.0ua r1 = r14.A00     // Catch:{ all -> 0x008e }
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008e }
            java.io.InputStream r0 = r8.A9k(r1, r11, r0)     // Catch:{ all -> 0x008e }
            boolean r0 = r3.A08(r0, r2, r7)     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x007d
            X.02P r0 = new X.02P     // Catch:{ all -> 0x008e }
            r0.<init>()     // Catch:{ all -> 0x008e }
            goto L_0x008a
        L_0x007d:
            r8.close()     // Catch:{ IOException -> 0x0093 }
            android.net.TrafficStats.clearThreadStatsTag()
            int r4 = r4 + 1
            goto L_0x0037
        L_0x0086:
            r5 = 0
            goto L_0x0026
        L_0x0088:
            r6 = 0
            goto L_0x0019
        L_0x008a:
            r8.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x00a8
        L_0x008e:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0092 }
        L_0x0092:
            throw r0     // Catch:{ IOException -> 0x0093 }
        L_0x0093:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00ac }
            X.13G r1 = r14.A03     // Catch:{ all -> 0x00ac }
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ac }
            r1.A02(r0)     // Catch:{ all -> 0x00ac }
            X.0Gc r0 = new X.0Gc     // Catch:{ all -> 0x00ac }
            r0.<init>()     // Catch:{ all -> 0x00ac }
        L_0x00a8:
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x00ac:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x00b1:
            X.02Q r0 = X.AnonymousClass02Q.A00()
            return r0
        L_0x00b6:
            X.13G r1 = r14.A03
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02(r0)
            X.0Gc r0 = new X.0Gc
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.privacy.usernotice.UserNoticeIconWorker.A04():X.02Q");
    }
}
