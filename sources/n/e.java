package n;

import android.animation.ValueAnimator;
import android.app.Activity;
import com.obwhatsapp.youbasha.ui.activity.SwipeBackController;
import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView;

public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f1856a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1857b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1858c;

    public /* synthetic */ e(Object obj, Object obj2, int i2) {
        this.f1856a = i2;
        this.f1857b = obj;
        this.f1858c = obj2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        String str = "۠ۘۘۘۘۢۥۘۢۜۚۗۛۦۡۧ۠۟ۦ۠ۥۘۡ۫ۡۧ۠ۚ";
        PatternLockView.DotState dotState = null;
        PatternLockView patternLockView = null;
        int i2 = 0;
        Activity activity = null;
        SwipeBackController swipeBackController = null;
        Object obj = null;
        Object obj2 = null;
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 139) ^ 1498120578) {
                case -1937271394:
                    swipeBackController.b(-i2);
                    str = "ۧۧۚۢۗۛۤۡۜ۫۟ۛۧۥۘۤۤۨۘ۫ۥۜۘ۫ۛۖۜ۬ۦ";
                    break;
                case -1796251341:
                    str = "ۖۛۨۥۚۖۘ۠ۗۦۘ۟۟۬ۙۥۥۘ";
                    dotState = (PatternLockView.DotState) obj2;
                    break;
                case -1717976218:
                    swipeBackController.getClass();
                    str = "ۜۙۙ۠ۧ۬ۤۚۙ۬ۦۙۦۛ";
                    break;
                case -1393471887:
                    switch (i3) {
                        case 0:
                            str = "ۧۗۧۦ۬ۖۚۛ۠۫ۧۨۘۦۛۜۘ";
                            break;
                        default:
                            str = "ۧۧۙۧۥۡ۠۬ۦۘۤۥۘۜۡ۟ۧۥۨ";
                            break;
                    }
                case -1178975494:
                    str = "ۢۢۡۘۥۚۗ۠ۧۛۛۤ۟ۤ۫۠۠۟ۡۡۤۥۘۥ۟ۗ";
                    break;
                case -1172531339:
                    swipeBackController.a((float) i2);
                    str = "ۢ۟ۛۢۘ۫ۚۤ۟ۦۘۗۘۖۘۜۙ";
                    break;
                case -1136752938:
                    str = "۬ۛۥۢ۠ۘ۟ۗۛ۠ۡۙۙۖۢۚۤۜۘۦ۬۬ۜۤ";
                    break;
                case -1052569567:
                    int i4 = PatternLockView.H;
                    str = "ۜۘۜۛۥۧۢۚۥۘ۟۫ۦۘۧۥۙ";
                    break;
                case -1007088299:
                    str = "ۥۖۦ۟ۘۚۢۦۥۘۡۤۘۘۘ۫ۧۡ۠۠ۘۨۢۦۡۖۘ";
                    break;
                case -974296137:
                    activity.finish();
                    str = "ۜۤۨۘۗۨۥۡۘۥۢۘۘ۬ۗۨۘ۬۠ۤۡۜۢۢۜۜ";
                    break;
                case -814711349:
                    str = "ۚۛۢۦۢۢۙۢۙۛۛۘۘۥ۬ۙۘۘۘۧۦۖۗۨۜۘۢ";
                    activity = (Activity) obj2;
                    break;
                case -706456266:
                    dotState.f1329c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    str = "۫ۧ۟۫ۤۙ۠۠ۥ۠ۡ۬ۢ۟ۘۘ۫۠ۢۨۨۙ۬ۦۖۘ";
                    break;
                case -430708420:
                    patternLockView.getClass();
                    str = "ۙۙ۠۠۬ۨ۬ۚۡۘۘۡۧۤۢۚ";
                    break;
                case -378534746:
                case 2146124121:
                    return;
                case -78637677:
                    str = "۫ۡۜۘۜ۬ۗ۠۠ۦۧۨۜۘۖۦۗ";
                    i2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    break;
                case -31310582:
                    str = "ۚۦۥۘۧۡۧۧۖۘ۟ۙۙۜۛۛۘۡ۠ۢۗۧۗۗۥۘۨ۠۠";
                    swipeBackController = (SwipeBackController) obj;
                    break;
                case 5119362:
                    str = "ۙ۠ۢۦۛۗۢۧۡۡۡۜ۟ۤ۟ۛۨۘۘۥۧۘ";
                    i3 = this.f1856a;
                    break;
                case 87249279:
                    obj = this.f1857b;
                    str = "ۖۚۛۤۡۚۚ۬ۨۘ۬ۧۨۨ۠ۥۘۧۡۘۘۜۦۖۡۧۨۘ";
                    break;
                case 172381343:
                    obj2 = this.f1858c;
                    str = "ۗۦۧۜۦ۠ۤۚۥۡۚۥۧۜۘۨۜ۠ۧ۬ۚۙ۫ۙ";
                    break;
                case 446546064:
                    String str2 = "ۛ۫ۧۗۡۙۡۦۖۘۡۙۨۘۢ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 1473492359) {
                            case -1106734994:
                                str = "ۜۤۨۘۗۨۥۡۘۥۢۘۘ۬ۗۨۘ۬۠ۤۡۜۢۢۜۜ";
                                continue;
                            case -950634409:
                                str2 = "ۛ۫ۘ۠ۦۡۛۛۧۢۤۖۘۡ۬ۖۗۡۥ۬ۥۨۘۦۤۥۘۦۜۖ";
                                break;
                            case 189859673:
                                str = "ۛۧ۠ۘۨۨۤۧۡۨۦۖۦۗۧ۟ۗۜۖۨ";
                                continue;
                            case 1042998679:
                                if (Math.abs(i2) < swipeBackController.f1253b) {
                                    str2 = "۫ۢۡۨۜۥ۠۬ۡۘۙۤۙۙۦۢۙۚۡۘ";
                                    break;
                                } else {
                                    str2 = "۬۟ۖۘۥۨ۟ۘۘۥۘۛۥ۬ۥۗۢ۬ۘۛ۫ۜۘۤۚ۫ۡ۠ۤ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1044047256:
                    str = "ۨ۠ۜ۫ۤۗۗۖۗۚۡۘۡ۟ۚ۟ۧ۠ۚۖ";
                    break;
                case 1318610825:
                    String str3 = "ۗۥۖۦۢۖۘۜۤۜۘۤۧ۠ۧۧ۫ۙۘۤۢ۫ۜۘۡۥۘۗ۬ۡ";
                    while (true) {
                        switch (str3.hashCode() ^ 1649571228) {
                            case -1782020801:
                                str = "ۧۛۨۘۗۥۙۚۜۨۘۛ۫۟۫ۢۤۜ۫۬";
                                continue;
                            case -1296335057:
                                str3 = "ۨۥۤ۬ۙۡۘۘۡۦ۠ۡۡۘ۫ۘۢ";
                                break;
                            case 515601334:
                                if (!swipeBackController.f1252a) {
                                    str3 = "ۨۥۨ۠ۗۦۨۦۧ۫ۥۜۧۙۧۧۘۚۚۗ۠ۢۜۡۘ";
                                    break;
                                } else {
                                    str3 = "ۙۚ۟ۚۘۗۨۜۜۘۖۦۖۥۛۘۗۥۨ";
                                    break;
                                }
                            case 1465427671:
                                str = "ۢۙۖۘۖۥۜۘۖۡۢۧۦۨۦۧ";
                                continue;
                        }
                    }
                    break;
                case 1534221505:
                    patternLockView.invalidate();
                    str = "ۢۨۘۛۦ۬ۛۦۘۢۜۖۡۖۢ";
                    break;
                case 1855457391:
                    swipeBackController.b(i2);
                    str = "ۥۖۦ۟ۘۚۢۦۥۘۡۤۘۘۘ۫ۧۡ۠۠ۘۨۢۦۡۖۘ";
                    break;
                case 2035257973:
                    str = "۠۫ۡۖۗۧۗۖۨۘ۫ۜۜ۠ۧۨ۬۟ۦۘ";
                    patternLockView = (PatternLockView) obj;
                    break;
            }
        }
    }
}
