package X;

import java.util.Arrays;

/* renamed from: X.2G0  reason: invalid class name */
public final class AnonymousClass2G0 {
    public static final String A00;
    public static final String A01;
    public static final byte[] A02;

    static {
        byte[] bArr = {1, 3, 13, 9, 25, 26, 28, 29, 42, 43};
        A02 = bArr;
        String arrays = Arrays.toString(bArr);
        String substring = arrays.substring(1, arrays.length() - 1);
        StringBuilder sb = new StringBuilder(" SELECT message_thumbnail.message_row_id FROM message_thumbnail INNER JOIN available_message_view ON message_thumbnail.message_row_id = available_message_view._id WHERE available_message_view.message_type IN (");
        sb.append(substring);
        sb.append(")");
        A01 = sb.toString();
        StringBuilder sb2 = new StringBuilder(" SELECT message_thumbnails.ROWID FROM message_thumbnails INNER JOIN available_message_view ON message_thumbnails.key_id = available_message_view.key_id WHERE available_message_view.message_type IN (");
        sb2.append(substring);
        sb2.append(")");
        A00 = sb2.toString();
    }
}
