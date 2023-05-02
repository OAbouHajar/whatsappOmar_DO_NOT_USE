package X;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.HashMap;

/* renamed from: X.2b8  reason: invalid class name and case insensitive filesystem */
public class C51192b8 extends C51142b3 {
    public static final String[] A00 = {"_id", "_data", "datetaken", "title", "mini_thumb_magic", "mime_type", "date_modified", "_size"};

    public C51192b8(Uri uri, C16980tz r2, C20350zu r3, String str, int i2, boolean z2) {
        super(uri, r2, r3, str, i2, z2);
    }

    public String A03() {
        StringBuilder sb = new StringBuilder();
        String str = this.A08;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("bucket_id = '");
            sb2.append(str);
            sb2.append("'");
            sb.append(sb2.toString());
        }
        if (this.A02 && C15450qv.A09()) {
            if (sb.length() > 0) {
                sb.append(" AND ");
            }
            sb.append("is_favorite=1");
        }
        return sb.toString();
    }

    public HashMap AAC() {
        Uri build = this.A05.buildUpon().appendQueryParameter("distinct", "true").build();
        Cursor query = MediaStore.Images.Media.query(this.A04, build, new String[]{"bucket_display_name", "bucket_id"}, A03(), (String[]) null, A02());
        try {
            HashMap hashMap = new HashMap();
            if (query != null) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("bucket_id");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("bucket_display_name");
                while (query.moveToNext()) {
                    hashMap.put(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2));
                }
            }
            if (query != null) {
                query.close();
            }
            return hashMap;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
