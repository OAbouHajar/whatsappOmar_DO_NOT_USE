package X;

/* renamed from: X.2Fp  reason: invalid class name and case insensitive filesystem */
public final class C46692Fp {
    public static final String A00;

    static {
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(C16910tr.A00);
        sb.append(" FROM ");
        sb.append("message_ephemeral ephemeral");
        sb.append(" JOIN ");
        sb.append("available_message_view messages");
        sb.append(" ON ");
        sb.append("ephemeral.message_row_id = messages._id");
        sb.append(" WHERE ");
        sb.append("ephemeral.keep_in_chat != 1");
        sb.append(" AND ");
        sb.append("ephemeral.expire_timestamp < ?");
        A00 = sb.toString();
    }
}
