package X;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.4nr  reason: invalid class name and case insensitive filesystem */
public class C96144nr implements C109585Ss {
    public final C15340qi A00;
    public final File A01;

    public C96144nr(C15340qi r1, File file) {
        this.A00 = r1;
        this.A01 = file;
    }

    public Collection A9s() {
        String[] list = this.A01.list();
        return list == null ? Collections.emptyList() : Arrays.asList(list);
    }

    public boolean AJq(String str) {
        return false;
    }

    public long AJw(String str) {
        return new File(this.A01, str).lastModified();
    }

    public long AJx(String str) {
        return C15380qm.A00(new File(this.A01, str));
    }

    public boolean Abs(String str) {
        return this.A00.A7o(new File(this.A01, str));
    }
}
