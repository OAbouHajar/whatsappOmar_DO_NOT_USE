package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.Toast;

/* renamed from: X.3Cy  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Cy implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2AK A01;

    public /* synthetic */ AnonymousClass3Cy(AnonymousClass2AK r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass2AK r8 = this.A01;
        Toast A04 = r8.A03.A04(C13700nu.A0H(view, this.A00));
        int[] iArr = new int[2];
        Rect A0J = AnonymousClass000.A0J();
        view.getLocationOnScreen(iArr);
        view.getWindowVisibleDisplayFrame(A0J);
        int height = (iArr[1] + view.getHeight()) - A0J.top;
        int i2 = iArr[0];
        if (C13680ns.A1Z(r8.A0N)) {
            Point point = new Point();
            C13680ns.A0s(r8.A01, point);
            if (A04.getView() != null) {
                A04.getView().measure(point.x, point.y);
                i2 -= A04.getView().getMeasuredWidth();
            }
        } else {
            i2 += view.getWidth();
        }
        A04.setGravity(51, i2, height);
        A04.show();
        return true;
    }
}
