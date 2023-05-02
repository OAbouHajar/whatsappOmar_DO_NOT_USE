package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.redex.IDxLObserverShape423S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.conversation.CapturePictureOrVideoDialogFragment;
import com.obwhatsapp.mentions.MentionableEntry;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2jf  reason: invalid class name and case insensitive filesystem */
public final class C55472jf extends C19530ya implements AnonymousClass2Su {
    public int A00;
    public AnonymousClass289 A01;
    public final C000900k A02;
    public final C14600pS A03;
    public final C16180sb A04;
    public final C14870pt A05;
    public final C16040sK A06;
    public final AnonymousClass10X A07;
    public final C15900s5 A08;
    public final C16760tb A09;
    public final C25751Kz A0A;
    public final C17150uc A0B;
    public final AnonymousClass1KX A0C;
    public final AnonymousClass1KE A0D;
    public final AnonymousClass1ME A0E;
    public final C25821Lg A0F;
    public final AnonymousClass01Y A0G;
    public final AnonymousClass19Y A0H;
    public final AnonymousClass1yW A0I;
    public final AnonymousClass46U A0J;
    public final C19610yi A0K;
    public final C32301g2 A0L;
    public final AnonymousClass12W A0M;
    public final AnonymousClass01V A0N;
    public final C16260sj A0O;
    public final C15860rz A0P;
    public final C14730pf A0Q;
    public final C14710pd A0R;
    public final C16490t9 A0S;
    public final C15830rv A0T;
    public final AnonymousClass1P7 A0U;
    public final MentionableEntry A0V;
    public final AnonymousClass1VN A0W;
    public final AnonymousClass1DX A0X;
    public final C17020u3 A0Y;
    public final AnonymousClass2GX A0Z;
    public final C19490yW A0a;
    public final AnonymousClass5S7 A0b = new C1034951p(this);
    public final C23061Ai A0c;
    public final AnonymousClass1A9 A0d;
    public final boolean A0e;

    public C55472jf(C000900k r15, C14600pS r16, C16180sb r17, C14870pt r18, C16040sK r19, AnonymousClass10X r20, C15900s5 r21, C16760tb r22, C25751Kz r23, C17150uc r24, AnonymousClass1KX r25, AnonymousClass1KE r26, AnonymousClass1ME r27, C25821Lg r28, AnonymousClass01Y r29, AnonymousClass19Y r30, AnonymousClass1yW r31, AnonymousClass46U r32, C19610yi r33, C32301g2 r34, AnonymousClass12W r35, AnonymousClass01V r36, C16260sj r37, C15860rz r38, C14730pf r39, C14710pd r40, C16490t9 r41, C15830rv r42, AnonymousClass1P7 r43, MentionableEntry mentionableEntry, AnonymousClass3Q5 r45, AnonymousClass1M5 r46, AnonymousClass1DX r47, C17020u3 r48, C19490yW r49, C23061Ai r50, AnonymousClass1A9 r51, boolean z2) {
        IDxLObserverShape423S0100000_2_I0 iDxLObserverShape423S0100000_2_I0 = new IDxLObserverShape423S0100000_2_I0(this, 1);
        this.A0Z = iDxLObserverShape423S0100000_2_I0;
        this.A02 = r15;
        C14600pS r4 = r16;
        this.A03 = r4;
        this.A0R = r40;
        this.A05 = r18;
        this.A0c = r50;
        this.A06 = r19;
        this.A07 = r20;
        this.A04 = r17;
        this.A0S = r41;
        this.A08 = r21;
        this.A0D = r26;
        this.A09 = r22;
        this.A0C = r25;
        this.A0Q = r39;
        this.A0U = r43;
        this.A0F = r28;
        this.A0d = r51;
        this.A0N = r36;
        this.A0G = r29;
        this.A0X = r47;
        this.A0M = r35;
        this.A0H = r30;
        this.A0O = r37;
        this.A0P = r38;
        this.A0A = r23;
        this.A0B = r24;
        C19490yW r2 = r49;
        this.A0a = r2;
        this.A0Y = r48;
        this.A0K = r33;
        this.A0I = r31;
        this.A0L = r34;
        this.A0T = r42;
        this.A0e = z2;
        this.A0V = mentionableEntry;
        this.A0J = r32;
        r2.A02(iDxLObserverShape423S0100000_2_I0);
        this.A0E = r27;
        RunnableRunnableShape7S0100000_I0_6 runnableRunnableShape7S0100000_I0_6 = new RunnableRunnableShape7S0100000_I0_6(this, 14);
        AnonymousClass1M5 r0 = r46;
        C14870pt r5 = r0.A00;
        C16040sK r6 = r0.A01;
        C18290wS r9 = r0.A04;
        this.A0W = new AnonymousClass1VN(r15, r4, r5, r6, r0.A02, r0.A03, r9, r45, runnableRunnableShape7S0100000_I0_6, (Runnable) null, true);
    }

