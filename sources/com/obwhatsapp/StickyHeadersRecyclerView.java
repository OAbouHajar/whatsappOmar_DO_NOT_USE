package com.obwhatsapp;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01X;
import X.AnonymousClass09P;
import X.AnonymousClass3Qa;
import X.AnonymousClass3R4;
import X.AnonymousClass3RG;
import X.C005602k;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C53072ew;
import X.C54622hr;
import X.C95394mZ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxDObserverShape31S0100000_2_I0;
import com.facebook.redex.IDxGListenerShape15S0100000_2_I0;

public class StickyHeadersRecyclerView extends RecyclerView implements AnonymousClass006 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public AnonymousClass09P A07;
    public C005602k A08;
    public AnonymousClass013 A09;
    public C52662eE A0A;
    public boolean A0B;
    public final Rect A0C;

    public StickyHeadersRecyclerView(Context context) {
        super(context);
        A0z();
        this.A02 = -1;
        this.A00 = -1;
        this.A0C = new Rect();
        A10(context, (AttributeSet) null);
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0z();
        this.A02 = -1;
        this.A00 = -1;
        this.A0C = new Rect();
        A10(context, attributeSet);
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A0z();
        this.A02 = -1;
        this.A00 = -1;
        this.A0C = new Rect();
        A10(context, attributeSet);
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A0z();
    }

    public static boolean A09(long j2) {
        return (j2 & 4294967295L) == 4294967295L;
    }

    private AnonymousClass3R4 getStickyHeadersAdapter() {
        return (AnonymousClass3R4) this.A0N;
    }

    public void A0z() {
        if (!this.A0B) {
            this.A0B = true;
            this.A09 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    public final void A10(Context context, AttributeSet attributeSet) {
        int i2 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0N);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, this.A03);
            i2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        if (this.A03 > 0) {
            A0m(new AnonymousClass3RG(this.A09, i2));
        }
        this.A0h = true;
        this.A07 = new AnonymousClass09P(context, new IDxGListenerShape15S0100000_2_I0(this, 0));
        this.A14.add(new C95394mZ(this));
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        AnonymousClass3R4 r5 = (AnonymousClass3R4) this.A0N;
        int A19 = linearLayoutManager.A19();
        if (A19 != -1) {
            if (A19 != this.A00) {
                this.A00 = A19;
                long A0E = r5.A0E(A19);
                this.A05 = A0E;
                int i2 = (int) (A0E >> 32);
                if (this.A02 != i2) {
                    this.A02 = i2;
                    ((C54622hr) r5.A00).ANd(this.A08, i2);
                    View view = this.A08.A0H;
                    view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
            this.A04 = 0;
            if (!A09(this.A05)) {
                int A18 = linearLayoutManager.A18();
                if (this.A01 != A18) {
                    this.A01 = A18;
                    this.A06 = r5.A0E(A18);
                }
                if (A09(this.A06)) {
                    View A0B2 = linearLayoutManager.A0B(A18);
                    this.A04 = A0B2.getTop() - this.A08.A0H.getMeasuredHeight();
                    Rect rect = this.A0C;
                    linearLayoutManager.A0I(A0B2, rect);
                    int i3 = this.A04 - rect.top;
                    this.A04 = i3;
                    if (i3 > 0) {
                        this.A04 = 0;
                    }
                }
            }
            canvas.save();
            canvas.clipRect(0, this.A04, this.A08.A0H.getMeasuredWidth(), this.A04 + this.A08.A0H.getMeasuredHeight());
            canvas.translate(0.0f, (float) this.A04);
            this.A08.A0H.draw(canvas);
            canvas.restore();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0A;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i2, int i3) {
        View view;
        super.onMeasure(i2, i3);
        if (this.A03 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i4 = this.A03;
            ((GridLayoutManager) getLayoutManager()).A1g(Math.max(1, (measuredWidth + (i4 >> 1)) / i4));
        }
        C005602k r0 = this.A08;
        if (r0 != null && (view = r0.A0H) != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public void setAdapter(AnonymousClass01X r5) {
        super.setAdapter(new AnonymousClass3R4(r5));
        AnonymousClass01X r2 = this.A0N;
        r2.A01.registerObserver(new IDxDObserverShape31S0100000_2_I0(this, 0));
        if (this.A03 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i2 = this.A03;
            int max = Math.max(1, (measuredWidth + (i2 >> 1)) / i2);
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(max);
            gridLayoutManager.A01 = new AnonymousClass3Qa(gridLayoutManager, this);
            setLayoutManager(gridLayoutManager);
        } else {
            getContext();
            setLayoutManager(new LinearLayoutManager(1));
        }
        this.A08 = this.A0N.APF(this, -1000);
    }
}
