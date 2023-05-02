package X;

import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.0yB  reason: invalid class name and case insensitive filesystem */
public class C19280yB {
    public final C46102Cj A00 = new C46102Cj();
    public final C207211i A01;
    public final C16440t3 A02;
    public final AnonymousClass197 A03 = new AnonymousClass197(10);
    public final HashMap A04 = new HashMap();
    public final HashSet A05 = new HashSet();

    public C19280yB(C207211i r3, C16440t3 r4) {
        this.A02 = r4;
        this.A01 = r3;
    }

    public static AnonymousClass2IQ A00(C46082Cg r5, String str) {
        if (!TextUtils.isEmpty(str)) {
            for (AnonymousClass2IQ r2 : r5.A02) {
                if (r2.A01 == 1 && (r2.A0d().A00 & 2) == 2 && r2.A0d().A06.equals(str)) {
                    return r2;
                }
            }
        }
        return null;
    }

    public static Locale[] A01(AnonymousClass013 r6, Locale locale) {
        Locale A002 = AnonymousClass013.A00(r6.A00);
        if (locale == null || TextUtils.isEmpty(locale.getLanguage())) {
            locale = Locale.ENGLISH;
        }
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            int size = localeList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(localeList.get(i2));
            }
            if (!arrayList.contains(A002)) {
                arrayList.add(0, A002);
            }
        } else {
            arrayList.add(A002);
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            arrayList.add(size2 + 1, new Locale(((Locale) arrayList.get(size2)).getLanguage(), ""));
        }
        if (!arrayList.contains(locale)) {
            arrayList.add(locale);
        }
        return (Locale[]) arrayList.toArray(new Locale[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01dd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01de, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r1 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1.A02.size() <= 0) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r9 >= r10) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r8 = r33[r9];
        r7 = new X.AnonymousClass2Ci(r14, r8);
        r2 = r12.A01;
        r20 = (r2.A00.A00() - 604800000) / 1000;
        r30 = r2.A01;
        r19 = r30.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0 = null;
        r1 = r19.A02.A09("packs", new java.lang.String[]{"hash", "timestamp", "data"}, "lg = ? AND lc = ? AND namespace = ?", new java.lang.String[]{r8.getLanguage(), r8.getCountry(), r32}, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        if (r1.moveToNext() == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        r16 = r1.getString(r1.getColumnIndexOrThrow("hash"));
        r3 = r1.getLong(r1.getColumnIndexOrThrow("timestamp"));
        r0 = r1.getBlob(r1.getColumnIndexOrThrow("data"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c5, code lost:
        r3 = 0;
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d3, code lost:
        if (android.text.TextUtils.isEmpty(r16) != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        if (r0 == null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d8, code lost:
        if (r0.length != 0) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dc, code lost:
        if (r3 < r20) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00de, code lost:
        if (r0 == null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e1, code lost:
        if (r0.length <= 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
        X.AnonymousClass1WH.A05(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e7, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r0 = (X.C46092Ch) X.C46082Cg.A07.A0U();
        r0.A05(r14);
        r11.put(r7, (X.C46082Cg) r0.A02());
        r12.A05.remove(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0102, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r1 = (X.C46082Cg) X.C28541Wm.A0E(X.C46082Cg.A07, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010e, code lost:
        if (r1 == null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0114, code lost:
        if ((r1.A00 & 1) != 1) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011c, code lost:
        if (r1.A02.size() <= 0) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011e, code lost:
        r2 = new java.lang.StringBuilder("languagepackmanager/request-language-pack loaded lg=");
        r2.append(r1.A05);
        r2.append(" lc=");
        r2.append(r1.A04);
        r2.append(" ns=");
        r2.append(r1.A06);
        r2.append(" tcount=");
        r2.append(r1.A02.size());
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0153, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r11.put(r7, r1);
        r12.A05.remove(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015c, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0161, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0162, code lost:
        com.whatsapp.util.Log.w("languagepackmanager/request-language-pack/invalidproto:", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c1, code lost:
        X.AnonymousClass1WH.A05(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c4, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r11.remove(r7);
        r12.A05.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01cd, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ce, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d3, code lost:
        if (r1 != null) goto L_0x01d5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x01d8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C46082Cg A02(java.lang.String r32, java.util.Locale[] r33) {
        /*
            r31 = this;
            r12 = r31
            X.197 r11 = r12.A03
            monitor-enter(r11)
            r13 = r33
            int r10 = r13.length     // Catch:{ all -> 0x01df }
            r9 = 0
            r27 = 0
            r1 = r27
            r3 = 0
        L_0x000e:
            r14 = r32
            if (r3 >= r10) goto L_0x0038
            r0 = r33[r3]     // Catch:{ all -> 0x01df }
            X.2Ci r2 = new X.2Ci     // Catch:{ all -> 0x01df }
            r2.<init>(r14, r0)     // Catch:{ all -> 0x01df }
            java.lang.Object r1 = r11.get(r2)     // Catch:{ all -> 0x01df }
            X.2Cg r1 = (X.C46082Cg) r1     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x002c
            X.1XE r0 = r1.A02     // Catch:{ all -> 0x01df }
            int r0 = r0.size()     // Catch:{ all -> 0x01df }
            if (r0 > 0) goto L_0x0038
            int r3 = r3 + 1
            goto L_0x000e
        L_0x002c:
            java.util.HashSet r0 = r12.A05     // Catch:{ all -> 0x01df }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x0036
            monitor-exit(r11)     // Catch:{ all -> 0x01df }
            return r27
        L_0x0036:
            r1 = r27
        L_0x0038:
            monitor-exit(r11)     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0044
            X.1XE r0 = r1.A02
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01de
            return r1
        L_0x0044:
            if (r9 >= r10) goto L_0x01de
            r8 = r33[r9]
            X.2Ci r7 = new X.2Ci
            r7.<init>(r14, r8)
            X.11i r2 = r12.A01
            java.lang.String r6 = "data"
            java.lang.String r5 = "timestamp"
            java.lang.String r4 = "hash"
            X.0t3 r0 = r2.A00
            long r20 = r0.A00()
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r20 = r20 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 / r0
            X.2Dl r0 = r2.A01
            r30 = r0
            X.0tf r19 = r30.get()
            r0 = r19
            X.0tg r0 = r0.A02     // Catch:{ all -> 0x01d9 }
            r22 = r0
            java.lang.String r18 = "packs"
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x01d9 }
            r17 = 0
            r3[r17] = r4     // Catch:{ all -> 0x01d9 }
            r2 = 1
            r3[r2] = r5     // Catch:{ all -> 0x01d9 }
            r16 = 2
            r3[r16] = r6     // Catch:{ all -> 0x01d9 }
            java.lang.String r15 = "lg = ? AND lc = ? AND namespace = ?"
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r8.getLanguage()     // Catch:{ all -> 0x01d9 }
            r1[r17] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r8.getCountry()     // Catch:{ all -> 0x01d9 }
            r1[r2] = r0     // Catch:{ all -> 0x01d9 }
            r1[r16] = r32     // Catch:{ all -> 0x01d9 }
            r0 = 0
            r29 = r0
            r23 = r18
            r24 = r3
            r25 = r15
            r26 = r1
            r28 = r0
            android.database.Cursor r1 = r22.A09(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x01d9 }
            boolean r3 = r1.moveToNext()     // Catch:{ all -> 0x01d2 }
            if (r3 == 0) goto L_0x00c5
            int r0 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x01d2 }
            java.lang.String r16 = r1.getString(r0)     // Catch:{ all -> 0x01d2 }
            int r0 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x01d2 }
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x01d2 }
            int r0 = r1.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x01d2 }
            byte[] r0 = r1.getBlob(r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x00c9
        L_0x00c5:
            r3 = 0
            r16 = r0
        L_0x00c9:
            r1.close()     // Catch:{ all -> 0x01d9 }
            r19.close()
            boolean r1 = android.text.TextUtils.isEmpty(r16)
            if (r1 != 0) goto L_0x00da
            if (r0 == 0) goto L_0x01c1
            int r1 = r0.length
            if (r1 != 0) goto L_0x00e0
        L_0x00da:
            int r1 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r1 < 0) goto L_0x01c1
            if (r0 == 0) goto L_0x01c1
        L_0x00e0:
            int r1 = r0.length
            if (r1 <= 0) goto L_0x00e4
            goto L_0x0106
        L_0x00e4:
            X.AnonymousClass1WH.A05(r8)
            monitor-enter(r11)
            X.2Cg r0 = X.C46082Cg.A07     // Catch:{ all -> 0x01be }
            X.1Wr r0 = r0.A0U()     // Catch:{ all -> 0x01be }
            X.2Ch r0 = (X.C46092Ch) r0     // Catch:{ all -> 0x01be }
            r0.A05(r14)     // Catch:{ all -> 0x01be }
            X.1Wm r0 = r0.A02()     // Catch:{ all -> 0x01be }
            X.2Cg r0 = (X.C46082Cg) r0     // Catch:{ all -> 0x01be }
            r11.put(r7, r0)     // Catch:{ all -> 0x01be }
            java.util.HashSet r0 = r12.A05     // Catch:{ all -> 0x01be }
            r0.remove(r7)     // Catch:{ all -> 0x01be }
            monitor-exit(r11)     // Catch:{ all -> 0x01be }
            int r9 = r9 + 1
            goto L_0x0044
        L_0x0106:
            X.2Cg r1 = X.C46082Cg.A07     // Catch:{ 1bD -> 0x0161 }
            X.1Wm r1 = X.C28541Wm.A0E(r1, r0)     // Catch:{ 1bD -> 0x0161 }
            X.2Cg r1 = (X.C46082Cg) r1     // Catch:{ 1bD -> 0x0161 }
            if (r1 == 0) goto L_0x0167
            int r0 = r1.A00
            r0 = r0 & 1
            if (r0 != r2) goto L_0x0167
            X.1XE r0 = r1.A02
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0167
            java.lang.String r0 = "languagepackmanager/request-language-pack loaded lg="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = r1.A05
            r2.append(r0)
            java.lang.String r0 = " lc="
            r2.append(r0)
            java.lang.String r0 = r1.A04
            r2.append(r0)
            java.lang.String r0 = " ns="
            r2.append(r0)
            java.lang.String r0 = r1.A06
            r2.append(r0)
            java.lang.String r0 = " tcount="
            r2.append(r0)
            X.1XE r0 = r1.A02
            int r0 = r0.size()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r11)
            r11.put(r7, r1)     // Catch:{ all -> 0x015e }
            java.util.HashSet r0 = r12.A05     // Catch:{ all -> 0x015e }
            r0.remove(r7)     // Catch:{ all -> 0x015e }
            monitor-exit(r11)     // Catch:{ all -> 0x015e }
            return r1
        L_0x015e:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x015e }
            throw r0
        L_0x0161:
            r1 = move-exception
            java.lang.String r0 = "languagepackmanager/request-language-pack/invalidproto:"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0167:
            java.lang.String r0 = "languagepackmanager/request-language-pack pack data is invalid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0tf r3 = r30.A02()
            X.0tg r4 = r3.A02     // Catch:{ all -> 0x01b9 }
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = r8.getLanguage()     // Catch:{ all -> 0x01b9 }
            r1[r17] = r0     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = r8.getCountry()     // Catch:{ all -> 0x01b9 }
            r1[r2] = r0     // Catch:{ all -> 0x01b9 }
            r0 = 2
            r1[r0] = r32     // Catch:{ all -> 0x01b9 }
            r0 = r18
            int r0 = r4.A01(r0, r15, r1)     // Catch:{ all -> 0x01b9 }
            if (r0 <= 0) goto L_0x01a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            r1.<init>()     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "language-pack-store/delete-language-pack deleted pack for "
            r1.append(r0)     // Catch:{ all -> 0x01b9 }
            r1.append(r8)     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = " ns="
            r1.append(r0)     // Catch:{ all -> 0x01b9 }
            r1.append(r14)     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01b9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01b9 }
        L_0x01a8:
            r3.close()
            monitor-enter(r11)
            r11.remove(r7)     // Catch:{ all -> 0x01b6 }
            java.util.HashSet r0 = r12.A05     // Catch:{ all -> 0x01b6 }
            r0.add(r7)     // Catch:{ all -> 0x01b6 }
            monitor-exit(r11)     // Catch:{ all -> 0x01b6 }
            return r27
        L_0x01b6:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01b6 }
            throw r0
        L_0x01b9:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x01dd }
            throw r0
        L_0x01be:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01be }
            throw r0
        L_0x01c1:
            X.AnonymousClass1WH.A05(r8)
            monitor-enter(r11)
            r11.remove(r7)     // Catch:{ all -> 0x01cf }
            java.util.HashSet r0 = r12.A05     // Catch:{ all -> 0x01cf }
            r0.add(r7)     // Catch:{ all -> 0x01cf }
            monitor-exit(r11)     // Catch:{ all -> 0x01cf }
            return r27
        L_0x01cf:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01cf }
            throw r0
        L_0x01d2:
            r0 = move-exception
            if (r1 == 0) goto L_0x01d8
            r1.close()     // Catch:{ all -> 0x01d8 }
        L_0x01d8:
            throw r0     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            throw r0
        L_0x01de:
            return r27
        L_0x01df:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01df }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19280yB.A02(java.lang.String, java.util.Locale[]):X.2Cg");
    }
}
