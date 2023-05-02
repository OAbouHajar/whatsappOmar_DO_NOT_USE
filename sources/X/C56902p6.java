package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.obwhatsapp.ListItemWithLeftIcon;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2p6  reason: invalid class name and case insensitive filesystem */
public class C56902p6 extends LinearLayout implements C109315Ro {
    public SwitchCompat A00;
    public SwitchCompat A01;
    public SwitchCompat A02;
    public ListItemWithLeftIcon A03;
    public final C16080sP A04;
    public final AnonymousClass013 A05;
    public final C16070sO A06;
    public final C14710pd A07;
    public final C17240ul A08;
    public final C108795Pj A09;
    public final C16050sL A0A;

    public C56902p6(Context context, C16080sP r10, AnonymousClass013 r11, C16070sO r12, C14710pd r13, C17240ul r14, C108795Pj r15, C16050sL r16) {
        super(context);
        this.A07 = r13;
        this.A05 = r11;
        this.A04 = r10;
        this.A08 = r14;
        this.A06 = r12;
        this.A0A = r16;
        this.A09 = r15;
        C13680ns.A0G(this).inflate(R.layout.layout02e9, this, true);
        setOrientation(1);
        C17240ul r4 = this.A08;
        C16050sL r2 = this.A0A;
        boolean z2 = !r4.A0l(r2);
        ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) C004601z.A0E(this, R.id.restricted_mode_layout);
        SwitchCompat switchCompat = new SwitchCompat(getContext());
        this.A00 = switchCompat;
        switchCompat.setOnCheckedChangeListener(new C94744lP(this, 1));
        listItemWithLeftIcon.A02(this.A00);
        int i2 = 8;
        if (r4.A0l(r2)) {
            listItemWithLeftIcon.setVisibility(8);
        }
        ListItemWithLeftIcon listItemWithLeftIcon2 = (ListItemWithLeftIcon) findViewById(R.id.announcement_group_layout);
        SwitchCompat switchCompat2 = new SwitchCompat(getContext());
        this.A02 = switchCompat2;
        switchCompat2.setOnCheckedChangeListener(new C94744lP(this, 2));
        listItemWithLeftIcon2.A02(this.A02);
        listItemWithLeftIcon2.setVisibility(z2 ? 0 : i2);
        SwitchCompat switchCompat3 = new SwitchCompat(getContext());
        this.A01 = switchCompat3;
        ((ListItemWithLeftIcon) findViewById(R.id.member_add_mode_layout)).A02(switchCompat3);
        this.A01.setOnCheckedChangeListener(new C94744lP(this, 4));
        C14710pd r22 = this.A07;
        C16620tM r1 = C16620tM.A02;
        if (r22.A0E(r1, 1887)) {
            C004601z.A0E(this, R.id.admins_can_section_title).setVisibility(0);
        }
        this.A03 = (ListItemWithLeftIcon) C004601z.A0E(this, R.id.manage_admins);
        listItemWithLeftIcon.setDescription(getContext().getString(r22.A0E(r1, 2005) ? R.string.str0765 : R.string.str0764));
    }

    public void Adz(int i2, boolean z2) {
        this.A01.setChecked(z2);
    }

    public void Ahc(C16010sH r7, boolean z2) {
        boolean z3 = true;
        this.A02.setChecked(!r7.A0Y);
        this.A00.setChecked(!r7.A0l);
        SwitchCompat switchCompat = this.A01;
        int i2 = 0;
        if (r7.A03 == 0) {
            z3 = false;
        }
        switchCompat.setChecked(z3);
        if (!z2) {
            i2 = 8;
        }
        ListItemWithLeftIcon listItemWithLeftIcon = this.A03;
        listItemWithLeftIcon.setVisibility(i2);
        C13690nt.A13(this, R.id.admins_section_title, i2);
        ArrayList A0C = C16070sO.A00(this.A06, this.A0A).A0C();
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = A0C.iterator();
        while (it.hasNext()) {
            A0u.add(((C30661ck) it.next()).A03);
        }
        C16080sP r4 = this.A04;
        HashSet A0o = C13680ns.A0o();
        listItemWithLeftIcon.setDescription(C40631uR.A00(this.A05, r4.A0O(A0o, -1, r4.A0U(A0u, A0o), false), true));
        TextView A0L = C13680ns.A0L(listItemWithLeftIcon, R.id.list_item_description);
        A0L.setMaxLines(1);
        A0L.setEllipsize(TextUtils.TruncateAt.END);
    }
}
