package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2rV  reason: invalid class name and case insensitive filesystem */
public class C57642rV extends AnonymousClass071 {
    public static final ViewGroup.MarginLayoutParams A01;
    public AnonymousClass4R6 A00;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A01 = marginLayoutParams;
    }

    public C57642rV(AnonymousClass4R6 r1) {
        this.A00 = r1;
    }

    public void A00(RecyclerView recyclerView, int i2, int i3) {
        View A0B;
        int height;
        int top2;
        int i4;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int A19 = linearLayoutManager.A19();
        if (A19 != -1 && (A0B = linearLayoutManager.A0B(A19)) != null) {
            ViewGroup.MarginLayoutParams A0O = A0B.getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? AnonymousClass000.A0O(A0B) : A01;
            if (linearLayoutManager.A01 == 0) {
                height = A0B.getWidth() + A0O.leftMargin + A0O.rightMargin;
                if (C004601z.A06(linearLayoutManager.A07) == 0) {
                    top2 = A0B.getLeft();
                    i4 = A0O.leftMargin;
                } else {
                    top2 = height - A0B.getRight();
                    i4 = A0O.rightMargin;
                }
            } else {
                height = A0O.bottomMargin + A0B.getHeight() + A0O.topMargin;
                top2 = A0B.getTop();
                i4 = A0O.topMargin;
            }
            int i5 = -(top2 - i4);
            float f2 = 0.0f;
            if (height != 0) {
                f2 = ((float) i5) / ((float) height);
            }
            AnonymousClass4R6 r4 = this.A00;
            C14940q2 r2 = new C14940q2();
            C14990q7 r3 = r4.A00;
            r2.A03(r3, 0);
            r2.A03(Integer.valueOf(A19), 1);
            r2.A03(C89554cQ.A00((double) f2), 2);
            r2.A03(Integer.valueOf(i5), 3);
            C29701b3.A01(r3, r4.A01, new C14950q3(r2.A00), r4.A02);
        }
    }
}
