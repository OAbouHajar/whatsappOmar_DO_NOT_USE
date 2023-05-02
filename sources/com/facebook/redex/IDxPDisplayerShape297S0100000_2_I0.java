package com.facebook.redex;

import X.AnonymousClass2OY;
import X.C17160ud;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;

public class IDxPDisplayerShape297S0100000_2_I0 implements AnonymousClass2OY {
    public Object A00;
    public final int A01;

    public IDxPDisplayerShape297S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AfW(Bitmap bitmap, ImageView imageView, boolean z2) {
        if (this.A01 != 0) {
            if (bitmap == null) {
                return;
            }
        } else if (bitmap == null) {
            Afn(imageView);
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public void Afn(ImageView imageView) {
        if (this.A01 != 0) {
            boolean A0u = VoipActivityV2.A0u(Voip.getCallInfo());
            int i2 = R.drawable.vec_avatar_contact_voice_call;
            if (A0u) {
                i2 = R.drawable.vec_avatar_contact_video_call;
            }
            imageView.setImageResource(i2);
            return;
        }
        imageView.setImageBitmap(((C17160ud) this.A00).A03(imageView.getContext(), R.drawable.avatar_contact_voip));
    }
}
