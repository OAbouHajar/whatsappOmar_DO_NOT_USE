package X;

/* renamed from: X.1yw  reason: invalid class name and case insensitive filesystem */
public final class C42931yw {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        String str = C16910tr.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(str);
        sb.append(" FROM ");
        sb.append("message_view");
        sb.append(" WHERE ");
        sb.append("chat_row_id = ?");
        sb.append(" AND ");
        sb.append("sort_id > ?");
        sb.append(" AND ");
        sb.append("sort_id <= ?");
        sb.append("ORDER BY ");
        sb.append("sort_id");
        sb.append(" ASC LIMIT 1024");
        A00 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(str);
        sb2.append(" FROM ");
        sb2.append("message_view");
        sb2.append(" WHERE ");
        sb2.append("chat_row_id = ?");
        sb2.append(" ORDER BY sort_id ASC");
        A01 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SELECT ");
        sb3.append(str);
        sb3.append(" FROM ");
        sb3.append("message_view");
        sb3.append(" WHERE ");
        sb3.append("chat_row_id = ?");
        sb3.append(" AND ");
        sb3.append("(sender_jid_row_id = ? OR sender_jid_raw_string = ?) ");
        sb3.append(" ORDER BY ");
        sb3.append("sort_id ASC");
        A03 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("SELECT ");
        sb4.append(str);
        sb4.append(" FROM ");
        sb4.append("message_view");
        sb4.append(" WHERE ");
        sb4.append("from_me = 1");
        sb4.append(" AND ");
        sb4.append("chat_row_id = ?");
        sb4.append(" ORDER BY ");
        sb4.append("sort_id");
        sb4.append(" ASC");
        A04 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SELECT ");
        sb5.append(str);
        sb5.append(" FROM ");
        sb5.append("message_view");
        sb5.append(" WHERE ");
        sb5.append("chat_row_id = ?");
        sb5.append(" AND ");
        sb5.append("sort_id > ?");
        sb5.append(" ORDER BY ");
        sb5.append("sort_id ASC");
        A02 = sb5.toString();
    }
}
