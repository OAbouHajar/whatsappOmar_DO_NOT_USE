package com.obwhatsapp.group;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01Q;
import X.AnonymousClass01V;
import X.AnonymousClass11A;
import X.AnonymousClass120;
import X.AnonymousClass121;
import X.AnonymousClass122;
import X.AnonymousClass12A;
import X.AnonymousClass152;
import X.AnonymousClass15P;
import X.AnonymousClass1BQ;
import X.AnonymousClass1WP;
import X.AnonymousClass1WU;
import X.AnonymousClass1XI;
import X.AnonymousClass2Ao;
import X.AnonymousClass2JH;
import X.AnonymousClass2NW;
import X.AnonymousClass2Rf;
import X.AnonymousClass4OC;
import X.AnonymousClass55F;
import X.AnonymousClass55G;
import X.AnonymousClass5RN;
import X.AnonymousClass68J;
import X.C011005f;
import X.C1044855o;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C15910s6;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C17020u3;
import X.C17190ug;
import X.C17200uh;
import X.C17240ul;
import X.C17250um;
import X.C17800vf;
import X.C18260wP;
import X.C18600wx;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C206711d;
import X.C224718b;
import X.C23061Ai;
import X.C23071Aj;
import X.C30641ci;
import X.C31011dK;
import X.C33501ig;
import X.C34721kl;
import X.C40201tj;
import X.C40491uD;
import X.C40651uT;
import X.C453528b;
import X.C48402Na;
import X.C48412Nd;
import X.C49132Rg;
import X.C604231m;
import X.C63153Gi;
import X.C74693qx;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.ephemeral.ChangeEphemeralSettingsDialog;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class NewGroup extends C14530pL implements C48402Na, AnonymousClass68J {
    public int A00;
    public int A01;
    public Bundle A02;
    public ImageButton A03;
    public ImageView A04;
    public AnonymousClass01Q A05;
    public KeyboardPopupLayout A06;
    public WaEditText A07;
    public C16000sG A08;
    public C16080sP A09;
    public AnonymousClass120 A0A;
    public AnonymousClass12A A0B;
    public AnonymousClass2Ao A0C;
    public C17200uh A0D;
    public AnonymousClass152 A0E;
    public C15810rt A0F;
    public AnonymousClass11A A0G;
    public C16460t6 A0H;
    public C16070sO A0I;
    public C18600wx A0J;
    public AnonymousClass2JH A0K;
    public C206711d A0L;
    public AnonymousClass1BQ A0M;
    public C16490t9 A0N;
    public C17240ul A0O;
    public C16050sL A0P;
    public C17190ug A0Q;
    public C17800vf A0R;
    public C17020u3 A0S;
    public AnonymousClass121 A0T;
    public AnonymousClass122 A0U;
    public Integer A0V;
    public List A0W;
    public boolean A0X;
    public boolean A0Y;
    public final AnonymousClass5RN A0Z;
    public final C33501ig A0a;
    public final C16010sH A0b;
    public final AtomicReference A0c;

    public NewGroup() {
        this(0);
        this.A0c = new AtomicReference();
        this.A0b = new C34721kl("");
        this.A0Z = new IDxCListenerShape203S0100000_2_I0(this, 5);
        this.A0a = new C604231m(this);
    }

    public NewGroup(int i2) {
        this.A0Y = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 53));
    }

    public static /* synthetic */ void A0T(NewGroup newGroup) {
        C16010sH r2 = newGroup.A0b;
        r2.A0L = newGroup.A07.getText().toString();
        newGroup.A0T.A06(newGroup, r2, 12);
    }

    public static /* synthetic */ void A0r(NewGroup newGroup, AnonymousClass1WP r16, String str, List list) {
        int i2 = newGroup.A00;
        C16050sL r4 = newGroup.A0P;
        Log.i("newgroup/invokeCreateGroupApi");
        AnonymousClass1WP r5 = r16;
        newGroup.A0O.A12.add(r5);
        AnonymousClass4OC r3 = new AnonymousClass4OC(r4, r5, str, (String) null, list, i2, false);
        AnonymousClass2NW r10 = new AnonymousClass2NW(newGroup.A05, newGroup.A0G, newGroup.A0H, newGroup.A0O, newGroup, r3, newGroup.A0U);
        C16440t3 r32 = newGroup.A05;
        C14710pd r42 = newGroup.A0C;
        new C63153Gi(newGroup.A03, newGroup.A01, r32, r42, newGroup.A0O, r10, r10.A04, newGroup.A0Q).A00();
        C74693qx r2 = new C74693qx();
        r2.A00 = newGroup.A0V;
        r2.A01 = Long.valueOf((long) i2);
        newGroup.A0N.A05(r2);
    }

    public static /* synthetic */ void A0u(NewGroup newGroup, C16050sL r2) {
        if (newGroup.A0F.A0F(r2)) {
            newGroup.Ac1();
            if (!newGroup.AIm()) {
                Log.i("checkIfJidCreatedAndFinishIfNecessary/finishing");
                newGroup.A36(r2);
                newGroup.finish();
            }
        }
    }

    public static /* synthetic */ void A0x(NewGroup newGroup, List list) {
        String A052 = C40651uT.A05(newGroup.A07.getText().toString());
        int A002 = C31011dK.A00(A052);
        int A022 = newGroup.A06.A02(C15910s6.A20);
        if (A002 > A022) {
            newGroup.A05.A0H(newGroup.getResources().getQuantityString(R.plurals.plurals0156, A022, new Object[]{Integer.valueOf(A022)}), 0);
        } else if (!list.isEmpty() || newGroup.A0X) {
            if (newGroup.A0X) {
                File A003 = newGroup.A0A.A00(newGroup.A0b);
                Uri uri = null;
                if (A003 != null && A003.exists()) {
                    uri = Uri.fromFile(A003);
                }
                AnonymousClass1WP A072 = newGroup.A0O.A07();
                Intent intent = new Intent();
                int i2 = newGroup.A00;
                Bundle bundle = new Bundle();
                bundle.putString("key_raw_jid", A072.getRawString());
                bundle.putString("key_raw_photo_uri", uri != null ? uri.toString() : null);
                bundle.putString("key_group_name", A052);
                bundle.putInt("key_ephemeral_duration", i2);
                intent.putExtra("group_created", bundle);
                newGroup.setResult(-1, intent);
            } else {
                AnonymousClass1WP A073 = newGroup.A0O.A07();
                newGroup.A0O.A0K(A073, list, true);
                if (newGroup.A07.A0A()) {
                    StringBuilder sb = new StringBuilder("newgroup/go create group:");
                    sb.append(A073);
                    Log.i(sb.toString());
                    newGroup.Afq(R.string.str0618);
                    newGroup.A05 = new AnonymousClass01Q(A073, new C1044855o(newGroup, A073, A052, list));
                    C16460t6 r4 = newGroup.A0H;
                    AnonymousClass122 r2 = newGroup.A0U;
                    long A004 = newGroup.A05.A00();
                    C224718b r1 = r2.A03;
                    r1.A02(A073, true);
                    AnonymousClass1WU A005 = AnonymousClass122.A00(r2.A00, r1.A02(A073, true), (C30641ci) null, 2, A004);
                    A005.A0k(A052);
                    A005.A0t(list);
                    r4.A0W(A005);
                    newGroup.A05.A0L(new AnonymousClass55F(newGroup), 10000);
                    return;
                }
                Log.i("newgroup/no network access, fail to create group");
                C16460t6 r8 = newGroup.A0H;
                AnonymousClass122 r22 = newGroup.A0U;
                long A006 = newGroup.A05.A00();
                int i3 = newGroup.A00;
                C40201tj r23 = new C40201tj(r22.A03.A02(A073, true), A006);
                r23.A00 = i3;
                r23.A0k(A052);
                r23.A0t(list);
                r8.A0W(r23);
                File A007 = newGroup.A0A.A00(newGroup.A0b);
                if (A007 != null && A007.exists()) {
                    try {
                        C453528b A012 = newGroup.A0T.A01(AnonymousClass1XI.A0T(A007));
                        newGroup.A0B.A02(newGroup.A08.A0A(A073), A012.A00, A012.A01);
                    } catch (IOException e2) {
                        Log.e("newgroup/failed to update photo", e2);
                    }
                }
                newGroup.setResult(-1);
            }
            newGroup.finish();
        } else {
            newGroup.A05.A09(R.string.str0e14, 0);
        }
    }

    public void A1q() {
        if (!this.A0Y) {
            this.A0Y = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A0F = (C15810rt) r1.A43.get();
            this.A0N = (C16490t9) r1.AQz.get();
            this.A0L = (C206711d) r1.AKp.get();
            this.A0D = (C17200uh) r1.A52.get();
            this.A0Q = (C17190ug) r1.AEu.get();
            this.A08 = (C16000sG) r1.A4x.get();
            this.A09 = (C16080sP) r1.AQ9.get();
            this.A0H = (C16460t6) r1.A5k.get();
            this.A0O = (C17240ul) r1.ABK.get();
            this.A0R = C16150sX.A0x(r1);
            this.A0A = (AnonymousClass120) r1.A4z.get();
            this.A0B = (AnonymousClass12A) r1.A50.get();
            this.A0M = (AnonymousClass1BQ) r1.A7f.get();
            this.A0T = (AnonymousClass121) r1.AJY.get();
            this.A0U = (AnonymousClass122) r1.AOe.get();
            this.A0G = (AnonymousClass11A) r1.A5U.get();
            this.A0I = (C16070sO) r1.ABY.get();
            this.A0S = (C17020u3) r1.AMG.get();
            this.A0E = (AnonymousClass152) r1.A51.get();
            this.A0J = (C18600wx) r1.A78.get();
        }
    }

    public final void A35(int i2) {
        this.A00 = i2;
        C48412Nd r1 = (C48412Nd) AnonymousClass00T.A05(this, R.id.group_ephemeral_duration_row_view);
        int i3 = R.color.color04d1;
        if (i2 <= 0) {
            i3 = R.color.color04d2;
        }
        r1.setIconColor(AnonymousClass00T.A00(this, i3));
        r1.setDescription(C40491uD.A03(this, i2, false, false));
    }

    public final void A36(C16050sL r4) {
        Intent intent = new Intent();
        intent.putExtra("group_jid", r4.getRawString());
        if (this.A02 != null) {
            this.A07.A03();
            intent.putExtra("new_group_result_bundle", this.A02);
        }
        setResult(-1, intent);
    }

    public void AQP(int i2) {
        A35(i2);
    }

    public void AU6() {
        if (this.A06.A02.A00(C011005f.CREATED)) {
            ChangeEphemeralSettingsDialog.A01(AGM(), this.A00, 1);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        C16010sH r4;
        Intent intent2 = intent;
        if (i2 != 12) {
            if (i2 != 13) {
                super.onActivityResult(i2, i3, intent);
                return;
            }
            AnonymousClass121 r0 = this.A0T;
            r4 = this.A0b;
            r0.A02(r4).delete();
            if (i3 != -1) {
                if (i3 == 0 && intent != null) {
                    this.A0T.A03(intent, this);
                    return;
                }
                return;
            }
        } else if (i3 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    Log.i("newgroup/resetphoto");
                    AnonymousClass120 r02 = this.A0A;
                    C16010sH r1 = this.A0b;
                    File A002 = r02.A00(r1);
                    AnonymousClass00B.A06(A002);
                    A002.delete();
                    File A012 = this.A0A.A01(r1);
                    AnonymousClass00B.A06(A012);
                    A012.delete();
                    this.A04.setImageResource(R.drawable.ic_addphoto);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    AnonymousClass121 r03 = this.A0T;
                    r4 = this.A0b;
                    r03.A02(r4).delete();
                }
            }
            Log.i("newgroup/cropphoto");
            this.A0T.A05(intent2, this, this, this.A0b, 13);
            return;
        } else {
            return;
        }
        Log.i("newgroup/photopicked");
        this.A04.setImageBitmap(this.A0E.A00(this, r4, 0.0f, getResources().getDimensionPixelSize(R.dimen.dimen0694)));
    }

    public void onBackPressed() {
        AnonymousClass2JH r0 = this.A0K;
        if (r0 == null || !r0.isShowing()) {
            super.onBackPressed();
        } else {
            this.A0K.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x02bd, code lost:
        if (r3 != null) goto L_0x0278;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r4 = r27
            r2 = r28
            super.onCreate(r2)
            r0 = 2131889620(0x7f120dd4, float:1.9413909E38)
            r4.setTitle(r0)
            X.02i r1 = r4.x()
            X.AnonymousClass00B.A06(r1)
            r6 = 1
            r1.A0N(r6)
            r1.A0O(r6)
            r0 = 2131886275(0x7f1200c3, float:1.9407124E38)
            r1.A0A(r0)
            r0 = 2131559428(0x7f0d0404, float:1.87442E38)
            r4.setContentView((int) r0)
            X.0uh r1 = r4.A0D
            java.lang.String r0 = "new-group-activity"
            X.2Ao r0 = r1.A04(r4, r0)
            r4.A0C = r0
            r0 = 2131362707(0x7f0a0393, float:1.8345202E38)
            android.view.View r1 = r4.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.A04 = r1
            X.4k5 r0 = new X.4k5
            r0.<init>(r4)
            r1.setOnClickListener(r0)
            r5 = 0
            if (r28 != 0) goto L_0x019a
            r4.A01 = r5
            X.120 r0 = r4.A0A
            X.0sH r1 = r4.A0b
            java.io.File r0 = r0.A00(r1)
            X.AnonymousClass00B.A06(r0)
            r0.delete()
            X.120 r0 = r4.A0A
            java.io.File r0 = r0.A01(r1)
            X.AnonymousClass00B.A06(r0)
            r0.delete()
        L_0x0063:
            r0 = 2131364431(0x7f0a0a4f, float:1.8348699E38)
            android.view.View r0 = r4.findViewById(r0)
            com.obwhatsapp.KeyboardPopupLayout r0 = (com.obwhatsapp.KeyboardPopupLayout) r0
            r4.A06 = r0
            r0 = 2131363376(0x7f0a0630, float:1.834656E38)
            android.view.View r14 = r4.findViewById(r0)
            android.widget.ImageButton r14 = (android.widget.ImageButton) r14
            r0 = 2131363966(0x7f0a087e, float:1.8347756E38)
            android.view.View r0 = r4.findViewById(r0)
            com.obwhatsapp.WaEditText r0 = (com.obwhatsapp.WaEditText) r0
            r4.A07 = r0
            r0.requestFocus()
            X.0pd r0 = r4.A0C
            r16 = r0
            X.1Ai r15 = r4.A0B
            X.0so r13 = r4.A03
            X.0um r12 = r4.A0B
            X.11d r11 = r4.A0L
            X.01V r10 = r4.A08
            X.013 r9 = r4.A01
            X.1BQ r8 = r4.A0M
            X.0rz r7 = r4.A09
            X.0u3 r3 = r4.A0S
            com.obwhatsapp.KeyboardPopupLayout r2 = r4.A06
            com.obwhatsapp.WaEditText r0 = r4.A07
            X.2JH r1 = new X.2JH
            r22 = r12
            r23 = r8
            r24 = r16
            r25 = r3
            r26 = r15
            r21 = r11
            r20 = r9
            r19 = r7
            r18 = r10
            r17 = r0
            r16 = r2
            r15 = r13
            r13 = r4
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4.A0K = r1
            X.5RN r0 = r4.A0Z
            r1.A0C(r0)
            r0 = 2131363408(0x7f0a0650, float:1.8346624E38)
            android.view.View r9 = r4.findViewById(r0)
            com.obwhatsapp.emoji.search.EmojiSearchContainer r9 = (com.obwhatsapp.emoji.search.EmojiSearchContainer) r9
            X.2JH r8 = r4.A0K
            X.0um r7 = r4.A0B
            X.11d r3 = r4.A0L
            X.013 r1 = r4.A01
            X.0u3 r0 = r4.A0S
            X.29I r2 = new X.29I
            r14 = r0
            r13 = r9
            r12 = r7
            r11 = r3
            r10 = r8
            r9 = r1
            r7 = r2
            r8 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r1 = 3
            com.facebook.redex.IDxEListenerShape200S0100000_2_I0 r0 = new com.facebook.redex.IDxEListenerShape200S0100000_2_I0
            r0.<init>(r4, r1)
            r2.A00 = r0
            X.2JH r1 = r4.A0K
            X.55E r0 = new X.55E
            r0.<init>(r2)
            r1.A0E = r0
            android.widget.ImageView r1 = r4.A04
            r0 = 2131231448(0x7f0802d8, float:1.8078977E38)
            r1.setImageResource(r0)
            X.013 r1 = r4.A01
            com.obwhatsapp.WaEditText r0 = r4.A07
            X.C45902Bo.A0C(r0, r1)
            X.0s5 r1 = r4.A06
            X.0tC r0 = X.C15910s6.A20
            int r10 = r1.A02(r0)
            com.obwhatsapp.WaEditText r2 = r4.A07
            android.text.InputFilter[] r1 = new android.text.InputFilter[r6]
            X.4jh r0 = new X.4jh
            r0.<init>(r10)
            r1[r5] = r0
            r2.setFilters(r1)
            com.obwhatsapp.WaEditText r9 = r4.A07
            X.0um r8 = r4.A0B
            X.01V r7 = r4.A08
            X.013 r3 = r4.A01
            X.0u3 r2 = r4.A0S
            r0 = 2131366499(0x7f0a1263, float:1.8352893E38)
            android.view.View r1 = r4.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.35O r0 = new X.35O
            r17 = 0
            r15 = r10
            r16 = r10
            r14 = r2
            r13 = r8
            r12 = r3
            r11 = r7
            r10 = r1
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9.addTextChangedListener(r0)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "create_group_for_community"
            boolean r0 = r1.getBooleanExtra(r0, r5)
            r4.A0X = r0
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.0sL r0 = X.C16050sL.A05(r0)
            r4.A0P = r0
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "selected"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            java.util.List r7 = X.C16030sJ.A08(r2, r0)
            int r1 = r7.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r4.A0W = r0
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x01a4
            java.util.Iterator r3 = r7.iterator()
        L_0x0182:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r2 = r3.next()
            X.0rv r2 = (X.C15830rv) r2
            java.util.List r1 = r4.A0W
            X.0sG r0 = r4.A08
            X.0sH r0 = r0.A0A(r2)
            r1.add(r0)
            goto L_0x0182
        L_0x019a:
            java.lang.String r0 = "input_method"
            int r0 = r2.getInt(r0)
            r4.A01 = r0
            goto L_0x0063
        L_0x01a4:
            r0 = 2131364898(0x7f0a0c22, float:1.8349646E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r4, r0)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r4.A03 = r1
            X.3yS r0 = new X.3yS
            r0.<init>(r4, r7)
            r1.setOnClickListener(r0)
            r0 = 2131366054(0x7f0a10a6, float:1.835199E38)
            android.view.View r2 = r4.findViewById(r0)
            android.widget.AbsListView r2 = (android.widget.AbsListView) r2
            java.util.List r1 = r4.A0W
            X.2oJ r0 = new X.2oJ
            r0.<init>(r4, r4, r1)
            r2.setAdapter(r0)
            java.util.List r0 = r4.A0W
            int r7 = r0.size()
            java.util.concurrent.atomic.AtomicReference r2 = r4.A0c
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto L_0x02c0
            X.0ul r1 = r4.A0O
            java.lang.Object r0 = r2.get()
            X.0sL r0 = (X.C16050sL) r0
            int r3 = r1.A05(r0)
            if (r3 <= 0) goto L_0x02c0
            r2 = 2131889629(0x7f120ddd, float:1.9413927E38)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r6] = r0
        L_0x01f8:
            java.lang.String r1 = r4.getString(r2, r1)
            r7 = 2131366053(0x7f0a10a5, float:1.8351989E38)
            android.view.View r0 = r4.findViewById(r7)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            X.C004601z.A0o(r0, r6)
            X.11A r1 = r4.A0G
            X.1ig r0 = r4.A0a
            r1.A02(r0)
            android.content.Intent r1 = r4.getIntent()
            r2 = -1
            java.lang.String r0 = "entry_point"
            int r1 = r1.getIntExtra(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r1 != r2) goto L_0x0224
            r0 = 0
        L_0x0224:
            r4.A0V = r0
            r0 = 2131363956(0x7f0a0874, float:1.8347735E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r4, r0)
            r1.setVisibility(r5)
            X.0wx r0 = r4.A0J
            java.lang.Integer r0 = r0.A04()
            int r0 = r0.intValue()
            r4.A00 = r0
            r4.A35(r0)
            X.3yR r0 = new X.3yR
            r0.<init>(r4)
            r1.setOnClickListener(r0)
            X.AnonymousClass2JP.A02(r1)
            X.0sL r3 = r4.A0P
            X.0pd r2 = r4.A0C
            r1 = 2447(0x98f, float:3.429E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0268
            if (r3 == 0) goto L_0x0292
            X.0rt r0 = r4.A0F
            X.0rx r0 = r0.A06(r3)
            if (r0 == 0) goto L_0x0268
            boolean r0 = r0.A0g
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0292
        L_0x0268:
            X.0sL r2 = r4.A0P
            if (r2 == 0) goto L_0x02b3
            X.0sP r1 = r4.A09
            X.0sG r0 = r4.A08
            X.0sH r0 = r0.A0A(r2)
            java.lang.String r3 = r1.A08(r0)
        L_0x0278:
            r0 = 2131364830(0x7f0a0bde, float:1.8349508E38)
            android.view.View r2 = X.AnonymousClass00T.A05(r4, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setVisibility(r5)
            r1 = 2131889622(0x7f120dd6, float:1.9413913E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r3
            java.lang.String r0 = r4.getString(r1, r0)
            r2.setText(r0)
        L_0x0292:
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x02b2
            android.widget.ImageButton r3 = r4.A03
            X.013 r2 = r4.A01
            r0 = 2131231641(0x7f080399, float:1.8079369E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r4, r0)
            X.25m r0 = new X.25m
            r0.<init>(r1, r2)
            r3.setImageDrawable(r0)
            android.view.View r1 = X.AnonymousClass00T.A05(r4, r7)
            r0 = 8
            r1.setVisibility(r0)
        L_0x02b2:
            return
        L_0x02b3:
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "community_name"
            java.lang.String r3 = r1.getStringExtra(r0)
            if (r3 == 0) goto L_0x0292
            goto L_0x0278
        L_0x02c0:
            r2 = 2131889628(0x7f120ddc, float:1.9413925E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r5] = r0
            goto L_0x01f8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.group.NewGroup.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0G.A03(this.A0a);
        AnonymousClass2Ao r0 = this.A0C;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i2;
        super.onSaveInstanceState(bundle);
        if (this.A0K.isShowing()) {
            i2 = 1;
        } else {
            i2 = 2;
            if (C23061Ai.A00(this.A06)) {
                i2 = 0;
            }
        }
        this.A01 = i2;
        bundle.putInt("input_method", i2);
    }

    public void onStart() {
        super.onStart();
        int i2 = this.A01;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
            } else if (!this.A0K.isShowing()) {
                this.A06.post(new AnonymousClass55G(this));
            }
            getWindow().setSoftInputMode(2);
            return;
        }
        getWindow().setSoftInputMode(4);
    }
}
