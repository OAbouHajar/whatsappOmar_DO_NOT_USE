package X;

import android.os.ParcelFileDescriptor;
import android.util.JsonReader;

/* renamed from: X.3v3  reason: invalid class name and case insensitive filesystem */
public class C76993v3 extends AnonymousClass54O {
    public final ParcelFileDescriptor A00;
    public final C16350st A01;

    public C76993v3(ParcelFileDescriptor parcelFileDescriptor, JsonReader jsonReader, C16350st r3) {
        super(jsonReader);
        this.A00 = parcelFileDescriptor;
        this.A01 = r3;
    }

    public void close() {
        super.close();
        this.A00.close();
    }
}
