package com.obwhatsapp.search.views.itemviews;

import X.AnonymousClass006;
import X.AnonymousClass34X;
import X.C1034651m;
import X.C108145Mv;
import X.C16320sq;
import X.C35321lj;
import X.C38801rR;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C91864gc;
import X.C93924jz;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.redex.IDxPListenerShape328S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;

public class MessageGifVideoPlayer extends TextureView implements AnonymousClass006 {
    public MediaPlayer.OnErrorListener A00;
    public MediaPlayer.OnPreparedListener A01;
    public MediaPlayer A02;
    public Surface A03;
    public C35321lj A04;
    public C38801rR A05;
    public C108145Mv A06;
    public C16320sq A07;
    public C52662eE A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final TextureView.SurfaceTextureListener A0G;

    public MessageGifVideoPlayer(Context context) {
        super(context);
        A01();
        this.A0F = false;
        this.A0E = false;
        this.A0G = new C93924jz(this);
        this.A01 = new IDxPListenerShape328S0100000_2_I0(this, 0);
        this.A00 = C91864gc.A00;
    }

    public MessageGifVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A0F = false;
        this.A0E = false;
        this.A0G = new C93924jz(this);
        this.A01 = new IDxPListenerShape328S0100000_2_I0(this, 0);
        this.A00 = C91864gc.A00;
    }

    public MessageGifVideoPlayer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r3 < r2) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r4 > r6) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r1 = r3 / r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r2 = 1.0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(com.obwhatsapp.search.views.itemviews.MessageGifVideoPlayer r8) {
        /*
            X.1lj r1 = r8.A04
            if (r1 == 0) goto L_0x003f
            int r0 = r1.A02
            float r7 = (float) r0
            int r0 = r1.A01
            float r6 = (float) r0
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            int r0 = r8.getWidth()
            float r5 = (float) r0
            int r0 = r8.getHeight()
            float r4 = (float) r0
            float r3 = r7 / r6
            float r2 = r5 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
        L_0x002b:
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
        L_0x002f:
            float r2 = r2 / r3
        L_0x0030:
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r4 = r4 / r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setScale(r1, r2, r5, r4)
            r8.setTransform(r0)
        L_0x003f:
            return
        L_0x0040:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            goto L_0x002b
        L_0x0049:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x002f
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
        L_0x0051:
            float r3 = r3 / r2
            r1 = r3
        L_0x0053:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.search.views.itemviews.MessageGifVideoPlayer.A00(com.obwhatsapp.search.views.itemviews.MessageGifVideoPlayer):void");
    }

    public void A01() {
        if (!this.A0B) {
            this.A0B = true;
            this.A07 = (C16320sq) ((C52652eD) ((C52642eC) generatedComponent())).A07.ARB.get();
        }
    }

    public final void A02() {
        if (this.A0F && this.A02 != null && this.A0C) {
            C108145Mv r0 = this.A06;
            if (r0 != null) {
                AnonymousClass34X.A00(((C1034651m) r0).A00, false);
            }
            setVisibility(0);
            this.A02.start();
            this.A0D = true;
        }
    }

    public final void A03() {
        this.A0C = false;
        if (this.A0E) {
            this.A0A = true;
        } else if (!this.A0F) {
            this.A09 = true;
        } else {
            setSurfaceTextureListener(this.A0G);
            this.A07.Acl(new RunnableRunnableShape14S0100000_I0_13((Object) this, 21));
        }
    }

    public final void A04() {
        MediaPlayer mediaPlayer;
        setVisibility(8);
        C108145Mv r0 = this.A06;
        if (r0 != null) {
            AnonymousClass34X.A00(((C1034651m) r0).A00, true);
        }
        if (this.A0D && (mediaPlayer = this.A02) != null) {
            mediaPlayer.pause();
            this.A02.seekTo(0);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A08;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A02();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A04();
    }

    public void setMessage(C38801rR r2) {
        if ((this.A05 != r2 || this.A02 == null) && r2.A02 != null) {
            this.A05 = r2;
            A03();
        }
    }

    public void setPlayingListener(C108145Mv r1) {
        this.A06 = r1;
    }

    public void setScrolling(boolean z2) {
        this.A0E = z2;
        if (!z2 && this.A0A) {
            this.A0A = false;
            A03();
        }
    }

    public void setShouldPlay(boolean z2) {
        if (this.A0F != z2) {
            this.A0F = z2;
            if (!z2) {
                if (this.A0D && this.A02 != null) {
                    A04();
                }
            } else if (this.A09) {
                A03();
            } else if (this.A0C) {
                A02();
            }
        }
    }
}
