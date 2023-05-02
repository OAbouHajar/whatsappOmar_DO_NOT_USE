package X;

import java.io.File;

/* renamed from: X.5hX  reason: invalid class name and case insensitive filesystem */
public class C111865hX extends C19970zI {
    public final C16980tz A00;
    public final AnonymousClass013 A01;
    public final C19950zG A02;
    public final C18490wm A03;
    public final C18300wT A04;
    public final C17670vS A05;

    public C111865hX(C17130ua r8, C16980tz r9, AnonymousClass013 r10, C19950zG r11, C18490wm r12, C18300wT r13, C17670vS r14, C16320sq r15) {
        super(r8, r9, r11, r14, r15, 14);
        this.A00 = r9;
        this.A01 = r10;
        this.A05 = r14;
        this.A02 = r11;
        this.A04 = r13;
        this.A03 = r12;
    }

    public synchronized File A00(String str) {
        File file = new File(this.A00.A00.getFilesDir(), str);
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    public /* bridge */ /* synthetic */ String A01(Object obj) {
        return C13700nu.A0E(this.A04.A01(), "payments_error_map_tag");
    }

    public /* bridge */ /* synthetic */ void A04(Object obj, String str) {
        C13680ns.A0y(C110105dW.A06(this.A04), "payments_error_map_tag", str);
    }

    public boolean A05() {
        return true;
    }

    public boolean A06(File file) {
        return file == null || file.length() == 0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A07(java.io.InputStream r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.String r2 = "payments_error_map.json"
            java.io.File r0 = r3.A00(r2)
            if (r0 == 0) goto L_0x000b
            X.AnonymousClass1XI.A0N(r0)
        L_0x000b:
            java.lang.String r0 = ""
            java.io.File r0 = super.A00(r0)
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "PAY:ErrorMapAssetManager/storeAssets/ Could not prepare resource directory"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x001a:
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0035 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0035 }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x0035 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0035 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0035 }
            X.AnonymousClass1XI.A0H(r4, r1)     // Catch:{ all -> 0x0030 }
            r1.close()     // Catch:{ IOException -> 0x0035 }
            r0 = 1
            return r0
        L_0x0030:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            throw r0     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            r1 = move-exception
            java.lang.String r0 = "PAY:ErrorMapAssetManager/store Failed!"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111865hX.A07(java.io.InputStream, java.lang.Object):boolean");
    }

    public /* bridge */ /* synthetic */ boolean A08(Object obj) {
        return !A06(A00("payments_error_map.json"));
    }

    public boolean A09(String str, byte[] bArr) {
        return true;
    }

    public void A0A() {
        File A002;
        AnonymousClass60E r8 = new AnonymousClass60E(this);
        C18300wT r1 = this.A04;
        if (r1.A01.A00() - r1.A01().getLong("payments_error_map_last_sync_time_millis", (System.currentTimeMillis() - 604800000) - 1) > 604800000 || A0B()) {
            if (A0B() && (A002 = A00("payments_error_map.json")) != null) {
                AnonymousClass1XI.A0N(A002);
            }
            String AB5 = this.A03.AB5();
            StringBuilder A0r = AnonymousClass000.A0r("https://static.whatsapp.net/payments/error_map?product_type=payments_p2p_fbpay&country=");
            A0r.append(AB5);
            A0r.append("&lg=");
            A0r.append(this.A01.A06());
            A0r.append("&platform=android&app_type=");
            A0r.append("CONSUMER");
            A0r.append("&api_version=");
            super.A03(r8, (C108005Mh) null, (Object) null, AnonymousClass000.A0h("1", A0r), (String) null);
        }
    }

    public boolean A0B() {
        String A0E = C13700nu.A0E(this.A04.A01(), "error_map_key");
        String AB5 = this.A03.AB5();
        if (A0E == null) {
            return true;
        }
        String[] split = A0E.split("_");
        return !split[0].equals(AB5) || !split[1].equals(this.A01.A06()) || !split[2].equals("1");
    }
}
