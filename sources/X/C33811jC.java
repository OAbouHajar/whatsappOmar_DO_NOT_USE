package X;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.redex.IDxTListenerShape94S0200000_2_I0;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1jC  reason: invalid class name and case insensitive filesystem */
public class C33811jC extends SQLiteOpenHelper implements C16790te {
    public static final String[] A0B = {"messages", "messages_fts", "messages_links", "quoted_message_order", "quoted_message_product", "messages_quotes", "messages_vcards", "messages_vcards_jids", "pay_transactions", "messages_quotes_payment_invite_legacy"};
    public C16810tg A00;
    public Integer A01;
    public boolean A02;
    public final C33921jP A03;
    public final C33901jN A04;
    public final C206911f A05;
    public final AnonymousClass1UY A06;
    public final File A07;
    public final Object A08 = new Object();
    public volatile Boolean A09 = null;
    public volatile Boolean A0A = null;

    public C33811jC(Context context, C33921jP r5, C33901jN r6, C206911f r7, File file, Set set) {
        super(context, "msgstore.db", (SQLiteDatabase.CursorFactory) null, 1);
        yo.SetDB(this);
        this.A05 = r7;
        this.A03 = r5;
        this.A07 = file;
        this.A04 = r6;
        this.A06 = new AnonymousClass1UY(new AnonymousClass01T(set, (AnonymousClass01J) null));
    }

    public static Pair A00(String str, String str2, String str3) {
        String lowerCase = String.format("%s_bd_for_%s_trigger", new Object[]{str, str2}).toLowerCase(Locale.getDefault());
        return new Pair(lowerCase, String.format("CREATE TRIGGER %s BEFORE DELETE ON %s BEGIN DELETE FROM %s WHERE %s; END", new Object[]{lowerCase, str, str2, str3}));
    }

    public static Pair A01(String str, String str2, boolean z2) {
        return A00(!z2 ? "messages" : "message", str, str2);
    }

    public static void A02(C16810tg r2, String str, String str2) {
        if (TextUtils.isEmpty(C33961jT.A00(r2, "table", str))) {
            StringBuilder sb = new StringBuilder("CREATE_");
            sb.append(str);
            sb.toString();
            r2.A0B(str2);
        }
    }

    public static boolean A03(C16810tg r3) {
        try {
            return Integer.parseInt(C33971jU.A00(r3, "migration_completed", String.valueOf(0))) == 1;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void A04() {
        int i2;
        C16810tg r3 = this.A00;
        if (r3 != null) {
            C28921Zf r2 = new C28921Zf("databasehelper/prepareWritableDatabase");
            try {
                i2 = Integer.parseInt(C33971jU.A00(r3, "chat_ready", String.valueOf(0)));
            } catch (NumberFormatException unused) {
                i2 = 0;
            }
            if (i2 == 2) {
                C33961jT.A01(this.A00, "DatabaseHelper", "chat_list");
            }
            if (!A0G(this.A00, "msgtore_db_schema_version")) {
                this.A00.A00.beginTransaction();
                try {
                    boolean A0F = A0F(this.A00);
                    boolean A032 = A03(this.A00);
                    StringBuilder sb = new StringBuilder();
                    sb.append("DatabaseHelper/on open existing DB, migration flags: migrationCompleted=");
                    sb.append(A032);
                    sb.append(", writeToOldSchemaEnabled=");
                    sb.append(A0F);
                    Log.i(sb.toString());
                    A0B(this.A00, A0F);
                    A07(this.A00);
                    r2.A00();
                    A0A(this.A00, A032);
                    r2.A00();
                    A0C(this.A00, A032, A0F);
                    r2.A00();
                    this.A09 = null;
                    this.A0A = null;
                    C33971jU.A03(this.A00, "msgtore_db_schema_version", A032 ? "16a97243282ad6aeef26bb3f6206e710" : "19a1ded0107adbb404f8c085098d13d9", "DatabaseHelper");
                    r2.A00();
                    this.A00.A00.setTransactionSuccessful();
                    r2.A00();
                    r2.A00();
                    this.A00.A00.endTransaction();
                } catch (Throwable th) {
                    this.A00.A00.endTransaction();
                    r2.A01();
                    throw th;
                }
            } else {
                this.A09 = null;
                this.A0A = null;
                A0E(this.A00);
                A0F(this.A00);
            }
            r2.A01();
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                ((C33911jO) it.next()).A00.A00.edit().putBoolean("force_db_check", false).apply();
            }
            return;
        }
        throw new IllegalStateException("databasehelper/prepareWritableDatabase/database is not initialized");
    }

    public final void A05(SQLiteException sQLiteException) {
        AnonymousClass0y0 r1;
        int i2;
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            C33911jO r2 = (C33911jO) it.next();
            if (sQLiteException instanceof SQLiteFullException) {
                r1 = r2.A01;
                i2 = 0;
            } else if (sQLiteException instanceof SQLiteCantOpenDatabaseException) {
                if (r2.A03.A01()) {
                    r1 = r2.A01;
                    i2 = 2;
                }
            } else if (sQLiteException.toString().contains("unable to open")) {
                r1 = r2.A01;
                i2 = 3;
            } else if (sQLiteException.toString().contains("attempt to write a readonly database")) {
                r1 = r2.A01;
                i2 = 4;
            }
            r1.A00(i2);
        }
    }

    public void A06(C16800tf r9) {
        if (this.A00 != null) {
            C30651cj A002 = r9.A00();
            try {
                for (String append : C33991jW.A00) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("message_fts");
                    sb.append(append);
                    String obj = sb.toString();
                    C16810tg r2 = this.A00;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DROP TABLE IF EXISTS ");
                    sb2.append(obj);
                    r2.A0B(sb2.toString());
                    String lowerCase = String.format("%s_bd_for_%s_trigger", new Object[]{A0E(r9.A02) ? "message" : "messages", obj}).toLowerCase(Locale.getDefault());
                    C16810tg r22 = this.A00;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("DROP TRIGGER IF EXISTS ");
                    sb3.append(lowerCase);
                    r22.A0B(sb3.toString());
                }
                A002.A00();
                A002.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            throw new IllegalStateException("databasehelper/dropOldFtsTables/database is not initialized");
        }
        throw th;
    }

    public void A07(C16810tg r4) {
        if (!A0G(r4, "msgtore_db_schema_indexes_version")) {
            synchronized (this) {
                A08(r4);
                C33971jU.A03(r4, "msgtore_db_schema_indexes_version", A0E(r4) ? "16a97243282ad6aeef26bb3f6206e710" : "19a1ded0107adbb404f8c085098d13d9", "DatabaseHelper");
            }
        }
    }

