package X;

import com.obwhatsapp.R;
import com.obwhatsapp.migration.export.service.MessagesExporterService;
import com.whatsapp.util.Log;

/* renamed from: X.4zs  reason: invalid class name and case insensitive filesystem */
public class C103004zs implements AnonymousClass5T7 {
    public final /* synthetic */ MessagesExporterService A00;

    public C103004zs(MessagesExporterService messagesExporterService) {
        this.A00 = messagesExporterService;
    }

    public void AO6() {
        MessagesExporterService messagesExporterService = this.A00;
        C615039e r4 = messagesExporterService.A01;
        Log.i("MessagesExporterNotificationManager/onCancellationComplete()");
        r4.A03(C16980tz.A00(r4.A00).getString(R.string.str1cba), (String) null, -1, true);
        Log.i("xpm-export-service-onCancellationCompleted/sent export cancellation complete logging");
        messagesExporterService.stopSelf();
    }

    public void AO7() {
        C615039e r4 = this.A00.A01;
        Log.i("MessagesExporterNotificationManager/onCancelling()");
        r4.A03(C16980tz.A00(r4.A00).getString(R.string.str1cb9), (String) null, -1, false);
    }

    public void AOq() {
        Log.i("xpm-export-service-onComplete/success");
        C615039e r4 = this.A00.A01;
        Log.i("MessagesExporterNotificationManager/onComplete()");
        r4.A03(C16980tz.A00(r4.A00).getString(R.string.str1cbb), (String) null, -1, true);
        Log.i("xpm-export-service-onComplete/sent export complete logging");
    }

    public void AQR(int i2) {
        Log.i(C13680ns.A0c(i2, "xpm-export-service-onError/errorCode = "));
        C615039e r4 = this.A00.A01;
        C16980tz r2 = r4.A00;
        r4.A03(C16980tz.A00(r2).getString(R.string.str1cbc), C16980tz.A00(r2).getString(R.string.str1cbd), -1, true);
    }

    public void AQp() {
        this.A00.A01.A02(0);
    }

    public void AVL(int i2) {
        Log.i(C13680ns.A0c(i2, "xpm-export-service-onProgress; progress="));
        this.A00.A01.A02(i2);
    }
}
