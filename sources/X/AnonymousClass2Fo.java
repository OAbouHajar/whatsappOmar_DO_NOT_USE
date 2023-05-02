package X;

/* renamed from: X.2Fo  reason: invalid class name */
public final class AnonymousClass2Fo {
    public static final String A00;
    public static final String A01;
    public static final String A02;

    static {
        StringBuilder sb = new StringBuilder("SELECT ");
        String str = C16910tr.A00;
        sb.append(C34111ji.A01("message_view", str));
        sb.append(" FROM ");
        sb.append("message_view_once_media view_once ");
        sb.append(" JOIN available_message_view message_view  ON view_once.message_row_id=message_view._id");
        sb.append(" JOIN message_media message_media  ON message_media.message_row_id =  message_view._id");
        sb.append(" WHERE ");
        sb.append("message_media.file_size != 0 AND message_view.from_me = 0  AND view_once.state IN (1, 2) ");
        sb.append(" LIMIT ?");
        A02 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(C34111ji.A01("message_view", str));
        sb2.append(" FROM ");
        sb2.append("message_view_once_media view_once ");
        sb2.append(" JOIN available_message_view message_view  ON view_once.message_row_id=message_view._id");
        sb2.append(" WHERE ");
        sb2.append("view_once.state = 0");
        sb2.append(" AND ");
        sb2.append("message_view.from_me = 0");
        A01 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SELECT ");
        sb3.append(C34111ji.A01("message_view", str));
        sb3.append(" FROM ");
        sb3.append("message_view_once_media view_once ");
        sb3.append(" JOIN available_message_view message_view  ON view_once.message_row_id=message_view._id");
        sb3.append(" WHERE ");
        sb3.append("message_view.timestamp <= ?  AND view_once.state = 0");
        sb3.append(" LIMIT ?");
        A00 = sb3.toString();
    }
}
