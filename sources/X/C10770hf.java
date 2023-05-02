package X;

import android.graphics.BitmapFactory;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.concurrent.Callable;

/* renamed from: X.0hf  reason: invalid class name and case insensitive filesystem */
public class C10770hf implements Callable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;
    public final /* synthetic */ AnonymousClass0OO A01;

    public C10770hf(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, AnonymousClass0OO r2) {
        this.A00 = shortcutInfoCompatSaverImpl;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        return BitmapFactory.decodeFile(this.A01.A01);
    }
}
