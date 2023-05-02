package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.Set;

/* renamed from: X.31F  reason: invalid class name */
public class AnonymousClass31F extends AnonymousClass30H {
    public C16980tz A00;
    public AnonymousClass175 A01;
    public C47372Ir A02;
    public C18090w8 A03;
    public C218315p A04;
    public C18840xL A05;
    public final FrameLayout A06;
    public final ImageView A07;
    public final TextEmojiLabel A08 = C13680ns.A0R(this, R.id.get_started);
    public final TextEmojiLabel A09 = C13680ns.A0Q(this, R.id.invite_description);
    public final AnonymousClass52M A0A;

    public AnonymousClass31F(Context context, AnonymousClass1YG r7, C16740tZ r8) {
        super(context, r7, r8);
        FrameLayout A082 = C13700nu.A08(this, R.id.payment_container);
        this.A06 = A082;
        this.A07 = C13680ns.A0J(this, R.id.payment_brand_logo);
        ViewStub viewStub = (ViewStub) C004601z.A0E(this, R.id.payment_invite_right_view_stub);
        A082.setForeground(getInnerFrameForegroundDrawable());
        if (this.A03.A09()) {
            this.A02 = this.A1K.A03().AEf();
        }
        AnonymousClass52M r0 = new AnonymousClass52M(this.A00, this.A05, this.A1e);
        this.A0A = r0;
        C811947f.A00(viewStub, r0);
        A1M();
    }

    private CharSequence getInviteContext() {
        C16740tZ fMessage = getFMessage();
        C218315p r6 = this.A04;
        Context context = getContext();
        C28381Vw r0 = fMessage.A11;
        boolean z2 = r0.A02;
        C15830rv r2 = r0.A00;
        AnonymousClass00B.A06(r2);
        String A0E = r6.A03.A0E(r6.A01.A0A(r2));
        if (r6.A0B.A09()) {
            r6.A0C.A03().AEf();
        }
        int i2 = R.string.str0f6a;
        if (z2) {
            i2 = R.string.str0f6b;
        }
        String A0d = C13680ns.A0d(context, A0E, C13680ns.A1b(), 0, i2);
        SpannableStringBuilder A0F = C13690nt.A0F(A0d);
        int indexOf = A0d.indexOf(A0E);
        A0F.setSpan(new AnonymousClass3MR(getContext()), indexOf, A0E.length() + indexOf, 0);
        return A0F;
    }

    public void A0t() {
        A1J(false);
        A1M();
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, getFMessage());
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1M();
        }
    }

    public final void A1M() {
        Intent A9i;
        this.A09.setText(getInviteContext());
        C47372Ir r5 = this.A02;
        AnonymousClass479 r3 = new AnonymousClass479();
        AnonymousClass52M r1 = this.A0A;
        if (new AnonymousClass4J0(2, r3).A01 != null) {
            r1.A00.setImageResource(R.drawable.payment_invite_bubble_icon);
        }
        if (r5 != null) {
            Drawable ABp = r5.ABp();
            ImageView imageView = this.A07;
            imageView.setVisibility(0);
            imageView.setImageDrawable(ABp);
        }
        TextEmojiLabel textEmojiLabel = this.A08;
        if (textEmojiLabel == null) {
            return;
        }
        if (!this.A03.A09() || r5 == null || (A9i = r5.A9i(getFMessage())) == null) {
            textEmojiLabel.setVisibility(8);
            return;
        }
        textEmojiLabel.setVisibility(0);
        C13680ns.A1C(textEmojiLabel, this, A9i, 2);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01b9;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01b9;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A06);
        return innerFrameLayouts;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01ba;
    }
}
