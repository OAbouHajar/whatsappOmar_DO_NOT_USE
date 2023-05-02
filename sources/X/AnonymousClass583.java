package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.583  reason: invalid class name */
public final class AnonymousClass583 implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public AnonymousClass583(SharedPreferences sharedPreferences, String str, String str2) {
        this.A00 = sharedPreferences;
        this.A01 = str;
        this.A02 = str2;
    }

    public final /* synthetic */ Object call() {
        return this.A00.getString(this.A01, this.A02);
    }
}
