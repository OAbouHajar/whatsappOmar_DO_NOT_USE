package X;

import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.3Dx  reason: invalid class name and case insensitive filesystem */
public class C62533Dx implements AnonymousClass5UN {
    public final AnonymousClass0TS A00;
    public final C15340qi A01;
    public final File A02;

    public C62533Dx(C15340qi r2, File file) {
        AnonymousClass0TS r0 = AnonymousClass0TS.A00;
        this.A02 = file;
        this.A01 = r2;
        this.A00 = r0;
    }

    public Set A9t() {
        int length;
        String[] list = this.A02.list();
        if (list == null || (length = list.length) == 0) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(length);
        for (String str : list) {
            char[] charArray = str.toCharArray();
            StringBuilder A0o = AnonymousClass000.A0o();
            int i2 = 0;
            while (i2 < charArray.length) {
                char c2 = charArray[i2];
                if (c2 == '%') {
                    try {
                        A0o.append((char) Integer.parseInt(new String(charArray, i2 + 1, 2), 16));
                        i2 += 2;
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    A0o.append(c2);
                }
                i2++;
            }
            str = A0o.toString();
            linkedHashSet.add(str);
        }
        return linkedHashSet;
    }

    public File ACE(String str) {
        File ACH = ACH(str);
        if (!ACH.exists()) {
            return null;
        }
        ACH.setLastModified(System.currentTimeMillis());
        return ACH;
    }

    public File ACH(String str) {
        File file = this.A02;
        char[] charArray = str.toCharArray();
        StringBuilder A0o = AnonymousClass000.A0o();
        for (char c2 : charArray) {
            if (c2 == '%' || AnonymousClass4YI.A00.contains(Character.valueOf(c2))) {
                A0o.append('%');
                AnonymousClass000.A1J(A0o, c2);
            } else {
                A0o.append(c2);
            }
        }
        return C13700nu.A0C(file, A0o.toString());
    }

    public long ACt(String str) {
        return C15380qm.A00(ACH(str));
    }

    public long AG7() {
        return C15380qm.A00(this.A02);
    }

    public boolean AHY(String str) {
        return ACH(str).exists();
    }

    public File AIO(String str) {
        this.A02.mkdirs();
        File ACH = ACH(str);
        ACH.setLastModified(System.currentTimeMillis());
        return ACH;
    }

    public long AK3(String str) {
        return ACH(str).lastModified();
    }

    public boolean Abs(String str) {
        return this.A01.A7o(ACH(str));
    }

    public boolean Abt(String str, int i2) {
        return Abs(str);
    }
}
