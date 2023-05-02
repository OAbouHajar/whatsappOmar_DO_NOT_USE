package com.obwhatsapp.picker.searchexpressions.gifs;

import X.AnonymousClass071;
import X.AnonymousClass07D;
import X.AnonymousClass3R7;
import X.C004601z;
import X.C13680ns;
import X.C15860rz;
import X.C23061Ai;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.redex.IDxIDecorationShape5S0101000_2_I1;
import com.facebook.redex.IDxSListenerShape35S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.gifsearch.controls.AdaptiveRecyclerView;
import com.obwhatsapp.picker.searchexpressions.ExpressionsSearchDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape2S0200000_I1_1;

public class GifTabContainerLayout extends FrameLayout {
    public View A00;
    public View A01;
    public View A02;
    public WaEditText A03;
    public C15860rz A04;
    public AnonymousClass3R7 A05;
    public AdaptiveRecyclerView A06;
    public ExpressionsSearchDialogFragment A07;
    public C23061Ai A08;
    public final AnonymousClass07D A09 = new IDxIDecorationShape5S0101000_2_I1(this);
    public final AnonymousClass071 A0A = new IDxSListenerShape35S0100000_2_I1(this, 7);

    public GifTabContainerLayout(Context context) {
        super(context);
    }

    public GifTabContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GifTabContainerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public GifTabContainerLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    private void setupViews(Activity activity) {
        if (getChildCount() <= 0) {
            View A0H = C13680ns.A0H(activity.getLayoutInflater(), this, R.layout.layout027a);
            this.A06 = (AdaptiveRecyclerView) C004601z.A0E(A0H, R.id.search_result_view);
            this.A02 = C004601z.A0E(A0H, R.id.progress_container_layout);
            this.A00 = C004601z.A0E(A0H, R.id.gifs_tab_no_results_text_view);
            this.A01 = C004601z.A0E(A0H, R.id.retry_panel);
            this.A03 = this.A07.A03;
            this.A06.A0o(this.A0A);
            this.A06.A0m(this.A09);
            this.A06.setAdapter(this.A05);
            C004601z.A0E(A0H, R.id.retry_button).setOnClickListener(new ViewOnClickCListenerShape2S0200000_I1_1(this, 2, this.A07.A08));
            addView(A0H);
        }
    }

    public void A00(Activity activity, C15860rz r2, AnonymousClass3R7 r3, ExpressionsSearchDialogFragment expressionsSearchDialogFragment, C23061Ai r5) {
        this.A08 = r5;
        this.A04 = r2;
        this.A05 = r3;
        this.A07 = expressionsSearchDialogFragment;
        setupViews(activity);
    }

    public void onMeasure(int i2, int i3) {
        SharedPreferences A0B;
        String str;
        if (!isInEditMode()) {
            int size = View.MeasureSpec.getSize(i3);
            if (View.MeasureSpec.getMode(i3) != 1073741824 && !C23061Ai.A00(this)) {
                int i4 = getResources().getConfiguration().orientation;
                if (i4 == 1) {
                    A0B = C13680ns.A0B(this.A04);
                    str = "keyboard_height_portrait";
                } else if (i4 == 2) {
                    A0B = C13680ns.A0B(this.A04);
                    str = "keyboard_height_landscape";
                }
                int i5 = A0B.getInt(str, 0);
                if (i5 > 0) {
                    i3 = View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
                }
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setNoResultsVisibility(boolean z2) {
        this.A00.setVisibility(C13680ns.A02(z2 ? 1 : 0));
    }

    public void setRetryPanelVisibility(boolean z2) {
        this.A01.setVisibility(C13680ns.A02(z2 ? 1 : 0));
    }

    public void setSearchProgressVisibility(boolean z2) {
        this.A02.setVisibility(C13680ns.A02(z2 ? 1 : 0));
    }

    public void setSearchResultsVisibility(boolean z2) {
        this.A06.setVisibility(C13680ns.A02(z2 ? 1 : 0));
    }
}
