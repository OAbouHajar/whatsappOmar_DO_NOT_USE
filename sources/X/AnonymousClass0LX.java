package X;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* renamed from: X.0LX  reason: invalid class name */
public class AnonymousClass0LX {
    public static ParcelFileDescriptor A00(ContentResolver contentResolver, Uri uri, CancellationSignal cancellationSignal, String str) {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}
