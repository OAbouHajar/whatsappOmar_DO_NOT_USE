package X;

import com.obwhatsapp.mediacomposer.doodle.ColorPickerView;

/* renamed from: X.4zT  reason: invalid class name and case insensitive filesystem */
public class C102754zT implements C109355Ru {
    public final /* synthetic */ AnonymousClass2Yn A00;
    public final /* synthetic */ AnonymousClass2Ra A01;
    public final /* synthetic */ C49112Rc A02;

    public C102754zT(AnonymousClass2Yn r1, AnonymousClass2Ra r2, C49112Rc r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.A0K() == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AOo(float r5, int r6) {
        /*
            r4 = this;
            X.2Yn r0 = r4.A00
            r0.A00 = r6
            X.2Ra r1 = r4.A01
            X.29k r0 = r1.A0O
            X.29l r0 = r0.A01
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A0K()
            r3 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            X.2Rc r2 = r4.A02
            com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r1.A0E
            com.obwhatsapp.mediacomposer.doodle.ColorPickerView r0 = r0.A05
            float r1 = r0.A00
            boolean r0 = r0.A0B
            r2.A07(r1, r6, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102754zT.AOo(float, int):void");
    }

    public void AZO() {
        AnonymousClass2Yn r5 = this.A00;
        AnonymousClass2Ra r2 = this.A01;
        ColorPickerView colorPickerView = r2.A0E.A05;
        r5.A00 = colorPickerView.A02;
        r2.A04();
        this.A02.A07(colorPickerView.A00, r5.A00, colorPickerView.A0B, false);
    }
}
