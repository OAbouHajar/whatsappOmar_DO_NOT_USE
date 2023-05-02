package X;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1OB  reason: invalid class name */
public class AnonymousClass1OB {
    public final C16300so A00;
    public final C17180uf A01;
    public final AnonymousClass1I3 A02;
    public final C26631On A03;
    public final C16440t3 A04;
    public final C16320sq A05;
    public final ReadWriteLock A06 = new ReentrantReadWriteLock();

    public AnonymousClass1OB(C16300so r2, C17180uf r3, AnonymousClass1I3 r4, C26631On r5, C16440t3 r6, C16320sq r7) {
        this.A04 = r6;
        this.A01 = r3;
        this.A05 = r7;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019f, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x021f, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x0253 */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0029 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x023c A[Catch:{ all -> 0x024f, all -> 0x0253, all -> 0x0254 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00() {
        /*
            r17 = this;
            r2 = r17
            X.1I3 r0 = r2.A02
            java.io.File r1 = r0.A00()
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x026f
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x025d }
            r5.<init>()     // Catch:{ Exception -> 0x025d }
            java.util.concurrent.locks.ReadWriteLock r4 = r2.A06     // Catch:{ Exception -> 0x025d }
            java.util.concurrent.locks.Lock r0 = r4.readLock()     // Catch:{ Exception -> 0x025d }
            r0.lock()     // Catch:{ Exception -> 0x025d }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x0254 }
            r0.<init>(r1)     // Catch:{ all -> 0x0254 }
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ all -> 0x0254 }
            r3.<init>(r0)     // Catch:{ all -> 0x0254 }
            r3.beginArray()     // Catch:{ all -> 0x024f }
        L_0x0029:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x0241
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x024f }
            r6.<init>()     // Catch:{ all -> 0x024f }
            r3.beginObject()     // Catch:{ all -> 0x024f }
        L_0x0037:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = r3.nextName()     // Catch:{ all -> 0x024f }
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x024f }
            r6.put(r1, r0)     // Catch:{ all -> 0x024f }
            goto L_0x0037
        L_0x0049:
            r3.endObject()     // Catch:{ all -> 0x024f }
            X.1On r10 = r2.A03     // Catch:{ all -> 0x024f }
            java.lang.String r7 = "type"
            java.lang.Object r1 = r6.get(r7)     // Catch:{ all -> 0x024f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x024f }
            boolean r0 = X.AnonymousClass1ZW.A0E(r1)     // Catch:{ all -> 0x024f }
            if (r0 != 0) goto L_0x01b2
            X.14A r9 = r10.A02     // Catch:{ all -> 0x024f }
            X.0so r8 = r10.A00     // Catch:{ all -> 0x024f }
            java.lang.String r1 = X.AnonymousClass2RB.A00(r8, r9, r1)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = "TEXT_QUERY"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x024f }
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = "BUSINESS_PROFILE"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x011e
            java.util.Set r0 = r6.entrySet()     // Catch:{ all -> 0x024f }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x024f }
            java.lang.String r12 = ""
            r13 = r12
            r14 = r12
            r15 = 1
            r1 = 0
        L_0x0084:
            boolean r6 = r11.hasNext()     // Catch:{ all -> 0x024f }
            r0 = 3
            if (r6 == 0) goto L_0x0111
            java.lang.Object r6 = r11.next()     // Catch:{ all -> 0x024f }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x024f }
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x024f }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x024f }
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)     // Catch:{ all -> 0x024f }
            if (r0 != 0) goto L_0x0084
            java.lang.Object r10 = r6.getKey()     // Catch:{ all -> 0x024f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x024f }
            int r0 = r10.hashCode()     // Catch:{ all -> 0x024f }
            switch(r0) {
                case 105221: goto L_0x00fb;
                case 3575610: goto L_0x00f4;
                case 55126294: goto L_0x00d8;
                case 629885866: goto L_0x00c3;
                case 1296516636: goto L_0x00b0;
                default: goto L_0x00aa;
            }     // Catch:{ all -> 0x024f }
        L_0x00aa:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/mapBusinessItemSelection Illegal field type for item. This field won't be mapped to the item."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x024f }
            goto L_0x0084
        L_0x00b0:
            java.lang.String r0 = "categories"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x024f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x024f }
            java.lang.String r13 = X.AnonymousClass2RB.A00(r8, r9, r0)     // Catch:{ all -> 0x024f }
            goto L_0x0084
        L_0x00c3:
            java.lang.String r0 = "business_name"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x00aa
            int r1 = r1 + 1
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x024f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x024f }
            java.lang.String r12 = X.AnonymousClass2RB.A00(r8, r9, r0)     // Catch:{ all -> 0x024f }
            goto L_0x0084
        L_0x00d8:
            java.lang.String r0 = "timestamp"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x00aa
            int r1 = r1 + 1
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x024f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = X.AnonymousClass2RB.A00(r8, r9, r0)     // Catch:{ all -> 0x024f }
            long r15 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x024f }
            goto L_0x0084
        L_0x00f4:
            boolean r0 = r10.equals(r7)     // Catch:{ all -> 0x024f }
            if (r0 != 0) goto L_0x0084
            goto L_0x00aa
        L_0x00fb:
            java.lang.String r0 = "jid"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x00aa
            int r1 = r1 + 1
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x024f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x024f }
            java.lang.String r14 = X.AnonymousClass2RB.A00(r8, r9, r0)     // Catch:{ all -> 0x024f }
            goto L_0x0084
        L_0x0111:
            if (r1 != r0) goto L_0x011a
            X.1mH r11 = new X.1mH     // Catch:{ all -> 0x024f }
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x024f }
            goto L_0x023a
        L_0x011a:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/mapBusinessItemSelection Could not map all the necessary fields. Item won't be shown to the user"
            goto L_0x0236
        L_0x011e:
            java.lang.String r0 = "CATEGORY_SEARCH"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x0234
            java.util.Set r0 = r6.entrySet()     // Catch:{ all -> 0x024f }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x024f }
            java.lang.String r12 = ""
            r0 = 1
            r11 = 0
            r10 = r12
        L_0x0134:
            boolean r13 = r15.hasNext()     // Catch:{ all -> 0x024f }
            r6 = 3
            if (r13 == 0) goto L_0x01a9
            java.lang.Object r13 = r15.next()     // Catch:{ all -> 0x024f }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ all -> 0x024f }
            java.lang.Object r6 = r13.getValue()     // Catch:{ all -> 0x024f }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x024f }
            boolean r6 = X.AnonymousClass1ZW.A0E(r6)     // Catch:{ all -> 0x024f }
            if (r6 != 0) goto L_0x0134
            java.lang.Object r14 = r13.getKey()     // Catch:{ all -> 0x024f }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x024f }
            int r6 = r14.hashCode()     // Catch:{ all -> 0x024f }
            switch(r6) {
                case 3575610: goto L_0x01a2;
                case 55126294: goto L_0x0186;
                case 338683180: goto L_0x0173;
                case 1537780732: goto L_0x0160;
                default: goto L_0x015a;
            }     // Catch:{ all -> 0x024f }
        L_0x015a:
            java.lang.String r6 = "DirectoryRecentSearchJsonIOManager/mapCategoryItemSelection Illegal field type for item. This field won't be mapped to the item."
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ all -> 0x024f }
            goto L_0x0134
        L_0x0160:
            java.lang.String r6 = "category_id"
            boolean r6 = r14.equals(r6)     // Catch:{ all -> 0x024f }
            if (r6 == 0) goto L_0x015a
            java.lang.Object r6 = r13.getValue()     // Catch:{ all -> 0x024f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x024f }
            java.lang.String r10 = X.AnonymousClass2RB.A00(r8, r9, r6)     // Catch:{ all -> 0x024f }
            goto L_0x019f
        L_0x0173:
            java.lang.String r6 = "category_name"
            boolean r6 = r14.equals(r6)     // Catch:{ all -> 0x024f }
            if (r6 == 0) goto L_0x015a
            java.lang.Object r6 = r13.getValue()     // Catch:{ all -> 0x024f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x024f }
            java.lang.String r12 = X.AnonymousClass2RB.A00(r8, r9, r6)     // Catch:{ all -> 0x024f }
            goto L_0x019f
        L_0x0186:
            java.lang.String r6 = "timestamp"
            boolean r6 = r14.equals(r6)     // Catch:{ all -> 0x024f }
            if (r6 == 0) goto L_0x015a
            java.lang.Object r0 = r13.getValue()     // Catch:{ all -> 0x024f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = X.AnonymousClass2RB.A00(r8, r9, r0)     // Catch:{ all -> 0x024f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x024f }
        L_0x019f:
            int r11 = r11 + 1
            goto L_0x0134
        L_0x01a2:
            boolean r6 = r14.equals(r7)     // Catch:{ all -> 0x024f }
            if (r6 != 0) goto L_0x0134
            goto L_0x015a
        L_0x01a9:
            if (r11 != r6) goto L_0x0231
            X.2RC r11 = new X.2RC     // Catch:{ all -> 0x024f }
            r11.<init>(r12, r10, r0)     // Catch:{ all -> 0x024f }
            goto L_0x023a
        L_0x01b2:
            java.util.Set r0 = r6.entrySet()     // Catch:{ all -> 0x024f }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x024f }
            java.lang.String r8 = ""
            r0 = 1
            r11 = 0
        L_0x01bf:
            boolean r9 = r13.hasNext()     // Catch:{ all -> 0x024f }
            r6 = 2
            if (r9 == 0) goto L_0x0229
            java.lang.Object r9 = r13.next()     // Catch:{ all -> 0x024f }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ all -> 0x024f }
            java.lang.Object r6 = r9.getValue()     // Catch:{ all -> 0x024f }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x024f }
            boolean r6 = X.AnonymousClass1ZW.A0E(r6)     // Catch:{ all -> 0x024f }
            if (r6 != 0) goto L_0x01bf
            java.lang.Object r12 = r9.getKey()     // Catch:{ all -> 0x024f }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x024f }
            int r6 = r12.hashCode()     // Catch:{ all -> 0x024f }
            switch(r6) {
                case 3575610: goto L_0x0222;
                case 55126294: goto L_0x0202;
                case 107944136: goto L_0x01eb;
                default: goto L_0x01e5;
            }     // Catch:{ all -> 0x024f }
        L_0x01e5:
            java.lang.String r6 = "DirectoryRecentSearchJsonIOManager/mapSearchQuery Illegal field type for item. This field won't be mapped to the item."
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ all -> 0x024f }
            goto L_0x01bf
        L_0x01eb:
            java.lang.String r6 = "query"
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x024f }
            if (r6 == 0) goto L_0x01e5
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x024f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x024f }
            X.14A r8 = r10.A02     // Catch:{ all -> 0x024f }
            X.0so r6 = r10.A00     // Catch:{ all -> 0x024f }
            java.lang.String r8 = X.AnonymousClass2RB.A00(r6, r8, r9)     // Catch:{ all -> 0x024f }
            goto L_0x021f
        L_0x0202:
            java.lang.String r6 = "timestamp"
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x024f }
            if (r6 == 0) goto L_0x01e5
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x024f }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x024f }
            X.14A r1 = r10.A02     // Catch:{ all -> 0x024f }
            X.0so r0 = r10.A00     // Catch:{ all -> 0x024f }
            java.lang.String r0 = X.AnonymousClass2RB.A00(r0, r1, r6)     // Catch:{ all -> 0x024f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x024f }
        L_0x021f:
            int r11 = r11 + 1
            goto L_0x01bf
        L_0x0222:
            boolean r6 = r12.equals(r7)     // Catch:{ all -> 0x024f }
            if (r6 != 0) goto L_0x01bf
            goto L_0x01e5
        L_0x0229:
            if (r11 != r6) goto L_0x0231
            X.1mF r11 = new X.1mF     // Catch:{ all -> 0x024f }
            r11.<init>(r8, r0)     // Catch:{ all -> 0x024f }
            goto L_0x023a
        L_0x0231:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/mapSearchQuery Could not map all the necessary fields. Item won't be shown to the user"
            goto L_0x0236
        L_0x0234:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/map Could not map one of the items to DirectoryRecentSearch. Unknwon type"
        L_0x0236:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x024f }
            r11 = 0
        L_0x023a:
            if (r11 == 0) goto L_0x0029
            r5.add(r11)     // Catch:{ all -> 0x024f }
            goto L_0x0029
        L_0x0241:
            r3.endArray()     // Catch:{ all -> 0x024f }
            r3.close()     // Catch:{ all -> 0x0254 }
            java.util.concurrent.locks.Lock r0 = r4.readLock()     // Catch:{ Exception -> 0x025d }
            r0.unlock()     // Catch:{ Exception -> 0x025d }
            goto L_0x0270
        L_0x024f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0253 }
        L_0x0253:
            throw r0     // Catch:{ all -> 0x0254 }
        L_0x0254:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r4.readLock()     // Catch:{ Exception -> 0x025d }
            r0.unlock()     // Catch:{ Exception -> 0x025d }
            throw r1     // Catch:{ Exception -> 0x025d }
        L_0x025d:
            r1 = move-exception
            java.lang.String r0 = "DirectoryRecentSearchManagerImpl/getRecentSearchList: Failed to load recent search history"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r3 = r2.A00
            java.lang.String r2 = r1.toString()
            r1 = 0
            java.lang.String r0 = "getRecentSearchList/getRecentSearchList: Failed to load recent search history"
            r3.AcB(r0, r2, r1)
        L_0x026f:
            r5 = 0
        L_0x0270:
            if (r5 != 0) goto L_0x0277
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0277:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OB.A00():java.util.List");
    }
}
