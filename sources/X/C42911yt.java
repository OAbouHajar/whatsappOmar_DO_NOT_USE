package X;

/* renamed from: X.1yt  reason: invalid class name and case insensitive filesystem */
public class C42911yt {
    public static final String A00;

    static {
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(C16910tr.A00);
        sb.append(", deleted_msg.remove_files AS remove_files FROM ");
        sb.append("deleted_messages_view");
        sb.append(" AS deleted_msg  WHERE ");
        sb.append("chat_row_id");
        sb.append(" = ? AND ");
        sb.append("message_type");
        sb.append(" != ");
        sb.append(8);
        sb.append(" ORDER BY sort_id ASC");
        sb.append(" LIMIT ?");
        A00 = sb.toString();
    }
}
