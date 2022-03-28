package com.ktpci.myapplication;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;

import com.ktpci.beacon.PCI;

public class Test {
    public void showMyToast(Context context, Resources res){
        Toast.makeText(context, "W o W", Toast.LENGTH_SHORT);
        PCI.with(context).agreeTerms( "e1afee30-0c47-bd19-c96e-42bbbd70953f","7778",1);

    }


}
