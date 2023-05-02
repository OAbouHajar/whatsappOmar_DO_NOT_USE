package X;

import android.content.Context;
import android.text.Spanned;
import android.text.SpannedString;
import android.view.View;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.group.GroupSettingsRowView;

/* renamed from: X.2p7  reason: invalid class name and case insensitive filesystem */
public class C56912p7 extends LinearLayout implements C109315Ro {
    public final C15900s5 A00;
    public final C16000sG A01;
    public final C14710pd A02;
    public final C17240ul A03;
    public final C108795Pj A04;
    public final C16050sL A05;

    public C56912p7(Context context, C15900s5 r17, C16000sG r18, C14710pd r19, C17240ul r20, C108795Pj r21, C16050sL r22) {
        super(context);
        this.A02 = r19;
        this.A00 = r17;
        this.A01 = r18;
        this.A03 = r20;
        this.A05 = r22;
        this.A04 = r21;
        C13680ns.A0G(this).inflate(R.layout.layout02e8, this, true);
        setOrientation(1);
        C16000sG r0 = this.A01;
        C16050sL r1 = this.A05;
        C16010sH A0A = r0.A0A(r1);
        boolean A0l = this.A03.A0l(r1);
        boolean z2 = !A0l;
        GroupSettingsRowView groupSettingsRowView = (GroupSettingsRowView) findViewById(R.id.restricted_mode_layout);
        C34331k5.A04(groupSettingsRowView, this, A0A, 41);
        View findViewById = findViewById(R.id.restricted_mode_separator);
        View findViewById2 = findViewById(R.id.announcement_group_layout_top_shadow);
        View findViewById3 = findViewById(R.id.announcement_group_layout);
        View findViewById4 = findViewById(R.id.announcement_group_layout_bottom_shadow);
        C34331k5.A04(findViewById3, this, A0A, 42);
        findViewById.setVisibility(8);
        findViewById2.setVisibility(0);
        C14710pd r3 = this.A02;
        C16620tM r2 = C16620tM.A02;
        if (r3.A0E(r2, 1353)) {
            groupSettingsRowView.setTitleText(R.string.str0766);
            StringBuilder A0o = AnonymousClass000.A0o();
            C13700nu.A0a(A0o, getContext().getString(R.string.str0b0b));
            groupSettingsRowView.setDescriptionText((Spanned) new SpannedString(AnonymousClass000.A0h(getContext().getString(R.string.str0b0c), A0o)));
        } else {
            groupSettingsRowView.setTitleText(R.string.str1ce8);
            groupSettingsRowView.setDescriptionText((int) R.string.str0b0d);
        }
        if (z2) {
            findViewById3.setVisibility(0);
            findViewById4.setVisibility(0);
        } else {
            C13690nt.A14(findViewById3, findViewById2, findViewById, 8);
            findViewById4.setVisibility(8);
        }
        if (A0l) {
            groupSettingsRowView.setVisibility(8);
        }
        GroupSettingsRowView groupSettingsRowView2 = (GroupSettingsRowView) findViewById(R.id.frequently_forwarded_layout);
        C34331k5.A04(groupSettingsRowView2, this, A0A, 43);
        groupSettingsRowView2.setTitleText(R.string.str0b00);
        if (r3.A0E(r2, 1887)) {
            C13690nt.A13(this, R.id.membership_approval_divider_top, 0);
        }
    }

    private void setEditGroupInfoSetting(boolean z2) {
        GroupSettingsRowView groupSettingsRowView = (GroupSettingsRowView) findViewById(R.id.restricted_mode_layout);
        int i2 = R.string.str0b03;
        if (z2) {
            i2 = R.string.str0afb;
        }
        groupSettingsRowView.setInfoText(i2);
    }

    private void setFrequentlyForwardedSetting(boolean z2) {
        boolean A052 = this.A00.A05(C15910s6.A0O);
        GroupSettingsRowView groupSettingsRowView = (GroupSettingsRowView) findViewById(R.id.frequently_forwarded_layout);
        View findViewById = findViewById(R.id.frequently_forwarded_divider_bottom);
        View findViewById2 = findViewById(R.id.frequently_forwarded_divider_top);
        int i2 = 0;
        groupSettingsRowView.setVisibility(C13680ns.A02(A052 ? 1 : 0));
        findViewById2.setVisibility(C13680ns.A02(A052));
        if (!A052) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        if (A052) {
            int i3 = R.string.str0aff;
            if (z2) {
                i3 = R.string.str0afc;
            }
            groupSettingsRowView.setInfoText(i3);
        }
    }

    private void setSendMessagesSetting(boolean z2) {
        GroupSettingsRowView groupSettingsRowView = (GroupSettingsRowView) findViewById(R.id.announcement_group_layout);
        int i2 = R.string.str0b03;
        if (z2) {
            i2 = R.string.str0afb;
        }
        groupSettingsRowView.setInfoText(i2);
    }

    public void Adz(int i2, boolean z2) {
        throw new Exception("add other participants setting is not supported");
    }

    public void Ahc(C16010sH r3, boolean z2) {
        setEditGroupInfoSetting(!r3.A0l);
        setSendMessagesSetting(!r3.A0Y);
        setFrequentlyForwardedSetting(!r3.A0j);
        findViewById(R.id.manage_admins_group).setVisibility(C13680ns.A02(z2 ? 1 : 0));
    }
}
