package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.01d  reason: invalid class name and case insensitive filesystem */
public class C002601d extends C16780td {
    public AnonymousClass03M A00;
    public final C16440t3 A01;
    public final C206911f A02;
    public final boolean A03 = true;

    public C002601d(C16300so r8, C16440t3 r9, C16980tz r10, C206911f r11, C14710pd r12) {
        super(r10.A01(), r8, r12, "axolotl.db", 13);
        this.A01 = r9;
        this.A02 = r11;
    }

    public static final void A00(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(str);
        sb.append(" SET ");
        sb.append("device_id");
        sb.append(" = ");
        sb.append(0);
        sQLiteDatabase.execSQL(sb.toString());
    }

    public static final void A01(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        StringBuilder sb = new StringBuilder("ALTER TABLE ");
        sb.append(str);
        sb.append(" RENAME TO old_");
        sb.append(str);
        sb.append(";");
        sQLiteDatabase.execSQL(sb.toString());
        sQLiteDatabase.execSQL(str2);
        String join = TextUtils.join(", ", strArr);
        StringBuilder sb2 = new StringBuilder("INSERT INTO ");
        sb2.append(str);
        sb2.append(" (");
        sb2.append(join);
        sb2.append(") SELECT ");
        sb2.append(join);
        sb2.append(" FROM old_");
        sb2.append(str);
        sQLiteDatabase.execSQL(sb2.toString());
        StringBuilder sb3 = new StringBuilder("DROP TABLE old_");
        sb3.append(str);
        sQLiteDatabase.execSQL(sb3.toString());
    }

