package X;

import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.whatsapp.util.Log;

/* renamed from: X.1OI  reason: invalid class name */
public class AnonymousClass1OI implements C23541Cj {
    public C19280yB A00;
    public AnonymousClass1OL A01;
    public AnonymousClass1OK A02;
    public C206210w A03;
    public C222417e A04;
    public C16440t3 A05;
    public C16980tz A06;
    public C215914r A07;
    public C20130zY A08;
    public AnonymousClass1OJ A09;
    public C219215y A0A;
    public C26331Nh A0B;
    public C26321Ng A0C;
    public C16320sq A0D;

    /* JADX WARNING: Missing exception handler attribute for start block: B:174:0x02ea */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x008f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0094 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APJ() {
        /*
            r12 = this;
            X.14r r1 = r12.A07
            r0 = 0
            r1.A04(r0)
            X.1OJ r6 = r12.A09
            monitor-enter(r6)
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x02f3 }
            X.03L r1 = r6.A00     // Catch:{ all -> 0x02f3 }
            r0 = -1
            r1.A05(r0)     // Catch:{ all -> 0x02f3 }
            X.0tc r0 = r6.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x004d }
            X.0tf r9 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x004d }
            X.1cj r11 = r9.A00()     // Catch:{ all -> 0x0048 }
            X.0tg r10 = r9.A02     // Catch:{ all -> 0x0043 }
            java.lang.String r8 = "media_job"
            java.lang.String r7 = "last_update_time < ?"
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0043 }
            r4 = 0
            X.0t3 r0 = r6.A01     // Catch:{ all -> 0x0043 }
            long r2 = r0.A00()     // Catch:{ all -> 0x0043 }
            r0 = 1209600000(0x48190800, double:5.97621805E-315)
            long r2 = r2 - r0
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0043 }
            r5[r4] = r0     // Catch:{ all -> 0x0043 }
            r10.A01(r8, r7, r5)     // Catch:{ all -> 0x0043 }
            r11.A00()     // Catch:{ all -> 0x0043 }
            r11.close()     // Catch:{ all -> 0x0048 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x004d }
            goto L_0x0053
        L_0x0043:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x004d }
        L_0x004d:
            r1 = move-exception
            java.lang.String r0 = "mediajobdb/delete All Older than"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02f3 }
        L_0x0053:
            monitor-exit(r6)
            X.0zY r6 = r12.A08
            monitor-enter(r6)
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x02f0 }
            X.0tc r0 = r6.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0095 }
            X.0tf r9 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0095 }
            X.1cj r11 = r9.A00()     // Catch:{ all -> 0x0090 }
            X.0tg r10 = r9.A02     // Catch:{ all -> 0x008b }
            java.lang.String r8 = "express_path_download_data"
            java.lang.String r7 = "last_update_time < ?"
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x008b }
            r4 = 0
            X.0t3 r0 = r6.A00     // Catch:{ all -> 0x008b }
            long r2 = r0.A00()     // Catch:{ all -> 0x008b }
            r0 = 300000(0x493e0, double:1.482197E-318)
            long r2 = r2 - r0
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x008b }
            r5[r4] = r0     // Catch:{ all -> 0x008b }
            r10.A01(r8, r7, r5)     // Catch:{ all -> 0x008b }
            r11.A00()     // Catch:{ all -> 0x008b }
            r11.close()     // Catch:{ all -> 0x0090 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0095 }
            goto L_0x009b
        L_0x008b:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x008f }
        L_0x008f:
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0094 }
        L_0x0094:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            java.lang.String r0 = "expresspathdownloaddb/delete All Older than"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02f0 }
        L_0x009b:
            monitor-exit(r6)
            X.0yB r6 = r12.A00
            X.11i r4 = r6.A01
            java.lang.String r11 = "packs"
            java.lang.String r0 = "language-pack-store/delete-unused-language-packs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0t3 r0 = r4.A00
            long r2 = r0.A00()
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            X.2Dl r5 = r4.A01
            X.0tf r9 = r5.A02()
            X.1cj r10 = r9.A00()     // Catch:{ all -> 0x02eb }
            X.0tg r7 = r9.A02     // Catch:{ all -> 0x02e6 }
            java.lang.String r1 = "length(data) == 0 AND timestamp < ?"
            r8 = 1
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ all -> 0x02e6 }
            java.lang.String r4 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x02e6 }
            r2 = 0
            r0[r2] = r4     // Catch:{ all -> 0x02e6 }
            int r3 = r7.A01(r11, r1, r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r1 = "length(data) > 0 AND timestamp < ?"
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ all -> 0x02e6 }
            r0[r2] = r4     // Catch:{ all -> 0x02e6 }
            int r2 = r7.A01(r11, r1, r0)     // Catch:{ all -> 0x02e6 }
            r10.A00()     // Catch:{ all -> 0x02e6 }
            r10.close()     // Catch:{ all -> 0x02eb }
            r9.close()
            if (r3 > 0) goto L_0x00e7
            if (r2 <= 0) goto L_0x0128
        L_0x00e7:
            java.lang.String r0 = "language-pack-store/delete-unused-language-packs empty="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " unused="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.197 r1 = r6.A03
            monitor-enter(r1)
            r1.clear()     // Catch:{ all -> 0x0122 }
            java.util.HashSet r0 = r6.A05     // Catch:{ all -> 0x0122 }
            r0.clear()     // Catch:{ all -> 0x0122 }
            monitor-exit(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "language-pack-store/vacuum"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tf r2 = r5.A02()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x011d }
            java.lang.String r0 = "VACUUM"
            r1.A0B(r0)     // Catch:{ all -> 0x011d }
            goto L_0x0125
        L_0x011d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x02ef }
            throw r0
        L_0x0122:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0122 }
            throw r0
        L_0x0125:
            r2.close()
        L_0x0128:
            X.0tz r0 = r12.A06
            android.content.Context r4 = r0.A00
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.HashMap r3 = X.AnonymousClass37V.A0A
            monitor-enter(r3)
            java.util.Set r0 = r3.keySet()     // Catch:{ all -> 0x02e3 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x02e3 }
        L_0x0141:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02e3 }
            if (r0 == 0) goto L_0x017a
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x02e3 }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x02e3 }
            java.lang.Object r2 = r3.get(r0)     // Catch:{ all -> 0x02e3 }
            X.37V r2 = (X.AnonymousClass37V) r2     // Catch:{ all -> 0x02e3 }
            if (r2 == 0) goto L_0x0141
            int r0 = r2.A03()     // Catch:{ all -> 0x02e3 }
            if (r0 == r8) goto L_0x016c
            java.io.File r1 = X.AnonymousClass37V.A03(r4, r2)     // Catch:{ all -> 0x02e3 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x02e3 }
            if (r0 == 0) goto L_0x0168
            r1.delete()     // Catch:{ all -> 0x02e3 }
        L_0x0168:
            r7.add(r2)     // Catch:{ all -> 0x02e3 }
            goto L_0x0141
        L_0x016c:
            java.io.File r1 = X.AnonymousClass37V.A03(r4, r2)     // Catch:{ all -> 0x02e3 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x02e3 }
            if (r0 == 0) goto L_0x0141
            r6.add(r1)     // Catch:{ all -> 0x02e3 }
            goto L_0x0141
        L_0x017a:
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x02e3 }
        L_0x017e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02e3 }
            if (r0 == 0) goto L_0x0192
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x02e3 }
            X.37V r0 = (X.AnonymousClass37V) r0     // Catch:{ all -> 0x02e3 }
            X.277 r0 = r0.A05     // Catch:{ all -> 0x02e3 }
            X.0rv r0 = r0.A03     // Catch:{ all -> 0x02e3 }
            r3.remove(r0)     // Catch:{ all -> 0x02e3 }
            goto L_0x017e
        L_0x0192:
            monitor-exit(r3)     // Catch:{ all -> 0x02e3 }
            java.io.File r1 = r4.getCacheDir()
            java.lang.String r2 = "ProfilePictureTemp"
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            r0.mkdirs()
            java.io.File[] r5 = r0.listFiles()
            if (r5 == 0) goto L_0x01b9
            int r4 = r5.length
            r3 = 0
        L_0x01a9:
            if (r3 >= r4) goto L_0x01b9
            r1 = r5[r3]
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x01b6
            r1.delete()
        L_0x01b6:
            int r3 = r3 + 1
            goto L_0x01a9
        L_0x01b9:
            X.15y r1 = r12.A0A
            X.0tz r0 = r12.A06
            android.content.Context r4 = r0.A00
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.HashMap r3 = r1.A0A
            monitor-enter(r3)
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x02e0 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x02e0 }
        L_0x01d4:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x02e0 }
            if (r0 == 0) goto L_0x021d
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x02e0 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x02e0 }
            java.lang.Object r1 = r7.getValue()     // Catch:{ all -> 0x02e0 }
            X.278 r1 = (X.AnonymousClass278) r1     // Catch:{ all -> 0x02e0 }
            if (r1 == 0) goto L_0x01d4
            boolean r0 = r1.A08     // Catch:{ all -> 0x02e0 }
            if (r0 != 0) goto L_0x0209
            X.277 r0 = r1.A03     // Catch:{ all -> 0x02e0 }
            java.net.URL r1 = r0.A05     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = r0.A04     // Catch:{ all -> 0x02e0 }
            java.io.File r1 = X.C219215y.A00(r4, r0, r1)     // Catch:{ all -> 0x02e0 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x02e0 }
            if (r0 == 0) goto L_0x01ff
            r1.delete()     // Catch:{ all -> 0x02e0 }
        L_0x01ff:
            java.lang.Object r0 = r7.getKey()     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x02e0 }
            r6.add(r0)     // Catch:{ all -> 0x02e0 }
            goto L_0x01d4
        L_0x0209:
            X.277 r0 = r1.A03     // Catch:{ all -> 0x02e0 }
            java.net.URL r1 = r0.A05     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = r0.A04     // Catch:{ all -> 0x02e0 }
            java.io.File r1 = X.C219215y.A00(r4, r0, r1)     // Catch:{ all -> 0x02e0 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x02e0 }
            if (r0 == 0) goto L_0x01d4
            r5.add(r1)     // Catch:{ all -> 0x02e0 }
            goto L_0x01d4
        L_0x021d:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x02e0 }
        L_0x0221:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02e0 }
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x02e0 }
            r3.remove(r0)     // Catch:{ all -> 0x02e0 }
            goto L_0x0221
        L_0x0231:
            monitor-exit(r3)     // Catch:{ all -> 0x02e0 }
            java.io.File r1 = r4.getCacheDir()
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            r0.mkdirs()
            java.io.File[] r4 = r0.listFiles()
            if (r4 == 0) goto L_0x0256
            int r3 = r4.length
            r2 = 0
        L_0x0246:
            if (r2 >= r3) goto L_0x0256
            r1 = r4[r2]
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L_0x0253
            X.AnonymousClass1XI.A0N(r1)
        L_0x0253:
            int r2 = r2 + 1
            goto L_0x0246
        L_0x0256:
            X.1OL r2 = r12.A01
            android.content.SharedPreferences r0 = r2.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "start_video_call_no_preview"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "enable_telecom_framework_caller"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "call_enable_caller_message_buffer"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "call_enable_callee_message_buffer"
            android.content.SharedPreferences$Editor r3 = r1.remove(r0)
            android.content.SharedPreferences r0 = r2.A01()
            java.util.Map r0 = r0.getAll()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0289:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02a2
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "active_joinable_call"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0289
            android.content.SharedPreferences$Editor r3 = r3.remove(r1)
            goto L_0x0289
        L_0x02a2:
            r3.apply()
            X.1OK r0 = r12.A02
            X.0tz r0 = r0.A03
            android.content.Context r0 = r0.A00
            java.io.File r0 = X.C30341cC.A08(r0)
            if (r0 == 0) goto L_0x02df
            java.io.File[] r7 = r0.listFiles()
            if (r7 == 0) goto L_0x02df
            long r9 = java.lang.System.currentTimeMillis()
            int r6 = r7.length
            r5 = 0
        L_0x02bd:
            if (r5 >= r6) goto L_0x02df
            r8 = r7[r5]
            long r0 = r8.lastModified()
            long r3 = r9 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            long r1 = r2.toMillis(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02d9
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02dc
        L_0x02d9:
            X.AnonymousClass1XI.A0O(r8)
        L_0x02dc:
            int r5 = r5 + 1
            goto L_0x02bd
        L_0x02df:
            return
        L_0x02e0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02e0 }
            throw r0
        L_0x02e3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02e3 }
            throw r0
        L_0x02e6:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x02ea }
        L_0x02ea:
            throw r0     // Catch:{ all -> 0x02eb }
        L_0x02eb:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x02ef }
        L_0x02ef:
            throw r0
        L_0x02f0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x02f3:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OI.APJ():void");
    }

    public void APK() {
        this.A0D.Acl(new RunnableRunnableShape10S0100000_I0_9((Object) this, 15));
        C26331Nh r4 = this.A0B;
        if (r4.A08.A0E(C16620tM.A02, 394)) {
            C75933sx r3 = new C75933sx();
            AnonymousClass00F r2 = r3.samplingRate;
            if (r2.A00()) {
                r4.A0B.Acl(new RunnableRunnableShape2S0300000_I0_2(r4, r3, r2, 15));
            }
        }
        C26321Ng r32 = this.A0C;
        Log.i("storage-usage-prefetcher/prefetch storage data");
        r32.A05.Acl(new RunnableRunnableShape15S0100000_I0_14(r32, 26));
    }
}
