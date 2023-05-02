package X;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Me  reason: invalid class name and case insensitive filesystem */
public abstract class C26061Me {
    public static final HashMap A0J = new AnonymousClass20X();
    public AnonymousClass20T A00 = null;
    public final SparseArray A01 = new SparseArray();
    public final SparseArray A02 = new SparseArray();
    public final SparseIntArray A03 = new SparseIntArray();
    public final C16300so A04;
    public final C17130ua A05;
    public final C18260wP A06;
    public final C16440t3 A07;
    public final C16980tz A08;
    public final C17120uZ A09;
    public final C15860rz A0A;
    public final C26041Mc A0B;
    public final C14710pd A0C;
    public final C16490t9 A0D;
    public final C19950zG A0E;
    public final C213013o A0F;
    public final C17670vS A0G;
    public final C16320sq A0H;
    public final List A0I = new ArrayList();

    public C26061Me(C16300so r2, C17130ua r3, C18260wP r4, C16440t3 r5, C16980tz r6, C17120uZ r7, C15860rz r8, C26041Mc r9, C14710pd r10, C16490t9 r11, C19950zG r12, C213013o r13, C17670vS r14, C16320sq r15) {
        this.A08 = r6;
        this.A07 = r5;
        this.A0C = r10;
        this.A04 = r2;
        this.A0H = r15;
        this.A05 = r3;
        this.A0D = r11;
        this.A0B = r9;
        this.A0G = r14;
        this.A0E = r12;
        this.A0A = r8;
        this.A06 = r4;
        this.A0F = r13;
        this.A09 = r7;
    }

    public static void A00(C15860rz r9, C16490t9 r10) {
        int i2 = 0;
        String[] strArr = {"manifest", "filter", "doodle_emoji"};
        do {
            String str = strArr[i2];
            String A0S = r9.A0S(str);
            if (!TextUtils.isEmpty(A0S)) {
                try {
                    AnonymousClass00B.A06(A0S);
                    JSONObject jSONObject = new JSONObject(A0S);
                    Map A012 = AnonymousClass20T.A01(jSONObject);
                    if (A012 != null && A012.containsKey("0")) {
                        String num = Integer.toString(-1);
                        if (!A012.containsKey(num)) {
                            Object obj = A012.get("0");
                            A012.clear();
                            A012.put(num, obj);
                            jSONObject.put("bundles", new JSONObject(A012));
                            AnonymousClass20Y r1 = new AnonymousClass20Y();
                            r1.A00 = Boolean.TRUE;
                            r10.A06(r1);
                        }
                    }
                    r9.A18(str, jSONObject.toString());
                } catch (JSONException e2) {
                    Log.e("CategoryManager/migrateLocalCatInfo", e2);
                }
            }
            i2++;
        } while (i2 < 3);
    }

    public synchronized int A01(int i2) {
        return this.A03.get(i2, 0);
    }

    public synchronized AnonymousClass20T A02() {
        AnonymousClass20T r3;
        r3 = this.A00;
        if (r3 == null) {
            r3 = null;
            try {
                C16490t9 r0 = this.A0D;
                C15860rz r1 = this.A0A;
                A00(r1, r0);
                String A0S = r1.A0S(this instanceof C26051Md ? "filter" : "doodle_emoji");
                if (!TextUtils.isEmpty(A0S)) {
                    AnonymousClass20T A002 = AnonymousClass20T.A00(A0S);
                    this.A00 = A002;
                    return A002;
                }
            } catch (JSONException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("CategoryManager/getLocalIdHash/json exception while getting local category info for ");
                sb.append(this instanceof C26051Md ? "filter" : "doodle_emoji");
                sb.append(e2.getMessage());
                AnonymousClass20U.A02(sb.toString());
            }
        }
        return r3;
    }

    public Object A03() {
        SparseArray sparseArray;
        HashMap A0D2;
        if (this instanceof C26051Md) {
            C26051Md r0 = (C26051Md) this;
            synchronized (this) {
                A0D2 = r0.A0D();
                if (A0D2.isEmpty()) {
                    A0D2 = null;
                }
            }
            return A0D2;
        }
        AnonymousClass1QR r02 = (AnonymousClass1QR) this;
        synchronized (this) {
            sparseArray = r02.A00;
            if (sparseArray.size() == 0) {
                sparseArray = null;
            }
        }
        return sparseArray;
    }

    public Map A04(String str, String str2, String str3, String str4, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("category", str);
        if (str2 != null) {
            hashMap.put("locale", str2);
        }
        if (str3 != null) {
            hashMap.put("existing_id", str3);
        }
        return hashMap;
    }

    public synchronized void A05() {
        this.A0A.A18(this instanceof C26051Md ? "filter" : "doodle_emoji", (String) null);
        this.A00 = null;
    }

