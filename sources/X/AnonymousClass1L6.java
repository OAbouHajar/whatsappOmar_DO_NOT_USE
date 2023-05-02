package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1L6  reason: invalid class name */
public class AnonymousClass1L6 {
    public final C14870pt A00;
    public final C16040sK A01;
    public final C18930xU A02;
    public final AnonymousClass19Y A03;
    public final C16000sG A04;
    public final C17140ub A05;
    public final C16080sP A06;
    public final C23181Au A07;
    public final C19230xz A08;
    public final AnonymousClass01V A09;
    public final C16440t3 A0A;
    public final C19820z3 A0B;
    public final C14710pd A0C;
    public final C16320sq A0D;

    public AnonymousClass1L6(C14870pt r1, C16040sK r2, C18930xU r3, AnonymousClass19Y r4, C16000sG r5, C17140ub r6, C16080sP r7, C23181Au r8, C19230xz r9, AnonymousClass01V r10, C16440t3 r11, C19820z3 r12, C14710pd r13, C16320sq r14) {
        this.A0A = r11;
        this.A0C = r13;
        this.A00 = r1;
        this.A01 = r2;
        this.A0D = r14;
        this.A02 = r3;
        this.A04 = r5;
        this.A09 = r10;
        this.A06 = r7;
        this.A05 = r6;
        this.A07 = r8;
        this.A08 = r9;
        this.A03 = r4;
        this.A0B = r12;
    }

