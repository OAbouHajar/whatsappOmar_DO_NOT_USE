package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.SegmentedProgressBar;
import com.obwhatsapp.storage.SizeTickerView;

/* renamed from: X.2gG  reason: invalid class name and case insensitive filesystem */
public class C53772gG extends C005602k {
    public long A00;
    public long A01;
    public AnimatorSet A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final C16300so A08;
    public final WaImageView A09;
    public final WaTextView A0A;
    public final WaTextView A0B;
    public final SegmentedProgressBar A0C;
    public final AnonymousClass013 A0D;
    public final SizeTickerView A0E;
    public final SizeTickerView A0F;
    public final int[] A0G;

    public C53772gG(View view, C16300so r9, AnonymousClass013 r10) {
        super(view);
        this.A08 = r9;
        this.A0D = r10;
        SizeTickerView sizeTickerView = (SizeTickerView) C004601z.A0E(view, R.id.used_space_text);
        this.A0F = sizeTickerView;
        View view2 = this.A0H;
        sizeTickerView.A0B(0, AnonymousClass00T.A00(view2.getContext(), R.color.color06f8), false);
        this.A0B = (WaTextView) C004601z.A0E(view, R.id.used_space_description_text);
        SizeTickerView sizeTickerView2 = (SizeTickerView) C004601z.A0E(view, R.id.free_space_text);
        this.A0E = sizeTickerView2;
        sizeTickerView2.A0B(0, AnonymousClass00T.A00(view2.getContext(), R.color.color075d), false);
        this.A09 = (WaImageView) C004601z.A0E(view, R.id.free_space_critical_icon);
        this.A0A = (WaTextView) C004601z.A0E(view, R.id.free_space_description_text);
        this.A0C = (SegmentedProgressBar) C004601z.A0E(view, R.id.progress_bar);
        this.A07 = C004601z.A0E(view, R.id.progress_bar_legend_container);
        Context context = view.getContext();
        int[] iArr = new int[2];
        this.A0G = iArr;
        iArr[0] = AnonymousClass00T.A00(context, R.color.color06f8);
        iArr[1] = AnonymousClass00T.A00(context, R.color.color05b7);
        this.A05 = AnonymousClass00T.A00(context, R.color.color0710);
        this.A04 = AnonymousClass00T.A00(context, R.color.color075f);
        this.A06 = AnonymousClass00T.A00(context, R.color.color075e);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen07c0);
        Drawable A042 = AnonymousClass00T.A04(context, R.drawable.storage_usage_green_circle);
        A042.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        ((TextView) C004601z.A0E(view, R.id.media_description_text)).setCompoundDrawables(A042, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable A043 = AnonymousClass00T.A04(context, R.drawable.storage_usage_yellow_circle);
        A043.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        ((TextView) C004601z.A0E(view, R.id.other_description_text)).setCompoundDrawables(A043, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
