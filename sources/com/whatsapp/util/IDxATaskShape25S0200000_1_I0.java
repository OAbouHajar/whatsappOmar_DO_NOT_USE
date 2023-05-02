package com.whatsapp.util;

import X.AnonymousClass00B;
import X.AnonymousClass1BP;
import X.AnonymousClass4QG;
import X.C16690tT;
import X.C16870tm;
import X.C207111h;
import X.C27561Sf;
import X.C30901d9;

public class IDxATaskShape25S0200000_1_I0 extends C16690tT {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxATaskShape25S0200000_1_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x02dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x02e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x03af */
    /* JADX WARNING: Missing exception handler attribute for start block: B:181:0x03dc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:186:0x03e1 */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x036d A[ADDED_TO_REGION, Catch:{ all -> 0x03ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03cf A[SYNTHETIC, Splitter:B:173:0x03cf] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:186:0x03e1=Splitter:B:186:0x03e1, B:175:0x03d2=Splitter:B:175:0x03d2} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r27) {
        /*
            r26 = this;
            r7 = r26
            int r0 = r7.A02
            java.lang.Object r3 = r7.A00
            if (r0 == 0) goto L_0x001d
            X.1Sf r3 = (X.C27561Sf) r3
            X.0zG r2 = r3.A0M
            X.0ua r1 = r3.A05
            java.lang.Object r0 = r7.A01
            X.1d9 r0 = (X.C30901d9) r0
            double r3 = r0.A00
            double r5 = r0.A01
            r7 = 15
            byte[] r0 = X.AnonymousClass2K4.A03(r1, r2, r3, r5, r7)
            return r0
        L_0x001d:
            X.1BP r3 = (X.AnonymousClass1BP) r3
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            X.013 r2 = r3.A04
            java.util.Locale r0 = X.C13690nt.A0m(r2)
            java.lang.String r1 = X.AnonymousClass1WH.A04(r0)
            java.util.Locale r0 = X.C13690nt.A0m(r2)
            java.lang.String r4 = X.AnonymousClass1WH.A02(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x003f
            java.lang.String r4 = r2.A05()
        L_0x003f:
            X.0wp r0 = r3.A09
            java.util.TreeSet r0 = r0.A01()
            r0.add(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x004c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = X.AnonymousClass000.A0m(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r1)
            r5.add(r0)
            goto L_0x004c
        L_0x0067:
            java.lang.String r0 = ","
            java.lang.String r4 = android.text.TextUtils.join(r0, r5)
            X.4aH r2 = r3.A00()
            java.lang.String r0 = "dictionaryloader/prepare/cache language: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = ", last attempted language: "
            r1.append(r0)
            java.lang.String r0 = r2.A05
            r1.append(r0)
            java.lang.String r0 = ", request languages: "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0t3 r9 = r3.A03
            long r18 = r9.A00()
            X.11h r6 = r3.A08
            int r0 = r6.getCount()
            r10 = 1
            r8 = 0
            boolean r5 = X.AnonymousClass000.A1Q(r0)
            java.lang.String r0 = r2.A03
            boolean r17 = r4.equals(r0)
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r17 == 0) goto L_0x0113
            long r0 = r2.A00
            long r13 = r18 - r0
            r11 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0113
        L_0x00ba:
            X.4RE r11 = new X.4RE
            r11.<init>(r3, r8, r5)
        L_0x00bf:
            boolean r5 = r11.A00
            r12 = 0
            r21 = 1
            if (r5 == 0) goto L_0x00da
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x00da
            if (r17 == 0) goto L_0x00da
            java.lang.String r0 = "dictionaryloader/prepare/publish progress to show search"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean[] r1 = new java.lang.Boolean[r10]
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1[r8] = r0
            r7.A07(r1)
        L_0x00da:
            boolean r0 = r11.A01
            r3.A01 = r0
            if (r5 == 0) goto L_0x041f
            X.0wP r0 = r3.A02
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x041f
            X.3sO r1 = new X.3sO
            r1.<init>()
            r1.A05 = r4
            java.lang.String r0 = r2.A03
            r1.A04 = r0
            long r7 = r2.A01
            r10 = 0
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00fc
            r12 = 1
        L_0x00fc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r1.A01 = r0
            long r18 = r18 - r7
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r1.A03 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A00 = r0
            long r22 = r9.A00()
            goto L_0x012a
        L_0x0113:
            long r0 = r2.A01
            long r11 = r18 - r0
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0124
            java.lang.String r0 = r2.A05
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0124
            goto L_0x00ba
        L_0x0124:
            X.4RE r11 = new X.4RE
            r11.<init>(r3, r10, r5)
            goto L_0x00bf
        L_0x012a:
            X.1BT r12 = r3.A05     // Catch:{ IOException -> 0x03e7 }
            java.lang.String r7 = r2.A04     // Catch:{ IOException -> 0x03e7 }
            java.lang.String r0 = "emojidictionarynetworkclient/connect/language="
            java.lang.String r0 = X.C13680ns.A0h(r0, r4)     // Catch:{ IOException -> 0x03e7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x03e7 }
            r20 = 0
            java.lang.String r0 = "https://static.whatsapp.net/emoji?lgs="
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x03e7 }
            r5.append(r4)     // Catch:{ IOException -> 0x03e7 }
            java.lang.String r0 = "&top=1"
            java.lang.String r15 = X.AnonymousClass000.A0h(r0, r5)     // Catch:{ IOException -> 0x03e7 }
            r0 = 8
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x03e2 }
            X.0zG r5 = r12.A04     // Catch:{ all -> 0x03e2 }
            X.0vS r0 = r12.A05     // Catch:{ all -> 0x03e2 }
            r18 = r20
            r13 = r5
            r14 = r0
            r16 = r20
            r17 = r7
            X.1pl r5 = r13.A7K(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x03e2 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ IOException -> 0x03e7 }
            int r7 = r5.A6O()     // Catch:{ all -> 0x03dd }
            java.lang.Long r0 = X.C13690nt.A0W(r7)     // Catch:{ all -> 0x03dd }
            r1.A02 = r0     // Catch:{ all -> 0x03dd }
            r0 = 304(0x130, float:4.26E-43)
            if (r7 != r0) goto L_0x0188
            java.lang.String r0 = "dictionaryloader/prepare-from-network/not_modified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03dd }
            X.42p r18 = X.C801142p.UPTO_DATE     // Catch:{ all -> 0x03dd }
            java.lang.String r6 = r2.A04     // Catch:{ all -> 0x03dd }
            X.4aH r0 = new X.4aH     // Catch:{ all -> 0x03dd }
            r21 = r4
            r17 = r0
            r19 = r6
            r20 = r4
            r24 = r22
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x03dd }
            goto L_0x03d2
        L_0x0188:
            r0 = 404(0x194, float:5.66E-43)
            if (r7 != r0) goto L_0x01c5
            java.lang.String r0 = "dictionaryloader/prepare-from-network/unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03dd }
            r6.A6A()     // Catch:{ Exception -> 0x01a6 }
            X.42p r7 = X.C801142p.LANGUAGE_UNAVAILABLE     // Catch:{ Exception -> 0x01a6 }
            X.4aH r0 = new X.4aH     // Catch:{ Exception -> 0x01a6 }
            r10 = r4
            r13 = r22
            r6 = r0
            r8 = r20
            r9 = r4
            r11 = r22
            r6.<init>(r7, r8, r9, r10, r11, r13)     // Catch:{ Exception -> 0x01a6 }
            goto L_0x03d2
        L_0x01a6:
            r6 = move-exception
            java.lang.String r0 = "dictionaryloader/prepare-from-network/unavailable/clear-fail"
            com.whatsapp.util.Log.i(r0, r6)     // Catch:{ all -> 0x03dd }
            X.42p r18 = X.C801142p.FETCH_ERROR     // Catch:{ all -> 0x03dd }
            java.lang.String r9 = r2.A04     // Catch:{ all -> 0x03dd }
            long r6 = r2.A00     // Catch:{ all -> 0x03dd }
            java.lang.String r8 = r2.A03     // Catch:{ all -> 0x03dd }
            X.4aH r0 = new X.4aH     // Catch:{ all -> 0x03dd }
            r17 = r0
            r19 = r9
            r20 = r4
            r21 = r8
            r24 = r6
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x03dd }
            goto L_0x03d2
        L_0x01c5:
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 == r0) goto L_0x01ef
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "dictionaryloader/prepare-from-network/servererror: "
            java.lang.String r0 = X.C13680ns.A0i(r0, r6, r7)     // Catch:{ all -> 0x03dd }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03dd }
            X.42p r18 = X.C801142p.FETCH_ERROR     // Catch:{ all -> 0x03dd }
            java.lang.String r9 = r2.A04     // Catch:{ all -> 0x03dd }
            long r6 = r2.A00     // Catch:{ all -> 0x03dd }
            java.lang.String r8 = r2.A03     // Catch:{ all -> 0x03dd }
            X.4aH r0 = new X.4aH     // Catch:{ all -> 0x03dd }
            r17 = r0
            r19 = r9
            r20 = r4
            r21 = r8
            r24 = r6
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x03dd }
            goto L_0x03d2
        L_0x01ef:
            X.0ua r7 = r12.A00     // Catch:{ all -> 0x03dd }
            java.lang.Integer r6 = X.C13680ns.A0X()     // Catch:{ all -> 0x03dd }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03dd }
            java.io.InputStream r9 = r5.A9k(r7, r6, r0)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r6 = r5.AHk(r0)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "gzip"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x03dd }
            if (r0 == 0) goto L_0x0213
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x03dd }
            r0.<init>(r9)     // Catch:{ all -> 0x03dd }
            r9 = r0
        L_0x0213:
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x03b0 }
            r6.<init>(r9)     // Catch:{ IOException -> 0x03b0 }
            android.util.JsonReader r19 = new android.util.JsonReader     // Catch:{ IOException -> 0x03b0 }
            r0 = r19
            r0.<init>(r6)     // Catch:{ IOException -> 0x03b0 }
            r19.beginObject()     // Catch:{ all -> 0x03ab }
        L_0x0222:
            r18 = 1
        L_0x0224:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x03ab }
            if (r0 == 0) goto L_0x038d
            java.lang.String r7 = r19.nextName()     // Catch:{ all -> 0x03ab }
            int r6 = r7.hashCode()     // Catch:{ all -> 0x03ab }
            r0 = -265173948(0xfffffffff031c444, float:-2.2006447E29)
            if (r6 == r0) goto L_0x02f4
            r0 = 1518327835(0x5a7fd81b, float:1.80034324E16)
            if (r6 != r0) goto L_0x0375
            java.lang.String r0 = "languages"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x03ab }
            if (r0 == 0) goto L_0x0375
            X.11g r13 = r12.A02     // Catch:{ all -> 0x03ab }
            monitor-enter(r13)     // Catch:{ all -> 0x03ab }
            X.2HR r0 = r13.A03     // Catch:{ IOException | IllegalStateException -> 0x02e3 }
            X.0tf r15 = r0.A02()     // Catch:{ IOException | IllegalStateException -> 0x02e3 }
            X.1cj r17 = r15.A00()     // Catch:{ all -> 0x02de }
            X.0tg r11 = r15.A02     // Catch:{ all -> 0x02d9 }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x02d9 }
            java.lang.String r7 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x02d9 }
            r0 = 0
            r6[r0] = r7     // Catch:{ all -> 0x02d9 }
            java.lang.String r10 = "emoji_search_tag"
            java.lang.String r0 = "type=?"
            r11.A01(r10, r0, r6)     // Catch:{ all -> 0x02d9 }
            r19.beginObject()     // Catch:{ all -> 0x02d9 }
        L_0x0268:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x02cb
            r19.nextName()     // Catch:{ all -> 0x02d9 }
            r19.beginObject()     // Catch:{ all -> 0x02d9 }
        L_0x0274:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x02c7
            java.lang.String r14 = r19.nextName()     // Catch:{ all -> 0x02d9 }
            java.util.HashSet r6 = X.C13680ns.A0o()     // Catch:{ all -> 0x02d9 }
            r19.beginArray()     // Catch:{ all -> 0x02d9 }
        L_0x0285:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x0297
            java.lang.String r0 = r19.nextString()     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = X.AnonymousClass1ZW.A09(r0)     // Catch:{ all -> 0x02d9 }
            r6.add(r0)     // Catch:{ all -> 0x02d9 }
            goto L_0x0285
        L_0x0297:
            r19.endArray()     // Catch:{ all -> 0x02d9 }
            java.util.Iterator r16 = r6.iterator()     // Catch:{ all -> 0x02d9 }
        L_0x029e:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x0274
            java.lang.String r8 = X.AnonymousClass000.A0m(r16)     // Catch:{ all -> 0x02d9 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x02d9 }
            r7.<init>()     // Catch:{ all -> 0x02d9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = "type"
            r7.put(r0, r6)     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = "symbol"
            r7.put(r0, r14)     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = "tag"
            r7.put(r0, r8)     // Catch:{ all -> 0x02d9 }
            r11.A04(r7, r10)     // Catch:{ all -> 0x02d9 }
            goto L_0x029e
        L_0x02c7:
            r19.endObject()     // Catch:{ all -> 0x02d9 }
            goto L_0x0268
        L_0x02cb:
            r19.endObject()     // Catch:{ all -> 0x02d9 }
            r17.A00()     // Catch:{ all -> 0x02d9 }
            r0 = 1
            r17.close()     // Catch:{ all -> 0x02de }
            r15.close()     // Catch:{ IOException | IllegalStateException -> 0x02e3 }
            goto L_0x02f2
        L_0x02d9:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x02dd }
        L_0x02dd:
            throw r0     // Catch:{ all -> 0x02de }
        L_0x02de:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x02e2 }
        L_0x02e2:
            throw r0     // Catch:{ IOException | IllegalStateException -> 0x02e3 }
        L_0x02e3:
            r7 = move-exception
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x038a }
            java.lang.String r0 = "emojidictionarystore/populatedb/failed "
            java.lang.String r0 = X.AnonymousClass000.A0e(r7, r0, r6)     // Catch:{ all -> 0x038a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x038a }
            r0 = 0
        L_0x02f2:
            monitor-exit(r13)     // Catch:{ all -> 0x03ab }
            goto L_0x036b
        L_0x02f4:
            java.lang.String r0 = "fb-top-50"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x03ab }
            if (r0 == 0) goto L_0x0375
            X.11a r7 = r12.A03     // Catch:{ all -> 0x03ab }
            monitor-enter(r7)     // Catch:{ all -> 0x03ab }
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            r19.beginArray()     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
        L_0x0306:
            boolean r0 = r19.hasNext()     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            if (r0 == 0) goto L_0x0314
            java.lang.String r0 = r19.nextString()     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            r8.add(r0)     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            goto L_0x0306
        L_0x0314:
            r19.endArray()     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            r6.<init>()     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
        L_0x0324:
            boolean r0 = r8.hasNext()     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            if (r0 == 0) goto L_0x0339
            java.lang.String r0 = X.AnonymousClass000.A0m(r8)     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            r6.put(r0)     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            X.1pj r0 = X.C37941pz.A00(r0)     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            r10.add(r0)     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            goto L_0x0324
        L_0x0339:
            X.0rz r0 = r7.A02     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            java.lang.String r8 = r6.toString()     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            android.content.SharedPreferences$Editor r6 = r0.A0K()     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            java.lang.String r0 = "top_emojis"
            X.C13680ns.A0y(r6, r0, r8)     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            r7.A00 = r10     // Catch:{ IOException -> 0x0360, IllegalStateException -> 0x034d }
            monitor-exit(r7)     // Catch:{ all -> 0x03ab }
            goto L_0x036a
        L_0x034d:
            r11 = move-exception
            X.0so r10 = r7.A01     // Catch:{ all -> 0x0387 }
            java.lang.String r8 = "topemojis/populate error"
            r6 = 0
            r0 = r20
            r10.AcB(r8, r0, r6)     // Catch:{ all -> 0x0387 }
            java.lang.String r0 = "topemojisstore/populate-top-emojis/failed"
            com.whatsapp.util.Log.e(r0, r11)     // Catch:{ all -> 0x0387 }
            goto L_0x0367
        L_0x0360:
            r6 = move-exception
            java.lang.String r0 = "topemojisstore/populate-top-emojis/failed"
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x0387 }
        L_0x0367:
            monitor-exit(r7)     // Catch:{ all -> 0x03ab }
            r0 = 0
            goto L_0x036b
        L_0x036a:
            r0 = 1
        L_0x036b:
            if (r18 == 0) goto L_0x0371
            if (r0 == 0) goto L_0x0371
            goto L_0x0222
        L_0x0371:
            r18 = 0
            goto L_0x0224
        L_0x0375:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = "emojidictionarynetworkclient/handle-network-response/unhandled field: "
            r6.append(r0)     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r6)     // Catch:{ all -> 0x03ab }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03ab }
            goto L_0x0224
        L_0x0387:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x03ab }
            goto L_0x038c
        L_0x038a:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x03ab }
        L_0x038c:
            throw r0     // Catch:{ all -> 0x03ab }
        L_0x038d:
            r19.endObject()     // Catch:{ all -> 0x03ab }
            r19.close()     // Catch:{ IOException -> 0x03b0 }
            if (r18 == 0) goto L_0x03b6
            java.lang.String r0 = "ETag"
            java.lang.String r19 = r5.AHk(r0)     // Catch:{ all -> 0x03d6 }
            X.42p r18 = X.C801142p.UPTO_DATE     // Catch:{ all -> 0x03d6 }
            X.4aH r0 = new X.4aH     // Catch:{ all -> 0x03d6 }
            r21 = r4
            r24 = r22
            r17 = r0
            r20 = r4
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x03d6 }
            goto L_0x03cd
        L_0x03ab:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x03af }
        L_0x03af:
            throw r0     // Catch:{ IOException -> 0x03b0 }
        L_0x03b0:
            r6 = move-exception
            java.lang.String r0 = "emojidictionarynetworkclient/handle-network-response/failed"
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x03d6 }
        L_0x03b6:
            X.42p r18 = X.C801142p.FETCH_ERROR     // Catch:{ all -> 0x03d6 }
            java.lang.String r10 = r2.A04     // Catch:{ all -> 0x03d6 }
            long r6 = r2.A00     // Catch:{ all -> 0x03d6 }
            java.lang.String r8 = r2.A03     // Catch:{ all -> 0x03d6 }
            X.4aH r0 = new X.4aH     // Catch:{ all -> 0x03d6 }
            r17 = r0
            r19 = r10
            r20 = r4
            r21 = r8
            r24 = r6
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x03d6 }
        L_0x03cd:
            if (r9 == 0) goto L_0x03d2
            r9.close()     // Catch:{ all -> 0x03dd }
        L_0x03d2:
            r5.close()     // Catch:{ IOException -> 0x03e7 }
            goto L_0x0404
        L_0x03d6:
            r0 = move-exception
            if (r9 == 0) goto L_0x03dc
            r9.close()     // Catch:{ all -> 0x03dc }
        L_0x03dc:
            throw r0     // Catch:{ all -> 0x03dd }
        L_0x03dd:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x03e1 }
        L_0x03e1:
            throw r0     // Catch:{ IOException -> 0x03e7 }
        L_0x03e2:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ IOException -> 0x03e7 }
            throw r0     // Catch:{ IOException -> 0x03e7 }
        L_0x03e7:
            r5 = move-exception
            java.lang.String r0 = "dictionaryloader/prepare-from-network/connecterror"
            com.whatsapp.util.Log.e(r0, r5)
            X.42p r18 = X.C801142p.NETWORK_ERROR
            java.lang.String r7 = r2.A04
            long r5 = r2.A00
            java.lang.String r2 = r2.A03
            X.4aH r0 = new X.4aH
            r17 = r0
            r19 = r7
            r20 = r4
            r21 = r2
            r24 = r5
            r17.<init>(r18, r19, r20, r21, r22, r24)
        L_0x0404:
            X.42p r2 = r0.A02
            r3.A01(r0)
            java.lang.String r0 = r0.A03
            r1.A07 = r0
            java.lang.String r0 = r2.fieldStatString
            r1.A06 = r0
            boolean r0 = r2.fetchSuccessful
            if (r0 == 0) goto L_0x0419
            boolean r0 = r2.gotDictionary
            r3.A01 = r0
        L_0x0419:
            X.0t9 r0 = r3.A07
            r0.A06(r1)
            goto L_0x0439
        L_0x041f:
            java.lang.String r0 = "dictionaryloader/prepare/skip network fetch, want to fetch: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r5)
            java.lang.String r0 = ", network available: "
            r1.append(r0)
            X.0wP r0 = r3.A02
            boolean r0 = r0.A0A()
            r1.append(r0)
            X.C13680ns.A1V(r1)
        L_0x0439:
            boolean r0 = r3.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.IDxATaskShape25S0200000_1_I0.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        if (this.A02 != 0) {
            byte[] bArr = (byte[]) obj;
            C30901d9 r2 = (C30901d9) this.A01;
            r2.A02 = 2;
            if (bArr != null) {
                C16870tm A0F = r2.A0F();
                AnonymousClass00B.A06(A0F);
                A0F.A02(bArr);
                ((C27561Sf) this.A00).A0E.A0e(r2, -1);
                return;
            }
            ((C27561Sf) this.A00).A0H.A08(r2, -1);
            return;
        }
        C207111h r0 = ((AnonymousClass1BP) this.A00).A08;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        r0.Ae3(booleanValue);
        ((AnonymousClass4QG) this.A01).A00(booleanValue);
    }
}
