package X;

import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5th  reason: invalid class name and case insensitive filesystem */
public class C117875th {
    public final C16180sb A00;

    public C117875th(C16180sb r1) {
        this.A00 = r1;
    }

    public File A00(String str) {
        File A0N;
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            Log.e("BloksFileManager/getCapturedMediaDirectory external storage is not writable");
            A0N = null;
        } else {
            A0N = this.A00.A0N("bloks_captured_media");
            if (!A0N.exists() && !A0N.mkdirs()) {
                Log.e("BloksFileManager/getCapturedMediaFile: failed to create media directory");
                return null;
            }
        }
        return new File(A0N.getPath(), str);
    }
}
