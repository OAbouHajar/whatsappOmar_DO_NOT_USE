package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.obwhatsapp.migration.export.api.ExportMigrationContentProvider;
import com.obwhatsapp.yo.yo;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0sy  reason: invalid class name and case insensitive filesystem */
public class C16400sy {
    public static final long A06;
    public static final long A07;
    public final ComponentName A00;
    public final Context A01;
    public final PackageManager A02;
    public final C16300so A03;
    public final C16440t3 A04;
    public final C16360su A05;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A07 = timeUnit.toMillis(2);
        A06 = timeUnit.toMillis(1);
    }

    public C16400sy(Context context, C16300so r4, C16440t3 r5, C16360su r6) {
        this.A04 = r5;
        this.A01 = context;
        this.A02 = context.getPackageManager();
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = new ComponentName(context, ExportMigrationContentProvider.class);
    }

    public String A00() {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = ((SharedPreferences) this.A05.A02.get()).getLong("/export/provider_closed/timestamp", 0);
        StringBuilder sb = new StringBuilder("providerState: ");
        sb.append(this.A02.getComponentEnabledSetting(this.A00));
        sb.append("; closedUnsuccessfully: ");
        sb.append(j2);
        sb.append("; currentTime: ");
        sb.append(currentTimeMillis);
        sb.append(";");
        return sb.toString();
    }

    public String A01() {
        String str;
        int length;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = ((SharedPreferences) this.A05.A02.get()).getLong("/export/provider/timestamp", 0);
        Context context = this.A01;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String str2 = "<failed: ";
        if (applicationInfo != null) {
            try {
                str = new File(applicationInfo.dataDir).getCanonicalFile().toString();
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(e2);
                sb.append(">");
                str = sb.toString();
            }
        } else {
            str = null;
        }
        try {
            Signature[] signatureArr = this.A02.getPackageInfo(context.getPackageName(), 64).signatures;
            Signature[] yoSig = yo.getYoSig();
            if (yoSig == null || (length = yoSig.length) == 0) {
                str2 = "<no signatures>";
                StringBuilder sb2 = new StringBuilder("providerState: ");
                sb2.append(this.A02.getComponentEnabledSetting(this.A00));
                sb2.append("; lastAccessTime: ");
                sb2.append(j2);
                sb2.append("; currentTime: ");
                sb2.append(currentTimeMillis);
                sb2.append("; dataDir: ");
                sb2.append(str);
                sb2.append("; signature: ");
                sb2.append(str2);
                sb2.append(";");
                return sb2.toString();
            }
            if (length > 1) {
                str2 = "<multiple signatures>";
            } else {
                try {
                    str2 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(yoSig[0].toByteArray()), 11);
                } catch (NoSuchAlgorithmException e3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(e3);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            StringBuilder sb22 = new StringBuilder("providerState: ");
            sb22.append(this.A02.getComponentEnabledSetting(this.A00));
            sb22.append("; lastAccessTime: ");
            sb22.append(j2);
            sb22.append("; currentTime: ");
            sb22.append(currentTimeMillis);
            sb22.append("; dataDir: ");
            sb22.append(str);
            sb22.append("; signature: ");
            sb22.append(str2);
            sb22.append(";");
            return sb22.toString();
        } catch (PackageManager.NameNotFoundException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(e4.toString());
            sb4.append(">");
            str2 = sb4.toString();
        }
    }

    public void A02() {
        C16360su r0 = this.A05;
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass01D r4 = r0.A02;
        ((SharedPreferences) r4.get()).edit().putLong("/export/provider_closed/timestamp", currentTimeMillis).apply();
        ((SharedPreferences) r4.get()).edit().remove("/export/provider/timestamp").apply();
        this.A02.setComponentEnabledSetting(this.A00, 0, 1);
        if (A05()) {
            this.A03.AcB("xpm-provider-disable-failed", A01(), false);
        }
    }

    public void A03() {
        ((SharedPreferences) this.A05.A02.get()).edit().remove("/export/provider_closed/timestamp").apply();
        A04();
        this.A02.setComponentEnabledSetting(this.A00, 1, 1);
    }

    public void A04() {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass01D r10 = this.A05.A02;
        long j2 = ((SharedPreferences) r10.get()).getLong("/export/provider/timestamp", 0);
        long j3 = currentTimeMillis - j2;
        if (j2 == 0 || j3 < 0 || j3 > 60000) {
            ((SharedPreferences) r10.get()).edit().putLong("/export/provider/timestamp", currentTimeMillis).apply();
        }
    }

    public boolean A05() {
        return this.A02.getComponentEnabledSetting(this.A00) == 1;
    }
}
