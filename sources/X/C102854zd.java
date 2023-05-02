package X;

import com.facebook.redex.RunnableRunnableShape0S0210000_I0;
import com.obwhatsapp.mediaview.MediaViewFragment;

/* renamed from: X.4zd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C102854zd implements AnonymousClass29A {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ C16730tY A01;

    public /* synthetic */ C102854zd(MediaViewFragment mediaViewFragment, C16730tY r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    public final void AZA(boolean z2) {
        MediaViewFragment mediaViewFragment = this.A00;
        C16730tY r3 = this.A01;
        C14870pt r2 = mediaViewFragment.A0I;
        r2.A02.post(new RunnableRunnableShape0S0210000_I0(mediaViewFragment, r3, 16, z2));
    }
}
