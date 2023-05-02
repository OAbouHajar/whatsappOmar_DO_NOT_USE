package X;

import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.2ik  reason: invalid class name and case insensitive filesystem */
public class C55062ik {
    public long A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final String A05;

    public C55062ik(String str, long j2, long j3, boolean z2, boolean z3, boolean z4) {
        this.A05 = str;
        this.A04 = j2;
        this.A00 = j3;
        this.A03 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }

    public static C55062ik A00(Bundle bundle) {
        if (bundle.containsKey("account_name")) {
            String string = bundle.getString("account_name");
            AnonymousClass00B.A06(string);
            C55062ik r2 = new C55062ik(string, bundle.getLong("last_modified", -1), bundle.getLong("total_backup_size", -1), bundle.getBoolean("overwrite_local_files"), bundle.getBoolean("is_download_size_zero"), bundle.getBoolean("is_encrypted_backup", false));
            StringBuilder sb = new StringBuilder("gdrive-activity/create-restore-data-from-bundle/ ");
            sb.append(r2);
            Log.i(sb.toString());
            return r2;
        }
        throw new IllegalStateException("account_name cannot be null.");
    }

    public synchronized Bundle A01() {
        Bundle bundle;
        bundle = new Bundle();
        bundle.putString("account_name", this.A05);
        bundle.putLong("total_backup_size", this.A00);
        bundle.putLong("last_modified", this.A04);
        bundle.putBoolean("overwrite_local_files", this.A03);
        bundle.putBoolean("is_download_size_zero", this.A01);
        bundle.putBoolean("is_encrypted_backup", this.A02);
        return bundle;
    }

    public Set A02() {
        return Collections.emptySet();
    }

    public synchronized String toString() {
        return String.format(Locale.ENGLISH, "Account:%s overwriteLocalFile:%b isDownloadSizeZero:%b lastModified:%s totalBackupSize: %d isPasswordProtected: %b", new Object[]{AnonymousClass2GK.A0B(this.A05), Boolean.valueOf(this.A03), Boolean.valueOf(this.A01), Long.valueOf(this.A04), Long.valueOf(this.A00), Boolean.valueOf(this.A02)});
    }
}
