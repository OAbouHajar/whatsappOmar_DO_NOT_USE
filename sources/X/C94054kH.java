package X;

import android.net.Uri;
import android.view.View;
import com.obwhatsapp.biz.profile.TrustSignalItem;

/* renamed from: X.4kH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94054kH implements View.OnClickListener {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ C19980zJ A01;
    public final /* synthetic */ TrustSignalItem A02;
    public final /* synthetic */ AnonymousClass1KR A03;
    public final /* synthetic */ C35661mI A04;
    public final /* synthetic */ C35571m9 A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ C94054kH(Uri uri, C19980zJ r2, TrustSignalItem trustSignalItem, AnonymousClass1KR r4, C35661mI r5, C35571m9 r6, Integer num, String str, boolean z2, boolean z3) {
        this.A00 = uri;
        this.A01 = r2;
        this.A02 = trustSignalItem;
        this.A05 = r6;
        this.A03 = r4;
        this.A07 = str;
        this.A06 = num;
        this.A08 = z2;
        this.A04 = r5;
        this.A09 = z3;
    }

    public final void onClick(View view) {
        Uri uri = this.A00;
        C19980zJ r3 = this.A01;
        TrustSignalItem trustSignalItem = this.A02;
        C35571m9 r6 = this.A05;
        AnonymousClass1KR r4 = this.A03;
        String str = this.A07;
        Integer num = this.A06;
        boolean z2 = this.A08;
        AnonymousClass4Xp.A01(trustSignalItem.getContext(), uri, r3, r4, this.A04, r6, num, str, trustSignalItem.A00, z2, this.A09);
    }
}
