package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.1Bq  reason: invalid class name and case insensitive filesystem */
public class C23351Bq {
    public final Context A00;

    public C23351Bq(Context context) {
        this.A00 = context;
    }

    public File A00(String str) {
        Context context = this.A00;
        new File(context.getFilesDir(), "migration/export/sandbox").mkdirs();
        return File.createTempFile("sandbox", str, new File(context.getFilesDir(), "migration/export/sandbox"));
    }

    public void A01() {
        AnonymousClass1XI.A0D(new File(this.A00.getFilesDir(), "migration/export/sandbox"));
    }
}
