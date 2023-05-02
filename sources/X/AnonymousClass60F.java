package X;

import android.widget.ProgressBar;
import com.obwhatsapp.R;

/* renamed from: X.60F  reason: invalid class name */
public class AnonymousClass60F implements C440622p {
    public final /* synthetic */ ProgressBar A00;
    public final /* synthetic */ C112855jo A01;

    public AnonymousClass60F(ProgressBar progressBar, C112855jo r2) {
        this.A01 = r2;
        this.A00 = progressBar;
    }

    public void ALw() {
        this.A00.setVisibility(8);
        C112855jo r3 = this.A01;
        r3.A05.A09(R.string.str1076, 0);
        r3.finish();
    }

    public void AQQ() {
        this.A01.finish();
    }

    public void AYu() {
        this.A00.setVisibility(8);
        C112855jo r3 = this.A01;
        r3.A05.A09(R.string.str1076, 0);
        r3.finish();
    }

    public void onSuccess() {
        this.A00.setVisibility(8);
        this.A01.A38();
    }
}
