package X;

import com.obwhatsapp.R;
import com.obwhatsapp.mediaview.MediaViewFragment;

/* renamed from: X.3HK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HK implements C108965Qe {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ C38731rK A01;
    public final /* synthetic */ AnonymousClass29C A02;

    public /* synthetic */ AnonymousClass3HK(MediaViewFragment mediaViewFragment, C38731rK r2, AnonymousClass29C r3) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void AQg(String str, String str2, boolean z2) {
        MediaViewFragment mediaViewFragment = this.A00;
        C38731rK r1 = this.A01;
        AnonymousClass29C r2 = this.A02;
        if (str == null) {
            str = mediaViewFragment.A0J(R.string.str1863);
        }
        if (!z2) {
            C16730tY.A00(r1).A0Y = false;
            r2.A09();
            C001000l A0C = mediaViewFragment.A0C();
            if (A0C != null && !A0C.isFinishing()) {
                C32241fu A002 = C32241fu.A00(mediaViewFragment.A02());
                A002.A06(str);
                A002.A02(R.string.str073d);
                C13680ns.A1H(A002, mediaViewFragment, 66, R.string.str0881);
                C13690nt.A1G(A002);
            }
        }
    }
}
