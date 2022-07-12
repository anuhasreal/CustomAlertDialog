# Custom Animated AlertDialog

Animated AlertDialog With Rounded Corners

<img title="SIGIT" src="https://img.shields.io/badge/CODENAME%20-CustomAlertDialog-SCRIPT?colorA=grey&colorB=green&style=for-the-badge"> <img title="SARA" src="https://img.shields.io/badge/VERSION%20-1.0-SCRIPT?colorA=grey&colorB=green&style=for-the-badge">




### Alert Dialog Style
First you need add this code to your project ```themes.xml``` file
``` <style name="MaterialAlertDialog.Rounded" parent="ThemeOverlay.MaterialComponents.MaterialAlertDialog">
        <item name="shapeAppearanceOverlay">@style/ShapeAppearanceOverlay.MaterialAlertDialog.Rounded</item>
    </style>

    <style name="ShapeAppearanceOverlay.MaterialAlertDialog.Rounded" parent="">
        <item name="cornerSize">10dp</item>
    </style>
 ```



### For Activity
Follow this step to add animated alert dialog

1. Copy this code
```private void launchAlertDialog() {
        new MaterialAlertDialogBuilder(AlertDialog.this, R.style.MaterialAlertDialog_Rounded)
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
```   
2. After that, paste in your activity [like this](Example/MainActivity.java)
3. Now you can call alert dialog using this code
```launchAlertDialog();```



### For Fragment
Follow this step to add animated alert dialog

1. Copy this code
```private void launchAlertDialog() {
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
```   
2. After that, paste in your activity [like this](Example/Fragment.java)
3. Now you can call alert dialog using this code
```launchAlertDialog();```
