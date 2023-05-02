package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3FW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FW implements AnonymousClass2G3 {
    public final /* synthetic */ C41011v3 A00;
    public final /* synthetic */ C16250si A01;

    public /* synthetic */ AnonymousClass3FW(C41011v3 r1, C16250si r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final C34121jj Acb() {
        C16250si r6 = this.A01;
        C41011v3 r5 = this.A00;
        r6.A0R.A00();
        C16900tq r0 = r6.A0P.A02;
        r0.A04();
        r0.A05();
        int A05 = r6.A05();
        int i2 = (A05 * 100) / (A05 + 1);
        ArrayList A0F = r6.A0F();
        if (A0F.size() <= 0) {
            Log.i("MessageStoreBackup/restore/backupfiles/none-found");
            return new C34121jj(0);
        }
        Iterator it = A0F.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            StringBuilder A0r = AnonymousClass000.A0r("MessageStoreBackup/restore/backupfiles ");
            A0r.append(file.getName());
            A0r.append(" (");
            A0r.append(file.length());
            Log.i(AnonymousClass000.A0h(")", A0r));
        }
        C16900tq r2 = r6.A0Q;
        r2.A04();
        File file2 = r2.A06;
        if (C16250si.A03(file2, "restore")) {
            r2.A04();
            AnonymousClass1XI.A0N(file2);
        }
        return r6.A08(r5, A0F, i2);
    }
}
