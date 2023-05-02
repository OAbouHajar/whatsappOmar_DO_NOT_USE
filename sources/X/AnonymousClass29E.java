package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.obwhatsapp.mediacomposer.ImageComposerFragment;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.mediacomposer.MediaComposerFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.29E  reason: invalid class name */
public class AnonymousClass29E implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ ImageComposerFragment A00;
    public final /* synthetic */ MediaComposerFragment A01;

    public AnonymousClass29E(ImageComposerFragment imageComposerFragment) {
        this.A00 = imageComposerFragment;
        this.A01 = imageComposerFragment;
    }

    public void A00() {
        ImageComposerFragment imageComposerFragment = this.A00;
        AnonymousClass29K r5 = (AnonymousClass29K) imageComposerFragment.A0C();
        if (r5 != null) {
            Uri uri = imageComposerFragment.A00;
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r5;
            mediaComposerActivity.A1S.A00(uri).A0A(imageComposerFragment.A07.A01);
            if (mediaComposerActivity.A0l.A08() && mediaComposerActivity.A0C.A0E(C16620tM.A02, 2589)) {
                mediaComposerActivity.A3K(uri);
                mediaComposerActivity.A0o.A08.A02.A01();
            }
        }
        if (imageComposerFragment.A0c()) {
            if (imageComposerFragment.A0C() != null && imageComposerFragment.A08.getDrawable() == null) {
                imageComposerFragment.A0C().A0c();
            }
            imageComposerFragment.A08.A06(imageComposerFragment.A07.A03);
            AnonymousClass2Ra r7 = imageComposerFragment.A0D;
            C88254aC r2 = r7.A0P;
            r2.A02 = null;
            r2.A03 = null;
            if (r7.A08) {
                for (AnonymousClass32x A0R : r7.A0O.A01()) {
                    A0R.A0R(r2);
                }
                r7.A08 = false;
            }
            C455929m r6 = r7.A0G;
            Bitmap bitmap = r6.A05;
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
            C455729k r0 = r6.A0H;
            ArrayList arrayList = new ArrayList();
            for (C455829l r1 : r0.A04) {
                if (r1 instanceof AnonymousClass32x) {
                    AnonymousClass32x r12 = (AnonymousClass32x) r1;
                    if (r12.A03 instanceof AnonymousClass333) {
                        arrayList.add(r12);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                r6.A03(true);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass32x r4 = (AnonymousClass32x) it.next();
                    C61773Ag r3 = r4.A03;
                    if (r3 instanceof AnonymousClass333) {
                        Bitmap bitmap2 = r6.A05;
                        PointF pointF = r6.A0D;
                        int i2 = r6.A00;
                        r4.A01 = bitmap2;
                        r4.A02 = pointF;
                        r4.A00 = i2;
                    }
                    r4.A05 = false;
                    Bitmap bitmap3 = r4.A01;
                    if (bitmap3 != null) {
                        r3.A01(bitmap3, r4.A02, r4.A00);
                        C61773Ag r13 = r4.A03;
                        Canvas canvas = r13.A00;
                        if (canvas != null) {
                            r13.A02(canvas);
                        }
                    }
                }
            }
            r7.A0H.invalidate();
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ImageComposerFragment imageComposerFragment = this.A00;
        boolean onDoubleTap = imageComposerFragment.A06.A05.onDoubleTap(motionEvent);
        if (onDoubleTap) {
            imageComposerFragment.A1M(false, true);
        }
        return onDoubleTap;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }
}
