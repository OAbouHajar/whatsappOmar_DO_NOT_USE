package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape243S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.facebook.redex.IDxSScrollerShape29S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.2X5  reason: invalid class name */
public abstract class AnonymousClass2X5 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final LinearLayoutManager A03;
    public final AnonymousClass071 A04;
    public final C05490Rq A05;
    public final RecyclerView A06;
    public final AnonymousClass4EX A07;
    public final ShapePickerRecyclerView A08;
    public final C57502rH A09;

    public AnonymousClass2X5(RecyclerView recyclerView, AnonymousClass4EX r7, ShapePickerRecyclerView shapePickerRecyclerView, boolean z2) {
        IDxSListenerShape34S0100000_2_I0 iDxSListenerShape34S0100000_2_I0 = new IDxSListenerShape34S0100000_2_I0(this, 10);
        this.A04 = iDxSListenerShape34S0100000_2_I0;
        C57502rH r4 = new C57502rH(this);
        this.A09 = r4;
        r4.A0B(z2);
        recyclerView.setItemAnimator((C005502j) null);
        this.A08 = shapePickerRecyclerView;
        this.A07 = r7;
        shapePickerRecyclerView.A0o(iDxSListenerShape34S0100000_2_I0);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        this.A03 = linearLayoutManager;
        this.A05 = new IDxSScrollerShape29S0100000_2_I0(recyclerView.getContext(), this, 2);
        this.A06 = recyclerView;
        recyclerView.setAdapter(r4);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addOnLayoutChangeListener(new IDxCListenerShape243S0100000_2_I0(this, 2));
    }

    public int A00(int i2, boolean z2) {
        if (!(this instanceof AnonymousClass334)) {
            return AnonymousClass335.A01.length;
        }
        Resources resources = this.A06.getContext().getResources();
        int i3 = R.dimen.dimen0735;
        if (z2) {
            i3 = R.dimen.dimen0734;
        }
        return i2 / resources.getDimensionPixelSize(i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A09.A02.size() <= 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r4.A06
            int r2 = r3.getVisibility()
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0015
            X.2rH r0 = r4.A09
            java.util.List r0 = r0.A02
            int r1 = r0.size()
            r0 = 0
            if (r1 > 0) goto L_0x0017
        L_0x0015:
            r0 = 8
        L_0x0017:
            r3.setVisibility(r0)
            if (r2 == r0) goto L_0x0039
            X.4EX r1 = r4.A07
            int r0 = r3.getVisibility()
            r2 = 0
            if (r0 != 0) goto L_0x0026
            r2 = 1
        L_0x0026:
            X.2Ur r0 = r1.A00
            com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView r1 = r0.A0Q
            X.2OJ r0 = r0.A0Z
            java.lang.Object r0 = r0.A01()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.A12(r0, r2)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2X5.A01():void");
    }

    public void A02(AnonymousClass3S8 r5, boolean z2) {
        View view = r5.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Resources resources = this.A06.getContext().getResources();
        int i2 = R.dimen.dimen0739;
        if (z2) {
            i2 = R.dimen.dimen0738;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        view.setLayoutParams(layoutParams);
    }

    public void A03(boolean z2) {
        RecyclerView recyclerView = this.A06;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Resources resources = recyclerView.getContext().getResources();
        int i2 = R.dimen.dimen0737;
        if (z2) {
            i2 = R.dimen.dimen0736;
        }
        layoutParams.height = resources.getDimensionPixelSize(i2);
        recyclerView.setLayoutParams(layoutParams);
        for (int i3 = 0; i3 < this.A09.A02.size(); i3++) {
            AnonymousClass3S8 r0 = (AnonymousClass3S8) recyclerView.A0D(i3);
            if (r0 != null) {
                A02(r0, z2);
            }
        }
        this.A00 = z2;
    }
}
