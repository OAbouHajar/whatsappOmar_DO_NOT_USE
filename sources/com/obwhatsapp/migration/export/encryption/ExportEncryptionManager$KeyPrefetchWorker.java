package com.obwhatsapp.migration.export.encryption;

import X.AnonymousClass01F;
import X.AnonymousClass02P;
import X.AnonymousClass02Q;
import X.C13700nu;
import X.C16150sX;
import X.C16300so;
import X.C23371Bs;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class ExportEncryptionManager$KeyPrefetchWorker extends Worker {
    public final C16300so A00;
    public final C23371Bs A01;

    public ExportEncryptionManager$KeyPrefetchWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass01F A0A = C13700nu.A0A(context.getApplicationContext());
        this.A00 = A0A.A6q();
        this.A01 = (C23371Bs) ((C16150sX) A0A).A83.get();
    }

    public AnonymousClass02Q A04() {
        try {
            this.A01.A02(new CancellationSignal());
            return AnonymousClass02Q.A00();
        } catch (Exception e2) {
            this.A00.A03("xpm-export-prefetch-key", e2.toString(), e2);
            return new AnonymousClass02P();
        }
    }
}
