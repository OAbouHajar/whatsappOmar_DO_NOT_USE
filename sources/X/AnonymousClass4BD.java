package X;

/* renamed from: X.4BD  reason: invalid class name */
public final class AnonymousClass4BD {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        StringBuilder A0r = AnonymousClass000.A0r("SELECT ");
        String str = C16910tr.A00;
        AnonymousClass3K3.A1N(A0r, C34111ji.A01("message", str));
        A0r.append("file_size");
        A0r.append(" FROM ");
        A0r.append("message_media AS message_media");
        A0r.append(" JOIN ");
        A0r.append("available_message_view AS message");
        A0r.append(" ON message_media.message_row_id = message._id");
        A0r.append(" JOIN ");
        A0r.append("message_forwarded AS message_forwarded");
        A0r.append(" ON message_forwarded.message_row_id = message_media.message_row_id");
        A0r.append(" WHERE ");
        A0r.append("message_forwarded.forward_score > ?");
        A0r.append(" AND ");
        A0r.append("message_type IN ('2', '1', '25', '3', '28', '13', '29', '9', '26')");
        A01 = AnonymousClass000.A0h(" ORDER BY file_size DESC", A0r);
        StringBuilder A0q = AnonymousClass000.A0q("SELECT ");
        A0q.append(str);
        A0q.append(" , ");
        C13680ns.A1Y("message_forwarded.forward_score", " FROM ", "available_message_view AS message", A0q);
        A0q.append(" JOIN ");
        A0q.append("message_forwarded AS message_forwarded");
        A0q.append(" ON message_forwarded.message_row_id = message._id");
        A0q.append(" WHERE ");
        A0q.append("message_forwarded.forward_score >= ?");
        A0q.append(" AND ");
        String A0h = AnonymousClass000.A0h("message_type IN ('2', '1', '25', '3', '28', '13', '29', '9', '26')", A0q);
        A04 = AnonymousClass000.A0h(" ORDER BY sort_id DESC", AnonymousClass000.A0q(A0h));
        A03 = AnonymousClass000.A0h(" ORDER BY sort_id ASC", AnonymousClass000.A0q(A0h));
        A02 = AnonymousClass000.A0h(" ORDER BY media_size DESC", AnonymousClass000.A0q(A0h));
        A00 = AnonymousClass000.A0h(" ORDER BY message_forwarded.forward_score DESC", AnonymousClass000.A0q(A0h));
    }
}
