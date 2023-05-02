package X;

import android.content.Intent;
import android.net.Uri;
import com.facebook.redex.IDxListenerShape441S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.obwhatsapp.inappsupport.ui.ContactUsActivity;
import com.obwhatsapp.inappsupport.ui.SupportTopicsActivity;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.2Nw  reason: invalid class name and case insensitive filesystem */
public class C48562Nw {
    public static Pattern A0C;
    public AnonymousClass1YA A00 = new IDxListenerShape441S0100000_2_I0(this, 0);
    public AnonymousClass1YA A01 = new IDxListenerShape441S0100000_2_I0(this, 1);
    public ContactUsActivity A02;
    public GroupJid A03;
    public boolean A04;
    public boolean A05;
    public final C14870pt A06;
    public final C15810rt A07;
    public final C33501ig A08 = new IDxCObserverShape72S0100000_2_I0(this, 12);
    public final AnonymousClass11A A09;
    public final C14710pd A0A;
    public final AnonymousClass1YD A0B = new C48552Nv(this);

    public C48562Nw(C14870pt r3, C15810rt r4, AnonymousClass11A r5, C14710pd r6, ContactUsActivity contactUsActivity) {
        this.A0A = r6;
        this.A06 = r3;
        this.A07 = r4;
        this.A09 = r5;
        this.A02 = contactUsActivity;
        A0C = Pattern.compile("[^\\p{L}\\p{N}\\p{P}\\p{Z}]");
    }