    public final void A08(C16810tg r3) {
        r3.A0B("CREATE INDEX IF NOT EXISTS chat_assignee_index ON agent_chat_assignment (agent_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS agent_device_index ON agent_devices (device)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS call_link_token_index ON call_link(token)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS call_log_participant_key_index ON call_log_participant_v2 (call_log_row_id, jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS call_log_key_index ON call_log (jid_row_id, from_me, call_id, transaction_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS chat_group_type_index ON chat (group_type)");
        r3.A0B("CREATE INDEX IF NOT EXISTS deleted_chat_job_index ON deleted_chat_job (chat_row_id, _id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS frequent_index ON frequent (jid_row_id, type)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS group_notification_version_index ON group_notification_version (group_jid_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS group_participants_history_index ON group_participants_history (gjid)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS group_participants_index ON group_participants (gjid, jid)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_row_id_index ON message_ui_elements (message_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS jid_lid_map_jid_index ON jid_map (jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS jid_key_new_index ON jid (user, server, agent, device, type)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS jid_raw_string_index ON jid (raw_string)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS joinable_call_log_call_id_index ON joinable_call_log (call_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS joinable_call_log_group_jid_row_id_index ON joinable_call_log (group_jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS labeled_jid_index ON labeled_jid (label_id, jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS labeled_jids_index ON labeled_jids (label_id, jid)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS labeled_messages_index ON labeled_messages (label_id, message_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS labels_index ON labels (label_name)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS mentions_index ON message_mentions (message_row_id, jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_add_on_orphan_key_index ON message_add_on_orphan (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_add_on_orphan_parent_key_index ON message_add_on_orphan (parent_chat_row_id, parent_from_me, parent_key_id, parent_sender_jid_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_add_on_poll_vote_selected_option_message_add_on_row_id_index ON message_add_on_poll_vote_selected_option (message_add_on_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_add_on_receipt_device_index ON message_add_on_receipt_device (message_add_on_row_id, receipt_device_jid_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_add_on_receipt_device_jid_index ON message_add_on_receipt_device (receipt_device_jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_add_on_key_index ON message_add_on (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_add_on_parent_message_row_id_index ON message_add_on (parent_message_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_add_on_chat_status_index ON message_add_on (chat_row_id, status)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_add_on_status_index ON message_add_on (status)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_details_author_device_jid_index ON message_details (author_device_jid)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_ephemeral_expire_timestamp_index ON message_ephemeral(expire_timestamp)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_link_index ON message_link (message_row_id, link_index)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_media_interactive_annotation_index ON message_media_interactive_annotation (message_row_id, sort_order)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_media_interactive_annotation_vertex_index ON message_media_interactive_annotation_vertex (message_media_interactive_annotation_row_id, sort_order)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_media_chat_index ON message_media(chat_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_media_hash_index ON message_media(file_hash)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_media_original_file_hash_index ON message_media(original_file_hash)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_media_vcard_count_index ON message_media_vcard_count(message_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_poll_option_message_row_id_index ON message_poll_option (message_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_system_chat_participant_index ON message_system_chat_participant (message_row_id)");
        if (this.A04.A02) {
            r3.A0B("CREATE INDEX IF NOT EXISTS message_chat_sort_id_index ON message (chat_row_id, sort_id)");
            r3.A0B("CREATE INDEX IF NOT EXISTS message_starred_sort_id_index ON message (starred, sort_id)");
        }
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_key_index ON message (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_sort_id_index ON message (sort_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_starred_index ON message(starred)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_type_chat_index ON message(chat_row_id, message_type)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_chat_id_index ON message (chat_row_id,_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_type_index ON message(message_type)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_view_once_media_state_index ON message_view_once_media (state)");
        if (!TextUtils.isEmpty(C33961jT.A00(r3, "table", "messages"))) {
            r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS messages_key_index ON messages (key_remote_jid, key_from_me, key_id)");
            r3.A0B(" CREATE INDEX IF NOT EXISTS media_hash_index ON messages (media_hash)");
            r3.A0B(" CREATE INDEX IF NOT EXISTS media_type_index ON messages (media_wa_type)");
            r3.A0B("CREATE INDEX IF NOT EXISTS media_type_jid_index ON messages (key_remote_jid, media_wa_type)");
            r3.A0B("CREATE INDEX IF NOT EXISTS messages_jid_id_index ON messages (key_remote_jid, _id)");
            r3.A0B("CREATE INDEX IF NOT EXISTS starred_index ON messages (starred)");
        }
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS missed_call_log_participants_key_index ON missed_call_log_participant (call_logs_row_id, jid)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS missed_call_logs_key_index ON missed_call_logs (message_row_id)");
        r3.A0B(" CREATE INDEX IF NOT EXISTS mms_thumbnail_metadata_transferred_index ON mms_thumbnail_metadata(transferred)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_orphaned_edit_key_index ON message_orphaned_edit (key_id, from_me, chat_row_id, sender_jid_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS parent_group_participants_parent_jid_index ON parent_group_participants (parent_group_jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transaction_id_index ON pay_transaction (id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS attachments_quick_reply_id_index ON quick_reply_attachments (quick_reply_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS quoted_mentions_index ON message_quoted_mentions (message_row_id, jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_quoted_vcard_index ON message_quoted_vcard (message_row_id, vcard)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS receipt_device_index ON receipt_device (message_row_id, receipt_device_jid_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS receipt_device_table_device_index ON receipt_device (receipt_device_jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS receipt_orphaned_index ON receipt_orphaned (chat_row_id, from_me, key_id, receipt_device_jid_row_id, receipt_recipient_jid_row_id, status)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS receipt_user_index ON receipt_user(message_row_id,receipt_user_jid_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS receipts_key_index ON receipts (key_remote_jid, key_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS group_participant_device_index ON group_participant_device (group_participant_row_id, device_jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS group_participant_user_index ON group_participant_user (group_jid_row_id, user_jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS group_past_participant_user_index ON group_past_participant_user (group_jid_row_id, user_jid_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS group_past_participant_user_timestamp_index ON group_past_participant_user (timestamp)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_template_button_index ON message_template_button (message_row_id)");
        r3.A0B("CREATE INDEX IF NOT EXISTS message_template_index ON message_template (message_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS messages_thumbnail_key_index ON message_thumbnails (key_remote_jid, key_from_me, key_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS user_device_info_index ON user_device_info (user_jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS user_device_index ON user_device (user_jid_row_id,device_jid_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_vcard_jid_index ON message_vcard_jid(vcard_jid_row_id, vcard_row_id, message_row_id)");
        r3.A0B("CREATE UNIQUE INDEX IF NOT EXISTS message_vcard_index ON message_vcard (message_row_id, vcard)");
    }

    public final void A09(C16810tg r5) {
        this.A09 = null;
        this.A0A = null;
        if (TextUtils.isEmpty(C33961jT.A00(r5, "table", "messages"))) {
            Log.i("DatabaseHelper/old tables verification, old tables do not exist.");
            C33971jU.A02(r5, "migration_completed", "DatabaseHelper", 1);
            C33971jU.A02(r5, "write_to_old_schema_disabled", "DatabaseHelper", 1);
            return;
        }
        Log.i("DatabaseHelper/old tables verification, old tables are available.");
    }

    public void A0A(C16810tg r3, boolean z2) {
        String str;
        SQLiteDatabase sQLiteDatabase = r3.A00;
        sQLiteDatabase.beginTransaction();
        try {
            r3.A0B("DROP VIEW IF EXISTS available_messages_view");
            r3.A0B("DROP VIEW IF EXISTS legacy_available_messages_view");
            r3.A0B("DROP VIEW IF EXISTS message_view");
            r3.A0B("DROP VIEW IF EXISTS available_message_view");
            r3.A0B("DROP VIEW IF EXISTS deleted_messages_view");
            r3.A0B("DROP VIEW IF EXISTS deleted_messages_ids_view");
            if (z2) {
                r3.A0B("CREATE VIEW message_view AS SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, message_add_on_flags, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, NULL AS future_message_type, 2 AS table_version FROM message");
                r3.A0B("CREATE VIEW available_message_view AS  SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, message_add_on_flags, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, NULL AS future_message_type, 2 AS table_version, expire_timestamp, keep_in_chat FROM message LEFT JOIN deleted_chat_job AS job ON job.chat_row_id = message.chat_row_id LEFT JOIN message_ephemeral AS message_ephemeral ON message._id = message_ephemeral.message_row_id WHERE  IFNULL(NOT((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%'))), 0)");
                r3.A0B("CREATE VIEW IF NOT EXISTS deleted_messages_view AS   SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, message_add_on_flags, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, NULL AS future_message_type, 2 AS table_version, ((((job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%') AND (job.delete_files_singular_delete== 1)) OR ((job.deleted_messages_remove_files == 1) AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)))) OR ((job.deleted_categories_remove_files == 1) AND ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808))))))) as remove_files FROM  deleted_chat_job AS job JOIN message AS message  ON job.chat_row_id = message.chat_row_id   WHERE  IFNULL((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%')), 0) ORDER BY message._id");
                str = "CREATE VIEW IF NOT EXISTS deleted_messages_ids_view AS  SELECT message._id, message.sort_id, message.chat_row_id, message.message_type FROM deleted_chat_job AS job  JOIN message AS message  ON job.chat_row_id = message.chat_row_id WHERE  IFNULL((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%')), 0)";
            } else {
                r3.A0B("CREATE VIEW legacy_available_messages_view AS  SELECT messages.*, chat._id AS chat_row_id,expire_timestamp, keep_in_chat FROM messages AS messages JOIN jid AS jid ON jid.raw_string = messages.key_remote_jid JOIN chat AS chat ON chat.jid_row_id = jid._id LEFT JOIN deleted_chat_job AS job ON job.chat_row_id = chat._id  LEFT JOIN message_ephemeral AS message_ephemeral\n ON messages._id = message_ephemeral.message_row_id WHERE IFNULL(NOT((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || messages._id || '\"%'))), 0)");
                r3.A0B("CREATE VIEW message_view AS SELECT messages._id AS _id, messages._id AS sort_id, chat._id AS chat_row_id, key_from_me AS from_me, key_id, -1 AS sender_jid_row_id, remote_resource AS sender_jid_raw_string, status, needs_push AS broadcast, recipient_count, participant_hash, forwarded AS origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, '' as text_data, starred, lookup_tables, data, media_url, media_mime_type, media_size, media_name, media_caption, media_hash, media_duration, latitude, longitude, thumb_image, raw_data, quoted_row_id, mentioned_jids, multicast_id, edit_version, media_enc_hash, payment_transaction_id, preview_type, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, future_message_type, message_add_on_flags, 1 AS table_version FROM messages JOIN jid AS chat_jid ON messages.key_remote_jid= chat_jid.raw_string JOIN chat AS chat ON chat.jid_row_id = chat_jid._id");
                r3.A0B("CREATE VIEW available_message_view AS SELECT messages._id AS _id, messages._id AS sort_id, chat._id AS chat_row_id, key_from_me AS from_me, key_id, -1 AS sender_jid_row_id, remote_resource AS sender_jid_raw_string, status, needs_push AS broadcast, recipient_count, participant_hash, forwarded AS origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, '' as text_data, starred, lookup_tables, data, media_url, media_mime_type, media_size, media_name, media_caption, media_hash, media_duration, latitude, longitude, thumb_image, raw_data, quoted_row_id, mentioned_jids, multicast_id, edit_version, media_enc_hash, payment_transaction_id, preview_type, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, future_message_type, message_add_on_flags, 1 AS table_version, expire_timestamp, keep_in_chat FROM messages JOIN jid AS chat_jid ON messages.key_remote_jid= chat_jid.raw_string JOIN chat AS chat ON chat.jid_row_id = chat_jid._id LEFT JOIN message_ephemeral AS message_ephemeral ON messages._id = message_ephemeral.message_row_id LEFT JOIN deleted_chat_job AS job ON job.chat_row_id = chat._id WHERE IFNULL(NOT((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || messages._id || '\"%'))), 0)");
                r3.A0B("CREATE VIEW IF NOT EXISTS deleted_messages_view AS  SELECT messages._id AS _id, messages._id AS sort_id, chat._id AS chat_row_id, key_from_me AS from_me, key_id, -1 AS sender_jid_row_id, remote_resource AS sender_jid_raw_string, status, needs_push AS broadcast, recipient_count, participant_hash, forwarded AS origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, '' as text_data, starred, lookup_tables, data, media_url, media_mime_type, media_size, media_name, media_caption, media_hash, media_duration, latitude, longitude, thumb_image, raw_data, quoted_row_id, mentioned_jids, multicast_id, edit_version, media_enc_hash, payment_transaction_id, preview_type, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, future_message_type, message_add_on_flags, 1 AS table_version,  (( ((job.singular_message_delete_rows_id LIKE '%\"' || messages._id || '\"%') AND (job.delete_files_singular_delete == 1)) OR ((job.deleted_messages_remove_files == 1) AND ((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)))) OR   ((job.deleted_categories_remove_files == 1) AND ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) ))))) as remove_files  FROM deleted_chat_job AS job JOIN chat AS chat ON job.chat_row_id = chat._id JOIN jid AS chat_jid ON chat.jid_row_id = chat_jid._id LEFT JOIN messages AS messages ON messages.key_remote_jid = chat_jid.raw_string WHERE IFNULL((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || messages._id || '\"%')), 0)  ORDER BY messages._id");
                str = "CREATE VIEW IF NOT EXISTS deleted_messages_ids_view AS  SELECT messages._id AS _id, messages._id AS sort_id, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, job.chat_row_id AS chat_row_id FROM deleted_chat_job AS job JOIN chat AS chat ON job.chat_row_id = chat._id JOIN jid AS chat_jid ON chat.jid_row_id = chat_jid._id LEFT JOIN messages AS messages ON messages.key_remote_jid = chat_jid.raw_string WHERE IFNULL((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || messages._id || '\"%')), 0)";
            }
            r3.A0B(str);
            r3.A0B("DROP VIEW IF EXISTS chat_view");
            r3.A0B("CREATE VIEW chat_view AS SELECT chat._id AS _id, jid.raw_string AS raw_string_jid, hidden AS hidden, subject AS subject, created_timestamp AS created_timestamp, display_message_row_id AS display_message_row_id, last_message_row_id AS last_message_row_id, last_read_message_row_id AS last_read_message_row_id, last_read_receipt_sent_message_row_id AS last_read_receipt_sent_message_row_id, last_important_message_row_id AS last_important_message_row_id, archived AS archived, sort_timestamp AS sort_timestamp, mod_tag AS mod_tag, gen AS gen, spam_detection AS spam_detection, unseen_earliest_message_received_time AS unseen_earliest_message_received_time, unseen_message_count AS unseen_message_count, unseen_missed_calls_count AS unseen_missed_calls_count, unseen_row_count AS unseen_row_count, unseen_message_reaction_count AS unseen_message_reaction_count, last_message_reaction_row_id AS last_message_reaction_row_id, last_seen_message_reaction_row_id AS last_seen_message_reaction_row_id, plaintext_disabled AS plaintext_disabled, vcard_ui_dismissed AS vcard_ui_dismissed, change_number_notified_message_row_id AS change_number_notified_message_row_id, show_group_description AS show_group_description, ephemeral_expiration AS ephemeral_expiration, last_read_ephemeral_message_row_id AS last_read_ephemeral_message_row_id, ephemeral_setting_timestamp AS ephemeral_setting_timestamp, ephemeral_disappearing_messages_initiator AS ephemeral_disappearing_messages_initiator, unseen_important_message_count AS unseen_important_message_count, group_type AS group_type, growth_lock_level AS growth_lock_level, growth_lock_expiration_ts AS growth_lock_expiration_ts, last_read_message_sort_id AS last_read_message_sort_id, display_message_sort_id AS display_message_sort_id, last_message_sort_id AS last_message_sort_id, last_read_receipt_sent_message_sort_id AS last_read_receipt_sent_message_sort_id, has_new_community_admin_dialog_been_acknowledged AS has_new_community_admin_dialog_been_acknowledged, history_sync_progress AS history_sync_progress FROM chat chat LEFT JOIN jid jid ON chat.jid_row_id = jid._id");
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:453|454) */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0f40, code lost:
        if (java.lang.Integer.parseInt(X.C33971jU.A00(r12, "links_ready", java.lang.String.valueOf(0))) == 0) goto L_0x0f42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:?, code lost:
        X.C33971jU.A02(r12, "links_ready", "DatabaseHelper", 1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:453:0x0f42 */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x05b2  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x062a  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x063b  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x06a9  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x06de  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x06f4  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0708  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x071a  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0729  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0740  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0756  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x077d  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x080a  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0831  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0845  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0856  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x086a  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x089f  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x08b2  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x08c3  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x08d4  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x08e5  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x08f9  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0921  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0932  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0946  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0957  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0968  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0979  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x098a  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x099e  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x09af  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x09c0  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x09d1  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x09e2  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x09f3  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0a04  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0a15  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a26  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0a48  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0a59  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0a6a  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0a7b  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0a8c  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0a9d  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0aae  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0abf  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0ad0  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0ae1  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0b07  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0b18  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0b29  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0b3a  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0b4b  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0b5c  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0b6d  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0b7e  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0b8f  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0ba2  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0bff  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0c10  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0c21  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0c32  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0c43  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0c54  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0c65  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0c76  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0c7d  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0c8e  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0c9e  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0ca9  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0cb4  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0cbf  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0cca  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0cd5  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0ce6  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0cf1  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0d0b  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0d1d  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0dfa  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0e0a  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0e25  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0e40  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0e58  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0e88  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0eb8  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x1017  */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x1028  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x1039  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x104a  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x105b  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x106c  */
    /* JADX WARNING: Removed duplicated region for block: B:508:0x107f  */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x109d  */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x10ae  */
    /* JADX WARNING: Removed duplicated region for block: B:520:0x10bf  */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x10d0  */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x10e1  */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x10f2  */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x1103  */
    /* JADX WARNING: Removed duplicated region for block: B:535:0x1114  */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x1125  */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x1136  */
    /* JADX WARNING: Removed duplicated region for block: B:544:0x1147  */
    /* JADX WARNING: Removed duplicated region for block: B:547:0x1175  */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x11bb  */
    /* JADX WARNING: Removed duplicated region for block: B:553:0x11cc  */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x11d2  */
    /* JADX WARNING: Removed duplicated region for block: B:555:0x11df  */
    /* JADX WARNING: Removed duplicated region for block: B:556:0x11e9  */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x11f4  */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x120a  */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x1220 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C16810tg r30, boolean r31) {
        /*
            r29 = this;
            java.lang.String r0 = "databasehelper/createDatabaseTables"
            X.1Zf r7 = new X.1Zf     // Catch:{ all -> 0x1221 }
            r7.<init>((java.lang.String) r0)     // Catch:{ all -> 0x1221 }
            r12 = r30
            android.database.sqlite.SQLiteDatabase r0 = r12.A00     // Catch:{ all -> 0x1221 }
            r5 = 1
            r0.setVersion(r5)     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "messages"
            java.lang.String r0 = "table"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            if (r31 == 0) goto L_0x0025
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = "CREATE TABLE messages (_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL, status INTEGER, needs_push INTEGER, data TEXT, timestamp INTEGER, media_url TEXT, media_mime_type TEXT, media_wa_type TEXT, media_size INTEGER, media_name TEXT, media_caption TEXT, media_hash TEXT, media_duration INTEGER, origin INTEGER, latitude REAL, longitude REAL, thumb_image TEXT, remote_resource TEXT, received_timestamp INTEGER, send_timestamp INTEGER, receipt_server_timestamp INTEGER, receipt_device_timestamp INTEGER, read_device_timestamp INTEGER, played_device_timestamp INTEGER, raw_data BLOB, recipient_count INTEGER, participant_hash TEXT, starred INTEGER, quoted_row_id INTEGER, mentioned_jids TEXT, multicast_id TEXT, edit_version INTEGER, media_enc_hash TEXT, payment_transaction_id TEXT, forwarded INTEGER, preview_type INTEGER, send_count INTEGER, lookup_tables INTEGER, future_message_type INTEGER, message_add_on_flags INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0025:
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "message"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x006d
            java.lang.String r1 = "CREATE TABLE message (_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER NOT NULL, from_me INTEGER NOT NULL, key_id TEXT NOT NULL, sender_jid_row_id INTEGER, status INTEGER, broadcast INTEGER, recipient_count INTEGER, participant_hash TEXT, origination_flags INTEGER, origin INTEGER, timestamp INTEGER, received_timestamp INTEGER, receipt_server_timestamp INTEGER, message_type INTEGER, text_data TEXT, starred INTEGER, lookup_tables INTEGER, message_add_on_flags INTEGER, sort_id INTEGER NOT NULL DEFAULT 0 )"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x1221 }
            r3.<init>()     // Catch:{ all -> 0x1221 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "_id"
            r3.put(r1, r2)     // Catch:{ all -> 0x1221 }
            r1 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "chat_row_id"
            r3.put(r1, r2)     // Catch:{ all -> 0x1221 }
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "from_me"
            r3.put(r1, r2)     // Catch:{ all -> 0x1221 }
            java.lang.String r2 = "key_id"
            java.lang.String r1 = "-1"
            r3.put(r2, r1)     // Catch:{ all -> 0x1221 }
            r12.A02(r3, r14)     // Catch:{ all -> 0x1221 }
        L_0x0065:
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r2 = "chat_ready"
            r1 = 0
            goto L_0x0101
        L_0x006d:
            java.lang.String r15 = "sort_id"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "MessageTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "message_add_on_flags"
            java.lang.String r16 = "INTEGER"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0065
        L_0x007f:
            java.lang.String r15 = "raw_data"
            java.lang.String r16 = "BLOB"
            java.lang.String r17 = "MessagesTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "media_hash"
            java.lang.String r16 = "TEXT"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "media_duration"
            java.lang.String r22 = "INTEGER"
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "origin"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "recipient_count"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "read_device_timestamp"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "played_device_timestamp"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "media_caption"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "participant_hash"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "starred"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "quoted_row_id"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "mentioned_jids"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "multicast_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "edit_version"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "media_enc_hash"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "payment_transaction_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "forwarded"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "preview_type"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "send_count"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "lookup_tables"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "future_message_type"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "message_add_on_flags"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            goto L_0x0025
        L_0x0101:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x010e }
            java.lang.String r1 = X.C33971jU.A00(r12, r2, r1)     // Catch:{ NumberFormatException -> 0x010e }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x010e }
            goto L_0x010f
        L_0x010e:
            r1 = 0
        L_0x010f:
            java.lang.String r6 = "DatabaseHelper"
            r3 = 2
            if (r1 == r3) goto L_0x01cc
            java.lang.String r14 = "chat_list"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x012a
            java.lang.String r3 = "CREATE TABLE chat_list (_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT UNIQUE, message_table_id INTEGER, subject TEXT, creation INTEGER, last_read_message_table_id INTEGER, last_read_receipt_sent_message_table_id INTEGER, archived INTEGER, sort_timestamp INTEGER, mod_tag INTEGER, gen REAL, my_messages INTEGER, plaintext_disabled BOOLEAN, last_message_table_id INTEGER, unseen_earliest_message_received_time INTEGER, unseen_message_count INTEGER, unseen_missed_calls_count INTEGER, unseen_row_count INTEGER, vcard_ui_dismissed INTEGER, change_number_notified_message_id INTEGER, last_important_message_table_id INTEGER, show_group_description INTEGER, ephemeral_expiration INTEGER, last_read_ephemeral_message_table_id INTEGER, ephemeral_setting_timestamp INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0125:
            r7.A00()     // Catch:{ all -> 0x1221 }
            goto L_0x01b4
        L_0x012a:
            java.lang.String r15 = "subject"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "ChatListTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "creation"
            java.lang.String r16 = "INTEGER"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_read_message_table_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_read_receipt_sent_message_table_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "archived"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "sort_timestamp"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "mod_tag"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "gen"
            java.lang.String r22 = "REAL"
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "my_messages"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "plaintext_disabled"
            java.lang.String r22 = "BOOLEAN"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_message_table_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "unseen_earliest_message_received_time"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "unseen_message_count"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "unseen_missed_calls_count"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "unseen_row_count"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "vcard_ui_dismissed"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "change_number_notified_message_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_important_message_table_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "show_group_description"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_read_ephemeral_message_table_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "ephemeral_expiration"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "ephemeral_setting_timestamp"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0125
        L_0x01b4:
            if (r1 != r5) goto L_0x01cc
            r3 = 0
            X.C33971jU.A02(r12, r2, r6, r3)     // Catch:{ all -> 0x1221 }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x1221 }
            r2 = 0
            java.lang.String r1 = "%@g.us"
            r3[r2] = r1     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "%@temp"
            r3[r5] = r1     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "DELETE FROM chat_list WHERE message_table_id = 0 AND last_read_message_table_id = 0 AND sort_timestamp = 0 AND my_messages = 0 AND plaintext_disabled = 0 AND key_remote_jid NOT LIKE ? AND key_remote_jid NOT LIKE ?"
            r12.A0C(r1, r3)     // Catch:{ all -> 0x1221 }
        L_0x01cc:
            r7.A00()     // Catch:{ all -> 0x1221 }
            if (r31 == 0) goto L_0x01e2
            java.lang.String r1 = "messages_fts"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x01e2
            java.lang.String r1 = "CREATE VIRTUAL TABLE messages_fts USING FTS3()"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x01e2:
            X.C33991jW.A00(r12)     // Catch:{ all -> 0x1221 }
            if (r31 == 0) goto L_0x01f8
            java.lang.String r14 = "messages_quotes"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0225
            java.lang.String r1 = "CREATE TABLE messages_quotes (_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL, status INTEGER, needs_push INTEGER, data TEXT, timestamp INTEGER, media_url TEXT, media_mime_type TEXT, media_wa_type TEXT, media_size INTEGER, media_name TEXT, media_caption TEXT, media_hash TEXT, media_duration INTEGER, origin INTEGER, latitude REAL, longitude REAL, thumb_image TEXT, remote_resource TEXT, received_timestamp INTEGER, send_timestamp INTEGER, receipt_server_timestamp INTEGER, receipt_device_timestamp INTEGER, read_device_timestamp INTEGER, played_device_timestamp INTEGER, raw_data BLOB, recipient_count INTEGER, participant_hash TEXT, starred INTEGER, quoted_row_id INTEGER, mentioned_jids TEXT, multicast_id TEXT, edit_version INTEGER, media_enc_hash TEXT, payment_transaction_id TEXT, forwarded INTEGER, preview_type INTEGER, send_count INTEGER, lookup_tables INTEGER, future_message_type INTEGER, message_add_on_flags INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x01f8:
            java.lang.String r14 = "message_quoted"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x021b
            java.lang.String r1 = "CREATE TABLE message_quoted (message_row_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER NOT NULL, parent_message_chat_row_id INTEGER NOT NULL, from_me INTEGER NOT NULL, sender_jid_row_id INTEGER, key_id TEXT NOT NULL, timestamp INTEGER, message_type INTEGER, origin INTEGER, text_data TEXT, payment_transaction_id TEXT, lookup_tables INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0209:
            java.lang.String r1 = "messages_hydrated_four_row_template"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x026c
            java.lang.String r1 = "CREATE TABLE messages_hydrated_four_row_template (message_row_id INTEGER PRIMARY KEY, message_template_id TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            goto L_0x026c
        L_0x021b:
            java.lang.String r15 = "origin"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "QuotedTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0209
        L_0x0225:
            java.lang.String r15 = "mentioned_jids"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "QuotesTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "multicast_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "edit_version"
            java.lang.String r22 = "INTEGER"
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "media_enc_hash"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "payment_transaction_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "forwarded"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "preview_type"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "send_count"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "lookup_tables"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "future_message_type"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "message_add_on_flags"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            goto L_0x01f8
        L_0x026c:
            if (r31 == 0) goto L_0x0290
            java.lang.String r14 = "messages_vcards"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x02e6
            java.lang.String r1 = "CREATE TABLE messages_vcards (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, sender_jid TEXT, chat_jid TEXT, vcard TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x027f:
            java.lang.String r1 = "messages_vcards_jids"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0290
            java.lang.String r1 = "CREATE TABLE messages_vcards_jids (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, vcard_jid TEXT, vcard_row_id INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0290:
            java.lang.String r14 = "message_orphaned_edit"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x02d5
            java.lang.String r1 = "CREATE TABLE message_orphaned_edit (_id INTEGER PRIMARY KEY, key_id TEXT    NOT NULL, from_me INTEGER NOT NULL, chat_row_id INTEGER NOT NULL, sender_jid_row_id INTEGER NOT NULL DEFAULT (0), timestamp INTEGER, message_type INTEGER NOT NULL, revoked_key_id TEXT, retry_count INTEGER, admin_jid_row_id INTEGER, orphan_message_data BLOB)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x02a1:
            java.lang.String r1 = "message_quoted_mentions"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x02b2
            java.lang.String r1 = "CREATE TABLE message_quoted_mentions (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, jid_row_id INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x02b2:
            java.lang.String r1 = "message_quoted_vcard"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x02c3
            java.lang.String r1 = "CREATE TABLE message_quoted_vcard (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, vcard TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x02c3:
            java.lang.String r14 = "message_product"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x02f0
            java.lang.String r1 = "CREATE TABLE message_product (message_row_id INTEGER PRIMARY KEY, business_owner_jid INTEGER, product_id TEXT, title TEXT, description TEXT, currency_code TEXT, amount_1000 INTEGER, retailer_id TEXT, url TEXT, product_image_count INTEGER, sale_amount_1000 INTEGER, body TEXT, footer Text)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            goto L_0x031f
        L_0x02d5:
            java.lang.String r15 = "admin_jid_row_id"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "OrphanedEditTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "orphan_message_data"
            java.lang.String r16 = "BLOB"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x02a1
        L_0x02e6:
            java.lang.String r15 = "chat_jid"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "VCardsLegacyTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x027f
        L_0x02f0:
            java.lang.String r15 = "retailer_id"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "MessageProductTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "url"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "product_image_count"
            java.lang.String r22 = "INTEGER"
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "sale_amount_1000"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "body"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "footer"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
        L_0x031f:
            if (r31 == 0) goto L_0x0332
            java.lang.String r14 = "quoted_message_product"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x036c
            java.lang.String r1 = "CREATE TABLE quoted_message_product (message_row_id INTEGER PRIMARY KEY, business_owner_jid INTEGER, product_id TEXT, title TEXT, description TEXT, currency_code TEXT, amount_1000 INTEGER, retailer_id TEXT, url TEXT, product_image_count INTEGER, sale_amount_1000 INTEGER, body TEXT, footer Text)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0332:
            java.lang.String r14 = "message_quoted_product"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0355
            java.lang.String r1 = "CREATE TABLE message_quoted_product (message_row_id INTEGER PRIMARY KEY, business_owner_jid INTEGER, product_id TEXT, title TEXT, description TEXT, currency_code TEXT, amount_1000 INTEGER, retailer_id TEXT, url TEXT, product_image_count INTEGER, sale_amount_1000 INTEGER, body TEXT, footer Text)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0343:
            java.lang.String r14 = "message_order"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x039c
            java.lang.String r1 = "CREATE TABLE message_order (message_row_id INTEGER PRIMARY KEY, order_id TEXT,thumbnail BLOB,order_title TEXT,item_count INTEGER,status INTEGER,surface INTEGER,message TEXT,seller_jid INTEGER,token TEXT,currency_code TEXT,total_amount_1000 INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            goto L_0x03ad
        L_0x0355:
            java.lang.String r15 = "sale_amount_1000"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "QuotedProductTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "body"
            java.lang.String r16 = "TEXT"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "footer"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0343
        L_0x036c:
            java.lang.String r15 = "retailer_id"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "LegacyQuotedProductTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "url"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "product_image_count"
            java.lang.String r22 = "INTEGER"
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "sale_amount_1000"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "body"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "footer"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0332
        L_0x039c:
            java.lang.String r15 = "currency_code"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "MessageOrderTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "total_amount_1000"
            java.lang.String r16 = "INTEGER"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
        L_0x03ad:
            if (r31 == 0) goto L_0x03c0
            java.lang.String r1 = "quoted_message_order"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x03c0
            java.lang.String r1 = "CREATE TABLE quoted_message_order (message_row_id INTEGER PRIMARY KEY, order_id TEXT,thumbnail BLOB,order_title TEXT,item_count INTEGER,status INTEGER,surface INTEGER,message TEXT,seller_jid INTEGER,token TEXT,currency_code TEXT,total_amount_1000 INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x03c0:
            java.lang.String r14 = "message_quoted_order"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0407
            java.lang.String r1 = "CREATE TABLE message_quoted_order (message_row_id INTEGER PRIMARY KEY, order_id TEXT,thumbnail BLOB,order_title TEXT,item_count INTEGER,status INTEGER,surface INTEGER,message TEXT,seller_jid INTEGER,token TEXT,currency_code TEXT,total_amount_1000 INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x03d1:
            java.lang.String r14 = "message_group_invite"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x03fd
            java.lang.String r1 = "CREATE TABLE message_group_invite (message_row_id INTEGER PRIMARY KEY, group_jid_row_id INTEGER NOT NULL, admin_jid_row_id INTEGER NOT NULL, group_name TEXT, invite_code TEXT, expiration INTEGER, invite_time INTEGER, expired INTEGER, group_type INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x03e2:
            java.lang.String r2 = "message_quoted_group_invite"
            java.lang.String r4 = X.C33961jT.A00(r12, r0, r2)     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "message_quoted_group_invite_legacy"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            r3 = r1 ^ 1
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x1221 }
            r1 = r1 ^ 1
            if (r3 != 0) goto L_0x0423
            goto L_0x0419
        L_0x03fd:
            java.lang.String r15 = "group_type"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "GroupInviteTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x03e2
        L_0x0407:
            java.lang.String r15 = "currency_code"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "QuotedMessageOrderTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "total_amount_1000"
            java.lang.String r16 = "INTEGER"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x03d1
        L_0x0419:
            if (r1 == 0) goto L_0x041e
            java.lang.String r1 = "ALTER TABLE message_quoted_group_invite RENAME TO message_quoted_group_invite_legacy"
            goto L_0x0420
        L_0x041e:
            java.lang.String r1 = "CREATE TABLE message_quoted_group_invite_legacy (message_row_id INTEGER PRIMARY KEY, group_jid_row_id INTEGER NOT NULL, admin_jid_row_id INTEGER NOT NULL, group_name TEXT, invite_code TEXT, expiration INTEGER, invite_time INTEGER, expired INTEGER, group_type INTEGER NOT NULL DEFAULT 0)"
        L_0x0420:
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0423:
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 != 0) goto L_0x0436
            java.lang.String r15 = "group_type"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "LegacyQuotedGroupInviteTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
        L_0x0436:
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r2)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x07fc
            java.lang.String r1 = "CREATE TABLE message_quoted_group_invite (message_row_id INTEGER PRIMARY KEY, group_jid_row_id INTEGER NOT NULL, admin_jid_row_id INTEGER NOT NULL, group_name TEXT, invite_code TEXT, expiration INTEGER, invite_time INTEGER, expired INTEGER, group_type INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0445:
            java.lang.String r14 = "message_template"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x07e4
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x045c
            java.lang.String r1 = "CREATE TABLE message_template (message_row_id             INTEGER PRIMARY KEY, content_text_data          TEXT NOT NULL, footer_text_data           TEXT, template_id                TEXT, csat_trigger_expiration_ts INTEGER, category                   TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x045c:
            java.lang.String r14 = "message_template_button"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x07d3
            java.lang.String r1 = "CREATE TABLE message_template_button (_id INTEGER PRIMARY KEY AUTOINCREMENT,message_row_id INTEGER, text_data TEXT NOT NULL, extra_data TEXT, button_type INTEGER,used INTEGER,selected_index INTEGER,otp_button_type INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x046d:
            java.lang.String r1 = "message_template_quoted"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x047e
            java.lang.String r1 = "CREATE TABLE message_template_quoted (message_row_id INTEGER PRIMARY KEY, content_text_data TEXT NOT NULL,footer_text_data TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x047e:
            java.lang.String r1 = "message_location"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x048f
            java.lang.String r1 = "CREATE TABLE message_location (message_row_id INTEGER PRIMARY KEY, chat_row_id INTEGER, latitude REAL, longitude REAL, place_name TEXT, place_address TEXT, url TEXT, live_location_share_duration INTEGER, live_location_sequence_number INTEGER, live_location_final_latitude REAL, live_location_final_longitude REAL, live_location_final_timestamp INTEGER, map_download_status INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x048f:
            java.lang.String r1 = "message_quoted_location"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x04a0
            java.lang.String r1 = "CREATE TABLE message_quoted_location (message_row_id INTEGER PRIMARY KEY, latitude REAL, longitude REAL, place_name TEXT, place_address TEXT, url TEXT, thumbnail BLOB)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x04a0:
            java.lang.String r14 = "message_media"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x07a3
            java.lang.String r1 = "CREATE TABLE message_media (message_row_id INTEGER PRIMARY KEY, chat_row_id INTEGER, autotransfer_retry_enabled INTEGER, multicast_id TEXT, media_job_uuid TEXT, transferred INTEGER, transcoded INTEGER, file_path TEXT, file_size INTEGER, suspicious_content INTEGER, trim_from INTEGER, trim_to INTEGER, face_x INTEGER, face_y INTEGER, media_key BLOB, media_key_timestamp INTEGER, width INTEGER, height INTEGER, has_streaming_sidecar INTEGER, gif_attribution INTEGER, thumbnail_height_width_ratio REAL, direct_path TEXT, first_scan_sidecar BLOB, first_scan_length INTEGER, message_url TEXT, mime_type TEXT, file_length INTEGER, media_name TEXT, file_hash TEXT, media_duration INTEGER, page_count INTEGER, enc_file_hash TEXT, partial_media_hash TEXT, partial_media_enc_hash TEXT, is_animated_sticker INTEGER, original_file_hash TEXT, mute_video INTEGER DEFAULT 0, media_caption TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x04b1:
            java.lang.String r1 = "message_media_interactive_annotation"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x04c2
            java.lang.String r1 = "CREATE TABLE message_media_interactive_annotation (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, location_latitude REAL, location_longitude REAL, location_name TEXT, sort_order INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x04c2:
            java.lang.String r1 = "message_media_interactive_annotation_vertex"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x04d3
            java.lang.String r1 = "CREATE TABLE message_media_interactive_annotation_vertex (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_media_interactive_annotation_row_id INTEGER, x REAL, y REAL, sort_order INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x04d3:
            java.lang.String r14 = "message_quoted_media"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0798
            java.lang.String r1 = "CREATE TABLE message_quoted_media (message_row_id INTEGER PRIMARY KEY, media_job_uuid TEXT, transferred INTEGER, file_path TEXT, file_size INTEGER, media_key BLOB, media_key_timestamp INTEGER, width INTEGER, height INTEGER, direct_path TEXT, message_url TEXT, mime_type TEXT, file_length INTEGER, media_name TEXT, file_hash TEXT, media_duration INTEGER, page_count INTEGER, enc_file_hash TEXT, thumbnail BLOB, media_caption TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x04e4:
            java.lang.String r1 = "frequents"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x04f5
            java.lang.String r1 = "CREATE TABLE frequents (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, type INTEGER NOT NULL, message_count INTEGER NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x04f5:
            java.lang.String r1 = "frequent"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0506
            java.lang.String r1 = "CREATE TABLE frequent (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid_row_id INTEGER NOT NULL, type INTEGER NOT NULL, message_count INTEGER NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0506:
            java.lang.String r1 = "receipt_user"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0517
            java.lang.String r1 = "CREATE TABLE receipt_user(_id INTEGER PRIMARY KEY AUTOINCREMENT,message_row_id INTEGER NOT NULL,receipt_user_jid_row_id INTEGER NOT NULL,receipt_timestamp INTEGER,read_timestamp INTEGER,played_timestamp INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0517:
            java.lang.String r14 = "receipt_device"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x078d
            java.lang.String r1 = "CREATE TABLE receipt_device (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER NOT NULL, receipt_device_jid_row_id INTEGER NOT NULL, receipt_device_timestamp INTEGER, primary_device_version INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0528:
            java.lang.String r5 = "receipt_orphaned"
            java.lang.String r4 = X.C33961jT.A00(r12, r0, r5)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = "CREATE TABLE receipt_orphaned (_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER NOT NULL, from_me INTEGER NOT NULL, key_id TEXT NOT NULL, receipt_device_jid_row_id INTEGER NOT NULL, receipt_recipient_jid_row_id INTEGER, status INTEGER, timestamp INTEGER)"
            if (r1 != 0) goto L_0x0545
            java.lang.String r2 = "receipt_recipient_jid_row_id"
            java.lang.String r1 = "INTEGER"
            boolean r1 = X.C33961jT.A03(r4, r2, r1)     // Catch:{ all -> 0x1221 }
            if (r1 != 0) goto L_0x0548
            java.lang.String r1 = "ReceiptOrphanedTable"
            X.C33961jT.A01(r12, r1, r5)     // Catch:{ all -> 0x1221 }
        L_0x0545:
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0548:
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "receipts"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x055c
            java.lang.String r1 = "CREATE TABLE receipts(_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT NOT NULL, key_id TEXT NOT NULL, remote_resource TEXT, receipt_device_timestamp INTEGER, read_device_timestamp INTEGER, played_device_timestamp INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x055c:
            java.lang.String r1 = "message_mentions"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x056d
            java.lang.String r1 = "CREATE TABLE message_mentions (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, jid_row_id INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x056d:
            java.lang.String r1 = "CREATE UNIQUE INDEX IF NOT EXISTS mentions_index ON message_mentions (message_row_id, jid_row_id)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "message_vcard"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0583
            java.lang.String r1 = "CREATE TABLE message_vcard (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, vcard TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0583:
            java.lang.String r1 = "message_media_vcard_count"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0594
            java.lang.String r1 = "CREATE TABLE message_media_vcard_count(_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, count INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0594:
            java.lang.String r14 = "message_vcard_jid"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x077d
            java.lang.String r1 = "CREATE TABLE message_vcard_jid(_id INTEGER PRIMARY KEY AUTOINCREMENT, vcard_jid_row_id INTEGER, vcard_row_id INTEGER, message_row_id INTEGER)"
        L_0x05a2:
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x05a5:
            java.lang.String r14 = "user_device"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0772
            java.lang.String r1 = "CREATE TABLE user_device (_id INTEGER PRIMARY KEY AUTOINCREMENT, user_jid_row_id INTEGER, device_jid_row_id INTEGER, key_index INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x05b7:
            java.lang.String r1 = "primary_device_version"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x05c8
            java.lang.String r1 = "CREATE TABLE primary_device_version (user_jid_row_id INTEGER PRIMARY KEY, version INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x05c8:
            java.lang.String r14 = "group_participant_user"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = "CREATE TABLE group_participant_user (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_jid_row_id INTEGER NOT NULL, user_jid_row_id INTEGER NOT NULL, rank INTEGER, pending INTEGER)"
            if (r1 != 0) goto L_0x05e5
            java.lang.String r1 = "admin"
            java.lang.String r2 = "INTEGER"
            boolean r1 = X.C33961jT.A03(r13, r1, r2)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0762
            java.lang.String r1 = "TableGroupParticipantUser"
            X.C33961jT.A01(r12, r1, r14)     // Catch:{ all -> 0x1221 }
        L_0x05e5:
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x05e8:
            java.lang.String r14 = "group_participant_device"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0756
            java.lang.String r1 = "CREATE TABLE group_participant_device (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_participant_row_id INTEGER NOT NULL, device_jid_row_id INTEGER NOT NULL, sent_sender_key INTEGER, sent_add_on_sender_key INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x05f9:
            java.lang.String r1 = "group_past_participant_user"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x060a
            java.lang.String r1 = "CREATE TABLE group_past_participant_user (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_jid_row_id INTEGER NOT NULL, user_jid_row_id INTEGER NOT NULL, is_leave INTEGER NOT NULL, timestamp INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x060a:
            java.lang.String r14 = "message_external_ad_content"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0740
            java.lang.String r1 = "CREATE TABLE message_external_ad_content (message_row_id INTEGER PRIMARY KEY, title TEXT, body TEXT, media_type INTEGER, thumbnail_url TEXT, full_thumbnail BLOB, micro_thumbnail BLOB, media_url TEXT, source_type TEXT, source_id TEXT, source_url TEXT, render_larger_thumbnail BOOLEAN, show_ad_attribution BOOLEAN, has_icebreaker_auto_response BOOLEAN )"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x061b:
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "group_participants"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0734
            java.lang.String r1 = "CREATE TABLE group_participants (_id INTEGER PRIMARY KEY AUTOINCREMENT, gjid TEXT NOT NULL, jid TEXT NOT NULL, admin INTEGER, pending INTEGER, sent_sender_key INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x062f:
            java.lang.String r1 = "group_participants_history"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0640
            java.lang.String r1 = "CREATE TABLE group_participants_history (_id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp DATETIME NOT NULL, gjid TEXT NOT NULL, jid TEXT NOT NULL, action INTEGER NOT NULL, old_phash TEXT NOT NULL, new_phash TEXT NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0640:
            java.lang.String r1 = "group_notification_version"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0651
            java.lang.String r1 = "CREATE TABLE group_notification_version (group_jid_row_id INTEGER PRIMARY KEY, subject_timestamp INTEGER NOT NULL, announcement_version INTEGER NOT NULL, participant_version INTEGER NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0651:
            java.lang.String r1 = "media_refs"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0662
            java.lang.String r1 = "CREATE TABLE media_refs (_id INTEGER PRIMARY KEY AUTOINCREMENT, path TEXT UNIQUE, ref_count INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0662:
            java.lang.String r1 = "message_thumbnails"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0673
            java.lang.String r1 = "CREATE TABLE message_thumbnails (thumbnail BLOB, timestamp DATETIME, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0673:
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = X.C34001jX.A00     // Catch:{ all -> 0x1221 }
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "message_streaming_sidecar"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x068c
            java.lang.String r1 = "CREATE TABLE message_streaming_sidecar (message_row_id INTEGER PRIMARY KEY, sidecar BLOB, chunk_lengths BLOB, timestamp INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x068c:
            java.lang.String r1 = "mms_thumbnail_metadata"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x069d
            java.lang.String r1 = "CREATE TABLE mms_thumbnail_metadata (message_row_id INTEGER PRIMARY KEY, direct_path TEXT, media_key BLOB, media_key_timestamp INTEGER, enc_thumb_hash TEXT, thumb_hash TEXT, thumb_width INTEGER, thumb_height INTEGER, transferred INTEGER, micro_thumbnail BLOB, insert_timestamp INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x069d:
            java.lang.String r14 = "audio_data"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0729
            java.lang.String r1 = "CREATE TABLE audio_data (message_row_id INTEGER PRIMARY KEY, waveform BLOB, background_color INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x06ae:
            java.lang.String r14 = "status_list"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x071a
            java.lang.String r1 = "CREATE TABLE status_list (_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT UNIQUE, message_table_id INTEGER, last_read_message_table_id INTEGER, last_read_receipt_sent_message_table_id INTEGER, first_unread_message_table_id INTEGER, autodownload_limit_message_table_id INTEGER, timestamp INTEGER, unseen_count INTEGER, total_count INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x06c0:
            java.lang.String r1 = "status"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x06d2
            java.lang.String r1 = "CREATE TABLE status (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid_row_id INTEGER UNIQUE, message_table_id INTEGER, last_read_message_table_id INTEGER, last_read_receipt_sent_message_table_id INTEGER, first_unread_message_table_id INTEGER, autodownload_limit_message_table_id INTEGER, timestamp INTEGER, unseen_count INTEGER, total_count INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x06d2:
            java.lang.String r14 = "deleted_chat_job"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0708
            java.lang.String r1 = X.C34011jY.A00     // Catch:{ all -> 0x1221 }
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "CREATE TABLE deleted_chat_job(_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER NOT NULL, block_size INTEGER, singular_message_delete_rows_id TEXT, deleted_message_row_id  INTEGER, deleted_starred_message_row_id  INTEGER, deleted_messages_remove_files BOOLEAN, deleted_categories_message_row_id INTEGER, deleted_categories_starred_message_row_id INTEGER, deleted_categories_remove_files BOOLEAN, deleted_message_categories TEXT, delete_files_singular_delete BOOLEAN)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x06e8:
            java.lang.String r1 = "message_edit_info"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x06f9
            java.lang.String r1 = "CREATE TABLE message_edit_info (message_row_id INTEGER PRIMARY KEY, original_key_id TEXT NOT NULL, edited_timestamp INTEGER NOT NULL, sender_timestamp INTEGER NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x06f9:
            java.lang.String r1 = "CREATE UNIQUE INDEX IF NOT EXISTS message_edit_info_index ON message_edit_info (original_key_id)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "messages_dehydrated_hsm"
            X.C33961jT.A01(r12, r6, r1)     // Catch:{ all -> 0x1221 }
            r7.A00()     // Catch:{ all -> 0x1221 }
            goto L_0x0808
        L_0x0708:
            java.lang.String r15 = "singular_message_delete_rows_id"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "deleted_chat_job_table"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "delete_files_singular_delete"
            java.lang.String r16 = "BOOLEAN"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x06e8
        L_0x071a:
            java.lang.String r15 = "first_unread_message_table_id"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "StatusListDeprecatedTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "autodownload_limit_message_table_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x06c0
        L_0x0729:
            java.lang.String r15 = "background_color"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "AudioDataTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x06ae
        L_0x0734:
            java.lang.String r15 = "sent_sender_key"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "GroupParticipantsTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x062f
        L_0x0740:
            java.lang.String r15 = "render_larger_thumbnail"
            java.lang.String r16 = "BOOLEAN"
            java.lang.String r17 = "ExternalAdContentInfoTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "show_ad_attribution"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "has_icebreaker_auto_response"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x061b
        L_0x0756:
            java.lang.String r15 = "sent_add_on_sender_key"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "TableGroupParticipantDevice"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x05f9
        L_0x0762:
            java.lang.String r15 = "rank"
            java.lang.String r17 = "TableGroupParticipantUser"
            r16 = r2
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "pending"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x05e8
        L_0x0772:
            java.lang.String r15 = "key_index"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "UserDeviceTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x05b7
        L_0x077d:
            java.lang.String r15 = "message_row_id"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "VCardJidTable"
            boolean r1 = X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x05a5
            java.lang.String r1 = "DROP INDEX IF EXISTS message_vcard_jid_index"
            goto L_0x05a2
        L_0x078d:
            java.lang.String r15 = "primary_device_version"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "ReceiptDeviceTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0528
        L_0x0798:
            java.lang.String r15 = "media_caption"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "MessageQuotedMediaTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x04e4
        L_0x07a3:
            java.lang.String r15 = "partial_media_hash"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "MessageMediaTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "partial_media_enc_hash"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "is_animated_sticker"
            java.lang.String r22 = "INTEGER"
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "original_file_hash"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "mute_video"
            java.lang.String r22 = "INTEGER DEFAULT 0"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "media_caption"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x04b1
        L_0x07d3:
            java.lang.String r15 = "selected_index"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "TemplateButtonTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "otp_button_type"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x046d
        L_0x07e4:
            java.lang.String r15 = "csat_trigger_expiration_ts"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "TemplateTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "template_id"
            java.lang.String r16 = "TEXT"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "category"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x045c
        L_0x07fc:
            java.lang.String r15 = "group_type"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "QuotedGroupInviteTable"
            r14 = r2
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0445
        L_0x0808:
            if (r31 == 0) goto L_0x0825
            java.lang.String r14 = "pay_transactions"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0ed8
            java.lang.String r1 = "CREATE TABLE pay_transactions (key_remote_jid TEXT, key_from_me INTEGER, key_id TEXT, id TEXT, timestamp INTEGER, status INTEGER, error_code TEXT, sender TEXT, receiver TEXT, type INTEGER, currency TEXT, amount_1000, credential_id TEXT, methods TEXT, bank_transaction_id TEXT, metadata TEXT, init_timestamp INTEGER, request_key_id TEXT, country TEXT, version INTEGER, future_data BLOB,service_id INTEGER, background_id TEXT, purchase_initiator INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x081b:
            java.lang.String r1 = "CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transactions_index ON pay_transactions (key_id)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transactions_id_index ON pay_transactions (id)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0825:
            java.lang.String r14 = "pay_transaction"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0eb8
            java.lang.String r1 = "CREATE TABLE pay_transaction (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, remote_jid_row_id INTEGER, key_id TEXT, interop_id TEXT, id TEXT, timestamp INTEGER, status INTEGER, error_code TEXT, sender_jid_row_id INTEGER, receiver_jid_row_id INTEGER, type INTEGER, currency_code TEXT, amount_1000, credential_id TEXT, methods TEXT, bank_transaction_id TEXT, metadata TEXT, init_timestamp INTEGER, request_key_id TEXT, country TEXT, version INTEGER, future_data BLOB, service_id INTEGER, background_id TEXT, purchase_initiator INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0836:
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "payment_background"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0e88
            java.lang.String r1 = "CREATE TABLE payment_background (background_id TEXT PRIMARY KEY, file_size INTEGER, width INTEGER, height INTEGER, mime_type TEXT, placeholder_color INTEGER, text_color INTEGER, subtext_color INTEGER, fullsize_url TEXT, description TEXT, lg TEXT, media_key BLOB, media_key_timestamp INTEGER, file_sha256 TEXT, file_enc_sha256 TEXT, direct_path TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x084a:
            java.lang.String r1 = "payment_background_order"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x085b
            java.lang.String r1 = "CREATE TABLE payment_background_order (background_id TEXT PRIMARY KEY, background_order INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x085b:
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "call_log"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0e58
            java.lang.String r1 = "CREATE TABLE call_log (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid_row_id INTEGER, from_me INTEGER, call_id TEXT, transaction_id INTEGER, timestamp INTEGER, video_call INTEGER, duration INTEGER, call_result INTEGER, is_dnd_mode_on INTEGER, bytes_transferred INTEGER, group_jid_row_id INTEGER NOT NULL DEFAULT 0, is_joinable_group_call INTEGER, call_creator_device_jid_row_id INTEGER NOT NULL DEFAULT 0, call_random_id TEXT, call_link_row_id INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "call_logs"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 != 0) goto L_0x0891
            java.lang.String r1 = "call_log_participant"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x088c
            java.lang.String r1 = "CREATE TABLE call_log_participant (_id INTEGER PRIMARY KEY AUTOINCREMENT, call_logs_row_id INTEGER, jid TEXT, call_result INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x088c:
            java.lang.String r1 = "CREATE UNIQUE INDEX IF NOT EXISTS call_log_participants_key_index ON call_log_participant (call_logs_row_id, jid)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0891:
            java.lang.String r1 = "call_logs"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            r1 = 1
            if (r3 == 0) goto L_0x08a6
            java.lang.String r4 = "call_log_ready"
            java.lang.String r3 = "CallLogTable"
            X.C33971jU.A02(r12, r4, r3, r1)     // Catch:{ all -> 0x1221 }
        L_0x08a6:
            java.lang.String r3 = "call_log_participant_v2"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x08b7
            java.lang.String r3 = "CREATE TABLE call_log_participant_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, call_log_row_id INTEGER, jid_row_id INTEGER, call_result INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x08b7:
            java.lang.String r14 = "joinable_call_log"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0e40
            java.lang.String r3 = "CREATE TABLE joinable_call_log (call_log_row_id INTEGER PRIMARY KEY, call_id TEXT NOT NULL, joinable_video_call INTEGER NOT NULL DEFAULT 0, group_jid_row_id INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x08c8:
            java.lang.String r14 = "missed_call_logs"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0e25
            java.lang.String r3 = "CREATE TABLE missed_call_logs (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, timestamp INTEGER, video_call INTEGER, group_jid_row_id INTEGER NOT NULL DEFAULT 0, is_joinable_group_call INTEGER, is_dnd_mode_on INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x08d9:
            java.lang.String r3 = "missed_call_log_participant"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x08ea
            java.lang.String r3 = "CREATE TABLE missed_call_log_participant (_id INTEGER PRIMARY KEY AUTOINCREMENT, call_logs_row_id INTEGER, jid TEXT, call_result INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x08ea:
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "jid"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0e0a
            java.lang.String r3 = "CREATE TABLE jid (_id INTEGER PRIMARY KEY AUTOINCREMENT, user TEXT NOT NULL, server TEXT NOT NULL, agent INTEGER, device INTEGER, type INTEGER, raw_string TEXT)"
        L_0x08fb:
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = "jid_ready"
            X.C33971jU.A02(r12, r3, r6, r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = "CREATE TABLE IF NOT EXISTS jid_map (lid_row_id INTEGER PRIMARY KEY NOT NULL, jid_row_id INTEGER NOT NULL)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = "jid_map_ready"
            X.C33971jU.A02(r12, r3, r6, r1)     // Catch:{ all -> 0x1221 }
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = "CREATE TABLE IF NOT EXISTS lid_display_name (lid_row_id INTEGER PRIMARY KEY NOT NULL, display_name TEXT NOT NULL)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "lid_chat_state"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = r13.isEmpty()     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0dfa
            java.lang.String r3 = "CREATE TABLE IF NOT EXISTS lid_chat_state (jid_row_id INTEGER PRIMARY KEY NOT NULL, is_pn_shared INTEGER NOT NULL DEFAULT 0, pn_requested_ts INTEGER NOT NULL DEFAULT 0, pnh_duplicate_lid_thread INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0926:
            java.lang.String r14 = "chat"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0d1d
            java.lang.String r3 = "CREATE TABLE chat (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid_row_id INTEGER UNIQUE, hidden INTEGER, subject TEXT, created_timestamp INTEGER, display_message_row_id INTEGER, last_message_row_id INTEGER, last_read_message_row_id INTEGER, last_read_receipt_sent_message_row_id INTEGER, last_important_message_row_id INTEGER, archived INTEGER, sort_timestamp INTEGER, mod_tag INTEGER, gen REAL, spam_detection INTEGER, unseen_earliest_message_received_time INTEGER, unseen_message_count INTEGER, unseen_missed_calls_count INTEGER, unseen_row_count INTEGER, plaintext_disabled INTEGER, vcard_ui_dismissed INTEGER, change_number_notified_message_row_id INTEGER, show_group_description INTEGER, ephemeral_expiration INTEGER, last_read_ephemeral_message_row_id INTEGER, ephemeral_setting_timestamp INTEGER, ephemeral_disappearing_messages_initiator INTEGER, unseen_important_message_count INTEGER NOT NULL DEFAULT 0, group_type INTEGER NOT NULL DEFAULT 0, last_message_reaction_row_id INTEGER, last_seen_message_reaction_row_id INTEGER, unseen_message_reaction_count INTEGER, growth_lock_level INTEGER, growth_lock_expiration_ts INTEGER, last_read_message_sort_id INTEGER, display_message_sort_id INTEGER, last_message_sort_id INTEGER, last_read_receipt_sent_message_sort_id INTEGER, has_new_community_admin_dialog_been_acknowledged INTEGER NOT NULL DEFAULT 0, history_sync_progress INTEGER )"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0937:
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "community_chat"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0d0b
            java.lang.String r3 = "CREATE TABLE community_chat (chat_row_id INTEGER PRIMARY KEY, last_activity_ts INTEGER, last_activity_seen_ts INTEGER, join_ts INTEGER, closed INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x094b:
            java.lang.String r3 = "parent_group_participants"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x095c
            java.lang.String r3 = "CREATE TABLE parent_group_participants (parent_group_jid_row_id INTEGER NOT NULL, user_jid_row_id INTEGER NOT NULL)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x095c:
            java.lang.String r3 = "message_link"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x096d
            java.lang.String r3 = "CREATE TABLE message_link (_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER, message_row_id INTEGER, link_index INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x096d:
            java.lang.String r3 = "message_thumbnail"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x097e
            java.lang.String r3 = "CREATE TABLE message_thumbnail (message_row_id INTEGER PRIMARY KEY, thumbnail BLOB)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x097e:
            java.lang.String r3 = "media_hash_thumbnail"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x098f
            java.lang.String r3 = "CREATE TABLE media_hash_thumbnail (media_hash TEXT PRIMARY KEY, thumbnail BLOB)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x098f:
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = "message_forwarded"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x09a3
            java.lang.String r3 = "CREATE TABLE message_forwarded(message_row_id INTEGER PRIMARY KEY, forward_score INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x09a3:
            java.lang.String r14 = "message_text"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0cf1
            java.lang.String r3 = "CREATE TABLE message_text (message_row_id INTEGER PRIMARY KEY, description TEXT, page_title TEXT, url TEXT, font_style INTEGER, text_color INTEGER, background_color INTEGER, preview_type INTEGER, invite_link_group_type INTEGER NOT NULL DEFAULT 0, counter_abuse_token TEXT)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x09b4:
            java.lang.String r3 = "message_quoted_text"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x09c5
            java.lang.String r3 = "CREATE TABLE message_quoted_text (message_row_id INTEGER PRIMARY KEY, thumbnail BLOB)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x09c5:
            java.lang.String r14 = "message_future"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0ce6
            java.lang.String r3 = "CREATE TABLE message_future(message_row_id INTEGER PRIMARY KEY, version INTEGER, data BLOB, future_message_type INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x09d6:
            java.lang.String r14 = "message_revoked"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0cd5
            java.lang.String r3 = "CREATE TABLE message_revoked (message_row_id INTEGER PRIMARY KEY,revoked_key_id TEXT NOT NULL,admin_jid_row_id INTEGER,revoke_timestamp INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x09e7:
            java.lang.String r3 = "message_rating"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x09f8
            java.lang.String r3 = "CREATE TABLE message_rating (message_row_id INTEGER PRIMARY KEY, rating INTEGER NOT NULL)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x09f8:
            java.lang.String r3 = "message_payment"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0a09
            java.lang.String r3 = "CREATE TABLE message_payment (message_row_id INTEGER PRIMARY KEY, sender_jid_row_id INTEGER, receiver_jid_row_id INTEGER, amount_with_symbol TEXT, remote_resource TEXT, remote_message_sender_jid_row_id INTEGER, remote_message_from_me INTEGER, remote_message_key TEXT)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0a09:
            java.lang.String r3 = "message_payment_transaction_reminder"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0a1a
            java.lang.String r3 = "CREATE TABLE message_payment_transaction_reminder (message_row_id INTEGER PRIMARY KEY, web_stub TEXT, amount TEXT, transfer_date TEXT, payment_sender_name TEXT, expiration INTEGER, remote_message_key TEXT)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0a1a:
            java.lang.String r3 = "message_payment_status_update"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0a2b
            java.lang.String r3 = "CREATE TABLE message_payment_status_update (message_row_id INTEGER PRIMARY KEY,transaction_info TEXT,transaction_data TEXT,init_timestamp TEXT,update_timestamp TEXT,amount_data TEXT)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0a2b:
            java.lang.String r3 = "message_send_count"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0a3c
            java.lang.String r3 = "CREATE TABLE message_send_count (message_row_id INTEGER PRIMARY KEY, send_count INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0a3c:
            java.lang.String r3 = "message_system"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0a4d
            java.lang.String r3 = "CREATE TABLE message_system (message_row_id INTEGER PRIMARY KEY, action_type INTEGER NOT NULL)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0a4d:
            java.lang.String r3 = "message_system_group"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0a5e
            java.lang.String r3 = "CREATE TABLE message_system_group (message_row_id INTEGER PRIMARY KEY, is_me_joined INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0a5e:
            java.lang.String r3 = "message_system_value_change"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0a6f
            java.lang.String r3 = "CREATE TABLE message_system_value_change (message_row_id INTEGER PRIMARY KEY, old_data TEXT)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0a6f:
            java.lang.String r3 = "message_system_number_change"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0a80
            java.lang.String r3 = "CREATE TABLE message_system_number_change (message_row_id INTEGER PRIMARY KEY, old_jid_row_id INTEGER, new_jid_row_id INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0a80:
            java.lang.String r3 = "message_system_device_change"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0a91
            java.lang.String r3 = "CREATE TABLE message_system_device_change (message_row_id INTEGER PRIMARY KEY, device_added_count INTEGER, device_removed_count INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0a91:
            java.lang.String r14 = "message_system_initial_privacy_provider"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0cca
            java.lang.String r3 = "CREATE TABLE message_system_initial_privacy_provider(message_row_id INTEGER PRIMARY KEY, privacy_provider INTEGER NOT NULL DEFAULT 0, verified_biz_name TEXT, biz_state_id INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0aa2:
            java.lang.String r3 = "message_system_photo_change"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0ab3
            java.lang.String r3 = "CREATE TABLE message_system_photo_change (message_row_id INTEGER PRIMARY KEY, new_photo_id TEXT, old_photo BLOB, new_photo BLOB)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0ab3:
            java.lang.String r3 = "message_system_chat_participant"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0ac4
            java.lang.String r3 = "CREATE TABLE message_system_chat_participant (message_row_id INTEGER, user_jid_row_id INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0ac4:
            java.lang.String r3 = "message_system_business_state"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0ad5
            java.lang.String r3 = "CREATE TABLE message_system_business_state (message_row_id INTEGER PRIMARY KEY, privacy_message_type INTEGER NOT NULL, business_name TEXT)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0ad5:
            java.lang.String r3 = "message_system_block_contact"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0ae6
            java.lang.String r3 = "CREATE TABLE message_system_block_contact (message_row_id INTEGER PRIMARY KEY, is_blocked INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0ae6:
            java.lang.String r4 = "message_system_linked_group_call"
            java.lang.String r3 = "CREATE TABLE message_system_linked_group_call(message_row_id INTEGER PRIMARY KEY, call_id TEXT, is_video_call INTEGER)"
            A02(r12, r4, r3)     // Catch:{ all -> 0x1221 }
            java.lang.String r4 = "message_system_community_link_changed"
            java.lang.String r3 = "CREATE TABLE message_system_community_link_changed(message_row_id INTEGER PRIMARY KEY, old_group_type INTEGER, new_group_type INTEGER NOT NULL, linked_parent_group_jid_row_id INTEGER)"
            A02(r12, r4, r3)     // Catch:{ all -> 0x1221 }
            java.lang.String r4 = "message_system_group_with_parent"
            java.lang.String r3 = "CREATE TABLE message_system_group_with_parent(message_row_id INTEGER PRIMARY KEY, linked_parent_group_name TEXT )"
            A02(r12, r4, r3)     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "message_system_sibling_group_link_change"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0cbf
            java.lang.String r3 = "CREATE TABLE message_system_sibling_group_link_change (message_row_id INTEGER NOT NULL, subgroup_raw_jid TEXT NOT NULL, subgroup_subject TEXT NOT NULL, parent_group_jid_row_id INTEGER, PRIMARY KEY (message_row_id, subgroup_raw_jid))"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0b0c:
            java.lang.String r3 = "message_system_with_group_nodes"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0b1d
            java.lang.String r3 = "CREATE TABLE message_system_with_group_nodes (message_row_id INTEGER NOT NULL, group_jid_row_id INTEGER NOT NULL, group_node_type INTEGER NOT NULL, group_subject TEXT, PRIMARY KEY (message_row_id, group_jid_row_id, group_node_type))"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0b1d:
            java.lang.String r3 = "message_ui_elements"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0b2e
            java.lang.String r3 = "CREATE TABLE message_ui_elements(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, message_row_id INTEGER NOT NULL, element_type INTEGER, element_content TEXT)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0b2e:
            java.lang.String r3 = "message_quoted_ui_elements"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0b3f
            java.lang.String r3 = "CREATE TABLE message_quoted_ui_elements(message_row_id INTEGER NOT NULL PRIMARY KEY, element_type INTEGER, element_content TEXT)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0b3f:
            java.lang.String r14 = "message_ui_elements_reply"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0cb4
            java.lang.String r3 = "CREATE TABLE message_ui_elements_reply (message_row_id INTEGER PRIMARY KEY, element_type INTEGER,reply_values TEXT,reply_description TEXT )"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0b50:
            java.lang.String r14 = "message_quoted_ui_elements_reply"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0ca9
            java.lang.String r3 = "CREATE TABLE message_quoted_ui_elements_reply (message_row_id INTEGER PRIMARY KEY, element_type INTEGER,reply_values TEXT,reply_description TEXT )"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0b61:
            java.lang.String r3 = "message_quoted_ui_elements_reply_legacy"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0b72
            java.lang.String r3 = "CREATE TABLE message_quoted_ui_elements_reply_legacy (message_row_id INTEGER PRIMARY KEY, element_type INTEGER,reply_values TEXT,reply_description TEXT )"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0b72:
            java.lang.String r14 = "message_add_on"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0c9e
            java.lang.String r3 = "CREATE TABLE message_add_on (_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER, from_me INTEGER, key_id TEXT NOT NULL, sender_jid_row_id INTEGER, parent_message_row_id INTEGER, timestamp INTEGER, status INTEGER, message_add_on_type INTEGER, received_timestamp INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0b83:
            java.lang.String r3 = "message_add_on_orphan"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0b94
            java.lang.String r3 = "CREATE TABLE message_add_on_orphan (_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER, from_me INTEGER, key_id TEXT NOT NULL, sender_jid_row_id INTEGER, parent_chat_row_id INTEGER, parent_from_me INTEGER, parent_key_id TEXT NOT NULL, parent_sender_jid_row_id INTEGER, timestamp INTEGER, orphan_message_data BLOB)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0b94:
            java.lang.String r10 = "message_add_on_receipt_device"
            java.lang.String r5 = X.C33961jT.A00(r12, r0, r10)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x1221 }
            java.lang.String r9 = "CREATE TABLE message_add_on_receipt_device (receipt_device_id INTEGER PRIMARY KEY AUTOINCREMENT, message_add_on_row_id INTEGER, receipt_device_jid_row_id INTEGER, receipt_device_timestamp INTEGER, primary_device_version INTEGER)"
            if (r3 != 0) goto L_0x0bf0
            java.lang.String r4 = "receipt_device_id"
            java.lang.String r3 = "INTEGER"
            boolean r3 = X.C33961jT.A03(r5, r4, r3)     // Catch:{ all -> 0x1221 }
            if (r3 != 0) goto L_0x0bf3
            java.lang.String r4 = "message_add_on_receipt_device_index"
            java.lang.String r11 = "DROP INDEX IF EXISTS "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1221 }
            r3.<init>(r11)     // Catch:{ all -> 0x1221 }
            r3.append(r4)     // Catch:{ all -> 0x1221 }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = X.C34021jZ.A00(r10)     // Catch:{ all -> 0x1221 }
            java.lang.String r8 = "MessageAddOnReceiptDeviceTable"
            java.lang.String r5 = "createTable"
            X.C34021jZ.A01(r8, r5, r3)     // Catch:{ all -> 0x1221 }
            r12.A0B(r4)     // Catch:{ all -> 0x1221 }
            java.lang.String r4 = "message_add_on_receipt_device_jid_index"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1221 }
            r3.<init>(r11)     // Catch:{ all -> 0x1221 }
            r3.append(r4)     // Catch:{ all -> 0x1221 }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = X.C34021jZ.A00(r10)     // Catch:{ all -> 0x1221 }
            X.C34021jZ.A01(r8, r5, r3)     // Catch:{ all -> 0x1221 }
            r12.A0B(r4)     // Catch:{ all -> 0x1221 }
            java.lang.String r4 = X.C34031ja.A00(r10)     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = X.C34021jZ.A00(r10)     // Catch:{ all -> 0x1221 }
            X.C34021jZ.A01(r8, r5, r3)     // Catch:{ all -> 0x1221 }
            r12.A0B(r4)     // Catch:{ all -> 0x1221 }
        L_0x0bf0:
            r12.A0B(r9)     // Catch:{ all -> 0x1221 }
        L_0x0bf3:
            java.lang.String r3 = "message_add_on_reaction"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0c04
            java.lang.String r3 = "CREATE TABLE message_add_on_reaction (message_add_on_row_id INTEGER PRIMARY KEY, reaction TEXT, sender_timestamp INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0c04:
            java.lang.String r14 = "message_poll"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0c8e
            java.lang.String r3 = "CREATE TABLE message_poll (message_row_id INTEGER PRIMARY KEY, enc_key BLOB, selectable_options_count INTEGER, invalid_state INTEGER NOT NULL DEFAULT 0,poll_logging_id INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0c15:
            java.lang.String r3 = "message_poll_option"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0c26
            java.lang.String r3 = "CREATE TABLE message_poll_option (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, option_sha256 TEXT, option_name TEXT, vote_total INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0c26:
            java.lang.String r3 = "message_add_on_poll_vote"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0c37
            java.lang.String r3 = "CREATE TABLE message_add_on_poll_vote (message_add_on_row_id INTEGER PRIMARY KEY, sender_timestamp INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0c37:
            java.lang.String r3 = "message_add_on_poll_vote_selected_option"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0c48
            java.lang.String r3 = "CREATE TABLE message_add_on_poll_vote_selected_option (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_add_on_row_id INTEGER, message_poll_option_id INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0c48:
            java.lang.String r14 = "message_add_on_keep_in_chat"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0c7d
            java.lang.String r3 = "CREATE TABLE message_add_on_keep_in_chat (message_add_on_row_id INTEGER PRIMARY KEY, keep_in_chat_state INTEGER NOT NULL DEFAULT 0, sender_timestamp INTEGER, keep_count INTEGER NOT NULL DEFAULT 0, actor_device_jid_row_id INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0c59:
            java.lang.String r3 = "message_secret"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0c6a
            java.lang.String r3 = "CREATE TABLE message_secret (message_row_id INTEGER PRIMARY KEY, message_secret BLOB)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0c6a:
            java.lang.String r3 = "message_details"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0f1e
            java.lang.String r3 = "CREATE TABLE message_details (message_row_id INTEGER PRIMARY KEY, author_device_jid INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
            goto L_0x0f1e
        L_0x0c7d:
            java.lang.String r15 = "keep_count"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "MessageAddOnKeepInChatTable/createTable/ADD_COLUMN_IF_NOT_EXISTS"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "actor_device_jid_row_id"
            java.lang.String r16 = "INTEGER"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0c59
        L_0x0c8e:
            java.lang.String r15 = "invalid_state"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "createMessagePollTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "poll_logging_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0c15
        L_0x0c9e:
            java.lang.String r15 = "received_timestamp"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "MessageAddOnTable/createMessageAddOnTable/ADD_RECEIVED_TIMESTAMP_COLUMN"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0b83
        L_0x0ca9:
            java.lang.String r15 = "reply_description"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "QuotedMessageUIElementsReplyTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0b61
        L_0x0cb4:
            java.lang.String r15 = "reply_description"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "MessageUIElementsReplyTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0b50
        L_0x0cbf:
            java.lang.String r15 = "parent_group_jid_row_id"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "MessageSystemSiblingGroupLinkChangeTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0b0c
        L_0x0cca:
            java.lang.String r15 = "biz_state_id"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "MessageSystemInitialPrivacyProviderTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0aa2
        L_0x0cd5:
            java.lang.String r15 = "admin_jid_row_id"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "MessageRevokedTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "revoke_timestamp"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x09e7
        L_0x0ce6:
            java.lang.String r15 = "future_message_type"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "MessageFutureTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x09d6
        L_0x0cf1:
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "invite_link_group_type"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "MessageTextTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "counter_abuse_token"
            java.lang.String r16 = "TEXT"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x09b4
        L_0x0d0b:
            java.lang.String r15 = "join_ts"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "CommunityChatTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "closed"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x094b
        L_0x0d1d:
            java.lang.String r15 = "hidden"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "createChatTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "subject"
            java.lang.String r22 = "TEXT"
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "created_timestamp"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "display_message_row_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_message_row_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_read_message_row_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_read_receipt_sent_message_row_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_important_message_row_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "archived"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "sort_timestamp"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "mod_tag"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "gen"
            java.lang.String r22 = "REAL"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "spam_detection"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "unseen_earliest_message_received_time"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "unseen_message_count"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "unseen_missed_calls_count"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "unseen_row_count"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "plaintext_disabled"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "vcard_ui_dismissed"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "change_number_notified_message_row_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "show_group_description"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_read_ephemeral_message_row_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "ephemeral_expiration"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "ephemeral_setting_timestamp"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "ephemeral_disappearing_messages_initiator"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "unseen_important_message_count"
            java.lang.String r22 = "INTEGER NOT NULL DEFAULT 0"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "group_type"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_message_reaction_row_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_seen_message_reaction_row_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "unseen_message_reaction_count"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "growth_lock_level"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "growth_lock_expiration_ts"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_read_message_sort_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "display_message_sort_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_message_sort_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "last_read_receipt_sent_message_sort_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "has_new_community_admin_dialog_been_acknowledged"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "history_sync_progress"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0937
        L_0x0dfa:
            java.lang.String r15 = "pn_requested_ts"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "LidChatStateTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "pnh_duplicate_lid_thread"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0926
        L_0x0e0a:
            java.lang.String r15 = "device"
            java.lang.String r16 = "INTEGER"
            r17 = r14
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r5 = "jid_key_index"
            java.lang.String r4 = "DROP INDEX IF EXISTS "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1221 }
            r3.<init>(r4)     // Catch:{ all -> 0x1221 }
            r3.append(r5)     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x1221 }
            goto L_0x08fb
        L_0x0e25:
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "group_jid_row_id"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "MissedCallLogsTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "is_joinable_group_call"
            java.lang.String r16 = "INTEGER"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "is_dnd_mode_on"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x08d9
        L_0x0e40:
            java.lang.String r15 = "group_jid_row_id"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "JoinableCallLogTable"
            boolean r3 = X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0e51
            java.lang.String r3 = "CREATE INDEX IF NOT EXISTS joinable_call_log_group_jid_row_id_index ON joinable_call_log (group_jid_row_id)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0e51:
            java.lang.String r15 = "joinable_video_call"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x08c8
        L_0x0e58:
            java.lang.String r15 = "is_dnd_mode_on"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "CallLogTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "group_jid_row_id"
            java.lang.String r22 = "INTEGER NOT NULL DEFAULT 0"
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "is_joinable_group_call"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "call_creator_device_jid_row_id"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "call_random_id"
            java.lang.String r16 = "TEXT"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "call_link_row_id"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            goto L_0x0891
        L_0x0e88:
            java.lang.String r15 = "lg"
            java.lang.String r16 = "TEXT"
            java.lang.String r17 = "PaymentBackgroundTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "media_key"
            java.lang.String r22 = "BLOB"
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "media_key_timestamp"
            java.lang.String r22 = "INTEGER"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "file_sha256"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "file_enc_sha256"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "direct_path"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x084a
        L_0x0eb8:
            java.lang.String r15 = "service_id"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "PayTransactionTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "background_id"
            java.lang.String r22 = "TEXT"
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "purchase_initiator"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0836
        L_0x0ed8:
            java.lang.String r15 = "init_timestamp"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "PayTransactionLegacyTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "request_key_id"
            java.lang.String r22 = "TEXT"
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "country"
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "version"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r26 = "future_data"
            java.lang.String r27 = "BLOB"
            r23 = r12
            r24 = r13
            r25 = r14
            r28 = r17
            X.C33961jT.A02(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "service_id"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r21 = "background_id"
            r23 = r17
            X.C33961jT.A02(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "purchase_initiator"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x081b
        L_0x0f1e:
            if (r31 == 0) goto L_0x0f31
            java.lang.String r3 = "messages_links"
            java.lang.String r3 = X.C33961jT.A00(r12, r0, r3)     // Catch:{ all -> 0x1221 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1221 }
            if (r3 == 0) goto L_0x0f31
            java.lang.String r3 = "CREATE TABLE messages_links (_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT, message_row_id INTEGER, link_index INTEGER)"
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x0f31:
            java.lang.String r4 = "links_ready"
            r3 = 0
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0f42 }
            java.lang.String r3 = X.C33971jU.A00(r12, r4, r3)     // Catch:{ NumberFormatException -> 0x0f42 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0f42 }
            if (r3 != 0) goto L_0x0f45
        L_0x0f42:
            X.C33971jU.A02(r12, r4, r6, r1)     // Catch:{ all -> 0x1221 }
        L_0x0f45:
            java.lang.String r14 = "user_device_info"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0f9c
            java.lang.String r1 = "CREATE TABLE user_device_info (user_jid_row_id INTEGER PRIMARY KEY, raw_id INTEGER NOT NULL, timestamp INTEGER NOT NULL, expected_timestamp INTEGER NOT NULL, expected_ts_last_device_job_ts INTEGER NOT NULL, expected_timestamp_update_ts INTEGER NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0f57:
            java.lang.String r1 = "message_privacy_state"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0f68
            java.lang.String r1 = "CREATE TABLE message_privacy_state (message_row_id INTEGER NOT NULL PRIMARY KEY, host_storage INTEGER, actual_actors INTEGER, privacy_mode_ts INTEGER NOT NULL, business_name TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0f68:
            java.lang.String r1 = "played_self_receipt"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0f79
            java.lang.String r1 = "CREATE TABLE played_self_receipt(message_row_id INTEGER PRIMARY KEY, to_jid_row_id INTEGER NOT NULL, participant_jid_row_id INTEGER, message_id TEXT NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0f79:
            java.lang.String r1 = "message_payment_invite"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0f8a
            java.lang.String r1 = "CREATE TABLE message_payment_invite (message_row_id INTEGER PRIMARY KEY, service INTEGER, expiration_timestamp INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0f8a:
            java.lang.String r1 = "message_quoted_payment_invite"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0fb0
            java.lang.String r1 = "CREATE TABLE message_quoted_payment_invite (message_row_id INTEGER PRIMARY KEY, service INTEGER, expiration_timestamp INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            goto L_0x0fb0
        L_0x0f9c:
            java.lang.String r15 = "expected_timestamp"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "UserDeviceInfoTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "expected_ts_last_device_job_ts"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "expected_timestamp_update_ts"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x0f57
        L_0x0fb0:
            if (r31 == 0) goto L_0x0fc3
            java.lang.String r1 = "messages_quotes_payment_invite_legacy"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0fc3
            java.lang.String r1 = "CREATE TABLE messages_quotes_payment_invite_legacy (message_row_id INTEGER PRIMARY KEY, service INTEGER, expiration_timestamp INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0fc3:
            java.lang.String r1 = "message_system_payment_invite_setup"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0fd4
            java.lang.String r1 = "CREATE TABLE message_system_payment_invite_setup(message_row_id INTEGER PRIMARY KEY, service INTEGER, invite_used INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0fd4:
            java.lang.String r1 = "message_quoted_blank_reply"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x0fe5
            java.lang.String r1 = "CREATE TABLE message_quoted_blank_reply (message_row_id INTEGER PRIMARY KEY, parent_group_jid TEXT, group_subject  TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x0fe5:
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r5 = "conversion_tuples"
            java.lang.String r4 = X.C33961jT.A00(r12, r0, r5)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = "CREATE TABLE conversion_tuples (jid_row_id INTEGER PRIMARY KEY, data TEXT, source TEXT, biz_count INTEGER, has_user_sent_last_message BOOLEAN, last_interaction INTEGER)"
            if (r1 != 0) goto L_0x1008
            java.lang.String r2 = "biz_count"
            java.lang.String r1 = "INTEGER"
            boolean r1 = X.C33961jT.A03(r4, r2, r1)     // Catch:{ all -> 0x1221 }
            if (r1 != 0) goto L_0x100b
            X.C34021jZ.A00(r5)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "DROP TABLE IF EXISTS conversion_tuples"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x1008:
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x100b:
            java.lang.String r14 = "labels"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x120a
            java.lang.String r1 = "CREATE TABLE labels (_id INTEGER PRIMARY KEY AUTOINCREMENT, label_name TEXT, predefined_id INTEGER, color_id INTEGER)"
        L_0x1019:
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x101c:
            java.lang.String r1 = "labeled_jid"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x102d
            java.lang.String r1 = "CREATE TABLE labeled_jid (_id INTEGER PRIMARY KEY AUTOINCREMENT, label_id INTEGER NOT NULL, jid_row_id INTEGER NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x102d:
            java.lang.String r1 = "labeled_jids"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x103e
            java.lang.String r1 = "CREATE TABLE labeled_jids (_id INTEGER PRIMARY KEY AUTOINCREMENT, label_id INTEGER NOT NULL, jid TEXT)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x103e:
            java.lang.String r1 = "labeled_messages_fts"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x104f
            java.lang.String r1 = "CREATE VIRTUAL TABLE labeled_messages_fts USING FTS3()"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x104f:
            java.lang.String r1 = "labeled_messages"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x1060
            java.lang.String r1 = X.C34041jb.A00     // Catch:{ all -> 0x1221 }
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x1060:
            java.lang.String r1 = "away_messages"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x1071
            java.lang.String r1 = "CREATE TABLE away_messages (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT UNIQUE NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x1071:
            java.lang.String r14 = "agent_devices"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            java.lang.String r3 = "CREATE TABLE IF NOT EXISTS agent_devices (agent_id TEXT PRIMARY KEY NOT NULL,agent_name TEXT UNIQUE NOT NULL,device INTEGER,last_modified_time INTEGER,is_deleted BOOLEAN );"
            if (r1 != 0) goto L_0x108e
            java.lang.String r2 = "agent_name"
            java.lang.String r1 = "TEXT UNIQUE NOT NULL"
            boolean r1 = X.C33961jT.A03(r13, r2, r1)     // Catch:{ all -> 0x1221 }
            if (r1 != 0) goto L_0x11ff
            java.lang.String r1 = "DROP TABLE IF EXISTS agent_devices"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x108e:
            r12.A0B(r3)     // Catch:{ all -> 0x1221 }
        L_0x1091:
            java.lang.String r1 = "agent_message_attribution"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x10a2
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS agent_message_attribution (message_row_id INTEGER PRIMARY KEY, agent_id TEXT NOT NULL);"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x10a2:
            java.lang.String r14 = "agent_chat_assignment"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x11f4
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS agent_chat_assignment (jid_row_id INTEGER PRIMARY KEY, agent_id TEXT NOT NULL, is_opened BOOLEAN );"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x10b3:
            java.lang.String r14 = "message_system_chat_assignment"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x11e9
            java.lang.String r1 = "CREATE TABLE message_system_chat_assignment(message_row_id INTEGER PRIMARY KEY, agent_name TEXT, is_unassigned_chat INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x10c4:
            java.lang.String r1 = "quick_replies"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x10d5
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS quick_replies (_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT UNIQUE NOT NULL, content TEXT NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x10d5:
            java.lang.String r1 = "quick_reply_usage"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x10e6
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS quick_reply_usage (_id INTEGER PRIMARY KEY AUTOINCREMENT, quick_reply_id TEXT NOT NULL, usage_date DATE, usage_count INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x10e6:
            java.lang.String r1 = "quick_reply_keywords"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x10f7
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS quick_reply_keywords (_id INTEGER PRIMARY KEY AUTOINCREMENT, quick_reply_id TEXT NOT NULL, keyword_id TEXT NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x10f7:
            java.lang.String r1 = "keywords"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x1108
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS keywords (_id INTEGER PRIMARY KEY AUTOINCREMENT, keyword TEXT UNIQUE NOT NULL)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x1108:
            java.lang.String r1 = "quick_reply_attachments"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x1119
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS quick_reply_attachments(_id INTEGER PRIMARY KEY AUTOINCREMENT, quick_reply_id TEXT NOT NULL, uri TEXT NOT NULL, caption TEXT, media_type INTEGER)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x1119:
            java.lang.String r1 = "message_invoice"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x112a
            java.lang.String r1 = "CREATE TABLE message_invoice (message_row_id INTEGER PRIMARY KEY,wa_invoice_id TEXT NOT NULL,amount TEXT NOT NULL,note TEXT NOT NULL,token TEXT,sender_jid_row_id INTEGER,receiver_jid_row_id INTEGER,status INTEGER,status_ts INTEGER,creation_ts INTEGER,attachment_type INTEGER,attachment_mimetype TEXT,attachment_media_key BLOB,attachment_media_key_ts INTEGER,attachment_file_sha256 BLOB,attachment_file_enc_sha256 BLOB,attachment_direct_path TEXT,attachment_jpeg_thumbnail BLOB,metadata TEXT);"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x112a:
            java.lang.String r1 = "message_quote_invoice"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x113b
            java.lang.String r1 = "CREATE TABLE message_quote_invoice (message_row_id INTEGER PRIMARY KEY,amount TEXT NOT NULL,note TEXT NOT NULL,status INTEGER,attachment_jpeg_thumbnail BLOB);"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x113b:
            java.lang.String r1 = "invoice_transactions"
            java.lang.String r1 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x114c
            java.lang.String r1 = "CREATE TABLE invoice_transactions (message_row_id INTEGER PRIMARY KEY,pay_transaction_id INTEGER);"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x114c:
            java.lang.String r2 = "message_view_once_media"
            java.lang.String r1 = "CREATE TABLE message_view_once_media (message_row_id INTEGER PRIMARY KEY, state INTEGER NOT NULL )"
            A02(r12, r2, r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "DROP INDEX IF EXISTS message_view_once_index"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "DROP TABLE IF EXISTS message_view_once"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r2 = "MessageViewOnceTable"
            java.lang.String r1 = "message_quoted_view_once_media"
            X.C33961jT.A01(r12, r2, r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r1 = "message_quoted_view_once_media_legacy"
            X.C33961jT.A01(r12, r2, r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "message_ephemeral"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x11df
            java.lang.String r1 = "CREATE TABLE message_ephemeral(message_row_id INTEGER PRIMARY KEY, duration INTEGER NOT NULL, expire_timestamp INTEGER NOT NULL, keep_in_chat INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x117a:
            java.lang.String r14 = "message_ephemeral_setting"
            java.lang.String r1 = "CREATE TABLE message_ephemeral_setting (message_row_id INTEGER PRIMARY KEY, setting_duration INTEGER, setting_reason INTEGER, user_jid_row_id_csv TEXT)"
            A02(r12, r14, r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "setting_reason"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "MessageEphemeralSettingTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "user_jid_row_id_csv"
            java.lang.String r16 = "TEXT"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r2 = "message_system_ephemeral_setting_not_applied"
            java.lang.String r1 = "CREATE TABLE message_system_ephemeral_setting_not_applied(message_row_id INTEGER PRIMARY KEY, setting_duration INTEGER)"
            A02(r12, r2, r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r2 = "message_broadcast_ephemeral"
            java.lang.String r1 = "CREATE TABLE message_broadcast_ephemeral (message_row_id INTEGER PRIMARY KEY, shared_secret BLOB NOT NULL )"
            A02(r12, r2, r1)     // Catch:{ all -> 0x1221 }
            java.lang.String r2 = "message_ephemeral_sync_response"
            java.lang.String r1 = "CREATE TABLE message_ephemeral_sync_response(chat_jid TEXT PRIMARY KEY NOT NULL, last_sync_response_sent_timestamp INTEGER NOT NULL, no_of_retries_sent_already INTEGER NOT NULL DEFAULT 0)"
            A02(r12, r2, r1)     // Catch:{ all -> 0x1221 }
            r7.A00()     // Catch:{ all -> 0x1221 }
            java.lang.String r14 = "message_status_psa_campaign"
            java.lang.String r13 = X.C33961jT.A00(r12, r0, r14)     // Catch:{ all -> 0x1221 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x11d2
            java.lang.String r1 = "CREATE TABLE message_status_psa_campaign (message_row_id INTEGER PRIMARY KEY, campaign_id TEXT , duration INTEGER, first_seen_timestamp INTEGER, action_link_url TEXT , action_link_button_title TEXT )"
            r12.A0B(r1)     // Catch:{ all -> 0x1221 }
        L_0x11c0:
            java.lang.String r1 = "call_link"
            java.lang.String r0 = X.C33961jT.A00(r12, r0, r1)     // Catch:{ all -> 0x1221 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x1221 }
            if (r0 == 0) goto L_0x1220
            java.lang.String r0 = "CREATE TABLE call_link (_id INTEGER PRIMARY KEY AUTOINCREMENT, token TEXT NOT NULL, creator_jid_row_id INTEGER NOT NULL DEFAULT 0)"
            r12.A0B(r0)     // Catch:{ all -> 0x1221 }
            goto L_0x121f
        L_0x11d2:
            java.lang.String r15 = "action_link_url"
            java.lang.String r17 = "MessageStatusPsaCampaignTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "action_link_button_title"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x11c0
        L_0x11df:
            java.lang.String r15 = "keep_in_chat"
            java.lang.String r16 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r17 = "MessageEphemeralTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x117a
        L_0x11e9:
            java.lang.String r15 = "is_unassigned_chat"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "MessageSystemChatAssignmentTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x10c4
        L_0x11f4:
            java.lang.String r15 = "is_opened"
            java.lang.String r16 = "BOOLEAN"
            java.lang.String r17 = "AgentChatAssignmentTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x10b3
        L_0x11ff:
            java.lang.String r15 = "is_deleted"
            java.lang.String r16 = "BOOLEAN"
            java.lang.String r17 = "AgentDevicesTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            goto L_0x1091
        L_0x120a:
            java.lang.String r15 = "predefined_id"
            java.lang.String r16 = "INTEGER"
            java.lang.String r17 = "LabelsTable"
            X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            java.lang.String r15 = "color_id"
            boolean r1 = X.C33961jT.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x1221 }
            if (r1 == 0) goto L_0x101c
            java.lang.String r1 = "UPDATE labels SET color_id = (_id % 20);"
            goto L_0x1019
        L_0x121f:
            return
        L_0x1220:
            return
        L_0x1221:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33811jC.A0B(X.0tg, boolean):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C16810tg r19, boolean r20, boolean r21) {
        /*
            r18 = this;
            X.1jc r17 = X.C34051jc.A00
            java.util.TreeMap r16 = new java.util.TreeMap
            r1 = r16
            r0 = r17
            r1.<init>(r0)
            r4 = r19
            java.lang.String r1 = "select name, sql from sqlite_master where type='trigger';"
            r0 = 0
            android.database.Cursor r6 = r4.A08(r1, r0)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r0 = "name"
            int r5 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "sql"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003a }
        L_0x0022:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0036
            java.lang.String r2 = r6.getString(r5)     // Catch:{ all -> 0x003a }
            java.lang.String r1 = r6.getString(r3)     // Catch:{ all -> 0x003a }
            r0 = r16
            r0.put(r2, r1)     // Catch:{ all -> 0x003a }
            goto L_0x0022
        L_0x0036:
            r6.close()     // Catch:{ Exception -> 0x0041 }
            goto L_0x0047
        L_0x003a:
            r0 = move-exception
            if (r6 == 0) goto L_0x0040
            r6.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/onCreate/dropTriggers"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0047:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r20
            if (r21 == 0) goto L_0x00c6
            java.lang.String r5 = "message"
            java.lang.String r7 = "messages"
            r3 = r7
            if (r20 == 0) goto L_0x0059
            r3 = r5
            r5 = r7
        L_0x0059:
            java.lang.String r0 = "_id=old._id"
            android.util.Pair r0 = A00(r3, r5, r0)
            r1.add(r0)
            java.lang.String r0 = "messages_vcards"
            java.lang.String r5 = "message_row_id=old._id"
            android.util.Pair r0 = A01(r0, r5, r2)
            r1.add(r0)
            java.lang.String r0 = "messages_links"
            android.util.Pair r0 = A01(r0, r5, r2)
            r1.add(r0)
            java.lang.String r3 = "receipts"
            java.lang.String r0 = "key_remote_jid=old.key_remote_jid AND key_id=old.key_id"
            android.util.Pair r0 = A00(r7, r3, r0)
            r1.add(r0)
            java.lang.String r6 = "message_vcard"
            java.lang.String r3 = "messages_vcards_jids"
            java.lang.String r0 = "message_row_id = old.message_row_id"
            android.util.Pair r0 = A00(r6, r3, r0)
            r1.add(r0)
            java.lang.String r3 = "messages_quotes"
            java.lang.String r0 = "_id=old.quoted_row_id"
            android.util.Pair r0 = A00(r7, r3, r0)
            r1.add(r0)
            java.lang.String r0 = "message_quoted_group_invite_legacy"
            android.util.Pair r0 = A00(r3, r0, r5)
            r1.add(r0)
            java.lang.String r0 = "message_quoted_ui_elements_reply_legacy"
            android.util.Pair r0 = A00(r3, r0, r5)
            r1.add(r0)
            java.lang.String r0 = "quoted_message_product"
            android.util.Pair r0 = A00(r3, r0, r5)
            r1.add(r0)
            java.lang.String r0 = "quoted_message_order"
            android.util.Pair r0 = A00(r3, r0, r5)
            r1.add(r0)
            java.lang.String r0 = "messages_quotes_payment_invite_legacy"
            android.util.Pair r0 = A00(r3, r0, r5)
            r1.add(r0)
        L_0x00c6:
            java.lang.String r0 = "messages_hydrated_four_row_template"
            java.lang.String r13 = "message_row_id=old._id"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_product"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_group_invite"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_order"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r3 = "message_template"
            android.util.Pair r0 = A01(r3, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_template_button"
            java.lang.String r10 = "message_row_id=old.message_row_id"
            android.util.Pair r0 = A00(r3, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_location"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r12 = "message_media"
            android.util.Pair r0 = A01(r12, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "receipt_user"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "receipt_device"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "played_self_receipt"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_mentions"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r15 = "message_vcard"
            android.util.Pair r0 = A01(r15, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_streaming_sidecar"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "mms_thumbnail_metadata"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "audio_data"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_broadcast_ephemeral"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_privacy_state"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r11 = "missed_call_logs"
            android.util.Pair r0 = A01(r11, r13, r2)
            r1.add(r0)
            java.lang.String r3 = "message_link"
            android.util.Pair r0 = A01(r3, r13, r2)
            r1.add(r0)
            java.lang.String r6 = "chat"
            java.lang.String r5 = "chat_row_id=old._id"
            android.util.Pair r0 = A00(r6, r3, r5)
            r1.add(r0)
            java.lang.String r0 = "message_forwarded"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_thumbnail"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_text"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_revoked"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_rating"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_future"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_send_count"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r7 = "message_system"
            android.util.Pair r0 = A01(r7, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "agent_message_attribution"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_external_ad_content"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_ui_elements"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_ui_elements_reply"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_view_once_media"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r3 = "labeled_messages"
            android.util.Pair r0 = A01(r3, r13, r2)
            r1.add(r0)
            java.lang.String r9 = "labels"
            java.lang.String r8 = "label_id=old._id"
            android.util.Pair r0 = A00(r9, r3, r8)
            r1.add(r0)
            java.lang.String r0 = "message_ephemeral"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_ephemeral_setting"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_status_psa_campaign"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "labeled_messages_fts"
            java.lang.String r3 = "docid=old._id"
            android.util.Pair r0 = A01(r0, r3, r2)
            r1.add(r0)
            java.lang.String r0 = "message_payment_invite"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r14 = "message_media_interactive_annotation"
            android.util.Pair r0 = A00(r12, r14, r10)
            r1.add(r0)
            java.lang.String r0 = "message_media_vcard_count"
            android.util.Pair r0 = A00(r12, r0, r10)
            r1.add(r0)
            java.lang.String r12 = "message_vcard_jid"
            java.lang.String r0 = "vcard_row_id=old._id"
            android.util.Pair r0 = A00(r15, r12, r0)
            r1.add(r0)
            android.util.Pair r0 = A01(r12, r13, r2)
            r1.add(r0)
            java.lang.String r12 = "message_media_interactive_annotation_vertex"
            java.lang.String r0 = "message_media_interactive_annotation_row_id=old._id"
            android.util.Pair r0 = A00(r14, r12, r0)
            r1.add(r0)
            java.lang.String r14 = "payment_background"
            java.lang.String r12 = "payment_background_order"
            java.lang.String r0 = "background_id=old.background_id"
            android.util.Pair r0 = A00(r14, r12, r0)
            r1.add(r0)
            java.lang.String r14 = "message_add_on"
            java.lang.String r0 = "parent_message_row_id=old._id"
            android.util.Pair r0 = A01(r14, r0, r2)
            r1.add(r0)
            java.lang.String r12 = "message_add_on_orphan"
            java.lang.String r0 = "parent_chat_row_id=old._id"
            android.util.Pair r0 = A00(r6, r12, r0)
            r1.add(r0)
            java.lang.String r0 = "message_add_on_receipt_device"
            java.lang.String r12 = "message_add_on_row_id=old._id"
            android.util.Pair r0 = A00(r14, r0, r12)
            r1.add(r0)
            java.lang.String r0 = "message_add_on_reaction"
            android.util.Pair r0 = A00(r14, r0, r12)
            r1.add(r0)
            java.lang.String r15 = "message_poll"
            android.util.Pair r0 = A01(r15, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_poll_option"
            android.util.Pair r0 = A00(r15, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_add_on_poll_vote"
            android.util.Pair r0 = A00(r14, r0, r12)
            r1.add(r0)
            java.lang.String r0 = "message_add_on_poll_vote_selected_option"
            android.util.Pair r0 = A00(r14, r0, r12)
            r1.add(r0)
            java.lang.String r0 = "message_add_on_keep_in_chat"
            android.util.Pair r0 = A00(r14, r0, r12)
            r1.add(r0)
            java.lang.String r0 = "message_secret"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_details"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_edit_info"
            android.util.Pair r0 = A01(r0, r13, r2)
            r1.add(r0)
            java.lang.String r14 = "message_row_id=old."
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r12 = "message_row_id"
            r0.append(r12)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "message_system_block_contact"
            android.util.Pair r0 = A00(r7, r0, r15)
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r12)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "message_system_ephemeral_setting_not_applied"
            android.util.Pair r0 = A00(r7, r0, r15)
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r12)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "message_system_chat_participant"
            android.util.Pair r0 = A00(r7, r0, r15)
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r12)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "message_system_device_change"
            android.util.Pair r0 = A00(r7, r0, r15)
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r12)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "message_system_initial_privacy_provider"
            android.util.Pair r0 = A00(r7, r0, r15)
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r12)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "message_system_group"
            android.util.Pair r0 = A00(r7, r0, r15)
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r12)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "message_system_number_change"
            android.util.Pair r0 = A00(r7, r0, r15)
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r12)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "message_system_photo_change"
            android.util.Pair r0 = A00(r7, r0, r15)
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r12)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "message_system_value_change"
            android.util.Pair r0 = A00(r7, r0, r15)
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r12)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "message_payment"
            android.util.Pair r0 = A00(r7, r0, r15)
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r12)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "message_payment_transaction_reminder"
            android.util.Pair r0 = A00(r7, r0, r15)
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "message_payment_status_update"
            android.util.Pair r0 = A00(r7, r0, r12)
            r1.add(r0)
            java.lang.String r0 = "message_system_business_state"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_system_payment_invite_setup"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_system_linked_group_call"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_system_sibling_group_link_change"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_system_with_group_nodes"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_system_community_link_changed"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_system_group_with_parent"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_system_chat_assignment"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r7 = "message_quoted"
            android.util.Pair r0 = A01(r7, r13, r2)
            r1.add(r0)
            java.lang.String r0 = "message_quoted_group_invite"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_quoted_location"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_quoted_media"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r12 = "message_quoted_mentions"
            java.lang.String r0 = "message_row_id = old.message_row_id"
            android.util.Pair r0 = A00(r7, r12, r0)
            r1.add(r0)
            java.lang.String r14 = "message_quoted_product"
            if (r20 == 0) goto L_0x0549
            r12 = r7
            r0 = r10
        L_0x046d:
            android.util.Pair r0 = A00(r12, r14, r0)
            r1.add(r0)
            java.lang.String r14 = "message_quoted_order"
            if (r20 == 0) goto L_0x0544
            r12 = r7
            r0 = r10
        L_0x047a:
            android.util.Pair r0 = A00(r12, r14, r0)
            r1.add(r0)
            java.lang.String r0 = "message_quoted_text"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_quoted_vcard"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r14 = "message_quoted_ui_elements"
            if (r20 == 0) goto L_0x053f
            r12 = r7
            r0 = r10
        L_0x0499:
            android.util.Pair r0 = A00(r12, r14, r0)
            r1.add(r0)
            if (r20 == 0) goto L_0x04ab
            java.lang.String r0 = "message_quoted_ui_elements_reply"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
        L_0x04ab:
            java.lang.String r12 = "message_template_quoted"
            if (r20 == 0) goto L_0x053b
            r0 = r7
            r13 = r10
        L_0x04b1:
            android.util.Pair r0 = A00(r0, r12, r13)
            r1.add(r0)
            java.lang.String r0 = "message_quoted_blank_reply"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r0 = "message_quoted_payment_invite"
            android.util.Pair r0 = A00(r7, r0, r10)
            r1.add(r0)
            java.lang.String r10 = "quick_replies"
            java.lang.String r0 = "quick_reply_usage"
            java.lang.String r7 = "quick_reply_id=old._id"
            android.util.Pair r0 = A00(r10, r0, r7)
            r1.add(r0)
            java.lang.String r0 = "quick_reply_keywords"
            android.util.Pair r0 = A00(r10, r0, r7)
            r1.add(r0)
            java.lang.String r0 = "quick_reply_attachments"
            android.util.Pair r0 = A00(r10, r0, r7)
            r1.add(r0)
            java.lang.String r10 = "group_participant_user"
            java.lang.String r7 = "group_participant_device"
            java.lang.String r0 = "group_participant_row_id=old._id"
            android.util.Pair r0 = A00(r10, r7, r0)
            r1.add(r0)
            java.lang.String r0 = "missed_call_log_participant"
            java.lang.String r7 = "call_logs_row_id=old._id"
            android.util.Pair r0 = A00(r11, r0, r7)
            r1.add(r0)
            java.lang.String r0 = "labeled_jid"
            android.util.Pair r0 = A00(r9, r0, r8)
            r1.add(r0)
            java.lang.String r0 = "labeled_jids"
            android.util.Pair r0 = A00(r9, r0, r8)
            r1.add(r0)
            java.lang.String r0 = "community_chat"
            android.util.Pair r0 = A00(r6, r0, r5)
            r1.add(r0)
            java.util.TreeMap r6 = new java.util.TreeMap
            r0 = r17
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x0527:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x054e
            java.lang.Object r0 = r5.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            r6.put(r1, r0)
            goto L_0x0527
        L_0x053b:
            java.lang.String r0 = "messages_quotes"
            goto L_0x04b1
        L_0x053f:
            java.lang.String r12 = "messages_quotes"
            r0 = r13
            goto L_0x0499
        L_0x0544:
            java.lang.String r12 = "messages_quotes"
            r0 = r13
            goto L_0x047a
        L_0x0549:
            java.lang.String r12 = "messages_quotes"
            r0 = r13
            goto L_0x046d
        L_0x054e:
            java.lang.String r1 = "call_logs"
            java.lang.String r5 = "table"
            java.lang.String r0 = X.C33961jT.A00(r4, r5, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x056a
            java.lang.String r0 = "call_log_participant"
            android.util.Pair r0 = A00(r1, r0, r7)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            r6.put(r1, r0)
        L_0x056a:
            java.lang.String r8 = "call_log"
            java.lang.String r0 = "call_log_participant_v2"
            java.lang.String r7 = "call_log_row_id=old._id"
            android.util.Pair r0 = A00(r8, r0, r7)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            r6.put(r1, r0)
            java.lang.String r0 = "joinable_call_log"
            android.util.Pair r0 = A00(r8, r0, r7)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            r6.put(r1, r0)
            java.lang.String r1 = "messages_fts"
            java.lang.String r0 = X.C33961jT.A00(r4, r5, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x059f
            android.util.Pair r0 = A01(r1, r3, r2)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            r6.put(r1, r0)
        L_0x059f:
            java.lang.String r1 = "message_ftsv2"
            java.lang.String r0 = X.C33961jT.A00(r4, r5, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05b6
            android.util.Pair r0 = A01(r1, r3, r2)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            r6.put(r1, r0)
        L_0x05b6:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Set r0 = r16.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x05c8:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0620
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r9 = r0.getKey()
            java.lang.Object r1 = r6.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            r12 = 0
            r8 = 1
            java.lang.String r7 = "DROP TRIGGER %s;"
            if (r1 == 0) goto L_0x0614
            java.lang.Object r11 = r0.getValue()
            java.lang.String r11 = (java.lang.String) r11
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r1.toLowerCase(r0)
            java.lang.String r5 = "\\s*"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.replaceAll(r5, r2)
            if (r11 != 0) goto L_0x0607
            r0 = 0
        L_0x05fd:
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0614
            r10.add(r9)
            goto L_0x05c8
        L_0x0607:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r11.toLowerCase(r0)
            java.lang.String r0 = r0.replaceAll(r5, r2)
            goto L_0x05fd
        L_0x0614:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r12] = r9
            java.lang.String r0 = java.lang.String.format(r7, r0)
            r3.add(r0)
            goto L_0x05c8
        L_0x0620:
            java.util.Iterator r1 = r10.iterator()
        L_0x0624:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0632
            java.lang.Object r0 = r1.next()
            r6.remove(r0)
            goto L_0x0624
        L_0x0632:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x063a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x064e
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            r3.add(r0)
            goto L_0x063a
        L_0x064e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0652:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x066f
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = "DatabaseHelper/createDatabaseTriggers/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.toString()
            r4.A0B(r2)
            goto L_0x0652
        L_0x066f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33811jC.A0C(X.0tg, boolean, boolean):void");
    }

    public boolean A0D(C16800tf r2) {
        return this.A0A != null ? this.A0A.booleanValue() : A0F(r2.A02);
    }

    public final boolean A0E(C16810tg r3) {
        if (this.A09 == null) {
            this.A09 = Boolean.valueOf(A03(r3));
        }
        return Boolean.TRUE.equals(this.A09);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (java.lang.Integer.parseInt(X.C33971jU.A00(r4, "write_to_old_schema_disabled", java.lang.String.valueOf(0))) == 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0F(X.C16810tg r4) {
        /*
            r3 = this;
            boolean r0 = A03(r4)
            if (r0 != 0) goto L_0x0011
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x0008:
            r3.A0A = r0
        L_0x000a:
            java.lang.Boolean r0 = r3.A0A
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0011:
            java.lang.String r2 = "write_to_old_schema_disabled"
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0023 }
            java.lang.String r0 = X.C33971jU.A00(r4, r2, r0)     // Catch:{ NumberFormatException -> 0x0023 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0023 }
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A0A = r0
            java.lang.Boolean r0 = r3.A0A
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x000a
            java.lang.String r1 = "messages"
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C33961jT.A00(r4, r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33811jC.A0F(X.0tg):boolean");
    }

    public boolean A0G(C16810tg r3, String str) {
        boolean z2;
        C33901jN r1 = this.A04;
        synchronized (r1) {
            z2 = r1.A00;
        }
        if (z2) {
            return false;
        }
        String str2 = "";
        if (!TextUtils.isEmpty(C33961jT.A00(r3, "table", "props"))) {
            str2 = C33971jU.A00(r3, str, str2);
        }
        return str2.equals(A0E(r3) ? "16a97243282ad6aeef26bb3f6206e710" : "19a1ded0107adbb404f8c085098d13d9");
    }

    public C33921jP AE6() {
        return this.A03;
    }

    public synchronized C16810tg AFO() {
        return AHC();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010f, code lost:
        if (r7 != false) goto L_0x0111;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C16810tg AHC() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.A02     // Catch:{ all -> 0x029f }
            if (r0 != 0) goto L_0x0299
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0015
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x029f }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0015
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            goto L_0x0260
        L_0x0015:
            java.lang.String r0 = "databasehelper/open-existing-db"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029f }
            r1.<init>(r0)     // Catch:{ all -> 0x029f }
            java.io.File r3 = r9.A07     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x029f }
            r1.append(r0)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x029f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = "msgstore/open-existing-db/list "
            X.AnonymousClass1XI.A0F(r3, r0)     // Catch:{ all -> 0x029f }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x029f }
            r7 = 0
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "databasehelper/open-existing-db/no-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = "Message store missing, no message store file"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029f }
            r1.<init>(r0)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x029f }
            r1.append(r0)     // Catch:{ all -> 0x029f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x029f }
            android.database.sqlite.SQLiteCantOpenDatabaseException r0 = new android.database.sqlite.SQLiteCantOpenDatabaseException     // Catch:{ all -> 0x029f }
            r0.<init>(r1)     // Catch:{ all -> 0x029f }
            r9.A05(r0)     // Catch:{ all -> 0x029f }
        L_0x0057:
            r9.close()     // Catch:{ all -> 0x029f }
            java.lang.String r1 = "Unable to open writable db: failed to open db"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x029f }
            r0.<init>(r1)     // Catch:{ all -> 0x029f }
            throw r0     // Catch:{ all -> 0x029f }
        L_0x0062:
            r6 = 0
            r5 = -1
            r4 = 0
        L_0x0065:
            r2 = 0
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r1 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            X.AnonymousClass00B.A06(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            X.11f r0 = r9.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            X.0tg r0 = X.C33931jQ.A01(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            r9.A00 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            X.AnonymousClass00B.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            int r5 = r0.getVersion()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            java.lang.String r0 = "databasehelper/open-existing-db/version "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            r1.append(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x009a }
            goto L_0x00bf
        L_0x009a:
            r4 = move-exception
            java.lang.String r0 = "databasehelper/open-existing-db/nodb/sqlerror"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029f }
            r1.<init>(r0)     // Catch:{ all -> 0x029f }
            if (r6 != 0) goto L_0x00a7
            java.lang.String r0 = "/will-retry "
            goto L_0x00a9
        L_0x00a7:
            java.lang.String r0 = " "
        L_0x00a9:
            r1.append(r0)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x029f }
            com.whatsapp.util.Log.w(r0, r4)     // Catch:{ all -> 0x029f }
            if (r6 <= 0) goto L_0x00b6
            goto L_0x00c7
        L_0x00b6:
            r4 = 1
            goto L_0x00c1
        L_0x00b8:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/open-existing-db/corrupt"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x029f }
            r5 = -1
        L_0x00bf:
            if (r4 == 0) goto L_0x00cf
        L_0x00c1:
            int r0 = r6 + 1
            if (r6 != 0) goto L_0x00cf
            r6 = r0
            goto L_0x0065
        L_0x00c7:
            java.lang.String r0 = "databasehelper/open-existing-db/stack"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029f }
            X.AnonymousClass01E.A00()     // Catch:{ all -> 0x029f }
        L_0x00cf:
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x00d7
            if (r5 <= 0) goto L_0x00d7
            r7 = 1
            goto L_0x00f1
        L_0x00d7:
            java.lang.String r0 = "Can't open message store file "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029f }
            r1.<init>(r0)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x029f }
            r1.append(r0)     // Catch:{ all -> 0x029f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x029f }
            android.database.sqlite.SQLiteCantOpenDatabaseException r0 = new android.database.sqlite.SQLiteCantOpenDatabaseException     // Catch:{ all -> 0x029f }
            r0.<init>(r1)     // Catch:{ all -> 0x029f }
            r9.A05(r0)     // Catch:{ all -> 0x029f }
        L_0x00f1:
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x010f
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x029f }
            boolean r0 = r0.isReadOnly()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0102
            java.lang.String r0 = "databasehelper/open-existing-db/ is read only"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x029f }
        L_0x0102:
            if (r7 != 0) goto L_0x0111
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x029f }
            r0.close()     // Catch:{ all -> 0x029f }
            r9.A00 = r2     // Catch:{ all -> 0x029f }
            goto L_0x0057
        L_0x010f:
            if (r7 == 0) goto L_0x0057
        L_0x0111:
            java.lang.String r1 = "databasehelper/canQueryDb"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x029f }
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0291
            X.1Zf r4 = new X.1Zf     // Catch:{ all -> 0x029f }
            r4.<init>((java.lang.String) r1)     // Catch:{ all -> 0x029f }
            java.lang.String r6 = "messages"
            java.lang.String r5 = "table"
            java.lang.String r0 = X.C33961jT.A00(r0, r5, r6)     // Catch:{ all -> 0x029f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0131
            java.lang.String r1 = "SELECT EXISTS (SELECT 1 FROM message LIMIT 1)"
            goto L_0x0133
        L_0x0131:
            java.lang.String r1 = "SELECT EXISTS (SELECT 1 FROM messages LIMIT 1)"
        L_0x0133:
            X.0tg r0 = r9.A00     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r1)     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            long r7 = r0.simpleQueryForLong()     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r7 = 0
            if (r0 < 0) goto L_0x0147
            r7 = 1
        L_0x0147:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            r2.<init>()     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            java.lang.String r0 = "databasehelper/canQueryDb "
            r2.append(r0)     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            r2.append(r7)     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            java.lang.String r0 = " | time spent:"
            r2.append(r0)     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            long r0 = r4.A01()     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            r2.append(r0)     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            java.lang.String r0 = r2.toString()     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDoneException -> 0x01b6, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017e, SQLiteException -> 0x016a }
            if (r7 == 0) goto L_0x01a6
            goto L_0x01cb
        L_0x016a:
            r2 = move-exception
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x029f }
            java.lang.String r0 = "file is encrypted"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x017d
            java.lang.String r0 = "databasehelper/canQueryDb/cursor/encrypted-file-error"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x029f }
            goto L_0x0184
        L_0x017d:
            throw r2     // Catch:{ all -> 0x029f }
        L_0x017e:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/canQueryDb/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x029f }
        L_0x0184:
            java.lang.String r0 = "databasehelper/canQueryDb/nocursor | time spent:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x029f }
            r2.<init>(r0)     // Catch:{ all -> 0x029f }
            long r0 = r4.A01()     // Catch:{ all -> 0x029f }
            r2.append(r0)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x029f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = "databasehelper/canQueryDb/deletedb"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029f }
            r3.delete()     // Catch:{ all -> 0x029f }
            java.lang.String r0 = "databasehelper"
            X.C33931jQ.A04(r3, r0)     // Catch:{ all -> 0x029f }
        L_0x01a6:
            r9.close()     // Catch:{ all -> 0x029f }
            java.lang.String r1 = "Unable to open writable db: failed to query db"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x029f }
            r0.<init>(r1)     // Catch:{ all -> 0x029f }
            throw r0     // Catch:{ all -> 0x029f }
        L_0x01b1:
            r0 = move-exception
            r9.A05(r0)     // Catch:{ all -> 0x029f }
            throw r0     // Catch:{ all -> 0x029f }
        L_0x01b6:
            java.lang.String r0 = "databasehelper/canQueryDb/noRow | time spent:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x029f }
            r2.<init>(r0)     // Catch:{ all -> 0x029f }
            long r0 = r4.A01()     // Catch:{ all -> 0x029f }
            r2.append(r0)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x029f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029f }
        L_0x01cb:
            java.lang.String r0 = "databasehelper/canUpdateDb"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029f }
            X.1Zf r4 = new X.1Zf     // Catch:{ all -> 0x029f }
            r4.<init>((java.lang.String) r0)     // Catch:{ all -> 0x029f }
            X.0tg r0 = r9.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            if (r0 == 0) goto L_0x0216
            java.lang.String r0 = X.C33961jT.A00(r0, r5, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            if (r0 == 0) goto L_0x0211
            java.lang.String r1 = "UPDATE message SET receipt_server_timestamp = -1 WHERE _id = 1"
        L_0x01e5:
            X.0tg r0 = r9.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            X.0tg r0 = r9.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            r0.A0B(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            X.0tg r0 = r9.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            r2.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            java.lang.String r0 = "databasehelper/canUpdateDb | time spent:"
            r2.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            long r0 = r4.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            r2.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            java.lang.String r0 = r2.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            goto L_0x0214
        L_0x0211:
            java.lang.String r1 = "UPDATE messages SET send_timestamp = -1 WHERE _id = 1"
            goto L_0x01e5
        L_0x0214:
            r1 = 1
            goto L_0x0237
        L_0x0216:
            java.lang.String r1 = "databasehelper/canUpdateDb/database is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            r0.<init>(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228, SQLiteFullException -> 0x0223, SQLiteException -> 0x021e }
        L_0x021e:
            r0 = move-exception
            r9.A05(r0)     // Catch:{ all -> 0x0276 }
            goto L_0x0227
        L_0x0223:
            r0 = move-exception
            r9.A05(r0)     // Catch:{ all -> 0x0276 }
        L_0x0227:
            throw r0     // Catch:{ all -> 0x0276 }
        L_0x0228:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/canUpdateDb/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0276 }
            r3.delete()     // Catch:{ all -> 0x0276 }
            java.lang.String r0 = "databasehelper"
            X.C33931jQ.A04(r3, r0)     // Catch:{ all -> 0x0276 }
            r1 = 0
        L_0x0237:
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x024a
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x029f }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x024a
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x029f }
            r0.endTransaction()     // Catch:{ all -> 0x029f }
        L_0x024a:
            if (r1 == 0) goto L_0x026b
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            r9.A09(r0)     // Catch:{ all -> 0x029f }
            r9.A04()     // Catch:{ SQLiteException -> 0x0264 }
            X.0tg r0 = r9.A00     // Catch:{ SQLiteException -> 0x0262 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteException -> 0x0262 }
            r9.onOpen(r0)     // Catch:{ SQLiteException -> 0x0262 }
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x029f }
        L_0x0260:
            monitor-exit(r9)
            return r0
        L_0x0262:
            r1 = move-exception
            goto L_0x028b
        L_0x0264:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getWritableLoggableDatabase/prepare"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x029f }
            goto L_0x0290
        L_0x026b:
            r9.close()     // Catch:{ all -> 0x029f }
            java.lang.String r1 = "Unable to open writable db: failed to update db"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x029f }
            r0.<init>(r1)     // Catch:{ all -> 0x029f }
            throw r0     // Catch:{ all -> 0x029f }
        L_0x0276:
            r1 = move-exception
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0290
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x029f }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0290
            X.0tg r0 = r9.A00     // Catch:{ all -> 0x029f }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x029f }
            r0.endTransaction()     // Catch:{ all -> 0x029f }
            goto L_0x0290
        L_0x028b:
            java.lang.String r0 = "msgstore/getWritableLoggableDatabase/onopen"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x029f }
        L_0x0290:
            throw r1     // Catch:{ all -> 0x029f }
        L_0x0291:
            java.lang.String r1 = "databasehelper/canQueryDb/database is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x029f }
            r0.<init>(r1)     // Catch:{ all -> 0x029f }
            throw r0     // Catch:{ all -> 0x029f }
        L_0x0299:
            X.1jd r0 = new X.1jd     // Catch:{ all -> 0x029f }
            r0.<init>()     // Catch:{ all -> 0x029f }
            throw r0     // Catch:{ all -> 0x029f }
        L_0x029f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33811jC.AHC():X.0tg");
    }

    public synchronized void close() {
        C16810tg r0 = this.A00;
        if (r0 != null && r0.A00.isOpen()) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/close, ");
            sb.append(this.A00.A00);
            Log.i(sb.toString());
            this.A00.A00.close();
        }
        this.A00 = null;
        this.A01 = null;
    }

    @Deprecated
    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00B.A08("Use getReadableLoggableDatabase instead");
        return AFO().A00;
    }

    @Deprecated
    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00B.A08("Use getWritableLoggableDatabase instead");
        return AHC().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        synchronized (this) {
            C16810tg A012 = C33931jQ.A01(sQLiteDatabase, this.A05);
            try {
                IDxTListenerShape94S0200000_2_I0 iDxTListenerShape94S0200000_2_I0 = new IDxTListenerShape94S0200000_2_I0(this, 1, atomicBoolean);
                SQLiteDatabase sQLiteDatabase2 = A012.A00;
                sQLiteDatabase2.beginTransactionWithListener(iDxTListenerShape94S0200000_2_I0);
                Log.i("msgstore/create");
                C33961jT.A01(A012, "DatabaseHelper", "messages");
                C33961jT.A01(A012, "DatabaseHelper", "message");
                C33961jT.A01(A012, "DatabaseHelper", "chat_list");
                C33961jT.A01(A012, "DatabaseHelper", "props");
                C33961jT.A01(A012, "DatabaseHelper", "messages_fts");
                C33961jT.A01(A012, "DatabaseHelper", "message_ftsv2");
                C33961jT.A01(A012, "DatabaseHelper", "messages_quotes");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_vcard");
                C33961jT.A01(A012, "DatabaseHelper", "messages_dehydrated_hsm");
                C33961jT.A01(A012, "DatabaseHelper", "messages_hydrated_four_row_template");
                C33961jT.A01(A012, "DatabaseHelper", "messages_vcards");
                C33961jT.A01(A012, "DatabaseHelper", "messages_vcards_jids");
                C33961jT.A01(A012, "DatabaseHelper", "message_orphaned_edit");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_mentions");
                C33961jT.A01(A012, "DatabaseHelper", "messages_links");
                C33961jT.A01(A012, "DatabaseHelper", "message_product");
                C33961jT.A01(A012, "DatabaseHelper", "quoted_message_product");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_product");
                C33961jT.A01(A012, "DatabaseHelper", "message_order");
                C33961jT.A01(A012, "DatabaseHelper", "quoted_message_order");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_order");
                C33961jT.A01(A012, "DatabaseHelper", "message_group_invite");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_group_invite_legacy");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_group_invite");
                C33961jT.A01(A012, "DatabaseHelper", "message_template");
                C33961jT.A01(A012, "DatabaseHelper", "message_template_button");
                C33961jT.A01(A012, "DatabaseHelper", "message_template_quoted");
                C33961jT.A01(A012, "DatabaseHelper", "message_location");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_location");
                C33961jT.A01(A012, "DatabaseHelper", "message_media");
                C33961jT.A01(A012, "DatabaseHelper", "message_media_interactive_annotation");
                C33961jT.A01(A012, "DatabaseHelper", "message_media_interactive_annotation_vertex");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_media");
                C33961jT.A01(A012, "DatabaseHelper", "frequents");
                C33961jT.A01(A012, "DatabaseHelper", "frequent");
                C33961jT.A01(A012, "DatabaseHelper", "receipt_user");
                C33961jT.A01(A012, "DatabaseHelper", "receipt_device");
                C33961jT.A01(A012, "DatabaseHelper", "receipt_orphaned");
                C33961jT.A01(A012, "DatabaseHelper", "receipts");
                C33961jT.A01(A012, "DatabaseHelper", "message_mentions");
                C33961jT.A01(A012, "DatabaseHelper", "message_vcard");
                C33961jT.A01(A012, "DatabaseHelper", "message_media_vcard_count");
                C33961jT.A01(A012, "DatabaseHelper", "message_vcard_jid");
                C33961jT.A01(A012, "DatabaseHelper", "user_device");
                C33961jT.A01(A012, "DatabaseHelper", "group_participant_user");
                C33961jT.A01(A012, "DatabaseHelper", "group_participant_device");
                C33961jT.A01(A012, "DatabaseHelper", "group_participants");
                C33961jT.A01(A012, "DatabaseHelper", "group_participants_history");
                C33961jT.A01(A012, "DatabaseHelper", "group_notification_version");
                C33961jT.A01(A012, "DatabaseHelper", "media_refs");
                C33961jT.A01(A012, "DatabaseHelper", "media_streaming_sidecar");
                C33961jT.A01(A012, "DatabaseHelper", "message_thumbnails");
                C33961jT.A01(A012, "DatabaseHelper", "message_streaming_sidecar");
                C33961jT.A01(A012, "DatabaseHelper", "mms_thumbnail_metadata");
                C33961jT.A01(A012, "DatabaseHelper", "audio_data");
                C33961jT.A01(A012, "DatabaseHelper", "status_list");
                C33961jT.A01(A012, "DatabaseHelper", "status");
                C33961jT.A01(A012, "DatabaseHelper", "conversion_tuples");
                C33961jT.A01(A012, "DatabaseHelper", "deleted_chat_job");
                C33961jT.A01(A012, "DatabaseHelper", "pay_transactions");
                C33961jT.A01(A012, "DatabaseHelper", "pay_transaction");
                C33961jT.A01(A012, "DatabaseHelper", "payment_background");
                C33961jT.A01(A012, "DatabaseHelper", "payment_background_order");
                C33961jT.A01(A012, "DatabaseHelper", "message_ephemeral");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_linked_group_call");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_community_link_changed");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_group_with_parent");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_sibling_group_link_change");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_with_group_nodes");
                C33961jT.A01(A012, "DatabaseHelper", "call_log");
                C33961jT.A01(A012, "DatabaseHelper", "missed_call_logs");
                C33961jT.A01(A012, "DatabaseHelper", "missed_call_log_participant");
                C33961jT.A01(A012, "DatabaseHelper", "jid");
                C33961jT.A01(A012, "DatabaseHelper", "jid_map");
                C33961jT.A01(A012, "DatabaseHelper", "lid_display_name");
                C33961jT.A01(A012, "DatabaseHelper", "lid_chat_state");
                C33961jT.A01(A012, "DatabaseHelper", "chat");
                StringBuilder sb = new StringBuilder("DROP VIEW IF EXISTS ");
                sb.append("chat_view");
                String obj = sb.toString();
                C34021jZ.A01("DatabaseHelper", "dropViewIfExistsWithoutStatement", C34021jZ.A00("chat_view"));
                A012.A0B(obj);
                C33961jT.A01(A012, "DatabaseHelper", "message_link");
                C33961jT.A01(A012, "DatabaseHelper", "message_forwarded");
                C33961jT.A01(A012, "DatabaseHelper", "message_thumbnail");
                C33961jT.A01(A012, "DatabaseHelper", "message_text");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_text");
                C33961jT.A01(A012, "DatabaseHelper", "message_revoked");
                C33961jT.A01(A012, "DatabaseHelper", "message_rating");
                C33961jT.A01(A012, "DatabaseHelper", "message_future");
                C33961jT.A01(A012, "DatabaseHelper", "message_payment");
                C33961jT.A01(A012, "DatabaseHelper", "message_payment_transaction_reminder");
                C33961jT.A01(A012, "DatabaseHelper", "message_payment_status_update");
                C33961jT.A01(A012, "DatabaseHelper", "message_send_count");
                C33961jT.A01(A012, "DatabaseHelper", "message_system");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_group");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_value_change");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_number_change");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_device_change");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_initial_privacy_provider");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_photo_change");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_chat_participant");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_block_contact");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_business_state");
                C33961jT.A01(A012, "DatabaseHelper", "media_hash_thumbnail");
                C33961jT.A01(A012, "DatabaseHelper", "user_device_info");
                C33961jT.A01(A012, "DatabaseHelper", "played_self_receipt");
                C33961jT.A01(A012, "DatabaseHelper", "message_external_ad_content");
                C33961jT.A01(A012, "DatabaseHelper", "message_ui_elements");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_ui_elements");
                C33961jT.A01(A012, "DatabaseHelper", "message_ui_elements_reply");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_ui_elements_reply");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_ui_elements_reply_legacy");
                C33961jT.A01(A012, "DatabaseHelper", "message_privacy_state");
                C33961jT.A01(A012, "DatabaseHelper", "message_view_once_media");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_view_once_media");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_view_once_media_legacy");
                C33961jT.A01(A012, "DatabaseHelper", "message_broadcast_ephemeral");
                C33961jT.A01(A012, "DatabaseHelper", "message_ephemeral_setting");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_ephemeral_setting_not_applied");
                C33961jT.A01(A012, "DatabaseHelper", "labeled_jids");
                C33961jT.A01(A012, "DatabaseHelper", "labeled_messages");
                C33961jT.A01(A012, "DatabaseHelper", "labels");
                C33961jT.A01(A012, "DatabaseHelper", "labeled_jid");
                C33961jT.A01(A012, "DatabaseHelper", "away_messages");
                C33961jT.A01(A012, "DatabaseHelper", "away_messages_exemptions");
                C33961jT.A01(A012, "DatabaseHelper", "quick_replies");
                C33961jT.A01(A012, "DatabaseHelper", "quick_reply_usage");
                C33961jT.A01(A012, "DatabaseHelper", "quick_reply_keywords");
                C33961jT.A01(A012, "DatabaseHelper", "keywords");
                C33961jT.A01(A012, "DatabaseHelper", "quick_reply_attachments");
                C33961jT.A01(A012, "DatabaseHelper", "agent_devices");
                C33961jT.A01(A012, "DatabaseHelper", "agent_message_attribution");
                C33961jT.A01(A012, "DatabaseHelper", "agent_chat_assignment");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_chat_assignment");
                C33961jT.A01(A012, "DatabaseHelper", "message_payment_invite");
                C33961jT.A01(A012, "DatabaseHelper", "message_quoted_payment_invite");
                C33961jT.A01(A012, "DatabaseHelper", "messages_quotes_payment_invite_legacy");
                C33961jT.A01(A012, "DatabaseHelper", "message_system_payment_invite_setup");
                C33961jT.A01(A012, "DatabaseHelper", "message_status_psa_campaign");
                C33961jT.A01(A012, "DatabaseHelper", "message_add_on");
                C33961jT.A01(A012, "DatabaseHelper", "message_add_on_orphan");
                C33961jT.A01(A012, "DatabaseHelper", "message_add_on_receipt_device");
                C33961jT.A01(A012, "DatabaseHelper", "message_add_on_reaction");
                C33961jT.A01(A012, "DatabaseHelper", "message_poll");
                C33961jT.A01(A012, "DatabaseHelper", "message_poll_option");
                C33961jT.A01(A012, "DatabaseHelper", "message_add_on_poll_vote");
                C33961jT.A01(A012, "DatabaseHelper", "message_add_on_poll_vote_selected_option");
                C33961jT.A01(A012, "DatabaseHelper", "message_add_on_keep_in_chat");
                C33961jT.A01(A012, "DatabaseHelper", "message_secret");
                C33961jT.A01(A012, "DatabaseHelper", "community_chat");
                C33961jT.A01(A012, "DatabaseHelper", "parent_group_participants");
                C33961jT.A01(A012, "DatabaseHelper", "message_details");
                C33961jT.A01(A012, "DatabaseHelper", "message_edit_info");
                C33961jT.A01(A012, "DatabaseHelper", "message_ephemeral_sync_response");
                if (TextUtils.isEmpty(C33961jT.A00(A012, "table", "props"))) {
                    A012.A0B("CREATE TABLE props (_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT UNIQUE, value TEXT)");
                }
                C33971jU.A02(A012, "fts_ready", "DatabaseHelper", 5);
                C33971jU.A02(A012, "call_log_ready", "DatabaseHelper", 1);
                C33971jU.A02(A012, "chat_ready", "DatabaseHelper", 2);
                C33971jU.A02(A012, "blank_me_jid_ready", "DatabaseHelper", 1);
                C33971jU.A02(A012, "participant_user_ready", "DatabaseHelper", 2);
                C33971jU.A02(A012, "broadcast_me_jid_ready", "DatabaseHelper", 2);
                C33971jU.A02(A012, "receipt_user_ready", "DatabaseHelper", 2);
                C33971jU.A02(A012, "receipt_device_migration_complete", "DatabaseHelper", 1);
                C33971jU.A02(A012, "status_list_ready", "DatabaseHelper", 1);
                C33971jU.A01(A012, "message_streaming_sidecar_timestamp");
                C33971jU.A02(A012, "media_message_ready", "DatabaseHelper", 2);
                C33971jU.A02(A012, "media_message_fixer_ready", "DatabaseHelper", 3);
                C33971jU.A02(A012, "new_pay_transaction_ready", "DatabaseHelper", 1);
                if (this.A04.A01) {
                    Log.i("DatabaseHelper/using migrated DB");
                    for (Map.Entry entry : C34071je.A00.entrySet()) {
                        C33971jU.A02(A012, (String) entry.getKey(), "DatabaseHelper", (long) ((Integer) entry.getValue()).intValue());
                    }
                    C33971jU.A02(A012, "participant_user_ready", "DatabaseHelper", 2);
                    C33971jU.A02(A012, "migration_completed", "DatabaseHelper", 1);
                    C33971jU.A02(A012, "write_to_old_schema_disabled", "DatabaseHelper", 1);
                    C33971jU.A02(A012, "drop_deprecated_tables_status", "DatabaseHelper", 1);
                } else {
                    Log.i("DatabaseHelper/using NOT migrated DB");
                }
                boolean A0F = A0F(A012);
                boolean A032 = A03(A012);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DatabaseHelper/On new DB creation, migration flags: migrationCompleted=");
                sb2.append(A032);
                sb2.append(", writeToOldSchemaEnabled=");
                sb2.append(A0F);
                Log.i(sb2.toString());
                A0B(A012, A0F);
                A07(A012);
                A09(A012);
                if (A0F) {
                    A012.A0B("INSERT INTO messages(_id, key_remote_jid, key_from_me, key_id, status, needs_push, data, timestamp, media_url, media_mime_type, media_wa_type, media_size, media_name, media_hash, media_duration, origin, latitude, longitude, thumb_image, received_timestamp, send_timestamp, receipt_server_timestamp, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, mentioned_jids) VALUES (1, '-1', 0, '-1', -1, 0, NULL, 0, NULL, NULL, -1, -1, NULL, NULL, 0, 0, 0, 0, NULL, -1, -1, -1, -1, -1, -1, NULL)");
                }
                A0A(A012, A032);
                A0C(A012, A032, A0F);
                C33971jU.A03(A012, "msgtore_db_schema_version", A032 ? "16a97243282ad6aeef26bb3f6206e710" : "19a1ded0107adbb404f8c085098d13d9", "DatabaseHelper");
                sQLiteDatabase2.setTransactionSuccessful();
                Iterator it = this.A06.iterator();
                while (it.hasNext()) {
                    C33911jO r2 = (C33911jO) it.next();
                    ((C15860rz) r2.A04.get()).A0K().putBoolean("md_messaging_enabled", true).apply();
                    r2.A00.A00.edit().putBoolean("force_db_check", false).apply();
                }
                sQLiteDatabase2.endTransaction();
                this.A00 = A012;
            } catch (Throwable th) {
                A012.A00.endTransaction();
                throw th;
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOpen(android.database.sqlite.SQLiteDatabase r3) {
        /*
            r2 = this;
            r3.getVersion()
            java.lang.String r0 = "PRAGMA synchronous=NORMAL;"
            r3.execSQL(r0)
            java.lang.String r1 = "PRAGMA secure_delete=1"
            r0 = 0
            android.database.Cursor r1 = r3.rawQuery(r1, r0)     // Catch:{ SQLiteDiskIOException -> 0x0025 }
            if (r1 == 0) goto L_0x002b
        L_0x0011:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001c
            r0 = 0
            r1.getInt(r0)     // Catch:{ all -> 0x0020 }
            goto L_0x0011
        L_0x001c:
            r1.close()     // Catch:{ SQLiteDiskIOException -> 0x0025 }
            return
        L_0x0020:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            java.lang.String r0 = "msgstore/enable_secure_delete"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33811jC.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("msgstore/upgrade version ");
        sb.append(i2);
        sb.append(" to ");
        sb.append(i3);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }
}
