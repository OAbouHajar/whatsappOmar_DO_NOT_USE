package X;

/* renamed from: X.23Q  reason: invalid class name */
public class AnonymousClass23Q {
    public static String A00 = A01((byte) 68);
    public static String A01 = A01((byte) 56);
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        StringBuilder sb = new StringBuilder("SELECT ");
        String str = C81944Ak.A00;
        sb.append(C34111ji.A01("message_add_on", str));
        sb.append(" FROM ");
        sb.append("message_add_on");
        sb.append(" WHERE ");
        sb.append("message_add_on.chat_row_id");
        sb.append(" = ? AND ");
        sb.append("message_add_on.key_id");
        sb.append(" = ? AND ");
        sb.append("message_add_on.from_me");
        sb.append(" = ? ");
        A04 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(C34111ji.A01("message_add_on", str));
        sb2.append(" FROM ");
        sb2.append("message_add_on");
        sb2.append(" WHERE ");
        sb2.append("message_add_on._id");
        sb2.append(" = ?");
        A03 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SELECT ");
        String str2 = C53022eq.A00;
        sb3.append(C34111ji.A01("message_add_on_orphan", str2));
        sb3.append(" FROM ");
        sb3.append("message_add_on_orphan");
        A02 = sb3.toString();
        C34111ji.A01("message_add_on_orphan", str2);
    }

    public static String A00(byte b2) {
        String A012;
        String str;
        String str2 = "message_add_on_keep_in_chat";
        if (b2 == 56) {
            A012 = C34111ji.A01("message_add_on_reaction", C81934Aj.A00);
            str = "message_add_on_reaction.message_add_on_row_id";
            str2 = "message_add_on_reaction";
        } else if (b2 == 67) {
            A012 = C34111ji.A01("message_add_on_poll_vote", C81924Ai.A00);
            str = "message_add_on_poll_vote.message_add_on_row_id";
            str2 = "message_add_on_poll_vote";
        } else if (b2 == 68) {
            A012 = C34111ji.A01(str2, C81914Ah.A00);
            str = "message_add_on_keep_in_chat.message_add_on_row_id";
        } else {
            throw new IllegalArgumentException("Not supported type.");
        }
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(C34111ji.A01("message_add_on", C81944Ak.A00));
        sb.append(",");
        sb.append(A012);
        sb.append(" FROM ");
        sb.append("message_add_on");
        sb.append(" LEFT JOIN ");
        sb.append(str2);
        sb.append(" ON ");
        sb.append("message_add_on._id = ");
        sb.append(str);
        sb.append(" ");
        return sb.toString();
    }

    public static String A01(byte b2) {
        String str = "SELECT COUNT(message_add_on._id) as unread_count, MAX(message_add_on._id) as last_message_add_on_row_id, message_add_on.parent_message_row_id as parent_message_row_id FROM message_add_on";
        if (b2 == 68) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" LEFT JOIN ");
            sb.append("message_add_on_keep_in_chat");
            sb.append(" ON ");
            sb.append("message_add_on._id=message_add_on_keep_in_chat.message_add_on_row_id");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" WHERE ");
        sb2.append("message_add_on.chat_row_id = ?");
        sb2.append(" AND ");
        sb2.append("message_add_on.message_add_on_type = ");
        sb2.append(b2);
        sb2.append(" AND ");
        sb2.append("message_add_on.status = ?");
        sb2.append(" AND ");
        sb2.append("message_add_on.from_me = 0");
        sb2.append(" AND ");
        sb2.append("message_add_on._id > ?");
        String obj = sb2.toString();
        if (b2 == 68) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(" AND ");
            sb3.append("message_add_on_keep_in_chat.keep_in_chat_state=1");
            sb3.append(" AND ");
            sb3.append("message_add_on_keep_in_chat.keep_count <= 1");
            obj = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj);
        sb4.append(" GROUP BY ");
        sb4.append("message_add_on.parent_message_row_id");
        sb4.append(" ORDER BY ");
        sb4.append("last_message_add_on_row_id");
        sb4.append(" DESC LIMIT ?");
        return sb4.toString();
    }

    public static String A02(byte b2, int i2) {
        StringBuilder sb = new StringBuilder("SELECT  DISTINCT (message_add_on.sender_jid_row_id), message_add_on.parent_message_row_id FROM message_add_on WHERE message_add_on.chat_row_id = ? AND message_add_on.message_add_on_type = ");
        sb.append(b2);
        sb.append(" AND ");
        sb.append("message_add_on.status = ?");
        sb.append(" AND ");
        sb.append("message_add_on.from_me = 0");
        sb.append(" AND ");
        sb.append("message_add_on._id > ?");
        sb.append(" AND ");
        sb.append("message_add_on.parent_message_row_id IN ");
        sb.append(C34111ji.A00(i2));
        return sb.toString();
    }
}
