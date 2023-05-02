package X;

import com.whatsapp.stickers.WebpUtils;
import java.util.List;

/* renamed from: X.14X  reason: invalid class name */
public class AnonymousClass14X {
    public final AnonymousClass01Z A00;
    public final C16980tz A01;
    public final C209912j A02;
    public final C27051Qg A03;
    public final C27061Qh A04;
    public final C210012k A05;

    public AnonymousClass14X(AnonymousClass01Z r1, C16980tz r2, C209912j r3, C27051Qg r4, C27061Qh r5, C210012k r6) {
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }

    public C37771pi A00(String str) {
        String[] strArr;
        String str2;
        AnonymousClass00B.A00();
        C27061Qh r2 = this.A04;
        if (str == null) {
            strArr = null;
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack FROM downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id)";
        } else {
            strArr = new String[]{str};
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack FROM downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id) WHERE id= ?";
        }
        List A002 = r2.A00(str2, strArr);
        if (A002.isEmpty()) {
            return null;
        }
        if (A002.size() < 2) {
            return (C37771pi) A002.get(0);
        }
        StringBuilder sb = new StringBuilder("StickerPack/getDownloadablePackById/there should only be one sticker that matches this id:");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public C37771pi A01(String str) {
        String[] strArr;
        String str2;
        String str3;
        AnonymousClass00B.A00();
        C27061Qh r2 = this.A04;
        if (str == null) {
            strArr = null;
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)";
        } else {
            strArr = new String[]{str};
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id) WHERE installed_id= ?";
        }
        List A002 = r2.A00(str2, strArr);
        if (A002.size() <= 0) {
            return null;
        }
        if (A002.size() < 2) {
            C37771pi r5 = (C37771pi) A002.get(0);
            if (r5 == null) {
                return r5;
            }
            List<C34151jm> A022 = this.A05.A02(str);
            if (!A022.isEmpty()) {
                for (C34151jm r22 : A022) {
                    if (!(r22.A04 != null || (str3 = r22.A09) == null || str3.length() == 0)) {
                        AnonymousClass00B.A06(str3);
                        AnonymousClass1XO A003 = AnonymousClass1XO.A00(WebpUtils.fetchWebpMetadata(str3));
                        if (A003 != null) {
                            r22.A04 = A003;
                            r22.A0H = A003.A06;
                            r22.A05 = A003.A00;
                            C37781pj[] r0 = A003.A09;
                            if (r0 != null) {
                                r22.A01(r0);
                            }
                        }
                    }
                }
            }
            r5.A04 = A022;
            return r5;
        }
        StringBuilder sb = new StringBuilder("StickerPack/getInstalledPackById/there should only be one sticker that matches this id:");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r4 <= 0) goto L_0x0043;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.C37771pi r10, boolean r11) {
        /*
            r9 = this;
            X.AnonymousClass00B.A00()
            X.1Qh r0 = r9.A04
            java.lang.String r8 = r10.A0F
            X.12j r0 = r0.A01
            X.0tf r5 = r0.A02()
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x007a }
            r0 = 0
            r3[r0] = r8     // Catch:{ all -> 0x007a }
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "installed_sticker_packs"
            java.lang.String r0 = "installed_id LIKE ?"
            int r4 = r2.A01(r1, r0, r3)     // Catch:{ all -> 0x007a }
            r5.close()
            X.12k r0 = r9.A05
            X.12j r0 = r0.A00
            X.0tf r3 = r0.A02()
            java.lang.String r7 = "sticker_pack_id LIKE ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0075 }
            r0 = 0
            r2[r0] = r8     // Catch:{ all -> 0x0075 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "stickers"
            int r0 = r1.A01(r0, r7, r2)     // Catch:{ all -> 0x0075 }
            r3.close()
            r6 = 1
            if (r0 <= 0) goto L_0x0043
            r5 = 1
            if (r4 > 0) goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            if (r11 != 0) goto L_0x0074
            X.1Qg r4 = r9.A03
            monitor-enter(r4)
            X.12j r0 = r4.A00     // Catch:{ all -> 0x0071 }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x0071 }
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x006c }
            r0 = 0
            r2[r0] = r8     // Catch:{ all -> 0x006c }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "sticker_pack_order"
            int r1 = r1.A01(r0, r7, r2)     // Catch:{ all -> 0x006c }
            r3.close()     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)
            r0 = 0
            if (r1 <= 0) goto L_0x0065
            r0 = 1
        L_0x0065:
            if (r5 == 0) goto L_0x006a
            if (r0 == 0) goto L_0x006a
            return r6
        L_0x006a:
            r6 = 0
            return r6
        L_0x006c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0074:
            return r5
        L_0x0075:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x007e }
            throw r0
        L_0x007a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x007e }
        L_0x007e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14X.A02(X.1pi, boolean):boolean");
    }
}
