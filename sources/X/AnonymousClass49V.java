package X;

/* renamed from: X.49V  reason: invalid class name */
public final class AnonymousClass49V {
    public static final String A00;

    static {
        StringBuilder A0r = AnonymousClass000.A0r("SELECT ");
        AnonymousClass3K3.A1N(A0r, C16910tr.A00);
        A0r.append("links.link_index AS link_index");
        A0r.append(" FROM ");
        A0r.append("available_message_view AS message, ");
        A0r.append("(SELECT message_row_id, link_index FROM message_link AS link WHERE link.chat_row_id = ?) links");
        A0r.append(" WHERE ");
        A0r.append("message._id = links.message_row_id");
        A00 = AnonymousClass000.A0h(" ORDER BY sort_id DESC", A0r);
    }
}
