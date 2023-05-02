package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.obwhatsapp.mediacomposer.doodle.DoodleView;
import java.util.List;

/* renamed from: X.3CW  reason: invalid class name */
public class AnonymousClass3CW implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public final GestureDetector.OnGestureListener A00;
    public final AnonymousClass09P A01;
    public final C109925Uh A02;
    public final DoodleView A03;
    public final C614138u A04;
    public final C88334aK A05;
    public final AnonymousClass4MT A06 = new AnonymousClass4MT(this);
    public final C63953Me A07;
    public final AnonymousClass4EW A08;
    public final C455729k A09;

    public AnonymousClass3CW(GestureDetector.OnGestureListener onGestureListener, C109925Uh r4, DoodleView doodleView, C614138u r6, AnonymousClass4EW r7, C455729k r8) {
        this.A03 = doodleView;
        this.A04 = r6;
        this.A08 = r7;
        this.A09 = r8;
        this.A02 = r4;
        this.A00 = onGestureListener;
        this.A01 = new AnonymousClass09P(doodleView.getContext(), this);
        C63953Me r0 = new C63953Me(doodleView.getContext(), this);
        this.A07 = r0;
        C04170Ll.A00(r0);
        this.A05 = new C88334aK(doodleView.getContext(), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011d, code lost:
        if (r5.A01 != 2) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012f, code lost:
        if (r5.A01 != 0) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.graphics.PointF r18, android.graphics.PointF r19) {
        /*
            r17 = this;
            r4 = r18
            r0 = r17
            X.38u r6 = r0.A04
            X.29l r0 = r6.A01
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0 instanceof X.AnonymousClass32x
            if (r0 != 0) goto L_0x001b
            float r0 = r4.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            float r0 = r4.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            r6.A00()
            X.397 r3 = r6.A04
            X.29l r0 = r6.A01
            android.graphics.RectF r0 = r0.A02
            float r2 = r0.centerX()
            float r1 = r0.centerY()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r2, r1)
            android.graphics.PointF r14 = r3.A01(r0)
            X.39P r0 = r6.A03
            float r1 = r0.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x019f
            X.39N r13 = r6.A05
            X.29l r12 = r6.A01
            X.29l r0 = r13.A04
            if (r0 == r12) goto L_0x004d
            r13.A04 = r12
            r13.A01()
        L_0x004d:
            float r11 = r4.x
            float r15 = r4.y
            android.graphics.RectF r0 = r13.A02
            r16 = r0
            float r1 = r16.centerX()
            float r0 = r16.centerY()
            android.graphics.PointF r10 = new android.graphics.PointF
            r10.<init>(r1, r0)
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x019a
            float r1 = r13.A00
        L_0x0068:
            float r1 = r1 + r11
            boolean r0 = r13.A07
            if (r0 == 0) goto L_0x0196
            float r0 = r13.A01
        L_0x006f:
            float r0 = r0 + r15
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r1, r0)
            boolean r0 = r13.A07
            r8 = 1
            r7 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0172
            float r1 = r16.centerY()
            float r2 = r13.A08
            float r1 = r1 + r2
            float r0 = r9.y
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0166
            float r1 = r16.centerY()
            float r1 = r1 - r2
            float r0 = r9.y
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0166
            float r0 = r13.A01
            float r0 = r0 + r15
            r13.A01 = r0
            r15 = 0
        L_0x009a:
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x0142
            float r1 = r16.centerX()
            float r2 = r13.A08
            float r1 = r1 + r2
            float r0 = r9.x
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0136
            float r1 = r16.centerX()
            float r1 = r1 - r2
            float r0 = r9.x
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0136
            float r0 = r13.A00
            float r0 = r0 + r11
            r13.A00 = r0
            r11 = 0
        L_0x00bc:
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r11, r15)
            float r5 = r14.x
            float r0 = r1.x
            float r5 = r5 + r0
            float r2 = r14.y
            float r0 = r1.y
            float r2 = r2 + r0
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>(r5, r2)
            java.util.Map r2 = r13.A05
            java.lang.Integer r0 = X.C13680ns.A0a()
            java.lang.Object r5 = r2.get(r0)
            X.32o r5 = (X.C604932o) r5
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x00e3
            r13.A00(r8, r12, r7)
        L_0x00e3:
            float r7 = r4.x
            float r7 = r7 * r7
            float r0 = r4.y
            float r0 = r0 * r0
            float r7 = r7 + r0
            double r7 = (double) r7
            double r9 = java.lang.Math.sqrt(r7)
            r7 = 4641240890982006784(0x4069000000000000, double:200.0)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            boolean r9 = X.AnonymousClass000.A1Q(r0)
            java.util.Iterator r8 = X.C13680ns.A0q(r2)
        L_0x00fb:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x019e
            java.lang.Object r7 = r8.next()
            X.39j r7 = (X.C615539j) r7
            int r4 = r7.A01()
            r0 = 1
            if (r4 == r0) goto L_0x0123
            r2 = 2
            if (r4 != r2) goto L_0x00fb
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x0132
            if (r9 != 0) goto L_0x0132
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x011f
            int r0 = r5.A01
            if (r0 == r2) goto L_0x0132
        L_0x011f:
            r7.A04()
            goto L_0x00fb
        L_0x0123:
            boolean r0 = r13.A07
            if (r0 == 0) goto L_0x0132
            if (r9 != 0) goto L_0x0132
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x011f
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0132
            goto L_0x011f
        L_0x0132:
            r7.A03()
            goto L_0x00fb
        L_0x0136:
            r13.A06 = r5
            float r1 = r13.A00
            float r0 = r14.x
            float r1 = r1 - r0
            float r11 = r11 + r1
            r13.A00 = r7
            goto L_0x00bc
        L_0x0142:
            float r1 = r14.x
            float r2 = r10.x
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0151
            float r0 = r4.x
            float r0 = r0 + r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x015c
        L_0x0151:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00bc
            float r0 = r4.x
            float r0 = r0 + r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00bc
        L_0x015c:
            r13.A06 = r8
            float r0 = r9.x
            r13.A00 = r0
            float r11 = r2 - r1
            goto L_0x00bc
        L_0x0166:
            r13.A07 = r5
            float r1 = r13.A01
            float r0 = r14.y
            float r1 = r1 - r0
            float r15 = r15 + r1
            r13.A01 = r7
            goto L_0x009a
        L_0x0172:
            float r2 = r14.y
            float r1 = r10.y
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0181
            float r0 = r4.y
            float r0 = r0 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x018c
        L_0x0181:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x009a
            float r0 = r4.y
            float r0 = r0 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x009a
        L_0x018c:
            r13.A07 = r8
            float r0 = r9.y
            r13.A01 = r0
            float r15 = r1 - r2
            goto L_0x009a
        L_0x0196:
            float r0 = r14.y
            goto L_0x006f
        L_0x019a:
            float r1 = r14.x
            goto L_0x0068
        L_0x019e:
            r4 = r1
        L_0x019f:
            X.39G r7 = r6.A06
            r0 = r19
            float r1 = r0.x
            float r0 = r0.y
            boolean r5 = r7.A01(r1, r0)
            boolean r0 = r7.A00
            if (r5 == 0) goto L_0x01d6
            if (r0 != 0) goto L_0x01db
            X.3L6 r2 = r7.A04
            android.view.View r0 = r7.A03
            android.content.res.Resources r1 = X.C13680ns.A0D(r0)
            r0 = 2131101588(0x7f060794, float:1.781559E38)
            int r0 = r1.getColor(r0)
            r2.A00 = r0
            r2.invalidateSelf()
            android.os.Vibrator r2 = r7.A02
            if (r2 == 0) goto L_0x01db
            r0 = 3
            r2.vibrate(r0)     // Catch:{ NullPointerException -> 0x01cf }
            goto L_0x01db
        L_0x01cf:
            r1 = move-exception
            java.lang.String r0 = "Vibrator is broken on this device."
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x01db
        L_0x01d6:
            if (r0 == 0) goto L_0x01db
            r7.A00()
        L_0x01db:
            r7.A00 = r5
            float r1 = r4.x
            float r0 = r4.y
            float[] r5 = r3.A02
            r2 = 0
            r5[r2] = r1
            r4 = 1
            r5[r4] = r0
            android.graphics.Matrix r1 = r3.A00
            r1.reset()
            X.39P r3 = r3.A01
            int r0 = r3.A02
            int r0 = -r0
            float r0 = (float) r0
            r1.setRotate(r0)
            r1.mapPoints(r5)
            r2 = r5[r2]
            float r1 = r3.A00
            float r0 = r3.A01
            float r1 = r1 * r0
            float r2 = r2 / r1
            r0 = r5[r4]
            float r0 = r0 / r1
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r2, r0)
            X.29l r0 = r6.A01
            float r2 = r1.x
            float r1 = r1.y
            android.graphics.RectF r0 = r0.A02
            r0.offset(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CW.A00(android.graphics.PointF, android.graphics.PointF):void");
    }

    public final boolean A01(float f2, float f3) {
        C455729k r1 = this.A09;
        r1.A02 = null;
        r1.A00 = null;
        C455829l r2 = r1.A01;
        AnonymousClass2Ra r3 = ((AnonymousClass3G8) this.A02).A01;
        if (!r3.A03.A06(r2, f2, f3)) {
            if (r2 instanceof AnonymousClass32z) {
                r3.A0Q.A08(3);
                r3.A07((AnonymousClass32z) r2);
            } else if (r2 != null && r2.A0J()) {
                C49112Rc r12 = r3.A0Q;
                r12.A01 = r2.A01.getColor();
                r12.A08(2);
                r3.A0E.A00();
            }
            if (r2 == null || !r2.A0E()) {
                return false;
            }
            this.A03.invalidate();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDoubleTap(android.view.MotionEvent r6) {
        /*
            r5 = this;
            X.29k r4 = r5.A09
            r0 = 0
            r4.A02 = r0
            r4.A00 = r0
            X.29l r0 = r4.A01
            if (r0 == 0) goto L_0x0051
            java.util.List r3 = r4.A04
            boolean r0 = X.C13700nu.A0i(r3)
            if (r0 == 0) goto L_0x0051
            X.29l r0 = r4.A01
            if (r0 != 0) goto L_0x004c
            r2 = -1
        L_0x0018:
            int r1 = r3.size()
            r0 = 1
            int r1 = r1 - r0
            if (r2 == r1) goto L_0x0051
            X.29l r2 = r4.A01
            if (r2 != 0) goto L_0x0047
            r0 = -1
        L_0x0025:
            X.3us r1 = new X.3us
            r1.<init>(r2, r0)
            X.393 r0 = r4.A03
            java.util.LinkedList r0 = r0.A00
            r0.add(r1)
            X.29l r0 = r4.A01
            r3.remove(r0)
            X.29l r0 = r4.A01
            r3.add(r0)
            r0 = 1
        L_0x003c:
            r1 = 1
            if (r0 == 0) goto L_0x0053
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r5.A03
            X.29m r0 = r0.A0G
            r0.A01()
            return r1
        L_0x0047:
            int r0 = r3.indexOf(r2)
            goto L_0x0025
        L_0x004c:
            int r2 = r3.indexOf(r0)
            goto L_0x0018
        L_0x0051:
            r0 = 0
            goto L_0x003c
        L_0x0053:
            android.view.GestureDetector$OnGestureListener r0 = r5.A00
            if (r0 == 0) goto L_0x0060
            android.view.GestureDetector$OnDoubleTapListener r0 = (android.view.GestureDetector.OnDoubleTapListener) r0
            boolean r0 = r0.onDoubleTap(r6)
            if (r0 == 0) goto L_0x0060
            return r1
        L_0x0060:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CW.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        return onGestureListener != null && ((GestureDetector.OnDoubleTapListener) onGestureListener).onDoubleTapEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDown(android.view.MotionEvent r3) {
        /*
            r2 = this;
            X.29k r0 = r2.A09
            X.29l r0 = r0.A01
            if (r0 != 0) goto L_0x0011
            android.view.GestureDetector$OnGestureListener r0 = r2.A00
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.onDown(r3)
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CW.onDown(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onFling(android.view.MotionEvent r3, android.view.MotionEvent r4, float r5, float r6) {
        /*
            r2 = this;
            X.29k r0 = r2.A09
            X.29l r0 = r0.A01
            if (r0 != 0) goto L_0x0011
            android.view.GestureDetector$OnGestureListener r0 = r2.A00
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.onFling(r3, r4, r5, r6)
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CW.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public void onLongPress(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            onGestureListener.onLongPress(motionEvent);
        }
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f2 = ((C63953Me) scaleGestureDetector).A00;
        C455829l r7 = this.A08.A00;
        if (r7 == null) {
            GestureDetector.OnGestureListener onGestureListener = this.A00;
            return onGestureListener != null && ((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScale(scaleGestureDetector);
        } else if (r7 instanceof AnonymousClass32w) {
            int i2 = 0;
            if (Math.abs(f2) < 1.0f) {
                i2 = 1;
            }
            r7.A07(scaleFactor, i2 ^ 1);
            return true;
        } else if ((r7 instanceof AnonymousClass32u) || (r7 instanceof AnonymousClass32t)) {
            int i3 = 0;
            if (Math.abs(Math.tan(Math.atan((double) f2) - Math.toRadians((double) r7.A00))) < 1.0d) {
                i3 = 1;
            }
            r7.A07(scaleFactor, 1 ^ i3);
            return true;
        } else {
            r7.A06(scaleFactor);
            return true;
        }
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        AnonymousClass4EW r1 = this.A08;
        C455829l r0 = this.A09.A01;
        r1.A00 = r0;
        if (r0 != null) {
            return true;
        }
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        return onGestureListener != null && ((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScaleBegin(scaleGestureDetector);
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A08.A00 = null;
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            ((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScaleEnd(scaleGestureDetector);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onScroll(android.view.MotionEvent r3, android.view.MotionEvent r4, float r5, float r6) {
        /*
            r2 = this;
            X.29k r0 = r2.A09
            X.29l r0 = r0.A01
            if (r0 != 0) goto L_0x0011
            android.view.GestureDetector$OnGestureListener r0 = r2.A00
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.onScroll(r3, r4, r5, r6)
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CW.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public void onShowPress(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            onGestureListener.onShowPress(motionEvent);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener;
        C455729k r1 = this.A09;
        List list = r1.A04;
        if (list.size() == 1) {
            return false;
        }
        C455829l r0 = r1.A01;
        if ((r0 == null ? -1 : list.indexOf(r0)) != C13700nu.A00(list, 1)) {
            return A01(motionEvent.getX(), motionEvent.getY()) || ((onGestureListener = this.A00) != null && ((GestureDetector.OnDoubleTapListener) onGestureListener).onSingleTapConfirmed(motionEvent));
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if ((r0 == null ? -1 : r2.indexOf(r0)) == X.C13700nu.A00(r2, 1)) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSingleTapUp(android.view.MotionEvent r5) {
        /*
            r4 = this;
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r4.A03
            X.29l r0 = r0.A00(r5)
            X.29k r1 = r4.A09
            r1.A01 = r0
            r3 = 1
            if (r0 == 0) goto L_0x0032
            java.util.List r2 = r1.A04
            int r0 = r2.size()
            if (r0 == r3) goto L_0x0020
            X.29l r0 = r1.A01
            if (r0 != 0) goto L_0x002d
            r1 = -1
        L_0x001a:
            int r0 = X.C13700nu.A00(r2, r3)
            if (r1 != r0) goto L_0x0032
        L_0x0020:
            float r1 = r5.getX()
            float r0 = r5.getY()
            boolean r0 = r4.A01(r1, r0)
            return r0
        L_0x002d:
            int r1 = r2.indexOf(r0)
            goto L_0x001a
        L_0x0032:
            android.view.GestureDetector$OnGestureListener r0 = r4.A00
            if (r0 == 0) goto L_0x003d
            boolean r0 = r0.onSingleTapUp(r5)
            if (r0 == 0) goto L_0x003d
            return r3
        L_0x003d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CW.onSingleTapUp(android.view.MotionEvent):boolean");
    }
}
