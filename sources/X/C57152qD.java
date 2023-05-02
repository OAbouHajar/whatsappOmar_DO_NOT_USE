package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.redex.RunnableRunnableShape1S0210000_I1;
import com.obwhatsapp.gesture.VerticalSwipeDismissBehavior;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2qD  reason: invalid class name and case insensitive filesystem */
public class C57152qD extends AnonymousClass055 {
    public int A00 = -1;
    public int A01;
    public final ViewGroup A02;
    public final List A03 = AnonymousClass000.A0u();
    public final /* synthetic */ VerticalSwipeDismissBehavior A04;

    public C57152qD(ViewGroup viewGroup, VerticalSwipeDismissBehavior verticalSwipeDismissBehavior) {
        this.A04 = verticalSwipeDismissBehavior;
        this.A02 = viewGroup;
    }

    public int A00(int i2) {
        ViewGroup viewGroup = this.A02;
        int childCount = viewGroup.getChildCount();
        List list = this.A03;
        if (list.size() != childCount) {
            list.clear();
            ArrayList A0i = C13690nt.A0i(childCount);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (this.A04.A05.AIj(viewGroup.getChildAt(i3))) {
                    C13690nt.A1O(A0i, i3);
                } else {
                    list.add(Integer.valueOf(i3));
                }
            }
            list.addAll(A0i);
        }
        return AnonymousClass000.A0D(list.get(i2));
    }

    public void A01(int i2) {
        C109635Sz r0 = this.A04.A05;
        if (r0 != null) {
            r0.AQA(i2);
        }
    }

    public int A03(View view) {
        return view.getHeight();
    }

    public int A04(View view, int i2, int i3) {
        return view.getLeft();
    }

    public int A05(View view, int i2, int i3) {
        int width = this.A01 - view.getWidth();
        return Math.min(Math.max(width, i2), this.A01 + view.getWidth());
    }

    public void A06(View view, float f2, float f3) {
        int i2;
        boolean z2;
        C109635Sz r0;
        this.A00 = -1;
        VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = this.A04;
        if (verticalSwipeDismissBehavior.A0J(view, f3, this.A01)) {
            int top2 = view.getTop();
            int i3 = this.A01;
            int height = view.getHeight();
            i2 = top2 < i3 ? i3 - height : i3 + height;
            z2 = true;
        } else {
            i2 = this.A01;
            z2 = false;
        }
        if (!verticalSwipeDismissBehavior.A07) {
            if (!verticalSwipeDismissBehavior.A04.A0C(view.getLeft(), i2)) {
                if (!z2 || (r0 = verticalSwipeDismissBehavior.A05) == null) {
                    return;
                }
            }
            view.postOnAnimation(new RunnableRunnableShape1S0210000_I1(verticalSwipeDismissBehavior, view, 3, z2));
            return;
        } else if (!z2 || (r0 = verticalSwipeDismissBehavior.A05) == null) {
            if (!verticalSwipeDismissBehavior.A04.A0C(view.getLeft(), i2)) {
                return;
            }
            view.postOnAnimation(new RunnableRunnableShape1S0210000_I1(verticalSwipeDismissBehavior, view, 3, z2));
            return;
        }
        r0.APs(view);
    }

    public void A07(View view, int i2) {
        if (this.A00 == -1) {
            this.A00 = i2;
            this.A01 = view.getTop();
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (parent instanceof CoordinatorLayout) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int childCount = viewGroup.getChildCount();
                int i3 = 0;
                while (i3 < childCount) {
                    if (((AnonymousClass0Bo) viewGroup.getChildAt(i3).getLayoutParams()).A0A != this.A04) {
                        i3++;
                    } else {
                        return;
                    }
                }
            }
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void A08(View view, int i2, int i3, int i4, int i5) {
        C109635Sz r3 = this.A04.A05;
        if (r3 != null) {
            r3.AXK(view, Math.min(1.0f, (((float) Math.abs(i3)) * 1.0f) / ((float) view.getHeight())));
        }
    }

    public boolean A09(View view, int i2) {
        VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = this.A04;
        return !verticalSwipeDismissBehavior.A0B && verticalSwipeDismissBehavior.A05.AIj(view);
    }
}
