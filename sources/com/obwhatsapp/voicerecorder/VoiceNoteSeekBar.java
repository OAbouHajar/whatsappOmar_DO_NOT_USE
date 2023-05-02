package com.obwhatsapp.voicerecorder;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass09P;
import X.AnonymousClass4BW;
import X.C13680ns;
import X.C52662eE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.facebook.redex.IDxGListenerShape16S0100000_2_I1;
import com.obwhatsapp.R;

public class VoiceNoteSeekBar extends AppCompatSeekBar implements AnonymousClass006 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public SeekBar.OnSeekBarChangeListener A06;
    public AnonymousClass09P A07;
    public C52662eE A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Paint A0D;
    public final RectF A0E;

    public VoiceNoteSeekBar(Context context) {
        super(context);
        if (!this.A0B) {
            this.A0B = true;
            generatedComponent();
        }
        this.A0D = C13680ns.A0E();
        this.A0E = AnonymousClass000.A0K();
        this.A04 = 20;
        this.A05 = 10;
        A00(context, (AttributeSet) null);
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        this.A0D = C13680ns.A0E();
        this.A0E = AnonymousClass000.A0K();
        this.A04 = 20;
        this.A05 = 10;
        A00(context, attributeSet);
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0B) {
            this.A0B = true;
            generatedComponent();
        }
        this.A0D = C13680ns.A0E();
        this.A0E = AnonymousClass000.A0K();
        this.A04 = 20;
        this.A05 = 10;
        A00(context, attributeSet);
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A0B) {
            this.A0B = true;
            generatedComponent();
        }
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        this.A03 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A02 = AnonymousClass00T.A00(context, R.color.color07ed);
        this.A01 = AnonymousClass00T.A00(context, R.color.color07ec);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4BW.A0J);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(2, this.A04);
            this.A05 = obtainStyledAttributes.getDimensionPixelSize(3, this.A05);
            this.A02 = obtainStyledAttributes.getInteger(1, this.A02);
            this.A01 = obtainStyledAttributes.getInteger(0, this.A01);
            obtainStyledAttributes.recycle();
        }
        this.A07 = new AnonymousClass09P(context, new IDxGListenerShape16S0100000_2_I1(this, 1));
    }

    public final void A01(MotionEvent motionEvent) {
        float f2;
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i2 = (width - paddingLeft) - paddingRight;
        int x2 = (int) motionEvent.getX();
        if (x2 < paddingLeft) {
            f2 = 0.0f;
        } else {
            int i3 = width - paddingRight;
            f2 = 1.0f;
            if (x2 <= i3) {
                f2 = ((float) (x2 - paddingLeft)) / ((float) i2);
            }
        }
        int max = (int) ((f2 * ((float) getMax())) + 0.0f);
        setProgress(max);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A06;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged((SeekBar) null, max, true);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A08;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public int getProgressColor() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        if (r3 != 0) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onDraw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            int r4 = r12.getWidth()     // Catch:{ all -> 0x00ac }
            int r2 = r12.getPaddingLeft()     // Catch:{ all -> 0x00ac }
            int r0 = r12.getPaddingRight()     // Catch:{ all -> 0x00ac }
            int r4 = r4 - r2
            int r4 = r4 - r0
            boolean r0 = r12.isPressed()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0028
            int r0 = r12.A04     // Catch:{ all -> 0x00ac }
            int r0 = r0 * 3
            int r7 = r0 / 4
        L_0x001b:
            int r3 = r12.getProgress()     // Catch:{ all -> 0x00ac }
            int r0 = r12.getMax()     // Catch:{ all -> 0x00ac }
            r10 = 0
            r1 = 0
            if (r0 <= 0) goto L_0x0030
            goto L_0x002d
        L_0x0028:
            int r0 = r12.A04     // Catch:{ all -> 0x00ac }
            int r7 = r0 / 2
            goto L_0x001b
        L_0x002d:
            float r1 = (float) r3     // Catch:{ all -> 0x00ac }
            float r0 = (float) r0     // Catch:{ all -> 0x00ac }
            float r1 = r1 / r0
        L_0x0030:
            float r0 = (float) r4     // Catch:{ all -> 0x00ac }
            float r1 = r1 * r0
            int r9 = (int) r1     // Catch:{ all -> 0x00ac }
            int r9 = r9 + r2
            int r8 = r12.getPaddingTop()     // Catch:{ all -> 0x00ac }
            int r0 = X.C13680ns.A03(r12)     // Catch:{ all -> 0x00ac }
            int r0 = r0 / 2
            int r8 = r8 + r0
            android.graphics.Paint r6 = r12.A0D     // Catch:{ all -> 0x00ac }
            int r0 = r12.A01     // Catch:{ all -> 0x00ac }
            X.C13690nt.A0n(r0, r6)     // Catch:{ all -> 0x00ac }
            boolean r0 = r12.A09     // Catch:{ all -> 0x00ac }
            r11 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x0070
            android.graphics.RectF r4 = r12.A0E     // Catch:{ all -> 0x00ac }
            int r0 = r12.A05     // Catch:{ all -> 0x00ac }
            int r0 = r0 / 2
            int r0 = r8 - r0
            float r5 = (float) r0     // Catch:{ all -> 0x00ac }
            int r0 = r12.getWidth()     // Catch:{ all -> 0x00ac }
            float r1 = (float) r0     // Catch:{ all -> 0x00ac }
            int r0 = r12.A05     // Catch:{ all -> 0x00ac }
            int r0 = r0 / 2
            int r0 = r0 + r8
            float r0 = (float) r0     // Catch:{ all -> 0x00ac }
            r4.set(r10, r5, r1, r0)     // Catch:{ all -> 0x00ac }
            float r1 = r4.height()     // Catch:{ all -> 0x00ac }
            float r1 = r1 / r11
            float r0 = r4.height()     // Catch:{ all -> 0x00ac }
            float r0 = r0 / r11
            r13.drawRoundRect(r4, r1, r0, r6)     // Catch:{ all -> 0x00ac }
        L_0x0070:
            int r0 = r12.A02     // Catch:{ all -> 0x00ac }
            r6.setColor(r0)     // Catch:{ all -> 0x00ac }
            boolean r0 = r12.A0A     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x007c
            r1 = 1
            if (r3 == 0) goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            boolean r0 = r12.A09     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x0084
            if (r1 != 0) goto L_0x00aa
            goto L_0x0087
        L_0x0084:
            if (r1 != 0) goto L_0x00aa
            goto L_0x00a4
        L_0x0087:
            android.graphics.RectF r5 = r12.A0E     // Catch:{ all -> 0x00ac }
            float r4 = (float) r2     // Catch:{ all -> 0x00ac }
            int r0 = r12.A05     // Catch:{ all -> 0x00ac }
            int r3 = r0 / 2
            int r0 = r8 - r3
            float r2 = (float) r0     // Catch:{ all -> 0x00ac }
            float r1 = (float) r9     // Catch:{ all -> 0x00ac }
            int r3 = r3 + r8
            float r0 = (float) r3     // Catch:{ all -> 0x00ac }
            r5.set(r4, r2, r1, r0)     // Catch:{ all -> 0x00ac }
            float r1 = r5.height()     // Catch:{ all -> 0x00ac }
            float r1 = r1 / r11
            float r0 = r5.height()     // Catch:{ all -> 0x00ac }
            float r0 = r0 / r11
            r13.drawRoundRect(r5, r1, r0, r6)     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            float r2 = (float) r9     // Catch:{ all -> 0x00ac }
            float r1 = (float) r8     // Catch:{ all -> 0x00ac }
            float r0 = (float) r7     // Catch:{ all -> 0x00ac }
            r13.drawCircle(r2, r1, r0, r6)     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            monitor-exit(r12)
            return
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.voicerecorder.VoiceNoteSeekBar.onDraw(android.graphics.Canvas):void");
    }

    public synchronized void onMeasure(int i2, int i3) {
        setMeasuredDimension(SeekBar.resolveSizeAndState(this.A04 << 1, i2, 0), SeekBar.resolveSizeAndState(this.A04 << 1, i3, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r4.A0C != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        if (java.lang.Math.abs(r5.getX() - r4.A00) > ((float) r4.A03)) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            r3 = 0
            if (r0 != 0) goto L_0x0008
            return r3
        L_0x0008:
            X.09P r0 = r4.A07
            if (r0 == 0) goto L_0x000f
            r0.A00(r5)
        L_0x000f:
            int r1 = r5.getAction()
            r2 = 1
            if (r1 == 0) goto L_0x005b
            if (r1 == r2) goto L_0x003b
            r0 = 2
            if (r1 == r0) goto L_0x0033
            r0 = 3
            if (r1 != r0) goto L_0x0032
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x002f
        L_0x0022:
            r4.A0C = r3
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r4.A06
            if (r1 == 0) goto L_0x002c
            r0 = 0
            r1.onStopTrackingTouch(r0)
        L_0x002c:
            r4.setPressed(r3)
        L_0x002f:
            r4.invalidate()
        L_0x0032:
            return r2
        L_0x0033:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0078
            r4.A01(r5)
            return r2
        L_0x003b:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0043
            r4.A01(r5)
            goto L_0x0022
        L_0x0043:
            r4.A0C = r2
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r4.A06
            if (r1 == 0) goto L_0x004d
            r0 = 0
            r1.onStartTrackingTouch(r0)
        L_0x004d:
            r4.A01(r5)
            r4.A0C = r3
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r4.A06
            if (r1 == 0) goto L_0x002f
            r0 = 0
            r1.onStopTrackingTouch(r0)
            goto L_0x002f
        L_0x005b:
            android.view.ViewParent r1 = r4.getParent()
        L_0x005f:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x008a
            r0 = r1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r0 = r0.shouldDelayChildPressedState()
            if (r0 == 0) goto L_0x0073
            float r0 = r5.getX()
            r4.A00 = r0
            return r2
        L_0x0073:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x005f
        L_0x0078:
            float r1 = r5.getX()
            float r0 = r4.A00
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r4.A03
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0032
        L_0x008a:
            r4.setPressed(r2)
            r4.invalidate()
            r4.A0C = r2
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r4.A06
            if (r1 == 0) goto L_0x009a
            r0 = 0
            r1.onStartTrackingTouch(r0)
        L_0x009a:
            r4.A01(r5)
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0032
            r0.requestDisallowInterceptTouchEvent(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.voicerecorder.VoiceNoteSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHideProgressBar(boolean z2) {
        this.A09 = z2;
    }

    public void setHideProgressWhenPlaybackPositionAtStart(boolean z2) {
        this.A0A = z2;
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A06 = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setProgressColor(int i2) {
        this.A02 = i2;
        invalidate();
    }
}
