package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.2pA  reason: invalid class name and case insensitive filesystem */
public class C56932pA extends LinearLayout implements AnonymousClass006 {
    public C16040sK A00;
    public AnonymousClass15Z A01;
    public C52662eE A02;
    public boolean A03;
    public final TextEmojiLabel A04;
    public final AnonymousClass2AP A05;

    public C56932pA(Context context, AnonymousClass2AP r5) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A00 = C16150sX.A04(A002);
            this.A01 = (AnonymousClass15Z) A002.AOg.get();
        }
        this.A05 = r5;
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LinearLayout.inflate(getContext(), R.layout.layout0115, this);
        this.A04 = C13680ns.A0Q(this, R.id.community_activity_preview);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }
}
