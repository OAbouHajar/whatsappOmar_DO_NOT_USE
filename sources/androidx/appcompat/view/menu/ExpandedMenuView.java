package androidx.appcompat.view.menu;

import X.AnonymousClass07T;
import X.C016607w;
import X.C07290av;
import X.C12240k4;
import X.C12250k5;
import X.C13350lt;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements C12240k4, C12250k5, AdapterView.OnItemClickListener {
    public static final int[] A01 = {16842964, 16843049};
    public C016607w A00;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        AnonymousClass07T A002 = AnonymousClass07T.A00(context, attributeSet, A01, i2, 0);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(A002.A02(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(A002.A02(1));
        }
        A002.A04();
    }

    public void AIH(C016607w r1) {
        this.A00 = r1;
    }

    public boolean AIa(C07290av r4) {
        return this.A00.A0L(r4, (C13350lt) null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        AIa((C07290av) getAdapter().getItem(i2));
    }
}
