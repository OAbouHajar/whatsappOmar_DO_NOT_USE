package com.obwhatsapp.biz.catalog.view;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass3LD;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class CarouselScrollbarView extends View implements AnonymousClass006 {
    public RecyclerView A00;
    public C52662eE A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass3LD A04;

    public CarouselScrollbarView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CarouselScrollbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarouselScrollbarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        AnonymousClass3LD r0 = new AnonymousClass3LD(context);
        this.A04 = r0;
        r0.setCallback(this);
        this.A03 = false;
    }

    public final void A00() {
        RecyclerView recyclerView = this.A00;
        AnonymousClass00B.A04(recyclerView);
        int computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
        int computeHorizontalScrollOffset = this.A00.computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = this.A00.computeHorizontalScrollRange();
        if (computeHorizontalScrollExtent < computeHorizontalScrollRange) {
            int width = (getWidth() * computeHorizontalScrollExtent) / computeHorizontalScrollRange;
            int width2 = ((getWidth() - width) * computeHorizontalScrollOffset) / (computeHorizontalScrollRange - computeHorizontalScrollExtent);
            AnonymousClass3LD r1 = this.A04;
            if (!(r1.A01 == width2 && r1.A00 == width)) {
                r1.A00 = width;
                r1.A01 = width2;
                r1.A00();
            }
            this.A03 = true;
            return;
        }
        AnonymousClass3LD r2 = this.A04;
        if (!(r2.A01 == 0 && r2.A00 == 0)) {
            r2.A00 = 0;
            r2.A01 = 0;
            r2.A00();
        }
        this.A03 = false;
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        if (this.A03) {
            this.A04.draw(canvas);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        this.A04.setBounds(0, 0, i2, i3);
        A00();
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.A04 == drawable;
    }
}
