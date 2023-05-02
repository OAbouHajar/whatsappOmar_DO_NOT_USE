package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.obwhatsapp.R;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1CX  reason: invalid class name */
public class AnonymousClass1CX {
    public C18930xU A00;
    public C38411qk A01;
    public byte[] A02;
    public final C16300so A03;
    public final C16180sb A04;
    public final C14870pt A05;
    public final AnonymousClass01Z A06;
    public final C17130ua A07;
    public final C16440t3 A08;
    public final C16980tz A09;
    public final C15860rz A0A;
    public final C14710pd A0B;
    public final C16490t9 A0C;
    public final AnonymousClass12X A0D;
    public final C19950zG A0E;
    public final C211613a A0F;
    public final C212813m A0G;
    public final C213013o A0H;
    public final C212913n A0I;
    public final AnonymousClass18G A0J;
    public final AnonymousClass14W A0K;
    public final C20080zT A0L;
    public final C214314b A0M;
    public final C20090zU A0N;
    public final C27041Qf A0O;
    public final AnonymousClass14Y A0P;
    public final AnonymousClass14U A0Q;
    public final C214514d A0R;
    public final C24601Go A0S;
    public final C214914h A0T;
    public final AnonymousClass14X A0U;
    public final C210012k A0V;
    public final C16170sZ A0W;
    public final AnonymousClass14Z A0X;
    public final C16320sq A0Y;

    public AnonymousClass1CX(C16300so r2, C16180sb r3, C14870pt r4, AnonymousClass01Z r5, C17130ua r6, C16440t3 r7, C16980tz r8, C15860rz r9, C14710pd r10, C16490t9 r11, AnonymousClass12X r12, C19950zG r13, C211613a r14, C212813m r15, C213013o r16, C212913n r17, AnonymousClass18G r18, AnonymousClass14W r19, C20080zT r20, C214314b r21, C20090zU r22, C27041Qf r23, AnonymousClass14Y r24, AnonymousClass14U r25, C214514d r26, C24601Go r27, C214914h r28, AnonymousClass14X r29, C210012k r30, C16170sZ r31, AnonymousClass14Z r32, C16320sq r33) {
        this.A09 = r8;
        this.A08 = r7;
        this.A0R = r26;
        this.A0B = r10;
        this.A05 = r4;
        this.A03 = r2;
        this.A0Y = r33;
        this.A04 = r3;
        this.A07 = r6;
        this.A0C = r11;
        this.A0F = r14;
        this.A0V = r30;
        this.A0S = r27;
        this.A0K = r19;
        this.A0E = r13;
        this.A0A = r9;
        this.A0P = r24;
        this.A0T = r28;
        this.A0G = r15;
        this.A0J = r18;
        this.A0O = r23;
        this.A0L = r20;
        this.A0X = r32;
        this.A0H = r16;
        this.A06 = r5;
        this.A0N = r22;
        this.A0D = r12;
        this.A0U = r29;
        this.A0M = r21;
        this.A0Q = r25;
        this.A0I = r17;
        this.A0W = r31;
    }

