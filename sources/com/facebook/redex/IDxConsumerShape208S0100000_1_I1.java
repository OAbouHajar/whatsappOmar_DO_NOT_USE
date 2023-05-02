package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass04N;
import X.AnonymousClass1L1;
import X.AnonymousClass2U2;
import X.AnonymousClass2b1;
import X.C14710pd;
import X.C16150sX;
import X.C16980tz;
import X.C23231Az;
import X.C41481w0;
import X.C41521w4;
import X.C609336r;
import X.C811747d;
import android.graphics.Bitmap;
import android.net.Uri;
import com.obwhatsapp.group.GroupProfileEmojiEditor;
import com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.io.File;
import java.util.List;

public class IDxConsumerShape208S0100000_1_I1 implements AnonymousClass04N {
    public Object A00;
    public final int A01;

    public IDxConsumerShape208S0100000_1_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void accept(Object obj) {
        Bitmap bitmap;
        int i2 = this.A01;
        Object obj2 = this.A00;
        if (i2 != 0) {
            C41521w4 r2 = (C41521w4) obj2;
            r2.A05 = null;
            ((VoiceRecordingView) r2.A0H).A08.A02((List) obj, 0.0f);
            r2.A01();
            File file = r2.A09;
            if (file != null) {
                AnonymousClass2b1 r0 = r2.A0E;
                AnonymousClass2U2 r10 = r2.A0I;
                C16150sX r1 = r0.A00.A03;
                C16980tz A0V = C16150sX.A0V(r1);
                C14710pd A0k = C16150sX.A0k(r1);
                C41481w0 r3 = new C41481w0(C16150sX.A00(r1), C16150sX.A02(r1), A0V, A0k, (AnonymousClass1L1) r1.ANR.get(), new C811747d(), r10, (C23231Az) r1.A0r.get(), file);
                r2.A08 = r3;
                r3.A00 = r2;
                return;
            }
            return;
        }
        C609336r r22 = (C609336r) obj2;
        GroupProfileEmojiEditor groupProfileEmojiEditor = (GroupProfileEmojiEditor) obj;
        r22.A00 = AnonymousClass000.A0D(groupProfileEmojiEditor.A06.A00.A01());
        r22.A02 = groupProfileEmojiEditor.A00;
        r22.A04 = (Uri) groupProfileEmojiEditor.getIntent().getParcelableExtra("emojiEditorImageResult");
        r22.A01 = groupProfileEmojiEditor.A08.A0C();
        try {
            bitmap = Bitmap.createBitmap(640, 640, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            bitmap = null;
        }
        r22.A03 = bitmap;
    }
}
