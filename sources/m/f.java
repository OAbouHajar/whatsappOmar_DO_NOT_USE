package m;

import com.obwhatsapp.youbasha.ui.YoSettings.HomeHeader;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f1811a;

    /* renamed from: b  reason: collision with root package name */
    public final HomeHeader f1812b;

    public /* synthetic */ f(HomeHeader homeHeader, int i2) {
        this.f1811a = i2;
        this.f1812b = homeHeader;
    }

    public final void run() {
        int i2 = 0;
        HomeHeader homeHeader = null;
        String str = "ۢۦ۟۟ۥۛ۫ۥۢ۠ۦۦۗ۫ۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 671) ^ 95334068) {
                case -1474803575:
                    homeHeader = this.f1812b;
                    str = "ۥۦۨۗۜۢۛۥۖۛۛ۫ۜ۠ۥۘ";
                    break;
                case -1293077401:
                    switch (i2) {
                        case 0:
                            str = "۬۫ۜۘ۟ۢ۫ۚۡۖۚۤۢۧۧۧ";
                            break;
                        default:
                            str = "ۘۛۡ۬۠ۘۘۤۜۦۘۙۘۥ۫ۧۙۡۘۦۘ۟ۡۖۨۘ۠ۙۗ";
                            break;
                    }
                case -152658445:
                    homeHeader.updatePreview();
                    str = "ۢۛۨ۟۫۠ۛۡۜ۬ۗۜ۠ۜۥۗۛۙۤ۬ۛۙۢۖۘ۟ۥۢ";
                    break;
                case -51947662:
                case 946567009:
                    return;
                case 56079926:
                    str = "ۡ۫ۗۥۙۜۛۥۡۘۤۗۘۘ۫ۚۘۦ۟۬۟ۦۚۧۨۘ";
                    break;
                case 862571190:
                    i2 = this.f1811a;
                    str = "ۗۦ۫ۖۧۜۤ۬۠ۖۧۖۘ۫ۨۛ";
                    break;
                case 1641350554:
                    homeHeader.updatePreview();
                    str = "ۙۖۗ۟ۨۜۤۤۡ۟ۡۚۨ۫۬";
                    break;
                case 1873227645:
                    str = "ۘۖۧۘۙۦۖۘۖۨۗۗۧۘ۠۟ۨۘ۟۟ۨ";
                    break;
            }
        }
    }
}
