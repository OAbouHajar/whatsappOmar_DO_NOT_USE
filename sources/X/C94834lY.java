package X;

import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Formatter;

/* renamed from: X.4lY  reason: invalid class name and case insensitive filesystem */
public class C94834lY implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C46202Cw A00;
    public final /* synthetic */ AnonymousClass29D A01;

    public C94834lY(C46202Cw r1, AnonymousClass29D r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (z2 && ((long) this.A01.A04()) != -9223372036854775807L) {
            C46202Cw r0 = this.A00;
            TextView textView = r0.A0y;
            StringBuilder sb = r0.A17;
            Formatter formatter = r0.A18;
            int progress = seekBar.getProgress();
            AnonymousClass29D r02 = r0.A0I;
            textView.setText(C46212Cy.A00(sb, formatter, (long) (r02 != null ? (int) C13690nt.A09(((long) r02.A04()) * ((long) progress)) : 0)));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C46202Cw r1 = this.A00;
        r1.A0V = true;
        r1.A06();
        r1.removeCallbacks(r1.A16);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C46202Cw r4 = this.A00;
        r4.A0V = false;
        r4.A0v.setProgress(seekBar.getProgress());
        int progress = seekBar.getProgress();
        AnonymousClass29D r0 = r4.A0I;
        int A09 = r0 != null ? (int) C13690nt.A09(((long) r0.A04()) * ((long) progress)) : 0;
        AnonymousClass29D r1 = this.A01;
        if (A09 >= r1.A04()) {
            A09 -= 600;
        }
        r1.A0A(A09);
        r4.A07(800);
        r4.A0M();
    }
}
