package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.57s  reason: invalid class name and case insensitive filesystem */
public final class C1049957s implements Callable {
    public final /* synthetic */ Context A00;

    public C1049957s(Context context) {
        this.A00 = context;
    }

    public final /* synthetic */ Object call() {
        return this.A00.getSharedPreferences("google_sdk_flags", 0);
    }
}
