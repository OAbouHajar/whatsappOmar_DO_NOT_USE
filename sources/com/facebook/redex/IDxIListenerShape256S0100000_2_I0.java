package com.facebook.redex;

import X.AnonymousClass00T;
import X.AnonymousClass1ZL;
import X.AnonymousClass2NR;
import X.C004601z;
import X.C13680ns;
import X.C34621kZ;
import X.C42821yj;
import X.C48942Pz;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.waveforms.VoiceVisualizer;
import com.obwhatsapp.voicerecorder.VoiceNoteSeekBar;

public class IDxIListenerShape256S0100000_2_I0 implements AnonymousClass2NR {
    public Object A00;
    public final int A01;

    public IDxIListenerShape256S0100000_2_I0(C42821yj r1, int i2) {
        this.A01 = i2;
        if (i2 != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public IDxIListenerShape256S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ASD(View view) {
        switch (this.A01) {
            case 0:
                C42821yj r2 = (C42821yj) this.A00;
                r2.A0W = (TextView) r2.A22.findViewById(R.id.important_badge);
                C34621kZ r0 = r2.A2C;
                if (r0 != null && r0.A0M.A01() != null && ((C48942Pz) r2.A2C.A0M.A01()).A01 != null) {
                    r2.A0W.setText(((C48942Pz) r2.A2C.A0M.A01()).A01);
                    return;
                }
                return;
            case 1:
                C42821yj r22 = (C42821yj) this.A00;
                r22.A0X = (TextView) AnonymousClass00T.A05((Activity) r22.A22, R.id.unseen_badge);
                view.setContentDescription(r22.A22.getString(R.string.str09ca));
                return;
            case 2:
                Context context = (Context) this.A00;
                CircularProgressBar circularProgressBar = (CircularProgressBar) view;
                circularProgressBar.setMax(100);
                circularProgressBar.A0C = AnonymousClass00T.A00(context, R.color.color0541);
                circularProgressBar.A0B = AnonymousClass00T.A00(context, R.color.color014b);
                return;
            default:
                AnonymousClass1ZL r1 = (AnonymousClass1ZL) this.A00;
                r1.A01 = (ImageButton) C004601z.A0E(view, R.id.voice_note_draft_playback_btn_v2);
                r1.A02 = C13680ns.A0L(view, R.id.voice_note_draft_time_v2);
                r1.A04 = (VoiceNoteSeekBar) C004601z.A0E(view, R.id.voice_note_draft_seekbar_v2);
                r1.A03 = (VoiceVisualizer) C004601z.A0E(view, R.id.voice_note_draft_preview_audio_visualizer);
                C004601z.A0d(r1.A02, 2);
                return;
        }
    }
}
