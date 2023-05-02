package X;

/* renamed from: X.49T  reason: invalid class name */
public final class AnonymousClass49T {
    public static final String A00;

    static {
        StringBuilder A0r = AnonymousClass000.A0r("SELECT ");
        A0r.append(C34111ji.A01("message", C16910tr.A00));
        A0r.append(" FROM ");
        A0r.append("available_message_view AS message");
        A0r.append(" JOIN ");
        A0r.append("chat AS chat");
        A0r.append(" ON message.chat_row_id = chat._id");
        A0r.append(" WHERE ");
        A0r.append("message.from_me = 0");
        A0r.append(" AND ");
        A0r.append("status != 16");
        A0r.append(" AND ");
        A0r.append("status != 10");
        A0r.append(" AND ");
        A0r.append("(chat.last_read_message_sort_id >= message.sort_id OR status = 17)");
        A0r.append(" AND ");
        A0r.append("chat.last_read_receipt_sent_message_sort_id < message.sort_id");
        A0r.append(" AND ");
        A0r.append("chat.last_read_receipt_sent_message_row_id > 0");
        A0r.append(" AND ");
        A0r.append("message.message_type NOT IN ('8', '10', '15')");
        A0r.append(" AND ");
        A0r.append("(chat.hidden IS NULL OR chat.hidden = 0)");
        A0r.append(" ORDER BY message.sort_id DESC");
        A00 = AnonymousClass000.A0h(" LIMIT 4096", A0r);
    }
}
