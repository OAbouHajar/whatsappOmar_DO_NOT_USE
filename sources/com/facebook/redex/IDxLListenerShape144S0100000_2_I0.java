package com.facebook.redex;

import android.view.ViewTreeObserver;

public class IDxLListenerShape144S0100000_2_I0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public IDxLListenerShape144S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x034c, code lost:
        r1.removeOnGlobalLayoutListener(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x034f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x057e, code lost:
        if (r1.A03.isShowing() != false) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x022c, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0231, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0269, code lost:
        r0.removeOnGlobalLayoutListener(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x026c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x0350;
                case 1: goto L_0x035d;
                case 2: goto L_0x0371;
                case 3: goto L_0x004e;
                case 4: goto L_0x03f3;
                case 5: goto L_0x03fb;
                case 6: goto L_0x007b;
                case 7: goto L_0x040a;
                case 8: goto L_0x0412;
                case 9: goto L_0x0422;
                case 10: goto L_0x0467;
                case 11: goto L_0x00fd;
                case 12: goto L_0x0028;
                case 13: goto L_0x046f;
                case 14: goto L_0x0491;
                case 15: goto L_0x0499;
                case 16: goto L_0x0126;
                case 17: goto L_0x0144;
                case 18: goto L_0x0162;
                case 19: goto L_0x04a9;
                case 20: goto L_0x01bf;
                case 21: goto L_0x04d0;
                case 22: goto L_0x01e2;
                case 23: goto L_0x04dd;
                case 24: goto L_0x04e8;
                case 25: goto L_0x020c;
                case 26: goto L_0x0232;
                case 27: goto L_0x0515;
                case 28: goto L_0x026d;
                case 29: goto L_0x02b6;
                case 30: goto L_0x02fb;
                case 31: goto L_0x0535;
                case 32: goto L_0x0326;
                case 33: goto L_0x056a;
                case 34: goto L_0x05ae;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            X.2Tr r0 = r2.A0H
            if (r0 == 0) goto L_0x0027
            r0.A01()
            X.2PE r0 = r2.A0Z
            if (r0 == 0) goto L_0x0027
            boolean r0 = r2.A1T()
            if (r0 == 0) goto L_0x0027
            X.2PE r1 = r2.A0Z
            X.2Tr r0 = r2.A0H
            boolean r0 = r0.A09()
            r0 = r0 ^ 1
            r1.A00(r0)
        L_0x0027:
            return
        L_0x0028:
            java.lang.Object r4 = r14.A00
            X.2VV r4 = (X.AnonymousClass2VV) r4
            r4.A02()
            r3 = r4
            com.obwhatsapp.mentions.MentionPickerView r3 = (com.obwhatsapp.mentions.MentionPickerView) r3
            X.2ji r0 = r3.A0D
            java.util.List r0 = r0.A07
            int r2 = r0.size()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166507(0x7f07052b, float:1.7947261E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.A04(r2, r0)
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            goto L_0x0269
        L_0x004e:
            java.lang.Object r3 = r14.A00
            X.26F r3 = (X.AnonymousClass26F) r3
            android.view.View r2 = r3.A0H
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x0065
            android.view.ViewParent r1 = r2.getParent()
            android.view.View r1 = (android.view.View) r1
            android.graphics.Rect r0 = r3.A09
            r1.getHitRect(r0)
        L_0x0065:
            android.graphics.Rect r0 = r3.A09
            boolean r0 = r2.getLocalVisibleRect(r0)
            if (r0 == 0) goto L_0x0027
            android.view.View r1 = r3.A0C
            r0 = 0
            r1.setVisibility(r0)
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r3.A0E
            goto L_0x034c
        L_0x007b:
            java.lang.Object r4 = r14.A00
            X.1aI r4 = (X.C29251aI) r4
            android.view.View r0 = r4.A08
            X.AnonymousClass3K2.A0z(r0, r14)
            boolean r0 = r4.A0w
            if (r0 == 0) goto L_0x0027
            X.0pN r0 = r4.A03()
            android.view.View r1 = r0.A00
            r0 = 2131362561(0x7f0a0301, float:1.8344906E38)
            android.view.View r6 = X.C004601z.A0E(r1, r0)
            r1 = 2131362566(0x7f0a0306, float:1.8344916E38)
            X.0pN r0 = r4.A03()
            android.view.View r5 = r0.findViewById(r1)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r5.getLocalVisibleRect(r8)
            r5.getGlobalVisibleRect(r8)
            android.view.View r0 = r4.A09
            r0.getLocalVisibleRect(r9)
            android.view.View r0 = r4.A09
            r0.getGlobalVisibleRect(r9)
            int r3 = r6.getMeasuredHeight()
            android.view.View r0 = r4.A09
            int r7 = r0.getMeasuredHeight()
            int r0 = r5.getMeasuredHeight()
            int r7 = r7 - r0
            int r7 = r7 - r3
            X.0pN r0 = r4.A03()
            boolean r0 = r0 instanceof com.obwhatsapp.camera.CameraActivity
            r2 = -1
            r1 = 0
            if (r0 == 0) goto L_0x05b6
            if (r7 < 0) goto L_0x05c3
            if (r7 <= r3) goto L_0x00da
            int r1 = r7 >> 1
        L_0x00da:
            int r2 = r8.top
            int r0 = r3 - r2
            int r2 = r2 - r0
            int r2 = r2 - r1
            int r3 = r3 + r1
            r0 = 2131362554(0x7f0a02fa, float:1.8344892E38)
            X.C29251aI.A01(r6, r0, r1)
            r4.A0H(r2, r3)
            boolean r0 = r4.A0y
            if (r0 != 0) goto L_0x00f9
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass000.A0O(r5)
            r0 = 0
            r1.setMargins(r0, r2, r0, r3)
            r5.setLayoutParams(r1)
        L_0x00f9:
            r4.A0G(r3)
            return
        L_0x00fd:
            r0 = 2
            int[] r5 = new int[r0]
            java.lang.Object r4 = r14.A00
            X.289 r4 = (X.AnonymousClass289) r4
            android.view.View r3 = r4.A06
            r3.getLocationOnScreen(r5)
            boolean r0 = r4.isShowing()
            if (r0 != 0) goto L_0x0113
            r4.A05()
            return
        L_0x0113:
            int r2 = r4.A01
            r1 = 0
            r0 = r5[r1]
            if (r2 == r0) goto L_0x0027
            r4.A05()
            com.facebook.redex.RunnableRunnableShape18S0100000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape18S0100000_I1_1
            r0.<init>((java.lang.Object) r14, (int) r1)
            r3.post(r0)
            return
        L_0x0126:
            java.lang.Object r1 = r14.A00
            com.obwhatsapp.location.GroupChatLiveLocationsActivity r1 = (com.obwhatsapp.location.GroupChatLiveLocationsActivity) r1
            X.2jx r0 = r1.A0L
            X.AnonymousClass3K3.A16(r0, r14)
            X.2jx r0 = r1.A0L
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x0027
            X.2jx r0 = r1.A0L
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x0027
            r0 = 0
            r1.A39(r0)
            return
        L_0x0144:
            java.lang.Object r1 = r14.A00
            com.obwhatsapp.location.GroupChatLiveLocationsActivity2 r1 = (com.obwhatsapp.location.GroupChatLiveLocationsActivity2) r1
            X.2jz r0 = r1.A0M
            X.AnonymousClass3K3.A16(r0, r14)
            X.2jz r0 = r1.A0M
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x0027
            X.2jz r0 = r1.A0M
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x0027
            r0 = 0
            r1.A38(r0)
            return
        L_0x0162:
            java.lang.Object r2 = r14.A00
            X.2A5 r2 = (X.AnonymousClass2A5) r2
            android.view.View r0 = r2.A01
            boolean r1 = X.C23061Ai.A00(r0)
            r4 = 0
            r3 = 8
            X.2JH r0 = r2.A05
            boolean r0 = r0.isShowing()
            if (r1 == 0) goto L_0x019b
            if (r0 != 0) goto L_0x0027
            android.view.View r2 = r2.A00
            int r0 = r2.getVisibility()
            if (r0 != r3) goto L_0x0027
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 1
            r9 = 0
            r8 = 1
            r10 = 1
            r11 = 0
            r12 = 1
            r13 = 0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 100
            r5.setDuration(r0)
            r2.startAnimation(r5)
            r2.setVisibility(r4)
            return
        L_0x019b:
            if (r0 != 0) goto L_0x0027
            android.view.View r2 = r2.A00
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x0027
            r6 = 0
            r5 = 1
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7 = 1
            r9 = 1
            r10 = 0
            r11 = 1
            r12 = 0
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 100
            r4.setDuration(r0)
            r2.startAnimation(r4)
            r2.setVisibility(r3)
            return
        L_0x01bf:
            java.lang.Object r0 = r14.A00
            X.2gE r0 = (X.C53752gE) r0
            X.2k1 r4 = r0.A01
            X.AnonymousClass3K3.A16(r4, r14)
            int r3 = r0.A00
            if (r3 == 0) goto L_0x0027
            r0 = 2
            int[] r2 = new int[r0]
            r4.getLocationOnScreen(r2)
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass000.A0O(r4)
            r0 = 1
            r0 = r2[r0]
            int r3 = r3 - r0
            r0 = 0
            r1.setMargins(r0, r3, r0, r0)
            r4.setLayoutParams(r1)
            return
        L_0x01e2:
            java.lang.Object r3 = r14.A00
            com.obwhatsapp.migration.android.view.GoogleMigrateImporterActivity r3 = (com.obwhatsapp.migration.android.view.GoogleMigrateImporterActivity) r3
            com.obwhatsapp.WaImageView r1 = r3.A01
            if (r1 == 0) goto L_0x0027
            com.obwhatsapp.WaTextView r0 = r3.A02
            if (r0 == 0) goto L_0x0027
            X.AnonymousClass3K2.A0z(r1, r14)
            com.obwhatsapp.WaTextView r0 = r3.A03
            X.AnonymousClass3K2.A0z(r0, r14)
            com.obwhatsapp.WaImageView r0 = r3.A01
            int r2 = r0.getHeight()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167413(0x7f0708b5, float:1.7949099E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r2 >= r0) goto L_0x0027
            com.obwhatsapp.WaImageView r1 = r3.A01
            goto L_0x022c
        L_0x020c:
            java.lang.Object r3 = r14.A00
            com.obwhatsapp.registration.EULA r3 = (com.obwhatsapp.registration.EULA) r3
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0027
            X.AnonymousClass3K3.A16(r0, r14)
            android.view.View r0 = r3.A01
            int r2 = r0.getHeight()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166856(0x7f070688, float:1.794797E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r2 >= r0) goto L_0x0027
            android.view.View r1 = r3.A01
        L_0x022c:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0232:
            java.lang.Object r5 = r14.A00
            com.obwhatsapp.status.playback.MessageReplyActivity r5 = (com.obwhatsapp.status.playback.MessageReplyActivity) r5
            android.content.res.Configuration r0 = X.C13700nu.A03(r5)
            int r1 = r0.orientation
            r4 = 1
            r3 = 0
            r0 = 2
            boolean r2 = X.AnonymousClass000.A1R(r1, r0)
            X.1SS r0 = r5.A0L
            X.2Hs r1 = r0.A00()
            X.2Hs r0 = X.C47132Hs.TABLET
            if (r1 == r0) goto L_0x024e
            r4 = 0
        L_0x024e:
            android.widget.FrameLayout r0 = r5.A06
            if (r2 == 0) goto L_0x0256
            if (r4 != 0) goto L_0x0256
            r3 = 8
        L_0x0256:
            r0.setVisibility(r3)
            if (r2 == 0) goto L_0x025d
            if (r4 == 0) goto L_0x0027
        L_0x025d:
            boolean r0 = r5.A3D()
            if (r0 == 0) goto L_0x0027
            android.view.ViewGroup r0 = r5.A05
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
        L_0x0269:
            r0.removeOnGlobalLayoutListener(r14)
            return
        L_0x026d:
            java.lang.Object r5 = r14.A00
            com.obwhatsapp.status.playback.widget.VoiceStatusContentView r5 = (com.obwhatsapp.status.playback.widget.VoiceStatusContentView) r5
            X.5N0 r4 = r5.A08
            if (r4 == 0) goto L_0x029e
            int r3 = r5.getPreviewWavesSegmentsCount()
            X.51w r4 = (X.C1035651w) r4
            X.027 r0 = r4.A03
            X.C13680ns.A1O(r0, r3)
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x029e
            java.util.ArrayList r2 = X.C13690nt.A0i(r3)
            r1 = 0
        L_0x0289:
            if (r1 >= r3) goto L_0x0296
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0289
        L_0x0296:
            X.2Kk r0 = r4.A08
            r0.setVoiceVisualizerSegments(r2)
            r0 = 1
            r4.A00 = r0
        L_0x029e:
            com.obwhatsapp.conversation.waveforms.VoiceVisualizer r0 = r5.A04
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.obwhatsapp.conversation.waveforms.VoiceVisualizer r0 = r5.A04
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x0027
            boolean r0 = r1.isAlive()
            if (r0 == 0) goto L_0x0027
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r5.A0I
            goto L_0x034c
        L_0x02b6:
            java.lang.Object r4 = r14.A00
            com.whatsapp.stickers.store.StickerStoreTabFragment r4 = (com.whatsapp.stickers.store.StickerStoreTabFragment) r4
            androidx.recyclerview.widget.LinearLayoutManager r0 = r4.A03
            int r1 = r0.A19()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A04
            X.02k r1 = r0.A0D(r1)
            boolean r0 = r1 instanceof X.C55512jl
            if (r0 == 0) goto L_0x0027
            X.2jl r1 = (X.C55512jl) r1
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0G
            int r3 = r0.getWidth()
            android.content.res.Resources r1 = X.C13680ns.A0D(r0)
            r0 = 2131167162(0x7f0707ba, float:1.794859E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.A03()
            r0 = 2131167163(0x7f0707bb, float:1.7948592E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 + r0
            int r3 = r3 / r2
            r0 = 5
            int r1 = java.lang.Math.min(r3, r0)
            int r0 = r4.A00
            if (r0 == r1) goto L_0x0027
            r4.A00 = r1
            X.2jm r0 = r4.A0H
            r0.A01()
            return
        L_0x02fb:
            java.lang.Object r3 = r14.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r3 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r3
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0B
            int r2 = r0.getWidth()
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0B
            android.content.res.Resources r1 = X.C13680ns.A0D(r0)
            r0 = 2131167160(0x7f0707b8, float:1.7948586E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 / r0
            int r0 = r3.A00
            if (r0 == r2) goto L_0x0027
            androidx.recyclerview.widget.GridLayoutManager r0 = r3.A0A
            r0.A1g(r2)
            r3.A00 = r2
            X.2jq r0 = r3.A0S
            if (r0 == 0) goto L_0x0027
            r0.A01()
            return
        L_0x0326:
            java.lang.Object r2 = r14.A00
            com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView r2 = (com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView) r2
            X.1w5 r1 = r2.A0B
            if (r1 == 0) goto L_0x0336
            int r0 = r2.getPreviewWavesSegmentsCount()
            X.1w4 r1 = (X.C41521w4) r1
            r1.A00 = r0
        L_0x0336:
            com.obwhatsapp.conversation.waveforms.VoiceVisualizer r0 = r2.A08
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.obwhatsapp.conversation.waveforms.VoiceVisualizer r0 = r2.A08
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x0027
            boolean r0 = r1.isAlive()
            if (r0 == 0) goto L_0x0027
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.A0J
        L_0x034c:
            r1.removeOnGlobalLayoutListener(r0)
            return
        L_0x0350:
            java.lang.Object r1 = r14.A00
            android.widget.HorizontalScrollView r1 = (android.widget.HorizontalScrollView) r1
            X.AnonymousClass3K2.A0z(r1, r14)
            r0 = 66
            r1.fullScroll(r0)
            return
        L_0x035d:
            java.lang.Object r2 = r14.A00
            com.obwhatsapp.PagerSlidingTabStrip r2 = (com.obwhatsapp.PagerSlidingTabStrip) r2
            X.AnonymousClass3K2.A0z(r2, r14)
            androidx.viewpager.widget.ViewPager r0 = r2.A0N
            int r1 = r0.getCurrentItem()
            r2.A01 = r1
            r0 = 0
            com.obwhatsapp.PagerSlidingTabStrip.A00(r2, r1, r0)
            return
        L_0x0371:
            java.lang.Object r6 = r14.A00
            com.obwhatsapp.backup.google.GoogleDriveNewUserSetupActivity r6 = (com.obwhatsapp.backup.google.GoogleDriveNewUserSetupActivity) r6
            r0 = 2131365905(0x7f0a1011, float:1.8351688E38)
            android.view.View r0 = r6.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5 = 0
            android.view.View r0 = r0.getChildAt(r5)
            int r2 = r0.getMeasuredHeight()
            androidx.appcompat.widget.AppCompatSpinner r0 = r6.A04
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03f1
            androidx.appcompat.widget.AppCompatSpinner r0 = r6.A04
            int r0 = r0.getMeasuredHeight()
        L_0x0395:
            int r2 = r2 - r0
            android.widget.RadioGroup r0 = r6.A03
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03ea
            r0 = 0
        L_0x039f:
            int r2 = r2 + r0
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            android.view.WindowManager r0 = r6.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getSize(r1)
            int r0 = r1.y
            float r0 = (float) r0
            double r3 = (double) r0
            r7 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            float r0 = (float) r2
            double r1 = (double) r0
            double r1 = r1 * r7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L_0x03c2
            r2 = 1
        L_0x03c2:
            androidx.appcompat.widget.AppCompatSpinner r1 = r6.A04
            r0 = 8
            if (r2 == 0) goto L_0x03c9
            r0 = 0
        L_0x03c9:
            r1.setVisibility(r0)
            android.widget.RadioGroup r1 = r6.A03
            r0 = 0
            if (r2 == 0) goto L_0x03d3
            r0 = 8
        L_0x03d3:
            r1.setVisibility(r0)
            r0 = 2131363834(0x7f0a07fa, float:1.8347488E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r2 == 0) goto L_0x03e1
            r5 = 8
        L_0x03e1:
            r0.setVisibility(r5)
            android.widget.RadioGroup r0 = r6.A03
            X.AnonymousClass3K3.A16(r0, r14)
            return
        L_0x03ea:
            android.widget.RadioGroup r0 = r6.A03
            int r0 = r0.getMeasuredHeight()
            goto L_0x039f
        L_0x03f1:
            r0 = 0
            goto L_0x0395
        L_0x03f3:
            java.lang.Object r0 = r14.A00
            com.obwhatsapp.calling.callhistory.CallLogActivity r0 = (com.obwhatsapp.calling.callhistory.CallLogActivity) r0
            r0.A36()
            return
        L_0x03fb:
            java.lang.Object r1 = r14.A00
            X.1aI r1 = (X.C29251aI) r1
            android.view.View r0 = r1.A08
            X.AnonymousClass3K3.A16(r0, r14)
            X.2Qt r0 = r1.A0C
            r0.AcZ()
            return
        L_0x040a:
            java.lang.Object r0 = r14.A00
            com.obwhatsapp.chatinfo.ListChatInfoActivity r0 = (com.obwhatsapp.chatinfo.ListChatInfoActivity) r0
            r0.A3Q()
            return
        L_0x0412:
            java.lang.Object r1 = r14.A00
            X.2Uu r1 = (X.C49662Uu) r1
            r1.A07()
            android.widget.ListView r0 = r1.A0H
            X.AnonymousClass3K3.A16(r0, r14)
            X.C49662Uu.A00(r1)
            return
        L_0x0422:
            java.lang.Object r3 = r14.A00
            com.obwhatsapp.chatinfo.view.custom.CollapsingProfilePhotoView r3 = (com.obwhatsapp.chatinfo.view.custom.CollapsingProfilePhotoView) r3
            android.widget.ImageView r0 = r3.A08
            X.AnonymousClass3K3.A16(r0, r14)
            r0 = 0
            r3.A0B = r0
            int r0 = r3.getWidth()
            r3.A02 = r0
            android.widget.ImageView r0 = r3.A08
            int r1 = r0.getLeft()
            r3.A05 = r1
            int r0 = r3.A0E
            int r1 = r1 - r0
            r3.A03 = r1
            int r1 = r3.A06
            int r0 = r3.A01
            r3.A01(r1, r0)
            android.widget.ImageView r0 = r3.A08
            int r2 = r0.getWidth()
            android.widget.ImageView r0 = r3.A08
            int r0 = r0.getHeight()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r2, r0)
            r0 = 17
            r1.gravity = r0
            android.widget.ImageView r0 = r3.A07
            r0.setLayoutParams(r1)
            r0 = 0
            r3.setAnimationValue(r0)
            return
        L_0x0467:
            java.lang.Object r0 = r14.A00
            com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment r0 = (com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment) r0
            r0.A1O()
            return
        L_0x046f:
            java.lang.Object r4 = r14.A00
            X.2ja r4 = (X.C55422ja) r4
            android.widget.LinearLayout r3 = r4.A01
            X.AnonymousClass3K2.A0z(r3, r14)
            int r2 = r3.getMeasuredWidth()
            com.obwhatsapp.components.Button r0 = r4.A03
            int r1 = r0.getMeasuredWidth()
            com.obwhatsapp.components.Button r0 = r4.A04
            int r0 = r0.getMeasuredWidth()
            int r1 = r1 + r0
            boolean r0 = X.AnonymousClass3K3.A1P(r1, r2)
            r3.setOrientation(r0)
            return
        L_0x0491:
            java.lang.Object r0 = r14.A00
            X.2JH r0 = (X.AnonymousClass2JH) r0
            X.AnonymousClass2JH.A01(r0)
            return
        L_0x0499:
            java.lang.Object r1 = r14.A00
            com.obwhatsapp.group.GroupAdminPickerActivity r1 = (com.obwhatsapp.group.GroupAdminPickerActivity) r1
            android.view.View r0 = r1.A02
            X.AnonymousClass3K3.A16(r0, r14)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r1.A06
            r0 = 3
            r1.A0M(r0)
            return
        L_0x04a9:
            java.lang.Object r4 = r14.A00
            X.29S r4 = (X.AnonymousClass29S) r4
            android.view.View r0 = r4.A0L
            X.AnonymousClass3K2.A0z(r0, r14)
            android.view.View r0 = r4.A0L
            int r0 = r0.getMeasuredHeight()
            r4.A03 = r0
            android.view.View r0 = r4.A0L
            int r0 = r0.getMeasuredHeight()
            double r2 = (double) r0
            r0 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r2 = r2 * r0
            int r0 = (int) r2
            r4.A04 = r0
            r1 = 0
            r0 = 0
            r4.A0S(r0, r1)
            return
        L_0x04d0:
            java.lang.Object r1 = r14.A00
            X.1bo r1 = (X.C30141bo) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.A0N
            X.AnonymousClass3K3.A16(r0, r14)
            X.C30141bo.A00(r1)
            return
        L_0x04dd:
            java.lang.Object r0 = r14.A00
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass3K2.A0z(r0, r14)
            r0.requestLayout()
            return
        L_0x04e8:
            java.lang.Object r2 = r14.A00
            com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r2 = (com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r2
            androidx.core.widget.NestedScrollView r0 = r2.A08
            X.AnonymousClass3K2.A0z(r0, r14)
            android.view.View r0 = r2.A02
            float r1 = r0.getY()
            androidx.core.widget.NestedScrollView r0 = r2.A08
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r1 = r1 - r0
            androidx.core.widget.NestedScrollView r0 = r2.A08
            int r0 = r0.getScrollY()
            float r0 = (float) r0
            float r1 = r1 - r0
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x050e
            r0 = 1
        L_0x050e:
            r1 = r0 ^ 1
            r0 = 0
            r2.A1P(r1, r0)
            return
        L_0x0515:
            java.lang.Object r1 = r14.A00
            com.obwhatsapp.status.playback.StatusReplyActivity r1 = (com.obwhatsapp.status.playback.StatusReplyActivity) r1
            r1.A3E()
            android.view.View r0 = r1.A04
            java.lang.Runnable r3 = r1.A07
            r0.removeCallbacks(r3)
            android.view.View r2 = r1.A04
            android.content.res.Resources r1 = r1.getResources()
            r0 = 17694722(0x10e0002, float:2.6081287E-38)
            int r0 = r1.getInteger(r0)
            long r0 = (long) r0
            r2.postDelayed(r3, r0)
            return
        L_0x0535:
            java.lang.Object r4 = r14.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r4 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r4
            android.view.ViewGroup r0 = r4.A09
            X.AnonymousClass3K2.A0z(r0, r14)
            android.view.ViewGroup r1 = r4.A09
            int r0 = r1.getHeight()
            float r0 = (float) r0
            r1.setTranslationY(r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r3 = 0
            android.view.ViewGroup r0 = r4.A09
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            android.view.ViewPropertyAnimator r2 = r0.alpha(r2)
            r0 = 200(0xc8, float:2.8E-43)
            long r0 = (long) r0
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            X.1wM r0 = new X.1wM
            r0.<init>(r4, r3)
            r1.setListener(r0)
            return
        L_0x056a:
            java.lang.Object r1 = r14.A00
            X.2P5 r1 = (X.AnonymousClass2P5) r1
            android.view.View r4 = r1.A00
            boolean r0 = X.C23061Ai.A00(r4)
            r3 = 0
            if (r0 != 0) goto L_0x0580
            X.2JH r0 = r1.A03
            boolean r0 = r0.isShowing()
            r2 = 0
            if (r0 == 0) goto L_0x0581
        L_0x0580:
            r2 = 1
        L_0x0581:
            r0 = 2131364281(0x7f0a09b9, float:1.8348395E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 8
            if (r2 == 0) goto L_0x058d
            r0 = 0
        L_0x058d:
            r1.setVisibility(r0)
            r0 = 2131363403(0x7f0a064b, float:1.8346614E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 8
            if (r2 == 0) goto L_0x059c
            r0 = 0
        L_0x059c:
            r1.setVisibility(r0)
            r0 = 2131364282(0x7f0a09ba, float:1.8348397E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r2 == 0) goto L_0x05aa
            r3 = 8
        L_0x05aa:
            r0.setVisibility(r3)
            return
        L_0x05ae:
            java.lang.Object r0 = r14.A00
            X.2Tx r0 = (X.C49592Tx) r0
            r0.onGlobalLayout()
            return
        L_0x05b6:
            boolean r0 = r4.A0Z()
            if (r0 != 0) goto L_0x05be
            int r1 = r8.top
        L_0x05be:
            int r0 = r8.top
            r4.A01 = r0
            goto L_0x05c8
        L_0x05c3:
            int r1 = r9.bottom
            int r0 = r8.bottom
            int r1 = r1 - r0
        L_0x05c8:
            X.C29251aI.A01(r6, r2, r1)
            int r0 = r8.top
            int r1 = r1 + r3
            r4.A0H(r0, r1)
            r4.A0G(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxLListenerShape144S0100000_2_I0.onGlobalLayout():void");
    }
}
