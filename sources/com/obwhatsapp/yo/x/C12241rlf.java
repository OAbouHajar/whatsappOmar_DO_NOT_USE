package com.obwhatsapp.yo.x;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.obwhatsapp.yo.freqids;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.io.FileUtils;

/* renamed from: com.obwhatsapp.yo.x.rlf */
public class C12241rlf extends Activity {

    /* renamed from: a  reason: collision with root package name */
    StringBuilder f112a;

    /* renamed from: b  reason: collision with root package name */
    ProgressDialog f113b;

    /* renamed from: c  reason: collision with root package name */
    ListView f114c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList f115d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList f116e;

    /* renamed from: f  reason: collision with root package name */
    ArrayAdapter f117f;

    /* renamed from: g  reason: collision with root package name */
    df f118g = null;

    /* renamed from: h  reason: collision with root package name */
    boolean f119h;

    /* renamed from: i  reason: collision with root package name */
    boolean f120i;

    /* renamed from: j  reason: collision with root package name */
    boolean f121j;

    /* renamed from: k  reason: collision with root package name */
    boolean f122k;

    /* renamed from: l  reason: collision with root package name */
    boolean f123l;

    /* renamed from: m  reason: collision with root package name */
    File f124m;

    public void onCreate(Bundle bundle) {
        String format;
        super.onCreate(bundle);
        setContentView(freqids.readlog());
        if (Build.VERSION.SDK_INT >= 14 && getActionBar() != null) {
            getActionBar().setIcon(new ColorDrawable(getResources().getColor(17170445)));
        }
        this.f114c = (ListView) findViewById(freqids.loglist());
        this.f115d = new ArrayList();
        this.f116e = new ArrayList();
        this.f123l = true;
        this.f124m = new File(String.valueOf(getFilesDir().getAbsolutePath()) + "/Logs", "whatsapp.log");
        if (!this.f124m.exists()) {
            this.f124m = new File(Environment.getExternalStorageDirectory(), "/OBWhatsApp/Yo/whatsapp.log");
        }
        new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(this.f124m.lastModified()));
        long length = this.f124m.length();
        StringBuilder append = new StringBuilder(String.valueOf(this.f124m.getName())).append(" ");
        if (length < FileUtils.ONE_KB) {
            format = String.valueOf(length) + " B";
        } else {
            int log = (int) (Math.log((double) length) / Math.log(1024.0d));
            format = String.format("%.1f %sb", new Object[]{Double.valueOf(((double) length) / Math.pow(1024.0d, (double) log)), new StringBuilder(String.valueOf("KMGTPE".charAt(log - 1))).toString()});
        }
        setTitle(append.append(format).toString());
        if (this.f124m.exists()) {
            this.f118g = new df(this, (byte) 0);
            this.f118g.execute(new File[]{this.f124m});
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.f115d = new ArrayList();
        this.f116e = new ArrayList();
        if (menuItem.isChecked()) {
            menuItem.setChecked(false);
        } else {
            menuItem.setChecked(true);
        }
        switch (menuItem.getItemId()) {
            case 2131690627:
                this.f118g = new df(this, (byte) 0);
                this.f118g.execute(new File[]{this.f124m});
                return true;
            case 2131690712:
                this.f123l = menuItem.isChecked();
                Boolean valueOf = Boolean.valueOf(this.f123l);
                this.f118g = new df(this, (byte) 0);
                this.f118g.execute(new File[]{this.f124m});
                return true;
            case 2131690713:
                this.f119h = menuItem.isChecked();
                Boolean valueOf2 = Boolean.valueOf(this.f119h);
                this.f118g = new df(this, (byte) 0);
                this.f118g.execute(new File[]{this.f124m});
                return true;
            case 2131690714:
                this.f120i = menuItem.isChecked();
                Boolean valueOf3 = Boolean.valueOf(this.f120i);
                this.f118g = new df(this, (byte) 0);
                this.f118g.execute(new File[]{this.f124m});
                return true;
            case 2131690715:
                this.f121j = menuItem.isChecked();
                Boolean valueOf4 = Boolean.valueOf(this.f121j);
                this.f118g = new df(this, (byte) 0);
                this.f118g.execute(new File[]{this.f124m});
                return true;
            case 2131690716:
                this.f122k = menuItem.isChecked();
                Boolean valueOf5 = Boolean.valueOf(this.f122k);
                this.f118g = new df(this, (byte) 0);
                this.f118g.execute(new File[]{this.f124m});
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
