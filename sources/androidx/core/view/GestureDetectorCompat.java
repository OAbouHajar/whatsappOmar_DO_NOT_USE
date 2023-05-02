package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class GestureDetectorCompat {

    /* renamed from: a  reason: collision with root package name */
    private final a f6a;

    interface a {
        void a(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        void a(boolean z2);

        boolean a();

        boolean a(MotionEvent motionEvent);
    }

    static class b implements a {

        /* renamed from: j  reason: collision with root package name */
        private static final int f7j = ViewConfiguration.getLongPressTimeout();

        /* renamed from: k  reason: collision with root package name */
        private static final int f8k = ViewConfiguration.getTapTimeout();

        /* renamed from: l  reason: collision with root package name */
        private static final int f9l = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a  reason: collision with root package name */
        final GestureDetector.OnGestureListener f10a;

        /* renamed from: b  reason: collision with root package name */
        GestureDetector.OnDoubleTapListener f11b;

        /* renamed from: c  reason: collision with root package name */
        boolean f12c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13d;

        /* renamed from: e  reason: collision with root package name */
        MotionEvent f14e;

        /* renamed from: f  reason: collision with root package name */
        private int f15f;

        /* renamed from: g  reason: collision with root package name */
        private int f16g;

        /* renamed from: h  reason: collision with root package name */
        private int f17h;

        /* renamed from: i  reason: collision with root package name */
        private int f18i;

        /* renamed from: m  reason: collision with root package name */
        private final Handler f19m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f20n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f21o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f22p;

        /* renamed from: q  reason: collision with root package name */
        private MotionEvent f23q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f24r;

        /* renamed from: s  reason: collision with root package name */
        private float f25s;

        /* renamed from: t  reason: collision with root package name */
        private float f26t;

        /* renamed from: u  reason: collision with root package name */
        private float f27u;

        /* renamed from: v  reason: collision with root package name */
        private float f28v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f29w;

        /* renamed from: x  reason: collision with root package name */
        private VelocityTracker f30x;

        private class a extends Handler {
            a() {
            }

            a(Handler handler) {
                super(handler.getLooper());
            }

            public final void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    b.this.f10a.onShowPress(b.this.f14e);
                } else if (i2 == 2) {
                    b.this.b();
                } else if (i2 != 3) {
                    throw new RuntimeException("Unknown message ".concat(String.valueOf(message)));
                } else if (b.this.f11b == null) {
                } else {
                    if (!b.this.f12c) {
                        b.this.f11b.onSingleTapConfirmed(b.this.f14e);
                    } else {
                        b.this.f13d = true;
                    }
                }
            }
        }

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f19m = new a(handler);
            } else {
                this.f19m = new a();
            }
            this.f10a = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                this.f11b = (GestureDetector.OnDoubleTapListener) onGestureListener;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f10a != null) {
                this.f29w = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f17h = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f18i = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f15f = scaledTouchSlop * scaledTouchSlop;
                this.f16g = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        public final void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f11b = onDoubleTapListener;
        }

        public final void a(boolean z2) {
            this.f29w = z2;
        }

        public final boolean a() {
            return this.f29w;
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x0248  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0270  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0287  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.view.MotionEvent r14) {
            /*
                r13 = this;
                int r0 = r14.getAction()
                android.view.VelocityTracker r1 = r13.f30x
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r13.f30x = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r13.f30x
                r1.addMovement(r14)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r4 = 1
                goto L_0x001d
            L_0x001c:
                r4 = 0
            L_0x001d:
                if (r4 == 0) goto L_0x0024
                int r5 = r14.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r5 = -1
            L_0x0025:
                int r6 = r14.getPointerCount()
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
            L_0x002d:
                if (r8 >= r6) goto L_0x003e
                if (r5 == r8) goto L_0x003b
                float r11 = r14.getX(r8)
                float r9 = r9 + r11
                float r11 = r14.getY(r8)
                float r10 = r10 + r11
            L_0x003b:
                int r8 = r8 + 1
                goto L_0x002d
            L_0x003e:
                if (r4 == 0) goto L_0x0043
                int r4 = r6 + -1
                goto L_0x0044
            L_0x0043:
                r4 = r6
            L_0x0044:
                float r4 = (float) r4
                float r9 = r9 / r4
                float r10 = r10 / r4
                r4 = 2
                r5 = 3
                if (r0 == 0) goto L_0x01f5
                r8 = 1000(0x3e8, float:1.401E-42)
                r11 = 0
                if (r0 == r2) goto L_0x0168
                if (r0 == r4) goto L_0x00f3
                if (r0 == r5) goto L_0x00ce
                r11 = 5
                if (r0 == r11) goto L_0x00a7
                if (r0 == r1) goto L_0x005b
                goto L_0x02b6
            L_0x005b:
                r13.f25s = r9
                r13.f27u = r9
                r13.f26t = r10
                r13.f28v = r10
                android.view.VelocityTracker r0 = r13.f30x
                int r1 = r13.f18i
                float r1 = (float) r1
                r0.computeCurrentVelocity(r8, r1)
                int r0 = r14.getActionIndex()
                int r1 = r14.getPointerId(r0)
                android.view.VelocityTracker r2 = r13.f30x
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r13.f30x
                float r1 = r4.getYVelocity(r1)
                r4 = 0
            L_0x0080:
                if (r4 >= r6) goto L_0x02b6
                if (r4 == r0) goto L_0x00a4
                int r5 = r14.getPointerId(r4)
                android.view.VelocityTracker r8 = r13.f30x
                float r8 = r8.getXVelocity(r5)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r13.f30x
                float r5 = r9.getYVelocity(r5)
                float r5 = r5 * r1
                float r8 = r8 + r5
                int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x00a4
                android.view.VelocityTracker r14 = r13.f30x
                r14.clear()
                goto L_0x02b6
            L_0x00a4:
                int r4 = r4 + 1
                goto L_0x0080
            L_0x00a7:
                r13.f25s = r9
                r13.f27u = r9
                r13.f26t = r10
                r13.f28v = r10
                android.os.Handler r14 = r13.f19m
                r14.removeMessages(r2)
                android.os.Handler r14 = r13.f19m
                r14.removeMessages(r4)
                android.os.Handler r14 = r13.f19m
                r14.removeMessages(r5)
                r13.f24r = r3
                r13.f21o = r3
                r13.f22p = r3
                r13.f13d = r3
                boolean r14 = r13.f20n
                if (r14 == 0) goto L_0x02b6
            L_0x00ca:
                r13.f20n = r3
                goto L_0x02b6
            L_0x00ce:
                android.os.Handler r14 = r13.f19m
                r14.removeMessages(r2)
                android.os.Handler r14 = r13.f19m
                r14.removeMessages(r4)
                android.os.Handler r14 = r13.f19m
                r14.removeMessages(r5)
                android.view.VelocityTracker r14 = r13.f30x
                r14.recycle()
                r13.f30x = r11
                r13.f24r = r3
                r13.f12c = r3
                r13.f21o = r3
                r13.f22p = r3
                r13.f13d = r3
                boolean r14 = r13.f20n
                if (r14 == 0) goto L_0x02b6
                goto L_0x00ca
            L_0x00f3:
                boolean r0 = r13.f20n
                if (r0 != 0) goto L_0x02b6
                float r0 = r13.f25s
                float r0 = r0 - r9
                float r1 = r13.f26t
                float r1 = r1 - r10
                boolean r6 = r13.f24r
                if (r6 == 0) goto L_0x010a
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f11b
                boolean r14 = r0.onDoubleTapEvent(r14)
                r3 = r3 | r14
                goto L_0x02b6
            L_0x010a:
                boolean r6 = r13.f21o
                if (r6 == 0) goto L_0x0148
                float r6 = r13.f27u
                float r6 = r9 - r6
                int r6 = (int) r6
                float r7 = r13.f28v
                float r7 = r10 - r7
                int r7 = (int) r7
                int r6 = r6 * r6
                int r7 = r7 * r7
                int r6 = r6 + r7
                int r7 = r13.f15f
                if (r6 <= r7) goto L_0x013f
                android.view.GestureDetector$OnGestureListener r7 = r13.f10a
                android.view.MotionEvent r8 = r13.f14e
                boolean r14 = r7.onScroll(r8, r14, r0, r1)
                r13.f25s = r9
                r13.f26t = r10
                r13.f21o = r3
                android.os.Handler r0 = r13.f19m
                r0.removeMessages(r5)
                android.os.Handler r0 = r13.f19m
                r0.removeMessages(r2)
                android.os.Handler r0 = r13.f19m
                r0.removeMessages(r4)
                goto L_0x0140
            L_0x013f:
                r14 = 0
            L_0x0140:
                int r0 = r13.f15f
                if (r6 <= r0) goto L_0x01f2
                r13.f22p = r3
                goto L_0x01f2
            L_0x0148:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x015a
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x02b6
            L_0x015a:
                android.view.GestureDetector$OnGestureListener r2 = r13.f10a
                android.view.MotionEvent r3 = r13.f14e
                boolean r3 = r2.onScroll(r3, r14, r0, r1)
                r13.f25s = r9
                r13.f26t = r10
                goto L_0x02b6
            L_0x0168:
                r13.f12c = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r14)
                boolean r1 = r13.f24r
                if (r1 == 0) goto L_0x017a
                android.view.GestureDetector$OnDoubleTapListener r1 = r13.f11b
                boolean r14 = r1.onDoubleTapEvent(r14)
                r14 = r14 | r3
                goto L_0x01d2
            L_0x017a:
                boolean r1 = r13.f20n
                if (r1 == 0) goto L_0x0186
                android.os.Handler r14 = r13.f19m
                r14.removeMessages(r5)
                r13.f20n = r3
                goto L_0x01c8
            L_0x0186:
                boolean r1 = r13.f21o
                if (r1 == 0) goto L_0x019d
                android.view.GestureDetector$OnGestureListener r1 = r13.f10a
                boolean r1 = r1.onSingleTapUp(r14)
                boolean r5 = r13.f13d
                if (r5 == 0) goto L_0x019b
                android.view.GestureDetector$OnDoubleTapListener r5 = r13.f11b
                if (r5 == 0) goto L_0x019b
                r5.onSingleTapConfirmed(r14)
            L_0x019b:
                r14 = r1
                goto L_0x01d2
            L_0x019d:
                android.view.VelocityTracker r1 = r13.f30x
                int r5 = r14.getPointerId(r3)
                int r6 = r13.f18i
                float r6 = (float) r6
                r1.computeCurrentVelocity(r8, r6)
                float r6 = r1.getYVelocity(r5)
                float r1 = r1.getXVelocity(r5)
                float r5 = java.lang.Math.abs(r6)
                int r7 = r13.f17h
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L_0x01ca
                float r5 = java.lang.Math.abs(r1)
                int r7 = r13.f17h
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 <= 0) goto L_0x01c8
                goto L_0x01ca
            L_0x01c8:
                r14 = 0
                goto L_0x01d2
            L_0x01ca:
                android.view.GestureDetector$OnGestureListener r5 = r13.f10a
                android.view.MotionEvent r7 = r13.f14e
                boolean r14 = r5.onFling(r7, r14, r1, r6)
            L_0x01d2:
                android.view.MotionEvent r1 = r13.f23q
                if (r1 == 0) goto L_0x01d9
                r1.recycle()
            L_0x01d9:
                r13.f23q = r0
                android.view.VelocityTracker r0 = r13.f30x
                if (r0 == 0) goto L_0x01e4
                r0.recycle()
                r13.f30x = r11
            L_0x01e4:
                r13.f24r = r3
                r13.f13d = r3
                android.os.Handler r0 = r13.f19m
                r0.removeMessages(r2)
                android.os.Handler r0 = r13.f19m
                r0.removeMessages(r4)
            L_0x01f2:
                r3 = r14
                goto L_0x02b6
            L_0x01f5:
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f11b
                if (r0 == 0) goto L_0x0263
                android.os.Handler r0 = r13.f19m
                boolean r0 = r0.hasMessages(r5)
                if (r0 == 0) goto L_0x0206
                android.os.Handler r1 = r13.f19m
                r1.removeMessages(r5)
            L_0x0206:
                android.view.MotionEvent r1 = r13.f14e
                if (r1 == 0) goto L_0x025b
                android.view.MotionEvent r6 = r13.f23q
                if (r6 == 0) goto L_0x025b
                if (r0 == 0) goto L_0x025b
                boolean r0 = r13.f22p
                if (r0 == 0) goto L_0x0245
                long r7 = r14.getEventTime()
                long r11 = r6.getEventTime()
                long r7 = r7 - r11
                int r0 = f9l
                long r11 = (long) r0
                int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r0 > 0) goto L_0x0245
                float r0 = r1.getX()
                int r0 = (int) r0
                float r6 = r14.getX()
                int r6 = (int) r6
                int r0 = r0 - r6
                float r1 = r1.getY()
                int r1 = (int) r1
                float r6 = r14.getY()
                int r6 = (int) r6
                int r1 = r1 - r6
                int r0 = r0 * r0
                int r1 = r1 * r1
                int r0 = r0 + r1
                int r1 = r13.f16g
                if (r0 >= r1) goto L_0x0245
                r0 = 1
                goto L_0x0246
            L_0x0245:
                r0 = 0
            L_0x0246:
                if (r0 == 0) goto L_0x025b
                r13.f24r = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f11b
                android.view.MotionEvent r1 = r13.f14e
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r13.f11b
                boolean r1 = r1.onDoubleTapEvent(r14)
                r0 = r0 | r1
                goto L_0x0264
            L_0x025b:
                android.os.Handler r0 = r13.f19m
                int r1 = f9l
                long r6 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r6)
            L_0x0263:
                r0 = 0
            L_0x0264:
                r13.f25s = r9
                r13.f27u = r9
                r13.f26t = r10
                r13.f28v = r10
                android.view.MotionEvent r1 = r13.f14e
                if (r1 == 0) goto L_0x0273
                r1.recycle()
            L_0x0273:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r14)
                r13.f14e = r1
                r13.f21o = r2
                r13.f22p = r2
                r13.f12c = r2
                r13.f20n = r3
                r13.f13d = r3
                boolean r1 = r13.f29w
                if (r1 == 0) goto L_0x029f
                android.os.Handler r1 = r13.f19m
                r1.removeMessages(r4)
                android.os.Handler r1 = r13.f19m
                android.view.MotionEvent r3 = r13.f14e
                long r5 = r3.getDownTime()
                int r3 = f8k
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = f7j
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x029f:
                android.os.Handler r1 = r13.f19m
                android.view.MotionEvent r3 = r13.f14e
                long r3 = r3.getDownTime()
                int r5 = f8k
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r13.f10a
                boolean r14 = r1.onDown(r14)
                r3 = r0 | r14
            L_0x02b6:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.GestureDetectorCompat.b.a(android.view.MotionEvent):boolean");
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            this.f19m.removeMessages(3);
            this.f13d = false;
            this.f20n = true;
            this.f10a.onLongPress(this.f14e);
        }
    }

    static class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final GestureDetector f32a;

        c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f32a = new GestureDetector(context, onGestureListener, handler);
        }

        public final void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f32a.setOnDoubleTapListener(onDoubleTapListener);
        }

        public final void a(boolean z2) {
            this.f32a.setIsLongpressEnabled(z2);
        }

        public final boolean a() {
            return this.f32a.isLongpressEnabled();
        }

        public final boolean a(MotionEvent motionEvent) {
            return this.f32a.onTouchEvent(motionEvent);
        }
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f6a = Build.VERSION.SDK_INT > 17 ? new c(context, onGestureListener, handler) : new b(context, onGestureListener, handler);
    }

    public final boolean isLongpressEnabled() {
        return this.f6a.a();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f6a.a(motionEvent);
    }

    public final void setIsLongpressEnabled(boolean z2) {
        this.f6a.a(z2);
    }

    public final void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f6a.a(onDoubleTapListener);
    }
}
