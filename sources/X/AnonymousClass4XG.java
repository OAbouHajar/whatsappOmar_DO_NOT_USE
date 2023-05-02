package X;

import android.view.View;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.4XG  reason: invalid class name */
public class AnonymousClass4XG {
    public final /* synthetic */ MediaComposerFragment A00;

    public AnonymousClass4XG(MediaComposerFragment mediaComposerFragment) {
        this.A00 = mediaComposerFragment;
    }

    public void A00() {
    }

    public void A01() {
    }

    public void A02() {
    }

    public void A03() {
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) ((AnonymousClass29K) this.A00.A0C());
        mediaComposerActivity.A0o.A02(mediaComposerActivity.A0l.A08());
    }

    public void A04() {
        ((AnonymousClass29K) this.A00.A0C()).AQ0();
    }

    public void A05() {
        MediaComposerFragment mediaComposerFragment = this.A00;
        C001000l A0C = mediaComposerFragment.A0C();
        if (A0C != null && !A0C.isFinishing()) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) ((AnonymousClass29K) mediaComposerFragment.A0C());
            if (!mediaComposerActivity.isFinishing()) {
                mediaComposerActivity.A1D = false;
            }
        }
    }

    public boolean A06(C455829l r6, float f2, float f3) {
        if (!(this instanceof C76843um)) {
            return false;
        }
        C76843um r4 = (C76843um) this;
        if (r6 != null) {
            View view = r4.A00.A07;
            float height = ((float) view.getHeight()) / 2.0f;
            float x2 = (view.getX() + height) - f2;
            float y2 = (view.getY() + height) - f3;
            if ((x2 * x2) + (y2 * y2) > height * height) {
                return false;
            }
        }
        r4.A00.A1L();
        return true;
    }
}
