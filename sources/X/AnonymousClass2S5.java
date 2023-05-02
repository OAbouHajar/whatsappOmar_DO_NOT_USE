package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape19S0100000_I1_4;
import com.obwhatsapp.R;
import com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.obwhatsapp.registration.RegisterName;
import com.whatsapp.util.Log;

/* renamed from: X.2S5  reason: invalid class name */
public class AnonymousClass2S5 extends AnonymousClass2S7 {
    public int A00 = 0;
    public ProgressBar A01;
    public TextView A02;
    public GoogleDriveRestoreAnimationView A03;
    public final C16250si A04;
    public final C16900tq A05;
    public final C19760yx A06;
    public final /* synthetic */ RegisterName A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2S5(Activity activity, AnonymousClass01V r9, C16440t3 r10, AnonymousClass013 r11, C16250si r12, C16900tq r13, RegisterName registerName, C19760yx r15) {
        super(activity, r9, r10, r11, R.layout.layout0088);
        this.A07 = registerName;
        this.A04 = r12;
        this.A05 = r13;
        this.A06 = r15;
    }

    public void A00(int i2) {
        this.A00 = i2;
        if (i2 == 1) {
            if (this.A03 == null) {
                this.A03 = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_animation_view);
            }
            findViewById(R.id.restore_actions_view).setVisibility(8);
            findViewById(R.id.restore_animation_view).setVisibility(0);
            this.A01 = (ProgressBar) findViewById(R.id.progress);
            this.A02 = (TextView) findViewById(R.id.progress_info);
            this.A01.setVisibility(0);
            this.A01.setIndeterminate(true);
            C812447k.A00(this.A01, AnonymousClass00T.A00(getContext(), R.color.color0541));
            this.A02.setVisibility(0);
            this.A03.A01();
        } else if (i2 == 2) {
            GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A03;
            if (googleDriveRestoreAnimationView == null) {
                googleDriveRestoreAnimationView = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_animation_view);
                this.A03 = googleDriveRestoreAnimationView;
            }
            googleDriveRestoreAnimationView.A04(false);
            findViewById(R.id.restore_actions_view).setVisibility(8);
            ProgressBar progressBar = this.A01;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.A02;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) findViewById(R.id.msgrestore_result_box);
            textView2.setVisibility(0);
            AnonymousClass013 r8 = this.A04;
            C16900tq r2 = this.A05;
            long A002 = (long) r2.A00();
            String A0J = r8.A0J(new Object[]{Integer.valueOf(r2.A00())}, R.plurals.plurals00a0, A002);
            StringBuilder sb = new StringBuilder("restorebackupdialog/after-msgstore-verified/ ");
            sb.append(A0J);
            Log.i(sb.toString());
            textView2.setText(A0J);
            findViewById(R.id.next_btn).setVisibility(0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C434920f.A02(R.color.color04f1, this);
        findViewById(R.id.perform_restore).setOnClickListener(new ViewOnClickCListenerShape19S0100000_I1_4(this, 35));
        findViewById(R.id.dont_restore).setOnClickListener(new ViewOnClickCListenerShape19S0100000_I1_4(this, 33));
        findViewById(R.id.next_btn).setOnClickListener(new ViewOnClickCListenerShape19S0100000_I1_4(this, 34));
        A00(bundle == null ? 0 : bundle.getInt("state"));
        Window window = getWindow();
        AnonymousClass00B.A06(window);
        window.setSoftInputMode(3);
        setTitle(R.string.str009f);
        ((TextView) findViewById(R.id.restore_info)).setText(this.A01.getString(R.string.str0c90, new Object[]{C28961Zl.A01(this.A04, this.A04.A07()).toString()}));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A06.A08();
        Activity activity = this.A01;
        activity.startActivity(C14750ph.A01(activity));
        return true;
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}
