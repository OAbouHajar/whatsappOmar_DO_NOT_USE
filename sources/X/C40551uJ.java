package X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.1uJ  reason: invalid class name and case insensitive filesystem */
public final class C40551uJ {
    public static final String A00;
    public static final String A01;

    static {
        String join = TextUtils.join(", ", Arrays.asList(new String[]{"messages_quotes._id AS sort_id", "messages_quotes.key_from_me AS from_me", "messages_quotes.key_id AS key_id", "messages_quotes.status AS status", "messages_quotes.needs_push AS broadcast", "messages_quotes.data AS data", "messages_quotes.timestamp AS timestamp", "messages_quotes.media_url AS media_url", "messages_quotes.media_mime_type AS media_mime_type", "messages_quotes.media_wa_type AS message_type", "messages_quotes.media_size AS media_size", "messages_quotes.media_name AS media_name", "messages_quotes.media_caption AS media_caption", "messages_quotes.media_hash AS media_hash", "messages_quotes.media_duration AS media_duration", "messages_quotes.origin AS origin", "messages_quotes.latitude AS latitude", "messages_quotes.longitude AS longitude", "messages_quotes.thumb_image AS thumb_image", "messages_quotes.raw_data AS raw_data", "messages_quotes.recipient_count AS recipient_count", "messages_quotes.participant_hash AS participant_hash", "messages_quotes.starred AS starred", "messages_quotes.quoted_row_id AS quoted_row_id", "messages_quotes.mentioned_jids AS mentioned_jids", "messages_quotes.multicast_id AS multicast_id", "messages_quotes.edit_version AS edit_version", "messages_quotes.receipt_server_timestamp AS receipt_server_timestamp", "messages_quotes.media_enc_hash AS media_enc_hash", "messages_quotes.payment_transaction_id AS payment_transaction_id", "messages_quotes.forwarded AS origination_flags", "messages_quotes.preview_type AS preview_type", "messages_quotes.received_timestamp AS received_timestamp", "messages_quotes._id AS _id", "'' AS text_data", "0 AS lookup_tables", "-1 AS sender_jid_row_id", "messages_quotes.remote_resource AS sender_jid_raw_string", "chat._id AS chat_row_id", "-1 AS future_message_type", "0 AS message_add_on_flags", "1 AS table_version"}));
        A01 = join;
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(join);
        sb.append(" FROM ");
        sb.append("messages_quotes");
        sb.append(" JOIN ");
        sb.append("jid AS chat_jid ON messages_quotes.key_remote_jid = chat_jid.raw_string");
        sb.append(" JOIN ");
        sb.append("chat AS chat ON chat.jid_row_id = chat_jid._id");
        sb.append(" WHERE ");
        sb.append("messages_quotes._id = ?");
        A00 = sb.toString();
    }
}
