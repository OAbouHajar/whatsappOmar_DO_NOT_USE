package X;

import android.content.Context;
import android.os.BadParcelableException;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1cU  reason: invalid class name and case insensitive filesystem */
public class C30521cU {
    public final Context A00;
    public final C26071Mf A01;
    public final TextEmojiLabel A02;
    public final C16080sP A03;
    public final AnonymousClass013 A04;
    public final C25781Lc A05;

    public C30521cU(Context context, TextEmojiLabel textEmojiLabel, C16080sP r4, AnonymousClass013 r5, C25781Lc r6) {
        this.A00 = context;
        this.A02 = textEmojiLabel;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = C26071Mf.A00();
    }

    public C30521cU(View view, C16080sP r8, AnonymousClass013 r9, C25781Lc r10, int i2) {
        this(view.getContext(), (TextEmojiLabel) view.findViewById(i2), r8, r9, r10);
    }

    public static void A00(Context context, C30521cU r1, int i2) {
        r1.A06(AnonymousClass00T.A00(context, i2));
    }

    public TextPaint A01() {
        return this.A02.getPaint();
    }

    public final String A02(String str, String str2) {
        AnonymousClass013 r2 = this.A04;
        String A0G = r2.A0G(str2);
        AnonymousClass3HS r1 = null;
        try {
            r1 = this.A01.A0E(str, (String) null);
        } catch (C803443m unused) {
        }
        String A0G2 = (r1 == null || !this.A01.A0L(r1)) ? r2.A0G(str) : r2.A0H(str);
        return String.format(AnonymousClass013.A00(r2.A00), this.A00.getString(R.string.str1d07), new Object[]{A0G2, A0G});
    }

    public void A03() {
        TextEmojiLabel textEmojiLabel = this.A02;
        textEmojiLabel.setText(this.A00.getString(R.string.str1ba8));
        textEmojiLabel.A0A();
    }

    public void A04() {
        TextEmojiLabel textEmojiLabel = this.A02;
        textEmojiLabel.setText(this.A00.getString(R.string.str0dac));
        textEmojiLabel.A0A();
    }

    public void A05() {
        AnonymousClass1UP.A06(this.A02);
    }

    public void A06(int i2) {
        TextEmojiLabel textEmojiLabel = this.A02;
    }

    public void A07(int i2) {
        if (i2 != 0) {
            this.A02.A0C(i2 != 1 ? R.drawable.ic_verified_large : R.drawable.ic_verified, R.dimen.dimen0807);
        } else {
            this.A02.A0A();
        }
    }

    public void A08(C16090sQ r7, List list, int i2, boolean z2) {
        try {
            TextEmojiLabel textEmojiLabel = this.A02;
            String str = r7.A01;
            textEmojiLabel.A0H(str, list, 256, false);
            if (C40621uQ.PUSH_NAME == r7.A00 && i2 == 7) {
                textEmojiLabel.setContentDescription(this.A00.getString(R.string.str1c40, new Object[]{str}));
            }
            A07(z2 ? 1 : 0);
        } catch (BadParcelableException e2) {
            throw e2;
        }
    }

    public void A09(C16010sH r4) {
        boolean A0L = r4.A0L();
        TextEmojiLabel textEmojiLabel = this.A02;
        if (A0L) {
            textEmojiLabel.A0C(R.drawable.ic_verified, R.dimen.dimen0807);
        } else {
            textEmojiLabel.A0A();
        }
        A06(AnonymousClass00T.A00(textEmojiLabel.getContext(), R.color.color0507));
    }

    public void A0A(C16010sH r5) {
        A08(this.A03.A04(r5, -1), (List) null, -1, r5.A0L());
    }

    public void A0B(C16010sH r4, int i2) {
        A08(this.A03.A04(r4, i2), (List) null, i2, r4.A0L());
    }

    public void A0C(C16010sH r20, AnonymousClass2TP r21, List list, float f2) {
        Context context = this.A00;
        C16080sP r0 = this.A03;
        AnonymousClass013 r1 = this.A04;
        C16010sH r2 = r20;
        String A0A = r0.A0A(r2);
        if (A0A == null) {
            A0A = "";
        }
        String string = context.getString(R.string.str0d5e);
        String string2 = context.getString(R.string.str1d07);
        int i2 = 0;
        String format = String.format(AnonymousClass013.A00(r1.A00), string2, new Object[]{A0A, string});
        AtomicReference atomicReference = new AtomicReference();
        AnonymousClass2TP r6 = r21;
        List list2 = list;
        float f3 = f2;
        C99984uu r4 = new C99984uu(this, r6, A0A, string, list2, atomicReference, f3);
        TextEmojiLabel textEmojiLabel = this.A02;
        textEmojiLabel.A08 = r4;
        TextUtils.TruncateAt ellipsize = textEmojiLabel.getEllipsize();
        textEmojiLabel.setEllipsize((TextUtils.TruncateAt) null);
        if (f2 == 1.0f) {
            i2 = 256;
        }
        textEmojiLabel.A0E(r6, format, list2, f3, i2, false);
        atomicReference.set(textEmojiLabel.getText());
        textEmojiLabel.setEllipsize(ellipsize);
        A07(r2.A0L() ? 1 : 0);
    }

    public void A0D(C16010sH r4, List list) {
        A08(this.A03.A04(r4, -1), list, -1, r4.A0L());
    }

    public void A0E(CharSequence charSequence) {
        this.A02.setText(charSequence);
    }

    public void A0F(List list, CharSequence charSequence) {
        this.A02.A0H(charSequence, list, 0, false);
    }
}