    public void A00() {
        C000900k r3 = this.A02;
        if (RequestPermissionActivity.A0T(r3, this.A0O, 31) && this.A0M.A04(this.A0L)) {
            AnonymousClass1A9.A0P(r3, this.A04, this.A05, (C15830rv) null, this.A0Y, 23, this.A0R.A03(C16620tM.A02, 2614));
        }
    }

    public void A01() {
        C000900k r3 = this.A02;
        if (RequestPermissionActivity.A0T(r3, this.A0O, 32) && this.A0M.A04(this.A0L)) {
            AnonymousClass1A9.A0P(r3, this.A04, this.A05, (C15830rv) null, this.A0Y, 4, this.A0R.A03(C16620tM.A02, 2614));
        }
    }

    public final void A02() {
        if (A0E(807) && this.A0M.A04(this.A0L)) {
            C14710pd r4 = this.A0R;
            C16620tM r3 = C16620tM.A02;
            if (r4.A0E(r3, 931)) {
                AnonymousClass2DE.A08(this.A0K, this.A0P, this.A0T);
            }
            C14870pt r7 = this.A05;
            AnonymousClass1A9.A0P(this.A02, this.A04, r7, this.A0T, this.A0Y, 5, r4.A03(r3, 2614));
        }
    }

    public final void A03() {
        C16740tZ AFJ = this.A0I.AFJ();
        Bundle bundle = null;
        if (!this.A06.A0G()) {
            C000900k r5 = this.A02;
            C15830rv r6 = this.A0T;
            if (AFJ != null) {
                bundle = C38621r6.A08(AFJ.A11);
            }
            C16050sL A0A2 = C38621r6.A0A(AFJ);
            boolean z2 = this.A0e;
            Intent intent = new Intent();
            intent.setClassName(r5.getPackageName(), "com.obwhatsapp.contact.picker.PhoneContactsSelector");
            intent.putExtra("jid", C16030sJ.A03(r6));
            intent.putExtra("quoted_message", bundle);
            intent.putExtra("quoted_group_jid", C16030sJ.A03(A0A2));
            intent.putExtra("has_number_from_url", z2);
            r5.startActivityForResult(intent, 9);
            return;
        }
        C000900k r62 = this.A02;
        C15830rv r52 = this.A0T;
        if (AFJ != null) {
            bundle = C38621r6.A08(AFJ.A11);
        }
        C16050sL A0A3 = C38621r6.A0A(AFJ);
        boolean z3 = this.A0e;
        Intent intent2 = new Intent();
        intent2.setClassName(r62.getPackageName(), "com.obwhatsapp.contact.picker.ContactsAttachmentSelector");
        intent2.putExtra("jid", C16030sJ.A03(r52));
        intent2.putExtra("quoted_message", bundle);
        intent2.putExtra("quoted_group_jid", C16030sJ.A03(A0A3));
        intent2.putExtra("has_number_from_url", z3);
        r62.startActivityForResult(intent2, 9);
    }

