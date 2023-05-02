package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.whatsapp.util.Log;

/* renamed from: X.2X9  reason: invalid class name */
public class AnonymousClass2X9 extends FrameLayout implements AnonymousClass006 {
    public C19980zJ A00;
    public AnonymousClass013 A01;
    public C52662eE A02;
    public boolean A03;
    public final View A04;
    public final View A05;
    public final WaImageView A06;
    public final WaImageView A07;
    public final WaTextView A08;
    public final WaTextView A09;

    public AnonymousClass2X9(Context context, int i2) {
        super(context, (AttributeSet) null, 0);
        if (!this.A03) {
            this.A03 = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A01 = (AnonymousClass013) r1.AR8.get();
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout01ed, this, false);
        this.A04 = inflate;
        WaImageView waImageView = (WaImageView) C004601z.A0E(inflate, R.id.archived_row_image);
        this.A06 = waImageView;
        WaTextView waTextView = (WaTextView) C004601z.A0E(inflate, R.id.archived_row);
        this.A09 = waTextView;
        WaTextView waTextView2 = (WaTextView) C004601z.A0E(inflate, R.id.archive_row_counter);
        this.A08 = waTextView2;
        AnonymousClass00B.A06(context);
        waTextView2.setBackgroundDrawable(new C52092d7(AnonymousClass00T.A00(context, R.color.color0792)));
        this.A05 = C004601z.A0E(inflate, R.id.content_indicator_container);
        WaImageView waImageView2 = (WaImageView) C004601z.A0E(inflate, R.id.archive_row_important_chat_indicator);
        this.A07 = waImageView2;
        AnonymousClass1UP.A06(waTextView);
        C55352jN.A00(inflate);
        AnonymousClass2JP.A02(inflate);
        C018808t.A00(AnonymousClass00T.A03(context, R.color.color06d5), waImageView);
        C018808t.A00(AnonymousClass00T.A03(context, R.color.color06f5), waImageView2);
        ColorStateList A032 = AnonymousClass00T.A03(context, R.color.color06e4);
        ColorStateList A033 = AnonymousClass00T.A03(context, i2 != 1 ? R.color.color06f5 : R.color.color06d6);
        WaTextView waTextView3 = this.A08;
        addView(inflate);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setContentIndicatorText(String str) {
        View view;
        if (TextUtils.isEmpty(str)) {
            Log.i("archive/set-content-indicator-to-empty");
            view = this.A05;
        } else {
            this.A05.setVisibility(0);
            boolean equals = "@".equals(str);
            WaImageView waImageView = this.A07;
            if (equals) {
                waImageView.setVisibility(0);
                view = this.A08;
            } else {
                waImageView.setVisibility(8);
                WaTextView waTextView = this.A08;
                waTextView.setText(str);
                waTextView.setVisibility(0);
                return;
            }
        }
        view.setVisibility(8);
    }

    public void setEnableState(boolean z2) {
        this.A04.setClickable(z2);
        this.A09.setEnabled(z2);
        this.A06.setEnabled(z2);
        this.A08.setEnabled(z2);
        this.A07.setEnabled(z2);
    }

    public void setImportantMessageTag(int i2) {
        this.A07.setTag(Integer.valueOf(i2));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A04.setOnClickListener(onClickListener);
    }

    public void setVisibility(boolean z2) {
        View view = this.A04;
        int i2 = 8;
        if (z2) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }
}
