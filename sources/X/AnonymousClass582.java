package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.582  reason: invalid class name */
public final class AnonymousClass582 implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ String A02;

    public AnonymousClass582(SharedPreferences sharedPreferences, Long l2, String str) {
        this.A00 = sharedPreferences;
        this.A02 = str;
        this.A01 = l2;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.A00.getLong(this.A02, this.A01.longValue()));
    }
}
