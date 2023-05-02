package X;

import com.whatsapp.util.Log;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0u0  reason: invalid class name and case insensitive filesystem */
public class C16990u0 {
    public boolean A00;
    public final StringBuilder A01 = new StringBuilder();

    public void A00(String str, int i2) {
        boolean z2;
        if (i2 == 2) {
            Log.i(str);
        } else if (i2 == 3) {
            Log.w(str);
        } else if (i2 == 4) {
            Log.e(str);
        }
        synchronized (this) {
            z2 = this.A00;
        }
        if (z2) {
            synchronized (this) {
                StringBuilder sb = this.A01;
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb.append(str);
            }
        }
    }
}
