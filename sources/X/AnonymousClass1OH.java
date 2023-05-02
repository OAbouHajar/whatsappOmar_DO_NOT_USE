package X;

import com.obwhatsapp.net.tls13.WtCachedPsk;
import com.obwhatsapp.watls13.WtPersistentSession;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.1OH  reason: invalid class name */
public final class AnonymousClass1OH implements C23541Cj {
    public final C219816e A00;

    public AnonymousClass1OH(C219816e r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public void APJ() {
        File[] listFiles;
        LinkedHashSet linkedHashSet;
        C219816e r8 = this.A00;
        synchronized (r8) {
            File A01 = r8.A01();
            if (!(A01 == null || (listFiles = A01.listFiles()) == null)) {
                for (File file : listFiles) {
                    WtPersistentSession A002 = r8.A00(file);
                    if (A002 != null && (linkedHashSet = A002.A03) != null) {
                        Iterator it = linkedHashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            WtCachedPsk wtCachedPsk = (WtCachedPsk) it.next();
                            if ((wtCachedPsk.useTestTime ? 3600000 : System.currentTimeMillis()) - wtCachedPsk.ticketIssuedTime <= wtCachedPsk.ticketLifetime) {
                                break;
                            }
                        }
                    }
                    file.delete();
                    file.getAbsolutePath();
                }
            }
        }
    }

    public /* synthetic */ void APK() {
    }
}
