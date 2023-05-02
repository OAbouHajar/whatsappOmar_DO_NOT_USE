package X;

import com.obwhatsapp.mediaview.MediaViewFragment;

/* renamed from: X.531  reason: invalid class name */
public final /* synthetic */ class AnonymousClass531 implements C108935Qb {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass29C A01;

    public /* synthetic */ AnonymousClass531(MediaViewFragment mediaViewFragment, AnonymousClass29C r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    public final void AZi(int i2) {
        MediaViewFragment mediaViewFragment = this.A00;
        if (this.A01.A0G && mediaViewFragment.A0C() != null) {
            boolean A1P = AnonymousClass000.A1P(C13690nt.A0J(mediaViewFragment.A0D()).getSystemUiVisibility() & 4);
            if (i2 == 0) {
                if (!A1P) {
                    mediaViewFragment.A1P(true, true);
                }
            } else if (i2 == 4 && A1P) {
                mediaViewFragment.A1P(false, true);
            }
        }
    }
}
