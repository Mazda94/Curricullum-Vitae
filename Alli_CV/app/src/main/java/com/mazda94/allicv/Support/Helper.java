package com.mazda94.allicv.Support;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;

import com.mazda94.allicv.R;

import java.io.IOException;
import java.io.InputStream;

public class Helper {
    public String getAssets(Context context, String fileName) {
        String data;
        try {
            InputStream inputStream = context.getAssets().open( fileName );
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read( buffer );
            inputStream.close();
            data = new String( buffer, "UTF-8" );
            return data;
        } catch (IOException e) {
            e.printStackTrace();
            return String.valueOf( e );
        }
    }

    public void showFullDialog(Context context, View view) {
        Dialog dialog = new Dialog( context, R.style.AppTheme );
        dialog.requestWindowFeature( Window.FEATURE_NO_TITLE );
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogTransition;
        dialog.setContentView( view );
        dialog.show();
    }
}
