package X;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.obwhatsapp.R;

/* renamed from: X.3ER  reason: invalid class name */
public class AnonymousClass3ER implements AnonymousClass1VF {
    public final /* synthetic */ CollapsingToolbarLayout A00;

    public AnonymousClass3ER(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.A00 = collapsingToolbarLayout;
    }

    public void AU9(AppBarLayout appBarLayout, int i2) {
        int A002;
        CollapsingToolbarLayout collapsingToolbarLayout = this.A00;
        collapsingToolbarLayout.A00 = i2;
        AnonymousClass030 r0 = collapsingToolbarLayout.A0F;
        int A06 = r0 != null ? r0.A06() : 0;
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = collapsingToolbarLayout.getChildAt(i3);
            C64313Nq r2 = (C64313Nq) childAt.getLayoutParams();
            AnonymousClass4RQ r3 = (AnonymousClass4RQ) childAt.getTag(R.id.view_offset_helper);
            if (r3 == null) {
                r3 = new AnonymousClass4RQ(childAt);
                childAt.setTag(R.id.view_offset_helper, r3);
            }
            int i4 = r2.A01;
            if (i4 == 1) {
                int i5 = -i2;
                A002 = collapsingToolbarLayout.A00(childAt);
                if (i5 < 0) {
                    A002 = 0;
                } else if (i5 <= A002) {
                    A002 = i5;
                }
            } else if (i4 == 2) {
                A002 = Math.round(((float) (-i2)) * r2.A00);
            }
            if (r3.A02 != A002) {
                r3.A02 = A002;
                r3.A00();
            }
        }
        collapsingToolbarLayout.A03();
        if (collapsingToolbarLayout.A0B != null && A06 > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        collapsingToolbarLayout.A0M.A05(((float) Math.abs(i2)) / ((float) ((collapsingToolbarLayout.getHeight() - collapsingToolbarLayout.getMinimumHeight()) - A06)));
    }
}
