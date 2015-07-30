package com.example.shiza.firstopenglprogram;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    GLSurfaceView glSurfaceView;
    private boolean rendererSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        GL surface view for surface set

        glSurfaceView = new GLSurfaceView(this);

//      Request an opengl context

        glSurfaceView.setEGLContextClientVersion(2);

//        Assign a renderer which will fill the surface
        glSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);

        glSurfaceView.setRenderer(new FirstOpenGLProgram());


        rendererSet = true;

        this.setContentView(glSurfaceView);
//        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        glSurfaceView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        glSurfaceView.onResume();
    }
}
