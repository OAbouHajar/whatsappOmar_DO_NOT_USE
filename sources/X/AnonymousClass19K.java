package X;

import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.19K  reason: invalid class name */
public class AnonymousClass19K extends C16780td {
    public final C206911f A00;
    public final AnonymousClass1UY A01;

    public AnonymousClass19K(C16300so r8, C16980tz r9, C206911f r10, C14710pd r11, AnonymousClass01D r12) {
        super(r9.A00, r8, r11, "sync.db", 47);
        this.A00 = r10;
        this.A01 = new AnonymousClass1UY(r12);
    }

    public C16810tg A05() {
        return C33931jQ.A01(super.A00(), this.A00);
    }

    public void A06(SQLiteDatabase sQLiteDatabase) {
        Log.i("sync-db-helper/reset");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS syncd_mutations");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS collection_versions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS pending_mutations");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS peer_messages");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS msg_history_sync");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS crypto_info");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS peer_messages_message_key_index");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fanout_backfill_messages");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS missing_keys");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS syncd_mutations_active_mutations_index");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS syncd_mutations_active_mutations_chat_jid_index");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS history_sync_companion_index");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS history_sync_companion");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS rmr_response_error");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS rmr_response_error_file_key_rmr_source");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS rmr_response_error_file_key_rmr_source_device_id");
        onCreate(sQLiteDatabase);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            Log.i("sync-db-observer/onDbReset");
            ((C23571Cm) it.next()).A01.A03(5);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE syncd_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, collection_name TEXT NOT NULL, are_dependencies_missing BOOLEAN NOT NULL, mutation_mac BLOB, device_id INTEGER NOT NULL DEFAULT 0, epoch INTEGER NOT NULL DEFAULT 0, chat_jid TEXT, mutation_name TEXT )");
        sQLiteDatabase.execSQL("CREATE TABLE collection_versions (collection_name TEXT PRIMARY KEY, version INTEGER NOT NULL, lt_hash BLOB, dirty_version INTEGER NOT NULL DEFAULT -1 ) ");
        sQLiteDatabase.execSQL("CREATE TABLE pending_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, operation BLOB NOT NULL, is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1, collection_name TEXT, device_id INTEGER, epoch INTEGER, are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0, mutation_name TEXT NOT NULL DEFAULT '', chat_jid TEXT )");
        sQLiteDatabase.execSQL("CREATE TABLE peer_messages(_id INTEGER PRIMARY KEY AUTOINCREMENT,message_type INTEGER NOT NULL, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL, device_id TEXT, timestamp INTEGER, data TEXT, acked BOOLEAN )");
        sQLiteDatabase.execSQL("CREATE TABLE msg_history_sync(_id INTEGER PRIMARY KEY AUTOINCREMENT, device_id TEXT NOT NULL, sync_type INTEGER NOT NULL, last_processed_msg_row_id INTEGER, oldest_msg_row_id INTEGER, sent_msgs_count INTEGER, chunk_order INTEGER, sent_bytes INTEGER, last_chunk_timestamp INTEGER, status INTEGER, peer_msg_row_id INTEGER, oldest_message_to_sync_row_id INTEGER, session_id TEXT, md_reg_attempt_id TEXT, size_limit_bytes INTEGER )");
        sQLiteDatabase.execSQL("CREATE TABLE crypto_info (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, key_data BLOB NOT NULL, timestamp INTEGER NOT NULL, fingerprint BLOB NOT NULL, stale_timestamp INTEGER NOT NULL DEFAULT 0, PRIMARY KEY ( device_id , epoch ) )");
        sQLiteDatabase.execSQL("CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )");
        sQLiteDatabase.execSQL("CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)");
        sQLiteDatabase.execSQL("CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)");
        sQLiteDatabase.execSQL("CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) ");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("sync-db-helper/onDowngrade oldVersion:");
        sb.append(i2);
        sb.append(", newVersion:");
        sb.append(i3);
        Log.i(sb.toString());
        A06(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007b, code lost:
        if (r6 >= 45) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007d, code lost:
        if (45 > r7) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007f, code lost:
        r2.A00.A00(new com.obwhatsapp.jobqueue.job.SyncdDeleteAllDataForNonMdUserJob());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009e, code lost:
        r5.execSQL("DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger");
        r5.execSQL("DROP INDEX IF EXISTS peer_messages_message_key_index");
        r5.execSQL("DROP TABLE IF EXISTS fanout_backfill_messages");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ad, code lost:
        r5.execSQL("ALTER TABLE collection_versions ADD lt_hash BLOB");
        r5.execSQL("ALTER TABLE syncd_mutations ADD mutation_mac BLOB");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b7, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD oldest_message_to_sync_row_id INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bc, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c1, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD collection_name TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c6, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD device_id INTEGER");
        r5.execSQL("ALTER TABLE pending_mutations ADD epoch INTEGER");
        r5.execSQL("ALTER TABLE syncd_mutations ADD device_id INTEGER NOT NULL DEFAULT 0");
        r5.execSQL("ALTER TABLE syncd_mutations ADD epoch INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00da, code lost:
        r5.execSQL("ALTER TABLE crypto_info ADD stale_timestamp INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00df, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e4, code lost:
        r5.execSQL("ALTER TABLE syncd_mutations ADD chat_jid TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e9, code lost:
        r5.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f3, code lost:
        r5.execSQL("ALTER TABLE collection_versions ADD dirty_version INTEGER NOT NULL DEFAULT -1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f8, code lost:
        r5.execSQL("ALTER TABLE peer_messages ADD acked BOOLEAN ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fd, code lost:
        r5.execSQL("DROP TABLE IF EXISTS encrypted_mutations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0102, code lost:
        r5.execSQL("ALTER TABLE syncd_mutations ADD mutation_name TEXT");
        r5.execSQL("ALTER TABLE pending_mutations ADD mutation_name TEXT NOT NULL DEFAULT ''");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010c, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD session_id TEXT");
        r5.execSQL("ALTER TABLE msg_history_sync ADD md_reg_attempt_id TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0116, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD chat_jid TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011b, code lost:
        r5.execSQL("CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0125, code lost:
        r5.execSQL("CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) ");
        r5.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0134, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD size_limit_bytes INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x013b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0038, code lost:
        r3 = r4.A01.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0042, code lost:
        if (r3.hasNext() == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0044, code lost:
        r2 = (X.C23571Cm) r3.next();
        r1 = new java.lang.StringBuilder("sync-db-observer/onDbReset(");
        r1.append(r6);
        r1.append(", ");
        r1.append(r7);
        r1.append(")");
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006b, code lost:
        if (r6 >= 43) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006d, code lost:
        if (43 > r7) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006f, code lost:
        r2.A00.A00(new com.obwhatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.String r1 = "sync-db-helper/onUpgrade oldVersion:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r2 = ", newVersion:"
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            switch(r6) {
                case 23: goto L_0x008a;
                case 24: goto L_0x009e;
                case 25: goto L_0x00ad;
                case 26: goto L_0x00b7;
                case 27: goto L_0x00bc;
                case 28: goto L_0x00c1;
                case 29: goto L_0x00c6;
                case 30: goto L_0x00da;
                case 31: goto L_0x00df;
                case 32: goto L_0x00e4;
                case 33: goto L_0x00e9;
                case 34: goto L_0x00f3;
                case 35: goto L_0x00f8;
                case 36: goto L_0x00fd;
                case 37: goto L_0x0102;
                case 38: goto L_0x010c;
                case 39: goto L_0x010c;
                case 40: goto L_0x010c;
                case 41: goto L_0x0116;
                case 42: goto L_0x011b;
                case 43: goto L_0x011b;
                case 44: goto L_0x0125;
                case 45: goto L_0x0125;
                case 46: goto L_0x0134;
                default: goto L_0x001d;
            }
        L_0x001d:
            java.lang.String r1 = "sync-db-helper/onUpgrade unknown oldVersion:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4.A06(r5)
        L_0x0038:
            X.1UY r0 = r4.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x003e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r2 = r3.next()
            X.1Cm r2 = (X.C23571Cm) r2
            java.lang.String r0 = "sync-db-observer/onDbReset("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 43
            if (r6 >= r0) goto L_0x0079
            if (r0 > r7) goto L_0x003e
            X.0xb r1 = r2.A00
            com.obwhatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob r0 = new com.obwhatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob
            r0.<init>()
            r1.A00(r0)
        L_0x0079:
            r0 = 45
            if (r6 >= r0) goto L_0x003e
            if (r0 > r7) goto L_0x003e
            X.0xb r1 = r2.A00
            com.obwhatsapp.jobqueue.job.SyncdDeleteAllDataForNonMdUserJob r0 = new com.obwhatsapp.jobqueue.job.SyncdDeleteAllDataForNonMdUserJob
            r0.<init>()
            r1.A00(r0)
            goto L_0x003e
        L_0x008a:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger"
            r5.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS missing_keys"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END"
            r5.execSQL(r0)
        L_0x009e:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger"
            r5.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS peer_messages_message_key_index"
            r5.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS fanout_backfill_messages"
            r5.execSQL(r0)
        L_0x00ad:
            java.lang.String r0 = "ALTER TABLE collection_versions ADD lt_hash BLOB"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD mutation_mac BLOB"
            r5.execSQL(r0)
        L_0x00b7:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD oldest_message_to_sync_row_id INTEGER"
            r5.execSQL(r0)
        L_0x00bc:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1"
            r5.execSQL(r0)
        L_0x00c1:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD collection_name TEXT"
            r5.execSQL(r0)
        L_0x00c6:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD device_id INTEGER"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD epoch INTEGER"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD device_id INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD epoch INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00da:
            java.lang.String r0 = "ALTER TABLE crypto_info ADD stale_timestamp INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00df:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00e4:
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD chat_jid TEXT"
            r5.execSQL(r0)
        L_0x00e9:
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)"
            r5.execSQL(r0)
        L_0x00f3:
            java.lang.String r0 = "ALTER TABLE collection_versions ADD dirty_version INTEGER NOT NULL DEFAULT -1"
            r5.execSQL(r0)
        L_0x00f8:
            java.lang.String r0 = "ALTER TABLE peer_messages ADD acked BOOLEAN "
            r5.execSQL(r0)
        L_0x00fd:
            java.lang.String r0 = "DROP TABLE IF EXISTS encrypted_mutations"
            r5.execSQL(r0)
        L_0x0102:
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD mutation_name TEXT"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD mutation_name TEXT NOT NULL DEFAULT ''"
            r5.execSQL(r0)
        L_0x010c:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD session_id TEXT"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD md_reg_attempt_id TEXT"
            r5.execSQL(r0)
        L_0x0116:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD chat_jid TEXT"
            r5.execSQL(r0)
        L_0x011b:
            java.lang.String r0 = "CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)"
            r5.execSQL(r0)
        L_0x0125:
            java.lang.String r0 = "CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) "
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)"
            r5.execSQL(r0)
        L_0x0134:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD size_limit_bytes INTEGER"
            r5.execSQL(r0)
            goto L_0x0038
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19K.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
