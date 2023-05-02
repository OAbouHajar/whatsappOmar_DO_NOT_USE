package X;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.widget.ImageView;
import com.obwhatsapp.calling.callgrid.viewmodel.OrientationViewModel;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.39w  reason: invalid class name and case insensitive filesystem */
public abstract class C616839w {
    public VideoCallParticipantView A00;
    public VideoPort A01;
    public boolean A02;
    public final AnonymousClass2UY A03;
    public final UserJid A04;
    public final C449426i A05 = new AnonymousClass53J(this);
    public final AnonymousClass4FR A06;
    public final String A07;

    public C616839w(AnonymousClass2UY r4, UserJid userJid, AnonymousClass4FR r6, String str) {
        StringBuilder A0r = AnonymousClass000.A0r("voip/VoipActivityV2/video/");
        A0r.append(str);
        A0r.append("/VideoParticipantPresenter for ");
        A0r.append(userJid);
        C13680ns.A1V(A0r);
        StringBuilder A0q = AnonymousClass000.A0q("voip/VoipActivityV2/video/");
        A0q.append(str);
        this.A07 = AnonymousClass000.A0h("/", A0q);
        this.A04 = userJid;
        this.A03 = r4;
        this.A06 = r6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A00() {
        /*
            r15 = this;
            boolean r0 = r15 instanceof X.C59942zS
            if (r0 == 0) goto L_0x00d2
            r2 = r15
            X.2zS r2 = (X.C59942zS) r2
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r2.A00
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A1e
            X.2cs r6 = r0.getLastCachedFrame()
            r7 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            if (r6 != 0) goto L_0x0025
            java.lang.String r0 = r2.A07
            r1.append(r0)
            java.lang.String r0 = "getLastFrameBitmap/ no cached frame"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0024:
            return r7
        L_0x0025:
            java.lang.String r4 = r2.A07
            r1.append(r4)
            java.lang.String r0 = "getLastFrameBitmap start. size: "
            r1.append(r0)
            int r0 = r6.A03
            r1.append(r0)
            java.lang.String r2 = "x"
            r1.append(r2)
            int r0 = r6.A01
            r1.append(r0)
            java.lang.String r0 = " format = "
            r1.append(r0)
            int r0 = r6.A00
            r1.append(r0)
            X.C13680ns.A1V(r1)
            int r5 = r6.A00
            byte[] r3 = r6.A05
            int r1 = r6.A03
            int r0 = r6.A01
            int[] r5 = X.C30341cC.A0Q(r3, r5, r1, r0)
            if (r5 == 0) goto L_0x0024
            int r3 = r6.A03     // Catch:{ OutOfMemoryError -> 0x00c3 }
            int r1 = r6.A01     // Catch:{ OutOfMemoryError -> 0x00c3 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x00c3 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r5, r3, r1, r0)     // Catch:{ OutOfMemoryError -> 0x00c3 }
            android.graphics.Matrix r13 = X.AnonymousClass000.A0H()
            boolean r3 = r6.A04
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0072
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0072:
            r13.preScale(r1, r0)
            int r0 = r6.A02
            float r0 = (float) r0
            r13.postRotate(r0)
            r9 = 0
            int r11 = r8.getWidth()     // Catch:{ OutOfMemoryError -> 0x00ae }
            int r12 = r8.getHeight()     // Catch:{ OutOfMemoryError -> 0x00ae }
            r14 = 1
            r10 = 0
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ OutOfMemoryError -> 0x00ae }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r4)     // Catch:{ OutOfMemoryError -> 0x00ac }
            java.lang.String r0 = "getLastFrameBitmap/screenshot done. size: "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x00ac }
            int r0 = r8.getWidth()     // Catch:{ OutOfMemoryError -> 0x00ac }
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x00ac }
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x00ac }
            int r0 = r8.getHeight()     // Catch:{ OutOfMemoryError -> 0x00ac }
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x00ac }
            X.C13680ns.A1V(r1)     // Catch:{ OutOfMemoryError -> 0x00ac }
            if (r3 == r8) goto L_0x00aa
            r7 = r8
        L_0x00aa:
            r8 = r7
            goto L_0x00bd
        L_0x00ac:
            r2 = move-exception
            goto L_0x00b0
        L_0x00ae:
            r2 = move-exception
            r3 = r7
        L_0x00b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r4)
            java.lang.String r0 = "getLastFrameBitmap OOM when creating result bitmap"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i(r0, r2)
        L_0x00bd:
            if (r8 == 0) goto L_0x00c2
            r8.recycle()
        L_0x00c2:
            return r3
        L_0x00c3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r4)
            java.lang.String r0 = "getLastFrameBitmap OOM when creating raw bitmap"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i(r0, r2)
            return r7
        L_0x00d2:
            X.1fU r4 = r15.A02()
            r3 = 0
            if (r4 == 0) goto L_0x0153
            int r2 = r4.A06
            if (r2 == 0) goto L_0x0153
            int r1 = r4.A03
            if (r1 == 0) goto L_0x0153
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x013f }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ OutOfMemoryError -> 0x013f }
            if (r5 == 0) goto L_0x0113
            com.whatsapp.jid.UserJid r0 = r15.A04
            boolean r0 = com.whatsapp.voipcalling.Voip.dumpLastVideoFrame(r0, r5)
            if (r0 == 0) goto L_0x0113
            android.graphics.Matrix r10 = X.AnonymousClass000.A0H()
            int r0 = r4.A04
            int r0 = r0 * 90
            int r0 = -r0
            float r0 = (float) r0
            r10.preRotate(r0)
            r6 = 0
            int r8 = r5.getWidth()     // Catch:{ OutOfMemoryError -> 0x0126 }
            int r9 = r5.getHeight()     // Catch:{ OutOfMemoryError -> 0x0126 }
            r11 = 1
            r7 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ OutOfMemoryError -> 0x0126 }
            if (r0 == r5) goto L_0x0110
            r3 = r5
        L_0x0110:
            r5 = r3
            r3 = r0
            goto L_0x0139
        L_0x0113:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r15.A07
            r1.append(r0)
            java.lang.String r0 = "getLastFrameBitmap dumpLastVideoFrame failed"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0139
        L_0x0126:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r15.A07
            r1.append(r0)
            java.lang.String r0 = "getLastFrameBitmap OOM when creating result bitmap"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i(r0, r2)
        L_0x0139:
            if (r5 == 0) goto L_0x0165
            r5.recycle()
            return r3
        L_0x013f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r15.A07
            r1.append(r0)
            java.lang.String r0 = "getLastFrameBitmap OOM when creating raw bitmap"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i(r0, r2)
            return r3
        L_0x0153:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r15.A07
            r1.append(r0)
            java.lang.String r0 = "getLastFrameBitmap cancelled due to bad participant info or video size"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0165:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616839w.A00():android.graphics.Bitmap");
    }

    public Point A01(C32001fU r5) {
        int i2;
        int i3;
        VoipActivityV2 voipActivityV2;
        OrientationViewModel orientationViewModel;
        if (this instanceof C59942zS) {
            VoipActivityV2 voipActivityV22 = ((C59942zS) this).A00;
            Point adjustedCameraPreviewSize = voipActivityV22.A1e.getAdjustedCameraPreviewSize(AnonymousClass53L.A00);
            return (adjustedCameraPreviewSize == null && r5.A05 == 6) ? voipActivityV22.A1e.lastAdjustedCameraPreviewSize : adjustedCameraPreviewSize;
        }
        AnonymousClass2zT r1 = (AnonymousClass2zT) this;
        int i4 = 0;
        if (r5.A0H && (orientationViewModel = voipActivityV2.A0w) != null && orientationViewModel.A06.A01() != null && AnonymousClass000.A0D((voipActivityV2 = r1.A00).A0w.A06.A01()) >= 0) {
            i4 = AnonymousClass000.A0D(voipActivityV2.A0w.A06.A01()) * 90;
        }
        if (((((r5.A04 * 90) - i4) + 360) % 360) % 180 != 0) {
            i2 = r5.A03;
            i3 = r5.A06;
        } else {
            i2 = r5.A06;
            i3 = r5.A03;
        }
        return new Point(i2, i3);
    }

    public final C32001fU A02() {
        CallInfo A3B = this.A06.A00.A3B();
        if (A3B != null) {
            return A3B.getInfoByJid(this.A04);
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A07);
        Log.i(AnonymousClass000.A0h("VideoParticipantPresenter can not get callInfo from voip", A0o));
        return null;
    }

    public void A03() {
        if (this instanceof C59942zS) {
            ((C59942zS) this).A00.A3W();
            return;
        }
        AnonymousClass2zT r0 = (AnonymousClass2zT) this;
        UserJid userJid = r0.A04;
        if (!r0.A0B()) {
            Voip.stopVideoRenderStream(userJid);
            Voip.setVideoDisplayPort(userJid, (VideoPort) null);
        }
    }

    public void A04() {
        if (this instanceof C59942zS) {
            VideoPort videoPort = this.A01;
            Point point = new Point(0, 0);
            if (videoPort != null) {
                point = videoPort.getWindowSize();
            }
            Voip.setVideoPreviewSize(point.x, point.y);
            return;
        }
        AnonymousClass2zT r2 = (AnonymousClass2zT) this;
        if (!r2.A0B()) {
            Voip.setVideoDisplayPort(r2.A04, r2.A01);
        }
    }

    public final void A05() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A07);
        A0o.append("detachFromParticipantView ");
        A0o.append(this.A00);
        A0o.append(" for ");
        UserJid userJid = this.A04;
        A0o.append(userJid);
        C13680ns.A1V(A0o);
        VideoCallParticipantView videoCallParticipantView = this.A00;
        if (videoCallParticipantView != null && userJid.equals(videoCallParticipantView.A0F)) {
            VideoPort videoPort = this.A01;
            if (videoPort != null) {
                videoPort.setListener((C449426i) null);
                this.A01 = null;
            }
            ImageView imageView = this.A00.A0M;
            if (imageView.getVisibility() == 0) {
                imageView.setImageBitmap((Bitmap) null);
                imageView.setVisibility(8);
            }
            this.A00.A0F = null;
            this.A00 = null;
        }
    }

    public final void A06() {
        StringBuilder A0o;
        String str;
        if (this.A02) {
            CallInfo A3B = this.A06.A00.A3B();
            if (A3B == null) {
                A0o = AnonymousClass000.A0o();
                A0o.append(this.A07);
                str = "startRenderingIfReady can not get callInfo";
            } else {
                C32001fU infoByJid = A3B.getInfoByJid(this.A04);
                if (infoByJid == null) {
                    A0o = AnonymousClass000.A0o();
                    A0o.append(this.A07);
                    str = "startRenderingIfReady cancelled due to no participant info";
                } else {
                    VideoCallParticipantView videoCallParticipantView = this.A00;
                    AnonymousClass00B.A04(videoCallParticipantView);
                    A08(infoByJid, videoCallParticipantView, A3B);
                    if (this instanceof C59942zS) {
                        C59942zS r5 = (C59942zS) this;
                        if (infoByJid.A05 != 6 && !A3B.isCallOnHold()) {
                            VoipActivityV2 voipActivityV2 = r5.A00;
                            if (!voipActivityV2.A0C.A0E(C16620tM.A02, 2222) || !voipActivityV2.A20) {
                                voipActivityV2.A3k(infoByJid, r5);
                            }
                        }
                    } else {
                        AnonymousClass2zT r52 = (AnonymousClass2zT) this;
                        UserJid userJid = r52.A04;
                        if (!r52.A0B()) {
                            if (Voip.setVideoDisplayPort(userJid, r52.A01) == 0) {
                                Voip.startVideoRenderStream(userJid);
                            } else {
                                C447225g r2 = r52.A00.A12;
                                if (r2 != null) {
                                    r2.A0n((CallInfo) null, (String) null, 22);
                                }
                            }
                        }
                    }
                    A07(infoByJid);
                    return;
                }
            }
            Log.i(AnonymousClass000.A0h(str, A0o));
        }
    }

    public final void A07(C32001fU r4) {
        StringBuilder A0o;
        String str;
        VideoCallParticipantView videoCallParticipantView = this.A00;
        if (videoCallParticipantView == null) {
            A0o = AnonymousClass000.A0o();
            A0o.append(this.A07);
            str = "updateLayoutParams cancelled due to no participant view";
        } else if (r4 == null && (r4 = A02()) == null) {
            A0o = AnonymousClass000.A0o();
            A0o.append(this.A07);
            str = "updateLayoutParams cancelled due to no participant info";
        } else {
            Point A012 = A01(r4);
            if (A012 == null) {
                A012 = new Point(0, 0);
            }
            this.A03.Ahe(A012, videoCallParticipantView);
            return;
        }
        Log.i(AnonymousClass000.A0h(str, A0o));
    }

    public final void A08(C32001fU r5, VideoCallParticipantView videoCallParticipantView, CallInfo callInfo) {
        int i2 = r5.A05;
        if (i2 != 6 && !callInfo.self.A0A && !r5.A0J && i2 != 2) {
            ImageView imageView = videoCallParticipantView.A0M;
            if (imageView.getVisibility() == 0) {
                imageView.setImageBitmap((Bitmap) null);
                imageView.setVisibility(8);
            }
        } else if (!AnonymousClass49O.A00) {
            ImageView imageView2 = videoCallParticipantView.A0M;
            if (imageView2.getVisibility() != 0) {
                Bitmap A002 = A00();
                if (A002 == null) {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append(this.A07);
                    Log.i(AnonymousClass000.A0h("showLastFrameOverlay no bitmap", A0o));
                    imageView2.setBackgroundColor(-16777216);
                } else {
                    int width = A002.getWidth() / 40;
                    int i3 = 8;
                    if (width >= 8) {
                        i3 = 16;
                        if (width <= 16) {
                            i3 = width;
                        }
                    }
                    FilterUtils.blurNative(A002, i3, 2);
                    imageView2.setImageBitmap(A002);
                }
                imageView2.setVisibility(0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01e1, code lost:
        if (r11.A0D == false) goto L_0x01e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C32001fU r11, com.whatsapp.voipcalling.CallInfo r12) {
        /*
            r10 = this;
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r2 = r10.A00
            if (r11 == 0) goto L_0x0030
            if (r2 == 0) goto L_0x0030
            r10.A08(r11, r2, r12)
            r1 = r10
            boolean r0 = r10 instanceof X.C59942zS
            if (r0 == 0) goto L_0x00e7
            X.2zS r1 = (X.C59942zS) r1
            com.whatsapp.voipcalling.VoipActivityV2 r5 = r1.A00
            int r1 = r5.A01
            if (r1 == 0) goto L_0x0030
            r0 = 2
            if (r1 == r0) goto L_0x0030
            boolean r0 = r5.A1u
            r4 = 0
            if (r0 != 0) goto L_0x0059
            int r7 = r11.A05
            r0 = 3
            if (r7 != r0) goto L_0x0031
            r2.A07(r4, r4)
        L_0x0026:
            r2.A01()
        L_0x0029:
            android.view.View r1 = r2.A0J
            int r0 = r2.A05
        L_0x002d:
            r1.setBackgroundColor(r0)
        L_0x0030:
            return
        L_0x0031:
            boolean r0 = r12.isPeerRequestingUpgrade()
            r8 = 1
            if (r0 == 0) goto L_0x0060
            X.1fU r0 = r12.getDefaultPeerInfo()
            X.AnonymousClass00B.A06(r0)
            com.whatsapp.jid.UserJid r3 = r0.A07
            X.0sP r1 = r5.A1H
            X.0sG r0 = r5.A1E
            X.0sH r0 = r0.A0A(r3)
            java.lang.String r3 = r1.A0C(r0)
            r1 = 2131893006(0x7f121b0e, float:1.9420776E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r0 = X.C13680ns.A0d(r5, r3, r0, r4, r1)
            r5.A3u(r0, r4)
        L_0x0059:
            r2.A01()
            r2.A07(r4, r4)
            goto L_0x0029
        L_0x0060:
            boolean r0 = r12.isCallOnHold()
            if (r0 == 0) goto L_0x0096
            r0 = 2131892989(0x7f121afd, float:1.9420742E38)
            java.lang.String r6 = r5.getString(r0)
        L_0x006d:
            java.lang.String r3 = r5.A3E(r11, r12, r4)
            if (r6 != 0) goto L_0x0098
            if (r3 != 0) goto L_0x0099
            r2.A01()
            boolean r0 = r12.isInLonelyState()
            if (r0 != 0) goto L_0x0094
            boolean r0 = r11.A0D
            if (r0 == 0) goto L_0x0094
        L_0x0082:
            r2.A07(r8, r4)
            android.view.View r1 = r2.A0J
            int r0 = r2.A05
            r1.setBackgroundColor(r0)
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0030
            r5.A3I()
            return
        L_0x0094:
            r8 = 0
            goto L_0x0082
        L_0x0096:
            r6 = 0
            goto L_0x006d
        L_0x0098:
            r3 = r6
        L_0x0099:
            boolean r0 = r2.A08()
            if (r0 != 0) goto L_0x00cb
            int r1 = r2.A03
            r0 = 7
            if (r1 == r0) goto L_0x00cb
            if (r1 != r8) goto L_0x00b5
            r2.A01()
            boolean r3 = r11.A0D
            r1 = 6
            r0 = 0
            if (r7 != r1) goto L_0x00b0
            r0 = 1
        L_0x00b0:
            r2.A07(r3, r0)
            goto L_0x0029
        L_0x00b5:
            r2.A01()
            r2.A07(r4, r4)
            boolean r0 = r11.A0D
            if (r0 == 0) goto L_0x00c2
            if (r6 != 0) goto L_0x00c2
            r4 = 1
        L_0x00c2:
            r5.A3u(r3, r4)
            android.view.View r1 = r2.A0J
            int r0 = r2.A06
            goto L_0x002d
        L_0x00cb:
            boolean r0 = r11.A0D
            r2.A07(r0, r4)
            int r1 = r2.A03
            r0 = 2
            if (r1 == r0) goto L_0x00dc
            r0 = 3
            if (r1 == r0) goto L_0x00dc
            boolean r0 = r5.A23
            if (r0 != 0) goto L_0x0026
        L_0x00dc:
            android.view.View r1 = r2.A0J
            int r0 = r2.A06
            r1.setBackgroundColor(r0)
            r2.A06(r3, r4)
            return
        L_0x00e7:
            X.2zT r1 = (X.AnonymousClass2zT) r1
            com.whatsapp.voipcalling.VoipActivityV2 r4 = r1.A00
            int r1 = r4.A01
            if (r1 == 0) goto L_0x0030
            r0 = 2
            if (r1 == r0) goto L_0x0030
            com.whatsapp.jid.UserJid r5 = r11.A07
            com.obwhatsapp.WaImageButton r0 = r2.A0P
            r0.setTag(r5)
            android.widget.ImageView r8 = r2.A0N
            boolean r0 = r2.A08()
            r7 = 8
            r3 = 1
            r6 = 0
            if (r0 != 0) goto L_0x010a
            int r1 = r2.A03
            r0 = 7
            if (r1 != r0) goto L_0x017c
        L_0x010a:
            boolean r0 = r11.A0G
            if (r0 != 0) goto L_0x017c
            int r1 = r11.A01
            r0 = 2
            if (r1 == r0) goto L_0x0116
            r0 = 3
            if (r1 != r0) goto L_0x017c
        L_0x0116:
            r8.setVisibility(r6)
            android.view.View r0 = r2.A0K
            r0.setVisibility(r7)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setBackgroundColor(r0)
            X.0sG r0 = r4.A1E
            X.0sH r5 = r0.A0A(r5)
            java.lang.Object r0 = r8.getTag()
            if (r0 == 0) goto L_0x013f
            java.lang.Object r1 = r8.getTag()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r5.A0A()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0146
        L_0x013f:
            X.2Ao r1 = r4.A1I
            X.2OY r0 = r4.A27
            r1.A03(r8, r0, r5, r3)
        L_0x0146:
            android.view.animation.Animation r0 = r8.getAnimation()
            if (r0 != 0) goto L_0x016a
            r0 = 1500(0x5dc, double:7.41E-321)
            r9 = 1063675494(0x3f666666, float:0.9)
            r7 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.AlphaAnimation r5 = new android.view.animation.AlphaAnimation
            r5.<init>(r9, r7)
            r5.setDuration(r0)
            r0 = -1
            r5.setRepeatCount(r0)
            r0 = 2
            r5.setRepeatMode(r0)
            long r0 = (long) r6
            r5.setStartOffset(r0)
            r8.startAnimation(r5)
        L_0x016a:
            android.view.View r7 = r2.A0J
            int r0 = r2.A05
            r7.setBackgroundColor(r0)
            boolean r0 = r4.A1u
            if (r0 == 0) goto L_0x0188
            r2.A01()
            r2.A07(r6, r6)
            return
        L_0x017c:
            r8.clearAnimation()
            r8.setVisibility(r7)
            android.view.View r0 = r2.A0K
            r0.setVisibility(r6)
            goto L_0x016a
        L_0x0188:
            int r1 = r2.A03
            if (r1 != r3) goto L_0x019c
            r2.A01()
            boolean r4 = r11.A0D
            int r3 = r11.A05
            r1 = 6
            r0 = 0
            if (r3 != r1) goto L_0x0198
            r0 = 1
        L_0x0198:
            r2.A07(r4, r0)
            return
        L_0x019c:
            boolean r0 = r2.A08()
            if (r0 != 0) goto L_0x01d2
            r0 = 7
            if (r1 == r0) goto L_0x01d2
            if (r1 != 0) goto L_0x01cc
            r2.A07(r6, r6)
            r2.A01()
            java.lang.String r0 = r4.A3D(r11, r12)
            if (r0 == 0) goto L_0x01bc
            r4.A3u(r0, r6)
        L_0x01b6:
            int r0 = r2.A06
            r7.setBackgroundColor(r0)
            return
        L_0x01bc:
            java.lang.String r1 = r4.A3E(r11, r12, r3)
            if (r1 != 0) goto L_0x01c6
            r4.A3I()
            return
        L_0x01c6:
            boolean r0 = r11.A0D
            r4.A3u(r1, r0)
            goto L_0x01b6
        L_0x01cc:
            java.lang.String r0 = "UNKNOWN layout mode"
            X.AnonymousClass00B.A08(r0)
            return
        L_0x01d2:
            java.lang.String r5 = r4.A3D(r11, r12)
            java.lang.String r8 = r4.A3E(r11, r12, r6)
            if (r5 != 0) goto L_0x01e3
            if (r8 == 0) goto L_0x0215
            boolean r1 = r11.A0D
            r0 = 1
            if (r1 != 0) goto L_0x01e4
        L_0x01e3:
            r0 = 0
        L_0x01e4:
            r2.A07(r0, r6)
            int r0 = r2.A06
            r7.setBackgroundColor(r0)
            int r1 = r2.A03
            r0 = 2
            if (r1 == r0) goto L_0x0200
            r0 = 3
            if (r1 == r0) goto L_0x0200
            boolean r0 = r4.A23
            if (r0 == 0) goto L_0x0200
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x0200
            r2.A01()
            return
        L_0x0200:
            if (r5 != 0) goto L_0x0203
            r5 = r8
        L_0x0203:
            int r1 = r11.A01
            r0 = 2
            if (r1 == r0) goto L_0x020b
            r0 = 3
            if (r1 != r0) goto L_0x0213
        L_0x020b:
            boolean r0 = r11.A0B
            if (r0 == 0) goto L_0x0213
        L_0x020f:
            r2.A06(r5, r3)
            return
        L_0x0213:
            r3 = 0
            goto L_0x020f
        L_0x0215:
            r2.A01()
            boolean r0 = r11.A0D
            r2.A07(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616839w.A09(X.1fU, com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A0A(VideoCallParticipantView videoCallParticipantView) {
        if (videoCallParticipantView != this.A00 || !this.A04.equals(videoCallParticipantView.A0F)) {
            if (this.A00 != null) {
                A05();
            }
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(this.A07);
            A0o.append("attachToParticipantView ");
            A0o.append(videoCallParticipantView);
            A0o.append(" for ");
            UserJid userJid = this.A04;
            A0o.append(userJid);
            C13680ns.A1V(A0o);
            this.A00 = videoCallParticipantView;
            videoCallParticipantView.A0F = userJid;
            VideoPort AGu = this.A03.AGu(videoCallParticipantView);
            this.A01 = AGu;
            AGu.setListener(this.A05);
        }
    }
}
