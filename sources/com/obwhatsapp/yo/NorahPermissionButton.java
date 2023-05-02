package com.obwhatsapp.yo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;
import com.obwhatsapp.WaButton;

public class NorahPermissionButton extends WaButton implements View.OnClickListener {
    public NorahPermissionButton(Context context) {
        super(context);
        init();
    }

    public NorahPermissionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public NorahPermissionButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
    }

    private void init() {
        setOnClickListener(this);
    }

    public String getString(String str) {
        return getContext().getString(getContext().getResources().getIdentifier(str, "string", getContext().getPackageName()));
    }

    public void onClick(View view) {
        try {
            Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
            intent.setData(Uri.fromParts("package", getContext().getPackageName(), (String) null));
            getContext().startActivity(intent);
            Toast.makeText(getContext(), getString("NorahPermission"), 5).show();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
