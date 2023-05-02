package X;

import com.obwhatsapp.R;
import com.obwhatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.util.Log;

/* renamed from: X.4zl  reason: invalid class name and case insensitive filesystem */
public class C102934zl implements AnonymousClass5TF {
    public final /* synthetic */ GoogleMigrateService A00;

    public C102934zl(GoogleMigrateService googleMigrateService) {
        this.A00 = googleMigrateService;
    }

    public void AO6() {
        AnonymousClass10P r2 = this.A00.A04;
        Log.i("GoogleMigrateNotificationManager/onCancellationComplete()");
        r2.A02(C16980tz.A00(r2.A00).getString(R.string.str09f3), (String) null, -1, true, true);
    }

    public void AO7() {
        AnonymousClass10P r2 = this.A00.A04;
        Log.i("GoogleMigrateNotificationManager/onCancelling()");
        r2.A02(C16980tz.A00(r2.A00).getString(R.string.str09f2), (String) null, -1, false, false);
    }

    public void AOv(boolean z2) {
        StringBuilder A0r = AnonymousClass000.A0r("GoogleMigrateService/onComplete/success = ");
        A0r.append(z2);
        C13680ns.A1V(A0r);
        if (z2) {
            GoogleMigrateService googleMigrateService = this.A00;
            AnonymousClass10P r3 = googleMigrateService.A04;
            Log.i("GoogleMigrateNotificationManager/onComplete()");
            r3.A02(C16980tz.A00(r3.A00).getString(R.string.str09f4), (String) null, -1, true, false);
            Log.i("GoogleMigrateService/onComplete/sent import complete logging");
            googleMigrateService.A05.A03("google_migrate_import_complete", "google_migrate_import_complete_next");
        }
    }

    public void AQR(int i2) {
        Log.i(C13680ns.A0c(i2, "GoogleMigrateService/onError/errorCode = "));
        AnonymousClass10P r3 = this.A00.A04;
        C16980tz r2 = r3.A00;
        r3.A02(C16980tz.A00(r2).getString(R.string.str09f5), C16980tz.A00(r2).getString(R.string.str09f6), -1, true, false);
    }

    public void AS9() {
        this.A00.A04.A01(0);
    }

    public void AV9(int i2) {
        if (i2 != 301 && i2 != 104 && i2 != 101) {
            this.A00.A04.A01(0);
        }
    }

    public void AVA() {
        AnonymousClass10P r2 = this.A00.A04;
        r2.A02(C16980tz.A00(r2.A00).getString(R.string.str0c8c), (String) null, -1, true, false);
    }

    public void AVL(int i2) {
        Log.i(C13680ns.A0c(i2, "GoogleMigrateService/onProgress; progress="));
        this.A00.A04.A01(i2);
    }
}
