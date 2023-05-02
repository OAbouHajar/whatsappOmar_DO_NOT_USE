package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.104  reason: invalid class name */
public class AnonymousClass104 implements C19400yN {
    public final C16300so A00;
    public final C16440t3 A01;
    public final C16980tz A02;
    public final C15860rz A03;

    public AnonymousClass104(C16300so r1, C16440t3 r2, C16980tz r3, C15860rz r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static File A00(C16980tz r2, String str) {
        File cacheDir = r2.A00.getCacheDir();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".health");
        return new File(cacheDir, sb.toString());
    }

    public List A01() {
        ArrayList arrayList = new ArrayList();
        if (!A04("breakpad")) {
            arrayList.add("breakpad");
        }
        if (!A04("anr_detector")) {
            arrayList.add("anr_detector");
        }
        if (!A04("abort_hook")) {
            arrayList.add("abort_hook");
        }
        return arrayList;
    }

    public void A02(Runnable runnable, String str) {
        if (!A04(str)) {
            StringBuilder sb = new StringBuilder("Skipping module ");
            sb.append(str);
            sb.append(" since its unhealthy");
            Log.w(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("Loading module: ");
        sb2.append(str);
        Log.i(sb2.toString());
        try {
            A00(this.A02, str).createNewFile();
        } catch (IOException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error creating health file for ");
            sb3.append(str);
            Log.e(sb3.toString(), e2);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        runnable.run();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        A03(str);
        StringBuilder sb4 = new StringBuilder("Module loaded: ");
        sb4.append(str);
        sb4.append(" load time: ");
        sb4.append(elapsedRealtime2 - elapsedRealtime);
        Log.i(sb4.toString());
        return;
    }

    public void A03(String str) {
        boolean delete = A00(this.A02, str).delete();
        StringBuilder sb = new StringBuilder();
        sb.append("Module ");
        sb.append(str);
        sb.append(" health file deleted: ");
        sb.append(delete);
        Log.i(sb.toString());
    }

    public boolean A04(String str) {
        return !A00(this.A02, str).exists();
    }

    public String AGT() {
        return "SafeModuleLoader";
    }

    public void AMc() {
        C15860rz r8 = this.A03;
        if (((SharedPreferences) r8.A01.get()).getBoolean("report_unhealthy_module", true)) {
            List<String> A012 = A01();
            for (String append : A012) {
                C16300so r2 = this.A00;
                StringBuilder sb = new StringBuilder("app-init-module-unhealthy-");
                sb.append(append);
                r2.AcB(sb.toString(), AnonymousClass1U8.A02(), false);
            }
            if (!A012.isEmpty()) {
                r8.A0K().putBoolean("report_unhealthy_module", false).apply();
            }
        }
    }
}
