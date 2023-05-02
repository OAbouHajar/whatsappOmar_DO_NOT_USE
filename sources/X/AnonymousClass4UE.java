package X;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* renamed from: X.4UE  reason: invalid class name */
public class AnonymousClass4UE {
    public int A00 = 0;
    public C34641kb A01 = C34641kb.of();
    public C34641kb A02 = C34641kb.of();

    public final void A00(Context context) {
        CaptioningManager captioningManager;
        int i2 = AnonymousClass3C1.A01;
        if ((i2 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.A00 = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.A02 = C34641kb.of(i2 >= 21 ? AnonymousClass3C1.A09(locale) : locale.toString());
            }
        }
    }
}
