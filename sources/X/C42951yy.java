package X;

/* renamed from: X.1yy  reason: invalid class name and case insensitive filesystem */
public final class C42951yy {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;
    public static final String A08;
    public static final String A09;
    public static final String A0A;
    public static final String A0B;

    static {
        StringBuilder sb = new StringBuilder("SELECT ");
        String str = C16910tr.A00;
        sb.append(str);
        sb.append(" FROM ");
        sb.append("available_message_view");
        sb.append(" WHERE ");
        sb.append("message_type IN ('2', '1', '25', '3', '28', '13', '29', '9', '26')");
        A01 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(C34111ji.A01("message", str));
        sb2.append(", ");
        sb2.append("file_size");
        sb2.append(" FROM ");
        sb2.append("message_media AS message_media");
        sb2.append(" JOIN ");
        sb2.append("available_message_view AS message");
        sb2.append(" ON message_media.message_row_id = message._id");
        sb2.append(" WHERE ");
        sb2.append("message_type IN ('2', '1', '25', '3', '28', '13', '29', '9', '26')");
        A00 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SELECT ");
        sb3.append(str);
        sb3.append(", remove_files  FROM ");
        sb3.append("deleted_messages_view");
        sb3.append(" WHERE ");
        sb3.append("message_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' ) ");
        sb3.append(" AND ");
        sb3.append("chat_row_id");
        sb3.append(" = ?");
        A02 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("SELECT ");
        sb4.append(str);
        sb4.append(" FROM ");
        sb4.append("available_message_view");
        sb4.append(" WHERE ");
        sb4.append("message_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' ) ");
        sb4.append(" AND ");
        sb4.append("( NOT (message_type == 2 AND origin == 1)  OR (origin != 1))");
        sb4.append(" AND ");
        sb4.append("chat_row_id = ?");
        sb4.append(" ORDER BY sort_id DESC");
        A05 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SELECT ");
        sb5.append(str);
        sb5.append(" FROM ");
        sb5.append("available_message_view");
        sb5.append(" WHERE ");
        sb5.append("+message_type in (2 , 1 , 25 , 3 , 28 , 13 , 29 , 20 , 9 , 26 , 23 , 37 ) ");
        sb5.append(" AND ");
        sb5.append("from_me = 0");
        sb5.append(" AND ");
        sb5.append("sort_id > ? ");
        sb5.append(" ORDER BY sort_id ASC");
        A0B = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("SELECT ");
        sb6.append(C34111ji.A01("message", str));
        sb6.append(" FROM ");
        sb6.append("message_media AS message_media");
        sb6.append(" JOIN ");
        sb6.append("available_message_view AS message");
        sb6.append(" ON message_media.message_row_id = message._id");
        sb6.append(" WHERE ");
        sb6.append("message_media.file_hash = ?");
        sb6.append(" AND ");
        sb6.append("message_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' ) ");
        sb6.append(" ORDER BY sort_id DESC");
        sb6.append(" LIMIT 1000");
        A04 = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append("SELECT ");
        sb7.append(C34111ji.A01("message", str));
        sb7.append(" FROM ");
        sb7.append("message_media AS message_media");
        sb7.append(" JOIN ");
        sb7.append("available_message_view AS message");
        sb7.append(" ON message_media.message_row_id = message._id");
        sb7.append(" WHERE ");
        sb7.append("message_media.file_hash = ?");
        sb7.append(" AND ");
        sb7.append("message.message_type = ?");
        sb7.append(" ORDER BY sort_id DESC");
        sb7.append(" LIMIT 1000");
        A03 = sb7.toString();
        StringBuilder sb8 = new StringBuilder("SELECT message_media.*, ");
        sb8.append(C34111ji.A01("message", "timestamp"));
        sb8.append(",");
        sb8.append(C34111ji.A01("message", "message_type"));
        sb8.append(",");
        sb8.append(C34111ji.A01("message", "media_url"));
        sb8.append(" FROM ");
        sb8.append("message_media AS message_media");
        sb8.append(" JOIN ");
        sb8.append("available_message_view AS message");
        sb8.append(" ON message_media.message_row_id = message._id");
        sb8.append(" WHERE ");
        sb8.append("file_hash = ?");
        sb8.append(" AND ");
        sb8.append("enc_file_hash IS NOT NULL");
        sb8.append(" ORDER BY message_row_id DESC");
        A09 = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append("SELECT message_media.*, ");
        sb9.append(C34111ji.A01("message", "timestamp"));
        sb9.append(",");
        sb9.append(C34111ji.A01("message", "message_type"));
        sb9.append(",");
        sb9.append(C34111ji.A01("message", "media_url"));
        sb9.append(" FROM ");
        sb9.append("message_media AS message_media");
        sb9.append(" JOIN ");
        sb9.append("available_message_view AS message");
        sb9.append(" ON message_media.message_row_id = message._id");
        sb9.append(" WHERE ");
        sb9.append("file_hash = ?");
        sb9.append(" AND ");
        sb9.append("enc_file_hash IS NOT NULL");
        sb9.append(" AND ");
        sb9.append("message.message_type = ?");
        sb9.append(" ORDER BY sort_id DESC");
        A08 = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append("SELECT message_media.*, ");
        sb10.append(C34111ji.A01("message", "chat_row_id, from_me, key_id"));
        sb10.append(" FROM ");
        sb10.append("message_media AS message_media");
        sb10.append(" JOIN ");
        sb10.append("available_message_view AS message");
        sb10.append(" ON message_media.message_row_id = message._id");
        sb10.append(" WHERE ");
        sb10.append("file_hash = ?");
        sb10.append(" AND ");
        sb10.append("enc_file_hash = ?");
        sb10.append(" AND ");
        sb10.append("message_type in ('3', '1' ) ");
        sb10.append(" ORDER BY sort_id DESC");
        sb10.append(" LIMIT 10");
        A0A = sb10.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append("SELECT ");
        sb11.append(str);
        sb11.append(" FROM ");
        sb11.append("available_message_view");
        sb11.append(" WHERE ");
        sb11.append("message_type  IN ('2', '1', '25', '3', '28', '13', '29')");
        sb11.append(" AND ");
        sb11.append(" ( NOT (message_type == 2 AND origin == 1)  OR (origin != 1))");
        sb11.append(" AND ");
        sb11.append("chat_row_id = ?");
        String obj = sb11.toString();
        A07 = obj;
        StringBuilder sb12 = new StringBuilder();
        sb12.append(obj);
        sb12.append(" ORDER BY sort_id DESC");
        A06 = sb12.toString();
    }
}
