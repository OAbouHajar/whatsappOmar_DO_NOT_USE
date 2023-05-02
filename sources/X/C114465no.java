package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.5no  reason: invalid class name and case insensitive filesystem */
public class C114465no extends C16690tT {
    public final AnonymousClass03L A00;
    public final C1221868p A01;
    public final C16980tz A02;
    public final String A03;

    public C114465no(AnonymousClass03L r1, C1221868p r2, C16980tz r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        File file = new File(this.A02.A00.getFilesDir(), AnonymousClass5wS.A03);
        if (file.exists() || file.mkdirs()) {
            return BitmapFactory.decodeFile(new File(file, this.A03).getAbsolutePath());
        }
        Log.e("BloksImageManager/getBitmap/unable to get images directory");
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.A00.A06(this.A03, new WeakReference(bitmap));
            this.A01.AY2(bitmap);
            return;
        }
        this.A01.AQQ();
    }
}
