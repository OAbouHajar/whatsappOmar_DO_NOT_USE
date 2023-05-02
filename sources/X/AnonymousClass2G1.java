package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

/* renamed from: X.2G1  reason: invalid class name */
public class AnonymousClass2G1 implements AnonymousClass2G2 {
    public final File A00;

    public AnonymousClass2G1(File file) {
        this.A00 = file;
    }

    public boolean A7l() {
        return this.A00.delete();
    }

    public boolean A8q() {
        return this.A00.exists();
    }

    public C40791uh AC6(AnonymousClass12W r4) {
        return new C40791uh(r4.A00(), this.A00);
    }

    public FileInputStream ACG() {
        return new FileInputStream(this.A00);
    }

    public String ACX(MessageDigest messageDigest, long j2) {
        return AnonymousClass1XI.A07(this.A00, messageDigest, j2);
    }

    public InputStream ACp() {
        return new FileInputStream(this.A00);
    }

    public OutputStream AEA() {
        return new FileOutputStream(this.A00);
    }

    public long AK4() {
        return this.A00.lastModified();
    }

    public long AK8() {
        return this.A00.length();
    }
}
