package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.34G  reason: invalid class name */
public class AnonymousClass34G extends AnonymousClass34O {
    public AnonymousClass34B A00;
    public boolean A01;
    public final C17160ud A02;
    public final AnonymousClass2Ao A03;
    public final C216114t A04;
    public final C19430yQ A05;
    public final AnonymousClass1P7 A06;

    public AnonymousClass34G(Context context, C17160ud r2, AnonymousClass2Ao r3, C85934Qo r4, C216114t r5, C19430yQ r6, AnonymousClass1P7 r7, C25781Lc r8) {
        super(context, r4, r8);
        A00();
        this.A06 = r7;
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r6;
        this.A04 = r5;
        A01();
    }

    public /* bridge */ /* synthetic */ CharSequence A02(C16010sH r10, C16740tZ r11) {
        String str;
        C30901d9 r112 = (C30901d9) r11;
        if (!(r112 instanceof C38841rV) || (str = ((C38841rV) r112).A03) == null) {
            str = "";
        }
        int i2 = R.drawable.ic_inline_live_location;
        if (r112 instanceof C38751rM) {
            i2 = R.drawable.msg_status_location;
        }
        Drawable A002 = AnonymousClass2SR.A00(getContext(), i2);
        TextPaint paint = this.A01.getPaint();
        if (TextUtils.isEmpty(str)) {
            return super.A02(r10, r112);
        }
        CharSequence A003 = C56522nn.A00(paint, A002, "");
        CharSequence A004 = C55672k9.A00(r10, r112, this);
        if (TextUtils.isEmpty(A004)) {
            return A003;
        }
        boolean A0G = C45902Bo.A0G(A003);
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = A004;
        char c2 = 8207;
        if (A0G) {
            c2 = 8206;
        }
        String valueOf = String.valueOf(c2);
        charSequenceArr[1] = valueOf;
        charSequenceArr[2] = A003;
        charSequenceArr[3] = valueOf;
        return TextUtils.concat(charSequenceArr);
    }

    /* renamed from: A07 */
    public void A05(C30901d9 r2, List list) {
        super.A05(r2, list);
        this.A00.setMessage(r2, list);
    }
}
