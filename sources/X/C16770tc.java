package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.0tc  reason: invalid class name and case insensitive filesystem */
public class C16770tc extends C16780td {
    public final C206911f A00;

    public C16770tc(C16300so r7, C16980tz r8, C206911f r9, C14710pd r10) {
        super(r8.A00, r7, r10, "media.db", 26);
        this.A00 = r9;
    }

    public C16810tg A05() {
        return C33931jQ.A01(super.A00(), this.A00);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_job");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_experiments");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_data_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS draft_voice_note_metadata");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS express_path_download_data");
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER,reupload_attempt_count INTEGER,last_reupload_attempt_timestamp TIMESTAMP,last_reupload_success_timestamp TIMESTAMP)");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE draft_voice_note_metadata (chat_jid TEXT PRIMARY KEY NOT NULL, page_number INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE express_path_download_data (enc_file_hash TEXT PRIMARY KEY NOT NULL, ep_saved_time_ms INTEGER, ep_saved_bytes INTEGER, last_update_time TIMESTAMP)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_job");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_experiments");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_key_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_data_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS shared_media_ids");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS draft_voice_note_metadata");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS express_path_download_data");
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_job");
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER,reupload_attempt_count INTEGER,last_reupload_attempt_timestamp TIMESTAMP,last_reupload_success_timestamp TIMESTAMP)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_experiments");
        if (i2 < 16) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_key_store");
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_data_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS shared_media_ids");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS draft_voice_note_metadata");
        sQLiteDatabase.execSQL("CREATE TABLE draft_voice_note_metadata (chat_jid TEXT PRIMARY KEY NOT NULL, page_number INTEGER)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS express_path_download_data");
        sQLiteDatabase.execSQL("CREATE TABLE express_path_download_data (enc_file_hash TEXT PRIMARY KEY NOT NULL, ep_saved_time_ms INTEGER, ep_saved_bytes INTEGER, last_update_time TIMESTAMP)");
    }
}
