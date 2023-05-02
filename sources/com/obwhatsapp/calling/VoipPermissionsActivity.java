package com.obwhatsapp.calling;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass04o;
import X.AnonymousClass1D0;
import X.AnonymousClass1W4;
import X.AnonymousClass2Re;
import X.AnonymousClass2TA;
import X.AnonymousClass3DL;
import X.C000900k;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14710pd;
import X.C14870pt;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16040sK;
import X.C16260sj;
import X.C16300so;
import X.C16490t9;
import X.C204310c;
import X.C32601gl;
import X.C35011lE;
import X.C37831po;
import X.C54932iV;
import X.C74593qn;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VoipPermissionsActivity extends C000900k implements AnonymousClass006 {
    public int A00;
    public int A01;
    public C16300so A02;
    public C14870pt A03;
    public C16040sK A04;
    public C204310c A05;
    public C16000sG A06;
    public C16260sj A07;
    public AnonymousClass1D0 A08;
    public C14710pd A09;
    public C16490t9 A0A;
    public GroupJid A0B;
    public C37831po A0C;
    public String A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public final Object A0H;
    public volatile AnonymousClass2Re A0I;

    public VoipPermissionsActivity() {
        this(0);
        this.A0E = AnonymousClass000.A0u();
        this.A0D = null;
    }

    public VoipPermissionsActivity(int i2) {
        this.A0H = C13690nt.A0Y();
        this.A0F = false;
        A0T(new AnonymousClass3DL(this));
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A00(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A0I == null) {
            synchronized (this.A0H) {
                if (this.A0I == null) {
                    this.A0I = new AnonymousClass2Re(this);
                }
            }
        }
        return this.A0I.generatedComponent();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        StringBuilder A0r = AnonymousClass000.A0r("VoipPermissionsActivity onActivityResult got result: ");
        A0r.append(i3);
        A0r.append(" for request: ");
        A0r.append(i2);
        A0r.append(" data: ");
        A0r.append(intent);
        C13680ns.A1V(A0r);
        if (i2 != 152 && i2 != 156) {
            StringBuilder A0r2 = AnonymousClass000.A0r("VoipPermissionsActivity onActivityResult unhandled request: ");
            A0r2.append(i2);
            A0r2.append(" result: ");
            A0r2.append(i3);
            C13680ns.A1V(A0r2);
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            boolean z2 = true;
            if (this.A0C == null) {
                ArrayList A0u = AnonymousClass000.A0u();
                Iterator it = this.A0E.iterator();
                while (it.hasNext()) {
                    C16010sH A082 = this.A06.A08(C13700nu.A0B(it));
                    if (A082 != null) {
                        A0u.add(A082);
                    }
                }
                if (!C32601gl.A04(this.A04, this.A09) || this.A0D == null) {
                    Log.i("VoipPermissionsActivity onActivityResult starting call");
                    this.A05.A03(this, this.A0B, A0u, this.A00, this.A0G);
                } else {
                    Log.i("VoipPermissionsActivity onActivityResult starting call link lobby");
                    if (this.A01 == 0) {
                        z2 = false;
                    }
                    AnonymousClass00B.A0B("Valid call link lobby entry point required", z2);
                    this.A05.A07(this, this.A0D, this.A01, this.A0G);
                }
            } else {
                if (this.A01 == 0) {
                    z2 = false;
                }
                AnonymousClass00B.A0B("Valid re-join lobby entry point required", z2);
                this.A05.A06(this, this.A0C, this.A01);
            }
        } else if (i2 == 156 && i3 == 0) {
            C74593qn r1 = new C74593qn();
            r1.A00 = "voip_call_fail_phone_perm_denied";
            this.A0A.A06(r1);
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        Log.i("voip/VoipPermissionsActivity/onCreate");
        super.onCreate(bundle);
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("join_call_log", false);
        this.A01 = intent.getIntExtra("lobby_entry_point", 0);
        if (booleanExtra) {
            int intExtra = intent.getIntExtra("call_log_transaction_id", -1);
            String stringExtra = intent.getStringExtra("call_log_call_id");
            boolean booleanExtra2 = intent.getBooleanExtra("call_log_from_me", false);
            try {
                this.A0C = this.A08.A03(new C35011lE(intExtra, UserJid.get(intent.getStringExtra("call_log_user_jid")), stringExtra, booleanExtra2));
            } catch (AnonymousClass1W4 unused) {
                Log.e("voip/VoipPermissionsActivity/onCreate invalid jid");
                return;
            }
        } else {
            this.A0D = intent.getStringExtra("call_link_lobby_token");
            this.A0E = C16030sJ.A07(intent, UserJid.class);
            if (!C32601gl.A04(this.A04, this.A09) || this.A0D == null) {
                AnonymousClass00B.A0B("There must be at least one jid", C13700nu.A0i(this.A0E));
            }
            this.A00 = intent.getIntExtra("call_from", -1);
            if (intent.hasExtra("group_jid")) {
                this.A0B = GroupJid.getNullable(intent.getStringExtra("group_jid"));
            }
        }
        this.A0G = intent.getBooleanExtra("video_call", false);
        int intExtra2 = intent.getIntExtra("permission_type", -1);
        if (intExtra2 == 0) {
            RequestPermissionActivity.A0M(this, this.A03, this.A07, this.A0G);
        } else if (intExtra2 != 1) {
            Log.i(C13680ns.A0c(intExtra2, "voip/VoipPermissionsActivity/onCreate unhandled permissionType: "));
        } else {
            Log.i("request/permission/checkPhonePermissionForVoipCall");
            C54932iV r2 = new C54932iV(this);
            r2.A01 = R.drawable.permission_call;
            r2.A06 = R.string.str11ea;
            r2.A09 = R.string.str11e9;
            r2.A0K = new String[]{"android.permission.READ_PHONE_STATE"};
            r2.A0D = true;
            startActivityForResult(r2.A00(), 156);
        }
    }
}