    public C16810tg A05() {
        try {
            return C33931jQ.A01(super.A00(), this.A02);
        } catch (SQLiteException e2) {
            Log.e("failed to open axolotl store", e2);
            AnonymousClass03M r0 = this.A00;
            if (r0 != null) {
                r0.APQ();
            }
            return C33931jQ.A01(super.A00(), this.A02);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass03M r0;
        Log.i("creating axolotl database version 13");
        sQLiteDatabase.execSQL("CREATE TABLE identities (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, recipient_type INTEGER NOT NULL DEFAULT 0, device_id INTEGER, registration_id INTEGER, public_key BLOB, private_key BLOB, next_prekey_id INTEGER, timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities(recipient_id, recipient_type, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE prekeys (_id INTEGER PRIMARY KEY AUTOINCREMENT, prekey_id INTEGER UNIQUE, sent_to_server BOOLEAN, record BLOB, direct_distribution BOOLEAN, upload_timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE prekey_uploads (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, recipient_type INTEGER NOT NULL DEFAULT 0, device_id INTEGER, record BLOB, timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions(recipient_id, recipient_type, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE signed_prekeys (_id INTEGER PRIMARY KEY AUTOINCREMENT, prekey_id INTEGER UNIQUE, timestamp INTEGER, record BLOB)");
        sQLiteDatabase.execSQL("CREATE TABLE message_base_key (_id INTEGER PRIMARY KEY AUTOINCREMENT, msg_key_remote_jid TEXT NOT NULL, msg_key_from_me BOOLEAN NOT NULL, msg_key_id TEXT NOT NULL, recipient_id INTEGER, recipient_type INTEGER NOT NULL DEFAULT 0, device_id INTEGER NOT NULL DEFAULT 0, last_alice_base_key BLOB NOT NULL, timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, recipient_type, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, sender_type INTEGER NOT NULL DEFAULT 0, device_id INTEGER NOT NULL DEFAULT 0, record BLOB NOT NULL, timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, sender_type, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE fast_ratchet_sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, sender_type INTEGER NOT NULL DEFAULT 0, device_id INTEGER NOT NULL DEFAULT 0, record BLOB NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, sender_type, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS decryption_journal (msg_key_id TEXT NOT NULL, sender_id TEXT NOT NULL, device_id TEXT NOT NULL, plain_text BLOB NOT NULL, receive_timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS decryption_journal_idx ON decryption_journal(msg_key_id, sender_id, device_id)");
        Log.i("created axolotl database version 13");
        if (this.A03 && (r0 = this.A00) != null) {
            r0.APR(sQLiteDatabase);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007a, code lost:
        r10.execSQL("DROP TABLE IF EXISTS fast_ratchet_sender_keys");
        r10.execSQL("CREATE TABLE fast_ratchet_sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0089, code lost:
        r10.execSQL("ALTER TABLE sender_keys ADD COLUMN timestamp INTEGER");
        r2 = new android.content.ContentValues();
        r2.put("timestamp", java.lang.Long.valueOf(r3));
        r10.update("sender_keys", r2, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a2, code lost:
        r10.execSQL("ALTER TABLE prekeys ADD COLUMN direct_distribution BOOLEAN");
        r2 = new android.content.ContentValues();
        r2.put("direct_distribution", java.lang.Boolean.FALSE);
        r10.update("prekeys", r2, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b9, code lost:
        r10.execSQL("ALTER TABLE prekeys ADD COLUMN upload_timestamp INTEGER");
        r5 = new android.content.ContentValues();
        r4 = java.lang.Long.valueOf(r3);
        r5.put("upload_timestamp", r4);
        r10.update("prekeys", r5, "sent_to_server != 0", (java.lang.String[]) null);
        r10.execSQL("CREATE TABLE prekey_uploads (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_timestamp INTEGER)");
        r1 = new android.content.ContentValues();
        r1.put("upload_timestamp", r4);
        r10.insert("prekey_uploads", (java.lang.String) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00e6, code lost:
        A01(r10, "identities", "CREATE TABLE identities (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, registration_id INTEGER, public_key BLOB, private_key BLOB, next_prekey_id INTEGER, timestamp INTEGER)", new java.lang.String[]{"recipient_id", "registration_id", "public_key", "private_key", "next_prekey_id", "timestamp"});
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities(recipient_id, device_id)");
        A00(r10, "identities");
        A01(r10, "sessions", "CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, record BLOB, timestamp INTEGER)", new java.lang.String[]{"recipient_id", "record", "timestamp"});
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions(recipient_id, device_id)");
        A00(r10, "sessions");
        r10.execSQL("ALTER TABLE sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0");
        r10.execSQL("DROP INDEX IF EXISTS sender_keys_idx");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, device_id)");
        r10.execSQL("ALTER TABLE fast_ratchet_sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0");
        r10.execSQL("DROP INDEX IF EXISTS fast_ratchet_sender_keys_idx");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, device_id)");
        r10.execSQL("ALTER TABLE message_base_key ADD COLUMN recipient_id INTEGER ");
        r10.execSQL("ALTER TABLE message_base_key ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0");
        r10.execSQL("DELETE FROM message_base_key WHERE msg_key_remote_jid NOT GLOB '[0-9]*@s.whatsapp.net'");
        r10.execSQL("UPDATE message_base_key SET recipient_id = CAST(REPLACE(msg_key_remote_jid, '@s.whatsapp.net', '') AS INTEGER)");
        r10.execSQL("DROP INDEX IF EXISTS message_base_key_idx");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, device_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x016b, code lost:
        r10.execSQL("ALTER TABLE identities ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0");
        r10.execSQL("DROP INDEX IF EXISTS identities_idx");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities(recipient_id, recipient_type, device_id)");
        r10.execSQL("ALTER TABLE sessions ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0");
        r10.execSQL("DROP INDEX IF EXISTS sessions_idx");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions(recipient_id, recipient_type, device_id)");
        r10.execSQL("ALTER TABLE message_base_key ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0");
        r10.execSQL("DROP INDEX IF EXISTS message_base_key_idx");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, recipient_type, device_id)");
        r10.execSQL("ALTER TABLE sender_keys ADD COLUMN sender_type INTEGER NOT NULL DEFAULT 0");
        r10.execSQL("DROP INDEX IF EXISTS sender_keys_idx");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, sender_type, device_id)");
        r10.execSQL("ALTER TABLE fast_ratchet_sender_keys ADD COLUMN sender_type INTEGER NOT NULL DEFAULT 0");
        r10.execSQL("DROP INDEX IF EXISTS fast_ratchet_sender_keys_idx");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, sender_type, device_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x01b6, code lost:
        r10.execSQL("CREATE TABLE IF NOT EXISTS decryption_journal (msg_key_id TEXT NOT NULL, sender_id TEXT NOT NULL, device_id TEXT NOT NULL, plain_text BLOB NOT NULL, receive_timestamp INTEGER NOT NULL)");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS decryption_journal_idx ON decryption_journal(msg_key_id, sender_id, device_id)");
        com.whatsapp.util.Log.i("axolotl upgraded successfully");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x01c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005c, code lost:
        r10.execSQL("CREATE TABLE message_base_key (_id INTEGER PRIMARY KEY AUTOINCREMENT, msg_key_remote_jid TEXT NOT NULL, msg_key_from_me BOOLEAN NOT NULL, msg_key_id TEXT NOT NULL, last_alice_base_key BLOB NOT NULL, timestamp INTEGER)");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0066, code lost:
        r10.execSQL("DROP TABLE IF EXISTS sender_keys");
        r10.execSQL("CREATE TABLE sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)");
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0075, code lost:
        r10.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r10, int r11, int r12) {
        /*
            r9 = this;
            java.lang.String r1 = "axolotl upgrading db from "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r2 = " to "
            r0.append(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 13
            if (r12 != r0) goto L_0x01c6
            X.0t3 r0 = r9.A01
            long r3 = r0.A00()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            switch(r11) {
                case 1: goto L_0x0043;
                case 2: goto L_0x005c;
                case 3: goto L_0x0066;
                case 4: goto L_0x0066;
                case 5: goto L_0x0075;
                case 6: goto L_0x007a;
                case 7: goto L_0x0089;
                case 8: goto L_0x00a2;
                case 9: goto L_0x00b9;
                case 10: goto L_0x00e6;
                case 11: goto L_0x016b;
                case 12: goto L_0x01b6;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.String r1 = "Unknown upgrade from "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            r0.append(r2)
            r0.append(r12)
            java.lang.String r1 = r0.toString()
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x0043:
            java.lang.String r0 = "ALTER TABLE sessions ADD COLUMN timestamp INTEGER"
            r10.execSQL(r0)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "timestamp"
            r2.put(r0, r1)
            java.lang.String r1 = "sessions"
            r0 = 0
            r10.update(r1, r2, r0, r0)
        L_0x005c:
            java.lang.String r0 = "CREATE TABLE message_base_key (_id INTEGER PRIMARY KEY AUTOINCREMENT, msg_key_remote_jid TEXT NOT NULL, msg_key_from_me BOOLEAN NOT NULL, msg_key_id TEXT NOT NULL, last_alice_base_key BLOB NOT NULL, timestamp INTEGER)"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id)"
            r10.execSQL(r0)
        L_0x0066:
            java.lang.String r0 = "DROP TABLE IF EXISTS sender_keys"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)"
            r10.execSQL(r0)
        L_0x0075:
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)"
            r10.execSQL(r0)
        L_0x007a:
            java.lang.String r0 = "DROP TABLE IF EXISTS fast_ratchet_sender_keys"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE fast_ratchet_sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id)"
            r10.execSQL(r0)
        L_0x0089:
            java.lang.String r0 = "ALTER TABLE sender_keys ADD COLUMN timestamp INTEGER"
            r10.execSQL(r0)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "timestamp"
            r2.put(r0, r1)
            java.lang.String r1 = "sender_keys"
            r0 = 0
            r10.update(r1, r2, r0, r0)
        L_0x00a2:
            java.lang.String r0 = "ALTER TABLE prekeys ADD COLUMN direct_distribution BOOLEAN"
            r10.execSQL(r0)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r0 = "direct_distribution"
            r2.put(r0, r1)
            java.lang.String r1 = "prekeys"
            r0 = 0
            r10.update(r1, r2, r0, r0)
        L_0x00b9:
            java.lang.String r0 = "ALTER TABLE prekeys ADD COLUMN upload_timestamp INTEGER"
            r10.execSQL(r0)
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "upload_timestamp"
            r5.put(r3, r4)
            java.lang.String r1 = "prekeys"
            java.lang.String r0 = "sent_to_server != 0"
            r2 = 0
            r10.update(r1, r5, r0, r2)
            java.lang.String r0 = "CREATE TABLE prekey_uploads (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_timestamp INTEGER)"
            r10.execSQL(r0)
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            r1.put(r3, r4)
            java.lang.String r0 = "prekey_uploads"
            r10.insert(r0, r2, r1)
        L_0x00e6:
            r0 = 6
            java.lang.String[] r7 = new java.lang.String[r0]
            r8 = 0
            java.lang.String r6 = "recipient_id"
            r7[r8] = r6
            java.lang.String r0 = "registration_id"
            r5 = 1
            r7[r5] = r0
            java.lang.String r0 = "public_key"
            r4 = 2
            r7[r4] = r0
            java.lang.String r0 = "private_key"
            r2 = 3
            r7[r2] = r0
            r1 = 4
            java.lang.String r0 = "next_prekey_id"
            r7[r1] = r0
            r0 = 5
            java.lang.String r3 = "timestamp"
            r7[r0] = r3
            java.lang.String r1 = "identities"
            java.lang.String r0 = "CREATE TABLE identities (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, registration_id INTEGER, public_key BLOB, private_key BLOB, next_prekey_id INTEGER, timestamp INTEGER)"
            A01(r10, r1, r0, r7)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities(recipient_id, device_id)"
            r10.execSQL(r0)
            A00(r10, r1)
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r8] = r6
            java.lang.String r0 = "record"
            r2[r5] = r0
            r2[r4] = r3
            java.lang.String r1 = "sessions"
            java.lang.String r0 = "CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, record BLOB, timestamp INTEGER)"
            A01(r10, r1, r0, r2)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions(recipient_id, device_id)"
            r10.execSQL(r0)
            A00(r10, r1)
            java.lang.String r0 = "ALTER TABLE sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0"
            r10.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS sender_keys_idx"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, device_id)"
            r10.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE fast_ratchet_sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0"
            r10.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS fast_ratchet_sender_keys_idx"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, device_id)"
            r10.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE message_base_key ADD COLUMN recipient_id INTEGER "
            r10.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE message_base_key ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0"
            r10.execSQL(r0)
            java.lang.String r0 = "DELETE FROM message_base_key WHERE msg_key_remote_jid NOT GLOB '[0-9]*@s.whatsapp.net'"
            r10.execSQL(r0)
            java.lang.String r0 = "UPDATE message_base_key SET recipient_id = CAST(REPLACE(msg_key_remote_jid, '@s.whatsapp.net', '') AS INTEGER)"
            r10.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS message_base_key_idx"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, device_id)"
            r10.execSQL(r0)
        L_0x016b:
            java.lang.String r0 = "ALTER TABLE identities ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0"
            r10.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS identities_idx"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities(recipient_id, recipient_type, device_id)"
            r10.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE sessions ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0"
            r10.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS sessions_idx"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions(recipient_id, recipient_type, device_id)"
            r10.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE message_base_key ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0"
            r10.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS message_base_key_idx"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, recipient_type, device_id)"
            r10.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE sender_keys ADD COLUMN sender_type INTEGER NOT NULL DEFAULT 0"
            r10.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS sender_keys_idx"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, sender_type, device_id)"
            r10.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE fast_ratchet_sender_keys ADD COLUMN sender_type INTEGER NOT NULL DEFAULT 0"
            r10.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS fast_ratchet_sender_keys_idx"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, sender_type, device_id)"
            r10.execSQL(r0)
        L_0x01b6:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS decryption_journal (msg_key_id TEXT NOT NULL, sender_id TEXT NOT NULL, device_id TEXT NOT NULL, plain_text BLOB NOT NULL, receive_timestamp INTEGER NOT NULL)"
            r10.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS decryption_journal_idx ON decryption_journal(msg_key_id, sender_id, device_id)"
            r10.execSQL(r0)
            java.lang.String r0 = "axolotl upgraded successfully"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01c6:
            java.lang.String r0 = "Unknown upgrade destination version: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r0 = " -> "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002601d.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
