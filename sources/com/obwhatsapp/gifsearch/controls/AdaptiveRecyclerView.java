package com.obwhatsapp.gifsearch.controls;

import X.AnonymousClass000;
import X.AnonymousClass02W;
import X.AnonymousClass22N;
import X.C005502j;
import X.C13680ns;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class AdaptiveRecyclerView extends RecyclerView {
    public StaggeredGridLayoutManager A00;
    public final Rect A01 = AnonymousClass000.A0J();

    public AdaptiveRecyclerView(Context context) {
        super(context);
        A0z();
    }

    public AdaptiveRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0z();
    }

    public AdaptiveRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A0z();
    }

    private int getSpanCount() {
        Rect rect = this.A01;
        getHitRect(rect);
        Context context = getContext();
        float width = rect == null ? 0.0f : (float) rect.width();
        Activity A002 = AnonymousClass22N.A00(context);
        int i2 = 0;
        if (A002 == null || A002.isFinishing() || Float.compare(width, 0.0f) == 0) {
            return 1;
        }
        float A012 = width / C13680ns.A01(context);
        int[] iArr = {360, 480, 600, 720, 840, 960, 1280, 1440, 1920, 1600};
        do {
            int i3 = iArr[i2];
            if (Float.compare(A012, (float) i3) < 0) {
                switch (i3) {
                    case 360:
                    case 480:
                        return 2;
                    case 600:
                    case 720:
                        return 3;
                    case 840:
                    case 960:
                        return 4;
                    case 1280:
                    case 1440:
                        return 5;
                    case 1600:
                    case 1920:
                        return 6;
                    case 2240:
                        return 7;
                    default:
                        return 1;
                }
            } else {
                i2++;
            }
        } while (i2 < 10);
        return 7;
    }

    public void A0Y(int i2) {
        if (i2 == 0) {
            A0N();
        }
    }

    public final void A0z() {
        if (this.A00 == null) {
            this.A00 = new StaggeredGridLayoutManager(1, 1);
            setItemAnimator((C005502j) null);
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.A00;
            staggeredGridLayoutManager.A12((String) null);
            if (0 != staggeredGridLayoutManager.A01) {
                staggeredGridLayoutManager.A01 = 0;
                staggeredGridLayoutManager.A0D();
            }
            setLayoutManager(this.A00);
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.A00;
        if (staggeredGridLayoutManager2 != null) {
            staggeredGridLayoutManager2.A1J(getSpanCount());
        }
    }

    public StaggeredGridLayoutManager getLayoutManager() {
        return this.A00;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        super.onSizeChanged(i2, i3, i4, i5);
        if (i4 != i2 && (staggeredGridLayoutManager = this.A00) != null) {
            staggeredGridLayoutManager.A1J(getSpanCount());
        }
    }

    public void setLayoutManager(AnonymousClass02W r2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A00;
        if (staggeredGridLayoutManager == null || r2 == staggeredGridLayoutManager) {
            super.setLayoutManager(r2);
            return;
        }
        throw AnonymousClass000.A0T("LayoutManager cannot be replaced for this RecyclerView");
    }
}