    public final void A04() {
        if (A0E(808) && this.A0M.A04(this.A0L)) {
            C000900k r5 = this.A02;
            C15830rv r4 = this.A0T;
            String stringText = this.A0V.getStringText();
            Intent intent = new Intent();
            intent.setClassName(r5.getPackageName(), "com.obwhatsapp.documentpicker.DocumentPickerActivity");
            intent.putExtra("jid", r4.getRawString());
            intent.putExtra(FacebookFacade.RequestParameter.CAPTION, stringText);
            intent.putExtra("clear_message_after_send", !TextUtils.isEmpty(stringText));
            r5.startActivityForResult(intent, 6);
        }
    }

    public final void A05() {
        Intent intent;
        String packageName;
        String str;
        C000900k r5 = this.A02;
        View currentFocus = r5.getCurrentFocus();
        if (currentFocus != null) {
            this.A0c.A01(currentFocus);
        }
        C16740tZ AFJ = this.A0I.AFJ();
        boolean A052 = this.A0U.A05(r5);
        long j2 = 0;
        Context applicationContext = r5.getApplicationContext();
        String A032 = C16030sJ.A03(this.A0T);
        if (A052) {
            if (AFJ != null) {
                j2 = AFJ.A13;
            }
            String A033 = C16030sJ.A03(C38621r6.A0A(AFJ));
            boolean z2 = this.A0e;
            intent = new Intent();
            intent.putExtra("jid", A032);
            intent.putExtra("quoted_message_row_id", j2);
            intent.putExtra("quoted_group_jid", A033);
            intent.putExtra("has_number_from_url", z2);
            packageName = applicationContext.getPackageName();
            str = "com.obwhatsapp.location.LocationPicker2";
        } else {
            if (AFJ != null) {
                j2 = AFJ.A13;
            }
            String A034 = C16030sJ.A03(C38621r6.A0A(AFJ));
            boolean z3 = this.A0e;
            intent = new Intent();
            intent.putExtra("jid", A032);
            intent.putExtra("quoted_message_row_id", j2);
            intent.putExtra("quoted_group_jid", A034);
            intent.putExtra("has_number_from_url", z3);
            packageName = applicationContext.getPackageName();
            str = "com.obwhatsapp.location.LocationPicker";
        }
        intent.setClassName(packageName, str);
        r5.startActivityForResult(intent, 802);
    }

