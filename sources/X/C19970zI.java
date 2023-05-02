package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0zI  reason: invalid class name and case insensitive filesystem */
public abstract class C19970zI {
    public int A00;
    public int A01;
    public final C17130ua A02;
    public final C16980tz A03;
    public final C19950zG A04;
    public final C17670vS A05;
    public final C16320sq A06;
    public final Integer A07;
    public volatile boolean A08 = true;
    public volatile boolean A09 = false;

    public C19970zI(C17130ua r2, C16980tz r3, C19950zG r4, C17670vS r5, C16320sq r6, Integer num) {
        this.A03 = r3;
        this.A06 = r6;
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
        this.A07 = num;
        this.A00 = 1;
        this.A01 = 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.io.File A00(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            X.0tz r0 = r3.A03     // Catch:{ all -> 0x0037 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0037 }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ all -> 0x0037 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0037 }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x0037 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0035
            boolean r0 = r2.mkdirs()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0035
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r1.<init>()     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "SimpleAssetDownloader/getAssetDir/Could not make directory "
            r1.append(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ all -> 0x0037 }
            r1.append(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0037 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0037 }
            r0 = 0
            monitor-exit(r3)
            return r0
        L_0x0035:
            monitor-exit(r3)
            return r2
        L_0x0037:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19970zI.A00(java.lang.String):java.io.File");
    }

    public String A01(Object obj) {
        if ((this instanceof C19960zH) || (this instanceof AnonymousClass1JC)) {
            return null;
        }
        if (this instanceof AnonymousClass31s) {
            return ((SharedPreferences) ((AnonymousClass31s) this).A01.A01.get()).getString("payment_background_store_etag", (String) null);
        }
        if (!(this instanceof C25541Ke)) {
            return ((SharedPreferences) ((AnonymousClass1N0) this).A08.A01.get()).getString("bloks_local_tag", (String) null);
        }
        return null;
    }

    public void A02() {
        if (this instanceof AnonymousClass1N0) {
            AnonymousClass1N0 r2 = (AnonymousClass1N0) this;
            C15860rz r3 = r2.A08;
            StringBuilder sb = new StringBuilder("2.23.1.76");
            sb.append(((AnonymousClass1N1) r2.A05).AB2().A03);
            sb.append(" ");
            sb.append(r2.A09.A06());
            r3.A0K().putString("bloks_version", sb.toString()).apply();
        }
    }

    public void A03(C440622p r13, C108005Mh r14, Object obj, String str, String str2) {
        C440622p r4 = r13;
        if (!this.A09) {
            this.A09 = true;
            this.A08 = false;
            this.A06.Ack(new C607936d(this.A02, r4, this, this.A04, this.A05, this.A07, obj, str, str2), new Void[0]);
        } else if (r13 != null) {
            r13.ALw();
        }
    }

    public void A04(Object obj, String str) {
        SharedPreferences.Editor putString;
        if (!(this instanceof C19960zH) && !(this instanceof AnonymousClass1JC)) {
            if (this instanceof AnonymousClass31s) {
                SharedPreferences.Editor A0K = ((AnonymousClass31s) this).A01.A0K();
                putString = str == null ? A0K.remove("payment_background_store_etag") : A0K.putString("payment_background_store_etag", str);
            } else if (!(this instanceof C25541Ke)) {
                putString = ((AnonymousClass1N0) this).A08.A0K().putString("bloks_local_tag", str);
            } else {
                return;
            }
            putString.apply();
        }
    }

    public boolean A05() {
        return this instanceof AnonymousClass1N0;
    }

    public boolean A06(File file) {
        return file == null || file.list() == null || file.list().length == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0237, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        X.C41191vO.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x023b, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01e0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x01e9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0112 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(java.io.InputStream r13, java.lang.Object r14) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.AnonymousClass1JC
            if (r0 == 0) goto L_0x0018
            r4 = r12
            X.1JC r4 = (X.AnonymousClass1JC) r4
            java.lang.String r1 = r4.A00
            if (r1 != 0) goto L_0x01f1
            java.lang.String r0 = "appId"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0018:
            boolean r0 = r12 instanceof X.AnonymousClass31s
            if (r0 == 0) goto L_0x0122
            r3 = r12
            X.31s r3 = (X.AnonymousClass31s) r3
            X.4IL r14 = (X.AnonymousClass4IL) r14
            if (r14 == 0) goto L_0x004f
            java.lang.String r0 = r14.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x004f
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x004a }
            r0.<init>(r13)     // Catch:{ IOException -> 0x004a }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x004a }
            r2.<init>(r0)     // Catch:{ IOException -> 0x004a }
            X.1lo r1 = X.AnonymousClass31s.A00(r2)     // Catch:{ all -> 0x0045 }
            r2.close()     // Catch:{ IOException -> 0x004a }
            if (r1 == 0) goto L_0x021e
            X.0wO r0 = r3.A03
            r0.A04(r1)
            goto L_0x0246
        L_0x0045:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentBackgroundMetadataNetworkClient/handle-network-response-for-background/failed"
            goto L_0x023f
        L_0x004f:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x011d }
            r0.<init>(r13)     // Catch:{ IOException -> 0x011d }
            android.util.JsonReader r1 = new android.util.JsonReader     // Catch:{ IOException -> 0x011d }
            r1.<init>(r0)     // Catch:{ IOException -> 0x011d }
            r1.beginArray()     // Catch:{ all -> 0x0118 }
        L_0x0061:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x0071
            X.1lo r0 = X.AnonymousClass31s.A00(r1)     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x0061
            r8.add(r0)     // Catch:{ all -> 0x0118 }
            goto L_0x0061
        L_0x0071:
            r1.endArray()     // Catch:{ all -> 0x0118 }
            r1.close()     // Catch:{ IOException -> 0x011d }
            X.0wO r7 = r3.A03
            java.lang.String r0 = "PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/size="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r8.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tq r0 = r7.A00
            X.0tf r6 = r0.A02()
            X.1cj r11 = r6.A00()     // Catch:{ all -> 0x0113 }
            X.0tg r5 = r6.A02     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "DELETE FROM payment_background_order"
            X.1ou r0 = r5.A0A(r0)     // Catch:{ all -> 0x010e }
            android.database.sqlite.SQLiteStatement r0 = r0.A00     // Catch:{ all -> 0x010e }
            int r2 = r0.executeUpdateDelete()     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r1.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/background order rows deleted: "
            r1.append(r0)     // Catch:{ all -> 0x010e }
            r1.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x010e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x010e }
            r4 = 0
        L_0x00bb:
            int r0 = r8.size()     // Catch:{ all -> 0x010e }
            if (r4 >= r0) goto L_0x0106
            java.lang.Object r3 = r8.get(r4)     // Catch:{ all -> 0x010e }
            X.1lo r3 = (X.C35361lo) r3     // Catch:{ all -> 0x010e }
            r0 = 2
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x010e }
            r2.<init>(r0)     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "background_id"
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x010e }
            r2.put(r1, r0)     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "background_order"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x010e }
            r2.put(r1, r0)     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "payment_background_order"
            r0 = 5
            long r9 = r5.A06(r2, r1, r0)     // Catch:{ all -> 0x010e }
            r1 = -1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0100
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r1.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/insert background order failed for id: "
            r1.append(r0)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x010e }
            r1.append(r0)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x010e }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x010e }
        L_0x0100:
            r7.A03(r6, r3)     // Catch:{ all -> 0x010e }
            int r4 = r4 + 1
            goto L_0x00bb
        L_0x0106:
            r11.A00()     // Catch:{ all -> 0x010e }
            r11.close()     // Catch:{ all -> 0x0113 }
            goto L_0x0243
        L_0x010e:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0112 }
        L_0x0112:
            throw r0     // Catch:{ all -> 0x0113 }
        L_0x0113:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0117 }
        L_0x0117:
            throw r0
        L_0x0118:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x011c }
        L_0x011c:
            throw r0     // Catch:{ IOException -> 0x011d }
        L_0x011d:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentBackgroundMetadataNetworkClient/handle-network-response/failed"
            goto L_0x023f
        L_0x0122:
            boolean r0 = r12 instanceof X.C25541Ke
            if (r0 == 0) goto L_0x012e
            r0 = r12
            X.1Ke r0 = (X.C25541Ke) r0
            boolean r0 = r0.A0D(r13)
            return r0
        L_0x012e:
            java.lang.String r0 = X.AnonymousClass1N0.A0F
            java.io.File r0 = r12.A00(r0)
            if (r0 == 0) goto L_0x0139
            X.AnonymousClass1XI.A0O(r0)
        L_0x0139:
            java.lang.String r0 = X.AnonymousClass1N0.A0G
            java.io.File r7 = r12.A00(r0)
            java.lang.String r0 = X.AnonymousClass1N0.A0H
            java.io.File r6 = r12.A00(r0)
            if (r7 == 0) goto L_0x01ee
            if (r6 == 0) goto L_0x01ee
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x01ea }
            r2.<init>(r13)     // Catch:{ IOException -> 0x01ea }
        L_0x014e:
            java.util.zip.ZipEntry r5 = r2.getNextEntry()     // Catch:{ all -> 0x01e5 }
            if (r5 == 0) goto L_0x01e1
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x01e5 }
            java.lang.String r4 = X.AnonymousClass1XI.A08(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r1.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = X.AnonymousClass1XI.A09(r0)     // Catch:{ all -> 0x01e5 }
            r1.append(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "."
            r1.append(r0)     // Catch:{ all -> 0x01e5 }
            r1.append(r4)     // Catch:{ all -> 0x01e5 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "png"
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x01ba
            java.lang.String r1 = r7.getCanonicalPath()     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x01e5 }
            java.io.File r3 = X.AnonymousClass1XI.A05(r1, r0)     // Catch:{ all -> 0x01e5 }
            if (r3 != 0) goto L_0x01a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r1.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "BloksAssetManager/store/malicious zip file: "
            r1.append(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x01e5 }
            r1.append(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01e5 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01e5 }
            goto L_0x01d8
        L_0x01a7:
            java.io.File r1 = r3.getParentFile()     // Catch:{ all -> 0x01e5 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x01b4
            r1.mkdirs()     // Catch:{ all -> 0x01e5 }
        L_0x01b4:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x01e5 }
            r1.<init>(r3)     // Catch:{ all -> 0x01e5 }
            goto L_0x01d0
        L_0x01ba:
            java.lang.String r0 = "json"
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x014e
            java.lang.String r1 = r6.getAbsolutePath()     // Catch:{ all -> 0x01e5 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x01e5 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x01e5 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x01e5 }
            r1.<init>(r0)     // Catch:{ all -> 0x01e5 }
        L_0x01d0:
            X.AnonymousClass1XI.A0H(r2, r1)     // Catch:{ all -> 0x01dc }
            r1.close()     // Catch:{ all -> 0x01e5 }
            goto L_0x014e
        L_0x01d8:
            r2.close()     // Catch:{ IOException -> 0x01ea }
            goto L_0x021e
        L_0x01dc:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x01e0 }
        L_0x01e0:
            throw r0     // Catch:{ all -> 0x01e5 }
        L_0x01e1:
            r2.close()     // Catch:{ IOException -> 0x01ea }
            goto L_0x0246
        L_0x01e5:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x01e9 }
        L_0x01e9:
            throw r0     // Catch:{ IOException -> 0x01ea }
        L_0x01ea:
            r1 = move-exception
            java.lang.String r0 = "BloksAssetManager/store/Failed!"
            goto L_0x023f
        L_0x01ee:
            java.lang.String r0 = "BloksAssetManager/store/Could not prepare resource subdirectory"
            goto L_0x021b
        L_0x01f1:
            java.lang.String r0 = "_layout.json"
            java.lang.String r3 = X.C18450wi.A06(r1, r0)
            java.lang.String r2 = "phoenix_bloks_layout"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.io.File r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x0213
            X.AnonymousClass1XI.A0N(r0)
        L_0x0213:
            java.io.File r0 = r4.A00(r2)
            if (r0 != 0) goto L_0x0220
            java.lang.String r0 = "PhoenixBloksAssetDownloader/storeAssets: Could not prepare resource directory"
        L_0x021b:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x021e:
            r0 = 0
            return r0
        L_0x0220:
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x023c }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x023c }
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x023c }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x023c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x023c }
            X.AnonymousClass1XI.A0H(r13, r2)     // Catch:{ all -> 0x0235 }
            r2.close()     // Catch:{ IOException -> 0x023c }
            goto L_0x0246
        L_0x0235:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0237 }
        L_0x0237:
            r0 = move-exception
            X.C41191vO.A00(r2, r1)     // Catch:{ IOException -> 0x023c }
            throw r0     // Catch:{ IOException -> 0x023c }
        L_0x023c:
            r1 = move-exception
            java.lang.String r0 = "PhoenixBloksAssetDownloader/storeAssets"
        L_0x023f:
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x021e
        L_0x0243:
            r6.close()
        L_0x0246:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19970zI.A07(java.io.InputStream, java.lang.Object):boolean");
    }

    public boolean A08(Object obj) {
        if ((this instanceof C19960zH) || (this instanceof AnonymousClass1JC)) {
            return false;
        }
        if (this instanceof AnonymousClass31s) {
            return !TextUtils.isEmpty(((SharedPreferences) ((AnonymousClass31s) this).A01.A01.get()).getString("payment_background_store_etag", (String) null));
        }
        if (!(this instanceof C25541Ke)) {
            return ((AnonymousClass1N0) this).A0E();
        }
        return false;
    }

    public boolean A09(String str, byte[] bArr) {
        Map map;
        if (this instanceof C19960zH) {
            try {
                URI uri = new URI(((C19960zH) this).A01);
                if (uri.getQuery() == null) {
                    map = AnonymousClass1Z8.A00;
                } else {
                    String query = uri.getQuery();
                    C18450wi.A0B(query);
                    List<String> A092 = C008603x.A09(query, new String[]{"&"}, 0);
                    ArrayList arrayList = new ArrayList();
                    for (String A093 : A092) {
                        List A094 = C008603x.A09(A093, new String[]{"="}, 2);
                        if (A094.size() == 2) {
                            if (!A094.isEmpty()) {
                                Iterator it = A094.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (C008703y.A0L((String) it.next())) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            arrayList.add(A094);
                        }
                    }
                    int A072 = C25421Js.A07(AnonymousClass1J9.A0M(arrayList, 10));
                    if (A072 < 16) {
                        A072 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(A072);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        List list = (List) it2.next();
                        linkedHashMap.put(list.get(0), list.get(1));
                    }
                    map = linkedHashMap;
                }
                return C115135pC.A00((String) map.get("signature"), bArr);
            } catch (GeneralSecurityException unused) {
                return false;
            }
        } else if ((this instanceof AnonymousClass1JC) || (this instanceof AnonymousClass31s) || (this instanceof C25541Ke)) {
            return true;
        } else {
            AnonymousClass1N0 r4 = (AnonymousClass1N0) this;
            try {
                return !TextUtils.isEmpty(str) && C115135pC.A00(str, bArr);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("BloksAssetManager/verifySignature: ");
                sb.append(r4.A0B());
                sb.append("Exception:");
                sb.append(e2);
                Log.e(sb.toString());
            }
        }
    }
}
