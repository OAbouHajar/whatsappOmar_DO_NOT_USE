package X;

/* renamed from: X.2EE  reason: invalid class name */
public final class AnonymousClass2EE {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder sb = new StringBuilder("SELECT ");
        String str = C16910tr.A00;
        sb.append(str);
        sb.append(" FROM ");
        sb.append("message_view");
        sb.append(" WHERE ");
        sb.append("message_type = '8'");
        sb.append(" AND ");
        sb.append("media_caption IS NOT NULL");
        sb.append(" ORDER BY ");
        sb.append("_id");
        sb.append(" DESC LIMIT ?,?");
        A00 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(C34111ji.A01("message", str));
        sb2.append(", ");
        sb2.append("transaction_id");
        sb2.append(" FROM ");
        sb2.append("call_logs call_logs");
        sb2.append(" INNER JOIN ");
        sb2.append("message_view message");
        sb2.append(" ON call_logs.message_row_id = message._id");
        sb2.append(" WHERE ");
        sb2.append("message_type = '8'");
        sb2.append(" ORDER BY call_logs._id DESC");
        sb2.append(" LIMIT ?,?");
        A01 = sb2.toString();
        C34111ji.A01("message", str);
    }
}
