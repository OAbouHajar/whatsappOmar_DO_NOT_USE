package X;

import android.app.Activity;
import android.app.Application;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.0ya  reason: invalid class name and case insensitive filesystem */
public class C19530ya implements Application.ActivityLifecycleCallbacks {
    public static long A00(C14600pS r3, AnonymousClass2KS r4) {
        r3.Afr(0, R.string.str13db);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C34621kZ r0 = r4.A0H.A00.A2C;
        r0.A0F();
        r0.A0D();
        AnonymousClass2KU r1 = r4.A00;
        if (r1 != null) {
            r1.A01 = null;
            r1.A00 = null;
            r1.A06(true);
        }
        return elapsedRealtime;
    }

    public static void A01(Activity activity, C111545gY r6) {
        C434920f.A03(activity, R.color.color064b);
        WaBloksActivity waBloksActivity = r6.A03;
        View A05 = AnonymousClass00T.A05(waBloksActivity, R.id.wabloks_screen_toolbar);
        C18450wi.A0B(A05);
        Toolbar toolbar = (Toolbar) A05;
        C447725m r2 = new C447725m(AnonymousClass00T.A04(waBloksActivity, R.drawable.ic_back), r6.A02);
        r2.setColorFilter(AnonymousClass00T.A00(activity, R.color.color090b), PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon((Drawable) r2);
        toolbar.setTitleTextColor(AnonymousClass00T.A00(activity, R.color.color06ac));
        toolbar.setBackgroundColor(AnonymousClass00T.A00(activity, R.color.color064b));
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
