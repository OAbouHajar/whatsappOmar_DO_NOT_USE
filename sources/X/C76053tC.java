package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* renamed from: X.3tC  reason: invalid class name and case insensitive filesystem */
public class C76053tC extends C102064yL {
    public C76053tC(ContentResolver contentResolver, Uri uri, String str, String str2, long j2, long j3, long j4) {
        super(contentResolver, uri, str, str2, j2, j3, j4);
    }

    public Bitmap Agi(int i2) {
        String str = this.A05;
        return C18830xK.A01(str == null ? null : new File(str));
    }

    public int getType() {
        return 2;
    }
}
