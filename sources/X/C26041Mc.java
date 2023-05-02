package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1Mc  reason: invalid class name and case insensitive filesystem */
public class C26041Mc {
    public int A00 = 3;
    public long A01 = 0;
    public long A02 = 0;
    public AnonymousClass20V A03;
    public final C16300so A04;
    public final C17130ua A05;
    public final C16440t3 A06;
    public final C16980tz A07;
    public final C17120uZ A08;
    public final C15860rz A09;
    public final AnonymousClass013 A0A;
    public final C14710pd A0B;
    public final C16490t9 A0C;
    public final C19950zG A0D;
    public final C213013o A0E;
    public final C17670vS A0F;
    public final C16320sq A0G;
    public final HashMap A0H = new HashMap();

    public C26041Mc(C16300so r3, C17130ua r4, C16440t3 r5, C16980tz r6, C17120uZ r7, C15860rz r8, AnonymousClass013 r9, C14710pd r10, C16490t9 r11, C19950zG r12, C213013o r13, C17670vS r14, C16320sq r15) {
        this.A07 = r6;
        this.A06 = r5;
        this.A0B = r10;
        this.A04 = r3;
        this.A0G = r15;
        this.A05 = r4;
        this.A0C = r11;
        this.A0A = r9;
        this.A0F = r14;
        this.A0D = r12;
        this.A09 = r8;
        this.A0E = r13;
        this.A08 = r7;
    }

    public final synchronized int A00() {
        return this.A00;
    }

    public final synchronized int A01(int i2) {
        if (this.A00 == 0 && i2 == 0) {
            Log.e("ManifestManager/setState/State change ERROR - loading to loading!");
            i2 = this.A00;
        } else {
            this.A00 = i2;
        }
        return i2;
    }

    public final synchronized long A02() {
        long j2;
        j2 = this.A01;
        if (j2 == 0) {
            j2 = ((SharedPreferences) this.A09.A01.get()).getLong("downloadable_manifest_last_fetched_time_millis", 0);
            this.A01 = j2;
        }
        return j2;
    }

    public final synchronized void A03(long j2) {
        this.A01 = j2;
        this.A09.A0K().putLong("downloadable_manifest_last_fetched_time_millis", j2).apply();
    }

