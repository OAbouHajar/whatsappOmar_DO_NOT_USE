package com.obwhatsapp.calling.videoparticipant;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass2UY;
import X.AnonymousClass3D3;
import X.AnonymousClass49O;
import X.AnonymousClass4M2;
import X.AnonymousClass5MY;
import X.C13680ns;
import X.C13690nt;
import X.C15900s5;
import X.C16150sX;
import X.C26801Pf;
import X.C45902Bo;
import X.C52652eD;
import X.C52662eE;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
public final class VideoCallParticipantViewLayout extends FrameLayout implements AnonymousClass2UY, AnonymousClass006 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ValueAnimator A07;
    public Bitmap A08;
    public View.OnClickListener A09;
    public View.OnClickListener A0A;
    public View.OnLongClickListener A0B;
    public View.OnTouchListener A0C;
    public View.OnTouchListener A0D;
    public C15900s5 A0E;
    public AnonymousClass5MY A0F;
    public C26801Pf A0G;
    public AnonymousClass013 A0H;
    public C52662eE A0I;
    public Boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final VideoCallParticipantView A0P;
    public final VideoCallParticipantView A0Q;
    public final Map A0R;

    public VideoCallParticipantViewLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public VideoCallParticipantViewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoCallParticipantViewLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0L) {
            this.A0L = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A0E = (C15900s5) A002.ALm.get();
            this.A0G = (C26801Pf) A002.APr.get();
            this.A0H = C16150sX.A0Z(A002);
        }
        this.A0R = AnonymousClass000.A0x();
        this.A0O = false;
        this.A03 = getResources().getDimensionPixelSize(R.dimen.dimen0127);
        this.A00 = 0.225f;
        this.A0M = true;
        this.A0N = true;
        VideoCallParticipantView videoCallParticipantView = new VideoCallParticipantView(context, (AttributeSet) null);
        this.A0P = videoCallParticipantView;
        videoCallParticipantView.setVisibility(8);
        addView(videoCallParticipantView, new ViewGroup.MarginLayoutParams(-1, -1));
        VideoCallParticipantView videoCallParticipantView2 = new VideoCallParticipantView(context, (AttributeSet) null);
        this.A0Q = videoCallParticipantView2;
        videoCallParticipantView2.setVisibility(8);
        View view = videoCallParticipantView2.A0K;
        if (view instanceof SurfaceView) {
            ((SurfaceView) view).setZOrderMediaOverlay(true);
        }
        addView(videoCallParticipantView2, new ViewGroup.MarginLayoutParams(-1, -1));
        this.A01 = 0;
        this.A0K = !AnonymousClass49O.A00;
    }

    public ViewGroup.MarginLayoutParams A00(Point point) {
        int i2;
        Point point2;
        if (getWidth() == 0 || getHeight() == 0 || point == null) {
            Log.i("voip/VideoCallParticipantViewLayout/calculatePipLayoutParamsForVideo cancelled");
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        int i3 = point.x;
        if (i3 <= 0 || (i2 = point.y) <= 0) {
            point.x = width;
            i3 = width;
            point.y = height;
            i2 = height;
        }
        int min = Math.min(i3, i2);
        int max = Math.max(i3, i2);
        int min2 = Math.min(width, height);
        if (i3 < i2) {
            width = height;
        }
        float f2 = (float) min;
        int min3 = (int) (((float) min2) * Math.min(this.A00, ((((float) width) * 0.5f) * f2) / ((float) (max * min2))));
        int i4 = (int) (((float) min3) / (f2 / ((float) max)));
        if (i3 >= i2) {
            point2 = new Point(i4, min3);
        }
        AnonymousClass4M2 A022 = A02(point2.x, point2.y);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(point2.x, point2.y);
        boolean z2 = this.A0N;
        marginLayoutParams.leftMargin = z2 ? A022.A00 : A022.A02;
        marginLayoutParams.rightMargin = z2 ? A022.A02 : A022.A00;
        marginLayoutParams.topMargin = this.A0M ? A022.A01 : A022.A03;
        marginLayoutParams.bottomMargin = 0;
        return marginLayoutParams;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r3 >= r5) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView A01(int r7) {
        /*
            r6 = this;
            int r5 = r6.getChildCount()
            int r4 = r6.A01
            int r3 = r5 - r4
            int r3 = r3 + r7
            if (r3 < 0) goto L_0x000e
            r2 = 1
            if (r3 < r5) goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            java.lang.String r0 = "VideoCallParticipantView, wrong index = "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            java.lang.String r0 = ", total count = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", active count = "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r4)
            X.AnonymousClass00B.A0B(r0, r2)
            android.view.View r0 = r6.getChildAt(r3)
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r0 = (com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout.A01(int):com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView");
    }

    public AnonymousClass4M2 A02(int i2, int i3) {
        int i4 = this.A03;
        return new AnonymousClass4M2(i4, (getWidth() - i2) - i4, this.A04 + i4, ((getHeight() - i3) - i4) - this.A02);
    }

    public void A03() {
        Boolean bool = this.A0J;
        if (bool != null && bool.booleanValue()) {
            Iterator A0q = C13680ns.A0q(this.A0R);
            while (A0q.hasNext()) {
                SurfaceHolder surfaceHolder = ((VideoPort) A0q.next()).getSurfaceHolder();
                if (surfaceHolder != null) {
                    surfaceHolder.setSizeFromLayout();
                }
            }
        }
    }

    public final void A04(int i2, int i3, int i4, int i5, int i6) {
        int i7;
        VideoCallParticipantView A012 = A01(i2);
        ViewGroup.MarginLayoutParams A0O2 = AnonymousClass000.A0O(A012);
        A0O2.width = i3;
        A0O2.height = i4;
        A012.setLayoutParams(A0O2);
        AnonymousClass013 r7 = this.A0H;
        if (r7 != null) {
            C45902Bo.A09(A012, r7, i5, i6, (getWidth() - i5) - i3, 0);
            int i8 = this.A01;
            int i9 = 2;
            if (i8 == 3 && i2 == 2) {
                i7 = 6;
            } else {
                boolean z2 = true;
                if (i2 == i8 - 1 || i2 % 2 != 0) {
                    z2 = false;
                }
                boolean A1P = r7.A0T() ? AnonymousClass000.A1P(z2 ? 1 : 0) : z2;
                int i10 = this.A01;
                if (i2 == i10 - 1 || (z2 && i2 >= i10 - 3 && i10 > 3)) {
                    i7 = 4;
                    if (A1P) {
                        i7 = 5;
                    }
                } else {
                    if (!A1P) {
                        i9 = 3;
                    }
                    A012.A03 = i9;
                }
            }
            A012.A03 = i7;
        }
        A012.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if ((r13 % 2) != 0) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r19, boolean r20) {
        /*
            r18 = this;
            r3 = 8
            r4 = 1
            r0 = 0
            r2 = 0
            r6 = r19
            if (r6 > r3) goto L_0x000a
            r2 = 1
        L_0x000a:
            java.lang.String r1 = "only supports up to 8participants"
            X.AnonymousClass00B.A0B(r1, r2)
            if (r6 > r3) goto L_0x0019
            r12 = r18
            if (r20 != 0) goto L_0x001a
            int r1 = r12.A01
            if (r6 != r1) goto L_0x001a
        L_0x0019:
            return
        L_0x001a:
            int r8 = r12.getWidth()
            int r9 = r12.getHeight()
            if (r8 == 0) goto L_0x0019
            if (r9 == 0) goto L_0x0019
            int r7 = r12.getChildCount()
            if (r7 >= r6) goto L_0x0047
            r5 = 0
        L_0x002d:
            int r1 = r19 - r7
            if (r5 >= r1) goto L_0x0047
            android.content.Context r2 = r12.getContext()
            r1 = 0
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r3 = new com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView
            r3.<init>(r2, r1)
            r2 = -1
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r1.<init>(r2, r2)
            r12.addView(r3, r0, r1)
            int r5 = r5 + 1
            goto L_0x002d
        L_0x0047:
            int r7 = r12.getChildCount()
            r12.A01 = r6
            r5 = 0
        L_0x004e:
            if (r5 >= r7) goto L_0x0063
            android.view.View r3 = r12.getChildAt(r5)
            int r1 = r12.A01
            int r2 = r7 - r1
            r1 = 0
            if (r5 >= r2) goto L_0x005d
            r1 = 8
        L_0x005d:
            r3.setVisibility(r1)
            int r5 = r5 + 1
            goto L_0x004e
        L_0x0063:
            if (r19 == 0) goto L_0x00e6
            if (r6 == r4) goto L_0x00d7
            r1 = 2
            if (r6 == r1) goto L_0x00dd
            r1 = 3
            if (r6 == r1) goto L_0x00b8
            int r1 = r12.getWidth()
            int r11 = r1 >> 1
            int r10 = r12.getWidth()
            int r10 = r10 - r11
            int r1 = r19 + 1
            int r9 = r1 >> 1
            int r8 = r19 - r9
            r13 = 0
        L_0x007f:
            if (r13 >= r6) goto L_0x00e6
            int r1 = r12.A01
            r7 = 1
            int r1 = r1 - r4
            if (r13 == r1) goto L_0x008c
            int r1 = r13 % 2
            r5 = r8
            if (r1 == 0) goto L_0x008e
        L_0x008c:
            r7 = 0
            r5 = r9
        L_0x008e:
            int r17 = r13 >> 1
            r3 = 1
            int r1 = r17 + 1
            if (r1 == r5) goto L_0x0096
            r3 = 0
        L_0x0096:
            int r2 = r12.getHeight()
            int r2 = r2 / r5
            int r1 = r12.getHeight()
            int r5 = r5 * r2
            int r1 = r1 - r5
            r14 = r10
            if (r7 == 0) goto L_0x00a5
            r14 = r11
        L_0x00a5:
            if (r3 != 0) goto L_0x00a8
            r1 = 0
        L_0x00a8:
            int r15 = r2 + r1
            r16 = r11
            if (r7 == 0) goto L_0x00b0
            r16 = 0
        L_0x00b0:
            int r17 = r17 * r2
            r12.A04(r13, r14, r15, r16, r17)
            int r13 = r13 + 1
            goto L_0x007f
        L_0x00b8:
            int r14 = r8 >> 1
            int r15 = r9 >> 1
            r13 = 0
            r16 = 0
            r17 = 0
            r12.A04(r13, r14, r15, r16, r17)
            int r3 = r8 - r14
            r2 = 1
            r6 = 0
            r1 = r12
            r4 = r15
            r5 = r14
            r1.A04(r2, r3, r4, r5, r6)
            r7 = 2
            int r9 = r9 - r15
            r10 = 0
            r6 = r12
            r11 = r15
            r6.A04(r7, r8, r9, r10, r11)
            goto L_0x00e6
        L_0x00d7:
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r1 = r12.A0Q
            r12.A06(r1)
            goto L_0x00e6
        L_0x00dd:
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r1 = r12.A0P
            r12.A06(r1)
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r1 = r12.A0Q
            r1.A03 = r4
        L_0x00e6:
            int r1 = r12.A01
            if (r0 >= r1) goto L_0x0019
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r1 = r12.A01(r0)
            r12.A07(r1)
            int r0 = r0 + 1
            goto L_0x00e6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout.A05(int, boolean):void");
    }

    public final void A06(VideoCallParticipantView videoCallParticipantView) {
        VideoCallParticipantView videoCallParticipantView2 = videoCallParticipantView;
        videoCallParticipantView.A03 = 0;
        ViewGroup.MarginLayoutParams A0O2 = AnonymousClass000.A0O(videoCallParticipantView);
        if (!(A0O2.width == -1 && A0O2.height == -1 && A0O2.topMargin == 0 && A0O2.leftMargin == 0 && A0O2.bottomMargin == 0 && A0O2.rightMargin == 0)) {
            AnonymousClass013 r4 = this.A0H;
            if (r4 != null) {
                C45902Bo.A09(videoCallParticipantView2, r4, 0, 0, 0, 0);
            }
            A0O2.height = -1;
            A0O2.width = -1;
            videoCallParticipantView.setLayoutParams(A0O2);
        }
        videoCallParticipantView.A02();
    }

    public final void A07(VideoCallParticipantView videoCallParticipantView) {
        if (videoCallParticipantView.A03 == 1) {
            videoCallParticipantView.setOnTouchListener(this.A0D);
            videoCallParticipantView.setOnClickListener(this.A0A);
        } else {
            videoCallParticipantView.setOnTouchListener(this.A0C);
            videoCallParticipantView.setOnLongClickListener(this.A0B);
        }
        videoCallParticipantView.A0P.setOnClickListener(this.A09);
    }

    public VideoPort AGu(VideoCallParticipantView videoCallParticipantView) {
        Map map = this.A0R;
        VideoPort videoPort = (VideoPort) map.get(videoCallParticipantView);
        if (videoPort != null) {
            return videoPort;
        }
        VideoPort A002 = this.A0G.A00(videoCallParticipantView.A0K, false);
        map.put(videoCallParticipantView, A002);
        return A002;
    }

    public void Ahe(Point point, VideoCallParticipantView videoCallParticipantView) {
        int i2;
        int i3;
        int i4;
        boolean z2 = true;
        if (videoCallParticipantView.A03 == 1) {
            VideoCallParticipantView videoCallParticipantView2 = this.A0Q;
            if (videoCallParticipantView != videoCallParticipantView2) {
                z2 = false;
            }
            AnonymousClass00B.A0B("only pipView can be in Pip mode", z2);
            if (videoCallParticipantView == videoCallParticipantView2) {
                AnonymousClass00B.A0B("pipView is not in Pip mode", C13690nt.A1R(videoCallParticipantView2.A03));
                ViewGroup.MarginLayoutParams A002 = A00(point);
                if (A002 != null) {
                    ViewGroup.MarginLayoutParams A0O2 = AnonymousClass000.A0O(videoCallParticipantView2);
                    A0O2.height = A002.height;
                    A0O2.width = A002.width;
                    AnonymousClass013 r0 = this.A0H;
                    if (r0 == null || !C13680ns.A1Z(r0)) {
                        i2 = A002.rightMargin;
                        i3 = A002.topMargin;
                        i4 = A002.leftMargin;
                    } else {
                        i2 = A002.leftMargin;
                        i3 = A002.topMargin;
                        i4 = A002.rightMargin;
                    }
                    A0O2.setMargins(i2, i3, i4, A002.bottomMargin);
                    StringBuilder A0r = AnonymousClass000.A0r("voip/VideoCallParticipantViewLayout/updatePipLayoutParams leftMargin: ");
                    A0r.append(A0O2.leftMargin);
                    A0r.append(", topMargin: ");
                    A0r.append(A0O2.topMargin);
                    A0r.append(", Pip size: ");
                    A0r.append(A0O2.width);
                    A0r.append("x");
                    A0r.append(A0O2.height);
                    A0r.append(", container size: ");
                    A0r.append(getWidth());
                    A0r.append("x");
                    A0r.append(getHeight());
                    C13680ns.A1V(A0r);
                    videoCallParticipantView2.setLayoutParams(A0O2);
                    videoCallParticipantView2.A02();
                }
            }
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0I;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0I = r0;
        }
        return r0.generatedComponent();
    }

    public int getActiveChildCount() {
        return this.A01;
    }

    public List getActiveChildUserJids() {
        ArrayList A0u = AnonymousClass000.A0u();
        for (int i2 = 0; i2 < this.A01; i2++) {
            VideoCallParticipantView A012 = A01(i2);
            if (!(A012 == null || A012.A0F == null)) {
                A0u.add(A012.A0F);
            }
        }
        return A0u;
    }

    public Bitmap getCachedViewBitmap() {
        if (!(this.A08 != null && getWidth() == this.A08.getWidth() && getHeight() == this.A08.getHeight())) {
            this.A08 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        }
        draw(new Canvas(this.A08));
        return this.A08;
    }

    public VideoCallParticipantView getPiPView() {
        return this.A0Q;
    }

    public void setCommonViewListeners(View.OnTouchListener onTouchListener, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        this.A0C = onTouchListener;
        this.A0B = onLongClickListener;
        this.A09 = onClickListener;
        for (int i2 = 0; i2 < this.A01; i2++) {
            A07(A01(i2));
        }
    }

    public void setIsEnabled(boolean z2) {
        this.A01 = 0;
        VideoCallParticipantView videoCallParticipantView = this.A0P;
        videoCallParticipantView.setVisibility(8);
        VideoCallParticipantView videoCallParticipantView2 = this.A0Q;
        videoCallParticipantView2.setVisibility(8);
        if (z2) {
            addView(videoCallParticipantView, new ViewGroup.MarginLayoutParams(-1, -1));
            addView(videoCallParticipantView2, new ViewGroup.MarginLayoutParams(-1, -1));
            return;
        }
        removeAllViews();
        Map map = this.A0R;
        Iterator A0q = C13680ns.A0q(map);
        while (A0q.hasNext()) {
            ((VideoPort) A0q.next()).release();
        }
        map.clear();
    }

    public void setPipBottomOffset(int i2) {
        this.A02 = i2;
    }

    public void setPipMaxRatio(float f2) {
        this.A00 = f2;
    }

    public void setPipTopOffset(int i2) {
        this.A04 = i2;
    }

    public void setPipViewListeners(AnonymousClass5MY r2, View.OnClickListener onClickListener) {
        this.A0F = r2;
        this.A0D = new AnonymousClass3D3(this);
        this.A0A = onClickListener;
        A07(this.A0Q);
    }
}
