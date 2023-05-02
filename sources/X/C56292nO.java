package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import com.obwhatsapp.gallerypicker.GalleryPickerFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2nO  reason: invalid class name and case insensitive filesystem */
public class C56292nO extends ContentObserver {
    public final /* synthetic */ GalleryPickerFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56292nO(Handler handler, GalleryPickerFragment galleryPickerFragment) {
        super(handler);
        this.A00 = galleryPickerFragment;
    }

    public void onChange(boolean z2) {
        GalleryPickerFragment galleryPickerFragment = this.A00;
        C001000l A0C = galleryPickerFragment.A0C();
        if (A0C == null || A0C.getContentResolver() == null) {
            StringBuilder A0r = AnonymousClass000.A0r("gallerypicker/");
            A0r.append(galleryPickerFragment.A00);
            Log.i(AnonymousClass000.A0h(" no content resolver", A0r));
            return;
        }
        C001000l A0C2 = galleryPickerFragment.A0C();
        ContentResolver contentResolver = A0C2 == null ? null : A0C2.getContentResolver();
        boolean z3 = false;
        String[] strArr = {"volume"};
        Uri mediaScannerUri = MediaStore.getMediaScannerUri();
        if (contentResolver != null) {
            try {
                Cursor query = contentResolver.query(mediaScannerUri, strArr, (String) null, (String[]) null, (String) null);
                if (query != null) {
                    try {
                        if (query.getCount() == 1) {
                            query.moveToFirst();
                            z3 = "external".equals(C13680ns.A0e(query, "volume"));
                        }
                        query.close();
                    } catch (Throwable unused) {
                    }
                }
            } catch (UnsupportedOperationException unused2) {
            }
        }
        galleryPickerFragment.A1D(false, z3);
        return;
        throw th;
    }
}
