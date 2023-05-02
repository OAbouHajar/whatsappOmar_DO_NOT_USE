package com.obwhatsapp.media.download;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass02Q;
import X.AnonymousClass1XI;
import X.C007203h;
import X.C02890Gc;
import X.C20130zY;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.io.File;

public class ExpressPathGarbageCollectWorker extends Worker {
    public final C20130zY A00;

    public ExpressPathGarbageCollectWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class)).A1K();
    }

    public AnonymousClass02Q A04() {
        String str;
        C007203h r2 = this.A01.A01;
        String A03 = r2.A03("file_path");
        if (A03 == null) {
            str = "expressPathGarbageCollectWorker/doWork file path is null";
        } else {
            AnonymousClass1XI.A0N(new File(A03));
            String A032 = r2.A03("end_hash");
            if (A032 == null) {
                str = "expressPathGarbageCollectWorker/doWork encrypted file hash is null";
            } else {
                if (this.A00.A00(A032)) {
                    return AnonymousClass02Q.A00();
                }
                return new C02890Gc();
            }
        }
        Log.e(str);
        return new C02890Gc();
    }
}
