package com.google.android.gms.vision.clearcut;

import X.C67233bD;
import X.C84224Js;
import android.content.Context;
import android.util.Log;
import com.facebook.redex.RunnableRunnableShape1S0201000_I1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DynamiteClearcutLogger {
    public static final ExecutorService zza;
    public C84224Js zzb = new C84224Js();
    public VisionClearcutLogger zzc;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public DynamiteClearcutLogger(Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i2, C67233bD r11) {
        boolean z2;
        if (i2 == 3) {
            C84224Js r8 = this.zzb;
            synchronized (r8.A02) {
                long currentTimeMillis = System.currentTimeMillis();
                if (r8.A00 + r8.A01 > currentTimeMillis) {
                    z2 = false;
                } else {
                    r8.A00 = currentTimeMillis;
                    z2 = true;
                }
            }
            if (!z2) {
                Object[] objArr = new Object[0];
                if (Log.isLoggable("Vision", 2)) {
                    Log.v("Vision", String.format("Skipping image analysis log due to rate limiting", objArr));
                    return;
                }
                return;
            }
        }
        zza.execute(new RunnableRunnableShape1S0201000_I1(this, i2, r11, 1));
    }
}
