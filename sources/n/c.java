package n;

import android.media.MediaPlayer;
import android.os.Handler;
import com.obwhatsapp.youbasha.ui.activity.FMNewsActivity;

public final /* synthetic */ class c implements MediaPlayer.OnPreparedListener {

    /* renamed from: a  reason: collision with root package name */
    public final FMNewsActivity f1851a;

    public /* synthetic */ c(FMNewsActivity fMNewsActivity) {
        this.f1851a = fMNewsActivity;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        long j2 = 0;
        String str = "ۛۙۘۨۤ۬ۜۤۥۘۨ۠ۥۘۢۜۨۗۗۨۘۤۗۨۖۢۦۛ۠ۜۘ";
        Handler handler = null;
        FMNewsActivity fMNewsActivity = null;
        while (true) {
            switch ((str.hashCode() ^ 497) ^ -2094465388) {
                case -1662220847:
                    fMNewsActivity.getClass();
                    str = "ۥۥۦۘۚ۠۫ۧۛۦۘۗۢۨۘۥۙۖ۬ۧۖۘۧۨۨ۫ۗۨۘ";
                    break;
                case -1497424547:
                    j2 = (long) mediaPlayer.getDuration();
                    str = "ۙ۫ۙۚۧۙۗۚۗۧۡۗۧۘۦۦۥۖۢۘ۬ۗۙۤ۠ۘۦۘ";
                    break;
                case -1279131588:
                    str = "ۧۨۥۡۜۜۘۘۤۙۖۛۨۘۗۦۘۖ۠ۥۤ۠ۥۘۜۚۘ";
                    break;
                case -1175618772:
                    fMNewsActivity = this.f1851a;
                    str = "۟ۧ۬ۤۢۤۤۗۦۘۘۦۧۦۡۤۙۥۗ";
                    break;
                case -861988147:
                    return;
                case -850418281:
                    int i2 = FMNewsActivity.f1243h;
                    str = "ۡۜۡۜ۫ۙۦۧۖۘۢ۟ۨۜ۫ۛۚۦۤۦ۬ۦۨۦۤۡۡۥۘ";
                    break;
                case 96320654:
                    handler = new Handler(fMNewsActivity.getMainLooper());
                    str = "ۨۦ۬ۧۛۚۗۚۗۡۦۥۤۥۨۧۘۖۨۘۛۗۗۙ۟ۦ";
                    break;
                case 727764754:
                    handler.postDelayed(new d(fMNewsActivity, mediaPlayer, j2, handler), 10);
                    str = "ۢ۫ۨۨ۟ۗۘۦۖۡۛۛۜۨۖۘ";
                    break;
                case 845626637:
                    str = "ۡۙۧۡ۫ۡ۠ۜۜۖۧۖۚۗۙۜۙۦۜۙۥۡ۬";
                    break;
                case 1832601091:
                    fMNewsActivity.f1247d.setMax((int) j2);
                    str = "ۜ۫۟۬ۡ۫ۧ۟ۜۚ۠۟۫ۤۡ۟۬ۥ";
                    break;
            }
        }
    }
}
