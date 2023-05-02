package X;

import android.content.ContentValues;
import android.os.Build;
import java.io.File;

/* renamed from: X.472  reason: invalid class name */
public class AnonymousClass472 {
    public static ContentValues A00(File file, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mime_type", str2);
        contentValues.put("_display_name", file.getName());
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", AnonymousClass000.A0h("/Whatsapp/", AnonymousClass000.A0q(str)));
            return contentValues;
        }
        contentValues.put("_data", file.getPath());
        return contentValues;
    }
}