    public final Bitmap A00(File file, String str) {
        if (file == null || !file.exists()) {
            return null;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        boolean A0E2 = this.A0B.A0E(C16620tM.A02, 575);
        if (decodeFile != null && A0E2) {
            AnonymousClass14Y r1 = this.A0P;
            C18450wi.A0H(str, 0);
            if (!decodeFile.isRecycled()) {
                C23651Cv r2 = r1.A00;
                C34711kk A042 = r2.A04();
                C18450wi.A0B(A042);
                Bitmap bitmap = (Bitmap) A042.A00(str);
                if (bitmap != null) {
                    if (bitmap.isRecycled()) {
                        A042.A02.A03(str);
                    }
                }
                r2.A04().A03(str, decodeFile);
            }
        }
        return decodeFile;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A01(X.C34151jm r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.A0D
            X.AnonymousClass00B.A06(r0)
            r4 = 0
            X.12X r2 = r5.A0D     // Catch:{ IOException -> 0x00ac }
            r0 = 32
            byte[] r1 = X.C004101u.A0E(r0)     // Catch:{ IOException -> 0x00ac }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ IOException -> 0x00ac }
            java.lang.String r1 = X.AnonymousClass1ZW.A0C(r0)     // Catch:{ IOException -> 0x00ac }
            X.1XH r0 = r2.A00     // Catch:{ IOException -> 0x00ac }
            java.io.File r3 = r0.A00(r1)     // Catch:{ IOException -> 0x00ac }
            int r1 = r6.A01
            r0 = 3
            if (r1 == r0) goto L_0x0040
            java.lang.String r2 = r6.A09
            if (r2 == 0) goto L_0x0040
            X.0sb r0 = r5.A04     // Catch:{ IOException -> 0x00b0 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x00b0 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00b0 }
            X.0tB r0 = r0.A04     // Catch:{ IOException -> 0x00b0 }
            X.AnonymousClass1XI.A0B(r0, r1, r3)     // Catch:{ IOException -> 0x00b0 }
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x00b0 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = r6.A0D     // Catch:{ IOException -> 0x00b0 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ IOException -> 0x00b0 }
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x00b0 }
            return r0
        L_0x0040:
            r2 = 0
            X.0tz r0 = r5.A09     // Catch:{ IOException -> 0x0071 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x0071 }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ IOException -> 0x0071 }
            java.lang.String r0 = r6.A09     // Catch:{ IOException -> 0x0071 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ IOException -> 0x0071 }
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ IOException -> 0x0071 }
            if (r1 == 0) goto L_0x005f
            boolean r2 = X.AnonymousClass1XI.A0Q(r3, r1)     // Catch:{ all -> 0x005a }
            goto L_0x005f
        L_0x005a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x005e }
        L_0x005e:
            throw r0     // Catch:{ IOException -> 0x0071 }
        L_0x005f:
            if (r1 == 0) goto L_0x0064
            r1.close()     // Catch:{ IOException -> 0x0071 }
        L_0x0064:
            if (r2 == 0) goto L_0x00a6
            X.C37971q2.A00(r3, r4, r4)     // Catch:{ 1q0 -> 0x006a }
            goto L_0x0078
        L_0x006a:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveThirdPartyStickerToTempStorage sticker file failed validation"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x008b
        L_0x0071:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveThirdPartyStickerToTempStorage failed to copy external file"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x008b
        L_0x0078:
            X.1XO r0 = r6.A04
            if (r0 == 0) goto L_0x008f
            byte[] r0 = r0.A01()
            boolean r0 = com.whatsapp.stickers.WebpUtils.A01(r3, r0)
            if (r0 != 0) goto L_0x008f
            java.lang.String r0 = "StickerRepository/moveThirdPartyStickerToTempStorage failed to insert metadata"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x008b:
            X.AnonymousClass1XI.A0N(r3)
            return r4
        L_0x008f:
            java.lang.String r4 = X.C37981q3.A00(r3)     // Catch:{ IOException -> 0x0094 }
            goto L_0x00a6
        L_0x0094:
            r2 = move-exception
            java.lang.String r1 = "StickerRepository/moveThirdPartyStickerToTempStorage could not get file hash; file="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x00a6:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r4)
            return r0
        L_0x00ac:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveThirdPartyStickerToTempStorage failed to generate internal temp file"
            goto L_0x00b3
        L_0x00b0:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveThirdPartyStickerToTempStorage failed to copy cached file"
        L_0x00b3:
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CX.A01(X.1jm):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r4 == null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37771pi A02(X.C38251qU r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            X.14X r3 = r6.A0U
            X.1pi r4 = r3.A01(r8)
            if (r4 != 0) goto L_0x000c
            X.1pi r4 = r3.A00(r8)
        L_0x000c:
            if (r9 == 0) goto L_0x002a
            if (r4 != 0) goto L_0x006d
            java.lang.String r0 = " "
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x002c
            X.0zU r0 = r6.A0N
            r0.A00()
            X.1pi r4 = r3.A00(r8)
            if (r4 != 0) goto L_0x006d
            X.14b r0 = r6.A0M
            X.1pi r0 = r0.A00(r7, r8)
            return r0
        L_0x002a:
            if (r4 != 0) goto L_0x006d
        L_0x002c:
            java.lang.String r0 = " "
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0095
            android.util.Pair r5 = X.C27031Qe.A00(r8)     // Catch:{ Exception -> 0x0059 }
            if (r5 == 0) goto L_0x0095
            X.0sZ r2 = r6.A0W     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r1 = r5.first     // Catch:{ Exception -> 0x0059 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r0 = r5.second     // Catch:{ Exception -> 0x0059 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0059 }
            boolean r0 = r2.A02(r1, r0)     // Catch:{ Exception -> 0x0059 }
            if (r0 == 0) goto L_0x0095
            X.1Qf r2 = r6.A0O     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r1 = r5.first     // Catch:{ Exception -> 0x0059 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r0 = r5.second     // Catch:{ Exception -> 0x0059 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0059 }
            X.1pi r4 = r2.A00(r1, r0)     // Catch:{ Exception -> 0x0059 }
            goto L_0x008a
        L_0x0059:
            r2 = move-exception
            java.lang.String r1 = "StickerRepository/getStickerPackByIdSync/error fetching sticker pack: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 0
            return r0
        L_0x006d:
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x0077
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x008a
        L_0x0077:
            X.14b r2 = r6.A0M
            java.lang.String r1 = r4.A0F
            r0 = 0
            X.1pi r1 = r2.A00(r0, r1)
            if (r1 == 0) goto L_0x008a
            java.util.List r0 = r1.A03
            r4.A03 = r0
            java.util.List r0 = r1.A04
            r4.A04 = r0
        L_0x008a:
            X.AnonymousClass00B.A00()
            X.1Qg r0 = r3.A03
            int r0 = r0.A00(r8)
            r4.A00 = r0
        L_0x0095:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CX.A02(X.1qU, java.lang.String, boolean):X.1pi");
    }

    public C38411qk A03() {
        C38411qk r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        Context context = this.A09.A00;
        File file = new File(context.getCacheDir(), "stickers_preview_images");
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder sb = new StringBuilder("StickerRepository/getPreviewImageLoader/could not create diskcache directory:");
            sb.append(file.getAbsolutePath());
            Log.w(sb.toString());
        }
        long min = Math.min(4194304, file.getFreeSpace() / 16);
        C14870pt r7 = this.A05;
        C38441qn r6 = new C38441qn(r7, new C38421ql(AnonymousClass00T.A04(context, R.drawable.sticker_store_error), AnonymousClass00T.A04(context, R.drawable.sticker_store_error)), this.A0M, file, min);
        C38461qp r13 = new C38461qp(r7, this.A07, this.A0E, file, "sticker-repository");
        r13.A04 = r6;
        r13.A00 = Integer.MAX_VALUE;
        r13.A01 = min;
        r13.A03 = AnonymousClass00T.A04(context, R.drawable.sticker_store_error);
        r13.A02 = AnonymousClass00T.A04(context, R.drawable.sticker_store_error);
        r13.A05 = true;
        C38411qk A002 = r13.A00();
        this.A01 = A002;
        return A002;
    }

    public File A04(C34151jm r7) {
        Pair A012;
        Object obj;
        Object obj2;
        File file;
        String str = r7.A0D;
        AnonymousClass00B.A06(str);
        AnonymousClass01Z r5 = this.A06;
        File A022 = r5.A02(str);
        if (!(A022 != null || (A012 = A01(r7)) == null || (obj = A012.first) == null || (obj2 = A012.second) == null)) {
            try {
                file = (File) obj;
                File A032 = r5.A03((String) obj2);
                AnonymousClass00B.A06(A032);
                AnonymousClass1XI.A0C(this.A04.A04, file, A032);
                File file2 = A032;
                r5.A02((String) A012.second);
                return file2;
            } catch (IOException e2) {
                Log.e("StickerRepository/moveTempStickerFileToInternalStorage failed to copy resulting file");
                AnonymousClass1XI.A0N(file);
                throw e2;
            } catch (IOException unused) {
                StringBuilder sb = new StringBuilder("StickerRepository/incrementReferenceCountOnThirdPartySticker unable to move ");
                sb.append(((File) A012.first).getAbsolutePath());
                sb.append(" to internal storage");
                Log.e(sb.toString());
            }
        }
        return A022;
    }

    public File A05(C34151jm r4, File file) {
        File A002 = this.A0Q.A00(r4, file);
        if (A002 != null) {
            r4.A09 = A002.getAbsolutePath();
            r4.A01 = 1;
            r4.A04 = AnonymousClass1XO.A00(WebpUtils.fetchWebpMetadata(A002.getAbsolutePath()));
            StringBuilder sb = new StringBuilder("StickerRepository/downloadSticker/downloaded sticker, file_hash:");
            sb.append(r4.A0D);
            sb.append(",media_key:");
            sb.append(r4.A0B);
            sb.append(",file:");
            sb.append(A002.getAbsolutePath());
            sb.append(", direct_path:");
            sb.append(r4.A06);
            Log.i(sb.toString());
            return A002;
        }
        StringBuilder sb2 = new StringBuilder("StickerRepository/downloadSticker/sticker file is null for: ");
        sb2.append(r4.A0D);
        Log.e(sb2.toString());
        return A002;
    }

    public final File A06(String str) {
        File A0B2 = this.A06.A00.A0B();
        if (!A0B2.exists() && !A0B2.mkdirs()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".png");
        return new File(A0B2, sb.toString());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A07() {
        /*
            r11 = this;
            X.0sZ r0 = r11.A0W
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.12j r0 = r0.A00
            X.0tf r1 = r0.get()
            X.0tg r4 = r1.A02     // Catch:{ all -> 0x00a1 }
            java.lang.String r3 = "SELECT authority, sticker_pack_id, sticker_pack_name, sticker_pack_publisher, sticker_pack_image_data_hash, avoid_cache, is_animated_pack FROM third_party_whitelist_packs"
            r0 = 0
            android.database.Cursor r3 = r4.A08(r3, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "authority"
            int r4 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "sticker_pack_id"
            int r5 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "sticker_pack_name"
            int r6 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "sticker_pack_publisher"
            int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "sticker_pack_image_data_hash"
            int r8 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "avoid_cache"
            int r9 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "is_animated_pack"
            int r10 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x009a }
        L_0x0044:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0052
            X.1pi r0 = X.C16170sZ.A00(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x009a }
            r2.add(r0)     // Catch:{ all -> 0x009a }
            goto L_0x0044
        L_0x0052:
            r3.close()     // Catch:{ all -> 0x00a1 }
            r1.close()
            X.14Z r0 = r11.A0X
            java.util.Set r5 = r0.A00()
            java.util.Iterator r4 = r2.iterator()
        L_0x0062:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r3 = r4.next()
            X.1pi r3 = (X.C37771pi) r3
            X.14X r0 = r11.A0U
            java.lang.String r1 = r3.A0F
            X.AnonymousClass00B.A00()
            X.1Qg r0 = r0.A03
            int r0 = r0.A00(r1)
            r3.A00 = r0
            boolean r0 = r5.contains(r1)
            r3.A07 = r0
            goto L_0x0062
        L_0x0084:
            java.lang.String r0 = "StickerRepository/getCachedWhiteListedStickerPacksSync/found total cached sticker pack count: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r2.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x009a:
            r0 = move-exception
            if (r3 == 0) goto L_0x00a0
            r3.close()     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CX.A07():java.util.List");
    }

    public List A08() {
        Map map;
        List<C37771pi> list;
        C214514d r5 = this.A0R;
        synchronized (r5) {
            map = r5.A00;
            list = map.containsKey(0) ? (List) ((WeakReference) map.get(0)).get() : null;
        }
        if (list == null) {
            AnonymousClass14X r8 = this.A0U;
            AnonymousClass00B.A00();
            list = r8.A04.A00("SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)", (String[]) null);
            HashSet hashSet = new HashSet();
            Set A002 = this.A0X.A00();
            for (C37771pi r11 : list) {
                String str = r11.A0F;
                if (hashSet.contains(str)) {
                    Log.e("StickerRepository/getInstalledFirstPartyStickerPacksSync duplicate sticker pack");
                } else {
                    hashSet.add(str);
                    AnonymousClass00B.A00();
                    List<C34151jm> A022 = r8.A05.A02(str);
                    for (C34151jm r1 : A022) {
                        if (!TextUtils.isEmpty(r1.A09)) {
                            C37711pb.A00(r1);
                        }
                    }
                    r11.A04 = A022;
                    r11.A07 = A002.contains(str);
                    for (C34151jm A0B2 : r11.A04) {
                        A0B(A0B2);
                    }
                }
            }
            for (C37771pi r2 : list) {
                String str2 = r2.A0F;
                AnonymousClass00B.A00();
                r2.A00 = r8.A03.A00(str2);
            }
            Collections.sort(list, new C38371qg());
            StringBuilder sb = new StringBuilder("StickerRepository/getInstalledFirstPartyStickerPacksSync/found total sticker pack count: ");
            sb.append(list.size());
            Log.i(sb.toString());
            synchronized (r5) {
                map.put(0, new WeakReference(list));
            }
        }
        return list;
    }

    public List A09(int i2) {
        C24601Go r0 = this.A0S;
        AnonymousClass00B.A00();
        List<C37721pc> A022 = r0.A04.A02(Integer.MAX_VALUE, i2);
        ArrayList arrayList = new ArrayList();
        for (C37721pc r3 : A022) {
            AnonymousClass01Z r02 = this.A06;
            String str = r3.A0B;
            File A032 = r02.A03(str);
            if (A032.exists()) {
                C34151jm r1 = new C34151jm();
                r1.A09 = A032.getAbsolutePath();
                r1.A01 = 1;
                r1.A0D = str;
                r1.A0G = r3.A0E;
                r1.A08 = r3.A0A;
                r1.A06 = r3.A09;
                String str2 = r3.A0D;
                if (str2 == null) {
                    str2 = "image/webp";
                }
                r1.A0C = str2;
                r1.A0B = r3.A0C;
                r1.A00 = r3.A05;
                r1.A03 = r3.A07;
                r1.A02 = r3.A06;
                r1.A04 = AnonymousClass1XO.A00(WebpUtils.fetchWebpMetadata(A032.getAbsolutePath()));
                C37711pb.A00(r1);
                r1.A0A = r3.A02;
                A0B(r1);
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0168 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0A(X.C38381qh r18) {
        /*
            r17 = this;
            r4 = r17
            X.0sZ r5 = r4.A0W
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = 2
            java.lang.String[] r11 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r3 = "authority"
            r11[r0] = r3
            r0 = 1
            java.lang.String r1 = "sticker_pack_id"
            r11[r0] = r1
            X.12j r0 = r5.A00
            X.0tf r8 = r0.get()
            X.0tg r9 = r8.A02     // Catch:{ all -> 0x0169 }
            java.lang.String r10 = "third_party_whitelist_packs"
            r12 = 0
            r14 = r12
            r15 = r12
            r16 = r12
            r13 = r12
            android.database.Cursor r7 = r9.A09(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0169 }
            int r6 = r7.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0162 }
            int r5 = r7.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
        L_0x0034:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x004b
            java.lang.String r3 = r7.getString(r6)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = r7.getString(r5)     // Catch:{ all -> 0x0162 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0162 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0162 }
            r2.add(r0)     // Catch:{ all -> 0x0162 }
            goto L_0x0034
        L_0x004b:
            r7.close()     // Catch:{ all -> 0x0169 }
            r8.close()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Iterator r3 = r2.iterator()
        L_0x005a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = X.C27031Qe.A01(r1, r0)
            X.14X r0 = r4.A0U
            X.AnonymousClass00B.A00()
            X.1Qg r0 = r0.A03
            int r0 = r0.A00(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.put(r1, r0)
            goto L_0x005a
        L_0x0085:
            X.1qi r0 = new X.1qi
            r0.<init>(r4, r6)
            java.util.Collections.sort(r2, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r2.iterator()
        L_0x0096:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x014c
            java.lang.Object r8 = r9.next()
            android.util.Pair r8 = (android.util.Pair) r8
            r5 = 0
            r7 = r18
            X.1Qf r2 = r4.A0O     // Catch:{ 1q4 -> 0x00b8, 1q5 -> 0x00b4, Exception -> 0x00ff }
            java.lang.Object r1 = r8.first     // Catch:{ 1q4 -> 0x00b8, 1q5 -> 0x00b4, Exception -> 0x00ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 1q4 -> 0x00b8, 1q5 -> 0x00b4, Exception -> 0x00ff }
            java.lang.Object r0 = r8.second     // Catch:{ 1q4 -> 0x00b8, 1q5 -> 0x00b4, Exception -> 0x00ff }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 1q4 -> 0x00b8, 1q5 -> 0x00b4, Exception -> 0x00ff }
            X.1pi r5 = r2.A00(r1, r0)     // Catch:{ 1q4 -> 0x00b8, 1q5 -> 0x00b4, Exception -> 0x00ff }
            goto L_0x0105
        L_0x00b4:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/getInstalledThirdPartyStickerPacksSync/fetch of sticker pack restricted"
            goto L_0x0102
        L_0x00b8:
            r2 = move-exception
            java.lang.String r0 = "StickerRepository/getInstalledStickerPacksSync/third party sticker pack is either invalid or cannot be found, so removing from the whitelist, authority:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.Object r0 = r8.first
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = ", identifier:"
            r1.append(r0)
            java.lang.Object r0 = r8.second
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.Object r1 = r8.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r8.second
            java.lang.String r0 = (java.lang.String) r0
            r4.A0J(r1, r0)
            if (r18 == 0) goto L_0x0105
            java.lang.Object r1 = r8.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r8.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r8 = X.C27031Qe.A01(r1, r0)
            X.1qj r2 = r7.A00
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r8
            r2.A07(r1)
            goto L_0x0105
        L_0x00ff:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/getInstalledThirdPartyStickerPacksSync/failed to fetch sticker pack"
        L_0x0102:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0105:
            if (r5 == 0) goto L_0x0096
            r3.add(r5)
            X.14Z r0 = r4.A0X
            java.util.Set r0 = r0.A00()
            java.lang.String r2 = r5.A0F
            boolean r0 = r0.contains(r2)
            r5.A07 = r0
            java.util.List r0 = r5.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x011e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x012e
            java.lang.Object r0 = r1.next()
            X.1jm r0 = (X.C34151jm) r0
            r4.A0B(r0)
            goto L_0x011e
        L_0x012e:
            java.lang.Object r0 = r6.get(r2)
            X.AnonymousClass00B.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5.A00 = r0
            if (r18 == 0) goto L_0x0096
            X.1qj r2 = r7.A00
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r5
            r2.A07(r1)
            goto L_0x0096
        L_0x014c:
            java.lang.String r0 = "StickerRepository/getInstalledThirdPartyStickerPacksSync/found total 3rd party sticker pack count: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r3.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r3
        L_0x0162:
            r0 = move-exception
            if (r7 == 0) goto L_0x0168
            r7.close()     // Catch:{ all -> 0x0168 }
        L_0x0168:
            throw r0     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x016d }
        L_0x016d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CX.A0A(X.1qh):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C34151jm r8) {
        /*
            r7 = this;
            java.lang.String r4 = r8.A0D
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x005d }
            r6 = r7
            monitor-enter(r6)     // Catch:{ NoSuchAlgorithmException -> 0x005d }
            byte[] r0 = r7.A02     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x003a
            X.0rz r5 = r7.A0A     // Catch:{ all -> 0x005a }
            X.01D r0 = r5.A01     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x005a }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x005a }
            java.lang.String r2 = "sticker_hash_salt"
            r0 = 0
            java.lang.String r1 = r1.getString(r2, r0)     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x003d
            r0 = 32
            byte[] r1 = X.C004101u.A0E(r0)     // Catch:{ all -> 0x005a }
            r7.A02 = r1     // Catch:{ all -> 0x005a }
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x005a }
            android.content.SharedPreferences$Editor r0 = r5.A0K()     // Catch:{ all -> 0x005a }
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)     // Catch:{ all -> 0x005a }
            r0.apply()     // Catch:{ all -> 0x005a }
        L_0x003a:
            byte[] r0 = r7.A02     // Catch:{ all -> 0x005a }
            goto L_0x0045
        L_0x003d:
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x005a }
            r7.A02 = r0     // Catch:{ all -> 0x005a }
            goto L_0x003a
        L_0x0045:
            monitor-exit(r6)     // Catch:{ NoSuchAlgorithmException -> 0x005d }
            r3.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x005d }
            byte[] r0 = r4.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x005d }
            r3.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x005d }
            byte[] r1 = r3.digest()     // Catch:{ NoSuchAlgorithmException -> 0x005d }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x005d }
            goto L_0x005e
        L_0x005a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ NoSuchAlgorithmException -> 0x005d }
            throw r0     // Catch:{ NoSuchAlgorithmException -> 0x005d }
        L_0x005d:
            r0 = 0
        L_0x005e:
            r8.A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CX.A0B(X.1jm):void");
    }

    public final void A0C(C37771pi r6) {
        C16800tf A022 = this.A0X.A00.A02();
        try {
            A022.A02.A01("unseen_sticker_packs", "pack_id = ?", new String[]{r6.A0F});
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A0D(C37771pi r5, C38481qr r6) {
        if (this.A0B.A0E(C16620tM.A02, 575)) {
            AnonymousClass14Y r1 = this.A0P;
            String str = r5.A0F;
            C18450wi.A0H(str, 0);
            C34711kk A042 = r1.A00.A04();
            C18450wi.A0B(A042);
            Bitmap bitmap = (Bitmap) A042.A00(str);
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                    A042.A02.A03(str);
                } else {
                    r6.ASv(bitmap);
                    return;
                }
            }
        }
        this.A0Y.Ack(new C38491qs(this, r6), r5);
    }

    public void A0E(C38251qU r5, String str, boolean z2) {
        this.A0Y.Ack(new C38471qq(this.A0L, r5, this), new Pair(str, Boolean.valueOf(z2)));
    }

    public void A0F(Collection collection) {
        this.A0Y.Acl(new RunnableRunnableShape10S0200000_I0_8(this, 46, collection));
    }

    public void A0G(Collection collection, boolean z2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0I((C34151jm) it.next(), (Long) null, z2, false);
        }
        this.A05.A0K(new RunnableRunnableShape10S0200000_I0_8(this, 45, collection));
    }

    public boolean A0H(C34151jm r3) {
        String str;
        return (!r3.A0H || (str = r3.A05) == null) ? this.A0S.A02(r3.A0D) : this.A0S.A04.A01(str) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a9, code lost:
        com.whatsapp.util.Log.e("StarredStickers/starSticker/could not find sticker file corresponding to that sticker file", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d5, code lost:
        if (r6 != false) goto L_0x01bb;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(X.C34151jm r37, java.lang.Long r38, boolean r39, boolean r40) {
        /*
            r36 = this;
            r12 = r37
            boolean r0 = r12.A0H
            r11 = r36
            if (r0 == 0) goto L_0x0012
            java.lang.String r1 = r12.A05
            if (r1 == 0) goto L_0x005e
            X.12k r0 = r11.A0V
            X.1jm r12 = r0.A00(r1)
        L_0x0012:
            r10 = 0
            if (r12 == 0) goto L_0x01e6
            java.lang.String r5 = r12.A0D
            if (r5 == 0) goto L_0x01e6
            X.1Go r9 = r11.A0S
            boolean r0 = r9.A02(r5)
            if (r0 != 0) goto L_0x01e6
            X.01Z r8 = r11.A06
            java.io.File r7 = r8.A03(r5)
            X.AnonymousClass00B.A06(r7)
            boolean r0 = r7.exists()
            r6 = 1
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = r12.A09
            if (r0 == 0) goto L_0x007f
            int r0 = r12.A01
            if (r0 == r6) goto L_0x007f
            android.util.Pair r0 = r11.A01(r12)
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r2 = r0.first
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r5 = r0.second
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L_0x01e6
            if (r5 == 0) goto L_0x01e6
            boolean r0 = r9.A02(r5)
            if (r0 != 0) goto L_0x01e6
            r12.A0D = r5
            java.io.File r0 = r8.A03(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x009f
            goto L_0x0060
        L_0x005e:
            r12 = 0
            goto L_0x0012
        L_0x0060:
            java.io.File r7 = r8.A03(r5)     // Catch:{ IOException -> 0x0079 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ IOException -> 0x0079 }
            X.0sb r0 = r11.A04     // Catch:{ IOException -> 0x006f }
            X.0tB r0 = r0.A04     // Catch:{ IOException -> 0x006f }
            X.AnonymousClass1XI.A0C(r0, r2, r7)     // Catch:{ IOException -> 0x006f }
            goto L_0x0096
        L_0x006f:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveTempStickerFileToInternalStorage failed to copy resulting file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0079 }
            X.AnonymousClass1XI.A0N(r2)     // Catch:{ IOException -> 0x0079 }
            throw r1     // Catch:{ IOException -> 0x0079 }
        L_0x0079:
            java.lang.String r0 = "StickerRepository/starStickersSync failed to copy external file to internal storage"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r10
        L_0x007f:
            java.io.File r7 = r8.A03(r5)
            X.AnonymousClass00B.A06(r7)
            java.lang.String r2 = r12.A09
            if (r2 == 0) goto L_0x01e6
            X.0sb r0 = r11.A04     // Catch:{ IOException -> 0x0099 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0099 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0099 }
            X.0tB r0 = r0.A04     // Catch:{ IOException -> 0x0099 }
            X.AnonymousClass1XI.A0B(r0, r1, r7)     // Catch:{ IOException -> 0x0099 }
        L_0x0096:
            r17 = 1
            goto L_0x00a1
        L_0x0099:
            java.lang.String r0 = "StickerRepository/starStickersSync failed to copy internal file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r10
        L_0x009f:
            r17 = 0
        L_0x00a1:
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x01e6
            if (r38 == 0) goto L_0x00ca
            long r2 = r38.longValue()
        L_0x00ad:
            X.0xU r0 = r11.A00
            if (r0 == 0) goto L_0x00c3
            if (r40 != 0) goto L_0x00c3
            r16 = 1
            X.AnonymousClass00B.A06(r0)
            java.util.Set r14 = r0.A0H(r12, r2, r6)
        L_0x00bc:
            X.AnonymousClass00B.A00()
            r9.A01()
            goto L_0x00d1
        L_0x00c3:
            r16 = 0
            java.util.Set r14 = java.util.Collections.emptySet()
            goto L_0x00bc
        L_0x00ca:
            X.0t3 r0 = r11.A08
            long r2 = r0.A00()
            goto L_0x00ad
        L_0x00d1:
            java.lang.String r1 = r12.A0D     // Catch:{ FileNotFoundException -> 0x01a8 }
            if (r1 == 0) goto L_0x01ae
            X.1pf r4 = r9.A01     // Catch:{ FileNotFoundException -> 0x01a8 }
            monitor-enter(r4)     // Catch:{ FileNotFoundException -> 0x01a8 }
            java.util.Map r0 = r4.A00     // Catch:{ all -> 0x01a5 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x01a5 }
            monitor-exit(r4)     // Catch:{ FileNotFoundException -> 0x01a8 }
            if (r0 != 0) goto L_0x01ae
            X.1Qi r0 = r9.A03     // Catch:{ FileNotFoundException -> 0x01a8 }
            java.lang.String r1 = r12.A0D     // Catch:{ FileNotFoundException -> 0x01a8 }
            X.01Z r0 = r0.A00     // Catch:{ FileNotFoundException -> 0x01a8 }
            java.io.File r1 = r0.A03(r1)     // Catch:{ FileNotFoundException -> 0x01a8 }
            boolean r0 = r1.exists()     // Catch:{ FileNotFoundException -> 0x01a8 }
            if (r0 == 0) goto L_0x019d
            java.lang.String r13 = com.whatsapp.stickers.WebpUtils.A00(r1)     // Catch:{ FileNotFoundException -> 0x01a8 }
            if (r13 == 0) goto L_0x0111
            monitor-enter(r4)     // Catch:{ FileNotFoundException -> 0x01a8 }
            java.util.Map r0 = r4.A01     // Catch:{ all -> 0x010d }
            java.lang.Object r1 = r0.get(r13)     // Catch:{ all -> 0x010d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x010d }
            monitor-exit(r4)     // Catch:{ FileNotFoundException -> 0x01a8 }
            if (r1 == 0) goto L_0x0111
            java.lang.String r0 = r12.A0D     // Catch:{ FileNotFoundException -> 0x01a8 }
            boolean r0 = r0.equals(r1)     // Catch:{ FileNotFoundException -> 0x01a8 }
            if (r0 != 0) goto L_0x0111
            goto L_0x01ae
        L_0x010d:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ FileNotFoundException -> 0x01a8 }
            goto L_0x01a4
        L_0x0111:
            java.lang.String r0 = r12.A0D     // Catch:{ FileNotFoundException -> 0x01a8 }
            r4.A01(r0, r13)     // Catch:{ FileNotFoundException -> 0x01a8 }
            X.01Z r1 = r9.A00     // Catch:{ FileNotFoundException -> 0x01a8 }
            java.lang.String r0 = r12.A0D     // Catch:{ FileNotFoundException -> 0x01a8 }
            java.io.File r0 = r1.A03(r0)     // Catch:{ FileNotFoundException -> 0x01a8 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x01a8 }
            r12.A09 = r0     // Catch:{ FileNotFoundException -> 0x01a8 }
            r12.A01 = r6     // Catch:{ FileNotFoundException -> 0x01a8 }
            X.C37711pb.A00(r12)     // Catch:{ FileNotFoundException -> 0x01a8 }
            X.1Qj r4 = r9.A04     // Catch:{ FileNotFoundException -> 0x01a8 }
            java.lang.String r0 = r12.A0D     // Catch:{ FileNotFoundException -> 0x01a8 }
            r35 = r0
            java.lang.String r0 = r12.A0G     // Catch:{ FileNotFoundException -> 0x01a8 }
            r21 = r0
            java.lang.String r0 = r12.A08     // Catch:{ FileNotFoundException -> 0x01a8 }
            r22 = r0
            java.lang.String r0 = r12.A06     // Catch:{ FileNotFoundException -> 0x01a8 }
            r23 = r0
            java.lang.String r0 = r12.A0C     // Catch:{ FileNotFoundException -> 0x01a8 }
            r24 = r0
            java.lang.String r0 = r12.A0B     // Catch:{ FileNotFoundException -> 0x01a8 }
            r25 = r0
            int r0 = r12.A00     // Catch:{ FileNotFoundException -> 0x01a8 }
            r28 = r0
            int r0 = r12.A03     // Catch:{ FileNotFoundException -> 0x01a8 }
            r29 = r0
            int r0 = r12.A02     // Catch:{ FileNotFoundException -> 0x01a8 }
            r30 = r0
            java.lang.String r0 = r12.A07     // Catch:{ FileNotFoundException -> 0x01a8 }
            r19 = r0
            boolean r0 = r12.A0I     // Catch:{ FileNotFoundException -> 0x01a8 }
            r18 = r0
            boolean r15 = r12.A0H     // Catch:{ FileNotFoundException -> 0x01a8 }
            java.lang.String r1 = r12.A05     // Catch:{ FileNotFoundException -> 0x01a8 }
            X.1pc r0 = new X.1pc     // Catch:{ FileNotFoundException -> 0x01a8 }
            r20 = r13
            r26 = r19
            r27 = r1
            r31 = r2
            r33 = r18
            r34 = r15
            r18 = r0
            r19 = r35
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34)     // Catch:{ FileNotFoundException -> 0x01a8 }
            r4.A03(r0)     // Catch:{ FileNotFoundException -> 0x01a8 }
            X.18G r0 = r9.A02     // Catch:{ FileNotFoundException -> 0x01a8 }
            X.18F r1 = r0.A01     // Catch:{ FileNotFoundException -> 0x01a8 }
            java.lang.Object r2 = r1.A02     // Catch:{ FileNotFoundException -> 0x01a8 }
            monitor-enter(r2)     // Catch:{ FileNotFoundException -> 0x01a8 }
            android.content.SharedPreferences r0 = r1.A00()     // Catch:{ all -> 0x0198 }
            java.lang.String r4 = "sticker_add_to_favorites_count"
            int r3 = r0.getInt(r4, r10)     // Catch:{ all -> 0x0198 }
            android.content.SharedPreferences r0 = r1.A00()     // Catch:{ all -> 0x019a }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x019a }
            int r0 = r3 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r4, r0)     // Catch:{ all -> 0x019a }
            r0.apply()     // Catch:{ all -> 0x019a }
            monitor-exit(r2)     // Catch:{ all -> 0x019a }
            goto L_0x01af
        L_0x0198:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x019a }
        L_0x019a:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x019a }
            goto L_0x01a4
        L_0x019d:
            java.lang.String r0 = "StickerImageHashCalculator/getImageHash/could not get internally managed media file for sticker"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x01a8 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x01a8 }
        L_0x01a4:
            throw r1     // Catch:{ FileNotFoundException -> 0x01a8 }
        L_0x01a5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ FileNotFoundException -> 0x01a8 }
            throw r0     // Catch:{ FileNotFoundException -> 0x01a8 }
        L_0x01a8:
            r1 = move-exception
            java.lang.String r0 = "StarredStickers/starSticker/could not find sticker file corresponding to that sticker file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01ae:
            r6 = 0
        L_0x01af:
            if (r16 == 0) goto L_0x01d5
            X.0xU r0 = r11.A00
            X.AnonymousClass00B.A06(r0)
            if (r6 == 0) goto L_0x01d8
            r0.A0V(r14)
        L_0x01bb:
            X.1qt r1 = new X.1qt
            r1.<init>()
            boolean r0 = r12.A0H
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            X.0t9 r0 = r11.A0C
            r0.A06(r1)
            if (r39 == 0) goto L_0x01d4
            java.lang.String r0 = r12.A0D
            r8.A02(r0)
        L_0x01d4:
            return r6
        L_0x01d5:
            if (r6 == 0) goto L_0x01db
            goto L_0x01bb
        L_0x01d8:
            r0.A0U(r14)
        L_0x01db:
            if (r17 == 0) goto L_0x01e1
            X.AnonymousClass1XI.A0N(r7)
            return r10
        L_0x01e1:
            if (r39 != 0) goto L_0x01e6
            r8.A07(r5)
        L_0x01e6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CX.A0I(X.1jm, java.lang.Long, boolean, boolean):boolean");
    }

    public final boolean A0J(String str, String str2) {
        Throwable th;
        try {
            this.A0O.A00(str, str2);
        } catch (Exception e2) {
            Log.e("StickerRepository/uninstallThirdPartyPack/fetch pack failed", e2);
        }
        C27041Qf r4 = this.A0O;
        File A012 = r4.A05.A01(C27031Qe.A01(str, str2));
        if (A012 != null && AnonymousClass1XI.A0N(A012)) {
            A012.toString();
        }
        AnonymousClass1M8 r3 = r4.A04;
        synchronized (r3) {
            File A002 = r3.A00(str, str2);
            if (A002.exists()) {
                File parentFile = A002.getParentFile();
                AnonymousClass1XI.A0D(A002);
                if (parentFile != null && parentFile.isDirectory() && parentFile.listFiles().length == 0) {
                    AnonymousClass1XI.A0N(parentFile);
                }
            }
        }
        String[] strArr = {str, str2};
        C16800tf A022 = r4.A06.A00.A02();
        try {
            A022.A02.A01("third_party_sticker_emoji_mapping", "authority = ? AND sticker_pack_id = ?", strArr);
            A022.close();
            C16800tf A023 = r4.A07.A00.A02();
            try {
                boolean z2 = false;
                if (A023.A02.A01("third_party_whitelist_packs", "authority = ? AND sticker_pack_id = ?", new String[]{str, str2}) > 0) {
                    z2 = true;
                }
                A023.close();
                if (z2) {
                    this.A0J.A00();
                }
                return z2;
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            A022.close();
            throw th;
        }
    }
}
