package com.obwhatsapp.dialogs;

import X.AnonymousClass000;
import X.C004601z;
import X.C13680ns;
import X.C42731ya;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class AudioVideoBottomSheetDialogFragment extends Hilt_AudioVideoBottomSheetDialogFragment {
    public C42731ya A00;

    public void A0k() {
        super.A0k();
        this.A00 = null;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0080);
        View A0E = C004601z.A0E(A0H, R.id.audio_call_item);
        View A0E2 = C004601z.A0E(A0H, R.id.video_call_item);
        C13680ns.A17(A0E, this, 41);
        C13680ns.A17(A0E2, this, 42);
        return A0H;
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof C42731ya) {
            this.A00 = (C42731ya) context;
            return;
        }
        throw AnonymousClass000.A0V(AnonymousClass000.A0h("AudioVideoBottomSheetDialogListener", AnonymousClass000.A0r("Activity must implement ")));
    }
}
