package com.AssemMods.accounts;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.AssemMods.accounts.views.AccountRow;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.yo.yo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.io.FileUtils;

public class AccountsManager {
    private File accountsFolder;
    private String appPath;
    private Context context;
    private int lastAccountId = 0;
    private int sharedPrefsIndex = 0;
    private String sharedPrefsPath;

    public static class Account {
        private int id;
        private String name;
        private String phoneNumber;
        private Drawable profilePicture;

        private Account(String str, String str2, Drawable drawable, int i2) {
            this.name = str;
            this.phoneNumber = str2;
            this.profilePicture = drawable;
            this.id = i2;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public Drawable getProfilePicture() {
            return this.profilePicture;
        }
    }

    public AccountsManager(Context context2) {
        this.context = context2;
        this.appPath = Utils.getApplicationPath(yo.getCtx()) + "/";
        this.sharedPrefsPath = this.appPath + "shared_prefs/";
        File file = new File(this.appPath + "Accounts");
        this.accountsFolder = file;
        if (!file.exists()) {
            this.accountsFolder.mkdirs();
        }
        setLastAccountId();
    }

    private void addAccountAndSwitch() {
        int i2 = this.lastAccountId;
        int i3 = i2 + 1;
        this.lastAccountId = i2 + 1;
        File file = new File(this.accountsFolder.getAbsolutePath() + "/" + i3 + "/");
        File file2 = new File(this.accountsFolder.getAbsolutePath() + "/" + i3 + "/shared_prefs/");
        File file3 = new File(this.accountsFolder.getAbsolutePath() + "/" + i3 + "/databases/");
        file.mkdirs();
        file2.mkdirs();
        file3.mkdirs();
        new File(this.accountsFolder.getAbsolutePath() + "/" + i3 + "/files/").mkdirs();
        switchToAccount(new Account((String) null, (String) null, (Drawable) null, i3));
    }

    private int getSharedPrefsIndex() {
        int i2 = this.sharedPrefsIndex;
        this.sharedPrefsIndex = i2 + 1;
        return i2;
    }

