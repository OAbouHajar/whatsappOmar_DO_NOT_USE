package X;

import com.obwhatsapp.calling.service.VoiceFGService;
import com.obwhatsapp.instrumentation.service.InstrumentationFGService;
import com.obwhatsapp.media.download.service.MediaDownloadService;
import com.obwhatsapp.migration.android.integration.service.GoogleMigrateService;
import com.obwhatsapp.service.GcmFGService;
import com.obwhatsapp.service.MDSyncService;

/* renamed from: X.1Vj  reason: invalid class name and case insensitive filesystem */
public abstract class C28301Vj extends C28311Vk implements AnonymousClass006 {
    public final Object A00 = new Object();
    public volatile AnonymousClass54I A01;

    public void A00() {
        if (this instanceof MDSyncService) {
            MDSyncService mDSyncService = (MDSyncService) this;
            if (!mDSyncService.A0A) {
                mDSyncService.A0A = true;
                C16150sX r1 = ((C59132uj) ((AnonymousClass54H) mDSyncService.generatedComponent())).A04;
                mDSyncService.A01 = (AnonymousClass116) r1.AAQ.get();
                mDSyncService.A03 = (C16980tz) r1.AQB.get();
                mDSyncService.A06 = (C16320sq) r1.ARB.get();
                mDSyncService.A05 = (C23321Bn) r1.ABl.get();
                mDSyncService.A04 = (AnonymousClass1RS) r1.AF3.get();
                mDSyncService.A02 = (C24931Hv) r1.ABk.get();
            }
        } else if (this instanceof GcmFGService) {
            GcmFGService gcmFGService = (GcmFGService) this;
            if (!gcmFGService.A00) {
                gcmFGService.A00 = true;
                gcmFGService.A01 = (AnonymousClass116) ((C59132uj) ((AnonymousClass54H) gcmFGService.generatedComponent())).A04.AAQ.get();
            }
        } else if (this instanceof GoogleMigrateService) {
            GoogleMigrateService googleMigrateService = (GoogleMigrateService) this;
            if (!googleMigrateService.A07) {
                googleMigrateService.A07 = true;
                C16150sX r2 = ((C59132uj) ((AnonymousClass54H) googleMigrateService.generatedComponent())).A04;
                googleMigrateService.A01 = (AnonymousClass116) r2.AAQ.get();
                googleMigrateService.A06 = (C16320sq) r2.ARB.get();
                googleMigrateService.A00 = (C16300so) r2.A5p.get();
                googleMigrateService.A05 = (AnonymousClass1BN) r2.AAp.get();
                googleMigrateService.A01 = (AnonymousClass01V) r2.AOi.get();
                googleMigrateService.A03 = (AnonymousClass1NL) r2.ABC.get();
                googleMigrateService.A02 = (AnonymousClass1NO) r2.ABA.get();
                googleMigrateService.A04 = (AnonymousClass10P) r2.ABB.get();
            }
        } else if (this instanceof MediaDownloadService) {
            MediaDownloadService mediaDownloadService = (MediaDownloadService) this;
            if (!mediaDownloadService.A07) {
                mediaDownloadService.A07 = true;
                C16150sX r12 = ((C59132uj) ((AnonymousClass54H) mediaDownloadService.generatedComponent())).A04;
                mediaDownloadService.A01 = (AnonymousClass116) r12.AAQ.get();
                mediaDownloadService.A02 = (C16980tz) r12.AQB.get();
                mediaDownloadService.A05 = (C16320sq) r12.ARB.get();
                mediaDownloadService.A00 = (C16000sG) r12.A4x.get();
                mediaDownloadService.A01 = (C16080sP) r12.AQ9.get();
                mediaDownloadService.A03 = (C209212c) r12.AE1.get();
            }
        } else if (this instanceof InstrumentationFGService) {
            InstrumentationFGService instrumentationFGService = (InstrumentationFGService) this;
            if (!instrumentationFGService.A02) {
                instrumentationFGService.A02 = true;
                instrumentationFGService.A01 = (AnonymousClass116) ((C59132uj) ((AnonymousClass54H) instrumentationFGService.generatedComponent())).A04.AAQ.get();
            }
        } else {
            VoiceFGService voiceFGService = (VoiceFGService) this;
            if (!voiceFGService.A01) {
                voiceFGService.A01 = true;
                C16150sX r13 = ((C59132uj) ((AnonymousClass54H) voiceFGService.generatedComponent())).A04;
                voiceFGService.A01 = (AnonymousClass116) r13.AAQ.get();
                voiceFGService.A00 = C16150sX.A0H(r13);
            }
        }
    }

    public final Object generatedComponent() {
        if (this.A01 == null) {
            synchronized (this.A00) {
                if (this.A01 == null) {
                    this.A01 = new AnonymousClass54I(this);
                }
            }
        }
        return this.A01.generatedComponent();
    }

    public void onCreate() {
        A00();
        super.onCreate();
    }
}
