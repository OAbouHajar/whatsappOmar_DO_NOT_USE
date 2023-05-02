package X;

import android.os.Build;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.1hJ  reason: invalid class name and case insensitive filesystem */
public class C32831hJ {
    public final MultiBufferLogger A00;
    public final AnonymousClass01V A01;
    public final C17020u3 A02;

    public C32831hJ(MultiBufferLogger multiBufferLogger, AnonymousClass01V r2, C17020u3 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = multiBufferLogger;
    }

    public void A00() {
        A01("os_ver", Build.VERSION.RELEASE, 8126483);
        A01("os_sdk", Integer.toString(Build.VERSION.SDK_INT), 8126537);
        A01("device_type", Build.MODEL, 8126478);
        A01("brand", Build.BRAND, 8126479);
        A01("manufacturer", Build.MANUFACTURER, 8126480);
        A01("year_class", Integer.toString(C42971z5.A02(this.A01, this.A02)), 8126481);
    }

    public final void A01(String str, String str2, int i2) {
        MultiBufferLogger multiBufferLogger = this.A00;
        multiBufferLogger.writeBytesEntry(1, 57, multiBufferLogger.writeBytesEntry(1, 56, multiBufferLogger.writeStandardEntry(7, 52, 0, 0, i2, 0, 0), str), str2);
    }
}
