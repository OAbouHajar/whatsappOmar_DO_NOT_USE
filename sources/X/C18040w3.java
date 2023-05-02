package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/* renamed from: X.0w3  reason: invalid class name and case insensitive filesystem */
public class C18040w3 {
    public SharedPreferences A00;
    public final C16440t3 A01;
    public final C17020u3 A02;

    public C18040w3(C16440t3 r1, C17020u3 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public static final String A00(byte[] bArr, String str) {
        byte[] bArr2;
        try {
            bArr2 = C40481uC.A00(new String(str.getBytes(), AnonymousClass01S.A0A).getBytes(), bArr);
        } catch (Exception e2) {
            Log.e("WamThreadIdManager/computeHash failed to compute hmac", e2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            return Base64.encodeToString(bArr2, 2);
        }
        return null;
    }

    public synchronized long A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A00("chatCounts");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences.getLong("start_time_ms", 0);
    }

    public synchronized long A02(Random random) {
        long A012;
        A012 = A01();
        if (A012 == 0) {
            A012 = this.A01.A00() - ((long) random.nextInt(86400000));
            A04(A012);
        }
        return A012;
    }

    public String A03(String str) {
        String format = new SimpleDateFormat("yyyy/MM/dd", Locale.US).format(new Date(A02(new Random()) - 28800000));
        byte[] A05 = A05(new Random());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(format);
        return A00(A05, sb.toString());
    }

    public synchronized void A04(long j2) {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A00("chatCounts");
            this.A00 = sharedPreferences;
        }
        sharedPreferences.edit().putLong("start_time_ms", j2).apply();
    }

    public synchronized byte[] A05(Random random) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A00("chatCounts");
            this.A00 = sharedPreferences;
        }
        if (!sharedPreferences.contains("thread_user_secret")) {
            byte[] bArr = new byte[32];
            random.nextBytes(bArr);
            SharedPreferences sharedPreferences2 = this.A00;
            if (sharedPreferences2 == null) {
                sharedPreferences2 = this.A02.A00("chatCounts");
                this.A00 = sharedPreferences2;
            }
            sharedPreferences2.edit().putString("thread_user_secret", Base64.encodeToString(bArr, 2)).apply();
        }
        return Base64.decode(sharedPreferences.getString("thread_user_secret", ""), 2);
    }
}
