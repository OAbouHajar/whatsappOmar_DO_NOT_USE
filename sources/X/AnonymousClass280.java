package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.280  reason: invalid class name */
public class AnonymousClass280 implements AnonymousClass281 {
    public final /* synthetic */ C42481xs A00;

    public AnonymousClass280(C42481xs r1) {
        this.A00 = r1;
    }

    public void AHP(C34861kz r8, String str, int i2, int i3, long j2) {
        SharedPreferences.Editor edit;
        String str2;
        C42481xs r6 = this.A00;
        r6.A02 = Long.valueOf((long) i3);
        StringBuilder sb = new StringBuilder("contactsyncmanager/handleSyncContactError/error sid=");
        sb.append(str);
        sb.append(" index=");
        sb.append(0);
        sb.append(" code=");
        sb.append(i3);
        sb.append(" backoff=");
        sb.append(j2);
        Log.e(sb.toString());
        if (j2 > 0) {
            long A002 = r6.A0D.A00() + j2;
            AnonymousClass12D r5 = r6.A08;
            r5.A01().edit().putLong("contact_sync_backoff", A002).apply();
            if (i3 == 503 && r6.A0H.A0E(C16620tM.A02, 1297)) {
                Log.e("contactsyncmanager/handleSyncContactError need global backoff");
                edit = r5.A01().edit();
                str2 = "global_backoff_time";
            } else if (r6.A0H.A0E(C16620tM.A02, 949) && r8.mode == C453327z.DELTA && i3 == 429) {
                Log.e("contactsyncmanager/handleSyncContactError/deltaSync need backoff");
                edit = r5.A01().edit();
                str2 = "delta_sync_backoff";
            } else {
                return;
            }
            edit.putLong(str2, A002).apply();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x0381 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x037c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AHQ(X.C451127c r18, java.lang.String r19, int r20) {
        /*
            r17 = this;
            r10 = 0
            r0 = r17
            X.1xs r0 = r0.A00
            r16 = r0
            r12 = r18
            r0.A01 = r12
            X.27e r2 = r12.A00
            X.27g r13 = r2.A01
            X.27g r11 = r2.A07
            X.27g r7 = r2.A08
            X.27g r6 = r2.A06
            X.27g r8 = r2.A00
            X.27g r9 = r2.A02
            X.27g r5 = r2.A05
            X.27g r4 = r2.A03
            X.27g r3 = r2.A04
            java.lang.String r0 = "sync/result sid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r19
            r1.append(r0)
            java.lang.String r0 = " index="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " users_count="
            r1.append(r0)
            X.27a[] r12 = r12.A01
            int r10 = r12.length
            r1.append(r10)
            java.lang.String r0 = " version="
            r1.append(r0)
            java.lang.String r0 = r2.A09
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            if (r13 == 0) goto L_0x009f
            java.lang.String r0 = " contact="
            r2.append(r0)
            r2.append(r13)
            java.lang.Long r1 = r13.A02
            if (r1 == 0) goto L_0x0079
            r0 = r16
            X.12D r14 = r0.A08
            long r0 = r1.longValue()
            android.content.SharedPreferences r14 = r14.A01()
            android.content.SharedPreferences$Editor r15 = r14.edit()
            java.lang.String r14 = "contact_full_sync_wait"
            android.content.SharedPreferences$Editor r0 = r15.putLong(r14, r0)
            r0.apply()
        L_0x0079:
            java.lang.Long r13 = r13.A01
            if (r13 == 0) goto L_0x009f
            r0 = r16
            X.0t3 r0 = r0.A0D
            long r0 = r0.A00()
            long r13 = r13.longValue()
            long r0 = r0 + r13
            r13 = r16
            X.12D r13 = r13.A08
            android.content.SharedPreferences r13 = r13.A01()
            android.content.SharedPreferences$Editor r14 = r13.edit()
            java.lang.String r13 = "contact_sync_backoff"
            android.content.SharedPreferences$Editor r0 = r14.putLong(r13, r0)
            r0.apply()
        L_0x009f:
            if (r11 == 0) goto L_0x00df
            java.lang.String r0 = " sidelist="
            r2.append(r0)
            r2.append(r11)
            java.lang.Long r1 = r11.A02
            if (r1 == 0) goto L_0x00c7
            r0 = r16
            X.12D r13 = r0.A08
            long r0 = r1.longValue()
            android.content.SharedPreferences r13 = r13.A01()
            android.content.SharedPreferences$Editor r14 = r13.edit()
            java.lang.String r13 = "sidelist_full_sync_wait"
            android.content.SharedPreferences$Editor r0 = r14.putLong(r13, r0)
            r0.apply()
        L_0x00c7:
            java.lang.Long r11 = r11.A01
            if (r11 == 0) goto L_0x00df
            r0 = r16
            X.0t3 r0 = r0.A0D
            long r0 = r0.A00()
            long r13 = r11.longValue()
            long r0 = r0 + r13
            r11 = r16
            X.12D r11 = r11.A08
            r11.A03(r0)
        L_0x00df:
            if (r7 == 0) goto L_0x012e
            java.lang.String r0 = " status="
            r2.append(r0)
            r2.append(r7)
            java.lang.Long r1 = r7.A02
            if (r1 == 0) goto L_0x0107
            r0 = r16
            X.12D r11 = r0.A08
            long r0 = r1.longValue()
            android.content.SharedPreferences r11 = r11.A01()
            android.content.SharedPreferences$Editor r13 = r11.edit()
            java.lang.String r11 = "status_full_sync_wait"
            android.content.SharedPreferences$Editor r0 = r13.putLong(r11, r0)
            r0.apply()
        L_0x0107:
            java.lang.Long r7 = r7.A01
            if (r7 == 0) goto L_0x012e
            r0 = r16
            X.0t3 r0 = r0.A0D
            long r0 = r0.A00()
            long r13 = r7.longValue()
            long r0 = r0 + r13
            r7 = r16
            X.12D r7 = r7.A08
            android.content.SharedPreferences r7 = r7.A01()
            android.content.SharedPreferences$Editor r11 = r7.edit()
            java.lang.String r7 = "status_sync_backoff"
            android.content.SharedPreferences$Editor r0 = r11.putLong(r7, r0)
            r0.apply()
        L_0x012e:
            if (r6 == 0) goto L_0x017b
            java.lang.String r0 = " picture="
            r2.append(r0)
            r2.append(r6)
            java.lang.Long r1 = r6.A02
            if (r1 == 0) goto L_0x0155
            r0 = r16
            X.12D r7 = r0.A08
            long r0 = r1.longValue()
            android.content.SharedPreferences r7 = r7.A01()
            android.content.SharedPreferences$Editor r11 = r7.edit()
            java.lang.String r7 = "picture_full_sync_wait"
            android.content.SharedPreferences$Editor r0 = r11.putLong(r7, r0)
            r0.apply()
        L_0x0155:
            java.lang.Long r6 = r6.A01
            if (r6 == 0) goto L_0x017b
            r0 = r16
            X.0t3 r0 = r0.A0D
            long r0 = r0.A00()
            long r6 = r6.longValue()
            long r0 = r0 + r6
            r6 = r16
            X.12D r6 = r6.A08
            android.content.SharedPreferences r6 = r6.A01()
            android.content.SharedPreferences$Editor r7 = r6.edit()
            java.lang.String r6 = "picture_sync_backoff"
            android.content.SharedPreferences$Editor r0 = r7.putLong(r6, r0)
            r0.apply()
        L_0x017b:
            if (r8 == 0) goto L_0x01c8
            java.lang.String r0 = " business="
            r2.append(r0)
            r2.append(r8)
            java.lang.Long r1 = r8.A02
            if (r1 == 0) goto L_0x01a2
            r0 = r16
            X.12D r6 = r0.A08
            long r0 = r1.longValue()
            android.content.SharedPreferences r6 = r6.A01()
            android.content.SharedPreferences$Editor r7 = r6.edit()
            java.lang.String r6 = "business_full_sync_wait"
            android.content.SharedPreferences$Editor r0 = r7.putLong(r6, r0)
            r0.apply()
        L_0x01a2:
            java.lang.Long r6 = r8.A01
            if (r6 == 0) goto L_0x01c8
            r0 = r16
            X.0t3 r0 = r0.A0D
            long r0 = r0.A00()
            long r6 = r6.longValue()
            long r0 = r0 + r6
            r6 = r16
            X.12D r6 = r6.A08
            android.content.SharedPreferences r6 = r6.A01()
            android.content.SharedPreferences$Editor r7 = r6.edit()
            java.lang.String r6 = "business_sync_backoff"
            android.content.SharedPreferences$Editor r0 = r7.putLong(r6, r0)
            r0.apply()
        L_0x01c8:
            if (r9 == 0) goto L_0x0215
            java.lang.String r0 = " devices="
            r2.append(r0)
            r2.append(r9)
            java.lang.Long r1 = r9.A02
            if (r1 == 0) goto L_0x01ef
            r0 = r16
            X.12D r6 = r0.A08
            long r0 = r1.longValue()
            android.content.SharedPreferences r6 = r6.A01()
            android.content.SharedPreferences$Editor r7 = r6.edit()
            java.lang.String r6 = "devices_full_sync_wait"
            android.content.SharedPreferences$Editor r0 = r7.putLong(r6, r0)
            r0.apply()
        L_0x01ef:
            java.lang.Long r6 = r9.A01
            if (r6 == 0) goto L_0x0215
            r0 = r16
            X.0t3 r0 = r0.A0D
            long r0 = r0.A00()
            long r6 = r6.longValue()
            long r0 = r0 + r6
            r6 = r16
            X.12D r6 = r6.A08
            android.content.SharedPreferences r6 = r6.A01()
            android.content.SharedPreferences$Editor r7 = r6.edit()
            java.lang.String r6 = "devices_sync_backoff"
            android.content.SharedPreferences$Editor r0 = r7.putLong(r6, r0)
            r0.apply()
        L_0x0215:
            if (r5 == 0) goto L_0x0262
            java.lang.String r0 = " payment="
            r2.append(r0)
            r2.append(r5)
            java.lang.Long r1 = r5.A02
            if (r1 == 0) goto L_0x023c
            r0 = r16
            X.12D r6 = r0.A08
            long r0 = r1.longValue()
            android.content.SharedPreferences r6 = r6.A01()
            android.content.SharedPreferences$Editor r7 = r6.edit()
            java.lang.String r6 = "payment_full_sync_wait"
            android.content.SharedPreferences$Editor r0 = r7.putLong(r6, r0)
            r0.apply()
        L_0x023c:
            java.lang.Long r5 = r5.A01
            if (r5 == 0) goto L_0x0262
            r0 = r16
            X.0t3 r0 = r0.A0D
            long r0 = r0.A00()
            long r5 = r5.longValue()
            long r0 = r0 + r5
            r5 = r16
            X.12D r5 = r5.A08
            android.content.SharedPreferences r5 = r5.A01()
            android.content.SharedPreferences$Editor r6 = r5.edit()
            java.lang.String r5 = "payment_sync_backoff"
            android.content.SharedPreferences$Editor r0 = r6.putLong(r5, r0)
            r0.apply()
        L_0x0262:
            if (r4 == 0) goto L_0x02af
            java.lang.String r0 = " disappearing_mode="
            r2.append(r0)
            r2.append(r4)
            java.lang.Long r1 = r4.A02
            if (r1 == 0) goto L_0x0289
            r0 = r16
            X.12D r5 = r0.A08
            long r0 = r1.longValue()
            android.content.SharedPreferences r5 = r5.A01()
            android.content.SharedPreferences$Editor r6 = r5.edit()
            java.lang.String r5 = "disappearing_mode_full_sync_wait"
            android.content.SharedPreferences$Editor r0 = r6.putLong(r5, r0)
            r0.apply()
        L_0x0289:
            java.lang.Long r4 = r4.A01
            if (r4 == 0) goto L_0x02af
            r0 = r16
            X.0t3 r0 = r0.A0D
            long r0 = r0.A00()
            long r4 = r4.longValue()
            long r0 = r0 + r4
            r4 = r16
            X.12D r4 = r4.A08
            android.content.SharedPreferences r4 = r4.A01()
            android.content.SharedPreferences$Editor r5 = r4.edit()
            java.lang.String r4 = "disappearing_mode_sync_backoff"
            android.content.SharedPreferences$Editor r0 = r5.putLong(r4, r0)
            r0.apply()
        L_0x02af:
            if (r3 == 0) goto L_0x02fc
            java.lang.String r0 = " lid="
            r2.append(r0)
            r2.append(r3)
            java.lang.Long r1 = r3.A02
            if (r1 == 0) goto L_0x02d6
            r0 = r16
            X.12D r4 = r0.A08
            long r0 = r1.longValue()
            android.content.SharedPreferences r4 = r4.A01()
            android.content.SharedPreferences$Editor r5 = r4.edit()
            java.lang.String r4 = "contact_lid_sync_wait"
            android.content.SharedPreferences$Editor r0 = r5.putLong(r4, r0)
            r0.apply()
        L_0x02d6:
            java.lang.Long r1 = r3.A01
            if (r1 == 0) goto L_0x02fc
            r0 = r16
            X.0t3 r0 = r0.A0D
            long r3 = r0.A00()
            long r0 = r1.longValue()
            long r3 = r3 + r0
            r0 = r16
            X.12D r0 = r0.A08
            android.content.SharedPreferences r0 = r0.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "lid_sync_backoff"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r3)
            r0.apply()
        L_0x02fc:
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r16
            X.27q r4 = r0.A09
            java.util.HashSet r3 = r4.A00()
            r5 = 0
        L_0x030c:
            if (r5 >= r10) goto L_0x0353
            r6 = r12[r5]
            int r1 = r6.A04
            r0 = 3
            if (r1 != r0) goto L_0x0320
            java.util.List r0 = r6.A0G
            X.AnonymousClass00B.A06(r0)
            r3.addAll(r0)
        L_0x031d:
            int r5 = r5 + 1
            goto L_0x030c
        L_0x0320:
            r0 = 1
            if (r1 == r0) goto L_0x0326
            r0 = 2
            if (r1 != r0) goto L_0x0340
        L_0x0326:
            java.util.List r0 = r6.A0G
            if (r0 == 0) goto L_0x0340
            java.util.Iterator r2 = r0.iterator()
        L_0x032e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0340
            java.lang.Object r1 = r2.next()
            r0 = r16
            java.util.Map r0 = r0.A0P
            r0.put(r1, r6)
            goto L_0x032e
        L_0x0340:
            com.whatsapp.jid.UserJid r1 = r6.A0C
            if (r1 == 0) goto L_0x034c
            r0 = r16
            java.util.Map r0 = r0.A0N
            r0.put(r1, r6)
            goto L_0x031d
        L_0x034c:
            java.lang.String r0 = "sync/result/no-jid-found"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x031d
        L_0x0353:
            X.0tz r0 = r4.A01
            android.content.Context r0 = r0.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r1 = "invalid_numbers"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0382 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0382 }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x037d }
            r1.<init>(r2)     // Catch:{ all -> 0x037d }
            r4.A00 = r3     // Catch:{ all -> 0x0378 }
            r1.writeObject(r3)     // Catch:{ all -> 0x0378 }
            r1.close()     // Catch:{ all -> 0x037d }
            r2.close()     // Catch:{ IOException -> 0x0382 }
            return
        L_0x0378:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x037c }
        L_0x037c:
            throw r0     // Catch:{ all -> 0x037d }
        L_0x037d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0381 }
        L_0x0381:
            throw r0     // Catch:{ IOException -> 0x0382 }
        L_0x0382:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass280.AHQ(X.27c, java.lang.String, int):void");
    }

    public void AHR(String str, int i2, int i3, long j2) {
        C42481xs r3 = this.A00;
        r3.A02 = 1L;
        StringBuilder sb = new StringBuilder("contactsyncmanager/handleSyncSidelistError/error sid=");
        sb.append(str);
        sb.append(" index=");
        sb.append(0);
        sb.append(" code=");
        sb.append(i3);
        sb.append(" backoff=");
        sb.append(j2);
        Log.e(sb.toString());
        if (j2 > 0) {
            r3.A08.A03(r3.A0D.A00() + j2);
        }
    }
}