    private void setLastAccountId() {
        for (File file : this.accountsFolder.listFiles()) {
            if (!file.isFile()) {
                try {
                    int parseInt = Integer.parseInt(file.getName());
                    int i2 = this.lastAccountId;
                    if (parseInt > i2) {
                        i2 = parseInt;
                    }
                    this.lastAccountId = i2;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public void addSwitchAccount(Context context2) {
        View inflate = LayoutInflater.from(context2).inflate(yo.getID("add_multi_accounts", "layout"), (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(yo.getID("add_account_row", "id"));
        ((WaImageView) inflate.findViewById(yo.getID("add_account_btn", "id"))).setOnClickListener(new AccountsManager3(this, context2));
        Iterator<Account> it = getAccounts().iterator();
        while (it.hasNext()) {
            AccountRow accountRow = new AccountRow(context2);
            accountRow.setAccount(it.next());
            linearLayout.addView(accountRow, new LinearLayout.LayoutParams(-1, -2));
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context2);
        builder.setView(inflate);
        builder.create().show();
    }

    public ArrayList<Account> getAccounts() {
        String str;
        String str2 = ".xml";
        ArrayList<Account> arrayList = new ArrayList<>();
        try {
            File[] listFiles = this.accountsFolder.listFiles();
            listFiles.getClass();
            File[] fileArr = listFiles;
            int length = fileArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i3 < length) {
                File file = fileArr[i3];
                if (!file.isFile()) {
                    File file2 = new File(file.getAbsolutePath() + "/shared_prefs/com.obwhatsapp_preferences_light.xml");
                    File file3 = new File(file.getAbsolutePath() + "/shared_prefs/registration.RegisterPhone.xml");
                    if (!file2.exists() || !file3.exists()) {
                        str = str2;
                    } else {
                        int sharedPrefsIndex2 = getSharedPrefsIndex();
                        FileUtils.copyFile(file2, new File(this.sharedPrefsPath + "RWhatsApp_" + sharedPrefsIndex2 + str2));
                        String string = yo.getCtx().getSharedPreferences("RWhatsApp_" + sharedPrefsIndex2, i2).getString("push_name", "");
                        int sharedPrefsIndex3 = getSharedPrefsIndex();
                        FileUtils.copyFile(file3, new File(this.sharedPrefsPath + "RWhatsApp_" + sharedPrefsIndex3 + str2));
                        SharedPreferences sharedPreferences = yo.getCtx().getSharedPreferences("RWhatsApp_" + sharedPrefsIndex3, 0);
                        String str3 = "+" + sharedPreferences.getString("com.obwhatsapp.registration.RegisterPhone.country_code", "") + " " + sharedPreferences.getString("com.obwhatsapp.registration.RegisterPhone.input_phone_number", "");
                        int parseInt = Integer.parseInt(file.getName());
                        Drawable drawable = null;
                        StringBuilder sb = new StringBuilder();
                        str = str2;
                        sb.append(file.getAbsolutePath());
                        sb.append("/files/me.jpg");
                        File file4 = new File(sb.toString());
                        if (file4.exists()) {
                            drawable = Drawable.createFromPath(file4.getAbsolutePath());
                        }
                        arrayList.add(new Account(string, str3, drawable, parseInt));
                    }
                } else {
                    str = str2;
                }
                i3++;
                str2 = str;
                i2 = 0;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    public LinearLayout getAccountsListLinearLayout(Context context2) {
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        Iterator<Account> it = getAccounts().iterator();
        while (it.hasNext()) {
            AccountRow accountRow = new AccountRow(context2);
            accountRow.setAccount(it.next());
            linearLayout.addView(accountRow, new LinearLayout.LayoutParams(-1, -2));
        }
        return linearLayout;
    }

    public /* synthetic */ void lambda$addSwitchAccount$2$AccountsManager(Context context2, View view) {
        showAddAccountPrompt(context2);
    }

    public /* synthetic */ void lambda$showAddAccountPrompt$0$AccountsManager(DialogInterface dialogInterface, int i2) {
        addAccountAndSwitch();
    }

    public void showAccountsList(Context context2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context2);
        if (getAccounts().size() > 0) {
            builder.setTitle(yo.getString("Select_an_account"));
            builder.setView(getAccountsListLinearLayout(context2));
        } else {
            builder.setTitle(yo.getString("no_accounts_found"));
            builder.setMessage(yo.getString("add_some_accounts"));
            builder.setPositiveButton(17039370, AccountsManager4.INSTANCE);
        }
        builder.create().show();
    }

    public void showAddAccountPrompt(Context context2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context2);
        builder.setTitle(yo.getString("add_accounts"));
        builder.setMessage(yo.getString("add_accounts_sum"));
        builder.setPositiveButton(17039379, new AccountsManager2(this));
        builder.setNegativeButton(17039369, (DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    public void switchToAccount(Account account) {
        int id = account.getId();
        try {
            File file = new File(this.accountsFolder.getAbsolutePath() + "/" + (this.lastAccountId + 1) + "/");
            File file2 = new File(this.accountsFolder.getAbsolutePath() + "/" + id + "/");
            String absolutePath = file.getAbsolutePath();
            String absolutePath2 = file2.getAbsolutePath();
            if (file2.exists()) {
                file.mkdir();
                FileUtils.deleteDirectory(new File(this.appPath + "files/Logs"));
                File file3 = new File(this.appPath + "/shared_prefs");
                FileUtils.moveDirectory(file3, new File(absolutePath + "/shared_prefs"));
                File file4 = new File(this.appPath + "/databases");
                FileUtils.moveDirectory(file4, new File(absolutePath + "/databases"));
                File file5 = new File(this.appPath + "/files");
                FileUtils.moveDirectory(file5, new File(absolutePath + "/files"));
                File file6 = new File(absolutePath2 + "/shared_prefs");
                FileUtils.moveDirectory(file6, new File(this.appPath + "/shared_prefs"));
                File file7 = new File(absolutePath2 + "/databases");
                FileUtils.moveDirectory(file7, new File(this.appPath + "/databases"));
                File file8 = new File(absolutePath2 + "/files");
                FileUtils.moveDirectory(file8, new File(this.appPath + "/files"));
                FileUtils.deleteDirectory(file2);
                Utils.Restart(this.context);
                return;
            }
            throw new RuntimeException(yo.getString("account_does_not_exist"));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