    public static Intent A00(Activity activity, Bitmap bitmap, C39701sv r17, boolean z2) {
        Intent intent;
        String str;
        String str2;
        StringBuilder sb;
        String str3;
        ContentValues contentValues;
        CharSequence typeLabel;
        if (z2) {
            intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        } else {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        }
        intent.putExtra("finishActivityOnSaveCompleted", true);
        C39701sv r12 = r17;
        intent.putExtra(FacebookFacade.RequestParameter.NAME, r12.A08.A01);
        Resources resources = activity.getResources();
        ArrayList arrayList = new ArrayList();
        List<C39711sw> list = r12.A05;
        if (list != null) {
            for (C39711sw r4 : list) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("mimetype", "vnd.android.cursor.item/phone_v2");
                contentValues2.put("data1", r4.A02);
                contentValues2.put("data2", Integer.valueOf(r4.A00));
                contentValues2.put("data3", ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, r4.A00, r4.A03).toString());
                arrayList.add(contentValues2);
            }
        }
        List<C85294Nw> list2 = r12.A02;
        if (list2 != null) {
            for (C85294Nw r3 : list2) {
                Class<ContactsContract.CommonDataKinds.Im> cls = r3.A01;
                if (cls == ContactsContract.CommonDataKinds.Email.class) {
                    contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/email_v2");
                    contentValues.put("data1", r3.A02);
                    contentValues.put("data2", Integer.valueOf(r3.A00));
                    typeLabel = ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, r3.A00, r3.A03);
                } else if (cls == ContactsContract.CommonDataKinds.StructuredPostal.class) {
                    contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
                    contentValues.put("data4", C88994bQ.A00(r3.A04.A03));
                    contentValues.put("data7", r3.A04.A00);
                    contentValues.put("data8", r3.A04.A02);
                    contentValues.put("data9", r3.A04.A04);
                    contentValues.put("data10", r3.A04.A01);
                    contentValues.put("data2", Integer.valueOf(r3.A00));
                    typeLabel = ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(resources, r3.A00, r3.A03);
                } else {
                    if (cls == ContactsContract.CommonDataKinds.Im.class) {
                        str3 = "sharecontactutil ";
                    } else {
                        sb = new StringBuilder();
                        str3 = "sharecontactutil/type/unknown ";
                    }
                    sb.append(str3);
                    sb.append(r3.toString());
                    Log.e(sb.toString());
                }
                contentValues.put("data3", typeLabel.toString());
                arrayList.add(contentValues);
            }
        }
        List list3 = r12.A04;
        if (list3 != null && list3.size() > 0) {
            AnonymousClass4JJ r13 = (AnonymousClass4JJ) r12.A04.get(0);
            String str4 = r13.A00;
            int lastIndexOf = str4.lastIndexOf(" ");
            if (lastIndexOf > 0) {
                str4 = str4.substring(0, lastIndexOf);
            }
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("mimetype", "vnd.android.cursor.item/organization");
            contentValues3.put("data1", str4);
            if (lastIndexOf > 0) {
                contentValues3.put("data5", r13.A00.substring(lastIndexOf + 1));
            }
            contentValues3.put("data4", r13.A01);
            arrayList.add(contentValues3);
        }
        List list4 = r12.A06;
        if (list4 != null && list4.size() > 0) {
            for (AnonymousClass4JL r2 : r12.A06) {
                ContentValues contentValues4 = new ContentValues();
                contentValues4.put("mimetype", "vnd.android.cursor.item/website");
                contentValues4.put("data2", Integer.valueOf(r2.A00));
                contentValues4.put("data1", r2.A01);
                arrayList.add(contentValues4);
            }
        }
        Map map = r12.A07;
        if (map != null) {
            for (String str5 : map.keySet()) {
                if (str5.equals("NICKNAME")) {
                    ContentValues contentValues5 = new ContentValues();
                    contentValues5.put("mimetype", "vnd.android.cursor.item/nickname");
                    contentValues5.put("data1", ((C87294We) ((List) r12.A07.get(str5)).get(0)).A02);
                    arrayList.add(contentValues5);
                }
                if (str5.equals("BDAY")) {
                    ContentValues contentValues6 = new ContentValues();
                    contentValues6.put("mimetype", "vnd.android.cursor.item/contact_event");
                    contentValues6.put("data2", 3);
                    contentValues6.put("data1", ((C87294We) ((List) r12.A07.get(str5)).get(0)).A02);
                    arrayList.add(contentValues6);
                }
                HashMap hashMap = C39701sv.A0C;
                if (hashMap.containsKey(str5)) {
                    ContentValues contentValues7 = new ContentValues();
                    contentValues7.put("mimetype", "vnd.android.cursor.item/im");
                    contentValues7.put("data5", (Integer) hashMap.get(str5));
                    contentValues7.put("data1", ((C87294We) ((List) r12.A07.get(str5)).get(0)).A02);
                    Set set = ((C87294We) ((List) r12.A07.get(str5)).get(0)).A04;
                    if (set.size() > 0) {
                        contentValues7.put("data2", (String) set.toArray()[0]);
                    }
                    arrayList.add(contentValues7);
                }
            }
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues8 = new ContentValues();
            contentValues8.put("mimetype", "vnd.android.cursor.item/photo");
            contentValues8.put("data15", byteArray);
            arrayList.add(contentValues8);
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
        }
        if (!arrayList.isEmpty()) {
            ContentValues contentValues9 = (ContentValues) arrayList.get(0);
            String asString = contentValues9.getAsString("mimetype");
            boolean z3 = true;
            char c2 = 65535;
            switch (asString.hashCode()) {
                case -1569536764:
                    if (asString.equals("vnd.android.cursor.item/email_v2")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1328682538:
                    if (asString.equals("vnd.android.cursor.item/contact_event")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -601229436:
                    if (asString.equals("vnd.android.cursor.item/postal-address_v2")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 684173810:
                    if (asString.equals("vnd.android.cursor.item/phone_v2")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 689862072:
                    if (asString.equals("vnd.android.cursor.item/organization")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 905843021:
                    if (asString.equals("vnd.android.cursor.item/photo")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 950831081:
                    if (asString.equals("vnd.android.cursor.item/im")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 2034973555:
                    if (asString.equals("vnd.android.cursor.item/nickname")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    intent.putExtra("email", contentValues9.getAsString("data1"));
                    str = contentValues9.getAsString("data3");
                    str2 = "email_type";
                    break;
                case 1:
                case 5:
                case 7:
                    z3 = false;
                    break;
                case 2:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(contentValues9.getAsString("data4"));
                    sb2.append(", ");
                    sb2.append(contentValues9.getAsString("data7"));
                    sb2.append(", ");
                    sb2.append(contentValues9.getAsString("data8"));
                    sb2.append(" ");
                    sb2.append(contentValues9.getAsString("data9"));
                    sb2.append(", ");
                    sb2.append(contentValues9.getAsString("data10"));
                    intent.putExtra("postal", sb2.toString());
                    str = contentValues9.getAsString("data3");
                    str2 = "postal_type";
                    break;
                case 3:
                    intent.putExtra("phone", contentValues9.getAsString("data1"));
                    str = contentValues9.getAsString("data3");
                    str2 = "phone_type";
                    break;
                case 4:
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(contentValues9.getAsString("data1"));
                    String asString2 = contentValues9.getAsString("data5");
                    if (asString2 != null) {
                        sb3.append(", ");
                        sb3.append(asString2);
                    }
                    intent.putExtra("company", sb3.toString());
                    str = contentValues9.getAsString("data4");
                    str2 = "job_title";
                    break;
                case 6:
                    intent.putExtra("im_protocol", contentValues9.getAsString("data5"));
                    str = contentValues9.getAsString("data1");
                    str2 = "im_handle";
                    break;
            }
            intent.putExtra(str2, str);
            if (z3) {
                arrayList.remove(0);
            }
        }
        intent.putParcelableArrayListExtra("data", arrayList);
        return intent;
    }

    public void A01(Context context, UserJid userJid, String str) {
        C16000sG r4 = this.A04;
        C16010sH A0A2 = r4.A0A(userJid);
        C16320sq r2 = this.A0D;
        r2.Acl(new RunnableRunnableShape4S0200000_I0_2(this, 38, userJid));
        if (A0A2.A0d || TextUtils.isEmpty(str)) {
            if (!A0A2.A0G() && !A0A2.A0h && !A0A2.A0d) {
                r2.Acl(new RunnableRunnableShape4S0200000_I0_2(this, 39, userJid));
            }
            Intent A0v = new C14750ph().A0v(context, r4.A0A(userJid));
            AnonymousClass22U.A00(A0v, "ShareContactUtil");
            context.startActivity(A0v);
            return;
        }
        context.startActivity(new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.conversation.conversationrow.ContactSyncActivity").putExtra("user_jid", C16030sJ.A03(userJid)).addFlags(335544320));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        if (r1 != null) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r23, java.lang.String r24, java.util.ArrayList r25, java.util.List r26) {
        /*
            r22 = this;
            r3 = r22
            X.0pd r2 = r3.A0C
            r1 = 449(0x1c1, float:6.29E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x003e
            r8 = r25
            int r1 = r8.size()
            r7 = r26
            int r0 = r7.size()
            if (r1 == r0) goto L_0x003f
            java.lang.String r0 = "sharecontactutil/phones_jids_list_size_mismatch: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r8.size()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            int r0 = r7.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x003b:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x003e:
            return
        L_0x003f:
            X.0sK r0 = r3.A01
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "sharecontactutil/on-activity-result/companion should not be adding contacts"
            goto L_0x003b
        L_0x004b:
            X.19Y r0 = r3.A03
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "sharecontactutil/on-activity-result/access to contacts denied"
            goto L_0x003b
        L_0x0057:
            r15 = 0
            r6 = 0
            r14 = 0
        L_0x005a:
            int r0 = r8.size()
            if (r6 >= r0) goto L_0x0132
            java.lang.Object r11 = r8.get(r6)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r7.get(r6)
            X.0rv r10 = (X.C15830rv) r10
            r2 = 1
            if (r10 == 0) goto L_0x011e
            X.0sG r0 = r3.A04
            X.18c r0 = r0.A06
            java.util.ArrayList r5 = r0.A0B(r10)
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x011e
            java.util.Iterator r13 = r5.iterator()
            r9 = 0
        L_0x0082:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r4 = r13.next()
            X.0sH r4 = (X.C16010sH) r4
            X.0rv r0 = r4.A0E
            if (r0 == 0) goto L_0x0082
            X.1ko r0 = r4.A0D
            if (r0 != 0) goto L_0x0082
            X.0rv r0 = r4.A0E
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = r10.user
            boolean r0 = android.telephony.PhoneNumberUtils.compare(r11, r0)
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = "sharecontactutil/unknown_contact_update:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01V r0 = r3.A09
            android.content.ContentResolver r16 = r0.A0C()
            android.net.Uri r17 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r2 = "raw_contact_id"
            r1[r15] = r2
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r15] = r11
            java.lang.String r12 = "com.obwhatsapp"
            r9 = 1
            r0[r9] = r12
            r21 = 0
            java.lang.String r19 = "data1 =? AND account_type =?"
            r20 = r0
            r18 = r1
            android.database.Cursor r1 = r16.query(r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x00ed
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x00ed
            int r0 = r1.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0150 }
            goto L_0x00f1
        L_0x00ed:
            r0 = r24
            if (r1 == 0) goto L_0x00f4
        L_0x00f1:
            r1.close()
        L_0x00f4:
            long r1 = java.lang.Long.parseLong(r0)
            X.1ko r0 = new X.1ko
            r0.<init>(r11, r1)
            r4.A0D = r0
            r0 = r23
            r4.A0L = r0
            r4.A0i = r9
            r2 = 1
            goto L_0x0082
        L_0x0108:
            java.lang.String r0 = "sharecontactutil/false_match: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r0 = r4.A0E
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0082
        L_0x011e:
            r14 = 1
            goto L_0x012e
        L_0x0120:
            if (r9 == 0) goto L_0x012e
            X.0sq r2 = r3.A0D
            r1 = 40
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r3, r1, r5)
            r2.Acl(r0)
        L_0x012e:
            int r6 = r6 + 1
            goto L_0x005a
        L_0x0132:
            if (r14 == 0) goto L_0x003e
            java.lang.String r0 = "sharecontactutil/new_number/need_delta_sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1kz r0 = X.C34861kz.A09
            X.27v r1 = new X.27v
            r1.<init>(r0)
            X.27w r0 = X.C453027w.A09
            r1.A00 = r0
            X.27t r2 = r1.A01()
            X.0xz r1 = r3.A08
            r0 = 1
            r1.A03(r2, r0)
            return
        L_0x0150:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0154 }
        L_0x0154:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1L6.A02(java.lang.String, java.lang.String, java.util.ArrayList, java.util.List):void");
    }
}
