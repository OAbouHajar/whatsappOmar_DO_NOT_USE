package X;

import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import java.io.File;

/* renamed from: X.1Lu  reason: invalid class name and case insensitive filesystem */
public class C25961Lu {
    public final C25991Lx A00;
    public final C16320sq A01;

    public C25961Lu(C25991Lx r1, C16320sq r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(File file) {
        if (file != null) {
            this.A01.Acl(new RunnableRunnableShape0S1100000_I0(44, file.getName().split("@")[0], this));
        }
    }
}
