package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.WaEditText;
import java.util.List;

/* renamed from: X.5ys  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119685ys implements View.OnTouchListener {
    public final /* synthetic */ C111315fl A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ C119685ys(C111315fl r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Rect rect;
        int i2;
        int i3;
        C111315fl r4 = this.A00;
        List<WaEditText> list = this.A01;
        if (!(motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Point point = new Point(((int) x2) + iArr[0], ((int) y2) + iArr[1]);
            for (WaEditText waEditText : list) {
                if (AnonymousClass2JI.A02(point, waEditText) && ((rect = waEditText.A00) == null || ((i2 = point.x) >= rect.left && i2 <= rect.right && (i3 = point.y) >= rect.top && i3 <= rect.bottom))) {
                    r4.A08(waEditText);
                    return true;
                }
            }
            if (motionEvent.getY() < 0.0f) {
                return true;
            }
        }
        r4.A01.A0I.onTouch(view, motionEvent);
        return false;
    }
}
