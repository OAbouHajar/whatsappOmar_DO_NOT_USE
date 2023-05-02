package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.obwhatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.3Fa  reason: invalid class name and case insensitive filesystem */
public class C62813Fa implements AnonymousClass2OV {
    public final /* synthetic */ ImageComposerFragment A00;

    public C62813Fa(ImageComposerFragment imageComposerFragment) {
        this.A00 = imageComposerFragment;
    }

    public String AGT() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass000.A1I(this.A00.A00, A0o);
        return AnonymousClass000.A0h("-original", A0o);
    }

    public Bitmap AKB() {
        try {
            ImageComposerFragment imageComposerFragment = this.A00;
            Uri.Builder buildUpon = Uri.fromFile(C14530pL.A0L(imageComposerFragment).A05()).buildUpon();
            if (imageComposerFragment.A00.getQueryParameter("flip-h") != null) {
                buildUpon.appendQueryParameter("flip-h", imageComposerFragment.A00.getQueryParameter("flip-h"));
            }
            Uri build = buildUpon.build();
            C14710pd r3 = imageComposerFragment.A09;
            AnonymousClass1A9 r2 = imageComposerFragment.A0M;
            int A03 = r3.A03(C16620tM.A02, 1576);
            return r2.A0W(build, A03, A03);
        } catch (AnonymousClass20M | IOException e2) {
            Log.e("ImageComposerFragment/loadOriginalBitmap", e2);
            return null;
        }
    }
}
