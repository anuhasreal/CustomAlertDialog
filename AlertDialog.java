private void launchAlertDialog() {
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
