package com.obwhatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass19Y;
import X.AnonymousClass1B5;
import X.AnonymousClass1B9;
import X.AnonymousClass1BJ;
import X.AnonymousClass1G1;
import X.AnonymousClass1VA;
import X.AnonymousClass267;
import X.AnonymousClass2Ao;
import X.AnonymousClass2DE;
import X.AnonymousClass2SX;
import X.AnonymousClass369;
import X.C005402i;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14710pd;
import X.C14870pt;
import X.C15830rv;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16260sj;
import X.C16320sq;
import X.C16980tz;
import X.C17150uc;
import X.C17160ud;
import X.C17200uh;
import X.C17270uo;
import X.C19610yi;
import X.C34331k5;
import X.C447725m;
import X.C49132Rg;
import X.C55902kd;
import X.C56612oD;
import X.C57362qz;
import X.C57782rn;
import X.C608936n;
import X.C94574l8;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape195S0100000_2_I1;
import com.facebook.redex.IDxEListenerShape270S0100000_2_I1;
import com.facebook.redex.IDxIDecorationShape5S0101000_2_I1;
import com.facebook.redex.IDxSListenerShape15S0101000_2_I1;
import com.facebook.redex.IDxTListenerShape171S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import com.facebook.redex.ViewOnClickCListenerShape17S0100000_I1_2;
import com.obwhatsapp.EmptyTellAFriendView;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.components.SelectionCheckView;
import java.util.ArrayList;
import java.util.List;

public class PhoneContactsSelector extends AnonymousClass1VA {
    public MenuItem A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ListView A05;
    public RecyclerView A06;
    public AnonymousClass1G1 A07;
    public AnonymousClass267 A08;
    public AnonymousClass1BJ A09;
    public C17150uc A0A;
    public AnonymousClass19Y A0B;
    public C17160ud A0C;
    public C16000sG A0D;
    public C16080sP A0E;
    public AnonymousClass2Ao A0F;
    public AnonymousClass2Ao A0G;
    public C17200uh A0H;
    public C56612oD A0I;
    public AnonymousClass369 A0J;
    public C608936n A0K;
    public AnonymousClass1B5 A0L;
    public C19610yi A0M;
    public C16980tz A0N;
    public C16260sj A0O;
    public AnonymousClass013 A0P;
    public C15830rv A0Q;
    public AnonymousClass01D A0R;
    public AnonymousClass01D A0S;
    public String A0T;
    public ArrayList A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public final C57362qz A0Y;
    public final ArrayList A0Z;
    public final ArrayList A0a;
    public final List A0b;

    public PhoneContactsSelector() {
        this(0);
        this.A0a = AnonymousClass000.A0u();
        this.A0Z = AnonymousClass000.A0u();
        this.A0b = AnonymousClass000.A0u();
        this.A0Y = new C57362qz(this);
    }

