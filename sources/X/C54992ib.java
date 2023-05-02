package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

/* renamed from: X.2ib  reason: invalid class name and case insensitive filesystem */
public class C54992ib implements AnonymousClass2BF, C54972iZ {
    public final int A00;
    public final long A01;
    public final ContentResolver A02;
    public final Uri A03;
    public final File A04;
    public final boolean A05;

    public C54992ib(ContentResolver contentResolver, File file, int i2, boolean z2) {
        Uri.Builder buildUpon = Uri.fromFile(file).buildUpon();
        if (z2) {
            buildUpon.appendQueryParameter("flip-h", "1");
        }
        if (i2 != 0) {
            buildUpon.appendQueryParameter("rotation", Integer.toString(i2));
        }
        Uri build = buildUpon.build();
        long length = file.length();
        this.A02 = contentResolver;
        this.A03 = build;
        this.A01 = length;
        this.A04 = file;
        this.A05 = z2;
        this.A00 = i2;
    }

    public Uri A9L() {
        return this.A03;
    }

    public long ABe() {
        return new Date(this.A04.lastModified()).getTime();
    }

    public /* synthetic */ long ABq() {
        return 0;
    }

    public File ACD() {
        return this.A04;
    }

    public byte ADb() {
        return 1;
    }

    public String ADk() {
        return "image/*";
    }

    public int AFc() {
        return this.A00;
    }

    public boolean AIr() {
        return this.A05;
    }

    public Bitmap Agi(int i2) {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            ContentResolver contentResolver = this.A02;
            Uri uri = this.A03;
            Matrix A09 = C17970vw.A09(contentResolver, uri);
            int i3 = i2;
            long j2 = (long) i3;
            long j3 = j2 * j2 * 2;
            try {
                File A032 = AnonymousClass1XI.A03(uri);
                parcelFileDescriptor = A032 != null ? ParcelFileDescriptor.open(A032, 268435456) : contentResolver.openFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
                parcelFileDescriptor = null;
            }
            Bitmap A012 = C61883Au.A01(parcelFileDescriptor, i3, j3);
            if (A09 == null || A09.isIdentity()) {
                return A012;
            }
            if (A012 != null) {
                return Bitmap.createBitmap(A012, 0, 0, A012.getWidth(), A012.getHeight(), A09, true);
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    public long getContentLength() {
        return this.A01;
    }

    public int getType() {
        return 0;
    }
}