    public final synchronized void A06(int i2) {
        this.A01.put(i2, Long.valueOf(this.A07.A00()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(int r14, int r15) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C26051Md
            if (r0 == 0) goto L_0x0065
            java.lang.String r6 = "filter"
        L_0x0006:
            X.20T r5 = r13.A02()
            r1 = 0
            if (r5 == 0) goto L_0x0020
            java.lang.String r0 = r5.A00
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0020
        L_0x0017:
            X.20W r9 = new X.20W
            r9.<init>(r13, r15, r14)
            X.1Mc r5 = r13.A0B
            monitor-enter(r5)
            goto L_0x0068
        L_0x0020:
            if (r14 != 0) goto L_0x0017
            r1 = r13
            monitor-enter(r1)
            android.util.SparseArray r0 = r13.A01     // Catch:{ all -> 0x01c6 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ all -> 0x01c6 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01c6 }
            if (r0 != 0) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            long r3 = r0.longValue()     // Catch:{ all -> 0x01c6 }
            goto L_0x0036
        L_0x0034:
            r3 = 0
        L_0x0036:
            monitor-exit(r1)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 + r0
            X.0t3 r0 = r13.A07
            long r1 = r0.A00()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            boolean r0 = r13.A0C(r15)
            if (r0 != 0) goto L_0x0063
            r13.A05()
            java.lang.String r0 = "CategoryManager/state is up-to-date but files are not present!"
            X.AnonymousClass20U.A02(r0)
            r0 = 0
        L_0x0054:
            r13.A08(r0, r15)
            if (r5 != 0) goto L_0x005e
            r0 = 0
        L_0x005a:
            r13.A0B(r0)
            return
        L_0x005e:
            java.lang.String r0 = r5.A04(r15)
            goto L_0x005a
        L_0x0063:
            r0 = 5
            goto L_0x0054
        L_0x0065:
            java.lang.String r6 = "doodle_emoji"
            goto L_0x0006
        L_0x0068:
            java.lang.String r4 = "manifest"
            r8 = 0
            X.20V r0 = r5.A03     // Catch:{ JSONException -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            X.20T r8 = r0.A00     // Catch:{ JSONException -> 0x00ba }
            goto L_0x00d0
        L_0x0072:
            X.0rz r3 = r5.A09     // Catch:{ JSONException -> 0x00ba }
            java.lang.String r1 = r3.A0S(r4)     // Catch:{ JSONException -> 0x00ba }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00ba }
            if (r0 != 0) goto L_0x00d0
            X.0t9 r0 = r5.A0C     // Catch:{ JSONException -> 0x00ba }
            A00(r3, r0)     // Catch:{ JSONException -> 0x00ba }
            X.20T r7 = X.AnonymousClass20T.A00(r1)     // Catch:{ JSONException -> 0x00ba }
            r7.A02()     // Catch:{ JSONException -> 0x00ba }
            java.lang.String r0 = r7.A02()     // Catch:{ JSONException -> 0x00ba }
            boolean r0 = X.AnonymousClass20U.A03(r0)     // Catch:{ JSONException -> 0x00ba }
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "ManifestManager/getLocalManifestHash/Local manifest hash is not base64-urlsafe!"
            X.AnonymousClass20U.A02(r0)     // Catch:{ JSONException -> 0x00ba }
        L_0x0099:
            r3.A18(r4, r8)     // Catch:{ JSONException -> 0x00ba }
            goto L_0x00d0
        L_0x009d:
            X.0tz r0 = r5.A07     // Catch:{ JSONException -> 0x00ba }
            android.content.Context r0 = r0.A00     // Catch:{ JSONException -> 0x00ba }
            java.io.File r2 = r0.getFilesDir()     // Catch:{ JSONException -> 0x00ba }
            java.lang.String r1 = "downloadable/manifest.json"
            java.io.File r0 = new java.io.File     // Catch:{ JSONException -> 0x00ba }
            r0.<init>(r2, r1)     // Catch:{ JSONException -> 0x00ba }
            boolean r0 = r0.exists()     // Catch:{ JSONException -> 0x00ba }
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "ManifestManager/getLocalManifestInfo/Local manifest hash is ok but manifest file is not present!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x00ba }
            goto L_0x0099
        L_0x00b8:
            r8 = r7
            goto L_0x00d0
        L_0x00ba:
            r2 = move-exception
            java.lang.String r0 = "ManifestManager/getLocalManifestInfo/error while getting local manifest info. FIX ASAP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r1.<init>(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x01c3 }
            r1.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c3 }
            X.AnonymousClass20U.A02(r0)     // Catch:{ all -> 0x01c3 }
        L_0x00d0:
            int r0 = r5.A00     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x01bc
            r2 = 2
            if (r0 == r2) goto L_0x0136
            r10 = 4
            if (r0 == r10) goto L_0x0136
            if (r8 == 0) goto L_0x00dd
            goto L_0x00f0
        L_0x00dd:
            X.0t3 r7 = r5.A06     // Catch:{ all -> 0x01c1 }
            long r11 = r7.A00()     // Catch:{ all -> 0x01c1 }
            long r0 = r5.A02()     // Catch:{ all -> 0x01c1 }
            long r11 = r11 - r0
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x010e
            goto L_0x0113
        L_0x00f0:
            java.lang.String r1 = r8.A00     // Catch:{ all -> 0x01c1 }
            if (r1 == 0) goto L_0x00dd
            X.013 r0 = r5.A0A     // Catch:{ all -> 0x01c1 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x01c1 }
            java.util.Locale r0 = X.AnonymousClass013.A00(r0)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = X.AnonymousClass1WH.A04(r0)     // Catch:{ all -> 0x01c1 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x00dd
            X.0t3 r0 = r5.A06     // Catch:{ all -> 0x01c1 }
            r0.A00()     // Catch:{ all -> 0x01c1 }
            r5.A02()     // Catch:{ all -> 0x01c1 }
        L_0x010e:
            int r3 = r5.A01(r2)     // Catch:{ all -> 0x01c1 }
            goto L_0x013d
        L_0x0113:
            r0 = 1
            if (r14 != r0) goto L_0x011f
            if (r8 != 0) goto L_0x0127
            r7.A00()     // Catch:{ all -> 0x01c1 }
            r5.A02()     // Catch:{ all -> 0x01c1 }
            goto L_0x018b
        L_0x011f:
            if (r8 != 0) goto L_0x0127
            r0 = 3
            int r3 = r5.A01(r0)     // Catch:{ all -> 0x01c1 }
            goto L_0x013d
        L_0x0127:
            X.20V r0 = r5.A03     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x0130
            int r3 = r5.A01(r10)     // Catch:{ all -> 0x01c1 }
            goto L_0x013d
        L_0x0130:
            r0 = 5
            int r3 = r5.A01(r0)     // Catch:{ all -> 0x01c1 }
            goto L_0x013d
        L_0x0136:
            java.lang.String r0 = "ManifestManager/computeState/Unexpected state encountered!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01c1 }
            int r3 = r5.A00     // Catch:{ all -> 0x01c1 }
        L_0x013d:
            if (r3 == 0) goto L_0x01bc
            if (r3 == r2) goto L_0x018b
            r0 = 3
            if (r3 == r0) goto L_0x0178
            r0 = 4
            if (r3 == r0) goto L_0x0176
            r0 = 5
            if (r3 == r0) goto L_0x0165
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c1 }
            r1.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "ManifestManager/getCategoryFromState/Unexpected state : "
            r1.append(r0)     // Catch:{ all -> 0x01c1 }
            r0 = 1
            if (r3 == r0) goto L_0x0162
            if (r3 == r2) goto L_0x015f
            r0 = 3
            if (r3 == r0) goto L_0x017b
            java.lang.String r0 = "READ_NEEDED"
            goto L_0x017d
        L_0x015f:
            java.lang.String r0 = "MANIFEST_STALE"
            goto L_0x017d
        L_0x0162:
            java.lang.String r0 = "LOADING_FAILED"
            goto L_0x017d
        L_0x0165:
            X.20V r0 = r5.A03     // Catch:{ all -> 0x01c1 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r0 = r0.A01     // Catch:{ all -> 0x01c1 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x01c1 }
            X.20T r0 = (X.AnonymousClass20T) r0     // Catch:{ all -> 0x01c1 }
            r9.A01(r0)     // Catch:{ all -> 0x01c1 }
            goto L_0x01bf
        L_0x0176:
            r7 = 0
            goto L_0x018c
        L_0x0178:
            java.lang.String r0 = "ManifestManager/getCategoryFromState/no local manifest hash found and it's too soon for a server fetch, cannot get category info!"
            goto L_0x0184
        L_0x017b:
            java.lang.String r0 = "NO_MANIFEST"
        L_0x017d:
            r1.append(r0)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c1 }
        L_0x0184:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01c1 }
            r9.A00()     // Catch:{ all -> 0x01c1 }
            goto L_0x01bf
        L_0x018b:
            r7 = 1
        L_0x018c:
            r0 = 0
            r5.A01(r0)     // Catch:{ all -> 0x01ba }
            if (r14 != 0) goto L_0x01aa
            long r3 = r5.A02     // Catch:{ all -> 0x01ba }
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r3 + r0
            X.0t3 r0 = r5.A06     // Catch:{ all -> 0x01ba }
            long r1 = r0.A00()     // Catch:{ all -> 0x01ba }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01aa
            r0 = 1
            r5.A01(r0)     // Catch:{ all -> 0x01ba }
            r9.A00()     // Catch:{ all -> 0x01ba }
            goto L_0x01bf
        L_0x01aa:
            r5.A04(r9, r6)     // Catch:{ all -> 0x01ba }
            X.0sq r2 = r5.A0G     // Catch:{ all -> 0x01ba }
            r1 = 13
            com.facebook.redex.RunnableRunnableShape0S0210000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0210000_I0     // Catch:{ all -> 0x01ba }
            r0.<init>(r5, r8, r1, r7)     // Catch:{ all -> 0x01ba }
            r2.Acl(r0)     // Catch:{ all -> 0x01ba }
            goto L_0x01bf
        L_0x01ba:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01c1 }
        L_0x01bc:
            r5.A04(r9, r6)     // Catch:{ all -> 0x01c1 }
        L_0x01bf:
            monitor-exit(r5)
            return
        L_0x01c1:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x01c6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26061Me.A07(int, int):void");
    }

    public synchronized void A08(int i2, int i3) {
        SparseIntArray sparseIntArray = this.A03;
        int i4 = sparseIntArray.get(i3, 0);
        if (!(i4 == 3 && i2 == 3)) {
            if (i4 == 1) {
                if (i2 != 1) {
                }
            } else if (i4 == 3 && i2 == 1) {
            }
            HashMap hashMap = A0J;
            hashMap.get(Integer.valueOf(i4));
            hashMap.get(Integer.valueOf(i2));
            sparseIntArray.put(i3, i2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CategoryManager/setState/State change ERROR - ");
        HashMap hashMap2 = A0J;
        sb.append((String) hashMap2.get(Integer.valueOf(i4)));
        sb.append(" to ");
        sb.append((String) hashMap2.get(Integer.valueOf(i2)));
        sb.append("!");
        Log.e(sb.toString());
    }

    public synchronized void A09(AnonymousClass20Z r5, int i2) {
        int A012 = A01(i2);
        if (A012 == 3 || A012 == 1) {
            this.A0I.add(r5);
        } else {
            if (!(A012 == 4 || A012 == 2)) {
                if (A012 != 5 || A03() == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CategoryManager/registerCallback/Unexpected state encountered - ");
                    sb.append((String) A0J.get(Integer.valueOf(A012)));
                    Log.e(sb.toString());
                } else {
                    Object A032 = A03();
                    AnonymousClass00B.A06(A032);
                    r5.AVi(A032);
                }
            }
            r5.AQQ();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:107:0x0215=Splitter:B:107:0x0215, B:121:0x0227=Splitter:B:121:0x0227} */
    public final void A0A(X.AnonymousClass20T r21, X.C34531kQ r22, java.lang.String r23, int r24) {
        /*
            r20 = this;
            r5 = r20
            X.AnonymousClass00B.A00()
            r6 = r24
            int r1 = r5.A01(r6)
            r3 = 3
            r0 = 0
            if (r1 != r3) goto L_0x0010
            r0 = 1
        L_0x0010:
            X.AnonymousClass00B.A0G(r0)
            X.AnonymousClass00B.A00()
            int r2 = r5.A01(r6)
            r1 = 1
            r0 = 0
            if (r2 != r3) goto L_0x001f
            r0 = 1
        L_0x001f:
            X.AnonymousClass00B.A0G(r0)
            r7 = r21
            java.lang.String r10 = r7.A01
            X.20T r0 = r5.A02()
            r4 = 0
            if (r0 != 0) goto L_0x0053
            r3 = r4
        L_0x002e:
            java.lang.String r0 = r7.A04(r6)
            boolean r0 = r0.equals(r3)
            r1 = r1 ^ r0
            X.AnonymousClass00B.A0G(r1)
            java.lang.String r2 = r7.A02
            r17 = r23
            if (r2 != 0) goto L_0x0058
            X.0pd r2 = r5.A0C
            X.13o r1 = r5.A0F
            r9 = r5
            r11 = r17
            r12 = r3
            r13 = r4
            r14 = r6
            java.util.Map r0 = r9.A04(r10, r11, r12, r13, r14)
            java.lang.String r2 = X.AnonymousClass20U.A01(r2, r1, r0)
            goto L_0x0058
        L_0x0053:
            java.lang.String r3 = r0.A04(r6)
            goto L_0x002e
        L_0x0058:
            X.0zG r1 = r5.A0E     // Catch:{ IOException -> 0x03a9 }
            X.0vS r0 = r5.A0G     // Catch:{ IOException -> 0x03a9 }
            r15 = r4
            r16 = r4
            r11 = r1
            r12 = r0
            r13 = r2
            r14 = r4
            X.1pl r2 = r11.A7K(r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x03a9 }
            int r1 = r2.A6O()     // Catch:{ all -> 0x03a4 }
            r0 = 400(0x190, float:5.6E-43)
            if (r1 < r0) goto L_0x0089
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            r1.<init>()     // Catch:{ all -> 0x03a4 }
            java.lang.String r0 = "CategoryManager/fetch/Error, code="
            r1.append(r0)     // Catch:{ all -> 0x03a4 }
            int r0 = r2.A6O()     // Catch:{ all -> 0x03a4 }
            r1.append(r0)     // Catch:{ all -> 0x03a4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03a4 }
            goto L_0x0303
        L_0x0089:
            r2.A6O()     // Catch:{ all -> 0x03a4 }
            java.lang.String r0 = "idhash"
            java.lang.String r9 = r2.AHk(r0)     // Catch:{ all -> 0x03a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x03a4 }
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "CategoryManager/fetch/Server did not return an idhash."
            X.AnonymousClass20U.A02(r0)     // Catch:{ all -> 0x03a4 }
            java.lang.String r8 = r7.A04(r6)     // Catch:{ all -> 0x03a4 }
        L_0x00a1:
            int r1 = r2.A6O()     // Catch:{ all -> 0x03a4 }
            r0 = 304(0x130, float:4.26E-43)
            if (r1 != r0) goto L_0x010f
            goto L_0x00e1
        L_0x00aa:
            java.lang.String r0 = r7.A04(r6)     // Catch:{ all -> 0x03a4 }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x00df
            r7.A04(r6)     // Catch:{ all -> 0x03a4 }
            X.1Mc r8 = r5.A0B     // Catch:{ all -> 0x03a4 }
            monitor-enter(r8)     // Catch:{ all -> 0x03a4 }
            int r0 = r8.A00()     // Catch:{ all -> 0x03a1 }
            if (r0 == 0) goto L_0x00de
            X.20V r0 = r8.A03     // Catch:{ all -> 0x03a1 }
            if (r0 == 0) goto L_0x00de
            java.util.HashMap r0 = r0.A01     // Catch:{ all -> 0x03a1 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x03a1 }
            X.20T r0 = (X.AnonymousClass20T) r0     // Catch:{ all -> 0x03a1 }
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = r0.A02()     // Catch:{ all -> 0x03a1 }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x03a1 }
            if (r0 == 0) goto L_0x00d9
            goto L_0x00de
        L_0x00d9:
            r0 = 0
            r8.A03(r0)     // Catch:{ all -> 0x03a1 }
        L_0x00de:
            monitor-exit(r8)     // Catch:{ all -> 0x03a4 }
        L_0x00df:
            r8 = r9
            goto L_0x00a1
        L_0x00e1:
            if (r9 == 0) goto L_0x00ee
            boolean r0 = r9.equals(r3)     // Catch:{ all -> 0x03a4 }
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "CategoryManager/fetch/Server's hash doesn't match manifest's even though server returned not-modified!"
            X.AnonymousClass20U.A02(r0)     // Catch:{ all -> 0x03a4 }
        L_0x00ee:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            r1.<init>()     // Catch:{ all -> 0x03a4 }
            java.lang.String r0 = "CategoryManager/fetch/Unnecessary http request made. Category "
            r1.append(r0)     // Catch:{ all -> 0x03a4 }
            r1.append(r10)     // Catch:{ all -> 0x03a4 }
            java.lang.String r0 = " is already up-to-date. Local idhash was "
            r1.append(r0)     // Catch:{ all -> 0x03a4 }
            r1.append(r3)     // Catch:{ all -> 0x03a4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03a4 }
            r2.close()     // Catch:{ IOException -> 0x03a9 }
            goto L_0x0391
        L_0x010f:
            if (r9 == 0) goto L_0x011c
            boolean r0 = r9.equals(r3)     // Catch:{ all -> 0x03a4 }
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = "CategoryManager/fetch/Server's hash matches manifest's even though server didn't return not-modified!"
            X.AnonymousClass20U.A02(r0)     // Catch:{ all -> 0x03a4 }
        L_0x011c:
            boolean r9 = r5 instanceof X.C26051Md     // Catch:{ all -> 0x03a4 }
            if (r9 == 0) goto L_0x0230
            r14 = -1
            r0 = 0
            if (r6 != r14) goto L_0x0125
            r0 = 1
        L_0x0125:
            X.AnonymousClass00B.A0F(r0)     // Catch:{ all -> 0x03a4 }
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x03a4 }
            monitor-enter(r5)     // Catch:{ all -> 0x03a4 }
            int r3 = r5.A01(r14)     // Catch:{ all -> 0x039e }
            monitor-exit(r5)     // Catch:{ all -> 0x03a4 }
            r13 = 0
            r1 = 3
            r0 = 0
            if (r3 != r1) goto L_0x0137
            r0 = 1
        L_0x0137:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x03a4 }
            X.0ua r3 = r5.A05     // Catch:{ IOException -> 0x0228 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x0228 }
            r0 = 21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0228 }
            java.io.InputStream r0 = r2.A9k(r3, r1, r0)     // Catch:{ IOException -> 0x0228 }
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x0228 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0228 }
            java.lang.String r11 = "downloadable/filter_"
            X.0tz r0 = r5.A08     // Catch:{ all -> 0x0223 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0223 }
            r18 = r0
            java.io.File r3 = r18.getCacheDir()     // Catch:{ all -> 0x0223 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0223 }
            r12.<init>()     // Catch:{ all -> 0x0223 }
            r12.append(r11)     // Catch:{ all -> 0x0223 }
            r12.append(r8)     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "_tmp"
            r12.append(r0)     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0223 }
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x0223 }
            r12.<init>(r3, r0)     // Catch:{ all -> 0x0223 }
            boolean r0 = X.AnonymousClass1XI.A0P(r12)     // Catch:{ all -> 0x0223 }
            if (r0 != 0) goto L_0x0181
            java.lang.String r0 = "FilterManager/store/Could not prepare temporary cache subdirectory"
        L_0x017c:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0223 }
            goto L_0x0215
        L_0x0181:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r0]     // Catch:{ all -> 0x0223 }
        L_0x0185:
            java.util.zip.ZipEntry r16 = r1.getNextEntry()     // Catch:{ all -> 0x0223 }
            if (r16 == 0) goto L_0x01c7
            java.lang.String r3 = r12.getCanonicalPath()     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = r16.getName()     // Catch:{ all -> 0x0223 }
            java.io.File r0 = X.AnonymousClass1XI.A05(r3, r0)     // Catch:{ all -> 0x0223 }
            if (r0 != 0) goto L_0x01af
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0223 }
            r3.<init>()     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "FilterManager/store/malicious zip file:"
            r3.append(r0)     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = r16.getName()     // Catch:{ all -> 0x0223 }
            r3.append(r0)     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0223 }
            goto L_0x017c
        L_0x01af:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0223 }
            r3.<init>(r0)     // Catch:{ all -> 0x0223 }
        L_0x01b4:
            int r0 = r1.read(r15)     // Catch:{ all -> 0x01c2 }
            if (r0 == r14) goto L_0x01be
            r3.write(r15, r13, r0)     // Catch:{ all -> 0x01c2 }
            goto L_0x01b4
        L_0x01be:
            r3.close()     // Catch:{ all -> 0x0223 }
            goto L_0x0185
        L_0x01c2:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x01c6 }
        L_0x01c6:
            throw r0     // Catch:{ all -> 0x0223 }
        L_0x01c7:
            monitor-enter(r5)     // Catch:{ all -> 0x0223 }
            java.io.File r3 = r18.getFilesDir()     // Catch:{ all -> 0x0220 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0220 }
            r0.<init>()     // Catch:{ all -> 0x0220 }
            r0.append(r11)     // Catch:{ all -> 0x0220 }
            r0.append(r8)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0220 }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x0220 }
            r11.<init>(r3, r0)     // Catch:{ all -> 0x0220 }
            boolean r0 = X.AnonymousClass1XI.A0P(r11)     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x01ed
            java.lang.String r0 = "FilterManager/store/Could not prepare filters subdirectory"
        L_0x01e8:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0220 }
            monitor-exit(r5)     // Catch:{ all -> 0x0220 }
            goto L_0x0215
        L_0x01ed:
            boolean r0 = r12.renameTo(r11)     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x021a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0220 }
            r3.<init>()     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = "FilterManager/store : rename failed, from "
            r3.append(r0)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0220 }
            r3.append(r0)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = " to "
            r3.append(r0)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0220 }
            r3.append(r0)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0220 }
            goto L_0x01e8
        L_0x0215:
            r1.close()     // Catch:{ IOException -> 0x0228 }
            goto L_0x02e5
        L_0x021a:
            monitor-exit(r5)     // Catch:{ all -> 0x0220 }
            r1.close()     // Catch:{ IOException -> 0x0228 }
            goto L_0x02e7
        L_0x0220:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0220 }
            throw r0     // Catch:{ all -> 0x0223 }
        L_0x0223:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0227 }
        L_0x0227:
            throw r0     // Catch:{ IOException -> 0x0228 }
        L_0x0228:
            r1 = move-exception
            java.lang.String r0 = "FilterManager/store/Failed!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x03a4 }
            goto L_0x02e5
        L_0x0230:
            r1 = r5
            X.1QR r1 = (X.AnonymousClass1QR) r1     // Catch:{ all -> 0x03a4 }
            monitor-enter(r5)     // Catch:{ all -> 0x03a4 }
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x039e }
            int r12 = r1.A01(r6)     // Catch:{ all -> 0x039e }
            r11 = 1
            r14 = 0
            r3 = 3
            r0 = 0
            if (r12 != r3) goto L_0x0242
            r0 = 1
        L_0x0242:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x039e }
            X.0ua r12 = r1.A05     // Catch:{ IOException -> 0x02de }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)     // Catch:{ IOException -> 0x02de }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x02de }
            java.io.InputStream r0 = r2.A9k(r12, r3, r0)     // Catch:{ IOException -> 0x02de }
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x02de }
            r3.<init>(r0)     // Catch:{ IOException -> 0x02de }
            java.io.File r12 = r1.A0D(r8, r6, r11)     // Catch:{ all -> 0x02d9 }
            boolean r0 = X.AnonymousClass1XI.A0P(r12)     // Catch:{ all -> 0x02d9 }
            if (r0 != 0) goto L_0x026a
            java.lang.String r0 = "DoodleEmojiManager/store/Could not prepare temporary cache subdirectory"
        L_0x0266:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02d9 }
            goto L_0x02cd
        L_0x026a:
            java.lang.String r13 = r12.getCanonicalPath()     // Catch:{ all -> 0x02d9 }
        L_0x026e:
            java.util.zip.ZipEntry r11 = r3.getNextEntry()     // Catch:{ all -> 0x02d9 }
            if (r11 == 0) goto L_0x0298
            java.lang.String r0 = r11.getName()     // Catch:{ all -> 0x02d9 }
            java.io.File r0 = X.AnonymousClass1XI.A05(r13, r0)     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x0282
            X.AnonymousClass1XI.A0Q(r0, r3)     // Catch:{ all -> 0x02d9 }
            goto L_0x026e
        L_0x0282:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d9 }
            r1.<init>()     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = "DoodleEmojiManager/store/Potentially malicious file:"
            r1.append(r0)     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = r11.getName()     // Catch:{ all -> 0x02d9 }
            r1.append(r0)     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02d9 }
            goto L_0x0266
        L_0x0298:
            java.io.File r11 = r1.A0D(r8, r6, r14)     // Catch:{ all -> 0x02d9 }
            boolean r0 = X.AnonymousClass1XI.A0P(r11)     // Catch:{ all -> 0x02d9 }
            if (r0 != 0) goto L_0x02a5
            java.lang.String r0 = "DoodleEmojiManager/store/Could not prepare emoji subdirectory"
            goto L_0x0266
        L_0x02a5:
            boolean r0 = r12.renameTo(r11)     // Catch:{ all -> 0x02d9 }
            if (r0 != 0) goto L_0x02d1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d9 }
            r1.<init>()     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = "DoodleEmojiManager/store : rename failed, from "
            r1.append(r0)     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x02d9 }
            r1.append(r0)     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x02d9 }
            r1.append(r0)     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02d9 }
            goto L_0x0266
        L_0x02cd:
            r3.close()     // Catch:{ IOException -> 0x02de }
            goto L_0x02e4
        L_0x02d1:
            r1.A0F(r6, r8)     // Catch:{ all -> 0x02d9 }
            r3.close()     // Catch:{ IOException -> 0x02de }
            monitor-exit(r5)     // Catch:{ all -> 0x03a4 }
            goto L_0x02e7
        L_0x02d9:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x02dd }
        L_0x02dd:
            throw r0     // Catch:{ IOException -> 0x02de }
        L_0x02de:
            r1 = move-exception
            java.lang.String r0 = "DoodleEmojiManager/store/Failed!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x039e }
        L_0x02e4:
            monitor-exit(r5)     // Catch:{ all -> 0x03a4 }
        L_0x02e5:
            r0 = 0
            goto L_0x02e8
        L_0x02e7:
            r0 = 1
        L_0x02e8:
            java.lang.String r3 = "!"
            if (r0 != 0) goto L_0x0308
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a4 }
            r1.<init>()     // Catch:{ all -> 0x03a4 }
            java.lang.String r0 = "CategoryManager/fetch/Store failed for "
            r1.append(r0)     // Catch:{ all -> 0x03a4 }
            r1.append(r10)     // Catch:{ all -> 0x03a4 }
            r1.append(r3)     // Catch:{ all -> 0x03a4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03a4 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03a4 }
        L_0x0303:
            r2.close()     // Catch:{ IOException -> 0x03a9 }
            goto L_0x03af
        L_0x0308:
            if (r9 == 0) goto L_0x0314
            r0 = r5
            X.1Md r0 = (X.C26051Md) r0     // Catch:{ all -> 0x03a4 }
            monitor-enter(r5)     // Catch:{ all -> 0x03a4 }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x039e }
            r0.clear()     // Catch:{ all -> 0x039e }
            monitor-exit(r5)     // Catch:{ all -> 0x03a4 }
        L_0x0314:
            java.lang.String r3 = r7.A02()     // Catch:{ all -> 0x03a4 }
            monitor-enter(r5)     // Catch:{ all -> 0x03a4 }
            boolean r1 = r8.isEmpty()     // Catch:{ all -> 0x039e }
            r0 = 0
            if (r1 != 0) goto L_0x0321
            r0 = 1
        L_0x0321:
            X.AnonymousClass00B.A0F(r0)     // Catch:{ all -> 0x039e }
            X.20T r0 = r5.A02()     // Catch:{ all -> 0x039e }
            r5.A00 = r0     // Catch:{ all -> 0x039e }
            if (r0 == 0) goto L_0x0336
            java.lang.String r0 = r0.A02()     // Catch:{ all -> 0x039e }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x039e }
            if (r0 != 0) goto L_0x034a
        L_0x0336:
            if (r9 == 0) goto L_0x033b
            java.lang.String r11 = "filter"
            goto L_0x033d
        L_0x033b:
            java.lang.String r11 = "doodle_emoji"
        L_0x033d:
            X.20T r0 = new X.20T     // Catch:{ all -> 0x039e }
            r15 = r4
            r10 = r0
            r12 = r3
            r13 = r17
            r14 = r4
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x039e }
            r5.A00 = r0     // Catch:{ all -> 0x039e }
        L_0x034a:
            X.20T r0 = r5.A00     // Catch:{ all -> 0x039e }
            java.util.Map r1 = r0.A03     // Catch:{ all -> 0x039e }
            java.lang.String r0 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x039e }
            r1.put(r0, r8)     // Catch:{ all -> 0x039e }
            X.0rz r3 = r5.A0A     // Catch:{ JSONException -> 0x0368 }
            if (r9 == 0) goto L_0x0365
            java.lang.String r1 = "filter"
        L_0x035b:
            X.20T r0 = r5.A00     // Catch:{ JSONException -> 0x0368 }
            java.lang.String r0 = r0.A03()     // Catch:{ JSONException -> 0x0368 }
            r3.A18(r1, r0)     // Catch:{ JSONException -> 0x0368 }
            goto L_0x038b
        L_0x0365:
            java.lang.String r1 = "doodle_emoji"
            goto L_0x035b
        L_0x0368:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x039e }
            r1.<init>()     // Catch:{ all -> 0x039e }
            java.lang.String r0 = "CategoryManager/setLocalIdHash/json exception while setting local category info for "
            r1.append(r0)     // Catch:{ all -> 0x039e }
            if (r9 == 0) goto L_0x0378
            java.lang.String r0 = "filter"
            goto L_0x037a
        L_0x0378:
            java.lang.String r0 = "doodle_emoji"
        L_0x037a:
            r1.append(r0)     // Catch:{ all -> 0x039e }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x039e }
            r1.append(r0)     // Catch:{ all -> 0x039e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x039e }
            X.AnonymousClass20U.A02(r0)     // Catch:{ all -> 0x039e }
        L_0x038b:
            monitor-exit(r5)     // Catch:{ all -> 0x03a4 }
            r2.close()     // Catch:{ IOException -> 0x03a9 }
            r3 = r8
            goto L_0x0393
        L_0x0391:
            if (r3 == 0) goto L_0x03af
        L_0x0393:
            r0 = 5
            r5.A08(r0, r6)
            r5.A06(r6)
            r5.A0B(r3)
            return
        L_0x039e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03a4 }
            goto L_0x03a3
        L_0x03a1:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03a4 }
        L_0x03a3:
            throw r0     // Catch:{ all -> 0x03a4 }
        L_0x03a4:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x03a8 }
        L_0x03a8:
            throw r0     // Catch:{ IOException -> 0x03a9 }
        L_0x03a9:
            r1 = move-exception
            java.lang.String r0 = "CategoryManager/fetch/error "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03af:
            r16 = r22
            long r2 = r16.A01()
            long r10 = r16.A00()
            r8 = 17
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x03e0
            java.lang.String r0 = "CategoryManager/fetchWithBackoff/Load failed on all retries!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            monitor-enter(r5)
            android.util.SparseArray r2 = r5.A02     // Catch:{ all -> 0x03dd }
            X.0t3 r0 = r5.A07     // Catch:{ all -> 0x03dd }
            long r0 = r0.A00()     // Catch:{ all -> 0x03dd }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x03dd }
            r2.put(r6, r0)     // Catch:{ all -> 0x03dd }
            monitor-exit(r5)
            r0 = 4
            r5.A08(r0, r6)
            r5.A0B(r4)
            return
        L_0x03dd:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x03e0:
            java.lang.String r0 = "CategoryManager/fetchWithBackoff/Load failed, will retry after "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r2)
            java.lang.String r0 = " seconds for the "
            r4.append(r0)
            long r0 = r16.A00()
            r4.append(r0)
            java.lang.String r0 = "th time"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0sq r4 = r5.A0H
            r19 = 2
            com.facebook.redex.RunnableRunnableShape0S1301000_I0 r13 = new com.facebook.redex.RunnableRunnableShape0S1301000_I0
            r18 = r6
            r14 = r5
            r15 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.String r0 = "CategoryManager/fetch"
            r4.Ad4(r13, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26061Me.A0A(X.20T, X.1kQ, java.lang.String, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (A03() == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2.hasNext() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        ((X.AnonymousClass20Z) r2.next()).AVi(A03());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r1.hasNext() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        ((X.AnonymousClass20Z) r1.next()).AQQ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r4 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List r2 = r3.A0I     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            return
        L_0x000b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ all -> 0x0049 }
            r2.clear()     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0034
            java.lang.Object r0 = r3.A03()
            if (r0 == 0) goto L_0x0034
            java.util.Iterator r2 = r1.iterator()
        L_0x0020:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r2.next()
            X.20Z r1 = (X.AnonymousClass20Z) r1
            java.lang.Object r0 = r3.A03()
            r1.AVi(r0)
            goto L_0x0020
        L_0x0034:
            java.util.Iterator r1 = r1.iterator()
        L_0x0038:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r1.next()
            X.20Z r0 = (X.AnonymousClass20Z) r0
            r0.AQQ()
            goto L_0x0038
        L_0x0048:
            return
        L_0x0049:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26061Me.A0B(java.lang.String):void");
    }

    public boolean A0C(int i2) {
        boolean contains;
        if (this instanceof C26051Md) {
            C26051Md r2 = (C26051Md) this;
            boolean z2 = false;
            if (i2 == -1) {
                z2 = true;
            }
            AnonymousClass00B.A0F(z2);
            return r2.A0F();
        }
        AnonymousClass1QR r22 = (AnonymousClass1QR) this;
        synchronized (r22) {
            r22.A0E(i2);
            contains = r22.A02.contains(Integer.valueOf(i2));
        }
        return contains;
    }
}
