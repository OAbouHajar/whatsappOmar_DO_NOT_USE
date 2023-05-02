package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5e9  reason: invalid class name and case insensitive filesystem */
public class C110455e9 extends LinearLayout implements AnonymousClass006 {
    public View A00;
    public View A01;
    public Button A02;
    public ImageView A03;
    public TextView A04;
    public C52662eE A05;
    public boolean A06;

    public C110455e9(Context context) {
        super(context);
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
        C13680ns.A0G(this).inflate(R.layout.layout00f1, this, true);
        setOrientation(1);
        setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.dimen0652));
        this.A02 = (Button) findViewById(R.id.card_details_alert_button);
        this.A04 = C13680ns.A0M(this, R.id.card_details_alert_message);
        this.A03 = C13680ns.A0K(this, R.id.card_details_alert_icon);
        this.A00 = findViewById(R.id.card_details_alert_icon_container);
        this.A01 = findViewById(R.id.card_details_alert_divider);
        setAlertType(1);
    }

    private void setAlertIcon(Drawable drawable) {
        this.A03.setImageDrawable(drawable);
    }

    private void setAlertIconTint(int i2) {
        AnonymousClass2SR.A08(this.A03, i2);
    }

    private void setAlertMessageText(String str) {
        this.A04.setText(str);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A05;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAlertButtonClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setAlertButtonText(String str) {
        this.A02.setText(str);
    }

    public void setAlertButtonVisibility(int i2) {
        this.A02.setVisibility(i2);
    }

    public void setAlertType(int i2) {
        Context context;
        int i3;
        Context context2;
        int i4;
        Resources resources;
        int i5;
        String string;
        if (i2 != 0) {
            if (i2 == 2) {
                setAlertButtonVisibility(8);
                setAlertMessageText(getContext().getString(R.string.str03b5));
                resources = getResources();
                i5 = R.drawable.ic_settings_info;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    setAlertButtonVisibility(0);
                    setAlertButtonText(getContext().getString(R.string.str1987));
                    string = getContext().getString(R.string.str199b);
                } else {
                    setAlertButtonVisibility(0);
                    setAlertButtonText(getResources().getString(R.string.str1987));
                    string = getResources().getString(R.string.str199a);
                }
                setAlertMessageText(string);
                resources = getResources();
                i5 = R.drawable.ic_settings_secure;
            } else {
                setAlertButtonVisibility(0);
                setAlertButtonText(getContext().getString(R.string.str13e7));
                context = getContext();
                i3 = R.string.str03b4;
                setAlertMessageText(context.getString(i3));
                setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_warning));
                context2 = getContext();
                i4 = R.color.color05ec;
            }
            setAlertIcon(resources.getDrawable(i5));
            context2 = getContext();
            i4 = R.color.color05ed;
        } else {
            setAlertButtonVisibility(0);
            setAlertButtonText(getContext().getString(R.string.str13e7));
            context = getContext();
            i3 = R.string.str03b0;
            setAlertMessageText(context.getString(i3));
            setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_warning));
            context2 = getContext();
            i4 = R.color.color05ec;
        }
        setAlertIconTint(AnonymousClass00T.A00(context2, i4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        setAlertMessageText(r1.getString(r0));
        setAlertIcon(getResources().getDrawable(com.obwhatsapp.R.drawable.ic_fbpay_error));
        r1 = getContext();
        r0 = com.obwhatsapp.R.color.color05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        setAlertMessageText(getContext().getString(com.obwhatsapp.R.string.str199b));
        setAlertIcon(getResources().getDrawable(com.obwhatsapp.R.drawable.ic_settings_secure));
        r1 = getContext();
        r0 = com.obwhatsapp.R.color.color05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        setAlertIconTint(X.AnonymousClass00T.A00(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAlertType(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1757659853: goto L_0x0032;
                case -591252731: goto L_0x0047;
                case 1124965819: goto L_0x0057;
                default: goto L_0x0007;
            }
        L_0x0007:
            android.content.Context r1 = r2.getContext()
            r0 = 2131892635(0x7f12199b, float:1.9420024E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setAlertMessageText(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131231887(0x7f08048f, float:1.8079868E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setAlertIcon(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131101165(0x7f0605ed, float:1.7814732E38)
        L_0x002a:
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r2.setAlertIconTint(r0)
            return
        L_0x0032:
            java.lang.String r0 = "VOIDED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 8
            r2.setAlertButtonVisibility(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131887024(0x7f1203b0, float:1.9408643E38)
            goto L_0x0066
        L_0x0047:
            java.lang.String r0 = "EXPIRED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            android.content.Context r1 = r2.getContext()
            r0 = 2131889989(0x7f120f45, float:1.9414657E38)
            goto L_0x0066
        L_0x0057:
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            android.content.Context r1 = r2.getContext()
            r0 = 2131887028(0x7f1203b4, float:1.9408652E38)
        L_0x0066:
            java.lang.String r0 = r1.getString(r0)
            r2.setAlertMessageText(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131231643(0x7f08039b, float:1.8079373E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setAlertIcon(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131101164(0x7f0605ec, float:1.781473E38)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110455e9.setAlertType(java.lang.String):void");
    }

    public void setTopDividerVisibility(int i2) {
        this.A01.setVisibility(i2);
    }
}
