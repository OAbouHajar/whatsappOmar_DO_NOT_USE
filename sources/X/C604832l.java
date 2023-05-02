package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import com.obwhatsapp.mediacomposer.ImageComposerFragment;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;

/* renamed from: X.32l  reason: invalid class name and case insensitive filesystem */
public class C604832l extends AnonymousClass4XG {
    public final /* synthetic */ ImageComposerFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C604832l(ImageComposerFragment imageComposerFragment) {
        super(imageComposerFragment);
        this.A00 = imageComposerFragment;
    }

    public void A00() {
        ImageComposerFragment imageComposerFragment = this.A00;
        C47792Kn r0 = imageComposerFragment.A06.A05;
        if (r0.A00 <= r0.A02) {
            imageComposerFragment.A1M(true, false);
        }
    }

    public void A01() {
        this.A00.A1M(false, true);
    }

    public void A02() {
        Rect rect;
        ImageComposerFragment imageComposerFragment = this.A00;
        C47792Kn r0 = imageComposerFragment.A06.A05;
        C1045956b r3 = r0.A0H;
        if (r3 != null) {
            float f2 = r0.A00;
            float f3 = r0.A02;
            View view = r0.A0D;
            r3.A00(f2, f3, (float) (view.getWidth() >> 1), (float) (view.getHeight() >> 1), 200);
        }
        C001000l A0C = imageComposerFragment.A0C();
        C614538z r5 = new C614538z(A0C);
        AnonymousClass29K r4 = (AnonymousClass29K) A0C;
        if (C13700nu.A0i(imageComposerFragment.A0D.A0O.A04)) {
            AnonymousClass2Ra r1 = imageComposerFragment.A0D;
            AnonymousClass39P r02 = r1.A0I;
            String A04 = new C62033Bj(r02.A06, r02.A07, r1.A0O.A05, r02.A02).A04();
            if (A04 != null) {
                r5.A0B = A04;
            }
        }
        r5.A02 = imageComposerFragment.A07.A01;
        r5.A0H = false;
        r5.A0E = false;
        r5.A0F = false;
        r5.A03 = imageComposerFragment.A09.A03(C16620tM.A02, 1576);
        r5.A0A = Uri.fromFile(ImageComposerFragment.A01(imageComposerFragment.A00, imageComposerFragment.A01));
        r5.A0C = Bitmap.CompressFormat.JPEG.toString();
        Uri uri = imageComposerFragment.A00;
        AnonymousClass29Q r6 = ((MediaComposerActivity) r4).A1S;
        r5.A09 = Uri.fromFile(r6.A00(uri).A05());
        C001000l A0C2 = imageComposerFragment.A0C();
        boolean z2 = true;
        if (A0C2 == null || A0C2.getIntent().getIntExtra("origin", 1) != 35) {
            z2 = false;
        }
        if (z2) {
            r5.A00 = 1;
            r5.A01 = 1;
        }
        AnonymousClass20I A002 = r6.A00(imageComposerFragment.A00);
        synchronized (A002) {
            rect = A002.A04;
        }
        if (rect != null) {
            r5.A08 = rect;
        }
        r5.A05 = imageComposerFragment.A1K();
        if (imageComposerFragment.A00.getQueryParameter("flip-h") != null) {
            r5.A0G = true;
        }
        imageComposerFragment.A09 = true;
        imageComposerFragment.startActivityForResult(r5.A00(), 1);
    }

    public void A03() {
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) ((AnonymousClass29K) this.A00.A0C());
        mediaComposerActivity.A0o.A02(mediaComposerActivity.A0l.A08());
    }

    public void A04() {
        ImageComposerFragment imageComposerFragment = this.A00;
        ((AnonymousClass29K) imageComposerFragment.A0C()).AQ0();
        C47792Kn r0 = imageComposerFragment.A06.A05;
        if (r0.A00 <= r0.A02 && imageComposerFragment.A0D.A0E.A05.getVisibility() != 0) {
            imageComposerFragment.A1M(true, false);
        }
    }

    public void A05() {
        ImageComposerFragment imageComposerFragment = this.A00;
        C30141bo r0 = imageComposerFragment.A07;
        boolean A08 = r0.A08();
        boolean A09 = r0.A09();
        if (!A08 || A09) {
            imageComposerFragment.A1M(false, !A09);
        }
        boolean z2 = imageComposerFragment.A07.A0H;
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) ((AnonymousClass29K) imageComposerFragment.A0C());
        if (!mediaComposerActivity.isFinishing()) {
            mediaComposerActivity.A1D = z2;
        }
    }
}
