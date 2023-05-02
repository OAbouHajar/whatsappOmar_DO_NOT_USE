package com.obwhatsapp.qrcode.contactqr;

import X.AnonymousClass01V;
import X.AnonymousClass156;
import X.AnonymousClass1G1;
import X.AnonymousClass1ND;
import X.C14650pX;
import X.C14710pd;
import X.C14870pt;
import X.C15800rs;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C17030uP;
import X.C17090uW;
import X.C17120uZ;
import X.C17180uf;
import X.C17190ug;
import X.C18090w8;
import X.C18260wP;
import X.C18290wS;
import X.C19820z3;
import X.C208811y;
import X.C226818w;
import X.C23101Am;
import X.C23181Au;
import X.C23201Aw;
import X.C24961Hy;
import X.C51202bB;
import X.C59252vb;
import android.os.Bundle;

public class QrSheetDeepLinkActivity extends C59252vb implements C14650pX {
    public C23101Am A00;
    public AnonymousClass1G1 A01;
    public C208811y A02;
    public C17090uW A03;
    public C24961Hy A04;
    public C17180uf A05;
    public C16000sG A06;
    public AnonymousClass156 A07;
    public C17030uP A08;
    public C16080sP A09;
    public C23181Au A0A;
    public C15800rs A0B;
    public C17120uZ A0C;
    public C19820z3 A0D;
    public C226818w A0E;
    public AnonymousClass1ND A0F;
    public C16490t9 A0G;
    public C17190ug A0H;
    public C18090w8 A0I;
    public C18290wS A0J;
    public C51202bB A0K;
    public C23201Aw A0L;
    public String A0M;

    public void AVW() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C16440t3 r27 = this.A05;
        C14710pd r31 = this.A0C;
        C14870pt r45 = this.A05;
        C16040sK r44 = this.A01;
        C16320sq r36 = this.A05;
        C16490t9 r32 = this.A0G;
        C23101Am r43 = this.A00;
        C15900s5 r42 = this.A06;
        C17090uW r41 = this.A03;
        C17190ug r33 = this.A0H;
        C16000sG r20 = this.A06;
        AnonymousClass01V r19 = this.A08;
        C16080sP r18 = this.A09;
        C208811y r17 = this.A02;
        C23181Au r15 = this.A0A;
        AnonymousClass1G1 r14 = this.A01;
        C226818w r13 = this.A0E;
        C17030uP r11 = this.A08;
        C15800rs r10 = this.A0B;
        C23201Aw r9 = this.A0L;
        C18090w8 r8 = this.A0I;
        C17180uf r7 = this.A05;
        C18260wP r6 = this.A07;
        AnonymousClass156 r5 = this.A07;
        C19820z3 r4 = this.A0D;
        C17120uZ r3 = this.A0C;
        C18290wS r35 = this.A0J;
        C23201Aw r37 = r9;
        C51202bB r82 = new C51202bB(r43, r14, r17, this, r45, r41, r44, r42, this.A04, r7, r6, r20, r5, r11, r18, r15, r10, r19, r27, r3, r4, r13, r31, r32, r33, r8, r35, r36, r37, (Integer) null, false, false);
        this.A0K = r82;
        r82.A01 = getIntent().getStringExtra("extra_deep_link_session_id");
        this.A0K.A02 = true;
        this.A0M = getIntent().getStringExtra("qrcode");
        boolean booleanExtra = getIntent().getBooleanExtra("from_internal_deep_link_click", false);
        String str = this.A0M;
        if (str != null && !this.A0K.A0a) {
            this.A0M = str;
            this.A0K.A02(str, 5, false, booleanExtra);
        }
    }
}
