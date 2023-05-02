package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.3AW  reason: invalid class name */
public class AnonymousClass3AW {
    public int A00 = 2;
    public C15830rv A01;
    public Double A02;
    public Double A03;
    public String A04;
    public boolean A05;
    public final Rect A06;
    public final C15830rv A07;
    public final Integer A08;

    public AnonymousClass3AW(Rect rect, C15830rv r3, Integer num) {
        this.A07 = r3;
        this.A08 = num;
        this.A06 = rect;
    }

    public AnonymousClass3AW(View view, C15830rv r9, Integer num) {
        this.A07 = r9;
        this.A08 = num;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect A0J = AnonymousClass000.A0J();
        int i2 = iArr[0];
        A0J.left = (int) ((((float) i2) * 1.0f) + 0.5f);
        A0J.top = (int) ((((float) iArr[1]) * 1.0f) + 0.5f);
        A0J.right = (int) ((((float) (i2 + view.getWidth())) * 1.0f) + 0.5f);
        A0J.bottom = (int) ((((float) (iArr[1] + view.getHeight())) * 1.0f) + 0.5f);
        this.A06 = A0J;
    }

    public static AnonymousClass3AW A00(View view, C15830rv r3, int i2) {
        AnonymousClass3AW r1 = new AnonymousClass3AW(view, r3, Integer.valueOf(i2));
        r1.A04 = C004601z.A0L(view);
        return r1;
    }

    public Intent A01(Activity activity) {
        Integer num = null;
        Integer valueOf = C15450qv.A03() ? Integer.valueOf(activity.getWindow().getStatusBarColor()) : null;
        if (C15450qv.A07()) {
            num = Integer.valueOf(activity.getWindow().getNavigationBarColor());
        }
        Integer num2 = this.A08;
        String str = this.A04;
        Rect rect = this.A06;
        boolean z2 = this.A05;
        C15830rv r9 = this.A01;
        Double d2 = this.A02;
        Double d3 = this.A03;
        C15830rv r5 = this.A07;
        int i2 = this.A00;
        Intent A09 = C13680ns.A09();
        A09.setClassName(activity.getPackageName(), "com.obwhatsapp.quickcontact.QuickContactActivity");
        if (num2 != null) {
            A09.putExtra("profile_entry_point", num2);
        }
        if (str != null) {
            A09.putExtra("transition_name", str);
        }
        if (valueOf != null) {
            A09.putExtra("status_bar_color", valueOf);
        }
        if (num != null) {
            A09.putExtra("navigation_bar_color", num);
        }
        if (r9 != null) {
            A09.putExtra("gjid", r9.getRawString());
        }
        if (d2 != null) {
            A09.putExtra("location_latitude", d2);
        }
        if (d3 != null) {
            A09.putExtra("location_longitude", d3);
        }
        A09.putExtra("show_get_direction", z2);
        A09.putExtra("jid", C16030sJ.A03(r5));
        A09.putExtra("animation_style", i2);
        A09.setSourceBounds(rect);
        return A09;
    }

    public void A02(Activity activity) {
        if (activity != null) {
            activity.startActivity(A01(activity), AnonymousClass09N.A00().A03());
            activity.overridePendingTransition(0, 0);
        }
    }
}
