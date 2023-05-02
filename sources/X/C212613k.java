package X;

import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.13k  reason: invalid class name and case insensitive filesystem */
public class C212613k extends C206811e {
    public final C16180sb A00;
    public final C14870pt A01;
    public final AnonymousClass01Z A02;
    public final C16480t8 A03;
    public final AnonymousClass1z0 A04;
    public final C37751pf A05 = new C37751pf();
    public final AnonymousClass14W A06;
    public final AnonymousClass1CX A07;
    public final C210012k A08;
    public final AnonymousClass1WA A09;
    public final Map A0A = new HashMap();
    public final boolean A0B;

    public C212613k(C212413i r3, C212313h r4, C16180sb r5, C14870pt r6, AnonymousClass01Z r7, C16480t8 r8, AnonymousClass14W r9, AnonymousClass1CX r10, C210012k r11, C16320sq r12, boolean z2) {
        super(new C42961yz((C212413i) r4.A00.A01.A8k.get(), z2), 32);
        this.A01 = r6;
        this.A00 = r5;
        this.A08 = r11;
        this.A0B = z2;
        this.A06 = r9;
        this.A07 = r10;
        this.A03 = r8;
        this.A04 = new AnonymousClass1z0((C209912j) r3.A00.A01.ANs.get(), z2);
        this.A02 = r7;
        this.A09 = new AnonymousClass1WA(r12, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.AnonymousClass1z1 r9, X.C212613k r10, X.C34151jm r11, long r12) {
        /*
            r4 = r11
            boolean r0 = r11.A0H
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = r11.A05
            if (r1 != 0) goto L_0x001b
            java.lang.String r0 = "RecentStickers/ sent sticker avatar sticker template id is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "Avatar Sticker with NULL template ID found"
            X.AnonymousClass00B.A08(r0)
        L_0x0013:
            java.lang.String r0 = r11.A0D
            if (r0 == 0) goto L_0x001a
            r9.APS(r0)
        L_0x001a:
            return
        L_0x001b:
            X.12k r0 = r10.A08
            X.1jm r4 = r0.A00(r1)
            if (r4 != 0) goto L_0x0026
            java.lang.String r0 = "RecentStickers/unable to find matching sticker by avatar template id"
            goto L_0x002c
        L_0x0026:
            java.lang.String r0 = r4.A09
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "RecentStickers/add file path is null"
        L_0x002c:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0013
        L_0x0030:
            java.lang.String r1 = r4.A0D
            if (r1 != 0) goto L_0x0037
            java.lang.String r0 = "RecentStickers/add file hash is null"
            goto L_0x002c
        L_0x0037:
            boolean r0 = r10.A0I(r1)
            if (r0 == 0) goto L_0x00cc
            java.util.Map r5 = r10.A0A
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
        L_0x004f:
            long r2 = java.lang.Math.max(r12, r0)
            boolean r3 = r10.A0H(r4, r2)
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0090
            if (r3 == 0) goto L_0x0090
            java.lang.String r8 = r4.A0D
            X.AnonymousClass00B.A06(r8)
            X.1z0 r0 = r10.A04
            if (r8 != 0) goto L_0x00a0
            java.lang.String r0 = "RecentStickerDBStorage/updateLastStickerSentTs/sticker filehash is null, could not be updated"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006b:
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r5.put(r8, r0)
            java.util.List r0 = super.A02()
            java.util.Iterator r2 = r0.iterator()
        L_0x007a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r1 = r2.next()
            X.1z2 r1 = (X.AnonymousClass1z2) r1
            java.lang.String r0 = r1.A02
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x007a
            r1.A00 = r12
        L_0x0090:
            X.0pt r3 = r10.A01
            X.14W r2 = r10.A06
            r1 = 9
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r0.<init>(r2, r1)
            r3.Acq(r0)
            goto L_0x0013
        L_0x00a0:
            X.12j r0 = r0.A00
            X.0tf r7 = r0.A02()
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x00f1 }
            r1 = 0
            java.lang.String r0 = r4.A0D     // Catch:{ all -> 0x00f1 }
            r6[r1] = r0     // Catch:{ all -> 0x00f1 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00f1 }
            r3.<init>()     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = "last_sticker_sent_ts"
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x00f1 }
            r3.put(r1, r0)     // Catch:{ all -> 0x00f1 }
            X.0tg r2 = r7.A02     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = "recent_stickers"
            java.lang.String r0 = "plaintext_hash = ?"
            r2.A00(r1, r3, r0, r6)     // Catch:{ all -> 0x00f1 }
            r7.close()
            goto L_0x006b
        L_0x00c9:
            r0 = 0
            goto L_0x004f
        L_0x00cc:
            java.lang.String r0 = r4.A09
            r1 = 1
            if (r0 == 0) goto L_0x00ec
            int r0 = r4.A01
            if (r0 == r1) goto L_0x00ec
            X.1CX r0 = r10.A07
            java.io.File r0 = r0.A04(r4)
        L_0x00db:
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = r0.getAbsolutePath()
            r4.A09 = r0
            r4.A01 = r1
            X.C37711pb.A00(r4)
            r10.A0H(r4, r12)
            goto L_0x0090
        L_0x00ec:
            java.io.File r0 = r10.A0B(r4)
            goto L_0x00db
        L_0x00f1:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212613k.A00(X.1z1, X.13k, X.1jm, long):void");
    }

    public void A08(int i2) {
        AnonymousClass00B.A00();
        AnonymousClass1z2 r3 = (AnonymousClass1z2) A01(i2);
        StringBuilder sb = new StringBuilder("RecentStickers/removeEntry/removing entry: ");
        sb.append(r3.toString());
        Log.i(sb.toString());
        AnonymousClass01Z r0 = this.A02;
        String str = r3.A02;
        r0.A07(str);
        this.A05.A02(str, r3.A03);
        this.A0A.remove(str);
        super.A08(i2);
    }

    public /* bridge */ /* synthetic */ void A09(C37891pu r5) {
        AnonymousClass1z3 r52 = (AnonymousClass1z3) r5;
        AnonymousClass00B.A00();
        StringBuilder sb = new StringBuilder("RecentStickers/addEntry/adding entry:");
        sb.append(r52.toString());
        Log.i(sb.toString());
        C37751pf r2 = this.A05;
        AnonymousClass1z2 r1 = r52.A01;
        String str = r1.A02;
        r2.A01(str, r1.A03);
        this.A0A.put(str, Long.valueOf(r1.A00));
        super.A09(r52);
    }

    public Pair A0A(String str) {
        for (C34151jm r2 : A0C()) {
            if (str.equals(r2.A0D)) {
                Map map = this.A0A;
                return new Pair(r2, Long.valueOf(map.containsKey(str) ? ((Number) map.get(str)).longValue() : 0));
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r0 == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A0B(X.C34151jm r7) {
        /*
            r6 = this;
            X.AnonymousClass00B.A00()
            java.lang.String r0 = r7.A0D
            r5 = 0
            if (r0 == 0) goto L_0x0068
            X.01Z r3 = r6.A02
            java.io.File r4 = r3.A03(r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x001e
            r4.getAbsolutePath()
        L_0x0017:
            java.lang.String r0 = r7.A0D
            java.io.File r0 = r3.A02(r0)
            return r0
        L_0x001e:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = r4.getAbsolutePath()
            java.lang.String r1 = r7.A09
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0068
            if (r1 == 0) goto L_0x0068
            X.AnonymousClass00B.A00()
            java.lang.String r0 = r7.A09
            if (r0 == 0) goto L_0x0062
            r4.getAbsolutePath()     // Catch:{ IOException -> 0x004b }
            X.0sb r2 = r6.A00     // Catch:{ IOException -> 0x004b }
            java.lang.String r0 = r7.A09     // Catch:{ IOException -> 0x004b }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x004b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x004b }
            X.0tB r0 = r2.A04     // Catch:{ IOException -> 0x004b }
            X.AnonymousClass1XI.A0B(r0, r1, r4)     // Catch:{ IOException -> 0x004b }
            goto L_0x0064
        L_0x004b:
            java.lang.String r0 = "RecentStickers/copyFile/error copying file sticker"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A0E
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = ""
        L_0x0058:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0062:
            r0 = 0
            goto L_0x0065
        L_0x0064:
            r0 = 1
        L_0x0065:
            if (r0 == 0) goto L_0x0068
            goto L_0x0017
        L_0x0068:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212613k.A0B(X.1jm):java.io.File");
    }

    public List A0C() {
        List<AnonymousClass1z2> A022 = super.A02();
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass1z2 r3 : A022) {
            C37751pf r1 = this.A05;
            String str = r3.A02;
            r1.A01(str, r3.A03);
            this.A0A.put(str, Long.valueOf(r3.A00));
            C34151jm r32 = r3.A04;
            String str2 = r32.A0D;
            if (str2 == null) {
                r32.A0D = str;
                str2 = str;
            }
            r32.A0C = "image/webp";
            if (str2 == null) {
                Log.e("RecentStickers/setRecentStickerFilePath/sticker param has null file hash");
            } else {
                File A032 = this.A02.A03(str2);
                r32.A09 = A032.getAbsolutePath();
                r32.A01 = 1;
                if (A032.getAbsolutePath() != null) {
                    C37711pb.A00(r32);
                }
            }
            arrayList.add(r32.clone());
        }
        return arrayList;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0143 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0D() {
        /*
            r10 = this;
            java.util.List r9 = super.A02()
            java.util.Iterator r8 = r9.iterator()
        L_0x0008:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r6 = r8.next()
            X.1z2 r6 = (X.AnonymousClass1z2) r6
            X.1z0 r5 = r10.A04
            java.lang.String r3 = r6.A02
            r7 = 1
            java.lang.String[] r4 = new java.lang.String[r7]
            r0 = 0
            r4[r0] = r3
            X.12j r0 = r5.A00
            X.0tf r1 = r0.get()
            X.0tg r2 = r1.A02     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "SELECT plaintext_hash, entry_weight, hash_of_image_part, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avocado, last_sticker_sent_ts, avatar_template_id FROM recent_stickers WHERE plaintext_hash = ?"
            android.database.Cursor r2 = r2.A08(r0, r4)     // Catch:{ all -> 0x0144 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x0115
            X.1jm r4 = new X.1jm     // Catch:{ all -> 0x013d }
            r4.<init>()     // Catch:{ all -> 0x013d }
            r4.A0D = r3     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "url"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x013d }
            r4.A0G = r0     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "enc_hash"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x013d }
            r4.A08 = r0     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "direct_path"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x013d }
            r4.A06 = r0     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "mimetype"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x013d }
            r4.A0C = r0     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "media_key"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x013d }
            r4.A0B = r0     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "file_size"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013d }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x013d }
            r4.A00 = r0     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "width"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013d }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x013d }
            r4.A03 = r0     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "height"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013d }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x013d }
            r4.A02 = r0     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "emojis"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x013d }
            r4.A07 = r0     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "is_first_party"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013d }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x013d }
            if (r0 == r7) goto L_0x00b4
            r7 = 0
        L_0x00b4:
            r4.A0I = r7     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "avatar_template_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x013d }
            r4.A05 = r0     // Catch:{ all -> 0x013d }
            X.C37711pb.A00(r4)     // Catch:{ all -> 0x013d }
            r2.close()     // Catch:{ all -> 0x0144 }
            r1.close()
            java.lang.String r0 = r4.A06
            if (r0 != 0) goto L_0x0111
            X.0t8 r2 = r10.A03
            r1 = 20
            r0 = 1
            X.1f5 r1 = r2.A08(r3, r1, r0)
            if (r1 == 0) goto L_0x0131
            X.1jm r4 = new X.1jm
            r4.<init>()
            r4.A0D = r3
            java.lang.String r0 = r1.A04
            r4.A0G = r0
            java.lang.String r0 = r1.A03
            r4.A08 = r0
            X.0ta r3 = r1.A02
            java.lang.String r0 = r3.A0G
            r4.A06 = r0
            java.lang.String r0 = "image/webp"
            r4.A0C = r0
            byte[] r1 = r3.A0U
            if (r1 == 0) goto L_0x00fe
            r0 = 3
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            r4.A0B = r0
        L_0x00fe:
            long r1 = r3.A0A
            int r0 = (int) r1
            r4.A00 = r0
            int r0 = r3.A08
            r4.A03 = r0
            int r0 = r3.A06
            r4.A02 = r0
            X.C37711pb.A00(r4)
            r5.A00(r4)
        L_0x0111:
            r6.A00(r4)
            goto L_0x0131
        L_0x0115:
            r2.close()     // Catch:{ all -> 0x0144 }
            r1.close()
            java.lang.String r1 = "RecentStickerDBStorage/getStickerFromFileHash/sticker unable to be retrieved from recent stickers db: filehash = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "RecentStickers/getStickerListAndWeights/recent sticker not found in db"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0131:
            X.1jm r1 = r6.A04
            java.lang.String r0 = r1.A0C
            if (r0 != 0) goto L_0x0008
            java.lang.String r0 = "image/webp"
            r1.A0C = r0
            goto L_0x0008
        L_0x013d:
            r0 = move-exception
            if (r2 == 0) goto L_0x0143
            r2.close()     // Catch:{ all -> 0x0143 }
        L_0x0143:
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0148 }
        L_0x0148:
            throw r0
        L_0x0149:
            java.util.Map r7 = super.A04()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r9.iterator()
        L_0x0156:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0191
            java.lang.Object r4 = r5.next()
            X.1z2 r4 = (X.AnonymousClass1z2) r4
            X.1jm r0 = r4.A04
            X.1jm r3 = r0.clone()
            java.lang.String r1 = r3.A0D
            if (r1 != 0) goto L_0x017e
            java.lang.String r0 = "RecentStickers/setRecentStickerFilePath/sticker param has null file hash"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0171:
            java.lang.Object r1 = r7.get(r4)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r1)
            r6.add(r0)
            goto L_0x0156
        L_0x017e:
            X.01Z r0 = r10.A02
            java.io.File r2 = r0.A03(r1)
            java.lang.String r1 = r2.getAbsolutePath()
            r0 = 1
            r3.A09 = r1
            r3.A01 = r0
            r2.getAbsolutePath()
            goto L_0x0171
        L_0x0191:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212613k.A0D():java.util.List");
    }

    public Map A0E() {
        List<AnonymousClass1z2> A022 = super.A02();
        HashMap hashMap = new HashMap();
        for (AnonymousClass1z2 r0 : A022) {
            String str = r0.A02;
            if (str != null) {
                hashMap.put(str, Long.valueOf(r0.A00));
            }
        }
        return hashMap;
    }

    public void A0F(AnonymousClass1z1 r4, C34151jm r5) {
        this.A09.execute(new RunnableRunnableShape2S0300000_I0_2(this, r5, r4, 13));
    }

    public void A0G(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, int i4, boolean z2) {
        C34151jm r2 = new C34151jm();
        r2.A0D = str;
        if (str2 != null) {
            r2.A0G = str2;
        }
        if (str3 != null) {
            r2.A08 = str3;
        }
        if (str4 != null) {
            r2.A06 = str4;
        }
        if (str5 != null) {
            r2.A0C = str5;
        }
        if (str6 != null) {
            r2.A0B = str6;
        }
        r2.A00 = i2;
        r2.A03 = i3;
        r2.A02 = i4;
        r2.A07 = str7;
        r2.A0I = z2;
        this.A04.A00(r2);
        for (AnonymousClass1z2 r1 : super.A02()) {
            if (str.equals(r1.A02)) {
                r1.A00(r2);
            }
        }
    }

    public final boolean A0H(C34151jm r13, long j2) {
        String str;
        C34151jm r6 = r13;
        String str2 = r13.A0D;
        if (str2 != null) {
            C37751pf r4 = this.A05;
            String A002 = r4.A00(str2);
            if (A002 == null) {
                String str3 = r13.A09;
                if (str3 != null) {
                    AnonymousClass00B.A00();
                    File file = new File(str3);
                    if (!file.exists()) {
                        StringBuilder sb = new StringBuilder("WebpUtils/getFileHashExcludingMetadata/file does not exist, ");
                        sb.append(str3);
                        Log.e(sb.toString());
                    } else {
                        A002 = WebpUtils.A00(file);
                        if (A002 == null) {
                            return false;
                        }
                    }
                }
            }
            synchronized (r4) {
                str = (String) r4.A01.get(A002);
            }
            if (str != null) {
                String str4 = r13.A0D;
                if (!str4.equals(str)) {
                    StringBuilder sb2 = new StringBuilder("RecentStickers/dedupeStickerFilesBasedOnImageHash/Removing old sticker from recents:");
                    sb2.append(str);
                    sb2.append(", with the same image hash:");
                    sb2.append(A002);
                    sb2.append(", with the new sticker:");
                    sb2.append(str4);
                    Log.i(sb2.toString());
                    A06(new AnonymousClass1z2(r6, str, A002, r13.A05, 0));
                }
            }
            if (r13.A0C == null) {
                r13.A0C = "image/webp";
            }
            return super.A07(new AnonymousClass1z2(r6, r13.A0D, A002, r13.A05, j2));
        }
        return false;
    }

    public boolean A0I(String str) {
        Map map;
        int size;
        boolean containsKey;
        C37751pf r2 = this.A05;
        synchronized (r2) {
            map = r2.A00;
            size = map.size();
        }
        if (size > 0) {
            synchronized (r2) {
                containsKey = map.containsKey(str);
            }
            return containsKey;
        }
        for (C34151jm r0 : A0C()) {
            if (str.equals(r0.A0D)) {
                return true;
            }
        }
        return false;
    }
}
