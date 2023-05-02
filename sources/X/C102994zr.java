package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: X.4zr  reason: invalid class name and case insensitive filesystem */
public class C102994zr implements C108905Py {
    public C26881Pp A00;

    public C102994zr(C26881Pp r1) {
        this.A00 = r1;
    }

    public File ACE(String str) {
        File A01 = this.A00.A01(str);
        if (A01.exists()) {
            return A01;
        }
        Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("MessagesImporter/Can't find file in unpacked archive: ")));
        throw new FileNotFoundException(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Can't find file: ")));
    }
}
