package X;

import com.obwhatsapp.migration.android.view.GoogleMigrateImporterViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4zm  reason: invalid class name and case insensitive filesystem */
public class C102944zm implements AnonymousClass5TF {
    public final /* synthetic */ GoogleMigrateImporterViewModel A00;

    public C102944zm(GoogleMigrateImporterViewModel googleMigrateImporterViewModel) {
        this.A00 = googleMigrateImporterViewModel;
    }

    public void AO6() {
        Log.i("GoogleMigrateImporterViewModel/onCancellationCompleted()");
        this.A00.A08(C13680ns.A0Z());
    }

    public void AO7() {
        Log.i("GoogleMigrateImporterViewModel/onCancellationStarted()");
        this.A00.A07(7);
    }

    public void AOv(boolean z2) {
        StringBuilder A0r = AnonymousClass000.A0r("GoogleMigrateImporterViewModel/onComplete()/success = ");
        A0r.append(z2);
        C13680ns.A1V(A0r);
        if (z2) {
            GoogleMigrateImporterViewModel googleMigrateImporterViewModel = this.A00;
            googleMigrateImporterViewModel.A07(5);
            C13680ns.A1P(googleMigrateImporterViewModel.A03, 100);
        }
    }

    public void AQR(int i2) {
        Log.i(C13680ns.A0c(i2, "GoogleMigrateImporterViewModel/onError()/errorCode = "));
        this.A00.A07(AnonymousClass473.A00(i2));
    }

    public void AS9() {
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel = this.A00;
        googleMigrateImporterViewModel.A07(3);
        C13680ns.A1P(googleMigrateImporterViewModel.A03, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 == 101) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AV9(int r3) {
        /*
            r2 = this;
            java.lang.String r0 = "GoogleMigrateImporterViewModel/onPrepareBeforeRetryCompleted()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 301(0x12d, float:4.22E-43)
            if (r3 == r0) goto L_0x0012
            r0 = 104(0x68, float:1.46E-43)
            if (r3 == r0) goto L_0x0012
            r0 = 101(0x65, float:1.42E-43)
            r1 = 0
            if (r3 != r0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            com.obwhatsapp.migration.android.view.GoogleMigrateImporterViewModel r0 = r2.A00
            if (r1 == 0) goto L_0x001b
            r0.A05()
            return
        L_0x001b:
            r0.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102944zm.AV9(int):void");
    }

    public void AVA() {
        Log.i("GoogleMigrateImporterViewModel/onPrepareBeforeRetryStarted()");
        this.A00.A07(17);
    }

    public void AVL(int i2) {
        Log.i(C13680ns.A0c(i2, "GoogleMigrateImporterViewModel/onProgress(); progress="));
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel = this.A00;
        googleMigrateImporterViewModel.A07(3);
        C13680ns.A1P(googleMigrateImporterViewModel.A03, i2);
    }
}
