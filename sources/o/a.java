package o;

import com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pattern;
import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.listener.PatternLockViewListener;
import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils.PatternLockUtils;
import java.util.List;

public final class a implements PatternLockViewListener {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f1861a;

    public a(Pattern pattern) {
        this.f1861a = pattern;
    }

    public final void onCleared() {
        String str = "ۗۗۜۘۡۚۖۘۨۦۜۘۦۚۘۡۦۘۦۗۨۛۡۡ";
        while (true) {
            switch ((str.hashCode() ^ 594) ^ 2002124334) {
                case -1584625894:
                    return;
                case -182370792:
                    str = "ۥۜۧۘۥۧ۠ۧۗۡۘۗ۟ۙۛۨۛ۬ۘ";
                    break;
            }
        }
    }

    public final void onComplete(List list) {
        String str = "ۧۖ۟۠ۖۥۘ۠ۙۗۗۤۘۘۘۤۛۡۢ۫";
        String str2 = null;
        Pattern pattern = null;
        while (true) {
            switch ((str.hashCode() ^ 961) ^ 1887945725) {
                case -1908479651:
                    return;
                case -1828677088:
                    str = "ۜۜۨۨۖۧۘۚۜۨۘۖۧۦۚۤۖۘ۟ۜ۬ۜۜۙۧۥۨ۟ۢۥ";
                    break;
                case -1785020720:
                    String str3 = "ۦۨ۬۫ۘۜۚ۟ۘۘۦۦۦۘۢۨۘۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -2142989646) {
                            case 1234161655:
                                str = "ۨۥۢۢۙۜۜۤۘۘۘۡۚۜۜۨۘۗۧ۬ۧۗۦۘ۠ۚۦ";
                                continue;
                            case 1833914864:
                                if (!pattern.f1287a.equals(str2)) {
                                    str3 = "ۜۚ۟ۧ۟۬ۗۨۨۘۖ۬ۤۖۡۤۛۦۙ۫ۨۧۢ۬";
                                    break;
                                } else {
                                    str3 = "ۜ۬ۨۘۚ۬ۦۘۜۦۡۖۡۚ۠ۙۙۘۥۛ۟ۜۘ";
                                    break;
                                }
                            case 1976008457:
                                str = "ۤ۟ۥۚ۠ۚۡۗۖۚۢۘۘۥۛ۫ۡۚۜ";
                                continue;
                            case 2120984515:
                                str3 = "۬ۚۦۥ۠ۤۚۧ۬ۘۙۢۨۖۜ";
                                break;
                        }
                    }
                    break;
                case -950162392:
                    str2 = PatternLockUtils.patternToSha1(pattern.f1288b, list);
                    str = "ۢۛۥۥ۠ۙۙۨۙۘۥۖۧۗۧ۟۟ۢۡۖۗۡ۟ۚ";
                    break;
                case -766237071:
                    str = "ۜۧۢۧۧۥ۫۫ۛ۫ۙۥۘۥ۟ۤ";
                    break;
                case -740365747:
                    pattern.change_pass(str2);
                    str = "۬ۡ۟۬ۚۥۘۧۙۖۘ۫ۗۦۨۧۜۘۗۧۤۜۤۚ۠ۡۗۙ۬ۗ";
                    break;
                case -516200635:
                case 2037611710:
                    str = "ۨۗ۬ۧۜۡۘۢۨ۫ۦ۫ۡۘ۟ۥ۟";
                    break;
                case 299211291:
                    pattern.auth_failed();
                    str = "۫ۢ۫۟۟ۤۜۧۨۘۖۚۧۗۛۢۢۥۘ";
                    break;
                case 866304854:
                    str = "ۡۦۜۡۢۙ۫ۖۨۖۧۜۤۥ۠ۗۖۘ۟ۦۤ";
                    pattern = this.f1861a;
                    break;
                case 887099984:
                    pattern.auth_success();
                    str = "ۦ۟ۤۖۡۛۨۦۜۘ۟ۥۘ۬ۚ۠ۖ۠ۨۘ";
                    break;
                case 1176468627:
                    pattern.f1288b.clearPattern();
                    str = "ۨۗ۬ۧۜۡۘۢۨ۫ۦ۫ۡۘ۟ۥ۟";
                    break;
                case 1702988330:
                    String str4 = "ۚۦۖۘۖۚۧ۠۬ۦ۬۫ۜۜۖ۠۟ۖۘ";
                    while (true) {
                        switch (str4.hashCode() ^ -1197267475) {
                            case -965162277:
                                str = "ۨۙۗۡۛۜۘ۟۟ۥۘ۬ۦۖۛ۬ۗۚ۬ۜ";
                                continue;
                            case 1026773037:
                                str4 = "ۧۥۗۥۥ۟ۛۥۨۨۦ۬۠ۨۖ۬۠ۢ۬";
                                break;
                            case 1131564254:
                                if (!Pattern.b(pattern).getIsChangePass()) {
                                    str4 = "ۛۛۥۘۢۨۡۧۚ۬۫ۚۜۙۤ۟ۛۧۢۧ۫ۘۘ۬۫ۡۘ";
                                    break;
                                } else {
                                    str4 = "ۛۗۡۛ۬۟ۢۧ۫ۖۢۢۚ۫ۡۘۘۡۙۙۛ۟ۙۦۥۖ۬";
                                    break;
                                }
                            case 1378596373:
                                str = "ۗۖۥۢۚۢ۟ۘۥۥۦۤۗۗۧۤۨۦ۬ۢ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public final void onProgress(List list) {
        String str = "ۢ۬ۙۘۦۙ۬ۛۥۘۜۖۥۘۧۡۘۛۜ۠";
        while (true) {
            switch ((str.hashCode() ^ 237) ^ 1540927308) {
                case -651388883:
                    str = "ۘۜۖۘۗۨۜۘۜۨۡۘ۫ۛ۠ۛۛۨۘۚۖۢ۠ۥۥۙۗۡ۠ۨۘ";
                    break;
                case -94474090:
                    return;
                case 1262911024:
                    str = "۬ۦ۬ۘۧۥۘۖۚۤۢۧۘۘۨۗۖۜۥۚۚ۟ۗ";
                    break;
            }
        }
    }

    public final void onStarted() {
        String str = "ۨۧۨۘ۬ۜۛ۬ۚۜۘۢۧۜۘ۠۟ۖ";
        while (true) {
            switch ((str.hashCode() ^ 836) ^ 1906213001) {
                case -1683681187:
                    str = "ۜ۫ۖۘ۠ۚۘۤ۫ۧۖۥ۠ۜۧ۫ۨ۠ۨۘۦۤۘ";
                    break;
                case -1610715555:
                    return;
            }
        }
    }
}
