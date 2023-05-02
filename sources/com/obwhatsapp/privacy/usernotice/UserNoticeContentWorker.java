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

public class UserNoticeContentWorker extends Worker {
    public final C17130ua A00;
    public final C19950zG A01;
    public final AnonymousClass13I A02;
    public final AnonymousClass13G A03;
    public final C17670vS A04;

    public UserNoticeContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class));
        this.A00 = (C17130ua) r1.AN9.get();
        this.A03 = (AnonymousClass13G) r1.APh.get();
        this.A04 = (C17670vS) r1.ALM.get();
        this.A01 = (C19950zG) r1.AQV.get();
        this.A02 = (AnonymousClass13I) r1.APg.get();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0126 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x0126=Splitter:B:35:0x0126, B:28:0x011b=Splitter:B:28:0x011b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02Q A04() {
        /*
            r7 = this;
            androidx.work.WorkerParameters r3 = r7.A01
            X.03h r2 = r3.A01
            java.lang.String r0 = "notice_id"
            r1 = -1
            int r6 = r2.A02(r0, r1)
            java.lang.String r0 = "url"
            java.lang.String r2 = r2.A03(r0)
            if (r6 == r1) goto L_0x0145
            if (r2 == 0) goto L_0x0145
            int r1 = r3.A00
            r0 = 4
            if (r1 > r0) goto L_0x0145
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.0zG r0 = r7.A01     // Catch:{ IOException -> 0x0127 }
            X.0vS r1 = r7.A04     // Catch:{ IOException -> 0x0127 }
            r3 = 0
            X.16H r0 = (X.AnonymousClass16H) r0     // Catch:{ IOException -> 0x0127 }
            r5 = r3
            r4 = r3
            X.1pl r5 = r0.A7K(r1, r2, r3, r4, r5)     // Catch:{ IOException -> 0x0127 }
            int r1 = r5.A6O()     // Catch:{ all -> 0x0122 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0046
            X.13G r1 = r7.A03     // Catch:{ all -> 0x0122 }
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0122 }
            r1.A02(r0)     // Catch:{ all -> 0x0122 }
            X.02P r1 = new X.02P     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            goto L_0x011b
        L_0x0046:
            X.0ua r1 = r7.A00     // Catch:{ all -> 0x0122 }
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0122 }
            java.io.InputStream r0 = r5.A9k(r1, r3, r0)     // Catch:{ all -> 0x0122 }
            byte[] r4 = X.C30311c8.A08(r0)     // Catch:{ all -> 0x0122 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0122 }
            r1.<init>(r4)     // Catch:{ all -> 0x0122 }
            X.2E7 r0 = X.AnonymousClass2E7.A00     // Catch:{ all -> 0x0122 }
            X.1jo r3 = r0.A02(r1, r6)     // Catch:{ all -> 0x0122 }
            if (r3 != 0) goto L_0x0088
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "UserNoticeContentManager/storeUserNoticeContent/cannot parse response for notice: "
            r1.append(r0)     // Catch:{ all -> 0x0122 }
            r1.append(r6)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0122 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0122 }
            X.13G r1 = r7.A03     // Catch:{ all -> 0x0122 }
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0122 }
            r1.A02(r0)     // Catch:{ all -> 0x0122 }
            X.02P r1 = new X.02P     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            goto L_0x011b
        L_0x0088:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0122 }
            r2.<init>(r4)     // Catch:{ all -> 0x0122 }
            X.13I r1 = r7.A02     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "content.json"
            boolean r0 = r1.A08(r2, r0, r6)     // Catch:{ all -> 0x0122 }
            if (r0 != 0) goto L_0x009d
            X.02P r1 = new X.02P     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            goto L_0x011b
        L_0x009d:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0122 }
            r2.<init>()     // Catch:{ all -> 0x0122 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0122 }
            r6.<init>()     // Catch:{ all -> 0x0122 }
            X.2Dp r1 = r3.A02     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x00bf
            java.lang.String r0 = "banner_icon_light.png"
            r2.add(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r1.A03     // Catch:{ all -> 0x0122 }
            r6.add(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "banner_icon_dark.png"
            r2.add(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x0122 }
            r6.add(r0)     // Catch:{ all -> 0x0122 }
        L_0x00bf:
            X.2Dr r1 = r3.A04     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x00d7
            java.lang.String r0 = "modal_icon_light.png"
            r2.add(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x0122 }
            r6.add(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "modal_icon_dark.png"
            r2.add(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x0122 }
            r6.add(r0)     // Catch:{ all -> 0x0122 }
        L_0x00d7:
            X.2Dr r1 = r3.A03     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x00ef
            java.lang.String r0 = "blocking_modal_icon_light.png"
            r2.add(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x0122 }
            r6.add(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "blocking_modal_icon_dark.png"
            r2.add(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x0122 }
            r6.add(r0)     // Catch:{ all -> 0x0122 }
        L_0x00ef:
            X.03g r4 = new X.03g     // Catch:{ all -> 0x0122 }
            r4.<init>()     // Catch:{ all -> 0x0122 }
            r3 = 0
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r1 = r2.toArray(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "file_name_list"
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x0122 }
            r2.put(r0, r1)     // Catch:{ all -> 0x0122 }
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r1 = r6.toArray(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "url_list"
            r2.put(r0, r1)     // Catch:{ all -> 0x0122 }
            X.03h r0 = r4.A00()     // Catch:{ all -> 0x0122 }
            X.0Gd r1 = new X.0Gd     // Catch:{ all -> 0x0122 }
            r1.<init>(r0)     // Catch:{ all -> 0x0122 }
        L_0x011b:
            r5.close()     // Catch:{ IOException -> 0x0127 }
            android.net.TrafficStats.clearThreadStatsTag()
            return r1
        L_0x0122:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0126 }
        L_0x0126:
            throw r0     // Catch:{ IOException -> 0x0127 }
        L_0x0127:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0140 }
            X.13G r1 = r7.A03     // Catch:{ all -> 0x0140 }
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0140 }
            r1.A02(r0)     // Catch:{ all -> 0x0140 }
            X.0Gc r0 = new X.0Gc     // Catch:{ all -> 0x0140 }
            r0.<init>()     // Catch:{ all -> 0x0140 }
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x0140:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0145:
            X.13G r1 = r7.A03
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02(r0)
            X.0Gc r0 = new X.0Gc
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.privacy.usernotice.UserNoticeContentWorker.A04():X.02Q");
    }
}
