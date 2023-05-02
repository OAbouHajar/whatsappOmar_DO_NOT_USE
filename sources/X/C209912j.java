package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.12j  reason: invalid class name and case insensitive filesystem */
public class C209912j extends C16780td {
    public final C16300so A00;
    public final C206911f A01;

    public C209912j(C16300so r7, C16980tz r8, C206911f r9, C14710pd r10) {
        super(r8.A00, r7, r10, "stickers.db", 40);
        this.A00 = r7;
        this.A01 = r9;
    }

    public static final void A00(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_is_avatar_index ON stickers (is_avatar)");
        } catch (SQLiteException e2) {
            AnonymousClass00B.A09("StickerDBHelper/addStickerIsAvatarColumnIndex", e2);
        }
    }

    public C16810tg A05() {
        return C33931jQ.A01(super.A00(), this.A01);
    }

    public final void A06(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS downloadable_sticker_packs");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS stickers");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS installed_sticker_packs");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS starred_stickers");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sticker_pack_order");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS recent_stickers");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS unseen_sticker_packs");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS third_party_whitelist_packs");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS new_sticker_packs");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS third_party_sticker_emoji_mapping");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sticker_md_upload");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, PRIMARY KEY(plain_file_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, PRIMARY KEY(id))");
        sQLiteDatabase.execSQL("CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, PRIMARY KEY(installed_id))");
        sQLiteDatabase.execSQL("CREATE TABLE starred_stickers (plaintext_hash TEXT  NOT NULL , timestamp LONG , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avatar INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))");
        sQLiteDatabase.execSQL("CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))");
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_avatar_template_id_index ON stickers (avatar_template_id)");
        } catch (SQLiteException e2) {
            AnonymousClass00B.A09("StickerDBHelper/addStickerIsAvatarColumnIndex", e2);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)");
        } catch (SQLiteException e3) {
            AnonymousClass00B.A09("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e3);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_avatar_template_index ON recent_stickers (avatar_template_id)");
        } catch (SQLiteException e4) {
            AnonymousClass00B.A09("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e4);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS starred_sticker_is_avatar_index ON starred_stickers (is_avatar)");
        } catch (SQLiteException e5) {
            AnonymousClass00B.A09("StickersDBHelper/addStarredStickerAvocadoColumnIndex", e5);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS starred_sticker_avatar_template_id_index ON starred_stickers (avatar_template_id)");
        } catch (SQLiteException e6) {
            AnonymousClass00B.A09("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e6);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS installed_sticker_packs_avatar_pack_index ON installed_sticker_packs (installed_is_avatar_pack)");
        } catch (SQLiteException e7) {
            AnonymousClass00B.A09("StickerDBHelper/addInstalledIsAvatarStickerPackColumnIndex", e7);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_pack_id_index ON stickers (sticker_pack_id)");
        } catch (SQLiteException e8) {
            AnonymousClass00B.A09("StickerDBHelper/addStickerPackIdIndex", e8);
        }
        A00(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("StickerDBHelper/onDowngrade/oldVersion:");
        sb.append(i2);
        sb.append(", newVersion:");
        sb.append(i3);
        Log.i(sb.toString());
        A06(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00bc, code lost:
        r13.execSQL("DROP TABLE IF EXISTS installed_sticker_packs");
        r13.execSQL("CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, PRIMARY KEY(installed_id))");
        r13.execSQL("DROP TABLE IF EXISTS stickers");
        r13.execSQL("CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, PRIMARY KEY(plain_file_hash))");
        r13.execSQL("DROP TABLE IF EXISTS downloadable_sticker_packs");
        r13.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, PRIMARY KEY(id))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00d6, code lost:
        X.C34411kD.A01(r13, "third_party_whitelist_packs", "sticker_pack_name", "TEXT");
        X.C34411kD.A01(r13, "third_party_whitelist_packs", "sticker_pack_publisher", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00e2, code lost:
        r13.execSQL("DROP TABLE IF EXISTS new_sticker_packs");
        r13.execSQL("CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ec, code lost:
        X.C34411kD.A01(r13, "stickers", "direct_path", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00f1, code lost:
        X.C34411kD.A01(r13, "recent_stickers", "hash_of_image_part", "TEXT");
        X.C34411kD.A01(r13, "starred_stickers", "hash_of_image_part", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00f7, code lost:
        X.C34411kD.A01(r13, "third_party_whitelist_packs", "sticker_pack_image_data_hash", "TEXT");
        X.C34411kD.A01(r13, "third_party_whitelist_packs", "avoid_cache", "INTEGER");
        X.C34411kD.A01(r13, "third_party_whitelist_packs", "is_animated_pack", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0107, code lost:
        X.C34411kD.A01(r13, "downloadable_sticker_packs", "animated_pack", "INTEGER");
        X.C34411kD.A01(r13, "installed_sticker_packs", "installed_animated_pack", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0115, code lost:
        X.C34411kD.A01(r13, "recent_stickers", "url", "TEXT");
        X.C34411kD.A01(r13, "recent_stickers", "enc_hash", "TEXT");
        X.C34411kD.A01(r13, "recent_stickers", "direct_path", "TEXT");
        X.C34411kD.A01(r13, "recent_stickers", "mimetype", "TEXT");
        X.C34411kD.A01(r13, "recent_stickers", "media_key", "TEXT");
        X.C34411kD.A01(r13, "recent_stickers", "file_size", "INTEGER");
        X.C34411kD.A01(r13, "recent_stickers", "width", "INTEGER");
        X.C34411kD.A01(r13, "recent_stickers", "height", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x013d, code lost:
        r3 = new java.lang.String[]{"urlTEXT", "enc_hashTEXT", "direct_pathTEXT", "mimetypeTEXT", "media_keyTEXT", "file_sizeINTEGER", "widthINTEGER", "heightINTEGER"};
        r15 = new java.util.LinkedHashMap();
        r15.put("plaintext_hash", "TEXT NOT NULL");
        r15.put("entry_weight", "FLOAT NOT NULL");
        r15.put("hash_of_image_part", "TEXT");
        r15.put("url", "TEXT");
        r15.put("enc_hash", "TEXT");
        r15.put("direct_path", "TEXT");
        r15.put("mimetype", "TEXT");
        r15.put("media_key", "TEXT");
        r15.put("file_size", "INTEGER");
        r15.put("width", "INTEGER");
        r15.put("height", "INTEGER");
        r1 = new java.lang.StringBuilder("SELECT * FROM ");
        r1.append("recent_stickers");
        r1.append(" LIMIT 0");
        r5 = r13.rawQuery(r1.toString(), (java.lang.String[]) null);
        r2 = 0;
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01d1, code lost:
        if (r2 >= 8) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01d3, code lost:
        if (r16 != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01dd, code lost:
        if (r5.getColumnIndex(r3[r2]) == -1) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01df, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01e1, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01e4, code lost:
        if (r16 == false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01e6, code lost:
        r16 = r15.keySet();
        r3 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01f2, code lost:
        if (r3.hasNext() == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01f4, code lost:
        r2 = (java.lang.String) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01fe, code lost:
        if (r5.getColumnIndex(r2) != -1) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0200, code lost:
        r4 = r4.A00;
        r1 = new java.lang.StringBuilder();
        r1.append("recent_stickers");
        r1.append(" table migration failed due to non-existent desired column ");
        r1.append(r2);
        r4.AcB("StickersDBHelper/removeUndesiredColumns", r1.toString(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x021e, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("recent_stickers");
        r1.append("_temp");
        r4 = r1.toString();
        r17 = android.text.TextUtils.join(",", r15.keySet());
        r1 = new java.util.ArrayList();
        r16 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0246, code lost:
        if (r16.hasNext() == false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0248, code lost:
        r3 = (java.lang.String) r16.next();
        r2 = new java.lang.StringBuilder();
        r2.append(r3);
        r2.append(" ");
        r2.append((java.lang.String) r15.get(r3));
        r1.add(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x026c, code lost:
        r3 = android.text.TextUtils.join(", ", r1);
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x027a, code lost:
        if (r15.containsKey("plaintext_hash") == false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x027c, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append(", PRIMARY KEY(");
        r2.append("plaintext_hash");
        r2.append(")");
        r2 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0290, code lost:
        r14 = new java.lang.StringBuilder();
        r14.append("CREATE TEMPORARY TABLE ");
        r14.append(r4);
        r14.append(" (");
        r14.append(r3);
        r14.append(")");
        r13.execSQL(r14.toString());
        r14 = new java.lang.StringBuilder();
        r14.append("INSERT INTO ");
        r14.append(r4);
        r14.append(" SELECT ");
        r14.append(r17);
        r14.append(" FROM ");
        r14.append("recent_stickers");
        r13.execSQL(r14.toString());
        r14 = new java.lang.StringBuilder();
        r14.append("DROP TABLE ");
        r14.append("recent_stickers");
        r13.execSQL(r14.toString());
        r14 = new java.lang.StringBuilder();
        r14.append("CREATE TABLE ");
        r14.append("recent_stickers");
        r14.append(" (");
        r14.append(r3);
        r14.append(r2);
        r14.append(")");
        r13.execSQL(r14.toString());
        r1 = new java.lang.StringBuilder();
        r1.append("INSERT INTO ");
        r1.append("recent_stickers");
        r1.append(" SELECT ");
        r1.append(r17);
        r1.append(" FROM ");
        r1.append(r4);
        r13.execSQL(r1.toString());
        r1 = new java.lang.StringBuilder();
        r1.append("DROP TABLE ");
        r1.append(r4);
        r13.execSQL(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0346, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0347, code lost:
        if (r5 != null) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x034d, code lost:
        if (r5 == null) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x034f, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0352, code lost:
        X.C34411kD.A01(r13, "starred_stickers", "url", "TEXT");
        X.C34411kD.A01(r13, "starred_stickers", "enc_hash", "TEXT");
        X.C34411kD.A01(r13, "starred_stickers", "direct_path", "TEXT");
        X.C34411kD.A01(r13, "starred_stickers", "mimetype", "TEXT");
        X.C34411kD.A01(r13, "starred_stickers", "media_key", "TEXT");
        X.C34411kD.A01(r13, "starred_stickers", "file_size", "INTEGER");
        X.C34411kD.A01(r13, "starred_stickers", "width", "INTEGER");
        X.C34411kD.A01(r13, "starred_stickers", "height", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x037a, code lost:
        X.C34411kD.A01(r13, "stickers", "emojis", "TEXT");
        X.C34411kD.A01(r13, "recent_stickers", "emojis", "TEXT");
        X.C34411kD.A01(r13, "recent_stickers", "is_first_party", "INTEGER");
        X.C34411kD.A01(r13, "starred_stickers", "emojis", "TEXT");
        X.C34411kD.A01(r13, "starred_stickers", "is_first_party", "INTEGER");
        r13.execSQL("DROP TABLE IF EXISTS third_party_sticker_emoji_mapping");
        r13.execSQL("CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0397, code lost:
        X.C34411kD.A01(r13, "stickers", "hash_of_image_part", "TEXT");
        X.C34411kD.A01(r13, "third_party_sticker_emoji_mapping", "hash_of_image_part", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x03a0, code lost:
        X.C34411kD.A01(r13, "recent_stickers", "is_avocado", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r13.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x03ab, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0088, code lost:
        r13.execSQL("DROP TABLE IF EXISTS downloadable_sticker_packs");
        r13.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, PRIMARY KEY(id))");
        r13.execSQL("DROP TABLE IF EXISTS sticker_pack_order");
        r13.execSQL("CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x03ac, code lost:
        X.AnonymousClass00B.A09("StickersDBHelper/addRecentStickerAvocadoColumnIndex", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0098, code lost:
        r13.execSQL("DROP TABLE IF EXISTS recent_stickers");
        r13.execSQL("CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , PRIMARY KEY(plaintext_hash))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x00a2, code lost:
        r13.execSQL("DROP TABLE IF EXISTS downloadable_sticker_packs");
        r13.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, PRIMARY KEY(id))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00a8, code lost:
        r13.execSQL("DROP TABLE IF EXISTS unseen_sticker_packs");
        r13.execSQL("CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00b2, code lost:
        r13.execSQL("DROP TABLE IF EXISTS third_party_whitelist_packs");
        r13.execSQL("CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r34, int r35, int r36) {
        /*
            r33 = this;
            java.lang.String r0 = "StickersDBHelper/onUpgrade/old version:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r14 = r35
            r1.append(r14)
            java.lang.String r0 = ", new version: "
            r1.append(r0)
            r5 = r36
            r1.append(r5)
            java.lang.String r0 = ", stacktrace:"
            r1.append(r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r32 = "avatar_template_id"
            java.lang.String r31 = "height"
            java.lang.String r30 = "width"
            java.lang.String r29 = "file_size"
            java.lang.String r28 = "media_key"
            java.lang.String r27 = "mimetype"
            java.lang.String r26 = "enc_hash"
            java.lang.String r25 = "url"
            java.lang.String r3 = "CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, PRIMARY KEY(id))"
            java.lang.String r2 = "DROP TABLE IF EXISTS downloadable_sticker_packs"
            java.lang.String r24 = "installed_sticker_packs"
            java.lang.String r23 = "direct_path"
            java.lang.String r12 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r11 = "hash_of_image_part"
            java.lang.String r10 = "stickers"
            java.lang.String r1 = "third_party_whitelist_packs"
            java.lang.String r9 = "starred_stickers"
            java.lang.String r8 = "recent_stickers"
            java.lang.String r7 = "INTEGER"
            java.lang.String r6 = "TEXT"
            r4 = r33
            r13 = r34
            switch(r35) {
                case 1: goto L_0x0436;
                case 2: goto L_0x0436;
                case 3: goto L_0x0436;
                case 4: goto L_0x0436;
                case 5: goto L_0x0436;
                case 6: goto L_0x007e;
                case 7: goto L_0x0088;
                case 8: goto L_0x0098;
                case 9: goto L_0x00a2;
                case 10: goto L_0x00a8;
                case 11: goto L_0x00b2;
                case 12: goto L_0x00bc;
                case 13: goto L_0x00d6;
                case 14: goto L_0x00e2;
                case 15: goto L_0x00ec;
                case 16: goto L_0x00f1;
                case 17: goto L_0x00f7;
                case 18: goto L_0x00f7;
                case 19: goto L_0x0107;
                case 20: goto L_0x0115;
                case 21: goto L_0x0115;
                case 22: goto L_0x013d;
                case 23: goto L_0x0352;
                case 24: goto L_0x037a;
                case 25: goto L_0x0397;
                case 26: goto L_0x03a0;
                case 27: goto L_0x03a0;
                case 28: goto L_0x03b1;
                case 29: goto L_0x03c2;
                case 30: goto L_0x03d5;
                case 31: goto L_0x03dd;
                case 32: goto L_0x03e2;
                case 33: goto L_0x03e7;
                case 34: goto L_0x03ec;
                case 35: goto L_0x03fd;
                case 36: goto L_0x040e;
                case 37: goto L_0x041a;
                case 38: goto L_0x0426;
                case 39: goto L_0x0432;
                default: goto L_0x0062;
            }
        L_0x0062:
            java.lang.String r0 = "Unknown upgrade from "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r14)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x007e:
            java.lang.String r0 = "DROP TABLE IF EXISTS starred_stickers"
            r13.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE starred_stickers (plaintext_hash TEXT  NOT NULL , timestamp LONG , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avatar INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , PRIMARY KEY(plaintext_hash))"
            r13.execSQL(r0)
        L_0x0088:
            r13.execSQL(r2)
            r13.execSQL(r3)
            java.lang.String r0 = "DROP TABLE IF EXISTS sticker_pack_order"
            r13.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)"
            r13.execSQL(r0)
        L_0x0098:
            java.lang.String r0 = "DROP TABLE IF EXISTS recent_stickers"
            r13.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , PRIMARY KEY(plaintext_hash))"
            r13.execSQL(r0)
        L_0x00a2:
            r13.execSQL(r2)
            r13.execSQL(r3)
        L_0x00a8:
            java.lang.String r0 = "DROP TABLE IF EXISTS unseen_sticker_packs"
            r13.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)"
            r13.execSQL(r0)
        L_0x00b2:
            java.lang.String r0 = "DROP TABLE IF EXISTS third_party_whitelist_packs"
            r13.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))"
            r13.execSQL(r0)
        L_0x00bc:
            java.lang.String r0 = "DROP TABLE IF EXISTS installed_sticker_packs"
            r13.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, PRIMARY KEY(installed_id))"
            r13.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS stickers"
            r13.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, PRIMARY KEY(plain_file_hash))"
            r13.execSQL(r0)
            r13.execSQL(r2)
            r13.execSQL(r3)
        L_0x00d6:
            java.lang.String r0 = "sticker_pack_name"
            X.C34411kD.A01(r13, r1, r0, r6)
            java.lang.String r0 = "sticker_pack_publisher"
            X.C34411kD.A01(r13, r1, r0, r6)
        L_0x00e2:
            java.lang.String r0 = "DROP TABLE IF EXISTS new_sticker_packs"
            r13.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)"
            r13.execSQL(r0)
        L_0x00ec:
            r0 = r23
            X.C34411kD.A01(r13, r10, r0, r6)
        L_0x00f1:
            X.C34411kD.A01(r13, r8, r11, r6)
            X.C34411kD.A01(r13, r9, r11, r6)
        L_0x00f7:
            java.lang.String r0 = "sticker_pack_image_data_hash"
            X.C34411kD.A01(r13, r1, r0, r6)
            java.lang.String r0 = "avoid_cache"
            X.C34411kD.A01(r13, r1, r0, r7)
            java.lang.String r0 = "is_animated_pack"
            X.C34411kD.A01(r13, r1, r0, r7)
        L_0x0107:
            java.lang.String r1 = "downloadable_sticker_packs"
            java.lang.String r0 = "animated_pack"
            X.C34411kD.A01(r13, r1, r0, r7)
            java.lang.String r1 = "installed_animated_pack"
            r0 = r24
            X.C34411kD.A01(r13, r0, r1, r7)
        L_0x0115:
            r0 = r25
            X.C34411kD.A01(r13, r8, r0, r6)
            r0 = r26
            X.C34411kD.A01(r13, r8, r0, r6)
            r0 = r23
            X.C34411kD.A01(r13, r8, r0, r6)
            r0 = r27
            X.C34411kD.A01(r13, r8, r0, r6)
            r0 = r28
            X.C34411kD.A01(r13, r8, r0, r6)
            r0 = r29
            X.C34411kD.A01(r13, r8, r0, r7)
            r0 = r30
            X.C34411kD.A01(r13, r8, r0, r7)
            r0 = r31
            X.C34411kD.A01(r13, r8, r0, r7)
        L_0x013d:
            r0 = 8
            java.lang.String[] r3 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "urlTEXT"
            r3[r1] = r0
            r1 = 1
            java.lang.String r0 = "enc_hashTEXT"
            r3[r1] = r0
            r1 = 2
            java.lang.String r0 = "direct_pathTEXT"
            r3[r1] = r0
            r1 = 3
            java.lang.String r0 = "mimetypeTEXT"
            r3[r1] = r0
            r1 = 4
            java.lang.String r0 = "media_keyTEXT"
            r3[r1] = r0
            r1 = 5
            java.lang.String r0 = "file_sizeINTEGER"
            r3[r1] = r0
            r1 = 6
            java.lang.String r0 = "widthINTEGER"
            r3[r1] = r0
            r1 = 7
            java.lang.String r0 = "heightINTEGER"
            r3[r1] = r0
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            java.lang.String r14 = "plaintext_hash"
            java.lang.String r0 = "TEXT NOT NULL"
            r15.put(r14, r0)
            java.lang.String r1 = "entry_weight"
            java.lang.String r0 = "FLOAT NOT NULL"
            r15.put(r1, r0)
            r15.put(r11, r6)
            r0 = r25
            r15.put(r0, r6)
            r0 = r26
            r15.put(r0, r6)
            r0 = r23
            r15.put(r0, r6)
            r0 = r27
            r15.put(r0, r6)
            r0 = r28
            r15.put(r0, r6)
            r0 = r29
            r15.put(r0, r7)
            r0 = r30
            r15.put(r0, r7)
            r0 = r31
            r15.put(r0, r7)
            java.lang.String r22 = "DROP TABLE "
            java.lang.String r21 = " FROM "
            java.lang.String r20 = " SELECT "
            java.lang.String r19 = "INSERT INTO "
            java.lang.String r18 = " ("
            java.lang.String r0 = "SELECT * FROM "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = " LIMIT 0"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 0
            android.database.Cursor r5 = r13.rawQuery(r1, r0)
            r2 = 0
            r16 = 0
        L_0x01ce:
            r1 = -1
            r0 = 8
            if (r2 >= r0) goto L_0x01e4
            if (r16 != 0) goto L_0x01df
            r0 = r3[r2]     // Catch:{ all -> 0x0346 }
            int r0 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x0346 }
            r16 = 0
            if (r0 == r1) goto L_0x01e1
        L_0x01df:
            r16 = 1
        L_0x01e1:
            int r2 = r2 + 1
            goto L_0x01ce
        L_0x01e4:
            if (r16 == 0) goto L_0x034d
            java.util.Set r16 = r15.keySet()     // Catch:{ all -> 0x0346 }
            java.util.Iterator r3 = r16.iterator()     // Catch:{ all -> 0x0346 }
        L_0x01ee:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x021e
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0346 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0346 }
            int r0 = r5.getColumnIndex(r2)     // Catch:{ all -> 0x0346 }
            if (r0 != r1) goto L_0x01ee
            X.0so r4 = r4.A00     // Catch:{ all -> 0x0346 }
            java.lang.String r3 = "StickersDBHelper/removeUndesiredColumns"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            r1.<init>()     // Catch:{ all -> 0x0346 }
            r1.append(r8)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = " table migration failed due to non-existent desired column "
            r1.append(r0)     // Catch:{ all -> 0x0346 }
            r1.append(r2)     // Catch:{ all -> 0x0346 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0346 }
            r0 = 1
            r4.AcB(r3, r1, r0)     // Catch:{ all -> 0x0346 }
            goto L_0x034f
        L_0x021e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            r1.<init>()     // Catch:{ all -> 0x0346 }
            r1.append(r8)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = "_temp"
            r1.append(r0)     // Catch:{ all -> 0x0346 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0346 }
            java.lang.String r1 = ","
            java.util.Set r0 = r15.keySet()     // Catch:{ all -> 0x0346 }
            java.lang.String r17 = android.text.TextUtils.join(r1, r0)     // Catch:{ all -> 0x0346 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0346 }
            r1.<init>()     // Catch:{ all -> 0x0346 }
            java.util.Iterator r16 = r16.iterator()     // Catch:{ all -> 0x0346 }
        L_0x0242:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x026c
            java.lang.Object r3 = r16.next()     // Catch:{ all -> 0x0346 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0346 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            r2.<init>()     // Catch:{ all -> 0x0346 }
            r2.append(r3)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = " "
            r2.append(r0)     // Catch:{ all -> 0x0346 }
            java.lang.Object r0 = r15.get(r3)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0346 }
            r2.append(r0)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0346 }
            r1.add(r0)     // Catch:{ all -> 0x0346 }
            goto L_0x0242
        L_0x026c:
            java.lang.String r0 = ", "
            java.lang.String r3 = android.text.TextUtils.join(r0, r1)     // Catch:{ all -> 0x0346 }
            java.lang.String r2 = ""
            java.lang.String r1 = ")"
            boolean r0 = r15.containsKey(r14)     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x0290
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            r2.<init>()     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = ", PRIMARY KEY("
            r2.append(r0)     // Catch:{ all -> 0x0346 }
            r2.append(r14)     // Catch:{ all -> 0x0346 }
            r2.append(r1)     // Catch:{ all -> 0x0346 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0346 }
        L_0x0290:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            r14.<init>()     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = "CREATE TEMPORARY TABLE "
            r14.append(r0)     // Catch:{ all -> 0x0346 }
            r14.append(r4)     // Catch:{ all -> 0x0346 }
            r0 = r18
            r14.append(r0)     // Catch:{ all -> 0x0346 }
            r14.append(r3)     // Catch:{ all -> 0x0346 }
            r14.append(r1)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x0346 }
            r13.execSQL(r0)     // Catch:{ all -> 0x0346 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            r14.<init>()     // Catch:{ all -> 0x0346 }
            r0 = r19
            r14.append(r0)     // Catch:{ all -> 0x0346 }
            r14.append(r4)     // Catch:{ all -> 0x0346 }
            r0 = r20
            r14.append(r0)     // Catch:{ all -> 0x0346 }
            r0 = r17
            r14.append(r0)     // Catch:{ all -> 0x0346 }
            r0 = r21
            r14.append(r0)     // Catch:{ all -> 0x0346 }
            r14.append(r8)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x0346 }
            r13.execSQL(r0)     // Catch:{ all -> 0x0346 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            r14.<init>()     // Catch:{ all -> 0x0346 }
            r0 = r22
            r14.append(r0)     // Catch:{ all -> 0x0346 }
            r14.append(r8)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x0346 }
            r13.execSQL(r0)     // Catch:{ all -> 0x0346 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            r14.<init>()     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = "CREATE TABLE "
            r14.append(r0)     // Catch:{ all -> 0x0346 }
            r14.append(r8)     // Catch:{ all -> 0x0346 }
            r0 = r18
            r14.append(r0)     // Catch:{ all -> 0x0346 }
            r14.append(r3)     // Catch:{ all -> 0x0346 }
            r14.append(r2)     // Catch:{ all -> 0x0346 }
            r14.append(r1)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x0346 }
            r13.execSQL(r0)     // Catch:{ all -> 0x0346 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            r1.<init>()     // Catch:{ all -> 0x0346 }
            r0 = r19
            r1.append(r0)     // Catch:{ all -> 0x0346 }
            r1.append(r8)     // Catch:{ all -> 0x0346 }
            r0 = r20
            r1.append(r0)     // Catch:{ all -> 0x0346 }
            r0 = r17
            r1.append(r0)     // Catch:{ all -> 0x0346 }
            r0 = r21
            r1.append(r0)     // Catch:{ all -> 0x0346 }
            r1.append(r4)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0346 }
            r13.execSQL(r0)     // Catch:{ all -> 0x0346 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            r1.<init>()     // Catch:{ all -> 0x0346 }
            r0 = r22
            r1.append(r0)     // Catch:{ all -> 0x0346 }
            r1.append(r4)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0346 }
            r13.execSQL(r0)     // Catch:{ all -> 0x0346 }
            goto L_0x034d
        L_0x0346:
            r0 = move-exception
            if (r5 == 0) goto L_0x034c
            r5.close()     // Catch:{ all -> 0x034c }
        L_0x034c:
            throw r0
        L_0x034d:
            if (r5 == 0) goto L_0x0352
        L_0x034f:
            r5.close()
        L_0x0352:
            r0 = r25
            X.C34411kD.A01(r13, r9, r0, r6)
            r0 = r26
            X.C34411kD.A01(r13, r9, r0, r6)
            r0 = r23
            X.C34411kD.A01(r13, r9, r0, r6)
            r0 = r27
            X.C34411kD.A01(r13, r9, r0, r6)
            r0 = r28
            X.C34411kD.A01(r13, r9, r0, r6)
            r0 = r29
            X.C34411kD.A01(r13, r9, r0, r7)
            r0 = r30
            X.C34411kD.A01(r13, r9, r0, r7)
            r0 = r31
            X.C34411kD.A01(r13, r9, r0, r7)
        L_0x037a:
            java.lang.String r1 = "emojis"
            X.C34411kD.A01(r13, r10, r1, r6)
            X.C34411kD.A01(r13, r8, r1, r6)
            java.lang.String r0 = "is_first_party"
            X.C34411kD.A01(r13, r8, r0, r7)
            X.C34411kD.A01(r13, r9, r1, r6)
            X.C34411kD.A01(r13, r9, r0, r7)
            java.lang.String r0 = "DROP TABLE IF EXISTS third_party_sticker_emoji_mapping"
            r13.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))"
            r13.execSQL(r0)
        L_0x0397:
            X.C34411kD.A01(r13, r10, r11, r6)
            java.lang.String r0 = "third_party_sticker_emoji_mapping"
            X.C34411kD.A01(r13, r0, r11, r6)
        L_0x03a0:
            java.lang.String r0 = "is_avocado"
            X.C34411kD.A01(r13, r8, r0, r12)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)"
            r13.execSQL(r0)     // Catch:{ SQLiteException -> 0x03ab }
            goto L_0x03b1
        L_0x03ab:
            r1 = move-exception
            java.lang.String r0 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.AnonymousClass00B.A09(r0, r1)
        L_0x03b1:
            java.lang.String r0 = "is_avatar"
            X.C34411kD.A01(r13, r9, r0, r12)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS starred_sticker_is_avatar_index ON starred_stickers (is_avatar)"
            r13.execSQL(r0)     // Catch:{ SQLiteException -> 0x03bc }
            goto L_0x03c2
        L_0x03bc:
            r1 = move-exception
            java.lang.String r0 = "StickersDBHelper/addStarredStickerAvocadoColumnIndex"
            X.AnonymousClass00B.A09(r0, r1)
        L_0x03c2:
            java.lang.String r1 = "installed_is_avatar_pack"
            r0 = r24
            X.C34411kD.A01(r13, r0, r1, r12)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS installed_sticker_packs_avatar_pack_index ON installed_sticker_packs (installed_is_avatar_pack)"
            r13.execSQL(r0)     // Catch:{ SQLiteException -> 0x03cf }
            goto L_0x03d5
        L_0x03cf:
            r1 = move-exception
            java.lang.String r0 = "StickerDBHelper/addInstalledIsAvatarStickerPackColumnIndex"
            X.AnonymousClass00B.A09(r0, r1)
        L_0x03d5:
            java.lang.String r0 = "is_avatar"
            X.C34411kD.A01(r13, r10, r0, r12)
            A00(r13)
        L_0x03dd:
            java.lang.String r0 = "last_sticker_sent_ts"
            X.C34411kD.A01(r13, r8, r0, r12)
        L_0x03e2:
            java.lang.String r0 = "DROP TABLE IF EXISTS sticker_md_upload"
            r13.execSQL(r0)
        L_0x03e7:
            r0 = r32
            X.C34411kD.A01(r13, r10, r0, r6)
        L_0x03ec:
            r0 = r32
            X.C34411kD.A01(r13, r8, r0, r6)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS recent_sticker_avatar_template_index ON recent_stickers (avatar_template_id)"
            r13.execSQL(r0)     // Catch:{ SQLiteException -> 0x03f7 }
            goto L_0x03fd
        L_0x03f7:
            r1 = move-exception
            java.lang.String r0 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.AnonymousClass00B.A09(r0, r1)
        L_0x03fd:
            r0 = r32
            X.C34411kD.A01(r13, r9, r0, r6)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS starred_sticker_avatar_template_id_index ON starred_stickers (avatar_template_id)"
            r13.execSQL(r0)     // Catch:{ SQLiteException -> 0x0408 }
            goto L_0x040e
        L_0x0408:
            r1 = move-exception
            java.lang.String r0 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.AnonymousClass00B.A09(r0, r1)
        L_0x040e:
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS sticker_avatar_template_id_index ON stickers (avatar_template_id)"
            r13.execSQL(r0)     // Catch:{ SQLiteException -> 0x0414 }
            goto L_0x041a
        L_0x0414:
            r1 = move-exception
            java.lang.String r0 = "StickerDBHelper/addStickerIsAvatarColumnIndex"
            X.AnonymousClass00B.A09(r0, r1)
        L_0x041a:
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS sticker_pack_id_index ON stickers (sticker_pack_id)"
            r13.execSQL(r0)     // Catch:{ SQLiteException -> 0x0420 }
            goto L_0x0426
        L_0x0420:
            r1 = move-exception
            java.lang.String r0 = "StickerDBHelper/addStickerPackIdIndex"
            X.AnonymousClass00B.A09(r0, r1)
        L_0x0426:
            java.lang.String r1 = "installed_empty_recents_avatar_template_id"
            r0 = r24
            X.C34411kD.A01(r13, r0, r1, r6)
            java.lang.String r1 = "installed_empty_favorites_avatar_template_id"
            X.C34411kD.A01(r13, r0, r1, r6)
        L_0x0432:
            A00(r13)
            return
        L_0x0436:
            r4.A06(r13)
            r4.onCreate(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209912j.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
