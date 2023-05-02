package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Ls  reason: invalid class name and case insensitive filesystem */
public class C25941Ls {
    public static final int[] A03 = {1, 2, 3, 5, 14, 30};
    public final C18900xR A00;
    public final C16440t3 A01;
    public final C15860rz A02;

    public C25941Ls(C18900xR r1, C16440t3 r2, C15860rz r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public int A00() {
        C15860rz r9 = this.A02;
        long j2 = ((SharedPreferences) r9.A01.get()).getLong("software_expiration_last_warned", 0);
        long A002 = this.A01.A00();
        if (j2 > A002) {
            j2 = 0;
        }
        if (86400000 + j2 > A002) {
            Log.i("software/expiration/suppress/24h");
        } else {
            Date A012 = this.A00.A01();
            int time = ((int) ((A012.getTime() - A002) / 86400000)) + 1;
            int time2 = ((int) ((A012.getTime() - j2) / 86400000)) + 1;
            int[] iArr = A03;
            int length = iArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr[i2];
                if (time > i3 || time2 <= i3) {
                    i2++;
                } else {
                    r9.A0K().putLong("software_expiration_last_warned", A002).apply();
                    return time;
                }
            }
        }
        return -1;
    }

    public void A01(long j2) {
        SharedPreferences.Editor editor;
        if (1688663929000L >= j2) {
            C15860rz r7 = this.A02;
            long j3 = ((SharedPreferences) r7.A01.get()).getLong("client_expiration_time", 0);
            long A002 = this.A01.A00() + TimeUnit.DAYS.toMillis(3);
            if (j3 == 0 || (j2 < j3 && j3 > A002)) {
                long max = Math.max(j2, A002);
                StringBuilder sb = new StringBuilder("wa-shared-prefs/set-client-expiration-time/");
                sb.append(max);
                sb.append(" ");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(max);
                sb.append(simpleDateFormat.format(instance.getTime()));
                Log.i(sb.toString());
                editor = r7.A0K().putLong("client_expiration_time", max);
            } else if (j3 > 0 && j2 == -1) {
                Log.i("wa-shared-prefs/clear-client-expiration-time");
                editor = r7.A0K().remove("client_expiration_time");
            } else {
                return;
            }
            editor.apply();
        }
    }
}
