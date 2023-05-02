package X;

import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.redex.IDxDListenerShape58S0200000_2_I1;
import com.instagram.common.bloks.component.BloksEditText;

/* renamed from: X.3Cu  reason: invalid class name and case insensitive filesystem */
public class C62273Cu implements View.OnFocusChangeListener {
    public final C14990q7 A00;
    public final AnonymousClass38S A01;
    public final C31201dg A02;
    public final C14930q1 A03;
    public final C14930q1 A04;

    public C62273Cu(C14990q7 r2, C31201dg r3, C14930q1 r4, C14930q1 r5) {
        this.A02 = r3;
        this.A00 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = (AnonymousClass38S) C62183Bz.A05(r2, r3);
    }

    public void onFocusChange(View view, boolean z2) {
        C14930q1 r3;
        Editable text;
        BloksEditText bloksEditText = (BloksEditText) view;
        TextUtils.TruncateAt ellipsize = bloksEditText.getEllipsize();
        if (z2) {
            if (ellipsize != null) {
                C15490rD.A01((TextUtils.TruncateAt) null, bloksEditText, this.A01);
                bloksEditText.getExtendedPaddingTop();
                bloksEditText.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape58S0200000_2_I1(bloksEditText, 0, this));
            }
            r3 = this.A03;
        } else {
            if (ellipsize == null && C15490rD.A09(bloksEditText) && (text = bloksEditText.getText()) != null) {
                Rect A0J = AnonymousClass000.A0J();
                bloksEditText.getPaint().getTextBounds(text.toString(), 0, text.length(), A0J);
                if (A0J.width() > C13680ns.A04(bloksEditText)) {
                    C15490rD.A01(TextUtils.TruncateAt.END, bloksEditText, this.A01);
                }
            }
            r3 = this.A04;
        }
        if (r3 != null) {
            C14940q2 r2 = new C14940q2();
            C31201dg r1 = this.A02;
            r2.A02(r1, 0);
            C14990q7 r0 = this.A00;
            r2.A02(r0, 1);
            C14940q2.A00(r0, r1, r2, r3);
        }
    }
}
