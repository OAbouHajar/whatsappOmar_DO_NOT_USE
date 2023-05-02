package androidx.core.app;

import X.AnonymousClass02E;
import X.AnonymousClass02F;
import X.AnonymousClass04K;
import X.C007603n;
import X.C009204j;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;

public class NotificationCompat$MessagingStyle extends C007603n {
    public AnonymousClass04K A00;
    public Boolean A01;
    public CharSequence A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();

    public NotificationCompat$MessagingStyle() {
    }

    public NotificationCompat$MessagingStyle(AnonymousClass04K r3) {
        if (!TextUtils.isEmpty(r3.A01)) {
            this.A00 = r3;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }

    public String A05() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public void A06(Bundle bundle) {
        super.A06(bundle);
        AnonymousClass04K r2 = this.A00;
        bundle.putCharSequence("android.selfDisplayName", r2.A01);
        bundle.putBundle("android.messagingStyleUser", r2.A02());
        bundle.putCharSequence("android.hiddenConversationTitle", this.A02);
        CharSequence charSequence = this.A02;
        if (charSequence != null && this.A01.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", charSequence);
        }
        List list = this.A04;
        if (!list.isEmpty()) {
            bundle.putParcelableArray("android.messages", C009204j.A00(list));
        }
        List list2 = this.A03;
        if (!list2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C009204j.A00(list2));
        }
        Boolean bool = this.A01;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
        if (r3 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C11840jQ r9) {
        /*
            r8 = this;
            X.03l r0 = r8.A00
            r2 = 0
            if (r0 == 0) goto L_0x0057
            android.content.Context r0 = r0.A0B
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 28
            if (r1 >= r0) goto L_0x0057
            java.lang.Boolean r0 = r8.A01
            if (r0 != 0) goto L_0x0057
            java.lang.CharSequence r0 = r8.A02
            if (r0 == 0) goto L_0x001a
            r2 = 1
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r8.A01 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x00a6
            r3 = 28
            X.04K r0 = r8.A00
            if (r1 < r3) goto L_0x004f
            android.app.Person r0 = r0.A01()
            android.app.Notification$MessagingStyle r2 = new android.app.Notification$MessagingStyle
            r2.<init>(r0)
        L_0x0035:
            java.util.List r0 = r8.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x003b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r1.next()
            X.04j r0 = (X.C009204j) r0
            android.app.Notification$MessagingStyle$Message r0 = r0.A01()
            r2.addMessage(r0)
            goto L_0x003b
        L_0x004f:
            java.lang.CharSequence r0 = r0.A01
            android.app.Notification$MessagingStyle r2 = new android.app.Notification$MessagingStyle
            r2.<init>(r0)
            goto L_0x0035
        L_0x0057:
            java.lang.Boolean r0 = r8.A01
            if (r0 == 0) goto L_0x001a
            boolean r2 = r0.booleanValue()
            goto L_0x001a
        L_0x0060:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0080
            java.util.List r0 = r8.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x006c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = r1.next()
            X.04j r0 = (X.C009204j) r0
            android.app.Notification$MessagingStyle$Message r0 = r0.A01()
            r2.addHistoricMessage(r0)
            goto L_0x006c
        L_0x0080:
            java.lang.Boolean r0 = r8.A01
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x008c
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x0091
        L_0x008c:
            java.lang.CharSequence r0 = r8.A02
            r2.setConversationTitle(r0)
        L_0x0091:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x009e
            java.lang.Boolean r0 = r8.A01
            boolean r0 = r0.booleanValue()
            r2.setGroupConversation(r0)
        L_0x009e:
            X.0au r9 = (X.C07280au) r9
            android.app.Notification$Builder r0 = r9.A02
            r2.setBuilder(r0)
            return
        L_0x00a6:
            java.util.List r4 = r8.A04
            int r1 = r4.size()
        L_0x00ac:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0119
            java.lang.Object r3 = r4.get(r1)
            X.04j r3 = (X.C009204j) r3
            X.04K r0 = r3.A04
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ac
        L_0x00c0:
            java.lang.CharSequence r2 = r8.A02
            if (r2 == 0) goto L_0x0105
            java.lang.Boolean r0 = r8.A01
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0105
            r0 = r9
            X.0au r0 = (X.C07280au) r0
            android.app.Notification$Builder r1 = r0.A02
            r1.setContentTitle(r2)
            if (r3 == 0) goto L_0x00e1
        L_0x00d6:
            java.lang.CharSequence r0 = r8.A02
            if (r0 == 0) goto L_0x0102
            java.lang.CharSequence r0 = r8.A09(r3)
        L_0x00de:
            r1.setContentText(r0)
        L_0x00e1:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            java.lang.CharSequence r0 = r8.A02
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L_0x012e
            int r1 = r4.size()
            int r1 = r1 - r6
        L_0x00f1:
            if (r1 < 0) goto L_0x0130
            java.lang.Object r0 = r4.get(r1)
            X.04j r0 = (X.C009204j) r0
            X.04K r0 = r0.A04
            java.lang.CharSequence r0 = r0.A01
            if (r0 == 0) goto L_0x012e
            int r1 = r1 + -1
            goto L_0x00f1
        L_0x0102:
            java.lang.CharSequence r0 = r3.A05
            goto L_0x00de
        L_0x0105:
            if (r3 == 0) goto L_0x00e1
            r0 = r9
            X.0au r0 = (X.C07280au) r0
            android.app.Notification$Builder r1 = r0.A02
            java.lang.String r0 = ""
            r1.setContentTitle(r0)
            X.04K r0 = r3.A04
            java.lang.CharSequence r0 = r0.A01
            r1.setContentTitle(r0)
            goto L_0x00d6
        L_0x0119:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x012c
            int r0 = r4.size()
            int r0 = r0 + -1
            java.lang.Object r3 = r4.get(r0)
            X.04j r3 = (X.C009204j) r3
            goto L_0x00c0
        L_0x012c:
            r3 = 0
            goto L_0x00c0
        L_0x012e:
            r3 = 1
            goto L_0x0131
        L_0x0130:
            r3 = 0
        L_0x0131:
            int r2 = r4.size()
            int r2 = r2 - r6
        L_0x0136:
            if (r2 < 0) goto L_0x0159
            java.lang.Object r0 = r4.get(r2)
            X.04j r0 = (X.C009204j) r0
            if (r3 == 0) goto L_0x0156
            java.lang.CharSequence r1 = r8.A09(r0)
        L_0x0144:
            int r0 = r4.size()
            int r0 = r0 - r6
            if (r2 == r0) goto L_0x0150
            java.lang.String r0 = "\n"
            r5.insert(r7, r0)
        L_0x0150:
            r5.insert(r7, r1)
            int r2 = r2 + -1
            goto L_0x0136
        L_0x0156:
            java.lang.CharSequence r1 = r0.A05
            goto L_0x0144
        L_0x0159:
            X.0au r9 = (X.C07280au) r9
            android.app.Notification$Builder r0 = r9.A02
            android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle
            r1.<init>(r0)
            r0 = 0
            android.app.Notification$BigTextStyle r0 = r1.setBigContentTitle(r0)
            r0.bigText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$MessagingStyle.A08(X.0jQ):void");
    }

    public final CharSequence A09(C009204j r14) {
        int i2;
        AnonymousClass02E A022 = AnonymousClass02E.A02();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z2 = false;
        int i3 = -1;
        if (Build.VERSION.SDK_INT >= 21) {
            z2 = true;
            i3 = -16777216;
        }
        CharSequence charSequence = "";
        CharSequence charSequence2 = r14.A04.A01;
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = this.A00.A01;
            if (z2 && (i2 = this.A00.A00) != 0) {
                i3 = i2;
            }
        }
        AnonymousClass02F r2 = A022.A00;
        CharSequence A032 = A022.A03(r2, charSequence2);
        spannableStringBuilder.append(A032);
        spannableStringBuilder.setSpan(new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i3), (ColorStateList) null), spannableStringBuilder.length() - A032.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = r14.A05;
        if (charSequence3 != null) {
            charSequence = charSequence3;
        }
        spannableStringBuilder.append("  ").append(A022.A03(r2, charSequence));
        return spannableStringBuilder;
    }

    public void A0A(C009204j r4) {
        List list = this.A04;
        list.add(r4);
        if (list.size() > 25) {
            list.remove(0);
        }
    }
}
