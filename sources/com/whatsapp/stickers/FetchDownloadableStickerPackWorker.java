package com.whatsapp.stickers;

import X.AnonymousClass02Q;
import X.C13700nu;
import X.C16150sX;
import X.C20090zU;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class FetchDownloadableStickerPackWorker extends Worker {
    public final C20090zU A00;

    public FetchDownloadableStickerPackWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = (C20090zU) ((C16150sX) C13700nu.A0A(context)).ANn.get();
    }

    public AnonymousClass02Q A04() {
        this.A00.A00();
        return AnonymousClass02Q.A00();
    }
}
