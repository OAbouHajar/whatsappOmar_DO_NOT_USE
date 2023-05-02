package com.facebook.redex;

import X.AnonymousClass20I;
import X.AnonymousClass29F;
import X.AnonymousClass29T;
import X.AnonymousClass2Ra;
import X.AnonymousClass2X6;
import X.AnonymousClass2Yn;
import X.AnonymousClass4IF;
import X.AnonymousClass4XG;
import X.C39501sa;
import X.C456429w;
import X.C49112Rc;
import X.C84484Ks;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannedString;
import android.text.TextUtils;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.obwhatsapp.mediacomposer.doodle.ColorPickerView;
import com.obwhatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.util.Log;
import java.util.List;

public class IDxDListenerShape157S0100000_1_I0 implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public IDxDListenerShape157S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.A01 != 0) {
            AnonymousClass2Ra r6 = (AnonymousClass2Ra) this.A00;
            AnonymousClass4XG r5 = r6.A03;
            r5.A05();
            r6.A0J.A02 = false;
            ColorPickerComponent colorPickerComponent = r6.A0E;
            ColorPickerView colorPickerView = colorPickerComponent.A05;
            colorPickerView.A01();
            colorPickerView.invalidate();
            r6.A0O.A01 = null;
            DoodleView doodleView = r6.A0H;
            AnonymousClass2Yn r2 = r6.A0F;
            doodleView.A03 = r2.A00;
            doodleView.invalidate();
            colorPickerComponent.setColorAndInvalidate(r2.A00);
            C49112Rc r1 = r6.A0Q;
            r1.A08(0);
            r1.A01 = r2.A00;
            r5.A04();
            r6.A04();
            r1.A04();
            return;
        }
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
        if (!AnonymousClass29T.A03(mediaComposerActivity)) {
            mediaComposerActivity.A0o.A01(mediaComposerActivity.A0l.A08());
            C456429w r22 = mediaComposerActivity.A0o;
            boolean A07 = mediaComposerActivity.A0l.A07();
            AnonymousClass4IF r0 = r22.A05;
            if (A07) {
                r0.A01.setFilterSwipeTextVisibility(0);
            }
            AnonymousClass29F r62 = mediaComposerActivity.A0p;
            C84484Ks r52 = r62.A04;
            if (r52 == null) {
                AnonymousClass2X6 r02 = r62.A03;
                if (r02 == null) {
                    r52 = new C84484Ks((CharSequence) null, (String) null, (List) null);
                } else {
                    CaptionView captionView = r02.A04;
                    r52 = new C84484Ks(new SpannedString(captionView.getCaptionText()), captionView.A0B.getStringText(), captionView.A0B.getMentions());
                }
                r62.A04 = r52;
            }
            mediaComposerActivity.A0o.A00(r52.A00, false);
            Uri A02 = mediaComposerActivity.A0l.A02();
            if (A02 != null) {
                AnonymousClass20I A002 = mediaComposerActivity.A1S.A00(A02);
                A002.A0D(r52.A01);
                A002.A0E(C39501sa.A00(r52.A02));
            } else {
                Log.e("MediaComposerActivity/captionentry/dismiss/current uri is null");
            }
            AnonymousClass29F r12 = mediaComposerActivity.A0p;
            if (r12.A0A) {
                if (mediaComposerActivity.A1N) {
                    mediaComposerActivity.A03.AcB("MediaComposer/sendMedia/avoided double send", TextUtils.join(", ", mediaComposerActivity.A39()), true);
                    return;
                }
                mediaComposerActivity.A3F();
            } else if (r12.A08) {
                mediaComposerActivity.A3N(r12.A0B);
            }
        }
    }
}
