package p;

import android.animation.ValueAnimator;
import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final PatternLockView f2365a;

    /* renamed from: b  reason: collision with root package name */
    public final PatternLockView.DotState f2366b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2367c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2368d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2369e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2370f;

    public /* synthetic */ a(PatternLockView patternLockView, PatternLockView.DotState dotState, float f2, float f3, float f4, float f5) {
        this.f2365a = patternLockView;
        this.f2366b = dotState;
        this.f2367c = f2;
        this.f2368d = f3;
        this.f2369e = f4;
        this.f2370f = f5;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        String str = "ۖۚ۠ۢۤۥۘ۠ۦۗۛ۠ۥۖۢۦۤۢۗۦۜ۬ۤ۠۫ۜۤ";
        float f2 = 0.0f;
        PatternLockView.DotState dotState = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        PatternLockView patternLockView = null;
        while (true) {
            switch ((str.hashCode() ^ 690) ^ -23808509) {
                case -1979848719:
                    return;
                case -1497431679:
                    str = "ۘۦۢۢۡۗۖۙۦۤۖۗۢۜ۟ۖۢۨۤۛۨۘ";
                    f4 = this.f2367c;
                    break;
                case -1391617634:
                    int i2 = PatternLockView.H;
                    str = "۟ۚۨۘۖۛۥ۟ۗۚ۫۟ۚ۬ۡۖۢۤۥۘۖۥ۫ۖ۠ۘ";
                    break;
                case -1369467042:
                    str = "ۧۢۖۘ۠ۘۤۚۛۘۥۨۥۘۨ۠ۨۘۙۧۜۘۢۧۚ";
                    patternLockView = this.f2365a;
                    break;
                case -930948498:
                    patternLockView.invalidate();
                    str = "ۜۗۥۤۖۡ۫ۡۢۡۙۡۜ۫ۨۘۗۥ۬ۦۧ۟ۦۧۢۢۧۥ";
                    break;
                case -859168858:
                    f2 = this.f2369e;
                    str = "ۦۖ۬ۦۤۚۡ۠ۢۡۙ۫ۘۧۘ۫ۤۙۗۗ۠ۜۢۦۘ";
                    break;
                case -567965611:
                    str = "ۦۗۜۘ۫ۘۥۘۤۢۢۘۘۧۗۧۡۜۘۘ";
                    f3 = this.f2368d;
                    break;
                case -542433632:
                    dotState.f1331e = (this.f2370f * f6) + (f5 * f2);
                    str = "ۦۘۖۘۘۖۨۦۚۚۚ۟ۘۘۦۧۙۧ۟ۥۘۢۘۘ۬۠ۡۘ";
                    break;
                case -178378281:
                    str = "ۧۤۖۘۛ۫ۦۚۜ۟ۜۦۧۙۧۨۜ۠ۦ۫ۡ۠ۛۙ۬";
                    f6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    break;
                case -140049302:
                    str = "ۛۛۨۘ۠ۜۘۗۧۢۧۜ۫ۧۙۜۡۧۡ";
                    dotState = this.f2366b;
                    break;
                case 326029212:
                    str = "ۧۚۜ۠۟ۡۙ۠ۨۘۧۥۨۗ۬ۘۘۙۧۘۤۘۛۢۥ";
                    break;
                case 488626482:
                    str = "ۛۘۤۧۘۥۘۚ۫ۦۘۨۡ۬ۡ۬ۘۘ";
                    f5 = 1.0f - f6;
                    break;
                case 614663924:
                    patternLockView.getClass();
                    str = "۟ۜ۠ۧۤۘۜ۫ۜۘۙ۟ۥۘۧۦ۫۟ۧۙ۬ۛ۠ۜۛۥۗۚ۟";
                    break;
                case 1636124241:
                    str = "ۦۚۜ۟ۗۜۘۚۦ۬ۛ۬ۡۘۖۜۨۘۛۗۦۜۨۡ";
                    break;
                case 2135218992:
                    dotState.f1330d = (f3 * f6) + (f4 * f5);
                    str = "ۢ۟ۖۘ۫ۡۡۘۦۨۨۘ۬ۜۦۘۡۦ۟ۜۥۥۙۙۙ";
                    break;
            }
        }
    }
}
