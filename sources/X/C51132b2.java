package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.2b2  reason: invalid class name and case insensitive filesystem */
public class C51132b2 extends C51142b3 implements AnonymousClass2BC {
    public static final String[] A00 = {"_id", "_data", "mime_type", "media_type", "date_modified", "datetaken", "orientation", "_size"};

    public C51132b2(Uri uri, C16980tz r2, C20350zu r3, String str, int i2, boolean z2) {
        super(uri, r2, r3, str, i2, z2);
    }

    public final String A03() {
        StringBuilder sb = new StringBuilder("media_type in (1, 3)");
        if (this.A08 != null) {
            sb.append(" AND ");
            sb.append("bucket_id=?");
        }
        if (this.A02 && C15450qv.A09()) {
            sb.append(" AND ");
            sb.append("is_favorite=1");
        }
        return sb.toString();
    }

    public HashMap AAC() {
        HashMap hashMap = new HashMap();
        Uri build = this.A05.buildUpon().appendQueryParameter("distinct", "true").build();
        ContentResolver contentResolver = this.A04;
        String[] strArr = {"bucket_display_name", "bucket_id"};
        String A03 = A03();
        String str = this.A08;
        Cursor query = contentResolver.query(build, strArr, A03, str == null ? null : new String[]{str}, (String) null);
        if (query == null) {
            return hashMap;
        }
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("bucket_display_name");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("bucket_id");
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow);
                String string2 = query.getString(columnIndexOrThrow2);
                if (string == null) {
                    string = "";
                }
                hashMap.put(string2, string);
            }
            query.close();
            return hashMap;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