    public static /* synthetic */ void A00(C85364Od r13, C48562Nw r14, int i2) {
        ContactUsActivity contactUsActivity = r14.A02;
        AnonymousClass00B.A06(contactUsActivity);
        int i3 = r13.A00;
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(new AnonymousClass3CN((C93454jD) null, (String) r13.A04.get(i4), (String) r13.A06.get(i4), (String) r13.A03.get(i4), (String) r13.A07.get(i4), (ArrayList) null, false));
        }
        int i5 = 2;
        if (i2 == 2) {
            i5 = 1;
        }
        String stringExtra = contactUsActivity.getIntent().getStringExtra("com.obwhatsapp.inappsupport.ui.ContactUsActivity.from");
        ContactUsActivity contactUsActivity2 = r14.A02;
        if ("biz-directory-browsing".equals(stringExtra)) {
            r14.A01();
            return;
        }
        String str = r13.A01;
        ArrayList A35 = contactUsActivity2.A35(arrayList);
        Intent intent = new Intent(contactUsActivity2, SupportTopicsActivity.class);
        intent.putParcelableArrayListExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.support_topics", A35);
        intent.putExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 2);
        intent.putExtra("com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", i5);
        intent.putExtra("com.obwhatsapp.inappsupport.ui.ContactUsActvity.support_type", i2);
        intent.putExtra("com.obwhatsapp.inappsupport.ui.ContactUsActivity.debug_info", str);
        contactUsActivity2.startActivityForResult(intent, 11);
    }

    public void A01() {
        ContactUsActivity contactUsActivity = this.A02;
        AnonymousClass00B.A06(contactUsActivity);
        String trim = contactUsActivity.A00.getText().toString().trim();
        boolean isChecked = this.A02.A02.isChecked();
        contactUsActivity.A37(3, trim);
        contactUsActivity.A0L.A01(contactUsActivity, contactUsActivity.A0C, contactUsActivity.A0H, contactUsActivity.A0S, trim, contactUsActivity.A0R, contactUsActivity.A0T, new ArrayList(), (List) null, isChecked);
    }

    public void A02(int i2) {
        ContactUsActivity contactUsActivity = this.A02;
        AnonymousClass00B.A06(contactUsActivity);
        AnonymousClass00B.A06(contactUsActivity);
        int length = A0C.matcher(contactUsActivity.A00.getText().toString().trim()).replaceAll("").getBytes().length;
        if (this.A05 || length >= 10) {
            ContactUsActivity contactUsActivity2 = this.A02;
            AnonymousClass00B.A06(contactUsActivity2);
            if ("biz-directory-browsing".equals(contactUsActivity2.getIntent().getStringExtra("com.obwhatsapp.inappsupport.ui.ContactUsActivity.from"))) {
                A01();
                return;
            }
            this.A02.A01.setVisibility(8);
            ContactUsActivity contactUsActivity3 = this.A02;
            contactUsActivity3.A00.setBackgroundDrawable(AnonymousClass00T.A04(contactUsActivity3, R.drawable.description_field_background_state_list));
            ContactUsActivity contactUsActivity4 = this.A02;
            AnonymousClass1YA r12 = i2 == 1 ? this.A00 : this.A01;
            String trim = contactUsActivity4.A00.getText().toString().trim();
            C16320sq r11 = contactUsActivity4.A05;
            String str = contactUsActivity4.A0S;
            String str2 = contactUsActivity4.A0T;
            AnonymousClass37C r0 = contactUsActivity4.A0F;
            if (r0 != null && r0.A03() == 1) {
                contactUsActivity4.A0F.A06(false);
            }
            C18160wF r15 = contactUsActivity4.A0P;
            C14730pf r14 = contactUsActivity4.A06;
            C17220uj r10 = contactUsActivity4.A0N;
            AnonymousClass013 r9 = contactUsActivity4.A08;
            C23251Bb r8 = contactUsActivity4.A0O;
            AnonymousClass12W r7 = contactUsActivity4.A07;
            AnonymousClass15W r6 = contactUsActivity4.A0D;
            C15860rz r5 = contactUsActivity4.A09;
            AnonymousClass1BY r4 = contactUsActivity4.A0L;
            C15860rz r16 = r5;
            AnonymousClass013 r17 = r9;
            C14730pf r18 = r14;
            C17130ua r142 = contactUsActivity4.A05;
            AnonymousClass12W r152 = r7;
            AnonymousClass37C r122 = new AnonymousClass37C(contactUsActivity4, r142, r152, r16, r17, r18, contactUsActivity4.A0C, r6, r12, contactUsActivity4.A0H, r4, r10, r8, r15, str, str2, trim, (List) null, new Uri[0]);
            contactUsActivity4.A0F = r122;
            r11.Ack(r122, new Void[0]);
            return;
        }
        ContactUsActivity contactUsActivity5 = this.A02;
        contactUsActivity5.A00.setBackgroundDrawable(AnonymousClass00T.A04(contactUsActivity5, R.drawable.describe_problem_edittext_bg_error));
        ContactUsActivity contactUsActivity6 = this.A02;
        int i3 = R.string.str06c7;
        if (length == 0) {
            i3 = R.string.str06c6;
        }
        contactUsActivity6.A01.setText(i3);
        this.A02.A01.setVisibility(0);
    }

    public void A03(String str) {
        String str2 = str;
        ContactUsActivity contactUsActivity = this.A02;
        AnonymousClass00B.A06(contactUsActivity);
        contactUsActivity.A2h(contactUsActivity.getString(R.string.str1715));
        ContactUsActivity contactUsActivity2 = this.A02;
        String trim = contactUsActivity2.A00.getText().toString().trim();
        if (!this.A02.A02.isChecked()) {
            str2 = null;
        }
        boolean isChecked = this.A02.A02.isChecked();
        contactUsActivity2.A0E.A00(this.A0B, trim, str2, isChecked, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r0.A07.A0F(r2) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(boolean r7) {
        /*
            r6 = this;
            com.obwhatsapp.inappsupport.ui.ContactUsActivity r0 = r6.A02
            r5 = 1
            if (r0 == 0) goto L_0x009d
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x009d
            X.0pd r2 = r6.A0A
            r1 = 819(0x333, float:1.148E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r2 = r2.A0E(r0, r1)
            if (r2 == 0) goto L_0x0064
            com.whatsapp.jid.GroupJid r1 = r6.A03
            if (r1 == 0) goto L_0x0064
            X.0rt r0 = r6.A07
            boolean r0 = r0.A0F(r1)
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "SupportContactUsPresenter/openChatOrShowTicketHaveCreatedDialog - opening chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.obwhatsapp.inappsupport.ui.ContactUsActivity r0 = r6.A02
            r0.Ac1()
            com.obwhatsapp.inappsupport.ui.ContactUsActivity r3 = r6.A02
            com.whatsapp.jid.GroupJid r2 = r6.A03
            X.2Nw r0 = r3.A0G
            if (r2 == 0) goto L_0x003c
            X.0rt r0 = r0.A07
            boolean r0 = r0.A0F(r2)
            r1 = 1
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            java.lang.String r0 = "Support group to open doesn't exist"
            X.AnonymousClass00B.A0B(r0, r1)
            java.lang.String r1 = "contactusactivity/tryopensupportchat/exists/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ph r0 = new X.0ph
            r0.<init>()
            android.content.Intent r0 = r0.A0x(r3, r2)
            r3.A2X(r0, r5)
        L_0x005f:
            r6.A04 = r5
        L_0x0061:
            boolean r0 = r6.A04
            return r0
        L_0x0064:
            if (r7 != 0) goto L_0x006c
            if (r2 == 0) goto L_0x006c
            com.whatsapp.jid.GroupJid r0 = r6.A03
            if (r0 != 0) goto L_0x0061
        L_0x006c:
            java.lang.String r0 = "SupportContactUsPresenter/openChatOrShowTicketHaveCreatedDialog - showing dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.obwhatsapp.inappsupport.ui.ContactUsActivity r0 = r6.A02
            r0.Ac1()
            com.obwhatsapp.inappsupport.ui.ContactUsActivity r4 = r6.A02
            r1 = 2131887173(0x7f120445, float:1.9408946E38)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.2T3 r3 = com.obwhatsapp.LegacyMessageDialogFragment.A01(r0, r1)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 4
            com.facebook.redex.IDxCListenerShape22S0000000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape22S0000000_2_I0
            r0.<init>(r1)
            r3.A01(r0, r2)
            r3.A00 = r5
            androidx.fragment.app.DialogFragment r2 = r3.A00()
            X.02C r1 = r4.AGM()
            r0 = 0
            r2.A1G(r1, r0)
            goto L_0x005f
        L_0x009d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48562Nw.A04(boolean):boolean");
    }
}
