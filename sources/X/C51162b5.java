package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.HashMap;

/* renamed from: X.2b5  reason: invalid class name and case insensitive filesystem */
public class C51162b5 extends C51142b3 implements AnonymousClass2BC {
    public static final String[] A00 = {"image/gif"};
    public static final String[] A01 = {"_id", "_data", "datetaken", "mini_thumb_magic", "orientation", "title", "mime_type", "date_modified", "_size"};

    public C51162b5(Uri uri, C16980tz r2, C20350zu r3, String str, int i2, boolean z2) {
        super(uri, r2, r3, str, i2, z2);
    }

    public String A03() {
        StringBuilder sb = new StringBuilder(this.A08 == null ? "(mime_type in (?))" : "(mime_type in (?)) AND bucket_id = ?");
        if (this.A02 && C15450qv.A09()) {
            sb.append(" AND ");
            sb.append("is_favorite=1");
        }
        return sb.toString();
    }

    public HashMap AAC() {
        String[] strArr;
        Uri build = this.A05.buildUpon().appendQueryParameter("distinct", "true").build();
        ContentResolver contentResolver = this.A04;
        String[] strArr2 = {"bucket_display_name", "bucket_id"};
        String A03 = A03();
        String str = this.A08;
        String[] strArr3 = A00;
        if (str != null) {
            int length = strArr3.length;
            strArr = new String[(length + 1)];
            System.arraycopy(strArr3, 0, strArr, 0, length);
            strArr[length] = str;
        } else {
            strArr = strArr3;
        }
        Cursor query = MediaStore.Images.Media.query(contentResolver, build, strArr2, A03, strArr, (String) null);
        try {
            HashMap hashMap = new HashMap();
            if (query != null) {
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
