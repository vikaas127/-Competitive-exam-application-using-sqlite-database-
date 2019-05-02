package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Misceelous extends Activity {
    PDFView  pdfView;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.abcdn);
        PDFView  pdfView=(PDFView)findViewById(R.id.pdfViewn);
        pdfView.fromAsset("misu.pdf").load();


        }
    }







