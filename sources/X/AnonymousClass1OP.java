package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.1OP  reason: invalid class name */
public final class AnonymousClass1OP implements C23541Cj {
    public final Context A00;

    public AnonymousClass1OP(Context context) {
        this.A00 = context;
    }

    public void APJ() {
        Context context = this.A00;
        String str = new String[]{"vpx_1_8_1"}[0];
        StringBuilder sb = new StringBuilder("lib");
        sb.append(str);
        sb.append(".so");
        try {
            new File(context.getFilesDir(), sb.toString()).delete();
        } catch (SecurityException unused) {
        }
    }

    public /* synthetic */ void APK() {
    }
}
