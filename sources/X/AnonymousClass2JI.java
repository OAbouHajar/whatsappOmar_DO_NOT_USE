package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import com.facebook.redex.IDxMFunctionShape409S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.WaEditText;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2JI  reason: invalid class name */
public abstract class AnonymousClass2JI extends PopupWindow {
    public int A00 = 0;
    public int A01 = -1;
    public boolean A02;
    public final Activity A03;
    public final C16300so A04;
    public final C15430qs A05;
    public final AnonymousClass01V A06;
    public final C15860rz A07;
    public final C23061Ai A08;
    public final Runnable A09;
    public final Set A0A;

    public AnonymousClass2JI(Activity activity, C16300so r4, C15430qs r5, AnonymousClass01V r6, C15860rz r7, C23061Ai r8) {
        super(activity);
        this.A03 = activity;
        this.A08 = r8;
        this.A04 = r4;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = r5;
        this.A0A = new HashSet();
        this.A09 = new RunnableRunnableShape2S0100000_I0_1(r5, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r2 = r6.y;
        r1 = r5[1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(android.graphics.Point r6, android.view.View r7) {
        /*
            r0 = 2
            int[] r5 = new int[r0]
            r7.getLocationOnScreen(r5)
            int r4 = r6.x
            r3 = 0
            r2 = r5[r3]
            r1 = 1
            if (r4 < r2) goto L_0x0023
            int r0 = r7.getWidth()
            int r2 = r2 + r0
            if (r4 > r2) goto L_0x0023
            int r2 = r6.y
            r1 = r5[r1]
            if (r2 < r1) goto L_0x0023
            int r0 = r7.getHeight()
            int r1 = r1 + r0
            if (r2 > r1) goto L_0x0023
            r3 = 1
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JI.A02(android.graphics.Point, android.view.View):boolean");
    }

    public int A03(int i2) {
        SharedPreferences sharedPreferences;
        String str;
        int i3;
        SharedPreferences.Editor A0K;
        String str2;
        Point point = new Point();
        Activity activity = this.A03;
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        int i4 = point.y;
        int i5 = activity.getResources().getConfiguration().orientation;
        if (i5 == 1) {
            sharedPreferences = (SharedPreferences) this.A07.A01.get();
            str = "keyboard_height_portrait";
            i3 = sharedPreferences.getInt(str, 0);
        } else if (i5 != 2) {
            i3 = 0;
        } else {
            sharedPreferences = (SharedPreferences) this.A07.A01.get();
            str = "keyboard_height_landscape";
            i3 = sharedPreferences.getInt(str, 0);
        }
        int min = (this.A00 != 1 || i2 <= 0 || A09()) ? i3 > 0 ? Math.min(i4 >> 1, i3) : (i4 * 3) >> 3 : Math.min(i4 >> 1, i2);
        int i6 = activity.getResources().getConfiguration().orientation;
        if (i6 != 1) {
            if (i6 == 2) {
                A0K = this.A07.A0K();
                str2 = "keyboard_height_landscape";
            }
            return min;
        }
        A0K = this.A07.A0K();
        str2 = "keyboard_height_portrait";
        A0K.putInt(str2, min).apply();
        return min;
    }

    public void A04() {
        this.A01 = A03(-1);
    }

    public void A05() {
        C15430qs r2 = this.A05;
        ((View) r2).getHandler().removeCallbacks(this.A09);
        ((KeyboardPopupLayout) r2).A06 = true;
    }

    public void A06() {
        this.A02 = false;
    }

    public final void A07(AnonymousClass5OX r5, WaEditText waEditText, Runnable runnable) {
        InputMethodManager A0Q = this.A06.A0Q();
        waEditText.requestFocus();
        Handler handler = new Handler(Looper.getMainLooper());
        Set set = this.A0A;
        if (!r5.A5r(new AnonymousClass3M6(handler, runnable, set), A0Q)) {
            C15430qs r2 = this.A05;
            ((KeyboardPopupLayout) r2).A06 = false;
            ((View) r2).requestLayout();
            set.remove(runnable);
        }
    }

    public void A08(WaEditText waEditText) {
        this.A02 = true;
        A05();
        dismiss();
        if (waEditText != null) {
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) this.A05;
            if (keyboardPopupLayout.A04 != null) {
                keyboardPopupLayout.A04 = null;
                keyboardPopupLayout.requestLayout();
            }
            A07(new IDxMFunctionShape409S0100000_2_I0(waEditText, 0), waEditText, new RunnableRunnableShape2S0100000_I0_1(this, 2));
        }
    }

    public boolean A09() {
        return Build.VERSION.SDK_INT >= 24 && this.A03.isInMultiWindowMode();
    }

    public void dismiss() {
        if (isShowing()) {
            A04();
            super.dismiss();
            C15430qs r2 = this.A05;
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r2;
            if (keyboardPopupLayout.A04 != null) {
                keyboardPopupLayout.A04 = null;
                keyboardPopupLayout.requestLayout();
            }
            ((View) r2).requestLayout();
        }
    }
}
