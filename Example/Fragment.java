package com.anuhas.quity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.anuhas.danumgula.Class.Grade10;
import com.anuhas.danumgula.Class.Grade11;
import com.anuhas.danumgula.Class.Grade9;
import com.anuhas.danumgula.R;
import com.anuhas.danumgula.Class.AL_Activity;
import com.anuhas.danumgula.Class.OL_activity;
import com.anuhas.danumgula.Class.School_ship;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
     
          return view;
    }
  private void launchAlertDialog() {
        new MaterialAlertDialogBuilder(getcontext(), R.style.MaterialAlertDialog_Rounded)
                .setTitle("Quity update required")
                .setMessage("Quity recommends that you to update to latest version")
                .setPositiveButton("Update", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.anuhas.quity")));
                        }catch (Exception e){
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.anuhas.quity")));
                        }
                    }
                })
                .setCancelable(false)
                .show();

    }
}
