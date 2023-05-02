package X;

import android.net.TrafficStats;
import com.obwhatsapp.backup.google.GoogleBackupService;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.2xL  reason: invalid class name and case insensitive filesystem */
public class C59412xL extends C70893i6 {
    public final /* synthetic */ GoogleBackupService A00;
    public final /* synthetic */ AnonymousClass2GM A01;
    public final /* synthetic */ String A02;

    public C59412xL(GoogleBackupService googleBackupService, AnonymousClass2GM r2, String str) {
        this.A00 = googleBackupService;
        this.A01 = r2;
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ Object A00(int i2) {
        AnonymousClass2GM r4 = this.A01;
        String str = this.A02;
        Log.i(C13680ns.A0h("GoogleBackupApi/delete-backup/", str));
        boolean z2 = false;
        if (r4.A0B()) {
            Log.i("GoogleBackupApi/delete-backup/api disabled");
        } else {
            TrafficStats.setThreadStatsTag(13);
            HttpsURLConnection httpsURLConnection = null;
            try {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("clients/wa/backups/");
                httpsURLConnection = r4.A07("DELETE", AnonymousClass000.A0h(str, A0o), (String) null, (Map) null, false);
                int responseCode = httpsURLConnection.getResponseCode();
                StringBuilder A0q = AnonymousClass000.A0q("GoogleBackupApi/delete-backup/");
                A0q.append(responseCode);
                C13680ns.A1V(A0q);
                if (responseCode != 403) {
                    if (responseCode == 200) {
                        z2 = true;
                    }
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    TrafficStats.clearThreadStatsTag();
                } else {
                    throw new C71063iQ();
                }
            } catch (IOException e2) {
                Log.e((Throwable) e2);
            } catch (Throwable th) {
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        return Boolean.valueOf(z2);
    }
}
