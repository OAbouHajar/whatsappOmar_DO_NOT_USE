package n;

import android.media.MediaPlayer;
import android.os.Handler;
import com.obwhatsapp.youbasha.ui.activity.FMNewsActivity;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final MediaPlayer f1852a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1853b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f1854c;

    /* renamed from: d  reason: collision with root package name */
    public final FMNewsActivity f1855d;

    public d(FMNewsActivity fMNewsActivity, MediaPlayer mediaPlayer, long j2, Handler handler) {
        this.f1855d = fMNewsActivity;
        this.f1852a = mediaPlayer;
        this.f1853b = j2;
        this.f1854c = handler;
    }

    public final void run() {
        MediaPlayer mediaPlayer = this.f1852a;
        String str = "۫ۨۤۖۙۚۚۜ۫ۜۢۦۘ۟ۥۜۘۥ۟۫ۤۦۡۛۛۘۘ";
        while (true) {
            try {
                switch (str.hashCode() ^ 1549123683) {
                    case -1678310404:
                        this.f1855d.f1247d.setProgress(mediaPlayer.getCurrentPosition());
                        this.f1854c.postDelayed(this, 10);
                        return;
                    case -850180414:
                        if (((long) mediaPlayer.getCurrentPosition()) >= this.f1853b) {
                            str = "۟ۖۦۙۜۙۙۘۘۚ۬ۨۜ۬ۘۜۘۨۘ";
                            break;
                        } else {
                            str = "ۚۨ۠ۖۦۜۢۡۗۦۗۚ۫ۥ۠ۚ۟ۨ";
                            break;
                        }
                    case 1047453811:
                        return;
                    case 2044259371:
                        str = "ۜ۟ۜۚۙۙۥ۟۠ۤۛۜ۠۟ۤۘ۫ۗ";
                        break;
                }
            } catch (Exception e2) {
                return;
            }
        }
    }
}
