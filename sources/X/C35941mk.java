package X;

/* renamed from: X.1mk  reason: invalid class name and case insensitive filesystem */
public class C35941mk {
    public final C16440t3 A00;
    public final C002601d A01;

    public C35941mk(C16440t3 r1, C002601d r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static String A00(C28381Vw r2) {
        StringBuilder sb = new StringBuilder("msg_key_remote_jid = ? AND recipient_id = ? AND recipient_type = ? AND device_id = ? AND msg_key_from_me");
        sb.append(r2.A02 ? " != " : " = ");
        sb.append("0 AND ");
        sb.append("msg_key_id");
        sb.append(" = ?");
        return sb.toString();
    }
}
