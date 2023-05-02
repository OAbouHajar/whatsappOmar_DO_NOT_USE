package X;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.2p9  reason: invalid class name */
public class AnonymousClass2p9 extends LinearLayout implements AnonymousClass006 {
    public ProgressBar A00;
    public TextView A01;
    public C25831Lh A02;
    public C52662eE A03;
    public boolean A04;

    public AnonymousClass2p9(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            this.A02 = (C25831Lh) C52652eD.A00(generatedComponent()).A5Q.get();
        }
        LinearLayout.inflate(context, R.layout.layout0164, this);
        int A002 = AnonymousClass1UP.A00(context) + context.getResources().getDimensionPixelSize(R.dimen.dimen0273);
        setPadding(A002, 0, A002, 0);
        this.A01 = C13680ns.A0L(this, R.id.history_sync_progress_text);
        this.A00 = (ProgressBar) C004601z.A0E(this, R.id.history_sync_progress_loader);
        this.A01.setTextSize(this.A02.A00(getResources()));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A03;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }
}
