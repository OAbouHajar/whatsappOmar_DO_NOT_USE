package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.redex.IDxCallbackShape342S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.emoji.EmojiDescriptor;
import java.util.List;

/* renamed from: X.2pC  reason: invalid class name */
public class AnonymousClass2pC extends LinearLayout implements AnonymousClass006 {
    public int A00;
    public int A01;
    public C16300so A02;
    public TextEmojiLabel A03;
    public TextEmojiLabel A04;
    public AnonymousClass01V A05;
    public AnonymousClass013 A06;
    public C17250um A07;
    public C17020u3 A08;
    public C52662eE A09;
    public boolean A0A;
    public final C85934Qo A0B;

    public AnonymousClass2pC(Context context, C85934Qo r6) {
        super(context);
        if (!this.A0A) {
            this.A0A = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A02 = C16150sX.A00(A002);
            this.A07 = C16150sX.A0i(A002);
            this.A05 = C16150sX.A0T(A002);
            this.A06 = C16150sX.A0Z(A002);
            this.A08 = C16150sX.A14(A002);
        }
        this.A0B = r6;
        setOrientation(1);
        setGravity(16);
        LinearLayout.inflate(context, R.layout.layout0513, this);
        this.A03 = C13680ns.A0Q(this, R.id.search_row_poll_name);
        this.A04 = C13680ns.A0Q(this, R.id.search_row_poll_options);
        setBackground(AnonymousClass2SR.A04(getContext(), C13690nt.A0C(context, R.drawable.search_attachment_background), R.color.color06b5));
        this.A00 = AnonymousClass00T.A00(context, R.color.color0505);
        this.A01 = AnonymousClass00T.A00(context, R.color.color0507);
        AnonymousClass1UP.A06(this.A03);
        this.A03.setMaxLines(2);
        this.A04.setMaxLines(1);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen06bd);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen06be);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    public final void A00(TextEmojiLabel textEmojiLabel, CharSequence charSequence, List list) {
        Context context = getContext();
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        TextPaint paint = textEmojiLabel2.getPaint();
        int maxLines = textEmojiLabel2.getMaxLines();
        int measuredWidth = ((View) textEmojiLabel2.getParent()).getMeasuredWidth();
        C17250um r4 = this.A07;
        AnonymousClass01V r2 = this.A05;
        CharSequence charSequence2 = charSequence;
        AnonymousClass01V r16 = r2;
        C604131j r13 = new C604131j(context, paint, r16, this.A06, r4, this.A08, charSequence2, list, maxLines, measuredWidth);
        IDxCallbackShape342S0100000_2_I1 iDxCallbackShape342S0100000_2_I1 = new IDxCallbackShape342S0100000_2_I1(textEmojiLabel2, 1);
        if (charSequence2.length() <= 768) {
            C435020g r12 = new C435020g(charSequence2);
            int length = charSequence2.length();
            int i2 = 0;
            while (i2 < length) {
                r12.A00 = i2;
                long A002 = EmojiDescriptor.A00(r12, false);
                int A012 = r12.A01(i2, A002);
                if (A002 == -1) {
                    i2 += A012;
                }
            }
            try {
                iDxCallbackShape342S0100000_2_I1.AOt(r13.call());
                return;
            } catch (AnonymousClass057 unused) {
                return;
            }
        }
        textEmojiLabel2.setPlaceholder(80);
        this.A0B.A00(iDxCallbackShape342S0100000_2_I1, r13);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A09;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public void setMessage(C39171s2 r9, List list) {
        if (r9 == null) {
            this.A02.AcB("fmessagepoll-null", "fMessagePoll null on search", true);
            return;
        }
        TextEmojiLabel textEmojiLabel = this.A03;
        if (list == null || list.isEmpty()) {
            int i2 = this.A01;
        } else {
            int i3 = this.A00;
        }
        Context context = getContext();
        String str = r9.A03;
        AnonymousClass013 r7 = this.A06;
        CharSequence A012 = AnonymousClass2TP.A01(context, r7, str, list);
        StringBuilder A0o = AnonymousClass000.A0o();
        boolean z2 = false;
        for (C39631sn r1 : r9.A05) {
            A0o.append(z2 ? ", " : "");
            A0o.append(r1.A03);
            z2 = true;
        }
        A00(this.A04, AnonymousClass2TP.A01(getContext(), r7, A0o, list), list);
        A00(textEmojiLabel, A012, list);
    }
}
