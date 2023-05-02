package com.AssemMods.accounts.views;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.AssemMods.accounts.AccountsManager;
import com.AssemMods.accounts.Utils;
import com.AssemMods.fakechat.utils.CircleImageView;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.yo.yo;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class AccountRow extends RelativeLayout {
    private final String accountsFolder = (Utils.getApplicationPath(yo.getCtx()) + "/Accounts");
    AccountsManager.Account mAccount;
    Context mContext;

    public AccountRow(Context context) {
        super(context);
        init(context);
    }

    public AccountRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public AccountRow(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(context);
    }

    public AccountRow(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        LayoutInflater.from(context).inflate(yo.getID("account_row", "layout"), this, true);
    }

    public /* synthetic */ void lambda$setAccount$1$AccountRow(AccountsManager.Account account, DialogInterface dialogInterface, int i2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
        builder.setTitle(yo.getString("delete_account"));
        builder.setMessage(yo.getString("delete_this_account"));
        builder.setPositiveButton(yo.getString("Delete"), new AccountRow4(this, account));
        builder.setNegativeButton(17039369, AccountRow5.INSTANCE);
        builder.create().show();
    }

    public /* synthetic */ void lambda$setAccount$2$AccountRow(AccountsManager.Account account, View view) {
        setClickable(true);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
        builder.setTitle(yo.getString("new_account"));
        builder.setMessage(yo.getString("new_account_sum"));
        builder.setPositiveButton(yo.getString("Switch_account"), new AccountRow2(account));
        builder.setNeutralButton(yo.getString("delete_account"), new AccountRow1(this, account));
        builder.create().show();
    }

    public /* synthetic */ void lambda$setAccount$4$AccountRow(AccountsManager.Account account, DialogInterface dialogInterface, int i2) {
        for (int i3 = 0; i3 < Utils.getAccountsManager().getAccounts().size(); i3++) {
            if (Utils.getAccountsManager().getAccounts().get(i3).getId() == account.getId()) {
                try {
                    FileUtils.deleteDirectory(new File(this.accountsFolder + File.separator + Utils.getAccountsManager().getAccounts().get(i3).getId()));
                    Utils.Restart(this.mContext);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } else {
                Toast.makeText(this.mContext, "Oops! something went wrong!", 0).show();
            }
        }
    }

    public void setAccount(AccountsManager.Account account) {
        TextView textView = (TextView) findViewById(yo.getID(FacebookFacade.RequestParameter.NAME, "id"));
        TextView textView2 = (TextView) findViewById(yo.getID("phone", "id"));
        CircleImageView circleImageView = (CircleImageView) findViewById(yo.getID(FacebookFacade.RequestParameter.PICTURE, "id"));
        String name = account.getName();
        if (name == null || name.contentEquals("")) {
            name = "No name";
        }
        Drawable profilePicture = account.getProfilePicture();
        if (profilePicture == null) {
            profilePicture = this.mContext.getResources().getDrawable(yo.getID("avatar_contact", "drawable"));
        }
        textView.setText(name);
        textView2.setText(account.getPhoneNumber());
        circleImageView.setImageDrawable(profilePicture);
        this.mAccount = account;
        setOnClickListener(new AccountRow3(this, account));
    }
}
