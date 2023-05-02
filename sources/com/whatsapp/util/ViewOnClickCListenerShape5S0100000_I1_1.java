package com.whatsapp.util;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass0PG;
import X.AnonymousClass1L6;
import X.AnonymousClass1N9;
import X.AnonymousClass1ZR;
import X.AnonymousClass1ZT;
import X.AnonymousClass1w8;
import X.AnonymousClass1yL;
import X.AnonymousClass1yU;
import X.AnonymousClass22N;
import X.AnonymousClass29T;
import X.AnonymousClass2JH;
import X.AnonymousClass306;
import X.AnonymousClass31J;
import X.AnonymousClass31L;
import X.AnonymousClass32I;
import X.AnonymousClass37H;
import X.AnonymousClass39R;
import X.AnonymousClass39Z;
import X.AnonymousClass3BA;
import X.AnonymousClass3qI;
import X.AnonymousClass4MM;
import X.AnonymousClass4NG;
import X.AnonymousClass4OB;
import X.C000900k;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14600pS;
import X.C14710pd;
import X.C14750ph;
import X.C14870pt;
import X.C15830rv;
import X.C16010sH;
import X.C16030sJ;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16180sb;
import X.C16260sj;
import X.C16320sq;
import X.C16620tM;
import X.C16730tY;
import X.C16740tZ;
import X.C16750ta;
import X.C16760tb;
import X.C16870tm;
import X.C19980zJ;
import X.C222617g;
import X.C23241Ba;
import X.C28031Ub;
import X.C30011bb;
import X.C30031bd;
import X.C30071bh;
import X.C30661ck;
import X.C30901d9;
import X.C32241fu;
import X.C34151jm;
import X.C34331k5;
import X.C38621r6;
import X.C38641rB;
import X.C39171s2;
import X.C39631sn;
import X.C39701sv;
import X.C39711sw;
import X.C41681wN;
import X.C42821yj;
import X.C455529g;
import X.C47572Jn;
import X.C49692Vb;
import X.C54602hp;
import X.C55642k5;
import X.C55852kW;
import X.C59172uy;
import X.C600930a;
import X.C602430q;
import X.C604632h;
import X.C614739b;
import X.C61783Ah;
import X.C62853Fe;
import X.C73903pH;
import X.C74283qE;
import X.C74343qO;
import X.C75453sB;
import X.C77753wU;
import X.C807645k;
import X.C82134Bi;
import X.C85174Nk;
import X.C85294Nw;
import X.C86204Rr;
import X.C86374Sl;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.facebook.redex.IDxFCallbackShape339S0100000_1_I1;
import com.facebook.redex.RunnableRunnableShape0S1300000_I0;
import com.facebook.simplejni.NativeHolder;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import com.obwhatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.obwhatsapp.group.GroupParticipantsSearchFragment;
import com.obwhatsapp.group.GroupSettingsActivity;
import com.obwhatsapp.invites.InviteGroupParticipantsActivity;
import com.obwhatsapp.mediacomposer.bottombar.recipients.RecipientsView;
import com.obwhatsapp.picker.search.PickerSearchDialogFragment;
import com.obwhatsapp.picker.search.StickerSearchDialogFragment;
import com.obwhatsapp.picker.searchexpressions.ExpressionsSearchDialogFragment;
import com.obwhatsapp.polls.PollCreatorActivity;
import com.obwhatsapp.polls.PollCreatorViewModel;
import com.obwhatsapp.settings.Settings;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.info.StickerInfoDialogFragment;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ViewOnClickCListenerShape5S0100000_I1_1 extends C34331k5 {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape5S0100000_I1_1(Settings settings) {
        this.A01 = 49;
        this.A00 = settings;
    }

    public ViewOnClickCListenerShape5S0100000_I1_1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A06(View view) {
        C55642k5 r1;
        int length;
        View view2 = view;
        switch (this.A01) {
            case 0:
                C59172uy r6 = (C59172uy) this.A00;
                C16760tb r5 = r6.A07;
                r5.A1Y.Acl(new RunnableRunnableShape0S1300000_I0(r5, (C16740tZ) r6.A0E, r6.A05.getStringText(), r6.A05.getMentions()));
                r6.dismiss();
                return;
            case 1:
                ((C49692Vb) this.A00).A02(true);
                return;
            case 2:
                AnonymousClass306 r0 = (AnonymousClass306) this.A00;
                Context context = (Context) r0.A01;
                context.startActivity(C14750ph.A0W(context, r0.A00.A0E, false, true, true));
                return;
            case 3:
                C600930a r4 = (C600930a) this.A00;
                C39701sv r02 = r4.A0D;
                if (r02 == null) {
                    Log.w("conversationrowcontact/addcontactonclicklistener/contact is null");
                    r4.A0J.A09(R.string.str0856, 0);
                    return;
                }
                Bitmap bitmap = null;
                byte[] bArr = r02.A09;
                if (bArr != null && (length = bArr.length) > 0) {
                    bitmap = BitmapFactory.decodeByteArray(bArr, 0, length);
                }
                C14550pN A02 = AnonymousClass22N.A02(r4);
                C39701sv r12 = r4.A0D;
                if (r12 != null && (A02 instanceof AnonymousClass1yU)) {
                    ((AnonymousClass1yU) A02).AfX(bitmap, r12);
                    return;
                }
                return;
            case 4:
                C600930a r7 = (C600930a) this.A00;
                if (r7.A1O(r7.A0D)) {
                    C39701sv r03 = r7.A0D;
                    ArrayList A0u = AnonymousClass000.A0u();
                    List<C85294Nw> list = r03.A02;
                    if (list != null) {
                        for (C85294Nw r2 : list) {
                            if (r2.A01 == ContactsContract.CommonDataKinds.Email.class) {
                                A0u.add(r2.A02);
                            }
                        }
                    }
                    if (A0u.isEmpty()) {
                        ArrayList arrayList = r7.A0S;
                        if (arrayList.size() == 1) {
                            A08((String) arrayList.get(0));
                            return;
                        }
                    }
                    ArrayList arrayList2 = r7.A0S;
                    if (!arrayList2.isEmpty() || A0u.size() != 1) {
                        ArrayList A0i = C13690nt.A0i(arrayList2.size() + A0u.size());
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            A0i.add(r7.A0K.A0H(AnonymousClass000.A0m(it)));
                        }
                        Iterator it2 = A0u.iterator();
                        while (it2.hasNext()) {
                            A0i.add(r7.A0K.A0G(AnonymousClass000.A0m(it2)));
                        }
                        boolean isEmpty = TextUtils.isEmpty(r7.A0D.A08.A01);
                        Context context2 = r7.getContext();
                        String string = isEmpty ? context2.getString(R.string.str0bb2) : C13680ns.A0d(context2, r7.A0D.A08.A01, new Object[1], 0, R.string.str0bc0);
                        C32241fu A002 = C32241fu.A00(r7.getContext());
                        A002.setTitle(string);
                        IDxCListenerShape29S0200000_2_I1 iDxCListenerShape29S0200000_2_I1 = new IDxCListenerShape29S0200000_2_I1(A0i, 12, this);
                        AnonymousClass0PG r04 = A002.A01;
                        r04.A0M = (CharSequence[]) A0i.toArray(new String[0]);
                        r04.A05 = iDxCListenerShape29S0200000_2_I1;
                        C13690nt.A1G(A002);
                        return;
                    }
                    A07((String) A0u.get(0));
                    return;
                }
                return;
            case 5:
                C600930a r62 = (C600930a) this.A00;
                if (r62.A00 == 1) {
                    Iterator it3 = r62.A0R.iterator();
                    while (it3.hasNext()) {
                        UserJid userJid = (UserJid) it3.next();
                        if (userJid != null) {
                            AnonymousClass1L6 r22 = r62.A05;
                            Context context3 = r62.getContext();
                            C39701sv r05 = r62.A0D;
                            r22.A01(context3, userJid, r05 != null ? r05.A08.A08 : null);
                            return;
                        }
                    }
                    return;
                }
                C38621r6.A0J(r62.getFMessage());
                C001000l r3 = (C001000l) AnonymousClass22N.A01(r62.getContext(), C000900k.class);
                if (r62.A0D != null && r3 != null) {
                    ArrayList A0u2 = AnonymousClass000.A0u();
                    ArrayList A0u3 = AnonymousClass000.A0u();
                    for (int i2 = 0; i2 < r62.A0D.A05.size(); i2++) {
                        if (r62.A0R.get(i2) != null) {
                            A0u2.add(((C39711sw) r62.A0D.A05.get(i2)).A02);
                            A0u3.add(((C39711sw) r62.A0D.A05.get(i2)).A03);
                        } else {
                            A0u2.add((Object) null);
                            A0u3.add((Object) null);
                        }
                    }
                    ConversationRowContact$MessageSharedContactDialogFragment.A01(r62.A0D.A08.A08, r62.A0R, A0u2, A0u3).A1G(r3.AGM(), (String) null);
                    return;
                }
                return;
            case 6:
                Object obj = this.A00;
                C600930a r23 = (C600930a) obj;
                C14530pL r63 = (C14530pL) AnonymousClass22N.A01(r23.getContext(), C14530pL.class);
                ArrayList arrayList3 = r23.A0R;
                if (!arrayList3.isEmpty() && arrayList3.get(0) != null && r63 != null) {
                    UserJid userJid2 = (UserJid) arrayList3.get(0);
                    C16010sH A0A = r23.A0a.A0A(userJid2);
                    C30011bb r52 = (C30011bb) obj;
                    if (r52.A0M.A0E(C16620tM.A02, 875)) {
                        C15830rv r13 = A0A.A0E;
                        if (r13 instanceof UserJid) {
                            r52.A0L.A0I(r13);
                        }
                    }
                    if (!A0A.A0H()) {
                        AnonymousClass37H r14 = r23.A07;
                        if (r14 != null) {
                            r14.A06(true);
                            r23.A07 = null;
                        }
                        AnonymousClass37H r42 = new AnonymousClass37H(r23.A0L, r63, r23.A03, r23.A06, userJid2);
                        r23.A07 = r42;
                        C13700nu.A0W(r42, r23.A1e);
                        return;
                    }
                    r63.startActivity(C14750ph.A0q().A0w(r63, A0A, C13680ns.A0Y()));
                    return;
                }
                return;
            case 7:
                C600930a r53 = (C600930a) this.A00;
                if (r53.A0D != null) {
                    Context context4 = r53.getContext();
                    Bundle A08 = C38621r6.A08(r53.getFMessage().A11);
                    Intent className = C13680ns.A09().setClassName(context4.getPackageName(), "com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity");
                    className.putExtra("edit_mode", false);
                    className.putExtra("vcard_message", A08);
                    C13690nt.A0u(className, r53);
                    return;
                }
                Log.w("conversationrowcontact/onclicklistener/vcard is empty");
                r53.A0J.A09(R.string.str0856, 0);
                return;
            case 8:
                C30031bd r54 = (C30031bd) this.A00;
                Context context5 = r54.getContext();
                Bundle A082 = C38621r6.A08(r54.getFMessage().A11);
                Intent className2 = C13680ns.A09().setClassName(context5.getPackageName(), "com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity");
                className2.putExtra("edit_mode", false);
                className2.putExtra("vcard_message", A082);
                C13690nt.A0u(className2, r54);
                return;
            case 9:
                C602430q r24 = (C602430q) this.A00;
                r24.A09.A06(view2);
                C86374Sl r15 = r24.A0I;
                if (r15 != null) {
                    r15.A00(((C16730tY) r24.A0O).A11);
                    return;
                }
                return;
            case 10:
                C30011bb r06 = (C30011bb) this.A00;
                r06.A0R.A0U((C30901d9) r06.A0O);
                return;
            case 11:
                C61783Ah r32 = (C61783Ah) this.A00;
                C16730tY r25 = r32.A00;
                if (C16730tY.A00(r25).A0Z) {
                    if (r25.A11.A02) {
                        r32.A0C.A04(r25, false);
                    }
                    r32.A0D.A0B(r32.A00, false, false);
                    return;
                }
                return;
            case 12:
                C61783Ah r43 = (C61783Ah) this.A00;
                C16730tY r26 = r43.A00;
                C16750ta A003 = C16730tY.A00(r26);
                if ((!A003.A0P || A003.A0W) && !A003.A0Z && r26.A08 != null && A003.A07 != 1) {
                    r43.A02 = true;
                    r43.A07.A05((C14550pN) C19980zJ.A02(r43.A05), r43.A00, true);
                    return;
                }
                return;
            case 13:
                C61783Ah r33 = (C61783Ah) this.A00;
                C16260sj r16 = r33.A09;
                if (r16 == null || RequestPermissionActivity.A0X(view2.getContext(), r16)) {
                    C16730tY r27 = r33.A00;
                    C16750ta A004 = C16730tY.A00(r27);
                    if (!A004.A0P && !A004.A0Z) {
                        r33.A06.A06(r27, true, true);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                C61783Ah r44 = (C61783Ah) this.A00;
                C34151jm A1A = ((C38641rB) r44.A00).A1A();
                StickerView stickerView = r44.A0F;
                if (!stickerView.A03) {
                    stickerView.A05();
                }
                StickerInfoDialogFragment stickerInfoDialogFragment = new StickerInfoDialogFragment();
                Bundle A0D = C13690nt.A0D();
                A0D.putParcelable("sticker", A1A);
                stickerInfoDialogFragment.A0T(A0D);
                ((C14550pN) C19980zJ.A01(r44.A05.getContext(), C14550pN.class)).Afc(stickerInfoDialogFragment);
                return;
            case 15:
                AnonymousClass39Z r07 = (AnonymousClass39Z) this.A00;
                AnonymousClass31J r34 = r07.A0C;
                C16730tY r28 = r07.A06;
                r34.A1B(r28.A11.A00, r28.A0W);
                return;
            case 16:
                AnonymousClass31L r45 = (AnonymousClass31L) this.A00;
                C16730tY r35 = (C16730tY) r45.A0O;
                C16750ta A005 = C16730tY.A00(r35);
                if (A005.A07 == 1) {
                    r45.A0J.A07(R.string.str093a, 1);
                    return;
                }
                r45.A09.A06(view2);
                if (r35.A08 == null) {
                    return;
                }
                if (A005.A0Y) {
                    r45.A1Q();
                    return;
                } else {
                    Log.e("streamdownload/unable to open playback");
                    return;
                }
            case 17:
                ((C30011bb) this.A00).A0z();
                return;
            case 18:
                C42821yj r46 = ((C85174Nk) this.A00).A02.A00;
                C41681wN r17 = r46.A2D;
                r17.A0B(r17.A05);
                AnonymousClass4NG r36 = (AnonymousClass4NG) C42821yj.A5M.get(r46.A2l.A08(C15830rv.class));
                if (r36 != null) {
                    r46.A2U.A01(UserJid.of(r46.A33), (String) null, 5);
                    C614739b r18 = r46.A2S;
                    boolean z2 = r36.A03;
                    C15830rv r08 = r18.A0B;
                    if (r08 != null) {
                        r18.A0R.A00(6, r08.getRawString(), z2);
                    }
                }
                r46.A07();
                return;
            case 19:
                C85174Nk r72 = (C85174Nk) this.A00;
                C41681wN r29 = r72.A03;
                AnonymousClass1ZR r09 = r29.A01;
                if (r09 != null && (r1 = r09.A09) != null && r1.A02 != null) {
                    String str = r1.A01;
                    if ("video/mp4".equals(str) || "image/gif".equals(str)) {
                        WebPagePreviewView webPagePreviewView = r72.A05;
                        webPagePreviewView.setImageProgressBarVisibility(true);
                        webPagePreviewView.setImageThumbVisibility(false);
                        C16320sq r55 = r72.A04;
                        C16180sb r47 = r72.A01;
                        C55642k5 r010 = r29.A01.A09;
                        r55.Ack(new C55852kW(r47, new IDxFCallbackShape339S0100000_1_I1(r72, 0), r010.A02, r010.A01), new String[0]);
                        return;
                    }
                    return;
                }
                return;
            case 20:
            case 32:
                ((DialogFragment) this.A00).A1C();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                ((C73903pH) this.A00).A00.setVisibility(8);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                AnonymousClass3qI r210 = new AnonymousClass3qI();
                r210.A00 = C13680ns.A0X();
                AnonymousClass3BA r19 = (AnonymousClass3BA) this.A00;
                r19.A0C.A06(r210);
                r19.A09.A1J();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                AnonymousClass3qI r110 = new AnonymousClass3qI();
                r110.A00 = C13680ns.A0Z();
                ((AnonymousClass3BA) this.A00).A0C.A06(r110);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                AnonymousClass3qI r211 = new AnonymousClass3qI();
                r211.A00 = C13680ns.A0Y();
                AnonymousClass3BA r111 = (AnonymousClass3BA) this.A00;
                r111.A0C.A06(r211);
                r111.A09.A1J();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                C47572Jn r112 = (C47572Jn) ((AnonymousClass4OB) this.A00).A00;
                if (r112.A00 != 0) {
                    r112.A0G(0);
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                C62853Fe r37 = (C62853Fe) this.A00;
                C47572Jn r212 = (C47572Jn) r37.A00;
                if (r212.A00 != 1) {
                    r212.A0G(1);
                    r37.A00();
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                AnonymousClass39R r38 = (AnonymousClass39R) this.A00;
                C47572Jn r213 = (C47572Jn) r38.A01;
                if (r213.A00 != 2) {
                    r213.A0G(2);
                    ((AnonymousClass2JH) r38.A01).A0B();
                    if (r38.A02.A01.getVisibility() == 0) {
                        C13680ns.A0z(r38.A06.A05.A0K(), "sticker_store_onboarding_badge_shown", true);
                        r38.A02.A01.setVisibility(8);
                        Animation animation = r38.A02.A01.getAnimation();
                        if (animation != null) {
                            animation.cancel();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                C74343qO r48 = new C74343qO();
                AnonymousClass32I r39 = (AnonymousClass32I) this.A00;
                int i3 = r39.A00.A00;
                int i4 = 0;
                if (i3 != 1) {
                    if (i3 == 2) {
                        i4 = 1;
                    } else {
                        throw AnonymousClass000.A0T(C13680ns.A0c(i3, "Unexpected provider type "));
                    }
                }
                r48.A00 = Integer.valueOf(i4);
                r39.A06.A06(r48);
                r39.A08.ARt(r39.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                ((GroupParticipantsSearchFragment) this.A00).A1C();
                return;
            case 30:
                GroupSettingsActivity groupSettingsActivity = (GroupSettingsActivity) this.A00;
                ArrayList A0u4 = AnonymousClass000.A0u();
                C28031Ub it4 = C16070sO.A00(groupSettingsActivity.A05, groupSettingsActivity.A0F).A04().iterator();
                while (it4.hasNext()) {
                    C30661ck r214 = (C30661ck) it4.next();
                    int i5 = r214.A01;
                    if (!(i5 == 0 || i5 == 2)) {
                        C16040sK r011 = groupSettingsActivity.A01;
                        UserJid userJid3 = r214.A03;
                        if (!r011.A0I(userJid3)) {
                            A0u4.add(userJid3);
                        }
                    }
                }
                C16050sL r310 = groupSettingsActivity.A0F;
                Intent A09 = C13680ns.A09();
                A09.setClassName(groupSettingsActivity.getPackageName(), "com.obwhatsapp.group.EditGroupAdminsSelector");
                A09.putExtra("gid", r310.getRawString());
                A09.putExtra("selected", C16030sJ.A06(A0u4));
                groupSettingsActivity.startActivityForResult(A09, 17);
                return;
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                InviteGroupParticipantsActivity inviteGroupParticipantsActivity = (InviteGroupParticipantsActivity) this.A00;
                C16760tb r122 = inviteGroupParticipantsActivity.A02;
                String A083 = inviteGroupParticipantsActivity.A04.A08(inviteGroupParticipantsActivity.A0A);
                List<AnonymousClass4MM> list2 = inviteGroupParticipantsActivity.A0H;
                byte[] bArr2 = inviteGroupParticipantsActivity.A0J;
                String stringText = inviteGroupParticipantsActivity.A0F.getStringText();
                for (AnonymousClass4MM r311 : list2) {
                    C222617g r012 = r122.A1N;
                    UserJid userJid4 = r311.A02;
                    C16050sL r142 = r311.A01;
                    C16040sK r215 = r122.A05;
                    r215.A0B();
                    AnonymousClass1ZT r132 = r215.A05;
                    String str2 = r311.A03;
                    long A006 = r122.A0Q.A00();
                    long j2 = r311.A00;
                    int A022 = r122.A0b.A02(r142);
                    C30071bh r113 = new C30071bh(r012.A05.A02(userJid4, true), A006);
                    r113.A02 = 1;
                    r113.A02 = r142;
                    r113.A03 = r132;
                    r113.A05 = A083;
                    r113.A06 = str2;
                    r113.A01 = j2;
                    r113.A07 = false;
                    r113.A00 = A022;
                    r113.A04 = stringText;
                    if (bArr2 != null) {
                        C16870tm A0F = r113.A0F();
                        AnonymousClass00B.A06(A0F);
                        A0F.A02(bArr2);
                    }
                    r122.A0M(r113);
                    r122.A0e.A0W(r113);
                }
                inviteGroupParticipantsActivity.setResult(-1);
                C14870pt r73 = inviteGroupParticipantsActivity.A05;
                AnonymousClass013 r64 = inviteGroupParticipantsActivity.A08;
                long size = (long) inviteGroupParticipantsActivity.A0H.size();
                Object[] A1b = C13680ns.A1b();
                r73.A0H(r64.A0J(A1b, R.plurals.plurals00ab, size), C13690nt.A1W(A1b, inviteGroupParticipantsActivity.A0H.size()) ? 1 : 0);
                inviteGroupParticipantsActivity.finish();
                return;
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                AnonymousClass29T.A01(((C604632h) this.A00).A06.A0E, 0);
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                AnonymousClass1w8 r216 = ((RecipientsView) this.A00).A02;
                if (r216 != null) {
                    r216.AVs("status_chip".equals(view2.getTag()));
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) this.A00;
                C13700nu.A0T(stickerSearchDialogFragment.A05);
                stickerSearchDialogFragment.A05.A04(false);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                ((PickerSearchDialogFragment) this.A00).A1M();
                return;
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                ExpressionsSearchDialogFragment expressionsSearchDialogFragment = (ExpressionsSearchDialogFragment) this.A00;
                C13700nu.A0T(expressionsSearchDialogFragment.A03);
                expressionsSearchDialogFragment.A03.A04(false);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                ExpressionsSearchDialogFragment expressionsSearchDialogFragment2 = (ExpressionsSearchDialogFragment) this.A00;
                expressionsSearchDialogFragment2.A03.A03();
                expressionsSearchDialogFragment2.A1M();
                return;
            case 39:
                PollCreatorActivity pollCreatorActivity = (PollCreatorActivity) this.A00;
                if (pollCreatorActivity.A08 != null) {
                    PollCreatorViewModel pollCreatorViewModel = pollCreatorActivity.A0A;
                    String trim = pollCreatorViewModel.A09.A00.trim();
                    if (trim.length() > 0) {
                        if (!(pollCreatorActivity.A0D ? pollCreatorViewModel.A09(true) : pollCreatorViewModel.A08(true))) {
                            boolean z3 = pollCreatorActivity.A0D;
                            PollCreatorViewModel pollCreatorViewModel2 = pollCreatorActivity.A0A;
                            if (z3) {
                                if (pollCreatorViewModel2.A0F.size() > 0) {
                                    return;
                                }
                            } else if (pollCreatorViewModel2.A00 >= 0) {
                                return;
                            }
                        } else {
                            PollCreatorViewModel pollCreatorViewModel3 = pollCreatorActivity.A0A;
                            C15830rv r10 = pollCreatorActivity.A08;
                            long j3 = pollCreatorActivity.A00;
                            ArrayList A0u5 = AnonymousClass000.A0u();
                            for (C77753wU r217 : pollCreatorViewModel3.A0G) {
                                String str3 = r217.A00;
                                if (!str3.trim().isEmpty()) {
                                    A0u5.add(str3);
                                }
                            }
                            C16760tb r49 = pollCreatorViewModel3.A05;
                            C14710pd r8 = r49.A0y;
                            C16620tM r312 = C16620tM.A02;
                            if (r8.A0E(r312, 1394)) {
                                C16740tZ A007 = j3 > 0 ? r49.A0e.A0K.A00(j3) : null;
                                C222617g r82 = r49.A1N;
                                JniBridge jniBridge = r49.A1Z;
                                C39171s2 r218 = new C39171s2(r82.A05.A02(r10, true), r49.A0Q.A00());
                                r218.A03 = trim;
                                List list3 = r218.A05;
                                list3.clear();
                                Iterator it5 = A0u5.iterator();
                                while (it5.hasNext()) {
                                    NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOO(4, it5.next(), jniBridge.wajContext.get());
                                    if (nativeHolder != null) {
                                        C82134Bi r013 = new C82134Bi(nativeHolder);
                                        JniBridge.getInstance();
                                        NativeHolder nativeHolder2 = r013.A00;
                                        JniBridge.getInstance();
                                        list3.add(new C39631sn((String) JniBridge.jvidispatchOIO(1, (long) 70, nativeHolder2), Base64.encodeToString((byte[]) JniBridge.jvidispatchOIO(0, (long) 69, nativeHolder2), 2)));
                                    }
                                }
                                if (r218.A11.A02) {
                                    r218.A02 = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
                                }
                                if (r82.A04.A0E(r312, 2663)) {
                                    r82.A05(r218, A007);
                                }
                                r49.A0M(r218);
                                r49.A0e.A0W(r218);
                            }
                            AnonymousClass1N9 r313 = pollCreatorViewModel3.A0A;
                            long A008 = pollCreatorViewModel3.A06.A00();
                            int size2 = A0u5.size();
                            C75453sB r219 = new C75453sB();
                            r313.A01(r219, r10);
                            r219.A04 = Long.valueOf(C13690nt.A09(A008 - (A008 % 86400000)));
                            r219.A05 = C13690nt.A0W(size2);
                            r219.A03 = C13680ns.A0Z();
                            r313.A01.A06(r219);
                            if (pollCreatorActivity.A0D) {
                                pollCreatorActivity.setResult(-1);
                            }
                            pollCreatorActivity.finish();
                            pollCreatorActivity.overridePendingTransition(0, R.anim.anim003f);
                            return;
                        }
                    }
                    pollCreatorActivity.A05.A09(R.string.str12d3, 0);
                    return;
                }
                return;
            case 40:
                AnonymousClass1yL.A07((Activity) this.A00, "com.obwhatsapp.w4b");
                return;
            case 41:
                Context context6 = (Context) this.A00;
                Intent A092 = C13680ns.A09();
                A092.setClassName(context6.getPackageName(), "com.obwhatsapp.settings.Licenses");
                context6.startActivity(A092);
                return;
            case 42:
                Context context7 = (Context) this.A00;
                Intent A093 = C13680ns.A09();
                A093.setClassName(context7.getPackageName(), "com.obwhatsapp.avatar.home.AvatarHomeActivity");
                context7.startActivity(A093);
                return;
            case 43:
                Settings settings = (Settings) this.A00;
                if (!settings.A07.A0A()) {
                    Object[] A1b2 = C13680ns.A1b();
                    A1b2[0] = settings.getString(R.string.str053b);
                    C86204Rr A009 = C807645k.A00(A1b2, R.string.str1388);
                    A009.A04 = R.string.str0df8;
                    A009.A01 = R.string.str0e87;
                    C13680ns.A1J(A009.A00(), settings);
                    C74283qE r114 = new C74283qE();
                    r114.A00 = C13680ns.A0Y();
                    settings.A0N.A04(r114);
                    return;
                }
                Intent A094 = C13680ns.A09();
                A094.setClassName(settings.getPackageName(), "com.obwhatsapp.inappbugreporting.InAppBugReportingActivity");
                settings.startActivity(A094);
                return;
            case 44:
                Settings settings2 = (Settings) this.A00;
                Settings.A02(settings2, 6);
                Intent A095 = C13680ns.A09();
                A095.setClassName(settings2.getPackageName(), "com.obwhatsapp.settings.SettingsHelpV2");
                settings2.startActivity(A095);
                return;
            case 45:
                Settings settings3 = (Settings) this.A00;
                Settings.A02(settings3, C13680ns.A0a());
                settings3.startActivity(C13680ns.A09().setClassName(settings3.getPackageName(), "com.obwhatsapp.settings.SettingsChat"));
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                Settings settings4 = (Settings) this.A00;
                Settings.A02(settings4, C13690nt.A0U());
                Intent A096 = C13680ns.A09();
                A096.setClassName(settings4.getPackageName(), "com.obwhatsapp.settings.SettingsDataUsageActivity");
                settings4.startActivity(A096);
                return;
            case 47:
                Settings settings5 = (Settings) this.A00;
                Settings.A02(settings5, C13690nt.A0T());
                Intent A097 = C13680ns.A09();
                A097.setClassName(settings5.getPackageName(), "com.obwhatsapp.settings.SettingsNotifications");
                settings5.startActivity(A097);
                return;
            case 48:
                Settings settings6 = (Settings) this.A00;
                Settings.A02(settings6, 11);
                Intent A098 = C13680ns.A09();
                A098.setClassName(settings6.getPackageName(), "com.obwhatsapp.settings.SettingsPrivacy");
                settings6.startActivity(A098);
                return;
            default:
                Settings settings7 = (Settings) this.A00;
                Settings.A02(settings7, C13680ns.A0X());
                settings7.startActivity(settings7.A04.A01(settings7), C455529g.A05(settings7, settings7.A03, new C54602hp(settings7).A00(R.string.str1dd7)));
                return;
        }
    }

    public final void A07(String str) {
        C600930a r5 = (C600930a) this.A00;
        C23241Ba r8 = r5.A01;
        Intent putExtra = C13700nu.A02("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.EMAIL", new String[]{str}).putExtra("android.intent.extra.SUBJECT", r5.getContext().getString(R.string.str179a));
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(C13680ns.A0d(r5.getContext(), "https://www.whatsapp.com/download/", new Object[1], 0, R.string.str1799));
        r8.A00(r5.getContext(), putExtra.putExtra("android.intent.extra.TEXT", AnonymousClass000.A0h("\n\n", A0o)), (C14600pS) null, r5.getContext().getString(R.string.str0bc6), true);
    }

    public final void A08(String str) {
        C600930a r1 = (C600930a) this.A00;
        r1.A02.A00(C19980zJ.A02(r1), Uri.parse(C13680ns.A0h("sms:", str)), 18, C13680ns.A0d(r1.getContext(), "https://whatsapp.com/dl/", C13680ns.A1b(), 0, R.string.str179b));
    }
}
