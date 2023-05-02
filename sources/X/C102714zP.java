package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: X.4zP  reason: invalid class name and case insensitive filesystem */
public class C102714zP implements C109445Sd {
    public long A00 = 0;
    public final C14730pf A01;
    public final C14710pd A02;
    public final File A03;

    public C102714zP(C14730pf r3, C14710pd r4, File file) {
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = file;
    }

    public long AE2() {
        return this.A00;
    }

    public OutputStream Aa6(C37801pl r6) {
        if (r6.getContentLength() <= this.A01.A01()) {
            try {
                if (this.A02.A0E(C16620tM.A01, 1539)) {
                    AhW();
                    return new FileOutputStream(this.A03, true);
                }
                File file = this.A03;
                AnonymousClass1XI.A0N(file);
                return new FileOutputStream(file, false);
            } catch (FileNotFoundException e2) {
                Log.e("plainfiledownload/FileNotFoundException", e2);
                throw new C803143j(9);
            }
        } else {
            Log.w(AnonymousClass000.A0f(this.A03, AnonymousClass000.A0r("plainfiledownload/not enough space to store the file: ")));
            throw new C803143j(4);
        }
    }

    public void AhW() {
        this.A00 = this.A02.A0E(C16620tM.A01, 1539) ? this.A03.length() : 0;
    }
}
