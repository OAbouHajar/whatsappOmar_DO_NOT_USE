package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape1S0500000_I0;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;

/* renamed from: X.2VR  reason: invalid class name */
public final class AnonymousClass2VR extends FrameLayout implements AnonymousClass006 {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public AnonymousClass01Y A04;
    public C15810rt A05;
    public C52662eE A06;
    public boolean A07;

    public AnonymousClass2VR(Context context) {
        super(context);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        FrameLayout.inflate(context, R.layout.layout015c, this);
        this.A00 = findViewById(R.id.content);
        this.A01 = findViewById(R.id.divider);
        this.A02 = (TextView) findViewById(R.id.add_btn);
        this.A03 = (TextView) findViewById(R.id.block_btn);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A06;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public void setup(C000900k r9, C15810rt r10, C14600pS r11, C15900s5 r12, AnonymousClass01Y r13, Runnable runnable, C16010sH r15) {
        this.A05 = r10;
        this.A04 = r13;
        C16010sH r3 = r15;
        this.A03.setOnClickListener(new ViewOnClickCListenerShape1S0500000_I0(this, r3, r13, r11, r9, 0));
        this.A02.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(runnable, 46));
    }
}
