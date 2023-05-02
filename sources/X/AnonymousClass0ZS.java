package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: X.0ZS  reason: invalid class name */
public class AnonymousClass0ZS implements C13350lt {
    public C016607w A00;
    public C07290av A01;
    public final /* synthetic */ Toolbar A02;

    public AnonymousClass0ZS(Toolbar toolbar) {
        this.A02 = toolbar;
    }

    public boolean A6P(C016607w r6, C07290av r7) {
        Toolbar toolbar = this.A02;
        View view = toolbar.A0G;
        if (view instanceof AnonymousClass047) {
            ((AnonymousClass047) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.A0G);
        toolbar.removeView(toolbar.A0H);
        toolbar.A0G = null;
        ArrayList arrayList = toolbar.A0b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView(AnonymousClass000.A0N(arrayList, size));
            } else {
                arrayList.clear();
                this.A01 = null;
                toolbar.requestLayout();
                r7.A0N = false;
                r7.A0E.A0F(false);
                return true;
            }
        }
    }

    public boolean A8s(C016607w r6, C07290av r7) {
        Toolbar toolbar = this.A02;
        toolbar.A06();
        ViewParent parent = toolbar.A0H.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.A0H);
            }
            toolbar.addView(toolbar.A0H);
        }
        View actionView = r7.getActionView();
        toolbar.A0G = actionView;
        this.A01 = r7;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.A0G);
            }
            AnonymousClass09K r2 = new AnonymousClass09K(-2);
            r2.A00 = 8388611 | (toolbar.A00 & 112);
            r2.A00 = 2;
            toolbar.A0G.setLayoutParams(r2);
            toolbar.addView(toolbar.A0G);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (!(((AnonymousClass09K) childAt.getLayoutParams()).A00 == 2 || childAt == toolbar.A0O)) {
                toolbar.removeViewAt(childCount);
                toolbar.A0b.add(childAt);
            }
        }
        toolbar.requestLayout();
        r7.A0N = true;
        C016607w.A00(r7);
        View view = toolbar.A0G;
        if (view instanceof AnonymousClass047) {
            ((AnonymousClass047) view).onActionViewExpanded();
        }
        return true;
    }

    public boolean A97() {
        return false;
    }

    public void AIA(Context context, C016607w r4) {
        C07290av r0;
        C016607w r1 = this.A00;
        if (!(r1 == null || (r0 = this.A01) == null)) {
            r1.A0M(r0);
        }
        this.A00 = r4;
    }

    public void AOk(C016607w r1, boolean z2) {
    }

    public boolean AY0(AnonymousClass0Cw r2) {
        return false;
    }

    public void Ade(C12940lD r1) {
    }

    public void AhS(boolean z2) {
        C07290av r4 = this.A01;
        if (r4 != null) {
            C016607w r3 = this.A00;
            if (r3 != null) {
                int size = r3.size();
                int i2 = 0;
                while (i2 < size) {
                    if (r3.getItem(i2) != r4) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
            A6P(r3, r4);
        }
    }
}
