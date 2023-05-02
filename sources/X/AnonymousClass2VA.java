package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.obwhatsapp.R;
import com.obwhatsapp.camera.CameraBottomSheetBehavior;
import com.obwhatsapp.camera.overlays.ZoomOverlay;

/* renamed from: X.2VA  reason: invalid class name */
public class AnonymousClass2VA implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00 = 1.0f;
    public boolean A01;
    public final ScaleGestureDetector A02;
    public final AnonymousClass09P A03;
    public final C54812iJ A04;

    public AnonymousClass2VA(Context context, C54812iJ r3, boolean z2) {
        this.A03 = new AnonymousClass09P(context, this);
        this.A02 = new ScaleGestureDetector(context, this);
        this.A01 = z2;
        this.A04 = r3;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C54812iJ r0 = this.A04;
        motionEvent.getX();
        motionEvent.getY();
        C29251aI r02 = r0.A00;
        r02.A0E();
        r02.A0C();
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (!this.A01) {
            return false;
        }
        if (Math.abs(f2) > Math.abs(f3)) {
            C29251aI r1 = this.A04.A00;
            if (r1.A0C.AJZ()) {
                return true;
            }
            r1.A0H.A00(f2);
            return true;
        }
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        C54812iJ r0 = this.A04;
        if (i2 < 0) {
            C29251aI r4 = r0.A00;
            if (r4.A0C.AJZ()) {
                return true;
            }
            if (r4.A0D.A01 == 1) {
                AnonymousClass2V7 r3 = r4.A0G;
                CameraBottomSheetBehavior cameraBottomSheetBehavior = r3.A0B;
                cameraBottomSheetBehavior.A0M(3);
                if (cameraBottomSheetBehavior.A02) {
                    cameraBottomSheetBehavior.A00 = true;
                }
                r3.A08.setVisibility(0);
                r3.A01();
                return true;
            } else if (!r4.A0w) {
                return true;
            } else {
                AnimatorSet animatorSet = r4.A0G.A00;
                if (animatorSet != null && animatorSet.isStarted()) {
                    return true;
                }
                C29261aJ r02 = r4.A0D;
                r02.A01 = 1;
                if (!r02.A07.isEmpty()) {
                    AnonymousClass2V5 r2 = r4.A0F;
                    boolean z2 = true;
                    if (r4.A0D.A01 != 1) {
                        z2 = false;
                    }
                    r2.A08(z2);
                }
                r4.A0G.A03(true);
                return true;
            }
        } else {
            C29251aI r12 = r0.A00;
            if (r12.A0C.AJZ()) {
                return true;
            }
            r12.A0C();
            return true;
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f2 = this.A00 * scaleFactor * scaleFactor;
        this.A00 = f2;
        if (f2 < 1.0f) {
            this.A00 = 1.0f;
            f2 = 1.0f;
        }
        AnonymousClass2VD r7 = this.A04.A00.A0I;
        ZoomOverlay zoomOverlay = r7.A05;
        float maxScale = zoomOverlay.getMaxScale();
        if (maxScale < 1.0f) {
            return true;
        }
        if (f2 > maxScale) {
            f2 = maxScale;
        }
        AnonymousClass2Qt r2 = r7.A02;
        int Af4 = r2.Af4(Math.round((((float) r2.getMaxZoom()) * (f2 - 1.0f)) / (maxScale - 1.0f)));
        if (r2.AJZ() && !r7.A00) {
            return true;
        }
        zoomOverlay.A00 = f2;
        zoomOverlay.A02 = zoomOverlay.getContext().getString(R.string.str038c, new Object[]{Float.valueOf(((float) Af4) / 100.0f)});
        zoomOverlay.invalidate();
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C54812iJ r0 = this.A04;
        float f2 = this.A00;
        C29251aI r1 = r0.A00;
        if (!(!r1.A0D.A07.isEmpty())) {
            r1.A0U(false);
        }
        AnonymousClass2VD r12 = r1.A0I;
        if (!r12.A02.AJZ() || r12.A00) {
            ZoomOverlay zoomOverlay = r12.A05;
            zoomOverlay.setVisibility(0);
            zoomOverlay.A00 = f2;
            zoomOverlay.invalidate();
            zoomOverlay.removeCallbacks(zoomOverlay.A07);
            return true;
        }
        r12.A05.setVisibility(4);
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C29251aI r1 = this.A04.A00;
        if (!r1.A0C.AJZ()) {
            r1.A0U(true);
        }
        ZoomOverlay zoomOverlay = r1.A0I.A05;
        zoomOverlay.invalidate();
        zoomOverlay.postDelayed(zoomOverlay.A07, 300);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (!this.A01) {
            return false;
        }
        if (f3 < 0.0f) {
            C29251aI r1 = this.A04.A00;
            if (!r1.A0C.AJZ()) {
                r1.A0C();
            }
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C54812iJ r0 = this.A04;
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        C29251aI r1 = r0.A00;
        r1.A0C.A9A(x2, y2);
        r1.A0C.A6D();
        r1.A0C();
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
