package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.text.ReadMoreTextView;
import java.util.List;

/* renamed from: X.306  reason: invalid class name */
public class AnonymousClass306 extends AnonymousClass308 {
    public C16010sH A00;
    public final C15900s5 A01;
    public final AnonymousClass01V A02;
    public final C15810rt A03;
    public final C17250um A04;
    public final C17020u3 A05;
    public final C17110uY A06;
    public final boolean A07;

    public AnonymousClass306(ViewGroup viewGroup, C15900s5 r3, AnonymousClass1yP r4, AnonymousClass01V r5, C15810rt r6, C16010sH r7, C17250um r8, C17020u3 r9, C17110uY r10, boolean z2) {
        super(viewGroup, r4, 10);
        this.A06 = r10;
        this.A03 = r6;
        this.A04 = r8;
        this.A01 = r3;
        this.A02 = r5;
        this.A05 = r9;
        this.A00 = r7;
        this.A07 = z2;
    }

    public final void A06() {
        ViewGroup viewGroup = this.A01;
        C34331k5.A03(viewGroup, this, 2);
        ReadMoreTextView readMoreTextView = (ReadMoreTextView) viewGroup.findViewById(R.id.group_description_text);
        readMoreTextView.A02 = new AnonymousClass52C(this);
        SpannableStringBuilder A0F = C13690nt.A0F(C45922Bq.A03(this.A02, this.A05, AnonymousClass2Sy.A03((Context) this.A01, readMoreTextView.getPaint(), this.A04, this.A00.A0H.A02)));
        this.A06.A08(A0F);
        readMoreTextView.A0I((List) null, A0F);
    }
}