    public PhoneContactsSelector(int i2) {
        this.A0W = false;
        C13680ns.A1G(this, 51);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0433, code lost:
        if (r5 == null) goto L_0x043d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.AnonymousClass1G1 r33, X.C17150uc r34, X.C16000sG r35, X.C55902kd r36, X.C16980tz r37, X.AnonymousClass013 r38) {
        /*
            X.AnonymousClass00B.A00()
            X.1st r8 = new X.1st
            r2 = r35
            r1 = r37
            r32 = r38
            r0 = r32
            r8.<init>(r2, r1, r0)
            r2 = r36
            java.lang.String r1 = r2.A06
            X.1sv r0 = r8.A03
            X.4SC r6 = r0.A08
            r6.A01 = r1
            long r1 = r2.A04
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = r1.toString()
            r1 = 7
            java.lang.String[] r9 = new java.lang.String[r1]
            r12 = 0
            java.lang.String r1 = "data2"
            r9[r12] = r1
            r11 = 1
            java.lang.String r4 = "data3"
            r9[r11] = r4
            r7 = 2
            java.lang.String r18 = "data5"
            r9[r7] = r18
            r3 = 3
            java.lang.String r15 = "data4"
            r9[r3] = r15
            r3 = 4
            java.lang.String r5 = "data6"
            r9[r3] = r5
            r3 = 5
            java.lang.String r17 = "data7"
            r9[r3] = r17
            r3 = 6
            java.lang.String r16 = "data9"
            r9[r3] = r16
            X.0tz r3 = r8.A01
            android.content.Context r3 = r3.A00
            r31 = r3
            android.content.ContentResolver r19 = r31.getContentResolver()
            android.net.Uri r20 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String[] r7 = new java.lang.String[r7]
            r7[r12] = r2
            java.lang.String r3 = "vnd.android.cursor.item/name"
            r7[r11] = r3
            java.lang.String r22 = "contact_id = ? AND mimetype=?"
            r24 = 0
            r21 = r9
            r23 = r7
            android.database.Cursor r7 = r19.query(r20, r21, r22, r23, r24)
            if (r7 != 0) goto L_0x0099
        L_0x006d:
            r3 = 5
            java.lang.String[] r10 = new java.lang.String[r3]
            r10[r12] = r1
            r7 = 1
            java.lang.String r3 = "data1"
            r10[r11] = r3
            r5 = 2
            r10[r5] = r4
            r5 = 3
            java.lang.String r6 = "is_primary"
            r10[r5] = r6
            r5 = 4
            java.lang.String r9 = "raw_contact_id"
            r10[r5] = r9
            android.content.ContentResolver r19 = r31.getContentResolver()
            android.net.Uri r20 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String[] r5 = new java.lang.String[r11]
            r5[r12] = r2
            java.lang.String r22 = "contact_id =?"
            r21 = r10
            r23 = r5
            android.database.Cursor r5 = r19.query(r20, r21, r22, r23, r24)
            goto L_0x00d4
        L_0x0099:
            boolean r3 = r7.moveToNext()     // Catch:{ all -> 0x0439 }
            if (r3 == 0) goto L_0x00d0
            java.lang.String r3 = X.C13680ns.A0e(r7, r1)     // Catch:{ all -> 0x0439 }
            r6.A02 = r3     // Catch:{ all -> 0x0439 }
            java.lang.String r3 = X.C13680ns.A0e(r7, r4)     // Catch:{ all -> 0x0439 }
            r6.A00 = r3     // Catch:{ all -> 0x0439 }
            r3 = r18
            java.lang.String r3 = X.C13680ns.A0e(r7, r3)     // Catch:{ all -> 0x0439 }
            r6.A03 = r3     // Catch:{ all -> 0x0439 }
            java.lang.String r3 = X.C13680ns.A0e(r7, r15)     // Catch:{ all -> 0x0439 }
            r6.A06 = r3     // Catch:{ all -> 0x0439 }
            java.lang.String r3 = X.C13680ns.A0e(r7, r5)     // Catch:{ all -> 0x0439 }
            r6.A07 = r3     // Catch:{ all -> 0x0439 }
            r3 = r17
            java.lang.String r3 = X.C13680ns.A0e(r7, r3)     // Catch:{ all -> 0x0439 }
            r6.A04 = r3     // Catch:{ all -> 0x0439 }
            r3 = r16
            java.lang.String r3 = X.C13680ns.A0e(r7, r3)     // Catch:{ all -> 0x0439 }
            r6.A05 = r3     // Catch:{ all -> 0x0439 }
            goto L_0x0099
        L_0x00d0:
            r7.close()
            goto L_0x006d
        L_0x00d4:
            java.util.Map r12 = r8.A03(r2)     // Catch:{ all -> 0x0432 }
            if (r5 != 0) goto L_0x00db
            goto L_0x010d
        L_0x00db:
            boolean r10 = r5.moveToNext()     // Catch:{ all -> 0x0432 }
            if (r10 == 0) goto L_0x0107
            java.lang.String r10 = X.C13680ns.A0e(r5, r9)     // Catch:{ all -> 0x0432 }
            java.lang.Object r10 = r12.get(r10)     // Catch:{ all -> 0x0432 }
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10     // Catch:{ all -> 0x0432 }
            int r29 = X.C13690nt.A02(r5, r1)     // Catch:{ all -> 0x0432 }
            java.lang.String r27 = X.C13680ns.A0e(r5, r3)     // Catch:{ all -> 0x0432 }
            java.lang.String r28 = X.C13680ns.A0e(r5, r4)     // Catch:{ all -> 0x0432 }
            int r11 = X.C13690nt.A02(r5, r6)     // Catch:{ all -> 0x0432 }
            boolean r30 = X.AnonymousClass000.A1R(r11, r7)
            r25 = r0
            r26 = r10
            r25.A03(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0432 }
            goto L_0x00db
        L_0x0107:
            r8.A08(r0)     // Catch:{ all -> 0x0432 }
            r5.close()
        L_0x010d:
            android.content.ContentResolver r19 = r31.getContentResolver()
            android.net.Uri r20 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI
            java.lang.String[] r7 = new java.lang.String[r7]
            r5 = 0
            r7[r5] = r2
            java.lang.String r22 = "contact_id = ?"
            r21 = r24
            r23 = r7
            android.database.Cursor r13 = r19.query(r20, r21, r22, r23, r24)
            if (r13 != 0) goto L_0x0235
        L_0x0124:
            r5 = 2
            java.lang.String[] r9 = new java.lang.String[r5]
            r13 = 0
            r9[r13] = r1
            r7 = 1
            r9[r7] = r3
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r10 = "contact_id"
            r11[r13] = r10
            java.lang.String r10 = "mimetype"
            r11[r7] = r10
            java.lang.String r10 = "%s =? AND %s =?"
            java.lang.String r28 = java.lang.String.format(r10, r11)
            android.content.ContentResolver r25 = r31.getContentResolver()
            android.net.Uri r26 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r13] = r2
            java.lang.String r10 = "vnd.android.cursor.item/website"
            r5[r7] = r10
            r27 = r9
            r29 = r5
            r30 = r24
            android.database.Cursor r5 = r25.query(r26, r27, r28, r29, r30)
            if (r5 != 0) goto L_0x0208
        L_0x0158:
            android.content.ContentResolver r19 = r31.getContentResolver()
            android.net.Uri r20 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI
            java.lang.String[] r5 = new java.lang.String[r7]
            r5[r13] = r2
            r23 = r5
            android.database.Cursor r5 = r19.query(r20, r21, r22, r23, r24)
            if (r5 != 0) goto L_0x0187
        L_0x016a:
            r1 = 2
            java.lang.String[] r4 = new java.lang.String[r1]
            r4[r13] = r2
            java.lang.String r1 = "vnd.android.cursor.item/organization"
            r7 = 1
            r4[r7] = r1
            android.content.ContentResolver r19 = r31.getContentResolver()
            java.lang.String r22 = "contact_id = ? AND mimetype = ?"
            r20 = r26
            r23 = r4
            android.database.Cursor r5 = r19.query(r20, r21, r22, r23, r24)
            if (r5 == 0) goto L_0x02b6
            goto L_0x0274
        L_0x0187:
            boolean r7 = r5.moveToNext()     // Catch:{ all -> 0x042b }
            if (r7 == 0) goto L_0x0203
            java.util.List r7 = r0.A02     // Catch:{ all -> 0x042b }
            if (r7 != 0) goto L_0x0197
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x042b }
            r0.A02 = r7     // Catch:{ all -> 0x042b }
        L_0x0197:
            X.4Nw r9 = new X.4Nw     // Catch:{ all -> 0x042b }
            r9.<init>()     // Catch:{ all -> 0x042b }
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r7 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            r9.A01 = r7     // Catch:{ all -> 0x042b }
            int r7 = X.C13690nt.A02(r5, r1)     // Catch:{ all -> 0x042b }
            r9.A00 = r7     // Catch:{ all -> 0x042b }
            java.lang.String r7 = X.C13680ns.A0e(r5, r3)     // Catch:{ all -> 0x042b }
            r9.A02 = r7     // Catch:{ all -> 0x042b }
            X.4bQ r7 = new X.4bQ     // Catch:{ all -> 0x042b }
            r7.<init>()     // Catch:{ all -> 0x042b }
            r9.A04 = r7     // Catch:{ all -> 0x042b }
            java.lang.String r12 = X.C13680ns.A0e(r5, r15)     // Catch:{ all -> 0x042b }
            if (r12 == 0) goto L_0x01c5
            X.4bQ r11 = r9.A04     // Catch:{ all -> 0x042b }
            java.lang.String r10 = "(\r\n|\r|\n|\n\r)"
            java.lang.String r7 = " "
            java.lang.String r7 = r12.replaceAll(r10, r7)     // Catch:{ all -> 0x042b }
            r11.A03 = r7     // Catch:{ all -> 0x042b }
        L_0x01c5:
            X.4bQ r10 = r9.A04     // Catch:{ all -> 0x042b }
            r7 = r17
            java.lang.String r7 = X.C13680ns.A0e(r5, r7)     // Catch:{ all -> 0x042b }
            r10.A00 = r7     // Catch:{ all -> 0x042b }
            X.4bQ r10 = r9.A04     // Catch:{ all -> 0x042b }
            java.lang.String r7 = "data8"
            java.lang.String r7 = X.C13680ns.A0e(r5, r7)     // Catch:{ all -> 0x042b }
            r10.A02 = r7     // Catch:{ all -> 0x042b }
            X.4bQ r10 = r9.A04     // Catch:{ all -> 0x042b }
            r7 = r16
            java.lang.String r7 = X.C13680ns.A0e(r5, r7)     // Catch:{ all -> 0x042b }
            r10.A04 = r7     // Catch:{ all -> 0x042b }
            X.4bQ r10 = r9.A04     // Catch:{ all -> 0x042b }
            java.lang.String r7 = "data10"
            java.lang.String r7 = X.C13680ns.A0e(r5, r7)     // Catch:{ all -> 0x042b }
            r10.A01 = r7     // Catch:{ all -> 0x042b }
            java.lang.String r7 = X.C13680ns.A0e(r5, r4)     // Catch:{ all -> 0x042b }
            r9.A03 = r7     // Catch:{ all -> 0x042b }
            int r7 = X.C13690nt.A02(r5, r6)     // Catch:{ all -> 0x042b }
            boolean r7 = X.C13690nt.A1R(r7)
            r9.A05 = r7     // Catch:{ all -> 0x042b }
            java.util.List r7 = r0.A02     // Catch:{ all -> 0x042b }
            r7.add(r9)     // Catch:{ all -> 0x042b }
            goto L_0x0187
        L_0x0203:
            r5.close()
            goto L_0x016a
        L_0x0208:
            boolean r9 = r5.moveToNext()     // Catch:{ all -> 0x042b }
            if (r9 == 0) goto L_0x0230
            int r12 = X.C13690nt.A02(r5, r1)     // Catch:{ all -> 0x042b }
            java.lang.String r11 = X.C13680ns.A0e(r5, r3)     // Catch:{ all -> 0x042b }
            java.util.List r10 = r0.A06     // Catch:{ all -> 0x042b }
            if (r10 != 0) goto L_0x0220
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x042b }
            r0.A06 = r10     // Catch:{ all -> 0x042b }
        L_0x0220:
            X.4JL r9 = new X.4JL     // Catch:{ all -> 0x042b }
            r9.<init>()     // Catch:{ all -> 0x042b }
            r9.A00 = r12     // Catch:{ all -> 0x042b }
            X.AnonymousClass00B.A06(r11)     // Catch:{ all -> 0x042b }
            r9.A01 = r11     // Catch:{ all -> 0x042b }
            r10.add(r9)     // Catch:{ all -> 0x042b }
            goto L_0x0208
        L_0x0230:
            r5.close()
            goto L_0x0158
        L_0x0235:
            boolean r5 = r13.moveToNext()     // Catch:{ all -> 0x042d }
            if (r5 == 0) goto L_0x026f
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r14 = android.provider.ContactsContract.CommonDataKinds.Email.class
            int r12 = X.C13690nt.A02(r13, r1)     // Catch:{ all -> 0x042d }
            java.lang.String r11 = X.C13680ns.A0e(r13, r3)     // Catch:{ all -> 0x042d }
            java.lang.String r10 = X.C13680ns.A0e(r13, r4)     // Catch:{ all -> 0x042d }
            int r7 = X.C13690nt.A02(r13, r6)     // Catch:{ all -> 0x042d }
            r5 = 1
            boolean r9 = X.AnonymousClass000.A1R(r7, r5)
            java.util.List r7 = r0.A02     // Catch:{ all -> 0x042d }
            if (r7 != 0) goto L_0x025c
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x042d }
            r0.A02 = r7     // Catch:{ all -> 0x042d }
        L_0x025c:
            X.4Nw r5 = new X.4Nw     // Catch:{ all -> 0x042d }
            r5.<init>()     // Catch:{ all -> 0x042d }
            r5.A01 = r14     // Catch:{ all -> 0x042d }
            r5.A00 = r12     // Catch:{ all -> 0x042d }
            r5.A02 = r11     // Catch:{ all -> 0x042d }
            r5.A03 = r10     // Catch:{ all -> 0x042d }
            r5.A05 = r9     // Catch:{ all -> 0x042d }
            r7.add(r5)     // Catch:{ all -> 0x042d }
            goto L_0x0235
        L_0x026f:
            r13.close()
            goto L_0x0124
        L_0x0274:
            boolean r1 = r5.moveToFirst()     // Catch:{ all -> 0x042b }
            if (r1 == 0) goto L_0x02b3
            java.lang.String r4 = X.C13680ns.A0e(r5, r3)     // Catch:{ all -> 0x042b }
            r1 = r18
            java.lang.String r10 = X.C13680ns.A0e(r5, r1)     // Catch:{ all -> 0x042b }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0q(r4)     // Catch:{ all -> 0x042b }
            if (r10 == 0) goto L_0x02b0
            int r1 = r10.length()     // Catch:{ all -> 0x042b }
            if (r1 == 0) goto L_0x02b0
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x042b }
            java.lang.String r1 = ";"
            r4.append(r1)     // Catch:{ all -> 0x042b }
            java.lang.String r1 = X.AnonymousClass000.A0h(r10, r4)     // Catch:{ all -> 0x042b }
        L_0x029d:
            java.lang.String r9 = X.AnonymousClass000.A0h(r1, r9)     // Catch:{ all -> 0x042b }
            java.lang.String r4 = X.C13680ns.A0e(r5, r15)     // Catch:{ all -> 0x042b }
            int r1 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x042b }
            r5.getInt(r1)     // Catch:{ all -> 0x042b }
            r0.A04(r9, r4)     // Catch:{ all -> 0x042b }
            goto L_0x02b3
        L_0x02b0:
            java.lang.String r1 = ""
            goto L_0x029d
        L_0x02b3:
            r5.close()
        L_0x02b6:
            r1 = 2
            java.lang.String[] r4 = new java.lang.String[r1]
            r4[r13] = r2
            java.lang.String r1 = "vnd.android.cursor.item/photo"
            r4[r7] = r1
            android.content.ContentResolver r25 = r31.getContentResolver()
            java.lang.String[] r1 = new java.lang.String[r7]
            java.lang.String r5 = "data15"
            r1[r13] = r5
            java.lang.String r28 = "contact_id = ? AND mimetype = ? "
            r27 = r1
            r29 = r4
            android.database.Cursor r4 = r25.query(r26, r27, r28, r29, r30)
            if (r4 == 0) goto L_0x02e9
            boolean r1 = r4.moveToFirst()     // Catch:{ all -> 0x0426 }
            if (r1 == 0) goto L_0x02e6
            int r1 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0426 }
            byte[] r1 = r4.getBlob(r1)     // Catch:{ all -> 0x0426 }
            r0.A09 = r1     // Catch:{ all -> 0x0426 }
        L_0x02e6:
            r4.close()
        L_0x02e9:
            r1 = 2
            java.lang.String[] r5 = new java.lang.String[r1]
            r5[r13] = r2
            java.lang.String r1 = "vnd.android.cursor.item/nickname"
            r5[r7] = r1
            android.content.ContentResolver r19 = r31.getContentResolver()
            r23 = r5
            android.database.Cursor r5 = r19.query(r20, r21, r22, r23, r24)
            if (r5 == 0) goto L_0x031a
            boolean r1 = r5.moveToFirst()     // Catch:{ all -> 0x042b }
            if (r1 == 0) goto L_0x0317
            X.4We r4 = new X.4We     // Catch:{ all -> 0x042b }
            r4.<init>()     // Catch:{ all -> 0x042b }
            java.lang.String r1 = "NICKNAME"
            r4.A01 = r1     // Catch:{ all -> 0x042b }
            java.lang.String r1 = X.C13680ns.A0e(r5, r3)     // Catch:{ all -> 0x042b }
            r4.A02 = r1     // Catch:{ all -> 0x042b }
            r0.A05(r4)     // Catch:{ all -> 0x042b }
        L_0x0317:
            r5.close()
        L_0x031a:
            r6 = 3
            java.lang.String[] r5 = new java.lang.String[r6]
            r5[r13] = r2
            java.lang.String r1 = "vnd.android.cursor.item/contact_event"
            r5[r7] = r1
            java.lang.String r4 = java.lang.String.valueOf(r6)
            r1 = 2
            r5[r1] = r4
            android.content.ContentResolver r19 = r31.getContentResolver()
            java.lang.String r22 = "contact_id = ? AND mimetype = ? AND data2 =? "
            r23 = r5
            android.database.Cursor r5 = r19.query(r20, r21, r22, r23, r24)
            if (r5 == 0) goto L_0x0384
            boolean r1 = r5.moveToFirst()     // Catch:{ all -> 0x042b }
            if (r1 == 0) goto L_0x0381
            X.4We r9 = new X.4We     // Catch:{ all -> 0x042b }
            r9.<init>()     // Catch:{ all -> 0x042b }
            java.lang.String r1 = "BDAY"
            r9.A01 = r1     // Catch:{ all -> 0x042b }
            java.lang.String r7 = X.C13680ns.A0e(r5, r3)     // Catch:{ all -> 0x042b }
            if (r7 != 0) goto L_0x0350
            r7 = 0
            goto L_0x037c
        L_0x0350:
            X.4Ss r1 = X.C42681yF.A02     // Catch:{ ParseException -> 0x0369 }
            java.lang.Object r4 = r1.A01()     // Catch:{ ParseException -> 0x0369 }
            java.text.DateFormat r4 = (java.text.DateFormat) r4     // Catch:{ ParseException -> 0x0369 }
            X.4Ss r1 = X.C42681yF.A00     // Catch:{ ParseException -> 0x0369 }
            java.lang.Object r1 = r1.A01()     // Catch:{ ParseException -> 0x0369 }
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch:{ ParseException -> 0x0369 }
            java.util.Date r1 = r1.parse(r7)     // Catch:{ ParseException -> 0x0369 }
            java.lang.String r7 = r4.format(r1)     // Catch:{ ParseException -> 0x0369 }
            goto L_0x037c
        L_0x0369:
            r6 = move-exception
            java.lang.String r1 = "Date string '"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r1)     // Catch:{ all -> 0x042b }
            r4.append(r7)     // Catch:{ all -> 0x042b }
            java.lang.String r1 = "' not in format of <MMM dd, yyyy>"
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r4)     // Catch:{ all -> 0x042b }
            com.whatsapp.util.Log.e(r1, r6)     // Catch:{ all -> 0x042b }
        L_0x037c:
            r9.A02 = r7     // Catch:{ all -> 0x042b }
            r0.A05(r9)     // Catch:{ all -> 0x042b }
        L_0x0381:
            r5.close()
        L_0x0384:
            r1 = 2
            java.lang.String[] r4 = new java.lang.String[r1]
            r4[r13] = r2
            r2 = 1
            java.lang.String r1 = "vnd.android.cursor.item/im"
            r4[r2] = r1
            android.content.ContentResolver r25 = r31.getContentResolver()
            r27 = r24
            r29 = r4
            android.database.Cursor r4 = r25.query(r26, r27, r28, r29, r30)
            if (r4 != 0) goto L_0x03ac
        L_0x039d:
            r1 = r34
            r8.A05(r1)
            X.25O r2 = new X.25O
            r3 = r33
            r1 = r32
            r2.<init>(r3, r1)
            goto L_0x0415
        L_0x03ac:
            boolean r1 = r4.moveToNext()     // Catch:{ all -> 0x0426 }
            if (r1 == 0) goto L_0x0411
            r1 = r18
            int r10 = X.C13690nt.A02(r4, r1)     // Catch:{ all -> 0x0426 }
            X.4We r5 = new X.4We     // Catch:{ all -> 0x0426 }
            r5.<init>()     // Catch:{ all -> 0x0426 }
            java.lang.String r1 = X.C13680ns.A0e(r4, r3)     // Catch:{ all -> 0x0426 }
            r5.A02 = r1     // Catch:{ all -> 0x0426 }
            X.013 r9 = r8.A02     // Catch:{ all -> 0x0426 }
            int r2 = android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(r10)     // Catch:{ all -> 0x0426 }
            android.content.Context r1 = r9.A00     // Catch:{ all -> 0x0426 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ all -> 0x0426 }
            java.lang.String r7 = r1.getString(r2)     // Catch:{ all -> 0x0426 }
            java.util.HashMap r1 = X.C39701sv.A0B     // Catch:{ all -> 0x0426 }
            java.util.Iterator r6 = X.C13690nt.A0j(r1)     // Catch:{ all -> 0x0426 }
        L_0x03d9:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0426 }
            if (r1 == 0) goto L_0x03f6
            java.util.Map$Entry r2 = X.AnonymousClass000.A0z(r6)     // Catch:{ all -> 0x0426 }
            java.lang.Object r1 = r2.getValue()     // Catch:{ all -> 0x0426 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0426 }
            boolean r1 = r1.equalsIgnoreCase(r7)     // Catch:{ all -> 0x0426 }
            if (r1 == 0) goto L_0x03d9
            java.lang.String r1 = X.C13690nt.A0f(r2)     // Catch:{ all -> 0x0426 }
            r5.A01 = r1     // Catch:{ all -> 0x0426 }
            goto L_0x03d9
        L_0x03f6:
            int r2 = android.provider.ContactsContract.CommonDataKinds.Im.getTypeLabelResource(r10)     // Catch:{ all -> 0x0426 }
            android.content.Context r1 = r9.A00     // Catch:{ all -> 0x0426 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ all -> 0x0426 }
            java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x0426 }
            java.util.Set r2 = r5.A04     // Catch:{ all -> 0x0426 }
            java.lang.String r1 = r1.toUpperCase()     // Catch:{ all -> 0x0426 }
            r2.add(r1)     // Catch:{ all -> 0x0426 }
            r0.A05(r5)     // Catch:{ all -> 0x0426 }
            goto L_0x03ac
        L_0x0411:
            r4.close()
            goto L_0x039d
        L_0x0415:
            java.lang.String r0 = r2.A00(r0)     // Catch:{ 25G -> 0x041a }
            return r0
        L_0x041a:
            r0 = move-exception
            X.25H r1 = new X.25H
            r1.<init>(r0)
            java.lang.String r0 = "Could not create VCard"
            com.whatsapp.util.Log.e(r0, r1)
            return r24
        L_0x0426:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x043d }
            throw r0
        L_0x042b:
            r0 = move-exception
            goto L_0x0435
        L_0x042d:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x043d }
            throw r0
        L_0x0432:
            r0 = move-exception
            if (r5 == 0) goto L_0x043d
        L_0x0435:
            r5.close()     // Catch:{ all -> 0x043d }
            throw r0
        L_0x0439:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x043d }
        L_0x043d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.PhoneContactsSelector.A02(X.1G1, X.0uc, X.0sG, X.2kd, X.0tz, X.013):java.lang.String");
    }

    public static /* synthetic */ void A03(PhoneContactsSelector phoneContactsSelector) {
        AnonymousClass369 r1 = phoneContactsSelector.A0J;
        if (r1 != null) {
            r1.A06(true);
            phoneContactsSelector.A0J = null;
        }
        AnonymousClass369 r12 = new AnonymousClass369(phoneContactsSelector, phoneContactsSelector.A0P, phoneContactsSelector.A0U, phoneContactsSelector.A0a);
        phoneContactsSelector.A0J = r12;
        C13680ns.A1U(r12, phoneContactsSelector.A05);
    }

    public void A1q() {
        if (!this.A0W) {
            this.A0W = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = new AnonymousClass2SX();
            this.A0N = C16150sX.A0V(r1);
            this.A09 = (AnonymousClass1BJ) r1.AOm.get();
            this.A0H = C16150sX.A0R(r1);
            this.A0C = C16150sX.A0L(r1);
            this.A0D = C16150sX.A0M(r1);
            this.A0E = C16150sX.A0Q(r1);
            this.A0P = C16150sX.A0Z(r1);
            this.A07 = (AnonymousClass1G1) r1.AJl.get();
            this.A0B = (AnonymousClass19Y) r1.A4r.get();
            this.A0O = C16150sX.A0X(r1);
            this.A0A = C16150sX.A09(r1);
            this.A0L = (AnonymousClass1B5) r1.AEp.get();
            this.A0M = (C19610yi) r1.AEq.get();
            this.A0R = C17270uo.A00(r1.AGp);
            this.A0S = C17270uo.A00(r1.ALh);
        }
    }

    public final void A36() {
        View view;
        int i2;
        this.A02.setVisibility(4);
        if (this.A02.getVisibility() == 0 || !this.A0X) {
            view = this.A03;
            i2 = 8;
        } else {
            view = this.A03;
            i2 = 0;
        }
        view.setVisibility(i2);
        if (!this.A0X) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-getResources().getDimensionPixelSize(R.dimen.dimen06dc)));
            translateAnimation.setDuration(240);
            translateAnimation.setAnimationListener(new C94574l8(this, 0));
            this.A05.startAnimation(translateAnimation);
        }
    }

    public final void A37(int i2) {
        C005402i x2 = x();
        Object[] A1b = C13680ns.A1b();
        AnonymousClass000.A1M(A1b, i2, 0);
        x2.A0I(this.A0P.A0J(A1b, R.plurals.plurals00da, (long) i2));
    }

    public final void A38(C55902kd r11) {
        boolean z2;
        SelectionCheckView selectionCheckView = (SelectionCheckView) this.A05.findViewWithTag(r11);
        if (r11.A03) {
            r11.A03 = false;
            z2 = false;
        } else if (this.A0b.size() == 257) {
            C14870pt r5 = this.A05;
            AnonymousClass013 r4 = this.A0P;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, 257, 0);
            r5.A0H(r4.A0J(objArr, R.plurals.plurals0024, 257), 1);
            if (selectionCheckView != null) {
                selectionCheckView.A04(false, false);
                return;
            }
            return;
        } else {
            TextView A0M2 = C13680ns.A0M(findViewById(R.id.search_holder), R.id.search_src_text);
            if (A0M2 != null) {
                C13700nu.A0T(A0M2);
            }
            r11.A03 = true;
            z2 = true;
        }
        List list = this.A0b;
        if (!z2) {
            int indexOf = list.indexOf(r11);
            if (list.remove(r11)) {
                this.A0Y.A04(indexOf);
            }
        } else if (list.add(r11)) {
            this.A0Y.A03(C13700nu.A00(list, 1));
        }
        if (selectionCheckView != null) {
            selectionCheckView.A04(r11.A03, false);
        }
        if (list.isEmpty()) {
            A36();
        } else if (this.A02.getVisibility() != 0) {
            if (this.A03.getVisibility() != 0) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen06dc);
                this.A02.setVisibility(0);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) dimensionPixelSize);
                translateAnimation.setDuration(240);
                translateAnimation.setAnimationListener(new C94574l8(this, dimensionPixelSize));
                this.A05.startAnimation(translateAnimation);
            } else {
                this.A03.setVisibility(8);
                this.A02.setVisibility(0);
            }
        } else if (r11.A03) {
            this.A06.A0Z(C13700nu.A00(list, 1));
        }
        A37(list.size());
        if (r11.A02 == null) {
            this.A05.Acl(new RunnableRunnableShape13S0200000_I1_1(this, 49, r11));
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 8) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onBackPressed() {
        if (C14550pN.A1Q(this)) {
            this.A0R.get();
        }
        if (this.A0V) {
            this.A0V = false;
            AnonymousClass00B.A01();
            ArrayList arrayList = this.A0Z;
            arrayList.clear();
            arrayList.addAll(this.A0a);
            C56612oD r0 = this.A0I;
            if (r0 != null) {
                r0.notifyDataSetChanged();
            }
            this.A08.A05(true);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        ListView listView;
        int dimensionPixelSize;
        Resources resources;
        int i2;
        View view;
        int i3;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout03f2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Aem(toolbar);
        C005402i A0N2 = C13690nt.A0N(this);
        A0N2.A0N(true);
        A0N2.A0O(true);
        this.A0F = this.A0H.A04(this, "phone-contacts-selector");
        this.A08 = new AnonymousClass267(this, findViewById(R.id.search_holder), new IDxTListenerShape171S0100000_2_I1(this, 3), toolbar, this.A0P);
        setTitle(R.string.str05aa);
        this.A0Q = C14530pL.A0M(this);
        ListView ADA = ADA();
        this.A05 = ADA;
        ADA.setFastScrollAlwaysVisible(true);
        this.A05.setScrollBarStyle(33554432);
        List list = this.A0b;
        list.clear();
        this.A06 = (RecyclerView) findViewById(R.id.selected_items);
        this.A06.A0m(new IDxIDecorationShape5S0101000_2_I1(this, getResources().getDimensionPixelSize(R.dimen.dimen06e2), 0));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.A1P(0);
        this.A06.setLayoutManager(linearLayoutManager);
        this.A06.setAdapter(this.A0Y);
        this.A06.setItemAnimator(new C57782rn());
        this.A05.setOnScrollListener(new IDxSListenerShape15S0101000_2_I1(this));
        this.A05.setFastScrollEnabled(true);
        this.A05.setScrollbarFadingEnabled(true);
        boolean A0T2 = this.A0P.A0T();
        ListView listView2 = this.A05;
        if (A0T2) {
            listView2.setVerticalScrollbarPosition(1);
            listView = this.A05;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen01fd);
            resources = getResources();
            i2 = R.dimen.dimen01fc;
        } else {
            listView2.setVerticalScrollbarPosition(2);
            listView = this.A05;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen01fc);
            resources = getResources();
            i2 = R.dimen.dimen01fd;
        }
        listView.setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i2), 0);
        this.A05.setOnItemClickListener(new IDxCListenerShape195S0100000_2_I1(this, 0));
        A37(list.size());
        this.A02 = findViewById(R.id.selected_list);
        if (list.isEmpty()) {
            this.A02.setVisibility(4);
        }
        this.A03 = findViewById(R.id.warning);
        TextView A0N3 = C13680ns.A0N(this, R.id.warning_text);
        C13700nu.A0T(A0N3);
        this.A0X = !TextUtils.isEmpty(A0N3.getText());
        if (this.A02.getVisibility() == 0 || !this.A0X) {
            view = this.A03;
            i3 = 8;
        } else {
            view = this.A03;
            i3 = 0;
        }
        view.setVisibility(i3);
        C56612oD r0 = new C56612oD(this, this, this.A0Z);
        this.A0I = r0;
        A35(r0);
        ImageView imageView = (ImageView) AnonymousClass00T.A05(this, R.id.next_btn);
        this.A04 = imageView;
        C447725m.A01(this, imageView, this.A0P, R.drawable.ic_fab_next);
        C13680ns.A0t(this, this.A04, R.string.str0de0);
        this.A04.setVisibility(0);
        C34331k5.A01(this.A04, this, 46);
        ((EmptyTellAFriendView) findViewById(R.id.contacts_empty)).setInviteButtonClickListener(new ViewOnClickCListenerShape17S0100000_I1_2(this, 14));
        C34331k5.A01(findViewById(R.id.button_open_permission_settings), this, 47);
        registerForContextMenu(this.A05);
        if (bundle == null && !this.A0B.A00()) {
            RequestPermissionActivity.A0D(this, R.string.str11ba, R.string.str11b9);
        }
        if (this.A0B.A00()) {
            C13680ns.A1I(this, R.id.init_contacts_progress, 0);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.str1d7c).setIcon(R.drawable.ic_action_search);
        this.A00 = icon;
        icon.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new IDxEListenerShape270S0100000_2_I1(this, 0));
        this.A00.setVisible(!this.A0a.isEmpty());
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass369 r0 = this.A0J;
        if (r0 != null) {
            r0.A06(true);
            this.A0J = null;
        }
        C608936n r02 = this.A0K;
        if (r02 != null) {
            r02.A06(true);
            this.A0K = null;
        }
        this.A0a.clear();
        this.A0Z.clear();
        this.A0F.A00();
        if (C14550pN.A1Q(this)) {
            AnonymousClass2DE.A02(this.A01, this.A0M);
            AnonymousClass2Ao r03 = this.A0G;
            if (r03 != null) {
                r03.A00();
                this.A0G = null;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        if (C14550pN.A1Q(this)) {
            AnonymousClass2DE.A07(this.A0M);
            C14530pL.A0i(this, this.A0R);
        }
    }

    public void onResume() {
        super.onResume();
        C608936n r0 = this.A0K;
        if (r0 != null) {
            r0.A06(true);
        }
        AnonymousClass369 r02 = this.A0J;
        if (r02 != null) {
            r02.A06(true);
            this.A0J = null;
        }
        C608936n r1 = new C608936n(this, this.A08, this.A0N, this.A0O);
        this.A0K = r1;
        C13680ns.A1U(r1, this.A05);
        if (this.A0B.A00()) {
            this.A04.setVisibility(0);
        }
        if (C14550pN.A1Q(this)) {
            boolean z2 = ((AnonymousClass1B9) this.A0R.get()).A03;
            View view = this.A00;
            if (z2) {
                C14710pd r15 = this.A0C;
                C14870pt r13 = this.A05;
                C16040sK r12 = this.A01;
                C16320sq r11 = this.A05;
                C17200uh r10 = this.A0H;
                C16000sG r9 = this.A0D;
                C16080sP r8 = this.A0E;
                AnonymousClass013 r7 = this.A0P;
                AnonymousClass1B5 r6 = this.A0L;
                C19610yi r5 = this.A0M;
                AnonymousClass01D r4 = this.A0R;
                AnonymousClass01D r3 = this.A0S;
                View view2 = this.A01;
                AnonymousClass2Ao r14 = this.A0G;
                C19610yi r24 = r5;
                AnonymousClass1B5 r23 = r6;
                C17200uh r22 = r10;
                AnonymousClass2Ao r21 = r14;
                C16080sP r20 = r8;
                C16000sG r19 = r9;
                C16040sK r18 = r12;
                C14870pt r17 = r13;
                View view3 = view2;
                View view4 = view;
                Pair A002 = AnonymousClass2DE.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, this.A09, r7, r15, r11, r4, r3, "phone-contacts-selector-activity");
                this.A01 = (View) A002.first;
                this.A0G = (AnonymousClass2Ao) A002.second;
            } else if (AnonymousClass1B9.A00(view)) {
                AnonymousClass2DE.A04(this.A00, this.A0M, this.A0R);
            }
            ((AnonymousClass1B9) this.A0R.get()).A01();
        }
    }

    public boolean onSearchRequested() {
        this.A08.A02();
        this.A0V = true;
        return false;
    }
}
