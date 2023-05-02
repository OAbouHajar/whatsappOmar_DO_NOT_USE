package X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.1jk  reason: invalid class name and case insensitive filesystem */
public class C34131jk {
    public static final String A00;
    public static final String[] A01;

    static {
        String[] strArr = {"_id", "raw_string_jid", "display_message_row_id", "last_read_message_row_id", "last_read_receipt_sent_message_row_id", "archived", "sort_timestamp", "gen", "spam_detection", "plaintext_disabled", "vcard_ui_dismissed", "change_number_notified_message_row_id", "subject", "last_message_row_id", "unseen_message_count", "unseen_missed_calls_count", "unseen_row_count", "unseen_message_reaction_count", "last_message_reaction_row_id", "last_seen_message_reaction_row_id", "unseen_earliest_message_received_time", "last_important_message_row_id", "show_group_description", "ephemeral_expiration", "ephemeral_setting_timestamp", "ephemeral_disappearing_messages_initiator", "unseen_important_message_count", "group_type", "growth_lock_level", "growth_lock_expiration_ts", "last_read_message_sort_id", "display_message_sort_id", "last_message_sort_id", "last_read_receipt_sent_message_sort_id", "has_new_community_admin_dialog_been_acknowledged", "history_sync_progress", "hidden"};
        A01 = strArr;
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(TextUtils.join(", ", Arrays.asList(strArr)));
        sb.append(", deleted_chat_job.* FROM ");
        sb.append("chat_view");
        sb.append(" AS chat_view  LEFT JOIN ");
        sb.append(" ( SELECT chat._id AS chat_row_id, jid.raw_string AS key_remote_jid  FROM jid AS jid LEFT JOIN chat AS chat ON jid._id = chat.jid_row_id ) AS chat_to_jid");
        sb.append(" ON ");
        sb.append("chat_to_jid.key_remote_jid = chat_view.raw_string_jid");
        sb.append(" LEFT JOIN  ( SELECT ");
        sb.append("chat_row_id, ");
        sb.append("deleted_message_row_id, ");
        sb.append("deleted_starred_message_row_id, ");
        sb.append("deleted_categories_message_row_id, ");
        sb.append("deleted_categories_starred_message_row_id, ");
        sb.append("deleted_message_categories");
        sb.append(" FROM ");
        sb.append("deleted_chat_job");
        sb.append(" ) AS deleted_chat_job \n ON ");
        sb.append("chat_to_jid.chat_row_id = deleted_chat_job.chat_row_id");
        sb.append(" WHERE ");
        sb.append("(hidden <> 1)");
        A00 = sb.toString();
    }
}
