package com.obwhatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass20I;
import X.AnonymousClass29D;
import X.AnonymousClass29K;
import X.AnonymousClass29Q;
import X.AnonymousClass2Ra;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C14870pt;
import X.C16320sq;
import X.C41911wr;
import X.C41971wz;
import X.C42061xA;
import X.C42071xB;
import X.C610737f;
import X.C62033Bj;
import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

public class GifComposerFragment extends Hilt_GifComposerFragment {
    public AnonymousClass29D A00;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout02b7);
    }

    public void A13() {
        super.A13();
        AnonymousClass29D r0 = this.A00;
        if (r0 != null) {
            r0.A09();
            this.A00 = null;
        }
    }

    public void A18(Bundle bundle, View view) {
        AnonymousClass29D r6;
        C42061xA r8;
        View view2 = view;
        super.A18(bundle, view2);
        AnonymousClass00B.A0G(AnonymousClass000.A1W(this.A00));
        AnonymousClass29K r4 = (AnonymousClass29K) A0C();
        Uri uri = this.A00;
        AnonymousClass29Q r62 = ((MediaComposerActivity) r4).A1S;
        File A05 = r62.A00(uri).A05();
        AnonymousClass00B.A06(A05);
        if (bundle == null) {
            String A08 = r62.A00(this.A00).A08();
            String ABt = r4.ABt(this.A00);
            if (A08 == null) {
                AnonymousClass20I A002 = r62.A00(this.A00);
                synchronized (A002) {
                    r8 = A002.A05;
                }
                if (r8 == null) {
                    try {
                        r8 = new C42061xA(A05);
                    } catch (C42071xB e2) {
                        Log.e("GifComposerFragment/bad video", e2);
                    }
                }
                RectF rectF = new RectF(0.0f, 0.0f, (float) (r8.A02() ? r8.A01 : r8.A03), (float) (r8.A02() ? r8.A03 : r8.A01));
                AnonymousClass2Ra r7 = this.A0D;
                r7.A0I.A06 = rectF;
                r7.A0H.A00 = 0.0f;
                r7.A05(rectF);
            } else {
                C62033Bj A03 = C62033Bj.A03(A02(), this.A07, this.A08, this.A0I, A08);
                if (A03 != null) {
                    AnonymousClass2Ra r72 = this.A0D;
                    r72.A0H.setDoodle(A03);
                    r72.A0O.A05(ABt);
                }
            }
        }
        try {
            C41911wr.A04(A05);
            try {
                r6 = new C610737f(A0D(), A05);
            } catch (IOException e3) {
                Log.e("GifComposerFragment/onViewCreated videoPlayer initialization", e3);
                this.A03.A09(R.string.str0847, 0);
                A0D().finish();
                return;
            }
        } catch (IOException unused) {
            C14710pd r11 = this.A09;
            C14870pt r82 = this.A03;
            C16320sq r12 = this.A0N;
            AnonymousClass01V r9 = this.A05;
            AnonymousClass013 r10 = this.A07;
            Context A02 = A02();
            AnonymousClass20I A003 = r62.A00(this.A00);
            synchronized (A003) {
                r6 = AnonymousClass29D.A00(A02, r82, r9, r10, r11, r12, A05, true, A003.A0D, C41971wz.A01());
            }
        }
        this.A00 = r6;
        r6.A0B(true);
        C13690nt.A15(this.A00.A06(), C13690nt.A0K(view2, R.id.video_player));
        if (this.A00.equals(r4.A9w())) {
            this.A00.A06().setAlpha(0.0f);
            A0D().A0c();
        }
    }
}
