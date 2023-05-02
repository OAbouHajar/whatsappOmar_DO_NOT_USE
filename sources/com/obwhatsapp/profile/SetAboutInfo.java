package com.obwhatsapp.profile;

import X.AnonymousClass29T;
import X.AnonymousClass2AD;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C17140ub;
import X.C211212w;
import X.C32241fu;
import X.C33481ie;
import X.C49132Rg;
import X.C51752cD;
import X.C51762cE;
import X.C51772cF;
import X.C64273Nm;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.redex.IDxCallbackShape188S0100000_2_I1;
import com.facebook.redex.IDxIRunnableShape287S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.contact.IDxCObserverShape67S0100000_1_I1;
import java.util.ArrayList;

public class SetAboutInfo extends C14530pL implements AnonymousClass2AD {
    public static ArrayList A09;
    public View A00;
    public C211212w A01;
    public TextEmojiLabel A02;
    public C17140ub A03;
    public C64273Nm A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final C33481ie A08;

    public SetAboutInfo() {
        this(0);
        this.A07 = new Handler(Looper.getMainLooper(), new IDxCallbackShape188S0100000_2_I1(this, 3));
        this.A08 = new IDxCObserverShape67S0100000_1_I1(this, 2);
    }

    public SetAboutInfo(int i2) {
        this.A05 = false;
        C13680ns.A1G(this, 98);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A01 = (C211212w) r1.AG4.get();
            this.A03 = C16150sX.A0N(r1);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A35() {
        /*
            r4 = this;
            java.lang.String r1 = "status"
            r0 = 0
            java.io.FileOutputStream r0 = r4.openFileOutput(r1, r0)     // Catch:{ IOException -> 0x0049 }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0049 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0049 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0044 }
            java.util.ArrayList r0 = A09     // Catch:{ all -> 0x0044 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0044 }
        L_0x0017:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = X.AnonymousClass000.A0m(r1)     // Catch:{ all -> 0x0044 }
            r2.append(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0017
        L_0x002a:
            int r0 = r2.length()     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 <= r1) goto L_0x0039
            int r0 = r2.length()     // Catch:{ all -> 0x0044 }
            int r0 = r0 - r1
            r2.deleteCharAt(r0)     // Catch:{ all -> 0x0044 }
        L_0x0039:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0044 }
            r3.writeObject(r0)     // Catch:{ all -> 0x0044 }
            r3.close()     // Catch:{ IOException -> 0x0049 }
            return
        L_0x0044:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            java.lang.String r0 = "SetStatus/writeStatusListString"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.profile.SetAboutInfo.A35():void");
    }

    public void A36(String str) {
        if (!A2l(R.string.str0008)) {
            AnonymousClass29T.A01(this, 2);
            C211212w r3 = this.A01;
            C51762cE r5 = new C51762cE(this);
            IDxIRunnableShape287S0100000_2_I1 iDxIRunnableShape287S0100000_2_I1 = new IDxIRunnableShape287S0100000_2_I1(this, 3);
            C51772cF r1 = new C51772cF(this);
            if (r3.A06.A05) {
                r3.A0A.A09(Message.obtain((Handler) null, 0, 29, 0, new C51752cD(r1, r5, iDxIRunnableShape287S0100000_2_I1, str)), false);
            } else {
                Handler handler = this.A07;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
            }
            this.A07.sendEmptyMessageDelayed(0, 32000);
        }
    }

    public void ANi(String str) {
    }

    public void AQG(int i2, String str) {
        if (i2 == 4 && str.length() > 0 && !str.equals(C13690nt.A0b(this.A02))) {
            this.A00.setOnClickListener((View.OnClickListener) null);
            A36(str);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        if (menuItem.getItemId() == 1) {
            A09.remove(adapterContextMenuInfo.position);
            this.A04.notifyDataSetChanged();
            A35();
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0082 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r0 = 2131889579(0x7f120dab, float:1.9413826E38)
            r7.setTitle(r0)
            X.02i r1 = r7.x()
            if (r1 == 0) goto L_0x0013
            r0 = 1
            r1.A0N(r0)
        L_0x0013:
            r0 = 2131559748(0x7f0d0544, float:1.8744849E38)
            r7.setContentView((int) r0)
            r0 = 2131366360(0x7f0a11d8, float:1.8352611E38)
            android.view.View r1 = r7.findViewById(r0)
            r7.A00 = r1
            r0 = 12
            X.C13680ns.A15(r1, r7, r0)
            r0 = 2131366384(0x7f0a11f0, float:1.835266E38)
            android.view.View r2 = r7.findViewById(r0)
            com.obwhatsapp.TextEmojiLabel r2 = (com.obwhatsapp.TextEmojiLabel) r2
            r7.A02 = r2
            X.12w r0 = r7.A01
            java.lang.String r1 = r0.A00()
            r0 = 0
            r2.A0I(r0, r1)
            java.io.File r0 = r7.getFilesDir()
            java.lang.String r1 = "status"
            java.io.File r0 = X.C13700nu.A0C(r0, r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x008e
            java.io.FileInputStream r0 = r7.openFileInput(r1)     // Catch:{ ClassNotFoundException -> 0x0083, IOException -> 0x008a }
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x0083, IOException -> 0x008a }
            r6.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0083, IOException -> 0x008a }
            java.lang.Object r1 = r6.readObject()     // Catch:{ all -> 0x007e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x007e }
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x007e }
            A09 = r5     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "\n"
            java.lang.String[] r4 = r1.split(r0)     // Catch:{ all -> 0x007e }
            int r3 = r4.length     // Catch:{ all -> 0x007e }
            r2 = 0
        L_0x006a:
            if (r2 >= r3) goto L_0x007a
            r1 = r4[r2]     // Catch:{ all -> 0x007e }
            int r0 = r1.length()     // Catch:{ all -> 0x007e }
            if (r0 <= 0) goto L_0x0077
            r5.add(r1)     // Catch:{ all -> 0x007e }
        L_0x0077:
            int r2 = r2 + 1
            goto L_0x006a
        L_0x007a:
            r6.close()     // Catch:{ ClassNotFoundException -> 0x0083, IOException -> 0x008a }
            goto L_0x00b3
        L_0x007e:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0082 }
        L_0x0082:
            throw r0     // Catch:{ ClassNotFoundException -> 0x0083, IOException -> 0x008a }
        L_0x0083:
            r1 = move-exception
            java.lang.String r0 = "create/status/serialization_error"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x008e
        L_0x008a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x008e:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2130903049(0x7f030009, float:1.7412905E38)
            android.content.res.TypedArray r3 = r1.obtainTypedArray(r0)
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00fd }
            r1 = 0
        L_0x009e:
            int r0 = r3.length()     // Catch:{ all -> 0x00fd }
            if (r1 >= r0) goto L_0x00ae
            java.lang.String r0 = r3.getString(r1)     // Catch:{ all -> 0x00fd }
            r2.add(r0)     // Catch:{ all -> 0x00fd }
            int r1 = r1 + 1
            goto L_0x009e
        L_0x00ae:
            r3.recycle()
            A09 = r2
        L_0x00b3:
            r0 = 2131364333(0x7f0a09ed, float:1.83485E38)
            android.view.View r2 = r7.findViewById(r0)
            android.widget.AbsListView r2 = (android.widget.AbsListView) r2
            r0 = 2131364339(0x7f0a09f3, float:1.8348512E38)
            android.view.View r0 = r7.findViewById(r0)
            r2.setEmptyView(r0)
            java.util.ArrayList r1 = A09
            X.3Nm r0 = new X.3Nm
            r0.<init>(r7, r7, r1)
            r7.A04 = r0
            r2.setAdapter(r0)
            X.0t3 r1 = r7.A05
            X.3yO r0 = new X.3yO
            r0.<init>(r1, r7)
            r2.setOnItemClickListener(r0)
            r7.registerForContextMenu(r2)
            X.0ub r1 = r7.A03
            X.1ie r0 = r7.A08
            r1.A02(r0)
            r1 = 2130969680(0x7f040450, float:1.7548049E38)
            r0 = 2131101454(0x7f06070e, float:1.7815318E38)
            int r1 = X.C434920f.A00(r7, r1, r0)
            r0 = 2131366385(0x7f0a11f1, float:1.8352662E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.AnonymousClass2SR.A08(r0, r1)
            return
        L_0x00fd:
            r0 = move-exception
            r3.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.profile.SetAboutInfo.onCreate(android.os.Bundle):void");
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, R.string.str06a4);
    }

    public Dialog onCreateDialog(int i2) {
        String str;
        int i3;
        if (i2 == 0) {
            str = getString(R.string.str0b79);
            i3 = R.string.str0b78;
        } else if (i2 == 1) {
            str = getString(R.string.str0b76);
            i3 = R.string.str0b75;
        } else if (i2 == 2) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(getString(R.string.str0b79));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i2 != 3) {
            return super.onCreateDialog(i2);
        } else {
            C32241fu A002 = C32241fu.A00(this);
            A002.A01(R.string.str0687);
            C13680ns.A1H(A002, this, 87, R.string.str0684);
            C13690nt.A1E(A002);
            return A002.create();
        }
        return ProgressDialog.show(this, str, getString(i3), true, false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.str0684);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03.A03(this.A08);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        } else if (A09.size() == 0) {
            Afg(R.string.str0df4);
            return true;
        } else {
            AnonymousClass29T.A01(this, 3);
            return true;
        }
    }
}
