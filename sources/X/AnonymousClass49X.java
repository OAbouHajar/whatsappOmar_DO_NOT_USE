package X;

/* renamed from: X.49X  reason: invalid class name */
public final class AnonymousClass49X {
    public static final String A00;

    static {
        StringBuilder A0r = AnonymousClass000.A0r("SELECT ");
        A0r.append(C34111ji.A01("message", C16910tr.A00));
        A0r.append(" FROM ");
        A0r.append("message_view AS message");
        A0r.append(" JOIN ");
        A0r.append("status_list AS chat_list");
        A0r.append(" ON ");
        A0r.append("chat_list.key_remote_jid = message.sender_jid_raw_string");
        A0r.append(" WHERE ");
        A0r.append("message.chat_row_id = ?");
        A0r.append(" AND ");
        A0r.append("message.from_me = 0");
        A0r.append(" AND ");
        A0r.append("chat_list.last_read_message_table_id >= message._id");
        A0r.append(" AND ");
        A0r.append("chat_list.last_read_receipt_sent_message_table_id < message._id");
        A0r.append(" AND ");
        A0r.append("chat_list.last_read_receipt_sent_message_table_id > 0");
        A0r.append(" AND ");
        A0r.append("message.message_type != 15");
        A0r.append(" ORDER BY message.");
        A0r.append("_id");
        A00 = AnonymousClass000.A0h(" DESC LIMIT 4096", A0r);
    }
}
