package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.1Nr  reason: invalid class name and case insensitive filesystem */
public class C26431Nr implements C23541Cj {
    public final AnonymousClass01D A00;
    public final AnonymousClass01D A01;
    public final AnonymousClass01D A02;

    public C26431Nr(AnonymousClass01D r1, AnonymousClass01D r2, AnonymousClass01D r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public /* synthetic */ void APJ() {
    }

    public void APK() {
        C16300so r2;
        String A002;
        String str;
        ((AnonymousClass1NO) this.A02.get()).A08();
        AnonymousClass01D r5 = this.A00;
        C23371Bs r4 = (C23371Bs) r5.get();
        C16040sK r0 = r4.A00;
        r0.A0B();
        AnonymousClass1ZT r22 = r0.A05;
        synchronized (r4) {
            C16360su r1 = r4.A03;
            C37881pt A012 = r1.A01();
            if (!(A012 == null || r22 == null || r4.A04(r22, A012))) {
                r1.A04();
                StringBuilder sb = new StringBuilder();
                sb.append("ExportEncryptionManager/onCheckPrefetchedKeyConsistency(); ");
                sb.append("cleared prefetched key, a different user is now logged in or key is old");
                Log.i(sb.toString());
            }
        }
        ((C23371Bs) r5.get()).A01();
        AnonymousClass01D r12 = this.A01;
        ((C16330sr) r12.get()).A04();
        C16330sr r7 = (C16330sr) r12.get();
        C16400sy r6 = r7.A0A;
        boolean z2 = false;
        if (r6.A05()) {
            AnonymousClass01D r9 = r6.A05.A02;
            if (((SharedPreferences) r9.get()).getLong("/export/provider/timestamp", 0) != 0 && Math.abs(System.currentTimeMillis() - ((SharedPreferences) r9.get()).getLong("/export/provider/timestamp", 0)) > C16400sy.A07) {
                z2 = true;
            }
        }
        if (z2) {
            r6.A01();
            r2 = r7.A02;
            A002 = r6.A01();
            str = "xpm-export-provider-expired";
        } else if (!r6.A05()) {
            AnonymousClass01D r92 = r6.A05.A02;
            if (((SharedPreferences) r92.get()).getLong("/export/provider_closed/timestamp", 0) != 0 && Math.abs(System.currentTimeMillis() - ((SharedPreferences) r92.get()).getLong("/export/provider_closed/timestamp", 0)) > C16400sy.A06) {
                r6.A00();
                r2 = r7.A02;
                A002 = r6.A00();
                str = "xpm-export-metadata-expired";
            } else {
                return;
            }
        } else {
            return;
        }
        r2.AcB(str, A002, false);
        r7.A03();
    }
}
