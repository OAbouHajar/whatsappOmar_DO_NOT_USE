package X;

import android.widget.BaseAdapter;
import com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity;

/* renamed from: X.2oN  reason: invalid class name */
public class AnonymousClass2oN extends BaseAdapter {
    public final /* synthetic */ MessageDetailsActivity A00;

    public AnonymousClass2oN(MessageDetailsActivity messageDetailsActivity) {
        this.A00 = messageDetailsActivity;
    }

    public int getCount() {
        return 1;
    }

    public Object getItem(int i2) {
        return null;
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017c, code lost:
        if (r8 != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0183, code lost:
        if (r8 != null) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r16, android.view.View r17, android.view.ViewGroup r18) {
        /*
            r15 = this;
            r4 = r17
            r10 = 0
            if (r17 != 0) goto L_0x0014
            com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity r0 = r15.A00
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131559401(0x7f0d03e9, float:1.8744145E38)
            r2 = r18
            android.view.View r4 = r1.inflate(r0, r2, r10)
        L_0x0014:
            com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity r3 = r15.A00
            java.util.ArrayList r5 = r3.A0b
            java.lang.Object r2 = r5.get(r10)
            X.2Aj r2 = (X.AnonymousClass2Aj) r2
            r6 = 0
            X.40j r1 = r2.A02()
            X.0pd r0 = r3.A0C
            boolean r0 = com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity.A03(r1, r0)
            r7 = 1
            if (r0 == 0) goto L_0x003b
            int r0 = r5.size()
            if (r0 <= r7) goto L_0x003b
            r6 = r2
            X.3ox r6 = (X.AnonymousClass3ox) r6
            java.lang.Object r2 = r5.get(r7)
            X.2Aj r2 = (X.AnonymousClass2Aj) r2
        L_0x003b:
            X.21N r8 = r2.A00
            r0 = 2131366008(0x7f0a1078, float:1.8351897E38)
            android.view.View r5 = X.C004601z.A0E(r4, r0)
            X.0tZ r9 = r3.A0M
            byte r1 = r9.A10
            r2 = 1
            r0 = 2
            if (r1 != r0) goto L_0x0050
            int r0 = r9.A08
            if (r0 == r7) goto L_0x0057
        L_0x0050:
            boolean r0 = X.C30921dB.A00(r1)
            if (r0 != 0) goto L_0x0057
            r2 = 0
        L_0x0057:
            r1 = 8
            if (r2 == 0) goto L_0x0194
            r0 = 2131365362(0x7f0a0df2, float:1.8350587E38)
            android.widget.TextView r2 = X.C13680ns.A0L(r5, r0)
            r0 = 2131365361(0x7f0a0df1, float:1.8350585E38)
            android.widget.ImageView r9 = X.C13680ns.A0J(r5, r0)
            r5.setVisibility(r10)
            X.0tZ r0 = r3.A0M
            X.4Zr r7 = X.C88044Zr.A00(r0, r7)
            int r0 = r7.A02
            r2.setText(r0)
            android.content.Context r5 = r4.getContext()
            int r2 = r7.A01
            int r0 = r7.A00
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A02(r5, r2, r0)
            r9.setImageDrawable(r0)
        L_0x0086:
            r0 = 2131366655(0x7f0a12ff, float:1.835321E38)
            android.widget.TextView r5 = X.C13680ns.A0M(r4, r0)
            X.0tZ r0 = r3.A0M
            byte r0 = r0.A10
            if (r0 != 0) goto L_0x0186
            r2 = 2131889488(0x7f120d50, float:1.941364E38)
        L_0x0096:
            r5.setText(r2)
            r0 = 2131363073(0x7f0a0501, float:1.8345945E38)
            android.widget.TextView r9 = X.C13680ns.A0M(r4, r0)
            r0 = 2131363061(0x7f0a04f5, float:1.834592E38)
            android.widget.TextView r12 = X.C13680ns.A0M(r4, r0)
            r0 = 2131363070(0x7f0a04fe, float:1.8345938E38)
            android.widget.TextView r10 = X.C13680ns.A0M(r4, r0)
            r0 = 2131363067(0x7f0a04fb, float:1.8345932E38)
            android.widget.TextView r5 = X.C13680ns.A0M(r4, r0)
            r0 = 2131363768(0x7f0a07b8, float:1.8347354E38)
            r4.findViewById(r0)
            r0 = 2131363064(0x7f0a04f8, float:1.8345926E38)
            android.widget.TextView r7 = X.C13680ns.A0L(r4, r0)
            r0 = 2131366007(0x7f0a1077, float:1.8351895E38)
            android.view.View r2 = X.C004601z.A0E(r4, r0)
            r0 = 2131363146(0x7f0a054a, float:1.8346093E38)
            android.view.View r11 = r4.findViewById(r0)
            r0 = 2131362208(0x7f0a01a0, float:1.834419E38)
            X.C13690nt.A13(r4, r0, r1)
            r0 = 2131363767(0x7f0a07b7, float:1.8347352E38)
            android.view.View r0 = r4.findViewById(r0)
            r11.setVisibility(r1)
            r0.setVisibility(r1)
            X.0tZ r0 = r3.A0M
            long r0 = r0.A0I
            X.C14530pL.A0X(r9, r3, r0)
            java.lang.String r9 = "—"
            if (r8 == 0) goto L_0x0179
            r0 = 5
            long r0 = r8.A01(r0)
            r13 = 0
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0179
            X.C14530pL.A0X(r12, r3, r0)
        L_0x00fd:
            r0 = 13
            long r0 = r8.A01(r0)
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0180
            X.C14530pL.A0X(r10, r3, r0)
        L_0x010c:
            r10 = 0
            long r0 = r8.A01
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x012a
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x012a
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x011e
            r0 = 0
        L_0x011e:
            X.0t3 r9 = r3.A05
            X.013 r8 = r3.A01
            long r0 = r9.A02(r0)
            java.lang.CharSequence r9 = X.C28961Zl.A01(r8, r0)
        L_0x012a:
            r5.setText(r9)
            if (r6 == 0) goto L_0x0176
            long r0 = r6.A00
            r8 = 0
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0176
            r5 = 2131364245(0x7f0a0995, float:1.8348322E38)
            android.widget.TextView r10 = X.C13680ns.A0M(r4, r5)
            X.0tZ r5 = r3.A0M
            X.1s4 r8 = r5.A1A
            X.1Vw r5 = r8.A11
            boolean r6 = r5.A02
            java.lang.String r9 = com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity.A02(r3, r8)
            X.0tz r5 = r3.A0G
            android.content.res.Resources r8 = X.C16980tz.A00(r5)
            if (r6 != 0) goto L_0x016e
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 != 0) goto L_0x016e
            r6 = 2131889144(0x7f120bf8, float:1.9412943E38)
            java.lang.Object[] r5 = X.AnonymousClass000.A1a(r9)
            java.lang.String r5 = r8.getString(r6, r5)
        L_0x0163:
            r10.setText(r5)
            X.C14530pL.A0X(r7, r3, r0)
            r0 = 0
        L_0x016a:
            r2.setVisibility(r0)
            return r4
        L_0x016e:
            r5 = 2131889147(0x7f120bfb, float:1.941295E38)
            java.lang.String r5 = r8.getString(r5)
            goto L_0x0163
        L_0x0176:
            r0 = 8
            goto L_0x016a
        L_0x0179:
            r12.setText(r9)
            if (r8 == 0) goto L_0x0180
            goto L_0x00fd
        L_0x0180:
            r10.setText(r9)
            if (r8 == 0) goto L_0x012a
            goto L_0x010c
        L_0x0186:
            boolean r0 = X.C30921dB.A00(r0)
            r2 = 2131889491(0x7f120d53, float:1.9413647E38)
            if (r0 == 0) goto L_0x0096
            r2 = 2131889495(0x7f120d57, float:1.9413655E38)
            goto L_0x0096
        L_0x0194:
            r5.setVisibility(r1)
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2oN.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 1;
    }
}
