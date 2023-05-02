package X;

import java.io.File;

/* renamed from: X.1js  reason: invalid class name and case insensitive filesystem */
public class C34201js {
    public final long A00;
    public final long A01;
    public final File A02;
    public final String A03;

    public C34201js(File file) {
        this.A02 = file;
        this.A00 = file.lastModified();
        this.A01 = file.length();
        this.A03 = file.getName();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C34201js) && this.A02.equals(((C34201js) obj).A02);
    }

    public int hashCode() {
        File file = this.A02;
        if (file == null) {
            return 0;
        }
        return file.hashCode();
    }
}
