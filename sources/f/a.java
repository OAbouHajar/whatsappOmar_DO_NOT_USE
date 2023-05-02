package f;

import android.view.View;
import android.view.ViewTreeObserver;

public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f1732a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f1733b;

    public a(View view, Runnable runnable) {
        this.f1732a = view;
        this.f1733b = runnable;
    }

    public final void onGlobalLayout() {
        String str = "ۙ۬ۨۤۜۗ۠ۦۥۘۘۖۧۘۗ۠ۥۘۗۡۘۘۥۖۦ";
        while (true) {
            switch ((str.hashCode() ^ 193) ^ 75084871) {
                case -1487332486:
                    this.f1732a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    str = "ۛۦۥۦ۫ۥۘۚۢۡۘۖۜ۟۬ۦۡۘۡۖۨۘۙۖۘ";
                    break;
                case 16219611:
                    this.f1733b.run();
                    str = "ۥۧۜۘۤۘۥۨ۬ۢۚۡۦۤ۠ۗۧۖۡۦۥ۟۬ۗۚۢۨۘ";
                    break;
                case 305675038:
                    return;
                case 1698737211:
                    str = "ۥۜۡۥۦۡۘۛۦۨۘۢۦۜۘۥ۬ۧۡۦۤ";
                    break;
            }
        }
    }
}
