package X;

import android.content.Context;
import android.media.AudioManager;
import java.util.UUID;

/* renamed from: X.4eR  reason: invalid class name and case insensitive filesystem */
public final class C90604eR {
    public static final UUID A00 = new UUID(-2129748144642739255L, 8654423357094679310L);
    public static final UUID A01 = new UUID(1186680826959645954L, -5988876978535335093L);
    public static final UUID A02 = new UUID(-7348484286925749626L, -6083546864340672619L);
    public static final UUID A03 = new UUID(0, 0);
    public static final UUID A04 = new UUID(-1301668207276963122L, -6645017420763422227L);

    public static int A00(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static long A01(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long A02(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : C13690nt.A09(j2);
    }
}
