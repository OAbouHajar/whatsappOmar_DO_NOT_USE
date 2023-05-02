package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.whatsapp.util.Log;

/* renamed from: X.2KM  reason: invalid class name */
public class AnonymousClass2KM extends AnonymousClass2KN {
    public AnonymousClass15P A00;
    public C16190sc A01;
    public AnonymousClass01V A02;
    public C15960sC A03;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00.A00(this);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar);
        others.paintHome(viewGroup, this);
        yo.H1(viewGroup, this);
        return true;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    public void onResume() {
        super.onResume();
        if (!this.A03.A01() && this.A03.A00() != 2) {
            StringBuilder sb = new StringBuilder("settings/resume/wrong-state ");
            sb.append(this.A03.A00());
            Log.i(sb.toString());
            startActivity(C14750ph.A04(this));
            finish();
        }
        if (Build.VERSION.SDK_INT < 23 || !this.A00.A06()) {
            this.A00.A02(false);
            return;
        }
        Intent className = new Intent().setClassName(getPackageName(), "com.obwhatsapp.authentication.AppAuthenticationActivity");
        className.setFlags(131072);
        if (!this.A09) {
            this.A04 = className;
            this.A07 = 202;
        } else {
            startActivityForResult(className, 202);
        }
        overridePendingTransition(0, 0);
    }
}
