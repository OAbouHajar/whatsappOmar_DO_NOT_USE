package com.obwhatsapp.contact;

import X.C14530pL;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputLayout;
import com.obwhatsapp.R;

public class ContactFormActivity extends C14530pL {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0041);
        ((TextInputLayout) findViewById(R.id.name_input_layout)).setHint(getResources().getString(R.string.str054d));
    }
}
