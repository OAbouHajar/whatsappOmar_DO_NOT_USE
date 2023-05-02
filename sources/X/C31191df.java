package X;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* renamed from: X.1df  reason: invalid class name and case insensitive filesystem */
public class C31191df extends C31181de {
    public int A00;
    public Context A01;
    public C31161dc A02;

    public C31191df(Context context, int i2) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        if (applicationContext == null) {
            StringBuilder sb = new StringBuilder("context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: ");
            sb.append(context.getApplicationInfo().nativeLibraryDir);
            Log.w("SoLoader", sb.toString());
            this.A01 = context;
            applicationContext = context;
        }
        this.A00 = i2;
        this.A02 = new C31161dc(new File(applicationContext.getApplicationInfo().nativeLibraryDir), new String[0], i2);
    }

    public String toString() {
        return this.A02.toString();
    }
}
