package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3tD  reason: invalid class name and case insensitive filesystem */
public class C76063tD extends C102064yL {
    public C76063tD(ContentResolver contentResolver, Uri uri, String str, String str2, long j2, long j3, long j4) {
        super(contentResolver, uri, str, str2, j2, j3, j4);
    }

    public Bitmap Agi(int i2) {
        boolean z2;
        String str;
        if (i2 < 144) {
            String str2 = this.A05;
            File file = str2 == null ? null : new File(str2);
            if (file == null) {
                Log.e("mediafileutils/createVideoThumbnail/file=null");
                return null;
            }
            try {
                C41911wr.A04(file);
                z2 = true;
            } catch (IOException unused) {
                z2 = false;
            }
            if (!z2) {
                return C18830xK.A00(new C41891wp(file), 96, false);
            }
            try {
                return C41911wr.A00(file);
            } catch (IOException | IllegalArgumentException e2) {
                e = e2;
                str = "mediafileutils/createGifThumbnail/gif file not read ";
                Log.e(str, e);
                return null;
            } catch (Exception e3) {
                e = e3;
                str = "mediafileutils/createGifThumbnail/unexpected gif exception ";
                Log.e(str, e);
                return null;
            }
        } else {
            long j2 = (long) i2;
            return A01(i2, 2 * j2 * j2);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C76063tD) && this.A04.equals(((C102064yL) obj).A04);
    }

    public int getType() {
        return 1;
    }

    public int hashCode() {
        return this.A04.toString().hashCode();
    }

    public String toString() {
        return C13680ns.A0j(AnonymousClass000.A0r("VideoObject"), this.A02);
    }
}
