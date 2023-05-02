package X;

/* renamed from: X.1jX  reason: invalid class name and case insensitive filesystem */
public class C34001jX {
    public static final String A00 = C34031ja.A00("media_streaming_sidecar");
    public static final String A01;
    public static final String A02;

    static {
        StringBuilder sb = new StringBuilder("SELECT ");
        String str = AnonymousClass1WW.A00;
        sb.append(str);
        sb.append(", ");
        sb.append("key_remote_jid");
        sb.append(" FROM ");
        sb.append("legacy_available_messages_view");
        sb.append(" WHERE media_hash=? AND  +media_wa_type=?  ORDER BY _id DESC LIMIT 1000");
        A01 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append("key_remote_jid");
        sb2.append(" FROM ");
        sb2.append("legacy_available_messages_view");
        sb2.append(" WHERE media_hash=? AND ");
        sb2.append("media_wa_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' ) ");
        sb2.append(" ORDER BY _id DESC LIMIT 1000");
        A02 = sb2.toString();
    }
}
