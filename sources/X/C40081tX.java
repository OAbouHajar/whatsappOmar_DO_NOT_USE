package X;

/* renamed from: X.1tX  reason: invalid class name and case insensitive filesystem */
public final class C40081tX {
    public static final String A00;

    static {
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(C16910tr.A00);
        sb.append(" FROM ");
        sb.append("message_edit_info");
        sb.append(" JOIN message_view ON ");
        sb.append("message_view._id = message_edit_info.message_row_id");
        sb.append(" WHERE ");
        sb.append("original_key_id = ? AND ");
        sb.append("chat_row_id = ? AND ");
        sb.append("from_me = ?");
        A00 = sb.toString();
    }
}
