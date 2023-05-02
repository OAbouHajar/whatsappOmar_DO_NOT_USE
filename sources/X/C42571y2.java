package X;

/* renamed from: X.1y2  reason: invalid class name and case insensitive filesystem */
public final class C42571y2 {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder sb = new StringBuilder("SELECT ");
        String str = C16910tr.A00;
        sb.append(C34111ji.A01("message", str));
        sb.append(" FROM ");
        sb.append("message_view AS message");
        sb.append(" LEFT JOIN ");
        sb.append("message_ui_elements AS content");
        sb.append(" ON ");
        sb.append("message._id = content.message_row_id");
        sb.append(" WHERE ");
        sb.append("content.element_type = ?");
        sb.append(" AND ");
        sb.append("message.chat_row_id = ?");
        sb.append(" AND ");
        sb.append("message.timestamp > ?");
        sb.append(" ORDER BY message.sort_id DESC ");
        sb.append(" LIMIT 100");
        A00 = sb.toString();
        C34111ji.A01("message", str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(C34111ji.A01("message", str));
        sb2.append(" FROM ");
        sb2.append("message_view");
        sb2.append(" AS message WHERE ");
        sb2.append("key_id = ?");
        sb2.append(" AND ");
        sb2.append("_id IN ( SELECT DISTINCT message_row_id FROM message_ui_elements WHERE element_type = 4)");
        A01 = sb2.toString();
    }
}
