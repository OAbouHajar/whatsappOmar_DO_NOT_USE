package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.0Yt  reason: invalid class name and case insensitive filesystem */
public class C07000Yt implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final int A01;
    public final View A02;
    public final List A03 = Collections.synchronizedList(new LinkedList());

    public C07000Yt(View view, boolean z2) {
        this.A02 = view;
        this.A00 = z2;
        float f2 = 100.0f * AnonymousClass000.A0M(view.getContext()).density;
        this.A01 = (int) (f2 >= 0.0f ? f2 + 0.5f : f2 - 0.5f);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public static int A00(View view) {
        Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.y;
    }

    public static int A01(View view) {
        Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (view.getRootWindowInsets() != null) {
            defaultDisplay.getRealSize(point);
            return point.y - view.getRootWindowInsets().getStableInsetBottom();
        }
        defaultDisplay.getSize(point);
        return point.y;
    }

    public void onGlobalLayout() {
        Rect A0J = AnonymousClass000.A0J();
        View view = this.A02;
        view.getWindowVisibleDisplayFrame(A0J);
        int i2 = Build.VERSION.SDK_INT;
        int A012 = (i2 >= 23 ? A01(view) : i2 >= 21 ? A00(view) : view.getRootView().getHeight()) - A0J.bottom;
        boolean z2 = this.A00;
        int i3 = this.A01;
        if (!z2) {
            if (A012 > i3) {
                this.A00 = true;
                List<AnonymousClass0RG> list = this.A03;
                synchronized (list) {
                    for (AnonymousClass0RG r0 : list) {
                        if (r0 != null) {
                            r0.A02(A012);
                        }
                    }
                }
            }
        } else if (A012 > i3) {
            List<AnonymousClass0RG> list2 = this.A03;
            synchronized (list2) {
                for (AnonymousClass0RG r02 : list2) {
                    if (r02 != null) {
                        r02.A01(A012);
                    }
                }
            }
        } else if (A012 < i3) {
            this.A00 = false;
            List<AnonymousClass0RG> list3 = this.A03;
            synchronized (list3) {
                for (AnonymousClass0RG r03 : list3) {
                    if (r03 != null) {
                        r03.A00();
                    }
                }
            }
        }
    }
}
