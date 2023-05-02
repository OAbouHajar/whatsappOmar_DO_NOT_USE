package X;

import android.net.Uri;
import android.view.View;
import com.obwhatsapp.biz.BusinessProfileFieldView;

/* renamed from: X.4kJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94064kJ implements View.OnClickListener {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ C19980zJ A01;
    public final /* synthetic */ BusinessProfileFieldView A02;
    public final /* synthetic */ AnonymousClass1KR A03;
    public final /* synthetic */ C35661mI A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public /* synthetic */ C94064kJ(Uri uri, C19980zJ r2, BusinessProfileFieldView businessProfileFieldView, AnonymousClass1KR r4, C35661mI r5, Integer num, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = r4;
        this.A06 = str;
        this.A07 = z2;
        this.A05 = num;
        this.A08 = z3;
        this.A09 = z4;
        this.A0A = z5;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = businessProfileFieldView;
        this.A00 = uri;
    }

    public final void onClick(View view) {
        AnonymousClass1KR r6 = this.A03;
        String str = this.A06;
        boolean z2 = this.A07;
        Integer num = this.A05;
        boolean z3 = this.A08;
        boolean z4 = this.A09;
        boolean z5 = this.A0A;
        C35661mI r4 = this.A04;
        C19980zJ r3 = this.A01;
        BusinessProfileFieldView businessProfileFieldView = this.A02;
        Uri uri = this.A00;
        r6.A05(Integer.valueOf(C13690nt.A00(z2 ? 1 : 0)), num, str, 2, z3, z4);
        if (z5) {
            r6.A01(r4, 10);
        }
        r3.A06(businessProfileFieldView.getContext(), C13690nt.A0B(uri));
    }
}
