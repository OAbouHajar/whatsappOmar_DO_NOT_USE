package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.obwhatsapp.R;

/* renamed from: X.06V  reason: invalid class name */
public class AnonymousClass06V extends ContextWrapper {
    public int A00;
    public Configuration A01;
    public Resources.Theme A02;
    public Resources A03;
    public LayoutInflater A04;

    public AnonymousClass06V() {
        super((Context) null);
    }

    public AnonymousClass06V(Context context, int i2) {
        super(context);
        this.A00 = i2;
    }

    public AnonymousClass06V(Context context, Resources.Theme theme) {
        super(context);
        this.A02 = theme;
    }

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.A02.setTo(theme);
            }
        }
        this.A02.applyStyle(this.A00, true);
    }

    public void A01(Configuration configuration) {
        if (this.A03 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.A01 == null) {
            this.A01 = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        Resources resources = this.A03;
        if (resources == null) {
            Configuration configuration = this.A01;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.A01);
                resources = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.A03 = resources;
        }
        return resources;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A04;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.A04 = cloneInContext;
        return cloneInContext;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.A02;
        if (theme != null) {
            return theme;
        }
        if (this.A00 == 0) {
            this.A00 = R.style.style0335;
        }
        A00();
        return this.A02;
    }

    public void setTheme(int i2) {
        if (this.A00 != i2) {
            this.A00 = i2;
            A00();
        }
    }
}
