package X;

import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.3MU  reason: invalid class name */
public class AnonymousClass3MU extends UnderlineSpan implements AnonymousClass5RO {
    public final AnonymousClass5QO A00;
    public final String A01;
    public final /* synthetic */ MediaCaptionTextView A02;

    public AnonymousClass3MU(AnonymousClass5QO r1, MediaCaptionTextView mediaCaptionTextView, String str) {
        this.A02 = mediaCaptionTextView;
        this.A01 = str;
        this.A00 = r1;
    }

    public void AOZ(MotionEvent motionEvent, View view) {
        this.A00.ASe(motionEvent, view, this.A01);
    }

    public void ATD(MotionEvent motionEvent, View view) {
        AnonymousClass5QO r0 = this.A00;
        String str = this.A01;
        C41811wh r02 = ((AnonymousClass3H3) r0).A00;
        AnonymousClass01V r1 = r02.A0E;
        AnonymousClass3B1.A00(r02.A0B, r1, str);
        C41631wI.A02(r1);
    }
}
