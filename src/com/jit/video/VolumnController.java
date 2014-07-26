package com.jit.video;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class VolumnController {
	private Toast t;
	private VolumnView tv;

	private Context context;

	public VolumnController(Context context) {
		this.context = context;
	}

	public void show(float progress) {
		if (t == null) {
			t = new Toast(context);
			View layout = LayoutInflater.from(context).inflate(R.layout.vv, null);
			tv = (VolumnView) layout.findViewById(R.id.volumnView);
			t.setView(layout);
			t.setGravity(Gravity.BOTTOM, 0, 100);
			t.setDuration(Toast.LENGTH_SHORT);
		}
		tv.setProgress(progress);
		t.show();
	}
}
