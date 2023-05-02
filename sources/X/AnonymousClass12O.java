package X;

import com.whatsapp.util.Log;

/* renamed from: X.12O  reason: invalid class name */
public class AnonymousClass12O {
    public final AnonymousClass2GP A00 = new AnonymousClass2GP();
    public final C19670yo A01;

    public AnonymousClass12O(C19670yo r2) {
        this.A01 = r2;
    }

    public void A00(boolean z2) {
        AnonymousClass2GP r2 = this.A00;
        StringBuilder sb = new StringBuilder("backup-export/backup-end/success/");
        sb.append(z2);
        Log.i(sb.toString());
        for (AnonymousClass12S ANJ : r2.A01()) {
            ANJ.ANJ(z2);
        }
    }
}
