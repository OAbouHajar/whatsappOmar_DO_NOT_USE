package X;

import android.net.Uri;
import com.facebook.redex.IDxRCallbackShape232S0100000_3_I1;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5ej  reason: invalid class name and case insensitive filesystem */
public final class C110725ej extends C003401n implements C18950xW {
    public boolean A00 = false;
    public final AnonymousClass027 A01 = new AnonymousClass027(AnonymousClass5xI.A00((Object) null));
    public final C16600tK A02;
    public final C18260wP A03;
    public final C16440t3 A04;
    public final C18300wT A05;
    public final C18310wU A06;
    public final C18090w8 A07;
    public final C18290wS A08;
    public final C117795tZ A09;
    public final C18280wR A0A;
    public final String A0B;

    public C110725ej(Uri uri, C16600tK r4, C18260wP r5, C16440t3 r6, C18300wT r7, C18310wU r8, C18090w8 r9, C18290wS r10, C117795tZ r11, C18280wR r12) {
        this.A04 = r6;
        this.A09 = r11;
        this.A0A = r12;
        this.A08 = r10;
        this.A02 = r4;
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A03 = r5;
        r4.A04(this);
        String lastPathSegment = uri.getLastPathSegment();
        this.A0B = lastPathSegment;
        if (r4.A08() && lastPathSegment != null) {
            this.A00 = true;
            A05(lastPathSegment);
        }
    }

    public final void A05(String str) {
        C18310wU r4 = this.A06;
        String A012 = this.A0A.A01();
        C35081lL[] r5 = new C35081lL[2];
        boolean A032 = C35081lL.A03("action", "verify-deep-link", r5);
        r5[1] = new C35081lL("device-id", A012);
        C35081lL[] r2 = new C35081lL[1];
        C35081lL.A02("payload", str, r2, A032 ? 1 : 0);
        r4.A0F(new IDxRCallbackShape232S0100000_3_I1(this, 1), new C28371Vv(new C28371Vv(FacebookFacade.RequestParameter.LINK, r2), "account", r5), "get");
    }

    public final void A06(Throwable th, int i2) {
        Log.e(C13680ns.A0c(i2, "PAY ViralityLinkViewModel verifyInviteCode on ErrorCode : "), th);
        AnonymousClass027 r5 = this.A01;
        C117795tZ r1 = this.A09;
        int i3 = R.string.str1a29;
        if (i2 == 405) {
            i3 = R.string.str1a22;
        }
        int A002 = r1.A00(i2);
        int i4 = R.string.str0394;
        if (i2 == 405) {
            i4 = R.string.str0e87;
        }
        r5.A09(AnonymousClass5xI.A02(new C117305sm(i3, A002, i4, 0), th));
    }

    public void ARy() {
        String str;
        if (!this.A00 && this.A02.A08() && (str = this.A0B) != null) {
            A05(str);
            this.A00 = true;
        }
    }

    public /* synthetic */ void ARz() {
    }

    public /* synthetic */ void AS0() {
    }

    public /* synthetic */ void AS1() {
    }
}
