package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1Uw  reason: invalid class name and case insensitive filesystem */
public class C28231Uw {
    public final File A00;
    public final File A01;
    public final Object A02 = new Object();

    public C28231Uw(File file) {
        this.A01 = file;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        this.A00 = new File(sb.toString());
    }

    public final void A00() {
        File file = this.A01;
        if (file.exists() && !file.delete()) {
            StringBuilder sb = new StringBuilder("DefaultSharedPreferencesStorage/Couldn't clean up partially-written file ");
            sb.append(file);
            Log.e(sb.toString());
        }
    }
}
