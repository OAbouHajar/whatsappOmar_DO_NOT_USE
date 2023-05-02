package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3uZ  reason: invalid class name and case insensitive filesystem */
public class C76713uZ extends C102644zI {
    public C76713uZ(Context context, C16180sb r2, C17250um r3, AnonymousClass1XQ r4, String str) {
        super(context, r2, r3, r4, str);
    }

    public void run() {
        File A0E = C17970vw.A0E(this.A01, this.A04);
        if (A0E.exists() && !A0E.delete()) {
            Log.w("MediaDeleteDoodleJob/failed-delete-doodle-file");
        }
    }
}
