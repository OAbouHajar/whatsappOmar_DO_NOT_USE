package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.34B  reason: invalid class name */
public class AnonymousClass34B extends C78183xN {
    public C56952pE A00;
    public C55772kL A01;
    public boolean A02;
    public final C16040sK A03;
    public final C17160ud A04;
    public final AnonymousClass2Ao A05;
    public final C16440t3 A06;
    public final AnonymousClass013 A07;
    public final C216114t A08;
    public final C19430yQ A09;
    public final AnonymousClass1P7 A0A;

    public AnonymousClass34B(Context context, C16040sK r2, C17160ud r3, AnonymousClass2Ao r4, C16440t3 r5, AnonymousClass013 r6, C216114t r7, C19430yQ r8, AnonymousClass1P7 r9) {
        super(context);
        A00();
        this.A06 = r5;
        this.A03 = r2;
        this.A0A = r9;
        this.A04 = r3;
        this.A07 = r6;
        this.A05 = r4;
        this.A09 = r8;
        this.A08 = r7;
        A03();
    }

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public View A01() {
        this.A00 = new C56952pE(getContext());
        FrameLayout.LayoutParams A0M = C13690nt.A0M();
        int A032 = C13690nt.A03(this);
        C45902Bo.A0A(this.A00, this.A07, A032, 0, A032, 0);
        this.A00.setLayoutParams(A0M);
        return this.A00;
    }

    public View A02() {
        Context context = getContext();
        C16440t3 r5 = this.A06;
        C16040sK r2 = this.A03;
        AnonymousClass1P7 r8 = this.A0A;
        this.A01 = new C55772kL(context, r2, this.A04, this.A05, r5, this.A08, this.A09, r8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen06a6);
        this.A01.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        return this.A01;
    }

    public void setMessage(C30901d9 r12, List list) {
        String string;
        String A012;
        String str = "";
        if (r12 instanceof C38751rM) {
            C38751rM r0 = (C38751rM) r12;
            string = r0.A01;
            if (string == null) {
                string = str;
            }
            A012 = r0.A00;
            String A14 = r0.A14();
            if (A14 != null) {
                Uri parse = Uri.parse(A14);
                if (parse.getHost() != null) {
                    str = parse.getHost();
                }
            }
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(A012)) {
                string = getContext().getString(R.string.str1d61);
            }
        } else {
            C38841rV r9 = (C38841rV) r12;
            string = getContext().getString(R.string.str0c65);
            C19430yQ r8 = this.A09;
            long A052 = r9.A11.A02 ? r8.A05(r9) : r8.A04(r9);
            C16440t3 r6 = this.A06;
            A012 = AnonymousClass3BR.A01(getContext(), this.A03, r6, this.A07, r8, r9, AnonymousClass3BR.A02(r6, r9, A052));
        }
        this.A00.setTitleAndDescription(string, A012, list);
        if (str != null) {
            this.A00.setSubText(str, (List) null);
        }
        this.A01.setMessage(r12);
    }
}
