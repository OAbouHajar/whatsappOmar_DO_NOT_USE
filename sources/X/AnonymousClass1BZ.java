package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1BZ  reason: invalid class name */
public class AnonymousClass1BZ {
    public C14710pd A00;
    public final C18260wP A01;
    public final AnonymousClass013 A02;
    public final AnonymousClass1BY A03;
    public final C17220uj A04;

    public AnonymousClass1BZ(C18260wP r1, AnonymousClass013 r2, AnonymousClass1BY r3, C17220uj r4) {
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
    }

    public void A00(C001000l r8, String str) {
        Intent intent;
        if (!this.A01.A0A()) {
            boolean A022 = C18260wP.A02(r8);
            int i2 = R.string.str0dc2;
            if (A022) {
                i2 = R.string.str0dc3;
            }
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], i2);
            A012.A01(C91484fz.A00, R.string.str0e87);
            A012.A00().A1G(r8.AGM(), (String) null);
            return;
        }
        boolean A0E = this.A00.A0E(C16620tM.A02, 1836);
        Context baseContext = r8.getBaseContext();
        if (A0E) {
            intent = new Intent();
            intent.setClassName(baseContext, "com.obwhatsapp.wabloks.ui.WaBloksActivity");
            try {
                intent.putExtra("screen_params", new JSONObject().put("params", new JSONObject().put("server_params", new JSONObject().put("entrypointid", str))).toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            intent.putExtra("screen_name", "com.bloks.www.cxthelp.whatsapp");
        } else {
            Uri.Builder A013 = this.A04.A01();
            A013.appendPath("cxt");
            A013.appendQueryParameter("entrypointid", str);
            AnonymousClass013 r3 = this.A02;
            A013.appendQueryParameter("lg", r3.A06());
            A013.appendQueryParameter("lc", r3.A05());
            A013.appendQueryParameter("platform", "android");
            A013.appendQueryParameter("anid", (String) this.A03.A00().second);
            String obj = A013.toString();
            intent = new Intent();
            intent.setClassName(baseContext, "com.obwhatsapp.contextualhelp.ContextualHelpActivity");
            intent.putExtra("webview_url", obj);
            intent.putExtra("webview_hide_url", true);
            intent.putExtra("webview_javascript_enabled", true);
            intent.putExtra("webview_avoid_external", true);
            intent.putExtra("webview_deeplink_enabled", true);
        }
        r8.startActivity(intent);
    }
}