    public final void A06() {
        C16740tZ AFJ = this.A0I.AFJ();
        if (A0E(809) && this.A0M.A04(this.A0L)) {
            C000900k r4 = this.A02;
            C15830rv r10 = this.A0T;
            long j2 = AFJ == null ? 0 : AFJ.A13;
            C16050sL A0A2 = C38621r6.A0A(AFJ);
            boolean z2 = this.A0e;
            MentionableEntry mentionableEntry = this.A0V;
            String A052 = C40651uT.A05(mentionableEntry.getStringText());
            List mentions = mentionableEntry.getMentions();
            int i2 = 1;
            if (this.A00 == 5) {
                i2 = 20;
            }
            int A032 = this.A0R.A03(C16620tM.A02, 2614);
            Intent intent = new Intent();
            intent.setClassName(r4.getPackageName(), "com.obwhatsapp.gallerypicker.GalleryPicker");
            intent.setAction("android.intent.action.PICK");
            intent.setData(MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            intent.putExtra("max_items", A032);
            intent.putExtra("skip_max_items_new_limit", false);
            intent.putExtra("jid", r10.getRawString());
            intent.putExtra("quoted_message_row_id", j2);
            intent.putExtra("quoted_group_jid", C16030sJ.A03(A0A2));
            intent.putExtra("number_from_url", z2);
            intent.putExtra("send", true);
            intent.putExtra("picker_open_time", SystemClock.elapsedRealtime());
            intent.putExtra("origin", i2);
            intent.putExtra("android.intent.extra.TEXT", A052);
            intent.putExtra("mentions", C16030sJ.A06(mentions));
            r4.startActivityForResult(intent, 22);
        }
    }

    public final void A07() {
        if (A0E(810) && this.A0M.A04(this.A0L)) {
            C14870pt r5 = this.A05;
            AnonymousClass1A9.A0P(this.A02, this.A04, r5, (C15830rv) null, this.A0Y, 21, this.A0R.A03(C16620tM.A02, 2614));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r4.A0R.A0E(X.C16620tM.A02, 2683) == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(int r19) {
        /*
            r18 = this;
            r4 = r18
            X.1DX r3 = r4.A0X
            r8 = 2
            r0 = 1
            r5 = r19
            if (r5 == r0) goto L_0x0017
            r0 = 3
            if (r5 == r8) goto L_0x00b5
            r8 = 4
            if (r5 == r0) goto L_0x0017
            r0 = 5
            if (r5 == r8) goto L_0x00b5
            r8 = 6
            if (r5 == r0) goto L_0x0017
            r8 = 1
        L_0x0017:
            int r0 = r3.A01
            if (r0 == 0) goto L_0x0034
            r0 = 650(0x28a, float:9.11E-43)
            double r6 = java.lang.Math.random()
            double r0 = (double) r0
            double r6 = r6 * r0
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0034
            r0 = 1
            r3.A01 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A02 = r0
            r3.A00 = r8
        L_0x0034:
            X.00k r12 = r4.A02
            X.0sj r13 = r4.A0O
            android.content.Context r0 = r12.getApplicationContext()
            boolean r0 = X.C16260sj.A01(r0)
            if (r0 == 0) goto L_0x0050
            X.0pd r2 = r4.A0R
            r1 = 2683(0xa7b, float:3.76E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r17 = 1
            if (r0 != 0) goto L_0x0052
        L_0x0050:
            r17 = 0
        L_0x0052:
            r15 = 2131890792(0x7f121268, float:1.9416286E38)
            r16 = 2131232307(0x7f080633, float:1.808072E38)
            r14 = 30
            android.content.Intent r2 = com.obwhatsapp.RequestPermissionActivity.A09(r12, r13, r14, r15, r16, r17)
            if (r2 != 0) goto L_0x00a0
            X.12W r1 = r4.A0M
            X.1g2 r0 = r4.A0L
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0088
            X.0pf r0 = r4.A0Q
            long r6 = r0.A01()
            X.0s5 r1 = r4.A08
            X.0tC r0 = X.C15910s6.A1f
            int r0 = r1.A02(r0)
            int r0 = r0 << 10
            int r0 = r0 << 10
            long r1 = (long) r0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            goto L_0x008c
            X.0t9 r2 = r4.A0S
            X.0pS r1 = r4.A03
            r0 = 5
            X.C14740pg.A05(r12, r1, r2, r0)
        L_0x0088:
            r3.A00()
            return
        L_0x008c:
            X.01Y r1 = r4.A0G
            X.0rv r11 = r4.A0T
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r11)
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x00b8
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass29T.A01(r12, r0)
            goto L_0x0088
        L_0x00a0:
            r0 = 2
            r1 = 804(0x324, float:1.127E-42)
            if (r5 == r0) goto L_0x00b1
            r0 = 3
            r1 = 803(0x323, float:1.125E-42)
            if (r5 == r0) goto L_0x00b1
            r0 = 5
            r1 = 805(0x325, float:1.128E-42)
            if (r5 == r0) goto L_0x00b1
            r1 = 30
        L_0x00b1:
            r12.startActivityForResult(r2, r1)
            goto L_0x0088
        L_0x00b5:
            r8 = r0
            goto L_0x0017
        L_0x00b8:
            X.1yW r0 = r4.A0I
            X.0tZ r0 = r0.AFJ()
            if (r0 != 0) goto L_0x011e
            r1 = 0
        L_0x00c2:
            X.0sL r0 = X.C38621r6.A0A(r0)
            java.lang.String r10 = X.C16030sJ.A03(r0)
            boolean r9 = r4.A0e
            com.obwhatsapp.mentions.MentionableEntry r3 = r4.A0V
            java.lang.String r0 = r3.getStringText()
            java.lang.String r7 = X.C40651uT.A05(r0)
            java.util.List r8 = r3.getMentions()
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r3 = r12.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.camera.CameraActivity"
            r6.setClassName(r3, r0)
            java.lang.String r3 = X.C16030sJ.A03(r11)
            java.lang.String r0 = "jid"
            r6.putExtra(r0, r3)
            java.lang.String r0 = "quoted_message_row_id"
            r6.putExtra(r0, r1)
            java.lang.String r0 = "quoted_group_jid"
            r6.putExtra(r0, r10)
            java.lang.String r0 = "chat_opened_from_url"
            r6.putExtra(r0, r9)
            java.lang.String r0 = "camera_origin"
            r6.putExtra(r0, r5)
            java.lang.String r0 = "android.intent.extra.TEXT"
            r6.putExtra(r0, r7)
            java.util.ArrayList r1 = X.C16030sJ.A06(r8)
            java.lang.String r0 = "mentions"
            r6.putStringArrayListExtra(r0, r1)
            r0 = 806(0x326, float:1.13E-42)
            r12.startActivityForResult(r6, r0)
            X.0yi r0 = r4.A0K
            r0.A04()
            return
        L_0x011e:
            long r1 = r0.A13
            goto L_0x00c2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55472jf.A08(int):void");
    }

    public void A09(int i2, String str) {
        AnonymousClass289 r0 = this.A01;
        if (r0 != null) {
            r0.dismiss();
        }
        this.A0W.A00(this.A0T, this.A0I.AFJ(), C40651uT.A05(this.A0V.getStringText()), str, i2, false);
    }

    public void A0A(Uri uri, Byte b2, int i2) {
        if (this.A0G.A0V(UserJid.of(this.A0T))) {
            AnonymousClass29T.A01(this.A02, 106);
        } else {
            A0B(uri, b2, i2);
        }
    }

    public final void A0B(Uri uri, Byte b2, int i2) {
        if (uri != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(uri);
            C000900k r3 = this.A02;
            AnonymousClass2KC r4 = new AnonymousClass2KC(r3);
            r4.A0E = arrayList;
            r4.A0A = C16030sJ.A03(this.A0T);
            r4.A02 = i2;
            r4.A0I = true;
            AnonymousClass20I r2 = new AnonymousClass20I(uri);
            MentionableEntry mentionableEntry = this.A0V;
            r2.A0D(C40651uT.A05(mentionableEntry.getStringText()));
            r2.A0E(C39501sa.A00(mentionableEntry.getMentions()));
            r2.A0C(b2);
            AnonymousClass29Q r1 = new AnonymousClass29Q(r2);
            Bundle bundle = new Bundle();
            r1.A02(bundle);
            r4.A08 = bundle;
            C16740tZ AFJ = this.A0I.AFJ();
            if (AFJ != null) {
                r4.A06 = AFJ.A13;
                r4.A0B = C16030sJ.A03(C38621r6.A0A(AFJ));
            }
            r3.startActivityForResult(r4.A00(), 22);
            return;
        }
        Log.e("conversation/setuppreview/share-failed");
        this.A05.A09(R.string.str15fd, 0);
    }

    public void A0C(View view, int i2) {
        C000900k r1 = this.A02;
        C14870pt r3 = this.A05;
        C23061Ai r7 = this.A0c;
        C15830rv r6 = this.A0T;
        AnonymousClass01V r5 = this.A0N;
        boolean z2 = false;
        if (i2 == 5) {
            z2 = true;
        }
        AnonymousClass289 r0 = new AnonymousClass289(r1, view, r3, this, r5, r6, r7, z2);
        this.A01 = r0;
        this.A00 = i2;
        r0.A07(r1);
    }

    public void A0D(String str, boolean z2) {
        boolean A0U2;
        String str2;
        C000900k r8;
        C23061Ai r2;
        C15830rv r10;
        C16740tZ r1;
        String str3;
        AnonymousClass289 r0 = this.A01;
        AnonymousClass00B.A06(r0);
        r0.dismiss();
        switch (str.hashCode()) {
            case -1367751899:
                if (str.equals("camera")) {
                    if (z2) {
                        this.A03.Afc(new CapturePictureOrVideoDialogFragment());
                        return;
                    } else {
                        A08(this.A00);
                        return;
                    }
                }
                break;
            case -1275762953:
                str2 = "quick reply";
                break;
            case -309474065:
                str2 = "product";
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    if (z2) {
                        A07();
                        return;
                    } else {
                        A06();
                        return;
                    }
                }
                break;
            case 3446719:
                if (str.equals("poll")) {
                    C14710pd r6 = this.A0R;
                    C16620tM r5 = C16620tM.A02;
                    if (r6.A0E(r5, 2661)) {
                        Editable text = this.A0V.getText();
                        str3 = "";
                        if (text != null) {
                            int A002 = C31011dK.A00(text);
                            int A032 = r6.A03(r5, 1406);
                            if (A002 > A032) {
                                CharSequence A012 = C40651uT.A01(text, 0, text.length(), A032);
                                if (A012 != null) {
                                    str3 = A012.toString();
                                }
                            } else {
                                str3 = text.toString();
                            }
                        }
                        r8 = this.A02;
                        r2 = this.A0c;
                        r10 = this.A0T;
                        r1 = this.A0I.AFJ();
                    } else {
                        r8 = this.A02;
                        r2 = this.A0c;
                        r10 = this.A0T;
                        r1 = null;
                        str3 = "";
                    }
                    View currentFocus = r8.getCurrentFocus();
                    if (currentFocus != null) {
                        r2.A01(currentFocus);
                    }
                    if (!r6.A0E(r5, 2661)) {
                        str3 = null;
                    }
                    long j2 = r1 == null ? 0 : r1.A13;
                    Intent intent = new Intent();
                    intent.setClassName(r8.getPackageName(), "com.obwhatsapp.polls.PollCreatorActivity");
                    intent.putExtra("jid", C16030sJ.A03(r10));
                    intent.putExtra("quoted_message_row_id", j2);
                    if (str3 != null) {
                        intent.putExtra("entry_string_text", str3);
                    }
                    if (r6.A0E(r5, 2661)) {
                        r8.startActivityForResult(intent, 858);
                        return;
                    } else {
                        r8.startActivity(intent);
                        return;
                    }
                }
                break;
            case 3529462:
                if (str.equals("shop")) {
                    C25821Lg r12 = this.A0F;
                    C74543qi r3 = new C74543qi();
                    r3.A00 = 11;
                    r12.A02.A0B(r3, new AnonymousClass00F(1, 1), false);
                    return;
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    A02();
                    return;
                }
                break;
            case 106006350:
                str2 = "order";
                break;
            case 861720859:
                if (str.equals("document")) {
                    A04();
                    return;
                }
                break;
            case 951526432:
                if (str.equals("contact")) {
                    if (!this.A0H.A00()) {
                        RequestPermissionActivity.A0D(this.A02, R.string.str11c0, R.string.str11bf);
                        return;
                    } else {
                        A03();
                        return;
                    }
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    if (this.A0R.A0E(C16620tM.A02, 2767)) {
                        C15860rz r02 = this.A0P;
                        String[] strArr = AnonymousClass1GE.A07;
                        if (RequestPermissionActivity.A0Z(r02, strArr)) {
                            A0U2 = RequestPermissionActivity.A0U(this.A02, this.A0O, strArr, 0, 0, 801, true);
                        }
                        A05();
                        return;
                    }
                    C000900k r13 = this.A02;
                    C16260sj r22 = this.A0O;
                    C15860rz r03 = this.A0P;
                    String[] strArr2 = AnonymousClass1GE.A07;
                    if (RequestPermissionActivity.A0Z(r03, strArr2) || RequestPermissionActivity.A0W(r13, strArr2)) {
                        A0U2 = RequestPermissionActivity.A0U(r13, r22, strArr2, R.string.str11d0, 0, 801, false);
                    }
                    A05();
                    return;
                    if (!A0U2) {
                        return;
                    }
                    A05();
                    return;
                }
                break;
        }
        if (str.equals(str2)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong attachment type ");
        sb.append(str);
        AnonymousClass00B.A08(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r10 == 810) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E(int r10) {
        /*
            r9 = this;
            X.0sj r0 = r9.A0O
            boolean r1 = r0.A0B()
            r0 = 1
            if (r1 != 0) goto L_0x004b
            X.00k r2 = r9.A02
            boolean r0 = X.C16260sj.A01(r2)
            if (r0 == 0) goto L_0x0036
            r4 = 2131890760(0x7f121248, float:1.941622E38)
        L_0x0014:
            r0 = 809(0x329, float:1.134E-42)
            r7 = 0
            if (r10 == r0) goto L_0x001e
            r0 = 810(0x32a, float:1.135E-42)
            r8 = 0
            if (r10 != r0) goto L_0x001f
        L_0x001e:
            r8 = 1
        L_0x001f:
            r3 = 2131890761(0x7f121249, float:1.9416223E38)
            r5 = 2131890792(0x7f121268, float:1.9416286E38)
            r6 = 2131232307(0x7f080633, float:1.808072E38)
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0035
            android.content.Intent r0 = com.obwhatsapp.RequestPermissionActivity.A02(r2, r3, r4, r5, r6, r7, r8)
            r2.startActivityForResult(r0, r10)
        L_0x0035:
            return r7
        L_0x0036:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 >= r0) goto L_0x0040
            r4 = 2131890759(0x7f121247, float:1.9416219E38)
            goto L_0x0014
        L_0x0040:
            r0 = 33
            r4 = 2131890763(0x7f12124b, float:1.9416227E38)
            if (r1 >= r0) goto L_0x0014
            r4 = 2131890762(0x7f12124a, float:1.9416225E38)
            goto L_0x0014
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55472jf.A0E(int):boolean");
    }

    public boolean AM4(Intent intent, int i2, int i3) {
        int i4;
        String str;
        Uri fromFile;
        int i5 = i2;
        int i6 = i3;
        if (i5 == 801 && (!this.A0R.A0E(C16620tM.A02, 2767) || i6 == -1)) {
            A05();
        } else if (i5 == 23 && i3 == 0) {
            C17020u3 r2 = this.A0Y;
            synchronized (C17970vw.class) {
                if (C17970vw.A00 > 0) {
                    SharedPreferences.Editor edit = r2.A00(AnonymousClass01S.A07).edit();
                    int i7 = C17970vw.A00 - 1;
                    C17970vw.A00 = i7;
                    edit.putInt("file_index", i7);
                    edit.apply();
                }
            }
            return true;
        } else {
            if (i6 == -1) {
                if (i5 == 30 || i5 == 804) {
                    i4 = 2;
                } else if (i5 == 803) {
                    i4 = 3;
                } else if (i5 == 805) {
                    i4 = 5;
                } else if (i5 == 31) {
                    A00();
                    return true;
                } else if (i5 == 32) {
                    A01();
                    return true;
                } else if (i5 == 150) {
                    A03();
                    return true;
                } else if (i5 == 809) {
                    A06();
                    return true;
                } else if (i5 == 810) {
                    A07();
                    return true;
                } else if (i5 == 807) {
                    A02();
                    return true;
                } else if (i5 == 808) {
                    A04();
                    return true;
                } else if (i5 != 44) {
                    if (i5 == 6 || i5 == 36) {
                        AnonymousClass00B.A06(intent);
                        Uri uri = (Uri) intent.getParcelableExtra("uri");
                        File file = intent.hasExtra("file_path") ? new File(intent.getStringExtra("file_path")) : null;
                        Uri data = intent.getData();
                        List<Object> A082 = C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"));
                        if (uri != null) {
                            String stringExtra = intent.getStringExtra(FacebookFacade.RequestParameter.CAPTION);
                            List A083 = C16030sJ.A08(UserJid.class, intent.getStringArrayListExtra("mentions"));
                            for (Object singletonList : A082) {
                                this.A07.A01(uri, this.A03, this.A0I.AFJ(), file, stringExtra, Collections.singletonList(singletonList), A083, this.A0e);
                            }
                        } else if (data != null) {
                            this.A07.A01(data, this.A03, this.A0I.AFJ(), (File) null, (String) null, Collections.singletonList(this.A0T), (List) null, this.A0e);
                        } else {
                            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                            if (parcelableArrayListExtra != null) {
                                Iterator it = parcelableArrayListExtra.iterator();
                                while (it.hasNext()) {
                                    this.A07.A01((Uri) it.next(), this.A03, this.A0I.AFJ(), (File) null, (String) null, Collections.singletonList(this.A0T), (List) null, this.A0e);
                                }
                            }
                        }
                        if (intent.getBooleanExtra("clear_message_after_send", false)) {
                            this.A0V.setText("");
                        }
                        this.A0I.A5G(5);
                        return true;
                    }
                    if (i5 == 5) {
                        AnonymousClass00B.A06(intent);
                        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("result_uris");
                        if (parcelableArrayListExtra2 == null) {
                            if (intent.getData() != null) {
                                parcelableArrayListExtra2 = new ArrayList();
                                parcelableArrayListExtra2.add(intent.getData());
                            } else {
                                str = "(conversation|messagereply)/audio/share/failed";
                            }
                        }
                        Iterator it2 = parcelableArrayListExtra2.iterator();
                        while (it2.hasNext()) {
                            this.A0d.A0c((Uri) it2.next(), this.A03, new AnonymousClass52V(intent, this));
                            this.A0I.A5F();
                        }
                    } else if (i5 == 23) {
                        Uri fromFile2 = Uri.fromFile(AnonymousClass20J.A01(this.A0Y));
                        C17970vw.A0K(this.A02, fromFile2);
                        A0B(fromFile2, (Byte) null, 8);
                        return true;
                    } else if (i5 == 4) {
                        if (intent == null || intent.getData() == null) {
                            File A012 = AnonymousClass20J.A01(this.A0Y);
                            if (A012.exists()) {
                                fromFile = Uri.fromFile(A012);
                                C17970vw.A0K(this.A02, fromFile);
                            } else {
                                StringBuilder sb = new StringBuilder("conversation/video/share/nocapturefile ");
                                sb.append(A012);
                                Log.e(sb.toString());
                                str = "conversation/video/share/failed";
                            }
                        } else {
                            fromFile = intent.getData();
                        }
                        if (fromFile != null) {
                            A0B(fromFile, (Byte) null, 8);
                            return true;
                        }
                        str = "conversation/video/share/failed";
                    } else if (i5 == 21) {
                        if (intent != null) {
                            A0B(intent.getData(), (Byte) null, 1);
                            return true;
                        }
                    }
                    Log.w(str);
                    this.A05.A09(R.string.str15fd, 0);
                    return true;
                }
                A08(i4);
                return true;
            }
            return false;
        }
        return true;
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass289 r0 = this.A01;
        if (r0 != null && r0.isShowing()) {
            this.A01.A04();
        }
        this.A0a.A03(this.A0Z);
    }
}
