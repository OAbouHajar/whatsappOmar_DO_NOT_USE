package X;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1yV  reason: invalid class name */
public interface AnonymousClass1yV extends AnonymousClass1YG, AnonymousClass1yW, AnonymousClass1yP, AnonymousClass1yX, AnonymousClass1U3, AnonymousClass1yY, AnonymousClass1yZ, C42731ya, C42741yb, C42751yc, C42761yd, C26181Mq, C42771ye, C42781yf, C42791yg, C42801yh, C42811yi {
    Collection ACQ();

    ListView ADA();

    C005402i AGK();

    AnonymousClass02C AGM();

    boolean AJX();

    void AKv(String str);

    void AKw(String str);

    void AL0(short s2);

    void AL7(String str);

    void ANY();

    void APM();

    void AW4();

    void AYM();

    void AYN(Bundle bundle);

    Dialog AYO(int i2);

    boolean AYP(Menu menu);

    boolean AYR(int i2, KeyEvent keyEvent);

    boolean AYS(int i2, KeyEvent keyEvent);

    boolean AYT(Menu menu);

    void AYV();

    void AYW();

    void Ac1();

    void Aem(Toolbar toolbar);

    void Afc(DialogFragment dialogFragment);

    void Afq(int i2);

    void Ag3(Intent intent, int i2);

    AnonymousClass05J AgA(C009804r r1);

    boolean AgV(MotionEvent motionEvent);

    void Agv(List list);

    View findViewById(int i2);

    void finish();

    void finishAndRemoveTask();

    Intent getIntent();

    LayoutInflater getLayoutInflater();

    Resources getResources();

    String getString(int i2);

    String getString(int i2, Object... objArr);

    Window getWindow();

    WindowManager getWindowManager();

    boolean hasWindowFocus();

    void invalidateOptionsMenu();

    boolean isFinishing();

    boolean isInMultiWindowMode();

    boolean isTaskRoot();

    void overridePendingTransition(int i2, int i3);

    Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

    void setContentView(int i2);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i2);

    void unregisterReceiver(BroadcastReceiver broadcastReceiver);
}
