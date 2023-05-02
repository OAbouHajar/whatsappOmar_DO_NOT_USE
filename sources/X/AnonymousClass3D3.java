package X;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxUListenerShape0S0104000_2_I1;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3D3  reason: invalid class name */
public class AnonymousClass3D3 implements View.OnTouchListener {
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public AnonymousClass4M2 A0F;
    public final /* synthetic */ VideoCallParticipantViewLayout A0G;

    public AnonymousClass3D3(VideoCallParticipantViewLayout videoCallParticipantViewLayout) {
        this.A0G = videoCallParticipantViewLayout;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String A0l;
        VoipActivityV2 voipActivityV2;
        float f2;
        float rawX;
        View view2 = view;
        boolean z2 = view2 instanceof VideoCallParticipantView;
        AnonymousClass00B.A0B("PipOnTouchListener can only work with VideoCallParticipantView", z2);
        boolean z3 = false;
        if (!z2) {
            Log.i(AnonymousClass000.A0g("VideoCallParticipantViewLayout/PipOnTouchListener/ ignore, wrong view ", view2));
            return false;
        }
        int i2 = ((VideoCallParticipantView) view2).A03;
        if (i2 != 1) {
            A0l = C13680ns.A0c(i2, "VideoCallParticipantViewLayout/PipOnTouchListener/ swallow the events when mode is ");
        } else {
            VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A0G;
            AnonymousClass013 r19 = videoCallParticipantViewLayout.A0H;
            AnonymousClass00B.A06(r19);
            ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(view2);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.A08 = videoCallParticipantViewLayout.getWidth();
                this.A07 = videoCallParticipantViewLayout.getHeight();
                this.A01 = motionEvent.getRawX();
                this.A02 = motionEvent.getRawY();
                this.A0A = C13680ns.A1Z(r19) ? A0O.leftMargin : A0O.rightMargin;
                this.A0B = A0O.topMargin;
                this.A0D = view2.getWidth();
                this.A0C = view2.getHeight();
                AnonymousClass5MY r2 = videoCallParticipantViewLayout.A0F;
                if (r2 != null) {
                    VoipActivityV2 voipActivityV22 = ((C101144wn) r2).A00;
                    voipActivityV22.A22 = true;
                    if (voipActivityV22.A1d != null) {
                        voipActivityV22.A3S();
                    }
                }
                int i3 = videoCallParticipantViewLayout.A06;
                int i4 = videoCallParticipantViewLayout.A05;
                this.A00 = Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
                this.A09 = 0;
                this.A0F = videoCallParticipantViewLayout.A02(this.A0D, this.A0C);
                this.A06 = 0.0f;
                this.A05 = 0.0f;
                this.A04 = 0.0f;
                this.A03 = 0.0f;
                this.A0E = 0;
                StringBuilder A0r = AnonymousClass000.A0r("VideoCallParticipantViewLayout/videoPipParticipantView/onTouch ACTION_DOWN downX: ");
                A0r.append(this.A01);
                A0r.append(", downY: ");
                A0r.append(this.A02);
                A0r.append(", leftMargin: ");
                A0r.append(this.A0A);
                A0r.append(", topMargin: ");
                A0l = AnonymousClass000.A0l(A0r, this.A0B);
            } else if (action != 1) {
                if (action == 2) {
                    if (this.A0F == null) {
                        A0l = "VideoCallParticipantViewLayout/videoPipParticipantView/onTouch ACTION_MOVE dispatched before ACTION_DOWN, ignore";
                    } else {
                        int i5 = this.A0A;
                        if (C13680ns.A1Z(r19)) {
                            f2 = motionEvent.getRawX();
                            rawX = this.A01;
                        } else {
                            f2 = this.A01;
                            rawX = motionEvent.getRawX();
                        }
                        int rawY = this.A0B + ((int) (motionEvent.getRawY() - this.A02));
                        AnonymousClass4M2 r4 = this.A0F;
                        int max = Math.max(r4.A02, Math.min(r4.A00, i5 + ((int) (f2 - rawX))));
                        int max2 = Math.max(r4.A03, Math.min(r4.A01, rawY));
                        motionEvent.getEventTime();
                        motionEvent.getRawX();
                        motionEvent.getRawY();
                        C45902Bo.A09(view2, r19, max, max2, C13680ns.A1Z(r19) ? A0O.rightMargin : A0O.leftMargin, A0O.bottomMargin);
                        this.A09 = Math.max(Math.max(AnonymousClass000.A09(max, this.A0A), AnonymousClass000.A09(max2, this.A0B)), this.A09);
                        long eventTime = motionEvent.getEventTime() - this.A0E;
                        if (eventTime > 0) {
                            float f3 = (float) eventTime;
                            this.A05 = ((motionEvent.getRawX() - this.A03) * 1000.0f) / f3;
                            this.A06 = ((motionEvent.getRawY() - this.A04) * 1000.0f) / f3;
                        }
                        this.A03 = motionEvent.getRawX();
                        this.A04 = motionEvent.getRawY();
                        this.A0E = motionEvent.getEventTime();
                        return true;
                    }
                }
                return true;
            } else if (this.A0F == null) {
                A0l = "videoPipParticipantView/onTouch ACTION_UP dispatched before ACTION_DOWN, ignore";
            } else {
                int i6 = this.A09;
                double d2 = this.A00;
                if (((double) i6) < d2 / 60.0d) {
                    StringBuilder A0r2 = AnonymousClass000.A0r("videoPipParticipantView/onTouch ACTION_UP treat as click event  maxDistance: ");
                    A0r2.append(i6);
                    A0r2.append(", screenLength: ");
                    A0r2.append(d2);
                    C13680ns.A1V(A0r2);
                    view2.performClick();
                    AnonymousClass5MY r0 = videoCallParticipantViewLayout.A0F;
                    if (r0 != null) {
                        voipActivityV2 = ((C101144wn) r0).A00;
                        voipActivityV2.A22 = false;
                    }
                    return true;
                }
                float f4 = this.A05;
                float f5 = this.A06;
                float sqrt = (float) Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
                boolean A1Q = AnonymousClass000.A1Q((((double) sqrt) > (d2 / 1.0d) ? 1 : (((double) sqrt) == (d2 / 1.0d) ? 0 : -1)));
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                if (A1Q) {
                    double d3 = (double) ((this.A05 / sqrt) * 64.0f);
                    double d4 = (double) ((this.A06 / sqrt) * 64.0f);
                    while (rawX2 >= 0.0f && rawX2 <= ((float) this.A08) && rawY2 >= 0.0f && rawY2 <= ((float) this.A07)) {
                        rawX2 = (float) (((double) rawX2) + d3);
                        rawY2 = (float) (((double) rawY2) + d4);
                    }
                }
                boolean A1Z = C13680ns.A1Z(r19);
                float f6 = (float) (this.A08 / 2);
                boolean z4 = !A1Z ? rawX2 <= f6 : rawX2 >= f6;
                if (rawY2 >= ((float) (this.A07 / 2))) {
                    z3 = true;
                }
                if (!(z4 == videoCallParticipantViewLayout.A0N && z3 == videoCallParticipantViewLayout.A0M)) {
                    videoCallParticipantViewLayout.A0N = z4;
                    videoCallParticipantViewLayout.A0M = z3;
                    videoCallParticipantViewLayout.A0O = true;
                }
                AnonymousClass4M2 A022 = videoCallParticipantViewLayout.A02(this.A0D, this.A0C);
                Point point = new Point(videoCallParticipantViewLayout.A0N ? A022.A00 : A022.A02, videoCallParticipantViewLayout.A0M ? A022.A01 : A022.A03);
                int i7 = point.x - (C13680ns.A1Z(r19) ? A0O.leftMargin : A0O.rightMargin);
                int i8 = point.y - A0O.topMargin;
                double sqrt2 = Math.sqrt((double) ((i7 * i7) + (i8 * i8)));
                long max3 = (long) Math.max(200, (int) ((500.0d * sqrt2) / this.A00));
                StringBuilder A0r3 = AnonymousClass000.A0r("VideoCallParticipantViewLayout/videoPipParticipantView/onTouch ACTION_UP xVelocity: ");
                A0r3.append(this.A05);
                A0r3.append(", yVelocity: ");
                A0r3.append(this.A06);
                A0r3.append(", velocity: ");
                A0r3.append(sqrt);
                A0r3.append(", fling: ");
                A0r3.append(A1Q);
                A0r3.append(", finalRawX: ");
                A0r3.append(rawX2);
                A0r3.append(", finalRawY: ");
                A0r3.append(rawY2);
                A0r3.append(", window size: ");
                A0r3.append(videoCallParticipantViewLayout.A06);
                A0r3.append("x");
                A0r3.append(videoCallParticipantViewLayout.A05);
                A0r3.append("(");
                A0r3.append(this.A00);
                A0r3.append("), container size: ");
                A0r3.append(this.A08);
                A0r3.append("x");
                A0r3.append(this.A07);
                A0r3.append(", pipAtRight: ");
                A0r3.append(z4);
                A0r3.append(", pipAtBottom: ");
                A0r3.append(z3);
                A0r3.append(", moving distance: ");
                A0r3.append(sqrt2);
                A0r3.append(", duration: ");
                A0r3.append(max3);
                C13680ns.A1V(A0r3);
                StringBuilder A0r4 = AnonymousClass000.A0r("VideoCallParticipantViewLayout/animatePiPView with duration: ");
                A0r4.append(max3);
                A0r4.append(", xOffset: ");
                A0r4.append(i7);
                A0r4.append(", yOffset: ");
                A0r4.append(i8);
                A0r4.append(", final size: ");
                A0r4.append(0);
                A0r4.append("x");
                A0r4.append(0);
                C13680ns.A1V(A0r4);
                if (max3 <= 0 || !videoCallParticipantViewLayout.A0K) {
                    AnonymousClass5MY r02 = videoCallParticipantViewLayout.A0F;
                    if (r02 != null) {
                        voipActivityV2 = ((C101144wn) r02).A00;
                        voipActivityV2.A22 = false;
                    }
                    return true;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                videoCallParticipantViewLayout.A07 = ofFloat;
                ofFloat.setDuration(max3);
                videoCallParticipantViewLayout.A07.addUpdateListener(new IDxUListenerShape0S0104000_2_I1(videoCallParticipantViewLayout, i7, i8));
                C13690nt.A0o(videoCallParticipantViewLayout.A07, videoCallParticipantViewLayout, 5);
                videoCallParticipantViewLayout.A07.start();
                return true;
                voipActivityV2.A3a();
                return true;
            }
        }
        Log.i(A0l);
        return true;
    }
}
