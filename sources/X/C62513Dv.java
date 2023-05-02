package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.3Dv  reason: invalid class name and case insensitive filesystem */
public class C62513Dv implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        RCTextView rCTextView = (RCTextView) obj;
        if (obj3 != null) {
            AnonymousClass4OP r14 = (AnonymousClass4OP) obj3;
            CharSequence charSequence = r14.A04;
            Layout layout = r14.A02;
            float f2 = r14.A00;
            float f3 = r14.A01;
            AnonymousClass3HU r0 = r14.A03;
            ColorStateList colorStateList = r0.A0Q;
            int i2 = r0.A0N;
            int i3 = r0.A09;
            ImageSpan[] imageSpanArr = r14.A07;
            ClickableSpan[] clickableSpanArr = r14.A06;
            int i4 = r0.A0A;
            rCTextView.A0B = charSequence;
            rCTextView.A0A = layout;
            rCTextView.A00 = f2;
            rCTextView.A01 = f3;
            rCTextView.A02 = i3;
            rCTextView.A03 = i4;
            if (i2 != 0) {
                rCTextView.A07 = null;
                rCTextView.A04 = i2;
            } else {
                rCTextView.A07 = colorStateList;
                rCTextView.A04 = colorStateList.getDefaultColor();
                Layout layout2 = rCTextView.A0A;
                if (layout2 != null) {
                    layout2.getPaint().setColor(rCTextView.A07.getColorForState(rCTextView.getDrawableState(), rCTextView.A04));
                }
            }
            rCTextView.A02(0, 0);
            if (imageSpanArr != null) {
                for (ImageSpan drawable : imageSpanArr) {
                    Drawable drawable2 = drawable.getDrawable();
                    drawable2.setCallback(rCTextView);
                    drawable2.setVisible(true, false);
                }
            }
            rCTextView.A0F = imageSpanArr;
            rCTextView.A0E = clickableSpanArr;
            rCTextView.invalidate();
            return;
        }
        throw AnonymousClass000.A0a("Missing text layout context!");
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        RCTextView rCTextView = (RCTextView) obj;
        rCTextView.A0B = null;
        rCTextView.A0A = null;
        rCTextView.A00 = 0.0f;
        rCTextView.A01 = 0.0f;
        rCTextView.A02 = 0;
        rCTextView.A03 = 0;
        rCTextView.A07 = null;
        rCTextView.A04 = 0;
        ImageSpan[] imageSpanArr = rCTextView.A0F;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Drawable drawable = rCTextView.A0F[i2].getDrawable();
                drawable.setCallback((Drawable.Callback) null);
                drawable.setVisible(false, false);
            }
            rCTextView.A0F = null;
        }
        rCTextView.A0E = null;
        C57122qA r0 = rCTextView.A0G;
        if (r0 != null) {
            r0.A0A();
        }
        if (obj3 == null) {
            throw AnonymousClass000.A0a("Missing text layout context!");
        }
    }
}
