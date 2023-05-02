package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.Date;

/* renamed from: X.2ic  reason: invalid class name and case insensitive filesystem */
public class C55002ic implements AnonymousClass2BF, C54972iZ {
    public final long A00;
    public final Uri A01;
    public final File A02;

    public C55002ic(File file) {
        Uri fromFile = Uri.fromFile(file);
        long length = file.length();
        this.A01 = fromFile;
        this.A00 = length;
        this.A02 = file;
    }

    public Uri A9L() {
        return this.A01;
    }

    public long ABe() {
        return new Date(this.A02.lastModified()).getTime();
    }

    public /* synthetic */ long ABq() {
        return 0;
    }

    public File ACD() {
        return this.A02;
    }

    public byte ADb() {
        return 3;
    }

    public String ADk() {
        return "video/*";
    }

    public int AFc() {
        return 0;
    }

    public boolean AIr() {
        return false;
    }

    public Bitmap Agi(int i2) {
        String path = this.A01.getPath();
        return C18830xK.A01(path == null ? null : new File(path));
    }

    public long getContentLength() {
        return this.A00;
    }

    public int getType() {
        return 1;
    }
}
