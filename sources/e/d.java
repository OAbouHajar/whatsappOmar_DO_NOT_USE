package e;

import java.text.SimpleDateFormat;
import java.util.Locale;
import okhttp3.internal.Util;

/* compiled from: XFMFile */
public final class d extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1623a;

    public /* synthetic */ d(int i2) {
        this.f1623a = i2;
    }

    public final Object initialValue() {
        switch (this.f1623a) {
            case 0:
                return new StringBuilder("Picasso-");
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(Util.UTC);
                return simpleDateFormat;
        }
    }
}
