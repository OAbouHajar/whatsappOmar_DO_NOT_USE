package X;

import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.ImageComposerFragment;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.mediacomposer.MediaComposerFragment;
import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.2zi  reason: invalid class name and case insensitive filesystem */
public class C59992zi extends AnonymousClass2v4 {
    public final /* synthetic */ MediaComposerActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59992zi(AnonymousClass02C r1, MediaComposerActivity mediaComposerActivity) {
        super(r1);
        this.A00 = mediaComposerActivity;
    }

    public int A01() {
        return this.A00.A39().size();
    }

    public void A0A(ViewGroup viewGroup) {
        super.A0A(viewGroup);
        MediaComposerActivity mediaComposerActivity = this.A00;
        if (mediaComposerActivity.A35() < 0 && !mediaComposerActivity.A39().isEmpty()) {
            mediaComposerActivity.A3I(0);
        }
        for (AnonymousClass01A r2 : mediaComposerActivity.A2E()) {
            if (r2 instanceof MediaComposerFragment) {
                MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) r2;
                mediaComposerFragment.A1F(mediaComposerActivity.A1P);
                if (mediaComposerActivity.A1B && mediaComposerFragment.A00.equals(mediaComposerActivity.A9w())) {
                    mediaComposerFragment.A1C();
                    mediaComposerFragment.A1B();
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ int A0F(Object obj) {
        int indexOf = this.A00.A39().indexOf(((MediaComposerFragment) ((AnonymousClass01A) obj)).A00);
        if (indexOf < 0) {
            return -2;
        }
        return A0L(indexOf);
    }

    public void A0K(ViewGroup viewGroup, AnonymousClass01A r4, int i2) {
        PhotoView photoView;
        if (r4 instanceof ImageComposerFragment) {
            ((ImageComposerFragment) r4).A06.A00();
        } else {
            View view = r4.A0A;
            if (!(view == null || (photoView = (PhotoView) view.findViewById(R.id.photo)) == null)) {
                photoView.A02();
            }
        }
        super.A0H(viewGroup, r4, i2);
    }

    public final int A0L(int i2) {
        MediaComposerActivity mediaComposerActivity = this.A00;
        return !C13680ns.A1Z(mediaComposerActivity.A0U) ? C13700nu.A00(mediaComposerActivity.A39(), i2) - 1 : i2;
    }
}
