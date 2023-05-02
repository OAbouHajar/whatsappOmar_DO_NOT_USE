package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.4Y2  reason: invalid class name */
public class AnonymousClass4Y2 {
    public static void A00(Context context, int i2) {
        float f2;
        StringBuilder A0r = AnonymousClass000.A0r("android.resource://");
        A0r.append(context.getPackageName());
        A0r.append("/");
        Uri parse = Uri.parse(AnonymousClass000.A0l(A0r, R.raw.ptt_end_fast));
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(C91834gZ.A00);
        mediaPlayer.setAudioStreamType(i2);
        if (i2 == 3) {
            f2 = 0.35f;
        } else {
            if (i2 == 0) {
                f2 = 0.2f;
            }
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
        }
        mediaPlayer.setVolume(f2, f2);
        try {
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e2) {
            Log.e("SequentialVoiceMemoPlayer/playEndTone ", e2);
        }
    }

    public static void A01(Context context, C14870pt r4, Runnable runnable, int i2) {
        float f2;
        StringBuilder A0r = AnonymousClass000.A0r("android.resource://");
        A0r.append(context.getPackageName());
        A0r.append("/");
        Uri parse = Uri.parse(AnonymousClass000.A0l(A0r, R.raw.ptt_middle_fast));
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(C91834gZ.A00);
        mediaPlayer.setAudioStreamType(i2);
        if (i2 == 3) {
            f2 = 0.35f;
        } else {
            if (i2 == 0) {
                f2 = 0.2f;
            }
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
            r4.A0L(runnable, 600);
        }
        mediaPlayer.setVolume(f2, f2);
        try {
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
            r4.A0L(runnable, 600);
        } catch (IOException e2) {
            Log.e("SequentialVoiceMemoPlayer/playMiddleTone ", e2);
        }
    }
}
