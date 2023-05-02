package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.3Ed  reason: invalid class name and case insensitive filesystem */
public class C62583Ed implements AnonymousClass5SS {
    public View A00;
    public final AnonymousClass1VI A01;
    public final AnonymousClass4DD A02;
    public final C14710pd A03;
    public final AnonymousClass01J A04;

    public C62583Ed(AnonymousClass1VI r1, AnonymousClass4DD r2, C14710pd r3, AnonymousClass01J r4) {
        this.A03 = r3;
        this.A01 = r1;
        this.A04 = r4;
        this.A02 = r2;
    }

    public void AHm() {
        C13680ns.A13(this.A00);
    }

    public boolean AfA() {
        AnonymousClass01J r1 = this.A04;
        if (r1.get() == null) {
            return false;
        }
        r1.get();
        return false;
    }

    public void AhG() {
        if (AfA() && this.A00 == null) {
            AnonymousClass1VI r2 = this.A01;
            View A0H = C13680ns.A0H(C13680ns.A0G(r2), r2, R.layout.layout01fc);
            this.A00 = A0H;
            r2.addView(A0H);
        }
        View view = this.A00;
        if (view == null) {
            AnonymousClass1VI r22 = this.A01;
            view = C13680ns.A0H(C13680ns.A0G(r22), r22, R.layout.layout01fc);
            this.A00 = view;
        }
        AnonymousClass1VI r6 = this.A01;
        Context context = r6.getContext();
        SpannableStringBuilder A0F = C13690nt.A0F(context.getString(R.string.str1639));
        SpannableString spannableString = new SpannableString(context.getString(R.string.str1cf6));
        spannableString.setSpan(C13690nt.A0G(context, R.color.color04f8), 0, spannableString.length(), 33);
        A0F.append(" ").append(spannableString);
        C13680ns.A0Q(view, R.id.banner_description).A0I((List) null, A0F);
        r6.setBackgroundResource(R.color.color0141);
        C13680ns.A1B(r6, this, context, 6);
        C13680ns.A1A(C004601z.A0E(view, R.id.close), this, 28);
        view.setVisibility(0);
    }
}
