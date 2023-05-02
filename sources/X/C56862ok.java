package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.redex.IDxCListenerShape228S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.text.ReadMoreTextView;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.2ok  reason: invalid class name and case insensitive filesystem */
public class C56862ok extends FrameLayout implements AnonymousClass006 {
    public C16000sG A00;
    public AnonymousClass01V A01;
    public C16010sH A02;
    public C17250um A03;
    public AnonymousClass18O A04;
    public GroupJid A05;
    public C17020u3 A06;
    public C17110uY A07;
    public C52662eE A08;
    public CharSequence A09;
    public boolean A0A;
    public final View A0B;
    public final AnonymousClass28S A0C;
    public final ReadMoreTextView A0D;

    public C56862ok(Context context) {
        super(context);
        if (!this.A0A) {
            this.A0A = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A07 = C16150sX.A1A(A002);
            this.A03 = C16150sX.A0i(A002);
            this.A00 = C16150sX.A0M(A002);
            this.A01 = C16150sX.A0T(A002);
            this.A04 = (AnonymousClass18O) A002.ABN.get();
            this.A06 = C16150sX.A14(A002);
        }
        FrameLayout.inflate(getContext(), R.layout.layout010e, this);
        ReadMoreTextView readMoreTextView = (ReadMoreTextView) C004601z.A0E(this, R.id.community_description_text);
        this.A0D = readMoreTextView;
        this.A0B = C004601z.A0E(this, R.id.community_home_top_divider);
        C30531cW.A03(readMoreTextView, this.A01);
        this.A0C = new IDxCListenerShape228S0100000_2_I1(this, 2);
    }

    private void setDescription(CharSequence charSequence) {
        if (!charSequence.equals(this.A09)) {
            this.A09 = charSequence;
            AnonymousClass01V r5 = this.A01;
            C17020u3 r4 = this.A06;
            Context context = getContext();
            ReadMoreTextView readMoreTextView = this.A0D;
            SpannableStringBuilder A0F = C13690nt.A0F(C45922Bq.A03(r5, r4, AnonymousClass2Sy.A03(context, readMoreTextView.getPaint(), this.A03, charSequence)));
            this.A07.A08(A0F);
            readMoreTextView.A0I((List) null, A0F);
        }
    }

    public final void A00() {
        C30371cF r0;
        C16010sH r02 = this.A02;
        if (r02 == null || (r0 = r02.A0H) == null || TextUtils.isEmpty(r0.A02)) {
            this.A0D.setVisibility(8);
            this.A0B.setVisibility(8);
            return;
        }
        String str = this.A02.A0H.A02;
        this.A0D.setVisibility(0);
        this.A0B.setVisibility(0);
        setDescription(str);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A08;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass18O r0 = this.A04;
        r0.A00.add(this.A0C);
        this.A0D.requestLayout();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass18O r0 = this.A04;
        r0.A00.remove(this.A0C);
    }
}
