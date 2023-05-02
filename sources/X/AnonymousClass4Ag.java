package X;

/* renamed from: X.4Ag  reason: invalid class name */
public final class AnonymousClass4Ag {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0r = AnonymousClass000.A0r("SELECT ");
        String str = C16910tr.A00;
        A0r.append(C34111ji.A01("message", str));
        A0r.append(" FROM ");
        A0r.append("message_view AS message");
        A0r.append(" JOIN ");
        A0r.append("status AS status_list");
        A0r.append(" ON ");
        A0r.append("status_list.jid_row_id = message.sender_jid_row_id");
        A0r.append(" WHERE ");
        A0r.append("message.chat_row_id = ?");
        A0r.append(" AND ");
        A0r.append("message.from_me = 0");
        A0r.append(" AND ");
        A0r.append("status_list.last_read_message_table_id >= message._id");
        A0r.append(" AND ");
        A0r.append("status_list.last_read_receipt_sent_message_table_id < message._id");
        A0r.append(" AND ");
        A0r.append("status_list.last_read_receipt_sent_message_table_id > 0");
        A0r.append(" AND ");
        A0r.append("message.message_type != 15");
        A0r.append(" ORDER BY message.");
        A0r.append("_id");
        A00 = AnonymousClass000.A0h(" DESC LIMIT 4096", A0r);
        StringBuilder A0q = AnonymousClass000.A0q("SELECT ");
        C13680ns.A1Y(C34111ji.A01("message", str), " FROM ", "message_view AS message", A0q);
        A0q.append(" JOIN ");
        A0q.append("jid AS jid");
        C13680ns.A1Y(" ON jid.raw_string = message.sender_jid_raw_string", " JOIN ", "status AS status_list", A0q);
        A0q.append(" ON ");
        C13680ns.A1Y("status_list.jid_row_id = jid._id", " WHERE ", "message.chat_row_id = ?", A0q);
        A0q.append(" AND ");
        C13680ns.A1Y("message.from_me = 0", " AND ", "status_list.last_read_message_table_id >= message._id", A0q);
        A0q.append(" AND ");
        C13680ns.A1Y("status_list.last_read_receipt_sent_message_table_id < message._id", " AND ", "status_list.last_read_receipt_sent_message_table_id > 0", A0q);
        C13680ns.A1Y(" AND ", "message.message_type != 15", " ORDER BY message.", A0q);
        A0q.append("_id");
        A01 = AnonymousClass000.A0h(" DESC LIMIT 4096", A0q);
    }
}
