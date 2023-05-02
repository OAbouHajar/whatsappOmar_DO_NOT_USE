package X;

import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: X.1Go  reason: invalid class name and case insensitive filesystem */
public class C24601Go {
    public final AnonymousClass01Z A00;
    public final C37751pf A01;
    public final AnonymousClass18G A02;
    public final C27071Qi A03;
    public final C27081Qj A04;
    public final C210012k A05;
    public volatile boolean A06 = false;

    public C24601Go(AnonymousClass01Z r2, AnonymousClass18G r3, C27071Qi r4, C27081Qj r5, C210012k r6) {
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r2;
        this.A01 = new C37751pf();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0085 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C34151jm A00(java.lang.String r6) {
        /*
            r5 = this;
            X.1Qj r1 = r5.A04
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            r3[r0] = r6
            X.12j r0 = r1.A01
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id FROM starred_stickers WHERE plaintext_hash = ? ORDER BY timestamp DESC"
            android.database.Cursor r1 = r1.A08(r0, r3)     // Catch:{ all -> 0x0086 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0027
            X.1pc r3 = X.C27081Qj.A00(r1)     // Catch:{ all -> 0x007f }
            r1.close()     // Catch:{ all -> 0x0086 }
            r2.close()
            goto L_0x002e
        L_0x0027:
            r1.close()     // Catch:{ all -> 0x0086 }
            r2.close()
            r3 = 0
        L_0x002e:
            r2 = 0
            if (r3 == 0) goto L_0x007e
            X.01Z r0 = r5.A00
            java.lang.String r4 = r3.A0B
            java.io.File r1 = r0.A03(r4)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x007e
            X.1jm r2 = new X.1jm
            r2.<init>()
            r2.A0D = r4
            java.lang.String r1 = r1.getAbsolutePath()
            r0 = 1
            r2.A09 = r1
            r2.A01 = r0
            java.lang.String r0 = r3.A0E
            r2.A0G = r0
            java.lang.String r0 = r3.A0A
            r2.A08 = r0
            java.lang.String r0 = r3.A09
            r2.A06 = r0
            java.lang.String r0 = r3.A0D
            r2.A0C = r0
            java.lang.String r0 = r3.A0C
            r2.A0B = r0
            int r0 = r3.A05
            r2.A00 = r0
            int r0 = r3.A07
            r2.A03 = r0
            int r0 = r3.A06
            r2.A02 = r0
            java.lang.String r0 = r3.A01
            r2.A07 = r0
            boolean r0 = r3.A04
            r2.A0I = r0
            java.lang.String r0 = r3.A02
            r2.A0A = r0
            X.C37711pb.A00(r2)
        L_0x007e:
            return r2
        L_0x007f:
            r0 = move-exception
            if (r1 == 0) goto L_0x0085
            r1.close()     // Catch:{ all -> 0x0085 }
        L_0x0085:
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x008a }
        L_0x008a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24601Go.A00(java.lang.String):X.1jm");
    }

    public final void A01() {
        if (!this.A06) {
            C37751pf r2 = this.A01;
            synchronized (r2) {
                if (!this.A06) {
                    C27081Qj r3 = this.A04;
                    for (C37721pc r4 : r3.A02(Integer.MAX_VALUE, 0)) {
                        if (r4.A02 == null) {
                            try {
                                C27071Qi r0 = this.A03;
                                File A032 = r0.A00.A03(r4.A0B);
                                if (A032.exists()) {
                                    r4.A02 = WebpUtils.A00(A032);
                                    r3.A03(r4);
                                } else {
                                    throw new FileNotFoundException("StickerImageHashCalculator/getImageHash/could not get internally managed media file for sticker");
                                }
                            } catch (FileNotFoundException e2) {
                                Log.e("StarredStickers/initStickerDedupeMappings/could not get internally managed media file for sticker, dropping it from starred", e2);
                                r3.A04(r4.A0B);
                            }
                        }
                        r2.A01(r4.A0B, r4.A02);
                    }
                    this.A06 = true;
                }
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x003f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0032=Splitter:B:18:0x0032, B:26:0x003f=Splitter:B:26:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(java.lang.String r6) {
        /*
            r5 = this;
            X.AnonymousClass00B.A00()
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0015
            X.1pf r1 = r5.A01
            monitor-enter(r1)
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0012 }
            boolean r4 = r0.containsKey(r6)     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return r4
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0015:
            X.1Qj r1 = r5.A04
            r4 = 1
            java.lang.String[] r3 = new java.lang.String[r4]
            r0 = 0
            r3[r0] = r6
            X.12j r0 = r1.A01
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id FROM starred_stickers WHERE plaintext_hash = ? ORDER BY timestamp DESC"
            android.database.Cursor r1 = r1.A08(r0, r3)     // Catch:{ all -> 0x0040 }
            int r0 = r1.getCount()     // Catch:{ all -> 0x0039 }
            if (r0 > 0) goto L_0x0032
            r4 = 0
        L_0x0032:
            r1.close()     // Catch:{ all -> 0x0040 }
            r2.close()
            return r4
        L_0x0039:
            r0 = move-exception
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24601Go.A02(java.lang.String):boolean");
    }
}
