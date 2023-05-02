package com.obwhatsapp.camera.recording;

import X.AnonymousClass00X;
import X.C004601z;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;

public class RecordingView extends RelativeLayout {
    public TextView A00;
    public CircularProgressBar A01;
    public final Context A02;

    public RecordingView(Context context) {
        super(context, (AttributeSet) null);
        this.A02 = context;
        A00();
    }

    public RecordingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A02 = context;
        A00();
    }

    public RecordingView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A02 = context;
        A00();
    }

    public void A00() {
        RelativeLayout.inflate(getContext(), R.layout.layout04f3, this);
        this.A01 = (CircularProgressBar) C004601z.A0E(this, R.id.recording_progress);
        this.A00 = (TextView) C004601z.A0E(this, R.id.recording_time);
        this.A01.setMax(100);
    }

    public void A01(boolean z2) {
        if (z2) {
            this.A01.setVisibility(8);
            this.A00.setPadding(0, 0, 0, 0);
            this.A00.setTextSize(2, 14.0f);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00.setLetterSpacing(0.09f);
            }
            setBackground(AnonymousClass00X.A04((Resources.Theme) null, this.A02.getResources(), R.drawable.camera_info_background_new));
        }
    }
}
