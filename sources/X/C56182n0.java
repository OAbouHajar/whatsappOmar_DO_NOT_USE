package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.obwhatsapp.mediaview.PhotoView;
import java.util.ArrayList;

/* renamed from: X.2n0  reason: invalid class name and case insensitive filesystem */
public class C56182n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ C16730tY A01;

    public C56182n0(MediaViewFragment mediaViewFragment, C16730tY r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    public void onAnimationEnd(Animator animator) {
        Bitmap photo;
        MediaViewFragment mediaViewFragment = this.A00;
        C16730tY r6 = this.A01;
        Uri fromFile = Uri.fromFile(C16730tY.A00(r6).A0F);
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(fromFile);
        AnonymousClass2KC r5 = new AnonymousClass2KC(mediaViewFragment.A02());
        r5.A0E = A0u;
        r5.A0A = C16030sJ.A03(mediaViewFragment.A13);
        r5.A02 = 29;
        r5.A0I = true;
        byte b2 = r6.A10;
        if ((b2 == 1 || b2 == 42) && C455529g.A00) {
            PhotoView A1A = mediaViewFragment.A1A(r6.A11);
            if (!(A1A == null || (photo = A1A.getPhoto()) == null)) {
                C34711kk A02 = mediaViewFragment.A0Q.A02();
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append(fromFile);
                A02.A03(AnonymousClass000.A0h("-media_view", A0o), photo);
                r5.A07 = fromFile;
            }
            ArrayList A0u2 = AnonymousClass000.A0u();
            C13680ns.A1W(mediaViewFragment.A06().findViewById(R.id.pager_container), fromFile.toString(), A0u2);
            View findViewById = mediaViewFragment.A06().findViewById(R.id.media_preview_header);
            C13680ns.A1W(findViewById, C004601z.A0L(findViewById), A0u2);
            View findViewById2 = mediaViewFragment.A06().findViewById(R.id.media_preview_footer);
            C13680ns.A1W(findViewById2, C004601z.A0L(findViewById2), A0u2);
            View findViewById3 = mediaViewFragment.A06().findViewById(R.id.media_preview_send);
            C13680ns.A1W(findViewById3, C004601z.A0L(findViewById3), A0u2);
            mediaViewFragment.A0O(r5.A00(), 5, AnonymousClass09N.A02(mediaViewFragment.A0D(), (AnonymousClass01Q[]) A0u2.toArray(new AnonymousClass01Q[0])).A03());
            return;
        }
        mediaViewFragment.startActivityForResult(r5.A00(), 5);
        mediaViewFragment.A0D().overridePendingTransition(17432576, 0);
    }
}
