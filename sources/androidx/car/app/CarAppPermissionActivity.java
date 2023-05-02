package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass07P;
import X.AnonymousClass09N;
import X.AnonymousClass0ZF;
import X.C001100m;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.IOnRequestPermissionsListener;

public class CarAppPermissionActivity extends C001100m {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle bundle2 = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            int i2 = bundle2 != null ? bundle2.getInt("androidx.car.app.theme") : 0;
            Context createConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i2 != 0) {
                createConfigurationContext.setTheme(i2);
            }
            int identifier = createConfigurationContext.getResources().getIdentifier("carPermissionActivityLayout", "attr", getPackageName());
            if (identifier != 0) {
                int resourceId = createConfigurationContext.getTheme().obtainStyledAttributes(new int[]{identifier}).getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentView(resourceId);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Intent intent = getIntent();
        if (intent == null || !"androidx.car.app.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            Log.e("CarApp", AnonymousClass000.A0h(intent == null ? "null Intent" : intent.getAction(), AnonymousClass000.A0r("Unexpected intent action for CarAppPermissionActivity: ")));
        } else {
            Bundle extras = intent.getExtras();
            IOnRequestPermissionsListener asInterface = IOnRequestPermissionsListener.Stub.asInterface(extras.getBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY"));
            String[] stringArray = extras.getStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY");
            if (asInterface == null || stringArray == null) {
                Log.e("CarApp", "Intent to request permissions is missing the callback binder");
            } else {
                A0O(new AnonymousClass0ZF(this, asInterface), new AnonymousClass07P()).A00((AnonymousClass09N) null, stringArray);
                return;
            }
        }
        finish();
    }
}
