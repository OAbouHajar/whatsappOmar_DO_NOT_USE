package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

/* renamed from: X.34T  reason: invalid class name */
public abstract class AnonymousClass34T extends C55672k9 {
    public C71403kJ A00;

    public AnonymousClass34T(Context context, C85934Qo r2, C25781Lc r3) {
        super(context, r2, r3);
    }

    public /* bridge */ /* synthetic */ CharSequence A02(C16010sH r11, C16740tZ r12) {
        Drawable A002 = AnonymousClass2SR.A00(getContext(), getDrawableRes());
        TextPaint paint = this.A01.getPaint();
        int textSize = ((int) paint.getTextSize()) + getIconSizeIncrease();
        SpannableStringBuilder A0F = C13690nt.A0F(AnonymousClass000.A0g("  ", ""));
        C56522nn.A02(paint, A002, A0F, textSize, 0, 1);
        CharSequence A003 = C55672k9.A00(r11, r12, this);
        if (TextUtils.isEmpty(A003)) {
            return A0F;
        }
        boolean A0G = C45902Bo.A0G(A0F);
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = A003;
        char c2 = 8207;
        if (A0G) {
            c2 = 8206;
        }
        String valueOf = String.valueOf(c2);
        charSequenceArr[1] = valueOf;
        charSequenceArr[2] = A0F;
        charSequenceArr[3] = valueOf;
        return TextUtils.concat(charSequenceArr);
    }

    public abstract String getDefaultMessageText();

    public abstract int getDrawableRes();

    public int getIconSizeIncrease() {
        return C13680ns.A0D(this).getDimensionPixelSize(R.dimen.dimen06b8);
    }

    public void setThumbnailOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setId(R.id.thumb_view);
        this.A00.setOnClickListener(onClickListener);
    }

    public void setUpThumbView(C71403kJ r4) {
        r4.setRadius(getResources().getDimensionPixelSize(R.dimen.dimen06c2));
        r4.setLayoutParams(new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.dimen06c4), getResources().getDimensionPixelSize(R.dimen.dimen06c4)));
        C45902Bo.A07(r4, this.A09, C13690nt.A03(this), 0);
    }
}
