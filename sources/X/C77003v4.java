package X;

import android.util.JsonReader;
import java.util.zip.ZipInputStream;

/* renamed from: X.3v4  reason: invalid class name and case insensitive filesystem */
public class C77003v4 extends AnonymousClass54O {
    public final C16350st A00;
    public final ZipInputStream A01;

    public C77003v4(JsonReader jsonReader, C16350st r2, ZipInputStream zipInputStream) {
        super(jsonReader);
        this.A01 = zipInputStream;
        this.A00 = r2;
    }

    public void close() {
        super.close();
        this.A01.close();
    }
}