    public final synchronized void A04(AnonymousClass20W r4, String str) {
        int i2 = this.A00;
        if (i2 == 0) {
            HashMap hashMap = this.A0H;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList == null || arrayList.isEmpty()) {
                hashMap.put(str, new ArrayList(Collections.singletonList(r4)));
            } else {
                arrayList.add(r4);
                hashMap.put(str, arrayList);
            }
        } else if (i2 == 5) {
            AnonymousClass20V r0 = this.A03;
            AnonymousClass00B.A06(r0);
            r4.A01((AnonymousClass20T) r0.A01.get(str));
        } else if (i2 == 1) {
            r4.A00();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("ManifestManager/registerCallback/Invalid state encountered when trying to register category : ");
            sb.append(str);
            sb.append(" state : ");
            sb.append(i2 != 2 ? i2 != 3 ? "READ_NEEDED" : "NO_MANIFEST" : "MANIFEST_STALE");
            Log.e(sb.toString());
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:101:0x01c2=Splitter:B:101:0x01c2, B:96:0x01ba=Splitter:B:96:0x01ba} */
    public final void A05(X.AnonymousClass20T r22, X.C34531kQ r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            X.AnonymousClass00B.A00()
            int r2 = r0.A00()
            r3 = 0
            r4 = 1
            r1 = 0
            if (r2 != 0) goto L_0x000f
            r1 = 1
        L_0x000f:
            X.AnonymousClass00B.A0G(r1)
            r20 = r24
            r1 = r24 ^ 1
            r14 = 0
            r17 = r22
            if (r1 != 0) goto L_0x01ca
            if (r22 != 0) goto L_0x006f
            r9 = r14
        L_0x001e:
            X.AnonymousClass00B.A00()
            int r2 = r0.A00()
            r10 = 1
            r1 = 0
            if (r2 != 0) goto L_0x002a
            r1 = 1
        L_0x002a:
            X.AnonymousClass00B.A0G(r1)
            X.013 r1 = r0.A0A
            android.content.Context r1 = r1.A00
            java.util.Locale r1 = X.AnonymousClass013.A00(r1)
            java.lang.String r6 = X.AnonymousClass1WH.A04(r1)
            X.0pd r5 = r0.A0B
            X.13o r1 = r0.A0E
            java.lang.String r2 = "manifest"
            android.net.Uri$Builder r5 = X.AnonymousClass20U.A00(r5, r1)
            java.lang.String r1 = "category"
            r5.appendQueryParameter(r1, r2)
            if (r6 == 0) goto L_0x004f
            java.lang.String r1 = "locale"
            r5.appendQueryParameter(r1, r6)
        L_0x004f:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x005a
            java.lang.String r1 = "existing_id"
            r5.appendQueryParameter(r1, r9)
        L_0x005a:
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 != 0) goto L_0x0066
            java.lang.String r1 = "version"
            r5.appendQueryParameter(r1, r14)
        L_0x0066:
            android.net.Uri r1 = r5.build()
            java.lang.String r13 = r1.toString()
            goto L_0x0074
        L_0x006f:
            java.lang.String r9 = r17.A02()
            goto L_0x001e
        L_0x0074:
            X.0zG r11 = r0.A0D     // Catch:{ IOException -> 0x01c3, JSONException -> 0x01cd }
            X.0vS r12 = r0.A0F     // Catch:{ IOException -> 0x01c3, JSONException -> 0x01cd }
            r16 = r14
            r15 = r14
            X.1pl r5 = r11.A7K(r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x01c3, JSONException -> 0x01cd }
            int r7 = r5.A6O()     // Catch:{ all -> 0x01be }
            r1 = 400(0x190, float:5.6E-43)
            if (r7 < r1) goto L_0x00a8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r2.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r1 = "ManifestManager/fetch/Error, code="
            r2.append(r1)     // Catch:{ all -> 0x01be }
            int r1 = r5.A6O()     // Catch:{ all -> 0x01be }
            r2.append(r1)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01be }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x01be }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01be }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01be }
            r2.<init>(r1, r14)     // Catch:{ all -> 0x01be }
            goto L_0x01ba
        L_0x00a8:
            r5.A6O()     // Catch:{ all -> 0x01be }
            java.lang.String r1 = "idhash"
            java.lang.String r8 = r5.AHk(r1)     // Catch:{ all -> 0x01be }
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01be }
            if (r1 != 0) goto L_0x01ae
            boolean r1 = X.AnonymousClass20U.A03(r8)     // Catch:{ all -> 0x01be }
            if (r1 == 0) goto L_0x01ae
            int r7 = r5.A6O()     // Catch:{ all -> 0x01be }
            r1 = 304(0x130, float:4.26E-43)
            if (r7 != r1) goto L_0x00df
            boolean r1 = r8.equals(r9)     // Catch:{ all -> 0x01be }
            X.AnonymousClass00B.A0G(r1)     // Catch:{ all -> 0x01be }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x01be }
            r12 = r14
            X.20T r7 = new X.20T     // Catch:{ all -> 0x01be }
            r11 = r14
            r10 = r6
            r9 = r8
            r8 = r2
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01be }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01be }
            r2.<init>(r1, r7)     // Catch:{ all -> 0x01be }
            goto L_0x01ba
        L_0x00df:
            boolean r1 = r8.equals(r9)     // Catch:{ all -> 0x01be }
            if (r1 == 0) goto L_0x00e6
            r10 = 0
        L_0x00e6:
            X.AnonymousClass00B.A0G(r10)     // Catch:{ all -> 0x01be }
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x01be }
            int r7 = r0.A00()     // Catch:{ all -> 0x01be }
            r1 = 0
            if (r7 != 0) goto L_0x00f4
            r1 = 1
        L_0x00f4:
            X.AnonymousClass00B.A0G(r1)     // Catch:{ all -> 0x01be }
            X.0ua r9 = r0.A05     // Catch:{ IOException -> 0x019b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x019b }
            r1 = 22
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x019b }
            java.io.InputStream r10 = r5.A9k(r9, r7, r1)     // Catch:{ IOException -> 0x019b }
            X.0tz r1 = r0.A07     // Catch:{ all -> 0x0194 }
            android.content.Context r9 = r1.A00     // Catch:{ all -> 0x0194 }
            java.io.File r11 = r9.getFilesDir()     // Catch:{ all -> 0x0194 }
            java.lang.String r1 = "downloadable"
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0194 }
            r7.<init>(r11, r1)     // Catch:{ all -> 0x0194 }
            boolean r1 = r7.exists()     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x0128
            boolean r1 = r7.mkdirs()     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x0128
            java.lang.String r1 = "ManifestManager/store/Could not make file subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0194 }
            goto L_0x0144
        L_0x0128:
            java.io.File r9 = r9.getFilesDir()     // Catch:{ all -> 0x0194 }
            java.lang.String r1 = "downloadable/manifest.json"
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0194 }
            r7.<init>(r9, r1)     // Catch:{ all -> 0x0194 }
            boolean r1 = r7.exists()     // Catch:{ all -> 0x0194 }
            if (r1 == 0) goto L_0x014a
            boolean r1 = r7.delete()     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x014a
            java.lang.String r1 = "ManifestManager/store/Could not delete existing manifest!"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0194 }
        L_0x0144:
            if (r10 == 0) goto L_0x01a1
            r10.close()     // Catch:{ IOException -> 0x019b }
            goto L_0x01a1
        L_0x014a:
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r1]     // Catch:{ all -> 0x0194 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x0194 }
            r9.<init>(r7)     // Catch:{ all -> 0x0194 }
        L_0x0153:
            int r7 = r10.read(r11)     // Catch:{ all -> 0x018f }
            r1 = -1
            if (r7 == r1) goto L_0x015e
            r9.write(r11, r3, r7)     // Catch:{ all -> 0x018f }
            goto L_0x0153
        L_0x015e:
            r9.close()     // Catch:{ all -> 0x0194 }
            r10.close()     // Catch:{ IOException -> 0x019b }
            X.0rz r7 = r0.A09     // Catch:{ all -> 0x01be }
            r13 = r14
            X.20T r9 = new X.20T     // Catch:{ all -> 0x01be }
            r10 = r2
            r11 = r8
            r12 = r6
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r9.A03()     // Catch:{ all -> 0x01be }
            r7.A18(r2, r1)     // Catch:{ all -> 0x01be }
            monitor-enter(r0)     // Catch:{ all -> 0x01be }
            r0.A03 = r14     // Catch:{ all -> 0x018c }
            monitor-exit(r0)     // Catch:{ all -> 0x01be }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x01be }
            r12 = r14
            X.20T r7 = new X.20T     // Catch:{ all -> 0x01be }
            r11 = r14
            r10 = r6
            r9 = r8
            r8 = r2
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01be }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01be }
            r2.<init>(r1, r7)     // Catch:{ all -> 0x01be }
            goto L_0x01ba
        L_0x018c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01be }
            throw r1     // Catch:{ all -> 0x01be }
        L_0x018f:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0193 }
        L_0x0193:
            throw r1     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r1 = move-exception
            if (r10 == 0) goto L_0x019a
            r10.close()     // Catch:{ all -> 0x019a }
        L_0x019a:
            throw r1     // Catch:{ IOException -> 0x019b }
        L_0x019b:
            r2 = move-exception
            java.lang.String r1 = "ManifestManager/store/Failed : "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x01be }
        L_0x01a1:
            java.lang.String r1 = "ManifestManager/fetch/Store failed for MANIFEST"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x01be }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01be }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01be }
            r2.<init>(r1, r14)     // Catch:{ all -> 0x01be }
            goto L_0x01ba
        L_0x01ae:
            java.lang.String r1 = "ManifestManager/fetch/Improper manifest hash from server!"
            X.AnonymousClass20U.A02(r1)     // Catch:{ all -> 0x01be }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01be }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01be }
            r2.<init>(r1, r14)     // Catch:{ all -> 0x01be }
        L_0x01ba:
            r5.close()     // Catch:{ IOException -> 0x01c3, JSONException -> 0x01cd }
            goto L_0x01ea
        L_0x01be:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x01c2 }
        L_0x01c2:
            throw r1     // Catch:{ IOException -> 0x01c3, JSONException -> 0x01cd }
        L_0x01c3:
            r2 = move-exception
            java.lang.String r1 = "ManifestManager/fetch/Failed! "
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x01e3
        L_0x01ca:
            r5 = r17
            goto L_0x0201
        L_0x01cd:
            r5 = move-exception
            java.lang.String r1 = "ManifestManager/fetch/json exception while fetching manifest."
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r5.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            X.AnonymousClass20U.A02(r1)
        L_0x01e3:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r14)
        L_0x01ea:
            java.lang.Object r1 = r2.first
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r5 = r2.second
            X.20T r5 = (X.AnonymousClass20T) r5
            if (r1 == 0) goto L_0x03b8
            X.0t3 r1 = r0.A06
            long r1 = r1.A00()
            r0.A03(r1)
        L_0x0201:
            X.AnonymousClass00B.A06(r5)
            java.lang.String r1 = r5.A00
            X.AnonymousClass00B.A06(r1)
            X.0tz r1 = r0.A07
            android.content.Context r1 = r1.A00
            java.io.File r2 = r1.getFilesDir()
            java.lang.String r1 = "downloadable/manifest.json"
            java.io.File r6 = new java.io.File
            r6.<init>(r2, r1)
            X.AnonymousClass00B.A00()
            int r2 = r0.A00()
            r1 = 0
            if (r2 != 0) goto L_0x0223
            r1 = 1
        L_0x0223:
            X.AnonymousClass00B.A0G(r1)
            X.20V r1 = r0.A03
            if (r1 != 0) goto L_0x03f4
            boolean r1 = r6.exists()
            if (r1 != 0) goto L_0x0265
            java.lang.String r1 = "ManifestManager/read/Manifest file doesn't exist, but read called!"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0235:
            java.lang.String r1 = "ManifestManager/fetchWithBackoff/Read failed."
        L_0x0237:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            r18 = r23
            long r1 = r18.A01()
            long r8 = r18.A00()
            r6 = 17
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x03bc
            java.lang.String r1 = "ManifestManager/fetchWithBackoff/Load failed on all retries!"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.0t3 r1 = r0.A06
            long r1 = r1.A00()
            r0.A02 = r1
            X.0rz r2 = r0.A09
            java.lang.String r1 = "manifest"
            r2.A18(r1, r14)
            r0.A01(r4)
            r0.A06(r14, r3)
            return
        L_0x0265:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x03b0 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x03b0 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x03b0 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x03b0 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x03b0 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x03b0 }
            r2.beginObject()     // Catch:{ all -> 0x03ab }
        L_0x027c:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x03ab }
            if (r1 == 0) goto L_0x0398
            java.lang.String r9 = r2.nextName()     // Catch:{ all -> 0x03ab }
            int r6 = r9.hashCode()     // Catch:{ all -> 0x03ab }
            r1 = 1296516636(0x4d47461c, float:2.08953792E8)
            if (r6 != r1) goto L_0x0298
            java.lang.String r1 = "categories"
            boolean r6 = r9.equals(r1)     // Catch:{ all -> 0x03ab }
            r1 = 0
            if (r6 != 0) goto L_0x0299
        L_0x0298:
            r1 = -1
        L_0x0299:
            java.lang.String r8 = "ManifestManager/read/Skipping unknown field "
            if (r1 == 0) goto L_0x02b8
            r2.skipValue()     // Catch:{ all -> 0x03ab }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ab }
            r6.<init>()     // Catch:{ all -> 0x03ab }
            r6.append(r8)     // Catch:{ all -> 0x03ab }
            r6.append(r9)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = " in MANIFEST"
            r6.append(r1)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x03ab }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x03ab }
            goto L_0x027c
        L_0x02b8:
            r2.beginObject()     // Catch:{ all -> 0x03ab }
        L_0x02bb:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x03ab }
            if (r1 == 0) goto L_0x036d
            java.lang.String r12 = r2.nextName()     // Catch:{ all -> 0x03ab }
            r2.beginObject()     // Catch:{ all -> 0x03ab }
            r13 = 0
            r15 = r14
            r6 = r14
        L_0x02cb:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x03ab }
            if (r1 == 0) goto L_0x0356
            java.lang.String r9 = r2.nextName()     // Catch:{ all -> 0x03ab }
            int r1 = r9.hashCode()     // Catch:{ all -> 0x03ab }
            switch(r1) {
                case 116079: goto L_0x02fa;
                case 235331633: goto L_0x0308;
                case 1652450738: goto L_0x033c;
                case 1950472728: goto L_0x0349;
                default: goto L_0x02dc;
            }     // Catch:{ all -> 0x03ab }
        L_0x02dc:
            r2.skipValue()     // Catch:{ all -> 0x03ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ab }
            r1.<init>()     // Catch:{ all -> 0x03ab }
            r1.append(r8)     // Catch:{ all -> 0x03ab }
            r1.append(r9)     // Catch:{ all -> 0x03ab }
            java.lang.String r9 = " while reading category "
            r1.append(r9)     // Catch:{ all -> 0x03ab }
            r1.append(r12)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03ab }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x03ab }
            goto L_0x02cb
        L_0x02fa:
            java.lang.String r1 = "url"
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x03ab }
            if (r1 == 0) goto L_0x02dc
            java.lang.String r15 = r2.nextString()     // Catch:{ all -> 0x03ab }
            goto L_0x02cb
        L_0x0308:
            java.lang.String r1 = "bundles"
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x03ab }
            if (r1 == 0) goto L_0x02dc
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x03ab }
            r6.<init>()     // Catch:{ all -> 0x03ab }
            r2.beginArray()     // Catch:{ all -> 0x03ab }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03ab }
        L_0x031c:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x03ab }
            if (r1 == 0) goto L_0x0338
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = r2.nextString()     // Catch:{ all -> 0x03ab }
            r6.put(r9, r1)     // Catch:{ all -> 0x03ab }
            int r1 = r10.intValue()     // Catch:{ all -> 0x03ab }
            int r1 = r1 + 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03ab }
            goto L_0x031c
        L_0x0338:
            r2.endArray()     // Catch:{ all -> 0x03ab }
            goto L_0x02cb
        L_0x033c:
            java.lang.String r1 = "id_hash"
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x03ab }
            if (r1 == 0) goto L_0x02dc
            java.lang.String r13 = r2.nextString()     // Catch:{ all -> 0x03ab }
            goto L_0x02cb
        L_0x0349:
            java.lang.String r1 = "default_locale"
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x03ab }
            if (r1 == 0) goto L_0x02dc
            r2.nextString()     // Catch:{ all -> 0x03ab }
            goto L_0x02cb
        L_0x0356:
            r2.endObject()     // Catch:{ all -> 0x03ab }
            if (r13 == 0) goto L_0x0372
            boolean r1 = X.AnonymousClass20U.A03(r13)     // Catch:{ all -> 0x03ab }
            if (r1 == 0) goto L_0x0372
            X.20T r11 = new X.20T     // Catch:{ all -> 0x03ab }
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x03ab }
            r7.put(r12, r11)     // Catch:{ all -> 0x03ab }
            goto L_0x02bb
        L_0x036d:
            r2.endObject()     // Catch:{ all -> 0x03ab }
            goto L_0x027c
        L_0x0372:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ab }
            r5.<init>()     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = "ManifestManager/read/Category "
            r5.append(r1)     // Catch:{ all -> 0x03ab }
            r5.append(r12)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = " does not have proper hash : "
            r5.append(r1)     // Catch:{ all -> 0x03ab }
            r5.append(r13)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = " Quitting!"
            r5.append(r1)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x03ab }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x03ab }
            r2.close()     // Catch:{ IOException -> 0x03b0 }
            goto L_0x0235
        L_0x0398:
            r2.endObject()     // Catch:{ all -> 0x03ab }
            X.20V r1 = new X.20V     // Catch:{ all -> 0x03ab }
            r1.<init>(r5, r7)     // Catch:{ all -> 0x03ab }
            monitor-enter(r0)     // Catch:{ all -> 0x03ab }
            r0.A03 = r1     // Catch:{ all -> 0x03a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x03ab }
            r2.close()     // Catch:{ IOException -> 0x03b0 }
            goto L_0x03f4
        L_0x03a8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x03ab }
            throw r1     // Catch:{ all -> 0x03ab }
        L_0x03ab:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x03af }
        L_0x03af:
            throw r1     // Catch:{ IOException -> 0x03b0 }
        L_0x03b0:
            r2 = move-exception
            java.lang.String r1 = "ManifestManager/read/Failed!"
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x0235
        L_0x03b8:
            java.lang.String r1 = "ManifestManager/fetchWithBackoff/Fetch failed."
            goto L_0x0237
        L_0x03bc:
            java.lang.String r3 = "ManifestManager/fetchWithBackoff/Load failed, will retry after "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r1)
            java.lang.String r3 = " seconds for the "
            r5.append(r3)
            long r3 = r18.A00()
            r5.append(r3)
            java.lang.String r3 = "th time"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r3)
            X.0sq r6 = r0.A0G
            r19 = 6
            com.facebook.redex.RunnableRunnableShape0S0310000_I0 r5 = new com.facebook.redex.RunnableRunnableShape0S0310000_I0
            r15 = r5
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            java.lang.String r0 = "ManifestManager/fetch"
            r6.Ad4(r5, r0, r1)
            return
        L_0x03f4:
            X.20V r6 = r0.A03
            X.AnonymousClass00B.A06(r6)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r2 = r6.A01
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r5 = r2.iterator()
        L_0x0408:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0433
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            X.20T r2 = (X.AnonymousClass20T) r2
            java.lang.String r8 = r2.A01
            java.lang.String r9 = r2.A02()
            java.lang.String r10 = r2.A00
            java.lang.String r11 = r2.A02
            java.util.Map r12 = r2.A03
            X.20T r7 = new X.20T
            r7.<init>(r8, r9, r10, r11, r12)
            r1.put(r3, r7)
            goto L_0x0408
        L_0x0433:
            X.20T r2 = r6.A00
            java.lang.String r6 = r2.A01
            java.lang.String r7 = r2.A02()
            java.lang.String r8 = r2.A00
            java.lang.String r9 = r2.A02
            java.util.Map r10 = r2.A03
            X.20T r5 = new X.20T
            r5.<init>(r6, r7, r8, r9, r10)
            X.20V r2 = new X.20V
            r2.<init>(r5, r1)
            r1 = 5
            r0.A01(r1)
            r0.A06(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26041Mc.A05(X.20T, X.1kQ, boolean):void");
    }

    public final void A06(AnonymousClass20V r7, boolean z2) {
        ArrayList arrayList;
        AnonymousClass00B.A00();
        if (z2) {
            AnonymousClass00B.A06(r7);
        }
        synchronized (this) {
            HashMap hashMap = this.A0H;
            arrayList = new ArrayList(hashMap.entrySet());
            hashMap.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            Iterator it2 = ((AbstractCollection) entry.getValue()).iterator();
            while (it2.hasNext()) {
                AnonymousClass20W r2 = (AnonymousClass20W) it2.next();
                if (z2) {
                    r2.A01((AnonymousClass20T) r7.A01.get(entry.getKey()));
                } else {
                    r2.A00();
                }
            }
        }
    }
}
