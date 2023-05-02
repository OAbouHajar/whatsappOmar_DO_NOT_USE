package X;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: X.0AR  reason: invalid class name */
public class AnonymousClass0AR extends Paint {
    public AnonymousClass0AR() {
    }

    public AnonymousClass0AR(int i2) {
        super(i2);
    }

    public AnonymousClass0AR(int i2, PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public AnonymousClass0AR(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public void setTextLocales(LocaleList localeList) {
    }
}
